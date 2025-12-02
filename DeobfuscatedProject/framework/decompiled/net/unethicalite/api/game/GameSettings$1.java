/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.game;

import net.unethicalite.api.game.GameSettings;

static class GameSettings.1 {
    static final /* synthetic */ int[] $SwitchMap$net$unethicalite$api$game$GameSettings$Display;

    static {
        $SwitchMap$net$unethicalite$api$game$GameSettings$Display = new int[GameSettings.Display.values().length];
        try {
            GameSettings.1.$SwitchMap$net$unethicalite$api$game$GameSettings$Display[GameSettings.Display.FIXED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GameSettings.1.$SwitchMap$net$unethicalite$api$game$GameSettings$Display[GameSettings.Display.RESIZABLE_MODERN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GameSettings.1.$SwitchMap$net$unethicalite$api$game$GameSettings$Display[GameSettings.Display.RESIZABLE_CLASSIC.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
