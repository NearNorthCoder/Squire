/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum15
extends Enum<d> {
    public static final  /* enum */ d POSSIBLY_EMPTY;
    public static final  /* enum */ d RUNE_LONGSWORD;
    public static final  /* enum */ d UNKNOWN;
    public static final  /* enum */ d EMPTY;
    
    public static final  /* enum */ d EMERALD;
    private final  int id;
    public static final  /* enum */ d ADAMANT_MED_HELM;
    private final  String name;
    private static final  d[] $VALUES;
    public static final  /* enum */ d ADAMANT_KITESHIELD;
    
    public static final  /* enum */ d LEATHER_BOOTS;

    public int i() {
        return this.id;
    }

    private GameEnum15(String string2, int n3) {
        this.id = n3;
        this.name = string2;
    }

    static {
        d.lIIIllIIllIIlII();
        d.lIIIllIIllIIIll();
        LEATHER_BOOTS = new GameEnum15(lllIlIllllll[lllIllIIIIIl[1]], lllIllIIIIIl[2]);
        ADAMANT_KITESHIELD = new GameEnum15(lllIlIllllll[lllIllIIIIIl[4]], lllIllIIIIIl[5]);
        ADAMANT_MED_HELM = new GameEnum15(lllIlIllllll[lllIllIIIIIl[7]], lllIllIIIIIl[8]);
        EMERALD = new GameEnum15(lllIlIllllll[lllIllIIIIIl[10]], lllIllIIIIIl[11]);
        RUNE_LONGSWORD = new GameEnum15(lllIlIllllll[lllIllIIIIIl[13]], lllIllIIIIIl[14]);
        EMPTY = new GameEnum15(lllIlIllllll[lllIllIIIIIl[16]], lllIllIIIIIl[17]);
        POSSIBLY_EMPTY = new GameEnum15(lllIlIllllll[lllIllIIIIIl[19]], lllIllIIIIIl[20]);
        UNKNOWN = new GameEnum15(lllIlIllllll[lllIllIIIIIl[22]], lllIllIIIIIl[20]);
        d[] dArray = new d[lllIllIIIIIl[12]];
        dArray[d.lllIllIIIIIl[0]] = LEATHER_BOOTS;
        dArray[d.lllIllIIIIIl[1]] = ADAMANT_KITESHIELD;
        dArray[d.lllIllIIIIIl[3]] = ADAMANT_MED_HELM;
        dArray[d.lllIllIIIIIl[4]] = EMERALD;
        dArray[d.lllIllIIIIIl[6]] = RUNE_LONGSWORD;
        dArray[d.lllIllIIIIIl[7]] = EMPTY;
        dArray[d.lllIllIIIIIl[9]] = POSSIBLY_EMPTY;
        dArray[d.lllIllIIIIIl[10]] = UNKNOWN;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    public String j() {
        return this.name;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static d a(String string) {
        void var2;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var3 = lllIllIIIIIl[0];
        while (d.lIIIllIIllIIlIl(var3, (int)var2)) {
            String var4;
            void var5;
            void var6 = var5[var3];
            if (d.lIIIllIIllIIllI(var4.toLowerCase().contains(var6.name.toLowerCase()) ? 1 : 0)) {
                return var6;
            }
            ++var3;

            if (((0x7C ^ 0x61 ^ (0x31 ^ 0x78)) & (49 + 13 - -63 + 71 ^ 143 + 134 - 221 + 88 ^ -1)) <= (0x92 ^ 0xBE ^ (0xA7 ^ 0x8F))) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIIllIIllIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIIllIIIll() {
        lllIlIllllll = new String[lllIllIIIIIl[23]];
        d.lllIlIllllll[d.lllIllIIIIIl[0]] = "LEATHER_BOOTS";
        d.lllIlIllllll[d.lllIllIIIIIl[1]] = "Leather Boots";
        d.lllIlIllllll[d.lllIllIIIIIl[3]] = "ADAMANT_KITESHIELD";
        d.lllIlIllllll[d.lllIllIIIIIl[4]] = "Adamant Kiteshield";
        d.lllIlIllllll[d.lllIllIIIIIl[6]] = "ADAMANT_MED_HELM";
        d.lllIlIllllll[d.lllIllIIIIIl[7]] = "Helm";
        d.lllIlIllllll[d.lllIllIIIIIl[9]] = "EMERALD";
        d.lllIlIllllll[d.lllIllIIIIIl[10]] = "Emerald";
        d.lllIlIllllll[d.lllIllIIIIIl[12]] = "RUNE_LONGSWORD";
        d.lllIlIllllll[d.lllIllIIIIIl[13]] = "Rune Longsword";
        d.lllIlIllllll[d.lllIllIIIIIl[15]] = "EMPTY";
        d.lllIlIllllll[d.lllIllIIIIIl[16]] = d.lIIIllIIlIlllIl("YSXflEoZ8Qw=", "EVypK");
        d.lllIlIllllll[d.lllIllIIIIIl[18]] = "POSSIBLY_EMPTY";
        d.lllIlIllllll[d.lllIllIIIIIl[19]] = d.lIIIllIIlIlllIl("7PTaSKWPx0c=", "wtsUT");
        d.lllIlIllllll[d.lllIllIIIIIl[21]] = "UNKNOWN";
        d.lllIlIllllll[d.lllIllIIIIIl[22]] = "Unknown";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

}

