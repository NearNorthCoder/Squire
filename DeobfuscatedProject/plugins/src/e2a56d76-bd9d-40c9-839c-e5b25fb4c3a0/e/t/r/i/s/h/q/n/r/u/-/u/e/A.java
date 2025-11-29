/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import e.t.r.i.s.h.q.n.r.u.-.u.e.g;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
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

@TaskDesc(name="Checking Snare", priority=1)
public class A
extends j {
    private static /* synthetic */ int[] lllIllIlllIl;
    private static /* synthetic */ String[] lllIllIlllII;

    private static boolean lIIIllIllIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIllIIIIlI(String lllllllllllllllIIlIlllIlIllllllI, String lllllllllllllllIIlIlllIlIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllIIIIIII.init(lllIllIlllIl[5], lllllllllllllllIIlIlllIllIIIIIIl);
            return new String(lllllllllllllllIIlIlllIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIlllllll) {
            lllllllllllllllIIlIlllIlIlllllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void lllllllllllllllIIlIlllIllIIIllII;
        Map<WorldPoint, f> map = this.y().h();
        if (!A.lIIIllIllIIIlIl(map.isEmpty() ? 1 : 0) || !A.lIIIllIllIIIlIl(Players.getLocal().isAnimating() ? 1 : 0) || A.lIIIllIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lllIllIlllIl[0];
        }
        f lllllllllllllllIIlIlllIllIIIlIll = null;
        TileObject lllllllllllllllIIlIlllIllIIIlIlI = lllllllllllllllIIlIlllIllIIIllII.keySet().iterator();
        while (A.lIIIllIllIIIllI(lllllllllllllllIIlIlllIllIIIlIlI.hasNext() ? 1 : 0)) {
            WorldPoint lllllllllllllllIIlIlllIllIIIlIIl = (WorldPoint)lllllllllllllllIIlIlllIllIIIlIlI.next();
            f lllllllllllllllIIlIlllIllIIIlIII = (f)lllllllllllllllIIlIlllIllIIIllII.get(lllllllllllllllIIlIlllIllIIIlIIl);
            if (A.lIIIllIllIIIlll((Object)lllllllllllllllIIlIlllIllIIIlIII.q(), (Object)g.FULL)) {
                lllllllllllllllIIlIlllIllIIIlIll = lllllllllllllllIIlIlllIllIIIlIII;
            }
            "".length();
            if ("  ".length() > ((0x13 ^ 0x14) & ~(0x76 ^ 0x71))) continue;
            return ((0x25 ^ 0x2E) & ~(0x5C ^ 0x57)) != 0;
        }
        if (A.lIIIllIllIIlIII(lllllllllllllllIIlIlllIllIIIlIll)) {
            return lllIllIlllIl[0];
        }
        lllllllllllllllIIlIlllIllIIIlIlI = TileObjects.getNearest(tileObject -> {
            boolean bl;
            if (!A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[2]) || !A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[3]) || A.lIIIllIllIIlIlI(tileObject.getId(), lllIllIlllIl[4])) {
                bl = lllIllIlllIl[1];
                "".length();
                if (((0x92 ^ 0xC4) & ~(0x38 ^ 0x6E)) >= "  ".length()) {
                    return ((0x22 ^ 0xE) & ~(0xA ^ 0x26)) != 0;
                }
            } else {
                bl = lllIllIlllIl[0];
            }
            return bl;
        });
        if (A.lIIIllIllIIlIII(lllllllllllllllIIlIlllIllIIIlIlI)) {
            return lllIllIlllIl[0];
        }
        var3_3.interact(lllIllIlllII[lllIllIlllIl[0]]);
        return lllIllIlllIl[1];
    }

    private static boolean lIIIllIllIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public A(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void lIIIllIllIIIIll() {
        lllIllIlllII = new String[lllIllIlllIl[1]];
        A.lllIllIlllII[A.lllIllIlllIl[0]] = A.lIIIllIllIIIIlI("7j8dzEhzFXw=", "fTsYg");
    }

    private static boolean lIIIllIllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        A.lIIIllIllIIIlII();
        A.lIIIllIllIIIIll();
    }

    private static boolean lIIIllIllIIlIII(Object object) {
        return object == null;
    }

    private static void lIIIllIllIIIlII() {
        lllIllIlllIl = new int[6];
        A.lllIllIlllIl[0] = (0x4D ^ 0xC ^ (0xAE ^ 0xB3)) & (0x1F ^ 0x53 ^ (0xA0 ^ 0xB0) ^ -" ".length());
        A.lllIllIlllIl[1] = " ".length();
        A.lllIllIlllIl[2] = -(0xFFFFF7EF & 0x5B1A) & (0xFFFFFFCD & 0x77BF);
        A.lllIllIlllIl[3] = 0xFFFFAD9F & 0x76FD;
        A.lllIllIlllIl[4] = -(0xFFFFD15F & 0x7EE5) & (0xFFFFFEF7 & 0x75EF);
        A.lllIllIlllIl[5] = "  ".length();
    }
}

