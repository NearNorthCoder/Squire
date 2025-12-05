/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.squire.bankloadouts.ui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.bankloadouts.model.BankLoadoutItem;
import net.runelite.client.plugins.squire.bankloadouts.ui.ItemPanel;
import net.runelite.client.plugins.squire.inventory.InventorySetup;

public class InventoryPanel
extends JPanel {
    private static final int INVENTORY_ROWS = 7;
    private static final int INVENTORY_COLUMNS = 4;
    private final ItemManager itemManager;
    private final ItemPanel[] itemPanels;
    private InventorySetup inventorySetup;

    public InventoryPanel(ItemManager itemManager) {
        this.itemManager = itemManager;
        this.itemPanels = this.createItemPanels();
        this.setLayout(new GridBagLayout());
        this.build();
    }

    private ItemPanel[] createItemPanels() {
        ItemPanel[] itemPanels = new ItemPanel[28];
        for (int i = 0; i < itemPanels.length; ++i) {
            itemPanels[i] = new ItemPanel(this.itemManager);
        }
        return itemPanels;
    }

    private void build() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;
        c.gridx = 0;
        for (int y = 0; y < 7; ++y) {
            for (int x = 0; x < 4; ++x) {
                int index = y * 4 + x;
                this.add((Component)this.itemPanels[index], c);
                ++c.gridx;
            }
            ++c.gridy;
        }
        this.revalidate();
    }

    public void setInventorySetup(InventorySetup inventorySetup) {
        this.inventorySetup = inventorySetup;
        for (int i = 0; i < 28; ++i) {
            this.update(i);
        }
        this.revalidate();
    }

    private void update(int slot) {
        if (this.inventorySetup == null) {
            return;
        }
        ItemPanel itemPanel = this.itemPanels[slot];
        itemPanel.setItem(new BankLoadoutItem(this.inventorySetup.getIds()[slot], this.inventorySetup.getQuantities()[slot]));
    }
}

