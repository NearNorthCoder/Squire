/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class GameEnum78
extends Enum<aW> {
    private static final  aW[] $VALUES;
    public static final  /* enum */ aW VENTS;
    public static final  /* enum */ aW PILLARS;

    static {
        aW.lIIlIllllIIlll();
        aW.lIIlIllllIIllI();
        PILLARS = new GameEnum78();
        VENTS = new GameEnum78();
        aW[] aWArray = new aW[lIllIllIIlI[2]];
        aWArray[aW.lIllIllIIlI[0]] = PILLARS;
        aWArray[aW.lIllIllIIlI[1]] = VENTS;
        $VALUES = aWArray;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static void lIIlIllllIIllI() {
        lIllIllIIIl = new String[lIllIllIIlI[2]];
        aW.lIllIllIIIl[aW.lIllIllIIlI[0]] = "PILLARS";
        aW.lIllIllIIIl[aW.lIllIllIIlI[1]] = "VENTS";
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(GameEnum78.class, string);
    }
}

