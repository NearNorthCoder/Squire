/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum4
extends Enum<bO> {
    private static final  bO[] $VALUES;
    public static final  /* enum */ bO FUNGUS;

    public static final  /* enum */ bO SWAMP_TOAD;
    public static final  /* enum */ bO SNAPE_GRASS;
    private final  int id;

    private static void lIllIlIlIII() {
        llIIlllIl = new String[llIIllllI[6]];
        bO.llIIlllIl[bO.llIIllllI[0]] = "FUNGUS";
        bO.llIIlllIl[bO.llIIllllI[2]] = "SNAPE_GRASS";
        bO.llIIlllIl[bO.llIIllllI[4]] = "SWAMP_TOAD";
    }

    static {
        bO.lIllIlIlIIl();
        bO.lIllIlIlIII();
        FUNGUS = new GameEnum4(llIIllllI[1]);
        SNAPE_GRASS = new GameEnum4(llIIllllI[3]);
        SWAMP_TOAD = new GameEnum4(llIIllllI[5]);
        bO[] bOArray = new bO[llIIllllI[6]];
        bOArray[bO.llIIllllI[0]] = FUNGUS;
        bOArray[bO.llIIllllI[2]] = SNAPE_GRASS;
        bOArray[bO.llIIllllI[4]] = SWAMP_TOAD;
        $VALUES = bOArray;
    }

    private static boolean lIllIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum4(int n3) {
        this.id = n3;
    }

        return String.valueOf(lIllIIlIIllIIll);
    }

    public static bO[] values() {
        return (bO[])$VALUES.clone();
    }

    public int P() {
        return this.id;
    }

    public static bO valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }
}

