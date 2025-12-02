/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.input.naturalmouse;

import java.awt.Dimension;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.input.naturalmouse.api.SystemCalls;

private class NaturalMouse.SystemCallsImpl
implements SystemCalls {
    private NaturalMouse.SystemCallsImpl() {
    }

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public void sleep(long time) {
        Time.sleep(time);
    }

    @Override
    public Dimension getScreenSize() {
        return NaturalMouse.this.client.getCanvas().getSize();
    }

    @Override
    public void setMousePosition(int x, int y) {
        NaturalMouse.this.client.getMouseHandler().sendMovement(x, y);
    }
}
