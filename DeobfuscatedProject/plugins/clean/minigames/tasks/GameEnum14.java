/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum14
extends Enum<c> {
    
    public static final  /* enum */ c STEEL;
    public static final  /* enum */ c ADAMANTITE;
    public static final  /* enum */ c RUNITE;
    public static final  /* enum */ c GOLD;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c MITHRIL;

    static {
        c.llIIlllIIIIllI();
        c.llIIlllIIIIlIl();
        STEEL = new GameEnum14();
        GOLD = new GameEnum14();
        MITHRIL = new GameEnum14();
        ADAMANTITE = new GameEnum14();
        RUNITE = new GameEnum14();
        c[] cArray = new c[lIIllIIIlIlI[5]];
        cArray[c.lIIllIIIlIlI[0]] = STEEL;
        cArray[c.lIIllIIIlIlI[1]] = GOLD;
        cArray[c.lIIllIIIlIlI[2]] = MITHRIL;
        cArray[c.lIIllIIIlIlI[3]] = ADAMANTITE;
        cArray[c.lIIllIIIlIlI[4]] = RUNITE;
        $VALUES = cArray;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIlllIIIIlIl() {
        lIIllIIIlIIl = new String[lIIllIIIlIlI[5]];
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[0]] = "STEEL";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[1]] = "GOLD";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[2]] = "MITHRIL";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[3]] = "ADAMANTITE";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[4]] = "RUNITE";
    }
}

