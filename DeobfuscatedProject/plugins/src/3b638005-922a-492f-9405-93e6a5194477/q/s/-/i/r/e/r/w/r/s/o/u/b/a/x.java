/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Going to house", priority=50)
public class x
extends Task {
    private static /* synthetic */ int[] llllIllIIlI;
    private final /* synthetic */ SquireBarrowsConfig am;
    private final /* synthetic */ SquireBarrows al;

    static {
        x.lIllIllIIIlIlI();
    }

    private static boolean lIllIllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public x(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.al = squireBarrows;
        this.am = squireBarrowsConfig;
    }

    private static boolean lIllIllIIIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIllIllIIIlIlI() {
        llllIllIIlI = new int[3];
        x.llllIllIIlI[0] = (0xFE ^ 0xC2) & ~(0x93 ^ 0xAF);
        x.llllIllIIlI[1] = 0x25 ^ 6 ^ (0x17 ^ 0x32);
        x.llllIllIIlI[2] = " ".length();
    }

    public boolean run() {
        x llllllllllllllllIIIllIIIlIIlllll;
        if (x.lIllIllIIIlIll(this.am.useHouse() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(llllllllllllllllIIIllIIIlIIlllll.al.h() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIllII(llllllllllllllllIIIllIIIlIIlllll.al.e(), llllIllIIlI[1])) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(llllllllllllllllIIIllIIIlIIlllll.al.v() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        TeleportLoader.enterHouse();
        "".length();
        return llllIllIIlI[2];
    }
}

