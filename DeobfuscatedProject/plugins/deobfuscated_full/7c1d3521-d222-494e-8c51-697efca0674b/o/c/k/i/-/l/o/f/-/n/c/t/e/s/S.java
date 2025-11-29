/*
 * Decompiled with CFR 0.152.
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class S
extends HashMap<Integer, String> {
    private static /* synthetic */ String[] llIlIIlllI;
    private static /* synthetic */ int[] llIlIIllll;

    private static void lIllIIlIlllII() {
        llIlIIllll = new int[7];
        S.llIlIIllll[0] = 3 & ~3 & ~((0xC9 ^ 0xC0) & ~(0x1E ^ 0x17));
        S.llIlIIllll[1] = 1;
        S.llIlIIllll[2] = 2;
        S.llIlIIllll[3] = 3;
        S.llIlIIllll[4] = 0x45 ^ 0x41;
        S.llIlIIllll[5] = 0x7E ^ 0x7B;
        S.llIlIIllll[6] = 0x98 ^ 0x90;
    }

    static {
        S.lIllIIlIlllII();
        S.lIllIIlIllIll();
    }

    private static void lIllIIlIllIll() {
        llIlIIlllI = new String[llIlIIllll[5]];
        S.llIlIIlllI[S.llIlIIllll[0]] = S."Carlem";
        S.llIlIIlllI[S.llIlIIllll[1]] = S."Aber";
        S.llIlIIlllI[S.llIlIIllll[2]] = S."Camerinthum";
        S.llIlIIlllI[S.llIlIIllll[3]] = S."Purchai";
        S.llIlIIlllI[S.llIlIIllll[4]] = S."Gabindo";
    }

    private static String lIllIIlIlIlll(String var2, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIlIIllll[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIlIIllll[2], var4);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    S() {
        this.put(llIlIIllll[0], llIlIIlllI[llIlIIllll[0]]);
        0;
        this.put(llIlIIllll[1], llIlIIlllI[llIlIIllll[1]]);
        0;
        this.put(llIlIIllll[2], llIlIIlllI[llIlIIllll[2]]);
        0;
        this.put(llIlIIllll[3], llIlIIlllI[llIlIIllll[3]]);
        0;
        this.put(llIlIIllll[4], llIlIIlllI[llIlIIllll[4]]);
        0;
    }
}

