/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.Renderable;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.unethicalite.api.Identifiable;

public interface Projectile
extends Renderable,
Identifiable {
    @Override
    public int getId();

    public Actor getInteracting();

    public LocalPoint getTarget();

    public int getX1();

    public int getY1();

    public int getFloor();

    public int getStartHeight();

    public int getEndHeight();

    public int getStartCycle();

    public int getEndCycle();

    public void setEndCycle(int var1);

    public int getRemainingCycles();

    public int getSlope();

    public double getX();

    public double getY();

    public double getZ();

    public double getScalar();

    public double getVelocityX();

    public double getVelocityY();

    public double getVelocityZ();

    @Nullable
    public Animation getAnimation();

    public int getAnimationFrame();

    public WorldView getWorldView();
}

