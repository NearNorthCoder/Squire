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

public final class GameEnum23
extends Enum<D> {
    private final  String log;
    private final  String tree;
    public static final  /* enum */ D YEW;
    public static final  /* enum */ D NORMAL;
    private static final  D[] $VALUES;
    public static final  /* enum */ D OAK;

    public static final  /* enum */ D TEAK;
    public static final  /* enum */ D MAPLE;
    public static final  /* enum */ D WILLOW;

    public String Y() {
        return this.log;
    }

    public String Z() {
        return this.tree;
    }

    public static D[] values() {
        return (D[])$VALUES.clone();
    }

    private static void lIllllIIlll() {
        llIllIIII = new String[llIllIIIl[18]];
        D.llIllIIII[D.llIllIIIl[0]] = "NORMAL";
        D.llIllIIII[D.llIllIIIl[1]] = "Tree";
        D.llIllIIII[D.llIllIIIl[2]] = "Logs";
        D.llIllIIII[D.llIllIIIl[3]] = "OAK";
        D.llIllIIII[D.llIllIIIl[4]] = "Oak tree";
        D.llIllIIII[D.llIllIIIl[5]] = "Oak logs";
        D.llIllIIII[D.llIllIIIl[6]] = "WILLOW";
        D.llIllIIII[D.llIllIIIl[7]] = "Willow tree";
        D.llIllIIII[D.llIllIIIl[8]] = "Willow logs";
        D.llIllIIII[D.llIllIIIl[9]] = "MAPLE";
        D.llIllIIII[D.llIllIIIl[10]] = "Maple tree";
        D.llIllIIII[D.llIllIIIl[11]] = "Maple logs";
        D.llIllIIII[D.llIllIIIl[12]] = "TEAK";
        D.llIllIIII[D.llIllIIIl[13]] = "Teak tree";
        D.llIllIIII[D.llIllIIIl[14]] = "Teak logs";
        D.llIllIIII[D.llIllIIIl[15]] = "YEW";
        D.llIllIIII[D.llIllIIIl[16]] = "Yew tree";
        D.llIllIIII[D.llIllIIIl[17]] = "Yew logs";
    }

    public String toString() {
        return this.tree;
    }

    private static boolean lIllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        D.lIllllIlIII();
        D.lIllllIIlll();
        NORMAL = new GameEnum23(llIllIIII[llIllIIIl[1]], llIllIIII[llIllIIIl[2]]);
        OAK = new GameEnum23(llIllIIII[llIllIIIl[4]], llIllIIII[llIllIIIl[5]]);
        WILLOW = new GameEnum23(llIllIIII[llIllIIIl[7]], llIllIIII[llIllIIIl[8]]);
        MAPLE = new GameEnum23(llIllIIII[llIllIIIl[10]], llIllIIII[llIllIIIl[11]]);
        TEAK = new GameEnum23(llIllIIII[llIllIIIl[13]], llIllIIII[llIllIIIl[14]]);
        YEW = new GameEnum23(llIllIIII[llIllIIIl[16]], llIllIIII[llIllIIIl[17]]);
        D[] dArray = new D[llIllIIIl[6]];
        dArray[D.llIllIIIl[0]] = NORMAL;
        dArray[D.llIllIIIl[1]] = OAK;
        dArray[D.llIllIIIl[2]] = WILLOW;
        dArray[D.llIllIIIl[3]] = MAPLE;
        dArray[D.llIllIIIl[4]] = TEAK;
        dArray[D.llIllIIIl[5]] = YEW;
        $VALUES = dArray;
    }

    public static D valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

        return String.valueOf(lIlIllllIIIIlIl);
    }

    private GameEnum23(String string2, String string3) {
        this.log = string3;
        this.tree = string2;
    }
}

