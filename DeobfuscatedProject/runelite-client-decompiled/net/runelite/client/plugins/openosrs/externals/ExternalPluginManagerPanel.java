/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package net.runelite.client.plugins.openosrs.externals;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.plugins.openosrs.externals.PluginsPanel;
import net.runelite.client.plugins.openosrs.externals.RepositoryPanel;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExternalPluginManagerPanel
extends PluginPanel {
    private static final Logger log = LoggerFactory.getLogger(ExternalPluginManagerPanel.class);
    private static final ImageIcon ADD_ICON_RAW;
    private static final ImageIcon ADD_HOVER_ICON_RAW;
    private static final ImageIcon ADD_ICON_GH;
    private static final ImageIcon ADD_HOVER_ICON_GH;
    private final OPRSExternalPluginManager externalPluginManager;
    private final EventBus eventBus;

    @Inject
    private ExternalPluginManagerPanel(OPRSExternalPluginManager externalPluginManager, EventBus eventBus) {
        super(false);
        this.externalPluginManager = externalPluginManager;
        this.eventBus = eventBus;
        this.buildPanel();
    }

    private void buildPanel() {
        this.removeAll();
        this.setLayout(new BorderLayout(0, 10));
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.add((Component)this.titleBar(), "North");
        this.add((Component)this.tabbedPane(), "Center");
        this.revalidate();
        this.repaint();
    }

    private JPanel titleBar() {
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel title = new JLabel();
        final JLabel addGHRepo = new JLabel(ADD_ICON_GH);
        final JLabel addRawRepo = new JLabel(ADD_ICON_RAW);
        JPanel buttonHolder = new JPanel(new BorderLayout());
        buttonHolder.setBorder(new EmptyBorder(0, 0, 0, 0));
        title.setText("External Plugin Manager");
        title.setForeground(Color.WHITE);
        addGHRepo.setToolTipText("Add new GitHub repository");
        addGHRepo.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (ExternalPluginManagerPanel.this.userDidNotAcceptRisk()) {
                    return;
                }
                JTextField owner = new JTextField();
                JTextField name = new JTextField();
                JTextField token = new JTextField();
                Object[] message = new Object[]{"Github Repository owner:", owner, "Github Repository name:", name, "Github token (empty if public repo):", token};
                int option = JOptionPane.showConfirmDialog(ClientUI.getFrame(), message, "Add repository", 2);
                if (option != 0 || owner.getText().equals("") || name.getText().equals("")) {
                    return;
                }
                if (Static.getPluginRepoManager().isRepoMalicious(owner.getText())) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "Failed to add " + owner.getText() + "'s repo, contact an admin for support. ", "Error!", 0);
                    return;
                }
                if (ExternalPluginManagerPanel.this.externalPluginManager.doesGhRepoExist(owner.getText(), name.getText())) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "This repository already exists.", "Error!", 0);
                    return;
                }
                if (OPRSExternalPluginManager.testGHRepository(owner.getText(), name.getText(), token.getText())) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!", 0);
                    return;
                }
                ExternalPluginManagerPanel.this.externalPluginManager.addGHRepository(owner.getText(), name.getText(), token.getText());
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                addGHRepo.setIcon(ADD_HOVER_ICON_GH);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                addGHRepo.setIcon(ADD_ICON_GH);
            }
        });
        addGHRepo.setBorder(new EmptyBorder(0, 3, 0, 0));
        addRawRepo.setToolTipText("Add new raw repository");
        addRawRepo.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                URL urlActual;
                if (ExternalPluginManagerPanel.this.userDidNotAcceptRisk()) {
                    return;
                }
                JTextField id = new JTextField();
                JTextField url = new JTextField();
                JTextField token = new JTextField();
                Object[] message = new Object[]{"Repository ID:", id, "Repository URL:", url, "Github token (empty if public repo):", token};
                int option = JOptionPane.showConfirmDialog(ClientUI.getFrame(), message, "Add repository", 2);
                if (option != 0 || id.getText().equals("") || url.getText().equals("")) {
                    return;
                }
                if (id.getText().startsWith("gh:") || id.getText().contains("|")) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "Repository id cannot begin with \"gh:\"\nor contain the pipe character '|'.", "Error!", 0);
                    return;
                }
                if (ExternalPluginManagerPanel.this.externalPluginManager.doesRepoExist(id.getText())) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), String.format("The repository with id %s already exists.", id.getText()), "Error!", 0);
                    return;
                }
                String pluginJson = null;
                try {
                    String urlText = url.getText();
                    if (urlText.contains(".json")) {
                        urlText = urlText.replace(".json/", ".json");
                        URL urlObj = new URL(urlText);
                        String urlPath = urlObj.getPath();
                        pluginJson = urlPath.substring(urlPath.lastIndexOf(47) + 1);
                    }
                    urlActual = new URL(urlText);
                }
                catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!", 0);
                    return;
                }
                if (pluginJson == null && OPRSExternalPluginManager.testRepository(urlActual, token.getText()) || pluginJson != null && OPRSExternalPluginManager.testRepository(urlActual, pluginJson)) {
                    JOptionPane.showMessageDialog(ClientUI.getFrame(), "This doesn't appear to be a valid repository.", "Error!", 0);
                    return;
                }
                ExternalPluginManagerPanel.this.externalPluginManager.addRepository(id.getText(), urlActual, pluginJson, token.getText());
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                addRawRepo.setIcon(ADD_HOVER_ICON_RAW);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                addRawRepo.setIcon(ADD_ICON_RAW);
            }
        });
        addRawRepo.setBorder(new EmptyBorder(0, 0, 0, 3));
        titlePanel.add((Component)title, "West");
        buttonHolder.add((Component)addRawRepo, "West");
        buttonHolder.add((Component)addGHRepo, "East");
        titlePanel.add((Component)buttonHolder, "East");
        return titlePanel;
    }

    private JTabbedPane tabbedPane() {
        JTabbedPane mainTabPane = new JTabbedPane();
        PluginsPanel pluginPanel = new PluginsPanel(this.externalPluginManager, this.eventBus);
        JScrollPane repositoryPanel = ExternalPluginManagerPanel.wrapContainer(new RepositoryPanel(this.externalPluginManager, this.eventBus));
        mainTabPane.add("Plugins", pluginPanel);
        mainTabPane.add("Repositories", repositoryPanel);
        return mainTabPane;
    }

    private boolean userDidNotAcceptRisk() {
        Font font = (Font)UIManager.get("OptionPane.buttonFont");
        int answer = this.showWarningDialog();
        UIManager.put("OptionPane.buttonFont", font);
        return answer != 0;
    }

    private int showWarningDialog() {
        Object[] options = new Object[]{"Okay, I accept the risk", "Never mind, turn back"};
        JLabel label = new JLabel("<html><p>If you were messaged in game or on Discord and were told to add this repo, you may be getting lured/phished/hacked. Adding plugins from unverified sources may put your account or personal information at risk!</p></html>");
        Font font = new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeFont().getStyle(), 32);
        UIManager.put("OptionPane.buttonFont", font);
        label.setPreferredSize(new Dimension(450, 200));
        label.setFont(font);
        return JOptionPane.showOptionDialog(ClientUI.getFrame(), label, "Account security warning", 0, 2, null, options, options[1]);
    }

    static JScrollPane wrapContainer(JPanel container) {
        JPanel wrapped = new JPanel(new BorderLayout());
        wrapped.add((Component)container, "North");
        JScrollPane scroller = new JScrollPane(wrapped);
        scroller.setHorizontalScrollBarPolicy(31);
        scroller.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0));
        return scroller;
    }

    static {
        BufferedImage addIconRaw = ImageUtil.loadImageResource(ExternalPluginManagerPanel.class, "add_raw_icon.png");
        BufferedImage addIconGh = ImageUtil.resizeImage(ImageUtil.loadImageResource(ExternalPluginManagerPanel.class, "gh_icon.png"), 14, 14);
        ADD_ICON_RAW = new ImageIcon(addIconRaw);
        ADD_HOVER_ICON_RAW = new ImageIcon(ImageUtil.alphaOffset((Image)addIconRaw, 0.53f));
        ADD_ICON_GH = new ImageIcon(addIconGh);
        ADD_HOVER_ICON_GH = new ImageIcon(ImageUtil.alphaOffset((Image)addIconGh, 0.53f));
    }
}

