/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.B;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.w;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

public class A
implements W {
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint dC;
    private static /* synthetic */ int[] lIlIIlllI;
    static /* synthetic */ WorldPoint dA;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint dB;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIlIIllII;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint dD;
    static /* synthetic */ int dE;

    @Override
    public boolean V() {
        boolean bl;
        if (A.lIIIllIllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIlIIlllI[5];
            0;
            if (-(0x4E ^ 0x4A) > 0) {
                return ((0xF0 ^ 0xA5) & ~(0xD ^ 0x58)) != 0;
            }
        } else {
            bl = lIlIIlllI[6];
        }
        return bl;
    }

    private static boolean lIIIllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIlIllllII(String lllIlIllIlIIll, String lllIlIllIlIlII) {
        try {
            SecretKeySpec lllIlIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), lIlIIlllI[21]), "DES");
            Cipher lllIlIllIlIlll = Cipher.getInstance("DES");
            lllIlIllIlIlll.init(lIlIIlllI[8], lllIlIllIllIII);
            return new String(lllIlIllIlIlll.doFinal(Base64.getDecoder().decode(lllIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIllIlIllI) {
            lllIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIlIIlllI[5]];
        nArray[A.lIlIIlllI[6]] = lIlIIlllI[25];
        if (A.lIIIllIlIlIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIIlllI[5]];
            nArray2[A.lIlIIlllI[6]] = lIlIIlllI[16];
            if (A.lIIIllIlIlIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlIIlllI[5]];
                nArray3[A.lIlIIlllI[6]] = lIlIIlllI[17];
                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIlllI[5]];
                    nArray4[A.lIlIIlllI[6]] = lIlIIlllI[19];
                    if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIIlllI[5]];
                        nArray5[A.lIlIIlllI[6]] = lIlIIlllI[10];
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIlIIlllI[5]];
                            nArray6[A.lIlIIlllI[6]] = lIlIIlllI[22];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIlIIlllI[5]];
                                nArray7[A.lIlIIlllI[6]] = lIlIIlllI[26];
                                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIlIIlllI[5];
                                    0;
                                    if ((0x6E ^ 0x6A) >= ((0x3F ^ 0x1A) & ~(0x79 ^ 0x5C))) return n2 != 0;
                                    return ((0xC4 ^ 0x84) & ~(0x23 ^ 0x63)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIlllI[6];
        return n2 != 0;
    }

    private static void lIIIllIIllIl() {
        lIlIIllII = new String[lIlIIlllI[79]];
        A.lIlIIllII[A.lIlIIlllI[6]] = A."Finished buying items, switching back to quest";
        A.lIlIIllII[A.lIlIIlllI[5]] = A."Nav to bank";
        A.lIlIIllII[A.lIlIIlllI[8]] = A."Handling banking";
        A.lIlIIllII[A.lIlIIlllI[1]] = A."We are missing quest supplies, switching to BUYING";
        A.lIlIIllII[A.lIlIIlllI[9]] = A."We are missing quest supplies, switching to BUYING";
        A.lIlIIllII[A.lIlIIlllI[3]] = A."Drink";
        A.lIlIIllII[A.lIlIIlllI[18]] = A."Aris";
        A.lIlIIllII[A.lIlIIlllI[20]] = A."Nav to rfd room";
        A.lIlIIllII[A.lIlIIlllI[21]] = A."Aris";
        A.lIlIIllII[A.lIlIIlllI[23]] = A."Dwarf";
        A.lIlIIllII[A.lIlIIlllI[4]] = A."Inspect";
        A.lIlIIllII[A.lIlIIlllI[2]] = A."Nav to fally pub";
        A.lIlIIllII[A.lIlIIlllI[29]] = A."Handle chat";
        A.lIlIIllII[A.lIlIIlllI[30]] = A."Kaylee";
        A.lIlIIllII[A.lIlIIlllI[31]] = A."Nav to rock cake guy";
        A.lIlIIllII[A.lIlIIlllI[32]] = A."Handle chat";
        A.lIlIIllII[A.lIlIIlllI[33]] = A."An old Dwarf";
        A.lIlIIllII[A.lIlIIlllI[36]] = A."Nav to rock cake guy";
        A.lIlIIllII[A.lIlIIlllI[37]] = A."Handle chat";
        A.lIlIIllII[A.lIlIIlllI[38]] = A."An old Dwarf";
        A.lIlIIllII[A.lIlIIlllI[34]] = A."Rohak";
        A.lIlIIllII[A.lIlIIlllI[39]] = A."Handle chat";
        A.lIlIIllII[A.lIlIIlllI[40]] = A."Rohak";
        A.lIlIIllII[A.lIlIIlllI[43]] = A."Handle chat";
        A.lIlIIllII[A.lIlIIlllI[44]] = A."Rohak";
        A.lIlIIllII[A.lIlIIlllI[45]] = A."Wear";
        A.lIlIIllII[A.lIlIIlllI[47]] = A."Take";
        A.lIlIIllII[A.lIlIIlllI[48]] = A."Wield";
        A.lIlIIllII[A.lIlIIlllI[49]] = A."Nav to icefiend";
        A.lIlIIllII[A.lIlIIlllI[50]] = A."Attack icefiend";
        A.lIlIIllII[A.lIlIIlllI[41]] = A."Icefiend";
        A.lIlIIllII[A.lIlIIlllI[51]] = A."Attack";
        A.lIlIIllII[A.lIlIIlllI[55]] = A."Aris";
        A.lIlIIllII[A.lIlIIlllI[56]] = A."Nav to rfd room";
        A.lIlIIllII[A.lIlIIlllI[57]] = A."Aris";
        A.lIlIIllII[A.lIlIIlllI[58]] = A."Finishing quest";
        A.lIlIIllII[A.lIlIIlllI[59]] = A."Dwarf";
        A.lIlIIllII[A.lIlIIlllI[66]] = A."RFD Dwarf quest";
        A.lIlIIllII[A.lIlIIlllI[67]] = A."ring of wealth (";
        A.lIlIIllII[A.lIlIIlllI[76]] = A."Yes.";
        A.lIlIIllII[A.lIlIIlllI[42]] = A."What can you tell me about dwarves and ale?";
        A.lIlIIllII[A.lIlIIlllI[77]] = A."I could offer you some in return, how about 200 gold?";
    }

    @Override
    public boolean S() {
        return lIlIIlllI[6];
    }

    static {
        A.lIIIllIIlllI();
        A.lIIIllIIllIl();
        bv = new ArrayList<d>();
        dA = new WorldPoint(lIlIIlllI[68], lIlIIlllI[69], lIlIIlllI[6]);
        dB = new WorldPoint(lIlIIlllI[70], lIlIIlllI[71], lIlIIlllI[6]);
        dC = new WorldPoint(lIlIIlllI[72], lIlIIlllI[73], lIlIIlllI[6]);
        dD = new WorldPoint(lIlIIlllI[74], lIlIIlllI[75], lIlIIlllI[6]);
        String[] stringArray = new String[lIlIIlllI[1]];
        stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[76]];
        stringArray[A.lIlIIlllI[5]] = lIlIIllII[lIlIIlllI[42]];
        stringArray[A.lIlIIlllI[8]] = lIlIIllII[lIlIIlllI[77]];
        bR = stringArray;
        dE = lIlIIlllI[78];
    }

    private static void lIIIllIIlllI() {
        lIlIIlllI = new int[80];
        A.lIlIIlllI[0] = 0xFFFFD7AE & 0x2AF7;
        A.lIlIIlllI[1] = 3;
        A.lIlIIlllI[2] = 0x57 ^ 0x6B ^ (0x55 ^ 0x62);
        A.lIlIIlllI[3] = 3 ^ (0 ^ 6);
        A.lIlIIlllI[4] = 125 + 15 - -7 + 32 ^ 77 + 102 - 7 + 13;
        A.lIlIIlllI[5] = 1;
        A.lIlIIlllI[6] = (0x7A ^ 0x38 ^ (0x2C ^ 0x7A)) & (120 + 129 - 118 + 21 ^ 41 + 127 - 124 + 96 ^ -1);
        A.lIlIIlllI[7] = -(0xFFFFE565 & 0x7E9B) & (0xFFFFFFBB & 0x77CC);
        A.lIlIIlllI[8] = 2;
        A.lIlIIlllI[9] = 0xA ^ 0xE;
        A.lIlIIlllI[10] = 0xFFFF9F7B & 0x67F5;
        A.lIlIIlllI[11] = -(0xFFFFF3E3 & 0x4EBD) & (0xFFFFFBF3 & 0x77FD);
        A.lIlIIlllI[12] = 0xFFFFBFFF & 0x5F49;
        A.lIlIIlllI[13] = -(117 + 1 - 37 + 56) & (0xFFFFFFFF & 0x1FCF);
        A.lIlIIlllI[14] = 0xFFFFFF5D & 0x1FEA;
        A.lIlIIlllI[15] = -(0xFFFFBD3B & 0x7AFD) & (0xFFFFBFFF & 0x7FBF);
        A.lIlIIlllI[16] = -(0xFFFFBBF3 & 0x7C5F) & (0xFFFFFFDF & 0x3FFF);
        A.lIlIIlllI[17] = -(0xFFFFEAAE & 0x5D79) & (0xFFFFFFBF & 0x4FFF);
        A.lIlIIlllI[18] = 198 + 34 - 213 + 180 ^ 52 + 99 - 37 + 79;
        A.lIlIIlllI[19] = -(0xFFFFBABB & 0x557D) & (0xFFFFB7FD & 0x5FBB);
        A.lIlIIlllI[20] = 0x70 ^ 0x65 ^ (0x2B ^ 0x39);
        A.lIlIIlllI[21] = 0x69 ^ 0xA ^ (0xE6 ^ 0x8D);
        A.lIlIIlllI[22] = -(0xFFFFBBFF & 0x760D) & (0xFFFFFFAF & 0x367F);
        A.lIlIIlllI[23] = 83 + 117 - 159 + 112 ^ 43 + 35 - -17 + 49;
        A.lIlIIlllI[24] = 0xFFFFC17F & 0x3FFB;
        A.lIlIIlllI[25] = -(0xFFFF868F & 0x7BFD) & (0xFFFFC7BF & 0x3FFF);
        A.lIlIIlllI[26] = 0xFFFF87E7 & 0x7BFB;
        A.lIlIIlllI[27] = 231 + 4 - 95 + 107 ^ 187 + 183 - 206 + 33;
        A.lIlIIlllI[28] = -(0xFFFFEC9B & 0x73F5) & (0xFFFFEFF7 & 0x77FB);
        A.lIlIIlllI[29] = 0x99 ^ 0x95;
        A.lIlIIlllI[30] = 0x96 ^ 0x9B;
        A.lIlIIlllI[31] = 0x29 ^ 0xB ^ (0xBC ^ 0x90);
        A.lIlIIlllI[32] = 0x49 ^ 6 ^ (0xDB ^ 0x9B);
        A.lIlIIlllI[33] = 0x5C ^ 0x4C;
        A.lIlIIlllI[34] = 0xA8 ^ 0x97 ^ (0xEE ^ 0xC5);
        A.lIlIIlllI[35] = 0xFFFFDFFF & 0x27BF;
        A.lIlIIlllI[36] = 0x50 ^ 0x57 ^ (0x99 ^ 0x8F);
        A.lIlIIlllI[37] = 0x2F ^ 0x3C ^ 1;
        A.lIlIIlllI[38] = 0x3C ^ 0x2F;
        A.lIlIIlllI[39] = 0x95 ^ 0xAC ^ (0x65 ^ 0x49);
        A.lIlIIlllI[40] = 5 ^ 0x13;
        A.lIlIIlllI[41] = 44 + 89 - 120 + 128 ^ 72 + 8 - -19 + 48;
        A.lIlIIlllI[42] = 0xB7 ^ 0x9F;
        A.lIlIIlllI[43] = 58 + 134 - 164 + 122 ^ 77 + 40 - 8 + 20;
        A.lIlIIlllI[44] = 0x30 ^ 0x28;
        A.lIlIIlllI[45] = 0xAC ^ 0xB5;
        A.lIlIIlllI[46] = 0xFFFFBF55 & 0x5DFF;
        A.lIlIIlllI[47] = 0x4B ^ 0x51;
        A.lIlIIlllI[48] = 0xA6 ^ 0x80 ^ (0xD ^ 0x30);
        A.lIlIIlllI[49] = 17 + 30 - -37 + 86 ^ 138 + 46 - 31 + 29;
        A.lIlIIlllI[50] = 0xB5 ^ 0xA8;
        A.lIlIIlllI[51] = 0x87 ^ 0x98;
        A.lIlIIlllI[52] = -(0xFFFFA6EF & 0x79BA) & (0xFFFFBDFF & Short.MAX_VALUE);
        A.lIlIIlllI[53] = 0xFFFF8DB6 & 0x7ECF;
        A.lIlIIlllI[54] = 0xFFFFBDE9 & 0x4F76;
        A.lIlIIlllI[55] = 0x58 ^ 0x78;
        A.lIlIIlllI[56] = 0x81 ^ 0xA0;
        A.lIlIIlllI[57] = 137 + 107 - 115 + 41 ^ 133 + 28 - 122 + 97;
        A.lIlIIlllI[58] = 0x9E ^ 0xBD;
        A.lIlIIlllI[59] = 23 + 141 - 83 + 77 ^ 23 + 111 - -41 + 11;
        A.lIlIIlllI[60] = -(0xFFFFF3E5 & 0x5C5E) & (0xFFFFFF7F & 0x73EB);
        A.lIlIIlllI[61] = 0xFFFFBFFA & 0x4FA5;
        A.lIlIIlllI[62] = 0xFFFF877D & 0x7FEE;
        A.lIlIIlllI[63] = 0xFFFFEFDE & 0x3EED;
        A.lIlIIlllI[64] = 0xFFFFE9AE & 0x77F9;
        A.lIlIIlllI[65] = 0x39 ^ 0x3D ^ (0xFB ^ 0x9B);
        A.lIlIIlllI[66] = 100 + 121 - 198 + 120 ^ 43 + 141 - 158 + 144;
        A.lIlIIlllI[67] = 0xB1 ^ 0xA0 ^ (0x12 ^ 0x25);
        A.lIlIIlllI[68] = 0xFFFFFF97 & 0xCEF;
        A.lIlIIlllI[69] = -(0xFFFF9A62 & 0x77FF) & (0xFFFF9FFF & 0x7EF7);
        A.lIlIIlllI[70] = -(0xFFFFCE5B & 0x35F7) & (0xFFFFAFFF & 0x5FDF);
        A.lIlIIlllI[71] = 0xFFFFED3D & 0x1FEE;
        A.lIlIIlllI[72] = 0xFFFFEF75 & 0x1BBB;
        A.lIlIIlllI[73] = -(0xFFFFFF87 & 0x497B) & (0xFFFFEFBF & 0x7FD7);
        A.lIlIIlllI[74] = 0xFFFF8FC7 & 0x7BF9;
        A.lIlIIlllI[75] = 0xFFFF9FD5 & 0x6DBB;
        A.lIlIIlllI[76] = 0x5A ^ 0x7D;
        A.lIlIIlllI[77] = 0x4F ^ 0x66;
        A.lIlIIlllI[78] = 0xFFFFC6BF & 0x3BE9;
        A.lIlIIlllI[79] = 0xDB ^ 0x87 ^ (0xED ^ 0x9B);
    }

    private static void af() {
        d lllIlIlllIllII;
        Object lllIlIlllIllIl;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIlIIlllI[5]];
                                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIlIIlllI[5]];
                                        nArray2[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIlIIlllI[5]];
                                        nArray3[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlllI[3])) break block21;
                                    }
                                    lllIlIlllIllIl = new d(lIlIIlllI[11], lIlIIlllI[3], i.bq);
                                    bv.add((d)lllIlIlllIllIl);
                                    0;
                                }
                                int[] nArray = new int[lIlIIlllI[5]];
                                nArray[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    lllIlIlllIllIl = new d(lIlIIlllI[25], lIlIIlllI[5], lIlIIlllI[60]);
                                    bv.add((d)lllIlIlllIllIl);
                                    0;
                                }
                                int[] nArray4 = new int[lIlIIlllI[5]];
                                nArray4[A.lIlIIlllI[6]] = lIlIIlllI[22];
                                if (A.lIIIllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    lllIlIlllIllIl = new d(lIlIIlllI[22], lIlIIlllI[5], lIlIIlllI[60]);
                                    bv.add((d)lllIlIlllIllIl);
                                    0;
                                }
                                int[] nArray5 = new int[lIlIIlllI[5]];
                                nArray5[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIlIIlllI[5]];
                                nArray6[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIlIIlllI[5]];
                                nArray7[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIlllI[9])) break block23;
                            }
                            lllIlIlllIllIl = new d(lIlIIlllI[10], lIlIIlllI[9], lIlIIlllI[61]);
                            bv.add((d)lllIlIlllIllIl);
                            0;
                        }
                        int[] nArray = new int[lIlIIlllI[5]];
                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[19];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllIlIlllIllIl = new d(lIlIIlllI[19], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((d)lllIlIlllIllIl);
                            0;
                        }
                        int[] nArray8 = new int[lIlIIlllI[5]];
                        nArray8[A.lIlIIlllI[6]] = lIlIIlllI[17];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lllIlIlllIllIl = new d(lIlIIlllI[17], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((d)lllIlIlllIllIl);
                            0;
                        }
                        int[] nArray9 = new int[lIlIIlllI[5]];
                        nArray9[A.lIlIIlllI[6]] = lIlIIlllI[15];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            lllIlIlllIllIl = new d(lIlIIlllI[15], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((d)lllIlIlllIllIl);
                            0;
                        }
                        int[] nArray10 = new int[lIlIIlllI[5]];
                        nArray10[A.lIlIIlllI[6]] = lIlIIlllI[16];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lllIlIlllIllIl = new d(lIlIIlllI[16], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((d)lllIlIlllIllIl);
                            0;
                        }
                        int[] nArray11 = new int[lIlIIlllI[5]];
                        nArray11[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIlIIlllI[5]];
                        nArray12[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIlIIlllI[5]];
                        nArray13[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray13).getQuantity(), lIlIIlllI[3])) break block25;
                    }
                    lllIlIlllIllIl = new d(lIlIIlllI[14], lIlIIlllI[4], lIlIIlllI[62]);
                    bv.add((d)lllIlIlllIllIl);
                    0;
                }
                int[] nArray = new int[lIlIIlllI[5]];
                nArray[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIlIIlllI[5]];
                nArray14[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIlIIlllI[5]];
                nArray15[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray15).getQuantity(), lIlIIlllI[4])) break block27;
            }
            lllIlIlllIllIl = new d(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]);
            bv.add((d)lllIlIlllIllIl);
            0;
        }
        if (A.lIIIllIlIIll(Bank.contains((Predicate)(lllIlIlllIllIl = item -> item.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]))) ? 1 : 0)) {
            lllIlIlllIllII = new d(lIlIIlllI[63], lIlIIlllI[3], lIlIIlllI[64]);
            bv.add(lllIlIlllIllII);
            0;
        }
        int[] nArray = new int[lIlIIlllI[5]];
        nArray[A.lIlIIlllI[6]] = lIlIIlllI[13];
        if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlIlllIllII = new d(lIlIIlllI[13], lIlIIlllI[42], lIlIIlllI[62]);
            bv.add(lllIlIlllIllII);
            0;
        }
    }

    private static boolean lIIIllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIlIIllII[lIlIIlllI[66]];
    }

    @Override
    public int T() {
        try {
            A.bq();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 > (0x67 ^ 0x63)) {
            return (0x34 ^ 0x79) & ~(0xC3 ^ 0x8E);
        }
        return lIlIIlllI[65];
    }

    private static boolean lIIIllIllIlI(Object object, Object object2) {
        return object == object2;
    }

    public static void bq() {
        block50: {
            block58: {
                block57: {
                    BankLocation lllIlIllllIIII;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (A.lIIIllIIllll(e.j(lIlIIlllI[0]), lIlIIlllI[1])) {
                                                B.bs();
                                            }
                                            if (A.lIIIllIlIIII(e.j(lIlIIlllI[0]), lIlIIlllI[1]) && A.lIIIllIIllll(e.j(lIlIIlllI[2]), lIlIIlllI[3])) {
                                                w.aT();
                                            }
                                            if (!A.lIIIllIlIIII(Skills.getLevel((Skill)Skill.COOKING), lIlIIlllI[4]) || !A.lIIIllIlIIII(e.j(lIlIIlllI[0]), lIlIIlllI[1]) || !A.lIIIllIlIIIl(e.j(lIlIIlllI[2]), lIlIIlllI[3])) break block50;
                                            if (A.lIIIllIlIIlI(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (A.lIIIllIIllll(bv.size(), lIlIIlllI[5])) {
                                                    System.out.println(lIlIIllII[lIlIIlllI[6]]);
                                                    bt = lIlIIlllI[6];
                                                }
                                            }
                                            if (!A.lIIIllIlIIll(bt ? 1 : 0)) break block50;
                                            if (!A.lIIIllIlIIll(A.ab() ? 1 : 0) || !A.lIIIllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            lllIlIllllIIII = BankLocation.getNearest();
                                            if (A.lIIIllIlIlII(lllIlIllllIIII) && A.lIIIllIlIIll(lllIlIllllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[5]];
                                                a.a(lllIlIllllIIII);
                                            }
                                            if (!A.lIIIllIlIlII(lllIlIllllIIII) || !A.lIIIllIlIIlI(lllIlIllllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (A.lIIIllIlIIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlllI[7]);
                                                0;
                                            }
                                            if (!A.lIIIllIlIIlI(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[8]];
                                            if (A.lIIIllIlIlIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIIlllI[9]);
                                                0;
                                            }
                                            if (A.lIIIllIlIlIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIIlllI[8]);
                                                0;
                                            }
                                            int[] nArray = new int[lIlIIlllI[5]];
                                            nArray[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                            if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIlIIlllI[5]];
                                            nArray2[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                            if (!A.lIIIllIlIIII(Bank.getFirst((int[])nArray2).getQuantity(), lIlIIlllI[9])) break block53;
                                        }
                                        int[] nArray = new int[lIlIIlllI[5]];
                                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIlIIlllI[5]];
                                        nArray3[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIII(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlllI[3])) break block53;
                                    }
                                    int[] nArray = new int[lIlIIlllI[5]];
                                    nArray[A.lIlIIlllI[6]] = lIlIIlllI[12];
                                    if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIlIIlllI[5]];
                                    nArray4[A.lIlIIlllI[6]] = lIlIIlllI[12];
                                    if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIlllI[4])) break block55;
                                }
                                A.af();
                                System.out.println(lIlIIllII[lIlIIlllI[1]]);
                                bt = lIlIIlllI[5];
                                return;
                            }
                            int[] nArray = new int[lIlIIlllI[2]];
                            nArray[A.lIlIIlllI[6]] = lIlIIlllI[13];
                            nArray[A.lIlIIlllI[5]] = lIlIIlllI[14];
                            nArray[A.lIlIIlllI[8]] = lIlIIlllI[12];
                            nArray[A.lIlIIlllI[1]] = lIlIIlllI[15];
                            nArray[A.lIlIIlllI[9]] = lIlIIlllI[16];
                            nArray[A.lIlIIlllI[3]] = lIlIIlllI[17];
                            nArray[A.lIlIIlllI[18]] = lIlIIlllI[19];
                            nArray[A.lIlIIlllI[20]] = lIlIIlllI[10];
                            nArray[A.lIlIIlllI[21]] = lIlIIlllI[22];
                            nArray[A.lIlIIlllI[23]] = lIlIIlllI[24];
                            nArray[A.lIlIIlllI[4]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIll(e.b(nArray) ? 1 : 0)) {
                                A.af();
                                System.out.println(lIlIIllII[lIlIIlllI[9]]);
                                bt = lIlIIlllI[5];
                                return;
                            }
                            int[] nArray5 = new int[lIlIIlllI[2]];
                            nArray5[A.lIlIIlllI[6]] = lIlIIlllI[13];
                            nArray5[A.lIlIIlllI[5]] = lIlIIlllI[14];
                            nArray5[A.lIlIIlllI[8]] = lIlIIlllI[12];
                            nArray5[A.lIlIIlllI[1]] = lIlIIlllI[15];
                            nArray5[A.lIlIIlllI[9]] = lIlIIlllI[16];
                            nArray5[A.lIlIIlllI[3]] = lIlIIlllI[17];
                            nArray5[A.lIlIIlllI[18]] = lIlIIlllI[19];
                            nArray5[A.lIlIIlllI[20]] = lIlIIlllI[10];
                            nArray5[A.lIlIIlllI[21]] = lIlIIlllI[22];
                            nArray5[A.lIlIIlllI[23]] = lIlIIlllI[24];
                            nArray5[A.lIlIIlllI[4]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIlI(e.b(nArray5) ? 1 : 0)) {
                                a.a(lIlIIlllI[13], lIlIIlllI[4]);
                                a.a(lIlIIlllI[14], lIlIIlllI[4]);
                                a.a(lIlIIlllI[12], lIlIIlllI[4]);
                                a.a(lIlIIlllI[15], lIlIIlllI[5]);
                                a.a(lIlIIlllI[16], lIlIIlllI[5]);
                                a.a(lIlIIlllI[17], lIlIIlllI[5]);
                                a.a(lIlIIlllI[19], lIlIIlllI[5]);
                                a.a(lIlIIlllI[10], lIlIIlllI[9]);
                                a.a(lIlIIlllI[22], lIlIIlllI[5]);
                                a.a(lIlIIlllI[25], lIlIIlllI[5]);
                                a.a(lIlIIlllI[24], lIlIIlllI[3]);
                                a.a(lIlIIlllI[11], lIlIIlllI[8]);
                                a.a(lIlIIlllI[26], lIlIIlllI[7]);
                            }
                        }
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lIIIllIIllll(Movement.getRunEnergy(), lIlIIlllI[27])) {
                            Inventory.getFirst((int[])f.aV).interact(lIlIIllII[lIlIIlllI[3]]);
                            Time.sleepTicks((int)lIlIIlllI[5]);
                            0;
                        }
                        if (A.lIIIllIlIIlI(A.ab() ? 1 : 0) && A.lIIIllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) {
                                String[] stringArray = new String[lIlIIlllI[5]];
                                stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[18]];
                                if (A.lIIIllIlIlll(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[20]];
                                    B.bt();
                                }
                            }
                            String[] stringArray = new String[lIlIIlllI[5]];
                            stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[21]];
                            if (A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) {
                                if (A.lIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIlIIlllI[5]];
                                    stringArray2[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIlIIllII[lIlIIlllI[4]]);
                                    Time.sleepTicks((int)lIlIIlllI[5]);
                                    0;
                                }
                                g.a(bR);
                            }
                        }
                        if (A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[4])) {
                            if (A.lIIIllIllIII(Vars.getBit((int)lIlIIlllI[28]), lIlIIlllI[5])) {
                                if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[2]];
                                    Movement.walkTo((WorldPoint)dB);
                                    0;
                                    Time.sleepTicks((int)lIlIIlllI[5]);
                                    0;
                                }
                                if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[29]];
                                    g.a(lIlIIllII[lIlIIlllI[30]], bR);
                                }
                            }
                            if (A.lIIIllIlIIIl(Vars.getBit((int)lIlIIlllI[28]), lIlIIlllI[5])) {
                                int[] nArray = new int[lIlIIlllI[5]];
                                nArray[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIlIIlllI[5]];
                                    nArray6[A.lIlIIlllI[6]] = lIlIIlllI[26];
                                    int[] nArray7 = new int[lIlIIlllI[5]];
                                    nArray7[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIlIIlllI[5]);
                                    0;
                                }
                                int[] nArray8 = new int[lIlIIlllI[5]];
                                nArray8[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (A.lIIIllIlIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[31]];
                                        Movement.walkTo((WorldPoint)dC);
                                        0;
                                        Time.sleepTicks((int)lIlIIlllI[5]);
                                        0;
                                    }
                                    if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[32]];
                                        g.a(lIlIIllII[lIlIIlllI[33]], bR);
                                    }
                                }
                            }
                        }
                        if (A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[34])) {
                            if (A.lIIIllIllIII(Vars.getBit((int)lIlIIlllI[35]), lIlIIlllI[9])) {
                                cl = lIlIIlllI[6];
                                if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[36]];
                                    Movement.walkTo((WorldPoint)dC);
                                    0;
                                    Time.sleepTicks((int)lIlIIlllI[5]);
                                    0;
                                }
                                if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[37]];
                                    g.a(lIlIIllII[lIlIIlllI[38]], bR);
                                    g.a(lIlIIllII[lIlIIlllI[34]], bR);
                                }
                            }
                            if (A.lIIIllIlIIIl(Vars.getBit((int)lIlIIlllI[35]), lIlIIlllI[9])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[39]];
                                g.a(lIlIIllII[lIlIIlllI[40]], bR);
                            }
                        }
                        if (!A.lIIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[41]) || A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[42])) {
                            AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[43]];
                            g.a(lIlIIllII[lIlIIlllI[44]], bR);
                        }
                        if (!A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[27])) break block50;
                        int[] nArray = new int[lIlIIlllI[5]];
                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[22];
                        if (A.lIIIllIlIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIlllI[5]];
                            nArray9[A.lIlIIlllI[6]] = lIlIIlllI[22];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIlllI[5]];
                                nArray10[A.lIlIIlllI[6]] = lIlIIlllI[22];
                                Inventory.getFirst((int[])nArray10).interact(lIlIIllII[lIlIIlllI[45]]);
                                Time.sleepTicks((int)lIlIIlllI[5]);
                                0;
                            }
                        }
                        int[] nArray11 = new int[lIlIIlllI[5]];
                        nArray11[A.lIlIIlllI[6]] = lIlIIlllI[22];
                        if (A.lIIIllIlIIlI(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIlIIlllI[5]];
                            nArray12[A.lIlIIlllI[6]] = lIlIIlllI[46];
                            if (A.lIIIllIlIlII(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIlIIlllI[5]];
                                nArray13[A.lIlIIlllI[6]] = lIlIIlllI[46];
                                TileItems.getNearest((int[])nArray13).interact(lIlIIllII[lIlIIlllI[47]]);
                                Time.sleepTicks((int)lIlIIlllI[5]);
                                0;
                            }
                        }
                        int[] nArray14 = new int[lIlIIlllI[5]];
                        nArray14[A.lIlIIlllI[6]] = lIlIIlllI[46];
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIlIIlllI[5]];
                            nArray15[A.lIlIIlllI[6]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIlIIlllI[5]];
                                nArray16[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                if (A.lIIIllIlIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIlIIlllI[5]];
                                    nArray17[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIlIIllII[lIlIIlllI[48]]);
                                    Time.sleepTicks((int)lIlIIlllI[5]);
                                    0;
                                }
                            }
                            if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[49]];
                                Movement.walkTo((WorldPoint)dD);
                                0;
                                Time.sleepTicks((int)lIlIIlllI[5]);
                                0;
                            }
                            if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[50]];
                                if (A.lIIIllIlIlll(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIlIIlllI[5]];
                                    stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIIllII[lIlIIlllI[51]]);
                                    Time.sleepTicks((int)lIlIIlllI[1]);
                                    0;
                                }
                            }
                        }
                        int[] nArray18 = new int[lIlIIlllI[5]];
                        nArray18[A.lIlIIlllI[6]] = lIlIIlllI[52];
                        if (!A.lIIIllIlIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        lllIlIllllIIII = new WorldPoint(lIlIIlllI[53], lIlIIlllI[54], lIlIIlllI[6]);
                        if (!A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) break block56;
                        String[] stringArray = new String[lIlIIlllI[5]];
                        stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[55]];
                        if (!A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllIlIllllIIII), lIlIIlllI[41])) break block58;
                }
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[56]];
                B.bt();
            }
            String[] stringArray = new String[lIlIIlllI[5]];
            stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[57]];
            if (A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) {
                if (A.lIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[58]];
                    if (A.lIIIllIIllll(cl, lIlIIlllI[5])) {
                        an.oo += lIlIIlllI[5];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIIlllI[5];
                        an.oo = lIlIIlllI[6];
                        cm = lIlIIlllI[6];
                    }
                    int[] nArray = new int[lIlIIlllI[5]];
                    nArray[A.lIlIIlllI[6]] = lIlIIlllI[52];
                    String[] stringArray3 = new String[lIlIIlllI[5]];
                    stringArray3[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIlIIlllI[5]);
                    0;
                }
                g.a(bR);
            }
        }
    }

    private static boolean lIIIllIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIlIlllIll(String lllIlIlllIIIII, String lllIlIllIlllll) {
        try {
            SecretKeySpec lllIlIlllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIlllIIlII = Cipher.getInstance("Blowfish");
            lllIlIlllIIlII.init(lIlIIlllI[8], lllIlIlllIIlIl);
            return new String(lllIlIlllIIlII.doFinal(Base64.getDecoder().decode(lllIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIlllIIIll) {
            lllIlIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllllIl(String lllIlIllIIIIII, String lllIlIlIllllll) {
        lllIlIllIIIIII = new String(Base64.getDecoder().decode(lllIlIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIllIIIIll = new StringBuilder();
        char[] lllIlIllIIIIlI = lllIlIlIllllll.toCharArray();
        int lllIlIllIIIIIl = lIlIIlllI[6];
        char[] lllIlIlIlllIll = lllIlIllIIIIII.toCharArray();
        int lllIlIlIlllIlI = lllIlIlIlllIll.length;
        int lllIlIlIlllIIl = lIlIIlllI[6];
        while (A.lIIIllIIllll(lllIlIlIlllIIl, lllIlIlIlllIlI)) {
            char lllIlIllIIIllI = lllIlIlIlllIll[lllIlIlIlllIIl];
            lllIlIllIIIIll.append((char)(lllIlIllIIIllI ^ lllIlIllIIIIlI[lllIlIllIIIIIl % lllIlIllIIIIlI.length]));
            0;
            ++lllIlIllIIIIIl;
            ++lllIlIlIlllIIl;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(lllIlIllIIIIll);
    }

    private static boolean lIIIllIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIlIl(int n2) {
        return n2 > 0;
    }
}

