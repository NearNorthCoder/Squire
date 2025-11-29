package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging tiles", priority = 50, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bK  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bK.class */
public class bK extends bM {
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

    private static boolean lIlIIllIIIllII(int i, int i2) {
        return i > i2;
    }

    private static void lIlIIllIIIlIIl() {
        llIlIIllllI = new int[11];
        llIlIIllllI[0] = ((10 ^ 34) ^ (121 ^ 4)) & (((((18 + 211) - 178) + 199) ^ (((100 + 87) - 130) + 118)) ^ (-" ".length()));
        llIlIIllllI[1] = "   ".length();
        llIlIIllllI[2] = "  ".length();
        llIlIIllllI[3] = " ".length();
        llIlIIllllI[4] = (-(98 ^ 83)) & (-18945) & 28667;
        llIlIIllllI[5] = (-2097) & 11775;
        llIlIIllllI[6] = (-((-24907) & 29563)) & (-1) & 14333;
        llIlIIllllI[7] = (((128 + 83) - 105) + 45) ^ (((17 + 20) - (-21)) + 78);
        llIlIIllllI[8] = 41 ^ 12;
        llIlIIllllI[9] = (191 ^ 152) ^ (197 ^ 194);
        llIlIIllllI[10] = (((51 + 144) - 191) + 185) ^ (((41 + 95) - 3) + 23);
    }

    static {
        lIlIIllIIIlIIl();
        gI = llIlIIllllI[4];
        gG = llIlIIllllI[5];
        gE = llIlIIllllI[6];
        gD = new Point(llIlIIllllI[7], llIlIIllllI[8]);
        gF = new Point(llIlIIllllI[9], llIlIIllllI[8]);
        gH = new Point(llIlIIllllI[10], llIlIIllllI[8]);
    }

    private static boolean lIlIIllIIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIlIIllIIIlIlI(cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        WorldPoint a = a(gF);
        int distanceTo = a.distanceTo(worldLocation);
        if (lIlIIllIIIlIll(cq() ? 1 : 0) && lIlIIllIIIlIll(cr() ? 1 : 0) && lIlIIllIIIllII(distanceTo, llIlIIllllI[1])) {
            this.gB.sleep(distanceTo / llIlIIllllI[2]);
            Movement.setDestination(a);
            return llIlIIllllI[3];
        } else if (!lIlIIllIIIlIll(cr() ? 1 : 0) || lIlIIllIIIlIlI(cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        } else {
            WorldPoint cp = cp();
            if (lIlIIllIIIllIl(cp) && !lIlIIllIIIlIlI(worldLocation.equals(cp) ? 1 : 0)) {
                Movement.setDestination(cp);
                sleep(llIlIIllllI[3]);
                return llIlIIllllI[3];
            } else if (lIlIIllIIIlIll(this.gJ ? 1 : 0)) {
                Movement.setDestination(new WorldPoint(a(gD).getWorldX(), worldLocation.getWorldY(), worldLocation.getPlane()));
                sleep(llIlIIllllI[3]);
                this.gJ = llIlIIllllI[3];
                return llIlIIllllI[3];
            } else {
                return llIlIIllllI[0];
            }
        }
    }

    private static boolean lIlIIllIIIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.gJ = llIlIIllllI[0];
    }

    public WorldPoint cp() {
        NPC co = co();
        if (lIlIIllIIIlllI(co)) {
            return null;
        }
        int animation = co.getAnimation();
        if (lIlIIllIIIllll(animation, llIlIIllllI[4])) {
            return a(gD);
        }
        if (lIlIIllIIIllll(animation, llIlIIllllI[5])) {
            return a(gF);
        }
        if (lIlIIllIIIllll(animation, llIlIIllllI[6])) {
            return a(gH);
        }
        return null;
    }

    private static boolean lIlIIllIIIlIll(int i) {
        return i == 0;
    }

    private static boolean lIlIIllIIIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIllIIIllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected bK(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.gJ = llIlIIllllI[0];
    }
}
