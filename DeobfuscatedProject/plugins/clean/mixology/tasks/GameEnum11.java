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

public final class GameEnum11
extends Enum<e> {
    private final  int herbId;
    public static final  /* enum */ e HARRALANDER;
    public static final  /* enum */ e MARRENTILL_POT_UNF;

    public static final  /* enum */ e HARRALANDER_POT_UNF;
    public static final  /* enum */ e GUAM_POT_UNF;
    public static final  /* enum */ e TARROMIN_POT_UNF;
    public static final  /* enum */ e GUAM_LEAF;
    private static final  e[] $VALUES;
    public static final  /* enum */ e TARROMIN;
    public static final  /* enum */ e MARRENTILL;
    private final  String name;

    public int b() {
        return this.herbId;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIIlIllIlIIllIl();
        e.lIIlIllIlIIllII();
        GUAM_LEAF = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[1]], lIIIIIIIlIIIl[2]);
        MARRENTILL = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[4]], lIIIIIIIlIIIl[5]);
        TARROMIN = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[7]], lIIIIIIIlIIIl[8]);
        HARRALANDER = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[10]], lIIIIIIIlIIIl[11]);
        GUAM_POT_UNF = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[13]], lIIIIIIIlIIIl[14]);
        MARRENTILL_POT_UNF = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[16]], lIIIIIIIlIIIl[17]);
        TARROMIN_POT_UNF = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[19]], lIIIIIIIlIIIl[20]);
        HARRALANDER_POT_UNF = new GameEnum11(lIIIIIIIlIIII[lIIIIIIIlIIIl[22]], lIIIIIIIlIIIl[23]);
        e[] eArray = new e[lIIIIIIIlIIIl[12]];
        eArray[e.lIIIIIIIlIIIl[0]] = GUAM_LEAF;
        eArray[e.lIIIIIIIlIIIl[1]] = MARRENTILL;
        eArray[e.lIIIIIIIlIIIl[3]] = TARROMIN;
        eArray[e.lIIIIIIIlIIIl[4]] = HARRALANDER;
        eArray[e.lIIIIIIIlIIIl[6]] = GUAM_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[7]] = MARRENTILL_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[9]] = TARROMIN_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[10]] = HARRALANDER_POT_UNF;
        $VALUES = eArray;
    }

    private static void lIIlIllIlIIllII() {
        lIIIIIIIlIIII = new String[lIIIIIIIlIIIl[24]];
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[0]] = "GUAM_LEAF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[1]] = "Guam leaf";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[3]] = "MARRENTILL";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[4]] = "Marrentill";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[6]] = "TARROMIN";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[7]] = "Tarromin";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[9]] = "HARRALANDER";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[10]] = "Harralander";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[12]] = "GUAM_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[13]] = "Guam potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[15]] = "MARRENTILL_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[16]] = "Marrentill potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[18]] = "TARROMIN_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[19]] = "Tarromin potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[21]] = "HARRALANDER_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[22]] = "Harralander potion (unf)";
    }

    private GameEnum11(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

}

