package login_panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SettingsPanel extends JPanel {
    
    private Color primaryColor = new Color(65, 105, 225);
    private Color backgroundColor = new Color(255, 255, 255);
    private Color sectionBg = new Color(248, 249, 250);
    private Color textColor = new Color(52, 58, 64);
    private Color borderColor = new Color(220, 220, 220);
    
    public SettingsPanel() {
        setLayout(new BorderLayout());
        setBackground(backgroundColor);
        
        initComponents();
    }
    
    private void initComponents() {
        // Header Panel
        JPanel headerPanel = createHeaderPanel();
        add(headerPanel, BorderLayout.NORTH);
        
        // Main Content with Scroll
        JPanel mainContent = createMainContent();
        JScrollPane scrollPane = new JScrollPane(mainContent);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(backgroundColor);
        header.setBorder(new EmptyBorder(20, 30, 20, 30));
        
        JLabel title = new JLabel("Settings");
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(textColor);
        
        JLabel subtitle = new JLabel("Manage your account and preferences");
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitle.setForeground(new Color(108, 117, 125));
        
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBackground(backgroundColor);
        titlePanel.add(title);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(subtitle);
        
        header.add(titlePanel, BorderLayout.WEST);
        header.setBorder(BorderFactory.createCompoundBorder(
            header.getBorder(),
            BorderFactory.createMatteBorder(0, 0, 1, 0, borderColor)
        ));
        
        return header;
    }
    
    private JPanel createMainContent() {
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(backgroundColor);
        content.setBorder(new EmptyBorder(20, 30, 20, 30));
        
        // Account Settings Section
        content.add(createAccountSection());
        content.add(Box.createVerticalStrut(20));
        
        // Notification Settings Section
        content.add(createNotificationSection());
        content.add(Box.createVerticalStrut(20));
        
        // Appearance Settings Section
        content.add(createAppearanceSection());
        content.add(Box.createVerticalStrut(20));
        
        // Privacy Settings Section
        content.add(createPrivacySection());
        content.add(Box.createVerticalStrut(20));
        
        // About Section
        content.add(createAboutSection());
        content.add(Box.createVerticalStrut(20));
        
        return content;
    }
    
    private JPanel createAccountSection() {
        JPanel section = createSectionPanel("Account Settings");
        
        // Username
        section.add(createSettingRow("Username", 
            createTextField("bookscout_user"), 
            "Change your username"));
        
        // Email
        section.add(createSettingRow("Email", 
            createTextField("user@bookscout.com"), 
            "Update your email address"));
        
        // Password
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        passwordPanel.setBackground(sectionBg);
        JButton changePasswordBtn = createActionButton("Change Password");
        passwordPanel.add(changePasswordBtn);
        section.add(createSettingRow("Password", 
            passwordPanel, 
            "Update your password for security"));
        
        // Save Button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(sectionBg);
        JButton saveBtn = createPrimaryButton("Save Changes");
        buttonPanel.add(saveBtn);
        section.add(buttonPanel);
        
        return section;
    }
    
    private JPanel createNotificationSection() {
        JPanel section = createSectionPanel("Notifications");
        
        // Email Notifications
        section.add(createSettingRow("Email Notifications", 
            createToggleSwitch(true), 
            "Receive email updates about new books and offers"));
        
        // Push Notifications
        section.add(createSettingRow("Push Notifications", 
            createToggleSwitch(false), 
            "Get desktop notifications for important updates"));
        
        // Newsletter
        section.add(createSettingRow("Newsletter", 
            createToggleSwitch(true), 
            "Subscribe to our weekly newsletter"));
        
        // Book Recommendations
        section.add(createSettingRow("Book Recommendations", 
            createToggleSwitch(true), 
            "Receive personalized book suggestions"));
        
        return section;
    }
    
    private JPanel createAppearanceSection() {
        JPanel section = createSectionPanel("Appearance");
        
        // Theme
        JComboBox<String> themeCombo = new JComboBox<>(new String[]{"Light", "Dark", "Auto"});
        themeCombo.setPreferredSize(new Dimension(200, 35));
        section.add(createSettingRow("Theme", 
            themeCombo, 
            "Choose your preferred theme"));
        
        // Language
        JComboBox<String> langCombo = new JComboBox<>(new String[]{"English", "Spanish", "French", "German"});
        langCombo.setPreferredSize(new Dimension(200, 35));
        section.add(createSettingRow("Language", 
            langCombo, 
            "Select your language preference"));
        
        // Font Size
        JComboBox<String> fontCombo = new JComboBox<>(new String[]{"Small", "Medium", "Large"});
        fontCombo.setPreferredSize(new Dimension(200, 35));
        fontCombo.setSelectedIndex(1);
        section.add(createSettingRow("Font Size", 
            fontCombo, 
            "Adjust text size for readability"));
        
        return section;
    }
    
    private JPanel createPrivacySection() {
        JPanel section = createSectionPanel("Privacy & Security");
        
        // Show Profile
        section.add(createSettingRow("Public Profile", 
            createToggleSwitch(false), 
            "Make your profile visible to other users"));
        
        // Reading History
        section.add(createSettingRow("Reading History", 
            createToggleSwitch(true), 
            "Track and display your reading history"));
        
        // Data Collection
        section.add(createSettingRow("Analytics", 
            createToggleSwitch(true), 
            "Help us improve by sharing usage data"));
        
        // Two-Factor Authentication
        JPanel tfaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tfaPanel.setBackground(sectionBg);
        JButton tfaBtn = createActionButton("Enable 2FA");
        tfaPanel.add(tfaBtn);
        section.add(createSettingRow("Two-Factor Authentication", 
            tfaPanel, 
            "Add an extra layer of security to your account"));
        
        return section;
    }
    
    private JPanel createAboutSection() {
        JPanel section = createSectionPanel("About");
        
        // Version
        JLabel versionLabel = new JLabel("Version 1.0.0");
        versionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        section.add(createSettingRow("App Version", 
            versionLabel, 
            "Current version of BookScout"));
        
        // Links Panel
        JPanel linksPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        linksPanel.setBackground(sectionBg);
        
        JButton helpBtn = createLinkButton("Help Center");
        JButton termsBtn = createLinkButton("Terms of Service");
        JButton privacyBtn = createLinkButton("Privacy Policy");
        
        linksPanel.add(helpBtn);
        linksPanel.add(new JLabel("|"));
        linksPanel.add(termsBtn);
        linksPanel.add(new JLabel("|"));
        linksPanel.add(privacyBtn);
        
        section.add(linksPanel);
        
        // Danger Zone
        section.add(Box.createVerticalStrut(20));
        JPanel dangerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dangerPanel.setBackground(new Color(255, 240, 240));
        dangerPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(220, 53, 69), 1),
            new EmptyBorder(15, 15, 15, 15)
        ));
        
        JButton deleteBtn = createDangerButton("Delete Account");
        JLabel dangerLabel = new JLabel("Permanently delete your account and all data");
        dangerLabel.setForeground(new Color(108, 117, 125));
        
        JPanel dangerContent = new JPanel();
        dangerContent.setLayout(new BoxLayout(dangerContent, BoxLayout.Y_AXIS));
        dangerContent.setBackground(new Color(255, 240, 240));
        dangerContent.add(dangerLabel);
        dangerContent.add(Box.createVerticalStrut(10));
        dangerContent.add(deleteBtn);
        
        dangerPanel.add(dangerContent);
        section.add(dangerPanel);
        
        return section;
    }
    
    private JPanel createSectionPanel(String title) {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setBackground(sectionBg);
        section.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(borderColor, 1),
            new EmptyBorder(20, 20, 20, 20)
        ));
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLabel.setForeground(textColor);
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        section.add(titleLabel);
        section.add(Box.createVerticalStrut(15));
        
        return section;
    }
    
    private JPanel createSettingRow(String label, Component control, String description) {
        JPanel row = new JPanel(new BorderLayout(15, 5));
        row.setBackground(sectionBg);
        row.setBorder(new EmptyBorder(10, 0, 10, 0));
        row.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.setBackground(sectionBg);
        
        JLabel titleLabel = new JLabel(label);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setForeground(textColor);
        
        JLabel descLabel = new JLabel(description);
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descLabel.setForeground(new Color(108, 117, 125));
        
        labelPanel.add(titleLabel);
        labelPanel.add(Box.createVerticalStrut(3));
        labelPanel.add(descLabel);
        
        row.add(labelPanel, BorderLayout.WEST);
        row.add(control, BorderLayout.EAST);
        
        return row;
    }
    
    private JTextField createTextField(String text) {
        JTextField field = new JTextField(text, 20);
        field.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        field.setPreferredSize(new Dimension(250, 35));
        field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(borderColor, 1),
            new EmptyBorder(5, 10, 5, 10)
        ));
        return field;
    }
    
    private JPanel createToggleSwitch(boolean isOn) {
        JPanel toggle = new JPanel() {
            private boolean state = isOn;
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                int width = getWidth();
                int height = getHeight();
                
                // Background
                g2.setColor(state ? primaryColor : new Color(200, 200, 200));
                g2.fillRoundRect(0, 0, width, height, height, height);
                
                // Circle
                g2.setColor(Color.WHITE);
                int circleSize = height - 4;
                int circleX = state ? width - circleSize - 2 : 2;
                g2.fillOval(circleX, 2, circleSize, circleSize);
            }
        };
        
        toggle.setPreferredSize(new Dimension(50, 24));
        toggle.setOpaque(false);
        toggle.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        toggle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean newState = !((JPanel) e.getSource()).getClientProperty("state").equals(true);
                ((JPanel) e.getSource()).putClientProperty("state", newState);
                toggle.repaint();
            }
        });
        toggle.putClientProperty("state", isOn);
        
        return toggle;
    }
    
    private JButton createPrimaryButton(String text) {
        JButton btn = new JButton(text);
        btn.setBackground(primaryColor);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(150, 38));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(50, 90, 200));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(primaryColor);
            }
        });
        
        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Changes saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        });
        
        return btn;
    }
    
    private JButton createActionButton(String text) {
        JButton btn = new JButton(text);
        btn.setBackground(Color.WHITE);
        btn.setForeground(primaryColor);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(primaryColor, 2),
            new EmptyBorder(8, 20, 8, 20)
        ));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(240, 245, 255));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(Color.WHITE);
            }
        });
        
        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "This feature is coming soon!", "Info", JOptionPane.INFORMATION_MESSAGE);
        });
        
        return btn;
    }
    
    private JButton createLinkButton(String text) {
        JButton btn = new JButton(text);
        btn.setForeground(primaryColor);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setForeground(new Color(50, 90, 200));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setForeground(primaryColor);
            }
        });
        
        return btn;
    }
    
    private JButton createDangerButton(String text) {
        JButton btn = new JButton(text);
        btn.setBackground(new Color(220, 53, 69));
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(150, 35));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(200, 35, 51));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new Color(220, 53, 69));
            }
        });
        
        btn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to delete your account? This action cannot be undone.", 
                "Confirm Account Deletion", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE);
            
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Account deletion initiated.", "Account Deleted", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        return btn;
    }
}