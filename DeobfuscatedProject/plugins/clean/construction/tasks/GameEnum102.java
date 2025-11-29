/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import gg.squire.construction.tasks.GameEnum92;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum102
extends Enum<aI> {
    
    public static final  /* enum */ aI WATER_RUNE;
    
    public static final  /* enum */ aI EARTH_RUNE;
    public static final  /* enum */ aI MIND_RUNE;
    private final  String itemName;
    private final  int id;
    public static final  /* enum */ aI AIR_RUNE;
    public static final  /* enum */ aI DEATH_RUNE;
    public static final  /* enum */ aI BODY_RUNE;
    private static final  aI[] $VALUES;
    public static final  /* enum */ aI FIRE_RUNE;
    public static final  /* enum */ aI COSMIC_RUNE;
    public static final  /* enum */ aI NATURE_RUNE;
    public static final  /* enum */ aI CHAOS_RUNE;
    public static final  /* enum */ aI LAW_RUNE;

    public int P() {
        return this.id;
    }

    private static void lIlIlllIIl() {
        llIIIlII = new String[llIIIlll[33]];
        aI.llIIIlII[aI.llIIIlll[0]] = "J =∳0J";
        aI.llIIIlII[aI.llIIIlll[1]] = "Air rune";
        aI.llIIIlII[aI.llIIIlll[3]] = "MIND_RUNE";
        aI.llIIIlII[aI.llIIIlll[4]] = "Mind rune";
        aI.llIIIlII[aI.llIIIlll[6]] = "WATER_RUNE";
        aI.llIIIlII[aI.llIIIlll[7]] = "Water rune";
        aI.llIIIlII[aI.llIIIlll[9]] = "EARTH_RUNE";
        aI.llIIIlII[aI.llIIIlll[10]] = "Earth rune";
        aI.llIIIlII[aI.llIIIlll[12]] = "FIRE_RUNE";
        aI.llIIIlII[aI.llIIIlll[13]] = "Fire rune";
        aI.llIIIlII[aI.llIIIlll[15]] = "BODY_RUNE";
        aI.llIIIlII[aI.llIIIlll[16]] = "Body rune";
        aI.llIIIlII[aI.llIIIlll[18]] = "COSMIC_RUNE";
        aI.llIIIlII[aI.llIIIlll[19]] = "Cosmic rune";
        aI.llIIIlII[aI.llIIIlll[21]] = "CHAOS_RUNE";
        aI.llIIIlII[aI.llIIIlll[22]] = "Chaos rune";
        aI.llIIIlII[aI.llIIIlll[24]] = "NATURE_RUNE";
        aI.llIIIlII[aI.llIIIlll[25]] = "Nature rune";
        aI.llIIIlII[aI.llIIIlll[27]] = "LAW_RUNE";
        aI.llIIIlII[aI.llIIIlll[28]] = "Law rune";
        aI.llIIIlII[aI.llIIIlll[30]] = "DEATH_RUNE";
        aI.llIIIlII[aI.llIIIlll[31]] = "Death rune";
    }

        return String.valueOf(llIllIlIlllIlIl);
    }

    static {
        aI.lIlIlllIlI();
        aI.lIlIlllIIl();
        AIR_RUNE = new GameEnum102(llIIIlII[llIIIlll[1]], llIIIlll[2]);
        MIND_RUNE = new GameEnum102(llIIIlII[llIIIlll[4]], llIIIlll[5]);
        WATER_RUNE = new GameEnum102(llIIIlII[llIIIlll[7]], llIIIlll[8]);
        EARTH_RUNE = new GameEnum102(llIIIlII[llIIIlll[10]], llIIIlll[11]);
        FIRE_RUNE = new GameEnum102(llIIIlII[llIIIlll[13]], llIIIlll[14]);
        BODY_RUNE = new GameEnum102(llIIIlII[llIIIlll[16]], llIIIlll[17]);
        COSMIC_RUNE = new GameEnum102(llIIIlII[llIIIlll[19]], llIIIlll[20]);
        CHAOS_RUNE = new GameEnum102(llIIIlII[llIIIlll[22]], llIIIlll[23]);
        NATURE_RUNE = new GameEnum102(llIIIlII[llIIIlll[25]], llIIIlll[26]);
        LAW_RUNE = new GameEnum102(llIIIlII[llIIIlll[28]], llIIIlll[29]);
        DEATH_RUNE = new GameEnum102(llIIIlII[llIIIlll[31]], llIIIlll[32]);
        aI[] aIArray = new aI[llIIIlll[16]];
        aIArray[aI.llIIIlll[0]] = AIR_RUNE;
        aIArray[aI.llIIIlll[1]] = MIND_RUNE;
        aIArray[aI.llIIIlll[3]] = WATER_RUNE;
        aIArray[aI.llIIIlll[4]] = EARTH_RUNE;
        aIArray[aI.llIIIlll[6]] = FIRE_RUNE;
        aIArray[aI.llIIIlll[7]] = BODY_RUNE;
        aIArray[aI.llIIIlll[9]] = COSMIC_RUNE;
        aIArray[aI.llIIIlll[10]] = CHAOS_RUNE;
        aIArray[aI.llIIIlll[12]] = NATURE_RUNE;
        aIArray[aI.llIIIlll[13]] = LAW_RUNE;
        aIArray[aI.llIIIlll[15]] = DEATH_RUNE;
        $VALUES = aIArray;
    }

    public static aI valueOf(String string) {
        return Enum.valueOf(GameEnum102.class, string);
    }

    private static boolean lIlIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static aI[] values() {
        return (aI[])$VALUES.clone();
    }

    private static boolean lIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private GameEnum102(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    public String N() {
        return this.itemName;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void llIllIllIIlIIIl;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int llIllIllIIlIIII = llIIIlll[0];
        while (aI.lIlIlllIll(llIllIllIIlIIII, (int)llIllIllIIlIIIl)) {
            int llIllIllIIlIIll;
            void llIllIllIIlIIlI;
            void llIllIllIIIllll = llIllIllIIlIIlI[llIllIllIIlIIII];
            if (aI.lIlIllllII(llIllIllIIIllll.P(), llIllIllIIlIIll)) {
                return llIllIllIIIllll;
            }
            ++llIllIllIIlIIII;

            if (-2 < 0) continue;
            return null;
        }
        return null;
    }
}

