/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class u
implements ac {
    public static /* synthetic */ WorldPoint dh;
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIlIIIIIl;
    public static /* synthetic */ WorldPoint de;
    private static /* synthetic */ String[] cE;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIIIIll;
    public static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ WorldPoint df;
    private static /* synthetic */ WorldPoint dk;
    public static /* synthetic */ List<d> bv;

    @Override
    public boolean ah() {
        boolean bl;
        if (u.lIllIIIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[57])) {
            bl = llIlIIIIll[0];
            0;
            if ((17 + 52 - -58 + 18 ^ 98 + 137 - 130 + 44) <= -1) {
                return ((0x5D ^ 0x7A ^ (4 ^ 0xF)) & (0x10 ^ 0x6A ^ (0x51 ^ 7) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIll[1];
        }
        return bl;
    }

    private static boolean lIllIIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        u.lIllIIIIIlIIl();
        u.lIllIIIIIlIII();
        bv = new ArrayList<d>();
        de = new WorldPoint(llIlIIIIll[88], llIlIIIIll[89], llIlIIIIll[1]);
        df = new WorldPoint(llIlIIIIll[90], llIlIIIIll[91], llIlIIIIll[1]);
        dg = new WorldPoint(llIlIIIIll[92], llIlIIIIll[93], llIlIIIIll[1]);
        dh = new WorldPoint(llIlIIIIll[94], llIlIIIIll[95], llIlIIIIll[1]);
        dk = null;
        String[] stringArray = new String[llIlIIIIll[4]];
        stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[96]];
        stringArray[u.llIlIIIIll[0]] = llIlIIIIIl[llIlIIIIll[97]];
        stringArray[u.llIlIIIIll[3]] = llIlIIIIIl[llIlIIIIll[98]];
        stringArray[u.llIlIIIIll[9]] = llIlIIIIIl[llIlIIIIll[99]];
        cE = stringArray;
    }

    private static boolean lIllIIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIIIIll[1];
    }

    private static void lIllIIIIIlIIl() {
        llIlIIIIll = new int[101];
        u.llIlIIIIll[0] = 1;
        u.llIlIIIIll[1] = (0x8B ^ 0x9D) & ~(0x8E ^ 0x98);
        u.llIlIIIIll[2] = 0xFFFFB7DA & 0x5BAD;
        u.llIlIIIIll[3] = 2;
        u.llIlIIIIll[4] = 0x72 ^ 0x76;
        u.llIlIIIIll[5] = (0x9C ^ 0xA1) & ~(0 ^ 0x3D) ^ (0x77 ^ 0x71);
        u.llIlIIIIll[6] = -(0xFFFFE069 & 0x5F97) & (0xFFFFFF6F & 0x5FD7);
        u.llIlIIIIll[7] = 0xFFFFBF6E & 0x5FD9;
        u.llIlIIIIll[8] = -(0xFFFFF4AE & 0x2F57) & (0xFFFFFFFF & 0x27BF);
        u.llIlIIIIll[9] = 3;
        u.llIlIIIIll[10] = -(0xFFFFFF5F & 0x7AE5) & (0xFFFFFFFF & 0x7F77);
        u.llIlIIIIll[11] = 0xFFFFF5D5 & 0x3B7B;
        u.llIlIIIIll[12] = 85 + 117 - 128 + 54 ^ 87 + 8 - 51 + 89;
        u.llIlIIIIll[13] = 0xFFFFB9FB & 0x477F;
        u.llIlIIIIll[14] = 0x1C ^ 0x16;
        u.llIlIIIIll[15] = 0xFFFFBF59 & 0x5FEF;
        u.llIlIIIIll[16] = 101 + 1 - 18 + 60 ^ 131 + 56 - 97 + 62;
        u.llIlIIIIll[17] = 0xE7 ^ 0xA6;
        u.llIlIIIIll[18] = 0x96 ^ 0xB5 ^ (0x67 ^ 0x43);
        u.llIlIIIIll[19] = 19 + 81 - -13 + 88 ^ 28 + 1 - -31 + 132;
        u.llIlIIIIll[20] = 0xFFFF8BE2 & Short.MAX_VALUE;
        u.llIlIIIIll[21] = 0xFFFFAFEB & 0x5CFD;
        u.llIlIIIIll[22] = 134 + 1 - 113 + 143 ^ 109 + 160 - 167 + 72;
        u.llIlIIIIll[23] = 0xFFFFFFDF & 0xBFF;
        u.llIlIIIIll[24] = 0xFFFFCEF7 & 0x3DE9;
        u.llIlIIIIll[25] = 0x6A ^ 0x66;
        u.llIlIIIIll[26] = 0x57 ^ 0x4B ^ (0x98 ^ 0x89);
        u.llIlIIIIll[27] = 0xE3 ^ 0xA1 ^ (0xC1 ^ 0x8D);
        u.llIlIIIIll[28] = 0x65 ^ 0x15 ^ 5 + 27 - -88 + 7;
        u.llIlIIIIll[29] = 0xB1 ^ 0xA1;
        u.llIlIIIIll[30] = 0x49 ^ 0x58;
        u.llIlIIIIll[31] = 0xB ^ 0x19;
        u.llIlIIIIll[32] = -(0xFFFFF8F3 & 0x67BF) & (0xFFFFFFF6 & 0x7BFB);
        u.llIlIIIIll[33] = -(0xFFFFD7BD & 0x2D52) & (0xFFFFDFDF & 0x3DEF);
        u.llIlIIIIll[34] = 0x9A ^ 0xAA ^ 2;
        u.llIlIIIIll[35] = 0xB4 ^ 0xA7;
        u.llIlIIIIll[36] = 84 + 3 - -34 + 87 ^ 112 + 134 - 134 + 84;
        u.llIlIIIIll[37] = 0xFFFFFBD3 & 0x17EC;
        u.llIlIIIIll[38] = 0x87 ^ 0x92;
        u.llIlIIIIll[39] = 0x56 ^ 0x40;
        u.llIlIIIIll[40] = 0xE ^ 0x19;
        u.llIlIIIIll[41] = 0x6A ^ 0x72;
        u.llIlIIIIll[42] = 115 + 24 - 54 + 87 ^ 90 + 146 - 123 + 68;
        u.llIlIIIIll[43] = 14 + 72 - -31 + 12 ^ 105 + 17 - 89 + 122;
        u.llIlIIIIll[44] = 209 + 85 - 184 + 110 ^ 186 + 31 - 59 + 41;
        u.llIlIIIIll[45] = 0x38 ^ 0x24;
        u.llIlIIIIll[46] = 0x17 ^ 0xA;
        u.llIlIIIIll[47] = 0x1B ^ 5;
        u.llIlIIIIll[48] = 0x65 ^ 0x7A;
        u.llIlIIIIll[49] = 35 + 44 - -9 + 98 ^ 66 + 126 - 167 + 129;
        u.llIlIIIIll[50] = 82 + 48 - 103 + 126 ^ 3 + 165 - 24 + 40;
        u.llIlIIIIll[51] = 0x2E ^ 0x75 ^ (0xB ^ 0x72);
        u.llIlIIIIll[52] = 182 + 168 - 206 + 82 ^ 19 + 83 - 12 + 103;
        u.llIlIIIIll[53] = 0xBD ^ 0x8B ^ (0xA3 ^ 0xB1);
        u.llIlIIIIll[54] = 0xDA ^ 0x88 ^ (0xE0 ^ 0x97);
        u.llIlIIIIll[55] = 0x57 ^ 0x71;
        u.llIlIIIIll[56] = 0xC6 ^ 0xB0 ^ (0xCA ^ 0x9B);
        u.llIlIIIIll[57] = 47 + 88 - 62 + 83 ^ 0 + 177 - 131 + 134;
        u.llIlIIIIll[58] = 0xC6 ^ 0x8C ^ (0x51 ^ 0x32);
        u.llIlIIIIll[59] = 0xBB ^ 0xAB ^ (0xBC ^ 0x86);
        u.llIlIIIIll[60] = 3 + 34 - -92 + 8 ^ 25 + 108 - 54 + 83;
        u.llIlIIIIll[61] = 0x78 ^ 0x4A ^ (0x79 ^ 0x67);
        u.llIlIIIIll[62] = 0x51 ^ 0xE ^ (0x1C ^ 0x6E);
        u.llIlIIIIll[63] = 141 + 102 - 187 + 103 ^ 54 + 116 - 110 + 117;
        u.llIlIIIIll[64] = 0x51 ^ 0x7E;
        u.llIlIIIIll[65] = 0xA1 ^ 0x91;
        u.llIlIIIIll[66] = 0x7E ^ 0x4F;
        u.llIlIIIIll[67] = 0xF5 ^ 0xC6;
        u.llIlIIIIll[68] = 0x9D ^ 0xA9;
        u.llIlIIIIll[69] = 78 + 65 - 92 + 76 ^ (0xF1 ^ 0xBB);
        u.llIlIIIIll[70] = 0x46 ^ 0x70;
        u.llIlIIIIll[71] = 0xB4 ^ 0x83;
        u.llIlIIIIll[72] = 0x50 ^ 0x68;
        u.llIlIIIIll[73] = 0x36 ^ 0x6F ^ (0x5E ^ 0x3E);
        u.llIlIIIIll[74] = 110 + 117 - 161 + 87 ^ 25 + 82 - -22 + 34;
        u.llIlIIIIll[75] = 0x5D ^ 0x6E ^ (0x5B ^ 0x53);
        u.llIlIIIIll[76] = 0x9A ^ 0xA6;
        u.llIlIIIIll[77] = 0x39 ^ 0x1D ^ (0x15 ^ 0xC);
        u.llIlIIIIll[78] = 175 + 90 - 154 + 144 ^ 22 + 108 - 120 + 183;
        u.llIlIIIIll[79] = 0xE6 ^ 0xB6 ^ (0xDD ^ 0xB2);
        u.llIlIIIIll[80] = 204 + 99 - 212 + 156 ^ 103 + 11 - 103 + 172;
        u.llIlIIIIll[81] = -(0x3D ^ 0x2B) & (0xFFFFE33D & 0x3FFF);
        u.llIlIIIIll[82] = 0xFFFFAB8E & 0x57F5;
        u.llIlIIIIll[83] = 0xFFFFBECE & 0x6FFD;
        u.llIlIIIIll[84] = -(0xFFFF9FFE & 0x7459) & (0xFFFFFFFF & 0x75FF);
        u.llIlIIIIll[85] = 220 + 220 - 413 + 195 ^ 25 + 140 - 18 + 39;
        u.llIlIIIIll[86] = 0x21 ^ 0x6F ^ (0x7E ^ 0x72);
        u.llIlIIIIll[87] = 0xC ^ 0x78 ^ (0x36 ^ 1);
        u.llIlIIIIll[88] = 0xFFFFDC4D & 0x2FBF;
        u.llIlIIIIll[89] = 0xFFFFEEF3 & 0x1DBF;
        u.llIlIIIIll[90] = 0xFFFF8FDE & 0x7BFD;
        u.llIlIIIIll[91] = -(0xFFFFFB57 & 0x46A9) & (0xFFFFDEDE & 0x6FFF);
        u.llIlIIIIll[92] = -(0xFFFFB8BF & 0x6751) & (0xFFFFAF5C & 0x7CFF);
        u.llIlIIIIll[93] = 0xFFFFED3B & 0x1FD7;
        u.llIlIIIIll[94] = 0xFFFFFDBB & 0xE57;
        u.llIlIIIIll[95] = 0xFFFFECE9 & 0x1FD7;
        u.llIlIIIIll[96] = 41 + 224 - 188 + 150 ^ 10 + 89 - -54 + 14;
        u.llIlIIIIll[97] = 161 + 60 - 150 + 167 ^ 169 + 141 - 235 + 96;
        u.llIlIIIIll[98] = 0x40 ^ 6;
        u.llIlIIIIll[99] = 0x6B ^ 0x2C;
        u.llIlIIIIll[100] = 159 + 117 - 125 + 100 ^ 139 + 72 - 39 + 7;
    }

    public static void aX() {
        block63: {
            block64: {
                block65: {
                    if (u.lIllIIIIIlIll(bt ? 1 : 0)) {
                        b.a(bv);
                        if (u.lIllIIIIIllII(bv.size(), llIlIIIIll[0])) {
                            System.out.println(llIlIIIIIl[llIlIIIIll[1]]);
                            bt = llIlIIIIll[1];
                        }
                    }
                    if (!u.lIllIIIIIllIl(bt ? 1 : 0)) break block63;
                    if (u.lIllIIIIIllIl(u.an() ? 1 : 0) && u.lIllIIIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation var11 = BankLocation.getNearest();
                        if (u.lIllIIIIIlllI(var11) && u.lIllIIIIIllIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[0]];
                            a.a(var11);
                        }
                        if (u.lIllIIIIIlllI(var11) && u.lIllIIIIIlIll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIllIIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIll[2]);
                                0;
                            }
                            if (u.lIllIIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[3]];
                                if (u.lIllIIIIIllll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIIIIll[4]);
                                    0;
                                }
                                if (u.lIllIIIIIllll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIIIIll[3]);
                                    0;
                                }
                                int[] nArray = new int[llIlIIIIll[5]];
                                nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
                                nArray[u.llIlIIIIll[0]] = llIlIIIIll[7];
                                nArray[u.llIlIIIIll[3]] = llIlIIIIll[8];
                                nArray[u.llIlIIIIll[9]] = llIlIIIIll[10];
                                nArray[u.llIlIIIIll[4]] = llIlIIIIll[11];
                                nArray[u.llIlIIIIll[12]] = llIlIIIIll[13];
                                if (u.lIllIIIIIllIl(e.c(nArray) ? 1 : 0)) {
                                    u.Q();
                                    System.out.println(llIlIIIIIl[llIlIIIIll[9]]);
                                    bt = llIlIIIIll[0];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIIIIll[5]];
                                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[6];
                                nArray2[u.llIlIIIIll[0]] = llIlIIIIll[7];
                                nArray2[u.llIlIIIIll[3]] = llIlIIIIll[8];
                                nArray2[u.llIlIIIIll[9]] = llIlIIIIll[10];
                                nArray2[u.llIlIIIIll[4]] = llIlIIIIll[11];
                                nArray2[u.llIlIIIIll[12]] = llIlIIIIll[13];
                                if (u.lIllIIIIIlIll(e.c(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIlIIIIll[3]];
                                    nArray3[u.llIlIIIIll[1]] = llIlIIIIll[8];
                                    nArray3[u.llIlIIIIll[0]] = llIlIIIIll[10];
                                    a.a(nArray3);
                                    a.a(llIlIIIIll[6], llIlIIIIll[14]);
                                    a.a(llIlIIIIll[7], llIlIIIIll[14]);
                                    a.a(llIlIIIIll[15], llIlIIIIll[14]);
                                    a.b(f.aW, llIlIIIIll[0]);
                                    a.a(llIlIIIIll[11], llIlIIIIll[4]);
                                    a.a(llIlIIIIll[13], llIlIIIIll[16]);
                                }
                            }
                        }
                    }
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && u.lIllIIIIIllII(Movement.getRunEnergy(), llIlIIIIll[17])) {
                        Inventory.getFirst((int[])f.ba).interact(llIlIIIIIl[llIlIIIIll[4]]);
                        Time.sleepTicks((int)llIlIIIIll[0]);
                        0;
                    }
                    if (u.lIllIIIIIlIll(u.an() ? 1 : 0) && u.lIllIIIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                            if (u.lIllIIIIIlIll(Inventory.contains((int[])f.aW) ? 1 : 0) && u.lIllIIIIIllIl(Equipment.contains((int[])f.aW) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aW).interact(llIlIIIIIl[llIlIIIIll[12]]);
                            }
                            if (u.lIllIIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[5]];
                            Movement.walkTo((WorldPoint)de);
                            0;
                            Time.sleepTicks((int)llIlIIIIll[0]);
                            0;
                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[18]];
                            di = llIlIIIIll[1];
                            if (u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIlIIIIll[0]];
                                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[16]];
                                TileObjects.getNearest((String[])stringArray).interact(llIlIIIIIl[llIlIIIIll[19]]);
                                Time.sleepTicks((int)llIlIIIIll[3]);
                                0;
                            }
                            g.a(cE);
                        }
                    }
                    if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[12])) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[14]];
                            Movement.walkTo((WorldPoint)df);
                            0;
                            Time.sleepTicks((int)llIlIIIIll[0]);
                            0;
                            if (u.lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[22]];
                                e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                                Time.sleepTicks((int)llIlIIIIll[5]);
                                0;
                            }
                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[25]];
                            g.a(llIlIIIIIl[llIlIIIIll[26]], cE, llIlIIIIll[0]);
                        }
                    }
                    if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[14])) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[27]];
                            Movement.walkTo((WorldPoint)dg);
                            0;
                            Time.sleepTicks((int)llIlIIIIll[0]);
                            0;
                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                            int[] nArray = new int[llIlIIIIll[0]];
                            nArray[u.llIlIIIIll[1]] = llIlIIIIll[8];
                            if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[llIlIIIIll[0]];
                                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[8];
                                String[] stringArray = new String[llIlIIIIll[0]];
                                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)llIlIIIIll[3]);
                                0;
                            }
                        }
                    }
                    if (!u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[28])) break block64;
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[10];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[llIlIIIIll[0]];
                        nArray5[u.llIlIIIIll[1]] = llIlIIIIll[10];
                        Inventory.getFirst((int[])nArray5).interact(llIlIIIIIl[llIlIIIIll[29]]);
                    }
                    if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                        String[] stringArray = new String[llIlIIIIll[0]];
                        stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[30]];
                        TileObjects.getNearest((String[])stringArray).interact(llIlIIIIIl[llIlIIIIll[31]]);
                        Time.sleepTicks((int)llIlIIIIll[9]);
                        0;
                    }
                    if (!u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIlIIIIll[32], llIlIIIIll[33])), llIlIIIIll[34])) break block65;
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[35]];
                    if (!u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[llIlIIIIll[0]];
                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[36]];
                if (u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                    if (u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                        String[] stringArray2 = new String[llIlIIIIll[0]];
                        stringArray2[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[38]];
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), llIlIIIIll[14])) {
                            String[] stringArray3 = new String[llIlIIIIll[0]];
                            stringArray3[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[39]];
                            if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[40]];
                                String[] stringArray4 = new String[llIlIIIIll[0]];
                                stringArray4[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(llIlIIIIIl[llIlIIIIll[42]]);
                                Time.sleepTicks((int)llIlIIIIll[14]);
                                0;
                            }
                        }
                    }
                    String[] stringArray5 = new String[llIlIIIIll[0]];
                    stringArray5[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[43]];
                    if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray5)) && u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[44]];
                        String[] stringArray6 = new String[llIlIIIIll[0]];
                        stringArray6[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(llIlIIIIIl[llIlIIIIll[46]]);
                        Time.sleepTicks((int)llIlIIIIll[12]);
                        0;
                        g.a(cE);
                    }
                    g.a(cE);
                }
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[36])) {
                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[47]];
                g.a(llIlIIIIIl[llIlIIIIll[48]], cE);
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[42])) {
                if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[49]];
                    if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[llIlIIIIll[0]];
                        stringArray7[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[50]];
                        if (u.lIllIIIIIllIl(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIlIIIIll[0]];
                            stringArray8[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[51]];
                            if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[llIlIIIIll[0]];
                                stringArray9[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[52]];
                                Inventory.getFirst((String[])stringArray9).interact(llIlIIIIIl[llIlIIIIll[53]]);
                            }
                        }
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[54]];
                        Movement.walkTo((WorldPoint)dg);
                        0;
                        Time.sleepTicks((int)llIlIIIIll[0]);
                        0;
                    }
                }
                if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[55]];
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[56]];
                    if (u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[llIlIIIIll[0]];
                        stringArray10[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(llIlIIIIIl[llIlIIIIll[58]]);
                        Time.sleepTicks((int)llIlIIIIll[9]);
                        0;
                    }
                }
                if (u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[59]];
                    if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIlIIIIll[18])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[60]];
                        String[] stringArray11 = new String[llIlIIIIll[0]];
                        stringArray11[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIlIIIIIl[llIlIIIIll[62]]);
                        Time.sleepTicks((int)llIlIIIIll[14]);
                        0;
                    }
                }
                if (u.lIllIIIIlIIll(Players.getLocal().getInteracting()) && u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[63]];
                    if (u.lIllIIIIIllIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[llIlIIIIll[0]];
                        stringArray12[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[64]];
                        if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[llIlIIIIll[0]];
                            stringArray13[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[65]];
                            Inventory.getFirst((String[])stringArray13).interact(llIlIIIIIl[llIlIIIIll[66]]);
                        }
                    }
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[10];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIIIIll[0]];
                        nArray6[u.llIlIIIIll[1]] = llIlIIIIll[10];
                        if (u.lIllIIIIIllIl(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIlIIIIll[0]];
                            nArray7[u.llIlIIIIll[1]] = llIlIIIIll[10];
                            Inventory.getFirst((int[])nArray7).interact(llIlIIIIIl[llIlIIIIll[34]]);
                        }
                    }
                    String[] stringArray14 = new String[llIlIIIIll[0]];
                    stringArray14[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[67]];
                    NPCs.getNearest((String[])stringArray14).interact(llIlIIIIIl[llIlIIIIll[68]]);
                    Time.sleepTicks((int)llIlIIIIll[0]);
                    0;
                }
                if (u.lIllIIIIlIlII(u.lIllIIIIIlIlI(e.w(), 60.0))) {
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[13];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIlIIIIll[0]];
                        nArray8[u.llIlIIIIll[1]] = llIlIIIIll[13];
                        Inventory.getFirst((int[])nArray8).interact(llIlIIIIIl[llIlIIIIll[69]]);
                        Time.sleepTicks((int)llIlIIIIll[0]);
                        0;
                    }
                }
                g.a(cE);
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[47])) {
                String[] stringArray = new String[llIlIIIIll[0]];
                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[70]];
                if (u.lIllIIIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[71]];
                    String[] stringArray15 = new String[llIlIIIIll[0]];
                    stringArray15[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(llIlIIIIIl[llIlIIIIll[73]]);
                    Time.sleepTicks((int)llIlIIIIll[4]);
                    0;
                }
                String[] stringArray16 = new String[llIlIIIIll[0]];
                stringArray16[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[74]];
                if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[75]];
                        Movement.walkTo((WorldPoint)df);
                        0;
                        Time.sleepTicks((int)llIlIIIIll[0]);
                        0;
                        if (u.lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[76]];
                            e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                            Time.sleepTicks((int)llIlIIIIll[5]);
                            0;
                        }
                    }
                    if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[77]];
                        g.a(llIlIIIIIl[llIlIIIIll[78]], cE, llIlIIIIll[0]);
                    }
                }
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[52])) {
                if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[79]];
                    Movement.walkTo((WorldPoint)dh);
                    0;
                    Time.sleepTicks((int)llIlIIIIll[0]);
                    0;
                }
                if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[80]];
                    if (u.lIllIIIIIllII(di, llIlIIIIll[0])) {
                        aN.sB += llIlIIIIll[0];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIIIll[0];
                        aN.sB = llIlIIIIll[1];
                        dj = llIlIIIIll[1];
                    }
                    g.a(llIlIIIIIl[llIlIIIIll[17]], cE);
                }
            }
        }
    }

    private static boolean lIllIIIIlIlII(int n2) {
        return n2 < 0;
    }

    private static String lIlIllllllllI(String var18, String var13) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIlIIIIll[16]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llIlIIIIll[3], var22);
            return new String(var12.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIIlIIll(Object object) {
        return object == null;
    }

    private static String lIlIlllllllII(String var2, String var16) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var5 = var16.toCharArray();
        int var20 = llIlIIIIll[1];
        char[] var14 = var2.toCharArray();
        int var19 = var14.length;
        int var7 = llIlIIIIll[1];
        while (u.lIllIIIIIllII(var7, var19)) {
            char var4 = var14[var7];
            var21.append((char)(var4 ^ var5[var20 % var5.length]));
            0;
            ++var20;
            ++var7;
            0;
            if ((0x81 ^ 0x84) > 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[llIlIIIIll[0]];
                nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
                if (!u.lIllIIIIIllll(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[llIlIIIIll[0]];
                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[8];
                if (!u.lIllIIIIIllll(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[llIlIIIIll[0]];
                nArray3[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (!u.lIllIIIIlIlIl(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[llIlIIIIll[0]];
                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (!u.lIllIIIIIlIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[llIlIIIIll[0]];
            nArray[u.llIlIIIIll[1]] = llIlIIIIll[13];
            if (u.lIllIIIIIllll(Inventory.getCount((int[])nArray))) {
                n2 = llIlIIIIll[0];
                0;
                if ((0x7B ^ 0x44 ^ (0x42 ^ 0x79)) >= (23 + 129 - 1 + 0 ^ 102 + 105 - 156 + 96)) return n2 != 0;
                return ((0xA9 ^ 0x87 ^ (0x76 ^ 0x79)) & (7 + 18 - -3 + 140 ^ 52 + 44 - 21 + 62 ^ -1)) != 0;
            }
        }
        n2 = llIlIIIIll[1];
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return llIlIIIIIl[llIlIIIIll[86]];
    }

    private static int lIllIIIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void Q() {
        d var17;
        block10: {
            block9: {
                Object var8;
                int[] nArray = new int[llIlIIIIll[0]];
                nArray[u.llIlIIIIll[1]] = llIlIIIIll[8];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIlIIIIll[8], llIlIIIIll[0], llIlIIIIll[81]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIlIIIIll[0]];
                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var8 = new d(llIlIIIIll[10], llIlIIIIll[0], llIlIIIIll[81]);
                    bv.add((d)var8);
                    0;
                }
                int[] nArray3 = new int[llIlIIIIll[0]];
                nArray3[u.llIlIIIIll[1]] = llIlIIIIll[13];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var8 = new d(llIlIIIIll[13], llIlIIIIll[50], llIlIIIIll[82]);
                    bv.add((d)var8);
                    0;
                }
                int[] nArray4 = new int[llIlIIIIll[0]];
                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[11];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var8 = new d(llIlIIIIll[11], llIlIIIIll[12], j.cf);
                    bv.add((d)var8);
                    0;
                }
                if (u.lIllIIIIIllIl(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(llIlIIIIIl[llIlIIIIll[87]]))) ? 1 : 0)) {
                    var17 = new d(llIlIIIIll[83], llIlIIIIll[12], llIlIIIIll[84]);
                    bv.add(var17);
                    0;
                }
                int[] nArray5 = new int[llIlIIIIll[0]];
                nArray5[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llIlIIIIll[0]];
                nArray6[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llIlIIIIll[0]];
                nArray7[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIllII(Bank.getFirst((int[])nArray7).getQuantity(), llIlIIIIll[12])) break block10;
            }
            var17 = new d(llIlIIIIll[7], llIlIIIIll[28], llIlIIIIll[82]);
            bv.add(var17);
            0;
        }
        int[] nArray = new int[llIlIIIIll[0]];
        nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
        if (u.lIllIIIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var17 = new d(llIlIIIIll[6], llIlIIIIll[57], llIlIIIIll[82]);
            bv.add(var17);
            0;
        }
    }

    private static void lIllIIIIIlIII() {
        llIlIIIIIl = new String[llIlIIIIll[100]];
        u.llIlIIIIIl[u.llIlIIIIll[1]] = u."Finished buying items, switching back to quest";
        u.llIlIIIIIl[u.llIlIIIIll[0]] = u."Nav to bank";
        u.llIlIIIIIl[u.llIlIIIIll[3]] = u."Handling banking";
        u.llIlIIIIIl[u.llIlIIIIll[9]] = u."We are missing quest supplies, switching to BUYING";
        u.llIlIIIIIl[u.llIlIIIIll[4]] = u."Drink";
        u.llIlIIIIIl[u.llIlIIIIll[12]] = u."Wear";
        u.llIlIIIIIl[u.llIlIIIIll[5]] = u."Nav to start";
        u.llIlIIIIIl[u.llIlIIIIll[18]] = u."Starting quest";
        u.llIlIIIIIl[u.llIlIIIIll[16]] = u."Notice board";
        u.llIlIIIIIl[u.llIlIIIIll[19]] = u."Check";
        u.llIlIIIIIl[u.llIlIIIIll[14]] = u."Nav to sarah";
        u.llIlIIIIIl[u.llIlIIIIll[22]] = u."Stuck, clicking out";
        u.llIlIIIIIl[u.llIlIIIIll[25]] = u."Talking sarah";
        u.llIlIIIIIl[u.llIlIIIIll[26]] = u."Sarah";
        u.llIlIIIIIl[u.llIlIIIIll[27]] = u."Nav to hole";
        u.llIlIIIIIl[u.llIlIIIIll[28]] = u."Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[29]] = u."Wield";
        u.llIlIIIIIl[u.llIlIIIIll[30]] = u."Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[31]] = u."Climb-down";
        u.llIlIIIIIl[u.llIlIIIIll[35]] = u."Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[36]] = u."Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[38]] = u."Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[39]] = u."Pig Thing";
        u.llIlIIIIIl[u.llIlIIIIll[40]] = u."Climb over blockage";
        u.llIlIIIIIl[u.llIlIIIIll[41]] = u."Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[42]] = u."Climb-over";
        u.llIlIIIIIl[u.llIlIIIIll[43]] = u."Pig Thing";
        u.llIlIIIIIl[u.llIlIIIIll[44]] = u."Interact skele";
        u.llIlIIIIIl[u.llIlIIIIll[45]] = u."Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[46]] = u."Investigate";
        u.llIlIIIIIl[u.llIlIIIIll[47]] = u."Interacting Spira";
        u.llIlIIIIIl[u.llIlIIIIll[48]] = u."Spria";
        u.llIlIIIIIl[u.llIlIIIIll[49]] = u."Sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[50]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[51]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[52]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[53]] = u."Wear";
        u.llIlIIIIIl[u.llIlIIIIll[54]] = u."Nav to hole";
        u.llIlIIIIIl[u.llIlIIIIll[55]] = u."Climb down hole";
        u.llIlIIIIIl[u.llIlIIIIll[56]] = u."Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[57]] = u."Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[58]] = u."Climb-down";
        u.llIlIIIIIl[u.llIlIIIIll[59]] = u."Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[60]] = u."Climb over blockage";
        u.llIlIIIIIl[u.llIlIIIIll[61]] = u."Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[62]] = u."Climb-over";
        u.llIlIIIIIl[u.llIlIIIIll[63]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[64]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[65]] = u."Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[66]] = u."Wear";
        u.llIlIIIIIl[u.llIlIIIIll[34]] = u."Wield";
        u.llIlIIIIIl[u.llIlIIIIll[67]] = u."Sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[68]] = u."Attack";
        u.llIlIIIIIl[u.llIlIIIIll[69]] = u."Eat";
        u.llIlIIIIIl[u.llIlIIIIll[70]] = u."Sourhog foot";
        u.llIlIIIIIl[u.llIlIIIIll[71]] = u."Cutting foot";
        u.llIlIIIIIl[u.llIlIIIIll[72]] = u."Dead sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[73]] = u."Cut-foot";
        u.llIlIIIIIl[u.llIlIIIIll[74]] = u."Sourhog foot";
        u.llIlIIIIIl[u.llIlIIIIll[75]] = u."Nav to sarah";
        u.llIlIIIIIl[u.llIlIIIIll[76]] = u."Stuck, clicking out";
        u.llIlIIIIIl[u.llIlIIIIll[77]] = u."Talking sarah";
        u.llIlIIIIIl[u.llIlIIIIll[78]] = u."Sarah";
        u.llIlIIIIIl[u.llIlIIIIll[79]] = u."Nav to Spria";
        u.llIlIIIIIl[u.llIlIIIIll[80]] = u."Talking spria";
        u.llIlIIIIIl[u.llIlIIIIll[17]] = u."Spria";
        u.llIlIIIIIl[u.llIlIIIIll[86]] = u."A porceline of interest";
        u.llIlIIIIIl[u.llIlIIIIll[87]] = u."ring of wealth (";
        u.llIlIIIIIl[u.llIlIIIIll[96]] = u."Yes.";
        u.llIlIIIIIl[u.llIlIIIIll[97]] = u."Talk about the bounty.";
        u.llIlIIIIIl[u.llIlIIIIll[98]] = u."I think that'll be all for now.";
        u.llIlIIIIIl[u.llIlIIIIll[99]] = u."Yes";
    }

    private static String lIlIlllllllIl(String var9, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llIlIIIIll[3], var10);
            return new String(var15.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            u.aX();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llIlIIIIll[85];
    }

    private static boolean lIllIIIIlIlIl(int n2) {
        return n2 <= 0;
    }
}

