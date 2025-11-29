/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Puzzle Prayer Handler", priority=100)
public class PuzzlePrayerHandlerTask
extends AutotoaTaskBase {

    @Inject
    public PuzzlePrayerHandlerTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    @Override
    public boolean aL() {
        return llIIllllIlI[1];
    }

    @Override
    public int aO() {
        return llIIllllIlI[0];
    }

    @Override
    public boolean aS() {
        return llIIllllIlI[1];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    static {
        bu.lIlIIIlllIllll();
    }

    @Override
    public List<Prayer> aN() {
        return List.of(Prayer.PROTECT_FROM_MISSILES);
    }
}

