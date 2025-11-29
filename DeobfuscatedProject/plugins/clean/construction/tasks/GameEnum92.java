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

public final class GameEnum92
extends Enum<aG> {
    public static final  /* enum */ aG TORSTOL;
    public static final  /* enum */ aG MARRENTILL;
    
    public static final  /* enum */ aG CADANTINE;
    public static final  /* enum */ aG LANTADYME;
    public static final  /* enum */ aG AVANTOE;
    public static final  /* enum */ aG KWUARM;
    public static final  /* enum */ aG RANARR_WEED;
    private final  String itemName;
    public static final  /* enum */ aG IRIT_LEAF;
    public static final  /* enum */ aG HARRALANDER;
    public static final  /* enum */ aG SNAPDRAGON;
    public static final  /* enum */ aG TOADFLAX;
    public static final  /* enum */ aG DWARF_WEED;
    
    private static final  aG[] $VALUES;
    private final  int id;
    public static final  /* enum */ aG GUAM_LEAF;
    public static final  /* enum */ aG TARROMIN;

    private GameEnum92(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void lllIIllIlIlIlII;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int lllIIllIlIlIIll = lllllIl[0];
        while (aG.llllIIlII(lllIIllIlIlIIll, (int)lllIIllIlIlIlII)) {
            int lllIIllIlIlIllI;
            void lllIIllIlIlIlIl;
            void lllIIllIlIlIIlI = lllIIllIlIlIlIl[lllIIllIlIlIIll];
            if (aG.llllIIlIl(lllIIllIlIlIIlI.P(), lllIIllIlIlIllI)) {
                return lllIIllIlIlIIlI;
            }
            ++lllIIllIlIlIIll;

            if (1 != 3) continue;
            return null;
        }
        return null;
    }

    private static boolean llllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aG.llllIIIll();
        aG.llllIIIlI();
        GUAM_LEAF = new GameEnum92(lllllII[lllllIl[1]], lllllIl[2]);
        MARRENTILL = new GameEnum92(lllllII[lllllIl[4]], lllllIl[5]);
        TARROMIN = new GameEnum92(lllllII[lllllIl[7]], lllllIl[8]);
        HARRALANDER = new GameEnum92(lllllII[lllllIl[10]], lllllIl[11]);
        RANARR_WEED = new GameEnum92(lllllII[lllllIl[13]], lllllIl[14]);
        TOADFLAX = new GameEnum92(lllllII[lllllIl[16]], lllllIl[17]);
        IRIT_LEAF = new GameEnum92(lllllII[lllllIl[19]], lllllIl[20]);
        AVANTOE = new GameEnum92(lllllII[lllllIl[22]], lllllIl[23]);
        KWUARM = new GameEnum92(lllllII[lllllIl[25]], lllllIl[26]);
        SNAPDRAGON = new GameEnum92(lllllII[lllllIl[28]], lllllIl[29]);
        CADANTINE = new GameEnum92(lllllII[lllllIl[31]], lllllIl[32]);
        LANTADYME = new GameEnum92(lllllII[lllllIl[34]], lllllIl[35]);
        DWARF_WEED = new GameEnum92(lllllII[lllllIl[37]], lllllIl[38]);
        TORSTOL = new GameEnum92(lllllII[lllllIl[40]], lllllIl[41]);
        aG[] aGArray = new aG[lllllIl[21]];
        aGArray[aG.lllllIl[0]] = GUAM_LEAF;
        aGArray[aG.lllllIl[1]] = MARRENTILL;
        aGArray[aG.lllllIl[3]] = TARROMIN;
        aGArray[aG.lllllIl[4]] = HARRALANDER;
        aGArray[aG.lllllIl[6]] = RANARR_WEED;
        aGArray[aG.lllllIl[7]] = TOADFLAX;
        aGArray[aG.lllllIl[9]] = IRIT_LEAF;
        aGArray[aG.lllllIl[10]] = AVANTOE;
        aGArray[aG.lllllIl[12]] = KWUARM;
        aGArray[aG.lllllIl[13]] = SNAPDRAGON;
        aGArray[aG.lllllIl[15]] = CADANTINE;
        aGArray[aG.lllllIl[16]] = LANTADYME;
        aGArray[aG.lllllIl[18]] = DWARF_WEED;
        aGArray[aG.lllllIl[19]] = TORSTOL;
        $VALUES = aGArray;
    }

    public int P() {
        return this.id;
    }

    public String N() {
        return this.itemName;
    }

        return String.valueOf(lllIIllIIlllIII);
    }

    public static aG[] values() {
        return (aG[])$VALUES.clone();
    }

    private static boolean llllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllIIIlI() {
        lllllII = new String[lllllIl[42]];
        aG.lllllII[aG.lllllIl[0]] = "GUAM_LEAF";
        aG.lllllII[aG.lllllIl[1]] = "Grimy guam leaf";
        aG.lllllII[aG.lllllIl[3]] = "MARRENTILL";
        aG.lllllII[aG.lllllIl[4]] = "Grimy marrentill";
        aG.lllllII[aG.lllllIl[6]] = "TARROMIN";
        aG.lllllII[aG.lllllIl[7]] = "Grimy tarromin";
        aG.lllllII[aG.lllllIl[9]] = "HARRALANDER";
        aG.lllllII[aG.lllllIl[10]] = "Grimy harralander";
        aG.lllllII[aG.lllllIl[12]] = "RANARR_WEED";
        aG.lllllII[aG.lllllIl[13]] = "Grimy ranarr weed";
        aG.lllllII[aG.lllllIl[15]] = "TOADFLAX";
        aG.lllllII[aG.lllllIl[16]] = "Grimy toadflax";
        aG.lllllII[aG.lllllIl[18]] = "IRIT_LEAF";
        aG.lllllII[aG.lllllIl[19]] = "Grimy irit leaf";
        aG.lllllII[aG.lllllIl[21]] = "AVANTOE";
        aG.lllllII[aG.lllllIl[22]] = "Grimy avantoe";
        aG.lllllII[aG.lllllIl[24]] = "KWUARM";
        aG.lllllII[aG.lllllIl[25]] = "Grimy kwuarm";
        aG.lllllII[aG.lllllIl[27]] = "SNAPDRAGON";
        aG.lllllII[aG.lllllIl[28]] = "Grimy snapdragon";
        aG.lllllII[aG.lllllIl[30]] = "CADANTINE";
        aG.lllllII[aG.lllllIl[31]] = "Grimy cadantine";
        aG.lllllII[aG.lllllIl[33]] = "LANTADYME";
        aG.lllllII[aG.lllllIl[34]] = "Grimy lantadyme";
        aG.lllllII[aG.lllllIl[36]] = "DWARF_WEED";
        aG.lllllII[aG.lllllIl[37]] = "Grimy dwarf weed";
        aG.lllllII[aG.lllllIl[39]] = "TORSTOL";
        aG.lllllII[aG.lllllIl[40]] = "Grimy torstol";
    }

    public static aG valueOf(String string) {
        return Enum.valueOf(GameEnum92.class, string);
    }
}

