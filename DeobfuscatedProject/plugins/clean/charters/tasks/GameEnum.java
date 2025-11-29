/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.charters.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    
    public static final  /* enum */ b CHARTER_SHIPS;

    static {
        b.lllIIIIlIIlIIl();
        b.lllIIIIlIIlIII();
        CHARTER_SHIPS = new GameEnum();
        b[] bArray = new b[lIlIllIlllIl[1]];
        bArray[b.lIlIllIlllIl[0]] = CHARTER_SHIPS;
        $VALUES = bArray;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void lllIIIIlIIlIII() {
        lIlIllIlllII = new String[lIlIllIlllIl[1]];
        b.lIlIllIlllII[b.lIlIllIlllIl[0]] = "CHARTER_SHIPS";
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

