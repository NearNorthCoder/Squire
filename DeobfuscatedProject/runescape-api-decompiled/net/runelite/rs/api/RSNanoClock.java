/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSNanoClock {
    @Import(value="lastTimeNano")
    public long getLastTimeNano();

    @Import(value="lastTimeNano")
    public void setLastTimeNano(long var1);
}

