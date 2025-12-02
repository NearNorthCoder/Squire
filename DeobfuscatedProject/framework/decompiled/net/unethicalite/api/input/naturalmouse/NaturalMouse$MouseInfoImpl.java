/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.input.naturalmouse;

import java.awt.Point;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.input.naturalmouse.api.MouseInfoAccessor;

private static class NaturalMouse.MouseInfoImpl
implements MouseInfoAccessor {
    private NaturalMouse.MouseInfoImpl() {
    }

    @Override
    public Point getMousePosition() {
        return Mouse.getPosition();
    }
}
