/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling Spec and Gear", priority=305)
public class HandlingSpecAndGearTask
extends Task {
    
    final  SquireDukeSucellusConfig aU;
    final  SquireDukeSucellus aS;
    
    final  a aT;

    @Inject
    public HandlingSpecAndGearTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aS = squireDukeSucellus;
        this.aT = squireDukeSucellus.s();
        this.aU = squireDukeSucellusConfig;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private int T() {
        int n2 = this.S().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(4).getIntValue(n2);
        return n3 / 6;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private void U() {
        BankLoadout bankLoadout = (BankLoadout)this.aU.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if ((equipmentSetup.isEquipped( == 0) ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    public boolean run() {
        x var15;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var2[9]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[var1[10]];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (3 >= -1) return n2 != 0;
                    return ((63 + 25 - 61 + 106 ^ 63 + 117 - 47 + 62) & (0x26 ^ 0x50 ^ (0x90 ^ 0xA0) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if nPC2 == null {
            if ((this.aU.lightbearer( == 0) ? 1 : 0)) {
                return 0;
            }
            int[] nArray = new int[1];
            nArray[0] = 2;
            Item var16 = Inventory.getFirst((int[])nArray);
            if var16 == null {
                return 0;
            }
            var16.interact(var2[0]);
            return 0;
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[7]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[8];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if null == null return n2 != 0;
                    return ((0x8D ^ 0xC5) & ~(0xE6 ^ 0xAE)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var16 == null {
            return 0;
        }
        Player var17 = Players.getLocal();
        if var17 == null {
            return 0;
        }
        String var18 = var15.aU.specGear().getSelected();
        if (!var18 != null || (var18.equals(var2[1] != 0) ? 1 : 0)) {
            return 0;
        }
        int var19 = CombatOptions.getSpecialAttackEnergy();
        if (!(var19 >= var15.T()) || (var15.aU.lowHpSpec( != 0) ? 1 : 0) && (var15.aT.u() > 3)) {
            var15.U();
            return 0;
        }
        int var20 = var15.S().get(EquipmentInventorySlot.WEAPON);
        int var21 = Arrays.stream(Static.getClient().getEnum(4).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (var20 == var20) {
                bl = 1;
                0;
                if (((0xC4 ^ 0x96) & ~(0x67 ^ 0x35)) > 0) {
                    return ((0xB2 ^ 0xB6) & ~(0x46 ^ 0x42)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }) ? 1 : 0;
        if (var21 == 0) {
            Log.warn((String)var2[5]);
            return 0;
        }
        if ((var15.S( == 0).isEquipped() ? 1 : 0)) {
            var15.S().swap();
        }
        if ((CombatOptions.isSpecialAttackActivated( != 0) ? 1 : 0)) {
            return 0;
        }
        Combat.toggleSpec();
        return 1;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = 0;
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = 0;
        while (var30 < var29) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (((183 + 122 - 211 + 104 ^ 127 + 145 - 259 + 141) & (0xA6 ^ 0x95 ^ (0xEF ^ 0x80) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private EquipmentSetup S() {
        return (EquipmentSetup)this.aU.specGear().selected(EquipmentSetup.class);
    }
}

