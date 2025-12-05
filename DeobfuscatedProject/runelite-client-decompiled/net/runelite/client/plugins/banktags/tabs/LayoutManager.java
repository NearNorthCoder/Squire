/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  lombok.NonNull
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.EnumComposition
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.ScriptEvent
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.events.ScriptPreFired
 *  net.runelite.api.widgets.Widget
 */
package net.runelite.client.plugins.banktags.tabs;

import com.google.common.util.concurrent.Runnables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.NonNull;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.EnumComposition;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.ScriptEvent;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.api.widgets.Widget;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.game.chatbox.ChatboxPanelManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.bank.BankSearch;
import net.runelite.client.plugins.banktags.BankTag;
import net.runelite.client.plugins.banktags.BankTagsPlugin;
import net.runelite.client.plugins.banktags.tabs.AutoLayout;
import net.runelite.client.plugins.banktags.tabs.Layout;
import net.runelite.client.plugins.banktags.tabs.TabInterface;
import net.runelite.client.plugins.banktags.tabs.TabManager;
import net.runelite.client.plugins.banktags.tabs.TagTab;
import net.runelite.client.util.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class LayoutManager {
    private static final Logger log = LoggerFactory.getLogger(LayoutManager.class);
    private final Client client;
    private final ItemManager itemManager;
    private final BankTagsPlugin plugin;
    private final ChatboxPanelManager chatboxPanelManager;
    private final BankSearch bankSearch;
    private final TabManager tabManager;
    private final TabInterface tabInterface;
    private final ChatMessageManager chatMessageManager;
    private final List<PluginAutoLayout> autoLayouts = new ArrayList<PluginAutoLayout>();

    @Inject
    LayoutManager(Client client, ItemManager itemManager, BankTagsPlugin plugin, ChatboxPanelManager chatboxPanelManager, BankSearch bankSearch, TabManager tabManager, TabInterface tabInterface, ChatMessageManager chatMessageManager) {
        this.client = client;
        this.itemManager = itemManager;
        this.plugin = plugin;
        this.chatboxPanelManager = chatboxPanelManager;
        this.bankSearch = bankSearch;
        this.tabManager = tabManager;
        this.tabInterface = tabInterface;
        this.chatMessageManager = chatMessageManager;
        this.registerAutoLayout(plugin, "Default", new DefaultLayout());
    }

    private void layout(Layout l) {
        ItemContainer bank = this.client.getItemContainer(InventoryID.BANK);
        Widget itemContainer = this.client.getWidget(786445);
        LinkedHashSet<Integer> bankItems = new LinkedHashSet<Integer>();
        for (int i = 0; i < bank.size(); ++i) {
            Widget c = itemContainer.getChild(i);
            if (c.isSelfHidden() || c.getItemId() <= -1 || c.getItemId() == 6512) continue;
            bankItems.add(c.getItemId());
            if (log.isDebugEnabled()) {
                ItemComposition def = this.itemManager.getItemComposition(c.getItemId());
                log.debug("Bank contains {}{}", (Object)def.getName(), (Object)(def.getPlaceholderId() > -1 && def.getPlaceholderTemplateId() > -1 ? " (placeholder)" : ""));
            }
            c.setHidden(true);
        }
        int[] layout = l.getLayout();
        ItemMatcher[] matchers = new ItemMatcher[]{this::matchExact, this::matchPlaceholder, this::matchesVariant};
        HashMap<Integer, Integer> layoutToBank = new HashMap<Integer, Integer>();
        for (ItemMatcher matcher : matchers) {
            for (int itemId : layout) {
                int matchedId;
                if (itemId == -1 || layoutToBank.containsKey(itemId) || (matchedId = matcher.match(bankItems, itemId)) == -1) continue;
                layoutToBank.put(itemId, matchedId);
                bankItems.remove(matchedId);
                if (!log.isDebugEnabled()) continue;
                ItemComposition from = this.itemManager.getItemComposition(itemId);
                ItemComposition to = this.itemManager.getItemComposition(matchedId);
                log.debug("Matched {}{} -> {}{}", from.getName(), from.getPlaceholderId() > -1 && from.getPlaceholderTemplateId() > -1 ? " (placeholder)" : "", to.getName(), to.getPlaceholderId() > -1 && to.getPlaceholderTemplateId() > -1 ? " (placeholder)" : "");
            }
        }
        for (int pos = 0; pos < layout.length; ++pos) {
            int itemId = layout[pos];
            if (itemId == -1) continue;
            Integer bankItemId = (Integer)layoutToBank.get(itemId);
            if (bankItemId == null) {
                if (log.isDebugEnabled()) {
                    ItemComposition def = this.itemManager.getItemComposition(itemId);
                    log.debug("Layout contains {}{} with no matching item", (Object)def.getName(), (Object)(def.getPlaceholderTemplateId() > -1 && def.getPlaceholderId() > -1 ? " (placeholder)" : ""));
                }
                bankItemId = itemId;
            }
            Widget c = itemContainer.getChild(pos);
            this.drawItem(l, c, bankItemId, bank.count(bankItemId.intValue()), pos);
        }
        int lastEmptySlot = -1;
        boolean modified = false;
        Iterator bankItemId = bankItems.iterator();
        while (bankItemId.hasNext()) {
            int itemId = (Integer)bankItemId.next();
            while (++lastEmptySlot < layout.length && layout[lastEmptySlot] > -1) {
            }
            Widget c = itemContainer.getChild(lastEmptySlot);
            if (c == null || c.getOriginalHeight() != 32) break;
            this.drawItem(l, c, itemId, bank.count(itemId), lastEmptySlot);
            int layoutItemId = this.itemManager.canonicalize(itemId);
            if (log.isDebugEnabled()) {
                log.debug("Adding {} to layout", (Object)this.itemManager.getItemComposition(layoutItemId).getName());
            }
            l.addItem(layoutItemId);
            modified = true;
        }
        while (true) {
            if (++lastEmptySlot < layout.length && layout[lastEmptySlot] > -1) {
                continue;
            }
            Widget c = itemContainer.getChild(lastEmptySlot);
            if (c == null || c.getOriginalHeight() != 32) break;
            this.drawItem(l, c, -1, 0, lastEmptySlot);
        }
        if (modified) {
            this.tabManager.save();
        }
    }

    private void drawItem(Layout l, Widget c, int item, int qty, int idx) {
        if (item > -1 && item != 20594) {
            ItemComposition def = this.client.getItemDefinition(item);
            c.setItemId(item);
            c.setItemQuantity(qty);
            c.setItemQuantityMode(2);
            c.setName("<col=ff9040>" + def.getName() + "</col>");
            c.clearActions();
            if (qty == 1 && def.getPlaceholderTemplateId() >= 0 && def.getPlaceholderId() >= 0) {
                c.setItemQuantity(0);
                c.setOpacity(120);
                c.setAction(7, "Release");
                c.setAction(9, "Examine");
            } else if (qty == 0) {
                c.setOpacity(120);
                c.setItemQuantity(Integer.MAX_VALUE);
                c.setItemQuantityMode(0);
                if (this.tabInterface.isActive()) {
                    c.setAction(6, "Duplicate-item");
                    c.setAction(7, "Remove-layout");
                }
            } else {
                String suffix;
                int quantityType = this.client.getVarbitValue(6590);
                int requestQty = this.client.getVarbitValue(3960);
                switch (quantityType) {
                    default: {
                        suffix = "1";
                        break;
                    }
                    case 1: {
                        suffix = "5";
                        break;
                    }
                    case 2: {
                        suffix = "10";
                        break;
                    }
                    case 3: {
                        suffix = Integer.toString(Math.max(1, requestQty));
                        break;
                    }
                    case 4: {
                        suffix = "All";
                    }
                }
                c.setAction(0, "Withdraw-" + suffix);
                if (quantityType != 0) {
                    c.setAction(1, "Withdraw-1");
                }
                c.setAction(2, "Withdraw-5");
                c.setAction(3, "Withdraw-10");
                if (requestQty > 0) {
                    c.setAction(4, "Withdraw-" + requestQty);
                }
                c.setAction(5, "Withdraw-X");
                c.setAction(6, "Withdraw-All");
                c.setAction(7, "Withdraw-All-but-1");
                if (this.client.getVarbitValue(3755) == 0) {
                    c.setAction(8, "Placeholder");
                }
                c.setAction(9, "Examine");
                c.setOpacity(0);
            }
            c.setOnDragListener(new Object[]{284, -2147483645, -2147483643, -2147483647, -2147483646, 786446, 0});
            c.setOnDragCompleteListener(new Object[]{ev -> this.dragCompleteHandler(l, ev)});
        } else {
            c.setOriginalWidth(48);
            c.setOriginalHeight(36);
            c.clearActions();
            c.setItemId(-1);
            c.setItemQuantity(0);
            c.setOnDragListener((Object[])null);
            c.setOnDragCompleteListener((Object[])null);
        }
        int posX = idx % 8 * 48 + 51;
        int posY = idx / 8 * 36;
        c.setHidden(false);
        c.setOriginalX(posX);
        c.setOriginalY(posY);
        c.revalidate();
    }

    private void dragCompleteHandler(Layout l, ScriptEvent ev) {
        boolean swap;
        this.client.setDraggedOnWidget(null);
        Widget source = ev.getSource();
        Widget target = ev.getTarget();
        if (target == null) {
            return;
        }
        if (source.getId() != 786445 || target.getId() != 786445) {
            return;
        }
        int sidx = source.getIndex();
        int tidx = target.getIndex();
        boolean bl = swap = this.client.getVarbitValue(3959) == 0;
        if (sidx >= l.size() || tidx >= l.size()) {
            l.resize(Math.max(sidx, tidx) + 1);
        }
        if (swap) {
            log.debug("Swap {} <-> {}", (Object)sidx, (Object)tidx);
            l.swap(sidx, tidx);
        } else {
            log.debug("Insert {} -> {}", (Object)sidx, (Object)tidx);
            l.insert(sidx, tidx);
        }
        this.tabManager.save();
        this.bankSearch.layoutBank();
    }

    private int matchExact(Set<Integer> bank, int itemId) {
        return bank.contains(itemId) ? itemId : -1;
    }

    private int matchPlaceholder(Set<Integer> bank, int itemId) {
        ItemComposition config = this.itemManager.getItemComposition(itemId);
        int placeholderId = config.getPlaceholderId();
        if (placeholderId != -1 && bank.contains(placeholderId)) {
            return placeholderId;
        }
        return -1;
    }

    private int matchesVariant(Set<Integer> bank, int itemId) {
        int baseId = ItemVariationMapping.map(itemId);
        if (baseId != itemId) {
            for (int variationId : ItemVariationMapping.getVariations(baseId)) {
                if (bank.contains(variationId)) {
                    return variationId;
                }
                ItemComposition config = this.itemManager.getItemComposition(variationId);
                int placeholderId = config.getPlaceholderId();
                if (placeholderId == -1 || !bank.contains(placeholderId)) continue;
                return placeholderId;
            }
        }
        return -1;
    }

    public synchronized void registerAutoLayout(@Nonnull Plugin plugin, @NonNull String name, @NonNull AutoLayout al) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (al == null) {
            throw new NullPointerException("al is marked non-null but is null");
        }
        for (PluginAutoLayout pluginAutoLayout : this.autoLayouts) {
            if (!pluginAutoLayout.getName().equals(name)) continue;
            throw new IllegalArgumentException("Auto layout " + name + " is already registered");
        }
        this.autoLayouts.add(new PluginAutoLayout(plugin, name, al));
    }

    public synchronized void unregisterAutoLayout(String name) {
        for (PluginAutoLayout pluginAutoLayout : this.autoLayouts) {
            if (!pluginAutoLayout.getName().equals(name)) continue;
            this.autoLayouts.remove(pluginAutoLayout);
            return;
        }
    }

    @Subscribe
    public void onScriptPreFired(ScriptPreFired event) {
        if (event.getScriptId() == 505) {
            Layout layout;
            this.resetWidgets();
            BankTag activeTag = this.plugin.getActiveTag();
            if (activeTag != null && (layout = activeTag.layout()) != null) {
                this.layout(layout);
                this.scrollLayout(layout);
            }
        }
    }

    private void resetWidgets() {
        Widget w = this.client.getWidget(786445);
        for (Widget c : w.getChildren()) {
            if (c.getOriginalHeight() < 32) break;
            if (c.getOriginalWidth() == 36 && c.getOriginalHeight() == 32) continue;
            c.setOriginalWidth(36);
            c.setOriginalHeight(32);
            c.revalidate();
        }
    }

    @Subscribe(priority=-1.0f)
    private void onMenuEntryAdded(MenuEntryAdded event) {
        ItemContainer bank;
        int idx;
        MenuEntry menu;
        Widget w;
        if (event.getActionParam1() == 786442 && event.getOption().equals("Disable layout")) {
            int idx2 = -1;
            for (PluginAutoLayout autoLayout : this.autoLayouts) {
                this.client.createMenuEntry(--idx2).setOption("Auto layout: " + autoLayout.getName()).setTarget(event.getTarget()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(e -> {
                    TagTab tab = this.tabManager.find(Text.removeTags(e.getTarget()));
                    if (tab != this.tabInterface.getActiveTab()) {
                        this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.CONSOLE).runeLiteFormattedMessage("The tag tab must be open first before performing an auto layout.").build());
                        return;
                    }
                    Layout old = tab.getLayout();
                    Layout new_ = autoLayout.autoLayout.generateLayout(tab);
                    tab.setLayout(new_);
                    this.bankSearch.layoutBank();
                    tab.setLayout(old);
                    this.tabManager.save();
                    this.chatboxPanelManager.openTextMenuInput("Tab laid out using the '" + autoLayout.getName() + "' layout.").option("1. Keep", () -> {
                        tab.setLayout(new_);
                        this.tabManager.save();
                    }).option("2. Undo", Runnables.doNothing()).onClose(this.bankSearch::layoutBank).build();
                });
            }
        }
        BankTag activeTag = this.plugin.getActiveTag();
        if (event.getActionParam1() == 786445 && activeTag != null && !this.tabInterface.isTagTabActive() && activeTag.layout() != null && (w = (menu = event.getMenuEntry()).getWidget()) != null && w.getItemId() > -1 && (idx = (bank = this.client.getItemContainer(InventoryID.BANK)).find(w.getItemId())) > -1 && menu.getParam0() != idx) {
            menu.setParam0(idx);
        }
    }

    private void scrollLayout(Layout l) {
        int pos;
        for (pos = l.size() - 1; pos >= 0 && l.getItemAtPos(pos) == -1; --pos) {
        }
        int rows = (pos + 8 - 1) / 8;
        int scrollY = rows * 36;
        Widget w = this.client.getWidget(786445);
        if (scrollY < w.getScrollY()) {
            int bankHeight = w.getHeight() / 36;
            if ((rows -= bankHeight) < 0) {
                rows = 0;
            }
            scrollY = rows * 36;
            log.debug("Adjusting tab scroll to {} from {}", (Object)scrollY, (Object)w.getScrollY());
            w.setScrollY(scrollY);
            this.client.setVarcIntValue(51, scrollY);
        }
    }

    private class DefaultLayout
    implements AutoLayout {
        private DefaultLayout() {
        }

        @Override
        public Layout generateLayout(TagTab tab) {
            ItemContainer i;
            Item item;
            int lpos;
            int old;
            int pos;
            int base;
            Layout l = new Layout(tab.getLayout());
            ArrayList<Integer> removed = new ArrayList<Integer>();
            ItemContainer e = LayoutManager.this.client.getItemContainer(InventoryID.EQUIPMENT);
            if (e != null) {
                int[] format = new int[]{-1, EquipmentInventorySlot.HEAD.getSlotIdx(), -1, EquipmentInventorySlot.CAPE.getSlotIdx(), EquipmentInventorySlot.AMULET.getSlotIdx(), EquipmentInventorySlot.AMMO.getSlotIdx(), EquipmentInventorySlot.WEAPON.getSlotIdx(), EquipmentInventorySlot.BODY.getSlotIdx(), EquipmentInventorySlot.SHIELD.getSlotIdx(), -1, EquipmentInventorySlot.LEGS.getSlotIdx(), -1, EquipmentInventorySlot.GLOVES.getSlotIdx(), EquipmentInventorySlot.BOOTS.getSlotIdx(), EquipmentInventorySlot.RING.getSlotIdx()};
                base = 0;
                for (pos = 0; pos < format.length; ++pos) {
                    if (pos > 0 && pos % 3 == 0) {
                        base += 8;
                    }
                    if ((old = l.getItemAtPos(lpos = base + pos % 3)) != -1) {
                        if (log.isDebugEnabled()) {
                            log.debug("Moving {}", (Object)LayoutManager.this.itemManager.getItemComposition(old).getName());
                        }
                        removed.add(old);
                    }
                    if ((item = e.getItem(format[pos])) != null) {
                        l.setItemAtPos(LayoutManager.this.itemManager.canonicalize(item.getId()), lpos);
                        continue;
                    }
                    l.setItemAtPos(-1, lpos);
                }
            }
            if ((i = LayoutManager.this.client.getItemContainer(InventoryID.INVENTORY)) != null) {
                base = 4;
                for (pos = 0; pos < i.size(); ++pos) {
                    if (pos > 0 && pos % 4 == 0) {
                        base += 8;
                    }
                    if ((old = l.getItemAtPos(lpos = base + pos % 4)) != -1) {
                        removed.add(old);
                    }
                    if ((item = i.getItem(pos)) != null) {
                        l.setItemAtPos(LayoutManager.this.itemManager.canonicalize(item.getId()), lpos);
                        continue;
                    }
                    l.setItemAtPos(-1, lpos);
                }
            }
            if (i != null && this.hasRunePouch(i)) {
                int[] RUNEPOUCH_RUNES = new int[]{29, 1622, 1623, 14285};
                EnumComposition runepouchEnum = LayoutManager.this.client.getEnum(982);
                lpos = 40;
                int idx = 0;
                while (idx < RUNEPOUCH_RUNES.length) {
                    int runeId = LayoutManager.this.client.getVarbitValue(RUNEPOUCH_RUNES[idx]);
                    if (runeId > 0) {
                        int itemId = runepouchEnum.getIntValue(runeId);
                        int old2 = l.getItemAtPos(lpos);
                        if (old2 != -1) {
                            removed.add(old2);
                        }
                        l.setItemAtPos(itemId, lpos);
                    }
                    ++idx;
                    ++lpos;
                }
            }
            for (int j = 0; j < 5; ++j) {
                int idx = j * 8 + 3;
                int old3 = l.getItemAtPos(idx);
                if (old3 == -1) continue;
                removed.add(old3);
                l.setItemAtPos(-1, idx);
            }
            int pos2 = 56;
            Iterator iterator = removed.iterator();
            while (iterator.hasNext()) {
                int itemId = (Integer)iterator.next();
                if (l.count(itemId) != 0) continue;
                if (log.isDebugEnabled()) {
                    log.debug("Adding {} at {}", (Object)LayoutManager.this.itemManager.getItemComposition(itemId).getName(), (Object)pos2);
                }
                l.addItemAfter(itemId, pos2++);
            }
            return l;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private boolean hasRunePouch(ItemContainer inv) {
            Collection<Integer> runePouchVariations = ItemVariationMapping.getVariations(12791);
            Collection<Integer> divineRunePouchVariations = ItemVariationMapping.getVariations(27281);
            if (runePouchVariations.stream().anyMatch(arg_0 -> ((ItemContainer)inv).contains(arg_0))) return true;
            if (!divineRunePouchVariations.stream().anyMatch(arg_0 -> ((ItemContainer)inv).contains(arg_0))) return false;
            return true;
        }
    }

    private static final class PluginAutoLayout {
        private final Plugin plugin;
        private final String name;
        private final AutoLayout autoLayout;

        public PluginAutoLayout(Plugin plugin, String name, AutoLayout autoLayout) {
            this.plugin = plugin;
            this.name = name;
            this.autoLayout = autoLayout;
        }

        public Plugin getPlugin() {
            return this.plugin;
        }

        public String getName() {
            return this.name;
        }

        public AutoLayout getAutoLayout() {
            return this.autoLayout;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof PluginAutoLayout)) {
                return false;
            }
            PluginAutoLayout other = (PluginAutoLayout)o;
            Plugin this$plugin = this.getPlugin();
            Plugin other$plugin = other.getPlugin();
            if (this$plugin == null ? other$plugin != null : !((Object)this$plugin).equals(other$plugin)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            AutoLayout this$autoLayout = this.getAutoLayout();
            AutoLayout other$autoLayout = other.getAutoLayout();
            return !(this$autoLayout == null ? other$autoLayout != null : !this$autoLayout.equals(other$autoLayout));
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Plugin $plugin = this.getPlugin();
            result = result * 59 + ($plugin == null ? 43 : ((Object)$plugin).hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            AutoLayout $autoLayout = this.getAutoLayout();
            result = result * 59 + ($autoLayout == null ? 43 : $autoLayout.hashCode());
            return result;
        }

        public String toString() {
            return "LayoutManager.PluginAutoLayout(plugin=" + String.valueOf(this.getPlugin()) + ", name=" + this.getName() + ", autoLayout=" + String.valueOf(this.getAutoLayout()) + ")";
        }
    }

    @FunctionalInterface
    static interface ItemMatcher {
        public int match(Set<Integer> var1, int var2);
    }
}

