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

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j_Unknown;
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

/* TASK: Checking Snare -> CheckingsnareTask */
@TaskDesc(name="Checking Snare", priority=1)
public class CheckingSnareTask
extends j_Unknown {
    private static /* synthetic */ int[] lllIllIlllIl;
    private static /* synthetic */ String[] lllIllIlllII;

    private static boolean lIIIllIllIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIllIIIIlI(String var8, String var7) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllIllIlllIl[5], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var5;
        Map<WorldPoint, f> map = this.y().h();
        if (!A.lIIIllIllIIIlIl(map.isEmpty() ? 1 : 0) || !A.lIIIllIllIIIlIl(Players.getLocal().isAnimating() ? 1 : 0) || A.lIIIllIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lllIllIlllIl[0];
        }
        f var4 = null;
        TileObject var9 = var5.keySet().iterator();
        while (A.lIIIllIllIIIllI(var9.hasNext() ? 1 : 0)) {
            WorldPoint var2 = (WorldPoint)var9.next();
            f var3 = (f)var5.get(var2);
            if (A.lIIIllIllIIIlll((Object)var3.q(), (Object)g.FULL)) {
                var4 = var3;
            }
            0;
            if (2 > ((0x13 ^ 0x14) & ~(0x76 ^ 0x71))) continue;
            return false;
        }
        if (A.lIIIllIllIIlIII(var4)) {
            return lllIllIlllIl[0];
        }
        var9 = TileObjects.getNearest(tileObject -> {
            boolean bl;
            if (!A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[2]) || !A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[3]) || A.lIIIllIllIIlIlI(tileObject.getId(), lllIllIlllIl[4])) {
                bl = lllIllIlllIl[1];
                0;
                if (((0x92 ^ 0xC4) & ~(0x38 ^ 0x6E)) >= 2) {
                    return false;
                }
            } else {
                bl = lllIllIlllIl[0];
            }
            return bl;
        });
        if (A.lIIIllIllIIlIII(var9)) {
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
        A.lllIllIlllII[A.lllIllIlllIl[0]] = A."Check";
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
        A.lllIllIlllIl[0] = (0x4D ^ 0xC ^ (0xAE ^ 0xB3)) & (0x1F ^ 0x53 ^ (0xA0 ^ 0xB0) ^ -1);
        A.lllIllIlllIl[1] = 1;
        A.lllIllIlllIl[2] = -(0xFFFFF7EF & 0x5B1A) & (0xFFFFFFCD & 0x77BF);
        A.lllIllIlllIl[3] = 0xFFFFAD9F & 0x76FD;
        A.lllIllIlllIl[4] = -(0xFFFFD15F & 0x7EE5) & (0xFFFFFEF7 & 0x75EF);
        A.lllIllIlllIl[5] = 2;
    }
}

