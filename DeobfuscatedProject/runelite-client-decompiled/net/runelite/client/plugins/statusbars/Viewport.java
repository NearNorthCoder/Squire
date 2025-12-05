/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package net.runelite.client.plugins.statusbars;

import net.runelite.api.Point;

enum Viewport {
    RESIZED_BOX(10551311, 10551369, new Point(20, -4), new Point(0, -4)),
    RESIZED_BOTTOM(10747919, 10747974, new Point(61, -12), new Point(35, -12)),
    FIXED(35913761, 35913808, new Point(20, -4), new Point(0, -4)),
    FIXED_BANK(786433, 983043, new Point(20, -4), new Point(0, -4));

    private int container;
    private int viewport;
    private Point offsetLeft;
    private Point offsetRight;

    public int getContainer() {
        return this.container;
    }

    public int getViewport() {
        return this.viewport;
    }

    public Point getOffsetLeft() {
        return this.offsetLeft;
    }

    public Point getOffsetRight() {
        return this.offsetRight;
    }

    private Viewport(int container, int viewport, Point offsetLeft, Point offsetRight) {
        this.container = container;
        this.viewport = viewport;
        this.offsetLeft = offsetLeft;
        this.offsetRight = offsetRight;
    }
}

