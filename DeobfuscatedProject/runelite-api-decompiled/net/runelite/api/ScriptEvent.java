/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.widgets.Widget;

public interface ScriptEvent {
    public static final int MOUSE_X = -2147483647;
    public static final int MOUSE_Y = -2147483646;
    public static final int MENU_OP = -2147483644;
    public static final int WIDGET_ID = -2147483645;
    public static final int WIDGET_INDEX = -2147483643;
    public static final int WIDGET_TARGET_ID = -2147483642;
    public static final int WIDGET_TARGET_INDEX = -2147483641;
    public static final int KEY_CODE = -2147483640;
    public static final int KEY_CHAR = -2147483639;
    public static final String NAME = "event_opbase";

    public Widget getSource();

    public ScriptEvent setSource(Widget var1);

    @Nullable
    public Widget getTarget();

    public ScriptEvent setTarget(Widget var1);

    public Object[] getArguments();

    public int getOp();

    public ScriptEvent setOp(int var1);

    public String getOpbase();

    public int getMouseX();

    public int getMouseY();

    public int getTypedKeyCode();

    public int getTypedKeyChar();

    public void run();

    public ScriptEvent setDragTarget(Widget var1);

    public void setMouseX(int var1);

    public void setMouseY(int var1);
}

