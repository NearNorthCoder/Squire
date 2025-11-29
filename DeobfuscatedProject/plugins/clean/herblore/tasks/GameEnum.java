/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.herblore.tasks.GameEnum3;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b LANTADYME;
    public static final  /* enum */ b TORSTOL;
    public static final  /* enum */ b CADANTINE;
    public static final  /* enum */ b TARROMIN;
    public static final  /* enum */ b DWARF_WEED;
    public static final  /* enum */ b TOADFLAX;
    private final  int unfPotionId;
    
    public static final  /* enum */ b AVANTOE;
    public static final  /* enum */ b MARRENTILL;
    private final  int cleanId;
    public static final  /* enum */ b IRIT_LEAF;
    
    public static final  /* enum */ b KWUARM;
    public static final  /* enum */ b GUAM_LEAF;
    public static final  /* enum */ b RANARR_WEED;
    private static final  b[] $VALUES;
    public static final  /* enum */ b SNAPDRAGON;
    private final  int grimyId;
    public static final  /* enum */ b HARRALANDER;

    /*
     * WARNING - void declaration
     */
    public static b a(Integer n) {
        void var1;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var2 = lllIIlllllll[0];
        while (b.lIIIlIllIlIllII(var2, (int)var1)) {
            Integer var3;
            void var4;
            void var5 = var4[var2];
            if (b.lIIIlIllIlIllIl(var5.a(var3) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            if (((0x12 ^ 0x3A) & ~(0x62 ^ 0x4A)) <= 1) continue;
            return null;
        }
        return null;
    }

    public int e() {
        return this.grimyId;
    }

    private GameEnum(int n2, int n3, int n4) {
        this.grimyId = n2;
        this.cleanId = n3;
        this.unfPotionId = n4;
    }

    private static boolean lIIIlIllIlIllIl(int n) {
        return n != 0;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIIIlIllIlIllII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIlIllIlIlllI(int n, int n2) {
        return n != n2;
    }

        return String.valueOf(var6);
    }

    public int g() {
        return this.unfPotionId;
    }

    public int f() {
        return this.cleanId;
    }

    private static void lIIIlIllIlIlIlI() {
        lllIIllllllI = new String[lllIIlllllll[56]];
        b.lllIIllllllI[b.lllIIlllllll[0]] = "GUAM_LEAF";
        b.lllIIllllllI[b.lllIIlllllll[1]] = "MARRENTILL";
        b.lllIIllllllI[b.lllIIlllllll[8]] = "TARROMIN";
        b.lllIIllllllI[b.lllIIlllllll[12]] = "HARRALANDER";
        b.lllIIllllllI[b.lllIIlllllll[16]] = "RANARR_WEED";
        b.lllIIllllllI[b.lllIIlllllll[20]] = "TOADFLAX";
        b.lllIIllllllI[b.lllIIlllllll[24]] = "IRIT_LEAF";
        b.lllIIllllllI[b.lllIIlllllll[28]] = "AVANTOE";
        b.lllIIllllllI[b.lllIIlllllll[32]] = "KWUARM";
        b.lllIIllllllI[b.lllIIlllllll[36]] = "SNAPDRAGON";
        b.lllIIllllllI[b.lllIIlllllll[40]] = "CADANTINE";
        b.lllIIllllllI[b.lllIIlllllll[44]] = "LANTADYME";
        b.lllIIllllllI[b.lllIIlllllll[48]] = "DWARF_WEED";
        b.lllIIllllllI[b.lllIIlllllll[52]] = "TORSTOL";
    }

    /*
     * WARNING - void declaration
     */
    public c GameEnum(int n) {
        b var7;
        void var8;
        if (b.lIIIlIllIlIllll(n, this.grimyId)) {
            return c.CLEAN_HERBS;
        }
        if (b.lIIIlIllIlIllll((int)var8, var7.cleanId)) {
            return c.MAKE_UNF_POTS;
        }
        if (b.lIIIlIllIlIllll((int)var8, var7.unfPotionId)) {
            return c.FINISH_POTS;
        }
        return null;
    }

    private static boolean lIIIlIllIlIllll(int n, int n2) {
        return n == n2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        b.lIIIlIllIlIlIll();
        b.lIIIlIllIlIlIlI();
        GUAM_LEAF = new GameEnum(lllIIlllllll[2], lllIIlllllll[3], lllIIlllllll[4]);
        MARRENTILL = new GameEnum(lllIIlllllll[5], lllIIlllllll[6], lllIIlllllll[7]);
        TARROMIN = new GameEnum(lllIIlllllll[9], lllIIlllllll[10], lllIIlllllll[11]);
        HARRALANDER = new GameEnum(lllIIlllllll[13], lllIIlllllll[14], lllIIlllllll[15]);
        RANARR_WEED = new GameEnum(lllIIlllllll[17], lllIIlllllll[18], lllIIlllllll[19]);
        TOADFLAX = new GameEnum(lllIIlllllll[21], lllIIlllllll[22], lllIIlllllll[23]);
        IRIT_LEAF = new GameEnum(lllIIlllllll[25], lllIIlllllll[26], lllIIlllllll[27]);
        AVANTOE = new GameEnum(lllIIlllllll[29], lllIIlllllll[30], lllIIlllllll[31]);
        KWUARM = new GameEnum(lllIIlllllll[33], lllIIlllllll[34], lllIIlllllll[35]);
        SNAPDRAGON = new GameEnum(lllIIlllllll[37], lllIIlllllll[38], lllIIlllllll[39]);
        CADANTINE = new GameEnum(lllIIlllllll[41], lllIIlllllll[42], lllIIlllllll[43]);
        LANTADYME = new GameEnum(lllIIlllllll[45], lllIIlllllll[46], lllIIlllllll[47]);
        DWARF_WEED = new GameEnum(lllIIlllllll[49], lllIIlllllll[50], lllIIlllllll[51]);
        TORSTOL = new GameEnum(lllIIlllllll[53], lllIIlllllll[54], lllIIlllllll[55]);
        b[] bArray = new b[lllIIlllllll[56]];
        bArray[b.lllIIlllllll[0]] = GUAM_LEAF;
        bArray[b.lllIIlllllll[1]] = MARRENTILL;
        bArray[b.lllIIlllllll[8]] = TARROMIN;
        bArray[b.lllIIlllllll[12]] = HARRALANDER;
        bArray[b.lllIIlllllll[16]] = RANARR_WEED;
        bArray[b.lllIIlllllll[20]] = TOADFLAX;
        bArray[b.lllIIlllllll[24]] = IRIT_LEAF;
        bArray[b.lllIIlllllll[28]] = AVANTOE;
        bArray[b.lllIIlllllll[32]] = KWUARM;
        bArray[b.lllIIlllllll[36]] = SNAPDRAGON;
        bArray[b.lllIIlllllll[40]] = CADANTINE;
        bArray[b.lllIIlllllll[44]] = LANTADYME;
        bArray[b.lllIIlllllll[48]] = DWARF_WEED;
        bArray[b.lllIIlllllll[52]] = TORSTOL;
        $VALUES = bArray;
    }

    public boolean a(int n) {
        boolean bl;
        if (!b.lIIIlIllIlIlllI(n, this.grimyId) || !b.lIIIlIllIlIlllI(n, this.cleanId) || b.lIIIlIllIlIllll(n, this.unfPotionId)) {
            bl = lllIIlllllll[1];

            if ((16 + 46 - 22 + 109 ^ 132 + 90 - 182 + 105) <= 0) {
                return false;
            }
        } else {
            bl = lllIIlllllll[0];
        }
        return bl;
    }
}

