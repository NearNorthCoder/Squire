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

public final class GameEnum15
extends Enum<a> {
    private final  Prayer[] prayers;
    public static final  /* enum */ a MYSTIC_MIGHT;
    public static final  /* enum */ a AUGURY;
    private static final  a[] $VALUES;

        return String.valueOf(var1);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    private static void llIIIllIIlIllll() {
        lIllIIlIlllIl = new String[lIllIIlIllllI[1]];
        a.lIllIIlIlllIl[a.lIllIIlIllllI[0]] = "MYSTIC_MIGHT";
        a.lIllIIlIlllIl[a.lIllIIlIllllI[2]] = "AUGURY";
    }

    public Prayer[] GameEnum15() {
        return this.prayers;
    }

    static {
        a.llIIIllIIllIIII();
        a.llIIIllIIlIllll();
        Prayer[] prayerArray = new Prayer[lIllIIlIllllI[1]];
        prayerArray[a.lIllIIlIllllI[0]] = Prayer.MYSTIC_MIGHT;
        prayerArray[a.lIllIIlIllllI[2]] = Prayer.STEEL_SKIN;
        MYSTIC_MIGHT = new GameEnum15(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIllIIlIllllI[2]];
        prayerArray2[a.lIllIIlIllllI[0]] = Prayer.AUGURY;
        AUGURY = new GameEnum15(prayerArray2);
        a[] aArray = new a[lIllIIlIllllI[1]];
        aArray[a.lIllIIlIllllI[0]] = MYSTIC_MIGHT;
        aArray[a.lIllIIlIllllI[2]] = AUGURY;
        $VALUES = aArray;
    }

    private static boolean llIIIllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum15(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }
}

