/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<G> {
    private static final  G[] $VALUES;
    public static final  /* enum */ G JUTE;
    public static final  /* enum */ G HAMMERSTONE;
    public static final  /* enum */ G ASGARNIAN;
    public static final  /* enum */ G YANILLIAN;
    public static final  /* enum */ G KRANDORIAN;

    public static final  /* enum */ G BARLEY;
    private final  int seed;
    public static final  /* enum */ G WILDBLOOD;

        return String.valueOf(var1);
    }

    private static void lllIlllIIlllII() {
        lIllllIIllll = new String[lIllllIlIIII[14]];
        G.lIllllIIllll[G.lIllllIlIIII[0]] = "BARLEY";
        G.lIllllIIllll[G.lIllllIlIIII[2]] = "HAMMERSTONE";
        G.lIllllIIllll[G.lIllllIlIIII[4]] = "ASGARNIAN";
        G.lIllllIIllll[G.lIllllIlIIII[6]] = "JUTE";
        G.lIllllIIllll[G.lIllllIlIIII[8]] = "YANILLIAN";
        G.lIllllIIllll[G.lIllllIlIIII[10]] = "KRANDORIAN";
        G.lIllllIIllll[G.lIllllIlIIII[12]] = "WILDBLOOD";
    }

    private GameEnum(int n3) {
        this.seed = n3;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    public int aA() {
        return this.seed;
    }

    static {
        G.lllIlllIIlllIl();
        G.lllIlllIIlllII();
        BARLEY = new GameEnum(lIllllIlIIII[1]);
        HAMMERSTONE = new GameEnum(lIllllIlIIII[3]);
        ASGARNIAN = new GameEnum(lIllllIlIIII[5]);
        JUTE = new GameEnum(lIllllIlIIII[7]);
        YANILLIAN = new GameEnum(lIllllIlIIII[9]);
        KRANDORIAN = new GameEnum(lIllllIlIIII[11]);
        WILDBLOOD = new GameEnum(lIllllIlIIII[13]);
        G[] gArray = new G[lIllllIlIIII[14]];
        gArray[G.lIllllIlIIII[0]] = BARLEY;
        gArray[G.lIllllIlIIII[2]] = HAMMERSTONE;
        gArray[G.lIllllIlIIII[4]] = ASGARNIAN;
        gArray[G.lIllllIlIIII[6]] = JUTE;
        gArray[G.lIllllIlIIII[8]] = YANILLIAN;
        gArray[G.lIllllIlIIII[10]] = KRANDORIAN;
        gArray[G.lIllllIlIIII[12]] = WILDBLOOD;
        $VALUES = gArray;
    }

    private static boolean lllIlllIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

}

