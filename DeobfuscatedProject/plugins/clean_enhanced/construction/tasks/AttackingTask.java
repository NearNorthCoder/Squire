/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Attacking")
public class AttackingTask
extends Task {
    private static  int[] lIlIIIIll;
    private final  SarachnisConfig gA;
    private  int bD;
    private static  String[] lIlIIIIlI;

    static {
        bH.var1();
        bH.var2();
    }

    private static void var1() {
        lIlIIIIll = new int[16];
        bH.lIlIIIIll[0] = -1;
        bH.lIlIIIIll[1] = 1;
        bH.lIlIIIIll[2] = (0x66 ^ 1 ^ (0x40 ^ 0x16)) & (0xE3 ^ 0xBD ^ (0xE9 ^ 0x86) ^ -1);
        bH.lIlIIIIll[3] = -(0xFFFF9AFF & 0x7D67) & (0xFFFFFBFF & 0x3E6F);
        bH.lIlIIIIll[4] = 0xFFFFB7EE & 0x4F37;
        bH.lIlIIIIll[5] = 0xFFFFE7FF & 0x3EA1;
        bH.lIlIIIIll[6] = 0xD ^ 0x15;
        bH.lIlIIIIll[7] = 0x5F ^ 0x48;
        bH.lIlIIIIll[8] = 78 + 119 - 67 + 30;
        bH.lIlIIIIll[9] = 0x85 ^ 0xA6;
        bH.lIlIIIIll[10] = 2;
        bH.lIlIIIIll[11] = 3;
        bH.lIlIIIIll[12] = 0x17 ^ 0x13;
        bH.lIlIIIIll[13] = 40 + 128 - 77 + 100 ^ 108 + 112 - 219 + 185;
        bH.lIlIIIIll[14] = 0xA4 ^ 0xA2;
        bH.lIlIIIIll[15] = 0x13 ^ 0x5B ^ (0x2D ^ 0x6D);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Widget var3;
        bH var4;
        Item var5;
        void var6;
        int[] nArray = new int[lIlIIIIll[1]];
        nArray[bH.lIlIIIIll[2]] = lIlIIIIll[3];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(lIlIIIIll[4], lIlIIIIll[5], lIlIIIIll[6], lIlIIIIll[7], lIlIIIIll[2]);
        if (bH.var7(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIll[2];
        }
        if (bH.var8(var6)) {
            return lIlIIIIll[2];
        }
        if (!bH.var9(var6) || bH.var10(var6.isDead() ? 1 : 0)) {
            return lIlIIIIll[2];
        }
        if (bH.var11(Players.getLocal().getInteracting(), var6)) {
            var6.interact(lIlIIIIlI[lIlIIIIll[2]]);
        }
        if (bH.var7(Combat.isSpecEnabled() ? 1 : 0) && bH.var12((var5 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)).getId(), var4.gA.specWeapon().ar()) && bH.var9(var3 = Widgets.get((int)lIlIIIIll[8], (int)lIlIIIIll[9]))) {
            System.out.println(lIlIIIIlI[lIlIIIIll[1]]);
            var3.interact(lIlIIIIll[2]);
        }
        if (bH.var9(Players.getLocal().getInteracting())) {
            if (bH.var13(Combat.getSpecEnergy(), var4.gA.specWeapon().as()) && bH.var9(var5 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && bH.var14(var5.getId(), var4.ap())) {
                int[] nArray2 = new int[lIlIIIIll[1]];
                nArray2[bH.lIlIIIIll[2]] = var4.ap();
                Inventory.getFirst((int[])nArray2).interact(lIlIIIIlI[lIlIIIIll[10]]);
            }
            if (bH.var15(Combat.getSpecEnergy(), var4.gA.specWeapon().as()) && bH.var9(var5 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && bH.var14(var5.getId(), var4.gA.specWeapon().ar())) {
                int[] nArray3 = new int[lIlIIIIll[1]];
                nArray3[bH.lIlIIIIll[2]] = var4.gA.specWeapon().ar();
                if (bH.var10(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    if (bH.var7(var4.gA.specWeapon().at() ? 1 : 0)) {
                        var4.k(var5.getId());
                        int[] nArray4 = new int[lIlIIIIll[1]];
                        nArray4[bH.lIlIIIIll[2]] = var4.gA.specWeapon().ar();
                        Inventory.getFirst((int[])nArray4).interact(lIlIIIIlI[lIlIIIIll[11]]);
                    }
                    if (bH.var10(var4.gA.specWeapon().at() ? 1 : 0) && bH.var16(Inventory.getFreeSlots(), lIlIIIIll[10])) {
                        var4.k(var5.getId());
                        int[] nArray5 = new int[lIlIIIIll[1]];
                        nArray5[bH.lIlIIIIll[2]] = var4.gA.specWeapon().ar();
                        Inventory.getFirst((int[])nArray5).interact(lIlIIIIlI[lIlIIIIll[12]]);
                        0;
                        if (-(0x14 ^ 0x44 ^ (0x43 ^ 0x17)) >= 0) {
                            return ((124 + 60 - 93 + 55 ^ 125 + 86 - 209 + 159) & (0x4E ^ 0x79 ^ (0x25 ^ 0x21) ^ -1)) != 0;
                        }
                    } else {
                        System.out.println(lIlIIIIlI[lIlIIIIll[13]]);
                    }
                }
            }
        }
        return lIlIIIIll[1];
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = lIlIIIIll[2];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = lIlIIIIll[2];
        while (bH.var13(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var16(int n2, int n3) {
        return n2 > n3;
    }

    public int ap() {
        return this.bD;
    }

    private static boolean var14(int n2, int n3) {
        return n2 != n3;
    }

    private static void var2() {
        lIlIIIIlI = new String[lIlIIIIll[14]];
        bH.lIlIIIIlI[bH.lIlIIIIll[2]] = "Attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[1]] = "Using special attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[10]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[11]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[12]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[13]] = "No inventory space to put on spec weapon.";
    }

    @Inject
    public AttackingTask(SarachnisConfig sarachnisConfig) {
        this.bD = lIlIIIIll[0];
        this.gA = sarachnisConfig;
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var15(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var11(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }
}

