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

public final class GameEnum30
extends Enum<l> {
    private final  int finishedID;
    public static final  /* enum */ l MAPLE_SHIELD;
    public static final  /* enum */ l MAPLE_CROSSBOW_STOCK;
    public static final  /* enum */ l OAK_LONGBOW_U;
    public static final  /* enum */ l MAGIC_SHORTBOW_U;
    public static final  /* enum */ l YEW_SHORTBOW_U;
    public static final  /* enum */ l LONGBOW_U;
    private final  int craftingOption;
    private final  int materialID;
    public static final  /* enum */ l YEW_SHIELD;
    private static final  l[] $VALUES;
    
    public static final  /* enum */ l OAK_CROSSBOW_STOCK;
    public static final  /* enum */ l OAK_SHORTBOW_U;
    public static final  /* enum */ l ARROW_SHAFT;
    public static final  /* enum */ l MAGIC_CROSSBOW_STOCK;
    public static final  /* enum */ l YEW_CROSSBOW_STOCK;
    public static final  /* enum */ l JAVELIN_SHAFT;
    public static final  /* enum */ l OAK_SHIELD;
    
    public static final  /* enum */ l MAGIC_LONGBOW_U;
    public static final  /* enum */ l WILLOW_SHORTBOW_U;
    public static final  /* enum */ l CROSSBOW_STOCK;
    public static final  /* enum */ l YEW_LONGBOW_U;
    public static final  /* enum */ l REDWOOD_SHIELD;
    public static final  /* enum */ l SHORTBOW_U;
    public static final  /* enum */ l WILLOW_CROSSBOW_STOCK;
    public static final  /* enum */ l MAPLE_LONGBOW_U;
    public static final  /* enum */ l WILLOW_SHIELD;
    public static final  /* enum */ l MAGIC_SHIELD;
    public static final  /* enum */ l WILLOW_LONGBOW_U;
    public static final  /* enum */ l MAPLE_SHORTBOW_U;

        return String.valueOf(var1);
    }

    public boolean G() {
        return this.name().endsWith(lllIIlllllI[lllIIllllll[0]]);
    }

    public int z() {
        return this.materialID;
    }

    private static boolean lIlIlllIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum30.class, string);
    }

    private GameEnum30(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static void lIlIlllIllIlIl() {
        lllIIlllllI = new String[lllIIllllll[60]];
        l.lllIIlllllI[l.lllIIllllll[0]] = "_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[1]] = "ARROW_SHAFT";
        l.lllIIlllllI[l.lllIIllllll[4]] = "JAVELIN_SHAFT";
        l.lllIIlllllI[l.lllIIllllll[6]] = "SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[8]] = "LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[10]] = "CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[12]] = "OAK_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[15]] = "OAK_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[17]] = "OAK_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[19]] = "OAK_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[21]] = "WILLOW_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[24]] = "WILLOW_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[26]] = "WILLOW_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[28]] = "WILLOW_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[30]] = "MAPLE_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[33]] = "MAPLE_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[35]] = "MAPLE_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[37]] = "MAPLE_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[39]] = "YEW_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[42]] = "YEW_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[44]] = "YEW_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[46]] = "YEW_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[48]] = "MAGIC_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[51]] = "MAGIC_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[53]] = "MAGIC_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[55]] = "MAGIC_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[57]] = "REDWOOD_SHIELD";
    }

    static {
        l.lIlIlllIllIllI();
        l.lIlIlllIllIlIl();
        ARROW_SHAFT = new GameEnum30(lllIIllllll[2], lllIIllllll[3], lllIIllllll[1]);
        JAVELIN_SHAFT = new GameEnum30(lllIIllllll[2], lllIIllllll[5], lllIIllllll[4]);
        SHORTBOW_U = new GameEnum30(lllIIllllll[2], lllIIllllll[7], lllIIllllll[6]);
        LONGBOW_U = new GameEnum30(lllIIllllll[2], lllIIllllll[9], lllIIllllll[8]);
        CROSSBOW_STOCK = new GameEnum30(lllIIllllll[2], lllIIllllll[11], lllIIllllll[10]);
        OAK_SHORTBOW_U = new GameEnum30(lllIIllllll[13], lllIIllllll[14], lllIIllllll[4]);
        OAK_LONGBOW_U = new GameEnum30(lllIIllllll[13], lllIIllllll[16], lllIIllllll[6]);
        OAK_CROSSBOW_STOCK = new GameEnum30(lllIIllllll[13], lllIIllllll[18], lllIIllllll[8]);
        OAK_SHIELD = new GameEnum30(lllIIllllll[13], lllIIllllll[20], lllIIllllll[10]);
        WILLOW_SHORTBOW_U = new GameEnum30(lllIIllllll[22], lllIIllllll[23], lllIIllllll[4]);
        WILLOW_LONGBOW_U = new GameEnum30(lllIIllllll[22], lllIIllllll[25], lllIIllllll[6]);
        WILLOW_CROSSBOW_STOCK = new GameEnum30(lllIIllllll[22], lllIIllllll[27], lllIIllllll[8]);
        WILLOW_SHIELD = new GameEnum30(lllIIllllll[22], lllIIllllll[29], lllIIllllll[10]);
        MAPLE_SHORTBOW_U = new GameEnum30(lllIIllllll[31], lllIIllllll[32], lllIIllllll[4]);
        MAPLE_LONGBOW_U = new GameEnum30(lllIIllllll[31], lllIIllllll[34], lllIIllllll[6]);
        MAPLE_CROSSBOW_STOCK = new GameEnum30(lllIIllllll[31], lllIIllllll[36], lllIIllllll[8]);
        MAPLE_SHIELD = new GameEnum30(lllIIllllll[31], lllIIllllll[38], lllIIllllll[10]);
        YEW_SHORTBOW_U = new GameEnum30(lllIIllllll[40], lllIIllllll[41], lllIIllllll[4]);
        YEW_LONGBOW_U = new GameEnum30(lllIIllllll[40], lllIIllllll[43], lllIIllllll[6]);
        YEW_CROSSBOW_STOCK = new GameEnum30(lllIIllllll[40], lllIIllllll[45], lllIIllllll[8]);
        YEW_SHIELD = new GameEnum30(lllIIllllll[40], lllIIllllll[47], lllIIllllll[10]);
        MAGIC_SHORTBOW_U = new GameEnum30(lllIIllllll[49], lllIIllllll[50], lllIIllllll[4]);
        MAGIC_LONGBOW_U = new GameEnum30(lllIIllllll[49], lllIIllllll[52], lllIIllllll[6]);
        MAGIC_CROSSBOW_STOCK = new GameEnum30(lllIIllllll[49], lllIIllllll[54], lllIIllllll[8]);
        MAGIC_SHIELD = new GameEnum30(lllIIllllll[49], lllIIllllll[56], lllIIllllll[10]);
        REDWOOD_SHIELD = new GameEnum30(lllIIllllll[58], lllIIllllll[59], lllIIllllll[4]);
        l[] lArray = new l[lllIIllllll[57]];
        lArray[l.lllIIllllll[0]] = ARROW_SHAFT;
        lArray[l.lllIIllllll[1]] = JAVELIN_SHAFT;
        lArray[l.lllIIllllll[4]] = SHORTBOW_U;
        lArray[l.lllIIllllll[6]] = LONGBOW_U;
        lArray[l.lllIIllllll[8]] = CROSSBOW_STOCK;
        lArray[l.lllIIllllll[10]] = OAK_SHORTBOW_U;
        lArray[l.lllIIllllll[12]] = OAK_LONGBOW_U;
        lArray[l.lllIIllllll[15]] = OAK_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[17]] = OAK_SHIELD;
        lArray[l.lllIIllllll[19]] = WILLOW_SHORTBOW_U;
        lArray[l.lllIIllllll[21]] = WILLOW_LONGBOW_U;
        lArray[l.lllIIllllll[24]] = WILLOW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[26]] = WILLOW_SHIELD;
        lArray[l.lllIIllllll[28]] = MAPLE_SHORTBOW_U;
        lArray[l.lllIIllllll[30]] = MAPLE_LONGBOW_U;
        lArray[l.lllIIllllll[33]] = MAPLE_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[35]] = MAPLE_SHIELD;
        lArray[l.lllIIllllll[37]] = YEW_SHORTBOW_U;
        lArray[l.lllIIllllll[39]] = YEW_LONGBOW_U;
        lArray[l.lllIIllllll[42]] = YEW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[44]] = YEW_SHIELD;
        lArray[l.lllIIllllll[46]] = MAGIC_SHORTBOW_U;
        lArray[l.lllIIllllll[48]] = MAGIC_LONGBOW_U;
        lArray[l.lllIIllllll[51]] = MAGIC_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[53]] = MAGIC_SHIELD;
        lArray[l.lllIIllllll[55]] = REDWOOD_SHIELD;
        $VALUES = lArray;
    }

    public int C() {
        return this.craftingOption;
    }
}

