/*
 * Decompiled with CFR 0.152.
 */
package g.r.r.-.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class EEnum
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

    private static String lllllllllIllll(String var15, String var20) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIllllllll[5], var10);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
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
            0;
            if (1 >= (0x51 ^ 0x5D ^ (0xBD ^ 0xB5))) {
                return (208 + 83 - 214 + 148 ^ 5 + 12 - -143 + 19) & (0x49 ^ 0x66 ^ (0xDF ^ 0xA2) ^ -1);
            }
        } else {
            e var17;
            n2 = var17.baseHoldAmount;
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
        e.llIIllllllII[e.llIIllllllll[2]] = e."SMALL";
        e.llIIllllllII[e.llIIllllllll[1]] = e."MEDIUM";
        e.llIIllllllII[e.llIIllllllll[5]] = e."LARGE";
        e.llIIllllllII[e.llIIllllllll[3]] = e."GIANT";
        e.llIIllllllII[e.llIIllllllll[9]] = e."COLOSSAL";
    }

    public void d(int n2) {
        e var16;
        int var1;
        int n3;
        this.holding += n2;
        if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
            n3 = this.degradedBaseHoldAmount;
            0;
            if (-3 >= 0) {
                return;
            }
        } else {
            n3 = var1 = var16.baseHoldAmount;
        }
        if (e.llllllllllllII(var16.holding)) {
            var16.holding = llIIllllllll[2];
        }
        if (e.llllllllllllIl(var16.holding, var1)) {
            var16.holding = var1;
        }
    }

    private static String llllllllllIIlI(String var11, String var19) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var6 = var19.toCharArray();
        int var18 = llIIllllllll[2];
        char[] var3 = var11.toCharArray();
        int var4 = var3.length;
        int var5 = llIIllllllll[2];
        while (e.llllllllllllll(var5, var4)) {
            char var14 = var3[var5];
            var2.append((char)(var14 ^ var6[var18 % var6.length]));
            0;
            ++var18;
            ++var5;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var2);
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
        e.llIIllllllll[0] = -1;
        e.llIIllllllll[1] = 1;
        e.llIIllllllll[2] = (0x45 ^ 0x48) & ~(7 ^ 0xA);
        e.llIIllllllll[3] = 3;
        e.llIIllllllll[4] = 0x73 ^ 0x75;
        e.llIIllllllll[5] = 2;
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
            0;
            if (3 <= -1) {
                return (0x4C ^ 0x79) & ~(0x70 ^ 0x45);
            }
        } else {
            e var12;
            n2 = var12.baseHoldAmount;
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
            e var13;
            int n2;
            this.degraded = bl;
            if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
                n2 = this.degradedBaseHoldAmount;
                0;
                if (((36 + 68 - 9 + 57 ^ 98 + 103 - 144 + 112) & (0xB9 ^ 0x9D ^ (0x84 ^ 0x91) ^ -1)) != 0) {
                    return;
                }
            } else {
                n2 = var13.baseHoldAmount;
            }
            int var7 = n2;
            var13.holding = Math.min(var13.holding, var7);
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

