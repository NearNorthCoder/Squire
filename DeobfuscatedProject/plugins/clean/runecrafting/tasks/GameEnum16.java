/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum16
extends Enum<e> {
    private final  int degradedBaseHoldAmount;
    public static final  /* enum */ e MEDIUM;
    public static final  /* enum */ e LARGE;
    private  boolean unknown;
    public static final  /* enum */ e SMALL;
    
    public static final  /* enum */ e GIANT;
    public static final  /* enum */ e COLOSSAL;
    private final  int baseHoldAmount;
    private  int holding;
    private static final  e[] $VALUES;
    private  boolean degraded;

    private GameEnum16(int n3) {
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

            if (1 >= (0x51 ^ 0x5D ^ (0xBD ^ 0xB5))) {
                return (208 + 83 - 214 + 148 ^ 5 + 12 - -143 + 19) & (0x49 ^ 0x66 ^ (0xDF ^ 0xA2) ^ -1);
            }
        } else {
            e var1;
            n2 = var1.baseHoldAmount;
        }
        return n2;
    }

    public void b(boolean bl) {
        this.unknown = bl;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
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
        e.llIIllllllII[e.llIIllllllll[2]] = "SMALL";
        e.llIIllllllII[e.llIIllllllll[1]] = "MEDIUM";
        e.llIIllllllII[e.llIIllllllll[5]] = "LARGE";
        e.llIIllllllII[e.llIIllllllll[3]] = "GIANT";
        e.llIIllllllII[e.llIIllllllll[9]] = "COLOSSAL";
    }

    public void d(int n2) {
        e var2;
        int var3;
        int n3;
        this.holding += n2;
        if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
            n3 = this.degradedBaseHoldAmount;

        } else {
            n3 = var3 = var2.baseHoldAmount;
        }
        if (e.llllllllllllII(var2.holding)) {
            var2.holding = llIIllllllll[2];
        }
        if (e.llllllllllllIl(var2.holding, var3)) {
            var2.holding = var3;
        }
    }

        return String.valueOf(var4);
    }

    static {
        e.lllllllllllIlI();
        e.llllllllllIIll();
        SMALL = new GameEnum16(llIIllllllll[3]);
        MEDIUM = new GameEnum16(llIIllllllll[4], llIIllllllll[3]);
        LARGE = new GameEnum16(llIIllllllll[6], llIIllllllll[7]);
        GIANT = new GameEnum16(llIIllllllll[8], llIIllllllll[6]);
        COLOSSAL = new GameEnum16(llIIllllllll[10], llIIllllllll[11]);
        e[] eArray = new e[llIIllllllll[12]];
        eArray[e.llIIllllllll[2]] = SMALL;
        eArray[e.llIIllllllll[1]] = MEDIUM;
        eArray[e.llIIllllllll[5]] = LARGE;
        eArray[e.llIIllllllll[3]] = GIANT;
        eArray[e.llIIllllllll[9]] = COLOSSAL;
        $VALUES = eArray;
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

            if (3 <= -1) {
                return (0x4C ^ 0x79) & ~(0x70 ^ 0x45);
            }
        } else {
            e var5;
            n2 = var5.baseHoldAmount;
        }
        int n3 = n2;
        return n3 - this.holding;
    }

    private GameEnum16(int n3, int n4) {
        this.unknown = llIIllllllll[1];
        this.baseHoldAmount = n3;
        this.degradedBaseHoldAmount = n4;
    }

    public void a(boolean bl) {
        if (e.lllllllllllllI(bl ? 1 : 0, this.degraded ? 1 : 0)) {
            e var6;
            int n2;
            this.degraded = bl;
            if (e.lllllllllllIll(this.degraded ? 1 : 0)) {
                n2 = this.degradedBaseHoldAmount;

                if (((36 + 68 - 9 + 57 ^ 98 + 103 - 144 + 112) & (0xB9 ^ 0x9D ^ (0x84 ^ 0x91) ^ -1)) != 0) {
                    return;
                }
            } else {
                n2 = var6.baseHoldAmount;
            }
            int var7 = n2;
            var6.holding = Math.min(var6.holding, var7);
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean llllllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    public void GameEnum16(int n2) {
        this.holding = n2;
    }
}

