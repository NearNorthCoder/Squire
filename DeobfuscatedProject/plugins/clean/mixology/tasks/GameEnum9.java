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

public final class GameEnum9
extends Enum<c> {
    public static final  /* enum */ c AVANTOE;
    public static final  /* enum */ c TOADFLAX;
    public static final  /* enum */ c KWUARM;
    public static final  /* enum */ c KWUARM_POT_UNF;
    
    public static final  /* enum */ c SNAPDRAGON_POT_UNF;
    public static final  /* enum */ c SNAPDRAGON;
    public static final  /* enum */ c RANARR_POT_UNF;
    public static final  /* enum */ c AVANTOE_POT_UNF;
    private final  String name;
    public static final  /* enum */ c RANARR_WEED;
    private final  int herbId;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c TOADFLAX_POT_UNF;

    static {
        c.lIIlIlIllIlIIll();
        c.lIIlIlIllIlIIlI();
        RANARR_WEED = new GameEnum9(llllllllIIll[llllllllIlII[1]], llllllllIlII[2]);
        TOADFLAX = new GameEnum9(llllllllIIll[llllllllIlII[4]], llllllllIlII[5]);
        AVANTOE = new GameEnum9(llllllllIIll[llllllllIlII[7]], llllllllIlII[8]);
        KWUARM = new GameEnum9(llllllllIIll[llllllllIlII[10]], llllllllIlII[11]);
        SNAPDRAGON = new GameEnum9(llllllllIIll[llllllllIlII[13]], llllllllIlII[14]);
        RANARR_POT_UNF = new GameEnum9(llllllllIIll[llllllllIlII[16]], llllllllIlII[17]);
        TOADFLAX_POT_UNF = new GameEnum9(llllllllIIll[llllllllIlII[19]], llllllllIlII[20]);
        AVANTOE_POT_UNF = new GameEnum9(llllllllIIll[llllllllIlII[22]], llllllllIlII[23]);
        KWUARM_POT_UNF = new GameEnum9(llllllllIIll[llllllllIlII[25]], llllllllIlII[26]);
        SNAPDRAGON_POT_UNF = new GameEnum9(llllllllIIll[llllllllIlII[28]], llllllllIlII[29]);
        c[] cArray = new c[llllllllIlII[15]];
        cArray[c.llllllllIlII[0]] = RANARR_WEED;
        cArray[c.llllllllIlII[1]] = TOADFLAX;
        cArray[c.llllllllIlII[3]] = AVANTOE;
        cArray[c.llllllllIlII[4]] = KWUARM;
        cArray[c.llllllllIlII[6]] = SNAPDRAGON;
        cArray[c.llllllllIlII[7]] = RANARR_POT_UNF;
        cArray[c.llllllllIlII[9]] = TOADFLAX_POT_UNF;
        cArray[c.llllllllIlII[10]] = AVANTOE_POT_UNF;
        cArray[c.llllllllIlII[12]] = KWUARM_POT_UNF;
        cArray[c.llllllllIlII[13]] = SNAPDRAGON_POT_UNF;
        $VALUES = cArray;
    }

        return String.valueOf(var1);
    }

    public int b() {
        return this.herbId;
    }

    private static void lIIlIlIllIlIIlI() {
        llllllllIIll = new String[llllllllIlII[30]];
        c.llllllllIIll[c.llllllllIlII[0]] = "RANARR_WEED";
        c.llllllllIIll[c.llllllllIlII[1]] = "Ranarr weed";
        c.llllllllIIll[c.llllllllIlII[3]] = "TOADFLAX";
        c.llllllllIIll[c.llllllllIlII[4]] = "Toadflax";
        c.llllllllIIll[c.llllllllIlII[6]] = "AVANTOE";
        c.llllllllIIll[c.llllllllIlII[7]] = "Avantoe";
        c.llllllllIIll[c.llllllllIlII[9]] = "KWUARM";
        c.llllllllIIll[c.llllllllIlII[10]] = "Kwuarm";
        c.llllllllIIll[c.llllllllIlII[12]] = "SNAPDRAGON";
        c.llllllllIIll[c.llllllllIlII[13]] = "Snapdragon";
        c.llllllllIIll[c.llllllllIlII[15]] = "RANARR_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[16]] = "Ranarr potion (unf)";
        c.llllllllIIll[c.llllllllIlII[18]] = "TOADFLAX_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[19]] = "Toadflax potion (unf)";
        c.llllllllIIll[c.llllllllIlII[21]] = "AVANTOE_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[22]] = "Avantoe potion (unf)";
        c.llllllllIIll[c.llllllllIlII[24]] = "KWUARM_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[25]] = "Kwuarm potion (unf)";
        c.llllllllIIll[c.llllllllIlII[27]] = "SNAPDRAGON_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[28]] = "Snapdragon potion (unf)";
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIlIllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum9(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

}

