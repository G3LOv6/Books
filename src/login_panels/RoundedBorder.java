package login_panels;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedBorder extends AbstractBorder {
    private int radius;
    private Color backgroundColor;
    private Color borderColor;
    private int thickness;

    // Constructor with just radius (transparent background, no border line)
    public RoundedBorder(int radius) {
        this.radius = radius;
        this.backgroundColor = null;
        this.borderColor = null;
        this.thickness = 0;
    }

    // Constructor with radius and background color
    public RoundedBorder(int radius, Color backgroundColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = null;
        this.thickness = 0;
    }

    // Constructor with radius, background color, and border
    public RoundedBorder(int radius, Color backgroundColor, Color borderColor, int thickness) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.thickness = thickness;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Only draw border if explicitly specified
        if (borderColor != null && thickness > 0) {
            g2d.setColor(borderColor);
            g2d.setStroke(new BasicStroke(thickness));
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int inset = Math.max(thickness, 2);
        return new Insets(inset, inset, inset, inset);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        int inset = Math.max(thickness, 2);
        insets.left = insets.right = insets.top = insets.bottom = inset;
        return insets;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}