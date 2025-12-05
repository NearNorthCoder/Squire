/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.recorder;

import java.awt.Point;

public final class MouseMovement {
    private final int x;
    private final int y;
    private final long millis;

    public double distanceTo(Point clickPoint) {
        return Math.sqrt(Math.pow(clickPoint.getX() - (double)this.x, 2.0) + Math.pow(clickPoint.getY() - (double)this.y, 2.0));
    }

    public MouseMovement(int x, int y, long millis) {
        this.x = x;
        this.y = y;
        this.millis = millis;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public long getMillis() {
        return this.millis;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MouseMovement)) {
            return false;
        }
        MouseMovement other = (MouseMovement)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        return this.getMillis() == other.getMillis();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        long $millis = this.getMillis();
        result = result * 59 + (int)($millis >>> 32 ^ $millis);
        return result;
    }

    public String toString() {
        return "MouseMovement(x=" + this.getX() + ", y=" + this.getY() + ", millis=" + this.getMillis() + ")";
    }
}

