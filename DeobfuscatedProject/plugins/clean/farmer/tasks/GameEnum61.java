/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum61
extends Enum<C> {
    private final  String name;
    
    public static final  /* enum */ C MAPLE;
    private final  int itemID;
    public static final  /* enum */ C WILLOW;
    public static final  /* enum */ C MAGIC;
    public static final  /* enum */ C MAHOGANY;
    public static final  /* enum */ C OAK;
    public static final  /* enum */ C TEAK;
    private final  int logID;
    private static final  C[] $VALUES;
    public static final  /* enum */ C YEW;
    public static final  /* enum */ C REDWOOD;
    public static final  /* enum */ C NORMAL;

    public int au() {
        return this.itemID;
    }

    private static boolean lllIllIlIlIlII(int n2) {
        return n2 > 0;
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static boolean lllIllIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Nullable
    static C c(int n2) {
        int n3 = (n2 - lIlllIllllIl[0]) / lIlllIllllIl[1];
        if (!C.lllIllIlIlIlII(n2) || C.lllIllIlIlIlIl(n3, C.values().length)) {
            return null;
        }
        return C.values()[n3];
    }

    public int av() {
        return this.logID;
    }

        return String.valueOf(var1);
    }

    public String ac() {
        return this.name;
    }

    private GameEnum61(String string2, int n3, int n4) {
        this.name = string2;
        this.itemID = n3;
        this.logID = n4;
    }

    static {
        C.lllIllIlIlIIll();
        C.lllIllIlIlIIlI();
        NORMAL = new GameEnum61(lIlllIllllII[lIlllIllllIl[0]], lIlllIllllIl[3], lIlllIllllIl[4]);
        OAK = new GameEnum61(lIlllIllllII[lIlllIllllIl[1]], lIlllIllllIl[6], lIlllIllllIl[7]);
        WILLOW = new GameEnum61(lIlllIllllII[lIlllIllllIl[9]], lIlllIllllIl[10], lIlllIllllIl[11]);
        TEAK = new GameEnum61(lIlllIllllII[lIlllIllllIl[13]], lIlllIllllIl[14], lIlllIllllIl[15]);
        MAPLE = new GameEnum61(lIlllIllllII[lIlllIllllIl[17]], lIlllIllllIl[18], lIlllIllllIl[19]);
        MAHOGANY = new GameEnum61(lIlllIllllII[lIlllIllllIl[21]], lIlllIllllIl[22], lIlllIllllIl[23]);
        YEW = new GameEnum61(lIlllIllllII[lIlllIllllIl[25]], lIlllIllllIl[26], lIlllIllllIl[27]);
        MAGIC = new GameEnum61(lIlllIllllII[lIlllIllllIl[29]], lIlllIllllIl[30], lIlllIllllIl[31]);
        REDWOOD = new GameEnum61(lIlllIllllII[lIlllIllllIl[33]], lIlllIllllIl[34], lIlllIllllIl[35]);
        C[] cArray = new C[lIlllIllllIl[17]];
        cArray[C.lIlllIllllIl[2]] = NORMAL;
        cArray[C.lIlllIllllIl[0]] = OAK;
        cArray[C.lIlllIllllIl[5]] = WILLOW;
        cArray[C.lIlllIllllIl[1]] = TEAK;
        cArray[C.lIlllIllllIl[8]] = MAPLE;
        cArray[C.lIlllIllllIl[9]] = MAHOGANY;
        cArray[C.lIlllIllllIl[12]] = YEW;
        cArray[C.lIlllIllllIl[13]] = MAGIC;
        cArray[C.lIlllIllllIl[16]] = REDWOOD;
        $VALUES = cArray;
    }

    private static boolean lllIllIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIllIlIlIIlI() {
        lIlllIllllII = new String[lIlllIllllIl[36]];
        C.lIlllIllllII[C.lIlllIllllIl[2]] = "NORMAL";
        C.lIlllIllllII[C.lIlllIllllIl[0]] = "Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[5]] = "OAK";
        C.lIlllIllllII[C.lIlllIllllIl[1]] = "Oak Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[8]] = "WILLOW";
        C.lIlllIllllII[C.lIlllIllllIl[9]] = "Willow Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[12]] = "TEAK";
        C.lIlllIllllII[C.lIlllIllllIl[13]] = "Teak Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[16]] = "MAPLE";
        C.lIlllIllllII[C.lIlllIllllIl[17]] = "Maple Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[20]] = "MAHOGANY";
        C.lIlllIllllII[C.lIlllIllllIl[21]] = "Mahogany Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[24]] = "YEW";
        C.lIlllIllllII[C.lIlllIllllIl[25]] = "Yew Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[28]] = "MAGIC";
        C.lIlllIllllII[C.lIlllIllllIl[29]] = "Magic Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[32]] = "REDWOOD";
        C.lIlllIllllII[C.lIlllIllllIl[33]] = "Redwood Bird House";
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum61.class, string);
    }
}

