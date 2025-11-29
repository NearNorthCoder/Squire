/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum23
extends Enum<c> {
    private final  int requiredToMake;
    public static final  /* enum */ c BLUE_DHIDE_CHAPS;
    
    public static final  /* enum */ c RED_DHIDE_VAMBRACES;
    private final  String name;
    private final  int level;
    public static final  /* enum */ c GREEN_DHIDE_BODY;
    
    public static final  /* enum */ c BLACK_DHIDE_CHAPS;
    private static final  c[] $VALUES;
    private final  int amountToWithdraw;
    public static final  /* enum */ c RED_DHIDE_CHAPS;
    public static final  /* enum */ c BLUE_DHIDE_BODY;
    public static final  /* enum */ c GREEN_DHIDE_VAMBRACES;
    public static final  /* enum */ c BLACK_DHIDE_BODY;
    public static final  /* enum */ c GREEN_DHIDE_CHAPS;
    public static final  /* enum */ c BLACK_DHIDE_VAMBRACES;
    public static final  /* enum */ c BLUE_DHIDE_VAMBRACES;
    public static final  /* enum */ c RED_DHIDE_BODY;
    private final  int materials;

    public int m() {
        return this.amountToWithdraw;
    }

    public int l() {
        return this.materials;
    }

    private static boolean lIlIllIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum23(String string2, int n3, int n4, int n5, int n6) {
        this.name = string2;
        this.level = n3;
        this.materials = n4;
        this.amountToWithdraw = n5;
        this.requiredToMake = n6;
    }

    public int n() {
        return this.requiredToMake;
    }

    static {
        c.lIlIllIIllIlIl();
        c.lIlIllIIllIlII();
        GREEN_DHIDE_VAMBRACES = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[1]], lllIIIlIIIl[2], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        GREEN_DHIDE_CHAPS = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[6]], lllIIIlIIIl[7], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        GREEN_DHIDE_BODY = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[9]], lllIIIlIIIl[10], lllIIIlIIIl[3], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLUE_DHIDE_VAMBRACES = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[13]], lllIIIlIIIl[14], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLUE_DHIDE_CHAPS = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[17]], lllIIIlIIIl[18], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLUE_DHIDE_BODY = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[20]], lllIIIlIIIl[10], lllIIIlIIIl[15], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        RED_DHIDE_VAMBRACES = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[22]], lllIIIlIIIl[23], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        RED_DHIDE_CHAPS = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[26]], lllIIIlIIIl[27], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        RED_DHIDE_BODY = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[29]], lllIIIlIIIl[30], lllIIIlIIIl[24], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLACK_DHIDE_VAMBRACES = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[32]], lllIIIlIIIl[33], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLACK_DHIDE_CHAPS = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[36]], lllIIIlIIIl[37], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLACK_DHIDE_BODY = new GameEnum23(lllIIIlIIII[lllIIIlIIIl[39]], lllIIIlIIIl[40], lllIIIlIIIl[34], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        c[] cArray = new c[lllIIIlIIIl[21]];
        cArray[c.lllIIIlIIIl[0]] = GREEN_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[1]] = GREEN_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[5]] = GREEN_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[6]] = BLUE_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[8]] = BLUE_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[9]] = BLUE_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[12]] = RED_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[13]] = RED_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[16]] = RED_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[17]] = BLACK_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[19]] = BLACK_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[20]] = BLACK_DHIDE_BODY;
        $VALUES = cArray;
    }

        return String.valueOf(var1);
    }

    private static void lIlIllIIllIlII() {
        lllIIIlIIII = new String[lllIIIlIIIl[11]];
        c.lllIIIlIIII[c.lllIIIlIIIl[0]] = "GREEN_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[1]] = "Green d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[5]] = "GREEN_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[6]] = "Green d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[8]] = "GREEN_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[9]] = "Green d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[12]] = "BLUE_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[13]] = "Blue d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[16]] = "BLUE_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[17]] = "Blue d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[19]] = "BLUE_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[20]] = "Blue d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[21]] = "RED_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[22]] = "Red d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[25]] = "RED_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[26]] = "Red d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[28]] = "RED_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[29]] = "Red d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[31]] = "BLACK_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[32]] = "Black d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[35]] = "BLACK_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[36]] = "Black d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[38]] = "BLACK_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[39]] = "Black d'hide body";
    }

    public String j() {
        return this.name;
    }

    public int k() {
        return this.level;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

}

