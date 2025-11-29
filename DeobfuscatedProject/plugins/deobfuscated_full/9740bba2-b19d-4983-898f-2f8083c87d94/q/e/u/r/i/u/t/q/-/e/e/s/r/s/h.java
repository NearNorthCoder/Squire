/*
 * Decompiled with CFR 0.152.
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h ROMEO_AND_JULIET;
    public static final /* synthetic */ /* enum */ h WITCHS_POTION;
    public static final /* synthetic */ /* enum */ h PIRATES_TREASURE;
    public static final /* synthetic */ /* enum */ h IMP_CATCHER;
    public static final /* synthetic */ /* enum */ h DWARF_CANNON;
    private static /* synthetic */ String[] lIIIllIIIlIlI;
    public static final /* synthetic */ /* enum */ h RUNE_MYSTERIES;
    private static /* synthetic */ int[] lIIIllIIIlllI;
    public static final /* synthetic */ /* enum */ h PRINCE_ALI_RESCUE;
    public static final /* synthetic */ /* enum */ h SHEEP_SHEARER;
    private static final /* synthetic */ h[] $VALUES;
    private final /* synthetic */ String questName;
    public static final /* synthetic */ /* enum */ h TUTORIAL_ISLAND;
    public static final /* synthetic */ /* enum */ h BELOW_ICE_MOUNTAIN;
    public static final /* synthetic */ /* enum */ h X_MARKS_THE_SPOT;
    public static final /* synthetic */ /* enum */ h MISTHALIN_MYSTERY;
    public static final /* synthetic */ /* enum */ h CLIENT_OF_KOUREND;
    public static final /* synthetic */ /* enum */ h COOKS_ASSISTANT;
    public static final /* synthetic */ /* enum */ h RESTLESS_GHOST;
    public static final /* synthetic */ /* enum */ h NATURAL_HISTORY_QUIZ;

    private static void lIlIIIIlllIIlII() {
        lIIIllIIIlllI = new int[33];
        h.lIIIllIIIlllI[0] = (0x65 ^ 0x46 ^ (0xC5 ^ 0xB9)) & (0x3A ^ 0x1F ^ (0x68 ^ 0x12) ^ -1);
        h.lIIIllIIIlllI[1] = 1;
        h.lIIIllIIIlllI[2] = 2;
        h.lIIIllIIIlllI[3] = 3;
        h.lIIIllIIIlllI[4] = 9 + 79 - 7 + 84 ^ 120 + 18 - -17 + 6;
        h.lIIIllIIIlllI[5] = 0x47 ^ 0x42;
        h.lIIIllIIIlllI[6] = 81 + 102 - 121 + 75 ^ 12 + 52 - 62 + 141;
        h.lIIIllIIIlllI[7] = 74 + 98 - 93 + 58 ^ 82 + 116 - 196 + 140;
        h.lIIIllIIIlllI[8] = 7 ^ 0xF;
        h.lIIIllIIIlllI[9] = 0xC0 ^ 0xA9 ^ (0x1B ^ 0x7B);
        h.lIIIllIIIlllI[10] = 30 + 6 - -32 + 120 ^ 22 + 41 - -93 + 26;
        h.lIIIllIIIlllI[11] = 0xA0 ^ 0xAB;
        h.lIIIllIIIlllI[12] = 9 ^ 5;
        h.lIIIllIIIlllI[13] = 0xB ^ 0x30 ^ (0x8C ^ 0xBA);
        h.lIIIllIIIlllI[14] = 0x55 ^ 0x5B;
        h.lIIIllIIIlllI[15] = 0x7D ^ 0x72;
        h.lIIIllIIIlllI[16] = 0x66 ^ 0x76;
        h.lIIIllIIIlllI[17] = 0x70 ^ 0x7A ^ (0x92 ^ 0x89);
        h.lIIIllIIIlllI[18] = 0x71 ^ 0x4F ^ (0x89 ^ 0xA5);
        h.lIIIllIIIlllI[19] = 0xB7 ^ 0xC5 ^ (0xCF ^ 0xAE);
        h.lIIIllIIIlllI[20] = 0xF8 ^ 0x9D ^ (0x1F ^ 0x6E);
        h.lIIIllIIIlllI[21] = 0xE5 ^ 0xB0 ^ (0xC1 ^ 0x81);
        h.lIIIllIIIlllI[22] = 69 + 79 - 119 + 98 ^ (0xCA ^ 0xA3);
        h.lIIIllIIIlllI[23] = 0x10 ^ 7;
        h.lIIIllIIIlllI[24] = 0x8D ^ 0x95;
        h.lIIIllIIIlllI[25] = 0x52 ^ 0x42 ^ (0x4D ^ 0x44);
        h.lIIIllIIIlllI[26] = 0xE2 ^ 0xAB ^ (0x6B ^ 0x38);
        h.lIIIllIIIlllI[27] = 0x53 ^ 0x16 ^ (1 ^ 0x5F);
        h.lIIIllIIIlllI[28] = 132 + 5 - 114 + 139 ^ 53 + 67 - 63 + 133;
        h.lIIIllIIIlllI[29] = 0x3C ^ 0x39 ^ (0x47 ^ 0x5F);
        h.lIIIllIIIlllI[30] = 0x69 ^ 0x77;
        h.lIIIllIIIlllI[31] = 0x5E ^ 0x51 ^ (0x94 ^ 0x84);
        h.lIIIllIIIlllI[32] = 0xD7 ^ 0xC4 ^ (0xA1 ^ 0x92);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static boolean lIlIIIIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private h(String string2) {
        this.questName = string2;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.lIlIIIIlllIIlII();
        h.lIlIIIIlllIIIll();
        BELOW_ICE_MOUNTAIN = new h(lIIIllIIIlIlI[lIIIllIIIlllI[1]]);
        CLIENT_OF_KOUREND = new h(lIIIllIIIlIlI[lIIIllIIIlllI[3]]);
        COOKS_ASSISTANT = new h(lIIIllIIIlIlI[lIIIllIIIlllI[5]]);
        DWARF_CANNON = new h(lIIIllIIIlIlI[lIIIllIIIlllI[7]]);
        IMP_CATCHER = new h(lIIIllIIIlIlI[lIIIllIIIlllI[9]]);
        MISTHALIN_MYSTERY = new h(lIIIllIIIlIlI[lIIIllIIIlllI[11]]);
        PIRATES_TREASURE = new h(lIIIllIIIlIlI[lIIIllIIIlllI[13]]);
        PRINCE_ALI_RESCUE = new h(lIIIllIIIlIlI[lIIIllIIIlllI[15]]);
        RESTLESS_GHOST = new h(lIIIllIIIlIlI[lIIIllIIIlllI[17]]);
        ROMEO_AND_JULIET = new h(lIIIllIIIlIlI[lIIIllIIIlllI[19]]);
        RUNE_MYSTERIES = new h(lIIIllIIIlIlI[lIIIllIIIlllI[21]]);
        NATURAL_HISTORY_QUIZ = new h(lIIIllIIIlIlI[lIIIllIIIlllI[23]]);
        SHEEP_SHEARER = new h(lIIIllIIIlIlI[lIIIllIIIlllI[25]]);
        TUTORIAL_ISLAND = new h(lIIIllIIIlIlI[lIIIllIIIlllI[27]]);
        WITCHS_POTION = new h(lIIIllIIIlIlI[lIIIllIIIlllI[29]]);
        X_MARKS_THE_SPOT = new h(lIIIllIIIlIlI[lIIIllIIIlllI[31]]);
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

    private static String lIlIIIIllIlIIlI(String var1, String var13) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var9 = var13.toCharArray();
        int var15 = lIIIllIIIlllI[0];
        char[] var16 = var1.toCharArray();
        int var6 = var16.length;
        int var17 = lIIIllIIIlllI[0];
        while (h.lIlIIIIlllIIlIl(var17, var6)) {
            char var5 = var16[var17];
            var11.append((char)(var5 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var17;
            0;
            if ((61 + 18 - -10 + 93 ^ 111 + 138 - 224 + 153) >= (137 + 122 - 161 + 90 ^ 34 + 40 - -72 + 38)) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static String lIlIIIIllIlIIIl(String var10, String var14) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIllIIIlllI[2], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIlllIIIll() {
        lIIIllIIIlIlI = new String[lIIIllIIIlllI[32]];
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[0]] = h."BELOW_ICE_MOUNTAIN";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[1]] = h."Below Ice Mountain";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[2]] = h."CLIENT_OF_KOUREND";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[3]] = h."Client Of Kourend";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[4]] = h."COOKS_ASSISTANT";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[5]] = h."Cook's Assistant";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[6]] = h."DWARF_CANNON";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[7]] = h."Dwarf Cannon";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[8]] = h."IMP_CATCHER";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[9]] = h."Imp Catcher";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[10]] = h."MISTHALIN_MYSTERY";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[11]] = h."Misthalin Mystery";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[12]] = h."PIRATES_TREASURE";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[13]] = h."Pirates Treasure";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[14]] = h."PRINCE_ALI_RESCUE";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[15]] = h."Prince Ali Rescue";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[16]] = h."RESTLESS_GHOST";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[17]] = h."Restless Ghost";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[18]] = h."ROMEO_AND_JULIET";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[19]] = h."Romeo And  Juliet";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[20]] = h."RUNE_MYSTERIES";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[21]] = h."Rune Mysteries";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[22]] = h."NATURAL_HISTORY_QUIZ";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[23]] = h."Natural History Quiz";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[24]] = h."SHEEP_SHEARER";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[25]] = h."Sheep Shearer";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[26]] = h."TUTORIAL_ISLAND";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[27]] = h."Tutorial Island";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[28]] = h."WITCHS_POTION";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[29]] = h."Witchs Potion";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[30]] = h."X_MARKS_THE_SPOT";
        h.lIIIllIIIlIlI[h.lIIIllIIIlllI[31]] = h."X Marks The Spot";
    }

    private static String lIlIIIIllIlIIll(String var18, String var8) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIIllIIIlllI[8]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIIllIIIlllI[2], var12);
            return new String(var2.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }
}

