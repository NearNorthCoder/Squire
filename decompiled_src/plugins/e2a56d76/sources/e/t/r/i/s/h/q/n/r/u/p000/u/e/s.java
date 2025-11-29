package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to net trap that is changing", priority = -1)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.s  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/s.class */
public class s extends j {
    private static /* synthetic */ int[] llllIIIIllII;
    private static /* synthetic */ String[] llllIIIIlIll;

    static {
        lIIIlllIlIllIll();
        lIIIlllIlIllIlI();
    }

    private static void lIIIlllIlIllIll() {
        llllIIIIllII = new int[4];
        llllIIIIllII[0] = (7 ^ 9) & ((106 ^ 100) ^ (-1));
        llllIIIIllII[1] = " ".length();
        llllIIIIllII[2] = 153 ^ 145;
        llllIIIIllII[3] = "  ".length();
    }

    @Inject
    public s(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.SALLIES);
    }

    private static String lIIIlllIlIllIIl(String lllllllllllllllIIlIllIIlllIlIIlI, String lllllllllllllllIIlIllIIlllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIIllII[2]), "DES");
            Cipher lllllllllllllllIIlIllIIlllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlllIlIlII.init(llllIIIIllII[3], lllllllllllllllIIlIllIIlllIlIlIl);
            return new String(lllllllllllllllIIlIllIIlllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlllIlIIll) {
            lllllllllllllllIIlIllIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIlllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIlIlllIl(int i) {
        return i == 0;
    }

    private static void lIIIlllIlIllIlI() {
        llllIIIIlIll = new String[llllIIIIllII[1]];
        llllIIIIlIll[llllIIIIllII[0]] = lIIIlllIlIllIIl("6csF4RVbnjw=", "UTYqd");
    }

    private static boolean lIIIlllIlIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        Map<WorldPoint, f> h = y().h();
        if (!lIIIlllIlIlllII(h.isEmpty() ? 1 : 0) && !lIIIlllIlIlllIl(Movement.shouldWalk() ? 1 : 0)) {
            f fVar = null;
            for (WorldPoint worldPoint : h.keySet()) {
                f fVar2 = h.get(worldPoint);
                if (lIIIlllIlIllllI(fVar2.q(), g.TRANSITION)) {
                    fVar = fVar2;
                    "".length();
                    if ("   ".length() < "   ".length()) {
                        return ((98 ^ 93) ^ (164 ^ 151)) & (((45 ^ 26) ^ (75 ^ 112)) ^ (-" ".length()));
                    }
                } else if (lIIIlllIlIllllI(fVar2.q(), g.FULL)) {
                    return llllIIIIllII[0];
                }
                "".length();
                if ((-" ".length()) >= (168 ^ 172)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            if (lIIIlllIlIlllll(fVar)) {
                return llllIIIIllII[0];
            }
            TileObject nearest = TileObjects.getNearest(fVar.o(), tileObject -> {
                return tileObject.getName().toLowerCase().contains(llllIIIIlIll[llllIIIIllII[0]]);
            });
            if (lIIIlllIlIlllll(nearest)) {
                return llllIIIIllII[0];
            }
            LocalPoint localLocation = nearest.getLocalLocation();
            Movement.setDestination(localLocation.getSceneX(), localLocation.getSceneY());
            return llllIIIIllII[1];
        }
        return llllIIIIllII[0];
    }

    private static boolean lIIIlllIlIlllII(int i) {
        return i != 0;
    }
}
