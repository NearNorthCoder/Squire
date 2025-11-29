/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.combat.tasks.DHelper;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Looting", priority=10, blocking=true)
public class LootingTask
extends Task {
    
    private final  SquireBlueDragonKiller F;

    private static void llIlIIIlIlIIIl() {
        lIIlllIlllII = new String[lIIlllIlllIl[3]];
        j.lIIlllIlllII[j.lIIlllIlllIl[0]] = "Eat";
        j.lIIlllIlllII[j.lIIlllIlllIl[1]] = "Take";
        j.lIIlllIlllII[j.lIIlllIlllIl[2]] = "Eat";
    }

    public boolean run() {
        j var1;
        if (j.llIlIIIlIlIIll(this.F.c().isEmpty() ? 1 : 0)) {
            return lIIlllIlllIl[0];
        }
        if (j.llIlIIIlIlIIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlllIlllIl[1];
        }
        if (j.llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item var2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlllIlllIl[1]];
                stringArray[j.lIIlllIlllIl[0]] = lIIlllIlllII[lIIlllIlllIl[2]];
                return item.hasAction(stringArray);
            });
            if (j.llIlIIIlIlIlII(var2)) {
                var1.F.c().clear();
                return lIIlllIlllIl[0];
            }
            var2.interact(lIIlllIlllII[lIIlllIlllIl[0]]);
            var1.sleep(lIIlllIlllIl[2]);
            return lIIlllIlllIl[1];
        }
        Iterator<d> var2 = var1.F.c().iterator();
        while (j.llIlIIIlIlIIll(var2.hasNext() ? 1 : 0)) {
            d var3 = var2.next();
            int[] nArray = new int[lIIlllIlllIl[1]];
            nArray[j.lIIlllIlllIl[0]] = var3.r();
            TileItem var4 = TileItems.getFirstAt((WorldPoint)var3.o(), (int[])nArray);
            if (j.llIlIIIlIlIlII(var4)) {
                var1.F.c().remove(var3);

                if ((0x64 ^ 0x60) >= 1) break;
                return false;
            }
            if (j.llIlIIIlIlIIll(var1.a(var4) ? 1 : 0)) {
                var4.interact(lIIlllIlllII[lIIlllIlllIl[1]]);
                return lIIlllIlllIl[1];
            }

            if (3 >= -1) continue;
            return false;
        }
        return lIIlllIlllIl[0];
    }

    private static boolean llIlIIIlIlIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIlIlIlII(Object object) {
        return object == null;
    }

    @Inject
    public LootingTask(SquireBlueDragonKiller squireBlueDragonKiller) {
        this.F = squireBlueDragonKiller;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(TileItem tileItem) {
        boolean bl;
        block3: {
            block2: {
                if (!j.llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) break block2;
                if (!j.llIlIIIlIlIIll(tileItem.isStackable() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIlllIlllIl[1]];
                nArray[j.lIIlllIlllIl[0]] = tileItem.getId();
                if (!j.llIlIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            bl = lIIlllIlllIl[1];

            if (-1 <= 0) return bl;
            return ((0x3B ^ 0x64 ^ (0xC5 ^ 0x80)) & (0xD8 ^ 0xC2 ^ (0x5D ^ 0x67) & ~(0x55 ^ 0x6F) ^ -1)) != 0;
        }
        bl = lIIlllIlllIl[0];
        return bl;
    }

    static {
        j.llIlIIIlIlIIlI();
        j.llIlIIIlIlIIIl();
    }
}

