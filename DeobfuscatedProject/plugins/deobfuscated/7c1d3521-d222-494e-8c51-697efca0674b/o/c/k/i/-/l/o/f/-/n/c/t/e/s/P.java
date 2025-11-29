/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.X;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class P
implements ac {
    public static /* synthetic */ int lw;
    private static final /* synthetic */ WorldPoint kY;
    public static final /* synthetic */ WorldArea kE;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint kx;
    private static /* synthetic */ int[] lz;
    private static final /* synthetic */ int kL;
    private static final /* synthetic */ WorldArea lk;
    private static final /* synthetic */ int lm;
    private static final /* synthetic */ int lr;
    public static final /* synthetic */ WorldArea kB;
    private static final /* synthetic */ WorldArea lj;
    private static final /* synthetic */ int kQ;
    private static final /* synthetic */ int lp;
    private static final /* synthetic */ int kN;
    static /* synthetic */ int di;
    private static final /* synthetic */ int lt;
    public static final /* synthetic */ WorldArea kz;
    private static final /* synthetic */ int kI;
    private static final /* synthetic */ WorldPoint lh;
    public static final /* synthetic */ WorldArea kF;
    private static final /* synthetic */ int lv;
    public static final /* synthetic */ WorldPoint kv;
    private static final /* synthetic */ int kO;
    private static final /* synthetic */ WorldPoint kZ;
    private static /* synthetic */ String[] llIllIlIlI;
    static /* synthetic */ String ly;
    public static final /* synthetic */ WorldArea ky;
    public static final /* synthetic */ WorldArea kC;
    private static final /* synthetic */ int kP;
    public static /* synthetic */ int lx;
    private static final /* synthetic */ WorldPoint kW;
    static /* synthetic */ boolean dj;
    private static final /* synthetic */ int kJ;
    private static final /* synthetic */ int lu;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int kS;
    private static final /* synthetic */ WorldPoint ld;
    private static final /* synthetic */ WorldPoint le;
    private static final /* synthetic */ WorldPoint kV;
    private static final /* synthetic */ WorldPoint li;
    private static final /* synthetic */ WorldPoint kX;
    public static final /* synthetic */ WorldPoint kw;
    private static final /* synthetic */ WorldPoint kU;
    public static final /* synthetic */ WorldArea kD;
    private static final /* synthetic */ int kK;
    private static final /* synthetic */ int lq;
    private static final /* synthetic */ int kM;
    private static /* synthetic */ int[] llIllIlllI;
    private static final /* synthetic */ int kH;
    private static final /* synthetic */ WorldPoint kT;
    public static final /* synthetic */ WorldArea kA;
    private static final /* synthetic */ WorldPoint lb;
    static /* synthetic */ String[] fG;
    private static final /* synthetic */ int ln;
    private static final /* synthetic */ int lo;
    private static final /* synthetic */ WorldArea ll;
    private static final /* synthetic */ int ls;
    private static final /* synthetic */ WorldPoint lg;
    private static final /* synthetic */ int kR;
    private static final /* synthetic */ int kG;
    private static final /* synthetic */ WorldPoint lc;
    private static final /* synthetic */ WorldPoint lf;
    private static final /* synthetic */ WorldPoint la;

    private static void Q() {
        d llllllllllllllllllIIIIlllIIlllll;
        block21: {
            block20: {
                Object llllllllllllllllllIIIIlllIlIIIII;
                block19: {
                    block18: {
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[8];
                        if (P.lIlllIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIllIlllI[8], llIllIlllI[109], llIllIlllI[110]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIllIlllI[3]];
                        nArray2[P.llIllIlllI[4]] = llIllIlllI[8];
                        if (P.lIlllIIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIllIlllI[3]];
                            nArray3[P.llIllIlllI[4]] = llIllIlllI[8];
                            if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), llIllIlllI[33])) {
                                llllllllllllllllllIIIIlllIlIIIII = new d(llIllIlllI[8], llIllIlllI[54], llIllIlllI[110]);
                                bv.add((d)llllllllllllllllllIIIIlllIlIIIII);
                                0;
                            }
                        }
                        int[] nArray4 = new int[llIllIlllI[3]];
                        nArray4[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[llIllIlllI[3]];
                        nArray5[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[llIllIlllI[3]];
                        nArray6[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (!P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray6).getQuantity(), llIllIlllI[13])) break block19;
                    }
                    llllllllllllllllllIIIIlllIlIIIII = new d(llIllIlllI[9], llIllIlllI[13], llIllIlllI[111]);
                    bv.add((d)llllllllllllllllllIIIIlllIlIIIII);
                    0;
                }
                if (P.lIlllIIIIlIII(Bank.contains((Predicate)(llllllllllllllllllIIIIlllIlIIIII = item -> item.getName().toLowerCase().contains(llIllIlIlI[llIllIlllI[117]]))) ? 1 : 0)) {
                    llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[112], llIllIlllI[31], llIllIlllI[113]);
                    bv.add(llllllllllllllllllIIIIlllIIlllll);
                    0;
                }
                int[] nArray = new int[llIllIlllI[3]];
                nArray[P.llIllIlllI[4]] = llIllIlllI[105];
                if (P.lIlllIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[105], llIllIlllI[54], llIllIlllI[114]);
                    bv.add(llllllllllllllllllIIIIlllIIlllll);
                    0;
                }
                int[] nArray7 = new int[llIllIlllI[3]];
                nArray7[P.llIllIlllI[4]] = llIllIlllI[10];
                if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[llIllIlllI[3]];
                nArray8[P.llIllIlllI[4]] = llIllIlllI[10];
                if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[llIllIlllI[3]];
                nArray9[P.llIllIlllI[4]] = llIllIlllI[10];
                if (!P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray9).getQuantity(), llIllIlllI[22])) break block21;
            }
            llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[10], llIllIlllI[33], llIllIlllI[114]);
            bv.add(llllllllllllllllllIIIIlllIIlllll);
            0;
        }
        int[] nArray = new int[llIllIlllI[3]];
        nArray[P.llIllIlllI[4]] = llIllIlllI[108];
        if (P.lIlllIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[108], llIllIlllI[13], j.cf);
            bv.add(llllllllllllllllllIIIIlllIIlllll);
            0;
        }
        int[] nArray10 = new int[llIllIlllI[3]];
        nArray10[P.llIllIlllI[4]] = llIllIlllI[7];
        if (P.lIlllIIIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[llIllIlllI[3]];
            nArray11[P.llIllIlllI[4]] = llIllIlllI[7];
            if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), llIllIlllI[101])) {
                llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[7], llIllIlllI[115], llIllIlllI[18]);
                bv.add(llllllllllllllllllIIIIlllIIlllll);
                0;
            }
        }
        int[] nArray12 = new int[llIllIlllI[3]];
        nArray12[P.llIllIlllI[4]] = llIllIlllI[5];
        if (P.lIlllIIIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIllIlllI[3]];
            nArray13[P.llIllIlllI[4]] = llIllIlllI[5];
            if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray13).getQuantity(), llIllIlllI[101])) {
                llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[5], llIllIlllI[115], llIllIlllI[18]);
                bv.add(llllllllllllllllllIIIIlllIIlllll);
                0;
            }
        }
        int[] nArray14 = new int[llIllIlllI[3]];
        nArray14[P.llIllIlllI[4]] = llIllIlllI[6];
        if (P.lIlllIIIIIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[llIllIlllI[3]];
            nArray15[P.llIllIlllI[4]] = llIllIlllI[6];
            if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray15).getQuantity(), llIllIlllI[101])) {
                llllllllllllllllllIIIIlllIIlllll = new d(llIllIlllI[6], llIllIlllI[115], llIllIlllI[18]);
                bv.add(llllllllllllllllllIIIIlllIIlllll);
                0;
            }
        }
    }

    private static String lIllIlllIllll(String llllllllllllllllllIIIIlllIIlIlIl, String llllllllllllllllllIIIIlllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIlllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8)), llIllIlllI[20]), "DES");
            Cipher llllllllllllllllllIIIIlllIIllIIl = Cipher.getInstance("DES");
            llllllllllllllllllIIIIlllIIllIIl.init(llIllIlllI[1], llllllllllllllllllIIIIlllIIllIlI);
            return new String(llllllllllllllllllIIIIlllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIlllIIllIII) {
            llllllllllllllllllIIIIlllIIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlllIIIIIlII() {
        llIllIlllI = new int[175];
        P.llIllIlllI[0] = (0x93 ^ 0x86) + (0x74 ^ 2) - (0xF3 ^ 0xAC) + (0x6A ^ 0x1E);
        P.llIllIlllI[1] = 2;
        P.llIllIlllI[2] = 158 + 52 - 106 + 89 + (0xE4 ^ 0x97) - (0xFFFFDB9F & 0x257F) + (133 + 183 - 307 + 196);
        P.llIllIlllI[3] = 1;
        P.llIllIlllI[4] = (0x5D ^ 2) & ~(0x4F ^ 0x10);
        P.llIllIlllI[5] = 0xFFFFA26F & 0x5FBB;
        P.llIllIlllI[6] = 0xFFFFE67D & 0x1BAF;
        P.llIllIlllI[7] = -(0xFFFFFDD7 & 0x5EF9) & (0xFFFFFFFF & 0x5EFE);
        P.llIllIlllI[8] = -(0xFFFFBE3B & 0x5BC5) & (0xFFFFBB7B & 0x5FFF);
        P.llIllIlllI[9] = 0xFFFFF7D3 & 0xFED;
        P.llIllIlllI[10] = 0xFFFFFF5B & 0x1FED;
        P.llIllIlllI[11] = (0x4F ^ 0x44) + (0xD1 ^ 0xBA) - (0x75 ^ 5) + (143 + 29 - 49 + 21);
        P.llIllIlllI[12] = 3;
        P.llIllIlllI[13] = 0x7D ^ 0x5D ^ (0x90 ^ 0xB5);
        P.llIllIlllI[14] = 0xBF ^ 0xB9;
        P.llIllIlllI[15] = 0x18 ^ 0x1C;
        P.llIllIlllI[16] = 0xA ^ 0x5A;
        P.llIllIlllI[17] = -(0xFFFFDE8F & 0x37F7) & (0xFFFF9FFF & 0x7FEF);
        P.llIllIlllI[18] = 0xD ^ 0xA;
        P.llIllIlllI[19] = 0xFFFFBF3F & 0x4BF3;
        P.llIllIlllI[20] = 0x6B ^ 0x2A ^ (0x7A ^ 0x33);
        P.llIllIlllI[21] = 0xB3 ^ 0xBF ^ (0x64 ^ 0x61);
        P.llIllIlllI[22] = 0x3A ^ 0x30;
        P.llIllIlllI[23] = 122 + 52 - -10 + 45;
        P.llIllIlllI[24] = 0x7C ^ 0x77;
        P.llIllIlllI[25] = 128 + 85 - 41 + 10 ^ 152 + 40 - 125 + 119;
        P.llIllIlllI[26] = 4 ^ 9;
        P.llIllIlllI[27] = 0xBC ^ 0xB2;
        P.llIllIlllI[28] = 0x55 ^ 0x5A;
        P.llIllIlllI[29] = 41 + 67 - 11 + 64 ^ 174 + 98 - 95 + 0;
        P.llIllIlllI[30] = 0x47 ^ 0x56;
        P.llIllIlllI[31] = 1 ^ (0x88 ^ 0x9B);
        P.llIllIlllI[32] = 54 + 96 - 97 + 105 ^ 137 + 48 - 141 + 97;
        P.llIllIlllI[33] = 0x14 ^ 0x7D ^ (0x3D ^ 0x40);
        P.llIllIlllI[34] = 0x8D ^ 0xB0 ^ (0x6E ^ 0x46);
        P.llIllIlllI[35] = 0xE7 ^ 0xA2 ^ (0x42 ^ 0x11);
        P.llIllIlllI[36] = 0x30 ^ 0x27;
        P.llIllIlllI[37] = 0x27 ^ 0x1C ^ (0x66 ^ 0x45);
        P.llIllIlllI[38] = 0x87 ^ 0x9E;
        P.llIllIlllI[39] = 0xFFFFDF6E & 0x29FB;
        P.llIllIlllI[40] = 91 + 144 - 94 + 32 ^ 160 + 180 - 278 + 121;
        P.llIllIlllI[41] = 0xE9 ^ 0xA7 ^ (0xC1 ^ 0x94);
        P.llIllIlllI[42] = 0xA9 ^ 0xB5;
        P.llIllIlllI[43] = 0x4A ^ 0x57;
        P.llIllIlllI[44] = 0x2E ^ 0x30;
        P.llIllIlllI[45] = 11 + 13 - -9 + 136 ^ 33 + 134 - 49 + 64;
        P.llIllIlllI[46] = 109 + 4 - 4 + 36 ^ 146 + 85 - 116 + 62;
        P.llIllIlllI[47] = 130 + 2 - -64 + 30 ^ 172 + 11 - 5 + 17;
        P.llIllIlllI[48] = 0x94 ^ 0xB6;
        P.llIllIlllI[49] = 0x98 ^ 0xBB;
        P.llIllIlllI[50] = 0xB8 ^ 0x85 ^ (0x11 ^ 8);
        P.llIllIlllI[51] = 171 + 181 - 221 + 94 ^ 135 + 70 - 178 + 169;
        P.llIllIlllI[52] = 0x4C ^ 0x6A;
        P.llIllIlllI[53] = 0xE4 ^ 0xC3;
        P.llIllIlllI[54] = 79 + 125 - 98 + 58 ^ 121 + 78 - 156 + 97;
        P.llIllIlllI[55] = 0x4A ^ 0x63;
        P.llIllIlllI[56] = 0x64 ^ 0x7D ^ (0xF4 ^ 0xC7);
        P.llIllIlllI[57] = 16 + 50 - 1 + 75 ^ 38 + 13 - -83 + 33;
        P.llIllIlllI[58] = 0xFFFFFB75 & 0xFDF;
        P.llIllIlllI[59] = -(0xFFFFF87E & 0x77E5) & (0xFFFFFDEF & 0x7FF7);
        P.llIllIlllI[60] = -(0xFFFFE7B5 & 0x5CDB) & (0xFFFFFFFB & 0x4DFF);
        P.llIllIlllI[61] = 0x79 ^ 0x73 ^ (0x20 ^ 6);
        P.llIllIlllI[62] = -(0xFFFFECAB & 0x77DF) & (0xFFFFEFFF & Short.MAX_VALUE);
        P.llIllIlllI[63] = 0x9C ^ 0xB1;
        P.llIllIlllI[64] = 0x52 ^ 0x7C;
        P.llIllIlllI[65] = 0xED ^ 0xC2;
        P.llIllIlllI[66] = 0x6D ^ 0x5D;
        P.llIllIlllI[67] = 0x97 ^ 0xA6;
        P.llIllIlllI[68] = 6 + 143 - 132 + 173 ^ 16 + 111 - 23 + 36;
        P.llIllIlllI[69] = 89 + 124 - 95 + 25 ^ 156 + 157 - 286 + 161;
        P.llIllIlllI[70] = 0x4D ^ 0x35 ^ (0x1D ^ 0x51);
        P.llIllIlllI[71] = 0xAE ^ 0x9B;
        P.llIllIlllI[72] = 0x56 ^ 0x3D ^ (0xD3 ^ 0x8E);
        P.llIllIlllI[73] = 0xBB ^ 0x8C;
        P.llIllIlllI[74] = 0x11 ^ 0x29;
        P.llIllIlllI[75] = (5 ^ 0x27) & ~(0x2E ^ 0xC) ^ (0xB5 ^ 0x8C);
        P.llIllIlllI[76] = 7 ^ 0x3D;
        P.llIllIlllI[77] = 0xAF ^ 0xB8 ^ (0x20 ^ 0xC);
        P.llIllIlllI[78] = 64 + 132 - 137 + 80 ^ 159 + 17 - 143 + 150;
        P.llIllIlllI[79] = 0x89 ^ 0x9F ^ (0x21 ^ 0xA);
        P.llIllIlllI[80] = 77 + 95 - 110 + 79 ^ 12 + 36 - 47 + 178;
        P.llIllIlllI[81] = 0x9B ^ 0xB3 ^ (0x3F ^ 0x28);
        P.llIllIlllI[82] = -(0xFFFFF25D & 0x7DA3) & (0xFFFFFFFB & 0x7F9F);
        P.llIllIlllI[83] = 0xCD ^ 0x8D;
        P.llIllIlllI[84] = 0x15 ^ 0x54;
        P.llIllIlllI[85] = 0xD8 ^ 0x9A;
        P.llIllIlllI[86] = 0x8A ^ 0x95 ^ (0x4E ^ 0x12);
        P.llIllIlllI[87] = 0x34 ^ 0x70;
        P.llIllIlllI[88] = 0x26 ^ 0x63;
        P.llIllIlllI[89] = 0x92 ^ 0x81 ^ (0x72 ^ 0x27);
        P.llIllIlllI[90] = 0xE8 ^ 0xAF;
        P.llIllIlllI[91] = 0x7D ^ 0x36 ^ 3;
        P.llIllIlllI[92] = 0xF3 ^ 0xB4 ^ (5 ^ 0xB);
        P.llIllIlllI[93] = -(0xFFFFC48B & 0x7FFD) & (0xFFFFCFEF & 0x7FF9);
        P.llIllIlllI[94] = -(0xFFFFA5F5 & 0x7A5B) & (0xFFFFFDFE & 0x2FDB);
        P.llIllIlllI[95] = 0x20 ^ 0xE ^ (2 ^ 0x66);
        P.llIllIlllI[96] = (0xA ^ 0x32) & ~(0x1E ^ 0x26) ^ (0x59 ^ 0x12);
        P.llIllIlllI[97] = 0x57 ^ 0x12 ^ (0x58 ^ 0x51);
        P.llIllIlllI[98] = 9 ^ 0x3D ^ (1 ^ 0x78);
        P.llIllIlllI[99] = -(0xFFFFAEFF & 0x5556) & (0xFFFFF7FF & 0x1FDD);
        P.llIllIlllI[100] = 0xDB ^ 0x95;
        P.llIllIlllI[101] = -(0xFFFFDE17 & 0x3DEB) & (0xFFFFFFEE & 0x1FFB);
        P.llIllIlllI[102] = 0x6F ^ 0x7A ^ (0xB ^ 0x51);
        P.llIllIlllI[103] = 0xC5 ^ 0xAE ^ (0x70 ^ 0x4A);
        P.llIllIlllI[104] = 0x67 ^ 0x3B ^ (0x73 ^ 0x7D);
        P.llIllIlllI[105] = -(0xFFFFC6F9 & 0x799F) & (0xFFFFDFFF & 0x7FDF);
        P.llIllIlllI[106] = 0x21 ^ 0x79 ^ (0x2B ^ 0x20);
        P.llIllIlllI[107] = -(0xFFFFE57A & 0x3A8F) & (0xFFFFA5FD & 0x7BFF);
        P.llIllIlllI[108] = 0xFFFFF5FF & 0x3B51;
        P.llIllIlllI[109] = 9 ^ 0x6D;
        P.llIllIlllI[110] = 0xFFFF9DD3 & 0x63BC;
        P.llIllIlllI[111] = 0xFFFFBFFE & 0x53F7;
        P.llIllIlllI[112] = 0xFFFFBEDE & 0x6FED;
        P.llIllIlllI[113] = -(0xFFFFFFFB & 0x1495) & (0xFFFFFFF9 & 0x56FE);
        P.llIllIlllI[114] = -(0xFFFFF193 & 0x5EFD) & (0xFFFFF7FD & 0x5FFE);
        P.llIllIlllI[115] = 0xFFFFA7FA & 0x5FD5;
        P.llIllIlllI[116] = 0x37 ^ 0x63;
        P.llIllIlllI[117] = 0xCA ^ 0x9F;
        P.llIllIlllI[118] = 0xFFFF8FFF & 0x722A;
        P.llIllIlllI[119] = 0xFFFF87FF & 0x7DBE;
        P.llIllIlllI[120] = -(0xFFFFFE2F & 0x59DE) & (0xFFFFFFEF & 0x5DDF);
        P.llIllIlllI[121] = -(0xFFFFEAB7 & 0x3D4C) & (0xFFFFFFF7 & 0x2DCF);
        P.llIllIlllI[122] = -(0xFFFFFAEA & 0x4F3F) & (0xFFFFEFEB & 0x5FFD);
        P.llIllIlllI[123] = -(0xFFFFACDF & 0x573A) & (0xFFFFAF7F & 0x5FFD);
        P.llIllIlllI[124] = -(0xFFFFF27A & 0x5F87) & (0xFFFFDF8D & 0x7FFB);
        P.llIllIlllI[125] = 0xFFFFAB6F & 0x5FF7;
        P.llIllIlllI[126] = 0xFFFFFB7E & 0xFD5;
        P.llIllIlllI[127] = -(0xFFFFBE5F & 0x53B5) & (0xFFFFFF9F & 0x1FF7);
        P.llIllIlllI[128] = -(0xFFFFA49F & 0x5FF1) & (0xFFFFDFFB & 0x2FF7);
        P.llIllIlllI[129] = -(0xFFFFD3C3 & 0x7CBE) & (0xFFFFFFFF & 0x5BF3);
        P.llIllIlllI[130] = -(0xFFFFE76F & 0x7ABD) & (0xFFFFFFBE & 0x6FEF);
        P.llIllIlllI[131] = -(0xFFFFFEA9 & 0x71FF) & (0xFFFFFFFE & 0x7BFF);
        P.llIllIlllI[132] = -(0xFFFFEEFF & 0x5349) & (0xFFFFEFFD & 0x5FCF);
        P.llIllIlllI[133] = 0xFFFFDBFF & 0x2F65;
        P.llIllIlllI[134] = 0xFFFFABFE & 0x5F61;
        P.llIllIlllI[135] = 0xFFFFAFCF & 0x5DB7;
        P.llIllIlllI[136] = -(0xFFFFCD9D & 0x72EB) & (0xFFFFCFFF & 0x7BDF);
        P.llIllIlllI[137] = -(0xFFFFF97F & 0x7685) & (0xFFFFFF7F & 0x7BF5);
        P.llIllIlllI[138] = 0xFFFFFD72 & 0xEAD;
        P.llIllIlllI[139] = -(0xFFFFDFB5 & 0x33EB) & (0xFFFFDFFB & 0x3FFF);
        P.llIllIlllI[140] = -(0xFFFFEFF9 & 0x3417) & (0xFFFFFF7F & 0x2FFF);
        P.llIllIlllI[141] = 0xFFFF9FFF & 0x6D7F;
        P.llIllIlllI[142] = -(0xFFFFDEFF & 0x7503) & (0xFFFFFF7B & 0x5FFE);
        P.llIllIlllI[143] = -(0xFFFFFF8D & 0x407B) & (0xFFFFDBBE & 0x6FDF);
        P.llIllIlllI[144] = -(0xFFFFBF4F & 0x72B9) & (0xFFFFBF3D & Short.MAX_VALUE);
        P.llIllIlllI[145] = -(0x37 ^ 0x3A) & (0xFFFFCBDF & 0x3F7F);
        P.llIllIlllI[146] = -(0xFFFF8E6D & 0x73DB) & (0xFFFF8FDB & 0x7FFD);
        P.llIllIlllI[147] = -(0xFFFFF6E7 & 0x6D9F) & (0xFFFFFFDF & 0x6FFF);
        P.llIllIlllI[148] = 0xFFFFADB7 & 0x5FDB;
        P.llIllIlllI[149] = 0xFFFFAB7A & 0x5FDF;
        P.llIllIlllI[150] = -(0xFFFFDFF7 & 0x792B) & (0xFFFFFFB6 & Short.MAX_VALUE);
        P.llIllIlllI[151] = 0xFFFFAE96 & 0x77FB;
        P.llIllIlllI[152] = 0xFFFFB697 & 0x6FF9;
        P.llIllIlllI[153] = 0xFFFFFD8F & 0xFF9;
        P.llIllIlllI[154] = 0xFFFFFB5F & 0xFFF;
        P.llIllIlllI[155] = 0xFFFF8DBD & 0x7FCF;
        P.llIllIlllI[156] = -(0xFFFFF561 & 0x5EBF) & (0xFFFFFFFB & 0x5F7F);
        P.llIllIlllI[157] = 0xFFFF8FB5 & 0x7DDE;
        P.llIllIlllI[158] = 0xFFFFF7CF & 0x2EBE;
        P.llIllIlllI[159] = 0xFFFFCB5F & 0x3FFD;
        P.llIllIlllI[160] = 0xFFFFE7DF & 0x3EB5;
        P.llIllIlllI[161] = 0xFFFFBDE7 & 0x7E1B;
        P.llIllIlllI[162] = -(0xFFFFEFAF & 0x3AD1) & (0xFFFFFEB3 & 0x3FCF);
        P.llIllIlllI[163] = 0xB ^ 0x66 ^ (0x48 ^ 0x73);
        P.llIllIlllI[164] = 15 + 163 - -6 + 47 ^ 3 + 119 - 118 + 172;
        P.llIllIlllI[165] = 0x13 ^ 3 ^ (0x43 ^ 0xB);
        P.llIllIlllI[166] = 0x6B ^ 0x53 ^ (0xE ^ 0x6F);
        P.llIllIlllI[167] = 0xEB ^ 0xAD ^ (0x51 ^ 0x4D);
        P.llIllIlllI[168] = 0xA7 ^ 0x83 ^ 90 + 28 - 18 + 27;
        P.llIllIlllI[169] = 0x5D ^ 1;
        P.llIllIlllI[170] = 0xFFFF8FDD & 0x7FBE;
        P.llIllIlllI[171] = 0xFFFFCFDF & 0x3FBD;
        P.llIllIlllI[172] = -(0xFFFFD362 & 0x7C9F) & (0xFFFFDFFF & 0x7F9F);
        P.llIllIlllI[173] = -(0xFFFFF047 & 0x5FB9) & (0xFFFFDFFF & 0x7F9F);
        P.llIllIlllI[174] = 0x41 ^ 0x1C;
    }

    @Override
    public boolean ae() {
        return llIllIlllI[4];
    }

    private static boolean lIlllIIIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (P.lIlllIIIIllIl(e.j(llIllIlllI[2]), llIllIlllI[18])) {
            bl = llIllIlllI[3];
            0;
            if (((0xF1 ^ 0xC7 ^ (0xF1 ^ 0x81)) & (0x38 ^ 0x69 ^ (0x3B ^ 0x2C) ^ -1)) != 0) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = llIllIlllI[4];
        }
        return bl;
    }

    private static boolean lIlllIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllIIIIlIll(Object object) {
        return object != null;
    }

    static {
        P.lIlllIIIIIlII();
        P.lIlllIIIIIIII();
        lq = llIllIlllI[7];
        lt = llIllIlllI[118];
        ls = llIllIlllI[6];
        kQ = llIllIlllI[60];
        lm = llIllIlllI[119];
        kJ = llIllIlllI[3];
        lo = llIllIlllI[120];
        kI = llIllIlllI[2];
        kO = llIllIlllI[82];
        kG = llIllIlllI[0];
        lp = llIllIlllI[121];
        ln = llIllIlllI[122];
        kH = llIllIlllI[1];
        kM = llIllIlllI[14];
        kP = llIllIlllI[17];
        kR = llIllIlllI[39];
        lr = llIllIlllI[5];
        kK = llIllIlllI[1];
        kS = llIllIlllI[19];
        lv = llIllIlllI[9];
        kN = llIllIlllI[18];
        lu = llIllIlllI[8];
        kL = llIllIlllI[12];
        kv = new WorldPoint(llIllIlllI[123], llIllIlllI[59], llIllIlllI[4]);
        kw = new WorldPoint(llIllIlllI[62], llIllIlllI[124], llIllIlllI[4]);
        kx = new WorldPoint(llIllIlllI[125], llIllIlllI[94], llIllIlllI[4]);
        ky = new WorldArea(llIllIlllI[126], llIllIlllI[127], llIllIlllI[31], llIllIlllI[14], llIllIlllI[4]);
        kz = new WorldArea(llIllIlllI[128], llIllIlllI[127], llIllIlllI[30], llIllIlllI[14], llIllIlllI[4]);
        kA = new WorldArea(llIllIlllI[129], llIllIlllI[130], llIllIlllI[15], llIllIlllI[22], llIllIlllI[4]);
        kB = new WorldArea(llIllIlllI[131], llIllIlllI[132], llIllIlllI[24], llIllIlllI[15], llIllIlllI[4]);
        kC = new WorldArea(llIllIlllI[133], llIllIlllI[132], llIllIlllI[18], llIllIlllI[13], llIllIlllI[4]);
        kD = new WorldArea(llIllIlllI[134], llIllIlllI[135], llIllIlllI[21], llIllIlllI[18], llIllIlllI[4]);
        kE = new WorldArea(llIllIlllI[136], llIllIlllI[132], llIllIlllI[15], llIllIlllI[15], llIllIlllI[4]);
        kF = new WorldArea(llIllIlllI[137], llIllIlllI[132], llIllIlllI[15], llIllIlllI[13], llIllIlllI[4]);
        kT = new WorldPoint(llIllIlllI[138], llIllIlllI[139], llIllIlllI[1]);
        kU = new WorldPoint(llIllIlllI[140], llIllIlllI[141], llIllIlllI[4]);
        kV = new WorldPoint(llIllIlllI[142], llIllIlllI[127], llIllIlllI[4]);
        kW = new WorldPoint(llIllIlllI[143], llIllIlllI[144], llIllIlllI[4]);
        kX = new WorldPoint(llIllIlllI[145], llIllIlllI[146], llIllIlllI[4]);
        kY = new WorldPoint(llIllIlllI[131], llIllIlllI[94], llIllIlllI[4]);
        kZ = new WorldPoint(llIllIlllI[147], llIllIlllI[148], llIllIlllI[4]);
        la = new WorldPoint(llIllIlllI[149], llIllIlllI[150], llIllIlllI[4]);
        lb = new WorldPoint(llIllIlllI[145], llIllIlllI[151], llIllIlllI[4]);
        lc = new WorldPoint(llIllIlllI[131], llIllIlllI[151], llIllIlllI[4]);
        ld = new WorldPoint(llIllIlllI[131], llIllIlllI[152], llIllIlllI[4]);
        le = new WorldPoint(llIllIlllI[136], llIllIlllI[151], llIllIlllI[4]);
        lf = new WorldPoint(llIllIlllI[136], llIllIlllI[152], llIllIlllI[4]);
        lg = new WorldPoint(llIllIlllI[58], llIllIlllI[153], llIllIlllI[4]);
        lh = new WorldPoint(llIllIlllI[62], llIllIlllI[135], llIllIlllI[4]);
        li = new WorldPoint(llIllIlllI[154], llIllIlllI[155], llIllIlllI[4]);
        lj = new WorldArea(new WorldPoint(llIllIlllI[156], llIllIlllI[157], llIllIlllI[4]), new WorldPoint(llIllIlllI[58], llIllIlllI[94], llIllIlllI[4]));
        lk = new WorldArea(new WorldPoint(llIllIlllI[145], llIllIlllI[158], llIllIlllI[4]), new WorldPoint(llIllIlllI[159], llIllIlllI[160], llIllIlllI[4]));
        ll = new WorldArea(llIllIlllI[62], llIllIlllI[130], llIllIlllI[14], llIllIlllI[22], llIllIlllI[4]);
        bv = new ArrayList<d>();
        lw = llIllIlllI[161];
        lx = llIllIlllI[162];
        ly = llIllIlIlI[llIllIlllI[163]];
        String[] stringArray = new String[llIllIlllI[14]];
        stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[164]];
        stringArray[P.llIllIlllI[3]] = llIllIlIlI[llIllIlllI[165]];
        stringArray[P.llIllIlllI[1]] = llIllIlIlI[llIllIlllI[166]];
        stringArray[P.llIllIlllI[12]] = llIllIlIlI[llIllIlllI[167]];
        stringArray[P.llIllIlllI[15]] = llIllIlIlI[llIllIlllI[168]];
        stringArray[P.llIllIlllI[13]] = llIllIlIlI[llIllIlllI[169]];
        fG = stringArray;
        int[] nArray = new int[llIllIlllI[15]];
        nArray[P.llIllIlllI[4]] = llIllIlllI[170];
        nArray[P.llIllIlllI[3]] = llIllIlllI[171];
        nArray[P.llIllIlllI[1]] = llIllIlllI[172];
        nArray[P.llIllIlllI[12]] = llIllIlllI[173];
        lz = nArray;
    }

    private static void lIlllIIIIIIII() {
        llIllIlIlI = new String[llIllIlllI[174]];
        P.llIllIlIlI[P.llIllIlllI[4]] = P."Buying items";
        P.llIllIlIlI[P.llIllIlllI[3]] = P."Finished buying items, switching back to questing";
        P.llIllIlIlI[P.llIllIlllI[1]] = P."Breaking tab";
        P.llIllIlIlI[P.llIllIlllI[12]] = P."Break";
        P.llIllIlIlI[P.llIllIlllI[15]] = P."Nav to start";
        P.llIllIlIlI[P.llIllIlllI[13]] = P."Drink";
        P.llIllIlIlI[P.llIllIlllI[14]] = P."Boy";
        P.llIllIlIlI[P.llIllIlllI[18]] = P."Navigating to outside door";
        P.llIllIlIlI[P.llIllIlllI[20]] = P."Drop";
        P.llIllIlIlI[P.llIllIlllI[21]] = P."Stealing key";
        P.llIllIlIlI[P.llIllIlllI[22]] = P."Look-under";
        P.llIllIlIlI[P.llIllIlllI[24]] = P."Continue";
        P.llIllIlIlI[P.llIllIlllI[25]] = P."null";
        P.llIllIlIlI[P.llIllIlllI[26]] = P." ";
        P.llIllIlIlI[P.llIllIlllI[27]] = P."Nav to magnet box";
        P.llIllIlIlI[P.llIllIlllI[28]] = P."Nav to magnet box";
        P.llIllIlIlI[P.llIllIlllI[29]] = P."Cupboard";
        P.llIllIlIlI[P.llIllIlllI[30]] = P."Taking magnet";
        P.llIllIlIlI[P.llIllIlllI[31]] = P."Drop";
        P.llIllIlIlI[P.llIllIlllI[32]] = P."Open";
        P.llIllIlIlI[P.llIllIlllI[33]] = P."Open";
        P.llIllIlIlI[P.llIllIlllI[34]] = P."Search";
        P.llIllIlIlI[P.llIllIlllI[35]] = P."Search";
        P.llIllIlIlI[P.llIllIlllI[36]] = P."Continue";
        P.llIllIlIlI[P.llIllIlllI[37]] = P."null";
        P.llIllIlIlI[P.llIllIlllI[38]] = P." ";
        P.llIllIlIlI[P.llIllIlllI[40]] = P."Nav to magnet box";
        P.llIllIlIlI[P.llIllIlllI[41]] = P."Cupboard";
        P.llIllIlIlI[P.llIllIlllI[42]] = P."Taking magnet";
        P.llIllIlIlI[P.llIllIlllI[43]] = P."Open";
        P.llIllIlIlI[P.llIllIlllI[44]] = P."Open";
        P.llIllIlIlI[P.llIllIlllI[45]] = P."Search";
        P.llIllIlIlI[P.llIllIlllI[46]] = P."Search";
        P.llIllIlIlI[P.llIllIlllI[47]] = P."Continue";
        P.llIllIlIlI[P.llIllIlllI[48]] = P."null";
        P.llIllIlIlI[P.llIllIlllI[49]] = P." ";
        P.llIllIlIlI[P.llIllIlllI[50]] = P."Nav to cheese spot";
        P.llIllIlIlI[P.llIllIlllI[51]] = P."Mouse hole";
        P.llIllIlIlI[P.llIllIlllI[52]] = P."Mouse";
        P.llIllIlIlI[P.llIllIlllI[53]] = P."Using cheese";
        P.llIllIlIlI[P.llIllIlllI[54]] = P."Cheese";
        P.llIllIlIlI[P.llIllIlllI[55]] = P."Cheese";
        P.llIllIlIlI[P.llIllIlllI[56]] = P."Handle mouse";
        P.llIllIlIlI[P.llIllIlllI[57]] = P."Entering maze";
        P.llIllIlIlI[P.llIllIlllI[61]] = P."Handling walking";
        P.llIllIlIlI[P.llIllIlllI[63]] = P."Door";
        P.llIllIlIlI[P.llIllIlllI[64]] = P."Entering shed";
        P.llIllIlIlI[P.llIllIlllI[65]] = P."Nav to safe spot";
        P.llIllIlIlI[P.llIllIlllI[66]] = P."Eat";
        P.llIllIlIlI[P.llIllIlllI[67]] = P."Casting spell";
        P.llIllIlIlI[P.llIllIlllI[68]] = P."Fire rune";
        P.llIllIlIlI[P.llIllIlllI[69]] = P."Fire rune";
        P.llIllIlIlI[P.llIllIlllI[70]] = P."Ball";
        P.llIllIlIlI[P.llIllIlllI[71]] = P."Ball";
        P.llIllIlIlI[P.llIllIlllI[72]] = P."Taking ball";
        P.llIllIlIlI[P.llIllIlllI[73]] = P."Take";
        P.llIllIlIlI[P.llIllIlllI[74]] = P."Ball";
        P.llIllIlIlI[P.llIllIlllI[75]] = P."Breaking tab";
        P.llIllIlIlI[P.llIllIlllI[76]] = P."Break";
        P.llIllIlIlI[P.llIllIlllI[77]] = P."Nav to witches start";
        P.llIllIlIlI[P.llIllIlllI[78]] = P."Turning in quest";
        P.llIllIlIlI[P.llIllIlllI[79]] = P."Boy";
        P.llIllIlIlI[P.llIllIlllI[80]] = P."Drink";
        P.llIllIlIlI[P.llIllIlllI[81]] = P."Entering maze";
        P.llIllIlIlI[P.llIllIlllI[83]] = P."Nav to first spot";
        P.llIllIlIlI[P.llIllIlllI[84]] = P."Nav to second spot";
        P.llIllIlIlI[P.llIllIlllI[85]] = P."Nav to third spot";
        P.llIllIlIlI[P.llIllIlllI[86]] = P."Nav to fountain";
        P.llIllIlIlI[P.llIllIlllI[87]] = P."Getting key";
        P.llIllIlIlI[P.llIllIlllI[88]] = P."Fountain";
        P.llIllIlIlI[P.llIllIlllI[89]] = P."Check";
        P.llIllIlIlI[P.llIllIlllI[90]] = P."Continue";
        P.llIllIlIlI[P.llIllIlllI[91]] = P."null";
        P.llIllIlIlI[P.llIllIlllI[92]] = P." ";
        P.llIllIlIlI[P.llIllIlllI[95]] = P."Nav back toward maze";
        P.llIllIlIlI[P.llIllIlllI[96]] = P."Nav to shed spot";
        P.llIllIlIlI[P.llIllIlllI[97]] = P."Navigating to bank";
        P.llIllIlIlI[P.llIllIlllI[98]] = P."Opening bank";
        P.llIllIlIlI[P.llIllIlllI[100]] = P."Handling banking";
        P.llIllIlIlI[P.llIllIlllI[102]] = P."We are missing supplies, switching to BUYING";
        P.llIllIlIlI[P.llIllIlllI[16]] = P."We are missing supplies, switching to BUYING";
        P.llIllIlIlI[P.llIllIlllI[103]] = P."We are missing supplies, switching to BUYING";
        P.llIllIlIlI[P.llIllIlllI[104]] = P."We are missing supplies, switching to BUYING";
        P.llIllIlIlI[P.llIllIlllI[106]] = P."We are missing supplies, switching to BUYING";
        P.llIllIlIlI[P.llIllIlllI[116]] = P."Witches House quest";
        P.llIllIlIlI[P.llIllIlllI[117]] = P."ring of wealth (";
        P.llIllIlIlI[P.llIllIlllI[163]] = P."Wizard Mizgog";
        P.llIllIlIlI[P.llIllIlllI[164]] = P."Give me a quest please.";
        P.llIllIlIlI[P.llIllIlllI[165]] = P."I'll try.";
        P.llIllIlIlI[P.llIllIlllI[166]] = P."Actually, I know where to find this stuff.";
        P.llIllIlIlI[P.llIllIlllI[167]] = P."Yes.";
        P.llIllIlIlI[P.llIllIlllI[168]] = P."What's the matter?";
        P.llIllIlIlI[P.llIllIlllI[169]] = P."Ok, I'll see what I can do.";
    }

    public static void dh() {
        TileObject llllllllllllllllllIIIIlllIlIllII2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget llllllllllllllllllIIIIlllIlIlIll;
                            if (P.lIlllIIIIIlIl(e.j(llIllIlllI[0]), llIllIlllI[1])) {
                                try {
                                    X.dR();
                                    0;
                                }
                                catch (Exception llllllllllllllllllIIIIlllIlIllII2) {
                                    llllllllllllllllllIIIIlllIlIllII2.printStackTrace();
                                }
                                if (1 <= ((0x66 ^ 0x2B) & ~(0xE3 ^ 0xAE))) {
                                    return;
                                }
                            }
                            if (P.lIlllIIIIIllI(e.j(llIllIlllI[0]), llIllIlllI[1]) && P.lIlllIIIIIlIl(e.j(llIllIlllI[2]), llIllIlllI[3])) {
                                block88: {
                                    if (P.lIlllIIIIIlll(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[4]];
                                        b.a(bv);
                                        if (P.lIlllIIIIIlIl(bv.size(), llIllIlllI[3])) {
                                            System.out.println(llIllIlIlI[llIllIlllI[3]]);
                                            bt = llIllIlllI[4];
                                        }
                                    }
                                    do {
                                        if (P.lIlllIIIIIlll(I.co() ? 1 : 0)) {
                                            int[] nArray = new int[llIllIlllI[3]];
                                            nArray[P.llIllIlllI[4]] = llIllIlllI[5];
                                            if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[llIllIlllI[3]];
                                                nArray2[P.llIllIlllI[4]] = llIllIlllI[6];
                                                if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[llIllIlllI[3]];
                                                    nArray3[P.llIllIlllI[4]] = llIllIlllI[7];
                                                    if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[llIllIlllI[3]];
                                                        nArray4[P.llIllIlllI[4]] = llIllIlllI[8];
                                                        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[llIllIlllI[3]];
                                                            nArray5[P.llIllIlllI[4]] = llIllIlllI[9];
                                                            if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[llIllIlllI[3]];
                                                                nArray6[P.llIllIlllI[4]] = llIllIlllI[10];
                                                                if (!P.lIlllIIIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) break block88;
                                        P.dj();
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                        0;
                                    } while (((204 + 208 - 235 + 47 ^ 54 + 5 - 16 + 88) & (0x5D ^ 0x13 ^ (0xBB ^ 0x96) ^ -1)) <= 2);
                                    return;
                                }
                                if (P.lIlllIIIIlIII(bt ? 1 : 0)) {
                                    if (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[11])) {
                                        int[] nArray = new int[llIllIlllI[3]];
                                        nArray[P.llIllIlllI[4]] = llIllIlllI[10];
                                        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[1]];
                                            int[] nArray7 = new int[llIllIlllI[3]];
                                            nArray7[P.llIllIlllI[4]] = llIllIlllI[10];
                                            Inventory.getFirst((int[])nArray7).interact(llIllIlIlI[llIllIlllI[12]]);
                                            Time.sleepTicks((int)llIllIlllI[13]);
                                            0;
                                        }
                                    }
                                    if (P.lIlllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[11]) && P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[14])) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[15]];
                                        if (P.lIlllIIIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && P.lIlllIIIIIlIl(Movement.getRunEnergy(), llIllIlllI[16])) {
                                            Inventory.getFirst((int[])f.ba).interact(llIllIlIlI[llIllIlllI[13]]);
                                            Time.sleepTicks((int)llIllIlllI[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)kU);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                    if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[14])) {
                                        g.a(llIllIlIlI[llIllIlllI[14]], fG);
                                    }
                                }
                            }
                            if (P.lIlllIIIIIllI(e.j(llIllIlllI[0]), llIllIlllI[1]) && P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[3])) {
                                if (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15]) && P.lIlllIIIIlIII(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[llIllIlllI[3]];
                                    nArray[P.llIllIlllI[4]] = llIllIlllI[17];
                                    if (P.lIlllIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[18]];
                                        Movement.walkTo((WorldPoint)kX);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                }
                                if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15]) && P.lIlllIIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[llIllIlllI[3]];
                                    nArray[P.llIllIlllI[4]] = llIllIlllI[17];
                                    if (P.lIlllIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[llIllIlllI[3]];
                                        nArray8[P.llIllIlllI[4]] = llIllIlllI[19];
                                        llllllllllllllllllIIIIlllIlIllII2 = TileObjects.getNearest((int[])nArray8);
                                        if (P.lIlllIIIIIlll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[llIllIlllI[3]];
                                            nArray9[P.llIllIlllI[4]] = llIllIlllI[8];
                                            Inventory.getFirst((int[])nArray9).interact(llIllIlIlI[llIllIlllI[20]]);
                                            Time.sleepTicks((int)llIllIlllI[3]);
                                            0;
                                        }
                                        if (P.lIlllIIIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2) && P.lIlllIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[21]];
                                                llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIlIll = Widgets.get((int)llIllIlllI[23], (int)llIllIlllI[3]))) {
                                                llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[24]]);
                                                llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlllI[4]);
                                                llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[25]]);
                                                Keyboard.type((String)llIllIlIlI[llIllIlllI[26]]);
                                            }
                                        }
                                    }
                                }
                                if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15])) {
                                    int[] nArray = new int[llIllIlllI[3]];
                                    nArray[P.llIllIlllI[4]] = llIllIlllI[17];
                                    if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && P.lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[27]];
                                        Movement.walkTo((WorldPoint)lb);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                }
                                if (P.lIlllIIIIIlll(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[28]];
                                    if (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                                        Movement.walkTo((WorldPoint)lb);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                    if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                                        String[] stringArray = new String[llIllIlllI[3]];
                                        stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[29]];
                                        llllllllllllllllllIIIIlllIlIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[30]];
                                        if (P.lIlllIIIIIlll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[llIllIlllI[3]];
                                            nArray[P.llIllIlllI[4]] = llIllIlllI[8];
                                            Inventory.getFirst((int[])nArray).interact(llIllIlIlI[llIllIlllI[31]]);
                                            Time.sleepTicks((int)llIllIlllI[3]);
                                            0;
                                        }
                                        if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2)) {
                                            String[] stringArray2 = new String[llIllIlllI[3]];
                                            stringArray2[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[32]];
                                            if (P.lIlllIIIIIlll(llllllllllllllllllIIIIlllIlIllII2.hasAction(stringArray2) ? 1 : 0)) {
                                                llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[33]]);
                                                Time.sleepTicks((int)llIllIlllI[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[llIllIlllI[3]];
                                            stringArray3[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[34]];
                                            if (P.lIlllIIIIIlll(llllllllllllllllllIIIIlllIlIllII2.hasAction(stringArray3) ? 1 : 0)) {
                                                llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[35]]);
                                                Time.sleepTicks((int)llIllIlllI[1]);
                                                0;
                                                llllllllllllllllllIIIIlllIlIlIll = Widgets.get((int)llIllIlllI[23], (int)llIllIlllI[3]);
                                                if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIlIll)) {
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[36]]);
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlllI[4]);
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[37]]);
                                                    Keyboard.type((String)llIllIlIlI[llIllIlllI[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (P.lIlllIIIIIllI(e.j(llIllIlllI[0]), llIllIlllI[1]) && P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[1])) {
                                di = llIllIlllI[4];
                                if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[22])) {
                                    while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[1]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)kX);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                        0;
                                        if (null == null) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[llIllIlllI[3]];
                                nArray[P.llIllIlllI[4]] = llIllIlllI[39];
                                if (P.lIlllIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && P.lIlllIIIIIlll(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[40]];
                                    if (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                                        Movement.walkTo((WorldPoint)lb);
                                        0;
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                    if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                                        String[] stringArray = new String[llIllIlllI[3]];
                                        stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[41]];
                                        llllllllllllllllllIIIIlllIlIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[42]];
                                        if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2)) {
                                            String[] stringArray4 = new String[llIllIlllI[3]];
                                            stringArray4[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[43]];
                                            if (P.lIlllIIIIIlll(llllllllllllllllllIIIIlllIlIllII2.hasAction(stringArray4) ? 1 : 0)) {
                                                llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[44]]);
                                                Time.sleepTicks((int)llIllIlllI[1]);
                                                0;
                                            }
                                            String[] stringArray5 = new String[llIllIlllI[3]];
                                            stringArray5[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[45]];
                                            if (P.lIlllIIIIIlll(llllllllllllllllllIIIIlllIlIllII2.hasAction(stringArray5) ? 1 : 0)) {
                                                llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[46]]);
                                                Time.sleepTicks((int)llIllIlllI[1]);
                                                0;
                                                llllllllllllllllllIIIIlllIlIlIll = Widgets.get((int)llIllIlllI[23], (int)llIllIlllI[3]);
                                                if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIlIll)) {
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[47]]);
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlllI[4]);
                                                    llllllllllllllllllIIIIlllIlIlIll.interact(llIllIlIlI[llIllIlllI[48]]);
                                                    Keyboard.type((String)llIllIlIlI[llIllIlllI[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[llIllIlllI[3]];
                                nArray10[P.llIllIlllI[4]] = llIllIlllI[39];
                                if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray10) ? 1 : 0) && P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[3])) {
                                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[50]];
                                    Movement.walkTo((WorldPoint)kY);
                                    0;
                                    Time.sleepTicks((int)llIllIlllI[3]);
                                    0;
                                }
                                if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[1])) {
                                    String[] stringArray = new String[llIllIlllI[3]];
                                    stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[51]];
                                    llllllllllllllllllIIIIlllIlIllII2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIllIlllI[3]];
                                    stringArray6[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[52]];
                                    llllllllllllllllllIIIIlllIlIlIll = NPCs.getNearest((String[])stringArray6);
                                    if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2) && P.lIlllIIIIllII(llllllllllllllllllIIIIlllIlIlIll)) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[53]];
                                        String[] stringArray7 = new String[llIllIlllI[3]];
                                        stringArray7[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[54]];
                                        if (P.lIlllIIIIIlll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[llIllIlllI[3]];
                                            stringArray8[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llllllllllllllllllIIIIlllIlIllII2);
                                        }
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                    if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIlIll)) {
                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[56]];
                                        int[] nArray11 = new int[llIllIlllI[3]];
                                        nArray11[P.llIllIlllI[4]] = llIllIlllI[39];
                                        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[llIllIlllI[3]];
                                            nArray12[P.llIllIlllI[4]] = llIllIlllI[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)llllllllllllllllllIIIIlllIlIlIll);
                                        }
                                        Time.sleepTicks((int)llIllIlllI[3]);
                                        0;
                                    }
                                }
                            }
                            if (P.lIlllIIIIIlll(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[12])) {
                                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllIlllI[58], llIllIlllI[59], llIllIlllI[4]));
                                0;
                                Time.sleepTicks((int)llIllIlllI[3]);
                                0;
                            }
                            if (!P.lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[12])) break block89;
                            int[] nArray = new int[llIllIlllI[3]];
                            nArray[P.llIllIlllI[4]] = llIllIlllI[60];
                            if (!P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[llIllIlllI[3]];
                            nArray13[P.llIllIlllI[4]] = llIllIlllI[60];
                            if (!P.lIlllIIIIIlll(Inventory.contains((int[])nArray13) ? 1 : 0) || !P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(lh), llIllIlllI[12])) break block89;
                        }
                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[61]];
                        if (P.lIlllIIIIllIl(Movement.getRunEnergy(), llIllIlllI[33])) {
                            P.di();
                        }
                    }
                    if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lh), llIllIlllI[12])) {
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[60];
                        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && P.lIlllIIIIIllI(Players.getLocal().getWorldLocation().getX(), llIllIlllI[62])) {
                            String[] stringArray = new String[llIllIlllI[3]];
                            stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[63]];
                            llllllllllllllllllIIIIlllIlIllII2 = TileObjects.getNearest((String[])stringArray);
                            if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2)) {
                                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[64]];
                                int[] nArray14 = new int[llIllIlllI[3]];
                                nArray14[P.llIllIlllI[4]] = llIllIlllI[60];
                                if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[llIllIlllI[3]];
                                    nArray15[P.llIllIlllI[4]] = llIllIlllI[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llllllllllllllllllIIIIlllIlIllII2);
                                    Time.sleepTicks((int)llIllIlllI[1]);
                                    0;
                                }
                            }
                        }
                    }
                    if (!P.lIlllIIIIIlll(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[llIllIlllI[3]];
                    nArray[P.llIllIlllI[4]] = llIllIlllI[60];
                    if (!P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (P.lIlllIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)kV) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[65]];
                        Movement.walkTo((WorldPoint)kV);
                        0;
                    }
                    if (P.lIlllIIIIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlllI[13])) {
                        int[] nArray16 = new int[llIllIlllI[3]];
                        nArray16[P.llIllIlllI[4]] = llIllIlllI[8];
                        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[llIllIlllI[3]];
                            nArray17[P.llIllIlllI[4]] = llIllIlllI[8];
                            Inventory.getFirst((int[])nArray17).interact(llIllIlIlI[llIllIlllI[66]]);
                        }
                    }
                    if (!P.lIlllIIIIIlll(Players.getLocal().getWorldLocation().equals((Object)kV) ? 1 : 0) || !P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2 = NPCs.getNearest((int[])lz)) || !P.lIlllIIIIlIII(llllllllllllllllllIIIIlllIlIllII2.isDead() ? 1 : 0)) break block91;
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[67]];
                    if (P.lIlllIIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIllIlllI[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llllllllllllllllllIIIIlllIlIllII2);
                        Time.sleepTicks((int)llIllIlllI[3]);
                        0;
                    }
                    if (P.lIlllIIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIllIlllI[26]) && !P.lIlllIIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIllIlllI[21])) break block92;
                    if (!P.lIlllIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), llIllIlllI[21])) break block93;
                    int[] nArray18 = new int[llIllIlllI[3]];
                    nArray18[P.llIllIlllI[4]] = llIllIlllI[6];
                    if (!P.lIlllIIIIIlll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[llIllIlllI[3]];
                    stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[68]];
                    if (!P.lIlllIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llllllllllllllllllIIIIlllIlIllII2);
                Time.sleepTicks((int)llIllIlllI[3]);
                0;
            }
            if (P.lIlllIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), llIllIlllI[26])) {
                String[] stringArray = new String[llIllIlllI[3]];
                stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[69]];
                if (P.lIlllIIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llllllllllllllllllIIIIlllIlIllII2);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                }
            }
        }
        if (P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[14])) {
            String[] stringArray = new String[llIllIlllI[3]];
            stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[70]];
            if (P.lIlllIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[llIllIlllI[3]];
                stringArray9[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[71]];
                llllllllllllllllllIIIIlllIlIllII2 = TileItems.getNearest((String[])stringArray9);
                if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIllII2)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[72]];
                    llllllllllllllllllIIIIlllIlIllII2.interact(llIllIlIlI[llIllIlllI[73]]);
                    Time.sleepTicks((int)llIllIlllI[1]);
                    0;
                }
            }
        }
        if (P.lIlllIIIIIllI(e.j(llIllIlllI[2]), llIllIlllI[14])) {
            String[] stringArray = new String[llIllIlllI[3]];
            stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[74]];
            if (P.lIlllIIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (P.lIlllIIIIIlll(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[llIllIlllI[3]];
                    nArray[P.llIllIlllI[4]] = llIllIlllI[10];
                    if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[75]];
                        int[] nArray19 = new int[llIllIlllI[3]];
                        nArray19[P.llIllIlllI[4]] = llIllIlllI[10];
                        Inventory.getFirst((int[])nArray19).interact(llIllIlIlI[llIllIlllI[76]]);
                        Time.sleepTicks((int)llIllIlllI[13]);
                        0;
                    }
                }
                if (P.lIlllIIIIlIII(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[15])) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[77]];
                    Movement.walkTo((WorldPoint)kU);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                }
                if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[13])) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[78]];
                    if (P.lIlllIIIIIlIl(di, llIllIlllI[3])) {
                        aN.pZ += llIllIlllI[3];
                        aN.u(AccBuilderSotf.m);
                        di += llIllIlllI[3];
                        aN.pZ = llIllIlllI[4];
                        dj = llIllIlllI[4];
                    }
                    g.a(llIllIlIlI[llIllIlllI[79]], fG);
                }
            }
        }
    }

    private static String lIllIllllIIII(String llllllllllllllllllIIIIlllIIIIlll, String llllllllllllllllllIIIIlllIIIIllI) {
        llllllllllllllllllIIIIlllIIIIlll = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIlllIIIIlIl = new StringBuilder();
        char[] llllllllllllllllllIIIIlllIIIIlII = llllllllllllllllllIIIIlllIIIIllI.toCharArray();
        int llllllllllllllllllIIIIlllIIIIIll = llIllIlllI[4];
        char[] llllllllllllllllllIIIIllIlllllIl = llllllllllllllllllIIIIlllIIIIlll.toCharArray();
        int llllllllllllllllllIIIIllIlllllII = llllllllllllllllllIIIIllIlllllIl.length;
        int llllllllllllllllllIIIIllIllllIll = llIllIlllI[4];
        while (P.lIlllIIIIIlIl(llllllllllllllllllIIIIllIllllIll, llllllllllllllllllIIIIllIlllllII)) {
            char llllllllllllllllllIIIIlllIIIlIII = llllllllllllllllllIIIIllIlllllIl[llllllllllllllllllIIIIllIllllIll];
            llllllllllllllllllIIIIlllIIIIlIl.append((char)(llllllllllllllllllIIIIlllIIIlIII ^ llllllllllllllllllIIIIlllIIIIlII[llllllllllllllllllIIIIlllIIIIIll % llllllllllllllllllIIIIlllIIIIlII.length]));
            0;
            ++llllllllllllllllllIIIIlllIIIIIll;
            ++llllllllllllllllllIIIIllIllllIll;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIlllIIIIlIl);
    }

    @Override
    public String ag() {
        return llIllIlIlI[llIllIlllI[116]];
    }

    private static boolean lIlllIIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void di() {
        if (P.lIlllIIIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && P.lIlllIIIIIlIl(Movement.getRunEnergy(), llIllIlllI[68])) {
            Inventory.getFirst((int[])f.ba).interact(llIllIlIlI[llIllIlllI[80]]);
            Time.sleepTicks((int)llIllIlllI[3]);
            0;
        }
        if (P.lIlllIIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!P.lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[1])) {
            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(llIllIlllI[58], llIllIlllI[59], llIllIlllI[4]));
            0;
            Time.sleepTicks((int)llIllIlllI[3]);
            0;
        }
        int[] nArray = new int[llIllIlllI[3]];
        nArray[P.llIllIlllI[4]] = llIllIlllI[82];
        NPC llllllllllllllllllIIIIlllIlIIlll = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[llIllIlllI[3]];
        nArray2[P.llIllIlllI[4]] = llIllIlllI[60];
        if (P.lIlllIIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (P.lIlllIIIIIlll(ky.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlll) && P.lIlllIIIIIlll(kE.contains(llllllllllllllllllIIIIlllIlIIlll.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llIllIlllI[24]);
                0;
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kv), llIllIlllI[3]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[83]];
                    Movement.walkTo((WorldPoint)kv);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if (null == null) continue;
                    return;
                }
            }
            if (P.lIlllIIIIIlll(kz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlll) && P.lIlllIIIIIlll(kB.contains(llllllllllllllllllIIIIlllIlIIlll.getWorldLocation()) ? 1 : 0)) {
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kw), llIllIlllI[3]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[84]];
                    Movement.walkTo((WorldPoint)kw);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if ((39 + 85 - 111 + 172 ^ 15 + 1 - 3 + 176) >= 0) continue;
                    return;
                }
            }
            if (P.lIlllIIIIIlll(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlll) && P.lIlllIIIIIlll(kF.contains(llllllllllllllllllIIIIlllIlIIlll.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llIllIlllI[18]);
                0;
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kx), llIllIlllI[3]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[85]];
                    Movement.walkTo((WorldPoint)kx);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if ((0x97 ^ 0x93) >= -1) continue;
                    return;
                }
            }
            if (P.lIlllIIIIIlll(kD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlll) && P.lIlllIIIIIlll(kF.contains(llllllllllllllllllIIIIlllIlIIlll.getWorldLocation()) ? 1 : 0)) {
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[1]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[86]];
                    Movement.walkTo((WorldPoint)li);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if (null == null) continue;
                    return;
                }
            }
            if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[12])) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[87]];
                String[] stringArray = new String[llIllIlllI[3]];
                stringArray[P.llIllIlllI[4]] = llIllIlIlI[llIllIlllI[88]];
                TileObject llllllllllllllllllIIIIlllIlIIllI = TileObjects.getNearest((String[])stringArray);
                if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIllI)) {
                    llllllllllllllllllIIIIlllIlIIllI.interact(llIllIlIlI[llIllIlllI[89]]);
                    Time.sleepTicks((int)llIllIlllI[1]);
                    0;
                    Widget llllllllllllllllllIIIIlllIlIIlIl = Widgets.get((int)llIllIlllI[23], (int)llIllIlllI[3]);
                    if (P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlIl)) {
                        llllllllllllllllllIIIIlllIlIIlIl.interact(llIllIlIlI[llIllIlllI[90]]);
                        llllllllllllllllllIIIIlllIlIIlIl.interact(llIllIlllI[4]);
                        llllllllllllllllllIIIIlllIlIIlIl.interact(llIllIlIlI[llIllIlllI[91]]);
                        Keyboard.type((String)llIllIlIlI[llIllIlllI[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[llIllIlllI[3]];
        nArray3[P.llIllIlllI[4]] = llIllIlllI[60];
        if (P.lIlllIIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[12])) {
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4])), llIllIlllI[3]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4]));
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if (-1 <= 3) continue;
                    return;
                }
            }
            if (P.lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4])), llIllIlllI[1]) && P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIlll) && P.lIlllIIIIIlll(kE.contains(llllllllllllllllllIIIIlllIlIIlll.getWorldLocation()) ? 1 : 0)) {
                while (P.lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kw), llIllIlllI[3]) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[96]];
                    Movement.walkTo((WorldPoint)kw);
                    0;
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    0;
                    if ((11 + 94 - -16 + 9 ^ 115 + 47 - 40 + 13) > 0) continue;
                    return;
                }
            }
        }
    }

    private static String lIllIllllIIIl(String llllllllllllllllllIIIIllIlllIIII, String llllllllllllllllllIIIIllIllIllll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIllIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIllIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIllIlllIlII.init(llIllIlllI[1], llllllllllllllllllIIIIllIlllIlIl);
            return new String(llllllllllllllllllIIIIllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIllIlllIIll) {
            llllllllllllllllllIIIIllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        P.dh();
        return llIllIlllI[109];
    }

    /*
     * WARNING - void declaration
     */
    private static void dj() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void llllllllllllllllllIIIIlllIlIIIll;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (P.lIlllIIIIlIll(bankLocation) && P.lIlllIIIIlIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[97]];
                                a.a(bankLocation);
                            }
                            if (!P.lIlllIIIIlIll(llllllllllllllllllIIIIlllIlIIIll) || !P.lIlllIIIIIlll(llllllllllllllllllIIIIlllIlIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (P.lIlllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlllI[99]);
                                0;
                            }
                            if (!P.lIlllIIIIIlll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[100]];
                            if (P.lIlllIIIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIllIlllI[12]);
                                0;
                            }
                            if (P.lIlllIIIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIllIlllI[1]);
                                0;
                            }
                            while (P.lIlllIIIIlIII(I.co() ? 1 : 0) && P.lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                                I.cm();
                                Time.sleepTicks((int)llIllIlllI[3]);
                                0;
                                0;
                                if (2 != 0) continue;
                                return;
                            }
                            int[] nArray = new int[llIllIlllI[3]];
                            nArray[P.llIllIlllI[4]] = llIllIlllI[7];
                            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIllIlllI[3]];
                                nArray2[P.llIllIlllI[4]] = llIllIlllI[7];
                                if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), llIllIlllI[101])) {
                                    P.Q();
                                    System.out.println(llIllIlIlI[llIllIlllI[102]]);
                                    bt = llIllIlllI[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[llIllIlllI[3]];
                            nArray3[P.llIllIlllI[4]] = llIllIlllI[6];
                            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIllIlllI[3]];
                                nArray4[P.llIllIlllI[4]] = llIllIlllI[6];
                                if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray4).getQuantity(), llIllIlllI[101])) {
                                    P.Q();
                                    System.out.println(llIllIlIlI[llIllIlllI[16]]);
                                    bt = llIllIlllI[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[llIllIlllI[3]];
                            nArray5[P.llIllIlllI[4]] = llIllIlllI[5];
                            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIllIlllI[3]];
                                nArray6[P.llIllIlllI[4]] = llIllIlllI[5];
                                if (P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray6).getQuantity(), llIllIlllI[101])) {
                                    P.Q();
                                    System.out.println(llIllIlIlI[llIllIlllI[103]]);
                                    bt = llIllIlllI[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[llIllIlllI[3]];
                            nArray7[P.llIllIlllI[4]] = llIllIlllI[10];
                            if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[llIllIlllI[3]];
                            nArray8[P.llIllIlllI[4]] = llIllIlllI[10];
                            if (!P.lIlllIIIIllIl(Bank.getFirst((int[])nArray8).getQuantity(), llIllIlllI[22])) break block32;
                        }
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[llIllIlllI[3]];
                        nArray9[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (!P.lIlllIIIIllIl(Bank.getFirst((int[])nArray9).getQuantity(), llIllIlllI[13])) break block32;
                    }
                    int[] nArray = new int[llIllIlllI[3]];
                    nArray[P.llIllIlllI[4]] = llIllIlllI[8];
                    if (!P.lIlllIIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[llIllIlllI[3]];
                    nArray10[P.llIllIlllI[4]] = llIllIlllI[8];
                    if (!P.lIlllIIIIIlIl(Bank.getFirst((int[])nArray10).getQuantity(), llIllIlllI[33])) break block34;
                }
                P.Q();
                System.out.println(llIllIlIlI[llIllIlllI[104]]);
                bt = llIllIlllI[3];
                return;
            }
            int[] nArray = new int[llIllIlllI[18]];
            nArray[P.llIllIlllI[4]] = llIllIlllI[105];
            nArray[P.llIllIlllI[3]] = llIllIlllI[10];
            nArray[P.llIllIlllI[1]] = llIllIlllI[9];
            nArray[P.llIllIlllI[12]] = llIllIlllI[8];
            nArray[P.llIllIlllI[15]] = llIllIlllI[7];
            nArray[P.llIllIlllI[13]] = llIllIlllI[5];
            nArray[P.llIllIlllI[14]] = llIllIlllI[6];
            if (P.lIlllIIIIlIII(e.c(nArray) ? 1 : 0)) {
                P.Q();
                System.out.println(llIllIlIlI[llIllIlllI[106]]);
                bt = llIllIlllI[3];
                return;
            }
            if (P.lIlllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)llIllIlllI[15]);
                0;
            }
            int[] nArray11 = new int[llIllIlllI[3]];
            nArray11[P.llIllIlllI[4]] = llIllIlllI[10];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llIllIlllI[3]];
                nArray12[P.llIllIlllI[4]] = llIllIlllI[10];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray12), llIllIlllI[3])) {
                    Bank.withdraw((int)llIllIlllI[10], (int)llIllIlllI[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[10];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if (1 == 0) {
                                return ((0x93 ^ 0xA9) & ~(0x72 ^ 0x48)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray13 = new int[llIllIlllI[3]];
            nArray13[P.llIllIlllI[4]] = llIllIlllI[9];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[llIllIlllI[3]];
                nArray14[P.llIllIlllI[4]] = llIllIlllI[9];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray14), llIllIlllI[3])) {
                    Bank.withdraw((int)llIllIlllI[9], (int)llIllIlllI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[9];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if (-3 >= 0) {
                                return ((0x6E ^ 0x71 ^ (0x35 ^ 0x30)) & (0x19 ^ 0x64 ^ (0x62 ^ 5) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray15 = new int[llIllIlllI[3]];
            nArray15[P.llIllIlllI[4]] = llIllIlllI[7];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[llIllIlllI[3]];
                nArray16[P.llIllIlllI[4]] = llIllIlllI[7];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray16), llIllIlllI[3])) {
                    Bank.withdraw((int)llIllIlllI[7], (int)llIllIlllI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[7];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if (-1 >= 0) {
                                return ((0x12 ^ 0x73) & ~(0x71 ^ 0x10)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray17 = new int[llIllIlllI[3]];
            nArray17[P.llIllIlllI[4]] = llIllIlllI[5];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[llIllIlllI[3]];
                nArray18[P.llIllIlllI[4]] = llIllIlllI[5];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray18), llIllIlllI[3])) {
                    Bank.withdraw((int)llIllIlllI[5], (int)llIllIlllI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[5];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if ((131 + 9 - 42 + 37 ^ 30 + 62 - 65 + 103) <= 0) {
                                return (1 & (1 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray19 = new int[llIllIlllI[3]];
            nArray19[P.llIllIlllI[4]] = llIllIlllI[6];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[llIllIlllI[3]];
                nArray20[P.llIllIlllI[4]] = llIllIlllI[6];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray20), llIllIlllI[3])) {
                    Bank.withdraw((int)llIllIlllI[6], (int)llIllIlllI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[6];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if (2 < 1) {
                                return ((0x98 ^ 0xC7) & ~(0xF1 ^ 0xAE)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray21 = new int[llIllIlllI[3]];
            nArray21[P.llIllIlllI[4]] = llIllIlllI[108];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlllI[3]];
                nArray22[P.llIllIlllI[4]] = llIllIlllI[108];
                if (P.lIlllIIIIlIII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)llIllIlllI[108], (int)llIllIlllI[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
            int[] nArray23 = new int[llIllIlllI[3]];
            nArray23[P.llIllIlllI[4]] = llIllIlllI[8];
            if (P.lIlllIIIIIlll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[llIllIlllI[3]];
                nArray24[P.llIllIlllI[4]] = llIllIlllI[8];
                if (P.lIlllIIIIIlIl(Inventory.getCount((int[])nArray24), llIllIlllI[3])) {
                    Bank.withdrawAll((int)llIllIlllI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIllIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIllIlllI[3]];
                        nArray[P.llIllIlllI[4]] = llIllIlllI[8];
                        if (P.lIlllIIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llIllIlllI[3];
                            0;
                            if (-(0x4C ^ 0x41 ^ (0xA8 ^ 0xA1)) > 0) {
                                return ((66 + 77 - 33 + 58 ^ 49 + 171 - 120 + 75) & (0x1C ^ 0x3D ^ (0x87 ^ 0xA1) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIllIlllI[4];
                        }
                        return bl;
                    }, (int)llIllIlllI[99]);
                    0;
                }
            }
        }
    }

    private static boolean lIlllIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIIIllII(Object object) {
        return object == null;
    }

    private static boolean lIlllIIIIIlll(int n2) {
        return n2 != 0;
    }
}

