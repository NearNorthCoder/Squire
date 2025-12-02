/*
 * Deobfuscated from: c/r/m/z.java
 * Original class name: z
 * Purpose: Panel for selecting and launching profiles in the Squire launcher
 */
package squire.launcher.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import squire.launcher.auth.AuthenticationManager;
import squire.launcher.ui.components.ButtonHoverAdapter;
import squire.launcher.ui.components.ColorComboBoxEditor;
import squire.launcher.ui.components.CustomScrollBarUI;
import squire.launcher.ui.components.ProgressBarUI;
import squire.launcher.ui.components.WrappingLabel;
import squire.launcher.util.FontManager;
import squire.launcher.util.ThemeColors;

/**
 * Panel for selecting and launching profiles in the Squire launcher.
 *
 * Provides:
 * - Profile dropdown populated from profiles.txt
 * - Launch button to start the client with selected profile
 * - Delete button to remove profiles
 * - Refresh button to sync profiles from server
 * - Progress bar for download/launch status
 */
class ProfileSelectionPanel extends JPanel {

    // ==================== Dimensions ====================

    /**
     * Progress bar height
     */
    private static final int PROGRESS_BAR_HEIGHT = 30;

    /**
     * Default button height
     */
    private static final int BUTTON_HEIGHT = 40;

    /**
     * Standard padding/margin size
     */
    private static final int PADDING = 10;

    /**
     * Font size for labels
     */
    private static final int LABEL_FONT_SIZE = 16;

    /**
     * Font size for title
     */
    private static final int TITLE_FONT_SIZE = 32;

    /**
     * Profiles directory (~/.squire/)
     */
    public static final File SQUIRE_DIR;

    /**
     * Panel size (frame width minus sidebar width)
     */
    static final Dimension PANEL_SIZE;

    /**
     * Progress bar size
     */
    private static final Dimension PROGRESS_BAR_SIZE;

    // ==================== UI Components ====================

    /**
     * Main title label (displays status)
     */
    private final JLabel titleLabel;

    /**
     * Description/status label
     */
    private final JLabel descriptionLabel;

    /**
     * Secondary status label
     */
    private final JLabel statusLabel;

    /**
     * Detail status label
     */
    private final JLabel detailLabel;

    /**
     * Progress bar for downloads
     */
    private final JProgressBar progressBar;

    /**
     * Container for action buttons
     */
    private final JPanel buttonPanel;

    /**
     * Scrollable container
     */
    private final JScrollPane scrollPane;

    /**
     * Profile dropdown model
     */
    private DefaultComboBoxModel<String> profileModel;

    // ==================== Static Initialization ====================

    static {
        SQUIRE_DIR = new File(System.getProperty("user.home") + "/.squire/");
        PANEL_SIZE = new Dimension(
                LauncherFrame.WINDOW_SIZE.width - SidebarInfoPanel.SIDEBAR_SIZE.width,
                LauncherFrame.WINDOW_SIZE.height);
        PROGRESS_BAR_SIZE = new Dimension(PANEL_SIZE.width, PROGRESS_BAR_HEIGHT);
    }

    // ==================== Constructor ====================

