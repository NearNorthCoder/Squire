/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nonnull;
import net.runelite.api.AABB;
import net.runelite.api.Mesh;
import net.runelite.api.Renderable;

public interface Model
extends Mesh<Model>,
Renderable {
    public int[] getFaceColors1();

    public int[] getFaceColors2();

    public int[] getFaceColors3();

    public int getSceneId();

    public void setSceneId(int var1);

    public int getBufferOffset();

    public void setBufferOffset(int var1);

    public int getUvBufferOffset();

    public void setUvBufferOffset(int var1);

    public int getBottomY();

    public void calculateBoundsCylinder();

    public byte[] getFaceRenderPriorities();

    public int getRadius();

    public int getDiameter();

    @Deprecated
    public void calculateExtreme(int var1);

    @Nonnull
    public AABB getAABB(int var1);

    public int getXYZMag();

    public boolean isClickable();

    public void drawFace(int var1);

    public int[] getVertexNormalsX();

    public int[] getVertexNormalsY();

    public int[] getVertexNormalsZ();

    public byte getOverrideAmount();

    public byte getOverrideHue();

    public byte getOverrideSaturation();

    public byte getOverrideLuminance();

    public byte[] getTextureFaces();

    public int[] getTexIndices1();

    public int[] getTexIndices2();

    public int[] getTexIndices3();

    public Model getUnskewedModel();

    public boolean useBoundingBox();

    public void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);
}

