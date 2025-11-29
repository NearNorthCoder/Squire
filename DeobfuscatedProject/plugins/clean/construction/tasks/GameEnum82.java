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

public final class GameEnum82
extends Enum<bG> {
    private final  boolean twoHanded;
    public static final  /* enum */ bG DRAGON_WARHAMMER;
    public static final  /* enum */ bG SARADOMIN_BLESSED_SWORD;

    public static final  /* enum */ bG DRAGON_LONGSWORD;
    private static final  bG[] $VALUES;
    public static final  /* enum */ bG BANDOS_GODSWORD;
    public static final  /* enum */ bG ARMADYL_GODSWORD;
    private final  int itemID;
    public static final  /* enum */ bG SARADOMIN_GODSWORD;
    public static final  /* enum */ bG DRAGON_DAGGER_PP;
    public static final  /* enum */ bG DRAGON_DAGGER;
    public static final  /* enum */ bG CRYSTAL_HALBERD;
    public static final  /* enum */ bG DRAGON_HALBERD;
    public static final  /* enum */ bG SARADOMIN_SWORD;
    public static final  /* enum */ bG DRAGON_DAGGER_P;
    public static final  /* enum */ bG DRAGON_BATTLEAXE;
    public static final  /* enum */ bG DRAGON_DAGGER_PPP;
    public static final  /* enum */ bG DRAGON_CLAWS;
    private final  int specAmount;
    public static final  /* enum */ bG DRAGON_MACE;

    public static bG[] values() {
        return (bG[])$VALUES.clone();
    }

    private static void llIlIIllll() {
        llllIIll = new String[llllIlII[37]];
        bG.llllIIll[bG.llllIlII[0]] = "DRAGON_BATTLEAXE";
        bG.llllIIll[bG.llllIlII[3]] = "DRAGON_CLAWS";
        bG.llllIIll[bG.llllIlII[6]] = "DRAGON_DAGGER";
        bG.llllIIll[bG.llllIlII[9]] = "DRAGON_DAGGER_P";
        bG.llllIIll[bG.llllIlII[11]] = "DRAGON_DAGGER_PP";
        bG.llllIIll[bG.llllIlII[13]] = "DRAGON_DAGGER_PPP";
        bG.llllIIll[bG.llllIlII[15]] = "DRAGON_HALBERD";
        bG.llllIIll[bG.llllIlII[18]] = "DRAGON_LONGSWORD";
        bG.llllIIll[bG.llllIlII[20]] = "DRAGON_MACE";
        bG.llllIIll[bG.llllIlII[22]] = "DRAGON_WARHAMMER";
        bG.llllIIll[bG.llllIlII[24]] = "ARMADYL_GODSWORD";
        bG.llllIIll[bG.llllIlII[26]] = "BANDOS_GODSWORD";
        bG.llllIIll[bG.llllIlII[28]] = "SARADOMIN_GODSWORD";
        bG.llllIIll[bG.llllIlII[30]] = "SARADOMIN_SWORD";
        bG.llllIIll[bG.llllIlII[32]] = "SARADOMIN_BLESSED_SWORD";
        bG.llllIIll[bG.llllIlII[35]] = "CRYSTAL_HALBERD";
    }

    static {
        bG.llIlIlIIIl();
        bG.llIlIIllll();
        DRAGON_BATTLEAXE = new GameEnum82(llllIlII[1], llllIlII[2], llllIlII[0]);
        DRAGON_CLAWS = new GameEnum82(llllIlII[4], llllIlII[5], llllIlII[3]);
        DRAGON_DAGGER = new GameEnum82(llllIlII[7], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_P = new GameEnum82(llllIlII[10], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PP = new GameEnum82(llllIlII[12], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PPP = new GameEnum82(llllIlII[14], llllIlII[8], llllIlII[0]);
        DRAGON_HALBERD = new GameEnum82(llllIlII[16], llllIlII[17], llllIlII[3]);
        DRAGON_LONGSWORD = new GameEnum82(llllIlII[19], llllIlII[8], llllIlII[0]);
        DRAGON_MACE = new GameEnum82(llllIlII[21], llllIlII[8], llllIlII[0]);
        DRAGON_WARHAMMER = new GameEnum82(llllIlII[23], llllIlII[5], llllIlII[0]);
        ARMADYL_GODSWORD = new GameEnum82(llllIlII[25], llllIlII[5], llllIlII[3]);
        BANDOS_GODSWORD = new GameEnum82(llllIlII[27], llllIlII[5], llllIlII[3]);
        SARADOMIN_GODSWORD = new GameEnum82(llllIlII[29], llllIlII[5], llllIlII[3]);
        SARADOMIN_SWORD = new GameEnum82(llllIlII[31], llllIlII[2], llllIlII[3]);
        SARADOMIN_BLESSED_SWORD = new GameEnum82(llllIlII[33], llllIlII[34], llllIlII[3]);
        CRYSTAL_HALBERD = new GameEnum82(llllIlII[36], llllIlII[17], llllIlII[3]);
        bG[] bGArray = new bG[llllIlII[37]];
        bGArray[bG.llllIlII[0]] = DRAGON_BATTLEAXE;
        bGArray[bG.llllIlII[3]] = DRAGON_CLAWS;
        bGArray[bG.llllIlII[6]] = DRAGON_DAGGER;
        bGArray[bG.llllIlII[9]] = DRAGON_DAGGER_P;
        bGArray[bG.llllIlII[11]] = DRAGON_DAGGER_PP;
        bGArray[bG.llllIlII[13]] = DRAGON_DAGGER_PPP;
        bGArray[bG.llllIlII[15]] = DRAGON_HALBERD;
        bGArray[bG.llllIlII[18]] = DRAGON_LONGSWORD;
        bGArray[bG.llllIlII[20]] = DRAGON_MACE;
        bGArray[bG.llllIlII[22]] = DRAGON_WARHAMMER;
        bGArray[bG.llllIlII[24]] = ARMADYL_GODSWORD;
        bGArray[bG.llllIlII[26]] = BANDOS_GODSWORD;
        bGArray[bG.llllIlII[28]] = SARADOMIN_GODSWORD;
        bGArray[bG.llllIlII[30]] = SARADOMIN_SWORD;
        bGArray[bG.llllIlII[32]] = SARADOMIN_BLESSED_SWORD;
        bGArray[bG.llllIlII[35]] = CRYSTAL_HALBERD;
        $VALUES = bGArray;
    }

    private GameEnum82(int n3, int n4, boolean bl2) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl2;
    }

    public boolean at() {
        return this.twoHanded;
    }

    public static bG valueOf(String string) {
        return Enum.valueOf(GameEnum82.class, string);
    }

    private static boolean llIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int as() {
        return this.specAmount;
    }

        return String.valueOf(llIlIIIlllIIIlI);
    }

    public int ar() {
        return this.itemID;
    }
}

