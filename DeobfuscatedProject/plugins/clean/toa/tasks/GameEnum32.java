/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum32
extends Enum<p> {
    public static final  /* enum */ p RANGE;

    private static final  p[] $VALUES;
    public static final  /* enum */ p MELEE;
    public static final  /* enum */ p MAGE;

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void lIllIlIlIIIlIII() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[3]];
        p.lIIlllllIIlIl[p.lIIlllllIIllI[0]] = "RANGE";
        p.lIIlllllIIlIl[p.lIIlllllIIllI[1]] = "MAGE";
        p.lIIlllllIIlIl[p.lIIlllllIIllI[2]] = "MELEE";
    }

    static {
        p.lIllIlIlIIIlIIl();
        p.lIllIlIlIIIlIII();
        RANGE = new GameEnum32();
        MAGE = new GameEnum32();
        MELEE = new GameEnum32();
        p[] pArray = new p[lIIlllllIIllI[3]];
        pArray[p.lIIlllllIIllI[0]] = RANGE;
        pArray[p.lIIlllllIIllI[1]] = MAGE;
        pArray[p.lIIlllllIIllI[2]] = MELEE;
        $VALUES = pArray;
    }
}

