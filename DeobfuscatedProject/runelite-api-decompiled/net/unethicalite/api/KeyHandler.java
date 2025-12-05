/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api;

import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

public interface KeyHandler
extends KeyListener,
FocusListener {
    public void setKeyboardIdleTicks(int var1);

    public int getKeyboardIdleTicks();

    public boolean[] getPressedKeys();
}

