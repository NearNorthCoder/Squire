/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSHealthBarUpdate {
    @Import(value="health")
    public int getHealthRatio();

    @Import(value="health2")
    public int getHealth();
}

