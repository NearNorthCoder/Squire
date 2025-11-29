/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Handling banking")
public class HandlingBankingTask
extends Task {

    @Inject
    private  SquireMinerConfig f;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean p() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[var1[4]];
            stringArray[n.var1[0]] = var2[var1[4]];
            return nPC.hasAction(stringArray);
        });
        if (n.var4(nPC2)) {
            void var5;
            if (n.var3(Reachable.isInteractable((Locatable)nPC2) ? 1 : 0)) {
                nPC2.interact(var2[var1[0]]);
                return var1[4];
            }
            Movement.walkTo((Locatable)var5);
            0;
            return var1[4];
        }
        if (n.var3(Locations.isRegionLoaded((int)var1[6]) ? 1 : 0)) {
            Movement.walkTo((int)var1[7], (int)var1[8]);
            0;
            return var1[4];
        }
        if (n.var3(Locations.isRegionLoaded((int)var1[9]) ? 1 : 0)) {
            Movement.walkTo((int)var1[10], (int)var1[11]);
            0;
            return var1[4];
        }
        return var1[0];
    }

    static {
        n.var6();
        n.var7();
    }

    private static void var7() {
        var2 = new String[var1[2]];
        n.var2[n.var1[0]] = "Teleport";
        n.var2[n.var1[4]] = "Teleport";
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var1[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var1[0];
        while (n.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (3 != ((0x99 ^ 0xA7 ^ (0x5F ^ 0x43)) & (18 + 114 - 90 + 112 ^ 118 + 21 - 90 + 135 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void var6() {
        var1 = new int[13];
        n.var1[0] = (0x1F ^ 0x1A) & ~(0x91 ^ 0x94);
        n.var1[1] = 0xFFFFBD4B & 0x6FFF;
        n.var1[2] = 2;
        n.var1[3] = 0xFFFF9F97 & 0x7F68;
        n.var1[4] = 1;
        n.var1[5] = -(0xFFFFF80B & 0x4FF7) & (0xFFFFCFBF & 0x7DDE);
        n.var1[6] = -(0xFFFFDB9F & 0x6DEB) & (0xFFFFFFBF & 0x7BFF);
        n.var1[7] = 0xFFFFEDFD & 0x1EB6;
        n.var1[8] = -(0xFFFFB2FE & 0x5FB5) & (0xFFFFBFFB & 0x5FFF);
        n.var1[9] = -(0xFFFFDFEF & 0x235E) & (0xFFFFAB7D & Short.MAX_VALUE);
        n.var1[10] = 0xFFFF9A1E & 0x6FFF;
        n.var1[11] = 0xFFFFBD0F & 0x4EFF;
        n.var1[12] = 100 + 27 - -5 + 13 ^ 71 + 101 - 57 + 38;
    }

    private static boolean var19(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var26(int n2) {
        return n2 == 0;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    public boolean run() {
        if (n.var19((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return var1[0];
        }
        if (n.var3(Locations.isRegionLoaded((int)var1[1]) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[2]];
        nArray[n.var1[0]] = var1[3];
        nArray[n.var1[4]] = var1[5];
        if (n.var26(Inventory.contains((int[])nArray) ? 1 : 0)) {
            n var27;
            return var27.p();
        }
        if (n.var3(Bank.open() ? 1 : 0)) {
            int[] nArray2 = new int[var1[2]];
            nArray2[n.var1[0]] = var1[3];
            nArray2[n.var1[4]] = var1[5];
            Bank.depositAll((int[])nArray2);
            return var1[4];
        }
        BankLocation bankLocation = BankLocation.getNearest();
        Movement.walkTo((WorldPoint)bankLocation.getArea().getCenter());
        0;
        return var1[4];
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }
}

