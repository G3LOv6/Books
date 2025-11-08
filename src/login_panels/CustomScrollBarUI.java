package login_panels;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class CustomScrollBarUI extends BasicScrollBarUI {
    
    // 🔥 ADD THIS EXPLICIT CONSTRUCTOR 🔥
    public CustomScrollBarUI() {
        // No-argument constructor
    }
    // ------------------------------------

    private final Dimension d = new Dimension();

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createZeroButton();
    }
    
    // Helper method to create invisible buttons (removes the arrow buttons)
    private JButton createZeroButton() {
        JButton button = new JButton();
        button.setPreferredSize(d);
        button.setMinimumSize(d);
        button.setMaximumSize(d);
        return button;
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        // Draw the track (background of the scrollbar)
        g.setColor(new Color(240, 240, 240)); // Very light gray track color
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
            return;
        }

        int w = thumbBounds.width;
        int h = thumbBounds.height;

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Use a modern, slightly transparent dark color for the thumb
        Color thumbColor = new Color(150, 150, 150, 180); // Gray with some transparency

        // The thumb area
        g2.setPaint(thumbColor);
        
        // Calculate corner radius (making it half the width or height makes it fully rounded)
        int arc = 8; 

        // Paint the rounded rectangle for the thumb
        g2.fillRoundRect(thumbBounds.x, thumbBounds.y, w, h, arc, arc); 
    }
    
    @Override
    protected void setThumbBounds(int x, int y, int width, int height) {
        super.setThumbBounds(x, y, width, height);
        // Reduce the width of the scrollbar to make it thinner
        this.thumbRect.setSize(new Dimension(8, this.thumbRect.height));
    }
}