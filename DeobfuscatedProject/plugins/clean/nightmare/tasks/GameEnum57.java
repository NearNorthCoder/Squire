/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum57
extends Enum<x> {
    public static final  /* enum */ x NONE;
    public static final  /* enum */ x BLOWPIPE;
    public static final  /* enum */ x WEBWEAVER_BOW;
    
    private static final  x[] $VALUES;
    public static final  /* enum */ x CHINCHOMPA;
    public static final  /* enum */ x HUNTER_CROSSBOW;
    
    private final  String itemName;
    public static final  /* enum */ x CRAWS_BOW;

    public String bP() {
        return this.itemName;
    }

    static {
        x.lIIlIIIlIIIlIIl();
        x.lIIlIIIlIIIIlll();
        HUNTER_CROSSBOW = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[1]]);
        BLOWPIPE = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[3]]);
        CHINCHOMPA = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[5]]);
        CRAWS_BOW = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[7]]);
        WEBWEAVER_BOW = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[9]]);
        NONE = new GameEnum57(llllIlIlIlIl[llllIlIllIlI[11]]);
        x[] xArray = new x[llllIlIllIlI[6]];
        xArray[x.llllIlIllIlI[0]] = HUNTER_CROSSBOW;
        xArray[x.llllIlIllIlI[1]] = BLOWPIPE;
        xArray[x.llllIlIllIlI[2]] = CHINCHOMPA;
        xArray[x.llllIlIllIlI[3]] = CRAWS_BOW;
        xArray[x.llllIlIllIlI[4]] = WEBWEAVER_BOW;
        xArray[x.llllIlIllIlI[5]] = NONE;
        $VALUES = xArray;
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static void lIIlIIIlIIIIlll() {
        llllIlIlIlIl = new String[llllIlIllIlI[12]];
        x.llllIlIlIlIl[x.llllIlIllIlI[0]] = "HUNTER_CROSSBOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[1]] = "Hunters' crossbow";
        x.llllIlIlIlIl[x.llllIlIllIlI[2]] = "BLOWPIPE";
        x.llllIlIlIlIl[x.llllIlIllIlI[3]] = "blowpipe";
        x.llllIlIlIlIl[x.llllIlIllIlI[4]] = "CHINCHOMPA";
        x.llllIlIlIlIl[x.llllIlIllIlI[5]] = "Chinchompa";
        x.llllIlIlIlIl[x.llllIlIllIlI[6]] = "CRAWS_BOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[7]] = "Craw's bow";
        x.llllIlIlIlIl[x.llllIlIllIlI[8]] = "WEBWEAVER_BOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[9]] = "Webweaver bow";
        x.llllIlIlIlIl[x.llllIlIllIlI[10]] = "NONE";
        x.llllIlIlIlIl[x.llllIlIllIlI[11]] = "none";
    }

    private GameEnum57(String string2) {
        this.itemName = string2;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIlIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum57.class, string);
    }
}

