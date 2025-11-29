/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.QuestVarbits
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.QuestVarbits;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.A_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.E_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.G_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.H_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.L_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.M_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.O_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.P_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.R_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.T_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.U_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.V_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.W_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.Z_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aA_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aB_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aC_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aE_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aF_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aa_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ad_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.af_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ag_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ah_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ai_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aj_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ak_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.an_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ao_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aq_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ar_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.at_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.au_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.av_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aw_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.n_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.v_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.w_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.y_Unknown;

public class t_Unknown
implements ac {
    public static /* synthetic */ String h;
    public static /* synthetic */ List<ac> dc;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ int[] llIIIIllll;
    private static /* synthetic */ String[] llIIIIllIl;
    static /* synthetic */ int cG;

    private static boolean lIlIIlIIlIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIlIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ae() {
        return llIIIIllll[2];
    }

    static {
        t.lIlIIlIIIllll();
        t.lIlIIlIIIlllI();
        dc = new ArrayList<ac>();
        h = llIIIIllIl[llIIIIllll[49]];
        dd = llIIIIllll[2];
    }

    private static String lIlIIlIIIlIll(String var2, String var20) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIIIllll[3], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            t.aW();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 < 0) {
            return (0x46 ^ 0x6F) & ~(0xA9 ^ 0x80);
        }
        return llIIIIllll[44];
    }

    private static boolean lIlIIlIIlIIll(Object object, Object object2) {
        return object == object2;
    }

    private static String lIlIIlIIIllII(String var1, String var11) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIIIIllll[14]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIIIllll[3], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return h;
    }

    private static String lIlIIlIIIlIlI(String var17, String var8) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var12 = llIIIIllll[2];
        char[] var7 = var17.toCharArray();
        int var14 = var7.length;
        int var13 = llIIIIllll[2];
        while (t.lIlIIlIIlIIIl(var13, var14)) {
            char var4 = var7[var13];
            var18.append((char)(var4 ^ var10[var12 % var10.length]));
            0;
            ++var12;
            ++var13;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIlIIlIIlIIII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) && t.lIlIIlIIlIlII(cG) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIIIIllll[42]) && t.lIlIIlIIlIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) {
            String[] stringArray = new String[llIIIIllll[0]];
            stringArray[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[45]];
            if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIIllll[0]];
                stringArray2[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[46]];
                if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIIIIllll[0]];
                    stringArray3[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[47]];
                    if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        String[] stringArray4 = new String[llIIIIllll[0]];
                        stringArray4[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[48]];
                        if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray4) ? 1 : 0) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.SLAYER), llIIIIllll[7])) {
                            n2 = llIIIIllll[0];
                            0;
                            if (1 >= 0) return n2 != 0;
                            return ((0x53 ^ 0x55 ^ (0x68 ^ 0x49)) & (0xA ^ 0x34 ^ (0x1D ^ 4) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = llIIIIllll[2];
        return n2 != 0;
    }

    private static void lIlIIlIIIllll() {
        llIIIIllll = new int[51];
        t.llIIIIllll[0] = 1;
        t.llIIIIllll[1] = 0x13 ^ 0x1B ^ (0x87 ^ 0x8A);
        t.llIIIIllll[2] = (0xC5 ^ 0xA0 ^ (0x24 ^ 0x51)) & (0x7B ^ 0x4D ^ (0xAA ^ 0x8C) ^ -1);
        t.llIIIIllll[3] = 2;
        t.llIIIIllll[4] = 3;
        t.llIIIIllll[5] = 0xA2 ^ 0xA6;
        t.llIIIIllll[6] = 105 + 159 - 243 + 153 ^ 156 + 107 - 101 + 6;
        t.llIIIIllll[7] = 0x90 ^ 0xA2;
        t.llIIIIllll[8] = 0x23 ^ 0x1F ^ (0x1B ^ 0x77);
        t.llIIIIllll[9] = 0x29 ^ 0x5A ^ (0xEC ^ 0x89);
        t.llIIIIllll[10] = 0x70 ^ 0x3E ^ (0xEA ^ 0xBE);
        t.llIIIIllll[11] = 0xAB ^ 0x93;
        t.llIIIIllll[12] = 0x14 ^ 0x2A;
        t.llIIIIllll[13] = 0xA4 ^ 0xA3;
        t.llIIIIllll[14] = 0x33 ^ 0x3B;
        t.llIIIIllll[15] = 158 + 44 - 158 + 126 ^ 63 + 38 - 52 + 81;
        t.llIIIIllll[16] = 56 + 134 - 71 + 30 ^ 49 + 59 - 44 + 92;
        t.llIIIIllll[17] = 144 + 151 - 237 + 131 ^ 8 + 63 - 15 + 73;
        t.llIIIIllll[18] = 82 + 37 - 107 + 134 ^ 11 + 144 - 129 + 126;
        t.llIIIIllll[19] = 139 + 109 - 142 + 39 ^ 62 + 130 - 180 + 142;
        t.llIIIIllll[20] = 4 + 187 - 101 + 150;
        t.llIIIIllll[21] = 0x8B ^ 0x96 ^ (0x23 ^ 0x32);
        t.llIIIIllll[22] = 0x22 ^ 0x6F ^ (0x38 ^ 0x33);
        t.llIIIIllll[23] = 0x36 ^ 0x3B;
        t.llIIIIllll[24] = -(0xFFFFFEB5 & 0x33DA) & (0xFFFFF7DF & 0x3BEF);
        t.llIIIIllll[25] = 0x58 ^ 0x32 ^ (0xF5 ^ 0x91);
        t.llIIIIllll[26] = 7 ^ 0x2A ^ (0x48 ^ 0x6A);
        t.llIIIIllll[27] = 0x5E ^ 0x19 ^ (0x64 ^ 0x33);
        t.llIIIIllll[28] = 0x1F ^ 0x10 ^ (0xDE ^ 0xC0);
        t.llIIIIllll[29] = 0x44 ^ 0x56;
        t.llIIIIllll[30] = 0x51 ^ 0x42;
        t.llIIIIllll[31] = 44 + 100 - 30 + 29 ^ 109 + 71 - 36 + 11;
        t.llIIIIllll[32] = 0x2C ^ 0x1E ^ (0xA1 ^ 0x86);
        t.llIIIIllll[33] = 0xA1 ^ 0xB6;
        t.llIIIIllll[34] = 0x8A ^ 0x93 ^ 1;
        t.llIIIIllll[35] = 0x63 ^ 0x7A;
        t.llIIIIllll[36] = 73 + 135 - 55 + 12;
        t.llIIIIllll[37] = 0x31 ^ 0x68 ^ (0xE1 ^ 0xA3);
        t.llIIIIllll[38] = 0x51 ^ 0x2F ^ (0x39 ^ 0x5B);
        t.llIIIIllll[39] = 0x7F ^ 0x3C ^ (0xF9 ^ 0xA7);
        t.llIIIIllll[40] = 0xDE ^ 0xC0;
        t.llIIIIllll[41] = 0xB7 ^ 0xA8;
        t.llIIIIllll[42] = 56 + 5 - -58 + 19;
        t.llIIIIllll[43] = 0xE0 ^ 0xC0;
        t.llIIIIllll[44] = 0xDC ^ 0xB8;
        t.llIIIIllll[45] = 0x83 ^ 0x8A ^ (0xE9 ^ 0xC1);
        t.llIIIIllll[46] = 3 ^ (0xE7 ^ 0xC6);
        t.llIIIIllll[47] = 156 + 91 - 128 + 66 ^ 73 + 141 - 118 + 58;
        t.llIIIIllll[48] = 0xAD ^ 0x89;
        t.llIIIIllll[49] = 0x54 ^ 0x71;
        t.llIIIIllll[50] = 0x6D ^ 0x5E ^ (0x3B ^ 0x2E);
    }

    private static void lIlIIlIIIlllI() {
        llIIIIllIl = new String[llIIIIllll[50]];
        t.llIIIIllIl[t.llIIIIllll[2]] = t."none";
        t.llIIIIllIl[t.llIIIIllll[0]] = t."Disabling GE warning";
        t.llIIIIllIl[t.llIIIIllll[3]] = t."Thieving";
        t.llIIIIllIl[t.llIIIIllll[4]] = t."Agility";
        t.llIIIIllIl[t.llIIIIllll[5]] = t."Construction";
        t.llIIIIllIl[t.llIIIIllll[1]] = t."Mining";
        t.llIIIIllIl[t.llIIIIllll[6]] = t."Crafting";
        t.llIIIIllIl[t.llIIIIllll[13]] = t."Woodcutting";
        t.llIIIIllIl[t.llIIIIllll[14]] = t."Magic training";
        t.llIIIIllIl[t.llIIIIllll[16]] = t."Herblore";
        t.llIIIIllIl[t.llIIIIllll[18]] = t."Fletching";
        t.llIIIIllIl[t.llIIIIllll[19]] = t."Range training";
        t.llIIIIllIl[t.llIIIIllll[21]] = t."Animal magnetism";
        t.llIIIIllIl[t.llIIIIllll[23]] = t."Range training";
        t.llIIIIllIl[t.llIIIIllll[25]] = t."Tome of experience (3)";
        t.llIIIIllIl[t.llIIIIllll[26]] = t."Tome of experience (2)";
        t.llIIIIllIl[t.llIIIIllll[27]] = t."Tome of experience (1)";
        t.llIIIIllIl[t.llIIIIllll[28]] = t."Darkness of Hallowvale questline";
        t.llIIIIllIl[t.llIIIIllll[29]] = t."Tome of experience (3)";
        t.llIIIIllIl[t.llIIIIllll[30]] = t."Tome of experience (2)";
        t.llIIIIllIl[t.llIIIIllll[31]] = t."Tome of experience (1)";
        t.llIIIIllIl[t.llIIIIllll[32]] = t."Temple Trek";
        t.llIIIIllIl[t.llIIIIllll[9]] = t."xp";
        t.llIIIIllIl[t.llIIIIllll[33]] = t."Tome of experience (3)";
        t.llIIIIllIl[t.llIIIIllll[34]] = t."Tome of experience (2)";
        t.llIIIIllIl[t.llIIIIllll[35]] = t."Tome of experience (1)";
        t.llIIIIllIl[t.llIIIIllll[10]] = t."Tome of experience";
        t.llIIIIllIl[t.llIIIIllll[37]] = t."A Taste of Hope";
        t.llIIIIllIl[t.llIIIIllll[38]] = t."Tome of experience (3)";
        t.llIIIIllIl[t.llIIIIllll[39]] = t."Tome of experience (2)";
        t.llIIIIllIl[t.llIIIIllll[40]] = t."Tome of experience (1)";
        t.llIIIIllIl[t.llIIIIllll[41]] = t."Tome of experience";
        t.llIIIIllIl[t.llIIIIllll[43]] = t."Sins of the Father";
        t.llIIIIllIl[t.llIIIIllll[45]] = t."Tome of experience";
        t.llIIIIllIl[t.llIIIIllll[46]] = t."Tome of experience (3)";
        t.llIIIIllIl[t.llIIIIllll[47]] = t."Tome of experience (2)";
        t.llIIIIllIl[t.llIIIIllll[48]] = t."Tome of experience (1)";
        t.llIIIIllIl[t.llIIIIllll[49]] = t."";
    }

    private static boolean lIlIIlIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aW() {
        block36: {
            block39: {
                block40: {
                    block37: {
                        block38: {
                            if (t.lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) && t.lIlIIlIIlIIIl(cG, llIIIIllll[0])) {
                                ac[] acArray = new ac[llIIIIllll[1]];
                                acArray[t.llIIIIllll[2]] = new P();
                                acArray[t.llIIIIllll[0]] = new Z();
                                acArray[t.llIIIIllll[3]] = new W();
                                acArray[t.llIIIIllll[4]] = new V();
                                acArray[t.llIIIIllll[5]] = new T();
                                List<ac> list = Arrays.asList(acArray);
                                ac[] acArray2 = new ac[llIIIIllll[1]];
                                acArray2[t.llIIIIllll[2]] = new M();
                                acArray2[t.llIIIIllll[0]] = new A();
                                acArray2[t.llIIIIllll[3]] = new R();
                                acArray2[t.llIIIIllll[4]] = new aa();
                                acArray2[t.llIIIIllll[5]] = new H();
                                List<ac> list2 = Arrays.asList(acArray2);
                                ac[] acArray3 = new ac[llIIIIllll[4]];
                                acArray3[t.llIIIIllll[2]] = new G();
                                acArray3[t.llIIIIllll[0]] = new ak();
                                acArray3[t.llIIIIllll[3]] = new w();
                                List<ac> list3 = Arrays.asList(acArray3);
                                ac[] acArray4 = new ac[llIIIIllll[6]];
                                acArray4[t.llIIIIllll[2]] = new at();
                                acArray4[t.llIIIIllll[0]] = new ad();
                                acArray4[t.llIIIIllll[3]] = new af();
                                acArray4[t.llIIIIllll[4]] = new ao();
                                acArray4[t.llIIIIllll[5]] = new E();
                                acArray4[t.llIIIIllll[1]] = new an();
                                List<ac> list4 = Arrays.asList(acArray4);
                                ac[] acArray5 = new ac[llIIIIllll[3]];
                                acArray5[t.llIIIIllll[2]] = new ag();
                                acArray5[t.llIIIIllll[0]] = new D();
                                List<ac> list5 = Arrays.asList(acArray5);
                                ac[] acArray6 = new ac[llIIIIllll[1]];
                                acArray6[t.llIIIIllll[2]] = new aj();
                                acArray6[t.llIIIIllll[0]] = new ai();
                                acArray6[t.llIIIIllll[3]] = new w();
                                acArray6[t.llIIIIllll[4]] = new au();
                                acArray6[t.llIIIIllll[5]] = new y();
                                List<ac> list6 = Arrays.asList(acArray6);
                                ac[] acArray7 = new ac[llIIIIllll[3]];
                                acArray7[t.llIIIIllll[2]] = new aq();
                                acArray7[t.llIIIIllll[0]] = new ar();
                                List<ac> list7 = Arrays.asList(acArray7);
                                Collections.shuffle(list);
                                Collections.shuffle(list2);
                                Collections.shuffle(list3);
                                Collections.shuffle(list4);
                                Collections.shuffle(list5);
                                Collections.shuffle(list6);
                                Collections.shuffle(list7);
                                dc.addAll(list);
                                0;
                                dc.add(new O());
                                0;
                                dc.addAll(list2);
                                0;
                                dc.add(new U());
                                0;
                                dc.add(new ah());
                                0;
                                dc.addAll(list3);
                                0;
                                dc.addAll(list4);
                                0;
                                dc.addAll(list5);
                                0;
                                dc.addAll(list6);
                                0;
                                dc.addAll(list7);
                                0;
                                dc.add(new v());
                                0;
                                dc.add(new L());
                                0;
                                cG += llIIIIllll[0];
                                if (t.lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0)) {
                                    if (t.lIlIIlIIlIIII(dd ? 1 : 0)) {
                                        Collections.shuffle(dc);
                                    }
                                    System.out.println("Switching to : " + dc.get(llIIIIllll[2]).ag());
                                    h = dc.get(llIIIIllll[2]).ag();
                                }
                            }
                            while (t.lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0) && t.lIlIIlIIlIIlI(AccBuilderSotf.d ? 1 : 0)) {
                                if (!t.lIlIIlIIlIIll(Game.getState(), GameState.LOGGED_IN)) continue;
                                if (t.lIlIIlIIlIIII(dc.get(llIIIIllll[2]).ah() ? 1 : 0)) {
                                    AccBuilderSotf.f += llIIIIllll[0];
                                    System.out.println("Achieved " + dc.get(llIIIIllll[2]).ag() + " goal");
                                    dc.remove(llIIIIllll[2]);
                                    0;
                                    if (t.lIlIIlIIlIIlI(dc.isEmpty() ? 1 : 0)) {
                                        System.out.println("Switching to : " + dc.get(llIIIIllll[2]).ag());
                                        h = dc.get(llIIIIllll[2]).ag();
                                    }
                                    if (t.lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0)) {
                                        h = llIIIIllIl[llIIIIllll[2]];
                                    }
                                    Time.sleepTicks((int)llIIIIllll[5]);
                                    0;
                                }
                                if (t.lIlIIlIIlIIll(Game.getState(), GameState.LOGGED_IN)) {
                                    while (t.lIlIIlIIlIIII(e.z() ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIIIllIl[llIIIIllll[0]];
                                        e.A();
                                        Time.sleepTicks((int)llIIIIllll[0]);
                                        0;
                                        0;
                                        if (((0x86 ^ 0x9E) & ~(0x10 ^ 8)) >= -1) continue;
                                        return;
                                    }
                                    AccBuilderSotf.l = dc.get(llIIIIllll[2]).ag();
                                    int var19 = dc.get(llIIIIllll[2]).af();
                                    Time.sleep((long)var19);
                                    0;
                                    Time.sleep((long)e.c(llIIIIllll[7], llIIIIllll[8]));
                                    0;
                                }
                                e.G();
                                0;
                                if (2 > 0) continue;
                                return;
                            }
                            if (!t.lIlIIlIIlIIII(dc.isEmpty() ? 1 : 0) || !t.lIlIIlIIlIlII(cG)) break block36;
                            if (t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[3]];
                                aE.gm();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[4]];
                                av.eA();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[5]];
                                aw.eH();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[1]];
                                aC.fQ();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[6]];
                                ay.fi();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[13]];
                                aF.gs();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[14]];
                                m.ak();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[16]];
                                aB.fL();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[18]];
                                aA.fv();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[7])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[19]];
                                n.aA();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[7]) && t.lIlIIlIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[21]];
                                w.bf();
                            }
                            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[7]) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[22]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[23]];
                                n.aA();
                            }
                            if (!t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[22]) || !t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20])) break block37;
                            if (!t.lIlIIlIIlIlIl(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) break block38;
                            String[] stringArray = new String[llIIIIllll[0]];
                            stringArray[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[25]];
                            if (!t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block38;
                            String[] stringArray2 = new String[llIIIIllll[0]];
                            stringArray2[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[26]];
                            if (!t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block38;
                            String[] stringArray3 = new String[llIIIIllll[0]];
                            stringArray3[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[27]];
                            if (!t.lIlIIlIIlIIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block37;
                        }
                        AccBuilderSotf.l = llIIIIllIl[llIIIIllll[28]];
                        y.bl();
                    }
                    if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[22]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                        String[] stringArray = new String[llIIIIllll[0]];
                        stringArray[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[29]];
                        if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray4 = new String[llIIIIllll[0]];
                            stringArray4[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[30]];
                            if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                String[] stringArray5 = new String[llIIIIllll[0]];
                                stringArray5[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[31]];
                                if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray5) ? 1 : 0) && t.lIlIIlIIlIIIl(Skills.getLevel((Skill)Skill.SLAYER), llIIIIllll[7])) {
                                    AccBuilderSotf.l = llIIIIllIl[llIIIIllll[32]];
                                    ar.t(llIIIIllIl[llIIIIllll[9]]);
                                    ar.gb();
                                }
                            }
                        }
                    }
                    if (!t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[22]) || !t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) || !t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) break block39;
                    String[] stringArray = new String[llIIIIllll[0]];
                    stringArray[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[33]];
                    if (!t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block39;
                    String[] stringArray6 = new String[llIIIIllll[0]];
                    stringArray6[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[34]];
                    if (!t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) break block39;
                    String[] stringArray7 = new String[llIIIIllll[0]];
                    stringArray7[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[35]];
                    if (!t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray7) ? 1 : 0) || !t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.SLAYER), llIIIIllll[7])) break block39;
                    if (!t.lIlIIlIIlIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) break block40;
                    String[] stringArray8 = new String[llIIIIllll[0]];
                    stringArray8[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[10]];
                    if (!t.lIlIIlIIlIIII(Inventory.contains((String[])stringArray8) ? 1 : 0)) break block39;
                }
                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[37]];
                v.aZ();
            }
            if (t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.THIEVING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIllll[10]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIIllll[1]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MINING), llIIIIllll[9]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIIIllll[11]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIIIIllll[12]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIIIllll[15]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.FLETCHING), llIIIIllll[17]) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIIIllll[22]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIIIllll[20]) && t.lIlIIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIIIIllll[24])) {
                String[] stringArray = new String[llIIIIllll[0]];
                stringArray[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[38]];
                if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llIIIIllll[0]];
                    stringArray9[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[39]];
                    if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        String[] stringArray10 = new String[llIIIIllll[0]];
                        stringArray10[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[40]];
                        if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray10) ? 1 : 0) && t.lIlIIlIIlIlIl(Skills.getLevel((Skill)Skill.SLAYER), llIIIIllll[7]) && t.lIlIIlIIlIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), llIIIIllll[36])) {
                            String[] stringArray11 = new String[llIIIIllll[0]];
                            stringArray11[t.llIIIIllll[2]] = llIIIIllIl[llIIIIllll[41]];
                            if (t.lIlIIlIIlIIlI(Inventory.contains((String[])stringArray11) ? 1 : 0) && t.lIlIIlIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIIIIllll[42])) {
                                AccBuilderSotf.l = llIIIIllIl[llIIIIllll[43]];
                                L.cB();
                            }
                        }
                    }
                }
            }
        }
    }
}

