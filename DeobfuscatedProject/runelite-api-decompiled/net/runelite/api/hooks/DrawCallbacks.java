/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.hooks;

import net.runelite.api.Projection;
import net.runelite.api.Renderable;
import net.runelite.api.Scene;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Texture;

public interface DrawCallbacks {
    public static final int GPU = 1;
    public static final int HILLSKEW = 2;
    public static final int NORMALS = 4;

    public void draw(Projection var1, Scene var2, Renderable var3, int var4, int var5, int var6, int var7, long var8);

    public void drawScenePaint(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

    public void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4);

    public void draw(int var1);

    public void drawScene(double var1, double var3, double var5, double var7, double var9, int var11);

    public void postDrawScene();

    public void animate(Texture var1, int var2);

    public void loadScene(Scene var1);

    public void swapScene(Scene var1);

    default public boolean tileInFrustum(Scene scene, int pitchSin, int pitchCos, int yawSin, int yawCos, int cameraX, int cameraY, int cameraZ, int plane, int msx, int msy) {
        return true;
    }
}

