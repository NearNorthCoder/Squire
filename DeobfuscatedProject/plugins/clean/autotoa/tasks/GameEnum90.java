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
package gg.squire.autotoa.tasks;

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

public final class GameEnum90
extends Enum<a> {
    private final  int boostAmount;
    private final  int percentage;
    
    public static final  /* enum */ a ANCIENT_BREW;
    public static final  /* enum */ a DIVINE_MAGIC_POTION;
    public static final  /* enum */ a SUPER_DEFENCE;
    public static final  /* enum */ a DIVINE_SUPER_COMBAT;
    public static final  /* enum */ a SUPER_COMBAT;
    public static final  /* enum */ a SUPER_ATTACK;
    private final  String name;
    private final  Skill[] skills;
    public static final  /* enum */ a BASTION_POTION;
    private static final  a[] $VALUES;
    public static final  /* enum */ a RANGING_POTION;
    
    public static final  /* enum */ a DIVINE_RANGING_POTION;
    public static final  /* enum */ a MAGIC_POTION;
    public static final  /* enum */ a SUPER_STRENGTH;

    private static boolean lIlIIllIllIlIl(int n2) {
        return n2 != 0;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public int GameEnum90(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / llIlIlIIllI[2];
    }

    private static boolean lIlIIllIllIIll(Object object) {
        return object == null;
    }

    private GameEnum90(String string2, int n3, int n4, Skill ... skillArray) {
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
    public static a[] GameEnum90(Item item) {
        void var2_2;
        Item var1;
        if (a.lIlIIllIllIIll(item)) {
            return new a[llIlIlIIllI[0]];
        }
        WeaponStyle var2 = WeaponMap.StyleMap.getOrDefault(var1.getId(), WeaponStyle.MELEE);
        ArrayList<a> var3 = new ArrayList<a>();
        a[] var4 = a.values();
        int var5 = var4.length;
        int var6 = llIlIlIIllI[0];
        while (a.lIlIIllIllIlII(var6, var5)) {
            a var7 = var4[var6];
            Skill[] var8 = var7.m();
            int var9 = var8.length;
            int var10 = llIlIlIIllI[0];
            while (a.lIlIIllIllIlII(var10, var9)) {
                Skill var11 = var8[var10];
                if (a.lIlIIllIllIlIl(a.GameEnum90(var11, var2) ? 1 : 0)) {
                    var3.add(var7);

                    if (-1 != 3) break;
                    return null;
                }
                ++var10;

                if (3 > 0) continue;
                return null;
            }
            ++var6;

            if (2 < 3) continue;
            return null;
        }
        return var2_2.toArray(new a[llIlIlIIllI[0]]);
    }

    private static void lIlIIllIIllIll() {
        llIlIlIIIIl = new String[llIlIlIIllI[23]];
        a.llIlIlIIIIl[a.llIlIlIIllI[0]] = "SUPER_COMBAT";
        a.llIlIlIIIIl[a.llIlIlIIllI[1]] = "Super combat potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[6]] = "DIVINE_SUPER_COMBAT";
        a.llIlIlIIIIl[a.llIlIlIIllI[5]] = "Divine super combat potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[7]] = "SUPER_STRENGTH";
        a.llIlIlIIIIl[a.llIlIlIIllI[3]] = "Super strength";
        a.llIlIlIIIIl[a.llIlIlIIllI[8]] = "SUPER_ATTACK";
        a.llIlIlIIIIl[a.llIlIlIIllI[9]] = "Super attack";
        a.llIlIlIIIIl[a.llIlIlIIllI[10]] = "SUPER_DEFENCE";
        a.llIlIlIIIIl[a.llIlIlIIllI[11]] = "Super defence";
        a.llIlIlIIIIl[a.llIlIlIIllI[12]] = "RANGING_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[13]] = "Ranging potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[14]] = "DIVINE_RANGING_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[15]] = "Divine ranging potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[16]] = "BASTION_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[4]] = "Bastion potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[17]] = "MAGIC_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[18]] = "Magic potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[19]] = "DIVINE_MAGIC_POTION";
        a.llIlIlIIIIl[a.llIlIlIIllI[20]] = "Divine magic potion";
        a.llIlIlIIIIl[a.llIlIlIIllI[21]] = "ANCIENT_BREW";
        a.llIlIlIIIIl[a.llIlIlIIllI[22]] = "Ancient brew";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean GameEnum90(Skill skill, WeaponStyle weaponStyle) {
        switch (b.C[skill.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                boolean bl2;
                void var12;
                if (a.lIlIIllIllIllI(var12, WeaponStyle.MELEE)) {
                    bl2 = llIlIlIIllI[1];

                } else {
                    bl2 = llIlIlIIllI[0];
                }
                return bl2;
            }
            case 4: {
                boolean bl3;
                void var12;
                if (a.lIlIIllIllIllI(var12, WeaponStyle.RANGE)) {
                    bl3 = llIlIlIIllI[1];

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
                void var12;
                if (a.lIlIIllIllIllI(var12, WeaponStyle.MAGIC)) {
                    bl4 = llIlIlIIllI[1];

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

        return String.valueOf(var13);
    }

    private static boolean lIlIIllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIllIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        a.lIlIIllIllIIlI();
        a.lIlIIllIIllIll();
        Skill[] skillArray = new Skill[llIlIlIIllI[5]];
        skillArray[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArray[a.llIlIlIIllI[1]] = Skill.ATTACK;
        skillArray[a.llIlIlIIllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[1]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray);
        Skill[] skillArray2 = new Skill[llIlIlIIllI[5]];
        skillArray2[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        skillArray2[a.llIlIlIIllI[1]] = Skill.ATTACK;
        skillArray2[a.llIlIlIIllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[5]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray2);
        Skill[] skillArray3 = new Skill[llIlIlIIllI[1]];
        skillArray3[a.llIlIlIIllI[0]] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[3]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray3);
        Skill[] skillArray4 = new Skill[llIlIlIIllI[1]];
        skillArray4[a.llIlIlIIllI[0]] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[9]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray4);
        Skill[] skillArray5 = new Skill[llIlIlIIllI[1]];
        skillArray5[a.llIlIlIIllI[0]] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[11]], llIlIlIIllI[3], llIlIlIIllI[4], skillArray5);
        Skill[] skillArray6 = new Skill[llIlIlIIllI[1]];
        skillArray6[a.llIlIlIIllI[0]] = Skill.RANGED;
        RANGING_POTION = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[13]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray6);
        Skill[] skillArray7 = new Skill[llIlIlIIllI[1]];
        skillArray7[a.llIlIlIIllI[0]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[15]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray7);
        Skill[] skillArray8 = new Skill[llIlIlIIllI[6]];
        skillArray8[a.llIlIlIIllI[0]] = Skill.RANGED;
        skillArray8[a.llIlIlIIllI[1]] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[4]], llIlIlIIllI[7], llIlIlIIllI[12], skillArray8);
        Skill[] skillArray9 = new Skill[llIlIlIIllI[1]];
        skillArray9[a.llIlIlIIllI[0]] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[18]], llIlIlIIllI[7], llIlIlIIllI[0], skillArray9);
        Skill[] skillArray10 = new Skill[llIlIlIIllI[1]];
        skillArray10[a.llIlIlIIllI[0]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[20]], llIlIlIIllI[7], llIlIlIIllI[0], skillArray10);
        Skill[] skillArray11 = new Skill[llIlIlIIllI[1]];
        skillArray11[a.llIlIlIIllI[0]] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum90(llIlIlIIIIl[llIlIlIIllI[22]], llIlIlIIllI[6], llIlIlIIllI[3], skillArray11);
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
        return Enum.valueOf(GameEnum90.class, string);
    }
}

