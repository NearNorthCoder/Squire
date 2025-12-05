/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 *  net.unethicalite.api.MouseHandler
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.unethicalite.api.MouseHandler;

public interface RSMouseHandler
extends MouseHandler {
    @Import(value="MouseHandler_x")
    public int getCurrentX();

    @Import(value="MouseHandler_y")
    public int getCurrentY();

    @Import(value="MouseHandler_millis")
    public long getCurrentMillis();

    @Import(value="MouseHandler_currentButton")
    public int getCurrentButton();

    @Import(value="MouseHandler_idleCycles")
    public int getIdleCycles();

    @Import(value="MouseHandler_lastButton")
    public int getLastButton();

    @Import(value="MouseHandler_lastButton")
    public void setLastButton(int var1);

    @Import(value="MouseHandler_lastPressedX")
    public int getLastPressedX();

    @Import(value="MouseHandler_lastPressedY")
    public int getLastPressedY();

    @Import(value="MouseHandler_lastPressedTimeMillis")
    public long getLastPressedMillis();

    @Import(value="MouseHandler_xVolatile")
    public void setMouseX(int var1);

    @Import(value="MouseHandler_yVolatile")
    public void setMouseY(int var1);

    @Import(value="MouseHandler_lastMovedVolatile")
    public void setLastMovedMillis(long var1);

    @Import(value="MouseHandler_currentButtonVolatile")
    public void setCurrentButton(int var1);

    @Import(value="MouseHandler_idleCycles")
    public void setIdleCycles(int var1);

    @Import(value="MouseHandler_lastButtonVolatile")
    public void setLastButtonVolatile(int var1);

    @Import(value="MouseHandler_lastPressedXVolatile")
    public void setLastPressedX(int var1);

    @Import(value="MouseHandler_lastPressedYVolatile")
    public void setLastPressedY(int var1);

    @Import(value="MouseHandler_lastPressedTimeMillisVolatile")
    public void setLastPressedMillis(long var1);

    @Import(value="MouseHandler_lastButtonVolatile")
    public int getLastPendingButton();
}

