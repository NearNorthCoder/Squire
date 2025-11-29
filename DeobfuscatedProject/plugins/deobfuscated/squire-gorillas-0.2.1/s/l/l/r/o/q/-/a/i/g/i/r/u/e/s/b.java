/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class b
extends Enum<b> {
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ /* enum */ b BASTION_POTION;
    public static final /* synthetic */ /* enum */ b DIVINE_RANGING_POTION;
    public static final /* synthetic */ /* enum */ b DIVINE_MAGIC_POTION;
    public static final /* synthetic */ /* enum */ b DIVINE_SUPER_COMBAT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ b RANGING_POTION;
    private static /* synthetic */ String[] llIIlIlIlIll;
    private static /* synthetic */ int[] llIIlIlIllII;
    public static final /* synthetic */ /* enum */ b MAGIC_POTION;
    public static final /* synthetic */ /* enum */ b SUPER_ATTACK;
    public static final /* synthetic */ /* enum */ b SUPER_DEFENCE;
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ int percentage;
    public static final /* synthetic */ /* enum */ b ANCIENT_BREW;
    public static final /* synthetic */ /* enum */ b SUPER_STRENGTH;
    public static final /* synthetic */ /* enum */ b SUPER_COMBAT;
    private final /* synthetic */ int boostAmount;

    private static String lllllIlIllIlIl(String lllllllllllllllIlIIllllIllIIIIll, String lllllllllllllllIlIIllllIllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIllIIIlIl.init(llIIlIlIllII[6], lllllllllllllllIlIIllllIllIIIllI);
            return new String(lllllllllllllllIlIIllllIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIllIIIlII) {
            lllllllllllllllIlIIllllIllIIIlII.printStackTrace();
            return null;
        }
    }

    private b(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lllllIlIllIllI() {
        llIIlIlIlIll = new String[llIIlIlIllII[23]];
        b.llIIlIlIlIll[b.llIIlIlIllII[1]] = b."SUPER_COMBAT";
        b.llIIlIlIlIll[b.llIIlIlIllII[2]] = b."Super combat potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[6]] = b."DIVINE_SUPER_COMBAT";
        b.llIIlIlIlIll[b.llIIlIlIllII[5]] = b."Divine super combat potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[7]] = b."SUPER_STRENGTH";
        b.llIIlIlIlIll[b.llIIlIlIllII[3]] = b."Super strength";
        b.llIIlIlIlIll[b.llIIlIlIllII[8]] = b."SUPER_ATTACK";
        b.llIIlIlIlIll[b.llIIlIlIllII[9]] = b."Super attack";
        b.llIIlIlIlIll[b.llIIlIlIllII[10]] = b."SUPER_DEFENCE";
        b.llIIlIlIlIll[b.llIIlIlIllII[11]] = b."Super defence";
        b.llIIlIlIlIll[b.llIIlIlIllII[12]] = b."RANGING_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[13]] = b."Ranging potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[14]] = b."DIVINE_RANGING_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[15]] = b."Divine ranging potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[16]] = b."BASTION_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[4]] = b."Bastion potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[17]] = b."MAGIC_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[18]] = b."Magic potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[19]] = b."DIVINE_MAGIC_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[20]] = b."Divine magic potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[21]] = b."ANCIENT_BREW";
        b.llIIlIlIlIll[b.llIIlIlIllII[22]] = b."Ancient brew";
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / llIIlIlIllII[0];
    }

    static {
        b.lllllIlIllIlll();
        b.lllllIlIllIllI();
        Skill[] skillArray = new Skill[llIIlIlIllII[5]];
        skillArray[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArray[b.llIIlIlIllII[2]] = Skill.ATTACK;
        skillArray[b.llIIlIlIllII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new b(llIIlIlIlIll[llIIlIlIllII[2]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray);
        Skill[] skillArray2 = new Skill[llIIlIlIllII[5]];
        skillArray2[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArray2[b.llIIlIlIllII[2]] = Skill.ATTACK;
        skillArray2[b.llIIlIlIllII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new b(llIIlIlIlIll[llIIlIlIllII[5]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray2);
        Skill[] skillArray3 = new Skill[llIIlIlIllII[2]];
        skillArray3[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new b(llIIlIlIlIll[llIIlIlIllII[3]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray3);
        Skill[] skillArray4 = new Skill[llIIlIlIllII[2]];
        skillArray4[b.llIIlIlIllII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new b(llIIlIlIlIll[llIIlIlIllII[9]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray4);
        Skill[] skillArray5 = new Skill[llIIlIlIllII[2]];
        skillArray5[b.llIIlIlIllII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new b(llIIlIlIlIll[llIIlIlIllII[11]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray5);
        Skill[] skillArray6 = new Skill[llIIlIlIllII[2]];
        skillArray6[b.llIIlIlIllII[1]] = Skill.RANGED;
        RANGING_POTION = new b(llIIlIlIlIll[llIIlIlIllII[13]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray6);
        Skill[] skillArray7 = new Skill[llIIlIlIllII[2]];
        skillArray7[b.llIIlIlIllII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new b(llIIlIlIlIll[llIIlIlIllII[15]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray7);
        Skill[] skillArray8 = new Skill[llIIlIlIllII[6]];
        skillArray8[b.llIIlIlIllII[1]] = Skill.RANGED;
        skillArray8[b.llIIlIlIllII[2]] = Skill.DEFENCE;
        BASTION_POTION = new b(llIIlIlIlIll[llIIlIlIllII[4]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray8);
        Skill[] skillArray9 = new Skill[llIIlIlIllII[2]];
        skillArray9[b.llIIlIlIllII[1]] = Skill.MAGIC;
        MAGIC_POTION = new b(llIIlIlIlIll[llIIlIlIllII[18]], llIIlIlIllII[7], llIIlIlIllII[1], skillArray9);
        Skill[] skillArray10 = new Skill[llIIlIlIllII[2]];
        skillArray10[b.llIIlIlIllII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new b(llIIlIlIlIll[llIIlIlIllII[20]], llIIlIlIllII[7], llIIlIlIllII[1], skillArray10);
        Skill[] skillArray11 = new Skill[llIIlIlIllII[2]];
        skillArray11[b.llIIlIlIllII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new b(llIIlIlIlIll[llIIlIlIllII[22]], llIIlIlIllII[6], llIIlIlIllII[3], skillArray11);
        b[] bArray = new b[llIIlIlIllII[13]];
        bArray[b.llIIlIlIllII[1]] = SUPER_COMBAT;
        bArray[b.llIIlIlIllII[2]] = DIVINE_SUPER_COMBAT;
        bArray[b.llIIlIlIllII[6]] = SUPER_STRENGTH;
        bArray[b.llIIlIlIllII[5]] = SUPER_ATTACK;
        bArray[b.llIIlIlIllII[7]] = SUPER_DEFENCE;
        bArray[b.llIIlIlIllII[3]] = RANGING_POTION;
        bArray[b.llIIlIlIllII[8]] = DIVINE_RANGING_POTION;
        bArray[b.llIIlIlIllII[9]] = BASTION_POTION;
        bArray[b.llIIlIlIllII[10]] = MAGIC_POTION;
        bArray[b.llIIlIlIllII[11]] = DIVINE_MAGIC_POTION;
        bArray[b.llIIlIlIllII[12]] = ANCIENT_BREW;
        $VALUES = bArray;
    }

    private static void lllllIlIllIlll() {
        llIIlIlIllII = new int[24];
        b.llIIlIlIllII[0] = 0xDE ^ 0xBA;
        b.llIIlIlIllII[1] = (0xB4 ^ 0x92) & ~(0x85 ^ 0xA3);
        b.llIIlIlIllII[2] = 1;
        b.llIIlIlIllII[3] = 0x7B ^ 0x7E;
        b.llIIlIlIllII[4] = 0x12 ^ 0x1D;
        b.llIIlIlIllII[5] = 3;
        b.llIIlIlIllII[6] = 2;
        b.llIIlIlIllII[7] = 0xB4 ^ 0xB0;
        b.llIIlIlIllII[8] = 9 ^ 0xF;
        b.llIIlIlIllII[9] = 0x42 ^ 0x45;
        b.llIIlIlIllII[10] = 4 ^ 0xC;
        b.llIIlIlIllII[11] = 0x6F ^ 0x36 ^ (0xD1 ^ 0x81);
        b.llIIlIlIllII[12] = 0x1D ^ 0x17;
        b.llIIlIlIllII[13] = 0xB7 ^ 0xA0 ^ (0x78 ^ 0x64);
        b.llIIlIlIllII[14] = 0xB6 ^ 0xBA;
        b.llIIlIlIllII[15] = 7 ^ 0xA;
        b.llIIlIlIllII[16] = 0xB9 ^ 0xB7;
        b.llIIlIlIllII[17] = 0x75 ^ 0x65;
        b.llIIlIlIllII[18] = 164 + 54 - 212 + 181 ^ 140 + 33 - 20 + 17;
        b.llIIlIlIllII[19] = 145 + 142 - 221 + 105 ^ 96 + 24 - -19 + 46;
        b.llIIlIlIllII[20] = 81 + 88 - 135 + 94 ^ 90 + 108 - 148 + 97;
        b.llIIlIlIllII[21] = 0x53 ^ 0x47;
        b.llIIlIlIllII[22] = 0x1F ^ 0x7E ^ (5 ^ 0x71);
        b.llIIlIlIllII[23] = 0x14 ^ 0x20 ^ (0xB1 ^ 0x93);
    }

    private static String lllllIlIllIIll(String lllllllllllllllIlIIllllIlIllIIll, String lllllllllllllllIlIIllllIlIllIIlI) {
        lllllllllllllllIlIIllllIlIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIlIllIIIl = new StringBuilder();
        char[] lllllllllllllllIlIIllllIlIllIIII = lllllllllllllllIlIIllllIlIllIIlI.toCharArray();
        int lllllllllllllllIlIIllllIlIlIllll = llIIlIlIllII[1];
        char[] lllllllllllllllIlIIllllIlIlIlIIl = lllllllllllllllIlIIllllIlIllIIll.toCharArray();
        int lllllllllllllllIlIIllllIlIlIlIII = lllllllllllllllIlIIllllIlIlIlIIl.length;
        int lllllllllllllllIlIIllllIlIlIIlll = llIIlIlIllII[1];
        while (b.lllllIlIlllIII(lllllllllllllllIlIIllllIlIlIIlll, lllllllllllllllIlIIllllIlIlIlIII)) {
            char lllllllllllllllIlIIllllIlIllIlII = lllllllllllllllIlIIllllIlIlIlIIl[lllllllllllllllIlIIllllIlIlIIlll];
            lllllllllllllllIlIIllllIlIllIIIl.append((char)(lllllllllllllllIlIIllllIlIllIlII ^ lllllllllllllllIlIIllllIlIllIIII[lllllllllllllllIlIIllllIlIlIllll % lllllllllllllllIlIIllllIlIllIIII.length]));
            0;
            ++lllllllllllllllIlIIllllIlIlIllll;
            ++lllllllllllllllIlIIllllIlIlIIlll;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllllIlIllIIIl);
    }

    public Skill[] k() {
        return this.skills;
    }

    public String j() {
        return this.name;
    }

    private static String lllllIlIllIlII(String lllllllllllllllIlIIllllIlIIlllII, String lllllllllllllllIlIIllllIlIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlIIllIll.getBytes(StandardCharsets.UTF_8)), llIIlIlIllII[10]), "DES");
            Cipher lllllllllllllllIlIIllllIlIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIlIlIIIII.init(llIIlIlIllII[6], lllllllllllllllIlIIllllIlIlIIIIl);
            return new String(lllllllllllllllIlIIllllIlIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIlIIlllll) {
            lllllllllllllllIlIIllllIlIIlllll.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static boolean lllllIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

