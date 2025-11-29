/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum18
extends Enum<t> {
    public static final  /* enum */ t AUGURY;
    public static final  /* enum */ t MYSTIC_MIGHT;
    
    private static final  t[] $VALUES;
    private final  Prayer mapped;

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private GameEnum18(Prayer prayer) {
        this.mapped = prayer;
    }

    static {
        t.lIIlIlllIlIlIl();
        t.lIIlIlllIlIlII();
        AUGURY = new GameEnum18(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum18(Prayer.MYSTIC_MIGHT);
        t[] tArray = new t[lIllIlIllIl[2]];
        tArray[t.lIllIlIllIl[0]] = AUGURY;
        tArray[t.lIllIlIllIl[1]] = MYSTIC_MIGHT;
        $VALUES = tArray;
    }

    private static void lIIlIlllIlIlII() {
        lIllIlIllII = new String[lIllIlIllIl[2]];
        t.lIllIlIllII[t.lIllIlIllIl[0]] = "AUGURY";
        t.lIllIlIllII[t.lIllIlIllIl[1]] = "MYSTIC_MIGHT";
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }
}

