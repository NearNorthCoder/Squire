/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.recorder;

import java.awt.Point;

public class MouseClick {
    Point p;

    public String toString() {
        return "MouseClick{p=" + String.valueOf(this.p) + "}";
    }

    public MouseClick(Point p) {
        this.p = p;
    }

    public Point getP() {
        return this.p;
    }
}

