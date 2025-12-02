/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.input.naturalmouse.support;

import java.awt.Point;
import net.unethicalite.api.input.naturalmouse.api.MouseInfoAccessor;

private class ScreenAdjustedNature.ProxyMouseInfo
implements MouseInfoAccessor {
    private final MouseInfoAccessor underlying;
    private final Point p = new Point();

    public ScreenAdjustedNature.ProxyMouseInfo(MouseInfoAccessor underlying) {
        this.underlying = underlying;
    }

    @Override
    public Point getMousePosition() {
        Point realPointer = this.underlying.getMousePosition();
        this.p.setLocation(realPointer.x - ScreenAdjustedNature.this.offset.x, realPointer.y - ScreenAdjustedNature.this.offset.y);
        return this.p;
    }
}
