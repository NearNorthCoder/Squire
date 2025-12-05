/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.SceneTileModel
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.SceneTileModel;
import net.runelite.mapping.Import;

public interface RSSceneTileModel
extends SceneTileModel {
    @Import(value="underlayRgb")
    public int getModelUnderlay();

    @Import(value="overlayRgb")
    public int getModelOverlay();

    @Import(value="shape")
    public int getShape();

    @Import(value="rotation")
    public int getRotation();

    @Import(value="faceX")
    public int[] getFaceX();

    @Import(value="faceY")
    public int[] getFaceY();

    @Import(value="faceZ")
    public int[] getFaceZ();

    @Import(value="vertexX")
    public int[] getVertexX();

    @Import(value="vertexY")
    public int[] getVertexY();

    @Import(value="vertexZ")
    public int[] getVertexZ();

    @Import(value="triangleColorA")
    public int[] getTriangleColorA();

    @Import(value="triangleColorB")
    public int[] getTriangleColorB();

    @Import(value="triangleColorC")
    public int[] getTriangleColorC();

    @Import(value="triangleTextureId")
    public int[] getTriangleTextureId();

    @Import(value="isFlat")
    public boolean isFlat();
}

