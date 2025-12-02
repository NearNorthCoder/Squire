/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.Direction
 */
package net.unethicalite.api.movement;

import net.runelite.api.coords.Direction;

static class Reachable.1 {
    static final /* synthetic */ int[] $SwitchMap$net$runelite$api$coords$Direction;

    static {
        $SwitchMap$net$runelite$api$coords$Direction = new int[Direction.values().length];
        try {
            Reachable.1.$SwitchMap$net$runelite$api$coords$Direction[Direction.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Reachable.1.$SwitchMap$net$runelite$api$coords$Direction[Direction.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Reachable.1.$SwitchMap$net$runelite$api$coords$Direction[Direction.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Reachable.1.$SwitchMap$net$runelite$api$coords$Direction[Direction.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
