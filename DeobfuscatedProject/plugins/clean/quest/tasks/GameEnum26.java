/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum26
extends Enum<h> {
    public static final  /* enum */ h ROMEO_AND_JULIET;
    public static final  /* enum */ h WITCHS_POTION;
    public static final  /* enum */ h PIRATES_TREASURE;
    public static final  /* enum */ h IMP_CATCHER;
    public static final  /* enum */ h DWARF_CANNON;
    
    public static final  /* enum */ h RUNE_MYSTERIES;
    
    public static final  /* enum */ h PRINCE_ALI_RESCUE;
    public static final  /* enum */ h SHEEP_SHEARER;
    private static final  h[] $VALUES;
    private final  String questName;
    public static final  /* enum */ h TUTORIAL_ISLAND;
    public static final  /* enum */ h BELOW_ICE_MOUNTAIN;
    public static final  /* enum */ h X_MARKS_THE_SPOT;
    public static final  /* enum */ h MISTHALIN_MYSTERY;
    public static final  /* enum */ h CLIENT_OF_KOUREND;
    public static final  /* enum */ h COOKS_ASSISTANT;
    public static final  /* enum */ h RESTLESS_GHOST;
    public static final  /* enum */ h NATURAL_HISTORY_QUIZ;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }

    private static boolean lIlIIIIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum26(String string2) {
        this.questName = string2;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.lIlIIIIlllIIlII();
        h.lIlIIIIlllIIIll();
        BELOW_ICE_MOUNTAIN = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[1]]);
        CLIENT_OF_KOUREND = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[3]]);
        COOKS_ASSISTANT = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[5]]);
        DWARF_CANNON = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[7]]);
        IMP_CATCHER = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[9]]);
        MISTHALIN_MYSTERY = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[11]]);
        PIRATES_TREASURE = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[13]]);
        PRINCE_ALI_RESCUE = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[15]]);
        RESTLESS_GHOST = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[17]]);
        ROMEO_AND_JULIET = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[19]]);
        RUNE_MYSTERIES = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[21]]);
        NATURAL_HISTORY_QUIZ = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[23]]);
        SHEEP_SHEARER = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[25]]);
        TUTORIAL_ISLAND = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[27]]);
        WITCHS_POTION = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[29]]);
        X_MARKS_THE_SPOT = new GameEnum26(lIIIllIIIlIlI[lIIIllIIIlllI[31]]);
        h[] hArray = new h[lIIIllIIIlllI[16]];
        hArray[h.lIIIllIIIlllI[0]] = BELOW_ICE_MOUNTAIN;
        hArray[h.lIIIllIIIlllI[1]] = CLIENT_OF_KOUREND;
        hArray[h.lIIIllIIIlllI[2]] = COOKS_ASSISTANT;
        hArray[h.lIIIllIIIlllI[3]] = DWARF_CANNON;
        hArray[h.lIIIllIIIlllI[4]] = IMP_CATCHER;
        hArray[h.lIIIllIIIlllI[5]] = MISTHALIN_MYSTERY;
        hArray[h.lIIIllIIIlllI[6]] = PIRATES_TREASURE;
        hArray[h.lIIIllIIIlllI[7]] = PRINCE_ALI_RESCUE;
        hArray[h.lIIIllIIIlllI[8]] = RESTLESS_GHOST;
        hArray[h.lIIIllIIIlllI[9]] = ROMEO_AND_JULIET;
        hArray[h.lIIIllIIIlllI[10]] = RUNE_MYSTERIES;
        hArray[h.lIIIllIIIlllI[11]] = NATURAL_HISTORY_QUIZ;
        hArray[h.lIIIllIIIlllI[12]] = SHEEP_SHEARER;
        hArray[h.lIIIllIIIlllI[13]] = TUTORIAL_ISLAND;
        hArray[h.lIIIllIIIlllI[14]] = WITCHS_POTION;
        hArray[h.lIIIllIIIlllI[15]] = X_MARKS_THE_SPOT;
        $VALUES = hArray;
    }

        return String.valueOf(var1);
    }

    private static void lIlIIIIlllIIIll() {
        lIIIllIIIlIlI = new String[lIIIllIIIlllI[32]];
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[0]] = "BELOW_ICE_MOUNTAIN";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[1]] = "Below Ice Mountain";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[2]] = "CLIENT_OF_KOUREND";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[3]] = "Client Of Kourend";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[4]] = "COOKS_ASSISTANT";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[5]] = "Cook's Assistant";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[6]] = "DWARF_CANNON";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[7]] = "Dwarf Cannon";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[8]] = "IMP_CATCHER";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[9]] = "Imp Catcher";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[10]] = "MISTHALIN_MYSTERY";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[11]] = "Misthalin Mystery";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[12]] = "PIRATES_TREASURE";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[13]] = "Pirates Treasure";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[14]] = "PRINCE_ALI_RESCUE";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[15]] = "Prince Ali Rescue";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[16]] = "RESTLESS_GHOST";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[17]] = "Restless Ghost";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[18]] = "ROMEO_AND_JULIET";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[19]] = "Romeo And  Juliet";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[20]] = "RUNE_MYSTERIES";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[21]] = "Rune Mysteries";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[22]] = "NATURAL_HISTORY_QUIZ";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[23]] = "Natural History Quiz";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[24]] = "SHEEP_SHEARER";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[25]] = "Sheep Shearer";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[26]] = "TUTORIAL_ISLAND";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[27]] = "Tutorial Island";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[28]] = "WITCHS_POTION";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[29]] = "Witchs Potion";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[30]] = "X_MARKS_THE_SPOT";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[31]] = "X Marks The Spot";
    }

}

