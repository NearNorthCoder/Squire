/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.AttackingFinalWardenTask;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Dodging tiles -> DodgingtilesTask */
@TaskDesc(name="Dodging tiles", priority=50, blocking=true)
public class DodgingTilesTask
extends bM_Unknown {
    private static final /* synthetic */ Point gF;
    private static final /* synthetic */ Point gH;
    private static final /* synthetic */ Point gD;
    private static final /* synthetic */ int gI;
    private static final /* synthetic */ int gE;
    private static /* synthetic */ int[] llIlIIllllI;
    private /* synthetic */ boolean gJ;
    @Inject
    private /* synthetic */ bL gB;
    private static final /* synthetic */ int gG;

    private static boolean lIlIIllIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIllIIIlIIl() {
        llIlIIllllI = new int[11];
        bK.llIlIIllllI[0] = (0xA ^ 0x22 ^ (0x79 ^ 4)) & (18 + 211 - 178 + 199 ^ 100 + 87 - 130 + 118 ^ -1);
        bK.llIlIIllllI[1] = 3;
        bK.llIlIIllllI[2] = 2;
        bK.llIlIIllllI[3] = 1;
        bK.llIlIIllllI[4] = -(0x62 ^ 0x53) & (0xFFFFB5FF & 0x6FFB);
        bK.llIlIIllllI[5] = 0xFFFFF7CF & 0x2DFF;
        bK.llIlIIllllI[6] = -(0xFFFF9EB5 & 0x737B) & (0xFFFFFFFF & 0x37FD);
        bK.llIlIIllllI[7] = 128 + 83 - 105 + 45 ^ 17 + 20 - -21 + 78;
        bK.llIlIIllllI[8] = 0x29 ^ 0xC;
        bK.llIlIIllllI[9] = 0xBF ^ 0x98 ^ (0xC5 ^ 0xC2);
        bK.llIlIIllllI[10] = 51 + 144 - 191 + 185 ^ 41 + 95 - 3 + 23;
    }

    static {
        bK.lIlIIllIIIlIIl();
        gI = llIlIIllllI[4];
        gG = llIlIIllllI[5];
        gE = llIlIIllllI[6];
        gD = new Point(llIlIIllllI[7], llIlIIllllI[8]);
        gF = new Point(llIlIIllllI[9], llIlIIllllI[8]);
        gH = new Point(llIlIIllllI[10], llIlIIllllI[8]);
    }

    private static boolean lIlIIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        bK var8;
        if (bK.lIlIIllIIIlIlI(this.cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        WorldPoint var2 = var8.a(gF);
        int var9 = var2.distanceTo(var4);
        if (bK.lIlIIllIIIlIll(var8.cq() ? 1 : 0) && bK.lIlIIllIIIlIll(var8.cr() ? 1 : 0) && bK.lIlIIllIIIllII(var9, llIlIIllllI[1])) {
            var8.gB.sleep(var9 / llIlIIllllI[2]);
            Movement.setDestination((WorldPoint)var2);
            return llIlIIllllI[3];
        }
        if (!bK.lIlIIllIIIlIll(var8.cr() ? 1 : 0) || bK.lIlIIllIIIlIlI(var8.cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        }
        WorldPoint var3 = var8.cp();
        if (!bK.lIlIIllIIIllIl(var3) || bK.lIlIIllIIIlIlI(var4.equals((Object)var3) ? 1 : 0)) {
            if (bK.lIlIIllIIIlIll(var8.gJ ? 1 : 0)) {
                WorldPoint var1 = var8.a(gD);
                WorldPoint var5 = new WorldPoint(var1.getWorldX(), var4.getWorldY(), var4.getPlane());
                Movement.setDestination((WorldPoint)var5);
                var8.sleep(llIlIIllllI[3]);
                var8.gJ = llIlIIllllI[3];
                return llIlIIllllI[3];
            }
            return llIlIIllllI[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(llIlIIllllI[3]);
        return llIlIIllllI[3];
    }

    private static boolean lIlIIllIIIlllI(Object object) {
        return object == null;
    }

    @Override
    public void r() {
        this.gJ = llIlIIllllI[0];
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cp() {
        bK var6;
        void var7;
        NPC nPC = this.co();
        if (bK.lIlIIllIIIlllI(nPC)) {
            return null;
        }
        int var10 = var7.getAnimation();
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[4])) {
            return var6.a(gD);
        }
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[5])) {
            return var6.a(gF);
        }
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[6])) {
            return var6.a(gH);
        }
        return null;
    }

    private static boolean lIlIIllIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIIllIl(Object object) {
        return object != null;
    }

    @Inject
    protected bK(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gJ = llIlIIllllI[0];
    }
}

