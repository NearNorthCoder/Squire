/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ModelData
 *  net.runelite.mapping.Construct
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ModelData;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSVertexNormal;

public interface RSModelData
extends RSRenderable,
ModelData {
    @Import(value="faceCount")
    public int getFaceCount();

    @Import(value="indices1")
    public int[] getFaceIndices1();

    @Import(value="indices2")
    public int[] getFaceIndices2();

    @Import(value="indices3")
    public int[] getFaceIndices3();

    @Import(value="verticesX")
    public int[] getVerticesX();

    @Import(value="verticesX")
    public void setVerticesX(int[] var1);

    @Import(value="verticesY")
    public int[] getVerticesY();

    @Import(value="verticesY")
    public void setVerticesY(int[] var1);

    @Import(value="verticesZ")
    public int[] getVerticesZ();

    @Import(value="verticesZ")
    public void setVerticesZ(int[] var1);

    @Import(value="texTriangleX")
    public short[] getTexTriangleX();

    @Import(value="texTriangleY")
    public short[] getTexTriangleY();

    @Import(value="texTriangleZ")
    public short[] getTexTriangleZ();

    @Import(value="faceTextures")
    public short[] getFaceTextures();

    @Import(value="faceTextures")
    public void setFaceTextures(short[] var1);

    @Import(value="faceAlphas")
    public byte[] getFaceTransparencies();

    @Import(value="faceAlphas")
    public void setFaceTransparencies(byte[] var1);

    @Import(value="faceColors")
    public short[] getFaceColors();

    @Import(value="faceColors")
    public void setFaceColors(short[] var1);

    @Import(value="textureCoords")
    public byte[] getTextureCoords();

    @Import(value="verticesCount")
    public int getVerticesCount();

    @Import(value="vertexNormals")
    public RSVertexNormal[] getVertexNormals();

    @Import(value="vertexVertices")
    public RSVertexNormal[] getVertexVertices();

    @Import(value="recolor")
    public void rs$recolor(short var1, short var2);

    @Import(value="retexture")
    public void rs$retexture(short var1, short var2);

    @Import(value="toModel")
    public RSModel toModel(int var1, int var2, int var3, int var4, int var5);

    @Import(value="ambient")
    public short getAmbient();

    @Import(value="contrast")
    public short getContrast();

    @Import(value="invalidate")
    public void invalidate();

    @Import(value="copyModelData")
    public RSModelData shallowCopy();

    @Construct
    public RSModelData newModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5);
}

