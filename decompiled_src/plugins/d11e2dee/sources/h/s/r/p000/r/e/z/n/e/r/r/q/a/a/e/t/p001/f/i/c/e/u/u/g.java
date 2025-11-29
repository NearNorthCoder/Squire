package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Mining Essence Blocks")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.g  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIllIIllIlIlI;
    private static /* synthetic */ int[] lIllIIllIllII;
    private static final /* synthetic */ WorldArea C;
    private static final /* synthetic */ WorldPoint A;
    private static final /* synthetic */ WorldPoint B;
    private final /* synthetic */ a E;
    private final /* synthetic */ SquireZeahRunecrafter F;
    private static final /* synthetic */ WorldArea D;

    static {
        llIIIllIllIIIII();
        llIIIllIlIlllII();
        A = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[10], lIllIIllIllII[0]);
        B = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[11], lIllIIllIllII[0]);
        C = new WorldArea(lIllIIllIllII[12], lIllIIllIllII[13], lIllIIllIllII[14], lIllIIllIllII[15], lIllIIllIllII[0]);
        D = new WorldArea(lIllIIllIllII[16], lIllIIllIllII[17], lIllIIllIllII[18], lIllIIllIllII[15], lIllIIllIllII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (llIIIllIllIIIIl(v() ? 1 : 0)) {
            return lIllIIllIllII[0];
        }
        A();
        return lIllIIllIllII[1];
    }

    private TileObject B() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIIIllIllIIIll(tileObject.getActualId(), lIllIIllIllII[7]) && llIIIllIllIIllI(tileObject.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[8])) {
                ?? r0 = lIllIIllIllII[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIllIllII[0];
        });
        if (llIIIllIllIIlII(nearest) && llIIIllIllIIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
            return nearest;
        }
        return null;
    }

    @Inject
    public g(a aVar, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.E = aVar;
        this.F = squireZeahRunecrafter;
    }

    private static String llIIIllIlIllIll(String llllllllllllllIllIIlIIIllIlllIll, String llllllllllllllIllIIlIIIllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIIllIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIIllIllllIl.init(lIllIIllIllII[19], secretKeySpec);
            return new String(llllllllllllllIllIIlIIIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIllIllllII) {
            llllllllllllllIllIIlIIIllIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIllIIIIl(int i) {
        return i != 0;
    }

    private static void llIIIllIllIIIII() {
        lIllIIllIllII = new int[20];
        lIllIIllIllII[0] = ((42 ^ 92) ^ (234 ^ 130)) & (((((54 + 104) - 144) + 203) ^ (((69 + 21) - 46) + 155)) ^ (-" ".length()));
        lIllIIllIllII[1] = " ".length();
        lIllIIllIllII[2] = (-((-1486) & 17887)) & (-105) & 24443;
        lIllIIllIllII[3] = (-((-4234) & 23243)) & (-1) & 32455;
        lIllIIllIllII[4] = -" ".length();
        lIllIIllIllII[5] = (242 ^ 152) ^ (46 ^ 80);
        lIllIIllIllII[6] = (-28675) & 63415;
        lIllIIllIllII[7] = (-((-519) & 24183)) & (-129) & 32767;
        lIllIIllIllII[8] = (((59 + 102) - 58) + 77) ^ (((149 + 137) - 99) + 3);
        lIllIIllIllII[9] = (-((-2805) & 31487)) & (-261) & 30703;
        lIllIIllIllII[10] = (-((-553) & 17082)) & (-12385) & 32765;
        lIllIIllIllII[11] = (-((-5131) & 29727)) & (-193) & 28663;
        lIllIIllIllII[12] = (-"  ".length()) & (-10321) & 12031;
        lIllIIllIllII[13] = (-((-4637) & 29471)) & (-4097) & 32751;
        lIllIIllIllII[14] = 99 ^ 113;
        lIllIIllIllII[15] = (38 ^ 122) ^ (198 ^ 139);
        lIllIIllIllII[16] = (-8257) & 9964;
        lIllIIllIllII[17] = (-((-9247) & 29823)) & (-129) & 24575;
        lIllIIllIllII[18] = (27 ^ 1) ^ (162 ^ 143);
        lIllIIllIllII[19] = "  ".length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (llIIIllIllIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean x() {
        if (llIIIllIllIIIIl(C.contains(Players.getLocal()) ? 1 : 0)) {
            int[] iArr = new int[lIllIIllIllII[1]];
            iArr[lIllIIllIllII[0]] = lIllIIllIllII[2];
            if (llIIIllIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIllIllII[1]];
                iArr2[lIllIIllIllII[0]] = lIllIIllIllII[3];
            }
            ?? r0 = lIllIIllIllII[1];
            "".length();
            return "  ".length() <= (-" ".length()) ? ((100 ^ 118) ^ (194 ^ 156)) & (((((232 + 41) - 57) + 38) ^ (((9 + 166) - 46) + 49)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIllII[0];
    }

    private void c(TileObject tileObject) {
        if (llIIIllIllIIIll(Players.getLocal().getAnimation(), lIllIIllIllII[4])) {
            tileObject.interact(lIllIIllIlIlI[lIllIIllIllII[0]]);
        }
    }

    private static boolean llIIIllIllIIIlI(int i) {
        return i == 0;
    }

    private static boolean llIIIllIllIIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean w() {
        if (llIIIllIllIIIlI(this.F.a() ? 1 : 0)) {
            ?? r0 = lIllIIllIllII[1];
            "".length();
            return " ".length() >= ((219 ^ 138) ^ (12 ^ 89)) ? ((((114 + 98) - 81) + 9) ^ (((152 + 84) - 218) + 163)) & (((((116 + 25) - 5) + 41) ^ (((56 + 127) - 181) + 134)) ^ (-" ".length())) : r0;
        }
        return lIllIIllIllII[0];
    }

    private boolean y() {
        return Inventory.isFull();
    }

    private static void llIIIllIlIlllII() {
        lIllIIllIlIlI = new String[lIllIIllIllII[19]];
        lIllIIllIlIlI[lIllIIllIllII[0]] = llIIIllIlIllIll("VxN1idC3qe4=", "IYBBQ");
        lIllIIllIlIlI[lIllIIllIllII[1]] = llIIIllIlIllIll("grumIBh+qzY=", "doYXt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean v() {
        if (llIIIllIllIIIlI(w() ? 1 : 0) && llIIIllIllIIIlI(x() ? 1 : 0) && llIIIllIllIIIlI(y() ? 1 : 0) && !llIIIllIllIIIIl(z() ? 1 : 0)) {
            return lIllIIllIllII[0];
        }
        ?? r0 = lIllIIllIllII[1];
        "".length();
        return (-((123 ^ 41) ^ (24 ^ 79))) >= 0 ? ((82 ^ 23) ^ (13 ^ 76)) & (((14 ^ 38) ^ (45 ^ 1)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean z() {
        if (llIIIllIllIIIll(this.E.j(), this.E.h()) && llIIIllIllIIIIl(Inventory.isFull() ? 1 : 0)) {
            ?? r0 = lIllIIllIllII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIllII[0];
    }

    private static boolean llIIIllIllIIllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean D() {
        if (llIIIllIllIIlIl(A.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[5])) {
            ?? r0 = lIllIIllIllII[1];
            "".length();
            return "   ".length() < "   ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        }
        return lIllIIllIllII[0];
    }

    private static boolean llIIIllIllIIlIl(int i, int i2) {
        return i > i2;
    }

    private void A() {
        TileObject B2 = B();
        if (!llIIIllIllIIlII(B2)) {
            C();
            return;
        }
        c(B2);
        "".length();
        if ((-"   ".length()) > 0) {
        }
    }

    private void C() {
        if (!llIIIllIllIIIIl(D() ? 1 : 0) || !llIIIllIllIIIIl(D.contains(Players.getLocal()) ? 1 : 0)) {
            Movement.walkTo(A);
            "".length();
            return;
        }
        E();
        "".length();
        if ((-" ".length()) == "  ".length()) {
        }
    }

    private void E() {
        int[] iArr = new int[lIllIIllIllII[1]];
        iArr[lIllIIllIllII[0]] = lIllIIllIllII[6];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!llIIIllIllIIlII(nearest)) {
            Movement.walkTo(B);
            "".length();
            return;
        }
        nearest.interact(lIllIIllIlIlI[lIllIIllIllII[1]]);
        "".length();
        if ((true ^ true) ^ (true ^ true)) {
        }
    }

    private static boolean llIIIllIllIIlII(Object obj) {
        return obj != null;
    }
}
