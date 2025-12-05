/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameEngine
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.awt.Canvas;
import net.runelite.api.GameEngine;
import net.runelite.mapping.Import;

public interface RSGameEngine
extends GameEngine {
    @Import(value="canvas")
    public Canvas getCanvas();

    @Import(value="post")
    public void post(Object var1);

    @Import(value="resizeCanvas")
    public void resizeCanvas();

    @Import(value="resizeCanvasNextFrame")
    public boolean isResizeCanvasNextFrame();

    @Import(value="resizeCanvasNextFrame")
    public void setResizeCanvasNextFrame(boolean var1);

    @Import(value="isCanvasInvalid")
    public boolean isReplaceCanvasNextFrame();

    @Import(value="isCanvasInvalid")
    public void setReplaceCanvasNextFrame(boolean var1);

    @Import(value="maxCanvasWidth")
    public void setMaxCanvasWidth(int var1);

    @Import(value="maxCanvasHeight")
    public void setMaxCanvasHeight(int var1);

    @Import(value="fullRedraw")
    public void setFullRedraw(boolean var1);
}

