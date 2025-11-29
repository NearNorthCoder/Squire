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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.p;

public class ah
implements ac {
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ WorldPoint cO;
    private static /* synthetic */ String[] llIIllIIII;
    private static /* synthetic */ int[] llIIllIIlI;
    public static /* synthetic */ WorldPoint cP;

    private static void lIlIllIIIIllI() {
        llIIllIIlI = new int[72];
        ah.llIIllIIlI[0] = (0x91 ^ 0x95) & ~(0x8B ^ 0x8F);
        ah.llIIllIIlI[1] = 1;
        ah.llIIllIIlI[2] = 92 + 13 - -21 + 40 ^ 91 + 11 - -26 + 14;
        ah.llIIllIIlI[3] = 2;
        ah.llIIllIIlI[4] = 3;
        ah.llIIllIIlI[5] = 0xFFFFDFDB & 0x33AC;
        ah.llIIllIIlI[6] = 0x8B ^ 0x8F;
        ah.llIIllIIlI[7] = 0xFFFF83E7 & 0x7FFB;
        ah.llIIllIIlI[8] = -2 & (0xFFFFE3ED & 0x1FFB);
        ah.llIIllIIlI[9] = -(0xFFFFCAF9 & 0x75BF) & (0xFFFFFFFF & 0x5FFF);
        ah.llIIllIIlI[10] = 0xA6 ^ 0xA3;
        ah.llIIllIIlI[11] = 0xFFFFA37B & 0x5DFF;
        ah.llIIllIIlI[12] = 0x6A ^ 0x21 ^ (0x8E ^ 0xA1);
        ah.llIIllIIlI[13] = 0x96 ^ 0x99;
        ah.llIIllIIlI[14] = 0x73 ^ 0x42 ^ (0x1B ^ 0x2C);
        ah.llIIllIIlI[15] = 0x8E ^ 0x89;
        ah.llIIllIIlI[16] = 0xFFFF87B3 & 0x7D7F;
        ah.llIIllIIlI[17] = 0xFFFF8737 & 0x7DFD;
        ah.llIIllIIlI[18] = 0xCC ^ 0x8F ^ (0xD4 ^ 0x9F);
        ah.llIIllIIlI[19] = 0x40 ^ 0x54;
        ah.llIIllIIlI[20] = 0x6B ^ 0x62;
        ah.llIIllIIlI[21] = 0x3A ^ 0x74 ^ (1 ^ 0x45);
        ah.llIIllIIlI[22] = 78 + 118 - 36 + 25 ^ 80 + 106 - 39 + 31;
        ah.llIIllIIlI[23] = 0x16 ^ 0x2B ^ (0xB2 ^ 0x83);
        ah.llIIllIIlI[24] = 0xB7 ^ 0x9D ^ (0x3E ^ 0x19);
        ah.llIIllIIlI[25] = 0x8F ^ 0x81;
        ah.llIIllIIlI[26] = 0x4E ^ 0x5E;
        ah.llIIllIIlI[27] = -1;
        ah.llIIllIIlI[28] = -(0xFFFFFCB9 & 0x5B67) & (0xFFFFD9BE & 0x2517E7F);
        ah.llIIllIIlI[29] = 0x72 ^ 0x63;
        ah.llIIllIIlI[30] = 6 ^ 0x14;
        ah.llIIllIIlI[31] = 0xA2 ^ 0xB1;
        ah.llIIllIIlI[32] = 0x76 ^ 2 ^ (0x33 ^ 0x52);
        ah.llIIllIIlI[33] = 0x42 ^ 0x29 ^ (0x55 ^ 0x28);
        ah.llIIllIIlI[34] = 73 + 114 - 101 + 64 ^ 54 + 43 - 71 + 110;
        ah.llIIllIIlI[35] = 13 + 121 - 48 + 55 ^ 104 + 126 - 98 + 22;
        ah.llIIllIIlI[36] = 3 ^ 0x1B;
        ah.llIIllIIlI[37] = 0xD0 ^ 0xB5 ^ (0xE0 ^ 0x9C);
        ah.llIIllIIlI[38] = 0x2D ^ 0x37;
        ah.llIIllIIlI[39] = 0xA2 ^ 0xB9;
        ah.llIIllIIlI[40] = -(0xFFFFF25D & 0x5FA3) & (0xFFFFD7E9 & 0x7E9F);
        ah.llIIllIIlI[41] = 0x2F ^ 0x33;
        ah.llIIllIIlI[42] = -(0xFFFF87ED & 0x7B9B) & (0xFFFFB7EB & 0x4FFF);
        ah.llIIllIIlI[43] = 0x2E ^ 0x44 ^ (0xCF ^ 0xB8);
        ah.llIIllIIlI[44] = -(0xFFFFEDDB & 0x5B2F) & (0xFFFFFDBB & 0x4F7F);
        ah.llIIllIIlI[45] = 0xFFFFD5AF & 0x2EFF;
        ah.llIIllIIlI[46] = 0x4B ^ 0x25 ^ (0x1B ^ 0x6A);
        ah.llIIllIIlI[47] = -(0xFFFFF967 & 0x6F9C) & (0xFFFFEFAF & 0x7FFB);
        ah.llIIllIIlI[48] = 0x90 ^ 0xB0;
        ah.llIIllIIlI[49] = 0xFFFFEFFE & 0x3B77;
        ah.llIIllIIlI[50] = 0x89 ^ 0xA8;
        ah.llIIllIIlI[51] = 0xFFFF87B5 & 0x7BCE;
        ah.llIIllIIlI[52] = -(0x99 ^ 0xAD) & (0xFFFF9FFF & 0x7F7B);
        ah.llIIllIIlI[53] = 0xFFFFA8BE & 0xDFF9;
        ah.llIIllIIlI[54] = -(0xFFFFD337 & 0x3CDE) & (0xFFFFF1FD & 0x7FBF);
        ah.llIIllIIlI[55] = -(0xFFFFEFB3 & 0x344F) & (0xFFFFBFFF & 0x65F6);
        ah.llIIllIIlI[56] = 0xFFFFBB9E & 0x7EF9;
        ah.llIIllIIlI[57] = 99 + 134 - 208 + 126 ^ 151 + 117 - 227 + 140;
        ah.llIIllIIlI[58] = 0xF3 ^ 0x89 ^ (0x63 ^ 0x3A);
        ah.llIIllIIlI[59] = -(0xFFFFF577 & 0x4BE9) & (0xFFFFEFFD & 0x5DFB);
        ah.llIIllIIlI[60] = -(0xFFFFEF2F & 0x33F5) & (0xFFFFBFFE & 0x6FFF);
        ah.llIIllIIlI[61] = -(0xFFFFC615 & 0x7BFB) & (0xFFFFEEFC & 0x5FBF);
        ah.llIIllIIlI[62] = -(0xFFFFE23F & 0x7FED) & (0xFFFFFEFE & 0x6FFD);
        ah.llIIllIIlI[63] = -(0xFFFFEFA9 & 0x73DF) & (0xFFFFFFFF & 0x6FF9);
        ah.llIIllIIlI[64] = 0xFFFFBFDF & 0x4C7F;
        ah.llIIllIIlI[65] = 157 + 60 - 172 + 134 ^ 70 + 113 - 155 + 103;
        ah.llIIllIIlI[66] = 0xFFFF8CFD & 0x7F8F;
        ah.llIIllIIlI[67] = -(0xFFFFEA2D & 0x75D3) & (0xFFFFFF7F & 0x6CED);
        ah.llIIllIIlI[68] = 0xFFFF8EB6 & 0x7DFF;
        ah.llIIllIIlI[69] = 0xFFFFADDF & 0x5EBF;
        ah.llIIllIIlI[70] = 0xFFFFFDFF & 0xEE0;
        ah.llIIllIIlI[71] = 0x54 ^ 0x58 ^ (0xAD ^ 0x85);
    }

    private static boolean lIlIllIIIlIll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIllIIlI[0];
    }

    private static String lIlIllIIIIIIl(String llllllllllllllllllIIllIlllllIlII, String llllllllllllllllllIIllIlllllIIll) {
        try {
            SecretKeySpec llllllllllllllllllIIllIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIllIlllllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIllIlllllIllI.init(llIIllIIlI[3], llllllllllllllllllIIllIlllllIlll);
            return new String(llllllllllllllllllIIllIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIllIlllllIlIl) {
            llllllllllllllllllIIllIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIlIII(int n2) {
        return n2 != 0;
    }

    public static void Q() {
        d llllllllllllllllllIIlllIIIlIIlll;
        int[] nArray = new int[llIIllIIlI[1]];
        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[9];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIllIIlI[9], llIIllIIlI[2], llIIllIIlI[51]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIllIIlI[1]];
        nArray2[ah.llIIllIIlI[0]] = llIIllIIlI[52];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[52], llIIllIIlI[10], llIIllIIlI[51]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray3 = new int[llIIllIIlI[1]];
        nArray3[ah.llIIllIIlI[0]] = llIIllIIlI[49];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[49], llIIllIIlI[1], llIIllIIlI[53]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray4 = new int[llIIllIIlI[1]];
        nArray4[ah.llIIllIIlI[0]] = llIIllIIlI[47];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[47], llIIllIIlI[1], llIIllIIlI[54]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray5 = new int[llIIllIIlI[1]];
        nArray5[ah.llIIllIIlI[0]] = llIIllIIlI[11];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[11], llIIllIIlI[12], llIIllIIlI[55]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray6 = new int[llIIllIIlI[1]];
        nArray6[ah.llIIllIIlI[0]] = llIIllIIlI[40];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[40], llIIllIIlI[1], llIIllIIlI[56]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray7 = new int[llIIllIIlI[1]];
        nArray7[ah.llIIllIIlI[0]] = llIIllIIlI[44];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[44], llIIllIIlI[1], llIIllIIlI[56]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray8 = new int[llIIllIIlI[1]];
        nArray8[ah.llIIllIIlI[0]] = llIIllIIlI[45];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[45], llIIllIIlI[1], llIIllIIlI[56]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        int[] nArray9 = new int[llIIllIIlI[1]];
        nArray9[ah.llIIllIIlI[0]] = llIIllIIlI[42];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[42], llIIllIIlI[1], llIIllIIlI[56]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[2])) {
            int[] nArray10 = new int[llIIllIIlI[1]];
            nArray10[ah.llIIllIIlI[0]] = llIIllIIlI[17];
            if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[17], llIIllIIlI[1], llIIllIIlI[54]);
                bv.add(llllllllllllllllllIIlllIIIlIIlll);
                0;
            }
        }
        int[] nArray11 = new int[llIIllIIlI[1]];
        nArray11[ah.llIIllIIlI[0]] = llIIllIIlI[16];
        if (ah.lIlIllIIIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            llllllllllllllllllIIlllIIIlIIlll = new d(llIIllIIlI[16], llIIllIIlI[1], llIIllIIlI[56]);
            bv.add(llllllllllllllllllIIlllIIIlIIlll);
            0;
        }
    }

    private static String lIlIllIIIIIII(String llllllllllllllllllIIlllIIIIlIllI, String llllllllllllllllllIIlllIIIIlIIII) {
        llllllllllllllllllIIlllIIIIlIllI = new String(Base64.getDecoder().decode(llllllllllllllllllIIlllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlllIIIIlIlII = new StringBuilder();
        char[] llllllllllllllllllIIlllIIIIlIIll = llllllllllllllllllIIlllIIIIlIIII.toCharArray();
        int llllllllllllllllllIIlllIIIIlIIlI = llIIllIIlI[0];
        char[] llllllllllllllllllIIlllIIIIIllII = llllllllllllllllllIIlllIIIIlIllI.toCharArray();
        int llllllllllllllllllIIlllIIIIIlIll = llllllllllllllllllIIlllIIIIIllII.length;
        int llllllllllllllllllIIlllIIIIIlIlI = llIIllIIlI[0];
        while (ah.lIlIllIIIlIIl(llllllllllllllllllIIlllIIIIIlIlI, llllllllllllllllllIIlllIIIIIlIll)) {
            char llllllllllllllllllIIlllIIIIlIlll = llllllllllllllllllIIlllIIIIIllII[llllllllllllllllllIIlllIIIIIlIlI];
            llllllllllllllllllIIlllIIIIlIlII.append((char)(llllllllllllllllllIIlllIIIIlIlll ^ llllllllllllllllllIIlllIIIIlIIll[llllllllllllllllllIIlllIIIIlIIlI % llllllllllllllllllIIlllIIIIlIIll.length]));
            0;
            ++llllllllllllllllllIIlllIIIIlIIlI;
            ++llllllllllllllllllIIlllIIIIIlIlI;
            0;
            if ((0x7D ^ 0x79) >= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlllIIIIlIlII);
    }

    private static boolean lIlIllIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static int lIlIllIIIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        ah.lIlIllIIIIllI();
        ah.lIlIllIIIIIlI();
        bv = new ArrayList<d>();
        int[] nArray = new int[llIIllIIlI[18]];
        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[16];
        nArray[ah.llIIllIIlI[1]] = llIIllIIlI[17];
        nArray[ah.llIIllIIlI[3]] = llIIllIIlI[42];
        nArray[ah.llIIllIIlI[4]] = llIIllIIlI[44];
        nArray[ah.llIIllIIlI[6]] = llIIllIIlI[40];
        nArray[ah.llIIllIIlI[10]] = llIIllIIlI[45];
        nArray[ah.llIIllIIlI[14]] = llIIllIIlI[47];
        nArray[ah.llIIllIIlI[15]] = llIIllIIlI[49];
        cK = nArray;
        cL = new WorldArea(llIIllIIlI[59], llIIllIIlI[60], llIIllIIlI[22], llIIllIIlI[22], llIIllIIlI[0]);
        cM = new WorldArea(llIIllIIlI[61], llIIllIIlI[62], llIIllIIlI[32], llIIllIIlI[26], llIIllIIlI[0]);
        cN = new WorldArea(llIIllIIlI[63], llIIllIIlI[64], llIIllIIlI[65], llIIllIIlI[34], llIIllIIlI[0]);
        cO = new WorldPoint(llIIllIIlI[66], llIIllIIlI[67], llIIllIIlI[0]);
        ck = new WorldPoint(llIIllIIlI[68], llIIllIIlI[60], llIIllIIlI[0]);
        cP = new WorldPoint(llIIllIIlI[69], llIIllIIlI[70], llIIllIIlI[0]);
    }

    private static boolean lIlIllIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIllIIlI[2])) {
            bl = llIIllIIlI[1];
            0;
            if (-1 >= 2) {
                return ((0x5F ^ 0x1E) & ~(0xF0 ^ 0xB1)) != 0;
            }
        } else {
            bl = llIIllIIlI[0];
        }
        return bl;
    }

    private static String lIlIlIlllllll(String llllllllllllllllllIIlllIIIIIIIIl, String llllllllllllllllllIIlllIIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllllllIIlllIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIllIIlI[18]), "DES");
            Cipher llllllllllllllllllIIlllIIIIIIIll = Cipher.getInstance("DES");
            llllllllllllllllllIIlllIIIIIIIll.init(llIIllIIlI[3], llllllllllllllllllIIlllIIIIIIlII);
            return new String(llllllllllllllllllIIlllIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlllIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlllIIIIIIIlI) {
            llllllllllllllllllIIlllIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIllll(Object object) {
        return object == null;
    }

    @Override
    public int af() {
        try {
            ah.aJ();
            0;
        }
        catch (Exception llllllllllllllllllIIlllIIIlIIlIl) {
            llllllllllllllllllIIlllIIIlIIlIl.printStackTrace();
        }
        if ((0xAC ^ 0xA8) == 0) {
            return (0x51 ^ 0x4E) & ~(0x39 ^ 0x26);
        }
        return llIIllIIlI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
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
                                                                            if (!ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[2])) break block8;
                                                                            int[] nArray = new int[llIIllIIlI[1]];
                                                                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                                                                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[llIIllIIlI[1]];
                                                                            nArray2[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                                                                            if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[llIIllIIlI[1]];
                                                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                                                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[llIIllIIlI[1]];
                                                                        nArray3[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                                                        if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[llIIllIIlI[1]];
                                                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[llIIllIIlI[1]];
                                                                    nArray4[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                                                    if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[llIIllIIlI[1]];
                                                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                                                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[llIIllIIlI[1]];
                                                                nArray5[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                                                if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[llIIllIIlI[1]];
                                                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                                                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[llIIllIIlI[1]];
                                                            nArray6[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                                                            if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[llIIllIIlI[1]];
                                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                                                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[llIIllIIlI[1]];
                                                        nArray7[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                                                        if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[llIIllIIlI[1]];
                                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[llIIllIIlI[1]];
                                                    nArray8[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                                                    if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[llIIllIIlI[1]];
                                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                                                if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIllIIlI[1];
                                                    0;
                                                    if (2 >= 0) return n3 != 0;
                                                    return ((160 + 149 - 246 + 184 ^ 72 + 18 - -20 + 56) & (0x30 ^ 0x75 ^ (0xB8 ^ 0xAC) ^ -1)) != 0;
                                                }
                                            }
                                            n3 = llIIllIIlI[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIllIIlI[1]];
                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[llIIllIIlI[1]];
                                        nArray9[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                                        if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[llIIllIIlI[1]];
                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[llIIllIIlI[1]];
                                    nArray10[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                    if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[llIIllIIlI[1]];
                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[llIIllIIlI[1]];
                                nArray11[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[llIIllIIlI[1]];
                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[llIIllIIlI[1]];
                            nArray12[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                            if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[llIIllIIlI[1]];
                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[llIIllIIlI[1]];
                        nArray13[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                        if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[llIIllIIlI[1]];
                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[llIIllIIlI[1]];
                    nArray14[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                    if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[llIIllIIlI[1]];
                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[llIIllIIlI[1]];
                nArray15[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                if (!ah.lIlIllIIIlIII(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[llIIllIIlI[1]];
            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[11];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIllIIlI[1];
                0;
                if ((0x67 ^ 0x63) > 3) return n2 != 0;
                return ((0xB8 ^ 0xA1) & ~(0x9A ^ 0x83)) != 0;
            }
        }
        n2 = llIIllIIlI[0];
        return n2 != 0;
    }

    public static void am() {
        if (ah.lIlIllIIIlIlI(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[20]];
            Movement.walkTo((WorldPoint)ck);
            0;
            Time.sleepTicks((int)llIIllIIlI[1]);
            0;
        }
        if (ah.lIlIllIIIlIII(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[21]];
            if (ah.lIlIllIIIllll(Players.getLocal().getInteracting())) {
                NPC llllllllllllllllllIIlllIIIlIlIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (ah.lIlIllIIIlIII(nPC.getName().contains(llIIllIIII[llIIllIIlI[58]]) ? 1 : 0) && ah.lIlIllIIIllll(nPC.getInteracting()) && ah.lIlIllIIIlIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIllIIlI[1];
                        0;
                        if (2 == ((0xAA ^ 0x8B ^ (0x71 ^ 5)) & (0xFC ^ 0x86 ^ (0xB7 ^ 0x98) ^ -1))) {
                            return ((95 + 58 - 127 + 121 ^ 144 + 54 - 139 + 129) & (57 + 39 - 46 + 97 ^ 65 + 85 - 149 + 187 ^ -1) & ((0x42 ^ 0x5B ^ (0x51 ^ 0x57)) & (75 + 39 - -4 + 41 ^ 116 + 82 - 169 + 99 ^ -1) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIllIIlI[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIllIIlI[3]];
                stringArray[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[22]];
                stringArray[ah.llIIllIIlI[1]] = llIIllIIII[llIIllIIlI[23]];
                List llllllllllllllllllIIlllIIIlIlIIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (ah.lIlIllIIlIIIl(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIllIIlI[1];
                        0;
                        if ((116 + 108 - 160 + 76 ^ 16 + 88 - 53 + 85) == 0) {
                            return ((8 ^ 0x4D ^ (0xF1 ^ 0x8A)) & (0xAF ^ 0x9F ^ (0x76 ^ 0x78) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIllIIlI[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (ah.lIlIllIIIlIlI(llllllllllllllllllIIlllIIIlIlIIl.isEmpty() ? 1 : 0)) {
                    ((NPC)llllllllllllllllllIIlllIIIlIlIIl.get(llIIllIIlI[0])).interact(llIIllIIII[llIIllIIlI[24]]);
                    Time.sleepTicks((int)llIIllIIlI[3]);
                    0;
                }
                if (ah.lIlIllIIIlIll(llllllllllllllllllIIlllIIIlIlIlI) && ah.lIlIllIIIlIlI(Players.getLocal().isMoving() ? 1 : 0) && ah.lIlIllIIIlIII(llllllllllllllllllIIlllIIIlIlIIl.isEmpty() ? 1 : 0)) {
                    llllllllllllllllllIIlllIIIlIlIlI.interact(llIIllIIII[llIIllIIlI[25]]);
                    Time.sleepTicks((int)llIIllIIlI[3]);
                    0;
                }
            }
            if (ah.lIlIllIIIlIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIllIIlI[6]);
                0;
            }
        }
    }

    private static boolean lIlIllIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void aO() {
        if (ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIllIIlI[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIllIIIllII(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return llIIllIIII[llIIllIIlI[57]];
    }

    private static boolean lIlIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIIlllI(int n2) {
        return n2 < 0;
    }

    public static void aL() {
        if (ah.lIlIllIIlIIII(Static.getClient().getVar(llIIllIIlI[22]), llIIllIIlI[1])) {
            Static.getClient().invokeMenuAction(llIIllIIII[llIIllIIlI[13]], llIIllIIII[llIIllIIlI[26]], llIIllIIlI[1], MenuAction.CC_OP.getId(), llIIllIIlI[27], llIIllIIlI[28]);
        }
        if (ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[10])) {
            String[] stringArray = new String[llIIllIIlI[1]];
            stringArray[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[29]];
            if (ah.lIlIllIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIllIIlI[1]];
                stringArray2[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[30]];
                Inventory.getFirst((String[])stringArray2).interact(llIIllIIII[llIIllIIlI[31]]);
            }
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[10]) && ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[19])) {
            String[] stringArray = new String[llIIllIIlI[1]];
            stringArray[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[19]];
            if (ah.lIlIllIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIllIIlI[1]];
                stringArray3[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[32]];
                Inventory.getFirst((String[])stringArray3).interact(llIIllIIII[llIIllIIlI[33]]);
            }
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[19]) && ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[34])) {
            String[] stringArray = new String[llIIllIIlI[1]];
            stringArray[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[35]];
            if (ah.lIlIllIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIllIIlI[1]];
                stringArray4[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[36]];
                Inventory.getFirst((String[])stringArray4).interact(llIIllIIII[llIIllIIlI[37]]);
            }
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[34]) && ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[2])) {
            int[] nArray = new int[llIIllIIlI[1]];
            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[16];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIllIIlI[1]];
                nArray2[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                Inventory.getFirst((int[])nArray2).interact(llIIllIIII[llIIllIIlI[38]]);
            }
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[2])) {
            int[] nArray = new int[llIIllIIlI[1]];
            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[17];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIllIIlI[1]];
                nArray3[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                Inventory.getFirst((int[])nArray3).interact(llIIllIIII[llIIllIIlI[39]]);
            }
        }
        if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIllIIlI[34])) {
            int[] nArray = new int[llIIllIIlI[1]];
            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[40];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIllIIlI[1]];
                nArray4[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                Inventory.getFirst((int[])nArray4).interact(llIIllIIII[llIIllIIlI[41]]);
            }
            int[] nArray5 = new int[llIIllIIlI[1]];
            nArray5[ah.llIIllIIlI[0]] = llIIllIIlI[42];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIllIIlI[1]];
                nArray6[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                Inventory.getFirst((int[])nArray6).interact(llIIllIIII[llIIllIIlI[43]]);
            }
            int[] nArray7 = new int[llIIllIIlI[1]];
            nArray7[ah.llIIllIIlI[0]] = llIIllIIlI[44];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIllIIlI[1]];
                nArray8[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                Inventory.getFirst((int[])nArray8).interact(llIIllIIII[llIIllIIlI[34]]);
            }
            int[] nArray9 = new int[llIIllIIlI[1]];
            nArray9[ah.llIIllIIlI[0]] = llIIllIIlI[45];
            if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIllIIlI[1]];
                nArray10[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                Inventory.getFirst((int[])nArray10).interact(llIIllIIII[llIIllIIlI[46]]);
            }
        }
        int[] nArray = new int[llIIllIIlI[1]];
        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[47];
        if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIllIIlI[1]];
            nArray11[ah.llIIllIIlI[0]] = llIIllIIlI[47];
            Inventory.getFirst((int[])nArray11).interact(llIIllIIII[llIIllIIlI[48]]);
        }
        int[] nArray12 = new int[llIIllIIlI[1]];
        nArray12[ah.llIIllIIlI[0]] = llIIllIIlI[49];
        if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIllIIlI[1]];
            nArray13[ah.llIIllIIlI[0]] = llIIllIIlI[49];
            Inventory.getFirst((int[])nArray13).interact(llIIllIIII[llIIllIIlI[50]]);
        }
    }

    private static boolean lIlIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIllIIIIIlI() {
        llIIllIIII = new String[llIIllIIlI[71]];
        ah.llIIllIIII[ah.llIIllIIlI[0]] = ah."Buying items";
        ah.llIIllIIII[ah.llIIllIIlI[1]] = ah."Finished buying items, switching back to melee training";
        ah.llIIllIIII[ah.llIIllIIlI[3]] = ah."Navigating to bank";
        ah.llIIllIIII[ah.llIIllIIlI[4]] = ah."Handling banking";
        ah.llIIllIIII[ah.llIIllIIlI[6]] = ah."We are missing supplies, switching to BUYING";
        ah.llIIllIIII[ah.llIIllIIlI[10]] = ah."Iron scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[14]] = ah."Steel scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[15]] = ah."Mithril scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[18]] = ah."Eat";
        ah.llIIllIIII[ah.llIIllIIlI[20]] = ah."Walking to cow area";
        ah.llIIllIIII[ah.llIIllIIlI[21]] = ah."Killing cows";
        ah.llIIllIIII[ah.llIIllIIlI[22]] = ah."Cow";
        ah.llIIllIIII[ah.llIIllIIlI[23]] = ah."cow";
        ah.llIIllIIII[ah.llIIllIIlI[24]] = ah."Attack";
        ah.llIIllIIII[ah.llIIllIIlI[25]] = ah."Attack";
        ah.llIIllIIII[ah.llIIllIIlI[13]] = ah."Auto retaliate";
        ah.llIIllIIII[ah.llIIllIIlI[26]] = ah."";
        ah.llIIllIIII[ah.llIIllIIlI[29]] = ah."Iron scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[30]] = ah."Iron scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[31]] = ah."Wield";
        ah.llIIllIIII[ah.llIIllIIlI[19]] = ah."Steel scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[32]] = ah."Steel scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[33]] = ah."Wield";
        ah.llIIllIIII[ah.llIIllIIlI[35]] = ah."Mithril scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[36]] = ah."Mithril scimitar";
        ah.llIIllIIII[ah.llIIllIIlI[37]] = ah."Wield";
        ah.llIIllIIII[ah.llIIllIIlI[38]] = ah."Wield";
        ah.llIIllIIII[ah.llIIllIIlI[39]] = ah."Wield";
        ah.llIIllIIII[ah.llIIllIIlI[41]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[43]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[34]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[46]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[48]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[50]] = ah."Wear";
        ah.llIIllIIII[ah.llIIllIIlI[57]] = ah."40 Def";
        ah.llIIllIIII[ah.llIIllIIlI[58]] = ah."Cow";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
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
                                                                                    if (!ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[2])) break block4;
                                                                                    int[] nArray = new int[llIIllIIlI[1]];
                                                                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                                                                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[llIIllIIlI[1]];
                                                                                    nArray2[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                                                                                    if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[llIIllIIlI[1]];
                                                                                    nArray3[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                                                                                    if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[llIIllIIlI[1]];
                                                                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                                                                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[llIIllIIlI[1]];
                                                                                nArray4[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                                                                if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[llIIllIIlI[1]];
                                                                                nArray5[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                                                                if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[llIIllIIlI[1]];
                                                                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                                                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[llIIllIIlI[1]];
                                                                            nArray6[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                                                            if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[llIIllIIlI[1]];
                                                                            nArray7[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                                                            if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[llIIllIIlI[1]];
                                                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                                                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[llIIllIIlI[1]];
                                                                        nArray8[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                                                        if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[llIIllIIlI[1]];
                                                                        nArray9[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                                                        if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[llIIllIIlI[1]];
                                                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                                                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[llIIllIIlI[1]];
                                                                    nArray10[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                                                                    if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[llIIllIIlI[1]];
                                                                    nArray11[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                                                                    if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[llIIllIIlI[1]];
                                                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                                                                if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[llIIllIIlI[1]];
                                                                nArray12[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                                                                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[llIIllIIlI[1]];
                                                                nArray13[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                                                                if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[llIIllIIlI[1]];
                                                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                                                            if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[llIIllIIlI[1]];
                                                            nArray14[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                                                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[llIIllIIlI[1]];
                                                            nArray15[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                                                            if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[llIIllIIlI[1]];
                                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                                                        if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[llIIllIIlI[1]];
                                                        nArray16[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                                                        if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = llIIllIIlI[1];
                                                    0;
                                                    if (((0x2C ^ 0x74) & ~(0x51 ^ 9)) <= 1) return n3 != 0;
                                                    return ((0x9E ^ 0x9A) & ~(0xB9 ^ 0xBD)) != 0;
                                                }
                                                n3 = llIIllIIlI[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIllIIlI[1]];
                                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[llIIllIIlI[1]];
                                            nArray17[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                                            if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[llIIllIIlI[1]];
                                            nArray18[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                                            if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[llIIllIIlI[1]];
                                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[llIIllIIlI[1]];
                                        nArray19[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                        if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[llIIllIIlI[1]];
                                        nArray20[ah.llIIllIIlI[0]] = llIIllIIlI[42];
                                        if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[llIIllIIlI[1]];
                                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[llIIllIIlI[1]];
                                    nArray21[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                    if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[llIIllIIlI[1]];
                                    nArray22[ah.llIIllIIlI[0]] = llIIllIIlI[44];
                                    if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[llIIllIIlI[1]];
                                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[llIIllIIlI[1]];
                                nArray23[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[llIIllIIlI[1]];
                                nArray24[ah.llIIllIIlI[0]] = llIIllIIlI[40];
                                if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[llIIllIIlI[1]];
                            nArray[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                            if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[llIIllIIlI[1]];
                            nArray25[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                            if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[llIIllIIlI[1]];
                            nArray26[ah.llIIllIIlI[0]] = llIIllIIlI[45];
                            if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[llIIllIIlI[1]];
                        nArray[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                        if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[llIIllIIlI[1]];
                        nArray27[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                        if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[llIIllIIlI[1]];
                        nArray28[ah.llIIllIIlI[0]] = llIIllIIlI[47];
                        if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[llIIllIIlI[1]];
                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                    if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[llIIllIIlI[1]];
                    nArray29[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[llIIllIIlI[1]];
                    nArray30[ah.llIIllIIlI[0]] = llIIllIIlI[49];
                    if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[llIIllIIlI[1]];
                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                if (!ah.lIlIllIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[llIIllIIlI[1]];
                nArray31[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                if (!ah.lIlIllIIIlIII(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = llIIllIIlI[1];
            0;
            if (((155 + 218 - 297 + 153 ^ 23 + 155 - 83 + 104) & (3 ^ (0x86 ^ 0xA7) ^ -1)) < (131 + 103 - 225 + 126 ^ 82 + 24 - 40 + 65)) return n2 != 0;
            return ((0x60 ^ 0x2D ^ (0xD5 ^ 0xAC)) & (0x44 ^ 0x2E ^ (0xE7 ^ 0xB9) ^ -1)) != 0;
        }
        n2 = llIIllIIlI[0];
        return n2 != 0;
    }

    public static void aJ() {
        block17: {
            block19: {
                block18: {
                    if (ah.lIlIllIIIlIII(bt ? 1 : 0)) {
                        AccBuilderSotf.c = llIIllIIII[llIIllIIlI[0]];
                        b.a(bv);
                        if (ah.lIlIllIIIlIIl(bv.size(), llIIllIIlI[1])) {
                            System.out.println(llIIllIIII[llIIllIIlI[1]]);
                            bt = llIIllIIlI[0];
                        }
                    }
                    if (!ah.lIlIllIIIlIlI(bt ? 1 : 0)) break block17;
                    if (ah.lIlIllIIIlIlI(ah.aM() ? 1 : 0) && ah.lIlIllIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIllIIlI[2])) {
                        BankLocation llllllllllllllllllIIlllIIIlIllIl = BankLocation.getNearest();
                        if (ah.lIlIllIIIlIll(llllllllllllllllllIIlllIIIlIllIl) && ah.lIlIllIIIlIlI(llllllllllllllllllIIlllIIIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[3]];
                            a.a(llllllllllllllllllIIlllIIIlIllIl);
                        }
                        if (ah.lIlIllIIIlIll(llllllllllllllllllIIlllIIIlIllIl) && ah.lIlIllIIIlIII(llllllllllllllllllIIlllIIIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIllIIII[llIIllIIlI[4]];
                            if (ah.lIlIllIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIIlI[5]);
                                0;
                            }
                            if (ah.lIlIllIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                if (ah.lIlIllIIIllII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIllIIlI[1]);
                                    0;
                                }
                                if (ah.lIlIllIIIllII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIllIIlI[3]);
                                    0;
                                }
                                if (ah.lIlIllIIIlIlI(ah.aN() ? 1 : 0)) {
                                    ah.Q();
                                    System.out.println(llIIllIIII[llIIllIIlI[6]]);
                                    bt = llIIllIIlI[1];
                                    return;
                                }
                                a.a(cK, llIIllIIlI[1]);
                                a.a(llIIllIIlI[7], llIIllIIlI[8]);
                                a.b(f.ba, llIIllIIlI[1]);
                                a.a(llIIllIIlI[9], llIIllIIlI[10]);
                                a.a(llIIllIIlI[11], llIIllIIlI[12]);
                            }
                        }
                    }
                    if (!ah.lIlIllIIIlIII(ah.aM() ? 1 : 0)) break block17;
                    ah.aL();
                    if (ah.lIlIllIIIllIl(Movement.getRunEnergy(), llIIllIIlI[13]) && ah.lIlIllIIIlIlI(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[llIIllIIlI[1]];
                    stringArray[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[10]];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[llIIllIIlI[1]];
                    stringArray2[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[14]];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[llIIllIIlI[1]];
                    stringArray3[ah.llIIllIIlI[0]] = llIIllIIII[llIIllIIlI[15]];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[llIIllIIlI[1]];
                    nArray[ah.llIIllIIlI[0]] = llIIllIIlI[16];
                    if (!ah.lIlIllIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[llIIllIIlI[1]];
                    nArray2[ah.llIIllIIlI[0]] = llIIllIIlI[17];
                    if (!ah.lIlIllIIIlIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                ah.aO();
            }
            if (ah.lIlIllIIIlllI(ah.lIlIllIIIIlll(e.w(), 45.0))) {
                int[] nArray = new int[llIIllIIlI[1]];
                nArray[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                if (ah.lIlIllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIllIIlI[1]];
                    nArray3[ah.llIIllIIlI[0]] = llIIllIIlI[11];
                    Inventory.getFirst((int[])nArray3).interact(llIIllIIII[llIIllIIlI[18]]);
                    Time.sleepTicks((int)llIIllIIlI[1]);
                    0;
                }
            }
            if (ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.ATTACK), llIIllIIlI[19]) && ah.lIlIllIIIllIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIllIIlI[19])) {
                p.al();
            }
        }
    }
}

