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
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.DHelper;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Special Attack", priority=15)
public class SpecialAttackTask
extends Task {
    private final  SquireCerberusConfig aN;
    private static  String[] llIIIIIIl;
    private static final  int aM;
    private final  a aO;
    private static  int[] llIIllIII;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        llIIIIIIl = new String[llIIllIII[7]];
        y.llIIIIIIl[y.llIIllIII[0]] = "Eat";
        y.llIIIIIIl[y.llIIllIII[1]] = "Eat";
        y.llIIIIIIl[y.llIIllIII[6]] = "wild";
    }

    @Inject
    public SpecialAttackTask(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aN = squireCerberusConfig;
        this.aO = a2;
    }

    static {
        y.var3();
        y.var2();
        aM = llIIllIII[4];
    }

    public static int j(int n2) {
        if (y.var4(n2, llIIllIII[2])) {
            return llIIllIII[3];
        }
        int n3 = Static.getClient().getEnum(llIIllIII[4]).getIntValue(n2);
        return n3 / llIIllIII[5];
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = llIIllIII[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = llIIllIII[0];
        while (y.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        int var20;
        int n2;
        y var21;
        if (y.var1(this.aN.cerbSpecGear().isSelected() ? 1 : 0)) {
            return llIIllIII[0];
        }
        d var22 = var21.aO.k();
        if (!y.var5(var22) || y.var7(var22.SpecialAttackTask())) {
            return llIIllIII[0];
        }
        if (y.var1(Reachable.isInteractable((Locatable)var22.SpecialAttackTask()) ? 1 : 0)) {
            return llIIllIII[0];
        }
        EquipmentSetup var23 = ((BankLoadout)var21.aN.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        EquipmentSetup var24 = (EquipmentSetup)var21.aN.cerbSpecGear().selected(EquipmentSetup.class);
        if (y.var19(Combat.getSpecEnergy(), y.j(var24.get(EquipmentInventorySlot.WEAPON)))) {
            n2 = llIIllIII[1];
            0;
            if (((0xD5 ^ 0x86) & ~(0xE8 ^ 0xBB)) != 0) {
                return ((5 ^ 0x28) & ~(0x50 ^ 0x7D)) != 0;
            }
        } else {
            n2 = llIIllIII[0];
        }
        if (y.var1(var20 = n2)) {
            if (y.var1(Gear.isEquipped((int[])var23.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)var23);
                0;
                return llIIllIII[1];
            }
            return llIIllIII[0];
        }
        if (y.var1(Gear.isEquipped((int[])var24.getIds()) ? 1 : 0)) {
            if (y.var17(Inventory.getFreeSlots(), llIIllIII[1])) {
                Item var25 = Inventory.getFirst(item -> {
                    int n2;
                    String[] stringArray = new String[llIIllIII[1]];
                    stringArray[y.llIIllIII[0]] = llIIIIIIl[llIIllIII[1]];
                    if (y.var6(item.hasAction(stringArray) ? 1 : 0) && y.var1(item.getName().contains(llIIIIIIl[llIIllIII[6]]) ? 1 : 0)) {
                        n2 = llIIllIII[1];
                        0;
                        if null != null {
                            return ((0x6B ^ 0x21 ^ (0xC ^ 0x1D)) & (0x46 ^ 0x11 ^ (0x62 ^ 0x6E) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIllIII[0];
                    }
                    return n2 != 0;
                });
                if (y.var5(var25)) {
                    var25.interact(llIIIIIIl[llIIllIII[0]]);
                    return llIIllIII[1];
                }
                return llIIllIII[0];
            }
            Gear.swapTo((EquipmentSetup)var24);
            0;
            return llIIllIII[1];
        }
        if (y.var1(Combat.isSpecEnabled() ? 1 : 0)) {
            Combat.toggleSpec();
            return llIIllIII[1];
        }
        return llIIllIII[0];
    }

    private static void var3() {
        llIIllIII = new int[8];
        y.llIIllIII[0] = (0x1F ^ 0x11) & ~(0x15 ^ 0x1B);
        y.llIIllIII[1] = 1;
        y.llIIllIII[2] = -1;
        y.llIIllIII[3] = 0xFFFFBFF9 & 0x453F;
        y.llIIllIII[4] = 0xFFFFB38E & 0x4FFB;
        y.llIIllIII[5] = 74 + 127 - 143 + 92 ^ 6 + 71 - 9 + 88;
        y.llIIllIII[6] = 2;
        y.llIIllIII[7] = 3;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

