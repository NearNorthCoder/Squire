/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

public interface SceneTileModel {
    public int getModelUnderlay();

    public int getModelOverlay();

    public int getShape();

    public int getRotation();

    public int[] getFaceX();

    public int[] getFaceY();

    public int[] getFaceZ();

    public int[] getVertexX();

    public int[] getVertexY();

    public int[] getVertexZ();

    public int[] getTriangleColorA();

    public int[] getTriangleColorB();

    public int[] getTriangleColorC();

    public int[] getTriangleTextureId();

    public boolean isFlat();

    public int getBufferOffset();

    public void setBufferOffset(int var1);

    public int getUvBufferOffset();

    public void setUvBufferOffset(int var1);

    public int getBufferLen();

    public void setBufferLen(int var1);

    public int getUnderlaySwColor();

    public void setUnderlaySwColor(int var1);

    public int getUnderlaySeColor();

    public void setUnderlaySeColor(int var1);

    public int getUnderlayNeColor();

    public void setUnderlayNeColor(int var1);

    public int getUnderlayNwColor();

    public void setUnderlayNwColor(int var1);

    public int getOverlaySwColor();

    public void setOverlaySwColor(int var1);

    public int getOverlaySeColor();

    public void setOverlaySeColor(int var1);

    public int getOverlayNeColor();

    public void setOverlayNeColor(int var1);

    public int getOverlayNwColor();

    public void setOverlayNwColor(int var1);

    public boolean getIsFlat();
}

