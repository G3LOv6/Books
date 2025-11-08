

import java.awt.*;
import javax.swing.*;

public class AnimatedBackgroundPanel extends JPanel implements Runnable {

    private int glowX = 800; // starting x position of the glow
    private boolean movingLeft = true;

    public AnimatedBackgroundPanel() {
        setOpaque(true);
        setBackground(new Color(245, 245, 245)); // base light gray
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();

        // background gradient
        GradientPaint background = new GradientPaint(
                0, 0, new Color(250, 250, 255),
                width, height, Color.WHITE);
        g2.setPaint(background);
        g2.fillRect(0, 0, width, height);

        // moving light effect (blue glow)
        g2.setColor(new Color(65, 105, 225, 80)); // royal blue with transparency
        g2.fillOval(glowX, height / 3, 300, 300);

        g2.dispose();
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (movingLeft) {
                    glowX -= 4;
                    if (glowX <= 600) movingLeft = false;
                } else {
                    glowX += 4;
                    if (glowX >= 800) movingLeft = true;
                }
                repaint();
                Thread.sleep(30);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
