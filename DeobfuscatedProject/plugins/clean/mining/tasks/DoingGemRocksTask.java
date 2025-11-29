/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Doing gem rocks", priority=100, blocking=true)
public class DoingGemRocksTask
extends Task {
    
    @Inject
    private  SquireMinerConfig f;
    
    private final  int[] w;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])this.w) ? 1 : 0)) break block2;
                    int[] nArray = new int[llllllIlIlII[3]];
                    nArray[r.llllllIlIlII[1]] = llllllIlIlII[9];
                    if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[llllllIlIlII[3]];
                    nArray2[r.llllllIlIlII[1]] = llllllIlIlII[13];
                    if (!r.lIIlIlIIlIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[llllllIlIlII[3]];
                nArray[r.llllllIlIlII[1]] = llllllIlIlII[10];
                if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[llllllIlIlII[3]];
                nArray3[r.llllllIlIlII[1]] = llllllIlIlII[12];
                if (!r.lIIlIlIIlIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llllllIlIlII[3]];
                nArray4[r.llllllIlIlII[1]] = llllllIlIlII[11];
                if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = llllllIlIlII[3];

            if (-(0xB0 ^ 0xB4) <= 0) return n2 != 0;
            return false;
        }
        n2 = llllllIlIlII[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIIllIl(Object object) {
        return object == null;
    }

    static {
        r.lIIlIlIIlIIlIlI();
        r.lIIlIlIIlIIlIIl();
    }

    private static boolean lIIlIlIIlIIllII(int n2) {
        return n2 != 0;
    }

    private void DoingGemRocksTask() {
        if (r.lIIlIlIIlIIllII(Inventory.contains((int[])this.w) ? 1 : 0)) {
            int[] nArray = new int[llllllIlIlII[3]];
            nArray[r.llllllIlIlII[1]] = llllllIlIlII[9];
            Inventory.getFirst((int[])this.w).useOn(Inventory.getFirst((int[])nArray));

            if ((0xD3 ^ 0xA4 ^ (0x47 ^ 0x34)) < 3) {
                return;
            }
        } else {
            int[] nArray = new int[llllllIlIlII[3]];
            nArray[r.llllllIlIlII[1]] = llllllIlIlII[10];
            int[] nArray2 = new int[llllllIlIlII[5]];
            nArray2[r.llllllIlIlII[1]] = llllllIlIlII[11];
            nArray2[r.llllllIlIlII[3]] = llllllIlIlII[12];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static void lIIlIlIIlIIlIIl() {
        llllllIlIIll = new String[llllllIlIlII[5]];
        r.llllllIlIIll[r.llllllIlIlII[1]] = "Mine";
        r.llllllIlIIll[r.llllllIlIlII[3]] = "Mine";
    }

    private static boolean lIIlIlIIlIIllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var1;
        if (r.lIIlIlIIlIIlIll((Object)this.f.activity(), (Object)a.GEM_ROCKS)) {
            return llllllIlIlII[1];
        }
        if (r.lIIlIlIIlIIllII(Inventory.isFull() ? 1 : 0)) {
            return llllllIlIlII[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIlIlIIlIIllll(tileObject.getId(), llllllIlIlII[14]) && r.lIIlIlIIlIlIIII(tileObject.getWorldX(), llllllIlIlII[15])) {
                n2 = llllllIlIlII[3];

                if (3 <= 2) {
                    return ((0x6E ^ 0x25 ^ (3 ^ 0x77)) & (0x33 ^ 0x53 ^ (7 ^ 0x58) ^ -1)) != 0;
                }
            } else {
                n2 = llllllIlIlII[1];
            }
            return n2 != 0;
        });
        if (r.lIIlIlIIlIIllIl(var2)) {
            return llllllIlIlII[1];
        }
        WorldPoint var3 = var2.getWorldLocation();
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (r.lIIlIlIIlIIllII(var4.toWorldArea().isInMeleeDistance(var3) ? 1 : 0)) {
            var2.interact(llllllIlIIll[llllllIlIlII[1]]);
            return llllllIlIlII[3];
        }
        if (r.lIIlIlIIlIIllII(var1.n() ? 1 : 0)) {
            var1.DoingGemRocksTask();
        }
        var1_1.interact(llllllIlIIll[llllllIlIlII[3]]);
        this.sleep(llllllIlIlII[3]);
        return llllllIlIlII[3];
    }

    private static boolean lIIlIlIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlIIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public DoingGemRocksTask() {
        int[] nArray = new int[llllllIlIlII[0]];
        nArray[r.llllllIlIlII[1]] = llllllIlIlII[2];
        nArray[r.llllllIlIlII[3]] = llllllIlIlII[4];
        nArray[r.llllllIlIlII[5]] = llllllIlIlII[6];
        nArray[r.llllllIlIlII[7]] = llllllIlIlII[8];
        this.w = nArray;
    }

    private static boolean lIIlIlIIlIIlllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }
}

