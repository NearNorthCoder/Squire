/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.widgets;

public final class WidgetConfig {
    public static final int SHOW_MENU_OPTION_NINE = 512;
    public static final int USE_GROUND_ITEM = 2048;
    public static final int USE_NPC = 4096;
    public static final int USE_OBJECT = 8192;
    public static final int USE_PLAYER = 16384;
    @Deprecated
    public static final int USE_ITEM = 32768;
    public static final int USE_WIDGET = 65536;
    public static final int DRAG = 131072;
    public static final int DRAG_ON = 0x100000;
    public static final int WIDGET_USE_TARGET = 0x200000;

    public static int transmitAction(int action) {
        return 1 << action + 1;
    }
}

