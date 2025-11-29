/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
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

@TaskDesc(name="Walking to net trap that is changing", priority=-1)
public class s
extends j {
    private static /* synthetic */ int[] llllIIIIllII;
    private static /* synthetic */ String[] llllIIIIlIll;

    static {
        s.lIIIlllIlIllIll();
        s.lIIIlllIlIllIlI();
    }

    private static void lIIIlllIlIllIll() {
        llllIIIIllII = new int[4];
        s.llllIIIIllII[0] = (7 ^ 9) & ~(0x6A ^ 0x64);
        s.llllIIIIllII[1] = 1;
        s.llllIIIIllII[2] = 0x99 ^ 0x91;
        s.llllIIIIllII[3] = 2;
    }

    @Inject
    public s(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

    private static String lIIIlllIlIllIIl(String lllllllllllllllIIlIllIIlllIlIIlI, String lllllllllllllllIIlIllIIlllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIIllII[2]), "DES");
            Cipher lllllllllllllllIIlIllIIlllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlllIlIlII.init(llllIIIIllII[3], lllllllllllllllIIlIllIIlllIlIlIl);
            return new String(lllllllllllllllIIlIllIIlllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlllIlIIll) {
            lllllllllllllllIIlIllIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIlllll(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIlIllIlI() {
        llllIIIIlIll = new String[llllIIIIllII[1]];
        s.llllIIIIlIll[s.llllIIIIllII[0]] = s."tree";
    }

    private static boolean lIIIlllIlIllllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void lllllllllllllllIIlIllIIlllIllllI;
        Map<WorldPoint, f> map = this.y().h();
        if (s.lIIIlllIlIlllII(map.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        if (s.lIIIlllIlIlllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        f lllllllllllllllIIlIllIIlllIlllIl = null;
        TileObject lllllllllllllllIIlIllIIlllIlllII = lllllllllllllllIIlIllIIlllIllllI.keySet().iterator();
        while (s.lIIIlllIlIlllII(lllllllllllllllIIlIllIIlllIlllII.hasNext() ? 1 : 0)) {
            WorldPoint lllllllllllllllIIlIllIIlllIllIll = (WorldPoint)lllllllllllllllIIlIllIIlllIlllII.next();
            f lllllllllllllllIIlIllIIlllIllIlI = (f)lllllllllllllllIIlIllIIlllIllllI.get(lllllllllllllllIIlIllIIlllIllIll);
            if (s.lIIIlllIlIllllI((Object)lllllllllllllllIIlIllIIlllIllIlI.q(), (Object)g.TRANSITION)) {
                lllllllllllllllIIlIllIIlllIlllIl = lllllllllllllllIIlIllIIlllIllIlI;
                0;
                if (3 < 3) {
                    return ((0x62 ^ 0x5D ^ (0xA4 ^ 0x97)) & (0x2D ^ 0x1A ^ (0x4B ^ 0x70) ^ -1)) != 0;
                }
            } else if (s.lIIIlllIlIllllI((Object)lllllllllllllllIIlIllIIlllIllIlI.q(), (Object)g.FULL)) {
                return llllIIIIllII[0];
            }
            0;
            if (-1 < (0xA8 ^ 0xAC)) continue;
            return ((0xC9 ^ 0xAB) & ~(0xE5 ^ 0x87)) != 0;
        }
        if (s.lIIIlllIlIlllll(lllllllllllllllIIlIllIIlllIlllIl)) {
            return llllIIIIllII[0];
        }
        lllllllllllllllIIlIllIIlllIlllII = TileObjects.getNearest((WorldPoint)lllllllllllllllIIlIllIIlllIlllIl.o(), tileObject -> tileObject.getName().toLowerCase().contains(llllIIIIlIll[llllIIIIllII[0]]));
        if (s.lIIIlllIlIlllll(lllllllllllllllIIlIllIIlllIlllII)) {
            return llllIIIIllII[0];
        }
        LocalPoint localPoint = var3_3.getLocalLocation();
        Movement.setDestination((int)localPoint.getSceneX(), (int)localPoint.getSceneY());
        return llllIIIIllII[1];
    }

    private static boolean lIIIlllIlIlllII(int n2) {
        return n2 != 0;
    }
}

