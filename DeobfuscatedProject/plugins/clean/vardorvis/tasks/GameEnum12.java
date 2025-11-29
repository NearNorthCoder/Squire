/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 */
package gg.squire.vardorvis.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.HeadIcon;

public final class GameEnum12
extends Enum<j> {
    private static final  j[] $VALUES;
    public static final  /* enum */ j RANGED;
    public static final  /* enum */ j MAGIC;
    
    private final  HeadIcon protection;
    public static final  /* enum */ j STAB;
    
    public static final  /* enum */ j CRUSH;
    private final  int styleSpriteId;
    public static final  /* enum */ j SLASH;
    static  j[] MELEE_STYLES;

    public int L() {
        return this.styleSpriteId;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static boolean lIllllIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIllllIlIIIlIll();
        j.lIllllIlIIIlIlI();
        STAB = new GameEnum12(HeadIcon.MELEE, lIlIlIIIIlIIl[1]);
        SLASH = new GameEnum12(HeadIcon.MELEE, lIlIlIIIIlIIl[3]);
        CRUSH = new GameEnum12(HeadIcon.MELEE, lIlIlIIIIlIIl[5]);
        RANGED = new GameEnum12(HeadIcon.RANGED, lIlIlIIIIlIIl[7]);
        MAGIC = new GameEnum12(HeadIcon.MAGIC, lIlIlIIIIlIIl[9]);
        j[] jArray = new j[lIlIlIIIIlIIl[10]];
        jArray[j.lIlIlIIIIlIIl[0]] = STAB;
        jArray[j.lIlIlIIIIlIIl[2]] = SLASH;
        jArray[j.lIlIlIIIIlIIl[4]] = CRUSH;
        jArray[j.lIlIlIIIIlIIl[6]] = RANGED;
        jArray[j.lIlIlIIIIlIIl[8]] = MAGIC;
        $VALUES = jArray;
        j[] jArray2 = new j[lIlIlIIIIlIIl[6]];
        jArray2[j.lIlIlIIIIlIIl[0]] = STAB;
        jArray2[j.lIlIlIIIIlIIl[2]] = SLASH;
        jArray2[j.lIlIlIIIIlIIl[4]] = CRUSH;
        MELEE_STYLES = jArray2;
    }

    private static void lIllllIlIIIlIlI() {
        lIlIlIIIIlIII = new String[lIlIlIIIIlIIl[10]];
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[0]] = "STAB";
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[2]] = "SLASH";
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[4]] = "CRUSH";
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[6]] = "RANGED";
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[8]] = "MAGIC";
    }

    public HeadIcon K() {
        return this.protection;
    }

    private GameEnum12(HeadIcon headIcon, int n3) {
        this.protection = headIcon;
        this.styleSpriteId = n3;
    }

        return String.valueOf(var1);
    }

    public boolean J() {
        return List.of(MELEE_STYLES).contains((Object)this);
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }
}

