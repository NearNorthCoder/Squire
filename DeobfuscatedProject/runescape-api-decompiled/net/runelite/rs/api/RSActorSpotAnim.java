/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ActorSpotAnim
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ActorSpotAnim;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAnimationContainer;

public interface RSActorSpotAnim
extends ActorSpotAnim {
    @Import(value="id")
    public int getId();

    @Import(value="id")
    public void setId(int var1);

    @Import(value="height")
    public int getHeight();

    @Import(value="height")
    public void setHeight(int var1);

    @Import(value="animation")
    public RSAnimationContainer getAnimation();

    default public int getFrame() {
        return this.getAnimation().getFrame();
    }

    default public void setFrame(int frame) {
        this.getAnimation().setFrame(frame);
    }

    default public int getCycle() {
        return this.getAnimation().getCycle();
    }

    default public void setCycle(int cycle) {
        this.getAnimation().setCycle(cycle);
    }
}

