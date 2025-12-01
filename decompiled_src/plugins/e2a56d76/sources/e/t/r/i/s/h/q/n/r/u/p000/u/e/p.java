package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Checking net trap", priority = 20, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.p  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/p.class */
public class p extends j {
    private static /* synthetic */ String[] lllIlllllIII;
    private static /* synthetic */ int[] lllIlllllIIl;

    private static String lIIIlllIIIlIllI(String lllllllllllllllIIlIllIllIlIIIIlI, String lllllllllllllllIIlIllIllIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllIlIIIlII.init(lllIlllllIIl[5], lllllllllllllllIIlIllIllIlIIIlIl);
            return new String(lllllllllllllllIIlIllIllIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIlIIIIll) {
            lllllllllllllllIIlIllIllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIIllIII() {
        lllIlllllIIl = new int[11];
        lllIlllllIIl[0] = (197 ^ 166) & ((87 ^ 52) ^ (-1));
        lllIlllllIIl[1] = (((149 + 2) - 82) + 118) ^ (((164 + 40) - 156) + 142);
        lllIlllllIIl[2] = (-20690) & 29693;
        lllIlllllIIl[3] = " ".length();
        lllIlllllIIl[4] = (-((-4433) & 20850)) & (-7297) & 32699;
        lllIlllllIIl[5] = "  ".length();
        lllIlllllIIl[6] = (-((-10069) & 32758)) & (-1281) & 32703;
        lllIlllllIIl[7] = "   ".length();
        lllIlllllIIl[8] = (-((-1657) & 24314)) & (-1089) & 32741;
        lllIlllllIIl[9] = 5 ^ 1;
        lllIlllllIIl[10] = (-289) & 51005;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        Map<WorldPoint, f> h = y().h();
        if ((!lIIIlllIIIllIIl(h.isEmpty() ? 1 : 0) || !lIIIlllIIIllIlI(Movement.shouldWalk() ? 1 : 0)) && !lIIIlllIIIllIIl(y().c() ? 1 : 0)) {
            f fVar = null;
            for (WorldPoint worldPoint : h.keySet()) {
                f fVar2 = h.get(worldPoint);
                if (lIIIlllIIIllIll(fVar2.q(), g.FULL)) {
                    fVar = fVar2;
                }
                "".length();
                if (0 != 0) {
                    return ((37 ^ 55) ^ (208 ^ 152)) & (((82 ^ 5) ^ (163 ^ 174)) ^ (-" ".length()));
                }
            }
            if (lIIIlllIIIlllII(fVar)) {
                return lllIlllllIIl[0];
            }
            int[] iArr = new int[lllIlllllIIl[1]];
            iArr[lllIlllllIIl[0]] = lllIlllllIIl[2];
            iArr[lllIlllllIIl[3]] = lllIlllllIIl[4];
            iArr[lllIlllllIIl[5]] = lllIlllllIIl[6];
            iArr[lllIlllllIIl[7]] = lllIlllllIIl[8];
            iArr[lllIlllllIIl[9]] = lllIlllllIIl[10];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIlllIIIlllII(nearest)) {
                return lllIlllllIIl[0];
            }
            nearest.interact(lllIlllllIII[lllIlllllIIl[0]]);
            sleep(lllIlllllIIl[3]);
            return lllIlllllIIl[3];
        }
        return lllIlllllIIl[0];
    }

    private static void lIIIlllIIIlIlll() {
        lllIlllllIII = new String[lllIlllllIIl[3]];
        lllIlllllIII[lllIlllllIIl[0]] = lIIIlllIIIlIllI("xWVEYqun/iI=", "SLDjl");
    }

    private static boolean lIIIlllIIIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIIIlllIIIllIII();
        lIIIlllIIIlIlll();
    }

    private static boolean lIIIlllIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIIIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIIIlllII(Object obj) {
        return obj == null;
    }

    @Inject
    public p(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.SALLIES);
    }
}
