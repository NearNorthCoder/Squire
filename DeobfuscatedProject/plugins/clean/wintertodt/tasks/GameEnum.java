/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.wintertodt.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c STEEL;

    public static final  /* enum */ c DRAGON;
    public static final  /* enum */ c BLACK;
    public static final  /* enum */ c ADAMANT;
    private final  int ItemID;
    private final  String name;
    public static final  /* enum */ c BRONZE;
    private final  int attackLevelRequired;
    public static final  /* enum */ c RUNE;
    private final  int woodcuttingLevelRequired;
    private static final  c[] $VALUES;
    public static final  /* enum */ c MITHRIL;
    public static final  /* enum */ c IRON;

    private GameEnum(String string2, int n3, int n4, int n5) {
        this.name = string2;
        this.attackLevelRequired = n3;
        this.woodcuttingLevelRequired = n4;
        this.ItemID = n5;
    }

    static {
        c.llIIIIlllIIIIll();
        c.llIIIIllIllllll();
        BRONZE = new GameEnum(lIlIlllllIllI[lIlIllllllIll[1]], lIlIllllllIll[1], lIlIllllllIll[1], lIlIllllllIll[2]);
        IRON = new GameEnum(lIlIlllllIllI[lIlIllllllIll[4]], lIlIllllllIll[1], lIlIllllllIll[3], lIlIllllllIll[5]);
        STEEL = new GameEnum(lIlIlllllIllI[lIlIllllllIll[7]], lIlIllllllIll[8], lIlIllllllIll[4], lIlIllllllIll[9]);
        BLACK = new GameEnum(lIlIlllllIllI[lIlIllllllIll[10]], lIlIllllllIll[8], lIlIllllllIll[6], lIlIllllllIll[11]);
        MITHRIL = new GameEnum(lIlIlllllIllI[lIlIllllllIll[13]], lIlIllllllIll[14], lIlIllllllIll[7], lIlIllllllIll[15]);
        ADAMANT = new GameEnum(lIlIlllllIllI[lIlIllllllIll[17]], lIlIllllllIll[18], lIlIllllllIll[8], lIlIllllllIll[19]);
        RUNE = new GameEnum(lIlIlllllIllI[lIlIllllllIll[21]], lIlIllllllIll[22], lIlIllllllIll[10], lIlIllllllIll[23]);
        DRAGON = new GameEnum(lIlIlllllIllI[lIlIllllllIll[25]], lIlIllllllIll[26], lIlIllllllIll[12], lIlIllllllIll[27]);
        c[] cArray = new c[lIlIllllllIll[12]];
        cArray[c.lIlIllllllIll[0]] = BRONZE;
        cArray[c.lIlIllllllIll[1]] = IRON;
        cArray[c.lIlIllllllIll[3]] = STEEL;
        cArray[c.lIlIllllllIll[4]] = BLACK;
        cArray[c.lIlIllllllIll[6]] = MITHRIL;
        cArray[c.lIlIllllllIll[7]] = ADAMANT;
        cArray[c.lIlIllllllIll[8]] = RUNE;
        cArray[c.lIlIllllllIll[10]] = DRAGON;
        $VALUES = cArray;
    }

    public String v() {
        return this.name;
    }

    private static boolean llIIIIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIIIllIllllll() {
        lIlIlllllIllI = new String[lIlIllllllIll[28]];
        c.lIlIlllllIllI[c.lIlIllllllIll[0]] = "BRONZE";
        c.lIlIlllllIllI[c.lIlIllllllIll[1]] = "Bronze";
        c.lIlIlllllIllI[c.lIlIllllllIll[3]] = "IRON";
        c.lIlIlllllIllI[c.lIlIllllllIll[4]] = "Iron";
        c.lIlIlllllIllI[c.lIlIllllllIll[6]] = "STEEL";
        c.lIlIlllllIllI[c.lIlIllllllIll[7]] = "Steel";
        c.lIlIlllllIllI[c.lIlIllllllIll[8]] = "BLACK";
        c.lIlIlllllIllI[c.lIlIllllllIll[10]] = "Black";
        c.lIlIlllllIllI[c.lIlIllllllIll[12]] = "MITHRIL";
        c.lIlIlllllIllI[c.lIlIllllllIll[13]] = "Mithril";
        c.lIlIlllllIllI[c.lIlIllllllIll[16]] = "ADAMANT";
        c.lIlIlllllIllI[c.lIlIllllllIll[17]] = "Adamant";
        c.lIlIlllllIllI[c.lIlIllllllIll[20]] = "RUNE";
        c.lIlIlllllIllI[c.lIlIllllllIll[21]] = "Rune";
        c.lIlIlllllIllI[c.lIlIllllllIll[24]] = "DRAGON";
        c.lIlIlllllIllI[c.lIlIllllllIll[25]] = "Dragon";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public int y() {
        return this.ItemID;
    }

    public int w() {
        return this.attackLevelRequired;
    }

    public int x() {
        return this.woodcuttingLevelRequired;
    }
}

