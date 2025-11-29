/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Dropping some fish", blocking=true, priority=10)
public class DroppingSomeFishTask
extends GauntletTaskBase {

    private static boolean lllllllIlIlIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        D var2;
        Player player = Players.getLocal();
        if (!D.lllllllIlIIlll(this.ba.A() ? 1 : 0) || !D.lllllllIlIIlll(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) || D.lllllllIlIIlll(player.isMoving() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (D.lllllllIlIlIII(var2.ba.V().av().e(var1.getWorldLocation()) ? 1 : 0)) {
            var2.ba.a((l)var2.ba.V().av(), var1.getWorldLocation());

            return llIIlllIIIII[2];
        }
        List<Item> var3 = var2.ba.b(i.FISH);
        if (D.lllllllIlIIlll(var3.isEmpty() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        h var4 = var2.ba.V();
        int var5 = llIIlllIIIII[3];
        int var6 = llIIlllIIIII[1];
        Iterator<Item> var7 = var3.iterator();
        while (D.lllllllIlIIlll(var7.hasNext() ? 1 : 0)) {
            Item var8 = var7.next();
            if (D.lllllllIlIlIIl(++var6, llIIlllIIIII[3])) {
                return llIIlllIIIII[2];
            }
            var8.interact(llIIllIlllll[llIIlllIIIII[1]]);
            var4.av().k(llIIlllIIIII[2]);

            if (((184 + 154 - 223 + 85 ^ 139 + 15 - 27 + 28) & (0x6D ^ 0x3C ^ 2 ^ -1)) == 0) continue;
            return ((0x2E ^ 0x21 ^ (0x97 ^ 0x93)) & (0x63 ^ 0x48 ^ (0x60 ^ 0x40) ^ -1)) != 0;
        }
        return llIIlllIIIII[1];
    }

    @Inject
    public DroppingSomeFishTask(c c2) {
        d[] dArray = new d[llIIlllIIIII[0]];
        dArray[D.llIIlllIIIII[1]] = d.FIRST_ROTATION_CREATE;
        dArray[D.llIIlllIIIII[2]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

    private static boolean lllllllIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllllIlIIlIl() {
        llIIllIlllll = new String[llIIlllIIIII[2]];
        D.llIIllIlllll[D.llIIlllIIIII[1]] = "T";
    }

    static {
        D.lllllllIlIIllI();
        D.lllllllIlIIlIl();
    }

    private static boolean lllllllIlIIlll(int n2) {
        return n2 != 0;
    }

}

