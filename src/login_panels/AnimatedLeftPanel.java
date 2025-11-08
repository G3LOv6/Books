package login_panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;


public class AnimatedLeftPanel extends JPanel {
    
    private Timer animationTimer;
    private float angle = 0;
    private int waveOffset = 0;
    
    
    private FloatingIcon[] floatingIcons;
    
    private class FloatingIcon {
        float x, y;
        float speedX, speedY;
        float size;
        float rotation;
        float rotationSpeed;
        Color color;
        
        FloatingIcon(float x, float y, float size) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.speedX = (float)(Math.random() * 0.5 - 0.25);
            this.speedY = (float)(Math.random() * 0.5 - 0.25);
            this.rotation = (float)(Math.random() * 360);
            this.rotationSpeed = (float)(Math.random() * 2 - 1);
            
           
            Color[] bookColors = {
                new Color(255, 255, 255, 100),
                new Color(200, 220, 255, 120),
                new Color(180, 200, 255, 100)
            };
            this.color = bookColors[(int)(Math.random() * bookColors.length)];
        }
        
        void update(int width, int height) {
            x += speedX;
            y += speedY;
            rotation += rotationSpeed;
            
            
            if (x < 0 || x > width) speedX *= -1;
            if (y < 0 || y > height) speedY *= -1;
            
            // Keep within bounds
            x = Math.max(0, Math.min(width, x));
            y = Math.max(0, Math.min(height, y));
        }
        
        void draw(Graphics2D g2) {
            g2.setColor(color);
            AffineTransform old = g2.getTransform();
            g2.translate(x, y);
            g2.rotate(Math.toRadians(rotation));
            
            
            int w = (int)(size * 0.7);
            int h = (int)size;
            g2.fillRoundRect(-w/2, -h/2, w, h, 5, 5);
            g2.setColor(new Color(255, 255, 255, 50));
            g2.fillRoundRect(-w/2, -h/2, w/4, h, 5, 5);
            
            g2.setTransform(old);
        }
    }
    
    public AnimatedLeftPanel() {
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setOpaque(false);
        
        
        floatingIcons = new FloatingIcon[15];
        for (int i = 0; i < floatingIcons.length; i++) {
            floatingIcons[i] = new FloatingIcon(
                (float)(Math.random() * 550),
                (float)(Math.random() * 700),
                20 + (float)(Math.random() * 30)
            );
        }
        
        
        animationTimer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angle += 0.02f;
                waveOffset = (waveOffset + 1) % 360;
                
                
                for (FloatingIcon icon : floatingIcons) {
                    icon.update(550, 700);
                }
                
                repaint();
            }
        });
        animationTimer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int width = getWidth();
        int height = getHeight();
        
       
        GradientPaint gradient = new GradientPaint(
            0, 0, new Color(65, 105, 225),
            width, height, new Color(30, 60, 180)
        );
        g2.setPaint(gradient);
        g2.fillRect(0, 0, width, height);
        
       
        drawWavePattern(g2, width, height);
        
        
        for (FloatingIcon icon : floatingIcons) {
            icon.draw(g2);
        }
        
        
        drawPulsingCircles(g2, width, height);
    }
    
    private void drawWavePattern(Graphics2D g2, int width, int height) {
        g2.setColor(new Color(255, 255, 255, 30));
        g2.setStroke(new BasicStroke(2));
        
        for (int i = 0; i < 3; i++) {
            Path2D path = new Path2D.Float();
            path.moveTo(0, height / 2);
            
            for (int x = 0; x <= width; x += 5) {
                double y = height / 2 + Math.sin((x * 0.01) + (waveOffset * 0.05) + (i * 2)) * (30 + i * 20);
                if (x == 0) {
                    path.moveTo(x, y);
                } else {
                    path.lineTo(x, y);
                }
            }
            
            g2.draw(path);
        }
    }
    
    private void drawPulsingCircles(Graphics2D g2, int width, int height) {
        float pulse = (float)Math.sin(angle * 2) * 0.3f + 0.7f;
        
        g2.setColor(new Color(255, 255, 255, 20));
        
        
        int size1 = (int)(150 * pulse);
        g2.fillOval(-50, -50, size1, size1);
        
        
        int size2 = (int)(200 * (1.1f - pulse));
        g2.fillOval(width - 150, height - 150, size2, size2);
    }
    
    public void stopAnimation() {
        if (animationTimer != null) {
            animationTimer.stop();
        }
    }
}