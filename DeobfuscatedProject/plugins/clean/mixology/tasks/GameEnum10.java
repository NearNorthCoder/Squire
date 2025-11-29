/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum10
extends Enum<a> {
    public static final  /* enum */ a DWARF_WEED_POT_UNF;
    public static final  /* enum */ a DWARF_WEED;
    public static final  /* enum */ a CADANTINE_POT_UNF;
    public static final  /* enum */ a IRIT_LEAF;
    private final  String name;
    public static final  /* enum */ a IRIT_POT_UNF;

    public static final  /* enum */ a TORSTOL_POT_UNF;
    public static final  /* enum */ a LANTADYME;
    private final  int herbId;
    public static final  /* enum */ a LANTA_POT_UNF;
    private static final  a[] $VALUES;
    public static final  /* enum */ a CADANTINE;
    public static final  /* enum */ a TORSTOL;

    public int b() {
        return this.herbId;
    }

    public String GameEnum10() {
        return this.name;
    }

    private static void lIIlIlIlllIIlIl() {
        llllllllIlll = new String[lllllllllIlI[30]];
        a.llllllllIlll[a.lllllllllIlI[0]] = "IRIT_LEAF";
        a.llllllllIlll[a.lllllllllIlI[1]] = "Irit leaf";
        a.llllllllIlll[a.lllllllllIlI[3]] = "CADANTINE";
        a.llllllllIlll[a.lllllllllIlI[4]] = "Cadantine";
        a.llllllllIlll[a.lllllllllIlI[6]] = "LANTADYME";
        a.llllllllIlll[a.lllllllllIlI[7]] = "Lantadyme";
        a.llllllllIlll[a.lllllllllIlI[9]] = "DWARF_WEED";
        a.llllllllIlll[a.lllllllllIlI[10]] = "Dwarf weed";
        a.llllllllIlll[a.lllllllllIlI[12]] = "TORSTOL";
        a.llllllllIlll[a.lllllllllIlI[13]] = "Torstol";
        a.llllllllIlll[a.lllllllllIlI[15]] = "IRIT_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[16]] = "Irit potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[18]] = "CADANTINE_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[19]] = "Cadantine potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[21]] = "LANTA_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[22]] = "Lantadyme potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[24]] = "DWARF_WEED_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[25]] = "Dwarf weed potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[27]] = "TORSTOL_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[28]] = "Torstol potion (unf)";
    }

        return String.valueOf(var1);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private GameEnum10(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static boolean lIIlIlIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        a.lIIlIlIlllIIllI();
        a.lIIlIlIlllIIlIl();
        IRIT_LEAF = new GameEnum10(llllllllIlll[lllllllllIlI[1]], lllllllllIlI[2]);
        CADANTINE = new GameEnum10(llllllllIlll[lllllllllIlI[4]], lllllllllIlI[5]);
        LANTADYME = new GameEnum10(llllllllIlll[lllllllllIlI[7]], lllllllllIlI[8]);
        DWARF_WEED = new GameEnum10(llllllllIlll[lllllllllIlI[10]], lllllllllIlI[11]);
        TORSTOL = new GameEnum10(llllllllIlll[lllllllllIlI[13]], lllllllllIlI[14]);
        IRIT_POT_UNF = new GameEnum10(llllllllIlll[lllllllllIlI[16]], lllllllllIlI[17]);
        CADANTINE_POT_UNF = new GameEnum10(llllllllIlll[lllllllllIlI[19]], lllllllllIlI[20]);
        LANTA_POT_UNF = new GameEnum10(llllllllIlll[lllllllllIlI[22]], lllllllllIlI[23]);
        DWARF_WEED_POT_UNF = new GameEnum10(llllllllIlll[lllllllllIlI[25]], lllllllllIlI[26]);
        TORSTOL_POT_UNF = new GameEnum10(llllllllIlll[lllllllllIlI[28]], lllllllllIlI[29]);
        a[] aArray = new a[lllllllllIlI[15]];
        aArray[a.lllllllllIlI[0]] = IRIT_LEAF;
        aArray[a.lllllllllIlI[1]] = CADANTINE;
        aArray[a.lllllllllIlI[3]] = LANTADYME;
        aArray[a.lllllllllIlI[4]] = DWARF_WEED;
        aArray[a.lllllllllIlI[6]] = TORSTOL;
        aArray[a.lllllllllIlI[7]] = IRIT_POT_UNF;
        aArray[a.lllllllllIlI[9]] = CADANTINE_POT_UNF;
        aArray[a.lllllllllIlI[10]] = LANTA_POT_UNF;
        aArray[a.lllllllllIlI[12]] = DWARF_WEED_POT_UNF;
        aArray[a.lllllllllIlI[13]] = TORSTOL_POT_UNF;
        $VALUES = aArray;
    }
}

