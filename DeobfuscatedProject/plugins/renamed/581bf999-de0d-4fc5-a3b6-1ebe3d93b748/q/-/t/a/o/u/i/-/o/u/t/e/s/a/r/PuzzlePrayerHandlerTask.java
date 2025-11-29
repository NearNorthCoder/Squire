/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.VEnum;

/* TASK: Puzzle Prayer Handler -> PuzzleprayerhandlerTask */
@TaskDesc(name="Puzzle Prayer Handler", priority=100)
public class PuzzlePrayerHandlerTask
extends W_Unknown {
    private static /* synthetic */ int[] llIIllllIlI;

    @Inject
    public bu(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    @Override
    public boolean aL() {
        return llIIllllIlI[1];
    }

    private static void lIlIIIlllIllll() {
        llIIllllIlI = new int[2];
        bu.llIIllllIlI[0] = -(0xFFFFDA72 & 0x6DAF) & (0xFFFFFF73 & Short.MAX_VALUE);
        bu.llIIllllIlI[1] = 1;
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

