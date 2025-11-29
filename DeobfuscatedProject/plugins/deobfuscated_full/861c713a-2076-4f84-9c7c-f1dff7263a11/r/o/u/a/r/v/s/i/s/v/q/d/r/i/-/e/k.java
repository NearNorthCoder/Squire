/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;

public final class k
extends Enum<k> {
    public static final /* synthetic */ /* enum */ k CASTING;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ k CONTROLLED;
    public static final /* synthetic */ /* enum */ k DEFENSIVE;
    private static final /* synthetic */ k[] $VALUES;
    public static final /* synthetic */ /* enum */ k OTHER;
    public static final /* synthetic */ /* enum */ k LONGRANGE;
    public static final /* synthetic */ /* enum */ k RANGING;
    public static final /* synthetic */ /* enum */ k ACCURATE;
    private static /* synthetic */ int[] lIlIlIIllIIll;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ /* enum */ k DEFENSIVE_CASTING;
    private static /* synthetic */ String[] lIlIlIIlIIlIl;
    public static final /* synthetic */ /* enum */ k AGGRESSIVE;

    private static boolean lIlllllIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlllIllII(String var16, String var9) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIlIIllIIll[2], var17);
            return new String(var6.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIIIlIIII() {
        lIlIlIIllIIll = new int[19];
        k.lIlIlIIllIIll[0] = (0x56 ^ 0x63 ^ (0x46 ^ 0x2A)) & (0x29 ^ 0x34 ^ (0xEC ^ 0xA8) ^ -1);
        k.lIlIlIIllIIll[1] = 1;
        k.lIlIlIIllIIll[2] = 2;
        k.lIlIlIIllIIll[3] = 3;
        k.lIlIlIIllIIll[4] = 0x41 ^ 0x45;
        k.lIlIlIIllIIll[5] = 0x7C ^ 0x79;
        k.lIlIlIIllIIll[6] = 42 + 2 - 27 + 136 ^ 155 + 151 - 195 + 48;
        k.lIlIlIIllIIll[7] = 0xAC ^ 0xAB;
        k.lIlIlIIllIIll[8] = 49 + 33 - 58 + 157 ^ 96 + 117 - 105 + 81;
        k.lIlIlIIllIIll[9] = 0xA9 ^ 0x8D ^ (0x43 ^ 0x6E);
        k.lIlIlIIllIIll[10] = 11 + 76 - 13 + 87 ^ 128 + 15 - 77 + 105;
        k.lIlIlIIllIIll[11] = 0x1B ^ 0x10;
        k.lIlIlIIllIIll[12] = 0x11 ^ 0x5A ^ (0xD3 ^ 0x94);
        k.lIlIlIIllIIll[13] = 136 + 154 - 220 + 121 ^ 148 + 168 - 149 + 11;
        k.lIlIlIIllIIll[14] = 101 + 14 - 105 + 197 ^ 8 + 94 - -90 + 1;
        k.lIlIlIIllIIll[15] = 0x9E ^ 0xBE ^ (0x32 ^ 0x1D);
        k.lIlIlIIllIIll[16] = 0xA ^ 0x1A;
        k.lIlIlIIllIIll[17] = 0xE3 ^ 0xA5 ^ (0xE3 ^ 0xB4);
        k.lIlIlIIllIIll[18] = 0x42 ^ 0x50;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static void lIlllllIIIIllll() {
        lIlIlIIlIIlIl = new String[lIlIlIIllIIll[18]];
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[0]] = k."ACCURATE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[1]] = k."Accurate";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[2]] = k."AGGRESSIVE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[3]] = k."Aggressive";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[4]] = k."DEFENSIVE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[5]] = k."Defensive";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[6]] = k."CONTROLLED";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[7]] = k."Controlled";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[8]] = k."RANGING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[9]] = k."Ranging";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[10]] = k."LONGRANGE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[11]] = k."Longrange";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[12]] = k."CASTING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[13]] = k."Casting";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[14]] = k."DEFENSIVE_CASTING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[15]] = k."Defensive Casting";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[16]] = k."OTHER";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[17]] = k."Other";
    }

    private static String lIllllIlllIllIl(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var11.toCharArray();
        int var13 = lIlIlIIllIIll[0];
        char[] var8 = var12.toCharArray();
        int var3 = var8.length;
        int var18 = lIlIlIIllIIll[0];
        while (k.lIlllllIIIlIIIl(var18, var3)) {
            char var4 = var8[var18];
            var1.append((char)(var4 ^ var15[var13 % var15.length]));
            0;
            ++var13;
            ++var18;
            0;
            if (((0x50 ^ 5) & ~(0xEE ^ 0xBB)) == 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    static {
        k.lIlllllIIIlIIII();
        k.lIlllllIIIIllll();
        Skill[] skillArray = new Skill[lIlIlIIllIIll[1]];
        skillArray[k.lIlIlIIllIIll[0]] = Skill.ATTACK;
        ACCURATE = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[1]], skillArray);
        Skill[] skillArray2 = new Skill[lIlIlIIllIIll[1]];
        skillArray2[k.lIlIlIIllIIll[0]] = Skill.STRENGTH;
        AGGRESSIVE = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[3]], skillArray2);
        Skill[] skillArray3 = new Skill[lIlIlIIllIIll[1]];
        skillArray3[k.lIlIlIIllIIll[0]] = Skill.DEFENCE;
        DEFENSIVE = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[5]], skillArray3);
        Skill[] skillArray4 = new Skill[lIlIlIIllIIll[3]];
        skillArray4[k.lIlIlIIllIIll[0]] = Skill.ATTACK;
        skillArray4[k.lIlIlIIllIIll[1]] = Skill.STRENGTH;
        skillArray4[k.lIlIlIIllIIll[2]] = Skill.DEFENCE;
        CONTROLLED = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[7]], skillArray4);
        Skill[] skillArray5 = new Skill[lIlIlIIllIIll[1]];
        skillArray5[k.lIlIlIIllIIll[0]] = Skill.RANGED;
        RANGING = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[9]], skillArray5);
        Skill[] skillArray6 = new Skill[lIlIlIIllIIll[2]];
        skillArray6[k.lIlIlIIllIIll[0]] = Skill.RANGED;
        skillArray6[k.lIlIlIIllIIll[1]] = Skill.DEFENCE;
        LONGRANGE = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[11]], skillArray6);
        Skill[] skillArray7 = new Skill[lIlIlIIllIIll[1]];
        skillArray7[k.lIlIlIIllIIll[0]] = Skill.MAGIC;
        CASTING = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[13]], skillArray7);
        Skill[] skillArray8 = new Skill[lIlIlIIllIIll[2]];
        skillArray8[k.lIlIlIIllIIll[0]] = Skill.MAGIC;
        skillArray8[k.lIlIlIIllIIll[1]] = Skill.DEFENCE;
        DEFENSIVE_CASTING = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[15]], skillArray8);
        OTHER = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[17]], new Skill[lIlIlIIllIIll[0]]);
        k[] kArray = new k[lIlIlIIllIIll[9]];
        kArray[k.lIlIlIIllIIll[0]] = ACCURATE;
        kArray[k.lIlIlIIllIIll[1]] = AGGRESSIVE;
        kArray[k.lIlIlIIllIIll[2]] = DEFENSIVE;
        kArray[k.lIlIlIIllIIll[3]] = CONTROLLED;
        kArray[k.lIlIlIIllIIll[4]] = RANGING;
        kArray[k.lIlIlIIllIIll[5]] = LONGRANGE;
        kArray[k.lIlIlIIllIIll[6]] = CASTING;
        kArray[k.lIlIlIIllIIll[7]] = DEFENSIVE_CASTING;
        kArray[k.lIlIlIIllIIll[8]] = OTHER;
        $VALUES = kArray;
    }

    private static String lIllllIlllIlIll(String var10, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIlIIllIIll[8]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIlIlIIllIIll[2], var14);
            return new String(var19.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private k(String string2, Skill ... skillArray) {
        this.name = string2;
        this.skills = skillArray;
    }

    public Skill[] N() {
        return this.skills;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public String M() {
        return this.name;
    }
}

