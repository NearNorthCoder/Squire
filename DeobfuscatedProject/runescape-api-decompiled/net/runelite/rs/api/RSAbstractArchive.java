/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IndexDataBase
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IndexDataBase;
import net.runelite.mapping.Import;

public interface RSAbstractArchive
extends IndexDataBase {
    @Import(value="getGroupFileIds")
    public int[] getFileIds(int var1);

    @Import(value="groupCount")
    public int getGroupCount();

    @Import(value="takeFile")
    public byte[] getConfigData(int var1, int var2);

    @Import(value="fileIds")
    public int[][] getFileIds();

    @Import(value="getGroupFileCount")
    public int getGroupFileCount(int var1);

    @Import(value="fileCounts")
    public int[] getFileCounts();

    @Import(value="getFile")
    public byte[] loadData(int var1, int var2);
}

