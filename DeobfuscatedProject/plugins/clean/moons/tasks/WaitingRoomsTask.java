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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        this.ad = new WorldArea(lIIIIIIlIllIl[0], lIIIIIIlIllIl[1], lIIIIIIlIllIl[2], lIIIIIIlIllIl[3], lIIIIIIlIllIl[4]);
        this.ae = new WorldArea(lIIIIIIlIllIl[5], lIIIIIIlIllIl[6], lIIIIIIlIllIl[7], lIIIIIIlIllIl[2], lIIIIIIlIllIl[4]);
        this.af = new WorldArea(lIIIIIIlIllIl[8], lIIIIIIlIllIl[9], lIIIIIIlIllIl[10], lIIIIIIlIllIl[11], lIIIIIIlIllIl[4]);
        this.ac = squireMoonsOfPerilConfig;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.ac.blueMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllllIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlllllIIIIl(Object object) {
        return object != null;
    }

    private boolean e() {
        boolean bl;
        if (!i.lIIlIllllIllllI(this.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !i.lIIlIllllIllllI(this.ae.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || i.lIIlIlllllIIIII(this.af.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lIIIIIIlIllIl[12];

            if (2 <= ((0xA4 ^ 0x94) & ~(0xBC ^ 0x8C))) {
                return false;
            }
        } else {
            bl = lIIIIIIlIllIl[4];
        }
        return bl;
    }

    private static boolean lIIlIllllIllllI(int n) {
        return n == 0;
    }

    public boolean run() {
        i var1;
        if (i.lIIlIllllIllllI(this.e() ? 1 : 0)) {
            return lIIIIIIlIllIl[4];
        }
        if (i.lIIlIlllllIIIII(var1.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && i.lIIlIllllIllllI(var1.b().isFullyEquipped() ? 1 : 0)) {
            if (i.lIIlIlllllIIIII(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIllIl[12]];
                stringArray[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[4]];
                if (i.lIIlIlllllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0) && i.lIIlIlllllIIIIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && i.lIIlIlllllIIIlI(var1.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIllIl[12]];
                    stringArray2[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[12]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIlIlIll[lIIIIIIlIllIl[13]]);
                }
            }
            var1.b().swap();
        }
        SquireMoonsOfPeril.g = lIIIIIIlIlIll[lIIIIIIlIllIl[14]];
        String[] stringArray = new String[lIIIIIIlIllIl[12]];
        stringArray[i.lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[15]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (i.lIIlIlllllIIIIl(var2)) {
            var2.interact(lIIIIIIlIlIll[lIIIIIIlIllIl[16]]);
            return lIIIIIIlIllIl[12];
        }
        return lIIIIIIlIllIl[4];
    }

    private static void lIIlIllllIllIlI() {
        lIIIIIIlIlIll = new String[lIIIIIIlIllIl[17]];
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[4]] = "Cooked bream";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[12]] = "Cooked bream";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[13]] = "Eat";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[14]] = "Use Statue";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[15]] = "Statue";
        i.lIIIIIIlIlIll[i.lIIIIIIlIllIl[16]] = "Use";
    }

    private static boolean lIIlIlllllIIIlI(int n) {
        return n <= 0;
    }

    private static boolean lIIlIlllllIIIII(int n) {
        return n != 0;
    }

        return String.valueOf(var3);
    }

    static {
        i.lIIlIllllIlllIl();
        i.lIIlIllllIllIlI();
    }
}

