/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Cleaning produce", priority=21)
public class CleaningProduceTask
extends FarmerTaskBase {

    private static void lllIlIllIlIlIl() {
        lIlllIIlIIIl = new String[lIlllIIlIIll[4]];
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[1]] = "Clean";
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[2]] = "Clean";
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[3]] = "Clean";
    }

    @Inject
    public CleaningProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIlIllIllIII(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (bd.lllIlIllIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            this.sleep(lIlllIIlIIll[3]);
            return lIlllIIlIIll[1];
        }
        Item var1 = Inventory.getFirst(item -> item.hasAction(lIlllIIlIIIl[lIlllIIlIIll[3]]::equals));
        if (bd.lllIlIllIllIlI(var1)) {
            return lIlllIIlIIll[1];
        }
        bd.a(item -> item.hasAction(lIlllIIlIIIl[lIlllIIlIIll[2]]::equals));

        return lIlllIIlIIll[2];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var2;
        int n2 = lIlllIIlIIll[0];
        Iterator var3 = Inventory.getAll(predicate).iterator();
        while (bd.lllIlIllIlIlll(var3.hasNext() ? 1 : 0)) {
            Item var4 = (Item)var3.next();
            var4.interact(lIlllIIlIIIl[lIlllIIlIIll[1]]);
            if (bd.lllIlIllIllIII((int)(--var2))) {
                return lIlllIIlIIll[2];
            }

            if (-(0xFC ^ 0xAF ^ (0x4D ^ 0x1B)) < 0) continue;
            return ((0x2D ^ 0x1B ^ (0xDA ^ 0xAF)) & (0x2A ^ 0x31 ^ (0x5A ^ 2) ^ -1)) != 0;
        }
        if (bd.lllIlIllIllIIl((int)var2, lIlllIIlIIll[0])) {
            bl = lIlllIIlIIll[2];

            if (3 >= (0x8E ^ 0x9D ^ (0x61 ^ 0x76))) {
                return ((0xC4 ^ 0x8C ^ (0x94 ^ 0x87)) & (55 + 99 - 81 + 138 ^ 131 + 29 - 121 + 97 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIlIIll[1];
        }
        return bl;
    }

        return String.valueOf(var5);
    }

    private static boolean lllIlIllIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIllIllIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bd.lllIlIllIlIllI();
        bd.lllIlIllIlIlIl();
    }
}

