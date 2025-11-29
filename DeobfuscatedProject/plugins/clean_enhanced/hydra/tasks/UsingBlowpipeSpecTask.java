/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Using blowpipe spec", priority=100)
public class UsingBlowpipeSpecTask
extends Task {

    private final  SquireAlchemicalHydraConfig aB;
    private  String aC;
    private final  a aA;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (t.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-(74 + 34 - 5 + 44 ^ 23 + 130 - 115 + 113) < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var2 = new int[9];
        t.var2[0] = (0x6E ^ 0x3A) & ~(0x1D ^ 0x49);
        t.var2[1] = 0x4E ^ 0x7C;
        t.var2[2] = 0x94 ^ 0x9E;
        t.var2[3] = 1;
        t.var2[4] = 2;
        t.var2[5] = 3;
        t.var2[6] = 0xAC ^ 0xA8;
        t.var2[7] = 0x43 ^ 0x37 ^ (0x6B ^ 0x1A);
        t.var2[8] = 118 + 2 - -10 + 11 ^ 2 + 68 - 32 + 95;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        t var24;
        if (t.var16(this.aA.k())) {
            return var2[0];
        }
        if (t.var15(var24.aA.k().Q() ? 1 : 0)) {
            return var2[0];
        }
        Item var25 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (t.var16(var25)) {
            return var2[0];
        }
        if (!t.var26(Combat.getSpecEnergy(), var2[1]) || t.var23(Combat.getMissingHealth(), var2[2])) {
            String[] stringArray = new String[var2[3]];
            stringArray[t.var2[0]] = var24.aC;
            if (t.var15(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[var2[3]];
                stringArray2[t.var2[0]] = var24.aC;
                Inventory.getFirst((String[])stringArray2).interact(var1[var2[3]]);
            }
            return var2[0];
        }
        if (t.var27(var25.getName().contains(var1[var2[4]]) ? 1 : 0)) {
            String[] stringArray = new String[var2[3]];
            stringArray[t.var2[0]] = var1[var2[5]];
            Item var28 = Inventory.getFirst((String[])stringArray);
            var24.aC = var25.getName();
            if (t.var16(var28)) {
                return var2[0];
            }
            if (t.var26(Combat.getSpecEnergy(), var2[1]) && t.var15(var24.aB.blowpipeSpec() ? 1 : 0)) {
                var28.interact(var1[var2[6]]);
            }
            return var2[3];
        }
        if (t.var15(Combat.isSpecEnabled() ? 1 : 0)) {
            return var2[0];
        }
        Combat.toggleSpec();
        return var2[3];
    }

    static {
        t.var14();
        t.var29();
    }

    @Inject
    public UsingBlowpipeSpecTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aC = var1[var2[0]];
        this.aA = a2;
        this.aB = squireAlchemicalHydraConfig;
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var26(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var29() {
        var1 = new String[var2[7]];
        t.var1[t.var2[0]] = t.var17("WK1NT/aWpes=", "kVxDm");
        t.var1[t.var2[3]] = "Wield";
        t.var1[t.var2[4]] = "blowpipe";
        t.var1[t.var2[5]] = "Toxic blowpipe";
        t.var1[t.var2[6]] = "Wield";
    }
}

