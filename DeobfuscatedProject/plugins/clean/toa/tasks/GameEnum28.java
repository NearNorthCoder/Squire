/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum28
extends Enum<m> {
    
    private final  Prayer mapped;
    private static final  m[] $VALUES;
    public static final  /* enum */ m PIETY;
    public static final  /* enum */ m CHIVALRY;
    public static final  /* enum */ m ULTIMATE_STRENGTH;

    static {
        m.lIllIlIlllIIllI();
        m.lIllIlIlllIIlIl();
        PIETY = new GameEnum28(Prayer.PIETY);
        CHIVALRY = new GameEnum28(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum28(Prayer.ULTIMATE_STRENGTH);
        m[] mArray = new m[lIlIIIIIIlIII[3]];
        mArray[m.lIlIIIIIIlIII[0]] = PIETY;
        mArray[m.lIlIIIIIIlIII[1]] = CHIVALRY;
        mArray[m.lIlIIIIIIlIII[2]] = ULTIMATE_STRENGTH;
        $VALUES = mArray;
    }

    private static boolean lIllIlIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    public Prayer z() {
        return this.mapped;
    }

    private static void lIllIlIlllIIlIl() {
        lIlIIIIIIIlll = new String[lIlIIIIIIlIII[3]];
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[0]] = "PIETY";
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[1]] = "CHIVALRY";
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[2]] = "ULTIMATE_STRENGTH";
    }

    private GameEnum28(Prayer prayer) {
        this.mapped = prayer;
    }
}

