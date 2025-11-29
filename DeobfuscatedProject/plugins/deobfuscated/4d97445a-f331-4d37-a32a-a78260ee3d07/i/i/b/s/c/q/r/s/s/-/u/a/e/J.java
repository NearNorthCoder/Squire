/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class J
extends Enum<J> {
    public static final /* synthetic */ /* enum */ J SUPER_DEFENCE;
    private final /* synthetic */ int boostAmount;
    public static final /* synthetic */ /* enum */ J DIVINE_RANGING_POTION;
    public static final /* synthetic */ /* enum */ J SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ J BASTION_POTION;
    private static /* synthetic */ String[] lIlIIll;
    private static /* synthetic */ int[] lIlIlII;
    public static final /* synthetic */ /* enum */ J ANCIENT_BREW;
    private final /* synthetic */ int percentage;
    public static final /* synthetic */ /* enum */ J RANGING_POTION;
    private final /* synthetic */ String name;
    private static final /* synthetic */ J[] $VALUES;
    public static final /* synthetic */ /* enum */ J SUPER_ATTACK;
    public static final /* synthetic */ /* enum */ J DIVINE_MAGIC_POTION;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ /* enum */ J DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ J MAGIC_POTION;
    public static final /* synthetic */ /* enum */ J SUPER_STRENGTH;

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / lIlIlII[0];
    }

    private static String lIlIlIlIl(String lllIlIlIlIIIIlI, String lllIlIlIlIIIIll) {
        try {
            SecretKeySpec lllIlIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlII[10]), "DES");
            Cipher lllIlIlIlIIIllI = Cipher.getInstance("DES");
            lllIlIlIlIIIllI.init(lIlIlII[6], lllIlIlIlIIIlll);
            return new String(lllIlIlIlIIIllI.doFinal(Base64.getDecoder().decode(lllIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIlIlIIIlIl) {
            lllIlIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlll() {
        lIlIlII = new int[24];
        J.lIlIlII[0] = 0xF4 ^ 0x90;
        J.lIlIlII[1] = (0xD ^ 0x7B ^ (0xC3 ^ 0xB9)) & (127 + 104 - 138 + 54 ^ 89 + 111 - 187 + 146 ^ -1);
        J.lIlIlII[2] = 1;
        J.lIlIlII[3] = 0x22 ^ 0x27;
        J.lIlIlII[4] = 0x9F ^ 0x90;
        J.lIlIlII[5] = 3;
        J.lIlIlII[6] = 2;
        J.lIlIlII[7] = 73 + 98 - 98 + 105 ^ 100 + 31 - 90 + 141;
        J.lIlIlII[8] = 0x95 ^ 0x93;
        J.lIlIlII[9] = 0xB5 ^ 0xB2;
        J.lIlIlII[10] = 0x38 ^ 0x30;
        J.lIlIlII[11] = 0x47 ^ 0x2C ^ (0x41 ^ 0x23);
        J.lIlIlII[12] = 0x7A ^ 1 ^ (0xC4 ^ 0xB5);
        J.lIlIlII[13] = 0x41 ^ 0x4A;
        J.lIlIlII[14] = 0xC8 ^ 0xC4;
        J.lIlIlII[15] = 0x2E ^ 0x23;
        J.lIlIlII[16] = 3 ^ (0xA0 ^ 0xAD);
        J.lIlIlII[17] = 0x25 ^ 0x35;
        J.lIlIlII[18] = 0x8B ^ 0x9A;
        J.lIlIlII[19] = 0xE ^ 0x42 ^ (0x66 ^ 0x38);
        J.lIlIlII[20] = 0x29 ^ 0x3A;
        J.lIlIlII[21] = 6 ^ 0x12;
        J.lIlIlII[22] = 0x55 ^ 0xF ^ (0xE7 ^ 0xA8);
        J.lIlIlII[23] = 0x32 ^ 0x24;
    }

    private static String lIlIlIIll(String lllIlIlIlIIllll, String lllIlIlIlIlIIII) {
        try {
            SecretKeySpec lllIlIlIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIlIlIlIIll = Cipher.getInstance("Blowfish");
            lllIlIlIlIlIIll.init(lIlIlII[6], lllIlIlIlIlIlII);
            return new String(lllIlIlIlIlIIll.doFinal(Base64.getDecoder().decode(lllIlIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIlIlIlIIlI) {
            lllIlIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    public static J valueOf(String string) {
        return Enum.valueOf(J.class, string);
    }

    private static boolean llIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static J[] values() {
        return (J[])$VALUES.clone();
    }

    public Skill[] ay() {
        return this.skills;
    }

    public String ax() {
        return this.name;
    }

    private static String lIlIlIlII(String lllIlIlIIllIlII, String lllIlIlIIllIIll) {
        lllIlIlIIllIlII = new String(Base64.getDecoder().decode(lllIlIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIlIIllIIlI = new StringBuilder();
        char[] lllIlIlIIllIIIl = lllIlIlIIllIIll.toCharArray();
        int lllIlIlIIllIIII = lIlIlII[1];
        char[] lllIlIlIIlIlIlI = lllIlIlIIllIlII.toCharArray();
        int lllIlIlIIlIlIIl = lllIlIlIIlIlIlI.length;
        int lllIlIlIIlIlIII = lIlIlII[1];
        while (J.llIIIllII(lllIlIlIIlIlIII, lllIlIlIIlIlIIl)) {
            char lllIlIlIIllIlIl = lllIlIlIIlIlIlI[lllIlIlIIlIlIII];
            lllIlIlIIllIIlI.append((char)(lllIlIlIIllIlIl ^ lllIlIlIIllIIIl[lllIlIlIIllIIII % lllIlIlIIllIIIl.length]));
            0;
            ++lllIlIlIIllIIII;
            ++lllIlIlIIlIlIII;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lllIlIlIIllIIlI);
    }

    private J(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lIlIlIllI() {
        lIlIIll = new String[lIlIlII[23]];
        J.lIlIIll[J.lIlIlII[1]] = J."SUPER_COMBAT";
        J.lIlIIll[J.lIlIlII[2]] = J."Super combat potion";
        J.lIlIIll[J.lIlIlII[6]] = J."DIVINE_SUPER_COMBAT";
        J.lIlIIll[J.lIlIlII[5]] = J."Divine super combat potion";
        J.lIlIIll[J.lIlIlII[7]] = J."SUPER_STRENGTH";
        J.lIlIIll[J.lIlIlII[3]] = J."Super strength";
        J.lIlIIll[J.lIlIlII[8]] = J."SUPER_ATTACK";
        J.lIlIIll[J.lIlIlII[9]] = J."Super attack";
        J.lIlIIll[J.lIlIlII[10]] = J."SUPER_DEFENCE";
        J.lIlIIll[J.lIlIlII[11]] = J."Super defence";
        J.lIlIIll[J.lIlIlII[12]] = J."RANGING_POTION";
        J.lIlIIll[J.lIlIlII[13]] = J."Ranging potion";
        J.lIlIIll[J.lIlIlII[14]] = J."DIVINE_RANGING_POTION";
        J.lIlIIll[J.lIlIlII[15]] = J."Divine ranging potion";
        J.lIlIIll[J.lIlIlII[16]] = J."BASTION_POTION";
        J.lIlIIll[J.lIlIlII[4]] = J."Bastion potion";
        J.lIlIIll[J.lIlIlII[17]] = J."MAGIC_POTION";
        J.lIlIIll[J.lIlIlII[18]] = J."Magic potion";
        J.lIlIIll[J.lIlIlII[19]] = J."DIVINE_MAGIC_POTION";
        J.lIlIIll[J.lIlIlII[20]] = J."Divine magic potion";
        J.lIlIIll[J.lIlIlII[21]] = J."ANCIENT_BREW";
        J.lIlIIll[J.lIlIlII[22]] = J."Ancient brew";
    }

    static {
        J.lIlIlIlll();
        J.lIlIlIllI();
        Skill[] skillArray = new Skill[lIlIlII[5]];
        skillArray[J.lIlIlII[1]] = Skill.STRENGTH;
        skillArray[J.lIlIlII[2]] = Skill.ATTACK;
        skillArray[J.lIlIlII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new J(lIlIIll[lIlIlII[2]], lIlIlII[3], lIlIlII[4], skillArray);
        Skill[] skillArray2 = new Skill[lIlIlII[5]];
        skillArray2[J.lIlIlII[1]] = Skill.STRENGTH;
        skillArray2[J.lIlIlII[2]] = Skill.ATTACK;
        skillArray2[J.lIlIlII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new J(lIlIIll[lIlIlII[5]], lIlIlII[3], lIlIlII[4], skillArray2);
        Skill[] skillArray3 = new Skill[lIlIlII[2]];
        skillArray3[J.lIlIlII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new J(lIlIIll[lIlIlII[3]], lIlIlII[3], lIlIlII[4], skillArray3);
        Skill[] skillArray4 = new Skill[lIlIlII[2]];
        skillArray4[J.lIlIlII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new J(lIlIIll[lIlIlII[9]], lIlIlII[3], lIlIlII[4], skillArray4);
        Skill[] skillArray5 = new Skill[lIlIlII[2]];
        skillArray5[J.lIlIlII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new J(lIlIIll[lIlIlII[11]], lIlIlII[3], lIlIlII[4], skillArray5);
        Skill[] skillArray6 = new Skill[lIlIlII[2]];
        skillArray6[J.lIlIlII[1]] = Skill.RANGED;
        RANGING_POTION = new J(lIlIIll[lIlIlII[13]], lIlIlII[7], lIlIlII[12], skillArray6);
        Skill[] skillArray7 = new Skill[lIlIlII[2]];
        skillArray7[J.lIlIlII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new J(lIlIIll[lIlIlII[15]], lIlIlII[7], lIlIlII[12], skillArray7);
        Skill[] skillArray8 = new Skill[lIlIlII[6]];
        skillArray8[J.lIlIlII[1]] = Skill.RANGED;
        skillArray8[J.lIlIlII[2]] = Skill.DEFENCE;
        BASTION_POTION = new J(lIlIIll[lIlIlII[4]], lIlIlII[7], lIlIlII[12], skillArray8);
        Skill[] skillArray9 = new Skill[lIlIlII[2]];
        skillArray9[J.lIlIlII[1]] = Skill.MAGIC;
        MAGIC_POTION = new J(lIlIIll[lIlIlII[18]], lIlIlII[7], lIlIlII[1], skillArray9);
        Skill[] skillArray10 = new Skill[lIlIlII[2]];
        skillArray10[J.lIlIlII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new J(lIlIIll[lIlIlII[20]], lIlIlII[7], lIlIlII[1], skillArray10);
        Skill[] skillArray11 = new Skill[lIlIlII[2]];
        skillArray11[J.lIlIlII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new J(lIlIIll[lIlIlII[22]], lIlIlII[6], lIlIlII[3], skillArray11);
        J[] jArray = new J[lIlIlII[13]];
        jArray[J.lIlIlII[1]] = SUPER_COMBAT;
        jArray[J.lIlIlII[2]] = DIVINE_SUPER_COMBAT;
        jArray[J.lIlIlII[6]] = SUPER_STRENGTH;
        jArray[J.lIlIlII[5]] = SUPER_ATTACK;
        jArray[J.lIlIlII[7]] = SUPER_DEFENCE;
        jArray[J.lIlIlII[3]] = RANGING_POTION;
        jArray[J.lIlIlII[8]] = DIVINE_RANGING_POTION;
        jArray[J.lIlIlII[9]] = BASTION_POTION;
        jArray[J.lIlIlII[10]] = MAGIC_POTION;
        jArray[J.lIlIlII[11]] = DIVINE_MAGIC_POTION;
        jArray[J.lIlIlII[12]] = ANCIENT_BREW;
        $VALUES = jArray;
    }
}

