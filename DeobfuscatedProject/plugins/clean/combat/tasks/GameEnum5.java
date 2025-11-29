/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.combat.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum5
extends Enum<c> {
    
    private static final  c[] $VALUES;
    public static final  /* enum */ c RANGE;
    public static final  /* enum */ c MAGIC;
    public static final  /* enum */ c MELEE;

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static void llIlIIlIIIIIII() {
        lIIllllIlIIl = new String[lIIllllIlIlI[3]];
        c.lIIllllIlIIl[c.lIIllllIlIlI[0]] = "MELEE";
        c.lIIllllIlIIl[c.lIIllllIlIlI[1]] = "MAGIC";
        c.lIIllllIlIIl[c.lIIllllIlIlI[2]] = "RANGE";
    }

    static {
        c.llIlIIlIIIIIIl();
        c.llIlIIlIIIIIII();
        MELEE = new GameEnum5();
        MAGIC = new GameEnum5();
        RANGE = new GameEnum5();
        c[] cArray = new c[lIIllllIlIlI[3]];
        cArray[c.lIIllllIlIlI[0]] = MELEE;
        cArray[c.lIIllllIlIlI[1]] = MAGIC;
        cArray[c.lIIllllIlIlI[2]] = RANGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

}

