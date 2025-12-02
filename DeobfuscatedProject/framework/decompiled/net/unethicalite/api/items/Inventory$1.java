/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package net.unethicalite.api.items;

import java.util.function.Function;
import net.runelite.api.Item;
import net.unethicalite.api.items.Items;

static class Inventory.1
extends Items {
    Inventory.1(int inventoryID, Function modification) {
        super(inventoryID, (Function<Item, Boolean>)modification);
    }
}
