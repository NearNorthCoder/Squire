/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.AABB
 *  net.runelite.api.Model
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.awt.Shape;
import net.runelite.api.AABB;
import net.runelite.api.Model;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModelOverrides;
import net.runelite.rs.api.RSRenderable;

public interface RSModel
extends RSRenderable,
Model {
    @Import(value="verticesCount")
    public int getVerticesCount();

    @Import(value="verticesX")
    public int[] getVerticesX();

    @Import(value="verticesY")
    public int[] getVerticesY();

    @Import(value="verticesZ")
    public int[] getVerticesZ();

    @Import(value="indicesCount")
    public int getFaceCount();

    @Import(value="indices1")
    public int[] getFaceIndices1();

    @Import(value="indices2")
    public int[] getFaceIndices2();

    @Import(value="indices3")
    public int[] getFaceIndices3();

    @Import(value="faceColors1")
    public int[] getFaceColors1();

    @Import(value="faceColors2")
    public int[] getFaceColors2();

    @Import(value="faceColors3")
    public int[] getFaceColors3();

    @Import(value="faceAlphas")
    public byte[] getFaceTransparencies();

    @Import(value="faceRenderPriorities")
    public byte[] getFaceRenderPriorities();

    @Import(value="vertexLabels")
    public int[][] getVertexGroups();

    @Override
    @Import(value="height")
    public int getModelHeight();

    @Import(value="transform")
    public void animate(int var1, int[] var2, int var3, int var4, int var5);

    @Import(value="calculateBoundsCylinder")
    public void calculateBoundsCylinder();

    @Import(value="calculateBoundingBox")
    public void calculateExtreme(int var1);

    @Import(value="resetBounds")
    public void resetBounds();

    @Import(value="toSharedSequenceModel")
    public RSModel toSharedModel(boolean var1);

    @Import(value="toSharedSpotAnimationModel")
    public RSModel toSharedSpotAnimModel(boolean var1);

    @Import(value="rotateY90Ccw")
    public void rs$rotateY90Ccw();

    @Import(value="rotateY180")
    public void rs$rotateY180Ccw();

    @Import(value="rotateY270Ccw")
    public void rs$rotateY270Ccw();

    @Import(value="scale")
    public void rs$scale(int var1, int var2, int var3);

    @Import(value="offsetBy")
    public void rs$translate(int var1, int var2, int var3);

    @Import(value="radius")
    public int getRadius();

    @Import(value="diameter")
    public int getDiameter();

    @Import(value="getAABBNode")
    public AABB getAABBNode(int var1);

    @Import(value="faceTextures")
    public short[] getFaceTextures();

    @Import(value="xzRadius")
    public int getXYZMag();

    @Import(value="isClickable")
    public boolean isClickable();

    @Import(value="bottomY")
    public int getBottomY();

    @Import(value="drawFace")
    public void drawFace(int var1);

    public void interpolateFrames(RSFrames var1, int var2, RSFrames var3, int var4, int var5, int var6);

    public Shape getConvexHull(int var1, int var2, int var3, int var4);

    public int[] getVertexNormalsX();

    public void setVertexNormalsX(int[] var1);

    public int[] getVertexNormalsY();

    public void setVertexNormalsY(int[] var1);

    public int[] getVertexNormalsZ();

    public void setVertexNormalsZ(int[] var1);

    public RSModel getUnskewedModel();

    public void setUnskewedModel(RSModel var1);

    @Import(value="modelOverrides")
    public RSModelOverrides getModelOverrides();

    default public byte getOverrideAmount() {
        RSModelOverrides modelOverrides = this.getModelOverrides();
        if (modelOverrides == null) {
            return 0;
        }
        return modelOverrides.getOverrideAmount();
    }

    default public byte getOverrideHue() {
        RSModelOverrides modelOverrides = this.getModelOverrides();
        if (modelOverrides == null) {
            return 0;
        }
        return this.getModelOverrides().getOverrideHue();
    }

    default public byte getOverrideSaturation() {
        RSModelOverrides modelOverrides = this.getModelOverrides();
        if (modelOverrides == null) {
            return 0;
        }
        return this.getModelOverrides().getOverrideSaturation();
    }

    default public byte getOverrideLuminance() {
        RSModelOverrides modelOverrides = this.getModelOverrides();
        if (modelOverrides == null) {
            return 0;
        }
        return this.getModelOverrides().getOverrideLuminance();
    }

    @Import(value="textureFaces")
    public byte[] getTextureFaces();

    @Import(value="texIndices1")
    public int[] getTexIndices1();

    @Import(value="texIndices2")
    public int[] getTexIndices2();

    @Import(value="texIndices3")
    public int[] getTexIndices3();

    @Import(value="drawFrustum")
    public void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @Import(value="isClickable")
    public boolean useBoundingBox();
}

