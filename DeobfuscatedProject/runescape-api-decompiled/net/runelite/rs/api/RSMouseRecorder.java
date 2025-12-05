/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MouseRecorder
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.MouseRecorder;
import net.runelite.mapping.Import;

public interface RSMouseRecorder
extends MouseRecorder {
    @Import(value="xs")
    public int[] getXs();

    @Import(value="ys")
    public int[] getYs();

    @Import(value="millis")
    public long[] getMillis();

    @Import(value="xs")
    public void setXs(int[] var1);

    @Import(value="ys")
    public void setYs(int[] var1);

    @Import(value="millis")
    public void setMillis(long[] var1);

    @Import(value="index")
    public void setIndex(int var1);

    @Import(value="index")
    public int getIndex();
}

