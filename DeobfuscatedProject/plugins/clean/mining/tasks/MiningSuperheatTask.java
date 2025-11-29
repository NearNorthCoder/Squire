/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining (Superheat)", priority=100, blocking=true)
public class MiningSuperheatTask
extends Task {
    @Inject
    private  SquireMinerConfig f;
    
    private  SquireMiner l;
    
    private final  int[] ao;
    private static final  int an;

    private static boolean lIIlIIlIlIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    private void r() {
        if (L.lIIlIIlIlIlIIlI(Inventory.contains((int[])this.ao) ? 1 : 0)) {
            int[] nArray = new int[lllllIIlIIIl[3]];
            nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[14];
            Inventory.getFirst((int[])this.ao).useOn(Inventory.getFirst((int[])nArray));

            if ((116 + 42 - 87 + 101 ^ 7 + 162 - 58 + 57) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lllllIIlIIIl[3]];
            nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[15];
            int[] nArray2 = new int[lllllIIlIIIl[5]];
            nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[16];
            nArray2[L.lllllIIlIIIl[3]] = lllllIIlIIIl[17];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean lIIlIIlIlIlIIll(Object object) {
        return object != null;
    }

    static {
        L.lIIlIIlIlIlIIII();
        L.lIIlIIlIlIIllll();
        an = lllllIIlIIIl[11];
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
                    if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])this.ao) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllIIlIIIl[3]];
                    nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[14];
                    if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllIIlIIIl[3]];
                    nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[18];
                    if (!L.lIIlIIlIlIlIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllIIlIIIl[3]];
                nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[15];
                if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllIIlIIIl[3]];
                nArray3[L.lllllIIlIIIl[1]] = lllllIIlIIIl[17];
                if (!L.lIIlIIlIlIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllIIlIIIl[3]];
                nArray4[L.lllllIIlIIIl[1]] = lllllIIlIIIl[16];
                if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllIIlIIIl[3];

            if ((0xBB ^ 0xBE) != 0) return n2 != 0;
            return false;
        }
        n2 = lllllIIlIIIl[1];
        return n2 != 0;
    }

    private static boolean lIIlIIlIlIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlIlIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        L var2;
        if (L.lIIlIIlIlIlIIIl((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return lllllIIlIIIl[1];
        }
        if (L.lIIlIIlIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
            return lllllIIlIIIl[1];
        }
        if (L.lIIlIIlIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
            return lllllIIlIIIl[1];
        }
        Player var3 = Players.getLocal();
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.lIIlIIlIlIlIIlI(List.of(Integer.valueOf(lllllIIlIIIl[21]), Integer.valueOf(lllllIIlIIIl[22])).contains(tileObject.getId()) ? 1 : 0) && L.lIIlIIlIlIllIIl(tileObject.getWorldY(), lllllIIlIIIl[23])) {
                n2 = lllllIIlIIIl[3];

                if (-(62 + 31 - 40 + 88 ^ 99 + 24 - 116 + 130) >= 0) {
                    return ((0xAE ^ 0xA9 ^ (0xA3 ^ 0xBB)) & (0x7C ^ 0x44 ^ (0x42 ^ 0x65) ^ -1)) != 0;
                }
            } else {
                n2 = lllllIIlIIIl[1];
            }
            return n2 != 0;
        });
        if (!L.lIIlIIlIlIlIIll(var4) || L.lIIlIIlIlIlIlII(var4.distanceTo(var3.getWorldLocation()), lllllIIlIIIl[9])) {
            Item var5 = Equipment.getFirst(item -> item.getName().contains(lllllIIlIIII[lllllIIlIIIl[20]]));
            if (L.lIIlIIlIlIlIlIl(var5)) {
                var5 = Inventory.getFirst(item -> item.getName().contains(lllllIIlIIII[lllllIIlIIIl[19]]));
            }
            if (L.lIIlIIlIlIlIlIl(var5)) {
                Log.info((String)lllllIIlIIII[lllllIIlIIIl[1]]);
                return lllllIIlIIIl[1];
            }
            String[] stringArray = new String[lllllIIlIIIl[5]];
            stringArray[L.lllllIIlIIIl[1]] = lllllIIlIIII[lllllIIlIIIl[3]];
            stringArray[L.lllllIIlIIIl[3]] = lllllIIlIIII[lllllIIlIIIl[5]];
            var5.interact(stringArray);
            var2.sleep(lllllIIlIIIl[7]);
            return lllllIIlIIIl[3];
        }
        if (L.lIIlIIlIlIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Log.info((String)lllllIIlIIII[lllllIIlIIIl[7]]);
            Movement.toggleRun();
        }
        int[] nArray = new int[lllllIIlIIIl[3]];
        nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[10];
        Item var5 = Inventory.getFirst((int[])nArray);
        SpellBook.Standard var6 = SpellBook.Standard.SUPERHEAT_ITEM;
        if (L.lIIlIIlIlIlIIll(var5) && L.lIIlIIlIlIlIlll(var3.getAnimation(), lllllIIlIIIl[11])) {
            if (L.lIIlIIlIlIlIllI(var6.canCast() ? 1 : 0)) {
                Log.info((String)lllllIIlIIII[lllllIIlIIIl[0]]);
                var2.l.forceStop();
            }
            int[] nArray2 = new int[lllllIIlIIIl[3]];
            nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[10];
            var6.castOn((Interactable)Inventory.getFirst((int[])nArray2));
        }
        WorldPoint var7 = var4.getWorldLocation();
        WorldPoint var8 = Players.getLocal().getWorldLocation();
        if (L.lIIlIIlIlIlIIlI(var8.toWorldArea().isInMeleeDistance(var7) ? 1 : 0)) {
            var4.interact(lllllIIlIIII[lllllIIlIIIl[12]]);
            var2.sleep(lllllIIlIIIl[3]);
            return lllllIIlIIIl[3];
        }
        if (L.lIIlIIlIlIlIIlI(var2.n() ? 1 : 0) && L.lIIlIIlIlIllIII(var3.distanceTo((Locatable)var4), lllllIIlIIIl[7])) {
            var2.r();
        }
        var2_2.interact(lllllIIlIIII[lllllIIlIIIl[13]]);
        this.sleep(lllllIIlIIIl[3]);
        return lllllIIlIIIl[3];
    }

    private static boolean lIIlIIlIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    public MiningSuperheatTask() {
        int[] nArray = new int[lllllIIlIIIl[0]];
        nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[2];
        nArray[L.lllllIIlIIIl[3]] = lllllIIlIIIl[4];
        nArray[L.lllllIIlIIIl[5]] = lllllIIlIIIl[6];
        nArray[L.lllllIIlIIIl[7]] = lllllIIlIIIl[8];
        this.ao = nArray;
    }

    private static boolean lIIlIIlIlIlIlIl(Object object) {
        return object == null;
    }

    private static void lIIlIIlIlIIllll() {
        lllllIIlIIII = new String[lllllIIlIIIl[24]];
        L.lllllIIlIIII[L.lllllIIlIIIl[1]] = "No ardy cloak found";
        L.lllllIIlIIII[L.lllllIIlIIIl[3]] = "Monastery Teleport";
        L.lllllIIlIIII[L.lllllIIlIIIl[5]] = "Ardougne Monastery";
        L.lllllIIlIIII[L.lllllIIlIIIl[7]] = "Enabling run as we're mining";
        L.lllllIIlIIII[L.lllllIIlIIIl[0]] = "We can't cast superheat, stopping.";
        L.lllllIIlIIII[L.lllllIIlIIIl[12]] = "Mine";
        L.lllllIIlIIII[L.lllllIIlIIIl[13]] = "Mine";
        L.lllllIIlIIII[L.lllllIIlIIIl[19]] = "Ardougne cloak";
        L.lllllIIlIIII[L.lllllIIlIIIl[20]] = "Ardougne cloak";
    }
}

