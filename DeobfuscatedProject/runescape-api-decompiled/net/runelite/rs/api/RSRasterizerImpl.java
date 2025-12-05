/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Rasterizer
 */
package net.runelite.rs.api;

import net.runelite.api.Rasterizer;
import net.runelite.rs.api.RSClient;

public class RSRasterizerImpl
implements Rasterizer {
    private RSClient client;

    public RSRasterizerImpl(RSClient client) {
        this.client = client;
    }

    public int[] getPixels() {
        return this.client.getGraphicsPixels();
    }

    public int getWidth() {
        return this.client.getGraphicsPixelsWidth();
    }

    public int getHeight() {
        return this.client.getGraphicsPixelsHeight();
    }

    public void fillRectangle(int x, int y, int w, int h, int rgb) {
        this.client.rasterizerFillRectangle(x, y, w, h, rgb);
    }

    public void rasterFlat(int y0, int y1, int y2, int x0, int x1, int x2, int rgb) {
        this.client.rasterizer3DFillAlpha(y0, y1, y2, x0, x1, x2, 0.0f, 0.0f, 0.0f, rgb);
    }

    public void setRasterGouraudLowRes(boolean lowRes) {
        this.client.setRasterizer3DIsClipped(lowRes);
    }

    public void rasterGouraud(int y0, int y1, int y2, int x0, int x1, int x2, int hsl0, int hsl1, int hsl2) {
        this.client.Rasterizer3D_gouraud(y0, y1, y2, x0, x1, x2, 0.0f, 0.0f, 0.0f, hsl0, hsl1, hsl2);
    }

    public void setDrawRegion(int var1, int var2, int var3, int var4) {
        this.client.setClip(var1, var2, var3, var4);
    }

    public void resetRasterClipping() {
        this.client.setClipFromRasterizer2D();
    }
}

