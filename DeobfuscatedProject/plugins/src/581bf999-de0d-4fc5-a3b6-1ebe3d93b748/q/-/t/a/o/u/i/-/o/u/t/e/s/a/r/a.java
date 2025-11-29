/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.b;

public final class a
extends Enum<a> {
    private final /* synthetic */ int boostAmount;
    private final /* synthetic */ int percentage;
    private static /* synthetic */ int[] llIlIlIIllI;
    public static final /* synthetic */ /* enum */ a ANCIENT_BREW;
    public static final /* synthetic */ /* enum */ a DIVINE_MAGIC_POTION;
    public static final /* synthetic */ /* enum */ a SUPER_DEFENCE;
    public static final /* synthetic */ /* enum */ a DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ a SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ a SUPER_ATTACK;
    private final /* synthetic */ String name;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ /* enum */ a BASTION_POTION;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a RANGING_POTION;
    private static /* synthetic */ String[] llIlIlIIIIl;
    public static final /* synthetic */ /* enum */ a DIVINE_RANGING_POTION;
    public static final /* synthetic */ /* enum */ a MAGIC_POTION;
    public static final /* synthetic */ /* enum */ a SUPER_STRENGTH;

    private static boolean lIlIIllIllIlIl(int n2) {
        return n2 != 0;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / llIlIlIIllI[2];
    }

    private static boolean lIlIIllIllIIll(Object object) {
        return object == null;
    }

    private static void lIlIIllIllIIlI() {
        llIlIlIIllI = new int[24];
        a.llIlIlIIllI[0] = (0x57 ^ 0x51) & ~(0x74 ^ 0x72);
        a.llIlIlIIllI[1] = " ".length();
        a.llIlIlIIllI[2] = 0xF ^ 0x6B;
        a.llIlIlIIllI[3] = 0x54 ^ 0x51;
        a.llIlIlIIllI[4] = 0xA9 ^ 0xA6;
        a.llIlIlIIllI[5] = "   ".length();
        a.llIlIlIIllI[6] = "  ".length();
        a.llIlIlIIllI[7] = 0x7A ^ 0x7E;
        a.llIlIlIIllI[8] = 0x77 ^ 0x29 ^ (0x68 ^ 0x30);
        a.llIlIlIIllI[9] = 0x73 ^ 0x74;
        a.llIlIlIIllI[10] = 0x92 ^ 0x9A;
        a.llIlIlIIllI[11] = 0x6A ^ 0x63;
        a.llIlIlIIllI[12] = 0xA9 ^ 0xA3;
        a.llIlIlIIllI[13] = 53 + 129 - 31 + 21 ^ 96 + 33 - 84 + 122;
        a.llIlIlIIllI[14] = 168 + 27 - 132 + 139 ^ 76 + 115 - 6 + 13;
        a.llIlIlIIllI[15] = 0x44 ^ 0x49;
        a.llIlIlIIllI[16] = 127 + 101 - 145 + 97 ^ 31 + 107 - 50 + 98;
        a.llIlIlIIllI[17] = 77 + 29 - -36 + 44 ^ 114 + 49 - 133 + 140;
        a.llIlIlIIllI[18] = 0x72 ^ 0x1D ^ (0xE9 ^ 0x97);
        a.llIlIlIIllI[19] = 0x3B ^ 0x29;
        a.llIlIlIIllI[20] = 54 + 50 - 90 + 168 ^ 72 + 13 - -11 + 69;
        a.llIlIlIIllI[21] = 0x4F ^ 0x42 ^ (0x69 ^ 0x70);
        a.llIlIlIIllI[22] = 0x4C ^ 0x59;
        a.llIlIlIIllI[23] = 82 + 105 - 69 + 20 ^ 41 + 34 - 61 + 142;
    }

    private a(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    public Skill[] m() {
        return this.skills;
    }

    /*
     * WARNING - void declaration
     */
    public static a[] a(Item item) {
        void var2_2;
        Item llllllllllllllllIIllIIlllIIllIlI;
        if (a.lIlIIllIllIIll(item)) {
            return new a[llIlIlIIllI[0]];
        }
        WeaponStyle llllllllllllllllIIllIIlllIIllIIl = WeaponMap.StyleMap.getOrDefault(llllllllllllllllIIllIIlllIIllIlI.getId(), WeaponStyle.MELEE);
        ArrayList<a> llllllllllllllllIIllIIlllIIllIII = new ArrayList<a>();
        a[] llllllllllllllllIIllIIlllIIlIlll = a.values();
        int llllllllllllllllIIllIIlllIIlIllI = llllllllllllllllIIllIIlllIIlIlll.length;
        int llllllllllllllllIIllIIlllIIlIlIl = llIlIlIIllI[0];
        while (a.lIlIIllIllIlII(llllllllllllllllIIllIIlllIIlIlIl, llllllllllllllllIIllIIlllIIlIllI)) {
            a llllllllllllllllIIllIIlllIIlIlII = llllllllllllllllIIllIIlllIIlIlll[llllllllllllllllIIllIIlllIIlIlIl];
            Skill[] llllllllllllllllIIllIIlllIIlIIll = llllllllllllllllIIllIIlllIIlIlII.m();
            int llllllllllllllllIIllIIlllIIlIIlI = llllllllllllllllIIllIIlllIIlIIll.length;
            int llllllllllllllllIIllIIlllIIlIIIl = llIlIlIIllI[0];
            while (a.lIlIIllIllIlII(llllllllllllllllIIllIIlllIIlIIIl, llllllllllllllllIIllIIlllIIlIIlI)) {
                Skill llllllllllllllllIIllIIlllIIlIIII = llllllllllllllllIIllIIlllIIlIIll[llllllllllllllllIIllIIlllIIlIIIl];
                if (a.lIlIIllIllIlIl(a.a(llllllllllllllllIIllIIlllIIlIIII, llllllllllllllllIIllIIlllIIllIIl) ? 1 : 0)) {
                    llllllllllllllllIIllIIlllIIllIII.add(llllllllllllllllIIllIIlllIIlIlII);
                    "".length();
                    "".length();
                    if (-" ".length() != "   ".length()) break;
                    return null;
                }
                ++llllllllllllllllIIllIIlllIIlIIIl;
                "".length();
                if ("   ".length() > 0) continue;
                return null;
            }
            ++llllllllllllllllIIllIIlllIIlIlIl;
            "".length();
            if ("  ".length() < "   ".length()) continue;
            return null;
        }
        return var2_2.toArray(new a[llIlIlIIllI[0]]);
    }

    private static void lIlIIllIIllIll() {
        llIlIlIIIIl = new String[llIlIlIIllI[23]];
        a.llIlIlIIIIl[a.llIlIlIIllI[0]] = a.lIlIIllIIllIII("tbzAgjwH3GF1ZCuemm2QoQ==", "MoqGY");
        a.llIlIlIIIIl[a.llIlIlIIllI[1]] = a.lIlIIllIIllIIl("MA0oEjhDGzcaKAIMeAclFxE3GQ==", "cxXwJ");
        a.llIlIlIIIIl[a.llIlIlIIllI[6]] = a.lIlIIllIIllIII("EXiavlvZ7xBN2+j+F9gGqZL66MXlDX8o", "Zyqjs");
        a.llIlIlIIIIl[a.llIlIlIIllI[5]] = a.lIlIIllIIllIIl("Ez0BGh8ydAQGATImVxAeOjYWB1EnOwMaHjk=", "WTwsq");
        a.llIlIlIIIIl[a.llIlIlIIllI[7]] = a.lIlIIllIIllIIl("ABAyByMMFjYQNB0CNgo=", "SEbBq");
        a.llIlIlIIIIl[a.llIlIlIIllI[3]] = a.lIlIIllIIllIlI("1dE04SYlecAmcu+kUeeSpg==", "Pmmez");
        a.llIlIlIIIIl[a.llIlIlIIllI[8]] = a.lIlIIllIIllIlI("5AvcVdtb5hohSMEKqpou+Q==", "UQRmr");
        a.llIlIlIIIIl[a.llIlIlIIllI[9]] = a.lIlIIllIIllIII("TEuONwZBc5J1dCpPmIPO1Q==", "NAhJk");
        a.llIlIlIIIIl[a.llIlIlIIllI[10]] = a.lIlIIllIIllIIl("PyYzPRgzNyY+DyIwJg==", "lscxJ");
        a.llIlIlIIIIl[a.llIlIlIIllI[11]] = a.lIlIIllIIllIIl("HwYeIgJsFwshFSIQCw==", "LsnGp");
        a.llIlIlIIIIl[a.llIlIlIIllI[12]] = a.lIlIIllIIllIII("ffAu/vfZkcNIWspV8m4JNA==", "TxgnX");
        a.llIlIlIIIIl[a.llIlIlIIllI[13]] = a.lIlIIllIIllIIl("PSwMECwBKkIHKhskDRk=", "oMbwE");
        a.llIlIlIIIIl[a.llIlIlIIllI[14]] = a.lIlIIllIIllIIl("My8UHx0yORAXHTAvDBEMJykWHxw5", "wfBVS");
        a.llIlIlIIIIl[a.llIlIlIIllI[15]] = a.lIlIIllIIllIII("Kg+jL6UcUXGU+bndt1uP2Te3B34i7JMl", "mVpsn");
        a.llIlIlIIIIl[a.llIlIlIIllI[16]] = a.lIlIIllIIllIlI("xN1Cohb3bIu8OiIvfhpdzw==", "HZtmT");
        a.llIlIlIIIIl[a.llIlIlIIllI[4]] = a.lIlIIllIIllIII("zySnE0yJ0A15f+ydw31Z0w==", "KSkQc");
        a.llIlIlIIIIl[a.llIlIlIIllI[17]] = a.lIlIIllIIllIlI("WN5jSm+5PIsLLUll6oPRXw==", "JqKin");
        a.llIlIlIIIIl[a.llIlIlIIllI[18]] = a.lIlIIllIIllIlI("/+J5m+sNZrnzu/bjdW96VA==", "thkJd");
        a.llIlIlIIIIl[a.llIlIlIIllI[19]] = a.lIlIIllIIllIII("JSeSsTmZiQy1xQbbnbPw+jwDbc0/H1dk", "slgrp");
        a.llIlIlIIIIl[a.llIlIlIIllI[20]] = a.lIlIIllIIllIII("5SScqzJQdH8VlPmMBHp+JLF+TYsfjPwZ", "TRpGK");
        a.llIlIlIIIIl[a.llIlIlIIllI[21]] = a.lIlIIllIIllIII("R1HZEl6h+OIhrL0EWYr84w==", "sHNSG");
        a.llIlIlIIIIl[a.llIlIlIIllI[22]] = a.lIlIIllIIllIlI("0tmmNEtEIgskV9jZ+UxZFw==", "EtJHc");
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Skill skill, WeaponStyle weaponStyle) {
        switch (b.C[skill.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                boolean bl2;
                void llllllllllllllllIIllIIlllIIIllII;
                if (a.lIlIIllIllIllI(llllllllllllllllIIllIIlllIIIllII, WeaponStyle.MELEE)) {
                    bl2 = llIlIlIIllI[1];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x97 ^ 0xC3) & ~(0x92 ^ 0xC6)) != 0;
                    }
                } else {
                    bl2 = llIlIlIIllI[0];
                }
                return bl2;
            }
            case 4: {
                boolean bl3;
                void llllllllllllllllIIllIIlllIIIllII;
                if (a.lIlIIllIllIllI(llllllllllllllllIIllIIlllIIIllII, WeaponStyle.RANGE)) {
                    bl3 = llIlIlIIllI[1];
                    "".length();
                    if (((0xCC ^ 0x82 ^ (0x17 ^ 0x65)) & (128 + 34 - 37 + 64 ^ 48 + 94 - 81 + 68 ^ -" ".length())) != 0) {
                        return ((0x5B ^ 0x74 ^ (0x1B ^ 0x13)) & (0x35 ^ 0x23 ^ (0x27 ^ 0x16) ^ -" ".length())) != 0;
                    }
                } else {
                    bl3 = llIlIlIIllI[0];
                }
                return bl3;
            }
            case 5: {
                boolean bl4;
                void llllllllllllllllIIllIIlllIIIllII;
                if (a.lIlIIllIllIllI(llllllllllllllllIIllIIlllIIIllII, WeaponStyle.MAGIC)) {
                    bl4 = llIlIlIIllI[1];
                    "".length();
                    if (null != null) {
                        return ((3 ^ 0x4F ^ (0x50 ^ 0x4B)) & (0x3A ^ 0x75 ^ (0x8A ^ 0x92) ^ -" ".length())) != 0;
                    }
                } else {
                    bl4 = llIlIlIIllI[0];
                }
                return bl4;
            }
        }
        return llIlIlIIllI[0];
    }

    public String l() {
        return this.name;
    }

    private static String lIlIIllIIllIlI(String llllllllllllllllIIllIIlllIIIIIlI, String llllllllllllllllIIllIIlllIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIIllI[10]), "DES");
            Cipher llllllllllllllllIIllIIlllIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlllIIIIllI.init(llIlIlIIllI[6], llllllllllllllllIIllIIlllIIIIlll);
            return new String(llllllllllllllllIIllIIlllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIlllIIIIlIl) {
            llllllllllllllllIIllIIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIIllIIl(String llllllllllllllllIIllIIllIllIIlll, String llllllllllllllllIIllIIllIllIIIIl) {
        llllllllllllllllIIllIIllIllIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIllIllIIlIl = new StringBuilder();
        char[] llllllllllllllllIIllIIllIllIIlII = llllllllllllllllIIllIIllIllIIIIl.toCharArray();
        int llllllllllllllllIIllIIllIllIIIll = llIlIlIIllI[0];
        char[] llllllllllllllllIIllIIllIlIlllIl = llllllllllllllllIIllIIllIllIIlll.toCharArray();
        int llllllllllllllllIIllIIllIlIlllII = llllllllllllllllIIllIIllIlIlllIl.length;
        int llllllllllllllllIIllIIllIlIllIll = llIlIlIIllI[0];
        while (a.lIlIIllIllIlII(llllllllllllllllIIllIIllIlIllIll, llllllllllllllllIIllIIllIlIlllII)) {
            char llllllllllllllllIIllIIllIllIlIII = llllllllllllllllIIllIIllIlIlllIl[llllllllllllllllIIllIIllIlIllIll];
            llllllllllllllllIIllIIllIllIIlIl.append((char)(llllllllllllllllIIllIIllIllIlIII ^ llllllllllllllllIIllIIllIllIIlII[llllllllllllllllIIllIIllIllIIIll % llllllllllllllllIIllIIllIllIIlII.length]));
            "".length();
            ++llllllllllllllllIIllIIllIllIIIll;
            ++llllllllllllllllIIllIIllIlIllIll;
            "".length();
            if (((66 + 99 - 131 + 164 ^ 46 + 42 - -49 + 5) & (0xC5 ^ 0x97 ^ (0x2D ^ 0x37) ^ -" ".length())) >= ((23 + 5 - -87 + 102 ^ 71 + 32 - -33 + 48) & (10 + 57 - -145 + 8 ^ 117 + 69 - 147 + 150 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIllIllIIlIl);
    }

    private static boolean lIlIIllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static String lIlIIllIIllIII(String llllllllllllllllIIllIIllIlllIlll, String llllllllllllllllIIllIIllIlllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIllIllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIllIllllIIl.init(llIlIlIIllI[6], llllllllllllllllIIllIIllIllllIlI);
            return new String(llllllllllllllllIIllIIllIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIllIllllIII) {
            llllllllllllllllIIllIIllIllllIII.printStackTrace();
            return null;
        }
    }

    static {
        a.lIlIIllIllIIlI();
        a.lIlIIllIIllIll();
        Skill[] skillArray = new Skill[llIlIlIIllI[5]];
        skillArray[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArray[a.llIlIlIIllI[1]] = Skill.ATTACK;
        skillArray[a.llIlIlIIllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new a(llIlIlIIIIl[llIlIlIIllI[1]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray);
        Skill[] skillArray2 = new Skill[llIlIlIIllI[5]];
        skillArray2[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArray2[a.llIlIlIIllI[1]] = Skill.ATTACK;
        skillArray2[a.llIlIlIIllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new a(llIlIlIIIIl[llIlIlIIllI[5]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray2);
        Skill[] skillArray3 = new Skill[llIlIlIIllI[1]];
        skillArray3[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        SUPER_STRENGTH = new a(llIlIlIIIIl[llIlIlIIllI[3]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray3);
        Skill[] skillArray4 = new Skill[llIlIlIIllI[1]];
        skillArray4[a.llIlIlIIllI[0]] = Skill.ATTACK;
        SUPER_ATTACK = new a(llIlIlIIIIl[llIlIlIIllI[9]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray4);
        Skill[] skillArray5 = new Skill[llIlIlIIllI[1]];
        skillArray5[a.llIlIlIIllI[0]] = Skill.DEFENCE;
        SUPER_DEFENCE = new a(llIlIlIIIIl[llIlIlIIllI[11]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray5);
        Skill[] skillArray6 = new Skill[llIlIlIIllI[1]];
        skillArray6[a.llIlIlIIllI[0]] = Skill.RANGED;
        RANGING_POTION = new a(llIlIlIIIIl[llIlIlIIllI[13]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray6);
        Skill[] skillArray7 = new Skill[llIlIlIIllI[1]];
        skillArray7[a.llIlIlIIllI[0]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new a(llIlIlIIIIl[llIlIlIIllI[15]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray7);
        Skill[] skillArray8 = new Skill[llIlIlIIllI[6]];
        skillArray8[a.llIlIlIIllI[0]] = Skill.RANGED;
        skillArray8[a.llIlIlIIllI[1]] = Skill.DEFENCE;
        BASTION_POTION = new a(llIlIlIIIIl[llIlIlIIllI[4]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray8);
        Skill[] skillArray9 = new Skill[llIlIlIIllI[1]];
        skillArray9[a.llIlIlIIllI[0]] = Skill.MAGIC;
        MAGIC_POTION = new a(llIlIlIIIIl[llIlIlIIllI[18]], llIlIlIIllI[7], llIlIlIIllI[0], skillArray9);
        Skill[] skillArray10 = new Skill[llIlIlIIllI[1]];
        skillArray10[a.llIlIlIIllI[0]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new a(llIlIlIIIIl[llIlIlIIllI[20]], llIlIlIIllI[7], llIlIlIIllI[0], skillArray10);
        Skill[] skillArray11 = new Skill[llIlIlIIllI[1]];
        skillArray11[a.llIlIlIIllI[0]] = Skill.MAGIC;
        ANCIENT_BREW = new a(llIlIlIIIIl[llIlIlIIllI[22]], llIlIlIIllI[6], llIlIlIIllI[3], skillArray11);
        a[] aArray = new a[llIlIlIIllI[13]];
        aArray[a.llIlIlIIllI[0]] = SUPER_COMBAT;
        aArray[a.llIlIlIIllI[1]] = DIVINE_SUPER_COMBAT;
        aArray[a.llIlIlIIllI[6]] = SUPER_STRENGTH;
        aArray[a.llIlIlIIllI[5]] = SUPER_ATTACK;
        aArray[a.llIlIlIIllI[7]] = SUPER_DEFENCE;
        aArray[a.llIlIlIIllI[3]] = RANGING_POTION;
        aArray[a.llIlIlIIllI[8]] = DIVINE_RANGING_POTION;
        aArray[a.llIlIlIIllI[9]] = BASTION_POTION;
        aArray[a.llIlIlIIllI[10]] = MAGIC_POTION;
        aArray[a.llIlIlIIllI[11]] = DIVINE_MAGIC_POTION;
        aArray[a.llIlIlIIllI[12]] = ANCIENT_BREW;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }
}

