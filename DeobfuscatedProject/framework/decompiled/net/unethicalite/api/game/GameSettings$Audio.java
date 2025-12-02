/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 */
package net.unethicalite.api.game;

import java.util.function.Supplier;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;

public static enum GameSettings.Audio {
    MUSIC(() -> Widgets.get(116, 41), 168),
    EFFECTS(() -> Widgets.get(116, 55), 169),
    AREA(() -> Widgets.get(116, 69), 872);

    private final Supplier<Widget> widgetSupplier;
    private final int levelVarp;

    private GameSettings.Audio(Supplier<Widget> widgetSupplier, int levelVarp) {
        this.widgetSupplier = widgetSupplier;
        this.levelVarp = levelVarp;
    }

    public Supplier<Widget> getWidgetSupplier() {
        return this.widgetSupplier;
    }

    public int getLevel() {
        return Vars.getVarp(this.getLevelVarp());
    }

    public void setVolume(int level) {
        if (this.getLevel() != level) {
            Widget widget;
            if (!Tabs.isOpen(Tab.OPTIONS)) {
                Tabs.open(Tab.OPTIONS);
                Time.sleepUntil(() -> Tabs.isOpen(Tab.OPTIONS), 2000);
            }
            if ((widget = this.widgetSupplier.get()) != null && widget.getChild(level) != null) {
                widget.getChild(level).interact(0);
            }
        }
    }

    public static boolean isFullMuted() {
        return MUSIC.getLevel() == 0 && AREA.getLevel() == 0 && EFFECTS.getLevel() == 0;
    }

    public static void muteAll() {
        for (GameSettings.Audio audio : GameSettings.Audio.values()) {
            audio.setVolume(0);
        }
    }

    public int getLevelVarp() {
        return this.levelVarp;
    }
}
