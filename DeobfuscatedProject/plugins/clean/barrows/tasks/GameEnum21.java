/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.barrows.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum21
extends Enum<f> {
    public static final  /* enum */ f RIGOUR;
    public static final  /* enum */ f EAGLE_EYE;
    public static final  /* enum */ f PIETY;
    private static final  f[] $VALUES;
    public static final  /* enum */ f MYSTIC_MIGHT;
    public static final  /* enum */ f CHIVALRY;
    public static final  /* enum */ f ULTIMATE_STRENGTH;
    
    private final  List<Prayer> prayers;
    public static final  /* enum */ f AUGURY;

        return String.valueOf(var1);
    }

    private GameEnum21(Prayer ... prayerArray) {
        this.prayers = Stream.of(prayerArray).collect(Collectors.toList());
    }

    public List<Prayer> I() {
        return this.prayers;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    static {
        f.lIllIllIIIlIII();
        f.lIllIlIlllllll();
        Prayer[] prayerArray = new Prayer[llllIllIIII[1]];
        prayerArray[f.llllIllIIII[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum21(prayerArray);
        Prayer[] prayerArray2 = new Prayer[llllIllIIII[1]];
        prayerArray2[f.llllIllIIII[0]] = Prayer.AUGURY;
        AUGURY = new GameEnum21(prayerArray2);
        Prayer[] prayerArray3 = new Prayer[llllIllIIII[1]];
        prayerArray3[f.llllIllIIII[0]] = Prayer.PIETY;
        PIETY = new GameEnum21(prayerArray3);
        Prayer[] prayerArray4 = new Prayer[llllIllIIII[1]];
        prayerArray4[f.llllIllIIII[0]] = Prayer.CHIVALRY;
        CHIVALRY = new GameEnum21(prayerArray4);
        Prayer[] prayerArray5 = new Prayer[llllIllIIII[3]];
        prayerArray5[f.llllIllIIII[0]] = Prayer.ULTIMATE_STRENGTH;
        prayerArray5[f.llllIllIIII[1]] = Prayer.INCREDIBLE_REFLEXES;
        prayerArray5[f.llllIllIIII[2]] = Prayer.STEEL_SKIN;
        ULTIMATE_STRENGTH = new GameEnum21(prayerArray5);
        Prayer[] prayerArray6 = new Prayer[llllIllIIII[1]];
        prayerArray6[f.llllIllIIII[0]] = Prayer.EAGLE_EYE;
        EAGLE_EYE = new GameEnum21(prayerArray6);
        Prayer[] prayerArray7 = new Prayer[llllIllIIII[1]];
        prayerArray7[f.llllIllIIII[0]] = Prayer.MYSTIC_MIGHT;
        MYSTIC_MIGHT = new GameEnum21(prayerArray7);
        f[] fArray = new f[llllIllIIII[7]];
        fArray[f.llllIllIIII[0]] = RIGOUR;
        fArray[f.llllIllIIII[1]] = AUGURY;
        fArray[f.llllIllIIII[2]] = PIETY;
        fArray[f.llllIllIIII[3]] = CHIVALRY;
        fArray[f.llllIllIIII[4]] = ULTIMATE_STRENGTH;
        fArray[f.llllIllIIII[5]] = EAGLE_EYE;
        fArray[f.llllIllIIII[6]] = MYSTIC_MIGHT;
        $VALUES = fArray;
    }

    private static void lIllIlIlllllll() {
        llllIlIlllI = new String[llllIllIIII[7]];
        f.llllIlIlllI[f.llllIllIIII[0]] = "RIGOUR";
        f.llllIlIlllI[f.llllIllIIII[1]] = "AUGURY";
        f.llllIlIlllI[f.llllIllIIII[2]] = "PIETY";
        f.llllIlIlllI[f.llllIllIIII[3]] = "CHIVALRY";
        f.llllIlIlllI[f.llllIllIIII[4]] = "ULTIMATE_STRENGTH";
        f.llllIlIlllI[f.llllIllIIII[5]] = "EAGLE_EYE";
        f.llllIlIlllI[f.llllIllIIII[6]] = "MYSTIC_MIGHT";
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private static boolean lIllIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

