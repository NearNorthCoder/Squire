/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;

public abstract class Y
extends Task {
    protected static /* synthetic */ boolean cw;
    private static /* synthetic */ int[] lIlIlIllIIII;
    protected /* synthetic */ WorldPoint cy;
    @Inject
    protected /* synthetic */ Client u;
    protected /* synthetic */ WorldPoint cx;
    @Inject
    protected /* synthetic */ SquireChambersConfig k;
    @Inject
    protected /* synthetic */ SquireChambersPlugin v;

    private static boolean llIllllIIlllll(Object object) {
        return object == null;
    }

    private static boolean llIllllIIlllIl(int n2) {
        return n2 != 0;
    }

    protected boolean cr() {
        int n2;
        Y var2;
        Player player = Players.getLocal();
        if (Y.llIllllIIlllll(player)) {
            return lIlIlIllIIII[2];
        }
        if (Y.llIllllIIlllIl(var2.u.isInInstancedRegion() ? 1 : 0) && Y.llIllllIlIIIII((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh(), (Object)w.WAITING_FOR_LEADER_TO_START)) {
            n2 = lIlIlIllIIII[5];
            0;
            if ((1 & (1 ^ -1)) < ((0xC0 ^ 0x87 ^ (0xA6 ^ 0xC0)) & (182 + 182 - 231 + 58 ^ 97 + 70 - 33 + 24 ^ -1))) {
                return ((0xE9 ^ 0xB0 ^ (0x63 ^ 0x24)) & (0x43 ^ 0x21 ^ (0x57 ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlIllIIII[2];
        }
        return n2 != 0;
    }

    private static boolean llIllllIIllllI(int n2) {
        return n2 == 0;
    }

    protected abstract boolean cg();

    private static boolean llIllllIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    public boolean run() {
        Y var1;
        if (Y.llIllllIIlllIl(this.k.pause() ? 1 : 0)) {
            return lIlIlIllIIII[2];
        }
        if (Y.llIllllIIllllI(var1.v.G() ? 1 : 0)) {
            return lIlIlIllIIII[2];
        }
        return this.cg();
    }

    static {
        Y.llIllllIIlllII();
        cw = lIlIlIllIIII[2];
    }

    private static void llIllllIIlllII() {
        lIlIlIllIIII = new int[6];
        Y.lIlIlIllIIII[0] = -(0xFFFFFDBA & 0x1A5F) & (0xFFFFDFFF & 0x3CFF);
        Y.lIlIlIllIIII[1] = -(0xFFFFFE6D & 0x539B) & (0xFFFFFFFF & 0x5FFB);
        Y.lIlIlIllIIII[2] = (0x3E ^ 0x16) & ~(0x10 ^ 0x38);
        Y.lIlIlIllIIII[3] = 0xFFFF87FE & 0x7CDF;
        Y.lIlIlIllIIII[4] = -(0xFFFFE515 & 0x7AFF) & (0xFFFFEDFF & 0x7FFE);
        Y.lIlIlIllIIII[5] = 1;
    }

    protected BankLoadout q() {
        return (BankLoadout)this.k.bankLoadout().selected(BankLoadout.class);
    }

    public Y() {
        this.cx = new WorldPoint(lIlIlIllIIII[0], lIlIlIllIIII[1], lIlIlIllIIII[2]);
        this.cy = new WorldPoint(lIlIlIllIIII[3], lIlIlIllIIII[4], lIlIlIllIIII[2]);
    }
}

