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
public class WalkingToNetTrapThatIsChangingTask
extends HunterTaskBase {

    static {
        s.lIIIlllIlIllIll();
        s.lIIIlllIlIllIlI();
    }

    @Inject
    public WalkingToNetTrapThatIsChangingTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

    private static boolean lIIIlllIlIlllll(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIlIllIlI() {
        llllIIIIlIll = new String[llllIIIIllII[1]];
        s.llllIIIIlIll[s.llllIIIIllII[0]] = "tree";
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
        void var1;
        Map<WorldPoint, f> map = this.y().h();
        if (s.lIIIlllIlIlllII(map.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        if (s.lIIIlllIlIlllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        f var2 = null;
        TileObject var3 = var1.keySet().iterator();
        while (s.lIIIlllIlIlllII(var3.hasNext() ? 1 : 0)) {
            WorldPoint var4 = (WorldPoint)var3.next();
            f var5 = (f)var1.get(var4);
            if (s.lIIIlllIlIllllI((Object)var5.q(), (Object)g.TRANSITION)) {
                var2 = var5;

                if (3 < 3) {
                    return ((0x62 ^ 0x5D ^ (0xA4 ^ 0x97)) & (0x2D ^ 0x1A ^ (0x4B ^ 0x70) ^ -1)) != 0;
                }
            } else if (s.lIIIlllIlIllllI((Object)var5.q(), (Object)g.FULL)) {
                return llllIIIIllII[0];
            }

            if (-1 < (0xA8 ^ 0xAC)) continue;
            return false;
        }
        if (s.lIIIlllIlIlllll(var2)) {
            return llllIIIIllII[0];
        }
        var3 = TileObjects.getNearest((WorldPoint)var2.o(), tileObject -> tileObject.getName().toLowerCase().contains(llllIIIIlIll[llllIIIIllII[0]]));
        if (s.lIIIlllIlIlllll(var3)) {
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

