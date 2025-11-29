/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zammy.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    private final  Prayer[] prayers;
    
    public static final  /* enum */ b EAGLE_EYE;
    public static final  /* enum */ b RIGOUR;

    private static void llIIIlIllllIlIl() {
        lIllIIlIIlIlI = new String[lIllIIlIIlIll[2]];
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[0]] = "RIGOUR";
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[1]] = "EAGLE_EYE";
    }

    private GameEnum(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public Prayer[] a() {
        return this.prayers;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.llIIIlIllllIllI();
        b.llIIIlIllllIlIl();
        Prayer[] prayerArray = new Prayer[lIllIIlIIlIll[1]];
        prayerArray[b.lIllIIlIIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIllIIlIIlIll[2]];
        prayerArray2[b.lIllIIlIIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArray2[b.lIllIIlIIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum(prayerArray2);
        b[] bArray = new b[lIllIIlIIlIll[2]];
        bArray[b.lIllIIlIIlIll[0]] = RIGOUR;
        bArray[b.lIllIIlIIlIll[1]] = EAGLE_EYE;
        $VALUES = bArray;
    }
}

