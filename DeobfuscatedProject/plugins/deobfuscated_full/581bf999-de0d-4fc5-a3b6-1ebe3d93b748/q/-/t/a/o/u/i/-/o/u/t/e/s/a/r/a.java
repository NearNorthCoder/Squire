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
        a.llIlIlIIllI[1] = 1;
        a.llIlIlIIllI[2] = 0xF ^ 0x6B;
        a.llIlIlIIllI[3] = 0x54 ^ 0x51;
        a.llIlIlIIllI[4] = 0xA9 ^ 0xA6;
        a.llIlIlIIllI[5] = 3;
        a.llIlIlIIllI[6] = 2;
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
        Item var26;
        if (a.lIlIIllIllIIll(item)) {
            return new a[llIlIlIIllI[0]];
        }
        WeaponStyle var29 = WeaponMap.StyleMap.getOrDefault(var26.getId(), WeaponStyle.MELEE);
        ArrayList<a> var10 = new ArrayList<a>();
        a[] var19 = a.values();
        int var9 = var19.length;
        int var22 = llIlIlIIllI[0];
        while (a.lIlIIllIllIlII(var22, var9)) {
            a var17 = var19[var22];
            Skill[] var13 = var17.m();
            int var11 = var13.length;
            int var21 = llIlIlIIllI[0];
            while (a.lIlIIllIllIlII(var21, var11)) {
                Skill var18 = var13[var21];
                if (a.lIlIIllIllIlIl(a.a(var18, var29) ? 1 : 0)) {
                    var10.add(var17);
                    0;
                    0;
                    if (-1 != 3) break;
                    return null;
                }
                ++var21;
                0;
                if (3 > 0) continue;
                return null;
            }
            ++var22;
            0;
            if (2 < 3) continue;
            return null;
        }
        return var2_2.toArray(new a[llIlIlIIllI[0]]);
    }

    private static void lIlIIllIIllIll() {
        llIlIlIIIIl = new String[llIlIlIIllI[23]];
        a.llIlIlIIIIl[a.llIlIlIIllI[0]] = a."SUPER_COMBAT";
        a.llIlIlIIIIl[a.llIlIlIIllI[1]] = a."Super combat potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[6]] = a."DIVINE_SUPER_COMBAT";
        a.llIlIlIIIIl[a.llIlIlIIllI[5]] = a."Divine super combat potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[7]] = a."SUPER_STRENGTH";
        a.llIlIlIIIIl[a.llIlIlIIllI[3]] = a."Super strength";
        a.llIlIlIIIIl[a.llIlIlIIllI[8]] = a."SUPER_ATTACK";
        a.llIlIlIIIIl[a.llIlIlIIllI[9]] = a."Super attack";
        a.llIlIlIIIIl[a.llIlIlIIllI[10]] = a."SUPER_DEFENCE";
        a.llIlIlIIIIl[a.llIlIlIIllI[11]] = a."Super defence";
        a.llIlIlIIIIl[a.llIlIlIIllI[12]] = a."RANGING_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[13]] = a."Ranging potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[14]] = a."DIVINE_RANGING_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[15]] = a."Divine ranging potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[16]] = a."BASTION_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[4]] = a."Bastion potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[17]] = a."MAGIC_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[18]] = a."Magic potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[19]] = a."DIVINE_MAGIC_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[20]] = a."Divine magic potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[21]] = a."ANCIENT_BREW";
        a.llIlIlIIIIl[a.llIlIlIIllI[22]] = a."Ancient brew";
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
                void var5;
                if (a.lIlIIllIllIllI(var5, WeaponStyle.MELEE)) {
                    bl2 = llIlIlIIllI[1];
                    0;
                    if (-2 >= 0) {
                        return false;
                    }
                } else {
                    bl2 = llIlIlIIllI[0];
                }
                return bl2;
            }
            case 4: {
                boolean bl3;
                void var5;
                if (a.lIlIIllIllIllI(var5, WeaponStyle.RANGE)) {
                    bl3 = llIlIlIIllI[1];
                    0;
                    if (((0xCC ^ 0x82 ^ (0x17 ^ 0x65)) & (128 + 34 - 37 + 64 ^ 48 + 94 - 81 + 68 ^ -1)) != 0) {
                        return ((0x5B ^ 0x74 ^ (0x1B ^ 0x13)) & (0x35 ^ 0x23 ^ (0x27 ^ 0x16) ^ -1)) != 0;
                    }
                } else {
                    bl3 = llIlIlIIllI[0];
                }
                return bl3;
            }
            case 5: {
                boolean bl4;
                void var5;
                if (a.lIlIIllIllIllI(var5, WeaponStyle.MAGIC)) {
                    bl4 = llIlIlIIllI[1];
                    0;
                    
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

    private static String lIlIIllIIllIlI(String var25, String var30) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), llIlIlIIllI[10]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(llIlIlIIllI[6], var31);
            return new String(var24.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIIllIIl(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var16.toCharArray();
        int var14 = llIlIlIIllI[0];
        char[] var4 = var15.toCharArray();
        int var2 = var4.length;
        int var28 = llIlIlIIllI[0];
        while (a.lIlIIllIllIlII(var28, var2)) {
            char var23 = var4[var28];
            var6.append((char)(var23 ^ var7[var14 % var7.length]));
            0;
            ++var14;
            ++var28;
            0;
            if (((66 + 99 - 131 + 164 ^ 46 + 42 - -49 + 5) & (0xC5 ^ 0x97 ^ (0x2D ^ 0x37) ^ -1)) >= ((23 + 5 - -87 + 102 ^ 71 + 32 - -33 + 48) & (10 + 57 - -145 + 8 ^ 117 + 69 - 147 + 150 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean lIlIIllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static String lIlIIllIIllIII(String var27, String var1) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIlIlIIllI[6], var8);
            return new String(var12.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
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

