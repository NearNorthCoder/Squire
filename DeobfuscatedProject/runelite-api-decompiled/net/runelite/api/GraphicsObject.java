/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.Animation;
import net.runelite.api.Renderable;
import net.runelite.api.coords.LocalPoint;

public interface GraphicsObject
extends Renderable {
    public int getId();

    public LocalPoint getLocation();

    public int getStartCycle();

    public int getLevel();

    public int getZ();

    public boolean finished();

    public void setFinished(boolean var1);

    @Nullable
    public Animation getAnimation();

    default public int getFrame() {
        return this.getAnimationFrame();
    }

    public int getAnimationFrame();
}

