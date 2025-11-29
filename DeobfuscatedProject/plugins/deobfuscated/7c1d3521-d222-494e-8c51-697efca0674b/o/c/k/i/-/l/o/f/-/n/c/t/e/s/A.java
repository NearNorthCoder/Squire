/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aD;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;

public class A
implements ac {
    public static final /* synthetic */ WorldPoint el;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint ee;
    private static /* synthetic */ int[] llIIllIlII;
    public static final /* synthetic */ WorldPoint ej;
    private static /* synthetic */ String[] cE;
    static /* synthetic */ int di;
    static /* synthetic */ WorldArea en;
    private static /* synthetic */ String[] llIIllIIIl;
    public static final /* synthetic */ WorldPoint ef;
    public static final /* synthetic */ WorldPoint eh;
    public static final /* synthetic */ WorldPoint ei;
    public static final /* synthetic */ WorldPoint ed;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int em;
    public static final /* synthetic */ WorldPoint ek;
    public static final /* synthetic */ WorldPoint eg;
    static /* synthetic */ boolean dj;

    private static boolean lIlIllIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIllIIIl[llIIllIlII[86]];
    }

    private static boolean lIlIllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            A.bw();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0xFB ^ 0xB8) & ~(0x5B ^ 0x18);
        }
        return llIIllIlII[85];
    }

    private static boolean lIlIllIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlllII(int n2) {
        return n2 > 0;
    }

    static {
        A.lIlIllIIlIllI();
        A.lIlIllIIlIlIl();
        ed = new WorldPoint(llIIllIlII[91], llIIllIlII[92], llIIllIlII[1]);
        ee = new WorldPoint(llIIllIlII[93], llIIllIlII[94], llIIllIlII[1]);
        ef = new WorldPoint(llIIllIlII[95], llIIllIlII[96], llIIllIlII[1]);
        eg = new WorldPoint(llIIllIlII[97], llIIllIlII[98], llIIllIlII[1]);
        eh = new WorldPoint(llIIllIlII[99], llIIllIlII[100], llIIllIlII[1]);
        ei = new WorldPoint(llIIllIlII[101], llIIllIlII[102], llIIllIlII[1]);
        ej = new WorldPoint(llIIllIlII[103], llIIllIlII[104], llIIllIlII[1]);
        ek = new WorldPoint(llIIllIlII[91], llIIllIlII[105], llIIllIlII[1]);
        el = new WorldPoint(llIIllIlII[106], llIIllIlII[107], llIIllIlII[1]);
        bv = new ArrayList<d>();
        em = llIIllIlII[30];
        en = new WorldArea(llIIllIlII[93], llIIllIlII[108], llIIllIlII[26], llIIllIlII[47], llIIllIlII[1]);
        String[] stringArray = new String[llIIllIlII[11]];
        stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[109]];
        stringArray[A.llIIllIlII[0]] = llIIllIIIl[llIIllIlII[110]];
        stringArray[A.llIIllIlII[5]] = llIIllIIIl[llIIllIlII[111]];
        cE = stringArray;
    }

    private static String lIlIllIIIIIll(String llllllllllllllllllIIllIllIllIllI, String llllllllllllllllllIIllIllIllIlIl) {
        llllllllllllllllllIIllIllIllIllI = new String(Base64.getDecoder().decode(llllllllllllllllllIIllIllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIllIllIllIlII = new StringBuilder();
        char[] llllllllllllllllllIIllIllIllIIll = llllllllllllllllllIIllIllIllIlIl.toCharArray();
        int llllllllllllllllllIIllIllIllIIlI = llIIllIlII[1];
        char[] llllllllllllllllllIIllIllIlIllII = llllllllllllllllllIIllIllIllIllI.toCharArray();
        int llllllllllllllllllIIllIllIlIlIll = llllllllllllllllllIIllIllIlIllII.length;
        int llllllllllllllllllIIllIllIlIlIlI = llIIllIlII[1];
        while (A.lIlIllIIllIII(llllllllllllllllllIIllIllIlIlIlI, llllllllllllllllllIIllIllIlIlIll)) {
            char llllllllllllllllllIIllIllIllIlll = llllllllllllllllllIIllIllIlIllII[llllllllllllllllllIIllIllIlIlIlI];
            llllllllllllllllllIIllIllIllIlII.append((char)(llllllllllllllllllIIllIllIllIlll ^ llllllllllllllllllIIllIllIllIIll[llllllllllllllllllIIllIllIllIIlI % llllllllllllllllllIIllIllIllIIll.length]));
            0;
            ++llllllllllllllllllIIllIllIllIIlI;
            ++llllllllllllllllllIIllIllIlIlIlI;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIllIllIllIlII);
    }

    private static boolean lIlIllIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIIIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llllllllllllllllllIIllIlllIIlIlI;
        int[] nArray = new int[llIIllIlII[12]];
        nArray[A.llIIllIlII[1]] = llIIllIlII[13];
        nArray[A.llIIllIlII[0]] = llIIllIlII[7];
        nArray[A.llIIllIlII[5]] = llIIllIlII[10];
        nArray[A.llIIllIlII[11]] = llIIllIlII[14];
        nArray[A.llIIllIlII[6]] = llIIllIlII[15];
        nArray[A.llIIllIlII[16]] = llIIllIlII[17];
        int[] nArray2 = nArray;
        int llllllllllllllllllIIllIlllIIlIIl = llIIllIlII[1];
        while (A.lIlIllIIllIII(llllllllllllllllllIIllIlllIIlIIl, ((void)llllllllllllllllllIIllIlllIIlIlI).length)) {
            int[] nArray3 = new int[llIIllIlII[0]];
            nArray3[A.llIIllIlII[1]] = llllllllllllllllllIIllIlllIIlIlI[llllllllllllllllllIIllIlllIIlIIl];
            if (A.lIlIllIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIllIlII[1];
            }
            ++llllllllllllllllllIIllIlllIIlIIl;
            0;
            if ((0x8C ^ 0x88) > 1) continue;
            return ((0x72 ^ 0x61) & ~(0xAC ^ 0xBF)) != 0;
        }
        return llIIllIlII[0];
    }

    private static boolean lIlIllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIllIll(Object object) {
        return object != null;
    }

    private static void Q() {
        block35: {
            d llllllllllllllllllIIllIlllIIIlIl;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object llllllllllllllllllIIllIlllIIIllI;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[llIIllIlII[0]];
                                                                nArray[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[llIIllIlII[0]];
                                                                nArray2[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[llIIllIlII[0]];
                                                                nArray3[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray3).getQuantity(), llIIllIlII[8])) break block23;
                                                            }
                                                            llllllllllllllllllIIllIlllIIIllI = new d(llIIllIlII[9], llIIllIlII[8], llIIllIlII[18]);
                                                            bv.add((d)llllllllllllllllllIIllIlllIIIllI);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIIllIlII[0]];
                                                        nArray[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[llIIllIlII[0]];
                                                        nArray4[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[llIIllIlII[0]];
                                                        nArray5[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray5).getQuantity(), llIIllIlII[8])) break block25;
                                                    }
                                                    llllllllllllllllllIIllIlllIIIllI = new d(llIIllIlII[7], llIIllIlII[8], llIIllIlII[18]);
                                                    bv.add((d)llllllllllllllllllIIllIlllIIIllI);
                                                    0;
                                                }
                                                int[] nArray = new int[llIIllIlII[0]];
                                                nArray[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[llIIllIlII[0]];
                                                nArray6[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[llIIllIlII[0]];
                                                nArray7[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray7).getQuantity(), llIIllIlII[8])) break block27;
                                            }
                                            llllllllllllllllllIIllIlllIIIllI = new d(llIIllIlII[10], llIIllIlII[8], llIIllIlII[18]);
                                            bv.add((d)llllllllllllllllllIIllIlllIIIllI);
                                            0;
                                        }
                                        int[] nArray = new int[llIIllIlII[0]];
                                        nArray[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[llIIllIlII[0]];
                                        nArray8[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[llIIllIlII[0]];
                                        nArray9[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray9).getQuantity(), llIIllIlII[28])) break block29;
                                    }
                                    llllllllllllllllllIIllIlllIIIllI = new d(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]);
                                    bv.add((d)llllllllllllllllllIIllIlllIIIllI);
                                    0;
                                }
                                if (A.lIlIllIIllIIl(Bank.contains((Predicate)(llllllllllllllllllIIllIlllIIIllI = item -> item.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]))) ? 1 : 0)) {
                                    llllllllllllllllllIIllIlllIIIlIl = new d(llIIllIlII[81], llIIllIlII[16], llIIllIlII[82]);
                                    bv.add(llllllllllllllllllIIllIlllIIIlIl);
                                    0;
                                }
                                int[] nArray = new int[llIIllIlII[0]];
                                nArray[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[llIIllIlII[0]];
                                nArray10[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[llIIllIlII[0]];
                                nArray11[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray11).getQuantity(), llIIllIlII[6])) break block31;
                            }
                            llllllllllllllllllIIllIlllIIIlIl = new d(llIIllIlII[14], llIIllIlII[6], j.cf);
                            bv.add(llllllllllllllllllIIllIlllIIIlIl);
                            0;
                        }
                        int[] nArray = new int[llIIllIlII[0]];
                        nArray[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[llIIllIlII[0]];
                        nArray12[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[llIIllIlII[0]];
                        nArray13[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray13).getQuantity(), llIIllIlII[5])) break block33;
                    }
                    llllllllllllllllllIIllIlllIIIlIl = new d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]);
                    bv.add(llllllllllllllllllIIllIlllIIIlIl);
                    0;
                }
                int[] nArray = new int[llIIllIlII[0]];
                nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[llIIllIlII[0]];
                nArray14[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[llIIllIlII[0]];
                nArray15[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray15).getQuantity(), llIIllIlII[28])) break block35;
            }
            llllllllllllllllllIIllIlllIIIlIl = new d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]);
            bv.add(llllllllllllllllllIIllIlllIIIlIl);
            0;
        }
    }

    @Override
    public boolean ae() {
        return llIIllIlII[1];
    }

    private static void lIlIllIIlIllI() {
        llIIllIlII = new int[113];
        A.llIIllIlII[0] = 1;
        A.llIIllIlII[1] = (0xA ^ 0x24 ^ (0xDF ^ 0xA6)) & (0x4A ^ 0x25 ^ (0xB4 ^ 0x8C) ^ -1);
        A.llIIllIlII[2] = 0x69 ^ 0x41 ^ (0x69 ^ 0x6C);
        A.llIIllIlII[3] = 0x81 ^ 0x99 ^ (0xD1 ^ 0xC4);
        A.llIIllIlII[4] = 0xFFFFF798 & 0x1BEF;
        A.llIIllIlII[5] = 2;
        A.llIIllIlII[6] = 96 + 4 - 36 + 97 ^ 19 + 67 - -49 + 30;
        A.llIIllIlII[7] = -(0xFFFFFF67 & 0x2DD9) & (0xFFFFBFFE & 0x6F6F);
        A.llIIllIlII[8] = 0xFFFFDBFE & 0x27E9;
        A.llIIllIlII[9] = 0xFFFFAB6F & 0x56BD;
        A.llIIllIlII[10] = 0xFFFF8BAE & 0x767B;
        A.llIIllIlII[11] = 3;
        A.llIIllIlII[12] = 65 + 158 - 100 + 42 ^ 1 + 121 - 98 + 139;
        A.llIIllIlII[13] = -(0x89 ^ 0xA8) & (0xFFFFBFFF & 0x5F67);
        A.llIIllIlII[14] = 0xFFFFF7DB & 0x3975;
        A.llIIllIlII[15] = 0xFFFFCDBB & 0x33C5;
        A.llIIllIlII[16] = 0x10 ^ 0x15;
        A.llIIllIlII[17] = -(0xFFFFA6F3 & 0x7B6E) & (0xFFFFEBFF & 0x3FE3);
        A.llIIllIlII[18] = 0xA6 ^ 0xAC;
        A.llIIllIlII[19] = 0xFFFF97E7 & 0x6BFB;
        A.llIIllIlII[20] = 0xF5 ^ 0xC7;
        A.llIIllIlII[21] = 0x2B ^ 0x36 ^ (0xA8 ^ 0xAC);
        A.llIIllIlII[22] = 55 + 18 - -8 + 74 ^ 40 + 128 - 70 + 58;
        A.llIIllIlII[23] = 30 + 131 - 143 + 148 ^ 46 + 15 - -86 + 27;
        A.llIIllIlII[24] = 133 + 130 - 122 + 11 ^ 108 + 44 - 16 + 9;
        A.llIIllIlII[25] = 34 + 23 - -41 + 55 ^ 138 + 41 - 107 + 74;
        A.llIIllIlII[26] = 0xEB ^ 0x8B ^ (0xAA ^ 0xC6);
        A.llIIllIlII[27] = 0x92 ^ 0x9C;
        A.llIIllIlII[28] = 0x5B ^ 0x54;
        A.llIIllIlII[29] = 0x68 ^ 0x78;
        A.llIIllIlII[30] = 0xD3 ^ 0xC2;
        A.llIIllIlII[31] = 0xA2 ^ 0xB0;
        A.llIIllIlII[32] = 0x73 ^ 0x60;
        A.llIIllIlII[33] = 0x5A ^ 0x4E;
        A.llIIllIlII[34] = 35 + 134 - 130 + 105 ^ 68 + 28 - 8 + 45;
        A.llIIllIlII[35] = 0xC ^ 0x1A;
        A.llIIllIlII[36] = 209 + 68 - 218 + 155 ^ 47 + 16 - 30 + 160;
        A.llIIllIlII[37] = 0x68 ^ 0x70;
        A.llIIllIlII[38] = 0x78 ^ 0x33;
        A.llIIllIlII[39] = 0x24 ^ 0x6E;
        A.llIIllIlII[40] = 0x12 ^ 8;
        A.llIIllIlII[41] = 120 + 215 - 310 + 191 ^ 43 + 33 - -38 + 81;
        A.llIIllIlII[42] = 0x97 ^ 0x8B;
        A.llIIllIlII[43] = 0xDB ^ 0x99 ^ (0x58 ^ 7);
        A.llIIllIlII[44] = 0x37 ^ 0x29;
        A.llIIllIlII[45] = 97 + 135 - 213 + 135 ^ 7 + 81 - 10 + 55;
        A.llIIllIlII[46] = 0x18 ^ 0x38;
        A.llIIllIlII[47] = 0xF7 ^ 0xAF ^ (0x45 ^ 0x3C);
        A.llIIllIlII[48] = 0x32 ^ 0x10;
        A.llIIllIlII[49] = 0xA1 ^ 0x82;
        A.llIIllIlII[50] = 4 ^ 0x20;
        A.llIIllIlII[51] = 0xAE ^ 0x8B;
        A.llIIllIlII[52] = 0x61 ^ 0x75 ^ (0x4C ^ 0x7E);
        A.llIIllIlII[53] = 0xB8 ^ 0x9F;
        A.llIIllIlII[54] = 0x67 ^ 0x4F;
        A.llIIllIlII[55] = 0x73 ^ 0x5A;
        A.llIIllIlII[56] = 0xC9 ^ 0xAB ^ (0xE2 ^ 0xAA);
        A.llIIllIlII[57] = 0x2F ^ 0x31 ^ (0xB9 ^ 0x8C);
        A.llIIllIlII[58] = 0x8A ^ 0xA6;
        A.llIIllIlII[59] = 0x3B ^ 0x15;
        A.llIIllIlII[60] = 0x70 ^ 0x21 ^ (0xF2 ^ 0x8C);
        A.llIIllIlII[61] = 0x19 ^ 0x29;
        A.llIIllIlII[62] = 132 + 38 - 20 + 33 ^ 113 + 74 - 100 + 47;
        A.llIIllIlII[63] = 0x49 ^ 0x54 ^ (0x82 ^ 0xAC);
        A.llIIllIlII[64] = 0x4C ^ 0x1B ^ (6 ^ 0x65);
        A.llIIllIlII[65] = 0x5D ^ 0x68;
        A.llIIllIlII[66] = 0x47 ^ 0x71;
        A.llIIllIlII[67] = 0x19 ^ 0x2E;
        A.llIIllIlII[68] = -(0xFFFFBD0F & 0x73F5) & (0xFFFFBD7E & 0x7FF5);
        A.llIIllIlII[69] = 0xFFFFADFB & 0x5FB7;
        A.llIIllIlII[70] = (0x14 ^ 0x54) + (0x28 ^ 0x6E) - (0x72 ^ 0x56) + (0xA6 ^ 0x92);
        A.llIIllIlII[71] = 0x17 ^ 0x2F;
        A.llIIllIlII[72] = 0x53 ^ 0x6A;
        A.llIIllIlII[73] = 0xFFFFCBD7 & 0x3DA8;
        A.llIIllIlII[74] = 0xFFFFDF27 & 0x2CDF;
        A.llIIllIlII[75] = 0x61 ^ 0xE;
        A.llIIllIlII[76] = 0x48 ^ 0x2D ^ (0x5D ^ 2);
        A.llIIllIlII[77] = 0xFFFFCDF7 & 0x3BA9;
        A.llIIllIlII[78] = 0xFFFFDC6B & 0x2F95;
        A.llIIllIlII[79] = 0xBA ^ 0x81;
        A.llIIllIlII[80] = -(0xFFFFFFB5 & 0x78CB) & (0xFFFFFFFF & 0x7DF8);
        A.llIIllIlII[81] = -(0xFFFFB5B2 & 0x5B7F) & (0xFFFFFFFF & 0x3FFD);
        A.llIIllIlII[82] = 0xFFFFF5FE & 0x6BA9;
        A.llIIllIlII[83] = -(0xFFFFD9F3 & 0x673F) & (0xFFFFFBFF & 0x77FA);
        A.llIIllIlII[84] = -(0xFFFFCC75 & 0x37FB) & (0xFFFF87F6 & 0x7FFD);
        A.llIIllIlII[85] = 100 + 8 - 16 + 103 ^ 109 + 57 - 87 + 88;
        A.llIIllIlII[86] = 102 + 2 - -61 + 26 ^ 91 + 20 - 50 + 70;
        A.llIIllIlII[87] = 92 + 114 - 118 + 95 ^ 135 + 123 - 121 + 1;
        A.llIIllIlII[88] = 0x23 ^ 0x1D;
        A.llIIllIlII[89] = 0x13 ^ 0x78 ^ (0x78 ^ 0x2C);
        A.llIIllIlII[90] = 0xC7 ^ 0x84 ^ 3;
        A.llIIllIlII[91] = -(0xFFFFFEF1 & 0x253F) & (0xFFFFAE3F & 0x7FF7);
        A.llIIllIlII[92] = -(0xFFFFF3C2 & 0x7CBF) & (0xFFFFFFFF & 0x7CFF);
        A.llIIllIlII[93] = 0xFFFFBEFC & 0x4B33;
        A.llIIllIlII[94] = -(0xFFFFF3A7 & 0x5CDB) & (0xFFFFFFF7 & 0x5CFF);
        A.llIIllIlII[95] = 0xFFFF8F7D & 0x7AB7;
        A.llIIllIlII[96] = -(0xFFFFDBF9 & 0x368F) & (0xFFFF9EFF & 0x7FFE);
        A.llIIllIlII[97] = 0xFFFFDFFD & 0x2A3A;
        A.llIIllIlII[98] = 0xFFFFED7F & 0x1EE5;
        A.llIIllIlII[99] = -(0xFFFFF0EB & 0x3FD5) & (0xFFFFFBF7 & 0x3EFF);
        A.llIIllIlII[100] = 0xFFFF9D7E & 0x6EC7;
        A.llIIllIlII[101] = -(0xFFFFF937 & 0x47CE) & (0xFFFFFF5F & 0x4BBF);
        A.llIIllIlII[102] = -(0xFFFFE9D6 & 0x77AD) & (0xFFFFFFC7 & 0x6DFF);
        A.llIIllIlII[103] = 0xFFFFCFDF & 0x3A32;
        A.llIIllIlII[104] = 0xFFFFBC4D & 0x4FFA;
        A.llIIllIlII[105] = 0xFFFF9D4F & 0x6EF7;
        A.llIIllIlII[106] = -(0xFFFFDF8F & 0x3572) & (0xFFFFDF7F & 0x3FBB);
        A.llIIllIlII[107] = -(68 + 148 - 103 + 48) & (0xFFFFDFFF & 0x2CFF);
        A.llIIllIlII[108] = 0xFFFFEE7F & 0x1DC3;
        A.llIIllIlII[109] = 0x41 ^ 0;
        A.llIIllIlII[110] = 184 + 0 - 156 + 189 ^ 144 + 86 - 135 + 60;
        A.llIIllIlII[111] = 0xAF ^ 0x8A ^ (0xC4 ^ 0xA2);
        A.llIIllIlII[112] = 0xC9 ^ 0x8D;
    }

    private static String lIlIllIIIIlII(String llllllllllllllllllIIllIllIlIIIIl, String llllllllllllllllllIIllIllIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIIllIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIllIllIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIllIllIlIIIll.init(llIIllIlII[5], llllllllllllllllllIIllIllIlIIlII);
            return new String(llllllllllllllllllIIllIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIllIllIlIIIlI) {
            llllllllllllllllllIIllIllIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static void bw() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation llllllllllllllllllIIllIlllIIllll;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (A.lIlIllIIlIlll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (A.lIlIllIIllIII(bv.size(), llIIllIlII[0])) {
                                                    System.out.println(llIIllIIIl[llIIllIlII[1]]);
                                                    bt = llIIllIlII[1];
                                                }
                                            }
                                            if (!A.lIlIllIIllIIl(bt ? 1 : 0)) break block76;
                                            if (A.lIlIllIIllIII(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2])) {
                                                aD.fY();
                                            }
                                            if (A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2]) && A.lIlIllIIllIII(Skills.getLevel((Skill)Skill.MAGIC), llIIllIlII[3])) {
                                                m.ak();
                                            }
                                            if (!A.lIlIllIIllIIl(A.an() ? 1 : 0) || !A.lIlIllIIllIII(e.j(em), llIIllIlII[0]) || !A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2]) || !A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.MAGIC), llIIllIlII[3])) break block77;
                                            llllllllllllllllllIIllIlllIIllll = BankLocation.getNearest();
                                            if (A.lIlIllIIllIll(llllllllllllllllllIIllIlllIIllll) && A.lIlIllIIllIIl(llllllllllllllllllIIllIlllIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[0]];
                                                a.a(llllllllllllllllllIIllIlllIIllll);
                                            }
                                            if (!A.lIlIllIIllIll(llllllllllllllllllIIllIlllIIllll) || !A.lIlIllIIlIlll(llllllllllllllllllIIllIlllIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (A.lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIlII[4]);
                                                0;
                                            }
                                            if (!A.lIlIllIIlIlll(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderSotf.c = llIIllIIIl[llIIllIlII[5]];
                                            if (A.lIlIllIIlllII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIllIlII[6]);
                                                0;
                                            }
                                            if (A.lIlIllIIlllII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIllIlII[5]);
                                                0;
                                            }
                                            int[] nArray = new int[llIIllIlII[0]];
                                            nArray[A.llIIllIlII[1]] = llIIllIlII[7];
                                            if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[llIIllIlII[0]];
                                            nArray2[A.llIIllIlII[1]] = llIIllIlII[7];
                                            if (!A.lIlIllIIllIlI(Bank.getFirst((int[])nArray2).getQuantity(), llIIllIlII[8])) break block79;
                                        }
                                        int[] nArray = new int[llIIllIlII[0]];
                                        nArray[A.llIIllIlII[1]] = llIIllIlII[9];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[llIIllIlII[0]];
                                        nArray3[A.llIIllIlII[1]] = llIIllIlII[9];
                                        if (!A.lIlIllIIllIlI(Bank.getFirst((int[])nArray3).getQuantity(), llIIllIlII[8])) break block79;
                                    }
                                    int[] nArray = new int[llIIllIlII[0]];
                                    nArray[A.llIIllIlII[1]] = llIIllIlII[10];
                                    if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[llIIllIlII[0]];
                                    nArray4[A.llIIllIlII[1]] = llIIllIlII[10];
                                    if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray4).getQuantity(), llIIllIlII[8])) break block81;
                                }
                                A.Q();
                                System.out.println(llIIllIIIl[llIIllIlII[11]]);
                                bt = llIIllIlII[0];
                                return;
                            }
                            int[] nArray = new int[llIIllIlII[12]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                            nArray[A.llIIllIlII[0]] = llIIllIlII[7];
                            nArray[A.llIIllIlII[5]] = llIIllIlII[10];
                            nArray[A.llIIllIlII[11]] = llIIllIlII[14];
                            nArray[A.llIIllIlII[6]] = llIIllIlII[15];
                            nArray[A.llIIllIlII[16]] = llIIllIlII[17];
                            if (A.lIlIllIIllIIl(e.c(nArray) ? 1 : 0)) {
                                A.Q();
                                System.out.println(llIIllIIIl[llIIllIlII[6]]);
                                bt = llIIllIlII[0];
                                return;
                            }
                            int[] nArray5 = new int[llIIllIlII[12]];
                            nArray5[A.llIIllIlII[1]] = llIIllIlII[13];
                            nArray5[A.llIIllIlII[0]] = llIIllIlII[7];
                            nArray5[A.llIIllIlII[5]] = llIIllIlII[10];
                            nArray5[A.llIIllIlII[11]] = llIIllIlII[14];
                            nArray5[A.llIIllIlII[6]] = llIIllIlII[15];
                            nArray5[A.llIIllIlII[16]] = llIIllIlII[17];
                            if (A.lIlIllIIlIlll(e.c(nArray5) ? 1 : 0)) {
                                while (A.lIlIllIIllIIl(I.co() ? 1 : 0)) {
                                    I.cm();
                                    Time.sleepTicks((int)llIIllIlII[0]);
                                    0;
                                    0;
                                    if ((0x5E ^ 0x5A) >= 0) continue;
                                    return;
                                }
                                if (A.lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)llIIllIlII[12]);
                                    0;
                                }
                                a.a(llIIllIlII[13], llIIllIlII[18]);
                                a.a(llIIllIlII[14], llIIllIlII[11]);
                                a.a(llIIllIlII[7], llIIllIlII[8]);
                                a.a(llIIllIlII[10], llIIllIlII[8]);
                                a.a(llIIllIlII[17], llIIllIlII[11]);
                                a.a(llIIllIlII[15], llIIllIlII[18]);
                                a.a(llIIllIlII[19], llIIllIlII[4]);
                            }
                        }
                        if (A.lIlIllIIlIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && A.lIlIllIIllIII(Movement.getRunEnergy(), llIIllIlII[20])) {
                            Inventory.getFirst((int[])f.ba).interact(llIIllIIIl[llIIllIlII[16]]);
                            Time.sleepTicks((int)llIIllIlII[0]);
                            0;
                        }
                        if (A.lIlIllIIllIII(Prayers.getPoints(), llIIllIlII[21]) && A.lIlIllIIlIlll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(llIIllIIIl[llIIllIlII[12]]);
                        }
                        if (A.lIlIllIIlIlll(A.an() ? 1 : 0) && A.lIlIllIIllIIl(e.j(em))) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[22]];
                                if (A.lIlIllIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)ed);
                                0;
                                Time.sleepTicks((int)llIIllIlII[0]);
                                0;
                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                                g.a(llIIllIIIl[llIIllIlII[23]], cE);
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[0])) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[6]) && A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ef), llIIllIlII[6])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[24]];
                                Movement.walkTo((WorldPoint)ee);
                                0;
                                Time.sleepTicks((int)llIIllIlII[0]);
                                0;
                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[12])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[18]];
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[25]];
                                String[] stringArray2 = new String[llIIllIlII[0]];
                                stringArray2[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[26]];
                                if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[llIIllIlII[0]];
                                    stringArray3[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[3]];
                                    if (A.lIlIllIIllIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIIllIlII[0]];
                                        stringArray4[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(llIIllIIIl[llIIllIlII[28]]);
                                        Time.sleepTicks((int)llIIllIlII[6]);
                                        0;
                                    }
                                }
                                String[] stringArray5 = new String[llIIllIlII[0]];
                                stringArray5[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[29]];
                                if (A.lIlIllIIlIlll(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[llIIllIlII[0]];
                                    stringArray6[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[30]];
                                    String[] stringArray7 = new String[llIIllIlII[0]];
                                    stringArray7[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[31]];
                                    if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[llIIllIlII[0]];
                                        stringArray8[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(llIIllIIIl[llIIllIlII[33]]);
                                        Time.sleepTicks((int)llIIllIlII[5]);
                                        0;
                                    }
                                    String[] stringArray9 = new String[llIIllIlII[0]];
                                    stringArray9[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[34]];
                                    String[] stringArray10 = new String[llIIllIlII[0]];
                                    stringArray10[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[35]];
                                    if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[llIIllIlII[0]];
                                        stringArray11[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(llIIllIIIl[llIIllIlII[37]]);
                                        Time.sleepTicks((int)llIIllIlII[5]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[5])) {
                            int[] nArray = new int[llIIllIlII[0]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[38];
                            if (A.lIlIllIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[llIIllIlII[0]];
                                nArray6[A.llIIllIlII[1]] = llIIllIlII[38];
                                Inventory.getFirst((int[])nArray6).interact(llIIllIIIl[llIIllIlII[21]]);
                            }
                            int[] nArray7 = new int[llIIllIlII[0]];
                            nArray7[A.llIIllIlII[1]] = llIIllIlII[39];
                            if (A.lIlIllIIlIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIIllIlII[0]];
                                nArray8[A.llIIllIlII[1]] = llIIllIlII[39];
                                Inventory.getFirst((int[])nArray8).interact(llIIllIIIl[llIIllIlII[40]]);
                            }
                            if (A.lIlIllIIllIIl(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[41]];
                                    Movement.walkTo((WorldPoint)eg);
                                    0;
                                    Time.sleepTicks((int)llIIllIlII[0]);
                                    0;
                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && A.lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[llIIllIlII[0]];
                                    stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(llIIllIIIl[llIIllIlII[43]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);
                                    0;
                                }
                            }
                            if (A.lIlIllIIlIlll(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[44]];
                                    Movement.walkTo((WorldPoint)eh);
                                    0;
                                    Time.sleepTicks((int)llIIllIlII[0]);
                                    0;
                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(llIIllIIIl[llIIllIlII[45]], cE);
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[11])) {
                            String[] stringArray = new String[llIIllIlII[0]];
                            stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[46]];
                            if (A.lIlIllIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[47]];
                                    Movement.walkTo((WorldPoint)ek);
                                    0;
                                    Time.sleepTicks((int)llIIllIlII[0]);
                                    0;
                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[48]], cE);
                                }
                            }
                            String[] stringArray12 = new String[llIIllIlII[0]];
                            stringArray12[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[49]];
                            if (A.lIlIllIIlIlll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[50]];
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[51]];
                                    Movement.walkTo((WorldPoint)eh);
                                    0;
                                    Time.sleepTicks((int)llIIllIlII[0]);
                                    0;
                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[52]], cE);
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[16])) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[53]];
                                Movement.walkTo((WorldPoint)el);
                                0;
                                Time.sleepTicks((int)llIIllIlII[0]);
                                0;
                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && A.lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (A.lIlIllIIlIlll(tileObject.getName().contains(llIIllIIIl[llIIllIlII[90]]) ? 1 : 0) && A.lIlIllIIllllI(tileObject.getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                                        n2 = llIIllIlII[0];
                                        0;
                                        if (null != null) {
                                            return ((7 + 21 - -114 + 82 ^ 54 + 164 - 211 + 170) & (0x57 ^ 0x13 ^ (0x6D ^ 0x78) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llIIllIlII[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)llIIllIlII[5]);
                                0;
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[12])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[55]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[llIIllIlII[0]];
                                    stringArray13[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(llIIllIIIl[llIIllIlII[57]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);
                                    0;
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[23]) && A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                            g.a(llIIllIIIl[llIIllIlII[58]], cE);
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[24])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            String[] stringArray = new String[llIIllIlII[0]];
                            stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[2]];
                            if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[llIIllIlII[0]];
                                stringArray14[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[59]];
                                if (A.lIlIllIIllllI(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[60]], cE);
                                }
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[llIIllIlII[0]];
                                stringArray15[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[61]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[llIIllIlII[0]];
                                    stringArray16[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(llIIllIIIl[llIIllIlII[20]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);
                                    0;
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[18])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[63]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[llIIllIlII[0]];
                                    stringArray17[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(llIIllIIIl[llIIllIlII[65]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);
                                    0;
                                }
                            }
                        }
                        if (A.lIlIllIlIIIIl(e.j(em), llIIllIlII[25]) && !A.lIlIllIIlllll(e.j(em), llIIllIlII[26])) break block82;
                        String[] stringArray = new String[llIIllIlII[0]];
                        stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[66]];
                        if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[llIIllIlII[0]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                            Inventory.getFirst((int[])nArray).interact(llIIllIIIl[llIIllIlII[67]]);
                            Time.sleepTicks((int)llIIllIlII[16]);
                            0;
                        }
                        llllllllllllllllllIIllIlllIIllll = new WorldPoint(llIIllIlII[68], llIIllIlII[69], llIIllIlII[1]);
                        if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIllIlII[70]) && A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIlllIIllll), llIIllIlII[6])) {
                            AccBuilderSotf.c = llIIllIIIl[llIIllIlII[71]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIIllIlllIIllll);
                            0;
                            Time.sleepTicks((int)llIIllIlII[0]);
                            0;
                        }
                        if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIlllIIllll), llIIllIlII[6]) && !A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[54])) break block83;
                        if (!A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) break block84;
                        String[] stringArray18 = new String[llIIllIlII[0]];
                        stringArray18[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[72]];
                        if (!A.lIlIllIlIIIII(NPCs.getNearest((String[])stringArray18)) || !A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIlllIIllll), llIIllIlII[70])) break block84;
                    }
                    WorldArea llllllllllllllllllIIllIlllIIlllI = new WorldArea(llIIllIlII[73], llIIllIlII[74], llIIllIlII[43], llIIllIlII[37], llIIllIlII[1]);
                    if (A.lIlIllIIllIII(e.j(llIIllIlII[75]), llIIllIlII[24]) && A.lIlIllIIlIlll(Equipment.contains(item -> item.getName().contains(llIIllIIIl[llIIllIlII[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(llIIllIIIl[llIIllIlII[88]])).interact(llIIllIIIl[llIIllIlII[76]]);
                        Time.sleepTicks((int)llIIllIlII[12]);
                        0;
                    }
                    if (A.lIlIllIIlIlll(llllllllllllllllllIIllIlllIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llllllllllllllllllIIllIlllIIllIl = new WorldPoint(llIIllIlII[77], llIIllIlII[78], llIIllIlII[1]);
                        Movement.walkTo((WorldPoint)llllllllllllllllllIIllIlllIIllIl);
                        0;
                        Time.sleepTicks((int)llIIllIlII[0]);
                        0;
                    }
                    if (A.lIlIllIIllIIl(llllllllllllllllllIIllIlllIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ed);
                        0;
                        Time.sleepTicks((int)llIIllIlII[0]);
                        0;
                    }
                }
                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                    if (A.lIlIllIIllIII(di, llIIllIlII[0])) {
                        aN.ql += llIIllIlII[0];
                        aN.u(AccBuilderSotf.m);
                        di += llIIllIlII[0];
                        aN.ql = llIIllIlII[1];
                        dj = llIIllIlII[1];
                    }
                    g.a(llIIllIIIl[llIIllIlII[79]], cE);
                }
            }
            g.a(cE);
        }
    }

    private static void lIlIllIIlIlIl() {
        llIIllIIIl = new String[llIIllIlII[112]];
        A.llIIllIIIl[A.llIIllIlII[1]] = A."Finished buying items, switching back to quest";
        A.llIIllIIIl[A.llIIllIlII[0]] = A."Nav to bank";
        A.llIIllIIIl[A.llIIllIlII[5]] = A."Handling banking";
        A.llIIllIIIl[A.llIIllIlII[11]] = A."We are missing runes, switching to BUYING";
        A.llIIllIIIl[A.llIIllIlII[6]] = A."We are missing quest supplies, switching to BUYING";
        A.llIIllIIIl[A.llIIllIlII[16]] = A."Drink";
        A.llIIllIIIl[A.llIIllIlII[12]] = A."Drink";
        A.llIIllIIIl[A.llIIllIlII[22]] = A."Nav to start";
        A.llIIllIIIl[A.llIIllIlII[23]] = A."Lady Servil";
        A.llIIllIIIl[A.llIIllIlII[24]] = A."Nav to armour";
        A.llIIllIIIl[A.llIIllIlII[18]] = A."Getting armour";
        A.llIIllIIIl[A.llIIllIlII[25]] = A."Door";
        A.llIIllIIIl[A.llIIllIlII[26]] = A."Open";
        A.llIIllIIIl[A.llIIllIlII[3]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[27]] = A."Door";
        A.llIIllIIIl[A.llIIllIlII[28]] = A."Open";
        A.llIIllIIIl[A.llIIllIlII[29]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[30]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[31]] = A."Open";
        A.llIIllIIIl[A.llIIllIlII[32]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[33]] = A."Open";
        A.llIIllIIIl[A.llIIllIlII[34]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[35]] = A."Search";
        A.llIIllIIIl[A.llIIllIlII[36]] = A."Chest";
        A.llIIllIIIl[A.llIIllIlII[37]] = A."Search";
        A.llIIllIIIl[A.llIIllIlII[21]] = A."Wear";
        A.llIIllIIIl[A.llIIllIlII[40]] = A."Wear";
        A.llIIllIIIl[A.llIIllIlII[41]] = A."Nav to jail";
        A.llIIllIIIl[A.llIIllIlII[42]] = A."Door";
        A.llIIllIIIl[A.llIIllIlII[43]] = A."Open";
        A.llIIllIIIl[A.llIIllIlII[44]] = A."Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[45]] = A."Head Guard";
        A.llIIllIIIl[A.llIIllIlII[46]] = A."Khali brew";
        A.llIIllIIIl[A.llIIllIlII[47]] = A."Nav to brew";
        A.llIIllIIIl[A.llIIllIlII[48]] = A."Khazard Barman";
        A.llIIllIIIl[A.llIIllIlII[49]] = A."Khali brew";
        A.llIIllIIIl[A.llIIllIlII[50]] = A."Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[51]] = A."Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[52]] = A."Head Guard";
        A.llIIllIIIl[A.llIIllIlII[53]] = A."Nav to  sammy";
        A.llIIllIIIl[A.llIIllIlII[54]] = A."Khazard cell keys";
        A.llIIllIIIl[A.llIIllIlII[55]] = A."Khazard Ogre";
        A.llIIllIIIl[A.llIIllIlII[56]] = A."Khazard Ogre";
        A.llIIllIIIl[A.llIIllIlII[57]] = A."Attack";
        A.llIIllIIIl[A.llIIllIlII[58]] = A."Sammy Servil";
        A.llIIllIIIl[A.llIIllIlII[2]] = A."Hengrad";
        A.llIIllIIIl[A.llIIllIlII[59]] = A."Hengrad";
        A.llIIllIIIl[A.llIIllIlII[60]] = A."Hengrad";
        A.llIIllIIIl[A.llIIllIlII[61]] = A."Khazard Scorpion";
        A.llIIllIIIl[A.llIIllIlII[62]] = A."Khazard Scorpion";
        A.llIIllIIIl[A.llIIllIlII[20]] = A."Attack";
        A.llIIllIIIl[A.llIIllIlII[63]] = A."Bouncer";
        A.llIIllIIIl[A.llIIllIlII[64]] = A."Bouncer";
        A.llIIllIIIl[A.llIIllIlII[65]] = A."Attack";
        A.llIIllIIIl[A.llIIllIlII[66]] = A."General Khazard";
        A.llIIllIIIl[A.llIIllIlII[67]] = A."Break";
        A.llIIllIIIl[A.llIIllIlII[71]] = A."Nav to start";
        A.llIIllIIIl[A.llIIllIlII[72]] = A."General Khazard";
        A.llIIllIIIl[A.llIIllIlII[76]] = A."Castle Wars";
        A.llIIllIIIl[A.llIIllIlII[79]] = A."Lady Servil";
        A.llIIllIIIl[A.llIIllIlII[86]] = A."Fight Arena";
        A.llIIllIIIl[A.llIIllIlII[87]] = A."ring of wealth (";
        A.llIIllIIIl[A.llIIllIlII[88]] = A."dueling";
        A.llIIllIIIl[A.llIIllIlII[89]] = A."dueling";
        A.llIIllIIIl[A.llIIllIlII[90]] = A."Prison Gate";
        A.llIIllIIIl[A.llIIllIlII[109]] = A."Can I help you?";
        A.llIIllIIIl[A.llIIllIlII[110]] = A."I'd like a Khali Brew please.";
        A.llIIllIIIl[A.llIIllIlII[111]] = A."Yes.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (!A.lIlIllIlIIIlI(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || A.lIlIllIIllIlI(e.j(em), llIIllIlII[27])) {
            bl = llIIllIlII[0];
            0;
            if (2 <= 1) {
                return ((0xDF ^ 0x97) & ~(0xC9 ^ 0x81)) != 0;
            }
        } else {
            bl = llIIllIlII[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIIIII(Object object) {
        return object == null;
    }

    private static String lIlIllIIIIlIl(String llllllllllllllllllIIllIllIIlIIlI, String llllllllllllllllllIIllIllIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllIIllIllIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIllIIlIIll.getBytes(StandardCharsets.UTF_8)), llIIllIlII[23]), "DES");
            Cipher llllllllllllllllllIIllIllIIlIllI = Cipher.getInstance("DES");
            llllllllllllllllllIIllIllIIlIllI.init(llIIllIlII[5], llllllllllllllllllIIllIllIIlIlll);
            return new String(llllllllllllllllllIIllIllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIllIllIIlIlIl) {
            llllllllllllllllllIIllIllIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIIllIII(int n2, int n3) {
        return n2 < n3;
    }
}