    /**
     * Creates the profile selection panel.
     *
     * @param isFirstLaunch Whether this is the first launch (needs auth)
     */
    ProfileSelectionPanel(boolean isFirstLaunch) {
        this.titleLabel = new JLabel("Select Profile");
        this.descriptionLabel = new JLabel("Choose a profile to launch");
        this.progressBar = new JProgressBar(0, 100);

        // Panel setup
        this.setPreferredSize(PANEL_SIZE);
        this.setLayout(new GridBagLayout());
        this.setBackground(ThemeColors.BACKGROUND_DARK);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 9; // Padding

        // Title label
        this.titleLabel.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getRegularFont().getStyle(),
                TITLE_FONT_SIZE));
        this.titleLabel.setHorizontalAlignment(JLabel.CENTER);
        this.titleLabel.setForeground(Color.WHITE);
        this.add(this.titleLabel, gbc);
        gbc.gridy++;

        // Description label
        this.statusLabel = createWrappingLabel("Choose a profile to launch");

        // Main content area (either first-launch message or profile selection)
        JComponent mainContent;
        if (isFirstLaunch) {
            mainContent = createProfileSelectionPanel();
        } else {
            mainContent = this.statusLabel;
        }

        // Scroll pane for content
        this.scrollPane = new JScrollPane(mainContent,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        JViewport viewport = this.scrollPane.getViewport();
        viewport.setForeground(Color.WHITE);
        viewport.setBackground(ThemeColors.BACKGROUND_DARK);
        viewport.setOpaque(true);

        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(this.scrollPane, gbc);
        gbc.gridy++;

        // Secondary status label
        this.detailLabel = createWrappingLabel("Ready to launch");
        this.add(this.detailLabel, gbc);
        gbc.gridy++;

        // Button panel
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new GridLayout(1, 2, PADDING, PADDING));
        this.buttonPanel.setBorder(new EmptyBorder(50, PADDING, 50, PADDING));
        this.buttonPanel.setBackground(ThemeColors.BACKGROUND_DARK);
        this.buttonPanel.setOpaque(true);

        // Initially hide status labels and button panel
        this.detailLabel.setVisible(false);
        this.buttonPanel.setVisible(false);
        this.add(this.buttonPanel, gbc);
        gbc.gridy++;

        // Status label for detailed messages
        gbc.weighty = 0.0;
        gbc.weightx = 1.0;
        gbc.ipady = 5;
        this.descriptionLabel.setFont(FontManager.getRegularFont());
        this.descriptionLabel.setHorizontalAlignment(JLabel.CENTER);
        this.descriptionLabel.setForeground(Color.WHITE);
        this.descriptionLabel.setBorder(new EmptyBorder(5, 0, 5, 0));
        this.add(this.descriptionLabel, gbc);
        gbc.gridy++;

        // Progress bar
        this.progressBar.setBackground(ThemeColors.PRIMARY_COLOR.darker());
        this.progressBar.setForeground(ThemeColors.TEXT_COLOR);
        this.progressBar.setMinimumSize(PROGRESS_BAR_SIZE);
        this.progressBar.setMaximumSize(PROGRESS_BAR_SIZE);
        this.progressBar.setBorder(new MatteBorder(0, 0, 0, 0, Color.LIGHT_GRAY));
        this.progressBar.setUI(new ProgressBarUI(this));
        this.progressBar.setFont(FontManager.getRegularFont());
        this.progressBar.setVisible(true);
        this.add(this.progressBar, gbc);
        gbc.gridy++;
    }

    // ==================== Public Accessors ====================

    /**
     * Gets the title label.
     */
    public JLabel getTitleLabel() {
        return this.titleLabel;
    }

    /**
     * Gets the status label.
     */
    public JLabel getStatusLabel() {
        return this.descriptionLabel;
    }

    /**
     * Gets the description label.
     */
    public JLabel getDescriptionLabel() {
        return this.statusLabel;
    }

    /**
     * Gets the detail label.
     */
    public JLabel getDetailLabel() {
        return this.detailLabel;
    }

    /**
     * Gets the progress bar.
     */
    public JProgressBar getProgressBar() {
        return this.progressBar;
    }

    /**
     * Gets the button panel.
     */
    public JPanel getButtonPanel() {
        return this.buttonPanel;
    }

    /**
     * Gets the profile model.
     */
    public DefaultComboBoxModel<String> getProfileModel() {
        return this.profileModel;
    }

    // ==================== UI Update Methods ====================

    /**
     * Sets the title text.
     */
    void setStatusDetail(String text) {
        this.titleLabel.setText(text);
        this.titleLabel.revalidate();
        this.titleLabel.repaint();
    }

    /**
     * Sets the status message.
     */
    void setStatus(String text) {
        // Wrap in HTML if not already wrapped
        if (text != null && !text.startsWith("<html")) {
            text = "<html><div style='text-align:center;'>" + text + "</div></html>";
        }
        this.statusLabel.setText(text);
        this.statusLabel.revalidate();
        this.statusLabel.repaint();
    }

    /**
     * Makes the launch button and panels visible.
     */
    void enableLaunch() {
        this.detailLabel.setVisible(true);
        this.buttonPanel.setVisible(true);
        this.titleLabel.revalidate();
        this.titleLabel.repaint();
    }

    /**
     * Creates a button with the given text and tooltip.
     *
     * @param text Button text
     * @param tooltip Tooltip text
     * @return The created button
     */
    public JButton createButton(String text, String tooltip) {
        JButton button = new JButton(text);
        button.setToolTipText(tooltip);
        button.setPreferredSize(new Dimension(BUTTON_HEIGHT, BUTTON_HEIGHT));
        button.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getBoldFont().getStyle(),
                LABEL_FONT_SIZE));
        button.setForeground(Color.WHITE);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(ThemeColors.BORDER_COLOR));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.buttonPanel.add(button);
        return button;
    }

    // ==================== Private Helper Methods ====================

    /**
     * Creates a wrapping label with HTML styling.
     */
    private JLabel createWrappingLabel(String text) {
        WrappingLabel label = new WrappingLabel(this,
                "<html><div style='text-align:center;'>" + text + "</div></html>");
        label.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getBoldFont().getStyle(),
                LABEL_FONT_SIZE));
        label.setForeground(Color.WHITE);
        label.setBorder(new EmptyBorder(0, 137, 0, 137));
        return label;
    }

    /**
     * Creates the main profile selection panel with dropdown and buttons.
     */
    private JPanel createProfileSelectionPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1.0;
        gbc.ipady = PADDING;
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.insets = new Insets(PADDING, 0, 0, 0);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(0, 9, 0, 9));
        panel.setBackground(null);

        // Profile label
        JLabel profileLabel = new JLabel("Select Profile:");
        profileLabel.setForeground(Color.WHITE);
        panel.add(profileLabel, gbc);
        gbc.gridy++;

        // Initialize profile model
        this.profileModel = new DefaultComboBoxModel<>();

        // Load profiles from file
        File profilesFile = new File(SQUIRE_DIR, "profiles.txt");
        if (profilesFile.exists()) {
            List<String> profiles = new ArrayList<>();

            try (Scanner scanner = new Scanner(profilesFile)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(":");
                    if (parts.length == 5) {
                        profiles.add(parts[4]); // Username is 5th field
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            // If no profiles found, trigger sync
            if (profiles.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "No profiles found. Please sync your profiles from the server.",
                        "No Profiles",
                        JOptionPane.INFORMATION_MESSAGE);
                refreshProfiles();
            }

            this.profileModel.addAll(profiles);
        }

        // Select first profile if available
        if (this.profileModel.getSize() > 0) {
            this.profileModel.setSelectedItem(this.profileModel.getElementAt(0));
        }

        // Profile dropdown
        JComboBox<String> profileDropdown = new JComboBox<>(this.profileModel);
        profileDropdown.setEditor(new ColorComboBoxEditor(ThemeColors.BUTTON_BACKGROUND));
        profileDropdown.setBackground(ThemeColors.BUTTON_BACKGROUND);
        profileDropdown.setForeground(Color.WHITE);
        panel.add(profileDropdown, gbc);
        gbc.gridy++;

        // Launch button
        JButton launchButton = createStyledButton("Launch");
        launchButton.addActionListener(e -> handleLaunch(panel, profileDropdown, e));
        launchButton.addMouseListener(new ButtonHoverAdapter(launchButton, "launch"));
        panel.add(launchButton, gbc);
        gbc.gridy++;

        // Delete button
        JButton deleteButton = createStyledButton("Delete Profile");
        deleteButton.addActionListener(e -> deleteSelectedProfile());
        deleteButton.addMouseListener(new ButtonHoverAdapter(deleteButton, "delete"));
        panel.add(deleteButton, gbc);
        gbc.gridy++;

        // Refresh button
        JButton refreshButton = createStyledButton("Sync Profiles from Discord");
        refreshButton.addActionListener(e -> refreshProfiles());
        refreshButton.addMouseListener(new ButtonHoverAdapter(refreshButton, "refresh"));
        panel.add(refreshButton, gbc);

        return panel;
    }

    /**
     * Creates a styled button.
     */
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(ThemeColors.BUTTON_BACKGROUND);
        button.setSize(new Dimension(100, BUTTON_HEIGHT));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(FontManager.getRegularFont());
        button.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        button.setOpaque(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return button;
    }

    /**
     * Handles the launch button click.
     */
    private void handleLaunch(JPanel panel, JComboBox<String> dropdown, ActionEvent event) {
        if (this.profileModel.getSize() == 0 || this.profileModel.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this,
                    "No profile selected. Please sync your profiles first.",
                    "No Profile Selected",
                    JOptionPane.ERROR_MESSAGE);
            refreshProfiles();
            return;
        }

        panel.removeAll();
        String selectedProfile = dropdown.getSelectedItem().toString();
        JLabel launchingLabel = new JLabel("Launching into " + selectedProfile);
        launchingLabel.setForeground(Color.WHITE);
        panel.add(launchingLabel);

        // Trigger the launcher with selected profile
        // Launcher.launch(selectedProfile);
    }

    /**
     * Deletes the currently selected profile.
     */
    private void deleteSelectedProfile() {
        Object selectedItem = this.profileModel.getSelectedItem();
        if (selectedItem == null) {
            return;
        }

        this.profileModel.removeElement(selectedItem);
        File profilesFile = new File(SQUIRE_DIR, "profiles.txt");
        List<String> remainingLines = new ArrayList<>();

        // Read existing profiles, excluding the deleted one
        try (Scanner scanner = new Scanner(profilesFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 5) {
                    String username = parts[4];
                    if (!username.equalsIgnoreCase(selectedItem.toString())) {
                        remainingLines.add(line);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // File doesn't exist, nothing to delete
        }

        // Write remaining profiles back
        try {
            profilesFile.createNewFile();
            try (FileWriter writer = new FileWriter(profilesFile, false)) {
                for (String line : remainingLines) {
                    writer.write(line);
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Refreshes profiles from the server via authentication.
     */
    private void refreshProfiles() {
        // Trigger authentication which syncs profiles
        AuthenticationManager.authenticate();

        this.profileModel.removeAllElements();

        // Reload profiles from file
        File profilesFile = new File(SQUIRE_DIR, "profiles.txt");
        List<String> profiles = new ArrayList<>();

        try (Scanner scanner = new Scanner(profilesFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 5) {
                    profiles.add(parts[4]);
                }
            }
        } catch (FileNotFoundException e) {
            // File doesn't exist yet
        }

        this.profileModel.addAll(profiles);

        if (this.profileModel.getSize() > 0) {
            this.profileModel.setSelectedItem(this.profileModel.getElementAt(0));
        }
    }
}
