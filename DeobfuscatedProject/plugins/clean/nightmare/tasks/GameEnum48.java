/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum48
extends Enum<y> {
    public static final  /* enum */ y CRYSTAL_HALBERD;
    public static final  /* enum */ y NONE;
    private static final  y[] $VALUES;
    public static final  /* enum */ y OSMUMTENS_FANG;
    public static final  /* enum */ y ARMADYL_GODSWORD;
    private final  boolean twoHanded;
    public static final  /* enum */ y BANDOS_GODSWORD;
    public static final  /* enum */ y ANCIENT_GODSWORD;
    public static final  /* enum */ y DRAGON_MACE;
    private final  int itemID;
    private final  int specAmount;
    
    public static final  /* enum */ y VOID_WAKER;
    public static final  /* enum */ y DRAGON_WARHAMMER;
    public static final  /* enum */ y GRANITE_MAUL;
    public static final  /* enum */ y DRAGON_CLAWS;
    public static final  /* enum */ y SARADOMIN_GODSWORD;

    static {
        y.lIIIllIlllIlIll();
        y.lIIIllIlllIIlII();
        GRANITE_MAUL = new GameEnum48(lllIlllIlIII[1], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_CLAWS = new GameEnum48(lllIlllIlIII[4], lllIlllIlIII[2], lllIlllIlIII[3]);
        VOID_WAKER = new GameEnum48(lllIlllIlIII[6], lllIlllIlIII[2], lllIlllIlIII[0]);
        ANCIENT_GODSWORD = new GameEnum48(lllIlllIlIII[8], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_MACE = new GameEnum48(lllIlllIlIII[10], lllIlllIlIII[11], lllIlllIlIII[0]);
        OSMUMTENS_FANG = new GameEnum48(lllIlllIlIII[13], lllIlllIlIII[11], lllIlllIlIII[0]);
        SARADOMIN_GODSWORD = new GameEnum48(lllIlllIlIII[15], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_WARHAMMER = new GameEnum48(lllIlllIlIII[17], lllIlllIlIII[2], lllIlllIlIII[0]);
        ARMADYL_GODSWORD = new GameEnum48(lllIlllIlIII[19], lllIlllIlIII[2], lllIlllIlIII[3]);
        BANDOS_GODSWORD = new GameEnum48(lllIlllIlIII[21], lllIlllIlIII[2], lllIlllIlIII[3]);
        CRYSTAL_HALBERD = new GameEnum48(lllIlllIlIII[23], lllIlllIlIII[24], lllIlllIlIII[3]);
        NONE = new GameEnum48(lllIlllIlIII[26], lllIlllIlIII[0], lllIlllIlIII[0]);
        y[] yArray = new y[lllIlllIlIII[27]];
        yArray[y.lllIlllIlIII[0]] = GRANITE_MAUL;
        yArray[y.lllIlllIlIII[3]] = DRAGON_CLAWS;
        yArray[y.lllIlllIlIII[5]] = VOID_WAKER;
        yArray[y.lllIlllIlIII[7]] = ANCIENT_GODSWORD;
        yArray[y.lllIlllIlIII[9]] = DRAGON_MACE;
        yArray[y.lllIlllIlIII[12]] = OSMUMTENS_FANG;
        yArray[y.lllIlllIlIII[14]] = SARADOMIN_GODSWORD;
        yArray[y.lllIlllIlIII[16]] = DRAGON_WARHAMMER;
        yArray[y.lllIlllIlIII[18]] = ARMADYL_GODSWORD;
        yArray[y.lllIlllIlIII[20]] = BANDOS_GODSWORD;
        yArray[y.lllIlllIlIII[22]] = CRYSTAL_HALBERD;
        yArray[y.lllIlllIlIII[25]] = NONE;
        $VALUES = yArray;
    }

    private static void lIIIllIlllIIlII() {
        lllIlllIIIll = new String[lllIlllIlIII[27]];
        y.lllIlllIIIll[y.lllIlllIlIII[0]] = "GRANITE_MAUL";
        y.lllIlllIIIll[y.lllIlllIlIII[3]] = "DRAGON_CLAWS";
        y.lllIlllIIIll[y.lllIlllIlIII[5]] = "VOID_WAKER";
        y.lllIlllIIIll[y.lllIlllIlIII[7]] = "ANCIENT_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[9]] = "DRAGON_MACE";
        y.lllIlllIIIll[y.lllIlllIlIII[12]] = "OSMUMTENS_FANG";
        y.lllIlllIIIll[y.lllIlllIlIII[14]] = "SARADOMIN_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[16]] = "DRAGON_WARHAMMER";
        y.lllIlllIIIll[y.lllIlllIlIII[18]] = "ARMADYL_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[20]] = "BANDOS_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[22]] = "CRYSTAL_HALBERD";
        y.lllIlllIIIll[y.lllIlllIlIII[25]] = "NONE";
    }

    private GameEnum48(int n3, int n4, boolean bl) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl;
    }

    public int bH() {
        return this.itemID;
    }

    private static boolean lIIIllIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bR() {
        return this.twoHanded;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(GameEnum48.class, string);
    }

        return String.valueOf(var1);
    }

    public int bQ() {
        return this.specAmount;
    }
}

