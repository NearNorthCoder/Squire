/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Doing ardy rocks", priority=100, blocking=true)
public class DoingArdyRocksTask
extends Task {

    private final  int[] O;
    @Inject
    private  SquireMinerConfig f;

    private static boolean lIIlIlIlIIIIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var1;
        if (y.lIIlIlIlIIIIlII((Object)this.f.activity(), (Object)a.ARDY_IRON)) {
            return lllllllIIIll[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIIlIlIlIIIIllI(List.of(Integer.valueOf(lllllllIIIll[15]), Integer.valueOf(lllllllIIIll[16])).contains(tileObject.getId()) ? 1 : 0) && y.lIIlIlIlIIIIlll(tileObject.getWorldX(), lllllllIIIll[17])) {
                n2 = lllllllIIIll[3];

                if (3 < 0) {
                    return false;
                }
            } else {
                n2 = lllllllIIIll[1];
            }
            return n2 != 0;
        });
        if (y.lIIlIlIlIIIIlIl(var2)) {
            return lllllllIIIll[1];
        }
        WorldPoint var3 = var2.getWorldLocation();
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (y.lIIlIlIlIIIIllI(var4.toWorldArea().isInMeleeDistance(var3) ? 1 : 0)) {
            var2.interact(lllllllIIIlI[lllllllIIIll[1]]);
            return lllllllIIIll[3];
        }
        int[] nArray = new int[lllllllIIIll[3]];
        nArray[y.lllllllIIIll[1]] = lllllllIIIll[9];
        int var5 = Inventory.getCount((int[])nArray);
        if (y.lIIlIlIlIIIIlll(var5, lllllllIIIll[3])) {
            int[] nArray2 = new int[lllllllIIIll[3]];
            nArray2[y.lllllllIIIll[1]] = lllllllIIIll[9];
            Inventory.getAll((int[])nArray2).subList(lllllllIIIll[1], Math.min(lllllllIIIll[7], var5)).forEach(Item::drop);
        }
        if (y.lIIlIlIlIIIIllI(var1.n() ? 1 : 0)) {
            var1.r();
        }
        var1_1.interact(lllllllIIIlI[lllllllIIIll[3]]);
        this.sleep(lllllllIIIll[3]);
        return lllllllIIIll[3];
    }

    private static boolean lIIlIlIlIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.lIIlIlIlIIIIIll();
        y.lIIlIlIlIIIIIlI();
    }

    public DoingArdyRocksTask() {
        int[] nArray = new int[lllllllIIIll[0]];
        nArray[y.lllllllIIIll[1]] = lllllllIIIll[2];
        nArray[y.lllllllIIIll[3]] = lllllllIIIll[4];
        nArray[y.lllllllIIIll[5]] = lllllllIIIll[6];
        nArray[y.lllllllIIIll[7]] = lllllllIIIll[8];
        this.O = nArray;
    }

    private static boolean lIIlIlIlIIIlIII(int n2) {
        return n2 == 0;
    }

    private void r() {
        if (y.lIIlIlIlIIIIllI(Inventory.contains((int[])this.O) ? 1 : 0)) {
            int[] nArray = new int[lllllllIIIll[3]];
            nArray[y.lllllllIIIll[1]] = lllllllIIIll[10];
            Inventory.getFirst((int[])this.O).useOn(Inventory.getFirst((int[])nArray));

            if (((0x3F ^ 0x1E) & ~(0x65 ^ 0x44)) != 0) {
                return;
            }
        } else {
            int[] nArray = new int[lllllllIIIll[3]];
            nArray[y.lllllllIIIll[1]] = lllllllIIIll[11];
            int[] nArray2 = new int[lllllllIIIll[5]];
            nArray2[y.lllllllIIIll[1]] = lllllllIIIll[12];
            nArray2[y.lllllllIIIll[3]] = lllllllIIIll[13];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean lIIlIlIlIIIIlIl(Object object) {
        return object == null;
    }

        return String.valueOf(var6);
    }

    private static boolean lIIlIlIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])this.O) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllllIIIll[3]];
                    nArray[y.lllllllIIIll[1]] = lllllllIIIll[10];
                    if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllllIIIll[3]];
                    nArray2[y.lllllllIIIll[1]] = lllllllIIIll[14];
                    if (!y.lIIlIlIlIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllllIIIll[3]];
                nArray[y.lllllllIIIll[1]] = lllllllIIIll[11];
                if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllllIIIll[3]];
                nArray3[y.lllllllIIIll[1]] = lllllllIIIll[13];
                if (!y.lIIlIlIlIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllllIIIll[3]];
                nArray4[y.lllllllIIIll[1]] = lllllllIIIll[12];
                if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllllIIIll[3];

            if (null == null) return n2 != 0;
            return ((0x6F ^ 0x4F ^ (0xD ^ 0x37)) & (142 + 162 - 142 + 29 ^ 26 + 21 - 24 + 142 ^ -1)) != 0;
        }
        n2 = lllllllIIIll[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIlIIIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIlIIIIIlI() {
        lllllllIIIlI = new String[lllllllIIIll[5]];
        y.lllllllIIIlI[y.lllllllIIIll[1]] = "Mine";
        y.lllllllIIIlI[y.lllllllIIIll[3]] = "Mine";
    }

}

