/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

public interface MouseRecorder {
    public int[] getXs();

    public int[] getYs();

    public long[] getMillis();

    public int getIndex();

    public void setXs(int[] var1);

    public void setYs(int[] var1);

    public void setMillis(long[] var1);

    public void setIndex(int var1);
}

