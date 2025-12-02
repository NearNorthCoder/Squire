/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.input.naturalmouse.support;

import java.awt.Dimension;
import net.unethicalite.api.input.naturalmouse.api.SystemCalls;

private class ScreenAdjustedNature.ProxySystemCalls
implements SystemCalls {
    private final SystemCalls underlying;

    public ScreenAdjustedNature.ProxySystemCalls(SystemCalls underlying) {
        this.underlying = underlying;
    }

    @Override
    public long currentTimeMillis() {
        return this.underlying.currentTimeMillis();
    }

    @Override
    public void sleep(long time) {
        this.underlying.sleep(time);
    }

    @Override
    public Dimension getScreenSize() {
        return ScreenAdjustedNature.this.screenSize;
    }

    @Override
    public void setMousePosition(int x, int y) {
        this.underlying.setMousePosition(x + ScreenAdjustedNature.this.offset.x, y + ScreenAdjustedNature.this.offset.y);
    }
}
