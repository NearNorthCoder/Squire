/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=50)
public class EatingTask
extends ZulrahTaskBase {

    private static boolean llIIlIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIIlIIllI(Object object) {
        return object != null;
    }

    static {
        W.llIIlIIIIlIIIII();
        W.llIIlIIIIIlllIl();
    }

    private static boolean llIIlIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var1);
    }

    private static void llIIlIIIIIlllIl() {
        lIllIlIlIllll = new String[lIllIlIllIIll[8]];
        W.lIllIlIlIllll[W.lIllIlIllIIll[0]] = "Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[3]] = "Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[5]] = "Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[6]] = "Eat";
        W.lIllIlIlIllll[W.lIllIlIllIIll[7]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var2;
        W var3;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (W.llIIlIIIIlIlIII(item.hasAction(lIllIlIlIllll[lIllIlIllIIll[7]]::equals) ? 1 : 0) && W.llIIlIIIIlIIlll(item.getId(), lIllIlIllIIll[4])) {
                n2 = lIllIlIllIIll[3];

                if (-(0xF ^ 0x25 ^ (0x36 ^ 0x19)) >= 0) {
                    return ((0xD0 ^ 0xB2 ^ (0x43 ^ 0xE)) & (33 + 1 - 12 + 108 ^ 66 + 119 - 131 + 119 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlIllIIll[0];
            }
            return n2 != 0;
        });
        if (W.llIIlIIIIlIIIIl(item2) && W.llIIlIIIIlIIIIl(item2 = Inventory.getFirst(item -> item.hasAction(lIllIlIlIllll[lIllIlIllIIll[6]]::equals)))) {
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIIll(var3.az.EatingTask().getAnimation(), lIllIlIllIIll[1])) {
            int var4 = Combat.getMissingHealth();
            if (W.llIIlIIIIlIIlII(var4, lIllIlIllIIll[2])) {
                var2.interact(lIllIlIlIllll[lIllIlIllIIll[0]]);
                return lIllIlIllIIll[3];
            }
            return lIllIlIllIIll[0];
        }
        if (W.llIIlIIIIlIIlIl(Combat.getCurrentHealth(), var3.aA.eatAtHP())) {
            var2.interact(lIllIlIlIllll[lIllIlIllIIll[3]]);
            int[] nArray = new int[lIllIlIllIIll[3]];
            nArray[W.lIllIlIllIIll[0]] = lIllIlIllIIll[4];
            Item var4 = Inventory.getFirst((int[])nArray);
            if (W.llIIlIIIIlIIllI(var4) && W.llIIlIIIIlIIlll(var2.getId(), lIllIlIllIIll[4])) {
                var4.interact(lIllIlIlIllll[lIllIlIllIIll[5]]);
            }
            return lIllIlIllIIll[3];
        }
        return lIllIlIllIIll[0];
    }

    private static boolean llIIlIIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected EatingTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIIlIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIIIIlIIlII(int n2, int n3) {
        return n2 > n3;
    }
}

