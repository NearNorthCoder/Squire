/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

public interface IndexDataBase {
    public boolean isOverlayOutdated();

    public int[] getFileIds(int var1);

    public int getGroupCount();

    public byte[] getConfigData(int var1, int var2);

    public int[][] getFileIds();

    public int getGroupFileCount(int var1);

    public int[] getFileCounts();

    public byte[] loadData(int var1, int var2);
}

