/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.widgets.WidgetItem
 */
package net.runelite.client.plugins.slayer;

import com.google.common.collect.ImmutableSet;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.plugins.slayer.SlayerConfig;
import net.runelite.client.plugins.slayer.SlayerPlugin;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.TextComponent;

class SlayerOverlay
extends WidgetItemOverlay {
    private static final Set<Integer> SLAYER_JEWELRY = ImmutableSet.of(Integer.valueOf(11873), Integer.valueOf(11872), Integer.valueOf(11871), Integer.valueOf(11870), Integer.valueOf(11869), Integer.valueOf(11868), new Integer[]{11867, 11866});
    private static final Set<Integer> ALL_SLAYER_ITEMS = ImmutableSet.of(Integer.valueOf(11864), Integer.valueOf(11865), Integer.valueOf(25177), Integer.valueOf(19639), Integer.valueOf(19641), Integer.valueOf(25179), new Integer[]{19643, 19645, 25181, 21264, 21266, 25185, 19647, 19649, 25183, 21888, 21890, 25187, 24370, 24444, 25191, 23073, 23075, 25189, 25898, 25900, 25902, 25904, 25906, 25908, 25910, 25912, 25914, 21268, 4155, 21270, 11873, 11872, 11871, 11870, 11869, 11868, 11867, 11866});
    private final SlayerConfig config;
    private final SlayerPlugin plugin;

    @Inject
    private SlayerOverlay(SlayerPlugin plugin, SlayerConfig config) {
        this.plugin = plugin;
        this.config = config;
        this.showOnInventory();
        this.showOnEquipment();
    }

    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem widgetItem) {
        if (!ALL_SLAYER_ITEMS.contains(itemId)) {
            return;
        }
        if (!this.config.showItemOverlay()) {
            return;
        }
        int amount = this.plugin.getAmount();
        if (amount <= 0) {
            return;
        }
        graphics.setFont(FontManager.getRunescapeSmallFont());
        Rectangle bounds = widgetItem.getCanvasBounds();
        TextComponent textComponent = new TextComponent();
        textComponent.setText(String.valueOf(amount));
        textComponent.setPosition(new Point(bounds.x - 1, bounds.y - 1 + (SLAYER_JEWELRY.contains(itemId) ? bounds.height : graphics.getFontMetrics().getHeight())));
        textComponent.render(graphics);
    }
}

