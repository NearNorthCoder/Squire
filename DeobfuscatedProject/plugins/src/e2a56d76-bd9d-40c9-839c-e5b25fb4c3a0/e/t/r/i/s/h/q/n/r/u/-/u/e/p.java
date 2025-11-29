/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Checking net trap", priority=20, blocking=true)
public class p
extends j {
    private static /* synthetic */ String[] lllIlllllIII;
    private static /* synthetic */ int[] lllIlllllIIl;

    private static String lIIIlllIIIlIllI(String lllllllllllllllIIlIllIllIlIIIIII, String lllllllllllllllIIlIllIllIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllIlIIIlII.init(lllIlllllIIl[5], lllllllllllllllIIlIllIllIlIIIlIl);
            return new String(lllllllllllllllIIlIllIllIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIlIIIIll) {
            lllllllllllllllIIlIllIllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIIllIII() {
        lllIlllllIIl = new int[11];
        p.lllIlllllIIl[0] = (0xC5 ^ 0xA6) & ~(0x57 ^ 0x34);
        p.lllIlllllIIl[1] = 149 + 2 - 82 + 118 ^ 164 + 40 - 156 + 142;
        p.lllIlllllIIl[2] = 0xFFFFAF2E & 0x73FD;
        p.lllIlllllIIl[3] = " ".length();
        p.lllIlllllIIl[4] = -(0xFFFFEEAF & 0x5172) & (0xFFFFE37F & 0x7FBB);
        p.lllIlllllIIl[5] = "  ".length();
        p.lllIlllllIIl[6] = -(0xFFFFD8AB & 0x7FF6) & (0xFFFFFAFF & 0x7FBF);
        p.lllIlllllIIl[7] = "   ".length();
        p.lllIlllllIIl[8] = -(0xFFFFF987 & 0x5EFA) & (0xFFFFFBBF & 0x7FE5);
        p.lllIlllllIIl[9] = 5 ^ 1;
        p.lllIlllllIIl[10] = 0xFFFFFEDF & 0xC73D;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void lllllllllllllllIIlIllIllIlIIlllI;
        p lllllllllllllllIIlIllIllIlIIllll;
        Map<WorldPoint, f> map = this.y().h();
        if (p.lIIIlllIIIllIIl(map.isEmpty() ? 1 : 0) && p.lIIIlllIIIllIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlllllIIl[0];
        }
        if (p.lIIIlllIIIllIIl(lllllllllllllllIIlIllIllIlIIllll.y().c() ? 1 : 0)) {
            return lllIlllllIIl[0];
        }
        f lllllllllllllllIIlIllIllIlIIllIl = null;
        TileObject lllllllllllllllIIlIllIllIlIIllII = lllllllllllllllIIlIllIllIlIIlllI.keySet().iterator();
        while (p.lIIIlllIIIllIIl(lllllllllllllllIIlIllIllIlIIllII.hasNext() ? 1 : 0)) {
            WorldPoint lllllllllllllllIIlIllIllIlIIlIll = (WorldPoint)lllllllllllllllIIlIllIllIlIIllII.next();
            f lllllllllllllllIIlIllIllIlIIlIlI = (f)lllllllllllllllIIlIllIllIlIIlllI.get(lllllllllllllllIIlIllIllIlIIlIll);
            if (p.lIIIlllIIIllIll((Object)lllllllllllllllIIlIllIllIlIIlIlI.q(), (Object)g.FULL)) {
                lllllllllllllllIIlIllIllIlIIllIl = lllllllllllllllIIlIllIllIlIIlIlI;
            }
            "".length();
            if (null == null) continue;
            return ((0x25 ^ 0x37 ^ (0xD0 ^ 0x98)) & (0x52 ^ 5 ^ (0xA3 ^ 0xAE) ^ -" ".length())) != 0;
        }
        if (p.lIIIlllIIIlllII(lllllllllllllllIIlIllIllIlIIllIl)) {
            return lllIlllllIIl[0];
        }
        int[] nArray = new int[lllIlllllIIl[1]];
        nArray[p.lllIlllllIIl[0]] = lllIlllllIIl[2];
        nArray[p.lllIlllllIIl[3]] = lllIlllllIIl[4];
        nArray[p.lllIlllllIIl[5]] = lllIlllllIIl[6];
        nArray[p.lllIlllllIIl[7]] = lllIlllllIIl[8];
        nArray[p.lllIlllllIIl[9]] = lllIlllllIIl[10];
        lllllllllllllllIIlIllIllIlIIllII = TileObjects.getNearest((int[])nArray);
        if (p.lIIIlllIIIlllII(lllllllllllllllIIlIllIllIlIIllII)) {
            return lllIlllllIIl[0];
        }
        var3_3.interact(lllIlllllIII[lllIlllllIIl[0]]);
        this.sleep(lllIlllllIIl[3]);
        return lllIlllllIIl[3];
    }

    private static void lIIIlllIIIlIlll() {
        lllIlllllIII = new String[lllIlllllIIl[3]];
        p.lllIlllllIII[p.lllIlllllIIl[0]] = p.lIIIlllIIIlIllI("xWVEYqun/iI=", "SLDjl");
    }

    private static boolean lIIIlllIIIllIll(Object object, Object object2) {
        return object == object2;
    }

    static {
        p.lIIIlllIIIllIII();
        p.lIIIlllIIIlIlll();
    }

    private static boolean lIIIlllIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIIlllII(Object object) {
        return object == null;
    }

    @Inject
    public p(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

