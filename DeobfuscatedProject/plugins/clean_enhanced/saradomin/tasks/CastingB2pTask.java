/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Casting B2P", priority=6)
public class CastingB2pTask
extends Task {
    private final  g az;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[0];
        while (A.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var20(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public CastingB2pTask(g g2) {
        this.az = g2;
    }

    static {
        A.var21();
        A.var22();
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        A var30;
        if (!A.var31(this.az.m() ? 1 : 0) || A.var31(this.az.l() ? 1 : 0)) {
            return var2[0];
        }
        if (A.var31(var30.az.p() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[A.var2[0]] = var1[var2[0]];
        stringArray[A.var2[2]] = var1[var2[2]];
        if (A.var23(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return var2[0];
        }
        TileItem var32 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(var1[var2[7]]));
        if (A.var33(var32) && A.var23(Inventory.isFull() ? 1 : 0) && A.var20(var30.az.k(), var2[3])) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[A.var2[0]] = var2[4];
        nArray[A.var2[2]] = var2[5];
        Item var34 = Inventory.getFirst((int[])nArray);
        if (A.var33(var34)) {
            var34.interact(var1[var2[1]]);
            0;
            if (1 < 0) {
                return ((0x3B ^ 0x2A ^ (0xF6 ^ 0xA7)) & (0x77 ^ 0xF ^ (0x93 ^ 0xAB) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard var35 = SpellBook.Standard.BONES_TO_PEACHES;
            Magic.cast((Spevar35);
        }
        this.sleep(var2[6]);
        return var2[2];
    }

    private static void var22() {
        var1 = new String[var2[6]];
        A.var1[A.var2[0]] = "Bones";
        A.var1[A.var2[2]] = "Big bones";
        A.var1[A.var2[1]] = "Break";
        A.var1[A.var2[7]] = "bones";
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var33(Object object) {
        return object != null;
    }

    private static boolean var31(int n2) {
        return n2 != 0;
    }

    private static void var21() {
        var2 = new int[9];
        A.var2[0] = (0x24 ^ 0x74) & ~(0x26 ^ 0x76);
        A.var2[1] = 2;
        A.var2[2] = 1;
        A.var2[3] = 0x8E ^ 0x82;
        A.var2[4] = 0xFFFF9F9F & 0x7B6E;
        A.var2[5] = -(0xFFFFF9FD & 0x66B3) & (0xFFFFFFFF & Short.MAX_VALUE);
        A.var2[6] = 0x3E ^ 0x3A;
        A.var2[7] = 3;
        A.var2[8] = 0x5D ^ 0x37 ^ (0xF9 ^ 0x9B);
    }
}

