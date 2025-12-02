/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.input.naturalmouse;

import java.util.Collection;
import net.unethicalite.api.input.naturalmouse.support.DefaultSpeedManager;
import net.unethicalite.api.input.naturalmouse.support.Flow;
import net.unethicalite.api.input.naturalmouse.util.Pair;

private static class NaturalMouse.SpeedManagerImpl
extends DefaultSpeedManager {
    private NaturalMouse.SpeedManagerImpl(Collection<Flow> flows) {
        super(flows);
    }

    @Override
    public Pair<Flow, Long> getFlowWithTime(double distance) {
        Pair<Flow, Long> pair = super.getFlowWithTime(distance);
        return new Pair<Flow, Long>((Flow)pair.x, (Long)pair.y);
    }
}
