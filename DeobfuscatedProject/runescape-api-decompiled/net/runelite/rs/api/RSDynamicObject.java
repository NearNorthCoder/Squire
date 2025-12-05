/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.DynamicObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.DynamicObject;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAnimationContainer;
import net.runelite.rs.api.RSRenderable;

public interface RSDynamicObject
extends RSRenderable,
DynamicObject {
    @Import(value="id")
    public int getId();

    @Import(value="cycleStart")
    public int getAnimCycle();

    @Import(value="sequence")
    public RSAnimationContainer getRSAnimation();
}

