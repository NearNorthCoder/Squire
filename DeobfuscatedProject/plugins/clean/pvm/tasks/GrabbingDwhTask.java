/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Grabbing DWH", priority=100, blocking=true)
public class GrabbingDwhTask
extends Task {
    
    private final  SquireShamanConfig aE;

    private static boolean lIlIlllIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    static {
        y.lIlIlllIIlIIllI();
        y.lIlIlllIIlIIIlI();
    }

    private static boolean lIlIlllIIlIlIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g g2 = this.aE.room();
        Player player = Players.getLocal();
        if (y.lIlIlllIIlIIlll(g2.x().contains((Locatable)player) ? 1 : 0)) {
            return lIIlIlllllllI[0];
        }
        int[] nArray = new int[lIIlIlllllllI[1]];
        nArray[y.lIIlIlllllllI[0]] = lIIlIlllllllI[2];
        nArray[y.lIIlIlllllllI[3]] = lIIlIlllllllI[4];
        TileItem var2 = TileItems.getNearest((int[])nArray);
        if (y.lIlIlllIIlIlIII(var2)) {
            return lIIlIlllllllI[0];
        }
        if (y.lIlIlllIIlIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item var3 = Inventory.getFirst(item -> item.hasAction(lIIlIlllllIll[lIIlIlllllllI[8]]::equals));
            if (y.lIlIlllIIlIlIlI(var3)) {
                var3.interact(lIIlIlllllIll[lIIlIlllllllI[0]]);

                if (1 >= 3) {
                    return false;
                }
            } else {
                Item var4 = Inventory.getFirst(item -> item.hasAction(lIIlIlllllIll[lIIlIlllllllI[7]]::equals));
                if (y.lIlIlllIIlIlIlI(var4)) {
                    var4.interact(lIIlIlllllIll[lIIlIlllllllI[3]]);

                    if (((137 + 43 - 33 + 28 ^ 103 + 1 - 89 + 125) & (49 + 58 - 27 + 76 ^ 105 + 174 - 120 + 32 ^ -1)) != 0) {
                        return ((0xB ^ 0x2C ^ (0x94 ^ 0xBB)) & (0xEE ^ 0x9B ^ (0x36 ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    Item var5 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[lIIlIlllllllI[3]];
                        stringArray[y.lIIlIlllllllI[0]] = lIIlIlllllIll[lIIlIlllllllI[6]];
                        return item.hasAction(stringArray);
                    });
                    if (y.lIlIlllIIlIlIlI(var5)) {
                        var5.interact(lIIlIlllllIll[lIIlIlllllllI[1]]);

                        if (3 != 3) {
                            return ((0x34 ^ 0x7C ^ (0xEF ^ 0x8D)) & (0xDC ^ 0xAF ^ (0x4B ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        return lIIlIlllllllI[0];
                    }
                }
            }
        }
        var3_3.interact(lIIlIlllllIll[lIIlIlllllllI[5]]);
        return lIIlIlllllllI[3];
    }

    private static boolean lIlIlllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIIlIIIlI() {
        lIIlIlllllIll = new String[lIIlIlllllllI[9]];
        y.lIIlIlllllIll[y.lIIlIlllllllI[0]] = "Eat";
        y.lIIlIlllllIll[y.lIIlIlllllllI[3]] = "Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[1]] = "Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[5]] = "Take";
        y.lIIlIlllllIll[y.lIIlIlllllllI[6]] = "Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[7]] = "Drink";
        y.lIIlIlllllIll[y.lIIlIlllllllI[8]] = "Eat";
    }

    @Inject
    public GrabbingDwhTask(SquireShamanConfig squireShamanConfig) {
        this.aE = squireShamanConfig;
    }
}

