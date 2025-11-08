
package login_panels;
import javax.swing.*;
import java.awt.*;

public class Toast extends JWindow {

    private String message;
    private Color bgColor;

    public static final Color SUCCESS = new Color(46, 204, 113);
    public static final Color ERROR = new Color(231, 76, 60);
    public static final Color WARNING = new Color(241, 196, 15);
    public static final Color INFO = new Color(66, 133, 244);

    public Toast(String message, JFrame parent, Color bg) {
        this.message = message;
        this.bgColor = bg;

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
               

                // Smooth rounded rectangle
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Drop shadow
             // subtle shadow
g2.setColor(new Color(0, 0, 0, 30));
g2.fillRoundRect(4, 4, getWidth() - 6, getHeight() - 6, 20, 20);


                // Toast background
                g2.setColor(bgColor);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);


            }
        };
        
        setBackground(new Color(0, 0, 0, 0)); // transparent window
panel.setOpaque(false); // panel not white


        JLabel label = new JLabel(message);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panel.setOpaque(false);
        panel.add(label);
        add(panel);
        
getRootPane().setBorder(null);

        pack();

        int x = parent.getX() + (parent.getWidth() - getWidth()) / 2;
        int startY = parent.getY() + parent.getHeight();
        int finalY = startY - 90;

        setLocation(x, startY);

        // Animation thread
        Thread t = new Thread(() -> {
            try {
                setVisible(true);

                // Slide up animation
                for (int i = startY; i > finalY; i--) {
                    setLocation(x, i);
                    Thread.sleep(2);
                }

                Thread.sleep(2000);
                dispose();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t.start();
    }

    // Shortcuts for clean usage
    public static void success(JFrame p, String msg) {
        new Toast(msg, p, SUCCESS);
    }

    public static void error(JFrame p, String msg) {
        new Toast(msg, p, ERROR);
    }

    public static void warning(JFrame p, String msg) {
        new Toast(msg, p, WARNING);
    }

    public static void info(JFrame p, String msg) {
        new Toast(msg, p, INFO);
    }
}
