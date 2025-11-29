/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends VardorvisTaskBase {

    private static void var3() {
        var2 = new int[7];
        A.var2[0] = (0xB5 ^ 0x8E ^ (0x7B ^ 0x16)) & (0x17 ^ 0x45 ^ (0x95 ^ 0x91) ^ -1);
        A.var2[1] = 0xE7 ^ 0x83 ^ (0xE4 ^ 0xA8);
        A.var2[2] = 0xFFFFD3BE & 0x2FCB;
        A.var2[3] = 1;
        A.var2[4] = 0x1C ^ 0x16;
        A.var2[5] = 2;
        A.var2[6] = 0x2E ^ 0x26;
    }

    static {
        A.var3();
        A.var4();
    }

    private static void var4() {
        var1 = new String[var2[5]];
        A.var1[A.var2[0]] = "None";
        A.var1[A.var2[3]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        A var7;
        String string = this.t.specGear().getSelected();
        if (!A.var5(string) || A.var6(string.equals(var1[var2[0]]) ? 1 : 0)) {
            return var2[0];
        }
        int var8 = CombatOptions.getSpecialAttackEnergy();
        if (!A.var9(var8, var7.U()) || !A.var10(var7.u.y(), var7.t.specHp()) || A.var11(var7.u.y(), var2[1])) {
            var7.V();
            return var2[0];
        }
        int var12 = var7.T().get(EquipmentInventorySlot.WEAPON);
        int var13 = Arrays.stream(Static.getClient().getEnum(var2[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (A.var14(n3, var12)) {
                bl = var2[3];
                0;
                if ((19 + 56 - -59 + 11 ^ 85 + 94 - 155 + 124) == 0) {
                    return ((0x4F ^ 6 ^ (0x2F ^ 0x6D)) & (31 + 174 - 58 + 58 ^ 159 + 105 - 108 + 42 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }) ? 1 : 0;
        if (A.var15(var13)) {
            Log.warn((String)var1[var2[3]]);
            return var2[0];
        }
        if (A.var15(var7.T().isEquipped() ? 1 : 0)) {
            var7.T().swap();
        }
        if (A.var6(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return var2[0];
        }
        Combat.toggleSpec();
        return var2[3];
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private EquipmentSetup T() {
        return (EquipmentSetup)this.t.specGear().selected(EquipmentSetup.class);
    }

    private static boolean var10(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Inject
    protected HandlingSpecAndGearTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private void V() {
        BankLoadout bankLoadout = (BankLoadout)this.t.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (A.var15(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private int U() {
        int n2 = this.T().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(var2[2]).getIntValue(n2);
        return n3 / var2[4];
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }
}

