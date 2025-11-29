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
package m.e.a.i.z.m.r.-.q.s.y.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;

public abstract class m_Unknown
extends Task {
    protected final /* synthetic */ SquireZammyConfig H;
    private static /* synthetic */ String[] lIllIIIllllIl;
    private static /* synthetic */ int[] lIllIIIllllll;
    protected final /* synthetic */ l I;

    private static void llIIIlIllIIIIlI() {
        lIllIIIllllIl = new String[lIllIIIllllll[4]];
        m.lIllIIIllllIl[m.lIllIIIllllll[0]] = m."Wield";
        m.lIllIIIllllIl[m.lIllIIIllllll[2]] = m."Wear";
        m.lIllIIIllllIl[m.lIllIIIllllll[3]] = m."Equip";
    }

    private static boolean llIIIlIllIIIlll(int n2) {
        return n2 == 0;
    }

    private static String llIIIlIlIlllIlI(String var9, String var11) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIIIllllll[3], var10);
            return new String(var1.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    static {
        m.llIIIlIllIIIIll();
        m.llIIIlIllIIIIlI();
    }

    public m(SquireZammyConfig squireZammyConfig, l l2) {
        this.H = squireZammyConfig;
        this.I = l2;
    }

    private static boolean llIIIlIllIIIlII(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIllIIIIll() {
        lIllIIIllllll = new int[6];
        m.lIllIIIllllll[0] = (177 + 128 - 160 + 46 ^ 97 + 62 - 47 + 25) & (19 + 6 - -65 + 48 ^ 121 + 81 - 24 + 10 ^ -1);
        m.lIllIIIllllll[1] = 80 + 73 - -21 + 3 ^ 60 + 116 - -3 + 3;
        m.lIllIIIllllll[2] = 1;
        m.lIllIIIllllll[3] = 2;
        m.lIllIIIllllll[4] = 3;
        m.lIllIIIllllll[5] = 0xC ^ 4;
    }

    public boolean b(int[] nArray) {
        return Inventory.contains((int[])nArray);
    }

    private static boolean llIIIlIllIIIllI(Object object) {
        return object != null;
    }

    private static String llIIIlIlIlllIIl(String var12, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllIIIllllll[5]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIllIIIllllll[3], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public int[] K() {
        return this.a(this.H.mageGear());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray) {
        void var6;
        List list = Inventory.getAll((int[])nArray);
        if (m.llIIIlIllIIIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIIIllllll[0];
        }
        int var3 = lIllIIIllllll[0];
        while (m.llIIIlIllIIIlIl(var3, Math.min(var6.size(), lIllIIIllllll[1]))) {
            Item var13 = (Item)var6.get(var3);
            var13.interact(string -> {
                int n2;
                if (m.llIIIlIllIIIllI(string) && (!m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[0]]) ? 1 : 0) || !m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[2]]) ? 1 : 0) || m.llIIIlIllIIIlII(string.equals(lIllIIIllllIl[lIllIIIllllll[3]]) ? 1 : 0))) {
                    n2 = lIllIIIllllll[2];
                    0;
                    if (-2 >= 0) {
                        return ((0x5F ^ 0x61 ^ (0xA ^ 5)) & (131 + 75 - 198 + 146 ^ 126 + 18 - 108 + 135 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIIIllllll[0];
                }
                return n2 != 0;
            });
            ++var3;
            0;
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
            0;
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

