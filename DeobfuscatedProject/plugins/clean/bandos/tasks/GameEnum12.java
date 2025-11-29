/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.bandos.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum12
extends Enum<c> {

    public static final  /* enum */ c RIGOUR;
    private static final  c[] $VALUES;
    private final  Prayer[] prayers;
    public static final  /* enum */ c EAGLE_EYE;

    static {
        c.lIlIllIIlIIIIl();
        c.lIlIllIIIlIlll();
        Prayer[] prayerArray = new Prayer[llIlllllllI[1]];
        prayerArray[c.llIlllllllI[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum12(prayerArray);
        Prayer[] prayerArray2 = new Prayer[llIlllllllI[2]];
        prayerArray2[c.llIlllllllI[0]] = Prayer.EAGLE_EYE;
        prayerArray2[c.llIlllllllI[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum12(prayerArray2);
        c[] cArray = new c[llIlllllllI[2]];
        cArray[c.llIlllllllI[0]] = RIGOUR;
        cArray[c.llIlllllllI[1]] = EAGLE_EYE;
        $VALUES = cArray;
    }

    private GameEnum12(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIlIllIIIlIlll() {
        llIlllllIll = new String[llIlllllllI[2]];
        c.llIlllllIll[c.llIlllllllI[0]] = "RIGOUR";
        c.llIlllllIll[c.llIlllllllI[1]] = "EAGLE_EYE";
    }

    public Prayer[] h() {
        return this.prayers;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }
}

