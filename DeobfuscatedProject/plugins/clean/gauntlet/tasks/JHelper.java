/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum39;
import gg.squire.gauntlet.tasks.GameEnum18;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(priority=5, name="Traversing home")
public class JHelper
extends GauntletTaskBase {

    private static void llllllIIlIIlII() {
        llIIllIIIIII = new String[llIIllIIIIIl[0]];
        J.llIIllIIIIII[J.llIIllIIIIIl[1]] = "No teleport found, walking home.";
        J.llIIllIIIIII[J.llIIllIIIIIl[2]] = "Activate";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_4;
        int n2;
        J var1;
        Player player = Players.getLocal();
        if (J.llllllIIlIIllI(player)) {
            return llIIllIIIIIl[1];
        }
        g var2 = var1.ba.JHelper();
        if (J.llllllIIlIIlll((Object)var2) && J.llllllIIlIlIII(i.CRYSTAL_ORB.aC())) {
            return llIIllIIIIIl[1];
        }
        if (!J.llllllIIlIlIII(var1.ba.N() ? 1 : 0) || J.llllllIIlIlIIl(var1.ba.a(f.TIER_3_STAFF) ? 1 : 0) && J.llllllIIlIlIIl(var1.bB() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];

            if (3 >= (72 + 109 - 70 + 26 ^ 100 + 0 - 38 + 79)) {
                return ((2 ^ (0x88 ^ 0xB0)) & (23 + 91 - -17 + 49 ^ 111 + 61 - 81 + 51 ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        int var3 = n2;
        Item var4 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (J.llllllIIlIlIII(var3) && J.llllllIIlIlIlI(var1.ba.M(), llIIllIIIIIl[3]) && J.llllllIIlIlIII(Inventory.isFull() ? 1 : 0)) {
            return llIIllIIIIIl[1];
        }
        if (J.llllllIIlIIllI(var4)) {
            void var5;
            Log.info((String)llIIllIIIIII[llIIllIIIIIl[1]]);
            return var1.ba.a((l)var1.ba.V().av(), var5.getWorldLocation());
        }
        var4_4.interact(llIIllIIIIII[llIIllIIIIIl[2]]);
        return llIIllIIIIIl[2];
    }

    private static boolean llllllIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean llllllIIlIIllI(Object object) {
        return object == null;
    }

    private static boolean llllllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private boolean bB() {
        int n2;
        if (J.llllllIIlIlIIl(this.ba.h().makeT3Offhand() ? 1 : 0) && J.llllllIIlIlIIl(this.ba.h().goHomeT3() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];

            if (((26 + 82 - 9 + 28 ^ (0xEC ^ 0x80)) & (0xDD ^ 0xA9 ^ (0xF0 ^ 0x97) ^ -1)) >= (110 + 83 - 89 + 55 ^ 105 + 149 - 119 + 20)) {
                return ((0x1E ^ 0x1B ^ (0x19 ^ 0x17)) & (128 + 198 - 191 + 65 ^ 80 + 20 - -33 + 62 ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        return n2 != 0;
    }

    @Inject
    public JHelper(c c2) {
        d[] dArray = new d[llIIllIIIIIl[0]];
        dArray[J.llIIllIIIIIl[1]] = d.DEMI_BOSS_EXPLORE;
        dArray[J.llIIllIIIIIl[2]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

        return String.valueOf(var6);
    }

    static {
        J.llllllIIlIIlIl();
        J.llllllIIlIIlII();
    }

    private static boolean llllllIIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIlIlIII(int n2) {
        return n2 == 0;
    }
}

