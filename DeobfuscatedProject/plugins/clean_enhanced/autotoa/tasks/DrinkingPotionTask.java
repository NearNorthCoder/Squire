/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum11;

@TaskDesc(name="Drinking potion", priority=200)
public class DrinkingPotionTask
extends AutotoaManager {
    private final  C cI;

    private final  SquireAutoTOA cJ;

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static void var7() {
        var1 = new String[var2[2]];
        af.var1[af.var2[0]] = "Drink";
    }

    static {
        af.var8();
        af.var7();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        af var15;
        if (af.var16(this.cJ.e() ? 1 : 0)) {
            return var2[0];
        }
        if (af.var4(var15.bc() ? 1 : 0)) {
            return var2[0];
        }
        if (af.var5(Vars.getBit((int)var2[1]))) {
            return var2[0];
        }
        if (af.var4(var15.cI.am() ? 1 : 0)) {
            return var2[0];
        }
        Item var17 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        a[] var18 = a.a(var17);
        int var19 = var18.length;
        int var20 = var2[0];
        while (af.var21(var20, var19)) {
            a var22 = var18[var20];
            Skill[] var23 = var22.m();
            int var24 = var23.length;
            int var25 = var2[0];
            while (af.var21(var25, var24)) {
                Item var26;
                Skill var27 = var23[var25];
                int var28 = (int)(0.5 * (double)var22.a(var27));
                if (af.var3(Skills.getLevel((Skivar27) + var28, Skills.getBoostedLevel((Skivar27)) && af.var6(var26 = Inventory.getFirst(item -> item.getName().startsWith(var22.l())))) {
                    var26.interact(var1[var2[0]]);
                    var15.cI.ao();
                    return var2[2];
                }
                ++var25;
                0;
                if ((86 + 52 - 39 + 70 ^ 22 + 94 - -37 + 20) > 0) continue;
                return ((124 + 113 - 98 + 22 ^ 50 + 107 - 78 + 69) & (0xA7 ^ 0x85 ^ (0x21 ^ 0x36) ^ -1)) != 0;
            }
            ++var20;
            0;
            
            return ((0x24 ^ 0x7D) & ~(0xDB ^ 0x82)) != 0;
        }
        return var2[0];
    }

    @Inject
    protected DrinkingPotionTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cI = c2;
        this.cJ = squireAutoTOA;
    }

    private static void var8() {
        var2 = new int[4];
        af.var2[0] = (3 ^ 0x46) & ~(0x60 ^ 0x25);
        af.var2[1] = -(0xFFFFCFD7 & 0x743B) & (0xFFFFFEBA & 0x7D5F);
        af.var2[2] = 1;
        af.var2[3] = 2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }
}

