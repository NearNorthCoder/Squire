/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ScriptEvent
 *  net.runelite.api.widgets.Widget
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ScriptEvent;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Import;

public interface RSScriptEvent
extends ScriptEvent {
    @Import(value="args")
    public Object[] getArguments();

    @Import(value="args")
    public void setArguments(Object[] var1);

    @Import(value="widget")
    public Widget getSource();

    @Import(value="widget")
    public RSScriptEvent setSource(Widget var1);

    @Import(value="opIndex")
    public int getOp();

    @Import(value="opIndex")
    public RSScriptEvent setOp(int var1);

    @Import(value="targetName")
    public String getOpbase();

    @Import(value="mouseX")
    public int getMouseX();

    @Import(value="mouseY")
    public int getMouseY();

    @Import(value="keyTyped")
    public int getTypedKeyCode();

    @Import(value="keyPressed")
    public int getTypedKeyChar();

    @Import(value="dragTarget")
    public RSScriptEvent setDragTarget(Widget var1);

    @Import(value="mouseX")
    public void setMouseX(int var1);

    @Import(value="mouseY")
    public void setMouseY(int var1);
}

