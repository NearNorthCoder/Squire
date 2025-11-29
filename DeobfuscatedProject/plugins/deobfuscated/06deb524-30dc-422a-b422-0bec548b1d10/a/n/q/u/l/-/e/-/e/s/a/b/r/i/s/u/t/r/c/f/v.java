/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class v
extends w {
    private final /* synthetic */ int[] av;
    private static /* synthetic */ int[] lIIlIllllIlI;
    private static /* synthetic */ String[] lIIlIllllIIl;

    private static boolean llIIllIllIlIIl(Object object) {
        return object == null;
    }

    private static String llIIllIllIIlIl(String lllllllllllllllIllllIIIIlIllIIIl, String lllllllllllllllIllllIIIIlIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIlIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIllllIlI[9]), "DES");
            Cipher lllllllllllllllIllllIIIIlIllIIll = Cipher.getInstance("DES");
            lllllllllllllllIllllIIIIlIllIIll.init(lIIlIllllIlI[3], lllllllllllllllIllllIIIIlIllIlII);
            return new String(lllllllllllllllIllllIIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllllIIIIlIllIIlI) {
            lllllllllllllllIllllIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIllIllIIllI() {
        lIIlIllllIIl = new String[lIIlIllllIlI[10]];
        v.lIIlIllllIIl[v.lIIlIllllIlI[0]] = v." ";
        v.lIIlIllllIIl[v.lIIlIllllIlI[2]] = v."Equip";
        v.lIIlIllllIIl[v.lIIlIllllIlI[3]] = v."Refill";
        v.lIIlIllllIIl[v.lIIlIllllIlI[4]] = v."Fill";
        v.lIIlIllllIIl[v.lIIlIllllIlI[5]] = v."Empty";
        v.lIIlIllllIIl[v.lIIlIllllIlI[6]] = v."Wear";
        v.lIIlIllllIIl[v.lIIlIllllIlI[7]] = v."Equip";
        v.lIIlIllllIIl[v.lIIlIllllIlI[8]] = v."Wield";
        v.lIIlIllllIIl[v.lIIlIllllIlI[9]] = v."Fill";
    }

    private static boolean llIIllIllIlIII(int n2) {
        return n2 != 0;
    }

    private static String llIIllIllIIlII(String lllllllllllllllIllllIIIIlIlllllI, String lllllllllllllllIllllIIIIlIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllllIIIIllIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllllIIIIllIIIIII.init(lIIlIllllIlI[3], lllllllllllllllIllllIIIIllIIIIIl);
            return new String(lllllllllllllllIllllIIIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllllIIIIlIllllll) {
            lllllllllllllllIllllIIIIlIllllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(o o2) {
        String lllllllllllllllIllllIIIIlllIIIII;
        Item lllllllllllllllIllllIIIIlllIIIIl;
        v lllllllllllllllIllllIIIIlllIIIll;
        Item item;
        if (v.llIIllIllIlIII(Bank.isOpen() ? 1 : 0)) {
            item = Bank.Inventory.getFirst((int[])this.av);
            0;
            if ((0x15 ^ 0x10) <= 0) {
                return ((0x20 ^ 0) & ~(0x74 ^ 0x54)) != 0;
            }
        } else {
            item = Inventory.getFirst((int[])lllllllllllllllIllllIIIIlllIIIll.av);
        }
        if (v.llIIllIllIlIIl(lllllllllllllllIllllIIIIlllIIIIl = item)) {
            return lIIlIllllIlI[0];
        }
        String lllllllllllllllIllllIIIIllIlllll = lllllllllllllllIllllIIIIlllIIIII = lllllllllllllllIllllIIIIlllIIIll.aw.split(lIIlIllllIIl[lIIlIllllIlI[0]])[lIIlIllllIlI[0]];
        int lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[1];
        switch (lllllllllllllllIllllIIIIllIlllll.hashCode()) {
            case 67205136: {
                if (!v.llIIllIllIlIII(lllllllllllllllIllllIIIIllIlllll.equals(lIIlIllllIIl[lIIlIllllIlI[2]]) ? 1 : 0)) break;
                lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[0];
                0;
                if ((0x8E ^ 0x8B) > 0) break;
                return ((0x34 ^ 0x24) & ~(0x1B ^ 0xB)) != 0;
            }
            case -1850958250: {
                if (!v.llIIllIllIlIII(lllllllllllllllIllllIIIIllIlllll.equals(lIIlIllllIIl[lIIlIllllIlI[3]]) ? 1 : 0)) break;
                lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[2];
                0;
                if (((0xDB ^ 0x8E ^ (0x8B ^ 0xBC)) & (0xCF ^ 0x95 ^ (0x81 ^ 0xB9) ^ -1)) < 3) break;
                return ((0xE2 ^ 0xC1 ^ (6 ^ 0x15)) & (0x7E ^ 0x56 ^ (0x4E ^ 0x56) ^ -1)) != 0;
            }
            case 2189731: {
                if (!v.llIIllIllIlIII(lllllllllllllllIllllIIIIllIlllll.equals(lIIlIllllIIl[lIIlIllllIlI[4]]) ? 1 : 0)) break;
                lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[3];
                0;
                if (3 != 0) break;
                return ((0x51 ^ 0x18) & ~(0x3E ^ 0x77)) != 0;
            }
            case 67081517: {
                if (!v.llIIllIllIlIII(lllllllllllllllIllllIIIIllIlllll.equals(lIIlIllllIIl[lIIlIllllIlI[5]]) ? 1 : 0)) break;
                lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[4];
            }
        }
        switch (lllllllllllllllIllllIIIIllIllllI) {
            case 0: {
                String[] stringArray = new String[lIIlIllllIlI[4]];
                stringArray[v.lIIlIllllIlI[0]] = lIIlIllllIIl[lIIlIllllIlI[6]];
                stringArray[v.lIIlIllllIlI[2]] = lIIlIllllIIl[lIIlIllllIlI[7]];
                stringArray[v.lIIlIllllIlI[3]] = lIIlIllllIIl[lIIlIllllIlI[8]];
                lllllllllllllllIllllIIIIlllIIIIl.interact(stringArray);
                0;
                if (-1 == -1) break;
                return ((0xF ^ 0x2F) & ~(0x99 ^ 0xB9)) != 0;
            }
            case 1: 
            case 2: {
                void lllllllllllllllIllllIIIIlllIIIlI;
                lllllllllllllllIllllIIIIlllIIIIl.interact(lIIlIllllIIl[lIIlIllllIlI[9]]);
                lllllllllllllllIllllIIIIlllIIIlI.k().u();
                0;
                if (3 == 3) break;
                return ((187 + 151 - 255 + 150 ^ 11 + 74 - 73 + 151) & (0x3A ^ 0x7E ^ (0x54 ^ 0x5A) ^ -1)) != 0;
            }
            case 3: {
                void lllllllllllllllIllllIIIIlllIIIlI;
                lllllllllllllllIllllIIIIlllIIIIl.interact(lllllllllllllllIllllIIIIlllIIIII);
                lllllllllllllllIllllIIIIlllIIIlI.k().t();
                0;
                if ((189 + 36 - 44 + 14 ^ 187 + 139 - 197 + 70) != -1) break;
                return ((1 ^ (0x38 ^ 0x3E)) & (106 + 160 - 192 + 125 ^ 55 + 83 - 128 + 182 ^ -1)) != 0;
            }
            default: {
                lllllllllllllllIllllIIIIlllIIIIl.interact(lllllllllllllllIllllIIIIlllIIIII);
            }
        }
        return lIIlIllllIlI[2];
    }

    static {
        v.llIIllIllIIlll();
        v.llIIllIllIIllI();
    }

    public v(String string, int ... nArray) {
        super(string);
        this.av = nArray;
    }

    public int[] I() {
        return this.av;
    }

    private static void llIIllIllIIlll() {
        lIIlIllllIlI = new int[11];
        v.lIIlIllllIlI[0] = (0xCD ^ 0x99) & ~(3 ^ 0x57);
        v.lIIlIllllIlI[1] = -1;
        v.lIIlIllllIlI[2] = 1;
        v.lIIlIllllIlI[3] = 2;
        v.lIIlIllllIlI[4] = 3;
        v.lIIlIllllIlI[5] = 0x9F ^ 0x9B;
        v.lIIlIllllIlI[6] = 0xA7 ^ 0xA2;
        v.lIIlIllllIlI[7] = 0x39 ^ 0x3E ^ 1;
        v.lIIlIllllIlI[8] = 14 + 136 - 101 + 104 ^ 127 + 108 - 134 + 57;
        v.lIIlIllllIlI[9] = 0x87 ^ 0x8F;
        v.lIIlIllllIlI[10] = 10 + 130 - 139 + 157 ^ 108 + 115 - 184 + 112;
    }

    private static String llIIllIllIIIll(String lllllllllllllllIllllIIIIllIIlllI, String lllllllllllllllIllllIIIIllIlIIlI) {
        lllllllllllllllIllllIIIIllIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllllIIIIllIlIIIl = new StringBuilder();
        char[] lllllllllllllllIllllIIIIllIlIIII = lllllllllllllllIllllIIIIllIlIIlI.toCharArray();
        int lllllllllllllllIllllIIIIllIIllll = lIIlIllllIlI[0];
        char[] lllllllllllllllIllllIIIIllIIlIIl = lllllllllllllllIllllIIIIllIIlllI.toCharArray();
        int lllllllllllllllIllllIIIIllIIlIII = lllllllllllllllIllllIIIIllIIlIIl.length;
        int lllllllllllllllIllllIIIIllIIIlll = lIIlIllllIlI[0];
        while (v.llIIllIllIlIlI(lllllllllllllllIllllIIIIllIIIlll, lllllllllllllllIllllIIIIllIIlIII)) {
            char lllllllllllllllIllllIIIIllIlIlII = lllllllllllllllIllllIIIIllIIlIIl[lllllllllllllllIllllIIIIllIIIlll];
            lllllllllllllllIllllIIIIllIlIIIl.append((char)(lllllllllllllllIllllIIIIllIlIlII ^ lllllllllllllllIllllIIIIllIlIIII[lllllllllllllllIllllIIIIllIIllll % lllllllllllllllIllllIIIIllIlIIII.length]));
            0;
            ++lllllllllllllllIllllIIIIllIIllll;
            ++lllllllllllllllIllllIIIIllIIIlll;
            0;
            if ((0x63 ^ 0x71 ^ (0x8A ^ 0x9C)) >= 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllllIIIIllIlIIIl);
    }

    private static boolean llIIllIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

