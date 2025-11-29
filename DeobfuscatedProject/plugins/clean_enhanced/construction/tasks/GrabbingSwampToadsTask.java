/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum2;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Grabbing swamp toads")
public class GrabbingSwampToadsTask
extends Task {
    private static  int[] lIllllll;
    private static  String[] lIlllllI;
    @Inject
    private  SecondariesConfig gZ;
    private static final  WorldArea gY;

    private static boolean var1(Object object) {
        return object == null;
    }

    private static void var2() {
        lIlllllI = new String[lIllllll[8]];
        bT.lIlllllI[bT.lIllllll[0]] = "Remove-legs";
        bT.lIlllllI[bT.lIllllll[1]] = "Take";
    }

    private static boolean var3(int n2) {
        return n2 <= 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bT.var6();
        bT.var2();
        gY = new WorldArea(lIllllll[4], lIllllll[5], lIllllll[6], lIllllll[7], lIllllll[0]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        List var7;
        if (bT.var8((Object)this.gZ.secondary(), (Object)bO.SWAMP_TOAD)) {
            return lIllllll[0];
        }
        if (bT.var9(Inventory.isFull() ? 1 : 0)) {
            return lIllllll[0];
        }
        if (bT.var4(gY.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            if (bT.var9(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)gY.getCenter());
                0;
            }
            return lIllllll[1];
        }
        if (bT.var9(Movement.isWalking() ? 1 : 0)) {
            int[] nArray = new int[lIllllll[1]];
            nArray[bT.lIllllll[0]] = lIllllll[2];
            var7 = Inventory.getAll((int[])nArray);
            int var10 = lIllllll[3];
            Iterator var11 = var7.iterator();
            while (bT.var9(var11.hasNext() ? 1 : 0)) {
                Item var12 = (Item)var11.next();
                if (bT.var3(var10--)) {
                    0;
                    if (((0xA5 ^ 0x86) & ~(0x49 ^ 0x6A)) <= 0) break;
                    return ((0xAB ^ 0xBC) & ~(0x23 ^ 0x34)) != 0;
                }
                var12.interact(lIlllllI[lIllllll[0]]);
                0;
                if ((0x4D ^ 0x49) > 2) continue;
                return ((0x69 ^ 0x4E) & ~(0x7F ^ 0x58)) != 0;
            }
        }
        int[] nArray = new int[lIllllll[1]];
        nArray[bT.lIllllll[0]] = lIllllll[2];
        var7 = TileItems.getNearest((int[])nArray);
        if (bT.var1(var7)) {
            return lIllllll[0];
        }
        var1_1.interact(lIlllllI[lIllllll[1]]);
        return lIllllll[1];
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = lIllllll[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = lIllllll[0];
        while (bT.var5(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((0xE9 ^ 0xAD) & ~(0x7C ^ 0x38)) == 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static void var6() {
        lIllllll = new int[9];
        bT.lIllllll[0] = (144 + 180 - 284 + 166 ^ 103 + 96 - 70 + 14) & (0x56 ^ 0x7D ^ (0x5A ^ 0x30) ^ -1);
        bT.lIllllll[1] = 1;
        bT.lIllllll[2] = -(0xFFFFDBBD & 0x675B) & (0xFFFFCFFF & 0x7B7E);
        bT.lIllllll[3] = 139 + 6 - 115 + 127 ^ 100 + 84 - 155 + 120;
        bT.lIllllll[4] = -(0xFFFFFCCA & 0x773F) & (0xFFFFFD7F & 0x7FEF);
        bT.lIllllll[5] = -(0xFFFFD7FF & 0x784F) & (0xFFFFFDFF & 0x5FFF);
        bT.lIllllll[6] = 0x40 ^ 0x59;
        bT.lIllllll[7] = 0x25 ^ 0x2A;
        bT.lIllllll[8] = 2;
    }
}

