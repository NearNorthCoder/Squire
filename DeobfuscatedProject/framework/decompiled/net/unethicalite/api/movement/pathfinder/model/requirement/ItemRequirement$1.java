/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.movement.pathfinder.model.requirement;

import net.unethicalite.api.movement.pathfinder.model.requirement.Reduction;

static class ItemRequirement.1 {
    static final /* synthetic */ int[] $SwitchMap$net$unethicalite$api$movement$pathfinder$model$requirement$Reduction;

    static {
        $SwitchMap$net$unethicalite$api$movement$pathfinder$model$requirement$Reduction = new int[Reduction.values().length];
        try {
            ItemRequirement.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$requirement$Reduction[Reduction.AND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ItemRequirement.1.$SwitchMap$net$unethicalite$api$movement$pathfinder$model$requirement$Reduction[Reduction.OR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
