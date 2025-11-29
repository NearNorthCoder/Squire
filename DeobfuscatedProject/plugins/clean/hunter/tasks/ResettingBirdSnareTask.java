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

@TaskDesc(name="Resetting bird snare", priority=15, blocking=true)
public class ResettingBirdSnareTask
extends HunterTaskBase {

    private static boolean lIIIlllIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ResettingBirdSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static boolean lIIIlllIlIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var1;
        Map<WorldPoint, f> map = this.y().h();
        if (!B.lIIIlllIlIlIlIl(map.isEmpty() ? 1 : 0) || !B.lIIIlllIlIlIlIl(Players.getLocal().isAnimating() ? 1 : 0) || B.lIIIlllIlIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIIIlIlI[0];
        }
        f var2 = null;
        TileObject var3 = var1.keySet().iterator();
        while (B.lIIIlllIlIlIllI(var3.hasNext() ? 1 : 0)) {
            WorldPoint var4 = (WorldPoint)var3.next();
            f var5 = (f)var1.get(var4);
            if (B.lIIIlllIlIlIlll((Object)var5.q(), (Object)g.EMPTY)) {
                var2 = var5;
            }

            if (3 >= 3) continue;
            return ((0x54 ^ 1 ^ (0xA8 ^ 0xB0)) & (0x6C ^ 0x49 ^ (0x1A ^ 0x72) ^ -1)) != 0;
        }
        if (B.lIIIlllIlIllIII(var2)) {
            return llllIIIIlIlI[0];
        }
        int[] nArray = new int[llllIIIIlIlI[1]];
        nArray[B.llllIIIIlIlI[0]] = llllIIIIlIlI[2];
        var3 = TileObjects.getNearest((int[])nArray);
        if (B.lIIIlllIlIllIII(var3)) {
            return llllIIIIlIlI[0];
        }
        var3_3.interact(llllIIIIlIIl[llllIIIIlIlI[0]]);
        return llllIIIIlIlI[1];
    }

    private static boolean lIIIlllIlIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIlIllIII(Object object) {
        return object == null;
    }

    static {
        B.lIIIlllIlIlIlII();
        B.lIIIlllIlIlIIll();
    }

    private static void lIIIlllIlIlIIll() {
        llllIIIIlIIl = new String[llllIIIIlIlI[1]];
        B.llllIIIIlIIl[B.llllIIIIlIlI[0]] = "Dismantle";
    }

}

