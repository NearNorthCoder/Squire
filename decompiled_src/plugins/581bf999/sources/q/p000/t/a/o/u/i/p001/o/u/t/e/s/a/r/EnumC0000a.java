package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/a.class */
public final class EnumC0000a {
    private final /* synthetic */ int boostAmount;
    private final /* synthetic */ int percentage;
    private static /* synthetic */ int[] llIlIlIIllI;
    public static final /* synthetic */ EnumC0000a ANCIENT_BREW;
    public static final /* synthetic */ EnumC0000a DIVINE_MAGIC_POTION;
    public static final /* synthetic */ EnumC0000a SUPER_DEFENCE;
    public static final /* synthetic */ EnumC0000a DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ EnumC0000a SUPER_COMBAT;
    public static final /* synthetic */ EnumC0000a SUPER_ATTACK;
    private final /* synthetic */ String name;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ EnumC0000a BASTION_POTION;
    private static final /* synthetic */ EnumC0000a[] $VALUES;
    public static final /* synthetic */ EnumC0000a RANGING_POTION;
    private static /* synthetic */ String[] llIlIlIIIIl;
    public static final /* synthetic */ EnumC0000a DIVINE_RANGING_POTION;
    public static final /* synthetic */ EnumC0000a MAGIC_POTION;
    public static final /* synthetic */ EnumC0000a SUPER_STRENGTH;

    private static boolean lIlIIllIllIlIl(int i) {
        return i != 0;
    }

    public static EnumC0000a[] values() {
        return (EnumC0000a[]) $VALUES.clone();
    }

    public int a(Skill skill) {
        return this.boostAmount + ((Skills.getLevel(skill) * this.percentage) / llIlIlIIllI[2]);
    }

    private static boolean lIlIIllIllIIll(Object obj) {
        return obj == null;
    }

    private static void lIlIIllIllIIlI() {
        llIlIlIIllI = new int[24];
        llIlIlIIllI[0] = (87 ^ 81) & ((116 ^ 114) ^ (-1));
        llIlIlIIllI[1] = " ".length();
        llIlIlIIllI[2] = 15 ^ 107;
        llIlIlIIllI[3] = 84 ^ 81;
        llIlIlIIllI[4] = 169 ^ 166;
        llIlIlIIllI[5] = "   ".length();
        llIlIlIIllI[6] = "  ".length();
        llIlIlIIllI[7] = 122 ^ 126;
        llIlIlIIllI[8] = (119 ^ 41) ^ (104 ^ 48);
        llIlIlIIllI[9] = 115 ^ 116;
        llIlIlIIllI[10] = 146 ^ 154;
        llIlIlIIllI[11] = 106 ^ 99;
        llIlIlIIllI[12] = 169 ^ 163;
        llIlIlIIllI[13] = (((53 + 129) - 31) + 21) ^ (((96 + 33) - 84) + 122);
        llIlIlIIllI[14] = (((168 + 27) - 132) + 139) ^ (((76 + 115) - 6) + 13);
        llIlIlIIllI[15] = 68 ^ 73;
        llIlIlIIllI[16] = (((127 + 101) - 145) + 97) ^ (((31 + 107) - 50) + 98);
        llIlIlIIllI[17] = (((77 + 29) - (-36)) + 44) ^ (((114 + 49) - 133) + 140);
        llIlIlIIllI[18] = (114 ^ 29) ^ (233 ^ 151);
        llIlIlIIllI[19] = 59 ^ 41;
        llIlIlIIllI[20] = (((54 + 50) - 90) + 168) ^ (((72 + 13) - (-11)) + 69);
        llIlIlIIllI[21] = (79 ^ 66) ^ (105 ^ 112);
        llIlIlIIllI[22] = 76 ^ 89;
        llIlIlIIllI[23] = (((82 + 105) - 69) + 20) ^ (((41 + 34) - 61) + 142);
    }

    private EnumC0000a(String str, int i, String str2, int i2, int i3, Skill... skillArr) {
        this.name = str2;
        this.percentage = i3;
        this.skills = skillArr;
        this.boostAmount = i2;
    }

