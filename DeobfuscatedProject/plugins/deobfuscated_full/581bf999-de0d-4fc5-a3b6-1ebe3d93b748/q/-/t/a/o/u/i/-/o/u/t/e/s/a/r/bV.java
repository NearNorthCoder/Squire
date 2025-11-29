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

/* TASK: Moving to center -> MovingtocenterTask */
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
        bV.llIIIIlIllI[1] = 2;
        bV.llIIIIlIllI[2] = 1;
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
        bV var3;
        if (bV.lIIlllIlIlIlII(this.bq() ? 1 : 0) && bV.lIIlllIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlII(var3.cE().isEmpty() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        WorldPoint var1 = WorldPoint.toLocalInstance((Client)var3.cu, (WorldPoint)hf.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(var2))).orElse(null);
        if (bV.lIIlllIlIlIllI(var1)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlll(var1.distanceTo(var2), llIIIIlIllI[1]) && bV.lIIlllIlIllIII(var2.getWorldX(), var1.getWorldX())) {
            return llIIIIlIllI[0];
        }
        NPC var4 = var3.cA();
        if (bV.lIIlllIlIllIIl(var4)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlIl(var3.p(var1) ? 1 : 0)) {
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

