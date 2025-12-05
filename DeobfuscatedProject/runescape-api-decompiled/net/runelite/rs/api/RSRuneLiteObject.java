/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.RuneLiteObject
 */
package net.runelite.rs.api;

import net.runelite.api.RuneLiteObject;
import net.runelite.rs.api.RSGraphicsObject;
import net.runelite.rs.api.RSModel;

public interface RSRuneLiteObject
extends RuneLiteObject,
RSGraphicsObject {
    public boolean isLooping();

    public void advanceRL(int var1);

    public RSModel getModelRl();
}

