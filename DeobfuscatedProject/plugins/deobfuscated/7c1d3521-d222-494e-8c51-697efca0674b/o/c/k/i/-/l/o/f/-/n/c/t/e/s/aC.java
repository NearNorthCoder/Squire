/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class aC
implements ac {
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int pb;
    private static /* synthetic */ String[] lIlllIllII;
    public static /* synthetic */ int[] nx;
    public static /* synthetic */ int[] ny;
    public static final /* synthetic */ int oY;
    public static final /* synthetic */ int[] pc;
    private static /* synthetic */ int[] lIlllIllIl;
    public static final /* synthetic */ int oZ;
    public static final /* synthetic */ int oW;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int oX;
    public static /* synthetic */ WorldArea y;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ int pa;

    static {
        aC.lIIllllIIllIl();
        aC.lIIllllIIllII();
        oY = lIlllIllIl[8];
        oZ = lIlllIllIl[9];
        pb = lIlllIllIl[17];
        pa = lIlllIllIl[10];
        oW = lIlllIllIl[6];
        oX = lIlllIllIl[7];
        int[] nArray = new int[lIlllIllIl[27]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[44];
        nArray[aC.lIlllIllIl[1]] = lIlllIllIl[45];
        nArray[aC.lIlllIllIl[2]] = lIlllIllIl[46];
        nArray[aC.lIlllIllIl[3]] = lIlllIllIl[47];
        nArray[aC.lIlllIllIl[5]] = lIlllIllIl[48];
        nArray[aC.lIlllIllIl[23]] = lIlllIllIl[49];
        nArray[aC.lIlllIllIl[21]] = lIlllIllIl[50];
        nArray[aC.lIlllIllIl[25]] = lIlllIllIl[51];
        nArray[aC.lIlllIllIl[26]] = lIlllIllIl[52];
        pc = nArray;
        bv = new ArrayList<d>();
        int[] nArray2 = new int[lIlllIllIl[2]];
        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[53];
        nArray2[aC.lIlllIllIl[1]] = lIlllIllIl[54];
        nx = nArray2;
        int[] nArray3 = new int[lIlllIllIl[2]];
        nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[55];
        nArray3[aC.lIlllIllIl[1]] = lIlllIllIl[56];
        ny = nArray3;
        y = new WorldArea(lIlllIllIl[57], lIlllIllIl[58], lIlllIllIl[59], lIlllIllIl[60], lIlllIllIl[0]);
        F = new WorldPoint(lIlllIllIl[61], lIlllIllIl[62], lIlllIllIl[0]);
    }

    @Override
    public boolean ae() {
        return lIlllIllIl[0];
    }

    private static String lIIllllIIlIlI(String llllllllllllllllllIllllIIIIIllll, String llllllllllllllllllIllllIIIIlIIll) {
        llllllllllllllllllIllllIIIIIllll = new String(Base64.getDecoder().decode(llllllllllllllllllIllllIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllIIIIlIIlI = new StringBuilder();
        char[] llllllllllllllllllIllllIIIIlIIIl = llllllllllllllllllIllllIIIIlIIll.toCharArray();
        int llllllllllllllllllIllllIIIIlIIII = lIlllIllIl[0];
        char[] llllllllllllllllllIllllIIIIIlIlI = llllllllllllllllllIllllIIIIIllll.toCharArray();
        int llllllllllllllllllIllllIIIIIlIIl = llllllllllllllllllIllllIIIIIlIlI.length;
        int llllllllllllllllllIllllIIIIIlIII = lIlllIllIl[0];
        while (aC.lIIllllIIllll(llllllllllllllllllIllllIIIIIlIII, llllllllllllllllllIllllIIIIIlIIl)) {
            char llllllllllllllllllIllllIIIIlIlIl = llllllllllllllllllIllllIIIIIlIlI[llllllllllllllllllIllllIIIIIlIII];
            llllllllllllllllllIllllIIIIlIIlI.append((char)(llllllllllllllllllIllllIIIIlIlIl ^ llllllllllllllllllIllllIIIIlIIIl[llllllllllllllllllIllllIIIIlIIII % llllllllllllllllllIllllIIIIlIIIl.length]));
            0;
            ++llllllllllllllllllIllllIIIIlIIII;
            ++llllllllllllllllllIllllIIIIIlIII;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIllllIIIIlIIlI);
    }

    private static boolean lIIllllIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllllIlIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[42])) {
            bl = lIlllIllIl[1];
            0;
            if (null != null) {
                return ((151 + 138 - 155 + 63 ^ 75 + 83 - -5 + 29) & (70 + 111 - 37 + 0 ^ 61 + 50 - -26 + 12 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIllIl[0];
        }
        return bl;
    }

    @Override
    public int af() {
        aC.fQ();
        return lIlllIllIl[40];
    }

    private static boolean lIIllllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIIllIl() {
        lIlllIllIl = new int[64];
        aC.lIlllIllIl[0] = (0x41 ^ 0x7F) & ~(0x51 ^ 0x6F);
        aC.lIlllIllIl[1] = 1;
        aC.lIlllIllIl[2] = 2;
        aC.lIlllIllIl[3] = 3;
        aC.lIlllIllIl[4] = 0xFFFFB3BF & 0x5FC8;
        aC.lIlllIllIl[5] = 6 ^ 0x60 ^ (0x68 ^ 0xA);
        aC.lIlllIllIl[6] = -(0xFFFFEE27 & 0x59DF) & (0xFFFFCEF7 & 0x7DFF);
        aC.lIlllIllIl[7] = -(0xFFFFF259 & 0x3DAF) & (0xFFFFF5FD & 0x3EFF);
        aC.lIlllIllIl[8] = 0xFFFFC7FD & 0x3CFB;
        aC.lIlllIllIl[9] = -(0xFFFFF717 & 0x58E9) & (0xFFFFF7F7 & 0x5CFF);
        aC.lIlllIllIl[10] = -(0xFFFFFAD3 & 0x272D) & (0xFFFFBEFF & 0x67FB);
        aC.lIlllIllIl[11] = 0xFFFFAE5C & 0x7FF7;
        aC.lIlllIllIl[12] = -(0xFFFFD18D & 0x3FFB) & (0xFFFFBFFA & 0x7FDD);
        aC.lIlllIllIl[13] = -(0xFFFFBD91 & 0x436F) & (0xFFFFFF4F & 0x2FFE);
        aC.lIlllIllIl[14] = -(0xFFFFF339 & 0x5CE7) & (0xFFFFFF6C & 0x7EFF);
        aC.lIlllIllIl[15] = 0xFFFFFEFF & 0x2F52;
        aC.lIlllIllIl[16] = -(0xFFFFF3C5 & 0x1DBF) & (0xFFFFFFDF & 0x3FEE);
        aC.lIlllIllIl[17] = 0xFFFFAEF0 & 0x7FCF;
        aC.lIlllIllIl[18] = 0xC6 ^ 0x9E;
        aC.lIlllIllIl[19] = 0xFFFFEFDF & 0x3EEC;
        aC.lIlllIllIl[20] = -(0xFFFFA1F7 & 0x7E0D) & (0xFFFFFFEF & 0x6F1F);
        aC.lIlllIllIl[21] = 0x2E ^ 0x28;
        aC.lIlllIllIl[22] = 0x84 ^ 0xB5 ^ (0x46 ^ 0x63);
        aC.lIlllIllIl[23] = 157 + 38 - 192 + 181 ^ 95 + 132 - 156 + 118;
        aC.lIlllIllIl[24] = 0xA5 ^ 0xAA;
        aC.lIlllIllIl[25] = 0x51 ^ 0x56;
        aC.lIlllIllIl[26] = 81 + 43 - 17 + 83 ^ 173 + 127 - 247 + 129;
        aC.lIlllIllIl[27] = 0x2B ^ 0x22;
        aC.lIlllIllIl[28] = 0x4A ^ 0x13 ^ (0x7A ^ 0x29);
        aC.lIlllIllIl[29] = 0x24 ^ 0x2F;
        aC.lIlllIllIl[30] = 0x89 ^ 0xA0;
        aC.lIlllIllIl[31] = 0xAA ^ 0xB5;
        aC.lIlllIllIl[32] = 0x7E ^ 0x6B;
        aC.lIlllIllIl[33] = 0xFFFFACFE & 0xDBB9;
        aC.lIlllIllIl[34] = 0xFFFFAFAC & 0x737B;
        aC.lIlllIllIl[35] = -(0xFFFFCDEA & 0x777D) & (0xFFFFFFFF & Short.MAX_VALUE);
        aC.lIlllIllIl[36] = -(0x2F ^ 0x29) & (0xFFFFF3EF & 0x6DBD);
        aC.lIlllIllIl[37] = -(0xFFFFE55F & 0x5AA9) & (0xFFFFFF6F & 0x5FDF);
        aC.lIlllIllIl[38] = 0xB8 ^ 0x90;
        aC.lIlllIllIl[39] = 0xFFFFE7AE & 0x1BD5;
        aC.lIlllIllIl[40] = 0xEF ^ 0x8B;
        aC.lIlllIllIl[41] = 0xDB ^ 0x9C ^ (0x88 ^ 0xC3);
        aC.lIlllIllIl[42] = 0xC4 ^ 0xA7;
        aC.lIlllIllIl[43] = 0x1B ^ 0x7D ^ (0xCA ^ 0xA1);
        aC.lIlllIllIl[44] = -(0xFFFFF66E & 0x6FDB) & (0xFFFFF7FD & 0x6FFF);
        aC.lIlllIllIl[45] = 0xFFFFEDBE & 0x13F9;
        aC.lIlllIllIl[46] = -(0xFFFFF9F7 & 0x7EAD) & (0xFFFFFFFD & 0x7EF7);
        aC.lIlllIllIl[47] = -(0xFFFFF2BD & 0x7DEB) & (0xFFFFFEFD & 0x77FF);
        aC.lIlllIllIl[48] = -(0xFFFFF755 & 0x69AB) & (0xFFFFE7D7 & 0x7F7B);
        aC.lIlllIllIl[49] = 0xFFFF96F7 & 0x6F5F;
        aC.lIlllIllIl[50] = -(0x3F ^ 0x79) & (0xFFFFDBDF & 0x7FF7);
        aC.lIlllIllIl[51] = 0xFFFFDFEB & 0x6F9C;
        aC.lIlllIllIl[52] = 0xFFFFFF97 & 0x4FEE;
        aC.lIlllIllIl[53] = 0xFFFFFD6D & 0x2EF7;
        aC.lIlllIllIl[54] = -(0xFFFFEBE9 & 0x1797) & (0xFFFFAFF6 & 0x7FED);
        aC.lIlllIllIl[55] = 0xFFFFEB9F & 0x3FF9;
        aC.lIlllIllIl[56] = 0xFFFFAFFF & 0x7ABF;
        aC.lIlllIllIl[57] = -(0xFFFFFCCF & 0x737B) & (0xFFFFFFDF & 0x7BFB);
        aC.lIlllIllIl[58] = -(0xFFFFD576 & 0x7A8B) & (0xFFFFFEBD & 0x5DDF);
        aC.lIlllIllIl[59] = 0xD3 ^ 0x8F ^ (0xC1 ^ 0x81);
        aC.lIlllIllIl[60] = 0x70 ^ 0x6B;
        aC.lIlllIllIl[61] = 0xFFFFBFDF & 0x4BBF;
        aC.lIlllIllIl[62] = 0xFFFFBFBE & 0x4CEB;
        aC.lIlllIllIl[63] = 0x41 ^ 0x4F;
    }

    public static void Q() {
        d llllllllllllllllllIllllIIIlllIIl;
        Object llllllllllllllllllIllllIIIlllIlI;
        d d2 = new d(lIlllIllIl[17], lIlllIllIl[1], lIlllIllIl[33]);
        bv.add(d2);
        0;
        int[] nArray = new int[lIlllIllIl[1]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new d(lIlllIllIl[6], lIlllIllIl[1], lIlllIllIl[4]);
            bv.add(d3);
            0;
        }
        int[] nArray2 = new int[lIlllIllIl[1]];
        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[7];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIlI = new d(lIlllIllIl[7], lIlllIllIl[1], lIlllIllIl[4]);
            bv.add((d)llllllllllllllllllIllllIIIlllIlI);
            0;
        }
        int[] nArray3 = new int[lIlllIllIl[1]];
        nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[8];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIlI = new d(lIlllIllIl[8], lIlllIllIl[1], lIlllIllIl[34]);
            bv.add((d)llllllllllllllllllIllllIIIlllIlI);
            0;
        }
        int[] nArray4 = new int[lIlllIllIl[1]];
        nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[9];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIlI = new d(lIlllIllIl[9], lIlllIllIl[1], lIlllIllIl[35]);
            bv.add((d)llllllllllllllllllIllllIIIlllIlI);
            0;
        }
        int[] nArray5 = new int[lIlllIllIl[1]];
        nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[10];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIlI = new d(lIlllIllIl[10], lIlllIllIl[1], lIlllIllIl[36]);
            bv.add((d)llllllllllllllllllIllllIIIlllIlI);
            0;
        }
        if (aC.lIIllllIlIIII(Bank.contains((Predicate)(llllllllllllllllllIllllIIIlllIlI = item -> item.getName().toLowerCase().contains(lIlllIllII[lIlllIllIl[43]]))) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIIl = new d(lIlllIllIl[19], lIlllIllIl[23], lIlllIllIl[36]);
            bv.add(llllllllllllllllllIllllIIIlllIIl);
            0;
        }
        int[] nArray6 = new int[lIlllIllIl[1]];
        nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[37];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllllllIllllIIIlllIIl = new d(lIlllIllIl[37], lIlllIllIl[38], lIlllIllIl[39]);
            bv.add(llllllllllllllllllIllllIIIlllIIl);
            0;
        }
    }

    public static void fQ() {
        block32: {
            BankLocation llllllllllllllllllIllllIIIllllll;
            block33: {
                block39: {
                    block35: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        if (aC.lIIllllIIlllI(bt ? 1 : 0)) {
                                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[0]];
                                            b.a(bv);
                                            if (aC.lIIllllIIllll(bv.size(), lIlllIllIl[1])) {
                                                System.out.println(lIlllIllII[lIlllIllIl[1]]);
                                                bt = lIlllIllIl[0];
                                            }
                                        }
                                        if (!aC.lIIllllIlIIII(bt ? 1 : 0)) break block32;
                                        if (!aC.lIIllllIlIIII(aC.an() ? 1 : 0)) break block33;
                                        llllllllllllllllllIllllIIIllllll = BankLocation.getNearest();
                                        if (aC.lIIllllIlIIIl(llllllllllllllllllIllllIIIllllll) && aC.lIIllllIlIIII(llllllllllllllllllIllllIIIllllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[2]];
                                            a.a(llllllllllllllllllIllllIIIllllll);
                                        }
                                        if (!aC.lIIllllIlIIIl(llllllllllllllllllIllllIIIllllll) || !aC.lIIllllIIlllI(llllllllllllllllllIllllIIIllllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderSotf.c = lIlllIllII[lIlllIllIl[3]];
                                        if (aC.lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIllIl[4]);
                                            0;
                                        }
                                        if (!aC.lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (aC.lIIllllIlIIlI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIlllIllIl[5]);
                                            0;
                                        }
                                        if (aC.lIIllllIlIIlI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIlllIllIl[2]);
                                            0;
                                        }
                                        int[] nArray = new int[lIlllIllIl[1]];
                                        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                                        if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[lIlllIllIl[1]];
                                        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                                        if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray2), lIlllIllIl[1])) break block35;
                                    }
                                    int[] nArray = new int[lIlllIllIl[1]];
                                    nArray[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                                    if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[lIlllIllIl[1]];
                                    nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                                    if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray3), lIlllIllIl[1])) break block35;
                                }
                                int[] nArray = new int[lIlllIllIl[1]];
                                nArray[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                                if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[lIlllIllIl[1]];
                                nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                                if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray4), lIlllIllIl[1])) break block35;
                            }
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[lIlllIllIl[1]];
                            nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray5), lIlllIllIl[1])) break block35;
                        }
                        int[] nArray = new int[lIlllIllIl[1]];
                        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                        if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[lIlllIllIl[1]];
                        nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                        if (!aC.lIIllllIIllll(Inventory.getCount((int[])nArray6), lIlllIllIl[1])) break block39;
                    }
                    aC.Q();
                    System.out.println(lIlllIllII[lIlllIllIl[5]]);
                    bt = lIlllIllIl[1];
                    return;
                }
                a.a(lIlllIllIl[11], lIlllIllIl[1]);
                a.a(lIlllIllIl[12], lIlllIllIl[1]);
                a.a(lIlllIllIl[13], lIlllIllIl[1]);
                a.a(lIlllIllIl[14], lIlllIllIl[1]);
                a.a(lIlllIllIl[15], lIlllIllIl[1]);
                a.a(lIlllIllIl[16], lIlllIllIl[1]);
                a.a(lIlllIllIl[17], lIlllIllIl[1]);
                int[] nArray = new int[lIlllIllIl[1]];
                nArray[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                if (aC.lIIllllIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[lIlllIllIl[1]];
                    nArray7[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                    if (aC.lIIllllIlIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlllIllIl[1]];
                        nArray8[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lIlllIllIl[18], lIlllIllIl[1]);
                        }
                    }
                }
                a.a(lIlllIllIl[19], lIlllIllIl[1]);
                e.l(lIlllIllIl[11]);
                e.l(lIlllIllIl[12]);
                e.l(lIlllIllIl[13]);
                e.l(lIlllIllIl[14]);
                e.l(lIlllIllIl[15]);
                Time.sleepTicks((int)lIlllIllIl[1]);
                0;
                e.l(lIlllIllIl[17]);
                e.l(lIlllIllIl[20]);
                e.l(lIlllIllIl[16]);
                e.l(lIlllIllIl[18]);
                e.l(lIlllIllIl[19]);
                Time.sleepTicks((int)lIlllIllIl[3]);
                0;
                if (aC.lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIlllIllIl[21]);
                    0;
                }
                if (aC.lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[lIlllIllIl[1]];
                    nArray9[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[6], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (((0x11 ^ 0xE) & ~(0xB7 ^ 0xA8)) > 2) {
                                    return ((0x56 ^ 0x37) & ~(0xD8 ^ 0xB9)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                    int[] nArray10 = new int[lIlllIllIl[1]];
                    nArray10[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[7], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (((0xDC ^ 0xC4) & ~(0x98 ^ 0x80)) != 0) {
                                    return (2 & ~2) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                    int[] nArray11 = new int[lIlllIllIl[1]];
                    nArray11[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[8], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (null != null) {
                                    return ((8 + 56 - -4 + 59 ^ (0xF5 ^ 0xB5)) & (45 + 1 - -58 + 68 ^ 92 + 47 - 2 + 10 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                    int[] nArray12 = new int[lIlllIllIl[1]];
                    nArray12[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[9], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (null != null) {
                                    return ((0xE6 ^ 0xA7 ^ (0xB5 ^ 0xA5)) & (0xA5 ^ 0x94 ^ (0x64 ^ 4) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                    int[] nArray13 = new int[lIlllIllIl[1]];
                    nArray13[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[10], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (1 == 0) {
                                    return ((0x18 ^ 0x2E ^ (0xD5 ^ 0xA1)) & (0x2C ^ 0x66 ^ (4 ^ 0xC) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                    int[] nArray14 = new int[lIlllIllIl[1]];
                    nArray14[aC.lIlllIllIl[0]] = lIlllIllIl[17];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[17], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[17];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];
                                0;
                                if (1 == 0) {
                                    return ((0x1D ^ 0x35) & ~(0x25 ^ 0xD)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);
                        0;
                    }
                }
            }
            if (aC.lIIllllIIlllI(aC.an() ? 1 : 0)) {
                if (aC.lIIllllIlIIII(Movement.isRunEnabled() ? 1 : 0) && aC.lIIllllIlIlII(Movement.getRunEnergy(), lIlllIllIl[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)lIlllIllIl[23]);
                    0;
                }
                if (aC.lIIllllIIlllI(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllIllII[lIlllIllIl[23]];
                    Inventory.getAll((int[])pc).stream().forEach(Item::drop);
                }
                if (aC.lIIllllIlIIII(Inventory.isFull() ? 1 : 0)) {
                    if (aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[24])) {
                        if (aC.lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[21]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)lIlllIllIl[5]);
                            0;
                        }
                        if (aC.lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[25]];
                            llllllllllllllllllIllllIIIllllll = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ny);
                            if (aC.lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && aC.lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && aC.lIIllllIlIIIl(llllllllllllllllllIllllIIIllllll)) {
                                llllllllllllllllllIllllIIIllllll.interact(lIlllIllII[lIlllIllIl[26]]);
                                Time.sleepTicks((int)lIlllIllIl[2]);
                                0;
                            }
                        }
                    }
                    if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[24])) {
                        if (aC.lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[27]];
                            Movement.walkTo((WorldPoint)F);
                            0;
                            Time.sleepTicks((int)lIlllIllIl[5]);
                            0;
                        }
                        if (aC.lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[28]];
                            llllllllllllllllllIllllIIIllllll = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])nx);
                            if (aC.lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && aC.lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && aC.lIIllllIlIIIl(llllllllllllllllllIllllIIIllllll)) {
                                llllllllllllllllllIllllIIIllllll.interact(lIlllIllII[lIlllIllIl[29]]);
                                Time.sleepTicks((int)lIlllIllIl[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllllIlIIlI(int n2) {
        return n2 > 0;
    }

    private static void lIIllllIIllII() {
        lIlllIllII = new String[lIlllIllIl[63]];
        aC.lIlllIllII[aC.lIlllIllIl[0]] = aC."Buying items";
        aC.lIlllIllII[aC.lIlllIllIl[1]] = aC."Finished buying items, switching back to mining";
        aC.lIlllIllII[aC.lIlllIllIl[2]] = aC."Navigating to bank";
        aC.lIlllIllII[aC.lIlllIllIl[3]] = aC."Handling banking";
        aC.lIlllIllII[aC.lIlllIllIl[5]] = aC."We are missing axes, switching to BUYING";
        aC.lIlllIllII[aC.lIlllIllIl[23]] = aC."Dropping";
        aC.lIlllIllII[aC.lIlllIllIl[21]] = aC."Walking to mine";
        aC.lIlllIllII[aC.lIlllIllIl[25]] = aC."Mining copper";
        aC.lIlllIllII[aC.lIlllIllIl[26]] = aC."Mine";
        aC.lIlllIllII[aC.lIlllIllIl[27]] = aC."Walking to iron ores";
        aC.lIlllIllII[aC.lIlllIllIl[28]] = aC."Mining iron";
        aC.lIlllIllII[aC.lIlllIllIl[29]] = aC."Mine";
        aC.lIlllIllII[aC.lIlllIllIl[41]] = aC."Mining";
        aC.lIlllIllII[aC.lIlllIllIl[43]] = aC."ring of wealth (";
    }

    private static String lIIllllIIlIll(String llllllllllllllllllIllllIIIlIllll, String llllllllllllllllllIllllIIIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllllIIIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllllIIIllIIll.init(lIlllIllIl[2], llllllllllllllllllIllllIIIllIlII);
            return new String(llllllllllllllllllIllllIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIIIllIIlI) {
            llllllllllllllllllIllllIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIIllllIIlIIl(String llllllllllllllllllIllllIIIlIIIlI, String llllllllllllllllllIllllIIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIllIl[26]), "DES");
            Cipher llllllllllllllllllIllllIIIlIIllI = Cipher.getInstance("DES");
            llllllllllllllllllIllllIIIlIIllI.init(lIlllIllIl[2], llllllllllllllllllIllllIIIlIIlll);
            return new String(llllllllllllllllllIllllIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIIIlIIlIl) {
            llllllllllllllllllIllllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[30])) {
            boolean bl;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                bl = lIlllIllIl[1];
                0;
                if (3 > 0) return bl;
                return ((0x51 ^ 0x68) & ~(0x94 ^ 0xAD)) != 0;
            }
            bl = lIlllIllIl[0];
            return bl;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[31]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[30])) {
            int n3;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIlllIllIl[1]];
                nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray2))) {
                    n3 = lIlllIllIl[1];
                    0;
                    if (1 <= 1) return n3 != 0;
                    return ((0xB2 ^ 0xAD ^ (0x69 ^ 0x7A)) & (177 + 109 - 102 + 18 ^ 121 + 91 - 57 + 43 ^ -1)) != 0;
                }
            }
            n3 = lIlllIllIl[0];
            return n3 != 0;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[32]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[31])) {
            int n4;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIlllIllIl[1]];
                nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIlllIllIl[1]];
                    nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray4))) {
                        n4 = lIlllIllIl[1];
                        0;
                        if (-(0x36 ^ 0x32) <= 0) return n4 != 0;
                        return ((0x51 ^ 0x13) & ~(0xEB ^ 0xA9) & ~((0xF0 ^ 0xA3) & ~(0x76 ^ 0x25))) != 0;
                    }
                }
            }
            n4 = lIlllIllIl[0];
            return n4 != 0;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[21]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[32])) {
            int n5;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIlllIllIl[1]];
                nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIlllIllIl[1]];
                    nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIlllIllIl[1]];
                        nArray7[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray7))) {
                            n5 = lIlllIllIl[1];
                            0;
                            if (((0x15 ^ 0x5E) & ~(0x8F ^ 0xC4)) >= 0) return n5 != 0;
                            return ((0x9C ^ 0x91) & ~(0x46 ^ 0x4B)) != 0;
                        }
                    }
                }
            }
            n5 = lIlllIllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIlllIllIl[1]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIlllIllIl[1]];
            nArray8[aC.lIlllIllIl[0]] = lIlllIllIl[9];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIlllIllIl[1]];
                nArray9[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIlllIllIl[1]];
                    nArray10[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIlllIllIl[1]];
                        nArray11[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray11))) {
                            n2 = lIlllIllIl[1];
                            0;
                            if (-1 < ((221 + 53 - 98 + 56 ^ 21 + 113 - 90 + 128) & (33 + 178 - 3 + 2 ^ 44 + 49 - -43 + 14 ^ -1))) return n2 != 0;
                            return ((0x66 ^ 0x7D ^ (0xBC ^ 0x93)) & (103 + 52 - 140 + 143 ^ 73 + 156 - 228 + 169 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIlllIllIl[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lIlllIllII[lIlllIllIl[41]];
    }

    private static boolean lIIllllIlIIll(int n2, int n3) {
        return n2 >= n3;
    }
}

