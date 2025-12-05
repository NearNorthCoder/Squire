/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 *  net.unethicalite.api.KeyHandler
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.unethicalite.api.KeyHandler;

public interface RSKeyHandler
extends KeyHandler {
    @Import(value="KeyHandler_idleCycles")
    public void setKeyboardIdleTicks(int var1);

    @Import(value="KeyHandler_idleCycles")
    public int getKeyboardIdleTicks();

    @Import(value="KeyHandler_pressedKeys")
    public boolean[] getPressedKeys();
}

