/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.List;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;

public interface Mesh<T extends Mesh<T>> {
    public List<Vertex> getVertices();

    public List<Triangle> getTriangles();

    public int getVerticesCount();

    public int[] getVerticesX();

    public int[] getVerticesY();

    public int[] getVerticesZ();

    public int getFaceCount();

    public int[] getFaceIndices1();

    public int[] getFaceIndices2();

    public int[] getFaceIndices3();

    public byte[] getFaceTransparencies();

    public short[] getFaceTextures();

    public T rotateY90Ccw();

    public T rotateY180Ccw();

    public T rotateY270Ccw();

    public T translate(int var1, int var2, int var3);

    public T scale(int var1, int var2, int var3);
}

