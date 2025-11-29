/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.woodcutting.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum6
extends Enum<a> {
    public static final  /* enum */ a MAHOGANY;
    public static final  /* enum */ a TEAK;
    private final  int logId;
    public static final  /* enum */ a WILLOW;
    
    public static final  /* enum */ a OAK;
    public static final  /* enum */ a REDWOOD;
    private static final  a[] $VALUES;
    public static final  /* enum */ a MAGIC;
    public static final  /* enum */ a YEW;
    public static final  /* enum */ a MAPLE;
    public static final  /* enum */ a BLISTERWOOD;
    
    private final  String treeName;
    public static final  /* enum */ a TREE;

        return String.valueOf(var1);
    }

    public int s() {
        return this.logId;
    }

    static {
        a.llIIIlIIIlIIlll();
        a.llIIIlIIIlIIlIl();
        TREE = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[1]], lIllIIIIlIlII[2]);
        OAK = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[4]], lIllIIIIlIlII[5]);
        WILLOW = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[7]], lIllIIIIlIlII[8]);
        TEAK = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[10]], lIllIIIIlIlII[11]);
        MAPLE = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[13]], lIllIIIIlIlII[14]);
        MAHOGANY = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[16]], lIllIIIIlIlII[17]);
        YEW = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[19]], lIllIIIIlIlII[20]);
        BLISTERWOOD = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[22]], lIllIIIIlIlII[23]);
        MAGIC = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[25]], lIllIIIIlIlII[26]);
        REDWOOD = new GameEnum6(lIllIIIIIllll[lIllIIIIlIlII[28]], lIllIIIIlIlII[29]);
        a[] aArray = new a[lIllIIIIlIlII[15]];
        aArray[a.lIllIIIIlIlII[0]] = TREE;
        aArray[a.lIllIIIIlIlII[1]] = OAK;
        aArray[a.lIllIIIIlIlII[3]] = WILLOW;
        aArray[a.lIllIIIIlIlII[4]] = TEAK;
        aArray[a.lIllIIIIlIlII[6]] = MAPLE;
        aArray[a.lIllIIIIlIlII[7]] = MAHOGANY;
        aArray[a.lIllIIIIlIlII[9]] = YEW;
        aArray[a.lIllIIIIlIlII[10]] = BLISTERWOOD;
        aArray[a.lIllIIIIlIlII[12]] = MAGIC;
        aArray[a.lIllIIIIlIlII[13]] = REDWOOD;
        $VALUES = aArray;
    }

    private static void llIIIlIIIlIIlIl() {
        lIllIIIIIllll = new String[lIllIIIIlIlII[30]];
        a.lIllIIIIIllll[a.lIllIIIIlIlII[0]] = "TREE";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[1]] = "Tree";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[3]] = "OAK";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[4]] = "Oak";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[6]] = "WILLOW";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[7]] = "Willow";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[9]] = "TEAK";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[10]] = "Teak";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[12]] = "MAPLE";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[13]] = "Maple";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[15]] = "MAHOGANY";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[16]] = "Mahogany";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[18]] = "YEW";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[19]] = "Yew";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[21]] = "BLISTERWOOD";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[22]] = "Blisterwood";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[24]] = "MAGIC";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[25]] = "Magic";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[27]] = "REDWOOD";
        a.lIllIIIIIllll[a.lIllIIIIlIlII[28]] = "Redwood";
    }

    public String r() {
        return this.treeName;
    }

    private GameEnum6(String string2, int n2) {
        this.treeName = string2;
        this.logId = n2;
    }

    private static boolean llIIIlIIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

}

