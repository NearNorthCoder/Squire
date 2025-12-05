/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.mapping.Construct
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Actor;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSActorSpotAnim;
import net.runelite.rs.api.RSAnimationContainer;
import net.runelite.rs.api.RSIterableNodeDeque;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSWorldView;

public interface RSActor
extends RSRenderable,
Actor {
    @Import(value="targetIndex")
    public int getRSInteracting();

    @Import(value="index")
    public int getIndex();

    @Import(value="movementSequence")
    public RSAnimationContainer getPoseAnimationContainer();

    default public int getPoseFrame() {
        return this.getPoseAnimationContainer().getFrame();
    }

    default public void setPoseFrame(int frame) {
        this.getPoseAnimationContainer().setFrame(frame);
    }

    default public int getPoseFrameCycle() {
        return this.getPoseAnimationContainer().getCycle();
    }

    @Import(value="orientation")
    public int getOrientation();

    @Import(value="rotation")
    public int getCurrentOrientation();

    @Import(value="sequence")
    public RSAnimationContainer getRSAnimation();

    default public void setAnimation(int animation) {
        this.getRSAnimation().setAnimation(animation);
    }

    default public int getAnimationFrame() {
        return this.getRSAnimation().getFrame();
    }

    default public void setAnimationFrame(int frame) {
        this.getRSAnimation().setFrame(frame);
    }

    @Import(value="spotAnims")
    public RSIterableNodeHashTable getSpotAnims();

    public void createSpotAnim(int var1, int var2, int var3, int var4);

    @Import(value="clearSpotAnimations")
    public void clearSpotAnims();

    @Import(value="graphicsCount")
    public void setGraphicsCount(int var1);

    @Import(value="defaultHeight")
    public int getLogicalHeight();

    @Import(value="overheadText")
    public String getOverheadText();

    @Import(value="overheadText")
    public void setOverheadText(String var1);

    default public int getActionFrame() {
        return this.getRSAnimation().getFrame();
    }

    default public void setActionFrame(int frame) {
        this.getRSAnimation().setFrame(frame);
    }

    default public int getActionFrameCycle() {
        return this.getRSAnimation().getCycle();
    }

    @Import(value="overheadTextCyclesRemaining")
    public int getOverheadCycle();

    @Import(value="overheadTextCyclesRemaining")
    public void setOverheadCycle(int var1);

    public void setDead(boolean var1);

    default public int getPoseAnimation() {
        return this.getPoseAnimationContainer().getAnimation();
    }

    default public void setPoseAnimation(int animation) {
        this.getPoseAnimationContainer().setAnimation(animation);
    }

    @Import(value="idleSequence")
    public int getIdlePoseAnimation();

    @Import(value="idleSequence")
    public void setIdlePoseAnimation(int var1);

    @Import(value="turnLeftSequence")
    public int getIdleRotateLeft();

    @Import(value="turnLeftSequence")
    public void setIdleRotateLeft(int var1);

    @Import(value="turnRightSequence")
    public int getIdleRotateRight();

    @Import(value="turnRightSequence")
    public void setIdleRotateRight(int var1);

    @Import(value="walkSequence")
    public int getWalkAnimation();

    @Import(value="walkSequence")
    public void setWalkAnimation(int var1);

    @Import(value="walkLeftSequence")
    public int getWalkRotateLeft();

    @Import(value="walkLeftSequence")
    public void setWalkRotateLeft(int var1);

    @Import(value="walkRightSequence")
    public int getWalkRotateRight();

    @Import(value="walkRightSequence")
    public void setWalkRotateRight(int var1);

    @Import(value="walkBackSequence")
    public int getWalkRotate180();

    @Import(value="walkBackSequence")
    public void setWalkRotate180(int var1);

    @Import(value="runSequence")
    public int getRunAnimation();

    @Import(value="runSequence")
    public void setRunAnimation(int var1);

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="pathX")
    public int[] getPathX();

    @Import(value="pathY")
    public int[] getPathY();

    @Import(value="graphicsCount")
    public int getGraphicsCount();

    @Construct
    public RSActorSpotAnim newActorSpotAnim(int var1, int var2, int var3);

    @Import(value="healthBars")
    public RSIterableNodeDeque getHealthBars();

    @Import(value="hitSplatValues")
    public int[] getHitsplatValues();

    @Import(value="hitSplatTypes")
    public int[] getHitsplatTypes();

    @Import(value="hitSplatCycles")
    public int[] getHitsplatCycles();

    @Import(value="pathLength")
    public int getPathLength();

    public void setWorldView(RSWorldView var1);
}

