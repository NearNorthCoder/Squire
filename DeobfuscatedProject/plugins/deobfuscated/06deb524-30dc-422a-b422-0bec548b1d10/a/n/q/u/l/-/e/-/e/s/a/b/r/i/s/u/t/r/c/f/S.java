/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.T;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Gauntlets")
public class S
extends T<v> {
    private static /* synthetic */ int[] lIIllIIllllI;
    private static /* synthetic */ String[] lIIllIIlllIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var3_3;
        Item lllllllllllllllIlllIlllIIllIIlIl;
        Item item;
        if (S.llIIlllIlllIll(Bank.isOpen() ? 1 : 0)) {
            item = Bank.Inventory.getFirst((int[])v2.I());
            0;
            if (-3 >= 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else {
            void lllllllllllllllIlllIlllIIllIIllI;
            item = Inventory.getFirst((int[])lllllllllllllllIlllIlllIIllIIllI.I());
        }
        if (S.llIIlllIllllII(lllllllllllllllIlllIlllIIllIIlIl = item)) {
            return lIIllIIllllI[0];
        }
        String[] stringArray = new String[lIIllIIllllI[1]];
        stringArray[S.lIIllIIllllI[0]] = lIIllIIlllIl[lIIllIIllllI[0]];
        stringArray[S.lIIllIIllllI[2]] = lIIllIIlllIl[lIIllIIllllI[2]];
        stringArray[S.lIIllIIllllI[3]] = lIIllIIlllIl[lIIllIIllllI[3]];
        var3_3.interact(stringArray);
        return lIIllIIllllI[0];
    }

    private static String llIIlllIllIllI(String lllllllllllllllIlllIlllIIlIllIll, String lllllllllllllllIlllIlllIIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIIlIlllIl.init(lIIllIIllllI[3], lllllllllllllllIlllIlllIIlIllllI);
            return new String(lllllllllllllllIlllIlllIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIIlIlllII) {
            lllllllllllllllIlllIlllIIlIlllII.printStackTrace();
            return null;
        }
    }

    static {
        S.llIIlllIlllIlI();
        S.llIIlllIllIlll();
    }

    private static boolean llIIlllIlllIll(int n2) {
        return n2 != 0;
    }

    private static void llIIlllIllIlll() {
        lIIllIIlllIl = new String[lIIllIIllllI[1]];
        S.lIIllIIlllIl[S.lIIllIIllllI[0]] = S."Wear";
        S.lIIllIIlllIl[S.lIIllIIllllI[2]] = S."Equip";
        S.lIIllIIlllIl[S.lIIllIIllllI[3]] = S."Wield";
    }

    @Inject
    public S(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, v.class, string -> {
            int n2;
            if (!S.llIIlllIllllIl(string.equals(I.bf) ? 1 : 0) || !S.llIIlllIllllIl(string.equals(I.bd) ? 1 : 0) || !S.llIIlllIllllIl(string.equals(I.bi) ? 1 : 0) || S.llIIlllIlllIll(string.equals(I.bj) ? 1 : 0)) {
                n2 = lIIllIIllllI[2];
                0;
                if (-1 > 0) {
                    return ((0xD9 ^ 0x83) & ~(0x3E ^ 0x64)) != 0;
                }
            } else {
                n2 = lIIllIIllllI[0];
            }
            return n2 != 0;
        });
    }

    private static String llIIlllIllIlIl(String lllllllllllllllIlllIlllIIlIIIllI, String lllllllllllllllIlllIlllIIlIIIlIl) {
        lllllllllllllllIlllIlllIIlIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllIIlIIlIIl = new StringBuilder();
        char[] lllllllllllllllIlllIlllIIlIIlIII = lllllllllllllllIlllIlllIIlIIIlIl.toCharArray();
        int lllllllllllllllIlllIlllIIlIIIlll = lIIllIIllllI[0];
        char[] lllllllllllllllIlllIlllIIlIIIIIl = lllllllllllllllIlllIlllIIlIIIllI.toCharArray();
        int lllllllllllllllIlllIlllIIlIIIIII = lllllllllllllllIlllIlllIIlIIIIIl.length;
        int lllllllllllllllIlllIlllIIIllllll = lIIllIIllllI[0];
        while (S.llIIlllIlllllI(lllllllllllllllIlllIlllIIIllllll, lllllllllllllllIlllIlllIIlIIIIII)) {
            char lllllllllllllllIlllIlllIIlIIllII = lllllllllllllllIlllIlllIIlIIIIIl[lllllllllllllllIlllIlllIIIllllll];
            lllllllllllllllIlllIlllIIlIIlIIl.append((char)(lllllllllllllllIlllIlllIIlIIllII ^ lllllllllllllllIlllIlllIIlIIlIII[lllllllllllllllIlllIlllIIlIIIlll % lllllllllllllllIlllIlllIIlIIlIII.length]));
            0;
            ++lllllllllllllllIlllIlllIIlIIIlll;
            ++lllllllllllllllIlllIlllIIIllllll;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlllIIlIIlIIl);
    }

    private static boolean llIIlllIllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIllllII(Object object) {
        return object == null;
    }

    private static boolean llIIlllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlllIlllIlI() {
        lIIllIIllllI = new int[4];
        S.lIIllIIllllI[0] = (20 + 31 - -11 + 69 ^ 81 + 149 - 104 + 26) & (0x4E ^ 0x75 ^ (0x75 ^ 0x55) ^ -1);
        S.lIIllIIllllI[1] = 3;
        S.lIIllIIllllI[2] = 1;
        S.lIIllIIllllI[3] = 2;
    }
}

