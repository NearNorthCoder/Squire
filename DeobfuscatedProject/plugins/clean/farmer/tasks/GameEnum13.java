/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package gg.squire.farmer.tasks;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;

public final class GameEnum13
extends Enum<n> {
    public static final  /* enum */ n FILLING;
    public static final  /* enum */ n EMPTY;
    private static final  n[] $VALUES;
    private final  Color color;
    public static final  /* enum */ n DEAD;
    
    public static final  /* enum */ n DISEASED;
    
    public static final  /* enum */ n HARVESTABLE;
    public static final  /* enum */ n GROWING;

    private static void lllIllIIlIlIII() {
        lIlllIlIlIll = new String[lIlllIlIllII[6]];
        n.lIlllIlIlIll[n.lIlllIlIllII[0]] = "HARVESTABLE";
        n.lIlllIlIlIll[n.lIlllIlIllII[1]] = "GROWING";
        n.lIlllIlIlIll[n.lIlllIlIllII[2]] = "DISEASED";
        n.lIlllIlIlIll[n.lIlllIlIllII[3]] = "DEAD";
        n.lIlllIlIlIll[n.lIlllIlIllII[4]] = "EMPTY";
        n.lIlllIlIlIll[n.lIlllIlIllII[5]] = "FILLING";
    }

    static {
        n.lllIllIIlIlIIl();
        n.lllIllIIlIlIII();
        HARVESTABLE = new GameEnum13(ColorScheme.PROGRESS_COMPLETE_COLOR);
        GROWING = new GameEnum13(ColorScheme.PROGRESS_COMPLETE_COLOR);
        DISEASED = new GameEnum13(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        DEAD = new GameEnum13(ColorScheme.PROGRESS_ERROR_COLOR);
        EMPTY = new GameEnum13(ColorScheme.MEDIUM_GRAY_COLOR);
        FILLING = new GameEnum13(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        n[] nArray = new n[lIlllIlIllII[6]];
        nArray[n.lIlllIlIllII[0]] = HARVESTABLE;
        nArray[n.lIlllIlIllII[1]] = GROWING;
        nArray[n.lIlllIlIllII[2]] = DISEASED;
        nArray[n.lIlllIlIllII[3]] = DEAD;
        nArray[n.lIlllIlIllII[4]] = EMPTY;
        nArray[n.lIlllIlIllII[5]] = FILLING;
        $VALUES = nArray;
    }

    public Color V() {
        return this.color;
    }

    private GameEnum13(Color color) {
        this.color = color;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static boolean lllIllIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

        return String.valueOf(var1);
    }
}