    public Skill[] m() {
        return this.skills;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
        r9 = r9 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
        if ("  ".length() < "   ".length()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC0000a[] a(Item item) {
        if (lIlIIllIllIIll(item)) {
            return new EnumC0000a[llIlIlIIllI[0]];
        }
        WeaponStyle weaponStyle = (WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(item.getId()), WeaponStyle.MELEE);
        ArrayList arrayList = new ArrayList();
        EnumC0000a[] values = values();
        int length = values.length;
        int i = llIlIlIIllI[0];
        while (lIlIIllIllIlII(i, length)) {
            EnumC0000a enumC0000a = values[i];
            Skill[] m = enumC0000a.m();
            int llllllllllllllllIIllIIlllIIlIIlI = m.length;
            int i2 = llIlIlIIllI[0];
            while (true) {
                if (!lIlIIllIllIlII(i2, llllllllllllllllIIllIIlllIIlIIlI)) {
                    break;
                } else if (lIlIIllIllIlIl(a(m[i2], weaponStyle) ? 1 : 0)) {
                    arrayList.add(enumC0000a);
                    "".length();
                    "".length();
                    if ((-" ".length()) == "   ".length()) {
                        return null;
                    }
                } else {
                    i2++;
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
            }
        }
        return (EnumC0000a[]) arrayList.toArray(new EnumC0000a[llIlIlIIllI[0]]);
    }

    private static void lIlIIllIIllIll() {
        llIlIlIIIIl = new String[llIlIlIIllI[23]];
        llIlIlIIIIl[llIlIlIIllI[0]] = lIlIIllIIllIII("tbzAgjwH3GF1ZCuemm2QoQ==", "MoqGY");
        llIlIlIIIIl[llIlIlIIllI[1]] = lIlIIllIIllIIl("MA0oEjhDGzcaKAIMeAclFxE3GQ==", "cxXwJ");
        llIlIlIIIIl[llIlIlIIllI[6]] = lIlIIllIIllIII("EXiavlvZ7xBN2+j+F9gGqZL66MXlDX8o", "Zyqjs");
        llIlIlIIIIl[llIlIlIIllI[5]] = lIlIIllIIllIIl("Ez0BGh8ydAQGATImVxAeOjYWB1EnOwMaHjk=", "WTwsq");
        llIlIlIIIIl[llIlIlIIllI[7]] = lIlIIllIIllIIl("ABAyByMMFjYQNB0CNgo=", "SEbBq");
        llIlIlIIIIl[llIlIlIIllI[3]] = lIlIIllIIllIlI("1dE04SYlecAmcu+kUeeSpg==", "Pmmez");
        llIlIlIIIIl[llIlIlIIllI[8]] = lIlIIllIIllIlI("5AvcVdtb5hohSMEKqpou+Q==", "UQRmr");
        llIlIlIIIIl[llIlIlIIllI[9]] = lIlIIllIIllIII("TEuONwZBc5J1dCpPmIPO1Q==", "NAhJk");
        llIlIlIIIIl[llIlIlIIllI[10]] = lIlIIllIIllIIl("PyYzPRgzNyY+DyIwJg==", "lscxJ");
        llIlIlIIIIl[llIlIlIIllI[11]] = lIlIIllIIllIIl("HwYeIgJsFwshFSIQCw==", "LsnGp");
        llIlIlIIIIl[llIlIlIIllI[12]] = lIlIIllIIllIII("ffAu/vfZkcNIWspV8m4JNA==", "TxgnX");
        llIlIlIIIIl[llIlIlIIllI[13]] = lIlIIllIIllIIl("PSwMECwBKkIHKhskDRk=", "oMbwE");
        llIlIlIIIIl[llIlIlIIllI[14]] = lIlIIllIIllIIl("My8UHx0yORAXHTAvDBEMJykWHxw5", "wfBVS");
        llIlIlIIIIl[llIlIlIIllI[15]] = lIlIIllIIllIII("Kg+jL6UcUXGU+bndt1uP2Te3B34i7JMl", "mVpsn");
        llIlIlIIIIl[llIlIlIIllI[16]] = lIlIIllIIllIlI("xN1Cohb3bIu8OiIvfhpdzw==", "HZtmT");
        llIlIlIIIIl[llIlIlIIllI[4]] = lIlIIllIIllIII("zySnE0yJ0A15f+ydw31Z0w==", "KSkQc");
        llIlIlIIIIl[llIlIlIIllI[17]] = lIlIIllIIllIlI("WN5jSm+5PIsLLUll6oPRXw==", "JqKin");
        llIlIlIIIIl[llIlIlIIllI[18]] = lIlIIllIIllIlI("/+J5m+sNZrnzu/bjdW96VA==", "thkJd");
        llIlIlIIIIl[llIlIlIIllI[19]] = lIlIIllIIllIII("JSeSsTmZiQy1xQbbnbPw+jwDbc0/H1dk", "slgrp");
        llIlIlIIIIl[llIlIlIIllI[20]] = lIlIIllIIllIII("5SScqzJQdH8VlPmMBHp+JLF+TYsfjPwZ", "TRpGK");
        llIlIlIIIIl[llIlIlIIllI[21]] = lIlIIllIIllIII("R1HZEl6h+OIhrL0EWYr84w==", "sHNSG");
        llIlIlIIIIl[llIlIlIIllI[22]] = lIlIIllIIllIlI("0tmmNEtEIgskV9jZ+UxZFw==", "EtJHc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public static boolean a(Skill skill, WeaponStyle weaponStyle) {
        switch (C0027b.C[skill.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (lIlIIllIllIllI(weaponStyle, WeaponStyle.MELEE)) {
                    ?? r0 = llIlIlIIllI[1];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIlIIllI[0];
            case 4:
                if (lIlIIllIllIllI(weaponStyle, WeaponStyle.RANGE)) {
                    ?? r02 = llIlIlIIllI[1];
                    "".length();
                    return (((204 ^ 130) ^ (23 ^ 101)) & (((((128 + 34) - 37) + 64) ^ (((48 + 94) - 81) + 68)) ^ (-" ".length()))) != 0 ? ((91 ^ 116) ^ (27 ^ 19)) & (((53 ^ 35) ^ (39 ^ 22)) ^ (-" ".length())) : r02;
                }
                return llIlIlIIllI[0];
            case 5:
                if (lIlIIllIllIllI(weaponStyle, WeaponStyle.MAGIC)) {
                    ?? r03 = llIlIlIIllI[1];
                    "".length();
                    return 0 != 0 ? ((3 ^ 79) ^ (80 ^ 75)) & (((58 ^ 117) ^ (138 ^ 146)) ^ (-" ".length())) : r03;
                }
                return llIlIlIIllI[0];
            default:
                return llIlIlIIllI[0];
        }
    }

    public String l() {
        return this.name;
    }

    private static String lIlIIllIIllIlI(String llllllllllllllllIIllIIlllIIIIlII, String llllllllllllllllIIllIIlllIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlllIIIIIll.getBytes(StandardCharsets.UTF_8)), llIlIlIIllI[10]), "DES");
            Cipher llllllllllllllllIIllIIlllIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlllIIIIllI.init(llIlIlIIllI[6], secretKeySpec);
            return new String(llllllllllllllllIIllIIlllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlllIIIIlIl) {
            llllllllllllllllIIllIIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIIllIIl(String llllllllllllllllIIllIIllIllIIlll, String llllllllllllllllIIllIIllIllIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIIllIllIIllI.toCharArray();
        int llllllllllllllllIIllIIllIllIIIll = llIlIlIIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIIllI[0];
        while (lIlIIllIllIlII(i, length)) {
            char llllllllllllllllIIllIIllIllIlIII = charArray2[i];
            sb.append((char) (llllllllllllllllIIllIIllIllIlIII ^ charArray[llllllllllllllllIIllIIllIllIIIll % charArray.length]));
            "".length();
            llllllllllllllllIIllIIllIllIIIll++;
            i++;
            "".length();
            if ((((((66 + 99) - 131) + 164) ^ (((46 + 42) - (-49)) + 5)) & (((197 ^ 151) ^ (45 ^ 55)) ^ (-" ".length()))) < (((((23 + 5) - (-87)) + 102) ^ (((71 + 32) - (-33)) + 48)) & (((((10 + 57) - (-145)) + 8) ^ (((117 + 69) - 147) + 150)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIllIllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIllIllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIlIIllIIllIII(String llllllllllllllllIIllIIllIlllIlll, String llllllllllllllllIIllIIllIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIIllI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIllIllllIII) {
            llllllllllllllllIIllIIllIllllIII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIllIllIIlI();
        lIlIIllIIllIll();
        String str = llIlIlIIIIl[llIlIlIIllI[0]];
        int i = llIlIlIIllI[0];
        String str2 = llIlIlIIIIl[llIlIlIIllI[1]];
        int i2 = llIlIlIIllI[3];
        int i3 = llIlIlIIllI[4];
        Skill[] skillArr = new Skill[llIlIlIIllI[5]];
        skillArr[llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArr[llIlIlIIllI[1]] = Skill.ATTACK;
        skillArr[llIlIlIIllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new EnumC0000a(str, i, str2, i2, i3, skillArr);
        String str3 = llIlIlIIIIl[llIlIlIIllI[6]];
        int i4 = llIlIlIIllI[1];
        String str4 = llIlIlIIIIl[llIlIlIIllI[5]];
        int i5 = llIlIlIIllI[3];
        int i6 = llIlIlIIllI[4];
        Skill[] skillArr2 = new Skill[llIlIlIIllI[5]];
        skillArr2[llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArr2[llIlIlIIllI[1]] = Skill.ATTACK;
        skillArr2[llIlIlIIllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new EnumC0000a(str3, i4, str4, i5, i6, skillArr2);
        String str5 = llIlIlIIIIl[llIlIlIIllI[7]];
        int i7 = llIlIlIIllI[6];
        String str6 = llIlIlIIIIl[llIlIlIIllI[3]];
        int i8 = llIlIlIIllI[3];
        int i9 = llIlIlIIllI[4];
        Skill[] skillArr3 = new Skill[llIlIlIIllI[1]];
        skillArr3[llIlIlIIllI[0]] = Skill.STRENGTH;
        SUPER_STRENGTH = new EnumC0000a(str5, i7, str6, i8, i9, skillArr3);
        String str7 = llIlIlIIIIl[llIlIlIIllI[8]];
        int i10 = llIlIlIIllI[5];
        String str8 = llIlIlIIIIl[llIlIlIIllI[9]];
        int i11 = llIlIlIIllI[3];
        int i12 = llIlIlIIllI[4];
        Skill[] skillArr4 = new Skill[llIlIlIIllI[1]];
        skillArr4[llIlIlIIllI[0]] = Skill.ATTACK;
        SUPER_ATTACK = new EnumC0000a(str7, i10, str8, i11, i12, skillArr4);
        String str9 = llIlIlIIIIl[llIlIlIIllI[10]];
        int i13 = llIlIlIIllI[7];
        String str10 = llIlIlIIIIl[llIlIlIIllI[11]];
        int i14 = llIlIlIIllI[3];
        int i15 = llIlIlIIllI[4];
        Skill[] skillArr5 = new Skill[llIlIlIIllI[1]];
        skillArr5[llIlIlIIllI[0]] = Skill.DEFENCE;
        SUPER_DEFENCE = new EnumC0000a(str9, i13, str10, i14, i15, skillArr5);
        String str11 = llIlIlIIIIl[llIlIlIIllI[12]];
        int i16 = llIlIlIIllI[3];
        String str12 = llIlIlIIIIl[llIlIlIIllI[13]];
        int i17 = llIlIlIIllI[7];
        int i18 = llIlIlIIllI[12];
        Skill[] skillArr6 = new Skill[llIlIlIIllI[1]];
        skillArr6[llIlIlIIllI[0]] = Skill.RANGED;
        RANGING_POTION = new EnumC0000a(str11, i16, str12, i17, i18, skillArr6);
        String str13 = llIlIlIIIIl[llIlIlIIllI[14]];
        int i19 = llIlIlIIllI[8];
        String str14 = llIlIlIIIIl[llIlIlIIllI[15]];
        int i20 = llIlIlIIllI[7];
        int i21 = llIlIlIIllI[12];
        Skill[] skillArr7 = new Skill[llIlIlIIllI[1]];
        skillArr7[llIlIlIIllI[0]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new EnumC0000a(str13, i19, str14, i20, i21, skillArr7);
        String str15 = llIlIlIIIIl[llIlIlIIllI[16]];
        int i22 = llIlIlIIllI[9];
        String str16 = llIlIlIIIIl[llIlIlIIllI[4]];
        int i23 = llIlIlIIllI[7];
        int i24 = llIlIlIIllI[12];
        Skill[] skillArr8 = new Skill[llIlIlIIllI[6]];
        skillArr8[llIlIlIIllI[0]] = Skill.RANGED;
        skillArr8[llIlIlIIllI[1]] = Skill.DEFENCE;
        BASTION_POTION = new EnumC0000a(str15, i22, str16, i23, i24, skillArr8);
        String str17 = llIlIlIIIIl[llIlIlIIllI[17]];
        int i25 = llIlIlIIllI[10];
        String str18 = llIlIlIIIIl[llIlIlIIllI[18]];
        int i26 = llIlIlIIllI[7];
        int i27 = llIlIlIIllI[0];
        Skill[] skillArr9 = new Skill[llIlIlIIllI[1]];
        skillArr9[llIlIlIIllI[0]] = Skill.MAGIC;
        MAGIC_POTION = new EnumC0000a(str17, i25, str18, i26, i27, skillArr9);
        String str19 = llIlIlIIIIl[llIlIlIIllI[19]];
        int i28 = llIlIlIIllI[11];
        String str20 = llIlIlIIIIl[llIlIlIIllI[20]];
        int i29 = llIlIlIIllI[7];
        int i30 = llIlIlIIllI[0];
        Skill[] skillArr10 = new Skill[llIlIlIIllI[1]];
        skillArr10[llIlIlIIllI[0]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new EnumC0000a(str19, i28, str20, i29, i30, skillArr10);
        String str21 = llIlIlIIIIl[llIlIlIIllI[21]];
        int i31 = llIlIlIIllI[12];
        String str22 = llIlIlIIIIl[llIlIlIIllI[22]];
        int i32 = llIlIlIIllI[6];
        int i33 = llIlIlIIllI[3];
        Skill[] skillArr11 = new Skill[llIlIlIIllI[1]];
        skillArr11[llIlIlIIllI[0]] = Skill.MAGIC;
        ANCIENT_BREW = new EnumC0000a(str21, i31, str22, i32, i33, skillArr11);
        EnumC0000a[] enumC0000aArr = new EnumC0000a[llIlIlIIllI[13]];
        enumC0000aArr[llIlIlIIllI[0]] = SUPER_COMBAT;
        enumC0000aArr[llIlIlIIllI[1]] = DIVINE_SUPER_COMBAT;
        enumC0000aArr[llIlIlIIllI[6]] = SUPER_STRENGTH;
        enumC0000aArr[llIlIlIIllI[5]] = SUPER_ATTACK;
        enumC0000aArr[llIlIlIIllI[7]] = SUPER_DEFENCE;
        enumC0000aArr[llIlIlIIllI[3]] = RANGING_POTION;
        enumC0000aArr[llIlIlIIllI[8]] = DIVINE_RANGING_POTION;
        enumC0000aArr[llIlIlIIllI[9]] = BASTION_POTION;
        enumC0000aArr[llIlIlIIllI[10]] = MAGIC_POTION;
        enumC0000aArr[llIlIlIIllI[11]] = DIVINE_MAGIC_POTION;
        enumC0000aArr[llIlIlIIllI[12]] = ANCIENT_BREW;
        $VALUES = enumC0000aArr;
    }

    public static EnumC0000a valueOf(String str) {
        return (EnumC0000a) Enum.valueOf(EnumC0000a.class, str);
    }
}
