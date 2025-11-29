/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class GameEnum23
extends Enum<f> {
    public static final  /* enum */ f DIVINE_POTION;
    public static final  /* enum */ f RANGE_POTION;

    private static final  f[] $VALUES;
    private final  Predicate<Item> test;

    public Predicate<Item> u() {
        return this.test;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

    private static boolean lIlIlllIIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        f.lIlIlllIIIlIlII();
        f.lIlIlllIIIlIIll();
        int[] nArray = new int[lIIlIlllllIII[2]];
        nArray[f.lIIlIlllllIII[1]] = lIIlIlllllIII[3];
        nArray[f.lIIlIlllllIII[0]] = lIIlIlllllIII[4];
        nArray[f.lIIlIlllllIII[5]] = lIIlIlllllIII[6];
        nArray[f.lIIlIlllllIII[7]] = lIIlIlllllIII[8];
        RANGE_POTION = new GameEnum23(nArray);
        int[] nArray2 = new int[lIIlIlllllIII[2]];
        nArray2[f.lIIlIlllllIII[1]] = lIIlIlllllIII[9];
        nArray2[f.lIIlIlllllIII[0]] = lIIlIlllllIII[10];
        nArray2[f.lIIlIlllllIII[5]] = lIIlIlllllIII[11];
        nArray2[f.lIIlIlllllIII[7]] = lIIlIlllllIII[12];
        DIVINE_POTION = new GameEnum23(nArray2);
        f[] fArray = new f[lIIlIlllllIII[5]];
        fArray[f.lIIlIlllllIII[1]] = RANGE_POTION;
        fArray[f.lIIlIlllllIII[0]] = DIVINE_POTION;
        $VALUES = fArray;
    }

    private static void lIlIlllIIIlIIll() {
        lIIlIllllIlll = new String[lIIlIlllllIII[5]];
        f.lIIlIllllIlll[f.lIIlIlllllIII[1]] = "RANGE_POTION";
        f.lIIlIllllIlll[f.lIIlIlllllIII[0]] = "DIVINE_POTION";
    }

    private GameEnum23(int ... nArray) {
        this.test = item -> IntStream.of(nArray).anyMatch(n2 -> {
            boolean bl;
            if (f.lIlIlllIIIlIlIl(n2, item.getId())) {
                bl = lIIlIlllllIII[0];

                if (-1 > ((0x26 ^ 0x79) & ~(0x64 ^ 0x3B))) {
                    return false;
                }
            } else {
                bl = lIIlIlllllIII[1];
            }
            return bl;
        });
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }
}

