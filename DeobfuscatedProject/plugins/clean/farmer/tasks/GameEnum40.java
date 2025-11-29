/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum61;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;

public final class GameEnum40
extends Enum<F> {
    
    public static final  /* enum */ F UNKNOWN;
    public static final  /* enum */ F BUILT;
    
    private final  Color color;
    public static final  /* enum */ F SEEDED;
    public static final  /* enum */ F EMPTY;
    private static final  F[] $VALUES;

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum40.class, string);
    }

    private static boolean lllIllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static boolean lllIllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllIIllllII(int n2) {
        return n2 >= 0;
    }

    private GameEnum40(Color color) {
        this.color = color;
    }

    private static void lllIllIIlllIlI() {
        lIlllIllIIll = new String[lIlllIllIlII[4]];
        F.lIlllIllIIll[F.lIlllIllIlII[1]] = "SEEDED";
        F.lIlllIllIIll[F.lIlllIllIlII[2]] = "BUILT";
        F.lIlllIllIIll[F.lIlllIllIlII[3]] = "EMPTY";
        F.lIlllIllIIll[F.lIlllIllIlII[0]] = "UNKNOWN";
    }

        return String.valueOf(var1);
    }

    static {
        F.lllIllIIlllIll();
        F.lllIllIIlllIlI();
        SEEDED = new GameEnum40(ColorScheme.PROGRESS_COMPLETE_COLOR);
        BUILT = new GameEnum40(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        EMPTY = new GameEnum40(ColorScheme.MEDIUM_GRAY_COLOR);
        UNKNOWN = new GameEnum40(ColorScheme.MEDIUM_GRAY_COLOR);
        F[] fArray = new F[lIlllIllIlII[4]];
        fArray[F.lIlllIllIlII[1]] = SEEDED;
        fArray[F.lIlllIllIlII[2]] = BUILT;
        fArray[F.lIlllIllIlII[3]] = EMPTY;
        fArray[F.lIlllIllIlII[0]] = UNKNOWN;
        $VALUES = fArray;
    }

    private static boolean lllIllIIlllllI(int n2) {
        return n2 == 0;
    }

    public static F d(int n2) {
        int var2;
        if (!F.lllIllIIllllII(n2) || F.lllIllIIllllIl(n2, C.values().length * lIlllIllIlII[0])) {
            return UNKNOWN;
        }
        if (F.lllIllIIlllllI(var2)) {
            return EMPTY;
        }
        if (F.lllIllIIlllllI(var2 % lIlllIllIlII[0])) {
            return SEEDED;
        }
        return BUILT;
    }

    public Color V() {
        return this.color;
    }
}

