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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Checking Snare", priority = 1)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.A  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/A.class */
public class A extends j {
    private static /* synthetic */ int[] lllIllIlllIl;
    private static /* synthetic */ String[] lllIllIlllII;

    private static boolean lIIIllIllIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllIllIIIlIl(int i) {
        return i == 0;
    }

    private static String lIIIllIllIIIIlI(String lllllllllllllllIIlIlllIlIllllllI, String lllllllllllllllIIlIlllIlIlllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllIIIIIII.init(lllIllIlllIl[5], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIllllIlI) {
            lllllllllllllllIIlIlllIlIllllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        Map<WorldPoint, f> h = y().h();
        if (lIIIllIllIIIlIl(h.isEmpty() ? 1 : 0) && lIIIllIllIIIlIl(Players.getLocal().isAnimating() ? 1 : 0) && !lIIIllIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            f fVar = null;
            for (WorldPoint worldPoint : h.keySet()) {
                f fVar2 = h.get(worldPoint);
                if (lIIIllIllIIIlll(fVar2.q(), g.FULL)) {
                    fVar = fVar2;
                }
                "".length();
                if ("  ".length() <= ((19 ^ 20) & ((118 ^ 113) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            if (lIIIllIllIIlIII(fVar)) {
                return lllIllIlllIl[0];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[2]) && lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[3]) && !lIIIllIllIIlIlI(tileObject.getId(), lllIllIlllIl[4])) {
                    return lllIllIlllIl[0];
                }
                ?? r0 = lllIllIlllIl[1];
                "".length();
                return ((146 ^ 196) & ((56 ^ 110) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (lIIIllIllIIlIII(nearest)) {
                return lllIllIlllIl[0];
            }
            nearest.interact(lllIllIlllII[lllIllIlllIl[0]]);
            return lllIllIlllIl[1];
        }
        return lllIllIlllIl[0];
    }

    private static boolean lIIIllIllIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIllIIIllI(int i) {
        return i != 0;
    }

    @Inject
    public A(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.BIRDS);
    }

    private static void lIIIllIllIIIIll() {
        lllIllIlllII = new String[lllIllIlllIl[1]];
        lllIllIlllII[lllIllIlllIl[0]] = lIIIllIllIIIIlI("7j8dzEhzFXw=", "fTsYg");
    }

    private static boolean lIIIllIllIIlIIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIIIllIllIIIlII();
        lIIIllIllIIIIll();
    }

    private static boolean lIIIllIllIIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIIllIllIIIlII() {
        lllIllIlllIl = new int[6];
        lllIllIlllIl[0] = ((77 ^ 12) ^ (174 ^ 179)) & (((31 ^ 83) ^ (160 ^ 176)) ^ (-" ".length()));
        lllIllIlllIl[1] = " ".length();
        lllIllIlllIl[2] = (-((-2065) & 23322)) & (-51) & 30655;
        lllIllIlllIl[3] = (-21089) & 30461;
        lllIllIlllIl[4] = (-((-11937) & 32485)) & (-265) & 30191;
        lllIllIlllIl[5] = "  ".length();
    }
}
