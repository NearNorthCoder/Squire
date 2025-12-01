package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/c.class */
public final class EnumC0002c {
    private static /* synthetic */ int[] lIllIllIlllI;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    public static final /* synthetic */ EnumC0002c RANGING_POTION;
    public static final /* synthetic */ EnumC0002c BASTION_POTION;
    public static final /* synthetic */ EnumC0002c ANCIENT_BREW;
    private static /* synthetic */ String[] lIllIllIlIII;
    private final /* synthetic */ int boostAmount;
    public static final /* synthetic */ EnumC0002c DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ EnumC0002c SUPER_COMBAT;
    public static final /* synthetic */ EnumC0002c DIVINE_RANGING_POTION;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ EnumC0002c MAGIC_POTION;
    public static final /* synthetic */ EnumC0002c SUPER_ATTACK;
    public static final /* synthetic */ EnumC0002c SUPER_DEFENCE;
    private final /* synthetic */ int percentage;
    private final /* synthetic */ String name;
    public static final /* synthetic */ EnumC0002c SUPER_STRENGTH;
    public static final /* synthetic */ EnumC0002c DIVINE_MAGIC_POTION;
    public static final /* synthetic */ EnumC0002c DIVINE_BASTION_POTION;

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    public int a(Skill skill) {
        return this.boostAmount + ((Skills.getLevel(skill) * this.percentage) / lIllIllIlllI[0]);
    }

    private EnumC0002c(String str, int i, String str2, int i2, int i3, Skill... skillArr) {
        this.name = str2;
        this.percentage = i3;
        this.skills = skillArr;
        this.boostAmount = i2;
    }

    private static void lllIlIIlIlllIl() {
        lIllIllIlIII = new String[lIllIllIlllI[25]];
        lIllIllIlIII[lIllIllIlllI[1]] = lllIlIIlIIlllI("ADslMTMMLTo5IxI6", "Snuta");
        lIllIllIlIII[lIllIllIlllI[2]] = lllIlIIlIIllll("v61ussIfZ4vj0VFinMlSDbPV2vw1U/wr", "bwhqa");
        lIllIllIlIII[lIllIllIlllI[6]] = lllIlIIlIlIIlI("wYnMkjIpXNV/Z0aA5Fuf/A==", "gvxAx");
        lIllIllIlIII[lIllIllIlllI[5]] = lllIlIIlIlIIlI("BpXyeB/onfUS2+MGPG2a+g==", "ecCCg");
        lIllIllIlIII[lIllIllIlllI[7]] = lllIlIIlIIllll("ewRGXMFcC6pXvtz9Rac+Sg==", "SkMlO");
        lIllIllIlIII[lIllIllIlllI[3]] = lllIlIIlIlIIlI("dfwzD8U5/0knYcWqOUfZPg==", "zdUEI");
        lIllIllIlIII[lIllIllIlllI[8]] = lllIlIIlIlIIlI("3NpBBOiUraOXVPUZH2RG2g==", "kNpUv");
        lIllIllIlIII[lIllIllIlllI[9]] = lllIlIIlIIllll("K2euzNXMMBz1H4zxSPYHRQ==", "iMNQq");
        lIllIllIlIII[lIllIllIlllI[10]] = lllIlIIlIlIIlI("KTsIW4IfUekA+HVgSCyEAk0sHEH67/Sr", "FSYsW");
        lIllIllIlIII[lIllIllIlllI[11]] = lllIlIIlIIllll("56bhD58FqLS5ghx6nWyX+T6gT2yRE6vUcyyCF0Av5o4=", "oKOZo");
        lIllIllIlIII[lIllIllIlllI[12]] = lllIlIIlIlIIlI("SYDQpM/yKYFA8Kb6ORAknQ==", "AlUVV");
        lIllIllIlIII[lIllIllIlllI[13]] = lllIlIIlIIllll("9UMD8kMbNu2rnKUMQ/sqRg==", "JhnyJ");
        lIllIllIlIII[lIllIllIlllI[14]] = lllIlIIlIIllll("Lr3vDCbo1i1Xu9Oiv6J4fTcKqPHbs5hV", "FykUu");
        lIllIllIlIII[lIllIllIlllI[15]] = lllIlIIlIIllll("m69B8pArE5g0EgXh6Qddho6jvOf5j7tl", "fFbfk");
        lIllIllIlIII[lIllIllIlllI[16]] = lllIlIIlIIllll("C1I5omSc7NlpWN/q6M8k6A==", "CsHIR");
        lIllIllIlIII[lIllIllIlllI[4]] = lllIlIIlIIllll("Jlb4dbnTHU93rN9KvbMCRQ==", "hRuBT");
        lIllIllIlIII[lIllIllIlllI[17]] = lllIlIIlIIlllI("PT8hJz48KTUvIy0/OCAvKTkjJz83", "yvwnp");
        lIllIllIlIII[lIllIllIlllI[18]] = lllIlIIlIIllll("2bWF9SBhvisdVn/1SCWf0tHnrq8YtxfD", "SsLfR");
        lIllIllIlIII[lIllIllIlllI[19]] = lllIlIIlIIlllI("BBYjEDYWBysNPAYZ", "IWdYu");
        lIllIllIlIII[lIllIllIlllI[20]] = lllIlIIlIIlllI("KSQKEAVENQINDwsr", "dEmyf");
        lIllIllIlIII[lIllIllIlllI[21]] = lllIlIIlIlIIlI("NZm2Q6821vDjHxf3ovbq4ofbOIfEWJsY", "sMoWB");
        lIllIllIlIII[lIllIllIlllI[22]] = lllIlIIlIIllll("v/Js8RDUaeve/PRZnMOKRzdceBuQNRCZ", "WFvPo");
        lIllIllIlIII[lIllIllIlllI[23]] = lllIlIIlIlIIlI("CZ4ViIJRHtZBfnroCmC3Pw==", "SIzMi");
        lIllIllIlIII[lIllIllIlllI[24]] = lllIlIIlIIlllI("EyI1ET08OHYaKjc7", "RLVxX");
    }

