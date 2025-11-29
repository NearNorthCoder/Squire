/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Overload", priority=30000)
public class DrinkOverloadTask
extends Task {
    private final  SquireChambersPlugin cA;

    private final  SquireChambersConfig cB;

    private static boolean llIlIlllllllll(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var1);
    }

    private static boolean llIlIllllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private boolean cu() {
        ab var2;
        if (ab.llIlIlllllIllI(Players.getLocal().getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        n var3 = var2.cA.L();
        if (ab.llIlIlllllIlll(var3)) {
            return lIlIIlIIIIIl[0];
        }
        List<N> var4 = var2.cA.C().e();
        int var5 = lIlIIlIIIIIl[0];
        int var6 = lIlIIlIIIIIl[0];
        while (ab.llIlIlllllllII(var6, var4.size())) {
            N var7 = var4.get(var6);
            if (ab.llIlIlllllllIl((Object)var7) && ab.llIlIllllllllI((Object)var7, (Object)N.SCAVENGERS) && ab.llIlIllllllllI((Object)var7, (Object)N.CRABS) && ab.llIlIllllllllI((Object)var7, (Object)N.END) && ab.llIlIllllllllI((Object)var7, (Object)N.START) && ab.llIlIllllllllI((Object)var7, (Object)N.FARMING)) {
                if (ab.llIlIlllllllll((Object)var7, (Object)N.THIEVING)) {

                    if (1 < 0) {
                        return ((0x6C ^ 0xE ^ (6 ^ 0x32)) & (0x7E ^ 0x75 ^ (0xEE ^ 0xB3) ^ -1)) != 0;
                    }
                } else {
                    if (ab.llIlIllllllIll(var5) && ab.llIlIllllllIll(var2.cA.C().a(var7) ? 1 : 0)) {
                        return lIlIIlIIIIIl[3];
                    }
                    if (ab.llIlIlllllllll((Object)var7, (Object)var3.aM())) {
                        var5 = lIlIIlIIIIIl[3];
                    }
                }
            }
            ++var6;

            if (-1 == -1) continue;
            return ((0x7A ^ 0x77 ^ (0x35 ^ 0x3E)) & (0xE3 ^ 0xC0 ^ (0x86 ^ 0xA3) ^ -1)) != 0;
        }
        return lIlIIlIIIIIl[0];
    }

    private static boolean llIlIllllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllllIlll(Object object) {
        return object == null;
    }

    private static boolean llIlIllllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ab.llIlIlllllIllI(this.ct() ? 1 : 0) && ab.llIlIlllllIllI(this.cu() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIlIIIIII[lIlIIlIIIIIl[6]]));
        if (ab.llIlIlllllIlll(var8)) {
            return lIlIIlIIIIIl[0];
        }
        int var9 = Static.getClient().getVarbitValue(lIlIIlIIIIIl[1]);
        if (ab.llIlIllllllIII(var9)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(Combat.getCurrentHealth(), lIlIIlIIIIIl[2])) {
            return lIlIIlIIIIIl[0];
        }
        var1_1.interact(lIlIIlIIIIII[lIlIIlIIIIIl[0]]);
        return lIlIIlIIIIIl[3];
    }

    private static boolean llIlIllllllllI(Object object, Object object2) {
        return object != object2;
    }

    private static void llIlIlllllIlII() {
        lIlIIlIIIIII = new String[lIlIIlIIIIIl[4]];
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[0]] = "Drink";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[3]] = "Mystical barrier";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[5]] = "Quick-pass";
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[6]] = "Overload";
    }

    private static boolean llIlIlllllllIl(Object object) {
        return object != null;
    }

    private boolean ct() {
        if (ab.llIlIlllllIllI(u.be() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Player var10 = Players.getLocal();
        if (!ab.llIlIllllllIlI(u.bg(), lIlIIlIIIIIl[4]) || ab.llIlIllllllIll(var10.getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ab.llIlIllllllIll(tileObject.getName().contains(lIlIIlIIIIII[lIlIIlIIIIIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIIIl[3]];
                stringArray[ab.lIlIIlIIIIIl[0]] = lIlIIlIIIIII[lIlIIlIIIIIl[5]];
                if (ab.llIlIllllllIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIIIl[3];

                    if (2 == 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIIIl[0];
            return n2 != 0;
        });
        if (ab.llIlIlllllIlll(var11)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(var10.getWorldY(), var11.getWorldY())) {
            return lIlIIlIIIIIl[0];
        }
        return lIlIIlIIIIIl[3];
    }

    @Inject
    public DrinkOverloadTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cA = squireChambersPlugin;
        this.cB = squireChambersConfig;
    }

    static {
        ab.llIlIlllllIlIl();
        ab.llIlIlllllIlII();
    }

    private static boolean llIlIllllllIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllllllII(int n2, int n3) {
        return n2 < n3;
    }
}

