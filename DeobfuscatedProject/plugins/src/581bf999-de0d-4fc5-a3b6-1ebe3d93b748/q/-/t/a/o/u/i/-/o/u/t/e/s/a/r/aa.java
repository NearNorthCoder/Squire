/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run", priority=0x7FFFFFFF)
public class aa
extends Task {
    private static /* synthetic */ int[] llIIlIllIIl;
    protected final /* synthetic */ SquireAutoTOA cx;

    private static boolean lIlIIIIlIllIll(int n2) {
        return n2 != 0;
    }

    static {
        aa.lIlIIIIlIllIlI();
    }

    @Inject
    public aa(SquireAutoTOA squireAutoTOA) {
        this.cx = squireAutoTOA;
    }

    private static void lIlIIIIlIllIlI() {
        llIIlIllIIl = new int[3];
        aa.llIIlIllIIl[0] = (0xE7 ^ 0x85 ^ (5 ^ 0x57)) & (0x56 ^ 0x30 ^ (3 ^ 0x55) ^ -" ".length());
        aa.llIIlIllIIl[1] = 0x9E ^ 0x80 ^ (0x88 ^ 0x9C);
        aa.llIIlIllIIl[2] = " ".length();
    }

    public boolean run() {
        if (aa.lIlIIIIlIllIll(this.cx.d() ? 1 : 0)) {
            return llIIlIllIIl[0];
        }
        if (aa.lIlIIIIlIlllII(Movement.getRunEnergy(), llIIlIllIIl[1]) && aa.lIlIIIIlIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llIIlIllIIl[2];
        }
        return llIIlIllIIl[0];
    }

    private static boolean lIlIIIIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIlIlllII(int n2, int n3) {
        return n2 > n3;
    }
}

