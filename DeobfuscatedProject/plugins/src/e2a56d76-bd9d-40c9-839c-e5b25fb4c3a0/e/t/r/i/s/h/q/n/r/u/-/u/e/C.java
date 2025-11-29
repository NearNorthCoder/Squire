/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Items", priority=1)
public class C
extends j {
    private static /* synthetic */ String[] lllIllllIIIl;
    private static /* synthetic */ int[] lllIllllIlII;

    static {
        C.lIIIlllIIIIIlIl();
        C.lIIIlllIIIIIIlI();
    }

    private static String lIIIlllIIIIIIIl(String lllllllllllllllIIlIllIllllllIIII, String lllllllllllllllIIlIllIllllllIlII) {
        lllllllllllllllIIlIllIllllllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllllllIIll = new StringBuilder();
        char[] lllllllllllllllIIlIllIllllllIIlI = lllllllllllllllIIlIllIllllllIlII.toCharArray();
        int lllllllllllllllIIlIllIllllllIIIl = lllIllllIlII[1];
        char[] lllllllllllllllIIlIllIlllllIlIll = lllllllllllllllIIlIllIllllllIIII.toCharArray();
        int lllllllllllllllIIlIllIlllllIlIlI = lllllllllllllllIIlIllIlllllIlIll.length;
        int lllllllllllllllIIlIllIlllllIlIIl = lllIllllIlII[1];
        while (C.lIIIlllIIIIIlll(lllllllllllllllIIlIllIlllllIlIIl, lllllllllllllllIIlIllIlllllIlIlI)) {
            char lllllllllllllllIIlIllIllllllIllI = lllllllllllllllIIlIllIlllllIlIll[lllllllllllllllIIlIllIlllllIlIIl];
            lllllllllllllllIIlIllIllllllIIll.append((char)(lllllllllllllllIIlIllIllllllIllI ^ lllllllllllllllIIlIllIllllllIIlI[lllllllllllllllIIlIllIllllllIIIl % lllllllllllllllIIlIllIllllllIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIllIllllllIIIl;
            ++lllllllllllllllIIlIllIlllllIlIIl;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIllllllIIll);
    }

    @Override
    protected boolean x() {
        int[] nArray = new int[lllIllllIlII[0]];
        nArray[C.lllIllllIlII[1]] = lllIllllIlII[2];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllllIlII[0]];
            nArray2[C.lllIllllIlII[1]] = lllIllllIlII[2];
            Inventory.getFirst((int[])nArray2).interact(lllIllllIIIl[lllIllllIlII[1]]);
            return lllIllllIlII[0];
        }
        int[] nArray3 = new int[lllIllllIlII[0]];
        nArray3[C.lllIllllIlII[1]] = lllIllllIlII[3];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            C lllllllllllllllIIlIlllIIIIIllIlI;
            if (C.lIIIlllIIIIIllI(lllllllllllllllIIlIlllIIIIIllIlI.z().buryBones() ? 1 : 0)) {
                int[] nArray4 = new int[lllIllllIlII[0]];
                nArray4[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray4).interact(lllIllllIIIl[lllIllllIlII[0]]);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return ((1 + 43 - -44 + 39 ^ (0x39 ^ 0x64)) & (159 + 8 - 46 + 49 ^ 59 + 120 - 74 + 31 ^ -" ".length())) != 0;
                }
            } else {
                int[] nArray5 = new int[lllIllllIlII[0]];
                nArray5[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray5).interact(lllIllllIIIl[lllIllllIlII[4]]);
            }
            return lllIllllIlII[0];
        }
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIllllllll(String lllllllllllllllIIlIlllIIIIIIIlIl, String lllllllllllllllIIlIlllIIIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIIIIIIlll.init(lllIllllIlII[4], lllllllllllllllIIlIlllIIIIIIlIII);
            return new String(lllllllllllllllIIlIlllIIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIIIIIIllI) {
            lllllllllllllllIIlIlllIIIIIIIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void lIIIlllIIIIIlIl() {
        lllIllllIlII = new int[7];
        C.lllIllllIlII[0] = " ".length();
        C.lllIllllIlII[1] = (0x25 ^ 0x73 ^ (0x11 ^ 0x78)) & (4 ^ 0x58 ^ (0x48 ^ 0x2B) ^ -" ".length());
        C.lllIllllIlII[2] = -(0xFFFFD5AF & 0x7B56) & (0xFFFFFFFF & 0x77FF);
        C.lllIllllIlII[3] = -(0xFFFFF67B & 0x7DB6) & (0xFFFFFF3F & 0x76FF);
        C.lllIllllIlII[4] = "  ".length();
        C.lllIllllIlII[5] = "   ".length();
        C.lllIllllIlII[6] = 130 + 170 - 298 + 203 ^ 55 + 184 - 111 + 69;
    }

    private static void lIIIlllIIIIIIlI() {
        lllIllllIIIl = new String[lllIllllIlII[5]];
        C.lllIllllIIIl[C.lllIllllIlII[1]] = C.lIIIllIllllllIl("EVieGfrOzkg=", "REIZK");
        C.lllIllllIIIl[C.lllIllllIlII[0]] = C.lIIIllIllllllll("W6jR0WQbHBU=", "ZDZqI");
        C.lllIllllIIIl[C.lllIllllIlII[4]] = C.lIIIlllIIIIIIIl("Aj0CFA==", "FOmdW");
    }

    private static String lIIIllIllllllIl(String lllllllllllllllIIlIlllIIIIIlIIII, String lllllllllllllllIIlIlllIIIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIIIllll.getBytes(StandardCharsets.UTF_8)), lllIllllIlII[6]), "DES");
            Cipher lllllllllllllllIIlIlllIIIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIIIIlIlII.init(lllIllllIlII[4], lllllllllllllllIIlIlllIIIIIlIlIl);
            return new String(lllllllllllllllIIlIlllIIIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIIIIlIIll) {
            lllllllllllllllIIlIlllIIIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }
}

