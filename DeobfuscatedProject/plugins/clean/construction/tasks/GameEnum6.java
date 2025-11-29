/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;

public final class GameEnum6
extends Enum<Z> {
    public static final  /* enum */ Z WALLASALKI;
    public static final  /* enum */ Z HELL_HOUND_TESTING;
    public static final  /* enum */ Z DAGANNOTH_RANGE;

    public static final  /* enum */ Z PRIME;
    private final  int id;
    public static final  /* enum */ Z GIANT_ROCK_CRAB;
    private final  int animation;
    public static final  /* enum */ Z REX;
    private static final  Z[] $VALUES;
    private final  Prayer protection;
    public static final  /* enum */ Z DAGANNOTH_RANGE2;
    public static final  /* enum */ Z ROCK_LOBSTER;
    public static final  /* enum */ Z DAGANNOTH;
    public static final  /* enum */ Z SUPREME;

    private static boolean lIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    public static Z valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static Z h(NPC nPC) {
        void llIlllIIlIIlIIl;
        Z[] zArray = Z.values();
        int n2 = zArray.length;
        int llIlllIIlIIlIII = lIlllIll[0];
        while (Z.lIlIIlllll(llIlllIIlIIlIII, (int)llIlllIIlIIlIIl)) {
            NPC llIlllIIlIIlIll;
            void llIlllIIlIIlIlI;
            void llIlllIIlIIIlll = llIlllIIlIIlIlI[llIlllIIlIIlIII];
            if (Z.lIlIlIIIII(llIlllIIlIIIlll.P(), llIlllIIlIIlIll.getId())) {
                return llIlllIIlIIIlll;
            }
            ++llIlllIIlIIlIII;

            if (3 > 1) continue;
            return null;
        }
        return null;
    }

    public int ba() {
        return this.animation;
    }

    public Prayer aZ() {
        return this.protection;
    }

    private GameEnum6(int n3, Prayer prayer, int n4) {
        this.id = n3;
        this.protection = prayer;
        this.animation = n4;
    }

    public static Z[] values() {
        return (Z[])$VALUES.clone();
    }

        return String.valueOf(llIlllIIIlIIIII);
    }

    public int P() {
        return this.id;
    }

    private static void lIlIIllIlI() {
        lIlllIIl = new String[lIlllIll[29]];
        Z.lIlllIIl[Z.lIlllIll[0]] = "REX";
        Z.lIlllIIl[Z.lIlllIll[3]] = "PRIME";
        Z.lIlllIIl[Z.lIlllIll[6]] = "SUPREME";
        Z.lIlllIIl[Z.lIlllIll[9]] = "DAGANNOTH";
        Z.lIlllIIl[Z.lIlllIll[12]] = "GIANT_ROCK_CRAB";
        Z.lIlllIIl[Z.lIlllIll[15]] = "WALLASALKI";
        Z.lIlllIIl[Z.lIlllIll[18]] = "DAGANNOTH_RANGE";
        Z.lIlllIIl[Z.lIlllIll[21]] = "DAGANNOTH_RANGE2";
        Z.lIlllIIl[Z.lIlllIll[23]] = "ROCK_LOBSTER";
        Z.lIlllIIl[Z.lIlllIll[26]] = "HELL_HOUND_TESTING";
    }

    static {
        Z.lIlIIllllI();
        Z.lIlIIllIlI();
        REX = new GameEnum6(lIlllIll[1], Prayer.PROTECT_FROM_MELEE, lIlllIll[2]);
        PRIME = new GameEnum6(lIlllIll[4], Prayer.PROTECT_FROM_MAGIC, lIlllIll[5]);
        SUPREME = new GameEnum6(lIlllIll[7], Prayer.PROTECT_FROM_MISSILES, lIlllIll[8]);
        DAGANNOTH = new GameEnum6(lIlllIll[10], Prayer.PROTECT_FROM_MELEE, lIlllIll[11]);
        GIANT_ROCK_CRAB = new GameEnum6(lIlllIll[13], Prayer.PROTECT_FROM_MELEE, lIlllIll[14]);
        WALLASALKI = new GameEnum6(lIlllIll[16], Prayer.PROTECT_FROM_MAGIC, lIlllIll[17]);
        DAGANNOTH_RANGE = new GameEnum6(lIlllIll[19], Prayer.PROTECT_FROM_MISSILES, lIlllIll[20]);
        DAGANNOTH_RANGE2 = new GameEnum6(lIlllIll[22], Prayer.PROTECT_FROM_MISSILES, lIlllIll[11]);
        ROCK_LOBSTER = new GameEnum6(lIlllIll[24], Prayer.PROTECT_FROM_MELEE, lIlllIll[25]);
        HELL_HOUND_TESTING = new GameEnum6(lIlllIll[27], Prayer.PROTECT_FROM_MELEE, lIlllIll[28]);
        Z[] zArray = new Z[lIlllIll[29]];
        zArray[Z.lIlllIll[0]] = REX;
        zArray[Z.lIlllIll[3]] = PRIME;
        zArray[Z.lIlllIll[6]] = SUPREME;
        zArray[Z.lIlllIll[9]] = DAGANNOTH;
        zArray[Z.lIlllIll[12]] = GIANT_ROCK_CRAB;
        zArray[Z.lIlllIll[15]] = WALLASALKI;
        zArray[Z.lIlllIll[18]] = DAGANNOTH_RANGE;
        zArray[Z.lIlllIll[21]] = DAGANNOTH_RANGE2;
        zArray[Z.lIlllIll[23]] = ROCK_LOBSTER;
        zArray[Z.lIlllIll[26]] = HELL_HOUND_TESTING;
        $VALUES = zArray;
    }

    private static boolean lIlIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

}

