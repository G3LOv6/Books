package login_panels;

import java.awt.*;
import javax.swing.*;

public class AnimatedBackgroundPanel extends JPanel {

    private int glowX = 100; // start on the left
    private boolean movingRight = true;
    private final Timer timer;

    public AnimatedBackgroundPanel() {
        setOpaque(true);
        setBackground(new Color(245, 247, 250)); // soft neutral background

        // Animation timer (handles glow movement)
        timer = new Timer(25, e -> {
            if (movingRight) {
                glowX += 2;
                if (glowX >= 250) movingRight = false;
            } else {
                glowX -= 2;
                if (glowX <= 50) movingRight = true;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // --- 1️⃣ Base gradient background ---
        GradientPaint background = new GradientPaint(
                0, 0, new Color(240, 245, 255),
                width, height, Color.WHITE
        );
        g2.setPaint(background);
        g2.fillRect(0, 0, width, height);

        // --- 2️⃣ Left-side curved layered design ---
        g2.setColor(new Color(200, 215, 255, 120));
        Polygon curve1 = new Polygon();
        curve1.addPoint(0, 0);
        curve1.addPoint(180, 0);
        curve1.addPoint(100, height);
        curve1.addPoint(0, height);
        g2.fillPolygon(curve1);

        g2.setColor(new Color(180, 205, 255, 90));
        Polygon curve2 = new Polygon();
        curve2.addPoint(0, 0);
        curve2.addPoint(250, 0);
        curve2.addPoint(150, height);
        curve2.addPoint(0, height);
        g2.fillPolygon(curve2);

        // --- 3️⃣ Animated royal blue glow (behind sidebar) ---
        int glowSize = 350;
        int glowY = height / 2 - 100;
        RadialGradientPaint glow = new RadialGradientPaint(
                new Point(glowX + glowSize / 2, glowY + glowSize / 2),
                glowSize / 2f,
                new float[]{0f, 1f},
                new Color[]{
                        new Color(65, 105, 225, 160),
                        new Color(65, 105, 225, 0)
                }
        );
        g2.setPaint(glow);
        g2.fillOval(glowX, glowY, glowSize, glowSize);

        // --- 4️⃣ Subtle white overlay for polish ---
        GradientPaint overlay = new GradientPaint(
                0, 0, new Color(255, 255, 255, 80),
                width / 3f, height, new Color(255, 255, 255, 0)
        );
        g2.setPaint(overlay);
        g2.fillRect(0, 0, width / 3, height);

        g2.dispose();
    }
}
