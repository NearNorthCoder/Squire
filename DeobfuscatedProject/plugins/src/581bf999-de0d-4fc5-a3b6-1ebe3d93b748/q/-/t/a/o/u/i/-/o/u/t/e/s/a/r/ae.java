/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Drinking brew", priority=100)
public class ae
extends Z {
    private final /* synthetic */ SquireAutoTOA cH;
    private static /* synthetic */ int[] llIllIlIllI;
    private final /* synthetic */ C cG;
    private static /* synthetic */ String[] llIllIlIlIl;

    private static boolean lIlIlIlIIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int llllllllllllllllIIlIllIlIIIlIIIl2;
        int n2;
        ae llllllllllllllllIIlIllIlIIIlIIll;
        if (ae.lIlIlIlIIIIIII(this.cH.e() ? 1 : 0)) {
            return llIllIlIllI[0];
        }
        Item llllllllllllllllIIlIllIlIIIlIIlI = Inventory.getFirst(item -> {
            int n2;
            if (!ae.lIlIlIlIIIIIlI(e.NECTAR.d(item.getId()) ? 1 : 0) || ae.lIlIlIlIIIIIII(item.getName().contains(llIllIlIlIl[llIllIlIllI[1]]) ? 1 : 0)) {
                n2 = llIllIlIllI[1];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x5D ^ 0x19) & ~(0x77 ^ 0x33)) != 0;
                }
            } else {
                n2 = llIllIlIllI[0];
            }
            return n2 != 0;
        });
        if (ae.lIlIlIlIIIIIIl(llllllllllllllllIIlIllIlIIIlIIlI)) {
            return llIllIlIllI[0];
        }
        if (ae.lIlIlIlIIIIIlI(llllllllllllllllIIlIllIlIIIlIIll.aq() ? 1 : 0)) {
            int[] nArray = new int[llIllIlIllI[1]];
            nArray[ae.llIllIlIllI[0]] = llIllIlIllI[2];
            Item llllllllllllllllIIlIllIlIIIlIIIl2 = Inventory.getFirst((int[])nArray);
            if (ae.lIlIlIlIIIIIll(llllllllllllllllIIlIllIlIIIlIIIl2) && ae.lIlIlIlIIIIlII(Combat.getSpecEnergy(), llIllIlIllI[3]) && ae.lIlIlIlIIIIlII(Combat.getCurrentHealth(), llIllIlIllI[4])) {
                return llIllIlIllI[0];
            }
        }
        if (ae.lIlIlIlIIIIIII(llllllllllllllllIIlIllIlIIIlIIll.bf() ? 1 : 0) && !ae.lIlIlIlIIIIlIl(Combat.getCurrentHealth(), llIllIlIllI[5]) || ae.lIlIlIlIIIIIII(llllllllllllllllIIlIllIlIIIlIIll.cG.ap() ? 1 : 0)) {
            n2 = llIllIlIllI[1];
            "".length();
            if ("   ".length() == 0) {
                return ((0x2C ^ 0x65) & ~(0xE3 ^ 0xAA)) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIllIlIIIlIIIl2 = llIllIlIllI[0];
        }
        if (!ae.lIlIlIlIIIIIII(llllllllllllllllIIlIllIlIIIlIIll.cG.am() ? 1 : 0) || ae.lIlIlIlIIIIIlI(llllllllllllllllIIlIllIlIIIlIIIl2)) {
            return llIllIlIllI[0];
        }
        var1_1.interact(llIllIlIlIl[llIllIlIllI[0]]);
        this.cG.ao();
        return llIllIlIllI[1];
    }

    private static void lIlIlIIllllllI() {
        llIllIlIlIl = new String[llIllIlIllI[6]];
        ae.llIllIlIlIl[ae.llIllIlIllI[0]] = ae.lIlIlIIlllllII("w8funHT5QQw=", "DELOU");
        ae.llIllIlIlIl[ae.llIllIlIllI[1]] = ae.lIlIlIIlllllIl("IB0GMg==", "BocER");
    }

    private static void lIlIlIIlllllll() {
        llIllIlIllI = new int[8];
        ae.llIllIlIllI[0] = (3 + 74 - -110 + 19 ^ 16 + 107 - 108 + 120) & (150 + 49 - 12 + 10 ^ 1 + 39 - 1 + 101 ^ -" ".length());
        ae.llIllIlIllI[1] = " ".length();
        ae.llIllIlIllI[2] = -(0xFFFF8DFD & 0x7743) & (0xFFFFFFDF & 0x6FFB);
        ae.llIllIlIllI[3] = 0x79 ^ 0x71 ^ (0x55 ^ 0x1B);
        ae.llIllIlIllI[4] = 0x44 ^ 0x6C;
        ae.llIllIlIllI[5] = 0x93 ^ 0xC3;
        ae.llIllIlIllI[6] = "  ".length();
        ae.llIllIlIllI[7] = 0x61 ^ 0x41 ^ (0x89 ^ 0xA1);
    }

    private static String lIlIlIIlllllIl(String llllllllllllllllIIlIllIIllllIlll, String llllllllllllllllIIlIllIIllllIIIl) {
        llllllllllllllllIIlIllIIllllIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIIllllIlIl = new StringBuilder();
        char[] llllllllllllllllIIlIllIIllllIlII = llllllllllllllllIIlIllIIllllIIIl.toCharArray();
        int llllllllllllllllIIlIllIIllllIIll = llIllIlIllI[0];
        char[] llllllllllllllllIIlIllIIlllIllIl = llllllllllllllllIIlIllIIllllIlll.toCharArray();
        int llllllllllllllllIIlIllIIlllIllII = llllllllllllllllIIlIllIIlllIllIl.length;
        int llllllllllllllllIIlIllIIlllIlIll = llIllIlIllI[0];
        while (ae.lIlIlIlIIIIllI(llllllllllllllllIIlIllIIlllIlIll, llllllllllllllllIIlIllIIlllIllII)) {
            char llllllllllllllllIIlIllIIlllllIII = llllllllllllllllIIlIllIIlllIllIl[llllllllllllllllIIlIllIIlllIlIll];
            llllllllllllllllIIlIllIIllllIlIl.append((char)(llllllllllllllllIIlIllIIlllllIII ^ llllllllllllllllIIlIllIIllllIlII[llllllllllllllllIIlIllIIllllIIll % llllllllllllllllIIlIllIIllllIlII.length]));
            "".length();
            ++llllllllllllllllIIlIllIIllllIIll;
            ++llllllllllllllllIIlIllIIlllIlIll;
            "".length();
            if (((0xDC ^ 0x81) & ~(0x70 ^ 0x2D)) == ((0x37 ^ 0x31) & ~(0x62 ^ 0x64))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIllIIllllIlIl);
    }

    private static boolean lIlIlIlIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIlIIlllllII(String llllllllllllllllIIlIllIlIIIIIlIl, String llllllllllllllllIIlIllIlIIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIllIlIllI[7]), "DES");
            Cipher llllllllllllllllIIlIllIlIIIIlIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIlIIIIlIIl.init(llIllIlIllI[6], llllllllllllllllIIlIllIlIIIIlIlI);
            return new String(llllllllllllllllIIlIllIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlIIIIlIII) {
            llllllllllllllllIIlIllIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        ae.lIlIlIIlllllll();
        ae.lIlIlIIllllllI();
    }

    @Inject
    protected ae(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cG = c2;
        this.cH = squireAutoTOA;
    }
}

