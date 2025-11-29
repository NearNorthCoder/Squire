/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.m;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.n;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.q;

public final class r
extends Enum<r> {
    public static final /* synthetic */ /* enum */ r CLAW;
    public static final /* synthetic */ /* enum */ r WHIP;
    public static final /* synthetic */ /* enum */ r AXE;
    public static final /* synthetic */ /* enum */ r SPEAR;
    public static final /* synthetic */ /* enum */ r PICKAXE;
    private final /* synthetic */ int varpValue;
    public static final /* synthetic */ /* enum */ r SLASHING_SWORD;
    public static final /* synthetic */ /* enum */ r BULWARK;
    public static final /* synthetic */ /* enum */ r STAFF;
    public static final /* synthetic */ /* enum */ r SALAMANDER;
    public static final /* synthetic */ /* enum */ r BLUNT_WEAPON;
    private static /* synthetic */ int[] lllIllllIIII;
    private static /* synthetic */ String[] lllIlllIllIl;
    public static final /* synthetic */ /* enum */ r TYPE_29;
    public static final /* synthetic */ /* enum */ r SPIKED_WEAPON;
    public static final /* synthetic */ /* enum */ r GUN;
    public static final /* synthetic */ /* enum */ r UNARMED;
    public static final /* synthetic */ /* enum */ r TYPE_22;
    public static final /* synthetic */ /* enum */ r STABBING_SWORD;
    public static final /* synthetic */ /* enum */ r HALBERD;
    public static final /* synthetic */ /* enum */ r TRIDENT_WEAPON;
    public static final /* synthetic */ /* enum */ r BLADED_STAFF;
    public static final /* synthetic */ /* enum */ r BOW;
    private final /* synthetic */ o[] combatOptions;
    public static final /* synthetic */ /* enum */ r SCYTHE;
    public static final /* synthetic */ /* enum */ r CROSSBOW;
    private static final /* synthetic */ r[] $VALUES;
    public static final /* synthetic */ /* enum */ r THROWN_WEAPON;
    public static final /* synthetic */ /* enum */ r TYPE_28;
    public static final /* synthetic */ /* enum */ r TWO_HANDED_SWORD;
    public static final /* synthetic */ /* enum */ r POLESTAVE;
    public static final /* synthetic */ /* enum */ r TYPE_25;
    public static final /* synthetic */ /* enum */ r ABYSSAL_BLUDGEON;
    public static final /* synthetic */ /* enum */ r TYPE_24;
    public static final /* synthetic */ /* enum */ r CHINCHOMPA;

    private static String lIIIllIlllllIIl(String var15, String var17) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var18 = var17.toCharArray();
        int var2 = lllIllllIIII[0];
        char[] var14 = var15.toCharArray();
        int var5 = var14.length;
        int var19 = lllIllllIIII[0];
        while (r.lIIIlllIIIIllIl(var19, var5)) {
            char var10 = var14[var19];
            var6.append((char)(var10 ^ var18[var2 % var18.length]));
            0;
            ++var2;
            ++var19;
            0;
            if ((0x7F ^ 0x7B) > 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void lIIIlllIIIIlIIl() {
        lllIllllIIII = new int[31];
        r.lllIllllIIII[0] = (0x6A ^ 0x73 ^ (0x69 ^ 0x36)) & (103 + 127 - 112 + 128 ^ 37 + 36 - -19 + 84 ^ -1);
        r.lllIllllIIII[1] = 0x34 ^ 1 ^ (0x1E ^ 0x2F);
        r.lllIllllIIII[2] = 1;
        r.lllIllllIIII[3] = 2;
        r.lllIllllIIII[4] = 3;
        r.lllIllllIIII[5] = 153 + 71 - 101 + 62 ^ 57 + 141 - 119 + 109;
        r.lllIllllIIII[6] = 13 + 79 - 29 + 117 ^ 67 + 63 - -12 + 36;
        r.lllIllllIIII[7] = 0x49 ^ 0x4E;
        r.lllIllllIIII[8] = 0x9E ^ 0x96;
        r.lllIllllIIII[9] = 0xCB ^ 0xC2;
        r.lllIllllIIII[10] = 0xA2 ^ 0xA8;
        r.lllIllllIIII[11] = 0x69 ^ 0x62;
        r.lllIllllIIII[12] = 0x69 ^ 0x65;
        r.lllIllllIIII[13] = 87 + 15 - -82 + 21 ^ 43 + 117 - 53 + 85;
        r.lllIllllIIII[14] = 0xA0 ^ 0xAE;
        r.lllIllllIIII[15] = 0x20 ^ 0x7F ^ (0xEE ^ 0xBE);
        r.lllIllllIIII[16] = 43 + 6 - 40 + 205 ^ 91 + 119 - 17 + 5;
        r.lllIllllIIII[17] = 0xBC ^ 0x95 ^ (0xB4 ^ 0x8C);
        r.lllIllllIIII[18] = 0x75 ^ 0x67;
        r.lllIllllIIII[19] = 0x49 ^ 0x5A;
        r.lllIllllIIII[20] = 0xBD ^ 0xB4 ^ (0x65 ^ 0x78);
        r.lllIllllIIII[21] = 59 + 40 - 53 + 85 ^ 89 + 93 - 155 + 123;
        r.lllIllllIIII[22] = 0x87 ^ 0xC5 ^ (0xFB ^ 0xAF);
        r.lllIllllIIII[23] = 0x17 ^ 0;
        r.lllIllllIIII[24] = 0xA0 ^ 0xB8;
        r.lllIllllIIII[25] = 37 + 108 - 49 + 125 ^ 186 + 153 - 144 + 1;
        r.lllIllllIIII[26] = 0x56 ^ 0x4C;
        r.lllIllllIIII[27] = 0xED ^ 0x96 ^ (0xE ^ 0x6E);
        r.lllIllllIIII[28] = 0x7E ^ 0x2E ^ (0x71 ^ 0x3D);
        r.lllIllllIIII[29] = 48 + 60 - 94 + 161 ^ 92 + 146 - 119 + 59;
        r.lllIllllIIII[30] = 0x36 ^ 0x28;
    }

    static {
        r.lIIIlllIIIIlIIl();
        r.lIIIlllIIIIlIII();
        o[] oArray = new o[lllIllllIIII[1]];
        Skill[] skillArray = new Skill[lllIllllIIII[2]];
        skillArray[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray[r.lllIllllIIII[0]] = new o(q.PUNCH, n.CRUSH, m.ACCURATE, skillArray);
        Skill[] skillArray2 = new Skill[lllIllllIIII[2]];
        skillArray2[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray[r.lllIllllIIII[2]] = new o(q.KICK, n.CRUSH, m.AGGRESSIVE, skillArray2);
        oArray[r.lllIllllIIII[3]] = null;
        Skill[] skillArray3 = new Skill[lllIllllIIII[2]];
        skillArray3[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray[r.lllIllllIIII[4]] = new o(q.BLOCK, n.CRUSH, m.DEFENSIVE, skillArray3);
        UNARMED = new r(lllIllllIIII[0], oArray);
        o[] oArray2 = new o[lllIllllIIII[1]];
        Skill[] skillArray4 = new Skill[lllIllllIIII[2]];
        skillArray4[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray2[r.lllIllllIIII[0]] = new o(q.CHOP, n.SLASH, m.ACCURATE, skillArray4);
        Skill[] skillArray5 = new Skill[lllIllllIIII[2]];
        skillArray5[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray2[r.lllIllllIIII[2]] = new o(q.HACK, n.SLASH, m.AGGRESSIVE, skillArray5);
        Skill[] skillArray6 = new Skill[lllIllllIIII[2]];
        skillArray6[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray2[r.lllIllllIIII[3]] = new o(q.SMASH, n.CRUSH, m.AGGRESSIVE, skillArray6);
        Skill[] skillArray7 = new Skill[lllIllllIIII[2]];
        skillArray7[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray2[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray7);
        AXE = new r(lllIllllIIII[2], oArray2);
        o[] oArray3 = new o[lllIllllIIII[1]];
        Skill[] skillArray8 = new Skill[lllIllllIIII[2]];
        skillArray8[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray3[r.lllIllllIIII[0]] = new o(q.POUND, n.CRUSH, m.ACCURATE, skillArray8);
        Skill[] skillArray9 = new Skill[lllIllllIIII[2]];
        skillArray9[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray3[r.lllIllllIIII[2]] = new o(q.PUMMEL, n.CRUSH, m.AGGRESSIVE, skillArray9);
        oArray3[r.lllIllllIIII[3]] = null;
        Skill[] skillArray10 = new Skill[lllIllllIIII[2]];
        skillArray10[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray3[r.lllIllllIIII[4]] = new o(q.BLOCK, n.CRUSH, m.DEFENSIVE, skillArray10);
        BLUNT_WEAPON = new r(lllIllllIIII[3], oArray3);
        o[] oArray4 = new o[lllIllllIIII[1]];
        Skill[] skillArray11 = new Skill[lllIllllIIII[2]];
        skillArray11[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray4[r.lllIllllIIII[0]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray11);
        Skill[] skillArray12 = new Skill[lllIllllIIII[2]];
        skillArray12[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray4[r.lllIllllIIII[2]] = new o(q.RAPID, n.NONE, m.NONE, skillArray12);
        oArray4[r.lllIllllIIII[3]] = null;
        oArray4[r.lllIllllIIII[4]] = new o(q.LONGRANGE, n.NONE, m.NONE, Skill.RANGED, Skill.DEFENCE);
        BOW = new r(lllIllllIIII[4], oArray4);
        o[] oArray5 = new o[lllIllllIIII[1]];
        Skill[] skillArray13 = new Skill[lllIllllIIII[2]];
        skillArray13[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray5[r.lllIllllIIII[0]] = new o(q.CHOP, n.SLASH, m.ACCURATE, skillArray13);
        Skill[] skillArray14 = new Skill[lllIllllIIII[2]];
        skillArray14[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray5[r.lllIllllIIII[2]] = new o(q.SLASH, n.SLASH, m.AGGRESSIVE, skillArray14);
        Skill[] skillArray15 = new Skill[lllIllllIIII[4]];
        skillArray15[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray15[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray15[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray5[r.lllIllllIIII[3]] = new o(q.LUNGE, n.STAB, m.CONTROLLED, skillArray15);
        Skill[] skillArray16 = new Skill[lllIllllIIII[2]];
        skillArray16[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray5[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray16);
        CLAW = new r(lllIllllIIII[1], oArray5);
        o[] oArray6 = new o[lllIllllIIII[1]];
        Skill[] skillArray17 = new Skill[lllIllllIIII[2]];
        skillArray17[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray6[r.lllIllllIIII[0]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray17);
        Skill[] skillArray18 = new Skill[lllIllllIIII[2]];
        skillArray18[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray6[r.lllIllllIIII[2]] = new o(q.RAPID, n.NONE, m.NONE, skillArray18);
        oArray6[r.lllIllllIIII[3]] = null;
        oArray6[r.lllIllllIIII[4]] = new o(q.LONGRANGE, n.NONE, m.NONE, Skill.RANGED, Skill.DEFENCE);
        CROSSBOW = new r(lllIllllIIII[5], oArray6);
        o[] oArray7 = new o[lllIllllIIII[4]];
        Skill[] skillArray19 = new Skill[lllIllllIIII[2]];
        skillArray19[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray7[r.lllIllllIIII[0]] = new o(q.SCORCH, n.SLASH, m.AGGRESSIVE, skillArray19);
        Skill[] skillArray20 = new Skill[lllIllllIIII[2]];
        skillArray20[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray7[r.lllIllllIIII[2]] = new o(q.FLARE, n.RANGED, m.ACCURATE, skillArray20);
        Skill[] skillArray21 = new Skill[lllIllllIIII[2]];
        skillArray21[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray7[r.lllIllllIIII[3]] = new o(q.BLAZE, n.MAGIC, m.DEFENSIVE, skillArray21);
        SALAMANDER = new r(lllIllllIIII[6], oArray7);
        o[] oArray8 = new o[lllIllllIIII[1]];
        Skill[] skillArray22 = new Skill[lllIllllIIII[2]];
        skillArray22[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray8[r.lllIllllIIII[0]] = new o(q.SHORT_FUSE, n.NONE, m.NONE, skillArray22);
        Skill[] skillArray23 = new Skill[lllIllllIIII[2]];
        skillArray23[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray8[r.lllIllllIIII[2]] = new o(q.MEDIUM_FUSE, n.NONE, m.NONE, skillArray23);
        oArray8[r.lllIllllIIII[3]] = null;
        oArray8[r.lllIllllIIII[4]] = new o(q.LONG_FUSE, n.NONE, m.NONE, Skill.RANGED, Skill.DEFENCE);
        CHINCHOMPA = new r(lllIllllIIII[7], oArray8);
        o[] oArray9 = new o[lllIllllIIII[3]];
        oArray9[r.lllIllllIIII[0]] = new o(q.AIM_AND_FIRE, n.NONE, m.NONE, new Skill[lllIllllIIII[0]]);
        Skill[] skillArray24 = new Skill[lllIllllIIII[2]];
        skillArray24[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray9[r.lllIllllIIII[2]] = new o(q.KICK, n.CRUSH, m.AGGRESSIVE, skillArray24);
        GUN = new r(lllIllllIIII[8], oArray9);
        o[] oArray10 = new o[lllIllllIIII[1]];
        Skill[] skillArray25 = new Skill[lllIllllIIII[2]];
        skillArray25[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray10[r.lllIllllIIII[0]] = new o(q.CHOP, n.SLASH, m.ACCURATE, skillArray25);
        Skill[] skillArray26 = new Skill[lllIllllIIII[2]];
        skillArray26[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray10[r.lllIllllIIII[2]] = new o(q.SLASH, n.SLASH, m.AGGRESSIVE, skillArray26);
        Skill[] skillArray27 = new Skill[lllIllllIIII[4]];
        skillArray27[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray27[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray27[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray10[r.lllIllllIIII[3]] = new o(q.LUNGE, n.STAB, m.CONTROLLED, skillArray27);
        Skill[] skillArray28 = new Skill[lllIllllIIII[2]];
        skillArray28[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray10[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray28);
        SLASHING_SWORD = new r(lllIllllIIII[9], oArray10);
        o[] oArray11 = new o[lllIllllIIII[1]];
        Skill[] skillArray29 = new Skill[lllIllllIIII[2]];
        skillArray29[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray11[r.lllIllllIIII[0]] = new o(q.CHOP, n.SLASH, m.ACCURATE, skillArray29);
        Skill[] skillArray30 = new Skill[lllIllllIIII[2]];
        skillArray30[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray11[r.lllIllllIIII[2]] = new o(q.SLASH, n.SLASH, m.AGGRESSIVE, skillArray30);
        Skill[] skillArray31 = new Skill[lllIllllIIII[2]];
        skillArray31[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray11[r.lllIllllIIII[3]] = new o(q.SMASH, n.CRUSH, m.AGGRESSIVE, skillArray31);
        Skill[] skillArray32 = new Skill[lllIllllIIII[2]];
        skillArray32[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray11[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray32);
        TWO_HANDED_SWORD = new r(lllIllllIIII[10], oArray11);
        o[] oArray12 = new o[lllIllllIIII[1]];
        Skill[] skillArray33 = new Skill[lllIllllIIII[2]];
        skillArray33[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray12[r.lllIllllIIII[0]] = new o(q.SPIKE, n.STAB, m.ACCURATE, skillArray33);
        Skill[] skillArray34 = new Skill[lllIllllIIII[2]];
        skillArray34[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray12[r.lllIllllIIII[2]] = new o(q.IMPALE, n.STAB, m.AGGRESSIVE, skillArray34);
        Skill[] skillArray35 = new Skill[lllIllllIIII[2]];
        skillArray35[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray12[r.lllIllllIIII[3]] = new o(q.SMASH, n.CRUSH, m.AGGRESSIVE, skillArray35);
        Skill[] skillArray36 = new Skill[lllIllllIIII[2]];
        skillArray36[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray12[r.lllIllllIIII[4]] = new o(q.BLOCK, n.STAB, m.DEFENSIVE, skillArray36);
        PICKAXE = new r(lllIllllIIII[11], oArray12);
        o[] oArray13 = new o[lllIllllIIII[1]];
        Skill[] skillArray37 = new Skill[lllIllllIIII[4]];
        skillArray37[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray37[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray37[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray13[r.lllIllllIIII[0]] = new o(q.JAB, n.STAB, m.CONTROLLED, skillArray37);
        Skill[] skillArray38 = new Skill[lllIllllIIII[2]];
        skillArray38[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray13[r.lllIllllIIII[2]] = new o(q.SWIPE, n.SLASH, m.AGGRESSIVE, skillArray38);
        oArray13[r.lllIllllIIII[3]] = null;
        Skill[] skillArray39 = new Skill[lllIllllIIII[2]];
        skillArray39[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray13[r.lllIllllIIII[4]] = new o(q.FEND, n.STAB, m.DEFENSIVE, skillArray39);
        HALBERD = new r(lllIllllIIII[12], oArray13);
        o[] oArray14 = new o[lllIllllIIII[1]];
        Skill[] skillArray40 = new Skill[lllIllllIIII[2]];
        skillArray40[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray14[r.lllIllllIIII[0]] = new o(q.BASH, n.CRUSH, m.ACCURATE, skillArray40);
        Skill[] skillArray41 = new Skill[lllIllllIIII[2]];
        skillArray41[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray14[r.lllIllllIIII[2]] = new o(q.POUND, n.CRUSH, m.AGGRESSIVE, skillArray41);
        oArray14[r.lllIllllIIII[3]] = null;
        Skill[] skillArray42 = new Skill[lllIllllIIII[2]];
        skillArray42[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray14[r.lllIllllIIII[4]] = new o(q.BLOCK, n.CRUSH, m.DEFENSIVE, skillArray42);
        POLESTAVE = new r(lllIllllIIII[13], oArray14);
        o[] oArray15 = new o[lllIllllIIII[1]];
        Skill[] skillArray43 = new Skill[lllIllllIIII[2]];
        skillArray43[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray15[r.lllIllllIIII[0]] = new o(q.REAP, n.SLASH, m.ACCURATE, skillArray43);
        Skill[] skillArray44 = new Skill[lllIllllIIII[2]];
        skillArray44[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray15[r.lllIllllIIII[2]] = new o(q.CHOP, n.SLASH, m.AGGRESSIVE, skillArray44);
        Skill[] skillArray45 = new Skill[lllIllllIIII[2]];
        skillArray45[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray15[r.lllIllllIIII[3]] = new o(q.JAB, n.CRUSH, m.AGGRESSIVE, skillArray45);
        Skill[] skillArray46 = new Skill[lllIllllIIII[2]];
        skillArray46[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray15[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray46);
        SCYTHE = new r(lllIllllIIII[14], oArray15);
        o[] oArray16 = new o[lllIllllIIII[1]];
        Skill[] skillArray47 = new Skill[lllIllllIIII[4]];
        skillArray47[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray47[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray47[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray16[r.lllIllllIIII[0]] = new o(q.LUNGE, n.STAB, m.CONTROLLED, skillArray47);
        Skill[] skillArray48 = new Skill[lllIllllIIII[4]];
        skillArray48[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray48[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray48[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray16[r.lllIllllIIII[2]] = new o(q.SWIPE, n.SLASH, m.CONTROLLED, skillArray48);
        Skill[] skillArray49 = new Skill[lllIllllIIII[4]];
        skillArray49[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray49[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray49[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray16[r.lllIllllIIII[3]] = new o(q.POUND, n.CRUSH, m.CONTROLLED, skillArray49);
        Skill[] skillArray50 = new Skill[lllIllllIIII[2]];
        skillArray50[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray16[r.lllIllllIIII[4]] = new o(q.BLOCK, n.STAB, m.DEFENSIVE, skillArray50);
        SPEAR = new r(lllIllllIIII[15], oArray16);
        o[] oArray17 = new o[lllIllllIIII[1]];
        Skill[] skillArray51 = new Skill[lllIllllIIII[2]];
        skillArray51[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray17[r.lllIllllIIII[0]] = new o(q.POUND, n.CRUSH, m.ACCURATE, skillArray51);
        Skill[] skillArray52 = new Skill[lllIllllIIII[2]];
        skillArray52[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray17[r.lllIllllIIII[2]] = new o(q.PUMMEL, n.CRUSH, m.AGGRESSIVE, skillArray52);
        Skill[] skillArray53 = new Skill[lllIllllIIII[4]];
        skillArray53[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray53[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray53[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray17[r.lllIllllIIII[3]] = new o(q.SPIKE, n.STAB, m.CONTROLLED, skillArray53);
        Skill[] skillArray54 = new Skill[lllIllllIIII[2]];
        skillArray54[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray17[r.lllIllllIIII[4]] = new o(q.BLOCK, n.CRUSH, m.DEFENSIVE, skillArray54);
        SPIKED_WEAPON = new r(lllIllllIIII[16], oArray17);
        o[] oArray18 = new o[lllIllllIIII[1]];
        Skill[] skillArray55 = new Skill[lllIllllIIII[2]];
        skillArray55[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray18[r.lllIllllIIII[0]] = new o(q.STAB, n.STAB, m.ACCURATE, skillArray55);
        Skill[] skillArray56 = new Skill[lllIllllIIII[2]];
        skillArray56[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray18[r.lllIllllIIII[2]] = new o(q.LUNGE, n.STAB, m.AGGRESSIVE, skillArray56);
        Skill[] skillArray57 = new Skill[lllIllllIIII[2]];
        skillArray57[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray18[r.lllIllllIIII[3]] = new o(q.SLASH, n.SLASH, m.AGGRESSIVE, skillArray57);
        Skill[] skillArray58 = new Skill[lllIllllIIII[2]];
        skillArray58[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray18[r.lllIllllIIII[4]] = new o(q.BLOCK, n.STAB, m.DEFENSIVE, skillArray58);
        STABBING_SWORD = new r(lllIllllIIII[17], oArray18);
        o[] oArray19 = new o[lllIllllIIII[6]];
        Skill[] skillArray59 = new Skill[lllIllllIIII[2]];
        skillArray59[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray19[r.lllIllllIIII[0]] = new o(q.BASH, n.CRUSH, m.ACCURATE, skillArray59);
        Skill[] skillArray60 = new Skill[lllIllllIIII[2]];
        skillArray60[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray19[r.lllIllllIIII[2]] = new o(q.POUND, n.CRUSH, m.AGGRESSIVE, skillArray60);
        oArray19[r.lllIllllIIII[3]] = null;
        Skill[] skillArray61 = new Skill[lllIllllIIII[2]];
        skillArray61[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray19[r.lllIllllIIII[4]] = new o(q.FOCUS, n.CRUSH, m.DEFENSIVE, skillArray61);
        Skill[] skillArray62 = new Skill[lllIllllIIII[2]];
        skillArray62[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray19[r.lllIllllIIII[1]] = new o(q.SPELL, n.SPELLCASTING, m.MAGIC, skillArray62);
        oArray19[r.lllIllllIIII[5]] = new o(q.SPELL_DEFENSIVE, n.DEFENSIVE_CASTING, m.MAGIC, Skill.MAGIC, Skill.DEFENCE);
        STAFF = new r(lllIllllIIII[18], oArray19);
        o[] oArray20 = new o[lllIllllIIII[1]];
        Skill[] skillArray63 = new Skill[lllIllllIIII[2]];
        skillArray63[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray20[r.lllIllllIIII[0]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray63);
        Skill[] skillArray64 = new Skill[lllIllllIIII[2]];
        skillArray64[r.lllIllllIIII[0]] = Skill.RANGED;
        oArray20[r.lllIllllIIII[2]] = new o(q.RAPID, n.NONE, m.NONE, skillArray64);
        oArray20[r.lllIllllIIII[3]] = null;
        oArray20[r.lllIllllIIII[4]] = new o(q.LONGRANGE, n.NONE, m.NONE, Skill.RANGED, Skill.DEFENCE);
        THROWN_WEAPON = new r(lllIllllIIII[19], oArray20);
        o[] oArray21 = new o[lllIllllIIII[1]];
        Skill[] skillArray65 = new Skill[lllIllllIIII[2]];
        skillArray65[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray21[r.lllIllllIIII[0]] = new o(q.FLICK, n.SLASH, m.ACCURATE, skillArray65);
        Skill[] skillArray66 = new Skill[lllIllllIIII[4]];
        skillArray66[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray66[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray66[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray21[r.lllIllllIIII[2]] = new o(q.LASH, n.SLASH, m.CONTROLLED, skillArray66);
        oArray21[r.lllIllllIIII[3]] = null;
        Skill[] skillArray67 = new Skill[lllIllllIIII[2]];
        skillArray67[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray21[r.lllIllllIIII[4]] = new o(q.DEFLECT, n.SLASH, m.DEFENSIVE, skillArray67);
        WHIP = new r(lllIllllIIII[20], oArray21);
        o[] oArray22 = new o[lllIllllIIII[6]];
        Skill[] skillArray68 = new Skill[lllIllllIIII[2]];
        skillArray68[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray22[r.lllIllllIIII[0]] = new o(q.JAB, n.STAB, m.ACCURATE, skillArray68);
        Skill[] skillArray69 = new Skill[lllIllllIIII[2]];
        skillArray69[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray22[r.lllIllllIIII[2]] = new o(q.SWIPE, n.SLASH, m.AGGRESSIVE, skillArray69);
        oArray22[r.lllIllllIIII[3]] = null;
        Skill[] skillArray70 = new Skill[lllIllllIIII[2]];
        skillArray70[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray22[r.lllIllllIIII[4]] = new o(q.FEND, n.CRUSH, m.DEFENSIVE, skillArray70);
        Skill[] skillArray71 = new Skill[lllIllllIIII[2]];
        skillArray71[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray22[r.lllIllllIIII[1]] = new o(q.SPELL, n.SPELLCASTING, m.MAGIC, skillArray71);
        oArray22[r.lllIllllIIII[5]] = new o(q.SPELL_DEFENSIVE, n.DEFENSIVE_CASTING, m.MAGIC, Skill.MAGIC, Skill.DEFENCE);
        BLADED_STAFF = new r(lllIllllIIII[21], oArray22);
        o[] oArray23 = new o[lllIllllIIII[1]];
        Skill[] skillArray72 = new Skill[lllIllllIIII[2]];
        skillArray72[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray23[r.lllIllllIIII[0]] = new o(q.CHOP, n.SLASH, m.ACCURATE, skillArray72);
        Skill[] skillArray73 = new Skill[lllIllllIIII[2]];
        skillArray73[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray23[r.lllIllllIIII[2]] = new o(q.SLASH, n.SLASH, m.AGGRESSIVE, skillArray73);
        Skill[] skillArray74 = new Skill[lllIllllIIII[2]];
        skillArray74[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray23[r.lllIllllIIII[3]] = new o(q.SMASH, n.CRUSH, m.AGGRESSIVE, skillArray74);
        Skill[] skillArray75 = new Skill[lllIllllIIII[2]];
        skillArray75[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray23[r.lllIllllIIII[4]] = new o(q.BLOCK, n.SLASH, m.DEFENSIVE, skillArray75);
        TYPE_22 = new r(lllIllllIIII[22], oArray23);
        o[] oArray24 = new o[lllIllllIIII[1]];
        Skill[] skillArray76 = new Skill[lllIllllIIII[2]];
        skillArray76[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray24[r.lllIllllIIII[0]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray76);
        Skill[] skillArray77 = new Skill[lllIllllIIII[2]];
        skillArray77[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray24[r.lllIllllIIII[2]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray77);
        oArray24[r.lllIllllIIII[3]] = null;
        oArray24[r.lllIllllIIII[4]] = new o(q.LONGRANGE, n.NONE, m.NONE, Skill.MAGIC, Skill.DEFENCE);
        TRIDENT_WEAPON = new r(lllIllllIIII[24], oArray24);
        o[] oArray25 = new o[lllIllllIIII[1]];
        Skill[] skillArray78 = new Skill[lllIllllIIII[2]];
        skillArray78[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray25[r.lllIllllIIII[0]] = new o(q.LUNGE, n.STAB, m.ACCURATE, skillArray78);
        Skill[] skillArray79 = new Skill[lllIllllIIII[2]];
        skillArray79[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray25[r.lllIllllIIII[2]] = new o(q.SWIPE, n.SLASH, m.AGGRESSIVE, skillArray79);
        Skill[] skillArray80 = new Skill[lllIllllIIII[4]];
        skillArray80[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray80[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray80[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray25[r.lllIllllIIII[3]] = new o(q.POUND, n.CRUSH, m.CONTROLLED, skillArray80);
        Skill[] skillArray81 = new Skill[lllIllllIIII[2]];
        skillArray81[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray25[r.lllIllllIIII[4]] = new o(q.BLOCK, n.STAB, m.DEFENSIVE, skillArray81);
        TYPE_24 = new r(lllIllllIIII[25], oArray25);
        o[] oArray26 = new o[lllIllllIIII[1]];
        Skill[] skillArray82 = new Skill[lllIllllIIII[4]];
        skillArray82[r.lllIllllIIII[0]] = Skill.ATTACK;
        skillArray82[r.lllIllllIIII[2]] = Skill.STRENGTH;
        skillArray82[r.lllIllllIIII[3]] = Skill.DEFENCE;
        oArray26[r.lllIllllIIII[0]] = new o(q.JAB, n.STAB, m.CONTROLLED, skillArray82);
        Skill[] skillArray83 = new Skill[lllIllllIIII[2]];
        skillArray83[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray26[r.lllIllllIIII[2]] = new o(q.SWIPE, n.SLASH, m.AGGRESSIVE, skillArray83);
        oArray26[r.lllIllllIIII[3]] = null;
        Skill[] skillArray84 = new Skill[lllIllllIIII[2]];
        skillArray84[r.lllIllllIIII[0]] = Skill.DEFENCE;
        oArray26[r.lllIllllIIII[4]] = new o(q.FEND, n.STAB, m.DEFENSIVE, skillArray84);
        TYPE_25 = new r(lllIllllIIII[25], oArray26);
        o[] oArray27 = new o[lllIllllIIII[1]];
        Skill[] skillArray85 = new Skill[lllIllllIIII[2]];
        skillArray85[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray27[r.lllIllllIIII[0]] = new o(q.POUND, n.CRUSH, m.AGGRESSIVE, skillArray85);
        Skill[] skillArray86 = new Skill[lllIllllIIII[2]];
        skillArray86[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray27[r.lllIllllIIII[2]] = new o(q.PUMMEL, n.CRUSH, m.AGGRESSIVE, skillArray86);
        oArray27[r.lllIllllIIII[3]] = null;
        Skill[] skillArray87 = new Skill[lllIllllIIII[2]];
        skillArray87[r.lllIllllIIII[0]] = Skill.STRENGTH;
        oArray27[r.lllIllllIIII[4]] = new o(q.SMASH, n.CRUSH, m.AGGRESSIVE, skillArray87);
        ABYSSAL_BLUDGEON = new r(lllIllllIIII[26], oArray27);
        o[] oArray28 = new o[lllIllllIIII[1]];
        Skill[] skillArray88 = new Skill[lllIllllIIII[2]];
        skillArray88[r.lllIllllIIII[0]] = Skill.ATTACK;
        oArray28[r.lllIllllIIII[0]] = new o(q.PUMMEL, n.CRUSH, m.ACCURATE, skillArray88);
        oArray28[r.lllIllllIIII[2]] = null;
        oArray28[r.lllIllllIIII[3]] = null;
        oArray28[r.lllIllllIIII[4]] = new o(q.BLOCK, n.NONE, m.NONE, new Skill[lllIllllIIII[0]]);
        BULWARK = new r(lllIllllIIII[27], oArray28);
        o[] oArray29 = new o[lllIllllIIII[1]];
        Skill[] skillArray89 = new Skill[lllIllllIIII[2]];
        skillArray89[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray29[r.lllIllllIIII[0]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray89);
        Skill[] skillArray90 = new Skill[lllIllllIIII[2]];
        skillArray90[r.lllIllllIIII[0]] = Skill.MAGIC;
        oArray29[r.lllIllllIIII[2]] = new o(q.ACCURATE, n.NONE, m.NONE, skillArray90);
        oArray29[r.lllIllllIIII[3]] = null;
        oArray29[r.lllIllllIIII[4]] = new o(q.LONGRANGE, n.NONE, m.NONE, Skill.MAGIC, Skill.DEFENCE);
        TYPE_28 = new r(lllIllllIIII[29], oArray29);
        TYPE_29 = new r(lllIllllIIII[29], new o[lllIllllIIII[0]]);
        r[] rArray = new r[lllIllllIIII[30]];
        rArray[r.lllIllllIIII[0]] = UNARMED;
        rArray[r.lllIllllIIII[2]] = AXE;
        rArray[r.lllIllllIIII[3]] = BLUNT_WEAPON;
        rArray[r.lllIllllIIII[4]] = BOW;
        rArray[r.lllIllllIIII[1]] = CLAW;
        rArray[r.lllIllllIIII[5]] = CROSSBOW;
        rArray[r.lllIllllIIII[6]] = SALAMANDER;
        rArray[r.lllIllllIIII[7]] = CHINCHOMPA;
        rArray[r.lllIllllIIII[8]] = GUN;
        rArray[r.lllIllllIIII[9]] = SLASHING_SWORD;
        rArray[r.lllIllllIIII[10]] = TWO_HANDED_SWORD;
        rArray[r.lllIllllIIII[11]] = PICKAXE;
        rArray[r.lllIllllIIII[12]] = HALBERD;
        rArray[r.lllIllllIIII[13]] = POLESTAVE;
        rArray[r.lllIllllIIII[14]] = SCYTHE;
        rArray[r.lllIllllIIII[15]] = SPEAR;
        rArray[r.lllIllllIIII[16]] = SPIKED_WEAPON;
        rArray[r.lllIllllIIII[17]] = STABBING_SWORD;
        rArray[r.lllIllllIIII[18]] = STAFF;
        rArray[r.lllIllllIIII[19]] = THROWN_WEAPON;
        rArray[r.lllIllllIIII[20]] = WHIP;
        rArray[r.lllIllllIIII[21]] = BLADED_STAFF;
        rArray[r.lllIllllIIII[22]] = TYPE_22;
        rArray[r.lllIllllIIII[23]] = TRIDENT_WEAPON;
        rArray[r.lllIllllIIII[24]] = TYPE_24;
        rArray[r.lllIllllIIII[25]] = TYPE_25;
        rArray[r.lllIllllIIII[26]] = ABYSSAL_BLUDGEON;
        rArray[r.lllIllllIIII[27]] = BULWARK;
        rArray[r.lllIllllIIII[28]] = TYPE_28;
        rArray[r.lllIllllIIII[29]] = TYPE_29;
        $VALUES = rArray;
    }

    private static String lIIIllIllllIlll(String var1, String var16) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lllIllllIIII[8]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lllIllllIIII[3], var13);
            return new String(var12.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIIIlIII() {
        lllIlllIllIl = new String[lllIllllIIII[30]];
        r.lllIlllIllIl[r.lllIllllIIII[0]] = r."UNARMED";
        r.lllIlllIllIl[r.lllIllllIIII[2]] = r."AXE";
        r.lllIlllIllIl[r.lllIllllIIII[3]] = r."BLUNT_WEAPON";
        r.lllIlllIllIl[r.lllIllllIIII[4]] = r."BOW";
        r.lllIlllIllIl[r.lllIllllIIII[1]] = r."CLAW";
        r.lllIlllIllIl[r.lllIllllIIII[5]] = r."CROSSBOW";
        r.lllIlllIllIl[r.lllIllllIIII[6]] = r."SALAMANDER";
        r.lllIlllIllIl[r.lllIllllIIII[7]] = r."CHINCHOMPA";
        r.lllIlllIllIl[r.lllIllllIIII[8]] = r."GUN";
        r.lllIlllIllIl[r.lllIllllIIII[9]] = r."SLASHING_SWORD";
        r.lllIlllIllIl[r.lllIllllIIII[10]] = r."TWO_HANDED_SWORD";
        r.lllIlllIllIl[r.lllIllllIIII[11]] = r."PICKAXE";
        r.lllIlllIllIl[r.lllIllllIIII[12]] = r."HALBERD";
        r.lllIlllIllIl[r.lllIllllIIII[13]] = r."POLESTAVE";
        r.lllIlllIllIl[r.lllIllllIIII[14]] = r."SCYTHE";
        r.lllIlllIllIl[r.lllIllllIIII[15]] = r."SPEAR";
        r.lllIlllIllIl[r.lllIllllIIII[16]] = r."SPIKED_WEAPON";
        r.lllIlllIllIl[r.lllIllllIIII[17]] = r."STABBING_SWORD";
        r.lllIlllIllIl[r.lllIllllIIII[18]] = r."STAFF";
        r.lllIlllIllIl[r.lllIllllIIII[19]] = r."THROWN_WEAPON";
        r.lllIlllIllIl[r.lllIllllIIII[20]] = r."WHIP";
        r.lllIlllIllIl[r.lllIllllIIII[21]] = r."BLADED_STAFF";
        r.lllIlllIllIl[r.lllIllllIIII[22]] = r."TYPE_22";
        r.lllIlllIllIl[r.lllIllllIIII[23]] = r."TRIDENT_WEAPON";
        r.lllIlllIllIl[r.lllIllllIIII[24]] = r."TYPE_24";
        r.lllIlllIllIl[r.lllIllllIIII[25]] = r."TYPE_25";
        r.lllIlllIllIl[r.lllIllllIIII[26]] = r."ABYSSAL_BLUDGEON";
        r.lllIlllIllIl[r.lllIllllIIII[27]] = r."BULWARK";
        r.lllIlllIllIl[r.lllIllllIIII[28]] = r."TYPE_28";
        r.lllIlllIllIl[r.lllIllllIIII[29]] = r."TYPE_29";
    }

    private static boolean lIIIlllIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bj() {
        return Objects.equals((Object)p.bs(), (Object)this);
    }

    private r(int n3, o ... oArray) {
        this.varpValue = n3;
        this.combatOptions = oArray;
    }

    public int bD() {
        return this.varpValue;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static String lIIIllIlllllIII(String var3, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllIllllIIII[3], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public o[] bE() {
        return this.combatOptions;
    }
}

