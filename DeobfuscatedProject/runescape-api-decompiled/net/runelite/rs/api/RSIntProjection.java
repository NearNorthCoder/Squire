/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IntProjection
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IntProjection;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSProjection;

public interface RSIntProjection
extends RSProjection,
IntProjection {
    @Import(value="cameraX")
    public int getCameraX();

    @Import(value="cameraY")
    public int getCameraY();

    @Import(value="cameraZ")
    public int getCameraZ();

    @Import(value="pitchSin")
    public float getPitchSin();

    @Import(value="pitchCos")
    public float getPitchCos();

    @Import(value="yawSin")
    public float getYawSin();

    @Import(value="yawCos")
    public float getYawCos();

    @Import(value="cameraX")
    public void setCameraX(int var1);

    @Import(value="cameraY")
    public void setCameraY(int var1);

    @Import(value="cameraZ")
    public void setCameraZ(int var1);

    @Import(value="pitchSin")
    public void setPitchSin(float var1);

    @Import(value="pitchCos")
    public void setPitchCos(float var1);

    @Import(value="yawSin")
    public void setYawSin(float var1);

    @Import(value="yawCos")
    public void setYawCos(float var1);
}

