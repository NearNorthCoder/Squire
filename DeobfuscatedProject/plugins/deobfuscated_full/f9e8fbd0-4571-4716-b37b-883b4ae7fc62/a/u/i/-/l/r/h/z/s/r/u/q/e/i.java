/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class i
extends Enum<i> {
    private static final /* synthetic */ i[] $VALUES;
    private final /* synthetic */ Skill skill;
    public static final /* synthetic */ /* enum */ i NONE;
    public static final /* synthetic */ /* enum */ i DIVINE_BASTION;
    private static /* synthetic */ int[] lIllIlllllllI;
    public static final /* synthetic */ /* enum */ i RANGING_POTION;
    public static final /* synthetic */ /* enum */ i BASTION_POTION;
    private final /* synthetic */ String name;
    private static /* synthetic */ String[] lIllIlllllIll;
    public static final /* synthetic */ /* enum */ i MAGIC_POTION;
    public static final /* synthetic */ /* enum */ i DIVINE_RANGING;
    public static final /* synthetic */ /* enum */ i DIVINE_MAGIC_POTION;

    static {
        i.llIIlIlIIIIllIl();
        i.llIIlIlIIIIllII();
        RANGING_POTION = new i(lIllIlllllIll[lIllIlllllllI[0]], Skill.RANGED);
        DIVINE_RANGING = new i(lIllIlllllIll[lIllIlllllllI[4]], Skill.RANGED);
        BASTION_POTION = new i(lIllIlllllIll[lIllIlllllllI[6]], Skill.RANGED);
        DIVINE_BASTION = new i(lIllIlllllIll[lIllIlllllllI[7]], Skill.RANGED);
        MAGIC_POTION = new i(lIllIlllllIll[lIllIlllllllI[9]], Skill.MAGIC);
        DIVINE_MAGIC_POTION = new i(lIllIlllllIll[lIllIlllllllI[11]], Skill.MAGIC);
        NONE = new i(lIllIlllllIll[lIllIlllllllI[13]], null);
        i[] iArray = new i[lIllIlllllllI[7]];
        iArray[i.lIllIlllllllI[2]] = RANGING_POTION;
        iArray[i.lIllIlllllllI[0]] = DIVINE_RANGING;
        iArray[i.lIllIlllllllI[3]] = BASTION_POTION;
        iArray[i.lIllIlllllllI[4]] = DIVINE_BASTION;
        iArray[i.lIllIlllllllI[5]] = MAGIC_POTION;
        iArray[i.lIllIlllllllI[6]] = DIVINE_MAGIC_POTION;
        iArray[i.lIllIlllllllI[1]] = NONE;
        $VALUES = iArray;
    }

    private static boolean llIIlIlIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIlIlIIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIlIIIIllll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIlIIllllllIl(String var20, String var3) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIllIlllllllI[3], var12);
            return new String(var17.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIIIIlIll(String var5, String var13) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var2 = var13.toCharArray();
        int var15 = lIllIlllllllI[2];
        char[] var1 = var5.toCharArray();
        int var14 = var1.length;
        int var11 = lIllIlllllllI[2];
        while (i.llIIlIlIIIlIIIl(var11, var14)) {
            char var7 = var1[var11];
            var18.append((char)(var7 ^ var2[var15 % var2.length]));
            0;
            ++var15;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean llIIlIlIIIIlllI(Object object) {
        return object == null;
    }

    private static void llIIlIlIIIIllIl() {
        lIllIlllllllI = new int[15];
        i.lIllIlllllllI[0] = 1;
        i.lIllIlllllllI[1] = 0x8A ^ 0x8C;
        i.lIllIlllllllI[2] = (0x23 ^ 0x43) & ~(0x1E ^ 0x7E);
        i.lIllIlllllllI[3] = 2;
        i.lIllIlllllllI[4] = 3;
        i.lIllIlllllllI[5] = 0x14 ^ 0x10;
        i.lIllIlllllllI[6] = 141 + 54 - 46 + 5 ^ 86 + 55 - -3 + 15;
        i.lIllIlllllllI[7] = 0xBD ^ 0xBA;
        i.lIllIlllllllI[8] = 0x4B ^ 0x43;
        i.lIllIlllllllI[9] = 182 + 183 - 314 + 150 ^ 182 + 153 - 283 + 140;
        i.lIllIlllllllI[10] = 0x9B ^ 0x91;
        i.lIllIlllllllI[11] = 0x2F ^ 0x24;
        i.lIllIlllllllI[12] = 0x41 ^ 0x4D;
        i.lIllIlllllllI[13] = 0x8F ^ 0x82;
        i.lIllIlllllllI[14] = 128 + 33 - 93 + 106 ^ 147 + 55 - 165 + 123;
    }

    public String k() {
        return this.name;
    }

    public boolean v() {
        boolean bl;
        int n2;
        i var16;
        if (i.llIIlIlIIIIlllI(this.skill)) {
            return lIllIlllllllI[0];
        }
        int n3 = Skills.getBoostedLevel((Skill)var16.skill);
        int n4 = Skills.getLevel((Skill)var16.skill);
        if (i.llIIlIlIIIIllll((Object)var16, (Object)MAGIC_POTION)) {
            n2 = lIllIlllllllI[0];
            0;
            if (2 < ((0x35 ^ 0x16) & ~(0x92 ^ 0xB1))) {
                return false;
            }
        } else {
            n2 = lIllIlllllllI[1];
        }
        if (i.llIIlIlIIIlIIII(n3, n4 + n2)) {
            bl = lIllIlllllllI[0];
            0;
            if (-3 >= 0) {
                return ((5 ^ 0x4F ^ (0x15 ^ 1)) & (1 ^ (0x6A ^ 0x35) ^ -1)) != 0;
            }
        } else {
            bl = lIllIlllllllI[2];
        }
        return bl;
    }

    private i(String string2, Skill skill) {
        this.name = string2;
        this.skill = skill;
    }

    private static String llIIlIIllllllII(String var4, String var6) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIllIlllllllI[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllIlllllllI[3], var10);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static void llIIlIlIIIIllII() {
        lIllIlllllIll = new String[lIllIlllllllI[14]];
        i.lIllIlllllIll[i.lIllIlllllllI[2]] = i."RANGING_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[0]] = i."Ranging potion";
        i.lIllIlllllIll[i.lIllIlllllllI[3]] = i."DIVINE_RANGING";
        i.lIllIlllllIll[i.lIllIlllllllI[4]] = i."Divine ranging potion";
        i.lIllIlllllIll[i.lIllIlllllllI[5]] = i."BASTION_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[6]] = i."Bastion potion";
        i.lIllIlllllIll[i.lIllIlllllllI[1]] = i."DIVINE_BASTION";
        i.lIllIlllllIll[i.lIllIlllllllI[7]] = i."Divine bastion potion";
        i.lIllIlllllIll[i.lIllIlllllllI[8]] = i."MAGIC_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[9]] = i."Magic potion";
        i.lIllIlllllIll[i.lIllIlllllllI[10]] = i."DIVINE_MAGIC_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[11]] = i."Divine magic potion";
        i.lIllIlllllIll[i.lIllIlllllllI[12]] = i."NONE";
        i.lIllIlllllIll[i.lIllIlllllllI[13]] = i."None";
    }
}

