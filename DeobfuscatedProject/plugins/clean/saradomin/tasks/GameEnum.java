/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.saradomin.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<i> {
    
    public static final  /* enum */ i RIGOUR;
    
    private static final  i[] $VALUES;
    public static final  /* enum */ i EAGLE_EYE;
    private final  Prayer[] prayers;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public Prayer[] z() {
        return this.prayers;
    }

    static {
        i.lIlIlIlIIllIIIl();
        i.lIlIlIlIIlIIlll();
        Prayer[] prayerArray = new Prayer[lIIlIIllIlIll[1]];
        prayerArray[i.lIIlIIllIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIIlIIllIlIll[2]];
        prayerArray2[i.lIIlIIllIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArray2[i.lIIlIIllIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum(prayerArray2);
        i[] iArray = new i[lIIlIIllIlIll[2]];
        iArray[i.lIIlIIllIlIll[0]] = RIGOUR;
        iArray[i.lIIlIIllIlIll[1]] = EAGLE_EYE;
        $VALUES = iArray;
    }

    private static void lIlIlIlIIlIIlll() {
        lIIlIIllIlIIl = new String[lIIlIIllIlIll[2]];
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[0]] = "RIGOUR";
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[1]] = "EAGLE_EYE";
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private GameEnum(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }
}

