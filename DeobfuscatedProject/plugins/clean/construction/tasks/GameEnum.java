/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<a> {
    private final  int plankCost;
    public static final  /* enum */ a TEAK;
    public static final  /* enum */ a NORMAL;
    public static final  /* enum */ a MAHOGANY;
    private final  int plankID;
    private final  int itemID;
    
    public static final  /* enum */ a OAK;
    private static final  a[] $VALUES;

    private static boolean lIIlIIlllIlllll(int n, int n2) {
        return n < n2;
    }

    static {
        a.lIIlIIlllIllllI();
        a.lIIlIIlllIlllIl();
        NORMAL = new GameEnum(lllllIllllIl[1], lllllIllllIl[2], lllllIllllIl[3]);
        OAK = new GameEnum(lllllIllllIl[5], lllllIllllIl[6], lllllIllllIl[7]);
        TEAK = new GameEnum(lllllIllllIl[9], lllllIllllIl[10], lllllIllllIl[11]);
        MAHOGANY = new GameEnum(lllllIllllIl[13], lllllIllllIl[14], lllllIllllIl[15]);
        a[] aArray = new a[lllllIllllIl[16]];
        aArray[a.lllllIllllIl[0]] = NORMAL;
        aArray[a.lllllIllllIl[4]] = OAK;
        aArray[a.lllllIllllIl[8]] = TEAK;
        aArray[a.lllllIllllIl[12]] = MAHOGANY;
        $VALUES = aArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void lIIlIIlllIlllIl() {
        lllllIllllII = new String[lllllIllllIl[16]];
        a.lllllIllllII[a.lllllIllllIl[0]] = "NORMAL";
        a.lllllIllllII[a.lllllIllllIl[4]] = "OAK";
        a.lllllIllllII[a.lllllIllllIl[8]] = "TEAK";
        a.lllllIllllII[a.lllllIllllIl[12]] = "MAHOGANY";
    }

    private GameEnum(int n2, int n3, int n4) {
        this.itemID = n2;
        this.plankCost = n3;
        this.plankID = n4;
    }

    public int e() {
        return this.plankCost;
    }

    public int f() {
        return this.plankID;
    }

        return String.valueOf(var1);
    }

    public int d() {
        return this.itemID;
    }
}

