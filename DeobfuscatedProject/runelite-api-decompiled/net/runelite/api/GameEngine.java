/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Canvas;

public interface GameEngine {
    public Canvas getCanvas();

    public Thread getClientThread();

    public boolean isClientThread();

    public void resizeCanvas();

    public void setReplaceCanvasNextFrame(boolean var1);
}

