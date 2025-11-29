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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Checking net trap", priority=20, blocking=true)
public class CheckingNetTrapTask
extends HunterTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var1;
        p var2;
        Map<WorldPoint, f> map = this.y().h();
        if (p.lIIIlllIIIllIIl(map.isEmpty() ? 1 : 0) && p.lIIIlllIIIllIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlllllIIl[0];
        }
        if (p.lIIIlllIIIllIIl(var2.y().c() ? 1 : 0)) {
            return lllIlllllIIl[0];
        }
        f var3 = null;
        TileObject var4 = var1.keySet().iterator();
        while (p.lIIIlllIIIllIIl(var4.hasNext() ? 1 : 0)) {
            WorldPoint var5 = (WorldPoint)var4.next();
            f var6 = (f)var1.get(var5);
            if (p.lIIIlllIIIllIll((Object)var6.q(), (Object)g.FULL)) {
                var3 = var6;
            }

            return ((0x25 ^ 0x37 ^ (0xD0 ^ 0x98)) & (0x52 ^ 5 ^ (0xA3 ^ 0xAE) ^ -1)) != 0;
        }
        if (p.lIIIlllIIIlllII(var3)) {
            return lllIlllllIIl[0];
        }
        int[] nArray = new int[lllIlllllIIl[1]];
        nArray[p.lllIlllllIIl[0]] = lllIlllllIIl[2];
        nArray[p.lllIlllllIIl[3]] = lllIlllllIIl[4];
        nArray[p.lllIlllllIIl[5]] = lllIlllllIIl[6];
        nArray[p.lllIlllllIIl[7]] = lllIlllllIIl[8];
        nArray[p.lllIlllllIIl[9]] = lllIlllllIIl[10];
        var4 = TileObjects.getNearest((int[])nArray);
        if (p.lIIIlllIIIlllII(var4)) {
            return lllIlllllIIl[0];
        }
        var3_3.interact(lllIlllllIII[lllIlllllIIl[0]]);
        this.sleep(lllIlllllIIl[3]);
        return lllIlllllIIl[3];
    }

    private static void lIIIlllIIIlIlll() {
        lllIlllllIII = new String[lllIlllllIIl[3]];
        p.lllIlllllIII[p.lllIlllllIIl[0]] = "Check";
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
    public CheckingNetTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

