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

/* TASK: Walking to net trap that is changing -> WalkingtonettrapthatischangingTask */
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

    private static String lIIIlllIlIllIIl(String var9, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIIIIllII[2]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llllIIIIllII[3], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        void var10;
        Map<WorldPoint, f> map = this.y().h();
        if (s.lIIIlllIlIlllII(map.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        if (s.lIIIlllIlIlllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        f var7 = null;
        TileObject var6 = var10.keySet().iterator();
        while (s.lIIIlllIlIlllII(var6.hasNext() ? 1 : 0)) {
            WorldPoint var4 = (WorldPoint)var6.next();
            f var8 = (f)var10.get(var4);
            if (s.lIIIlllIlIllllI((Object)var8.q(), (Object)g.TRANSITION)) {
                var7 = var8;
                0;
                if (3 < 3) {
                    return ((0x62 ^ 0x5D ^ (0xA4 ^ 0x97)) & (0x2D ^ 0x1A ^ (0x4B ^ 0x70) ^ -1)) != 0;
                }
            } else if (s.lIIIlllIlIllllI((Object)var8.q(), (Object)g.FULL)) {
                return llllIIIIllII[0];
            }
            0;
            if (-1 < (0xA8 ^ 0xAC)) continue;
            return false;
        }
        if (s.lIIIlllIlIlllll(var7)) {
            return llllIIIIllII[0];
        }
        var6 = TileObjects.getNearest((WorldPoint)var7.o(), tileObject -> tileObject.getName().toLowerCase().contains(llllIIIIlIll[llllIIIIllII[0]]));
        if (s.lIIIlllIlIlllll(var6)) {
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

