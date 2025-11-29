/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.l;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.p;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class S
implements K {
    public static /* synthetic */ WorldArea cH;
    private static /* synthetic */ String[] lIllIIllII;
    public static /* synthetic */ WorldPoint cJ;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIllIIllIl;
    public static /* synthetic */ WorldPoint ce;

    private static void lIIlIllllIlIl() {
        lIllIIllIl = new int[74];
        S.lIllIIllIl[0] = (0x2C ^ 0x39) & ~(0x9F ^ 0x8A);
        S.lIllIIllIl[1] = 1;
        S.lIllIIllIl[2] = 0xE ^ 0x10;
        S.lIllIIllIl[3] = 0x44 ^ 0x76;
        S.lIllIIllIl[4] = 2;
        S.lIllIIllIl[5] = 3;
        S.lIllIIllIl[6] = -2 & (0xFFFF97B9 & 0x7BCF);
        S.lIllIIllIl[7] = 1 ^ (0x49 ^ 0x4C);
        S.lIllIIllIl[8] = -(0xFFFFEF37 & 0x74C9) & (0xFFFFEFFF & 0x77E3);
        S.lIllIIllIl[9] = -(0xFFFFFC53 & 0xFBF) & (0xFFFF9FFA & 0x6FFF);
        S.lIllIIllIl[10] = 0xFFFF9F6F & 0x7FD7;
        S.lIllIIllIl[11] = 150 + 150 - 134 + 26 ^ 85 + 55 - 95 + 152;
        S.lIllIIllIl[12] = -(0xFFFFFFB7 & 0x36C9) & (0xFFFFB7FF & 0x7FFB);
        S.lIllIIllIl[13] = 0xBD ^ 0x8B ^ (0x35 ^ 0x67);
        S.lIllIIllIl[14] = 0xBE ^ 0xB1;
        S.lIllIIllIl[15] = 0x57 ^ 0x5C ^ (0x3B ^ 0x36);
        S.lIllIIllIl[16] = 0x64 ^ 0x63;
        S.lIllIIllIl[17] = -(0xFFFFFDEF & 0x1AD5) & (0xFFFFBFFF & 0x5DF7);
        S.lIllIIllIl[18] = -(0xFFFFBC1B & 0x5BED) & (0xFFFFBD7D & 0x5FBF);
        S.lIllIIllIl[19] = 6 ^ 0x50 ^ (0xCF ^ 0x91);
        S.lIllIIllIl[20] = 0x20 ^ 0x1C ^ (0xA5 ^ 0x8D);
        S.lIllIIllIl[21] = 0x2E ^ 6;
        S.lIllIIllIl[22] = 0x46 ^ 0x4F;
        S.lIllIIllIl[23] = 0x30 ^ 0x79 ^ (0xF4 ^ 0xB7);
        S.lIllIIllIl[24] = 0xA5 ^ 0xAE;
        S.lIllIIllIl[25] = 0x45 ^ 0x49;
        S.lIllIIllIl[26] = 0x9F ^ 0x83 ^ (0x6E ^ 0x7F);
        S.lIllIIllIl[27] = 10 + 137 - 127 + 136 ^ 95 + 121 - 112 + 42;
        S.lIllIIllIl[28] = 3 ^ (0x9C ^ 0x8F);
        S.lIllIIllIl[29] = 116 + 56 - 92 + 88 ^ 86 + 114 - 126 + 111;
        S.lIllIIllIl[30] = -1;
        S.lIllIIllIl[31] = 0xFFFFD85F & 0x25127BE;
        S.lIllIIllIl[32] = 98 + 95 - 94 + 66 ^ 57 + 85 - -20 + 21;
        S.lIllIIllIl[33] = 0x85 ^ 0xB1 ^ (0x96 ^ 0xB1);
        S.lIllIIllIl[34] = 0x6C ^ 6 ^ 25 + 96 - 71 + 77;
        S.lIllIIllIl[35] = 5 ^ 0x13;
        S.lIllIIllIl[36] = 0xD5 ^ 0xC2;
        S.lIllIIllIl[37] = 0 ^ 0x18;
        S.lIllIIllIl[38] = 0x7B ^ 0x62;
        S.lIllIIllIl[39] = 0x7B ^ 0x61;
        S.lIllIIllIl[40] = 69 + 22 - 44 + 83 ^ 8 + 31 - -33 + 81;
        S.lIllIIllIl[41] = 69 + 104 - 35 + 28 ^ 47 + 55 - 24 + 108;
        S.lIllIIllIl[42] = -(0xFFFFBF33 & 0x53EF) & (0xFFFFB7BB & 0x5FEF);
        S.lIllIIllIl[43] = 0x26 ^ 0x3B;
        S.lIllIIllIl[44] = 0xFFFFA57B & 0x5EE7;
        S.lIllIIllIl[45] = -(0xFFFFEDFF & 0x738F) & (0xFFFFF7BF & 0x6DFF);
        S.lIllIIllIl[46] = 0x6A ^ 0x75;
        S.lIllIIllIl[47] = -(0xFFFFB47B & 0x5BD5) & (0xFFFF9CFF & 0x77FF);
        S.lIllIIllIl[48] = 140 + 100 - 173 + 89 ^ 100 + 69 - 133 + 152;
        S.lIllIIllIl[49] = -(0xFFFFE757 & 0x38EF) & (0xFFFFBFEE & 0x66FF);
        S.lIllIIllIl[50] = 4 ^ 0x41 ^ (0x7C ^ 0x18);
        S.lIllIIllIl[51] = -(0xFFFFF6D2 & 0x192F) & (0xFFFFBF7F & 0x7BF7);
        S.lIllIIllIl[52] = 0x47 ^ 0x33 ^ (0x27 ^ 0x71);
        S.lIllIIllIl[53] = -(0xFFFFF5F7 & 0x1A4B) & (0xFFFF97DF & 0x7BE6);
        S.lIllIIllIl[54] = -(0x93 ^ 0x94) & (0xFFFFFFCF & 0x1F7E);
        S.lIllIIllIl[55] = -(0xFFFFFFFF & 0x7703) & (0xFFFFFFFB & 0xFFBE);
        S.lIllIIllIl[56] = -(0xFFFF9ECF & 0x7334) & (0xFFFFF3AF & 0x7FFB);
        S.lIllIIllIl[57] = -(0xFFFFFE5B & 0x77AD) & (0xFFFFF7FC & Short.MAX_VALUE);
        S.lIllIIllIl[58] = 0xFFFFBEBC & 0x7BDB;
        S.lIllIIllIl[59] = 103 + 43 - 119 + 129 ^ 120 + 14 - 121 + 178;
        S.lIllIIllIl[60] = 177 + 101 - 113 + 65 ^ 31 + 105 - 102 + 160;
        S.lIllIIllIl[61] = 0xFFFFEED9 & 0x1DBF;
        S.lIllIIllIl[62] = 0xFFFF8FFB & 0x7CDE;
        S.lIllIIllIl[63] = -(0xFFFFB9D1 & 0x766F) & (0xFFFFFCFD & 0x3FEE);
        S.lIllIIllIl[64] = 0xFFFFCDF7 & 0x3ED8;
        S.lIllIIllIl[65] = -(0xFFFFA37F & 0x5F85) & (0xFFFFDFF5 & 0x2F7F);
        S.lIllIIllIl[66] = 0xFFFFCD7F & 0x3EDF;
        S.lIllIIllIl[67] = 0x4C ^ 0x7C;
        S.lIllIIllIl[68] = -(0xFFFFBD93 & 0x537F) & (0xFFFFDF9F & 0x3DFF);
        S.lIllIIllIl[69] = 0xFFFFEF7F & 0x1CED;
        S.lIllIIllIl[70] = -(0xFFFFF32B & 0x1DD5) & (0xFFFFBDF7 & 0x5FBE);
        S.lIllIIllIl[71] = -(0xFFFFFF2F & 0x73F1) & (0xFFFFFFFF & 0x7FBF);
        S.lIllIIllIl[72] = -(0xFFFFB627 & 0x7BDF) & (0xFFFFFFEE & 0x3EF7);
        S.lIllIIllIl[73] = 0x63 ^ 0x46;
    }

    public static void O() {
        d var22;
        int[] nArray = new int[lIllIIllIl[1]];
        nArray[S.lIllIIllIl[0]] = lIllIIllIl[10];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllIIllIl[10], lIllIIllIl[21], lIllIIllIl[53]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllIIllIl[1]];
        nArray2[S.lIllIIllIl[0]] = lIllIIllIl[54];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[54], lIllIIllIl[11], lIllIIllIl[53]);
            bp.add(var22);
            0;
        }
        int[] nArray3 = new int[lIllIIllIl[1]];
        nArray3[S.lIllIIllIl[0]] = lIllIIllIl[51];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[51], lIllIIllIl[1], lIllIIllIl[55]);
            bp.add(var22);
            0;
        }
        int[] nArray4 = new int[lIllIIllIl[1]];
        nArray4[S.lIllIIllIl[0]] = lIllIIllIl[49];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[49], lIllIIllIl[1], lIllIIllIl[56]);
            bp.add(var22);
            0;
        }
        int[] nArray5 = new int[lIllIIllIl[1]];
        nArray5[S.lIllIIllIl[0]] = lIllIIllIl[12];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[12], lIllIIllIl[13], lIllIIllIl[57]);
            bp.add(var22);
            0;
        }
        int[] nArray6 = new int[lIllIIllIl[1]];
        nArray6[S.lIllIIllIl[0]] = lIllIIllIl[42];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[42], lIllIIllIl[1], lIllIIllIl[58]);
            bp.add(var22);
            0;
        }
        int[] nArray7 = new int[lIllIIllIl[1]];
        nArray7[S.lIllIIllIl[0]] = lIllIIllIl[45];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[45], lIllIIllIl[1], lIllIIllIl[58]);
            bp.add(var22);
            0;
        }
        int[] nArray8 = new int[lIllIIllIl[1]];
        nArray8[S.lIllIIllIl[0]] = lIllIIllIl[47];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[47], lIllIIllIl[1], lIllIIllIl[58]);
            bp.add(var22);
            0;
        }
        int[] nArray9 = new int[lIllIIllIl[1]];
        nArray9[S.lIllIIllIl[0]] = lIllIIllIl[44];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[44], lIllIIllIl[1], lIllIIllIl[58]);
            bp.add(var22);
            0;
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21])) {
            int[] nArray10 = new int[lIllIIllIl[1]];
            nArray10[S.lIllIIllIl[0]] = lIllIIllIl[18];
            if (S.lIIlIlllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var22 = new d(lIllIIllIl[18], lIllIIllIl[1], lIllIIllIl[56]);
                bp.add(var22);
                0;
            }
        }
        int[] nArray11 = new int[lIllIIllIl[1]];
        nArray11[S.lIllIIllIl[0]] = lIllIIllIl[17];
        if (S.lIIlIlllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var22 = new d(lIllIIllIl[17], lIllIIllIl[1], lIllIIllIl[58]);
            bp.add(var22);
            0;
        }
    }

    private static boolean lIIlIlllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllllIlll(int n2) {
        return n2 != 0;
    }

    public static void aM() {
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[23]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[23]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[23]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[23]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[23]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[23]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[20]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[23]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[23]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[20]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[23]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[20]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[20]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[2]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[20]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[2]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[2]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[20]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[2]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[2]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[21]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[2]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[21]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[3]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[3]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[3]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) && S.lIIllIIIIIIII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }

    private static boolean lIIlIlllllIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIllllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ac() {
        return lIllIIllIl[0];
    }

    private static boolean lIIlIlllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIllllIIll(String var23, String var21) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIllIl[4], var24);
            return new String(var6.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllllIl(int n2) {
        return n2 < 0;
    }

    private static int lIIlIllllIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIIlIllllIIlI(String var13, String var20) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var20.toCharArray();
        int var3 = lIllIIllIl[0];
        char[] var7 = var13.toCharArray();
        int var10 = var7.length;
        int var19 = lIllIIllIl[0];
        while (S.lIIlIlllllIII(var19, var10)) {
            char var18 = var7[var19];
            var2.append((char)(var18 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }

    @Override
    public boolean af() {
        int n2;
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[3]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[3]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2])) {
            n2 = lIllIIllIl[1];
            0;
            if (-(181 + 7 - 18 + 14 ^ 122 + 105 - 159 + 121) >= 0) {
                return ((0x46 ^ 0x3F ^ (0x42 ^ 0x17)) & (9 + 106 - 11 + 30 ^ 150 + 96 - 104 + 28 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIllIl[0];
        }
        return n2 != 0;
    }

    private static String lIIlIllllIIIl(String var12, String var16) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIllIIllIl[19]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIIllIl[4], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aL() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21])) break block4;
                                                                                    int[] nArray = new int[lIllIIllIl[1]];
                                                                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[18];
                                                                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lIllIIllIl[1]];
                                                                                    nArray2[S.lIllIIllIl[0]] = lIllIIllIl[18];
                                                                                    if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lIllIIllIl[1]];
                                                                                    nArray3[S.lIllIIllIl[0]] = lIllIIllIl[18];
                                                                                    if (!S.lIIlIllllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lIllIIllIl[1]];
                                                                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                                                                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lIllIIllIl[1]];
                                                                                nArray4[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                                                                if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lIllIIllIl[1]];
                                                                                nArray5[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                                                                if (!S.lIIlIllllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lIllIIllIl[1]];
                                                                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                                                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lIllIIllIl[1]];
                                                                            nArray6[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                                                            if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lIllIIllIl[1]];
                                                                            nArray7[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                                                            if (!S.lIIlIllllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lIllIIllIl[1]];
                                                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                                                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lIllIIllIl[1]];
                                                                        nArray8[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                                                        if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lIllIIllIl[1]];
                                                                        nArray9[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                                                        if (!S.lIIlIllllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lIllIIllIl[1]];
                                                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[47];
                                                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lIllIIllIl[1]];
                                                                    nArray10[S.lIllIIllIl[0]] = lIllIIllIl[47];
                                                                    if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lIllIIllIl[1]];
                                                                    nArray11[S.lIllIIllIl[0]] = lIllIIllIl[47];
                                                                    if (!S.lIIlIllllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lIllIIllIl[1]];
                                                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[49];
                                                                if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lIllIIllIl[1]];
                                                                nArray12[S.lIllIIllIl[0]] = lIllIIllIl[49];
                                                                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lIllIIllIl[1]];
                                                                nArray13[S.lIllIIllIl[0]] = lIllIIllIl[49];
                                                                if (!S.lIIlIllllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lIllIIllIl[1]];
                                                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[51];
                                                            if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lIllIIllIl[1]];
                                                            nArray14[S.lIllIIllIl[0]] = lIllIIllIl[51];
                                                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lIllIIllIl[1]];
                                                            nArray15[S.lIllIIllIl[0]] = lIllIIllIl[51];
                                                            if (!S.lIIlIllllIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lIllIIllIl[1]];
                                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[12];
                                                        if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lIllIIllIl[1]];
                                                        nArray16[S.lIllIIllIl[0]] = lIllIIllIl[12];
                                                        if (!S.lIIlIllllIlll(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lIllIIllIl[1];
                                                    0;
                                                    if (3 == 3) return n3 != 0;
                                                    return (2 & ~2) != 0;
                                                }
                                                n3 = lIllIIllIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lIllIIllIl[1]];
                                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[17];
                                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lIllIIllIl[1]];
                                            nArray17[S.lIllIIllIl[0]] = lIllIIllIl[17];
                                            if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lIllIIllIl[1]];
                                            nArray18[S.lIllIIllIl[0]] = lIllIIllIl[17];
                                            if (!S.lIIlIllllIlll(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lIllIIllIl[1]];
                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lIllIIllIl[1]];
                                        nArray19[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                        if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lIllIIllIl[1]];
                                        nArray20[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                        if (!S.lIIlIllllIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lIllIIllIl[1]];
                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lIllIIllIl[1]];
                                    nArray21[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                    if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lIllIIllIl[1]];
                                    nArray22[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                    if (!S.lIIlIllllIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lIllIIllIl[1]];
                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lIllIIllIl[1]];
                                nArray23[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lIllIIllIl[1]];
                                nArray24[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                if (!S.lIIlIllllIlll(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lIllIIllIl[1]];
                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[47];
                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lIllIIllIl[1]];
                            nArray25[S.lIllIIllIl[0]] = lIllIIllIl[47];
                            if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lIllIIllIl[1]];
                            nArray26[S.lIllIIllIl[0]] = lIllIIllIl[47];
                            if (!S.lIIlIllllIlll(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lIllIIllIl[1]];
                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[49];
                        if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lIllIIllIl[1]];
                        nArray27[S.lIllIIllIl[0]] = lIllIIllIl[49];
                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lIllIIllIl[1]];
                        nArray28[S.lIllIIllIl[0]] = lIllIIllIl[49];
                        if (!S.lIIlIllllIlll(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lIllIIllIl[1]];
                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[51];
                    if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lIllIIllIl[1]];
                    nArray29[S.lIllIIllIl[0]] = lIllIIllIl[51];
                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lIllIIllIl[1]];
                    nArray30[S.lIllIIllIl[0]] = lIllIIllIl[51];
                    if (!S.lIIlIllllIlll(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lIllIIllIl[1]];
                nArray[S.lIllIIllIl[0]] = lIllIIllIl[12];
                if (!S.lIIlIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lIllIIllIl[1]];
                nArray31[S.lIllIIllIl[0]] = lIllIIllIl[12];
                if (!S.lIIlIllllIlll(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lIllIIllIl[1];
            0;
            if (((0xF4 ^ 0xC3) & ~(0xA1 ^ 0x96)) == 0) return n2 != 0;
            return false;
        }
        n2 = lIllIIllIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21])) break block8;
                                                                            int[] nArray = new int[lIllIIllIl[1]];
                                                                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[18];
                                                                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lIllIIllIl[1]];
                                                                            nArray2[S.lIllIIllIl[0]] = lIllIIllIl[18];
                                                                            if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lIllIIllIl[1]];
                                                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                                                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lIllIIllIl[1]];
                                                                        nArray3[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                                                        if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lIllIIllIl[1]];
                                                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lIllIIllIl[1]];
                                                                    nArray4[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                                                    if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lIllIIllIl[1]];
                                                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                                                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lIllIIllIl[1]];
                                                                nArray5[S.lIllIIllIl[0]] = lIllIIllIl[42];
                                                                if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lIllIIllIl[1]];
                                                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[47];
                                                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lIllIIllIl[1]];
                                                            nArray6[S.lIllIIllIl[0]] = lIllIIllIl[47];
                                                            if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lIllIIllIl[1]];
                                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[49];
                                                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lIllIIllIl[1]];
                                                        nArray7[S.lIllIIllIl[0]] = lIllIIllIl[49];
                                                        if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lIllIIllIl[1]];
                                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[51];
                                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lIllIIllIl[1]];
                                                    nArray8[S.lIllIIllIl[0]] = lIllIIllIl[51];
                                                    if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lIllIIllIl[1]];
                                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[12];
                                                if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lIllIIllIl[1];
                                                    0;
                                                    if (2 < 3) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = lIllIIllIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lIllIIllIl[1]];
                                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[17];
                                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lIllIIllIl[1]];
                                        nArray9[S.lIllIIllIl[0]] = lIllIIllIl[17];
                                        if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lIllIIllIl[1]];
                                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lIllIIllIl[1]];
                                    nArray10[S.lIllIIllIl[0]] = lIllIIllIl[44];
                                    if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lIllIIllIl[1]];
                                nArray[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lIllIIllIl[1]];
                                nArray11[S.lIllIIllIl[0]] = lIllIIllIl[45];
                                if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lIllIIllIl[1]];
                            nArray[S.lIllIIllIl[0]] = lIllIIllIl[42];
                            if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lIllIIllIl[1]];
                            nArray12[S.lIllIIllIl[0]] = lIllIIllIl[42];
                            if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lIllIIllIl[1]];
                        nArray[S.lIllIIllIl[0]] = lIllIIllIl[47];
                        if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lIllIIllIl[1]];
                        nArray13[S.lIllIIllIl[0]] = lIllIIllIl[47];
                        if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lIllIIllIl[1]];
                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[49];
                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lIllIIllIl[1]];
                    nArray14[S.lIllIIllIl[0]] = lIllIIllIl[49];
                    if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lIllIIllIl[1]];
                nArray[S.lIllIIllIl[0]] = lIllIIllIl[51];
                if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lIllIIllIl[1]];
                nArray15[S.lIllIIllIl[0]] = lIllIIllIl[51];
                if (!S.lIIlIllllIlll(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lIllIIllIl[1]];
            nArray[S.lIllIIllIl[0]] = lIllIIllIl[12];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIllIIllIl[1];
                0;
                if (((0x37 ^ 0x72) & ~(0xC3 ^ 0x86)) > -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIllIIllIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIIl(Object object, Object object2) {
        return object == object2;
    }

    public static void aH() {
        block18: {
            block20: {
                block19: {
                    if (S.lIIlIllllIlll(bn ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIllII[lIllIIllIl[0]];
                        b.a(bp);
                        if (S.lIIlIlllllIII(bp.size(), lIllIIllIl[1])) {
                            System.out.println(lIllIIllII[lIllIIllIl[1]]);
                            bn = lIllIIllIl[0];
                        }
                    }
                    if (!S.lIIlIlllllIIl(bn ? 1 : 0)) break block18;
                    if (S.lIIlIlllllIIl(S.aK() ? 1 : 0) && (!S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2]) || !S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[3]) || S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[3]))) {
                        BankLocation var11 = BankLocation.getNearest();
                        if (S.lIIlIlllllIll(var11) && S.lIIlIlllllIIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[4]];
                            a.a(var11);
                        }
                        if (S.lIIlIlllllIll(var11) && S.lIIlIllllIlll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[5]];
                            if (S.lIIlIlllllIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIllIl[6]);
                                0;
                            }
                            if (S.lIIlIllllIlll(Bank.isOpen() ? 1 : 0)) {
                                if (S.lIIlIllllllII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIllIIllIl[1]);
                                    0;
                                }
                                if (S.lIIlIllllllII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIllIIllIl[4]);
                                    0;
                                }
                                if (S.lIIlIlllllIIl(S.aL() ? 1 : 0)) {
                                    S.O();
                                    System.out.println(lIllIIllII[lIllIIllIl[7]]);
                                    bn = lIllIIllIl[1];
                                    return;
                                }
                                a.a(cE, lIllIIllIl[1]);
                                a.a(lIllIIllIl[8], lIllIIllIl[9]);
                                a.b(f.aU, lIllIIllIl[1]);
                                a.a(lIllIIllIl[10], lIllIIllIl[11]);
                                a.a(lIllIIllIl[12], lIllIIllIl[13]);
                            }
                        }
                    }
                    if (!S.lIIlIllllIlll(S.aK() ? 1 : 0)) break block18;
                    S.aJ();
                    if (S.lIIlIlllllIlI(Movement.getRunEnergy(), lIllIIllIl[14]) && S.lIIlIlllllIIl(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lIllIIllIl[1]];
                    stringArray[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[11]];
                    if (!S.lIIlIlllllIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block19;
                    String[] stringArray2 = new String[lIllIIllIl[1]];
                    stringArray2[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[15]];
                    if (!S.lIIlIlllllIIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block19;
                    String[] stringArray3 = new String[lIllIIllIl[1]];
                    stringArray3[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[16]];
                    if (!S.lIIlIlllllIIl(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block19;
                    int[] nArray = new int[lIllIIllIl[1]];
                    nArray[S.lIllIIllIl[0]] = lIllIIllIl[17];
                    if (!S.lIIlIlllllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                    int[] nArray2 = new int[lIllIIllIl[1]];
                    nArray2[S.lIllIIllIl[0]] = lIllIIllIl[18];
                    if (!S.lIIlIllllIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block20;
                }
                S.aM();
            }
            if (S.lIIlIllllllIl(S.lIIlIllllIllI(e.u(), 45.0))) {
                int[] nArray = new int[lIllIIllIl[1]];
                nArray[S.lIllIIllIl[0]] = lIllIIllIl[12];
                if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIllIl[1]];
                    nArray3[S.lIllIIllIl[0]] = lIllIIllIl[12];
                    Inventory.getFirst((int[])nArray3).interact(lIllIIllII[lIllIIllIl[19]]);
                    Time.sleepTicks((int)lIllIIllIl[1]);
                    0;
                }
            }
            if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20]) && !S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21]) || S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[20]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[21])) {
                p.aj();
            }
            if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21]) && S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIllIIllIl[21])) {
                l.ah();
            }
        }
    }

    private static void lIIlIllllIlII() {
        lIllIIllII = new String[lIllIIllIl[73]];
        S.lIllIIllII[S.lIllIIllIl[0]] = S."Buying items";
        S.lIllIIllII[S.lIllIIllIl[1]] = S."Finished buying items, switching back to melee training";
        S.lIllIIllII[S.lIllIIllIl[4]] = S."Navigating to bank";
        S.lIllIIllII[S.lIllIIllIl[5]] = S."Handling banking";
        S.lIllIIllII[S.lIllIIllIl[7]] = S."We are missing supplies, switching to BUYING";
        S.lIllIIllII[S.lIllIIllIl[11]] = S."Iron scimitar";
        S.lIllIIllII[S.lIllIIllIl[15]] = S."Steel scimitar";
        S.lIllIIllII[S.lIllIIllIl[16]] = S."Mithril scimitar";
        S.lIllIIllII[S.lIllIIllIl[19]] = S."Eat";
        S.lIllIIllII[S.lIllIIllIl[22]] = S."Walking to cow area";
        S.lIllIIllII[S.lIllIIllIl[23]] = S."Killing cows";
        S.lIllIIllII[S.lIllIIllIl[24]] = S."Cow";
        S.lIllIIllII[S.lIllIIllIl[25]] = S."cow";
        S.lIllIIllII[S.lIllIIllIl[26]] = S."Attack";
        S.lIllIIllII[S.lIllIIllIl[27]] = S."Attack";
        S.lIllIIllII[S.lIllIIllIl[14]] = S."Toggle auto retaliate";
        S.lIllIIllII[S.lIllIIllIl[28]] = S."Auto retaliate";
        S.lIllIIllII[S.lIllIIllIl[29]] = S."";
        S.lIllIIllII[S.lIllIIllIl[32]] = S."Iron scimitar";
        S.lIllIIllII[S.lIllIIllIl[33]] = S."Iron scimitar";
        S.lIllIIllII[S.lIllIIllIl[20]] = S."Wield";
        S.lIllIIllII[S.lIllIIllIl[34]] = S."Steel scimitar";
        S.lIllIIllII[S.lIllIIllIl[35]] = S."Steel scimitar";
        S.lIllIIllII[S.lIllIIllIl[36]] = S."Wield";
        S.lIllIIllII[S.lIllIIllIl[37]] = S."Mithril scimitar";
        S.lIllIIllII[S.lIllIIllIl[38]] = S."Mithril scimitar";
        S.lIllIIllII[S.lIllIIllIl[39]] = S."Wield";
        S.lIllIIllII[S.lIllIIllIl[40]] = S."Wield";
        S.lIllIIllII[S.lIllIIllIl[41]] = S."Wield";
        S.lIllIIllII[S.lIllIIllIl[43]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[2]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[46]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[48]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[50]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[52]] = S."Wear";
        S.lIllIIllII[S.lIllIIllIl[59]] = S."50/50/30 Melee";
        S.lIllIIllII[S.lIllIIllIl[60]] = S."Cow";
    }

    static {
        S.lIIlIllllIlIl();
        S.lIIlIllllIlII();
        bp = new ArrayList<d>();
        int[] nArray = new int[lIllIIllIl[19]];
        nArray[S.lIllIIllIl[0]] = lIllIIllIl[17];
        nArray[S.lIllIIllIl[1]] = lIllIIllIl[18];
        nArray[S.lIllIIllIl[4]] = lIllIIllIl[44];
        nArray[S.lIllIIllIl[5]] = lIllIIllIl[45];
        nArray[S.lIllIIllIl[7]] = lIllIIllIl[42];
        nArray[S.lIllIIllIl[11]] = lIllIIllIl[47];
        nArray[S.lIllIIllIl[15]] = lIllIIllIl[49];
        nArray[S.lIllIIllIl[16]] = lIllIIllIl[51];
        cE = nArray;
        cF = new WorldArea(lIllIIllIl[61], lIllIIllIl[62], lIllIIllIl[24], lIllIIllIl[24], lIllIIllIl[0]);
        cG = new WorldArea(lIllIIllIl[63], lIllIIllIl[64], lIllIIllIl[34], lIllIIllIl[28], lIllIIllIl[0]);
        cH = new WorldArea(lIllIIllIl[65], lIllIIllIl[66], lIllIIllIl[67], lIllIIllIl[2], lIllIIllIl[0]);
        cI = new WorldPoint(lIllIIllIl[68], lIllIIllIl[69], lIllIIllIl[0]);
        ce = new WorldPoint(lIllIIllIl[70], lIllIIllIl[62], lIllIIllIl[0]);
        cJ = new WorldPoint(lIllIIllIl[71], lIllIIllIl[72], lIllIIllIl[0]);
    }

    private static boolean lIIlIlllllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllllllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int ad() {
        try {
            S.aH();
            0;
        }
        catch (Exception var15) {
            var15.printStackTrace();
        }
        if (-3 > 0) {
            return (0xE4 ^ 0x94 ^ (0x6D ^ 0x45)) & (47 + 190 - 197 + 215 ^ 64 + 44 - -36 + 23 ^ -1);
        }
        return lIllIIllIl[0];
    }

    public static void ak() {
        if (S.lIIlIlllllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[22]];
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)lIllIIllIl[1]);
            0;
        }
        if (S.lIIlIllllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[23]];
            if (S.lIIlIlllllllI(Players.getLocal().getInteracting())) {
                NPC var17 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (S.lIIlIllllIlll(nPC.getName().contains(lIllIIllII[lIllIIllIl[60]]) ? 1 : 0) && S.lIIlIlllllllI(nPC.getInteracting()) && S.lIIlIlllllIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIIllIl[1];
                        0;
                        if (3 == 0) {
                            return false;
                        }
                    } else {
                        n2 = lIllIIllIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lIllIIllIl[4]];
                stringArray[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[24]];
                stringArray[S.lIllIIllIl[1]] = lIllIIllII[lIllIIllIl[25]];
                List var4 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (S.lIIllIIIIIIIl(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIllIIllIl[1];
                        0;
                        if (-3 > 0) {
                            return ((0x16 ^ 0xA ^ (0x58 ^ 0x5C)) & (0x3E ^ 0x1B ^ (1 ^ 0x3C) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIllIIllIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (S.lIIlIlllllIIl(var4.isEmpty() ? 1 : 0)) {
                    ((NPC)var4.get(lIllIIllIl[0])).interact(lIllIIllII[lIllIIllIl[26]]);
                    Time.sleepTicks((int)lIllIIllIl[4]);
                    0;
                }
                if (S.lIIlIlllllIll(var17) && S.lIIlIlllllIIl(Players.getLocal().isMoving() ? 1 : 0) && S.lIIlIllllIlll(var4.isEmpty() ? 1 : 0)) {
                    var17.interact(lIllIIllII[lIllIIllIl[27]]);
                    Time.sleepTicks((int)lIllIIllIl[4]);
                    0;
                }
            }
            if (S.lIIlIlllllIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lIllIIllIl[7]);
                0;
            }
        }
    }

    public static void aJ() {
        if (S.lIIlIllllllll(Static.getClient().getVar(lIllIIllIl[24]), lIllIIllIl[1])) {
            AccBuilderShamans.c = lIllIIllII[lIllIIllIl[14]];
            Static.getClient().invokeMenuAction(lIllIIllII[lIllIIllIl[28]], lIllIIllII[lIllIIllIl[29]], lIllIIllIl[1], MenuAction.CC_OP.getId(), lIllIIllIl[30], lIllIIllIl[31]);
        }
        if (S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[11])) {
            String[] stringArray = new String[lIllIIllIl[1]];
            stringArray[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[32]];
            if (S.lIIlIllllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIllIIllIl[1]];
                stringArray2[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[33]];
                Inventory.getFirst((String[])stringArray2).interact(lIllIIllII[lIllIIllIl[20]]);
            }
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[11]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20])) {
            String[] stringArray = new String[lIllIIllIl[1]];
            stringArray[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[34]];
            if (S.lIIlIllllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lIllIIllIl[1]];
                stringArray3[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[35]];
                Inventory.getFirst((String[])stringArray3).interact(lIllIIllII[lIllIIllIl[36]]);
            }
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[20]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[2])) {
            String[] stringArray = new String[lIllIIllIl[1]];
            stringArray[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[37]];
            if (S.lIIlIllllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lIllIIllIl[1]];
                stringArray4[S.lIllIIllIl[0]] = lIllIIllII[lIllIIllIl[38]];
                Inventory.getFirst((String[])stringArray4).interact(lIllIIllII[lIllIIllIl[39]]);
            }
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[2]) && S.lIIlIlllllIII(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21])) {
            int[] nArray = new int[lIllIIllIl[1]];
            nArray[S.lIllIIllIl[0]] = lIllIIllIl[17];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIllIl[1]];
                nArray2[S.lIllIIllIl[0]] = lIllIIllIl[17];
                Inventory.getFirst((int[])nArray2).interact(lIllIIllII[lIllIIllIl[40]]);
            }
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.ATTACK), lIllIIllIl[21])) {
            int[] nArray = new int[lIllIIllIl[1]];
            nArray[S.lIllIIllIl[0]] = lIllIIllIl[18];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lIllIIllIl[1]];
                nArray3[S.lIllIIllIl[0]] = lIllIIllIl[18];
                Inventory.getFirst((int[])nArray3).interact(lIllIIllII[lIllIIllIl[41]]);
            }
        }
        if (S.lIIlIlllllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIllIIllIl[2])) {
            int[] nArray = new int[lIllIIllIl[1]];
            nArray[S.lIllIIllIl[0]] = lIllIIllIl[42];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lIllIIllIl[1]];
                nArray4[S.lIllIIllIl[0]] = lIllIIllIl[42];
                Inventory.getFirst((int[])nArray4).interact(lIllIIllII[lIllIIllIl[43]]);
            }
            int[] nArray5 = new int[lIllIIllIl[1]];
            nArray5[S.lIllIIllIl[0]] = lIllIIllIl[44];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIllIIllIl[1]];
                nArray6[S.lIllIIllIl[0]] = lIllIIllIl[44];
                Inventory.getFirst((int[])nArray6).interact(lIllIIllII[lIllIIllIl[2]]);
            }
            int[] nArray7 = new int[lIllIIllIl[1]];
            nArray7[S.lIllIIllIl[0]] = lIllIIllIl[45];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lIllIIllIl[1]];
                nArray8[S.lIllIIllIl[0]] = lIllIIllIl[45];
                Inventory.getFirst((int[])nArray8).interact(lIllIIllII[lIllIIllIl[46]]);
            }
            int[] nArray9 = new int[lIllIIllIl[1]];
            nArray9[S.lIllIIllIl[0]] = lIllIIllIl[47];
            if (S.lIIlIllllIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIllIIllIl[1]];
                nArray10[S.lIllIIllIl[0]] = lIllIIllIl[47];
                Inventory.getFirst((int[])nArray10).interact(lIllIIllII[lIllIIllIl[48]]);
            }
        }
        int[] nArray = new int[lIllIIllIl[1]];
        nArray[S.lIllIIllIl[0]] = lIllIIllIl[49];
        if (S.lIIlIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lIllIIllIl[1]];
            nArray11[S.lIllIIllIl[0]] = lIllIIllIl[49];
            Inventory.getFirst((int[])nArray11).interact(lIllIIllII[lIllIIllIl[50]]);
        }
        int[] nArray12 = new int[lIllIIllIl[1]];
        nArray12[S.lIllIIllIl[0]] = lIllIIllIl[51];
        if (S.lIIlIllllIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIllIIllIl[1]];
            nArray13[S.lIllIIllIl[0]] = lIllIIllIl[51];
            Inventory.getFirst((int[])nArray13).interact(lIllIIllII[lIllIIllIl[52]]);
        }
    }

    @Override
    public String ae() {
        return lIllIIllII[lIllIIllIl[59]];
    }
}

