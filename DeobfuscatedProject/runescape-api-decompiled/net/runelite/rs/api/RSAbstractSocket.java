/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSAbstractSocket {
    @Import(value="isAvailable")
    public boolean isAvailable(int var1);

    @Import(value="read")
    public int read(byte[] var1, int var2, int var3);

    @Import(value="write")
    public void write(byte[] var1, int var2, int var3);

    @Import(value="close")
    public void close();
}

