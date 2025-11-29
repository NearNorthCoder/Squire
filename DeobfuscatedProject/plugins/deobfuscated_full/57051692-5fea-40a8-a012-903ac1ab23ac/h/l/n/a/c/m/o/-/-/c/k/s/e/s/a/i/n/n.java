/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.l;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;

public class n
implements K {
    private static /* synthetic */ int[] lIlIlllIll;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ String[] lIlIlllIlI;
    public static /* synthetic */ boolean bn;

    private static void lIIlIlIIIIlll() {
        lIlIlllIll = new int[97];
        n.lIlIlllIll[0] = (0x4F ^ 0x60) & ~(0xB5 ^ 0x9A);
        n.lIlIlllIll[1] = 1;
        n.lIlIlllIll[2] = 2;
        n.lIlIlllIll[3] = 3;
        n.lIlIlllIll[4] = -(0xFFFFFD9B & 0x4E67) & (0xFFFFDFCA & 0x7FBF);
        n.lIlIlllIll[5] = 0x28 ^ 0x2D;
        n.lIlIlllIll[6] = 99 + 24 - 95 + 103 ^ 92 + 16 - 10 + 37;
        n.lIlIlllIll[7] = 0x28 ^ 0x26 ^ (0x91 ^ 0xAD);
        n.lIlIlllIll[8] = 0xFFFFBDDF & 0x6B23;
        n.lIlIlllIll[9] = -(0xFFFFDEF5 & 0x350B) & (0xFFFF9FBD & 0x7DFF);
        n.lIlIlllIll[10] = 0xFFFF9BF7 & 0x6DCB;
        n.lIlIlllIll[11] = 0xFFFF83BE & 0x7F6B;
        n.lIlIlllIll[12] = 0xFFFFC35F & 0x3FE9;
        n.lIlIlllIll[13] = 0xFFFFAF5F & 0x53EB;
        n.lIlIlllIll[14] = 0xFFFFD7DB & 0x2B75;
        n.lIlIlllIll[15] = 0xFFFFBBF6 & 0x477B;
        n.lIlIlllIll[16] = -(0xFFFFEFD1 & 0x54BF) & (0xFFFFD7FF & 0x6FB9);
        n.lIlIlllIll[17] = 0xFFFF8EFF & 0x7547;
        n.lIlIlllIll[18] = -(0xFFFFFBFF & 0x3C4D) & (0xFFFFBFFF & 0x7CDD);
        n.lIlIlllIll[19] = -(0xFFFFFFC7 & 0x5ABB) & (0xFFFFDFEB & 0x7EFF);
        n.lIlIlllIll[20] = -(60 + 121 - 131 + 79) & (0xFFFFAFFF & 0x7BF6);
        n.lIlIlllIll[21] = 0xFFFFEEAF & 0x17F8;
        n.lIlIlllIll[22] = 0xFFFFF5F3 & 0x3B5D;
        n.lIlIlllIll[23] = 0xFFFFFF59 & 0x1FEF;
        n.lIlIlllIll[24] = 0xB3 ^ 0xB9;
        n.lIlIlllIll[25] = -(0xFFFFE1BD & 0x7ED7) & (0xFFFFFFFF & 0x7FDE);
        n.lIlIlllIll[26] = -(0xFFFFF7D1 & 0x5EAF) & (0xFFFFD7FF & 0x7FFB);
        n.lIlIlllIll[27] = 0x76 ^ 0x68;
        n.lIlIlllIll[28] = 0xFFFFD3BF & 0x2F67;
        n.lIlIlllIll[29] = -(0xFFFFDFCF & 0x7878) & (0xFFFFFFF7 & 0x7AFF);
        n.lIlIlllIll[30] = 42 + 126 - 110 + 88 ^ 54 + 118 - 27 + 3;
        n.lIlIlllIll[31] = 0xBF ^ 0xAB;
        n.lIlIlllIll[32] = 0x4A ^ 0x6E ^ (0x95 ^ 0xB6);
        n.lIlIlllIll[33] = 6 ^ 0xE;
        n.lIlIlllIll[34] = 0xFE ^ 0x84 ^ (0xE5 ^ 0x96);
        n.lIlIlllIll[35] = -(0xFFFFBC1F & 0x4FEE) & (0xFFFFBEFF & 0x6FBF);
        n.lIlIlllIll[36] = 58 + 54 - -49 + 7 ^ 31 + 13 - -112 + 7;
        n.lIlIlllIll[37] = 0x3B ^ 0x37;
        n.lIlIlllIll[38] = 1 ^ 0x24 ^ (0x15 ^ 0x18);
        n.lIlIlllIll[39] = 7 ^ 0xA;
        n.lIlIlllIll[40] = 0xA5 ^ 0xAB;
        n.lIlIlllIll[41] = 0x34 ^ 0x63 ^ (0xF7 ^ 0xAF);
        n.lIlIlllIll[42] = 161 + 92 - 61 + 20 ^ 46 + 0 - 27 + 177;
        n.lIlIlllIll[43] = 0xD1 ^ 0xC0;
        n.lIlIlllIll[44] = 0xF8 ^ 0xAE ^ (0x64 ^ 0x20);
        n.lIlIlllIll[45] = 0xA5 ^ 0xB6;
        n.lIlIlllIll[46] = 0x53 ^ 0x6A ^ (0x71 ^ 0x5D);
        n.lIlIlllIll[47] = 0x57 ^ 0x41;
        n.lIlIlllIll[48] = 56 + 74 - 115 + 181 + (56 + 62 - 58 + 86) - (0x55 ^ 0x2B) + (0x66 ^ 0x7E);
        n.lIlIlllIll[49] = 0xC8 ^ 0x84 ^ (0x36 ^ 0x6D);
        n.lIlIlllIll[50] = 100 + 61 - 61 + 28 ^ 111 + 3 - 97 + 135;
        n.lIlIlllIll[51] = 0x8E ^ 0x97;
        n.lIlIlllIll[52] = 52 + 31 - -16 + 31 ^ 15 + 37 - 32 + 132;
        n.lIlIlllIll[53] = 0x9A ^ 0x81;
        n.lIlIlllIll[54] = 0x49 ^ 0x55;
        n.lIlIlllIll[55] = 0xA4 ^ 0xB9;
        n.lIlIlllIll[56] = 0x89 ^ 0x96;
        n.lIlIlllIll[57] = 0x28 ^ 8;
        n.lIlIlllIll[58] = 0x10 ^ 0x31;
        n.lIlIlllIll[59] = 0xA4 ^ 0x86;
        n.lIlIlllIll[60] = 0xB1 ^ 0x92;
        n.lIlIlllIll[61] = 0x38 ^ 0x33 ^ (0 ^ 0x2F);
        n.lIlIlllIll[62] = 0x9B ^ 0x8B ^ (0x89 ^ 0xBC);
        n.lIlIlllIll[63] = 0x55 ^ 0x1E ^ (0x42 ^ 0x2F);
        n.lIlIlllIll[64] = 0x47 ^ 0x59 ^ (0x9C ^ 0xA5);
        n.lIlIlllIll[65] = 0xC3 ^ 0xA8 ^ (0x85 ^ 0xC7);
        n.lIlIlllIll[66] = 0x75 ^ 0x5F;
        n.lIlIlllIll[67] = 0xA7 ^ 0x8C;
        n.lIlIlllIll[68] = 0x74 ^ 0x5E ^ (0x32 ^ 0x34);
        n.lIlIlllIll[69] = 0xD6 ^ 0xAD ^ (0x51 ^ 7);
        n.lIlIlllIll[70] = 0xA8 ^ 0xB9 ^ (0x9F ^ 0xA0);
        n.lIlIlllIll[71] = 0x81 ^ 0xAE;
        n.lIlIlllIll[72] = 0x51 ^ 0x61;
        n.lIlIlllIll[73] = 1 + 100 - 28 + 95 ^ 132 + 6 - 137 + 152;
        n.lIlIlllIll[74] = 0xBE ^ 0x8D;
        n.lIlIlllIll[75] = 0x90 ^ 0x80 ^ (6 ^ 0x22);
        n.lIlIlllIll[76] = 49 + 29 - 72 + 130 ^ 83 + 111 - 183 + 178;
        n.lIlIlllIll[77] = 0x2D ^ 0x1B;
        n.lIlIlllIll[78] = 84 + 35 - 60 + 73 ^ 59 + 29 - 60 + 151;
        n.lIlIlllIll[79] = 0x57 ^ 0x6F;
        n.lIlIlllIll[80] = -(0xFFFFDC7F & 0x67A1) & (0xFFFFFEFE & 0x7FB9);
        n.lIlIlllIll[81] = 0xFFFFEFFF & 0x17D0;
        n.lIlIlllIll[82] = -(0xFFFFDD96 & 0x376F) & (0xFFFFFFFF & 0x3FFD);
        n.lIlIlllIll[83] = -(0xFFFFE596 & 0x7BFF) & (0xFFFFFBFF & 0x7F9F);
        n.lIlIlllIll[84] = -(0xFFFFE37F & 0x5C89) & (0xFFFFDE7F & 0xEBFE);
        n.lIlIlllIll[85] = 0xFFFFDBFA & 0x3F5D;
        n.lIlIlllIll[86] = 0xFFFFCEED & 0x73F2;
        n.lIlIlllIll[87] = 0xEB ^ 0xBE ^ (0xAE ^ 0x9F);
        n.lIlIlllIll[88] = 0xFFFF8DFB & 0x7344;
        n.lIlIlllIll[89] = -(0xFFFFD673 & 0x79AF) & (0xFFFFFFEE & 0x7EFF);
        n.lIlIlllIll[90] = -(0xFFFF8E4D & 0x77F7) & (0xFFFFE7FE & 0x7FED);
        n.lIlIlllIll[91] = -(0xFFFFB8BF & 0x6771) & (0xFFFFBF77 & Short.MAX_VALUE);
        n.lIlIlllIll[92] = -(0xFFFFFF7E & 0x5CF5) & (0xFFFFFFFF & 0x5FF7);
        n.lIlIlllIll[93] = 0x6B ^ 9 ^ (0x69 ^ 0x32);
        n.lIlIlllIll[94] = 2 ^ 0x38;
        n.lIlIlllIll[95] = 0x66 ^ 0x5D;
        n.lIlIlllIll[96] = 0x3B ^ 7;
    }

    private static void lIIlIlIIIIllI() {
        lIlIlllIlI = new String[lIlIlllIll[96]];
        n.lIlIlllIlI[n.lIlIlllIll[0]] = n."Buying items";
        n.lIlIlllIlI[n.lIlIlllIll[1]] = n."Finished buying items, switching back to magic training";
        n.lIlIlllIlI[n.lIlIlllIll[2]] = n."Navigating to bank";
        n.lIlIlllIlI[n.lIlIlllIll[3]] = n."Handling banking";
        n.lIlIlllIlI[n.lIlIlllIll[6]] = n."We are missing supplies, switching to BUYING";
        n.lIlIlllIlI[n.lIlIlllIll[5]] = n."Take";
        n.lIlIlllIlI[n.lIlIlllIll[30]] = n."Wield";
        n.lIlIlllIlI[n.lIlIlllIll[32]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[33]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[34]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[24]] = n."Wield";
        n.lIlIlllIlI[n.lIlIlllIll[36]] = n."Wield";
        n.lIlIlllIlI[n.lIlIlllIll[37]] = n."Wield";
        n.lIlIlllIlI[n.lIlIlllIll[39]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[40]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[41]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[42]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[43]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[44]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[45]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[31]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[46]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[47]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[49]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[50]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[51]] = n."Wear";
        n.lIlIlllIlI[n.lIlIlllIll[52]] = n."Wield";
        n.lIlIlllIlI[n.lIlIlllIll[53]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[54]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[55]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[27]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[56]] = n."Lobster";
        n.lIlIlllIlI[n.lIlIlllIll[57]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[58]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[59]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[60]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[61]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[62]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[63]] = n."Lobster";
        n.lIlIlllIlI[n.lIlIlllIll[64]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[38]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[65]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[66]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[67]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[68]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[69]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[70]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[71]] = n."Lobster";
        n.lIlIlllIlI[n.lIlIlllIll[72]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[73]] = n."Leather chaps";
        n.lIlIlllIlI[n.lIlIlllIll[7]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[74]] = n."Leather body";
        n.lIlIlllIlI[n.lIlIlllIll[75]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[76]] = n."Coif";
        n.lIlIlllIlI[n.lIlIlllIll[77]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[78]] = n."Combat bracelet";
        n.lIlIlllIlI[n.lIlIlllIll[79]] = n."Lobster";
        n.lIlIlllIlI[n.lIlIlllIll[93]] = n."Range training";
        n.lIlIlllIlI[n.lIlIlllIll[94]] = n."ring of wealth (";
        n.lIlIlllIlI[n.lIlIlllIll[95]] = n."bow";
    }

    private static boolean lIIlIlIIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block32: {
                                                    int n3;
                                                    block34: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block33: {
                                                                            block24: {
                                                                                int n4;
                                                                                block26: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block25: {
                                                                                                            block16: {
                                                                                                                int n5;
                                                                                                                block18: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block17: {
                                                                                                                                            if (!n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7]) || !n.lIIlIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIll[48]) || !n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlllIll[38])) break block16;
                                                                                                                                            int[] nArray = new int[lIlIlllIll[1]];
                                                                                                                                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[9];
                                                                                                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIlIlllIll[1]];
                                                                                                                                            nArray2[n.lIlIlllIll[0]] = lIlIlllIll[9];
                                                                                                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIlIlllIll[1]];
                                                                                                                                        nArray[n.lIlIlllIll[0]] = lIlIlllIll[10];
                                                                                                                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIlIlllIll[1]];
                                                                                                                                        nArray3[n.lIlIlllIll[0]] = lIlIlllIll[10];
                                                                                                                                        if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[53]];
                                                                                                                                    if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block20;
                                                                                                                                    String[] stringArray2 = new String[lIlIlllIll[1]];
                                                                                                                                    stringArray2[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[54]];
                                                                                                                                    if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                                                stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[55]];
                                                                                                                                if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block21;
                                                                                                                                String[] stringArray3 = new String[lIlIlllIll[1]];
                                                                                                                                stringArray3[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[27]];
                                                                                                                                if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIlIlllIll[1]];
                                                                                                                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[11];
                                                                                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray4 = new int[lIlIlllIll[1]];
                                                                                                                            nArray4[n.lIlIlllIll[0]] = lIlIlllIll[11];
                                                                                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIlIlllIll[1]];
                                                                                                                        nArray[n.lIlIlllIll[0]] = lIlIlllIll[8];
                                                                                                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray5 = new int[lIlIlllIll[1]];
                                                                                                                        nArray5[n.lIlIlllIll[0]] = lIlIlllIll[8];
                                                                                                                        if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[56]];
                                                                                                                    if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                        n5 = lIlIlllIll[1];
                                                                                                                        0;
                                                                                                                        if (3 >= ((0xC ^ 0x34) & ~(5 ^ 0x3D))) return n5 != 0;
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIlIlllIll[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7]) || !n.lIIlIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIll[48]) || !n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlllIll[38])) break block24;
                                                                                                            int[] nArray = new int[lIlIlllIll[1]];
                                                                                                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[9];
                                                                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray6 = new int[lIlIlllIll[1]];
                                                                                                            nArray6[n.lIlIlllIll[0]] = lIlIlllIll[9];
                                                                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray6) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                        stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[57]];
                                                                                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block27;
                                                                                                        String[] stringArray4 = new String[lIlIlllIll[1]];
                                                                                                        stringArray4[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[58]];
                                                                                                        if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray4) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[59]];
                                                                                                    if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block28;
                                                                                                    String[] stringArray5 = new String[lIlIlllIll[1]];
                                                                                                    stringArray5[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[60]];
                                                                                                    if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray5) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                String[] stringArray = new String[lIlIlllIll[1]];
                                                                                                stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[61]];
                                                                                                if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block29;
                                                                                                String[] stringArray6 = new String[lIlIlllIll[1]];
                                                                                                stringArray6[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[62]];
                                                                                                if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray6) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIlIlllIll[1]];
                                                                                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[11];
                                                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray7 = new int[lIlIlllIll[1]];
                                                                                            nArray7[n.lIlIlllIll[0]] = lIlIlllIll[11];
                                                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIlIlllIll[1]];
                                                                                        nArray[n.lIlIlllIll[0]] = lIlIlllIll[8];
                                                                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray8 = new int[lIlIlllIll[1]];
                                                                                        nArray8[n.lIlIlllIll[0]] = lIlIlllIll[8];
                                                                                        if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    String[] stringArray = new String[lIlIlllIll[1]];
                                                                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[63]];
                                                                                    if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                        n4 = lIlIlllIll[1];
                                                                                        0;
                                                                                        if (null == null) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = lIlIlllIll[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27]) || !n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) break block32;
                                                                            String[] stringArray = new String[lIlIlllIll[1]];
                                                                            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[64]];
                                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block33;
                                                                            String[] stringArray7 = new String[lIlIlllIll[1]];
                                                                            stringArray7[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[38]];
                                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray7) ? 1 : 0)) break block34;
                                                                        }
                                                                        String[] stringArray = new String[lIlIlllIll[1]];
                                                                        stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[65]];
                                                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block35;
                                                                        String[] stringArray8 = new String[lIlIlllIll[1]];
                                                                        stringArray8[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[66]];
                                                                        if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray8) ? 1 : 0)) break block34;
                                                                    }
                                                                    String[] stringArray = new String[lIlIlllIll[1]];
                                                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[67]];
                                                                    if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block36;
                                                                    String[] stringArray9 = new String[lIlIlllIll[1]];
                                                                    stringArray9[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[68]];
                                                                    if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray9) ? 1 : 0)) break block34;
                                                                }
                                                                String[] stringArray = new String[lIlIlllIll[1]];
                                                                stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[69]];
                                                                if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block37;
                                                                String[] stringArray10 = new String[lIlIlllIll[1]];
                                                                stringArray10[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[70]];
                                                                if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray10) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIlIlllIll[1]];
                                                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[16];
                                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray9 = new int[lIlIlllIll[1]];
                                                            nArray9[n.lIlIlllIll[0]] = lIlIlllIll[16];
                                                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray9) ? 1 : 0)) break block34;
                                                        }
                                                        String[] stringArray = new String[lIlIlllIll[1]];
                                                        stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[71]];
                                                        if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                            n3 = lIlIlllIll[1];
                                                            0;
                                                            if (1 != ((0x6C ^ 0xA ^ (0x79 ^ 0xA)) & (107 + 111 - 85 + 32 ^ 172 + 165 - 221 + 60 ^ -1))) return n3 != 0;
                                                            return ((0x4D ^ 0x71 ^ (0x38 ^ 0x18)) & (184 + 98 - 89 + 24 ^ 43 + 93 - 87 + 148 ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = lIlIlllIll[0];
                                                    return n3 != 0;
                                                }
                                                String[] stringArray = new String[lIlIlllIll[1]];
                                                stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[72]];
                                                if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block39;
                                                String[] stringArray11 = new String[lIlIlllIll[1]];
                                                stringArray11[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[73]];
                                                if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray11) ? 1 : 0)) break block40;
                                            }
                                            String[] stringArray = new String[lIlIlllIll[1]];
                                            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[7]];
                                            if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block41;
                                            String[] stringArray12 = new String[lIlIlllIll[1]];
                                            stringArray12[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[74]];
                                            if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray12) ? 1 : 0)) break block40;
                                        }
                                        String[] stringArray = new String[lIlIlllIll[1]];
                                        stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[75]];
                                        if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block42;
                                        String[] stringArray13 = new String[lIlIlllIll[1]];
                                        stringArray13[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[76]];
                                        if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray13) ? 1 : 0)) break block40;
                                    }
                                    String[] stringArray = new String[lIlIlllIll[1]];
                                    stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[77]];
                                    if (!n.lIIlIlIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block43;
                                    String[] stringArray14 = new String[lIlIlllIll[1]];
                                    stringArray14[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[78]];
                                    if (!n.lIIlIlIIIlIII(Equipment.contains((String[])stringArray14) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIlIlllIll[1]];
                                nArray[n.lIlIlllIll[0]] = lIlIlllIll[15];
                                if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray10 = new int[lIlIlllIll[1]];
                                nArray10[n.lIlIlllIll[0]] = lIlIlllIll[15];
                                if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray10) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIlIlllIll[1]];
                            nArray[n.lIlIlllIll[0]] = lIlIlllIll[12];
                            if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray11 = new int[lIlIlllIll[1]];
                            nArray11[n.lIlIlllIll[0]] = lIlIlllIll[12];
                            if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray11) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIlIlllIll[1]];
                        nArray[n.lIlIlllIll[0]] = lIlIlllIll[13];
                        if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray12 = new int[lIlIlllIll[1]];
                        nArray12[n.lIlIlllIll[0]] = lIlIlllIll[13];
                        if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIlIlllIll[1]];
                    nArray[n.lIlIlllIll[0]] = lIlIlllIll[14];
                    if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray13 = new int[lIlIlllIll[1]];
                    nArray13[n.lIlIlllIll[0]] = lIlIlllIll[14];
                    if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIlIlllIll[1]];
                nArray[n.lIlIlllIll[0]] = lIlIlllIll[16];
                if (!n.lIIlIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray14 = new int[lIlIlllIll[1]];
                nArray14[n.lIlIlllIll[0]] = lIlIlllIll[16];
                if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block40;
            }
            String[] stringArray = new String[lIlIlllIll[1]];
            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[79]];
            if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lIlIlllIll[1];
                0;
                if (2 == 2) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIlllIll[0];
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void O() {
        block30: {
            d var2;
            block29: {
                block28: {
                    block27: {
                        Object var3;
                        block25: {
                            block26: {
                                if (!n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27])) break block25;
                                int[] nArray = new int[lIlIlllIll[1]];
                                nArray[n.lIlIlllIll[0]] = lIlIlllIll[12];
                                if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(lIlIlllIll[12], lIlIlllIll[1], lIlIlllIll[80]);
                                    bp.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIlIlllIll[1]];
                                nArray2[n.lIlIlllIll[0]] = lIlIlllIll[13];
                                if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var3 = new d(lIlIlllIll[13], lIlIlllIll[1], lIlIlllIll[80]);
                                    bp.add((d)var3);
                                    0;
                                }
                                int[] nArray3 = new int[lIlIlllIll[1]];
                                nArray3[n.lIlIlllIll[0]] = lIlIlllIll[14];
                                if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var3 = new d(lIlIlllIll[14], lIlIlllIll[1], lIlIlllIll[80]);
                                    bp.add((d)var3);
                                    0;
                                }
                                int[] nArray4 = new int[lIlIlllIll[1]];
                                nArray4[n.lIlIlllIll[0]] = lIlIlllIll[15];
                                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIlIlllIll[1]];
                                nArray5[n.lIlIlllIll[0]] = lIlIlllIll[15];
                                if (!n.lIIlIlIIIlIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlllIll[81])) break block25;
                            }
                            var3 = new d(lIlIlllIll[15], lIlIlllIll[82], lIlIlllIll[34]);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray = new int[lIlIlllIll[1]];
                        nArray[n.lIlIlllIll[0]] = lIlIlllIll[18];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[18], lIlIlllIll[1], lIlIlllIll[83]);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray6 = new int[lIlIlllIll[1]];
                        nArray6[n.lIlIlllIll[0]] = lIlIlllIll[19];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[19], lIlIlllIll[1], lIlIlllIll[83]);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray7 = new int[lIlIlllIll[1]];
                        nArray7[n.lIlIlllIll[0]] = lIlIlllIll[17];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[17], lIlIlllIll[1], lIlIlllIll[83]);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray8 = new int[lIlIlllIll[1]];
                        nArray8[n.lIlIlllIll[0]] = lIlIlllIll[20];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[20], lIlIlllIll[1], lIlIlllIll[84]);
                            bp.add((d)var3);
                            0;
                        }
                        if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                            int[] nArray9 = new int[lIlIlllIll[1]];
                            nArray9[n.lIlIlllIll[0]] = lIlIlllIll[16];
                            if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                var3 = new d(lIlIlllIll[16], lIlIlllIll[85], lIlIlllIll[41]);
                                bp.add((d)var3);
                                0;
                            }
                        }
                        int[] nArray10 = new int[lIlIlllIll[1]];
                        nArray10[n.lIlIlllIll[0]] = lIlIlllIll[9];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[9], lIlIlllIll[1], lIlIlllIll[86]);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray11 = new int[lIlIlllIll[1]];
                        nArray11[n.lIlIlllIll[0]] = lIlIlllIll[10];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[10], lIlIlllIll[1], lIlIlllIll[86]);
                            bp.add((d)var3);
                            0;
                        }
                        if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                            int[] nArray12 = new int[lIlIlllIll[1]];
                            nArray12[n.lIlIlllIll[0]] = lIlIlllIll[11];
                            if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                var3 = new d(lIlIlllIll[11], lIlIlllIll[82], lIlIlllIll[60]);
                                bp.add((d)var3);
                                0;
                            }
                        }
                        int[] nArray13 = new int[lIlIlllIll[1]];
                        nArray13[n.lIlIlllIll[0]] = lIlIlllIll[22];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[22], lIlIlllIll[1], j.bZ);
                            bp.add((d)var3);
                            0;
                        }
                        int[] nArray14 = new int[lIlIlllIll[1]];
                        nArray14[n.lIlIlllIll[0]] = lIlIlllIll[26];
                        if (n.lIIlIlIIIlIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            var3 = new d(lIlIlllIll[26], lIlIlllIll[87], lIlIlllIll[88]);
                            bp.add((d)var3);
                            0;
                        }
                        if (n.lIIlIlIIIlIlI(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIlIlllIlI[lIlIlllIll[94]]))) ? 1 : 0)) {
                            var2 = new d(lIlIlllIll[89], lIlIlllIll[5], lIlIlllIll[90]);
                            bp.add(var2);
                            0;
                        }
                        int[] nArray15 = new int[lIlIlllIll[1]];
                        nArray15[n.lIlIlllIll[0]] = lIlIlllIll[91];
                        if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIlIlllIll[1]];
                        nArray16[n.lIlIlllIll[0]] = lIlIlllIll[91];
                        if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIlIlllIll[1]];
                        nArray17[n.lIlIlllIll[0]] = lIlIlllIll[91];
                        if (!n.lIIlIlIIIlIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlIlllIll[24])) break block28;
                    }
                    var2 = new d(lIlIlllIll[91], lIlIlllIll[24], lIlIlllIll[92]);
                    bp.add(var2);
                    0;
                }
                int[] nArray = new int[lIlIlllIll[1]];
                nArray[n.lIlIlllIll[0]] = lIlIlllIll[23];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIlIlllIll[1]];
                nArray18[n.lIlIlllIll[0]] = lIlIlllIll[23];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIlIlllIll[1]];
                nArray19[n.lIlIlllIll[0]] = lIlIlllIll[23];
                if (!n.lIIlIlIIIlIIl(Bank.getFirst((int[])nArray19).getQuantity(), lIlIlllIll[24])) break block30;
            }
            var2 = new d(lIlIlllIll[23], lIlIlllIll[24], lIlIlllIll[92]);
            bp.add(var2);
            0;
        }
    }

    private static String lIIlIIlllIlll(String var18, String var21) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIlllIll[2], var19);
            return new String(var11.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIlllI(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public String ae() {
        return lIlIlllIlI[lIlIlllIll[93]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean am() {
        int n2;
        block20: {
            block21: {
                if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7]) && n.lIIlIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIll[48]) && n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlllIll[38])) {
                    int n3;
                    int[] nArray = new int[lIlIlllIll[1]];
                    nArray[n.lIlIlllIll[0]] = lIlIlllIll[9];
                    if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIlllIll[1]];
                        nArray2[n.lIlIlllIll[0]] = lIlIlllIll[10];
                        if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlIlllIll[1]];
                            nArray3[n.lIlIlllIll[0]] = lIlIlllIll[18];
                            if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIlllIll[1]];
                                nArray4[n.lIlIlllIll[0]] = lIlIlllIll[20];
                                if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIlIlllIll[1]];
                                    nArray5[n.lIlIlllIll[0]] = lIlIlllIll[11];
                                    if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIlIlllIll[1]];
                                        nArray6[n.lIlIlllIll[0]] = lIlIlllIll[8];
                                        if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIlIlllIll[1]];
                                            nArray7[n.lIlIlllIll[0]] = lIlIlllIll[26];
                                            if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIlIlllIll[1];
                                                0;
                                                if ((0x99 ^ 0xBA ^ (0xB2 ^ 0x94)) != 0) return n3 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIlIlllIll[0];
                    return n3 != 0;
                }
                if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27]) && n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                    int n4;
                    int[] nArray = new int[lIlIlllIll[1]];
                    nArray[n.lIlIlllIll[0]] = lIlIlllIll[17];
                    if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlIlllIll[1]];
                        nArray8[n.lIlIlllIll[0]] = lIlIlllIll[19];
                        if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIlllIll[1]];
                            nArray9[n.lIlIlllIll[0]] = lIlIlllIll[18];
                            if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIlllIll[1]];
                                nArray10[n.lIlIlllIll[0]] = lIlIlllIll[20];
                                if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIlIlllIll[1]];
                                    nArray11[n.lIlIlllIll[0]] = lIlIlllIll[16];
                                    if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIlIlllIll[1]];
                                        nArray12[n.lIlIlllIll[0]] = lIlIlllIll[26];
                                        if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIlIlllIll[1];
                                            0;
                                            if (-1 < 0) return n4 != 0;
                                            return ((0xB8 ^ 0x80 ^ (0x3E ^ 0x67)) & (0xB7 ^ 0x8B ^ (0x9C ^ 0xC1) ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIlIlllIll[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIlIlllIll[1]];
                nArray[n.lIlIlllIll[0]] = lIlIlllIll[17];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIlIlllIll[1]];
                nArray13[n.lIlIlllIll[0]] = lIlIlllIll[19];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIlIlllIll[1]];
                nArray14[n.lIlIlllIll[0]] = lIlIlllIll[18];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIlIlllIll[1]];
                nArray15[n.lIlIlllIll[0]] = lIlIlllIll[20];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIlIlllIll[1]];
                nArray16[n.lIlIlllIll[0]] = lIlIlllIll[12];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIlIlllIll[1]];
                nArray17[n.lIlIlllIll[0]] = lIlIlllIll[23];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIlIlllIll[1]];
                nArray18[n.lIlIlllIll[0]] = lIlIlllIll[13];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIlIlllIll[1]];
                nArray19[n.lIlIlllIll[0]] = lIlIlllIll[14];
                if (!n.lIIlIlIIIlIII(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIlIlllIll[1]];
                nArray20[n.lIlIlllIll[0]] = lIlIlllIll[15];
                if (!n.lIIlIlIIIlIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIlIlllIll[1]];
                nArray21[n.lIlIlllIll[0]] = lIlIlllIll[15];
                if (!n.lIIlIlIIIlIII(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIlIlllIll[1]];
            nArray[n.lIlIlllIll[0]] = lIlIlllIll[16];
            if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIlIlllIll[1]];
                nArray22[n.lIlIlllIll[0]] = lIlIlllIll[26];
                if (n.lIIlIlIIIlIII(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIlIlllIll[1];
                    0;
                    if (((0x74 ^ 0x7F) & ~(0x52 ^ 0x59)) == 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIlIlllIll[0];
        return n2 != 0;
    }

    private static String lIIlIIlllIlIl(String var7, String var10) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var1 = var10.toCharArray();
        int var20 = lIlIlllIll[0];
        char[] var17 = var7.toCharArray();
        int var8 = var17.length;
        int var9 = lIlIlllIll[0];
        while (n.lIIlIlIIIlIIl(var9, var8)) {
            char var22 = var17[var9];
            var4.append((char)(var22 ^ var1[var20 % var1.length]));
            0;
            ++var20;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }

    static {
        n.lIIlIlIIIIlll();
        n.lIIlIlIIIIllI();
        bp = new ArrayList<d>();
    }

    @Override
    public boolean ac() {
        return lIlIlllIll[0];
    }

    private static boolean lIIlIlIIIllII(int n2) {
        return n2 > 0;
    }

    private static void az() {
        block34: {
            block33: {
                int[] nArray = new int[lIlIlllIll[1]];
                nArray[n.lIlIlllIll[0]] = lIlIlllIll[28];
                if (!n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIlIlllIll[1]];
                nArray2[n.lIlIlllIll[0]] = lIlIlllIll[29];
                if (!n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIlIlllIll[1]];
                nArray3[n.lIlIlllIll[0]] = lIlIlllIll[16];
                if (!n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIlIlllIll[1]];
                nArray4[n.lIlIlllIll[0]] = lIlIlllIll[11];
                if (n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray4) ? 1 : 0) && !n.lIIlIlIIIlIII(Equipment.contains(item -> item.getName().contains(lIlIlllIlI[lIlIlllIll[95]])) ? 1 : 0)) break block34;
            }
            if (n.lIIlIlIIIlllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27])) {
            int[] nArray = new int[lIlIlllIll[1]];
            nArray[n.lIlIlllIll[0]] = lIlIlllIll[28];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIlIlllIll[1]];
                nArray5[n.lIlIlllIll[0]] = lIlIlllIll[28];
                Inventory.getFirst((int[])nArray5).interact(lIlIlllIlI[lIlIlllIll[30]]);
            }
            int[] nArray6 = new int[lIlIlllIll[1]];
            nArray6[n.lIlIlllIll[0]] = lIlIlllIll[12];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0) && n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[5])) {
                e.l(lIlIlllIll[12]);
            }
            int[] nArray7 = new int[lIlIlllIll[1]];
            nArray7[n.lIlIlllIll[0]] = lIlIlllIll[13];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray7) ? 1 : 0) && n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[5]) && n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[31])) {
                e.l(lIlIlllIll[13]);
            }
            int[] nArray8 = new int[lIlIlllIll[1]];
            nArray8[n.lIlIlllIll[0]] = lIlIlllIll[14];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray8) ? 1 : 0) && n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[31])) {
                e.l(lIlIlllIll[14]);
            }
            int[] nArray9 = new int[lIlIlllIll[1]];
            nArray9[n.lIlIlllIll[0]] = lIlIlllIll[15];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIlIlllIll[15]);
            }
        }
        if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[31])) {
            String[] stringArray = new String[lIlIlllIll[1]];
            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[32]];
            if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlIlllIll[1]];
                stringArray2[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[33]];
                Inventory.getFirst((String[])stringArray2).interact(lIlIlllIlI[lIlIlllIll[34]]);
            }
        }
        if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27])) {
            int[] nArray = new int[lIlIlllIll[1]];
            nArray[n.lIlIlllIll[0]] = lIlIlllIll[29];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIlIlllIll[1]];
                nArray10[n.lIlIlllIll[0]] = lIlIlllIll[29];
                Inventory.getFirst((int[])nArray10).interact(lIlIlllIlI[lIlIlllIll[24]]);
            }
            int[] nArray11 = new int[lIlIlllIll[1]];
            nArray11[n.lIlIlllIll[0]] = lIlIlllIll[35];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIlIlllIll[1]];
                nArray12[n.lIlIlllIll[0]] = lIlIlllIll[35];
                Inventory.getFirst((int[])nArray12).interact(lIlIlllIlI[lIlIlllIll[36]]);
            }
            int[] nArray13 = new int[lIlIlllIll[1]];
            nArray13[n.lIlIlllIll[0]] = lIlIlllIll[16];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIlIlllIll[1]];
                nArray14[n.lIlIlllIll[0]] = lIlIlllIll[16];
                Inventory.getFirst((int[])nArray14).interact(lIlIlllIlI[lIlIlllIll[37]]);
            }
        }
        if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlllIll[38])) {
            String[] stringArray = new String[lIlIlllIll[1]];
            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[39]];
            if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIlllIll[1]];
                stringArray3[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[40]];
                Inventory.getFirst((String[])stringArray3).interact(lIlIlllIlI[lIlIlllIll[41]]);
            }
        }
        if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
            String[] stringArray = new String[lIlIlllIll[1]];
            stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[42]];
            if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lIlIlllIll[1]];
                stringArray4[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[43]];
                Inventory.getFirst((String[])stringArray4).interact(lIlIlllIlI[lIlIlllIll[44]]);
            }
        }
        String[] stringArray = new String[lIlIlllIll[1]];
        stringArray[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[45]];
        if (n.lIIlIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray5 = new String[lIlIlllIll[1]];
            stringArray5[n.lIlIlllIll[0]] = lIlIlllIlI[lIlIlllIll[31]];
            Inventory.getFirst((String[])stringArray5).interact(lIlIlllIlI[lIlIlllIll[46]]);
        }
        int[] nArray = new int[lIlIlllIll[1]];
        nArray[n.lIlIlllIll[0]] = lIlIlllIll[21];
        if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray15 = new int[lIlIlllIll[1]];
            nArray15[n.lIlIlllIll[0]] = lIlIlllIll[21];
            Inventory.getFirst((int[])nArray15).interact(lIlIlllIlI[lIlIlllIll[47]]);
        }
        if (n.lIIlIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIll[48])) {
            int[] nArray16 = new int[lIlIlllIll[1]];
            nArray16[n.lIlIlllIll[0]] = lIlIlllIll[8];
            if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                int[] nArray17 = new int[lIlIlllIll[1]];
                nArray17[n.lIlIlllIll[0]] = lIlIlllIll[8];
                if (n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray17) ? 1 : 0)) {
                    int[] nArray18 = new int[lIlIlllIll[1]];
                    nArray18[n.lIlIlllIll[0]] = lIlIlllIll[8];
                    Inventory.getFirst((int[])nArray18).interact(lIlIlllIlI[lIlIlllIll[49]]);
                }
            }
            if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                int[] nArray19 = new int[lIlIlllIll[1]];
                nArray19[n.lIlIlllIll[0]] = lIlIlllIll[9];
                if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                    int[] nArray20 = new int[lIlIlllIll[1]];
                    nArray20[n.lIlIlllIll[0]] = lIlIlllIll[9];
                    if (n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray20) ? 1 : 0)) {
                        int[] nArray21 = new int[lIlIlllIll[1]];
                        nArray21[n.lIlIlllIll[0]] = lIlIlllIll[9];
                        Inventory.getFirst((int[])nArray21).interact(lIlIlllIlI[lIlIlllIll[50]]);
                    }
                }
            }
            if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7]) && n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlllIll[38])) {
                int[] nArray22 = new int[lIlIlllIll[1]];
                nArray22[n.lIlIlllIll[0]] = lIlIlllIll[10];
                if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIlIlllIll[1]];
                    nArray23[n.lIlIlllIll[0]] = lIlIlllIll[10];
                    if (n.lIIlIlIIIlIlI(Equipment.contains((int[])nArray23) ? 1 : 0)) {
                        int[] nArray24 = new int[lIlIlllIll[1]];
                        nArray24[n.lIlIlllIll[0]] = lIlIlllIll[10];
                        Inventory.getFirst((int[])nArray24).interact(lIlIlllIlI[lIlIlllIll[51]]);
                    }
                }
            }
            if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                int[] nArray25 = new int[lIlIlllIll[1]];
                nArray25[n.lIlIlllIll[0]] = lIlIlllIll[11];
                if (n.lIIlIlIIIlIII(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                    int[] nArray26 = new int[lIlIlllIll[1]];
                    nArray26[n.lIlIlllIll[0]] = lIlIlllIll[11];
                    Inventory.getFirst((int[])nArray26).interact(lIlIlllIlI[lIlIlllIll[52]]);
                }
            }
        }
    }

    public static void ay() {
        if (n.lIIlIlIIIlIII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlllIlI[lIlIlllIll[0]];
            b.a(bp);
            if (n.lIIlIlIIIlIIl(bp.size(), lIlIlllIll[1])) {
                System.out.println(lIlIlllIlI[lIlIlllIll[1]]);
                bn = lIlIlllIll[0];
            }
        }
        if (n.lIIlIlIIIlIlI(bn ? 1 : 0)) {
            BankLocation var13;
            if (n.lIIlIlIIIlIlI(n.al() ? 1 : 0)) {
                var13 = BankLocation.getNearest();
                if (n.lIIlIlIIIlIll(var13) && n.lIIlIlIIIlIlI(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlllIlI[lIlIlllIll[2]];
                    a.a(var13);
                }
                if (n.lIIlIlIIIlIll(var13) && n.lIIlIlIIIlIII(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlllIlI[lIlIlllIll[3]];
                    if (n.lIIlIlIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlllIll[4]);
                        0;
                        Time.sleepTicks((int)lIlIlllIll[3]);
                        0;
                    }
                    if (n.lIIlIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (n.lIIlIlIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIlllIll[5]);
                            0;
                        }
                        if (n.lIIlIlIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIlllIll[2]);
                            0;
                        }
                        if (n.lIIlIlIIIlIlI(n.am() ? 1 : 0)) {
                            n.O();
                            System.out.println(lIlIlllIlI[lIlIlllIll[6]]);
                            bn = lIlIlllIll[1];
                            return;
                        }
                        if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                            a.a(lIlIlllIll[8], lIlIlllIll[1]);
                            a.a(lIlIlllIll[9], lIlIlllIll[1]);
                            a.a(lIlIlllIll[10], lIlIlllIll[1]);
                            Bank.withdrawAll((int)lIlIlllIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
                            a.a(lIlIlllIll[12], lIlIlllIll[1]);
                            a.a(lIlIlllIll[13], lIlIlllIll[1]);
                            a.a(lIlIlllIll[14], lIlIlllIll[1]);
                            Bank.withdrawAll((int)lIlIlllIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlIlllIll[1]);
                            0;
                            Bank.withdrawAll((int)lIlIlllIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlIlllIll[1]);
                            0;
                            a.a(lIlIlllIll[17], lIlIlllIll[1]);
                        }
                        a.a(lIlIlllIll[18], lIlIlllIll[1]);
                        a.a(lIlIlllIll[19], lIlIlllIll[1]);
                        a.a(lIlIlllIll[20], lIlIlllIll[1]);
                        a.a(lIlIlllIll[21], lIlIlllIll[1]);
                        a.a(lIlIlllIll[22], lIlIlllIll[1]);
                        a.a(lIlIlllIll[23], lIlIlllIll[24]);
                        a.a(lIlIlllIll[25], lIlIlllIll[24]);
                        a.a(lIlIlllIll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (n.lIIlIlIIIlIII(n.al() ? 1 : 0)) {
                n.az();
                if (n.lIIlIlIIIlIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27])) {
                    m.aj();
                }
                if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[27])) {
                    var13 = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (n.lIIlIlIIIllll(tileItem.getId(), lIlIlllIll[16]) && n.lIIlIlIIIllIl(tileItem.getQuantity(), lIlIlllIll[41])) {
                            n2 = lIlIlllIll[1];
                            0;
                            if (1 < (3 & (3 ^ -1))) {
                                return ((0x42 ^ 0x21 ^ (0x3E ^ 0x6D)) & (18 + 48 - 61 + 155 ^ 0 + 117 - 13 + 40 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIlIlllIll[0];
                        }
                        return n2 != 0;
                    });
                    if (n.lIIlIlIIIlIll(var13)) {
                        var13.interact(lIlIlllIlI[lIlIlllIll[5]]);
                        Time.sleepTicks((int)lIlIlllIll[6]);
                        0;
                    }
                    l.ah();
                }
            }
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (n.lIIlIlIIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIll[7])) {
            bl = lIlIlllIll[1];
            0;
            if ((127 + 36 - 87 + 111 ^ 170 + 93 - 120 + 48) < 3) {
                return ((0x48 ^ 0x7A ^ (0x3C ^ 0x53)) & (0x16 ^ 0x67 ^ (0xB7 ^ 0x9B) ^ -1)) != 0;
            }
        } else {
            bl = lIlIlllIll[0];
        }
        return bl;
    }

    private static String lIIlIIlllIllI(String var5, String var16) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIlIlllIll[33]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIlllIll[2], var14);
            return new String(var12.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Override
    public int ad() {
        try {
            n.ay();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 2) {
            return (0xF8 ^ 0xAC) & ~(0xF ^ 0x5B);
        }
        return lIlIlllIll[87];
    }
}

