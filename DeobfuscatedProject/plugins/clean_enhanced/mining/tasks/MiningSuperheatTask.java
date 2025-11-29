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
import java.util.List;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
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

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private void r() {
        if (L.var4(Inventory.contains((int[])this.ao) ? 1 : 0)) {
            int[] nArray = new int[var1[3]];
            nArray[L.var1[1]] = var1[14];
            Inventory.getFirst((int[])this.ao).useOn(Inventory.getFirst((int[])nArray));
            0;
            if ((116 + 42 - 87 + 101 ^ 7 + 162 - 58 + 57) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[3]];
            nArray[L.var1[1]] = var1[15];
            int[] nArray2 = new int[var1[5]];
            nArray2[L.var1[1]] = var1[16];
            nArray2[L.var1[3]] = var1[17];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    static {
        L.var6();
        L.var7();
        an = var1[11];
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
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
                    if (!L.var4(Inventory.contains((int[])this.ao) ? 1 : 0)) break block2;
                    int[] nArray = new int[var1[3]];
                    nArray[L.var1[1]] = var1[14];
                    if (!L.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[var1[3]];
                    nArray2[L.var1[1]] = var1[18];
                    if (!L.var14(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[var1[3]];
                nArray[L.var1[1]] = var1[15];
                if (!L.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[var1[3]];
                nArray3[L.var1[1]] = var1[17];
                if (!L.var14(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[var1[3]];
                nArray4[L.var1[1]] = var1[16];
                if (!L.var4(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = var1[3];
            0;
            if ((0xBB ^ 0xBE) != 0) return n2 != 0;
            return ((0x54 ^ 0x18) & ~(0x69 ^ 0x25)) != 0;
        }
        n2 = var1[1];
        return n2 != 0;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private static void var6() {
        var1 = new int[25];
        L.var1[0] = 0x8B ^ 0x8F;
        L.var1[1] = 3 & (3 ^ -1);
        L.var1[2] = 189 + 134 - 290 + 216;
        L.var1[3] = 1;
        L.var1[4] = 142 + 244 - 208 + 73;
        L.var1[5] = 2;
        L.var1[6] = (0xB ^ 0x2E) + (0x2A ^ 0x5C) - (111 + 123 - 220 + 139) + (239 + 73 - 311 + 250);
        L.var1[7] = 3;
        L.var1[8] = 207 + 100 - 224 + 172;
        L.var1[9] = 0xBE ^ 0xAF ^ (0x6F ^ 0x67);
        L.var1[10] = 0xFFFFA1F8 & 0x5FBF;
        L.var1[11] = 0xFFFFB2D5 & 0x4FFF;
        L.var1[12] = 0x59 ^ 2 ^ (0xF0 ^ 0xAE);
        L.var1[13] = 0xA ^ 0x46 ^ (0x4C ^ 6);
        L.var1[14] = -(0xFFFFDDB5 & 0x3A6B) & (0xFFFFBFFF & 0x5FB3);
        L.var1[15] = 0xFFFFB3F3 & 0x4FBE;
        L.var1[16] = -(0xFFFFFDCB & 0x6237) & (0xFFFFF9BF & 0x7EFE);
        L.var1[17] = -(0xFFFFD621 & 0x6FDF) & (0xFFFFDFFD & 0x7EBF);
        L.var1[18] = 167 + 172 - 235 + 129;
        L.var1[19] = 0xD3 ^ 0xC0 ^ (0xE ^ 0x1A);
        L.var1[20] = 0x50 ^ 0x58;
        L.var1[21] = -(0xFFFFFB3F & 0x47D3) & (0xFFFFEFF7 & 0x7F7E);
        L.var1[22] = 0xFFFFAE67 & 0x7DFD;
        L.var1[23] = 0xFFFF9CFE & 0x6FA5;
        L.var1[24] = 0x17 ^ 0x1E;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[1];
        while (L.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        L var34;
        if (L.var3((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return var1[1];
        }
        if (L.var4(Inventory.isFull() ? 1 : 0)) {
            return var1[1];
        }
        if (L.var4(Bank.isOpen() ? 1 : 0)) {
            return var1[1];
        }
        Player var35 = Players.getLocal();
        TileObject var36 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.var4(List.of(Integer.valueOf(var1[21]), Integer.valueOf(var1[22])).contains(tileObject.getId()) ? 1 : 0) && L.var26(tileObject.getWorldY(), var1[23])) {
                n2 = var1[3];
                0;
                if (-(62 + 31 - 40 + 88 ^ 99 + 24 - 116 + 130) >= 0) {
                    return ((0xAE ^ 0xA9 ^ (0xA3 ^ 0xBB)) & (0x7C ^ 0x44 ^ (0x42 ^ 0x65) ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (!L.var5(var36) || L.var15(var36.distanceTo(var35.getWorldLocation()), var1[9])) {
            Item var37 = Equipment.getFirst(item -> item.getName().contains(var2[var1[20]]));
            if (L.var38(var37)) {
                var37 = Inventory.getFirst(item -> item.getName().contains(var2[var1[19]]));
            }
            if (L.var38(var37)) {
                Log.info((String)var2[var1[1]]);
                return var1[1];
            }
            String[] stringArray = new String[var1[5]];
            stringArray[L.var1[1]] = var2[var1[3]];
            stringArray[L.var1[3]] = var2[var1[5]];
            var37.interact(stringArray);
            var34.sleep(var1[7]);
            return var1[3];
        }
        if (L.var14(Movement.isRunEnabled() ? 1 : 0)) {
            Log.info((String)var2[var1[7]]);
            Movement.toggleRun();
        }
        int[] nArray = new int[var1[3]];
        nArray[L.var1[1]] = var1[10];
        Item var37 = Inventory.getFirst((int[])nArray);
        SpellBook.Standard var39 = SpellBook.Standard.SUPERHEAT_ITEM;
        if (L.var5(var37) && L.var40(var35.getAnimation(), var1[11])) {
            if (L.var14(var39.canCast() ? 1 : 0)) {
                Log.info((String)var2[var1[0]]);
                var34.l.forceStop();
            }
            int[] nArray2 = new int[var1[3]];
            nArray2[L.var1[1]] = var1[10];
            var39.castOn((Interactable)Inventory.getFirst((int[])nArray2));
        }
        WorldPoint var41 = var36.getWorldLocation();
        WorldPoint var42 = Players.getLocal().getWorldLocation();
        if (L.var4(var42.toWorldArea().isInMeleeDistance(var41) ? 1 : 0)) {
            var36.interact(var2[var1[12]]);
            var34.sleep(var1[3]);
            return var1[3];
        }
        if (L.var4(var34.n() ? 1 : 0) && L.var16(var35.distanceTo((Locatable)var36), var1[7])) {
            var34.r();
        }
        var2_2.interact(var2[var1[13]]);
        this.sleep(var1[3]);
        return var1[3];
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var40(int n2, int n3) {
        return n2 != n3;
    }

    public MiningSuperheatTask() {
        int[] nArray = new int[var1[0]];
        nArray[L.var1[1]] = var1[2];
        nArray[L.var1[3]] = var1[4];
        nArray[L.var1[5]] = var1[6];
        nArray[L.var1[7]] = var1[8];
        this.ao = nArray;
    }

    private static boolean var38(Object object) {
        return object == null;
    }

    private static void var7() {
        var2 = new String[var1[24]];
        L.var2[L.var1[1]] = "No ardy cloak found";
        L.var2[L.var1[3]] = "Monastery Teleport";
        L.var2[L.var1[5]] = "Ardougne Monastery";
        L.var2[L.var1[7]] = "Enabling run as we're mining";
        L.var2[L.var1[0]] = "We can't cast superheat, stopping.";
        L.var2[L.var1[12]] = "Mine";
        L.var2[L.var1[13]] = "Mine";
        L.var2[L.var1[19]] = "Ardougne cloak";
        L.var2[L.var1[20]] = "Ardougne cloak";
    }
}

