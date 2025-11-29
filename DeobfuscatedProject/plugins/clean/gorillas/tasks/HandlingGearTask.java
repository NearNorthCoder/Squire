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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c;

@TaskDesc(name="Handling Gear")
public class HandlingGearTask
extends Task {
    
    private final  SquireGorillaPlugin ab;
    private final  SquireGorillaConfig ac;

    private static boolean lllllIlIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    public boolean a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] var1;
        List var2;
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (r.lllllIlIIlIIII(equipmentSetup)) {
            nArray = equipmentSetup.getIds();

            if ((0xAD ^ 0xB3 ^ (0x48 ^ 0x52)) != (0xD2 ^ 0x9F ^ (0x51 ^ 0x18))) {
                return ((62 + 152 - 168 + 197 ^ 97 + 71 - 91 + 108) & (0xBA ^ 0x89 ^ (0xF6 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            nArray = new int[llIIlIIllllI[0]];
        }
        if (r.lllllIlIIIlllI((var2 = Inventory.getAll((int[])(var1 = nArray))).isEmpty() ? 1 : 0)) {
            return llIIlIIllllI[0];
        }
        int var3 = llIIlIIllllI[0];
        while (r.lllllIlIIlIlII(var3, Math.min(var2.size(), llIIlIIllllI[8]))) {
            Item var4 = (Item)var2.get(var3);
            var4.interact(string -> {
                int n2;
                if (r.lllllIlIIlIIII(string) && (!r.lllllIlIIlIIIl(string.equals(llIIlIIlllIl[llIIlIIllllI[9]]) ? 1 : 0) || !r.lllllIlIIlIIIl(string.equals(llIIlIIlllIl[llIIlIIllllI[10]]) ? 1 : 0) || r.lllllIlIIIlllI(string.equals(llIIlIIlllIl[llIIlIIllllI[8]]) ? 1 : 0))) {
                    n2 = llIIlIIllllI[1];

                    if (3 != 3) {
                        return ((48 + 39 - -6 + 66 ^ 124 + 107 - 84 + 36) & (5 ^ 0x45 ^ (0xF9 ^ 0x91) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIllllI[0];
                }
                return n2 != 0;
            });
            ++var3;

            if (1 != 0) continue;
            return ((0xE5 ^ 0xA7 ^ (0x7D ^ 0x26)) & (0xBE ^ 0x98 ^ (0xA9 ^ 0x96) ^ -1)) != 0;
        }
        return llIIlIIllllI[1];
    }

    private static boolean lllllIlIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllIlIIIlIll() {
        llIIlIIlllIl = new String[llIIlIIllllI[19]];
        r.llIIlIIlllIl[r.llIIlIIllllI[0]] = "Eat";
        r.llIIlIIlllIl[r.llIIlIIllllI[1]] = "Drop";
        r.llIIlIIlllIl[r.llIIlIIllllI[4]] = "Wield";
        r.llIIlIIlllIl[r.llIIlIIllllI[5]] = "Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[6]] = "Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[7]] = "Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[9]] = "Wield";
        r.llIIlIIlllIl[r.llIIlIIllllI[10]] = "Wear";
        r.llIIlIIlllIl[r.llIIlIIllllI[8]] = "Equip";
        r.llIIlIIlllIl[r.llIIlIIllllI[11]] = "toxic blow";
        r.llIIlIIlllIl[r.llIIlIIllllI[12]] = "saradomin god";
        r.llIIlIIlllIl[r.llIIlIIllllI[13]] = "saradomin god";
        r.llIIlIIlllIl[r.llIIlIIllllI[14]] = "Drink";
        r.llIIlIIlllIl[r.llIIlIIllllI[15]] = "Eat";
        r.llIIlIIlllIl[r.llIIlIIllllI[16]] = "trident";
        r.llIIlIIlllIl[r.llIIlIIllllI[17]] = "staff";
        r.llIIlIIlllIl[r.llIIlIIllllI[18]] = "tumeken";
    }

    private static boolean lllllIlIIlIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }

    static {
        r.lllllIlIIIllII();
        r.lllllIlIIIlIll();
    }

    private static boolean lllllIlIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllllIlIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public HandlingGearTask(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.ab = squireGorillaPlugin;
        this.ac = squireGorillaConfig;
    }

    private static boolean lllllIlIIIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        int var6;
        int n2;
        int var7;
        int n3;
        r var8;
        NPC var9;
        NPC nPC2;
        if (r.lllllIlIIIllIl(Players.getLocal().getInteracting())) {
            nPC2 = NPCs.getNearest(nPC -> {
                boolean bl;
                if (r.lllllIlIIIllll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIIlIIllllI[1];

                    if (3 == 0) {
                        return ((0x55 ^ 0x70 ^ (0x24 ^ 0x44)) & (115 + 83 - 193 + 212 ^ 22 + 42 - -63 + 29 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIlIIllllI[0];
                }
                return bl;
            });

            }
        } else {
            nPC2 = (NPC)Players.getLocal().getInteracting();
        }
        if (r.lllllIlIIIllIl(var9 = nPC2)) {
            return llIIlIIllllI[0];
        }
        c var10 = var8.ab.a(var9);
        if (r.lllllIlIIIllIl(var10)) {
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIIllIl(var10.A())) {
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIIlllI(((EquipmentSetup)var8.ac.melee().selected(EquipmentSetup.class)).contains(itemComposition -> {
            boolean bl;
            void var11;
            String string = itemComposition.getName();
            if (r.lllllIlIIIllIl(string)) {
                return llIIlIIllllI[0];
            }
            String var12 = var11.toLowerCase();
            if (!r.lllllIlIIlIIIl(var12.contains(llIIlIIlllIl[llIIlIIllllI[16]]) ? 1 : 0) || !r.lllllIlIIlIIIl(var12.contains(llIIlIIlllIl[llIIlIIllllI[17]]) ? 1 : 0) || r.lllllIlIIIlllI(var12.contains(llIIlIIlllIl[llIIlIIllllI[18]]) ? 1 : 0)) {
                bl = llIIlIIllllI[1];

                if (-(121 + 117 - 156 + 91 ^ 11 + 11 - -29 + 118) >= 0) {
                    return ((123 + 72 - 84 + 16 ^ (0xA4 ^ 0x80)) & (0x17 ^ 0x7C ^ (0xA7 ^ 0x97) ^ -1)) != 0;
                }
            } else {
                bl = llIIlIIllllI[0];
            }
            return bl;
        }) ? 1 : 0) && r.lllllIlIIIllll(var10.A(), HeadIcon.MAGIC)) {
            n3 = llIIlIIllllI[1];

            if (1 > 1) {
                return false;
            }
        } else {
            n3 = var7 = llIIlIIllllI[0];
        }
        if (r.lllllIlIIIllll(var10.A(), HeadIcon.MELEE)) {
            n2 = llIIlIIllllI[1];

        } else {
            n2 = llIIlIIllllI[0];
        }
        if (r.lllllIlIIIlllI(var6 = n2) && r.lllllIlIIlIIII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && r.lllllIlIIlIIIl(Inventory.getFreeSlots())) {
            Item var13 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIlIIllllI[1]];
                stringArray[r.llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[15]];
                return item.hasAction(stringArray);
            });
            if (r.lllllIlIIlIIII(var13)) {
                var13.interact(llIIlIIlllIl[llIIlIIllllI[0]]);
                return llIIlIIllllI[1];
            }
            Item var14 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIlIIllllI[1]];
                stringArray[r.llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[14]];
                return item.hasAction(stringArray);
            });
            if (r.lllllIlIIlIIII(var14)) {
                var14.interact(llIIlIIlllIl[llIIlIIllllI[1]]);
                return llIIlIIllllI[1];
            }
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIlIIIl(var6) && r.lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && r.lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && r.lllllIlIIIlllI(Inventory.contains(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[13]])) ? 1 : 0)) {
            Item var13 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[12]]));
            var13.interact(llIIlIIlllIl[llIIlIIllllI[4]]);
            Combat.toggleSpec();
            var9.interact(llIIlIIlllIl[llIIlIIllllI[5]]);
            return llIIlIIllllI[1];
        }
        if (r.lllllIlIIIlllI(var6) && r.lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && r.lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && r.lllllIlIIIlllI(Equipment.contains(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[11]])) ? 1 : 0)) {
            Combat.toggleSpec();
            var9.interact(llIIlIIlllIl[llIIlIIllllI[6]]);
            return llIIlIIllllI[1];
        }
        if (!r.lllllIlIIlIIIl(var6) || r.lllllIlIIIlllI(var7)) {
            configStorageBox = var8.ac.ranged();

            if (((145 + 34 - -3 + 45 ^ 36 + 59 - 12 + 77) & (0xCD ^ 0x9F ^ (0x4F ^ 0x5E) ^ -1)) < 0) {
                return ((0x1E ^ 0x7E ^ (0x1A ^ 0x26)) & (0xD4 ^ 0x81 ^ (0x27 ^ 0x2E) ^ -1)) != 0;
            }
        } else {
            configStorageBox = var8.ac.melee();
        }
        if (r.lllllIlIIIlllI(var8.a(configStorageBox) ? 1 : 0)) {
            var9.interact(llIIlIIlllIl[llIIlIIllllI[7]]);
            return llIIlIIllllI[1];
        }
        return llIIlIIllllI[0];
    }

    private static boolean lllllIlIIIllll(Object object, Object object2) {
        return object == object2;
    }
}

