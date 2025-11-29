/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Moving to center", priority=30)
public class bV
extends bX {
    private static final /* synthetic */ RegionPoint hf;
    private static /* synthetic */ int[] llIIIIlIllI;

    private static boolean lIIlllIlIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIlllIlIlIIll() {
        llIIIIlIllI = new int[6];
        bV.llIIIIlIllI[0] = (0x39 ^ 0xF) & ~(0x69 ^ 0x5F);
        bV.llIIIIlIllI[1] = "  ".length();
        bV.llIIIIlIllI[2] = " ".length();
        bV.llIIIIlIllI[3] = 0xAC ^ 0xB5;
        bV.llIIIIlIllI[4] = 20 + 172 - 104 + 103 ^ 35 + 66 - 38 + 97;
        bV.llIIIIlIllI[5] = -(0xFFFFE2E9 & 0x5F3F) & (0xFFFFFF7E & 0x7FFD);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var2_2;
        bV llllllllllllllllIlIIIllIIlllIllI;
        if (bV.lIIlllIlIlIlII(this.bq() ? 1 : 0) && bV.lIIlllIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlII(llllllllllllllllIlIIIllIIlllIllI.cE().isEmpty() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        WorldPoint llllllllllllllllIlIIIllIIlllIlIl = Players.getLocal().getWorldLocation();
        WorldPoint llllllllllllllllIlIIIllIIlllIlII = WorldPoint.toLocalInstance((Client)llllllllllllllllIlIIIllIIlllIllI.cu, (WorldPoint)hf.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(llllllllllllllllIlIIIllIIlllIlIl))).orElse(null);
        if (bV.lIIlllIlIlIllI(llllllllllllllllIlIIIllIIlllIlII)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlll(llllllllllllllllIlIIIllIIlllIlII.distanceTo(llllllllllllllllIlIIIllIIlllIlIl), llIIIIlIllI[1]) && bV.lIIlllIlIllIII(llllllllllllllllIlIIIllIIlllIlIl.getWorldX(), llllllllllllllllIlIIIllIIlllIlII.getWorldX())) {
            return llIIIIlIllI[0];
        }
        NPC llllllllllllllllIlIIIllIIlllIIll = llllllllllllllllIlIIIllIIlllIllI.cA();
        if (bV.lIIlllIlIllIIl(llllllllllllllllIlIIIllIIlllIIll)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlIl(llllllllllllllllIlIIIllIIlllIllI.p(llllllllllllllllIlIIIllIIlllIlII) ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        this.a((WorldPoint)var2_2, this::P);
        return llIIIIlIllI[2];
    }

    private static boolean lIIlllIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected bV(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bY.ATTACK);
    }

    static {
        bV.lIIlllIlIlIIll();
        hf = new RegionPoint(llIIIIlIllI[3], llIIIIlIllI[4], llIIIIlIllI[0], llIIIIlIllI[5]);
    }

    private static boolean lIIlllIlIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIlllIlIllIIl(Object object) {
        return object != null;
    }
}

