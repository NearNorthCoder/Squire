/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum15
extends Enum<d> {
    
    public static final  /* enum */ d CREATE_PASTE;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MINIGAME;

        return String.valueOf(var1);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    static {
        d.lIIlIlIlIIlIIlI();
        d.lIIlIlIlIIlIIIl();
        MINIGAME = new GameEnum15();
        CREATE_PASTE = new GameEnum15();
        d[] dArray = new d[lllllllIIllI[2]];
        dArray[d.lllllllIIllI[0]] = MINIGAME;
        dArray[d.lllllllIIllI[1]] = CREATE_PASTE;
        $VALUES = dArray;
    }

    private static void lIIlIlIlIIlIIIl() {
        lllllllIIlIl = new String[lllllllIIllI[2]];
        d.lllllllIIlIl[d.lllllllIIllI[0]] = "MINIGAME";
        d.lllllllIIlIl[d.lllllllIIllI[1]] = "CREATE_PASTE";
    }

    private static boolean lIIlIlIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

