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

public final class GameEnum4
extends Enum<b> {
    public static final  /* enum */ b KWUARM_POT_UNF;
    public static final  /* enum */ b CADANTINE;
    public static final  /* enum */ b CADANTINE_POT_UNF;
    public static final  /* enum */ b IRIT_LEAF;
    
    public static final  /* enum */ b RANARR_POT_UNF;
    public static final  /* enum */ b AVANTOE_POT_UNF;
    public static final  /* enum */ b TARROMIN;
    public static final  /* enum */ b SNAPDRAGON_POT_UNF;
    public static final  /* enum */ b HARRALANDER_POT_UNF;
    public static final  /* enum */ b MARRENTILL_POT_UNF;
    public static final  /* enum */ b TOADFLAX_POT_UNF;
    public static final  /* enum */ b LANTADYME;
    private final  String name;
    public static final  /* enum */ b DWARF_WEED;
    public static final  /* enum */ b KWUARM;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MARRENTILL;
    public static final  /* enum */ b HARRALANDER;
    public static final  /* enum */ b IRIT_POT_UNF;
    public static final  /* enum */ b DWARF_WEED_POT_UNF;
    public static final  /* enum */ b RANARR_WEED;
    public static final  /* enum */ b GUAM_POT_UNF;
    public static final  /* enum */ b TORSTOL_POT_UNF;
    public static final  /* enum */ b TOADFLAX;
    public static final  /* enum */ b GUAM_LEAF;
    public static final  /* enum */ b AVANTOE;
    public static final  /* enum */ b LANTA_POT_UNF;
    
    private final  int herbId;
    public static final  /* enum */ b TARROMIN_POT_UNF;
    public static final  /* enum */ b SNAPDRAGON;
    public static final  /* enum */ b TORSTOL;

        return String.valueOf(var1);
    }

    private GameEnum4(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static boolean lIIlIllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public String a() {
        return this.name;
    }

    private static void lIIlIllIIIlIIll() {
        lIIIIIIIIIIlI = new String[lIIIIIIIIIlIl[84]];
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[0]] = "GUAM_LEAF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[1]] = "Guam leaf";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[3]] = "MARRENTILL";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[4]] = "Marrentill";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[6]] = "TARROMIN";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[7]] = "Tarromin";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[9]] = "HARRALANDER";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[10]] = "Harralander";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[12]] = "RANARR_WEED";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[13]] = "Ranarr weed";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[15]] = "TOADFLAX";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[16]] = "Toadflax";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[18]] = "IRIT_LEAF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[19]] = "Irit leaf";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[21]] = "AVANTOE";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[22]] = "Avantoe";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[24]] = "KWUARM";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[25]] = "Kwuarm";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[27]] = "SNAPDRAGON";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[28]] = "Snapdragon";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[30]] = "CADANTINE";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[31]] = "Cadantine";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[33]] = "LANTADYME";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[34]] = "Lantadyme";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[36]] = "DWARF_WEED";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[37]] = "Dwarf weed";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[39]] = "TORSTOL";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[40]] = "Torstol";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[42]] = "IRIT_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[43]] = "Irit potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[45]] = "CADANTINE_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[46]] = "Cadantine potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[48]] = "LANTA_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[49]] = "Lantadyme potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[51]] = "DWARF_WEED_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[52]] = "Dwarf weed potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[54]] = "TORSTOL_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[55]] = "Torstol potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[57]] = "RANARR_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[58]] = "Ranarr potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[60]] = "TOADFLAX_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[61]] = "Toadflax potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[63]] = "AVANTOE_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[64]] = "Avantoe potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[66]] = "KWUARM_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[67]] = "Kwuarm potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[69]] = "SNAPDRAGON_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[70]] = "Snapdragon potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[72]] = "GUAM_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[73]] = "Guam potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[75]] = "MARRENTILL_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[76]] = "Marrentill potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[78]] = "TARROMIN_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[79]] = "Tarromin potion (unf)";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[81]] = "HARRALANDER_POT_UNF";
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[82]] = "Harralander potion (unf)";
    }

    public int GameEnum4() {
        return this.herbId;
    }

    static {
        b.lIIlIllIIIlIlII();
        b.lIIlIllIIIlIIll();
        GUAM_LEAF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[1]], lIIIIIIIIIlIl[2]);
        MARRENTILL = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[4]], lIIIIIIIIIlIl[5]);
        TARROMIN = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[7]], lIIIIIIIIIlIl[8]);
        HARRALANDER = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[10]], lIIIIIIIIIlIl[11]);
        RANARR_WEED = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[13]], lIIIIIIIIIlIl[14]);
        TOADFLAX = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[16]], lIIIIIIIIIlIl[17]);
        IRIT_LEAF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[19]], lIIIIIIIIIlIl[20]);
        AVANTOE = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[22]], lIIIIIIIIIlIl[23]);
        KWUARM = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[25]], lIIIIIIIIIlIl[26]);
        SNAPDRAGON = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[28]], lIIIIIIIIIlIl[29]);
        CADANTINE = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[31]], lIIIIIIIIIlIl[32]);
        LANTADYME = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[34]], lIIIIIIIIIlIl[35]);
        DWARF_WEED = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[37]], lIIIIIIIIIlIl[38]);
        TORSTOL = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[40]], lIIIIIIIIIlIl[41]);
        IRIT_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[43]], lIIIIIIIIIlIl[44]);
        CADANTINE_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[46]], lIIIIIIIIIlIl[47]);
        LANTA_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[49]], lIIIIIIIIIlIl[50]);
        DWARF_WEED_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[52]], lIIIIIIIIIlIl[53]);
        TORSTOL_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[55]], lIIIIIIIIIlIl[56]);
        RANARR_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[58]], lIIIIIIIIIlIl[59]);
        TOADFLAX_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[61]], lIIIIIIIIIlIl[62]);
        AVANTOE_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[64]], lIIIIIIIIIlIl[65]);
        KWUARM_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[67]], lIIIIIIIIIlIl[68]);
        SNAPDRAGON_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[70]], lIIIIIIIIIlIl[71]);
        GUAM_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[73]], lIIIIIIIIIlIl[74]);
        MARRENTILL_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[76]], lIIIIIIIIIlIl[77]);
        TARROMIN_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[79]], lIIIIIIIIIlIl[80]);
        HARRALANDER_POT_UNF = new GameEnum4(lIIIIIIIIIIlI[lIIIIIIIIIlIl[82]], lIIIIIIIIIlIl[83]);
        b[] bArray = new b[lIIIIIIIIIlIl[42]];
        bArray[b.lIIIIIIIIIlIl[0]] = GUAM_LEAF;
        bArray[b.lIIIIIIIIIlIl[1]] = MARRENTILL;
        bArray[b.lIIIIIIIIIlIl[3]] = TARROMIN;
        bArray[b.lIIIIIIIIIlIl[4]] = HARRALANDER;
        bArray[b.lIIIIIIIIIlIl[6]] = RANARR_WEED;
        bArray[b.lIIIIIIIIIlIl[7]] = TOADFLAX;
        bArray[b.lIIIIIIIIIlIl[9]] = IRIT_LEAF;
        bArray[b.lIIIIIIIIIlIl[10]] = AVANTOE;
        bArray[b.lIIIIIIIIIlIl[12]] = KWUARM;
        bArray[b.lIIIIIIIIIlIl[13]] = SNAPDRAGON;
        bArray[b.lIIIIIIIIIlIl[15]] = CADANTINE;
        bArray[b.lIIIIIIIIIlIl[16]] = LANTADYME;
        bArray[b.lIIIIIIIIIlIl[18]] = DWARF_WEED;
        bArray[b.lIIIIIIIIIlIl[19]] = TORSTOL;
        bArray[b.lIIIIIIIIIlIl[21]] = IRIT_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[22]] = CADANTINE_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[24]] = LANTA_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[25]] = DWARF_WEED_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[27]] = TORSTOL_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[28]] = RANARR_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[30]] = TOADFLAX_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[31]] = AVANTOE_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[33]] = KWUARM_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[34]] = SNAPDRAGON_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[36]] = GUAM_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[37]] = MARRENTILL_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[39]] = TARROMIN_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[40]] = HARRALANDER_POT_UNF;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

