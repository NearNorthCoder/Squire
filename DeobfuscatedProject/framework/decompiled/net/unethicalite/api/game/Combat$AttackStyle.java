/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.game;

import java.util.Arrays;
import net.runelite.api.widgets.WidgetInfo;

public static enum Combat.AttackStyle {
    FIRST(0, WidgetInfo.COMBAT_STYLE_ONE),
    SECOND(1, WidgetInfo.COMBAT_STYLE_TWO),
    THIRD(2, WidgetInfo.COMBAT_STYLE_THREE),
    FOURTH(3, WidgetInfo.COMBAT_STYLE_FOUR),
    SPELLS(4, WidgetInfo.COMBAT_SPELL_BOX),
    SPELLS_DEFENSIVE(4, WidgetInfo.COMBAT_DEFENSIVE_SPELL_BOX),
    UNKNOWN(-1, null);

    private final int index;
    private final WidgetInfo widgetInfo;

    private Combat.AttackStyle(int index, WidgetInfo widgetInfo) {
        this.index = index;
        this.widgetInfo = widgetInfo;
    }

    public static Combat.AttackStyle fromIndex(int index) {
        return Arrays.stream(Combat.AttackStyle.values()).filter(x -> x.index == index).findFirst().orElse(UNKNOWN);
    }

    public int getIndex() {
        return this.index;
    }

    public WidgetInfo getWidgetInfo() {
        return this.widgetInfo;
    }
}
