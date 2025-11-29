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

@TaskDesc(name="Looting and burying bones", blocking=true, priority=10000)
public class LootingAndBuryingBonesTask
extends Task {
    private final  SquireScurriusConfig ah;
    private  b c;

    private final  SquireScurrius ag;

    private static boolean lIlIllIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    static {
        u.lIlIllIIlIIlllI();
        u.lIlIllIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var1;
        if (u.lIlIllIIlIIllll(this.ah.lootBigBones() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIIllll(var1.ag.c() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        String[] stringArray = new String[lIIlIllIIIIIl[1]];
        stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[0]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (u.lIlIllIIlIlIIII(var2)) {
            return lIIlIllIIIIIl[0];
        }
        int[] nArray = new int[lIIlIllIIIIIl[1]];
        nArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIIl[2];
        Item var3 = Inventory.getFirst((int[])nArray);
        if (u.lIlIllIIlIlIIII(var3)) {
            var3.interact(lIIlIllIIIIII[lIIlIllIIIIIl[1]]);
            return lIIlIllIIIIIl[1];
        }
        TileItem var4 = TileItems.getNearest(tileItem -> tileItem.getName().equals(lIIlIllIIIIII[lIIlIllIIIIIl[7]]));
        if (u.lIlIllIIlIlIIIl(var4)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
            Item var5 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (u.lIlIllIIlIlIIII(var5)) {
                var5.interact(lIIlIllIIIIII[lIIlIllIIIIIl[3]]);
                return lIIlIllIIIIIl[1];
            }
            Item var6 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIllIIIIIl[1]];
                stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[6]];
                return item.hasAction(stringArray);
            });
            if (u.lIlIllIIlIlIIIl(var6)) {
                var1.ag.e(lIIlIllIIIIIl[1]);
                return lIIlIllIIIIIl[0];
            }
            var6.interact(lIIlIllIIIIII[lIIlIllIIIIIl[4]]);
            return lIIlIllIIIIIl[1];
        }
        var3_3.interact(lIIlIllIIIIII[lIIlIllIIIIIl[5]]);
        return lIIlIllIIIIIl[1];
    }

    private static boolean lIlIllIIlIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public LootingAndBuryingBonesTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ah = squireScurriusConfig;
        this.ag = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIlIIllIl() {
        lIIlIllIIIIII = new String[lIIlIllIIIIIl[8]];
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[0]] = "Scurrius";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[1]] = "Bury";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[3]] = "Drop";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[4]] = "Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[5]] = "Take";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[6]] = "Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[7]] = "Big bones";
    }

    private static boolean lIlIllIIlIlIIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var7);
    }

    private static boolean lIlIllIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

