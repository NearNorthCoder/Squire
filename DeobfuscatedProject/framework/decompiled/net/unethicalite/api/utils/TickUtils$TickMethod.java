/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package net.unethicalite.api.utils;

import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

public static enum TickUtils.TickMethod {
    SWAMP_TAR(5249, List.of(Integer.valueOf(1939), Integer.valueOf(233)), 249, 251, 255),
    HARDWOOD_LOG(1248, 946, 6333, 6332),
    KEBBIT_CLAW(1248, 10113, 1063, 1065, 2487, 2491);

    private final int animationId;
    private final List<Integer> primary;
    private final int[] secondary;

    private TickUtils.TickMethod(int animationId, List<Integer> primary, int ... secondary) {
        this.animationId = animationId;
        this.primary = primary;
        this.secondary = secondary;
    }

    private TickUtils.TickMethod(int animationId, Integer primary, int ... secondary) {
        this.animationId = animationId;
        this.primary = List.of(primary);
        this.secondary = secondary;
    }

    public Item getPrimaryItem() {
        for (Integer item : this.primary) {
            if (!Inventory.contains(item)) continue;
            return Inventory.getFirst(item);
        }
        return null;
    }

    public Item getSecondaryItem() {
        int[] nArray = this.secondary;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            Integer item = nArray[i];
            if (!Inventory.contains(item)) continue;
            return Inventory.getFirst(item);
        }
        return null;
    }

    public int getAnimationId() {
        return this.animationId;
    }

    public List<Integer> getPrimary() {
        return this.primary;
    }

    public int[] getSecondary() {
        return this.secondary;
    }
}
