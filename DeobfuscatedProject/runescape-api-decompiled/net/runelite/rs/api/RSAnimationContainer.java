/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSSequenceDefinition;

public interface RSAnimationContainer {
    @Import(value="sequence")
    public int getAnimation();

    @Import(value="sequence")
    public void setAnimation(int var1);

    @Import(value="frame")
    public int getFrame();

    @Import(value="frame")
    public void setFrame(int var1);

    @Import(value="sequenceDefinition")
    public RSSequenceDefinition getSequenceDefinition();

    @Import(value="cycle")
    public int getCycle();

    @Import(value="cycle")
    public void setCycle(int var1);

    public RSActor getActor();

    public void setActor(RSActor var1);
}

