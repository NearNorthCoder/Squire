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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Puzzle Prayer Handler", priority=100)
public class PuzzlePrayerHandlerTask
extends AutotoaManager {

    @Inject
    public PuzzlePrayerHandlerTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    @Override
    public boolean aL() {
        return var1[1];
    }

    private static void var2() {
        var1 = new int[2];
        bu.var1[0] = -(0xFFFFDA72 & 0x6DAF) & (0xFFFFFF73 & Short.MAX_VALUE);
        bu.var1[1] = 1;
    }

    @Override
    public int aO() {
        return var1[0];
    }

    @Override
    public boolean aS() {
        return var1[1];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    static {
        bu.var2();
    }

    @Override
    public List<Prayer> aN() {
        return List.of(Prayer.PROTECT_FROM_MISSILES);
    }
}

