/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum26
extends Enum<l> {
    
    private final  Prayer mapped;
    public static final  /* enum */ l MYSTIC_MIGHT;
    public static final  /* enum */ l AUGURY;
    private static final  l[] $VALUES;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    private static void lIllIlIIlllllII() {
        lIIlllllIIIIl = new String[lIIlllllIIIlI[2]];
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[0]] = "AUGURY";
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[1]] = "MYSTIC_MIGHT";
    }

    static {
        l.lIllIlIIlllllIl();
        l.lIllIlIIlllllII();
        AUGURY = new GameEnum26(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum26(Prayer.MYSTIC_MIGHT);
        l[] lArray = new l[lIIlllllIIIlI[2]];
        lArray[l.lIIlllllIIIlI[0]] = AUGURY;
        lArray[l.lIIlllllIIIlI[1]] = MYSTIC_MIGHT;
        $VALUES = lArray;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }

    private GameEnum26(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lIllIllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