    private static String lllIlIIlIIlllI(String lllllllllllllllIlIlllIlIlIlllIll, String lllllllllllllllIlIlllIlIlIllIlIl) {
        String lllllllllllllllIlIlllIlIlIlllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIlIlllIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIlIlIllIlIl.toCharArray();
        int lllllllllllllllIlIlllIlIlIllIlll = lIllIllIlllI[1];
        char[] charArray2 = lllllllllllllllIlIlllIlIlIlllIll2.toCharArray();
        int lllllllllllllllIlIlllIlIlIllIIII = charArray2.length;
        int i = lIllIllIlllI[1];
        while (lllIlIIllIIlIl(i, lllllllllllllllIlIlllIlIlIllIIII)) {
            lllllllllllllllIlIlllIlIlIlllIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlllIlIlIllIlll % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlIlIllIlll++;
            i++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlIlIlllIIl);
    }

    private static String lllIlIIlIIllll(String lllllllllllllllIlIlllIlIlIlIIllI, String lllllllllllllllIlIlllIlIlIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIllIlllI[10]), "DES");
            Cipher lllllllllllllllIlIlllIlIlIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIlIlIlIII.init(lIllIllIlllI[6], lllllllllllllllIlIlllIlIlIlIlIIl);
            return new String(lllllllllllllllIlIlllIlIlIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIlIlIIlll) {
            lllllllllllllllIlIlllIlIlIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIllIIlII() {
        lIllIllIlllI = new int[26];
        lIllIllIlllI[0] = (30 ^ 17) ^ (175 ^ 196);
        lIllIllIlllI[1] = (" ".length() ^ (51 ^ 122)) & (((((195 + 193) - 351) + 216) ^ (((90 + 97) - 137) + 131)) ^ (-" ".length()));
        lIllIllIlllI[2] = " ".length();
        lIllIllIlllI[3] = 74 ^ 79;
        lIllIllIlllI[4] = 45 ^ 34;
        lIllIllIlllI[5] = "   ".length();
        lIllIllIlllI[6] = "  ".length();
        lIllIllIlllI[7] = (((19 + 111) - 84) + 111) ^ (((78 + 8) - (-36)) + 31);
        lIllIllIlllI[8] = 38 ^ 32;
        lIllIllIlllI[9] = (((131 + 115) - 180) + 70) ^ (((140 + 12) - 93) + 84);
        lIllIllIlllI[10] = 66 ^ 74;
        lIllIllIlllI[11] = (129 ^ 162) ^ (38 ^ 12);
        lIllIllIlllI[12] = (((16 + 119) - (-22)) + 19) ^ (((169 + 128) - 288) + 177);
        lIllIllIlllI[13] = "   ".length() ^ (134 ^ 142);
        lIllIllIlllI[14] = 118 ^ 122;
        lIllIllIlllI[15] = (23 ^ 71) ^ (84 ^ 9);
        lIllIllIlllI[16] = 165 ^ 171;
        lIllIllIlllI[17] = 211 ^ 195;
        lIllIllIlllI[18] = (77 ^ 6) ^ (37 ^ 127);
        lIllIllIlllI[19] = (((28 + 177) - 168) + 174) ^ (((179 + 81) - 156) + 89);
        lIllIllIlllI[20] = 170 ^ 185;
        lIllIllIlllI[21] = 75 ^ 95;
        lIllIllIlllI[22] = 20 ^ 1;
        lIllIllIlllI[23] = (((51 + 76) - 9) + 53) ^ (((78 + 140) - 72) + 43);
        lIllIllIlllI[24] = 160 ^ 183;
        lIllIllIlllI[25] = (64 ^ 47) ^ (0 ^ 119);
    }

    static {
        lllIlIIllIIlII();
        lllIlIIlIlllIl();
        String str = lIllIllIlIII[lIllIllIlllI[1]];
        int i = lIllIllIlllI[1];
        String str2 = lIllIllIlIII[lIllIllIlllI[2]];
        int i2 = lIllIllIlllI[3];
        int i3 = lIllIllIlllI[4];
        Skill[] skillArr = new Skill[lIllIllIlllI[5]];
        skillArr[lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArr[lIllIllIlllI[2]] = Skill.ATTACK;
        skillArr[lIllIllIlllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new EnumC0002c(str, i, str2, i2, i3, skillArr);
        String str3 = lIllIllIlIII[lIllIllIlllI[6]];
        int i4 = lIllIllIlllI[2];
        String str4 = lIllIllIlIII[lIllIllIlllI[5]];
        int i5 = lIllIllIlllI[3];
        int i6 = lIllIllIlllI[4];
        Skill[] skillArr2 = new Skill[lIllIllIlllI[2]];
        skillArr2[lIllIllIlllI[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new EnumC0002c(str3, i4, str4, i5, i6, skillArr2);
        String str5 = lIllIllIlIII[lIllIllIlllI[7]];
        int i7 = lIllIllIlllI[6];
        String str6 = lIllIllIlIII[lIllIllIlllI[3]];
        int i8 = lIllIllIlllI[3];
        int i9 = lIllIllIlllI[4];
        Skill[] skillArr3 = new Skill[lIllIllIlllI[2]];
        skillArr3[lIllIllIlllI[1]] = Skill.ATTACK;
        SUPER_ATTACK = new EnumC0002c(str5, i7, str6, i8, i9, skillArr3);
        String str7 = lIllIllIlIII[lIllIllIlllI[8]];
        int i10 = lIllIllIlllI[5];
        String str8 = lIllIllIlIII[lIllIllIlllI[9]];
        int i11 = lIllIllIlllI[3];
        int i12 = lIllIllIlllI[4];
        Skill[] skillArr4 = new Skill[lIllIllIlllI[2]];
        skillArr4[lIllIllIlllI[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new EnumC0002c(str7, i10, str8, i11, i12, skillArr4);
        String str9 = lIllIllIlIII[lIllIllIlllI[10]];
        int i13 = lIllIllIlllI[7];
        String str10 = lIllIllIlIII[lIllIllIlllI[11]];
        int i14 = lIllIllIlllI[3];
        int i15 = lIllIllIlllI[4];
        Skill[] skillArr5 = new Skill[lIllIllIlllI[5]];
        skillArr5[lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArr5[lIllIllIlllI[2]] = Skill.ATTACK;
        skillArr5[lIllIllIlllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new EnumC0002c(str9, i13, str10, i14, i15, skillArr5);
        String str11 = lIllIllIlIII[lIllIllIlllI[12]];
        int i16 = lIllIllIlllI[3];
        String str12 = lIllIllIlIII[lIllIllIlllI[13]];
        int i17 = lIllIllIlllI[7];
        int i18 = lIllIllIlllI[12];
        Skill[] skillArr6 = new Skill[lIllIllIlllI[2]];
        skillArr6[lIllIllIlllI[1]] = Skill.RANGED;
        RANGING_POTION = new EnumC0002c(str11, i16, str12, i17, i18, skillArr6);
        String str13 = lIllIllIlIII[lIllIllIlllI[14]];
        int i19 = lIllIllIlllI[8];
        String str14 = lIllIllIlIII[lIllIllIlllI[15]];
        int i20 = lIllIllIlllI[7];
        int i21 = lIllIllIlllI[12];
        Skill[] skillArr7 = new Skill[lIllIllIlllI[2]];
        skillArr7[lIllIllIlllI[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new EnumC0002c(str13, i19, str14, i20, i21, skillArr7);
        String str15 = lIllIllIlIII[lIllIllIlllI[16]];
        int i22 = lIllIllIlllI[9];
        String str16 = lIllIllIlIII[lIllIllIlllI[4]];
        int i23 = lIllIllIlllI[7];
        int i24 = lIllIllIlllI[12];
        Skill[] skillArr8 = new Skill[lIllIllIlllI[6]];
        skillArr8[lIllIllIlllI[1]] = Skill.RANGED;
        skillArr8[lIllIllIlllI[2]] = Skill.DEFENCE;
        BASTION_POTION = new EnumC0002c(str15, i22, str16, i23, i24, skillArr8);
        String str17 = lIllIllIlIII[lIllIllIlllI[17]];
        int i25 = lIllIllIlllI[10];
        String str18 = lIllIllIlIII[lIllIllIlllI[18]];
        int i26 = lIllIllIlllI[7];
        int i27 = lIllIllIlllI[12];
        Skill[] skillArr9 = new Skill[lIllIllIlllI[6]];
        skillArr9[lIllIllIlllI[1]] = Skill.RANGED;
        skillArr9[lIllIllIlllI[2]] = Skill.DEFENCE;
        DIVINE_BASTION_POTION = new EnumC0002c(str17, i25, str18, i26, i27, skillArr9);
        String str19 = lIllIllIlIII[lIllIllIlllI[19]];
        int i28 = lIllIllIlllI[11];
        String str20 = lIllIllIlIII[lIllIllIlllI[20]];
        int i29 = lIllIllIlllI[7];
        int i30 = lIllIllIlllI[1];
        Skill[] skillArr10 = new Skill[lIllIllIlllI[2]];
        skillArr10[lIllIllIlllI[1]] = Skill.MAGIC;
        MAGIC_POTION = new EnumC0002c(str19, i28, str20, i29, i30, skillArr10);
        String str21 = lIllIllIlIII[lIllIllIlllI[21]];
        int i31 = lIllIllIlllI[12];
        String str22 = lIllIllIlIII[lIllIllIlllI[22]];
        int i32 = lIllIllIlllI[7];
        int i33 = lIllIllIlllI[1];
        Skill[] skillArr11 = new Skill[lIllIllIlllI[2]];
        skillArr11[lIllIllIlllI[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new EnumC0002c(str21, i31, str22, i32, i33, skillArr11);
        String str23 = lIllIllIlIII[lIllIllIlllI[23]];
        int i34 = lIllIllIlllI[13];
        String str24 = lIllIllIlIII[lIllIllIlllI[24]];
        int i35 = lIllIllIlllI[6];
        int i36 = lIllIllIlllI[3];
        Skill[] skillArr12 = new Skill[lIllIllIlllI[2]];
        skillArr12[lIllIllIlllI[1]] = Skill.MAGIC;
        ANCIENT_BREW = new EnumC0002c(str23, i34, str24, i35, i36, skillArr12);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIllIllIlllI[14]];
        enumC0002cArr[lIllIllIlllI[1]] = SUPER_COMBAT;
        enumC0002cArr[lIllIllIlllI[2]] = SUPER_STRENGTH;
        enumC0002cArr[lIllIllIlllI[6]] = SUPER_ATTACK;
        enumC0002cArr[lIllIllIlllI[5]] = SUPER_DEFENCE;
        enumC0002cArr[lIllIllIlllI[7]] = DIVINE_SUPER_COMBAT;
        enumC0002cArr[lIllIllIlllI[3]] = RANGING_POTION;
        enumC0002cArr[lIllIllIlllI[8]] = DIVINE_RANGING_POTION;
        enumC0002cArr[lIllIllIlllI[9]] = BASTION_POTION;
        enumC0002cArr[lIllIllIlllI[10]] = DIVINE_BASTION_POTION;
        enumC0002cArr[lIllIllIlllI[11]] = MAGIC_POTION;
        enumC0002cArr[lIllIllIlllI[12]] = DIVINE_MAGIC_POTION;
        enumC0002cArr[lIllIllIlllI[13]] = ANCIENT_BREW;
        $VALUES = enumC0002cArr;
    }

    private static String lllIlIIlIlIIlI(String lllllllllllllllIlIlllIlIlIIllIIl, String lllllllllllllllIlIlllIlIlIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlllI[6], lllllllllllllllIlIlllIlIlIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIlIIllIlI) {
            lllllllllllllllIlIlllIlIlIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIllIIlIl(int i, int i2) {
        return i < i2;
    }

    public Skill[] F() {
        return this.skills;
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    public String E() {
        return this.name;
    }
}
