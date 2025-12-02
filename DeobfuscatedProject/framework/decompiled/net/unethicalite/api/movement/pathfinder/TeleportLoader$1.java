/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.movement.pathfinder;

import net.unethicalite.api.movement.pathfinder.model.TeleportItem;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;

static class TeleportLoader.1 {
    static final /* synthetic */ int[] $SwitchMap$net$unethicalite$api$movement$pathfinder$model$TeleportItem;
    static final /* synthetic */ int[] $SwitchMap$net$unethicalite$api$movement$pathfinder$model$poh$JewelryBox;

    static {
        $SwitchMap$net$unethicalite$api$movement$pathfinder$model$poh$JewelryBox = new int[JewelryBox.values().length];
        try {
            TeleportLoader.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$poh$JewelryBox[JewelryBox.ORNATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            TeleportLoader.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$poh$JewelryBox[JewelryBox.FANCY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            TeleportLoader.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$poh$JewelryBox[JewelryBox.BASIC.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$net$unethicalite$api$movement$pathfinder$model$TeleportItem = new int[TeleportItem.values().length];
        try {
            TeleportLoader.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$TeleportItem[TeleportItem.ROYAL_SEED_POD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
