/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.io.RandomAccessFile;
import net.runelite.mapping.Import;

public interface RSAccessFile {
    @Import(value="file")
    public RandomAccessFile getFile();

    @Import(value="offset")
    public long getPosition();

    @Import(value="maxSize")
    public long getLength();
}

