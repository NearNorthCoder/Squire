/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum25
extends Enum<y> {
    public static final  /* enum */ y MAHOGANY_RUNE;
    public static final  /* enum */ y REGULAR_STEEL;
    public static final  /* enum */ y NONE;
    public static final  /* enum */ y OAK_MITHRIL;
    public static final  /* enum */ y TEAK_ADAMANT;
    private static final  y[] $VALUES;
    
     String name;

    private static void lIIIlIIllIllllI() {
        lllIIIlllIll = new String[lllIIIllllII[10]];
        y.lllIIIlllIll[y.lllIIIllllII[0]] = "NONE";
        y.lllIIIlllIll[y.lllIIIllllII[1]] = y.lIIIlIIllIllIll("", "cQpgg");
        y.lllIIIlllIll[y.lllIIIllllII[2]] = "REGULAR_STEEL";
        y.lllIIIlllIll[y.lllIIIllllII[3]] = y.lIIIlIIllIlllIl("AgcO4NW/zDA=", "UNgQI");
        y.lllIIIlllIll[y.lllIIIllllII[4]] = "OAK_MITHRIL";
        y.lllIIIlllIll[y.lllIIIllllII[5]] = y.lIIIlIIllIlllIl("AbBifuy7EEg=", "TzZOJ");
        y.lllIIIlllIll[y.lllIIIllllII[6]] = "TEAK_ADAMANT";
        y.lllIIIlllIll[y.lllIIIllllII[7]] = y.lIIIlIIllIlllIl("m6lWtxjJnq8=", "FnxZn");
        y.lllIIIlllIll[y.lllIIIllllII[8]] = "MAHOGANY_RUNE";
        y.lllIIIlllIll[y.lllIIIllllII[9]] = y.lIIIlIIllIlllIl("E8W3bkJzcLw=", "DUsns");
    }

    static {
        y.lIIIlIIllIlllll();
        y.lIIIlIIllIllllI();
        NONE = new GameEnum25(lllIIIlllIll[lllIIIllllII[1]]);
        REGULAR_STEEL = new GameEnum25(lllIIIlllIll[lllIIIllllII[3]]);
        OAK_MITHRIL = new GameEnum25(lllIIIlllIll[lllIIIllllII[5]]);
        TEAK_ADAMANT = new GameEnum25(lllIIIlllIll[lllIIIllllII[7]]);
        MAHOGANY_RUNE = new GameEnum25(lllIIIlllIll[lllIIIllllII[9]]);
        y[] yArray = new y[lllIIIllllII[5]];
        yArray[y.lllIIIllllII[0]] = NONE;
        yArray[y.lllIIIllllII[1]] = REGULAR_STEEL;
        yArray[y.lllIIIllllII[2]] = OAK_MITHRIL;
        yArray[y.lllIIIllllII[3]] = TEAK_ADAMANT;
        yArray[y.lllIIIllllII[4]] = MAHOGANY_RUNE;
        $VALUES = yArray;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    private GameEnum25(String string2) {
        this.name = string2;
    }
}

