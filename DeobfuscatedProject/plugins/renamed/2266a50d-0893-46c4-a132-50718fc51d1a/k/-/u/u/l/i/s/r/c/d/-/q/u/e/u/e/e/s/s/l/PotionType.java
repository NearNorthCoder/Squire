/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class PotionType
extends Enum<c> {
    private static /* synthetic */ int[] lIllIllIlllI;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c RANGING_POTION;
    public static final /* synthetic */ /* enum */ c BASTION_POTION;
    public static final /* synthetic */ /* enum */ c ANCIENT_BREW;
    private static /* synthetic */ String[] lIllIllIlIII;
    private final /* synthetic */ int boostAmount;
    public static final /* synthetic */ /* enum */ c DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ c SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ c DIVINE_RANGING_POTION;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ /* enum */ c MAGIC_POTION;
    public static final /* synthetic */ /* enum */ c SUPER_ATTACK;
    public static final /* synthetic */ /* enum */ c SUPER_DEFENCE;
    private final /* synthetic */ int percentage;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ c SUPER_STRENGTH;
    public static final /* synthetic */ /* enum */ c DIVINE_MAGIC_POTION;
    public static final /* synthetic */ /* enum */ c DIVINE_BASTION_POTION;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / lIllIllIlllI[0];
    }

    private c(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lllIlIIlIlllIl() {
        lIllIllIlIII = new String[lIllIllIlllI[25]];
        c.lIllIllIlIII[c.lIllIllIlllI[1]] = c."SUPER_COMBAT";
        c.lIllIllIlIII[c.lIllIllIlllI[2]] = c."Super combat potion";
        c.lIllIllIlIII[c.lIllIllIlllI[6]] = c."SUPER_STRENGTH";
        c.lIllIllIlIII[c.lIllIllIlllI[5]] = c."Super strength";
        c.lIllIllIlIII[c.lIllIllIlllI[7]] = c."SUPER_ATTACK";
        c.lIllIllIlIII[c.lIllIllIlllI[3]] = c."Super attack";
        c.lIllIllIlIII[c.lIllIllIlllI[8]] = c."SUPER_DEFENCE";
        c.lIllIllIlIII[c.lIllIllIlllI[9]] = c."Super defence";
        c.lIllIllIlIII[c.lIllIllIlllI[10]] = c."DIVINE_SUPER_COMBAT";
        c.lIllIllIlIII[c.lIllIllIlllI[11]] = c."Divine super combat potion";
        c.lIllIllIlIII[c.lIllIllIlllI[12]] = c."RANGING_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[13]] = c."Ranging potion";
        c.lIllIllIlIII[c.lIllIllIlllI[14]] = c."DIVINE_RANGING_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[15]] = c."Divine ranging potion";
        c.lIllIllIlIII[c.lIllIllIlllI[16]] = c."BASTION_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[4]] = c."Bastion potion";
        c.lIllIllIlIII[c.lIllIllIlllI[17]] = c."DIVINE_BASTION_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[18]] = c."Divine bastion potion";
        c.lIllIllIlIII[c.lIllIllIlllI[19]] = c."MAGIC_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[20]] = c."Magic potion";
        c.lIllIllIlIII[c.lIllIllIlllI[21]] = c."DIVINE_MAGIC_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[22]] = c."Divine magic potion";
        c.lIllIllIlIII[c.lIllIllIlllI[23]] = c."ANCIENT_BREW";
        c.lIllIllIlIII[c.lIllIllIlllI[24]] = c."Ancient brew";
    }

    private static String lllIlIIlIIlllI(String var9, String var17) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var1 = var17.toCharArray();
        int var8 = lIllIllIlllI[1];
        char[] var4 = var9.toCharArray();
        int var6 = var4.length;
        int var5 = lIllIllIlllI[1];
        while (c.lllIlIIllIIlIl(var5, var6)) {
            char var2 = var4[var5];
            var3.append((char)(var2 ^ var1[var8 % var1.length]));
            0;
            ++var8;
            ++var5;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static String lllIlIIlIIllll(String var19, String var11) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIllIllIlllI[10]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIllIllIlllI[6], var16);
            return new String(var10.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIllIIlII() {
        lIllIllIlllI = new int[26];
        c.lIllIllIlllI[0] = 0x1E ^ 0x11 ^ (0xAF ^ 0xC4);
        c.lIllIllIlllI[1] = (1 ^ (0x33 ^ 0x7A)) & (195 + 193 - 351 + 216 ^ 90 + 97 - 137 + 131 ^ -1);
        c.lIllIllIlllI[2] = 1;
        c.lIllIllIlllI[3] = 0x4A ^ 0x4F;
        c.lIllIllIlllI[4] = 0x2D ^ 0x22;
        c.lIllIllIlllI[5] = 3;
        c.lIllIllIlllI[6] = 2;
        c.lIllIllIlllI[7] = 19 + 111 - 84 + 111 ^ 78 + 8 - -36 + 31;
        c.lIllIllIlllI[8] = 0x26 ^ 0x20;
        c.lIllIllIlllI[9] = 131 + 115 - 180 + 70 ^ 140 + 12 - 93 + 84;
        c.lIllIllIlllI[10] = 0x42 ^ 0x4A;
        c.lIllIllIlllI[11] = 0x81 ^ 0xA2 ^ (0x26 ^ 0xC);
        c.lIllIllIlllI[12] = 16 + 119 - -22 + 19 ^ 169 + 128 - 288 + 177;
        c.lIllIllIlllI[13] = 3 ^ (0x86 ^ 0x8E);
        c.lIllIllIlllI[14] = 0x76 ^ 0x7A;
        c.lIllIllIlllI[15] = 0x17 ^ 0x47 ^ (0x54 ^ 9);
        c.lIllIllIlllI[16] = 0xA5 ^ 0xAB;
        c.lIllIllIlllI[17] = 0xD3 ^ 0xC3;
        c.lIllIllIlllI[18] = 0x4D ^ 6 ^ (0x25 ^ 0x7F);
        c.lIllIllIlllI[19] = 28 + 177 - 168 + 174 ^ 179 + 81 - 156 + 89;
        c.lIllIllIlllI[20] = 0xAA ^ 0xB9;
        c.lIllIllIlllI[21] = 0x4B ^ 0x5F;
        c.lIllIllIlllI[22] = 0x14 ^ 1;
        c.lIllIllIlllI[23] = 51 + 76 - 9 + 53 ^ 78 + 140 - 72 + 43;
        c.lIllIllIlllI[24] = 0xA0 ^ 0xB7;
        c.lIllIllIlllI[25] = 0x40 ^ 0x2F ^ (0 ^ 0x77);
    }

    static {
        c.lllIlIIllIIlII();
        c.lllIlIIlIlllIl();
        Skill[] skillArray = new Skill[lIllIllIlllI[5]];
        skillArray[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArray[c.lIllIllIlllI[2]] = Skill.ATTACK;
        skillArray[c.lIllIllIlllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new c(lIllIllIlIII[lIllIllIlllI[2]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray);
        Skill[] skillArray2 = new Skill[lIllIllIlllI[2]];
        skillArray2[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new c(lIllIllIlIII[lIllIllIlllI[5]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray2);
        Skill[] skillArray3 = new Skill[lIllIllIlllI[2]];
        skillArray3[c.lIllIllIlllI[1]] = Skill.ATTACK;
        SUPER_ATTACK = new c(lIllIllIlIII[lIllIllIlllI[3]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray3);
        Skill[] skillArray4 = new Skill[lIllIllIlllI[2]];
        skillArray4[c.lIllIllIlllI[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new c(lIllIllIlIII[lIllIllIlllI[9]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray4);
        Skill[] skillArray5 = new Skill[lIllIllIlllI[5]];
        skillArray5[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArray5[c.lIllIllIlllI[2]] = Skill.ATTACK;
        skillArray5[c.lIllIllIlllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new c(lIllIllIlIII[lIllIllIlllI[11]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray5);
        Skill[] skillArray6 = new Skill[lIllIllIlllI[2]];
        skillArray6[c.lIllIllIlllI[1]] = Skill.RANGED;
        RANGING_POTION = new c(lIllIllIlIII[lIllIllIlllI[13]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray6);
        Skill[] skillArray7 = new Skill[lIllIllIlllI[2]];
        skillArray7[c.lIllIllIlllI[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new c(lIllIllIlIII[lIllIllIlllI[15]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray7);
        Skill[] skillArray8 = new Skill[lIllIllIlllI[6]];
        skillArray8[c.lIllIllIlllI[1]] = Skill.RANGED;
        skillArray8[c.lIllIllIlllI[2]] = Skill.DEFENCE;
        BASTION_POTION = new c(lIllIllIlIII[lIllIllIlllI[4]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray8);
        Skill[] skillArray9 = new Skill[lIllIllIlllI[6]];
        skillArray9[c.lIllIllIlllI[1]] = Skill.RANGED;
        skillArray9[c.lIllIllIlllI[2]] = Skill.DEFENCE;
        DIVINE_BASTION_POTION = new c(lIllIllIlIII[lIllIllIlllI[18]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray9);
        Skill[] skillArray10 = new Skill[lIllIllIlllI[2]];
        skillArray10[c.lIllIllIlllI[1]] = Skill.MAGIC;
        MAGIC_POTION = new c(lIllIllIlIII[lIllIllIlllI[20]], lIllIllIlllI[7], lIllIllIlllI[1], skillArray10);
        Skill[] skillArray11 = new Skill[lIllIllIlllI[2]];
        skillArray11[c.lIllIllIlllI[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new c(lIllIllIlIII[lIllIllIlllI[22]], lIllIllIlllI[7], lIllIllIlllI[1], skillArray11);
        Skill[] skillArray12 = new Skill[lIllIllIlllI[2]];
        skillArray12[c.lIllIllIlllI[1]] = Skill.MAGIC;
        ANCIENT_BREW = new c(lIllIllIlIII[lIllIllIlllI[24]], lIllIllIlllI[6], lIllIllIlllI[3], skillArray12);
        c[] cArray = new c[lIllIllIlllI[14]];
        cArray[c.lIllIllIlllI[1]] = SUPER_COMBAT;
        cArray[c.lIllIllIlllI[2]] = SUPER_STRENGTH;
        cArray[c.lIllIllIlllI[6]] = SUPER_ATTACK;
        cArray[c.lIllIllIlllI[5]] = SUPER_DEFENCE;
        cArray[c.lIllIllIlllI[7]] = DIVINE_SUPER_COMBAT;
        cArray[c.lIllIllIlllI[3]] = RANGING_POTION;
        cArray[c.lIllIllIlllI[8]] = DIVINE_RANGING_POTION;
        cArray[c.lIllIllIlllI[9]] = BASTION_POTION;
        cArray[c.lIllIllIlllI[10]] = DIVINE_BASTION_POTION;
        cArray[c.lIllIllIlllI[11]] = MAGIC_POTION;
        cArray[c.lIllIllIlllI[12]] = DIVINE_MAGIC_POTION;
        cArray[c.lIllIllIlllI[13]] = ANCIENT_BREW;
        $VALUES = cArray;
    }

    private static String lllIlIIlIlIIlI(String var18, String var12) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIllIlllI[6], var14);
            return new String(var7.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public Skill[] F() {
        return this.skills;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public String E() {
        return this.name;
    }
}

