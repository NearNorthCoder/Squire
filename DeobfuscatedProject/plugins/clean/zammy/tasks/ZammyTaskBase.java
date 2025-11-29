/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;

public abstract class ZammyTaskBase
extends Task {
    protected final  SquireZammyConfig H;

    protected final  l I;

    private static void llIIIlIllIIIIlI() {
        lIllIIIllllIl = new String[lIllIIIllllll[4]];
        m.lIllIIIllllIl[m.lIllIIIllllll[0]] = "Wield";
        m.lIllIIIllllIl[m.lIllIIIllllll[2]] = "Wear";
        m.lIllIIIllllIl[m.lIllIIIllllll[3]] = "Equip";
    }

    private static boolean llIIIlIllIIIlll(int n2) {
        return n2 == 0;
    }

    static {
        m.llIIIlIllIIIIll();
        m.llIIIlIllIIIIlI();
    }

    public ZammyTaskBase(SquireZammyConfig squireZammyConfig, l l2) {
        this.H = squireZammyConfig;
        this.I = l2;
    }

    private static boolean llIIIlIllIIIlII(int n2) {
        return n2 != 0;
    }

    public boolean b(int[] nArray) {
        return Inventory.contains((int[])nArray);
    }

    private static boolean llIIIlIllIIIllI(Object object) {
        return object != null;
    }

    public int[] K() {
        return this.a(this.H.mageGear());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray) {
        void var1;
        List list = Inventory.getAll((int[])nArray);
        if (m.llIIIlIllIIIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIIIllllll[0];
        }
        int var2 = lIllIIIllllll[0];
        while (m.llIIIlIllIIIlIl(var2, Math.min(var1.size(), lIllIIIllllll[1]))) {
            Item var3 = (Item)var1.get(var2);
            var3.interact(string -> {
                int n2;
                if (m.llIIIlIllIIIllI(string) && (!m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[0]]) ? 1 : 0) || !m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[2]]) ? 1 : 0) || m.llIIIlIllIIIlII(string.equals(lIllIIIllllIl[lIllIIIllllll[3]]) ? 1 : 0))) {
                    n2 = lIllIIIllllll[2];

                } else {
                    n2 = lIllIIIllllll[0];
                }
                return n2 != 0;
            });
            ++var2;

            if (3 >= 0) continue;
            return false;
        }
        return lIllIIIllllll[2];
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (m.llIIIlIllIIIllI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();

            if (1 <= -1) {
                return null;
            }
        } else {
            nArray = new int[lIllIIIllllll[0]];
        }
        return nArray;
    }

    public int[] L() {
        return this.a(this.H.rangedGear());
    }

    private static boolean llIIIlIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

