/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<t> {
    private final  int lever2Value;
    
    private final  int unfinishedID;
    private final  int finishedID;
    public static final  /* enum */ t AZURE_AURA_MIX;
    public static final  /* enum */ t ALCO_AUGMENTATOR;
    private final  int lever3Value;
    public static final  /* enum */ t MAMMOTH_MIGHT;
    private static final  t[] $VALUES;
    public static final  /* enum */ t MYSTIC_MANA_AMALGAM;
    public static final  /* enum */ t MARLEYS_MOONLIGHT;
    public static final  /* enum */ t ANTI_LEECH_LOTION;
    public static final  /* enum */ t MIXALOT;
    private final  int xpReward;
    private final  int lever1Value;
    private final  String rewardType;
    public static final  /* enum */ t LIPLACK_LIQUOR;
    public static final  /* enum */ t MEGALITE_LIQUID;
    public static final  /* enum */ t AQUALUX_AMALGAM;
    
    private final  String name;

    public int n() {
        return this.unfinishedID;
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private static boolean lIIlIllIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public int k() {
        return this.lever2Value;
    }

    public String q() {
        return this.rewardType;
    }

    public int m() {
        return this.lever1Value;
    }

    public int l() {
        return this.lever3Value;
    }

    static {
        t.lIIlIlIllllllll();
        t.lIIlIlIlllllllI();
        LIPLACK_LIQUOR = new GameEnum(lllllllllllI[llllllllllll[1]], llllllllllll[2], llllllllllll[3], llllllllllll[4], llllllllllll[4], llllllllllll[4], llllllllllll[5], lllllllllllI[llllllllllll[6]]);
        ALCO_AUGMENTATOR = new GameEnum(lllllllllllI[llllllllllll[7]], llllllllllll[8], llllllllllll[9], llllllllllll[6], llllllllllll[6], llllllllllll[6], llllllllllll[5], lllllllllllI[llllllllllll[10]]);
        MAMMOTH_MIGHT = new GameEnum(lllllllllllI[llllllllllll[12]], llllllllllll[13], llllllllllll[14], llllllllllll[1], llllllllllll[1], llllllllllll[1], llllllllllll[5], lllllllllllI[llllllllllll[15]]);
        MYSTIC_MANA_AMALGAM = new GameEnum(lllllllllllI[llllllllllll[17]], llllllllllll[18], llllllllllll[19], llllllllllll[1], llllllllllll[1], llllllllllll[6], llllllllllll[20], lllllllllllI[llllllllllll[21]]);
        MARLEYS_MOONLIGHT = new GameEnum(lllllllllllI[llllllllllll[23]], llllllllllll[24], llllllllllll[25], llllllllllll[1], llllllllllll[1], llllllllllll[4], llllllllllll[26], lllllllllllI[llllllllllll[27]]);
        AZURE_AURA_MIX = new GameEnum(lllllllllllI[llllllllllll[29]], llllllllllll[30], llllllllllll[31], llllllllllll[6], llllllllllll[6], llllllllllll[1], llllllllllll[32], lllllllllllI[llllllllllll[33]]);
        AQUALUX_AMALGAM = new GameEnum(lllllllllllI[llllllllllll[35]], llllllllllll[36], llllllllllll[37], llllllllllll[6], llllllllllll[4], llllllllllll[6], llllllllllll[38], lllllllllllI[llllllllllll[39]]);
        MEGALITE_LIQUID = new GameEnum(lllllllllllI[llllllllllll[41]], llllllllllll[42], llllllllllll[43], llllllllllll[1], llllllllllll[4], llllllllllll[4], llllllllllll[44], lllllllllllI[llllllllllll[45]]);
        ANTI_LEECH_LOTION = new GameEnum(lllllllllllI[llllllllllll[47]], llllllllllll[48], llllllllllll[49], llllllllllll[6], llllllllllll[4], llllllllllll[4], llllllllllll[50], lllllllllllI[llllllllllll[51]]);
        MIXALOT = new GameEnum(lllllllllllI[llllllllllll[53]], llllllllllll[54], llllllllllll[55], llllllllllll[1], llllllllllll[6], llllllllllll[4], llllllllllll[56], lllllllllllI[llllllllllll[57]]);
        t[] tArray = new t[llllllllllll[17]];
        tArray[t.llllllllllll[0]] = LIPLACK_LIQUOR;
        tArray[t.llllllllllll[1]] = ALCO_AUGMENTATOR;
        tArray[t.llllllllllll[6]] = MAMMOTH_MIGHT;
        tArray[t.llllllllllll[4]] = MYSTIC_MANA_AMALGAM;
        tArray[t.llllllllllll[7]] = MARLEYS_MOONLIGHT;
        tArray[t.llllllllllll[10]] = AZURE_AURA_MIX;
        tArray[t.llllllllllll[11]] = AQUALUX_AMALGAM;
        tArray[t.llllllllllll[12]] = MEGALITE_LIQUID;
        tArray[t.llllllllllll[15]] = ANTI_LEECH_LOTION;
        tArray[t.llllllllllll[16]] = MIXALOT;
        $VALUES = tArray;
    }

    public int o() {
        return this.finishedID;
    }

    private static void lIIlIlIlllllllI() {
        lllllllllllI = new String[llllllllllll[58]];
        t.lllllllllllI[t.llllllllllll[0]] = "LIPLACK_LIQUOR";
        t.lllllllllllI[t.llllllllllll[1]] = "Liplack liquor";
        t.lllllllllllI[t.llllllllllll[6]] = "lye";
        t.lllllllllllI[t.llllllllllll[4]] = "ALCO_AUGMENTATOR";
        t.lllllllllllI[t.llllllllllll[7]] = "Alco-augmentator";
        t.lllllllllllI[t.llllllllllll[10]] = "aga";
        t.lllllllllllI[t.llllllllllll[11]] = "MAMMOTH_MIGHT";
        t.lllllllllllI[t.llllllllllll[12]] = "Mammoth-might mix";
        t.lllllllllllI[t.llllllllllll[15]] = "mox";
        t.lllllllllllI[t.llllllllllll[16]] = "MYSTIC_MANA_AMALGAM";
        t.lllllllllllI[t.llllllllllll[17]] = "Mystic mana amalgam";
        t.lllllllllllI[t.llllllllllll[21]] = "mox";
        t.lllllllllllI[t.llllllllllll[22]] = "MARLEYS_MOONLIGHT";
        t.lllllllllllI[t.llllllllllll[23]] = "Marley's moonlight";
        t.lllllllllllI[t.llllllllllll[27]] = "mox";
        t.lllllllllllI[t.llllllllllll[28]] = "AZURE_AURA_MIX";
        t.lllllllllllI[t.llllllllllll[29]] = "Azure aura mix";
        t.lllllllllllI[t.llllllllllll[33]] = "aga";
        t.lllllllllllI[t.llllllllllll[34]] = "AQUALUX_AMALGAM";
        t.lllllllllllI[t.llllllllllll[35]] = "Aqualux amalgam";
        t.lllllllllllI[t.llllllllllll[39]] = "aga";
        t.lllllllllllI[t.llllllllllll[40]] = "MEGALITE_LIQUID";
        t.lllllllllllI[t.llllllllllll[41]] = "Megalite liquid";
        t.lllllllllllI[t.llllllllllll[45]] = "lye";
        t.lllllllllllI[t.llllllllllll[46]] = "ANTI_LEECH_LOTION";
        t.lllllllllllI[t.llllllllllll[47]] = "Anti-leech lotion";
        t.lllllllllllI[t.llllllllllll[51]] = "lye";
        t.lllllllllllI[t.llllllllllll[52]] = "MIXALOT";
        t.lllllllllllI[t.llllllllllll[53]] = "Mixalot";
        t.lllllllllllI[t.llllllllllll[57]] = "lye";
    }

    public int p() {
        return this.xpReward;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        return String.valueOf(var1);
    }

    private GameEnum(String string2, int n3, int n4, int n5, int n6, int n7, int n8, String string3) {
        this.name = string2;
        this.unfinishedID = n3;
        this.finishedID = n4;
        this.lever1Value = n5;
        this.lever2Value = n6;
        this.lever3Value = n7;
        this.xpReward = n8;
        this.rewardType = string3;
    }

    public String a() {
        return this.name;
    }

}

