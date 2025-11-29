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
@TaskDesc(name = "Resetting bird snare", priority = 15, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.B  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/B.class */
public class B extends j {
    private static /* synthetic */ int[] llllIIIIlIlI;
    private static /* synthetic */ String[] llllIIIIlIIl;

    private static boolean lIIIlllIlIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public B(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.BIRDS);
    }

    private static boolean lIIIlllIlIlIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        Map<WorldPoint, f> h = y().h();
        if (lIIIlllIlIlIlIl(h.isEmpty() ? 1 : 0) && lIIIlllIlIlIlIl(Players.getLocal().isAnimating() ? 1 : 0) && !lIIIlllIlIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            f fVar = null;
            for (WorldPoint worldPoint : h.keySet()) {
                f fVar2 = h.get(worldPoint);
                if (lIIIlllIlIlIlll(fVar2.q(), g.EMPTY)) {
                    fVar = fVar2;
                }
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((84 ^ 1) ^ (168 ^ 176)) & (((108 ^ 73) ^ (26 ^ 114)) ^ (-" ".length()));
                }
            }
            if (lIIIlllIlIllIII(fVar)) {
                return llllIIIIlIlI[0];
            }
            int[] iArr = new int[llllIIIIlIlI[1]];
            iArr[llllIIIIlIlI[0]] = llllIIIIlIlI[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIlllIlIllIII(nearest)) {
                return llllIIIIlIlI[0];
            }
            nearest.interact(llllIIIIlIIl[llllIIIIlIlI[0]]);
            return llllIIIIlIlI[1];
        }
        return llllIIIIlIlI[0];
    }

    private static void lIIIlllIlIlIlII() {
        llllIIIIlIlI = new int[4];
        llllIIIIlIlI[0] = (80 ^ 108) & ((167 ^ 155) ^ (-1));
        llllIIIIlIlI[1] = " ".length();
        llllIIIIlIlI[2] = (-17153) & 26496;
        llllIIIIlIlI[3] = "  ".length();
    }

    private static boolean lIIIlllIlIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIlIllIII(Object obj) {
        return obj == null;
    }

    static {
        lIIIlllIlIlIlII();
        lIIIlllIlIlIIll();
    }

    private static void lIIIlllIlIlIIll() {
        llllIIIIlIIl = new String[llllIIIIlIlI[1]];
        llllIIIIlIIl[llllIIIIlIlI[0]] = lIIIlllIlIlIIlI("W/Dnkgv3uB3/I6Y4yzr6GA==", "ViVYs");
    }

    private static String lIIIlllIlIlIIlI(String lllllllllllllllIIlIllIIlllllIlIl, String lllllllllllllllIIlIllIIlllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlllllIllI) {
            lllllllllllllllIIlIllIIlllllIllI.printStackTrace();
            return null;
        }
    }
}
