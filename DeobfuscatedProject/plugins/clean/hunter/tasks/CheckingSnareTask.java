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
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import gg.squire.hunter.tasks.GameEnum9;
import gg.squire.hunter.tasks.HunterTaskBase;
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
public class CheckingSnareTask
extends HunterTaskBase {

    private static boolean lIIIllIllIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var1;
        Map<WorldPoint, f> map = this.y().h();
        if (!A.lIIIllIllIIIlIl(map.isEmpty() ? 1 : 0) || !A.lIIIllIllIIIlIl(Players.getLocal().isAnimating() ? 1 : 0) || A.lIIIllIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lllIllIlllIl[0];
        }
        f var2 = null;
        TileObject var3 = var1.keySet().iterator();
        while (A.lIIIllIllIIIllI(var3.hasNext() ? 1 : 0)) {
            WorldPoint var4 = (WorldPoint)var3.next();
            f var5 = (f)var1.get(var4);
            if (A.lIIIllIllIIIlll((Object)var5.q(), (Object)g.FULL)) {
                var2 = var5;
            }

            if (2 > ((0x13 ^ 0x14) & ~(0x76 ^ 0x71))) continue;
            return false;
        }
        if (A.lIIIllIllIIlIII(var2)) {
            return lllIllIlllIl[0];
        }
        var3 = TileObjects.getNearest(tileObject -> {
            boolean bl;
            if (!A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[2]) || !A.lIIIllIllIIlIIl(tileObject.getId(), lllIllIlllIl[3]) || A.lIIIllIllIIlIlI(tileObject.getId(), lllIllIlllIl[4])) {
                bl = lllIllIlllIl[1];

                if (((0x92 ^ 0xC4) & ~(0x38 ^ 0x6E)) >= 2) {
                    return false;
                }
            } else {
                bl = lllIllIlllIl[0];
            }
            return bl;
        });
        if (A.lIIIllIllIIlIII(var3)) {
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
    public CheckingSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void lIIIllIllIIIIll() {
        lllIllIlllII = new String[lllIllIlllIl[1]];
        A.lllIllIlllII[A.lllIllIlllIl[0]] = "Check";
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

}

