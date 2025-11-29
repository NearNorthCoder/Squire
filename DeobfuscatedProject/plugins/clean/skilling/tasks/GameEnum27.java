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

public final class GameEnum27
extends Enum<e> {
    public static final  /* enum */ e MITHRIL;
    private  int bar;
    private  int secondaryOre;
    
    private  int primaryOreRequired;
    public static final  /* enum */ e GOLD;
    
    public static final  /* enum */ e RUNITE;
    private  int productionOption;
    private  int secondaryAmountToWithdraw;
    private  int primaryAmountToWithdraw;
    private  int secondaryAmountRequired;
    public static final  /* enum */ e ADAMANT;
    public static final  /* enum */ e SILVER;
    public static final  /* enum */ e IRON;
    private static final  e[] $VALUES;
    public static final  /* enum */ e BLURITE;
    private  int primaryOre;
    public static final  /* enum */ e BRONZE;
    public static final  /* enum */ e STEEL;

    private GameEnum27(int n3, int n4, int n5, int n6) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = lllIlIIlllI[0];
        this.primaryAmountToWithdraw = n5;
        this.secondaryOre = lllIlIIlllI[1];
        this.secondaryAmountRequired = lllIlIIlllI[1];
        this.secondaryAmountToWithdraw = lllIlIIlllI[1];
        this.productionOption = n6;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum27.class, string);
    }

    public int u() {
        return this.secondaryAmountRequired;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int v() {
        return this.secondaryAmountToWithdraw;
    }

    public int s() {
        return this.primaryAmountToWithdraw;
    }

    private static boolean lIlIlllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public int r() {
        return this.primaryOreRequired;
    }

    public int q() {
        return this.primaryOre;
    }

    public int p() {
        return this.bar;
    }

    private GameEnum27(int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = n5;
        this.primaryAmountToWithdraw = n6;
        this.secondaryOre = n7;
        this.secondaryAmountToWithdraw = n8;
        this.secondaryAmountRequired = n9;
        this.productionOption = n10;
    }

    private static void lIlIlllllIIIII() {
        lllIlIIllIl = new String[lllIlIIlllI[18]];
        e.lllIlIIllIl[e.lllIlIIlllI[2]] = "BRONZE";
        e.lllIlIIllIl[e.lllIlIIlllI[0]] = "BLURITE";
        e.lllIlIIllIl[e.lllIlIIlllI[10]] = "IRON";
        e.lllIlIIllIl[e.lllIlIIlllI[13]] = "SILVER";
        e.lllIlIIllIl[e.lllIlIIlllI[16]] = "STEEL";
        e.lllIlIIllIl[e.lllIlIIlllI[21]] = "GOLD";
        e.lllIlIIllIl[e.lllIlIIlllI[24]] = "MITHRIL";
        e.lllIlIIllIl[e.lllIlIIlllI[29]] = "ADAMANT";
        e.lllIlIIllIl[e.lllIlIIlllI[27]] = "RUNITE";
    }

    public int w() {
        return this.productionOption;
    }

    static {
        e.lIlIlllllIIIIl();
        e.lIlIlllllIIIII();
        BRONZE = new GameEnum27(lllIlIIlllI[3], lllIlIIlllI[4], lllIlIIlllI[0], lllIlIIlllI[5], lllIlIIlllI[6], lllIlIIlllI[5], lllIlIIlllI[0], lllIlIIlllI[0]);
        BLURITE = new GameEnum27(lllIlIIlllI[7], lllIlIIlllI[8], lllIlIIlllI[9], lllIlIIlllI[10]);
        IRON = new GameEnum27(lllIlIIlllI[11], lllIlIIlllI[12], lllIlIIlllI[9], lllIlIIlllI[13]);
        SILVER = new GameEnum27(lllIlIIlllI[14], lllIlIIlllI[15], lllIlIIlllI[9], lllIlIIlllI[16]);
        STEEL = new GameEnum27(lllIlIIlllI[17], lllIlIIlllI[12], lllIlIIlllI[0], lllIlIIlllI[18], lllIlIIlllI[19], lllIlIIlllI[20], lllIlIIlllI[10], lllIlIIlllI[21]);
        GOLD = new GameEnum27(lllIlIIlllI[22], lllIlIIlllI[23], lllIlIIlllI[9], lllIlIIlllI[24]);
        MITHRIL = new GameEnum27(lllIlIIlllI[25], lllIlIIlllI[26], lllIlIIlllI[0], lllIlIIlllI[27], lllIlIIlllI[19], lllIlIIlllI[28], lllIlIIlllI[16], lllIlIIlllI[29]);
        ADAMANT = new GameEnum27(lllIlIIlllI[30], lllIlIIlllI[31], lllIlIIlllI[0], lllIlIIlllI[16], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[24], lllIlIIlllI[27]);
        RUNITE = new GameEnum27(lllIlIIlllI[33], lllIlIIlllI[34], lllIlIIlllI[0], lllIlIIlllI[13], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[27], lllIlIIlllI[18]);
        e[] eArray = new e[lllIlIIlllI[18]];
        eArray[e.lllIlIIlllI[2]] = BRONZE;
        eArray[e.lllIlIIlllI[0]] = BLURITE;
        eArray[e.lllIlIIlllI[10]] = IRON;
        eArray[e.lllIlIIlllI[13]] = SILVER;
        eArray[e.lllIlIIlllI[16]] = STEEL;
        eArray[e.lllIlIIlllI[21]] = GOLD;
        eArray[e.lllIlIIlllI[24]] = MITHRIL;
        eArray[e.lllIlIIlllI[29]] = ADAMANT;
        eArray[e.lllIlIIlllI[27]] = RUNITE;
        $VALUES = eArray;
    }

    public int t() {
        return this.secondaryOre;
    }
}

