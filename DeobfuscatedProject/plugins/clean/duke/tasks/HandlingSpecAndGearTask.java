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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lllIlIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private int T() {
        int n2 = this.S().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIllIllIIIII[4]).getIntValue(n2);
        return n3 / lIllIllIIIII[6];
    }

    private static boolean lllIlIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private void U() {
        BankLoadout bankLoadout = (BankLoadout)this.aU.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (x.lllIlIIIllIIII(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private static boolean lllIlIIIlIllll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIllIIIl(Object object) {
        return object != null;
    }

    static {
        x.lllIlIIIlIlllI();
        x.lllIlIIIlIllIl();
    }

    private static void lllIlIIIlIllIl() {
        lIllIlIlllll = new String[lIllIllIIIII[11]];
        x.lIllIlIlllll[x.lIllIllIIIII[0]] = "Wear";
        x.lIllIlIlllll[x.lIllIllIIIII[1]] = "None";
        x.lIllIlIlllll[x.lIllIllIIIII[5]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
        x.lIllIlIlllll[x.lIllIllIIIII[7]] = "Gate";
        x.lIllIlIlllll[x.lIllIllIIIII[8]] = "Quick-escape";
        x.lIllIlIlllll[x.lIllIllIIIII[9]] = "Duke Sucellus";
        x.lIllIlIlllll[x.lIllIllIIIII[10]] = "Attack";
    }

    private static boolean lllIlIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        x var1;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (x.lllIlIIIllIIlI(nPC.getName().equals(lIllIlIlllll[lIllIllIIIII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[10]];
                if (x.lllIlIIIllIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];

                    if (3 >= -1) return n2 != 0;
                    return ((63 + 25 - 61 + 106 ^ 63 + 117 - 47 + 62) & (0x26 ^ 0x50 ^ (0x90 ^ 0xA0) ^ -1)) != 0;
                }
            }
            n2 = lIllIllIIIII[0];
            return n2 != 0;
        });
        if (x.lllIlIIIlIllll(nPC2)) {
            if (x.lllIlIIIllIIII(this.aU.lightbearer() ? 1 : 0)) {
                return lIllIllIIIII[0];
            }
            int[] nArray = new int[lIllIllIIIII[1]];
            nArray[x.lIllIllIIIII[0]] = lIllIllIIIII[2];
            Item var2 = Inventory.getFirst((int[])nArray);
            if (x.lllIlIIIlIllll(var2)) {
                return lIllIllIIIII[0];
            }
            var2.interact(lIllIlIlllll[lIllIllIIIII[0]]);
            return lIllIllIIIII[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lllIlIIIllIIlI(tileObject.getName().equals(lIllIlIlllll[lIllIllIIIII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[8]];
                if (x.lllIlIIIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIllIIIII[0];
            return n2 != 0;
        });
        if (x.lllIlIIIlIllll(var2)) {
            return lIllIllIIIII[0];
        }
        Player var3 = Players.getLocal();
        if (x.lllIlIIIlIllll(var3)) {
            return lIllIllIIIII[0];
        }
        String var4 = var1.aU.specGear().getSelected();
        if (!x.lllIlIIIllIIIl(var4) || x.lllIlIIIllIIlI(var4.equals(lIllIlIlllll[lIllIllIIIII[1]]) ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        int var5 = CombatOptions.getSpecialAttackEnergy();
        if (!x.lllIlIIIllIIll(var5, var1.T()) || x.lllIlIIIllIIlI(var1.aU.lowHpSpec() ? 1 : 0) && x.lllIlIIIllIlII(var1.aT.u(), lIllIllIIIII[3])) {
            var1.U();
            return lIllIllIIIII[0];
        }
        int var6 = var1.S().get(EquipmentInventorySlot.WEAPON);
        int var7 = Arrays.stream(Static.getClient().getEnum(lIllIllIIIII[4]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (x.lllIlIIIllIlIl(n3, var6)) {
                bl = lIllIllIIIII[1];

                if (((0xC4 ^ 0x96) & ~(0x67 ^ 0x35)) > 0) {
                    return false;
                }
            } else {
                bl = lIllIllIIIII[0];
            }
            return bl;
        }) ? 1 : 0;
        if (x.lllIlIIIllIIII(var7)) {
            Log.warn((String)lIllIlIlllll[lIllIllIIIII[5]]);
            return lIllIllIIIII[0];
        }
        if (x.lllIlIIIllIIII(var1.S().isEquipped() ? 1 : 0)) {
            var1.S().swap();
        }
        if (x.lllIlIIIllIIlI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        Combat.toggleSpec();
        return lIllIllIIIII[1];
    }

        return String.valueOf(var8);
    }

    private EquipmentSetup S() {
        return (EquipmentSetup)this.aU.specGear().selected(EquipmentSetup.class);
    }
}

