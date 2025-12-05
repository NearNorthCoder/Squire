/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 */
package net.runelite.client.plugins.banktags.tabs;

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.banktags.tabs.Layout;
import net.runelite.client.plugins.banktags.tabs.TagTab;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.math.NumberUtils;

@Singleton
public class TabManager {
    private final List<TagTab> tabs = new ArrayList<TagTab>();
    private final ConfigManager configManager;

    @Inject
    private TabManager(ConfigManager configManager) {
        this.configManager = configManager;
    }

    public void add(TagTab tagTab) {
        if (!this.contains(tagTab.getTag())) {
            this.tabs.add(tagTab);
            if (tagTab.hasLayout()) {
                tagTab.getLayout().dirty = true;
            }
        }
    }

    void clear() {
        this.tabs.clear();
    }

    public TagTab find(String tag) {
        Optional<TagTab> first = this.tabs.stream().filter(t -> t.getTag().equals(Text.standardize(tag))).findAny();
        return first.orElse(null);
    }

    List<String> loadAllTabNames() {
        return Text.fromCSV(MoreObjects.firstNonNull(this.configManager.getConfiguration("banktags", "tagtabs"), ""));
    }

    TagTab load(String tag) {
        TagTab tagTab = this.find(tag);
        if (tagTab == null) {
            tag = Text.standardize(tag);
            String item = this.configManager.getConfiguration("banktags", "icon_" + tag);
            int itemid = NumberUtils.toInt(item, 952);
            tagTab = new TagTab(itemid, tag);
            String layoutStr = this.configManager.getConfiguration("banktags", "layout_" + tag);
            if (layoutStr != null) {
                List<String> layoutList = Text.fromCSV(layoutStr);
                int[] layout = new int[layoutList.size()];
                for (int i = 0; i < layoutList.size(); ++i) {
                    layout[i] = Integer.parseInt(layoutList.get(i));
                }
                tagTab.setLayout(new Layout(layout));
            }
        }
        return tagTab;
    }

    private void save(TagTab tab) {
        this.setIcon(tab.getTag(), tab.getIconItemId());
        if (tab.hasLayout()) {
            Layout layout = tab.getLayout();
            if (layout.dirty) {
                this.setLayout(tab.getTag(), layout.getLayout());
            }
        } else {
            this.removeLayout(tab.getTag());
        }
    }

    void swap(String tagToMove, String tagDestination) {
        tagToMove = Text.standardize(tagToMove);
        tagDestination = Text.standardize(tagDestination);
        if (this.contains(tagToMove) && this.contains(tagDestination)) {
            Collections.swap(this.tabs, this.indexOf(tagToMove), this.indexOf(tagDestination));
        }
    }

    void insert(String tagToMove, String tagDestination) {
        tagToMove = Text.standardize(tagToMove);
        tagDestination = Text.standardize(tagDestination);
        if (this.contains(tagToMove) && this.contains(tagDestination)) {
            this.tabs.add(this.indexOf(tagDestination), this.tabs.remove(this.indexOf(tagToMove)));
        }
    }

    public void remove(String tag) {
        TagTab tagTab = this.find(tag);
        if (tagTab != null) {
            this.tabs.remove(tagTab);
            this.removeIcon(tag);
            this.removeLayout(tag);
        }
    }

    public void save() {
        String tags = Text.toCSV(this.tabs.stream().map(TagTab::getTag).collect(Collectors.toList()));
        this.configManager.setConfiguration("banktags", "tagtabs", tags);
        for (TagTab tab : this.tabs) {
            this.save(tab);
        }
    }

    private void removeIcon(String tag) {
        this.configManager.unsetConfiguration("banktags", "icon_" + Text.standardize(tag));
    }

    private void setIcon(String tag, int itemId) {
        this.configManager.setConfiguration("banktags", "icon_" + Text.standardize(tag), itemId);
    }

    private void removeLayout(String tag) {
        this.configManager.unsetConfiguration("banktags", "layout_" + Text.standardize(tag));
    }

    private void setLayout(String tag, int[] layout) {
        StringBuilder sb = new StringBuilder(layout.length * 5);
        for (int i = 0; i < layout.length; ++i) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(layout[i]);
        }
        this.configManager.setConfiguration("banktags", "layout_" + Text.standardize(tag), sb.toString());
    }

    int size() {
        return this.tabs.size();
    }

    private boolean contains(String tag) {
        return this.tabs.stream().anyMatch(t -> t.getTag().equals(tag));
    }

    private int indexOf(TagTab tagTab) {
        return this.tabs.indexOf(tagTab);
    }

    private int indexOf(String tag) {
        return this.indexOf(this.find(tag));
    }

    public List<TagTab> getTabs() {
        return this.tabs;
    }
}

