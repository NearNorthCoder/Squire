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
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;

public abstract class m
extends Task {
    protected final /* synthetic */ SquireZammyConfig H;
    private static /* synthetic */ String[] lIllIIIllllIl;
    private static /* synthetic */ int[] lIllIIIllllll;
    protected final /* synthetic */ l I;

    private static void llIIIlIllIIIIlI() {
        lIllIIIllllIl = new String[lIllIIIllllll[4]];
        m.lIllIIIllllIl[m.lIllIIIllllll[0]] = m.llIIIlIlIlllIIl("DrinCyOzEk8=", "Bpeux");
        m.lIllIIIllllIl[m.lIllIIIllllll[2]] = m.llIIIlIlIlllIlI("wRI5JMbIZHc=", "JkhiG");
        m.lIllIIIllllIl[m.lIllIIIllllll[3]] = m.llIIIlIlIlllIlI("bvrOl9yVlz0=", "YDlHM");
    }

    private static boolean llIIIlIllIIIlll(int n2) {
        return n2 == 0;
    }

    private static String llIIIlIlIlllIlI(String llllllllllllllIllIIlIlIllIlIIlIl, String llllllllllllllIllIIlIlIllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIllIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIllIlIIlll.init(lIllIIIllllll[3], llllllllllllllIllIIlIlIllIlIlIII);
            return new String(llllllllllllllIllIIlIlIllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIllIlIIllI) {
            llllllllllllllIllIIlIlIllIlIIllI.printStackTrace();
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
        m.lIllIIIllllll[0] = (177 + 128 - 160 + 46 ^ 97 + 62 - 47 + 25) & (19 + 6 - -65 + 48 ^ 121 + 81 - 24 + 10 ^ -" ".length());
        m.lIllIIIllllll[1] = 80 + 73 - -21 + 3 ^ 60 + 116 - -3 + 3;
        m.lIllIIIllllll[2] = " ".length();
        m.lIllIIIllllll[3] = "  ".length();
        m.lIllIIIllllll[4] = "   ".length();
        m.lIllIIIllllll[5] = 0xC ^ 4;
    }

    public boolean b(int[] nArray) {
        return Inventory.contains((int[])nArray);
    }

    private static boolean llIIIlIllIIIllI(Object object) {
        return object != null;
    }

    private static String llIIIlIlIlllIIl(String llllllllllllllIllIIlIlIllIIllIII, String llllllllllllllIllIIlIlIllIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIllIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIllIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIllllll[5]), "DES");
            Cipher llllllllllllllIllIIlIlIllIIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIllIIllIlI.init(lIllIIIllllll[3], llllllllllllllIllIIlIlIllIIllIll);
            return new String(llllllllllllllIllIIlIlIllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIllIIllIIl) {
            llllllllllllllIllIIlIlIllIIllIIl.printStackTrace();
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
        void llllllllllllllIllIIlIlIllIllIlIl;
        List list = Inventory.getAll((int[])nArray);
        if (m.llIIIlIllIIIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIIIllllll[0];
        }
        int llllllllllllllIllIIlIlIllIllIlII = lIllIIIllllll[0];
        while (m.llIIIlIllIIIlIl(llllllllllllllIllIIlIlIllIllIlII, Math.min(llllllllllllllIllIIlIlIllIllIlIl.size(), lIllIIIllllll[1]))) {
            Item llllllllllllllIllIIlIlIllIllIIll = (Item)llllllllllllllIllIIlIlIllIllIlIl.get(llllllllllllllIllIIlIlIllIllIlII);
            llllllllllllllIllIIlIlIllIllIIll.interact(string -> {
                int n2;
                if (m.llIIIlIllIIIllI(string) && (!m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[0]]) ? 1 : 0) || !m.llIIIlIllIIIlll(string.equals(lIllIIIllllIl[lIllIIIllllll[2]]) ? 1 : 0) || m.llIIIlIllIIIlII(string.equals(lIllIIIllllIl[lIllIIIllllll[3]]) ? 1 : 0))) {
                    n2 = lIllIIIllllll[2];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x5F ^ 0x61 ^ (0xA ^ 5)) & (131 + 75 - 198 + 146 ^ 126 + 18 - 108 + 135 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIllllll[0];
                }
                return n2 != 0;
            });
            ++llllllllllllllIllIIlIlIllIllIlII;
            "".length();
            if ("   ".length() >= 0) continue;
            return ((0x93 ^ 0xA8) & ~(0xB0 ^ 0x8B)) != 0;
        }
        return lIllIIIllllll[2];
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (m.llIIIlIllIIIllI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            "".length();
            if (" ".length() <= -" ".length()) {
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

