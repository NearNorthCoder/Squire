/*
 * Decompiled with CFR 0.152.
 */
package g.r.r.-.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private final /* synthetic */ int degradedBaseHoldAmount;
    public static final /* synthetic */ /* enum */ e MEDIUM;
    public static final /* synthetic */ /* enum */ e LARGE;
    private /* synthetic */ boolean unknown;
    public static final /* synthetic */ /* enum */ e SMALL;
    private static /* synthetic */ String[] llIIllllllII;
    public static final /* synthetic */ /* enum */ e GIANT;
    public static final /* synthetic */ /* enum */ e COLOSSAL;
    private final /* synthetic */ int baseHoldAmount;
    private /* synthetic */ int holding;
    private static final /* synthetic */ e[] $VALUES;
    private /* synthetic */ boolean degraded;
    private static /* synthetic */ int[] llIIllllllll;

    private static String lllllllllIllll(String lllllllllllllllIlIIlIlIllIIIllll, String lllllllllllllllIlIIlIlIllIIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIllIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIllIIlIIIl.init(llIIllllllll[5], lllllllllllllllIlIIlIlIllIIlIIlI);
            return new String(lllllllllllllllIlIIlIlIllIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIllIIlIIII) {
            lllllllllllllllIlIIlIlIllIIlIIII.printStackTrace();
            return null;
        }
    }

    private e(int n3) {
        this(n3, llIIllllllll[0]);
    }

    public boolean ag() {
        return this.unknown;
    }

    private static boolean lllllllllllllI(int n2, int n3) {
        return n2 != n3;
    }

    public int ac() {
        int n2;
        if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
            n2 = this.degradedBaseHoldAmount;
            "".length();
            if (" ".length() >= (0x51 ^ 0x5D ^ (0xBD ^ 0xB5))) {
                return (208 + 83 - 214 + 148 ^ 5 + 12 - -143 + 19) & (0x49 ^ 0x66 ^ (0xDF ^ 0xA2) ^ -" ".length());
            }
        } else {
            e lllllllllllllllIlIIlIlIllIllllll;
            n2 = lllllllllllllllIlIIlIlIllIllllll.baseHoldAmount;
        }
        return n2;
    }

    public void b(boolean bl) {
        this.unknown = bl;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static boolean llllllllllllII(int n2) {
        return n2 < 0;
    }

    public static e c(int n2) {
        switch (n2) {
            case 5509: {
                return SMALL;
            }
            case 5510: 
            case 5511: {
                return MEDIUM;
            }
            case 5512: 
            case 5513: {
                return LARGE;
            }
            case 5514: 
            case 5515: {
                return GIANT;
            }
            case 26784: 
            case 26786: 
            case 26906: {
                return COLOSSAL;
            }
        }
        return null;
    }

    private static boolean llllllllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllllllllIIll() {
        llIIllllllII = new String[llIIllllllll[12]];
        e.llIIllllllII[e.llIIllllllll[2]] = e.lllllllllIllll("roeDGAGHD8A=", "JirXw");
        e.llIIllllllII[e.llIIllllllll[1]] = e.llllllllllIIlI("KhEnAjQq", "gTcKa");
        e.llIIllllllII[e.llIIllllllll[5]] = e.llllllllllIIlI("ODYaJQA=", "twHbE");
        e.llIIllllllII[e.llIIllllllll[3]] = e.lllllllllIllll("IWdkr/xFzhI=", "lgBEr");
        e.llIIllllllII[e.llIIllllllll[9]] = e.llllllllllIIlI("OSsdGT8pJR0=", "zdQVl");
    }

    public void d(int n2) {
        e lllllllllllllllIlIIlIlIllIllIlll;
        int lllllllllllllllIlIIlIlIllIllIlIl;
        int n3;
        this.holding += n2;
        if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
            n3 = this.degradedBaseHoldAmount;
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        } else {
            n3 = lllllllllllllllIlIIlIlIllIllIlIl = lllllllllllllllIlIIlIlIllIllIlll.baseHoldAmount;
        }
        if (e.llllllllllllII(lllllllllllllllIlIIlIlIllIllIlll.holding)) {
            lllllllllllllllIlIIlIlIllIllIlll.holding = llIIllllllll[2];
        }
        if (e.llllllllllllIl(lllllllllllllllIlIIlIlIllIllIlll.holding, lllllllllllllllIlIIlIlIllIllIlIl)) {
            lllllllllllllllIlIIlIlIllIllIlll.holding = lllllllllllllllIlIIlIlIllIllIlIl;
        }
    }

    private static String llllllllllIIlI(String lllllllllllllllIlIIlIlIllIlIIlII, String lllllllllllllllIlIIlIlIllIIllllI) {
        lllllllllllllllIlIIlIlIllIlIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIllIlIIIlI = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIllIlIIIIl = lllllllllllllllIlIIlIlIllIIllllI.toCharArray();
        int lllllllllllllllIlIIlIlIllIlIIIII = llIIllllllll[2];
        char[] lllllllllllllllIlIIlIlIllIIllIlI = lllllllllllllllIlIIlIlIllIlIIlII.toCharArray();
        int lllllllllllllllIlIIlIlIllIIllIIl = lllllllllllllllIlIIlIlIllIIllIlI.length;
        int lllllllllllllllIlIIlIlIllIIllIII = llIIllllllll[2];
        while (e.llllllllllllll(lllllllllllllllIlIIlIlIllIIllIII, lllllllllllllllIlIIlIlIllIIllIIl)) {
            char lllllllllllllllIlIIlIlIllIlIIlIl = lllllllllllllllIlIIlIlIllIIllIlI[lllllllllllllllIlIIlIlIllIIllIII];
            lllllllllllllllIlIIlIlIllIlIIIlI.append((char)(lllllllllllllllIlIIlIlIllIlIIlIl ^ lllllllllllllllIlIIlIlIllIlIIIIl[lllllllllllllllIlIIlIlIllIlIIIII % lllllllllllllllIlIIlIlIllIlIIIIl.length]));
            "".length();
            ++lllllllllllllllIlIIlIlIllIlIIIII;
            ++lllllllllllllllIlIIlIlIllIIllIII;
            "".length();
            if ("   ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIllIlIIIlI);
    }

    static {
        e.lllllllllllIlI();
        e.llllllllllIIll();
        SMALL = new e(llIIllllllll[3]);
        MEDIUM = new e(llIIllllllll[4], llIIllllllll[3]);
        LARGE = new e(llIIllllllll[6], llIIllllllll[7]);
        GIANT = new e(llIIllllllll[8], llIIllllllll[6]);
        COLOSSAL = new e(llIIllllllll[10], llIIllllllll[11]);
        e[] eArray = new e[llIIllllllll[12]];
        eArray[e.llIIllllllll[2]] = SMALL;
        eArray[e.llIIllllllll[1]] = MEDIUM;
        eArray[e.llIIllllllll[5]] = LARGE;
        eArray[e.llIIllllllll[3]] = GIANT;
        eArray[e.llIIllllllll[9]] = COLOSSAL;
        $VALUES = eArray;
    }

    private static void lllllllllllIlI() {
        llIIllllllll = new int[13];
        e.llIIllllllll[0] = -" ".length();
        e.llIIllllllll[1] = " ".length();
        e.llIIllllllll[2] = (0x45 ^ 0x48) & ~(7 ^ 0xA);
        e.llIIllllllll[3] = "   ".length();
        e.llIIllllllll[4] = 0x73 ^ 0x75;
        e.llIIllllllll[5] = "  ".length();
        e.llIIllllllll[6] = 0x22 ^ 0x1A ^ (0x25 ^ 0x14);
        e.llIIllllllll[7] = 8 ^ 0xF;
        e.llIIllllllll[8] = 0x3E ^ 0x32;
        e.llIIllllllll[9] = 4 ^ 0;
        e.llIIllllllll[10] = 0xC1 ^ 0x92 ^ (0x29 ^ 0x52);
        e.llIIllllllll[11] = 0x6B ^ 0x7B ^ (0x5D ^ 0x6E);
        e.llIIllllllll[12] = 0xAB ^ 0xAE;
    }

    public int ae() {
        return this.holding;
    }

    private static boolean lllllllllllIll(int n2) {
        return n2 != 0;
    }

    public boolean af() {
        return this.degraded;
    }

    public int ad() {
        int n2;
        if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
            n2 = this.degradedBaseHoldAmount;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return (0x4C ^ 0x79) & ~(0x70 ^ 0x45);
            }
        } else {
            e lllllllllllllllIlIIlIlIllIllllII;
            n2 = lllllllllllllllIlIIlIlIllIllllII.baseHoldAmount;
        }
        int n3 = n2;
        return n3 - this.holding;
    }

    private e(int n3, int n4) {
        this.unknown = llIIllllllll[1];
        this.baseHoldAmount = n3;
        this.degradedBaseHoldAmount = n4;
    }

    public void a(boolean bl) {
        if (e.lllllllllllllI(bl ? 1 : 0, this.degraded ? 1 : 0)) {
            e lllllllllllllllIlIIlIlIllIllIIIl;
            int n2;
            this.degraded = bl;
            if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
                n2 = this.degradedBaseHoldAmount;
                "".length();
                if (((36 + 68 - 9 + 57 ^ 98 + 103 - 144 + 112) & (0xB9 ^ 0x9D ^ (0x84 ^ 0x91) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                n2 = lllllllllllllllIlIIlIlIllIllIIIl.baseHoldAmount;
            }
            int lllllllllllllllIlIIlIlIllIlIllll = n2;
            lllllllllllllllIlIIlIlIllIllIIIl.holding = Math.min(lllllllllllllllIlIIlIlIllIllIIIl.holding, lllllllllllllllIlIIlIlIllIlIllll);
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean llllllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    public void e(int n2) {
        this.holding = n2;
    }
}

