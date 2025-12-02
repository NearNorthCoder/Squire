/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.items;

import java.util.Objects;
import java.util.function.Supplier;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

public class DepositBox {
    private static final Supplier<Widget> DEPOSIT_INV = () -> Widgets.get(192, 29);
    private static final Supplier<Widget> DEPOSIT_EQUIPS = () -> Widgets.get(192, 30);
    private static final Supplier<Widget> DEPOSIT_LOOTINGBAG = () -> Widgets.get(192, 31);
    private static final Supplier<Widget> ROOT = () -> Widgets.get(192, 1);
    private static final Supplier<Widget> EXIT = () -> Widgets.get(192, 1, 11);
    private static final Supplier<Widget> QUANTITY_ONE = () -> Widgets.get(192, 34);
    private static final Supplier<Widget> QUANTITY_FIVE = () -> Widgets.get(192, 35);
    private static final Supplier<Widget> QUANTITY_TEN = () -> Widgets.get(192, 36);
    private static final Supplier<Widget> QUANTITY_X = () -> Widgets.get(192, 37);
    private static final Supplier<Widget> QUANTITY_ALL = () -> Widgets.get(192, 38);

    private DepositBox() {
    }

    public static void depositInventory() {
        Widget depositInventory = DEPOSIT_INV.get();
        if (!Widgets.isVisible(depositInventory)) {
            return;
        }
        depositInventory.interact(0);
    }

    public static void depositEquipment() {
        Widget depositEquipment = DEPOSIT_EQUIPS.get();
        if (!Widgets.isVisible(depositEquipment)) {
            return;
        }
        depositEquipment.interact(0);
    }

    public static void depositLootingBag() {
        Widget depositLootingbag = DEPOSIT_LOOTINGBAG.get();
        if (!Widgets.isVisible(depositLootingbag)) {
            return;
        }
        depositLootingbag.interact(0);
    }

    public static void selectQuantityOne() {
        Widget selectQuantityOne = QUANTITY_ONE.get();
        if (!Widgets.isVisible(selectQuantityOne)) {
            return;
        }
        selectQuantityOne.interact(0);
    }

    public static void selectQuantityFive() {
        Widget selectQuantityFive = QUANTITY_FIVE.get();
        if (!Widgets.isVisible(selectQuantityFive)) {
            return;
        }
        selectQuantityFive.interact(0);
    }

    public static void selectQuantityTen() {
        Widget selectQuantityTen = QUANTITY_TEN.get();
        if (!Widgets.isVisible(selectQuantityTen)) {
            return;
        }
        selectQuantityTen.interact(0);
    }

    public static void selectQuantityX() {
        Widget selectQuantityX = QUANTITY_X.get();
        if (!Widgets.isVisible(selectQuantityX)) {
            return;
        }
        selectQuantityX.interact(0);
    }

    public static void selectQuantityAll() {
        Widget selectQuantityAll = QUANTITY_ALL.get();
        if (!Widgets.isVisible(selectQuantityAll)) {
            return;
        }
        selectQuantityAll.interact(0);
    }

    public static boolean isOpen() {
        Widget depositBox = ROOT.get();
        return Widgets.isVisible(depositBox);
    }

    public static void close() {
        Widget exitDepositBox = EXIT.get();
        if (!Widgets.isVisible(exitDepositBox)) {
            return;
        }
        exitDepositBox.interact(0);
    }

    public static void depositAll(int itemID) {
        Widget depositBoxInventory = Widgets.get(WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER);
        for (int i = 0; i < Inventory.getAll().size(); ++i) {
            if (Objects.requireNonNull(depositBoxInventory.getChild(i)).getItemId() != itemID) continue;
            Objects.requireNonNull(depositBoxInventory.getChild(i)).interact("Deposit-All");
        }
    }

    public static void depositAllItems(int[] itemIDs) {
        if (!DepositBox.isOpen() || itemIDs == null) {
            return;
        }
        for (int itemID : itemIDs) {
            DepositBox.depositAll(itemID);
        }
    }
}
