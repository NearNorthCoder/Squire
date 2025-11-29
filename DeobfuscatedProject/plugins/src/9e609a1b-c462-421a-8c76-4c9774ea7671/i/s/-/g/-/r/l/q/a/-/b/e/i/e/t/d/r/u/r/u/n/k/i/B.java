/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import java.awt.Point;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class B
implements M {
    public static /* synthetic */ boolean by;
    private static final /* synthetic */ WorldPoint gA;
    private static final /* synthetic */ WorldPoint gz;
    private static /* synthetic */ String[] lIIIllllllIII;
    private static /* synthetic */ int[] lIIlIIIIIIlIl;
    private static final /* synthetic */ WorldPoint gD;
    static /* synthetic */ int bY;
    static /* synthetic */ WorldArea gI;
    static /* synthetic */ int co;
    private static final /* synthetic */ WorldPoint gB;
    static /* synthetic */ WorldPoint gK;
    static /* synthetic */ WorldArea gH;
    private static final /* synthetic */ WorldPoint gF;
    private static final /* synthetic */ WorldPoint gE;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ WorldPoint gy;
    private static final /* synthetic */ WorldPoint gG;
    private static final /* synthetic */ WorldPoint gC;
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ String[] gx;
    static /* synthetic */ WorldArea gJ;

    private static void W() {
        d llllllllllllllIllllllllIlIllllll;
        Object llllllllllllllIllllllllIllIIIIII;
        int[] nArray = new int[lIIlIIIIIIlIl[1]];
        nArray[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIIIIIIlIl[7], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]);
            bA.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIIlIIIIIIlIl[1]];
        nArray2[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllIllllllllIllIIIIII = new d(lIIlIIIIIIlIl[8], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[191]);
            bA.add((d)llllllllllllllIllllllllIllIIIIII);
            "".length();
        }
        int[] nArray3 = new int[lIIlIIIIIIlIl[1]];
        nArray3[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllIllllllllIllIIIIII = new d(lIIlIIIIIIlIl[9], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]);
            bA.add((d)llllllllllllllIllllllllIllIIIIII);
            "".length();
        }
        int[] nArray4 = new int[lIIlIIIIIIlIl[1]];
        nArray4[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[12];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllIllllllllIllIIIIII = new d(lIIlIIIIIIlIl[12], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[192]);
            bA.add((d)llllllllllllllIllllllllIllIIIIII);
            "".length();
        }
        int[] nArray5 = new int[lIIlIIIIIIlIl[1]];
        nArray5[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[10];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllIllllllllIllIIIIII = new d(lIIlIIIIIIlIl[10], lIIlIIIIIIlIl[2], lIIlIIIIIIlIl[193]);
            bA.add((d)llllllllllllllIllllllllIllIIIIII);
            "".length();
        }
        if (B.lIlIIlllIIIlIlI(Bank.contains((Predicate)(llllllllllllllIllllllllIllIIIIII = item -> item.getName().toLowerCase().contains(lIIIllllllIII[lIIlIIIIIIlIl[199]]))) ? 1 : 0)) {
            llllllllllllllIllllllllIlIllllll = new d(lIIlIIIIIIlIl[194], lIIlIIIIIIlIl[11], lIIlIIIIIIlIl[195]);
            bA.add(llllllllllllllIllllllllIlIllllll);
            "".length();
        }
        int[] nArray6 = new int[lIIlIIIIIIlIl[1]];
        nArray6[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[196];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllIllllllllIlIllllll = new d(lIIlIIIIIIlIl[196], lIIlIIIIIIlIl[49], lIIlIIIIIIlIl[193]);
            bA.add(llllllllllllllIllllllllIlIllllll);
            "".length();
        }
    }

    private static boolean lIlIIlllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIIllII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean X() {
        return lIIlIIIIIIlIl[0];
    }

    private static void lIlIIlllIIIIlll() {
        lIIlIIIIIIlIl = new int[219];
        B.lIIlIIIIIIlIl[0] = (87 + 61 - 63 + 121 ^ 99 + 52 - 52 + 56) & (0xC6 ^ 0xBA ^ (0x63 ^ 0x4A) ^ -" ".length());
        B.lIIlIIIIIIlIl[1] = " ".length();
        B.lIIlIIIIIIlIl[2] = 0x71 ^ 0x69 ^ (0x8A ^ 0x98);
        B.lIIlIIIIIIlIl[3] = "  ".length();
        B.lIIlIIIIIIlIl[4] = "   ".length();
        B.lIIlIIIIIIlIl[5] = 0xFFFFB7A8 & 0x5BDF;
        B.lIIlIIIIIIlIl[6] = 0xC5 ^ 0xC1;
        B.lIIlIIIIIIlIl[7] = -(0xFFFFCABF & 0x3D7B) & (0xFFFF8FFF & 0x7FBF);
        B.lIIlIIIIIIlIl[8] = -(0xFFFFFF5F & 0x74E1) & (0xFFFFF7F6 & 0x7FFB);
        B.lIIlIIIIIIlIl[9] = 0xFFFFB34F & 0x4EFE;
        B.lIIlIIIIIIlIl[10] = -(0xFFFFE5F1 & 0x5ABF) & (0xFFFFDFFF & 0x7FF8);
        B.lIIlIIIIIIlIl[11] = 0x45 ^ 0xC ^ (0x2A ^ 0x66);
        B.lIIlIIIIIIlIl[12] = -(0xFFFFEEB7 & 0x53E9) & (0xFFFFF7F9 & 0x7BF7);
        B.lIIlIIIIIIlIl[13] = 0x14 ^ 0x12;
        B.lIIlIIIIIIlIl[14] = 0x6B ^ 0x6C;
        B.lIIlIIIIIIlIl[15] = -(0xFFFFFD53 & 0x7BAF) & (0xFFFFFF77 & 0x7FEF);
        B.lIIlIIIIIIlIl[16] = 0xFFFFB7C6 & 0x5AFB;
        B.lIIlIIIIIIlIl[17] = 190 + 49 - 111 + 127 ^ 162 + 177 - 267 + 113;
        B.lIIlIIIIIIlIl[18] = 0xB6 ^ 0x97 ^ (0x4D ^ 0x64);
        B.lIIlIIIIIIlIl[19] = 0x65 ^ 2 ^ (0x66 ^ 0x1F);
        B.lIIlIIIIIIlIl[20] = 0xFFFFF5DF & 0x7FBC;
        B.lIIlIIIIIIlIl[21] = 0x29 ^ 0x20;
        B.lIIlIIIIIIlIl[22] = 0x1D ^ 0x16;
        B.lIIlIIIIIIlIl[23] = 0x80 ^ 0x8C;
        B.lIIlIIIIIIlIl[24] = 0xBC ^ 0xB3;
        B.lIIlIIIIIIlIl[25] = -(0xFFFFFBF7 & 0x1D29) & (0xFFFFFF7F & 0x1FEF);
        B.lIIlIIIIIIlIl[26] = -(0xFFFFFDA6 & 0x6F7B) & (0xFFFFFFFD & Short.MAX_VALUE);
        B.lIIlIIIIIIlIl[27] = 0xB2 ^ 0x87 ^ (0x16 ^ 0x2E);
        B.lIIlIIIIIIlIl[28] = 0xD3 ^ 0xC7;
        B.lIIlIIIIIIlIl[29] = 0xED ^ 0x9E ^ (0x2D ^ 0x50);
        B.lIIlIIIIIIlIl[30] = 0xFFFFCF89 & 0x37FF;
        B.lIIlIIIIIIlIl[31] = 0x23 ^ 0x33;
        B.lIIlIIIIIIlIl[32] = 0x4E ^ 0x3E ^ (0x4F ^ 0x2E);
        B.lIIlIIIIIIlIl[33] = "  ".length() ^ (0xB4 ^ 0xAF);
        B.lIIlIIIIIIlIl[34] = 0xFFFFD33E & 0x7EFD;
        B.lIIlIIIIIIlIl[35] = 11 + 5 - 10 + 167 ^ 90 + 80 - 46 + 67;
        B.lIIlIIIIIIlIl[36] = 0x46 ^ 0x55;
        B.lIIlIIIIIIlIl[37] = 0x4B ^ 0x37 ^ (5 ^ 0x6C);
        B.lIIlIIIIIIlIl[38] = 3 ^ 0x15;
        B.lIIlIIIIIIlIl[39] = 0x2E ^ 0x39;
        B.lIIlIIIIIIlIl[40] = 0xA5 ^ 0xBD;
        B.lIIlIIIIIIlIl[41] = 0xFFFFF5B5 & 0x7FEA;
        B.lIIlIIIIIIlIl[42] = 0x3B ^ 0x28 ^ (0x66 ^ 0x56);
        B.lIIlIIIIIIlIl[43] = 0x6F ^ 0x4D ^ (0x1F ^ 0x27);
        B.lIIlIIIIIIlIl[44] = 0xFFFFD3E3 & 0x7E5C;
        B.lIIlIIIIIIlIl[45] = 0xD ^ 0x58 ^ (0x5B ^ 0x15);
        B.lIIlIIIIIIlIl[46] = -(0xFFFFF52E & 0x7AF7) & (0xFFFFFBFF & 0x7CFF);
        B.lIIlIIIIIIlIl[47] = 0x35 ^ 0x21 ^ (0x1F ^ 0x17);
        B.lIIlIIIIIIlIl[48] = 45 + 43 - 19 + 93 ^ 125 + 6 - 53 + 113;
        B.lIIlIIIIIIlIl[49] = 102 + 160 - 78 + 0 ^ 62 + 117 - 53 + 18;
        B.lIIlIIIIIIlIl[50] = -(0xFFFF9FEF & 0x6839) & (0xFFFFFBFE & 0x7FFB);
        B.lIIlIIIIIIlIl[51] = 0xFFFF9F7F & 0x66E0;
        B.lIIlIIIIIIlIl[52] = -(0xFFFFFF07 & 0x8FF) & (0xFFFFDFEF & 0x3AF7);
        B.lIIlIIIIIIlIl[53] = 0xFFFFA7E1 & 0x5E7F;
        B.lIIlIIIIIIlIl[54] = -(0xFFFFAB9B & 0x7465) & (0xFFFFF3FF & 0x3EDF);
        B.lIIlIIIIIIlIl[55] = 0x3E ^ 0x10 ^ (0x9C ^ 0xAD);
        B.lIIlIIIIIIlIl[56] = 0x25 ^ 5;
        B.lIIlIIIIIIlIl[57] = 0xB9 ^ 0x98;
        B.lIIlIIIIIIlIl[58] = "   ".length() ^ (0x37 ^ 0x16);
        B.lIIlIIIIIIlIl[59] = 0x26 ^ 0x7C ^ (0x68 ^ 0x16);
        B.lIIlIIIIIIlIl[60] = 0x46 ^ 0x63;
        B.lIIlIIIIIIlIl[61] = 0x8C ^ 0xAA;
        B.lIIlIIIIIIlIl[62] = 0xF7 ^ 0x97 ^ (0x71 ^ 0x36);
        B.lIIlIIIIIIlIl[63] = 0xE9 ^ 0xC4;
        B.lIIlIIIIIIlIl[64] = 0x5C ^ 0x63 ^ (0x71 ^ 0x67);
        B.lIIlIIIIIIlIl[65] = 165 + 105 - 197 + 113 ^ 60 + 94 - 89 + 79;
        B.lIIlIIIIIIlIl[66] = 0x5F ^ 0x48 ^ (0x16 ^ 0x2A);
        B.lIIlIIIIIIlIl[67] = 93 + 68 - 122 + 91 ^ 81 + 11 - 2 + 84;
        B.lIIlIIIIIIlIl[68] = 0xFFFFF23F & 0x5FFD;
        B.lIIlIIIIIIlIl[69] = -(0xFFFFA25A & 0x5FB7) & (0xFFFFF7FD & 0x7FB7);
        B.lIIlIIIIIIlIl[70] = 0xDF ^ 0xBF ^ (0xDD ^ 0x93);
        B.lIIlIIIIIIlIl[71] = 0x59 ^ 0x6B;
        B.lIIlIIIIIIlIl[72] = 0x5D ^ 0x1C ^ (0x3B ^ 0x55);
        B.lIIlIIIIIIlIl[73] = 50 + 129 - 83 + 71 ^ 99 + 65 - 69 + 56;
        B.lIIlIIIIIIlIl[74] = 0x6B ^ 0x5C;
        B.lIIlIIIIIIlIl[75] = 0x2C ^ 0x77 ^ (0xD5 ^ 0xBF);
        B.lIIlIIIIIIlIl[76] = 95 + 168 - 218 + 136 ^ 99 + 43 - 46 + 41;
        B.lIIlIIIIIIlIl[77] = 0x7A ^ 0x49;
        B.lIIlIIIIIIlIl[78] = 0x7B ^ 0x30 ^ 90 + 102 - 111 + 46;
        B.lIIlIIIIIIlIl[79] = 0x2A ^ 0x17 ^ (0x7B ^ 7);
        B.lIIlIIIIIIlIl[80] = -(0xFFFFBD84 & 0x6B7F) & (0xFFFFFFFF & 0x2F6B);
        B.lIIlIIIIIIlIl[81] = 0x38 ^ 0x18 ^ (0x76 ^ 0x63);
        B.lIIlIIIIIIlIl[82] = 74 + 71 - 117 + 123 ^ 122 + 5 - -9 + 25;
        B.lIIlIIIIIIlIl[83] = -(0xFFFFDDFD & 0x3B93) & (0xFFFFFFFF & 0x1FFF);
        B.lIIlIIIIIIlIl[84] = 0x46 ^ 0x7F ^ " ".length();
        B.lIIlIIIIIIlIl[85] = (0x9E ^ 0x9A) & ~(0x2F ^ 0x2B) ^ (0x24 ^ 0x1D);
        B.lIIlIIIIIIlIl[86] = 0xFFFFF5C6 & Short.MAX_VALUE;
        B.lIIlIIIIIIlIl[87] = 0xCB ^ 0x99 ^ (8 ^ 0x60);
        B.lIIlIIIIIIlIl[88] = 0x8A ^ 0xB1;
        B.lIIlIIIIIIlIl[89] = 0xFFFFDBF9 & 0x7647;
        B.lIIlIIIIIIlIl[90] = 0x5A ^ 0x67;
        B.lIIlIIIIIIlIl[91] = 0xFFFF8CDF & 0x7BFB;
        B.lIIlIIIIIIlIl[92] = 0x7F ^ 0x41;
        B.lIIlIIIIIIlIl[93] = 0xD ^ 0x73 ^ (0xD ^ 0x38);
        B.lIIlIIIIIIlIl[94] = 0xFFFFFFDB & 0xFF5;
        B.lIIlIIIIIIlIl[95] = 0xFFFFA3BB & 0x5E6E;
        B.lIIlIIIIIIlIl[96] = 0x47 ^ 0x78;
        B.lIIlIIIIIIlIl[97] = 0xDF ^ 0x9A ^ (0x10 ^ 0x15);
        B.lIIlIIIIIIlIl[98] = -(0xFFFFBDD3 & 0x6FEE) & (0xFFFFFFFF & Short.MAX_VALUE);
        B.lIIlIIIIIIlIl[99] = 0x17 ^ 0x10 ^ (0xEF ^ 0xAA);
        B.lIIlIIIIIIlIl[100] = 0xFFFFF7FF & 0x7BDA;
        B.lIIlIIIIIIlIl[101] = 0xFE ^ 0xBD;
        B.lIIlIIIIIIlIl[102] = 0xDC ^ 0x98;
        B.lIIlIIIIIIlIl[103] = 199 + 50 - 204 + 183 ^ 26 + 164 - 127 + 117;
        B.lIIlIIIIIIlIl[104] = 161 + 53 - 127 + 158 ^ 153 + 125 - 120 + 18;
        B.lIIlIIIIIIlIl[105] = 0xEB ^ 0xAC;
        B.lIIlIIIIIIlIl[106] = 0xFFFFB777 & 0x4EF8;
        B.lIIlIIIIIIlIl[107] = 0x25 ^ 7 ^ (0x46 ^ 0x2C);
        B.lIIlIIIIIIlIl[108] = 0x16 ^ 0x5F;
        B.lIIlIIIIIIlIl[109] = 0x3D ^ 0x77;
        B.lIIlIIIIIIlIl[110] = 0x5C ^ 0x66 ^ (0xD4 ^ 0xA2);
        B.lIIlIIIIIIlIl[111] = 0xFFFFF5ED & 0x7FB7;
        B.lIIlIIIIIIlIl[112] = 0x50 ^ 0x63 ^ (0x7E ^ 0);
        B.lIIlIIIIIIlIl[113] = 180 + 25 - 51 + 46 ^ 114 + 76 - 151 + 95;
        B.lIIlIIIIIIlIl[114] = 0xD6 ^ 0x83;
        B.lIIlIIIIIIlIl[115] = 42 + 125 - -27 + 4 ^ 30 + 86 - 58 + 79;
        B.lIIlIIIIIIlIl[116] = 0xFFFFFDB7 & 0x77EE;
        B.lIIlIIIIIIlIl[117] = 0xF5 ^ 0xA4;
        B.lIIlIIIIIIlIl[118] = 0x2F ^ 0x75;
        B.lIIlIIIIIIlIl[119] = 0x50 ^ 2;
        B.lIIlIIIIIIlIl[120] = -(0xFFFFBD6D & 0x6A93) & (0xFFFFFB47 & 0x7EFA);
        B.lIIlIIIIIIlIl[121] = 106 + 20 - -26 + 71 ^ 25 + 96 - 31 + 50;
        B.lIIlIIIIIIlIl[122] = 0xFFFFF7F6 & 0x7BD9;
        B.lIIlIIIIIIlIl[123] = 0x18 ^ 0x4C;
        B.lIIlIIIIIIlIl[124] = 0x35 ^ 0x6A;
        B.lIIlIIIIIIlIl[125] = 0xD8 ^ 0x8E;
        B.lIIlIIIIIIlIl[126] = 0xD3 ^ 0x84;
        B.lIIlIIIIIIlIl[127] = 198 + 136 - 226 + 104 ^ 83 + 131 - 202 + 128;
        B.lIIlIIIIIIlIl[128] = 0xFFFF8EEF & 0x777B;
        B.lIIlIIIIIIlIl[129] = 0xFFFFDAF1 & 0x37EE;
        B.lIIlIIIIIIlIl[130] = 0xFFFFDF6F & 0x26FE;
        B.lIIlIIIIIIlIl[131] = 0xFFFFF3FF & 0x1EE3;
        B.lIIlIIIIIIlIl[132] = 0x70 ^ 0x79 ^ (0xD7 ^ 0x87);
        B.lIIlIIIIIIlIl[133] = 29 + 164 - 40 + 83 ^ 148 + 138 - 156 + 53;
        B.lIIlIIIIIIlIl[134] = 154 + 19 - 146 + 174 ^ 53 + 144 - 133 + 85;
        B.lIIlIIIIIIlIl[135] = 0x29 ^ 0x1B ^ (0x2F ^ 0x40);
        B.lIIlIIIIIIlIl[136] = 0x10 ^ 0x7B ^ (0xA4 ^ 0x91);
        B.lIIlIIIIIIlIl[137] = 0x14 ^ 0x74;
        B.lIIlIIIIIIlIl[138] = 114 + 114 - 142 + 113 ^ 127 + 96 - 64 + 7;
        B.lIIlIIIIIIlIl[139] = 0x72 ^ 0x10;
        B.lIIlIIIIIIlIl[140] = 0xA0 ^ 0x82 ^ (0x68 ^ 0x2E);
        B.lIIlIIIIIIlIl[141] = 0xFFFFFE2B & 0x3FF;
        B.lIIlIIIIIIlIl[142] = 0x7F ^ 0x1C;
        B.lIIlIIIIIIlIl[143] = -(0xFFFFCCE3 & 0x731E) & (0xFFFFCFDF & 0x7FF3);
        B.lIIlIIIIIIlIl[144] = 0x42 ^ 0x6B ^ (0x68 ^ 0x24);
        B.lIIlIIIIIIlIl[145] = 130 + 73 - 57 + 47 ^ 65 + 60 - 53 + 95;
        B.lIIlIIIIIIlIl[146] = 6 ^ 0x47 ^ (0x33 ^ 0x15);
        B.lIIlIIIIIIlIl[147] = 0x43 ^ 0x2B;
        B.lIIlIIIIIIlIl[148] = 0x49 ^ 0x7E ^ (0x19 ^ 0x47);
        B.lIIlIIIIIIlIl[149] = 0xFFFFD23F & Short.MAX_VALUE;
        B.lIIlIIIIIIlIl[150] = 0xD3 ^ 0x93 ^ (0x76 ^ 0x5C);
        B.lIIlIIIIIIlIl[151] = 0xC4 ^ 0xAF;
        B.lIIlIIIIIIlIl[152] = 0x3C ^ 0x50;
        B.lIIlIIIIIIlIl[153] = 0xF0 ^ 0xC5 ^ (0xC6 ^ 0x9E);
        B.lIIlIIIIIIlIl[154] = 0xFFFFEEFF & 0x175B;
        B.lIIlIIIIIIlIl[155] = 0xFFFFBEFD & 0x53DF;
        B.lIIlIIIIIIlIl[156] = 0xF8 ^ 0x96;
        B.lIIlIIIIIIlIl[157] = 0x38 ^ 0x57;
        B.lIIlIIIIIIlIl[158] = 0x21 ^ 0x51;
        B.lIIlIIIIIIlIl[159] = 118 + 179 - 82 + 12 ^ 17 + 36 - -39 + 54;
        B.lIIlIIIIIIlIl[160] = 0x7C ^ 0xE;
        B.lIIlIIIIIIlIl[161] = 0xD4 ^ 0xA7;
        B.lIIlIIIIIIlIl[162] = 211 + 136 - 237 + 130 ^ 40 + 37 - -27 + 28;
        B.lIIlIIIIIIlIl[163] = 5 ^ 0x70;
        B.lIIlIIIIIIlIl[164] = 0x14 ^ 0x62;
        B.lIIlIIIIIIlIl[165] = 0x12 ^ 0x65;
        B.lIIlIIIIIIlIl[166] = 223 + 200 - 350 + 176 ^ 56 + 112 - 74 + 35;
        B.lIIlIIIIIIlIl[167] = 0x37 ^ 0x30 ^ (0xF2 ^ 0x8C);
        B.lIIlIIIIIIlIl[168] = 0xEF ^ 0x95;
        B.lIIlIIIIIIlIl[169] = 36 + 56 - 39 + 170 ^ 19 + 60 - -83 + 2;
        B.lIIlIIIIIIlIl[170] = 236 + 71 - 237 + 173 ^ 115 + 44 - 56 + 40;
        B.lIIlIIIIIIlIl[171] = 0x44 ^ 0x42 ^ (9 ^ 0x72);
        B.lIIlIIIIIIlIl[172] = 118 + 86 - 23 + 11 ^ 169 + 131 - 174 + 64;
        B.lIIlIIIIIIlIl[173] = (0x4D ^ 0x60) + (0xFE ^ 0xAC) - (0x19 ^ 0x79) + (0xEA ^ 0x8A);
        B.lIIlIIIIIIlIl[174] = (0x65 ^ 0x5F) + (0xE ^ 0x5F) - (0x86 ^ 0x99) + (0x4F ^ 0x5B);
        B.lIIlIIIIIIlIl[175] = (0x42 ^ 0x21) + (1 ^ 0x57) - (22 + 42 - 6 + 108) + (0xF5 ^ 0x9B);
        B.lIIlIIIIIIlIl[176] = (0xE3 ^ 0x8F) + (0x87 ^ 0xA6) - (0x48 ^ 0x13) + (0x2C ^ 0x7C);
        B.lIIlIIIIIIlIl[177] = 69 + 63 - 125 + 124;
        B.lIIlIIIIIIlIl[178] = (0x52 ^ 7) + (0x40 ^ 0x50) - (0xAC ^ 0x8E) + (0x31 ^ 0x70);
        B.lIIlIIIIIIlIl[179] = 132 + 92 - 113 + 22;
        B.lIIlIIIIIIlIl[180] = 114 + 48 - 44 + 16;
        B.lIIlIIIIIIlIl[181] = 48 + 28 - 64 + 123;
        B.lIIlIIIIIIlIl[182] = (0xC0 ^ 0xBE) + (0xCE ^ 0xA0) - (0xC6 ^ 0xB6) + (0x29 ^ 0x25);
        B.lIIlIIIIIIlIl[183] = 70 + 12 - -7 + 43 + (0x77 ^ 0x20) - (89 + 153 - 195 + 124) + (0x25 ^ 0x7C);
        B.lIIlIIIIIIlIl[184] = 11 + 113 - 37 + 51;
        B.lIIlIIIIIIlIl[185] = (0x5F ^ 0x62) + (0xC8 ^ 0xC5) - (0x86 ^ 0x97) + (0x78 ^ 0x2A);
        B.lIIlIIIIIIlIl[186] = 129 + 129 - 246 + 128;
        B.lIIlIIIIIIlIl[187] = -(0xFFFFD825 & 0x77DB) & (0xFFFFFFE4 & 0x567F);
        B.lIIlIIIIIIlIl[188] = -(0xFFFFCD4F & 0x7EBD) & (0xFFFFFEDF & 0x5FFE);
        B.lIIlIIIIIIlIl[189] = (0xD7 ^ 0x8E) + (0xB1 ^ 0xC7) - (0x36 ^ 0x59) + (0xA4 ^ 0x89);
        B.lIIlIIIIIIlIl[190] = -(0xFFFFFC7F & 0x17BB) & (0xFFFF9FFF & 0x7DFE);
        B.lIIlIIIIIIlIl[191] = -(0xFFFFB2A1 & 0x6F5F) & (0xFFFFF77E & 0x3FFD);
        B.lIIlIIIIIIlIl[192] = 0xFFFFF1D4 & 0x3EFF;
        B.lIIlIIIIIIlIl[193] = -(0xFFFFFCF3 & 0x3B9F) & (0xFFFFBFFE & Short.MAX_VALUE);
        B.lIIlIIIIIIlIl[194] = 0xFFFFFECF & 0x2FFC;
        B.lIIlIIIIIIlIl[195] = -(0xFFFFFEA7 & 0x1D59) & (0xFFFFFDBF & 0x7FE8);
        B.lIIlIIIIIIlIl[196] = -(0xFFFFDA93 & 0x65FD) & (0xFFFFDFD7 & Short.MAX_VALUE);
        B.lIIlIIIIIIlIl[197] = (0xD4 ^ 0xAC) + (0x78 ^ 0x51) - (0x49 ^ 5) + (0x83 ^ 0xBA);
        B.lIIlIIIIIIlIl[198] = -(0xFFFFE3BF & 0x5E4D) & (0xFFFFF3FF & 0x4FEF);
        B.lIIlIIIIIIlIl[199] = 138 + 92 - 211 + 124;
        B.lIIlIIIIIIlIl[200] = (0x1B ^ 0x4D) + " ".length() - (0x29 ^ 0xF) + (5 ^ 0x5A);
        B.lIIlIIIIIIlIl[201] = (0xF2 ^ 0xC7) + (0x18 ^ 0x78) - (113 + 99 - 129 + 52) + (24 + 105 - 108 + 110);
        B.lIIlIIIIIIlIl[202] = (0x4F ^ 0x5C) + (105 + 108 - 91 + 15) - (0xE5 ^ 0x8E) + (0xCC ^ 0xAD);
        B.lIIlIIIIIIlIl[203] = 114 + 55 - 125 + 103;
        B.lIIlIIIIIIlIl[204] = 101 + 61 - 46 + 32;
        B.lIIlIIIIIIlIl[205] = -(0xFFFFD73D & 0x7BDB) & (0xFFFFFFFF & 0x5FBD);
        B.lIIlIIIIIIlIl[206] = 0xFFFFDF5E & 0x2CEF;
        B.lIIlIIIIIIlIl[207] = 0xFFFFC6F7 & 0x3F5B;
        B.lIIlIIIIIIlIl[208] = -(0xFFFF87EF & 0x7936) & (0xFFFFDBF7 & 0x37FD);
        B.lIIlIIIIIIlIl[209] = 0xFFFFF7DF & 0x1AF7;
        B.lIIlIIIIIIlIl[210] = 0xFFFFF673 & 0xFEF;
        B.lIIlIIIIIIlIl[211] = 0xFFFF93FE & 0x7EE7;
        B.lIIlIIIIIIlIl[212] = 0xFFFFB7FB & 0x5ADF;
        B.lIIlIIIIIIlIl[213] = 0xFFFF8F7F & 0x76DF;
        B.lIIlIIIIIIlIl[214] = 0xFFFFBFFE & 0x52EB;
        B.lIIlIIIIIIlIl[215] = -(0xFFFFA375 & 0x7CAB) & (0xFFFFBFFC & 0x72FB);
        B.lIIlIIIIIIlIl[216] = -(0xFFFFE769 & 0x3D97) & (0xFFFFB7DB & 0x7FFD);
        B.lIIlIIIIIIlIl[217] = -(0xFFFFE3A9 & 0x7D7F) & (0xFFFFFF7F & 0x67FF);
        B.lIIlIIIIIIlIl[218] = 123 + 99 - 162 + 89;
    }

    private static void lIlIIlllIIIIllI() {
        lIIIllllllIII = new String[lIIlIIIIIIlIl[218]];
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[0]] = B.lIlIIllIlIIlIIl("TYxw/+4IzKlvknVHtjkf/w==", "KLMRp");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[1]] = B.lIlIIllIlIIlIlI("A2GvIJxjrpgYnS12W8AiC1tq44o1vp4krTzNL3BnKWSu6dE1ZRb3hnqUGScY+Hnn", "qvykd");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[3]] = B.lIlIIllIlIIlIlI("yFypWQyksNBrLbf5sB0tLw==", "wYvQP");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[4]] = B.lIlIIllIlIIlIIl("qerPlCTXt0MYHSLfBzvfwtCoITUOmGk3", "pNWNS");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[6]] = B.lIlIIllIlIIlIIl("6yqmD55n8l57AaAzuqo0yh2dW2v3c0ducdgxxKEsy4aUdVpOw7WxQs9LiL4r9JrqzeTT/kmHnTg=", "hpwPy");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[11]] = B.lIlIIllIlIIlIlI("BSPPjpDR0jBlULM1z9fSfw==", "ZVkkH");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[13]] = B.lIlIIllIlIIlIlI("I9l6YacpVgRML6T0xaKTzw==", "Hkfbx");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[14]] = B.lIlIIllIlIIlIlI("bCTBnYEQ7xs=", "WqNQE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[18]] = B.lIlIIllIlIIlIIl("XtPggu413YPYAzK3yBcf6g==", "fAjgy");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[21]] = B.lIlIIllIlIIlIlI("aajbUapVX2KWoqvFo7FMxA==", "VMDjq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[2]] = B.lIlIIllIlIIlIlI("JO0Wi8mXNHA=", "cQwsy");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[22]] = B.lIlIIllIlIIlIlI("KQfz3VKoTFg9zh5+lDNkCg==", "uwUku");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[23]] = B.lIlIIllIlIIlIlI("i6MlNzl6HyNj5QhC/SF1FA==", "DqzHE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[27]] = B.lIlIIllIlIIlIlI("OVMteepO9fkmsRFLxyZm7nCy9J4EPyWy", "QiQCR");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[29]] = B.lIlIIllIlIIlIIl("xFGsRV+gNnpQMgV9z8BDFA==", "sUSVf");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[24]] = B.lIlIIllIlIIlIlI("aWs3izVQoO12WSIiI7/l8mgIpUUHN+pu", "NAScv");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[31]] = B.lIlIIllIlIIlIIl("td89XYUl+r0tgCJvq6goztDrmushTb3n", "gZFZF");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[32]] = B.lIlIIllIlIIlIlI("AbZAZWx7vEA=", "TMLak");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[35]] = B.lIlIIllIlIIlIlI("gLL/7+XbM0k=", "LvRRl");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[36]] = B.lIlIIllIlIIlIIl("Dz8asrfYo+s=", "JeywJ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[28]] = B.lIlIIllIlIIlIIl("RsbaZT5YPdvqGFRCLIv7KA==", "Evegn");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[37]] = B.lIlIIllIlIIlIll("CScUBjxlIgkOKw==", "EFfaY");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[38]] = B.lIlIIllIlIIlIlI("6TgcsyxyKtxYwrqNcY/aog==", "ppPDk");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[39]] = B.lIlIIllIlIIlIlI("INZWc7vELC8=", "ZqpsX");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[40]] = B.lIlIIllIlIIlIll("Ag8OQjkjThwNIj4=", "LnxbM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[33]] = B.lIlIIllIlIIlIll("HhwpJg==", "QlLHx");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[43]] = B.lIlIIllIlIIlIlI("U/K1NO0hhfi+HD3/Nt09jQ==", "qnMGE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[45]] = B.lIlIIllIlIIlIll("JwYpBhgURywAAhY=", "sgBov");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[47]] = B.lIlIIllIlIIlIlI("BWrlI3tdltM=", "LiFho");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[48]] = B.lIlIIllIlIIlIIl("sp6gNzS7GaqHSzxB+/cpUw==", "UqOvO");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[19]] = B.lIlIIllIlIIlIIl("wSvROjaXCu4=", "YpefO");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[55]] = B.lIlIIllIlIIlIll("Jh8iCA==", "bpMzx");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[56]] = B.lIlIIllIlIIlIIl("mrq7lHKWeg2v0mNc2vRSZQ==", "BdNOM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[57]] = B.lIlIIllIlIIlIll("DTg0HQ==", "BHQsv");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[58]] = B.lIlIIllIlIIlIIl("NTkQ949psa4=", "ZYYcl");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[42]] = B.lIlIIllIlIIlIIl("2iqN+3OmG/U=", "Iekmi");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[59]] = B.lIlIIllIlIIlIll("ECERBBkrLR4RWjMlGRgOKioX", "CDpvz");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[60]] = B.lIlIIllIlIIlIIl("A9tSiS/PGDc=", "JLdVO");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[61]] = B.lIlIIllIlIIlIIl("36IgXDx8Drk=", "fXFoZ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[62]] = B.lIlIIllIlIIlIll("CSEAKxQ=", "BOiMq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[49]] = B.lIlIIllIlIIlIll("FyEUKxAs", "DDuYs");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[64]] = B.lIlIIllIlIIlIll("FQE4JgwuDTczTzYFMDobLwo+", "FdYTo");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[65]] = B.lIlIIllIlIIlIlI("owDh+o3cZgU=", "Lshax");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[66]] = B.lIlIIllIlIIlIlI("KTOfX4LhqqU=", "bfASb");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[67]] = B.lIlIIllIlIIlIll("ICk/Iik=", "kGVDL");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[63]] = B.lIlIIllIlIIlIlI("2sOLoQON0liWrjGHAlz/8w==", "Unzlt");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[70]] = B.lIlIIllIlIIlIIl("1K4u02UlqcU=", "HptbM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[72]] = B.lIlIIllIlIIlIlI("OYsGeyGdLNQqPfFZnr2PUQ==", "cLwIR");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[73]] = B.lIlIIllIlIIlIll("NCIjDR8RJSNFCBklIAkO", "xKDek");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[75]] = B.lIlIIllIlIIlIlI("p7ZLw6WAc9I=", "MebLi");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[71]] = B.lIlIIllIlIIlIIl("WCUmWLEKiJrSGKsU2q2fYQ==", "lhiVA");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[77]] = B.lIlIIllIlIIlIll("LSMIIiQMNE0oIg0h", "bSmLM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[78]] = B.lIlIIllIlIIlIll("KxQCDA==", "ddgbD");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[81]] = B.lIlIIllIlIIlIll("KxcgIygKAGUpLgsV", "dgEMA");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[82]] = B.lIlIIllIlIIlIIl("2F+5Z/VgKJ0=", "RKjtt");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[74]] = B.lIlIIllIlIIlIlI("k+oOQnM3L0oiGB7dZ7uKEg==", "NrWnC");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[84]] = B.lIlIIllIlIIlIIl("Ovr3/KZRdoX2HgUGyYa5xA==", "BtBEI");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[85]] = B.lIlIIllIlIIlIIl("hK2elbursS4=", "lfLAC");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[87]] = B.lIlIIllIlIIlIlI("LQG55IN8WbD733npNtGMIw==", "qgXZR");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[88]] = B.lIlIIllIlIIlIIl("BGNR3vJ2tV0=", "dXFar");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[76]] = B.lIlIIllIlIIlIIl("DMxsFAMun0A1om0HXP9+a4x9a2znH+MY", "AojiW");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[90]] = B.lIlIIllIlIIlIIl("gx2IUzYfK50=", "dDweQ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[92]] = B.lIlIIllIlIIlIll("LgghFg==", "ziJsd");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[96]] = B.lIlIIllIlIIlIll("Mx8IPww=", "cviQc");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[97]] = B.lIlIIllIlIIlIlI("CbNkOhVi8Nk=", "DzkfV");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[79]] = B.lIlIIllIlIIlIIl("g1ElomNmWhw=", "HNABp");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[99]] = B.lIlIIllIlIIlIlI("LYGSgWoSWMiZFXEpEZlakw==", "fOCFH");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[101]] = B.lIlIIllIlIIlIIl("xr0LSH0sCbA=", "JOqlc");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[102]] = B.lIlIIllIlIIlIlI("7J/4plVTyqI=", "wyDmR");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[104]] = B.lIlIIllIlIIlIIl("DwOQ1rt57suWnlMvTsSKtw==", "diKtK");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[17]] = B.lIlIIllIlIIlIll("KwAmJxYQ", "xeGUu");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[105]] = B.lIlIIllIlIIlIlI("mC7CFeh8ZI8=", "xTFeV");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[107]] = B.lIlIIllIlIIlIlI("aHS+ddKDzBzlR5r93wjPtw==", "bglhJ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[108]] = B.lIlIIllIlIIlIIl("22wvNprVI/jO8IaSo/jn4w==", "hzqFH");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[109]] = B.lIlIIllIlIIlIIl("aIh/Sf3g/2E=", "qxMHT");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[93]] = B.lIlIIllIlIIlIll("FSEgPxs0NmU1HTUj", "ZQEQr");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[110]] = B.lIlIIllIlIIlIll("Hxk0GQ==", "PiQwB");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[112]] = B.lIlIIllIlIIlIIl("G19rRes6Wm579L2bB614gg==", "TLqbZ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[113]] = B.lIlIIllIlIIlIll("DDQPOg==", "CDjTn");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[115]] = B.lIlIIllIlIIlIll("FgMBUQQ3QhMeHyo=", "Xbwqp");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[103]] = B.lIlIIllIlIIlIIl("WuN9buwaB0uuKffFX8msFw==", "NCaik");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[117]] = B.lIlIIllIlIIlIlI("Vx7TxE2C6Kg=", "Kfzis");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[119]] = B.lIlIIllIlIIlIIl("r0qh04Ry9ju3wJaiaP3jLwDffUORDe22", "KhtbE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[121]] = B.lIlIIllIlIIlIll("Pz8vMg==", "mZNVR");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[123]] = B.lIlIIllIlIIlIll("BBgvNQ==", "PyDPN");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[114]] = B.lIlIIllIlIIlIIl("bOU8Zjn7wx/vl4IioclGmg==", "aPKCc");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[125]] = B.lIlIIllIlIIlIIl("8P22hqtK1JM=", "vTxoD");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[126]] = B.lIlIIllIlIIlIlI("wq4Q+R7r6hDxaGNmkNvyAg==", "BqFvx");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[127]] = B.lIlIIllIlIIlIlI("dkv2hW4lSR8=", "vyZxX");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[132]] = B.lIlIIllIlIIlIIl("pf+hOBj9a4s=", "gZEZK");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[118]] = B.lIlIIllIlIIlIIl("R/ejDsAz2XY=", "rEZuY");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[133]] = B.lIlIIllIlIIlIlI("Gl4D0H9yXkw=", "ztmni");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[134]] = B.lIlIIllIlIIlIlI("Oae3ZvFSVAE=", "iPuHc");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[135]] = B.lIlIIllIlIIlIll("HAEGPA==", "SqcRB");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[136]] = B.lIlIIllIlIIlIll("Gz4gDw==", "TNEaM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[124]] = B.lIlIIllIlIIlIll("FjgXNz88MAY3", "PQeRO");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[137]] = B.lIlIIllIlIIlIll("BTEnGDI+", "VTFjQ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[138]] = B.lIlIIllIlIIlIlI("paCbUVZU/1KTlff8M0DVYg==", "OVzUl");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[139]] = B.lIlIIllIlIIlIlI("7zeLctZPh3YKaY6V1wD99w==", "oDGhS");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[142]] = B.lIlIIllIlIIlIIl("v4CBSFS6lPWlmWVIWbA4uktBf04wUwPK", "ezMAE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[140]] = B.lIlIIllIlIIlIlI("mGl9TbwNr2Tv9AifRVhHTA==", "lodme");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[144]] = B.lIlIIllIlIIlIIl("2rGAVllWQxs=", "NsLZi");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[145]] = B.lIlIIllIlIIlIlI("2i8vcIJalYZZlNhLIZ+1ww==", "YRKPQ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[146]] = B.lIlIIllIlIIlIlI("TD+aChMVeZ0=", "dzSLH");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[147]] = B.lIlIIllIlIIlIlI("t7pOTZv0ChY=", "DjuiM");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[148]] = B.lIlIIllIlIIlIlI("ojJANK9INXNI5WLwBdZO9Q==", "Gusil");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[150]] = B.lIlIIllIlIIlIlI("FnNHhzGis0Pt7YbEtVG/yA==", "xOxBY");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[151]] = B.lIlIIllIlIIlIIl("YURCtDZMbDQ=", "ZfITd");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[152]] = B.lIlIIllIlIIlIll("HDANCionPAIf", "OUlxI");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[153]] = B.lIlIIllIlIIlIlI("WhnoUIwZZrE=", "soCFy");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[156]] = B.lIlIIllIlIIlIlI("xbfh4Fq6X89k8E1YMm/L9A==", "hpeCU");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[157]] = B.lIlIIllIlIIlIll("IzsXAw==", "gTxqt");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[158]] = B.lIlIIllIlIIlIlI("E0FJjS8V8sI=", "wqdYh");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[159]] = B.lIlIIllIlIIlIIl("cMd1bpJJzOI=", "aWOkq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[160]] = B.lIlIIllIlIIlIlI("IMU8noGkPkDnTbao0cJl2Q==", "zaAkj");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[161]] = B.lIlIIllIlIIlIll("CCoHGjU3", "ECuhZ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[162]] = B.lIlIIllIlIIlIll("IBAbJA==", "pehLU");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[163]] = B.lIlIIllIlIIlIIl("qd8mLcpMZbc=", "QqRwx");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[164]] = B.lIlIIllIlIIlIIl("RYaQANexAwg=", "fvget");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[165]] = B.lIlIIllIlIIlIll("BR0xAA==", "UhBhp");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[166]] = B.lIlIIllIlIIlIIl("8YMyIS/pMlA=", "DMMsK");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[167]] = B.lIlIIllIlIIlIlI("s80DVWE3zeE=", "olpgq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[168]] = B.lIlIIllIlIIlIlI("gkNXuotjchY=", "pdiHN");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[169]] = B.lIlIIllIlIIlIll("AzYAOg==", "SCsRS");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[170]] = B.lIlIIllIlIIlIIl("dKCY08rdRmA=", "GuBZI");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[171]] = B.lIlIIllIlIIlIIl("bJ5bQH/BF6k=", "zsxUY");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[172]] = B.lIlIIllIlIIlIIl("VdvzyOqxjqRSeV+9rn5JDg==", "PAAJu");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[173]] = B.lIlIIllIlIIlIIl("tXGWbNH2HcsvFfPM29Pzqg==", "xHtBq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[174]] = B.lIlIIllIlIIlIll("DzslBS42dTpJICo7Lww=", "DRIiK");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[175]] = B.lIlIIllIlIIlIIl("/f+yMM7MRSN76ELavXtq8g==", "ZRftF");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[176]] = B.lIlIIllIlIIlIll("GyIINQ==", "OCcPk");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[177]] = B.lIlIIllIlIIlIll("HiICIi4nbB1uIDsiCCs=", "UKnNK");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[178]] = B.lIlIIllIlIIlIll("CgMCKgEzTR1mDy8DCCM=", "AjnFd");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[179]] = B.lIlIIllIlIIlIIl("/7hQP4PslUE=", "dyxiq");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[180]] = B.lIlIIllIlIIlIll("Ji47HQEfYCRRDwMuMRQ=", "mGWqd");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[181]] = B.lIlIIllIlIIlIIl("NwxRzbF/J/A=", "RngUm");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[182]] = B.lIlIIllIlIIlIlI("rjktFORcC3o=", "ZMrst");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[183]] = B.lIlIIllIlIIlIll("Fh06Eyw9AnMVKjwI", "SeSgE");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[184]] = B.lIlIIllIlIIlIlI("Hp3tLe5W0Vw=", "NxqQZ");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[185]] = B.lIlIIllIlIIlIll("KxcIIQ==", "dgmOD");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[186]] = B.lIlIIllIlIIlIIl("o8L87ViwpEMODmzjL56hp/XMg7PY98nd", "pGVQH");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[189]] = B.lIlIIllIlIIlIlI("I73Xth3tuk0=", "MAYja");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[197]] = B.lIlIIllIlIIlIll("CAUwEAAkACoKSAgVMBANNxVjFR0gHzc=", "ElCdh");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[199]] = B.lIlIIllIlIIlIll("IAYUA289CVoTKjMDDgxveg==", "RozdO");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[200]] = B.lIlIIllIlIIlIll("KkYnEAwXAzRRFgxGJQIHQx8/BBBDBz4HCw8Vfg==", "cfPqb");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[201]] = B.lIlIIllIlIIlIll("EQ0aXkIBSB4bDiRIDhcWaBEGB0I8AAxSDykcDAALKQQaXA==", "Hhirb");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[202]] = B.lIlIIllIlIIlIIl("oU3Jv7a/0NULw4DxTBhxXhUa/gsAfIpObmEMDcu2QhU=", "zPcYP");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[203]] = B.lIlIIllIlIIlIlI("heBH4dGFuxg=", "qkrZy");
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[204]] = B.lIlIIllIlIIlIlI("IiW3e4V3iuuNTphsuaZdEA==", "yCQjb");
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (B.lIlIIlllIIIllll(graphicsObjectCreated.getGraphicsObject().getId(), lIIlIIIIIIlIl[198])) {
            System.out.println("Found one " + String.valueOf(graphicsObjectCreated.getGraphicsObject().getLocation()));
        }
    }

    @Override
    public int Y() {
        try {
            B.ce();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() < ((0x2F ^ 0x6D ^ (0x4C ^ 0x30)) & ((0xD ^ 0x21) & ~(0x94 ^ 0xB8) ^ (0x65 ^ 0x5B) ^ -" ".length()))) {
            return (0x2B ^ 0x79 ^ (0xBB ^ 0xB2)) & (0x23 ^ 0x19 ^ (0x19 ^ 0x78) ^ -" ".length());
        }
        return lIIlIIIIIIlIl[140];
    }

    private static boolean lIlIIlllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlllIIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (B.lIlIIlllIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[181])) {
            bl = lIIlIIIIIIlIl[1];
            "".length();
            if (-" ".length() == " ".length()) {
                return (("  ".length() ^ (0xD9 ^ 0x91)) & (81 + 217 - 189 + 142 ^ 150 + 137 - 256 + 146 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlIIIIIIlIl[0];
        }
        return bl;
    }

    private static String lIlIIllIlIIlIlI(String llllllllllllllIllllllllIlIllIIll, String llllllllllllllIllllllllIlIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllllllIlIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIlIl[18]), "DES");
            Cipher llllllllllllllIllllllllIlIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllllllllIlIllIlIl.init(lIIlIIIIIIlIl[3], llllllllllllllIllllllllIlIllIllI);
            return new String(llllllllllllllIllllllllIlIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllllllIlIllIlII) {
            llllllllllllllIllllllllIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlllIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlllIIlIIII(Object object) {
        return object == null;
    }

    static {
        B.lIlIIlllIIIIlll();
        B.lIlIIlllIIIIllI();
        String[] stringArray = new String[lIIlIIIIIIlIl[11]];
        stringArray[B.lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[200]];
        stringArray[B.lIIlIIIIIIlIl[1]] = lIIIllllllIII[lIIlIIIIIIlIl[201]];
        stringArray[B.lIIlIIIIIIlIl[3]] = lIIIllllllIII[lIIlIIIIIIlIl[202]];
        stringArray[B.lIIlIIIIIIlIl[4]] = lIIIllllllIII[lIIlIIIIIIlIl[203]];
        stringArray[B.lIIlIIIIIIlIl[6]] = lIIIllllllIII[lIIlIIIIIIlIl[204]];
        gx = stringArray;
        gy = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gz = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gA = new WorldPoint(lIIlIIIIIIlIl[207], lIIlIIIIIIlIl[208], lIIlIIIIIIlIl[0]);
        gB = new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[209], lIIlIIIIIIlIl[0]);
        gC = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gD = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gE = new WorldPoint(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[52], lIIlIIIIIIlIl[0]);
        gF = new WorldPoint(lIIlIIIIIIlIl[130], lIIlIIIIIIlIl[212], lIIlIIIIIIlIl[0]);
        gG = new WorldPoint(lIIlIIIIIIlIl[213], lIIlIIIIIIlIl[214], lIIlIIIIIIlIl[0]);
        bA = new ArrayList<d>();
        gH = new WorldArea(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[215], lIIlIIIIIIlIl[31], lIIlIIIIIIlIl[37], lIIlIIIIIIlIl[0]);
        gI = new WorldArea(lIIlIIIIIIlIl[80], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[0]);
        gJ = new WorldArea(lIIlIIIIIIlIl[217], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[33], lIIlIIIIIIlIl[28], lIIlIIIIIIlIl[0]);
        gK = null;
    }

    private static boolean lIlIIlllIIIlIlI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIlIIIIIIlIl[1]];
        nArray[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIlIIIIIIlIl[1]];
            nArray2[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
            if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIlIIIIIIlIl[1]];
                nArray3[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
                if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIlIIIIIIlIl[1];
                    "".length();
                    if (-" ".length() < " ".length()) return n2 != 0;
                    return ((156 + 93 - 165 + 103 ^ 110 + 27 - 11 + 28) & (46 + 7 - -5 + 111 ^ 119 + 117 - 130 + 30 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lIIlIIIIIIlIl[0];
        return n2 != 0;
    }

    private static String lIlIIllIlIIlIll(String llllllllllllllIllllllllIlIlIIIll, String llllllllllllllIllllllllIlIIlllIl) {
        llllllllllllllIllllllllIlIlIIIll = new String(Base64.getDecoder().decode(llllllllllllllIllllllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllllIlIlIIIIl = new StringBuilder();
        char[] llllllllllllllIllllllllIlIlIIIII = llllllllllllllIllllllllIlIIlllIl.toCharArray();
        int llllllllllllllIllllllllIlIIlllll = lIIlIIIIIIlIl[0];
        char[] llllllllllllllIllllllllIlIIllIIl = llllllllllllllIllllllllIlIlIIIll.toCharArray();
        int llllllllllllllIllllllllIlIIllIII = llllllllllllllIllllllllIlIIllIIl.length;
        int llllllllllllllIllllllllIlIIlIlll = lIIlIIIIIIlIl[0];
        while (B.lIlIIlllIIIlIIl(llllllllllllllIllllllllIlIIlIlll, llllllllllllllIllllllllIlIIllIII)) {
            char llllllllllllllIllllllllIlIlIIlII = llllllllllllllIllllllllIlIIllIIl[llllllllllllllIllllllllIlIIlIlll];
            llllllllllllllIllllllllIlIlIIIIl.append((char)(llllllllllllllIllllllllIlIlIIlII ^ llllllllllllllIllllllllIlIlIIIII[llllllllllllllIllllllllIlIIlllll % llllllllllllllIllllllllIlIlIIIII.length]));
            "".length();
            ++llllllllllllllIllllllllIlIIlllll;
            ++llllllllllllllIllllllllIlIIlIlll;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllllllIlIlIIIIl);
    }

    private static boolean lIlIIlllIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static /* synthetic */ boolean cf() {
        return Bank.isOpen();
    }

    private static String lIlIIllIlIIlIIl(String llllllllllllllIllllllllIlIIIlllI, String llllllllllllllIllllllllIlIIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllllllllIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIlIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllllllIlIIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllllllIlIIlIIII.init(lIIlIIIIIIlIl[3], llllllllllllllIllllllllIlIIlIIIl);
            return new String(llllllllllllllIllllllllIlIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllllIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllllllIlIIIllll) {
            llllllllllllllIllllllllIlIIIllll.printStackTrace();
            return null;
        }
    }

    @Override
    public String Z() {
        return lIIIllllllIII[lIIlIIIIIIlIl[197]];
    }

    private static boolean lIlIIlllIIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Unable to fully structure code
     */
    public static void ce() {
        block180: {
            block181: {
                if (B.lIlIIlllIIIlIII((int)B.by)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[0]];
                    b.a(B.bA);
                    if (B.lIlIIlllIIIlIIl(B.bA.size(), B.lIIlIIIIIIlIl[1])) {
                        System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[1]]);
                        B.by = B.lIIlIIIIIIlIl[0];
                    }
                }
                if (!B.lIlIIlllIIIlIlI((int)B.by)) break block180;
                if (B.lIlIIlllIIIlIlI((int)B.S()) && B.lIlIIlllIIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    llllllllllllllIllllllllIllIIlllI = BankLocation.getNearest();
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI) && B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIlllI.getArea().contains(Players.getLocal().getWorldLocation()))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[3]];
                        Movement.walkTo((BankLocation)llllllllllllllIllllllllIllIIlllI);
                        "".length();
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI) && B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.getArea().contains(Players.getLocal().getWorldLocation()))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[4]];
                        if (B.lIlIIlllIIIlIlI((int)Bank.isOpen())) {
                            a.a();
                            Time.sleepUntil((BooleanSupplier)(BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, cf(), ()Z)(), (int)B.lIIlIIIIIIlIl[5]);
                            "".length();
                        }
                        if (B.lIlIIlllIIIlIII((int)Bank.isOpen())) {
                            if (B.lIlIIlllIIIllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[6]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            v0 = new int[B.lIIlIIIIIIlIl[6]];
                            v0[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                            v0[B.lIIlIIIIIIlIl[1]] = B.lIIlIIIIIIlIl[8];
                            v0[B.lIIlIIIIIIlIl[3]] = B.lIIlIIIIIIlIl[9];
                            v0[B.lIIlIIIIIIlIl[4]] = B.lIIlIIIIIIlIl[10];
                            if (B.lIlIIlllIIIlIlI((int)e.b(v0))) {
                                B.W();
                                System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[6]]);
                                B.by = B.lIIlIIIIIIlIl[1];
                                return;
                            }
                            v1 = new int[B.lIIlIIIIIIlIl[11]];
                            v1[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                            v1[B.lIIlIIIIIIlIl[1]] = B.lIIlIIIIIIlIl[8];
                            v1[B.lIIlIIIIIIlIl[3]] = B.lIIlIIIIIIlIl[9];
                            v1[B.lIIlIIIIIIlIl[4]] = B.lIIlIIIIIIlIl[10];
                            v1[B.lIIlIIIIIIlIl[6]] = B.lIIlIIIIIIlIl[12];
                            a.a(v1, B.lIIlIIIIIIlIl[1]);
                        }
                    }
                }
                if (B.lIlIIlllIIIlIII((int)B.S()) && B.lIlIIlllIIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[11])) {
                        if (B.lIlIIlllIIIlIIl(B.bY, B.lIIlIIIIIIlIl[1])) {
                            e.w();
                            B.bY += B.lIIlIIIIIIlIl[1];
                        }
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[11]];
                        Movement.walkTo((WorldPoint)B.gy);
                        "".length();
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[11])) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[13]];
                        g.a(B.lIIIllllllIII[B.lIIlIIIIIIlIl[14]], B.gx);
                    }
                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gz), B.lIIlIIIIIIlIl[11]) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[15], B.lIIlIIIIIIlIl[16], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[17])) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[18]];
                        Movement.walkTo((WorldPoint)B.gz);
                        "".length();
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gz), B.lIIlIIIIIIlIl[11]) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[19])) {
                        v2 = new int[B.lIIlIIIIIIlIl[1]];
                        v2[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[20];
                        llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v2);
                        if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[21]];
                            llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[2]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                            "".length();
                        }
                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[15], B.lIIlIIIIIIlIl[16], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[17])) {
                        if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gA), B.lIIlIIIIIIlIl[11])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[22]];
                            Movement.walkTo((WorldPoint)B.gA);
                            "".length();
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                        if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gA), B.lIIlIIIIIIlIl[11])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[23]];
                            g.a(B.gx);
                        }
                    }
                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[24]) && B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(B.lIIlIIIIIIlIl[25], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0])))) {
                    g.a(B.gx);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[27]];
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[25], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0]));
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[28])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[29]];
                    v3 = new int[B.lIIlIIIIIIlIl[1]];
                    v3[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v3))) {
                        v4 = new int[B.lIIlIIIIIIlIl[1]];
                        v4[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                        v5 = new String[B.lIIlIIIIIIlIl[1]];
                        v5[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[24]];
                        Inventory.getFirst((int[])v4).useOn(TileObjects.getNearest((String[])v5));
                        "".length();
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                    } else {
                        v6 = new int[B.lIIlIIIIIIlIl[1]];
                        v6[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[30];
                        if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v6))) {
                            v7 = new String[B.lIIlIIIIIIlIl[1]];
                            v7[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[31]];
                            TileObjects.getNearest((String[])v7).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[32]]);
                        }
                    }
                }
                if (!B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[33])) break block181;
                v8 = new int[B.lIIlIIIIIIlIl[1]];
                v8[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[30];
                if (!B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v8))) ** GOTO lbl-1000
                v9 = new int[B.lIIlIIIIIIlIl[1]];
                v9[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[34];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v9))) {
                    v10 = new String[B.lIIlIIIIIIlIl[1]];
                    v10[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[35]];
                    TileObjects.getNearest((String[])v10).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[36]]);
                    "".length();
                    if (((136 ^ 134) & ~(58 ^ 52)) != 0) {
                        return;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v11 = new int[B.lIIlIIIIIIlIl[1]];
                    v11[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[34];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v11))) {
                        if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gB), B.lIIlIIIIIIlIl[6])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[28]];
                            Movement.walkTo((WorldPoint)B.gB);
                            "".length();
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                        if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gB), B.lIIlIIIIIIlIl[6])) {
                            v12 = new String[B.lIIlIIIIIIlIl[1]];
                            v12[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[37]];
                            llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v12);
                            if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[38]];
                                llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[39]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[19])) {
                g.a(B.gx);
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gC), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[40]];
                    Movement.walkTo((WorldPoint)B.gC);
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gC), B.lIIlIIIIIIlIl[4])) {
                    v13 = new int[B.lIIlIIIIIIlIl[1]];
                    v13[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[41];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v13);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[33]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[42])) {
                B.co = B.lIIlIIIIIIlIl[0];
                g.a(B.gx);
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gD), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[43]];
                    Movement.walkTo((WorldPoint)B.gD);
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gD), B.lIIlIIIIIIlIl[4])) {
                    v14 = new int[B.lIIlIIIIIIlIl[1]];
                    v14[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                    if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v14))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[45]];
                        v15 = new int[B.lIIlIIIIIIlIl[1]];
                        v15[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[46];
                        llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v15);
                        if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                            llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[47]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                    }
                    v16 = new int[B.lIIlIIIIIIlIl[1]];
                    v16[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v16))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[48]];
                        v17 = new int[B.lIIlIIIIIIlIl[1]];
                        v17[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                        Inventory.getFirst((int[])v17).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[19]]);
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[49])) {
                v18 = new int[B.lIIlIIIIIIlIl[1]];
                v18[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v18);
                llllllllllllllIllllllllIllIIllIl = new WorldPoint(B.lIIlIIIIIIlIl[51], B.lIIlIIIIIIlIl[52], B.lIIlIIIIIIlIl[0]);
                if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIllIl))) {
                    v19 = new String[B.lIIlIIIIIIlIl[1]];
                    v19[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[55]];
                    llllllllllllllIllllllllIllIIllII = TileObjects.getAt((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[53], B.lIIlIIIIIIlIl[54], B.lIIlIIIIIIlIl[0]), (String[])v19);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[56]];
                    if (B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIllII.isEmpty())) {
                        v20 = new String[B.lIIlIIIIIIlIl[1]];
                        v20[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[57]];
                        if (B.lIlIIlllIIIlIII((int)((TileObject)llllllllllllllIllllllllIllIIllII.get(B.lIIlIIIIIIlIl[0])).hasAction(v20))) {
                            ((TileObject)llllllllllllllIllllllllIllIIllII.get(B.lIIlIIIIIIlIl[0])).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[58]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                            "".length();
                        }
                    }
                    v21 = new String[B.lIIlIIIIIIlIl[1]];
                    v21[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[42]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v21))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[59]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[60]]);
                    }
                    v22 = new String[B.lIIlIIIIIIlIl[1]];
                    v22[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[61]];
                    if (B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIlllI.hasAction(v22))) {
                        v23 = new String[B.lIIlIIIIIIlIl[1]];
                        v23[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[62]];
                        v24 = new int[B.lIIlIIIIIIlIl[1]];
                        v24[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                        Inventory.getFirst((String[])v23).useOn(TileObjects.getNearest((int[])v24));
                    }
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[63])) {
                v25 = new int[B.lIIlIIIIIIlIl[1]];
                v25[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v25);
                v26 = new String[B.lIIlIIIIIIlIl[1]];
                v26[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[49]];
                if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v26))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[64]];
                    llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[65]]);
                }
                v27 = new String[B.lIIlIIIIIIlIl[1]];
                v27[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[66]];
                if (B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIlllI.hasAction(v27))) {
                    v28 = new String[B.lIIlIIIIIIlIl[1]];
                    v28[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[67]];
                    v29 = new int[B.lIIlIIIIIIlIl[1]];
                    v29[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                    Inventory.getFirst((String[])v28).useOn(TileObjects.getNearest((int[])v29));
                }
                v30 = new int[B.lIIlIIIIIIlIl[1]];
                v30[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[68];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v30))) {
                    v31 = new int[B.lIIlIIIIIIlIl[1]];
                    v31[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    llllllllllllllIllllllllIllIIllIl = TileObjects.getNearest((int[])v31);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIllIl)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[63]];
                        llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[70]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[71])) {
                v32 = new String[B.lIIlIIIIIIlIl[1]];
                v32[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[72]];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v32);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[73]];
                    v33 = new int[B.lIIlIIIIIIlIl[1]];
                    v33[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[9];
                    Inventory.getFirst((int[])v33).useOn((TileObject)llllllllllllllIllllllllIllIIlllI);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[74])) {
                v34 = new String[B.lIIlIIIIIIlIl[1]];
                v34[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[75]];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v34);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[71]];
                    v35 = new int[B.lIIlIIIIIIlIl[1]];
                    v35[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[9];
                    Inventory.getFirst((int[])v35).useOn((TileObject)llllllllllllllIllllllllIllIIlllI);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[76])) {
                v36 = new int[B.lIIlIIIIIIlIl[1]];
                v36[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v36);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[77]];
                    llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[78]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[79])) {
                v37 = new int[B.lIIlIIIIIIlIl[1]];
                v37[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v37);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI) && B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(B.lIIlIIIIIIlIl[80], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0])))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[81]];
                    llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[82]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                    "".length();
                }
                v38 = new String[B.lIIlIIIIIIlIl[1]];
                v38[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[74]];
                llllllllllllllIllllllllIllIIllIl = TileObjects.getNearest((String[])v38);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIllIl) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[83])) {
                    if (B.lIlIIlllIIIlIlI((int)Reachable.isInteractable((Locatable)llllllllllllllIllllllllIllIIllIl))) {
                        Movement.walkTo((Locatable)llllllllllllllIllllllllIllIIllIl);
                        "".length();
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[84]];
                    llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[85]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                    "".length();
                }
                v39 = new int[B.lIIlIIIIIIlIl[1]];
                v39[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[86];
                llllllllllllllIllllllllIllIIllII = TileObjects.getNearest((int[])v39);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIllII) && B.lIlIIlllIIIlIlI((int)B.gH.contains(Players.getLocal().getWorldLocation())) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[87]];
                    llllllllllllllIllllllllIllIIllII.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[88]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[13]);
                    "".length();
                }
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[17])) {
                g.a(B.gx);
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[76]];
                v40 = new int[B.lIIlIIIIIIlIl[1]];
                v40[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v40))) {
                    v41 = new int[B.lIIlIIIIIIlIl[1]];
                    v41[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                    Inventory.getFirst((int[])v41).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[90]]);
                }
                v42 = new int[B.lIIlIIIIIIlIl[1]];
                v42[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v42))) {
                    v43 = new int[B.lIIlIIIIIIlIl[1]];
                    v43[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[91];
                    TileObjects.getNearest((int[])v43).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[92]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[93])) {
                llllllllllllllIllllllllIllIIlllI = Vars.getBit((int)B.lIIlIIIIIIlIl[94]);
                llllllllllllllIllllllllIllIIllIl = Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[11]);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIllIl)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[96]];
                    if (B.lIlIIlllIIIlIlI(llllllllllllllIllllllllIllIIlllI)) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        "".length();
                        if (-(176 ^ 136 ^ (162 ^ 159)) >= 0) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIlllI, B.lIIlIIIIIIlIl[1])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[38]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                    if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIlllI, B.lIIlIIIIIIlIl[3])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[33]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                    if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIlllI, B.lIIlIIIIIIlIl[4])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                }
                if (B.lIlIIlllIIlIIII(llllllllllllllIllllllllIllIIllIl)) {
                    v44 = new String[B.lIIlIIIIIIlIl[1]];
                    v44[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[97]];
                    TileObjects.getNearest((String[])v44).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[79]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                    "".length();
                }
                v45 = new int[B.lIIlIIIIIIlIl[1]];
                v45[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[98];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v45))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[99]];
                    v46 = new int[B.lIIlIIIIIIlIl[1]];
                    v46[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[100];
                    llllllllllllllIllllllllIllIIllII = TileObjects.getNearest((int[])v46);
                    v47 = new String[B.lIIlIIIIIIlIl[1]];
                    v47[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[101]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllII.hasAction(v47))) {
                        llllllllllllllIllllllllIllIIllII.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[102]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[103])) {
                v48 = new int[B.lIIlIIIIIIlIl[1]];
                v48[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[98];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v48))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[104]];
                    v49 = new int[B.lIIlIIIIIIlIl[1]];
                    v49[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[100];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v49);
                    v50 = new String[B.lIIlIIIIIIlIl[1]];
                    v50[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[17]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v50))) {
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[105]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
                if (!B.lIlIIlllIIIlIII((int)B.gI.contains(Players.getLocal().getWorldLocation())) || B.lIlIIlllIIlIIIl(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[106])) {
                    v51 = new String[B.lIIlIIIIIIlIl[1]];
                    v51[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[107]];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v51);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[108]];
                    llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[109]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                    "".length();
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[83])) {
                    v52 = new int[B.lIIlIIIIIIlIl[1]];
                    v52[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v52);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[93]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[110]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (B.lIlIIlllIIIlIII((int)B.gJ.contains(Players.getLocal().getWorldLocation()))) {
                    v53 = new int[B.lIIlIIIIIIlIl[1]];
                    v53[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[111];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v53);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[112]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[113]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[114])) {
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gG), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[115]];
                    Movement.walkTo((WorldPoint)B.gG);
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gG), B.lIIlIIIIIIlIl[4])) {
                    v54 = new int[B.lIIlIIIIIIlIl[1]];
                    v54[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[116];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v54);
                    g.a(B.gx);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[103]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[117]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[118])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[119]];
                g.a(B.gx);
                v55 = new int[B.lIIlIIIIIIlIl[1]];
                v55[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v55))) {
                    v56 = new int[B.lIIlIIIIIIlIl[1]];
                    v56[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                    Inventory.getFirst((int[])v56).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[121]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
                v57 = new int[B.lIIlIIIIIIlIl[1]];
                v57[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v57))) {
                    v58 = new int[B.lIIlIIIIIIlIl[1]];
                    v58[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[122];
                    TileObjects.getNearest((int[])v58).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[123]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[124])) {
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[51])) {
                    v59 = new int[B.lIIlIIIIIIlIl[1]];
                    v59[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[111];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v59);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[114]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[125]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[51]) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[80])) {
                    v60 = new int[B.lIIlIIIIIIlIl[1]];
                    v60[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((int[])v60);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[126]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[127]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[128], B.lIIlIIIIIIlIl[129], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[1]) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[130], B.lIIlIIIIIIlIl[131], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[4])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[128], B.lIIlIIIIIIlIl[129], B.lIIlIIIIIIlIl[0]));
                    "".length();
                    v61 = new String[B.lIIlIIIIIIlIl[1]];
                    v61[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[132]];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v61);
                    v62 = new String[B.lIIlIIIIIIlIl[1]];
                    v62[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[118]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v62))) {
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[133]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[130], B.lIIlIIIIIIlIl[131], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    g.a(B.gx);
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getY(), B.lIIlIIIIIIlIl[129])) {
                        v63 = new String[B.lIIlIIIIIIlIl[1]];
                        v63[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[134]];
                        llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v63);
                        v64 = new String[B.lIIlIIIIIIlIl[1]];
                        v64[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[135]];
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v64))) {
                            llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[136]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                    }
                    v65 = new String[B.lIIlIIIIIIlIl[1]];
                    v65[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[124]];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v65);
                    v66 = new String[B.lIIlIIIIIIlIl[1]];
                    v66[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[137]];
                    if (B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIlllI.hasAction(v66))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[138]];
                        v67 = new int[B.lIIlIIIIIIlIl[1]];
                        v67[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[8];
                        v68 = new String[B.lIIlIIIIIIlIl[1]];
                        v68[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[139]];
                        Inventory.getFirst((int[])v67).useOn(TileObjects.getNearest((String[])v68));
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[140])) {
                g.a(B.gx);
                llllllllllllllIllllllllIllIIlllI = Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[3]);
                if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIlllI)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[142]];
                    llllllllllllllIllllllllIllIIllIl = Vars.getBit((int)B.lIIlIIIIIIlIl[143]);
                    if (B.lIlIIlllIIIlIlI(llllllllllllllIllllllllIllIIllIl)) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[36]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        if (-" ".length() >= (151 ^ 147)) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIllIl, B.lIIlIIIIIIlIl[1])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[4]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIllIl, B.lIIlIIIIIIlIl[3])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[22]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIllIl, B.lIIlIIIIIIlIl[4])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[39]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        if (((56 + 49 - -56 + 82 ^ 106 + 27 - 96 + 123) & (16 + 48 - -44 + 140 ^ 115 + 110 - 114 + 60 ^ -" ".length())) != 0) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIllIl, B.lIIlIIIIIIlIl[6])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[14]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(llllllllllllllIllllllllIllIIllIl, B.lIIlIIIIIIlIl[11])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[24]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                }
                if (B.lIlIIlllIIlIIII(llllllllllllllIllllllllIllIIlllI) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    v69 = new String[B.lIIlIIIIIIlIl[1]];
                    v69[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[140]];
                    llllllllllllllIllllllllIllIIllIl = TileObjects.getNearest((String[])v69);
                    v70 = new String[B.lIIlIIIIIIlIl[1]];
                    v70[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[144]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.hasAction(v70))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[145]];
                        llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[146]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                    v71 = new String[B.lIIlIIIIIIlIl[1]];
                    v71[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[147]];
                    if (B.lIlIIlllIIIlIlI((int)llllllllllllllIllllllllIllIIllIl.hasAction(v71))) {
                        v72 = new int[B.lIIlIIIIIIlIl[1]];
                        v72[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[8];
                        v73 = new String[B.lIIlIIIIIIlIl[1]];
                        v73[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[148]];
                        Inventory.getFirst((int[])v72).useOn(TileObjects.getNearest((String[])v73));
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[148])) {
                v74 = new int[B.lIIlIIIIIIlIl[1]];
                v74[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[149];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v74))) {
                    v75 = new String[B.lIIlIIIIIIlIl[1]];
                    v75[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[150]];
                    llllllllllllllIllllllllIllIIlllI = TileObjects.getNearest((String[])v75);
                    v76 = new String[B.lIIlIIIIIIlIl[1]];
                    v76[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[151]];
                    if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIlllI.hasAction(v76))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[152]];
                        llllllllllllllIllllllllIllIIlllI.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[153]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
                v77 = new int[B.lIIlIIIIIIlIl[1]];
                v77[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[149];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v77)) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[154], B.lIIlIIIIIIlIl[155], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[156]];
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[154], B.lIIlIIIIIIlIl[155], B.lIIlIIIIIIlIl[0]));
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
            }
            if (!B.lIlIIlllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[157]) || B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[156])) {
                g.a(B.gx);
                if (B.lIlIIlllIIIlIlI((int)Static.getClient().isInInstancedRegion())) {
                    v78 = new String[B.lIIlIIIIIIlIl[1]];
                    v78[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[157]];
                    TileObjects.getNearest((String[])v78).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[158]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[13]);
                    "".length();
                }
                if (B.lIlIIlllIIIlIII((int)Static.getClient().isInInstancedRegion()) && B.lIlIIlllIIlIIII(B.gK)) {
                    v79 = new String[B.lIIlIIIIIIlIl[1]];
                    v79[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[159]];
                    if (B.lIlIIlllIIIlIll(NPCs.getNearest((String[])v79)) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen()) && B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[157])) {
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);
                        "".length();
                        System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[160]]);
                        B.gK = Players.getLocal().getWorldLocation();
                    }
                }
                if (B.lIlIIlllIIIlIll(B.gK)) {
                    llllllllllllllIllllllllIllIIlllI = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                    v80 = new String[B.lIIlIIIIIIlIl[1]];
                    v80[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[161]];
                    llllllllllllllIllllllllIllIIllIl = NPCs.getNearest((String[])v80);
                    if (B.lIlIIlllIIIlIll(llllllllllllllIllllllllIllIIllIl)) {
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlllI))) {
                            llllllllllllllIllllllllIllIIllII = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[4], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIllII))) {
                                e.b((WorldPoint)llllllllllllllIllllllllIllIIllII);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIllII))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[162]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        llllllllllllllIllllllllIllIIllII = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIlIll = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY(), B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIlIlI = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIlIIl = new WorldPoint(B.gK.getX(), B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIlIII = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIIlll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY(), B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIIllI = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIIlIl = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                        llllllllllllllIllllllllIllIIIlII = new WorldPoint(B.gK.getX(), B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIllII))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[4], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlllI))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlllI))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[163]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlIll))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[164]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlIlI))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[3], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[165]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlIIl))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);
                            "".length();
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[166]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIlIII))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[167]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIlll))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);
                            "".length();
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[168]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIllI))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIlll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIlll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[169]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIlIl))) {
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[3], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[170]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)llllllllllllllIllllllllIllIIllIl.getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIlII))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);
                            "".length();
                            llllllllllllllIllllllllIllIIIIll = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                e.b(llllllllllllllIllllllllIllIIIIll);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllllllllIllIIIIll))) {
                                llllllllllllllIllllllllIllIIllIl.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[171]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[161])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[172]];
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[166])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[173]];
                v81 = new String[B.lIIlIIIIIIlIl[1]];
                v81[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[174]];
                if (B.lIlIIlllIIIlIll(TileItems.getNearest((String[])v81))) {
                    v82 = new String[B.lIIlIIIIIIlIl[1]];
                    v82[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[175]];
                    TileItems.getNearest((String[])v82).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[176]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
                v83 = new String[B.lIIlIIIIIIlIl[1]];
                v83[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[177]];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((String[])v83))) {
                    v84 = new String[B.lIIlIIIIIIlIl[1]];
                    v84[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[178]];
                    Inventory.getFirst((String[])v84).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[179]]);
                }
                v85 = new String[B.lIIlIIIIIIlIl[1]];
                v85[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[180]];
                if (B.lIlIIlllIIIlIII((int)Equipment.contains((String[])v85))) {
                    v86 = new String[B.lIIlIIIIIIlIl[1]];
                    v86[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[181]];
                    NPCs.getNearest((String[])v86).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[182]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);
                    "".length();
                }
                if (B.lIlIIlllIIIlIII((int)Dialog.isOpen())) {
                    Dialog.chooseOption((String[])B.gx);
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);
                    "".length();
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[171])) {
                if (B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[183]];
                    v87 = new String[B.lIIlIIIIIIlIl[1]];
                    v87[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[184]];
                    TileObjects.getNearest((String[])v87).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[185]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);
                    "".length();
                }
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[176])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[186]];
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0]));
                    "".length();
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    if (B.lIlIIlllIIIlIIl(B.co, B.lIIlIIIIIIlIl[1])) {
                        P.lu += B.lIIlIIIIIIlIl[1];
                        P.d(AccBuilderRat.m);
                        B.co += B.lIIlIIIIIIlIl[1];
                        P.lu = B.lIIlIIIIIIlIl[0];
                        B.cp = B.lIIlIIIIIIlIl[0];
                    }
                    g.a(B.lIIIllllllIII[B.lIIlIIIIIIlIl[189]], B.gx, B.lIIlIIIIIIlIl[1]);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[181])) {
                // empty if block
            }
            g.a(new String[B.lIIlIIIIIIlIl[0]]);
        }
        System.out.println("Setting: " + Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()));
    }

    private static boolean lIlIIlllIIIlIII(int n2) {
        return n2 != 0;
    }
}

