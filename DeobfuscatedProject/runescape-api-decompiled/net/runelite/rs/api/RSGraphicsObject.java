/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Animation
 *  net.runelite.api.GraphicsObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Animation;
import net.runelite.api.GraphicsObject;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAnimationContainer;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSSequenceDefinition;

public interface RSGraphicsObject
extends GraphicsObject,
RSRenderable {
    @Import(value="id")
    public int getId();

    @Import(value="id")
    public void setId(int var1);

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="cycleStart")
    public int getStartCycle();

    @Import(value="plane")
    public int getLevel();

    @Import(value="z")
    public int getZ();

    @Import(value="isFinished")
    public boolean finished();

    default public int getFrame() {
        return this.getAnimationContainer().getFrame();
    }

    default public void setFrame(int frame) {
        this.getAnimationContainer().setFrame(frame);
    }

    default public int getFrameCycle() {
        return this.getAnimationContainer().getCycle();
    }

    default public void setFrameCycle(int frameCycle) {
        this.getAnimationContainer().setCycle(frameCycle);
    }

    @Import(value="plane")
    public void setLevel(int var1);

    @Import(value="x")
    public void setX(int var1);

    @Import(value="y")
    public void setY(int var1);

    @Import(value="z")
    public void setZ(int var1);

    default public RSSequenceDefinition getSequenceDefinition() {
        return this.getAnimationContainer().getSequenceDefinition();
    }

    @Import(value="animation")
    public RSAnimationContainer getAnimationContainer();

    default public Animation getAnimation() {
        return this.getAnimationContainer().getSequenceDefinition();
    }

    @Import(value="frameCycle")
    default public int getAnimationFrame() {
        return this.getAnimationContainer().getCycle();
    }
}

