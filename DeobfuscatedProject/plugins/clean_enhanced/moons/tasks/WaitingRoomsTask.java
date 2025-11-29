/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Waiting rooms")
public class WaitingRoomsTask
extends Task {

    final  WorldArea ad;
    private final  SquireMoonsOfPerilConfig ac;
    final  WorldArea ae;
    final  WorldArea af;

    @Inject
    public WaitingRoomsTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.ad = new WorldArea(var2[0], var2[1], var2[2], var2[3], var2[4]);
        this.ae = new WorldArea(var2[5], var2[6], var2[7], var2[2], var2[4]);
        this.af = new WorldArea(var2[8], var2[9], var2[10], var2[11], var2[4]);
        this.ac = squireMoonsOfPerilConfig;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.ac.blueMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean var3(int n, int n2) {
        return n < n2;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private boolean e() {
        boolean bl;
        if (!i.var5(this.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !i.var5(this.ae.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || i.var6(this.af.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = var2[12];
            0;
            if (2 <= ((0xA4 ^ 0x94) & ~(0xBC ^ 0x8C))) {
                return ((0x91 ^ 0x94) & ~(0xA3 ^ 0xA6)) != 0;
            }
        } else {
            bl = var2[4];
        }
        return bl;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n) {
        return n == 0;
    }

    public boolean run() {
        i var13;
        if (i.var5(this.e() ? 1 : 0)) {
            return var2[4];
        }
        if (i.var6(var13.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && i.var5(var13.b().isFullyEquipped() ? 1 : 0)) {
            if (i.var6(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var2[12]];
                stringArray[i.var2[4]] = var1[var2[4]];
                if (i.var6(Inventory.contains((String[])stringArray) ? 1 : 0) && i.var4(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && i.var14(var13.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[var2[12]];
                    stringArray2[i.var2[4]] = var1[var2[12]];
                    Inventory.getFirst((String[])stringArray2).interact(var1[var2[13]]);
                }
            }
            var13.b().swap();
        }
        SquireMoonsOfPeril.g = var1[var2[14]];
        String[] stringArray = new String[var2[12]];
        stringArray[i.var2[4]] = var1[var2[15]];
        TileObject var15 = TileObjects.getNearest((String[])stringArray);
        if (i.var4(var15)) {
            var15.interact(var1[var2[16]]);
            return var2[12];
        }
        return var2[4];
    }

    private static void var16() {
        var1 = new String[var2[17]];
        i.var1[i.var2[4]] = "Cooked bream";
        i.var1[i.var2[12]] = "Cooked bream";
        i.var1[i.var2[13]] = "Eat";
        i.var1[i.var2[14]] = "Use Statue";
        i.var1[i.var2[15]] = "Statue";
        i.var1[i.var2[16]] = "Use";
    }

    private static boolean var14(int n) {
        return n <= 0;
    }

    private static boolean var6(int n) {
        return n != 0;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var2[4];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var2[4];
        while (i.var3(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (3 > 2) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void var27() {
        var2 = new int[19];
        i.var2[0] = -(0xFFFFAB8B & 0x5E7D) & (0xFFFF8F9F & Short.MAX_VALUE);
        i.var2[1] = -(0x96 ^ 0x93) & (0xFFFFFFB7 & 0x25FF);
        i.var2[2] = 0x2C ^ 0x3E;
        i.var2[3] = 8 ^ 4;
        i.var2[4] = (0xFF ^ 0xBF) & ~(0xC6 ^ 0x86);
        i.var2[5] = -(0xFFFFFB9D & 0x7C7F) & (0xFFFFFFFF & 0x7D9C);
        i.var2[6] = -(0xFFFFD0E9 & 0x6F7F) & (0xFFFFF7FF & 0x6DFF);
        i.var2[7] = 0xB7 ^ 0x95 ^ (0xF ^ 0x22);
        i.var2[8] = -(0xFFFFDBDF & 0x3E66) & (0xFFFFFFF7 & 0x1FFF);
        i.var2[9] = 0xFFFFBDFF & 0x6798;
        i.var2[10] = 0x8C ^ 0x81;
        i.var2[11] = 10 + 105 - 66 + 109 ^ 57 + 73 - 80 + 92;
        i.var2[12] = 1;
        i.var2[13] = 2;
        i.var2[14] = 3;
        i.var2[15] = 0xAE ^ 0xAA;
        i.var2[16] = 0x23 ^ 0x6F ^ (0xF3 ^ 0xBA);
        i.var2[17] = 3 + 64 - -63 + 32 ^ 137 + 80 - 152 + 99;
        i.var2[18] = 0xBE ^ 0xB6;
    }

    static {
        i.var27();
        i.var16();
    }
}

