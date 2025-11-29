/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum44
extends Enum<h> {
    public static final  /* enum */ h TIN_ORE;
    private final  int oreID;
    public static final  /* enum */ h COPPER_ORE;
    
    public static final  /* enum */ h IRON_ORE;
    
    private static final  h[] $VALUES;
    private final  int[] objectID;

    static {
        h.lIIlIlIIIlIIlll();
        h.lIIlIlIIIlIIllI();
        int[] nArray = new int[llllllIIIlll[2]];
        nArray[h.llllllIIIlll[0]] = llllllIIIlll[3];
        nArray[h.llllllIIIlll[4]] = llllllIIIlll[5];
        COPPER_ORE = new GameEnum44(llllllIIIlll[1], nArray);
        int[] nArray2 = new int[llllllIIIlll[2]];
        nArray2[h.llllllIIIlll[0]] = llllllIIIlll[7];
        nArray2[h.llllllIIIlll[4]] = llllllIIIlll[8];
        TIN_ORE = new GameEnum44(llllllIIIlll[6], nArray2);
        int[] nArray3 = new int[llllllIIIlll[2]];
        nArray3[h.llllllIIIlll[0]] = llllllIIIlll[10];
        nArray3[h.llllllIIIlll[4]] = llllllIIIlll[11];
        IRON_ORE = new GameEnum44(llllllIIIlll[9], nArray3);
        h[] hArray = new h[llllllIIIlll[12]];
        hArray[h.llllllIIIlll[0]] = COPPER_ORE;
        hArray[h.llllllIIIlll[4]] = TIN_ORE;
        hArray[h.llllllIIIlll[2]] = IRON_ORE;
        $VALUES = hArray;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum44.class, string);
    }

    private static void lIIlIlIIIlIIllI() {
        llllllIIIllI = new String[llllllIIIlll[12]];
        h.llllllIIIllI[h.llllllIIIlll[0]] = "COPPER_ORE";
        h.llllllIIIllI[h.llllllIIIlll[4]] = "TIN_ORE";
        h.llllllIIIllI[h.llllllIIIlll[2]] = "IRON_ORE";
    }

    public int m() {
        return this.oreID;
    }

    private GameEnum44(int n3, int ... nArray) {
        this.oreID = n3;
        this.objectID = nArray;
    }

    public int[] l() {
        return this.objectID;
    }

    private static boolean lIIlIlIIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

