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
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.client.Static;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends ScurriusManager {

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean a() {
        r var6;
        String string = this.b.specGear().getSelected();
        if (!r.var7(string) || r.var8(string.equals(var1[var2[0]]) ? 1 : 0)) {
            return var2[0];
        }
        int var9 = CombatOptions.getSpecialAttackEnergy();
        if (!r.var4(var9, var6.v()) || r.var3(var6.c.p(), var2[1])) {
            var6.w();
            return var2[0];
        }
        int var10 = var6.u().get(EquipmentInventorySlot.WEAPON);
        int var11 = Arrays.stream(Static.getClient().getEnum(var2[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (r.var5(n3, var10)) {
                bl = var2[3];
                0;
                
            } else {
                bl = var2[0];
            }
            return bl;
        }) ? 1 : 0;
        if (r.var12(var11)) {
            Log.warn((String)var1[var2[3]]);
            return var2[0];
        }
        if (r.var12(var6.u().isEquipped() ? 1 : 0)) {
            var6.u().swap();
        }
        if (r.var8(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return var2[0];
        }
        Combat.toggleSpec();
        return var2[3];
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[0];
        while (r.var3(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private int v() {
        int n2 = this.u().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(var2[2]).getIntValue(n2);
        return n3 / var2[4];
    }

    private EquipmentSetup u() {
        return (EquipmentSetup)this.b.specGear().selected(EquipmentSetup.class);
    }

    private void w() {
        BankLoadout bankLoadout = (BankLoadout)this.b.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (r.var12(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Inject
    protected HandlingSpecAndGearTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static void var29() {
        var2 = new int[6];
        r.var2[0] = (0xC7 ^ 0xC1) & ~(0x26 ^ 0x20);
        r.var2[1] = 0xF1 ^ 0x88 ^ (0x18 ^ 0x49);
        r.var2[2] = 0xFFFFEBCA & 0x17BF;
        r.var2[3] = 1;
        r.var2[4] = 0x17 ^ 0x1D;
        r.var2[5] = 2;
    }

    private static void var30() {
        var1 = new String[var2[5]];
        r.var1[r.var2[0]] = "None";
        r.var1[r.var2[3]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    static {
        r.var29();
        r.var30();
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }
}

