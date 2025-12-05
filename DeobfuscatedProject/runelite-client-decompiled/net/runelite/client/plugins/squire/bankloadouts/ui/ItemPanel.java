/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.squire.bankloadouts.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.bankloadouts.model.BankLoadoutItem;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.util.AsyncBufferedImage;

public class ItemPanel
extends JPanel {
    private final ItemManager itemManager;
    private final JLabel label;
    private BankLoadoutItem item;

    public ItemPanel(ItemManager itemManager) {
        this.itemManager = itemManager;
        this.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        this.label = new JLabel();
        this.label.setVerticalAlignment(0);
        this.label.setHorizontalAlignment(0);
        this.add(this.label);
    }

    public void setItem(BankLoadoutItem item) {
        this.item = item;
        AsyncBufferedImage itemImage = this.itemManager.getImage(item.getId(), item.getQuantity(), item.getQuantity() > 1);
        itemImage.addTo(this.label);
    }
}

