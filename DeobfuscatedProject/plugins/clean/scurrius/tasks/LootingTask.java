/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.scurrius.tasks.BHelper;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class LootingTask
extends Task {
    private final  SquireScurriusConfig aj;

    private  b c;
    private final  SquireScurrius ai;

    private static boolean lIlIllIIIIllllI(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public LootingTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.aj = squireScurriusConfig;
        this.ai = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIIIllIlI() {
        lIIlIlIlIlllI = new String[lIIlIlIlIllll[5]];
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[0]] = "Scurrius";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[1]] = "Drop";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[2]] = "Eat";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[3]] = "Take";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[4]] = "Eat";
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIllIIIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        v.lIlIllIIIIllIll();
        v.lIlIllIIIIllIlI();
    }

    private static boolean lIlIllIIIIlllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem var2;
        v var3;
        if (v.lIlIllIIIIlllII(this.ai.c() ? 1 : 0)) {
            return lIIlIlIlIllll[0];
        }
        String[] stringArray = new String[lIIlIlIlIllll[1]];
        stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[0]];
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (v.lIlIllIIIIlllIl(var4)) {
            return lIIlIlIlIllll[0];
        }
        TileItem var5 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (!v.lIlIllIIIIlllII(d.v.contains(tileItem.getName()) ? 1 : 0) || v.lIlIllIIIIlllll(this.aj.lootBoosting() ? 1 : 0) && v.lIlIllIIIIlllll(d.y.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIlIlIlIllll[1];

                if (-(0x5E ^ 0x5A ^ (0x94 ^ 0x88) & ~(0x76 ^ 0x6A)) > 0) {
                    return ((0xCE ^ 0xA0 ^ (0xAD ^ 0x86)) & (193 + 80 - 219 + 146 ^ 27 + 113 - 107 + 108 ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlIlIllll[0];
            }
            return bl;
        });
        if (v.lIlIllIIIIllllI(var5)) {
            var2 = TileItems.getNearest(tileItem -> d.w.contains(tileItem.getName()));
            if (!v.lIlIllIIIIlllIl(var2) || v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                return lIIlIlIlIllll[0];
            }
            var5 = var2;
        }
        if (v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            var2 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (v.lIlIllIIIIlllIl(var2)) {
                var2.interact(lIIlIlIlIlllI[lIIlIlIlIllll[1]]);
                return lIIlIlIlIllll[1];
            }
            Item var6 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIlIlIllll[1]];
                stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[4]];
                return item.hasAction(stringArray);
            });
            if (v.lIlIllIIIIllllI(var6)) {
                var3.ai.e(lIIlIlIlIllll[1]);
                return lIIlIlIlIllll[0];
            }
            var6.interact(lIIlIlIlIlllI[lIIlIlIlIllll[2]]);
            return lIIlIlIlIllll[1];
        }
        var2_2.interact(lIIlIlIlIlllI[lIIlIlIlIllll[3]]);
        return lIIlIlIlIllll[1];
    }
}

