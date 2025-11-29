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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Using blowpipe spec", priority=100)
public class UsingBlowpipeSpecTask
extends Task {

    private final  SquireAlchemicalHydraConfig aB;
    private  String aC;
    private final  a aA;

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIlIlII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        t var2;
        if (t.lIIlIIIIlIlIlII(this.aA.k())) {
            return llllIlIIlIlI[0];
        }
        if (t.lIIlIIIIlIlIlIl(var2.aA.k().Q() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        Item var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (t.lIIlIIIIlIlIlII(var3)) {
            return llllIlIIlIlI[0];
        }
        if (!t.lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) || t.lIIlIIIIlIlIlll(Combat.getMissingHealth(), llllIlIIlIlI[2])) {
            String[] stringArray = new String[llllIlIIlIlI[3]];
            stringArray[t.llllIlIIlIlI[0]] = var2.aC;
            if (t.lIIlIIIIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llllIlIIlIlI[3]];
                stringArray2[t.llllIlIIlIlI[0]] = var2.aC;
                Inventory.getFirst((String[])stringArray2).interact(llllIlIIlIIl[llllIlIIlIlI[3]]);
            }
            return llllIlIIlIlI[0];
        }
        if (t.lIIlIIIIlIllIII(var3.getName().contains(llllIlIIlIIl[llllIlIIlIlI[4]]) ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIlIlI[3]];
            stringArray[t.llllIlIIlIlI[0]] = llllIlIIlIIl[llllIlIIlIlI[5]];
            Item var4 = Inventory.getFirst((String[])stringArray);
            var2.aC = var3.getName();
            if (t.lIIlIIIIlIlIlII(var4)) {
                return llllIlIIlIlI[0];
            }
            if (t.lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) && t.lIIlIIIIlIlIlIl(var2.aB.blowpipeSpec() ? 1 : 0)) {
                var4.interact(llllIlIIlIIl[llllIlIIlIlI[6]]);
            }
            return llllIlIIlIlI[3];
        }
        if (t.lIIlIIIIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        Combat.toggleSpec();
        return llllIlIIlIlI[3];
    }

    static {
        t.lIIlIIIIlIlIIll();
        t.lIIlIIIIlIlIIlI();
    }

    @Inject
    public UsingBlowpipeSpecTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aC = llllIlIIlIIl[llllIlIIlIlI[0]];
        this.aA = a2;
        this.aB = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIIIlIlIIlI() {
        llllIlIIlIIl = new String[llllIlIIlIlI[7]];
        t.llllIlIIlIIl[t.llllIlIIlIlI[0]] = t.lIIlIIIIlIIllll("WK1NT/aWpes=", "kVxDm");
        t.llllIlIIlIIl[t.llllIlIIlIlI[3]] = "Wield";
        t.llllIlIIlIIl[t.llllIlIIlIlI[4]] = "blowpipe";
        t.llllIlIIlIIl[t.llllIlIIlIlI[5]] = "Toxic blowpipe";
        t.llllIlIIlIIl[t.llllIlIIlIlI[6]] = "Wield";
    }
}

