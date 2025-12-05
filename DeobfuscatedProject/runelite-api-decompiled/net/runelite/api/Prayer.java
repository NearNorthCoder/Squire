/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.widgets.WidgetInfo;

public enum Prayer {
    THICK_SKIN(4104, WidgetInfo.PRAYER_THICK_SKIN),
    BURST_OF_STRENGTH(4105, WidgetInfo.PRAYER_BURST_OF_STRENGTH),
    CLARITY_OF_THOUGHT(4106, WidgetInfo.PRAYER_CLARITY_OF_THOUGHT),
    SHARP_EYE(4122, WidgetInfo.PRAYER_SHARP_EYE),
    MYSTIC_WILL(4123, WidgetInfo.PRAYER_MYSTIC_WILL),
    ROCK_SKIN(4107, WidgetInfo.PRAYER_ROCK_SKIN),
    SUPERHUMAN_STRENGTH(4108, WidgetInfo.PRAYER_SUPERHUMAN_STRENGTH),
    IMPROVED_REFLEXES(4109, WidgetInfo.PRAYER_IMPROVED_REFLEXES),
    RAPID_RESTORE(4110, WidgetInfo.PRAYER_RAPID_RESTORE),
    RAPID_HEAL(4111, WidgetInfo.PRAYER_RAPID_HEAL),
    PROTECT_ITEM(4112, WidgetInfo.PRAYER_PROTECT_ITEM),
    HAWK_EYE(4124, WidgetInfo.PRAYER_HAWK_EYE),
    MYSTIC_LORE(4125, WidgetInfo.PRAYER_MYSTIC_LORE),
    STEEL_SKIN(4113, WidgetInfo.PRAYER_STEEL_SKIN),
    ULTIMATE_STRENGTH(4114, WidgetInfo.PRAYER_ULTIMATE_STRENGTH),
    INCREDIBLE_REFLEXES(4115, WidgetInfo.PRAYER_INCREDIBLE_REFLEXES),
    PROTECT_FROM_MAGIC(4116, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC),
    PROTECT_FROM_MISSILES(4117, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES),
    PROTECT_FROM_MELEE(4118, WidgetInfo.PRAYER_PROTECT_FROM_MELEE),
    EAGLE_EYE(4126, WidgetInfo.PRAYER_EAGLE_EYE),
    MYSTIC_MIGHT(4127, WidgetInfo.PRAYER_MYSTIC_MIGHT),
    RETRIBUTION(4119, WidgetInfo.PRAYER_RETRIBUTION),
    REDEMPTION(4120, WidgetInfo.PRAYER_REDEMPTION),
    SMITE(4121, WidgetInfo.PRAYER_SMITE),
    CHIVALRY(4128, WidgetInfo.PRAYER_CHIVALRY),
    PIETY(4129, WidgetInfo.PRAYER_PIETY),
    PRESERVE(5466, WidgetInfo.PRAYER_PRESERVE),
    RIGOUR(5464, WidgetInfo.PRAYER_RIGOUR),
    AUGURY(5465, WidgetInfo.PRAYER_AUGURY),
    RP_REJUVENATION(14840, null),
    RP_ANCIENT_STRENGTH(14829, null),
    RP_ANCIENT_SIGHT(14830, null),
    RP_ANCIENT_WILL(14831, null),
    RP_PROTECT_ITEM(14966, null),
    RP_RUINOUS_GRACE(14841, null),
    RP_DAMPEN_MAGIC(14964, null),
    RP_DAMPEN_RANGED(14963, null),
    RP_DAMPEN_MELEE(14962, null),
    RP_TRINITAS(14832, null),
    RP_BERSERKER(14844, null),
    RP_PURGE(14839, null),
    RP_METABOLISE(14843, null),
    RP_REBUKE(14850, null),
    RP_VINDICATION(14851, null),
    RP_DECIMATE(14833, null),
    RP_ANNIHILATE(14834, null),
    RP_VAPORISE(14835, null),
    RP_FUMUS_VOW(14845, null),
    RP_UMBRA_VOW(14847, null),
    RP_CRUORS_VOW(14846, null),
    RP_GLACIES_VOW(14848, null),
    RP_WRATH(14842, null),
    RP_INTENSIFY(14965, null);

    private final int varbit;
    private final WidgetInfo widgetInfo;

    private Prayer(int varbit, WidgetInfo widgetInfo) {
        this.varbit = varbit;
        this.widgetInfo = widgetInfo;
    }

    public int getVarbit() {
        return this.varbit;
    }

    public WidgetInfo getWidgetInfo() {
        return this.widgetInfo;
    }
}

