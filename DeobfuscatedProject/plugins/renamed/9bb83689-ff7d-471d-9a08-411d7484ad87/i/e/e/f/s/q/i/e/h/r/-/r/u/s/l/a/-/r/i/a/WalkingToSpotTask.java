/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Walking to spot -> WalkingtospotTask */
@TaskDesc(name="Walking to spot", priority=5, blocking=true)
public class WalkingToSpotTask
extends Task {
    private static final /* synthetic */ WorldPoint m;
    private static /* synthetic */ int[] lIlIllIlllI;

    public boolean run() {
        if (f.lIIlIIlllIlIll(Players.getLocal().getWorldLocation().equals((Object)m) ? 1 : 0)) {
            return lIlIllIlllI[0];
        }
        Movement.setDestination((WorldPoint)m);
        return lIlIllIlllI[1];
    }

    private static void lIIlIIlllIlIlI() {
        lIlIllIlllI = new int[4];
        f.lIlIllIlllI[0] = (0x33 ^ 0x42 ^ (0x1A ^ 0x7B)) & (0x93 ^ 0x84 ^ (0x83 ^ 0x84) ^ -1);
        f.lIlIllIlllI[1] = 1;
        f.lIlIllIlllI[2] = 0xFFFF956B & 0x6FF4;
        f.lIlIllIlllI[3] = 0xFFFFDFAD & 0x2E7F;
    }

    static {
        f.lIIlIIlllIlIlI();
        m = new WorldPoint(lIlIllIlllI[2], lIlIllIlllI[3], lIlIllIlllI[0]);
    }

    private static boolean lIIlIIlllIlIll(int n) {
        return n != 0;
    }
}

