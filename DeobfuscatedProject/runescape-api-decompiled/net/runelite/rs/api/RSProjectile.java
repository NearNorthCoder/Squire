/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Projectile
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Projectile;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAnimationContainer;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSWorldView;

public interface RSProjectile
extends RSRenderable,
Projectile {
    @Import(value="id")
    public int getId();

    @Import(value="targetIndex")
    public int getRsInteracting();

    @Import(value="startHeight")
    public int getStartHeight();

    @Import(value="targetZ")
    public int getEndHeight();

    @Import(value="sourceX")
    public int getX1();

    @Import(value="sourceY")
    public int getY1();

    @Import(value="plane")
    public int getFloor();

    @Import(value="cycleStart")
    public int getStartCycle();

    @Import(value="cycleEnd")
    public int getEndCycle();

    @Import(value="cycleEnd")
    public void setEndCycle(int var1);

    @Import(value="slope")
    public int getSlope();

    @Import(value="x")
    public double getX();

    @Import(value="y")
    public double getY();

    @Import(value="z")
    public double getZ();

    @Import(value="speedZ")
    public double getVelocityZ();

    @Import(value="animation")
    public RSAnimationContainer getAnimationContainer();

    public void setWorldView(RSWorldView var1);

    @Import(value="targetX")
    public int getTargetX();

    @Import(value="targetY")
    public int getTargetY();

    @Import(value="targetZ")
    public int getTargetZ();
}

