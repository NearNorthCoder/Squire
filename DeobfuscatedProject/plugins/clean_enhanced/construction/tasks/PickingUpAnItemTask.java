/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Picking up an item")
public class PickingUpAnItemTask
extends Task {
    private static  int[] lIlIllllI;
    @Inject
    private  SquireQuestHelper fK;
    private static  String[] lIlIlllIl;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        int var1;
        block8: {
            block7: {
                bp var2;
                String string = this.fK.cz();
                if (bp.var3(string.equals(lIlIlllIl[lIlIllllI[0]]) ? 1 : 0)) {
                    return lIlIllllI[0];
                }
                var1 = var2.fK.cJ();
                if (bp.var4(var1, lIlIllllI[1])) {
                    return lIlIllllI[0];
                }
                int[] nArray = new int[lIlIllllI[2]];
                nArray[bp.lIlIllllI[0]] = var1;
                if (!bp.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lIlIllllI[2]];
                nArray2[bp.lIlIllllI[0]] = var1;
                if (!bp.var5(Equipment.contains((int[])nArray2) ? 1 : 0)) break block8;
            }
            return lIlIllllI[0];
        }
        int[] nArray = new int[lIlIllllI[2]];
        nArray[bp.lIlIllllI[0]] = var1;
        TileItem var6 = TileItems.getNearest((int[])nArray);
        if (bp.var7(var6)) {
            return lIlIllllI[0];
        }
        if (bp.var3(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var6.getWorldLocation());
            0;
            return lIlIllllI[2];
        }
        var3_3.interact(lIlIlllIl[lIlIllllI[2]]);
        return lIlIllllI[2];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = lIlIllllI[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = lIlIllllI[0];
        while (bp.var8(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static void var19() {
        lIlIllllI = new int[4];
        bp.lIlIllllI[0] = (0x20 ^ 0x2A) & ~(0x47 ^ 0x4D);
        bp.lIlIllllI[1] = -1;
        bp.lIlIllllI[2] = 1;
        bp.lIlIllllI[3] = 2;
    }

    private static void var20() {
        lIlIlllIl = new String[lIlIllllI[3]];
        bp.lIlIlllIl[bp.lIlIllllI[0]] = "DetailedQuestStep";
        bp.lIlIlllIl[bp.lIlIllllI[2]] = "Take";
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        bp.var19();
        bp.var20();
    }
}

