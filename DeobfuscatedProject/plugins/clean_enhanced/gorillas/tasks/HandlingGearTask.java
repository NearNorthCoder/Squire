/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.gorillas.tasks.CHelper;

@TaskDesc(name="Handling Gear")
public class HandlingGearTask
extends Task {
    
    private final  SquireGorillaPlugin ab;
    private final  SquireGorillaConfig ac;

    public boolean a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] var3;
        List var4;
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if equipmentSetup != null {
            nArray = equipmentSetup.getIds();
            0;
            if ((0xAD ^ 0xB3 ^ (0x48 ^ 0x52)) != (0xD2 ^ 0x9F ^ (0x51 ^ 0x18))) {
                return ((62 + 152 - 168 + 197 ^ 97 + 71 - 91 + 108) & (0xBA ^ 0x89 ^ (0xF6 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            nArray = new int[0];
        }
        if (((var4 = Inventory.getAll((int[] != 0)(var3 = nArray))).isEmpty() ? 1 : 0)) {
            return 0;
        }
        int var5 = 0;
        while ((var5 < Math.min(var4.size(), 8))) {
            Item var6 = (Item)var4.get(var5);
            var6.interact(string -> {
                int n2;
                if (string != null && (!(string.equals(var1[9] == 0) ? 1 : 0) || !(string.equals(var1[var2[10]] == 0) ? 1 : 0) || (string.equals(var1[8] != 0) ? 1 : 0))) {
                    n2 = 1;
                    0;
                    if (3 != 3) {
                        return ((48 + 39 - -6 + 66 ^ 124 + 107 - 84 + 36) & (5 ^ 0x45 ^ (0xF9 ^ 0x91) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
            ++var5;
            0;
            if (1 != 0) continue;
            return ((0xE5 ^ 0xA7 ^ (0x7D ^ 0x26)) & (0xBE ^ 0x98 ^ (0xA9 ^ 0x96) ^ -1)) != 0;
        }
        return 1;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    @Inject
    public HandlingGearTask(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.ab = squireGorillaPlugin;
        this.ac = squireGorillaConfig;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        int var23;
        int n2;
        int var24;
        int n3;
        r var25;
        NPC var26;
        NPC nPC2;
        if ((Players.getLocal( == null).getInteracting())) {
            nPC2 = NPCs.getNearest(nPC -> {
                boolean bl;
                if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                    bl = 1;
                    0;
                    
                } else {
                    bl = 0;
                }
                return bl;
            });
            0;
            if null != null {
                return ((0x4D ^ 0x65 ^ (0x9A ^ 0xA4)) & (0xEF ^ 0xA2 ^ (0x35 ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            nPC2 = (NPC)Players.getLocal().getInteracting();
        }
        if (var26 = nPC2 == null) {
            return 0;
        }
        c var27 = var25.ab.a(var26);
        if var27 == null {
            return 0;
        }
        if ((var27.A( == null))) {
            return 0;
        }
        if (((EquipmentSetuplllllllllllllllIlIIllllllllllllI.ac.melee().selected(EquipmentSetup.class)).contains(itemComposition -> {
            boolean bl;
            void var28;
            String string = itemComposition.getName();
            if string == null {
                return 0;
            }
            String var29 = var28.toLowerCase();
            if (!(var29.contains(var1[var2[16]] == 0) ? 1 : 0) || !(var29.contains(var1[var2[17]] == 0) ? 1 : 0) || (var29.contains(var1[var2[18]] != 0) ? 1 : 0)) {
                bl = 1;
                0;
                if (-(121 + 117 - 156 + 91 ^ 11 + 11 - -29 + 118) >= 0) {
                    return ((123 + 72 - 84 + 16 ^ (0xA4 ^ 0x80)) & (0x17 ^ 0x7C ^ (0xA7 ^ 0x97) ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }) ? 1 : 0) && (var27.A() == var27.A()2)) {
            n3 = 1;
            0;
            if (1 > 1) {
                return ((0xE0 ^ 0xB0) & ~(0x29 ^ 0x79)) != 0;
            }
        } else {
            n3 = var24 = 0;
        }
        if ((var27.A() == var27.A()2)) {
            n2 = 1;
            0;
            if (-1 >= 0) {
                return ((0xAB ^ 0x97) & ~(0x76 ^ 0x4A)) != 0;
            }
        } else {
            n2 = 0;
        }
        if ((var23 = n2 != 0) && (Equipment.fromSlot(EquipmentInventorySlot != nullEquipmentInventorySlot.SHIELD)) && (Inventory.getFreeSlots( == 0))) {
            Item var30 = Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[0] = var1[var2[15]];
                return item.hasAction(stringArray);
            });
            if var30 != null {
                var30.interact(var1[0]);
                return 1;
            }
            Item var31 = Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[0] = var1[var2[14]];
                return item.hasAction(stringArray);
            });
            if var31 != null {
                var31.interact(var1[1]);
                return 1;
            }
            return 0;
        }
        if ((var23 == 0) && (Combat.getSpecEnergy() >= 2) && (Combat.getMissingHealth() > 3) && (Inventory.contains(item -> item.getName( != 0).toLowerCase().contains(var1[var2[13]])) ? 1 : 0)) {
            Item var30 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[12]]));
            var30.interact(var1[4]);
            Combat.toggleSpec();
            var26.interact(var1[5]);
            return 1;
        }
        if (var23 && (Combat.getSpecEnergy() >= 2) && (Combat.getMissingHealth() > 3) && (Equipment.contains(item -> item.getName( != 0).toLowerCase().contains(var1[var2[11]])) ? 1 : 0)) {
            Combat.toggleSpec();
            var26.interact(var1[6]);
            return 1;
        }
        if (!(var23 == 0) || var24) {
            configStorageBox = var25.ac.ranged();
            0;
            if (((145 + 34 - -3 + 45 ^ 36 + 59 - 12 + 77) & (0xCD ^ 0x9F ^ (0x4F ^ 0x5E) ^ -1)) < 0) {
                return ((0x1E ^ 0x7E ^ (0x1A ^ 0x26)) & (0xD4 ^ 0x81 ^ (0x27 ^ 0x2E) ^ -1)) != 0;
            }
        } else {
            configStorageBox = var25.ac.melee();
        }
        if ((var25.aconfigStorageBox)) {
            var26.interact(var1[7]);
            return 1;
        }
        return 0;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

}

