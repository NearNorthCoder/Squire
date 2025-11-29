/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.barrows.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<e> {
    private final  String npcName;
    private static final  e[] $VALUES;
    public static final  /* enum */ e CRYPT_SPIDER;
    
    private final  int potential;
    public static final  /* enum */ e CRYPT_RAT;
    public static final  /* enum */ e GIANT_CRYPT_SPIDER;
    public static final  /* enum */ e GIANT_CRYPT_RAT;
    public static final  /* enum */ e SKELETON;
    
    public static final  /* enum */ e BLOODWORM;

    private GameEnum(int n3, String string2) {
        this.potential = n3;
        this.npcName = string2;
    }

    public String H() {
        return this.npcName;
    }

    private static boolean lIllIIllllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public int G() {
        return this.potential;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    static {
        e.lIllIIllllIlII();
        e.lIllIIllllIIll();
        CRYPT_RAT = new GameEnum(llllIIIllIl[1], llllIIIllII[llllIIIllIl[2]]);
        BLOODWORM = new GameEnum(llllIIIllIl[4], llllIIIllII[llllIIIllIl[5]]);
        CRYPT_SPIDER = new GameEnum(llllIIIllIl[7], llllIIIllII[llllIIIllIl[8]]);
        GIANT_CRYPT_RAT = new GameEnum(llllIIIllIl[10], llllIIIllII[llllIIIllIl[11]]);
        SKELETON = new GameEnum(llllIIIllIl[13], llllIIIllII[llllIIIllIl[14]]);
        GIANT_CRYPT_SPIDER = new GameEnum(llllIIIllIl[16], llllIIIllII[llllIIIllIl[17]]);
        e[] eArray = new e[llllIIIllIl[9]];
        eArray[e.llllIIIllIl[0]] = CRYPT_RAT;
        eArray[e.llllIIIllIl[2]] = BLOODWORM;
        eArray[e.llllIIIllIl[3]] = CRYPT_SPIDER;
        eArray[e.llllIIIllIl[5]] = GIANT_CRYPT_RAT;
        eArray[e.llllIIIllIl[6]] = SKELETON;
        eArray[e.llllIIIllIl[8]] = GIANT_CRYPT_SPIDER;
        $VALUES = eArray;
    }

    private static void lIllIIllllIIll() {
        llllIIIllII = new String[llllIIIllIl[18]];
        e.llllIIIllII[e.llllIIIllIl[0]] = "CRYPT_RAT";
        e.llllIIIllII[e.llllIIIllIl[2]] = "Crypt rat";
        e.llllIIIllII[e.llllIIIllIl[3]] = "BLOODWORM";
        e.llllIIIllII[e.llllIIIllIl[5]] = "Bloodworm";
        e.llllIIIllII[e.llllIIIllIl[6]] = "CRYPT_SPIDER";
        e.llllIIIllII[e.llllIIIllIl[8]] = "Crypt spider";
        e.llllIIIllII[e.llllIIIllIl[9]] = "GIANT_CRYPT_RAT";
        e.llllIIIllII[e.llllIIIllIl[11]] = "Giant crypt rat";
        e.llllIIIllII[e.llllIIIllIl[12]] = "SKELETON";
        e.llllIIIllII[e.llllIIIllIl[14]] = "Skeleton";
        e.llllIIIllII[e.llllIIIllIl[15]] = "GIANT_CRYPT_SPIDER";
        e.llllIIIllII[e.llllIIIllIl[17]] = "Giant crypt spider";
    }
}

