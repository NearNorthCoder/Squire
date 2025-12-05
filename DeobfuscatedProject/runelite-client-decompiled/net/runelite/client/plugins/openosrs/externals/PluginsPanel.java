/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.util.Text
 *  org.pf4j.VersionManager
 *  org.pf4j.update.PluginInfo
 *  org.pf4j.update.VerifyException
 */
package net.runelite.client.plugins.openosrs.externals;

import com.google.gson.JsonSyntaxException;
import com.openosrs.client.events.OPRSPluginChanged;
import com.openosrs.client.events.OPRSRepositoryChanged;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.plugins.OPRSUpdateManager;
import net.runelite.client.plugins.OPRSUpdateRepository;
import net.runelite.client.plugins.openosrs.externals.ExternalBox;
import net.runelite.client.plugins.openosrs.externals.ExternalPluginManagerPanel;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.components.IconTextField;
import net.runelite.client.ui.components.shadowlabel.JShadowedLabel;
import net.runelite.client.util.DeferredDocumentChangedListener;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.SwingUtil;
import org.pf4j.VersionManager;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.VerifyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PluginsPanel
extends JPanel {
    private static final Logger log = LoggerFactory.getLogger(PluginsPanel.class);
    private static final ImageIcon ADD_ICON;
    private static final ImageIcon ADD_HOVER_ICON;
    private static final ImageIcon DELETE_ICON;
    private static final ImageIcon DELETE_HOVER_ICON;
    private static final ImageIcon DELETE_ICON_GRAY;
    private static final ImageIcon DELETE_HOVER_ICON_GRAY;
    private final OPRSExternalPluginManager externalPluginManager;
    private final VersionManager versionManager;
    private final OPRSUpdateManager updateManager;
    private final IconTextField searchBar = new IconTextField();
    private final JPanel filterwrapper = new JPanel(new BorderLayout(0, 10));
    private final List<PluginInfo> installedPluginsList = new ArrayList<PluginInfo>();
    private final List<PluginInfo> availablePluginsList = new ArrayList<PluginInfo>();
    private final JPanel installedPluginsPanel = new JPanel(new GridBagLayout());
    private final JPanel availablePluginsPanel = new JPanel(new GridBagLayout());
    private JComboBox<String> filterComboBox;
    private Set<String> deps;

    PluginsPanel(OPRSExternalPluginManager externalPluginManager, EventBus eventBus) {
        this.externalPluginManager = externalPluginManager;
        this.versionManager = externalPluginManager.getExternalPluginManager().getVersionManager();
        this.updateManager = externalPluginManager.getUpdateManager();
        this.setLayout(new BorderLayout(0, 10));
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.buildFilter();
        JTabbedPane mainTabPane = new JTabbedPane();
        mainTabPane.add("Installed", ExternalPluginManagerPanel.wrapContainer(this.installedPluginsPanel()));
        mainTabPane.add("Available", ExternalPluginManagerPanel.wrapContainer(this.availablePluginsPanel()));
        this.add((Component)this.filterwrapper, "North");
        this.add((Component)mainTabPane, "Center");
        eventBus.register(this);
        this.reloadPlugins();
    }

    @Subscribe
    public void onExternalRepositoryChanged(OPRSRepositoryChanged event) {
        this.buildFilter();
        this.reloadPlugins();
        this.repaint();
    }

    private void buildFilter() {
        this.filterwrapper.removeAll();
        DeferredDocumentChangedListener listener = new DeferredDocumentChangedListener();
        listener.addChangeListener(e -> {
            this.installedPlugins();
            this.availablePlugins();
        });
        this.filterwrapper.setBorder(new EmptyBorder(10, 10, 0, 10));
        List<String> repositories = this.getRepositories();
        this.filterComboBox = new JComboBox<String>(repositories.toArray(new String[0]));
        this.filterComboBox.setPreferredSize(new Dimension(230, 30));
        this.filterComboBox.addActionListener(e -> {
            this.installedPlugins();
            this.availablePlugins();
        });
        if (repositories.size() > 2) {
            this.filterwrapper.add(this.filterComboBox, "North");
        }
        this.searchBar.setIcon(IconTextField.Icon.SEARCH);
        this.searchBar.setPreferredSize(new Dimension(230, 30));
        this.searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        this.searchBar.setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
        this.searchBar.getDocument().addDocumentListener(listener);
        this.filterwrapper.add((Component)this.searchBar, "Center");
    }

    private List<String> getRepositories() {
        ArrayList<String> repositories = new ArrayList<String>();
        repositories.add("All");
        for (OPRSUpdateRepository updateRepository : this.updateManager.getRepositories()) {
            repositories.add(updateRepository.getUrl().toString().replace("https://raw.githubusercontent.com/", "").replace("/master/", ""));
        }
        return repositories;
    }

    private JLabel titleLabel(String text) {
        JShadowedLabel title = new JShadowedLabel();
        title.setFont(FontManager.getRunescapeSmallFont());
        title.setForeground(Color.WHITE);
        title.setHorizontalAlignment(0);
        title.setText("<html><body style = 'text-align:center'>" + text + "</body></html>");
        return title;
    }

    private JPanel installedPluginsPanel() {
        JPanel installedPluginsContainer = new JPanel();
        installedPluginsContainer.setLayout(new BorderLayout(0, 5));
        installedPluginsContainer.setBorder(new EmptyBorder(0, 10, 10, 10));
        installedPluginsContainer.add((Component)this.installedPluginsPanel, "Center");
        return installedPluginsContainer;
    }

    private JPanel availablePluginsPanel() {
        JPanel availablePluginsContainer = new JPanel();
        availablePluginsContainer.setLayout(new BorderLayout(0, 5));
        availablePluginsContainer.setBorder(new EmptyBorder(0, 10, 10, 10));
        availablePluginsContainer.add((Component)this.availablePluginsPanel, "Center");
        return availablePluginsContainer;
    }

    static boolean mismatchesSearchTerms(String search, PluginInfo pluginInfo) {
        String[] searchTerms = search.toLowerCase().split(" ");
        String[] pluginTerms = (pluginInfo.name + " " + pluginInfo.description).toLowerCase().split("[/\\s]");
        for (String term : searchTerms) {
            if (!Arrays.stream(pluginTerms).noneMatch(t -> t.contains(term) || Text.DISTANCE.apply((CharSequence)t, (CharSequence)term) > 0.9)) continue;
            return true;
        }
        return false;
    }

    private void reloadPlugins() {
        this.fetchPlugins();
        try {
            SwingUtil.syncExec(() -> {
                this.installedPlugins();
                this.availablePlugins();
            });
        }
        catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void fetchPlugins() {
        List<PluginInfo> availablePlugins = null;
        List<PluginInfo> plugins = null;
        List<String> disabledPlugins = this.externalPluginManager.getDisabledPluginIds();
        try {
            availablePlugins = this.updateManager.getAvailablePlugins();
            plugins = this.updateManager.getPlugins();
        }
        catch (JsonSyntaxException ex) {
            log.error(String.valueOf(ex));
        }
        if (availablePlugins == null || plugins == null) {
            JOptionPane.showMessageDialog(ClientUI.getFrame(), "The external plugin list could not be loaded.", "Error", 0);
            return;
        }
        this.availablePluginsList.clear();
        this.installedPluginsList.clear();
        this.deps = this.externalPluginManager.getDependencies();
        for (PluginInfo pluginInfo : plugins) {
            if (availablePlugins.contains(pluginInfo) || disabledPlugins.contains(pluginInfo.id)) {
                this.availablePluginsList.add(pluginInfo);
                continue;
            }
            this.installedPluginsList.add(pluginInfo);
        }
    }

    @Subscribe
    private void onExternalPluginChanged(OPRSPluginChanged externalPluginChanged) {
        String pluginId = externalPluginChanged.getPluginId();
        Optional<Component> externalBox = externalPluginChanged.isAdded() ? Arrays.stream(this.availablePluginsPanel.getComponents()).filter(extBox -> extBox instanceof ExternalBox && ((ExternalBox)extBox).pluginInfo.id.equals(pluginId)).findFirst() : Arrays.stream(this.installedPluginsPanel.getComponents()).filter(extBox -> extBox instanceof ExternalBox && ((ExternalBox)extBox).pluginInfo.id.equals(pluginId)).findFirst();
        if (externalBox.isEmpty()) {
            log.info("EXTERNALBOX IS EMPTY: {}", (Object)pluginId);
            return;
        }
        ExternalBox extBox2 = (ExternalBox)externalBox.get();
        this.deps = this.externalPluginManager.getDependencies();
        try {
            SwingUtil.syncExec(() -> {
                if (externalPluginChanged.isAdded()) {
                    this.availablePluginsPanel.remove((Component)externalBox.get());
                    this.availablePluginsList.remove(extBox.pluginInfo);
                    this.installedPluginsList.add(extBox.pluginInfo);
                    this.installedPluginsList.sort(Comparator.naturalOrder());
                    this.installedPlugins();
                    this.pluginInstallButton(extBox.install, extBox.pluginInfo, true, this.deps.contains(extBox.pluginInfo.id));
                } else {
                    this.installedPluginsPanel.remove((Component)externalBox.get());
                    this.installedPluginsList.remove(extBox.pluginInfo);
                    this.availablePluginsList.add(extBox.pluginInfo);
                    this.availablePluginsList.sort(Comparator.naturalOrder());
                    this.availablePlugins();
                    this.pluginInstallButton(extBox.install, extBox.pluginInfo, false, false);
                }
            });
        }
        catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void installedPlugins() {
        GridBagConstraints c = new GridBagConstraints();
        this.installedPluginsPanel.removeAll();
        String search = this.searchBar.getText();
        for (PluginInfo pluginInfo : this.installedPluginsList) {
            if (!search.equals("") && PluginsPanel.mismatchesSearchTerms(search, pluginInfo)) continue;
            if (this.filterComboBox.getSelectedIndex() != 0) {
                boolean filtered = true;
                String filter = String.valueOf(this.filterComboBox.getSelectedItem());
                for (OPRSUpdateRepository updateRepository : this.updateManager.getRepositories()) {
                    if (!filter.equals(updateRepository.getUrl().toString().replace("https://raw.githubusercontent.com/", "").replace("/master/", "")) || !pluginInfo.getRepositoryId().equals(updateRepository.getId())) continue;
                    filtered = false;
                }
                if (filtered) continue;
            }
            ExternalBox pluginBox = new ExternalBox(pluginInfo);
            pluginBox.pluginInfo = pluginInfo;
            c.fill = 2;
            c.weightx = 1.0;
            ++c.gridy;
            c.insets = new Insets(5, 0, 0, 0);
            this.pluginInstallButton(pluginBox.install, pluginInfo, true, this.deps.contains(pluginInfo.id));
            this.installedPluginsPanel.add((Component)pluginBox, c);
        }
        if (this.installedPluginsPanel.getComponents().length < 1) {
            this.installedPluginsPanel.add(this.titleLabel("No plugins found"));
        }
    }

    private void availablePlugins() {
        GridBagConstraints c = new GridBagConstraints();
        this.availablePluginsPanel.removeAll();
        String search = this.searchBar.getText();
        for (PluginInfo pluginInfo : this.availablePluginsList) {
            if (pluginInfo.releases.stream().noneMatch(pluginRelease -> this.versionManager.checkVersionConstraint(this.externalPluginManager.getExternalPluginManager().getSystemVersion(), pluginRelease.requires)) || !search.equals("") && PluginsPanel.mismatchesSearchTerms(search, pluginInfo)) continue;
            if (this.filterComboBox.getSelectedIndex() != 0) {
                boolean filtered = true;
                String filter = String.valueOf(this.filterComboBox.getSelectedItem());
                for (OPRSUpdateRepository updateRepository : this.updateManager.getRepositories()) {
                    if (!filter.equals(updateRepository.getUrl().toString().replace("https://raw.githubusercontent.com/", "").replace("/master/", "")) || !pluginInfo.getRepositoryId().equals(updateRepository.getId())) continue;
                    filtered = false;
                }
                if (filtered) continue;
            }
            ExternalBox pluginBox = new ExternalBox(pluginInfo);
            pluginBox.pluginInfo = pluginInfo;
            c.fill = 2;
            c.weightx = 1.0;
            ++c.gridy;
            c.insets = new Insets(5, 0, 0, 0);
            this.pluginInstallButton(pluginBox.install, pluginInfo, false, false);
            this.availablePluginsPanel.add((Component)pluginBox, c);
        }
        if (this.availablePluginsPanel.getComponents().length < 1) {
            this.availablePluginsPanel.add(this.titleLabel("No plugins found"));
        }
    }

    private void pluginInstallButton(final JLabel install, final PluginInfo pluginInfo, final boolean installed, final boolean hideAction) {
        install.setIcon(installed ? (hideAction ? DELETE_ICON_GRAY : DELETE_ICON) : ADD_ICON);
        install.setText("");
        if (!hideAction) {
            install.setToolTipText(installed ? "Uninstall" : "Install");
        }
        install.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent e) {
                if (installed) {
                    if (hideAction) {
                        JOptionPane.showMessageDialog(ClientUI.getFrame(), "This plugin can't be uninstalled because one or more other plugins have a dependency on it.", "Error!", 0);
                    } else {
                        install.setIcon(null);
                        install.setText("Uninstalling");
                        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>(){

                            @Override
                            protected Boolean doInBackground() {
                                return PluginsPanel.this.externalPluginManager.uninstall(pluginInfo.id);
                            }

                            @Override
                            protected void done() {
                                boolean status = false;
                                try {
                                    status = (Boolean)this.get();
                                }
                                catch (InterruptedException | ExecutionException exception) {
                                    // empty catch block
                                }
                                if (!status) {
                                    PluginsPanel.this.pluginInstallButton(install, pluginInfo, installed, hideAction);
                                }
                            }
                        };
                        worker.execute();
                    }
                } else {
                    install.setIcon(null);
                    install.setText("Installing");
                    SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>(){

                        @Override
                        protected Boolean doInBackground() {
                            return PluginsPanel.this.installPlugin(pluginInfo);
                        }

                        @Override
                        protected void done() {
                            boolean status = false;
                            try {
                                status = (Boolean)this.get();
                            }
                            catch (InterruptedException | ExecutionException exception) {
                                // empty catch block
                            }
                            if (!status) {
                                PluginsPanel.this.pluginInstallButton(install, pluginInfo, installed, hideAction);
                            }
                        }
                    };
                    worker.execute();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (install.getText().toLowerCase().contains("installing")) {
                    return;
                }
                install.setIcon(installed ? (hideAction ? DELETE_HOVER_ICON_GRAY : DELETE_HOVER_ICON) : ADD_HOVER_ICON);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (install.getText().toLowerCase().contains("installing")) {
                    return;
                }
                install.setIcon(installed ? (hideAction ? DELETE_ICON_GRAY : DELETE_ICON) : ADD_ICON);
            }
        });
    }

    private boolean installPlugin(PluginInfo pluginInfo) {
        try {
            return this.externalPluginManager.install(pluginInfo.id);
        }
        catch (VerifyException ex) {
            try {
                SwingUtil.syncExec(() -> JOptionPane.showMessageDialog(ClientUI.getFrame(), pluginInfo.name + " could not be installed, the hash could not be verified.", "Error!", 0));
            }
            catch (InterruptedException | InvocationTargetException exception) {
                // empty catch block
            }
            return false;
        }
    }

    static {
        BufferedImage addIcon = ImageUtil.recolorImage(ImageUtil.loadImageResource(PluginsPanel.class, "add_icon.png"), ColorScheme.BRAND_BLUE);
        ADD_ICON = new ImageIcon(addIcon);
        ADD_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset((Image)addIcon, 0.53f));
        BufferedImage deleteImg = ImageUtil.recolorImage(ImageUtil.resizeCanvas(ImageUtil.loadImageResource(PluginsPanel.class, "delete_icon.png"), 14, 14), ColorScheme.BRAND_BLUE);
        DELETE_ICON = new ImageIcon(deleteImg);
        DELETE_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset((Image)deleteImg, 0.53f));
        DELETE_ICON_GRAY = new ImageIcon(ImageUtil.grayscaleImage(deleteImg));
        DELETE_HOVER_ICON_GRAY = new ImageIcon(ImageUtil.alphaOffset((Image)ImageUtil.grayscaleImage(deleteImg), 0.53f));
    }
}

