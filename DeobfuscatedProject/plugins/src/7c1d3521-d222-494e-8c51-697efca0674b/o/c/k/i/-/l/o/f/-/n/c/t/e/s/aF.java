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

public class aF
implements ac {
    public static final /* synthetic */ WorldArea pz;
    public static final /* synthetic */ int pv;
    public static final /* synthetic */ WorldArea pA;
    public static final /* synthetic */ int pu;
    public static /* synthetic */ int[] ox;
    public static final /* synthetic */ int py;
    public static /* synthetic */ int[] oy;
    private static /* synthetic */ int[] lllIIlllll;
    public static final /* synthetic */ int px;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ int[] ow;
    private static /* synthetic */ String[] lllIIllllI;
    public static final /* synthetic */ WorldPoint pB;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int pw;

    public static void Q() {
        d lllllllllllllllllIlllIIIllIlIlII;
        Object lllllllllllllllllIlllIIIllIlIlIl;
        int[] nArray = new int[lllIIlllll[1]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIlllll[7], lllIIlllll[1], lllIIlllll[5]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIIlllll[1]];
        nArray2[aF.lllIIlllll[0]] = lllIIlllll[8];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlIl = new d(lllIIlllll[8], lllIIlllll[1], lllIIlllll[5]);
            bv.add((d)lllllllllllllllllIlllIIIllIlIlIl);
            "".length();
        }
        int[] nArray3 = new int[lllIIlllll[1]];
        nArray3[aF.lllIIlllll[0]] = lllIIlllll[9];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlIl = new d(lllIIlllll[9], lllIIlllll[1], lllIIlllll[26]);
            bv.add((d)lllllllllllllllllIlllIIIllIlIlIl);
            "".length();
        }
        int[] nArray4 = new int[lllIIlllll[1]];
        nArray4[aF.lllIIlllll[0]] = lllIIlllll[10];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlIl = new d(lllIIlllll[10], lllIIlllll[1], lllIIlllll[27]);
            bv.add((d)lllllllllllllllllIlllIIIllIlIlIl);
            "".length();
        }
        int[] nArray5 = new int[lllIIlllll[1]];
        nArray5[aF.lllIIlllll[0]] = lllIIlllll[11];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlIl = new d(lllIIlllll[11], lllIIlllll[1], lllIIlllll[28]);
            bv.add((d)lllllllllllllllllIlllIIIllIlIlIl);
            "".length();
        }
        if (aF.llIIIIlllIIlI(Bank.contains((Predicate)(lllllllllllllllllIlllIIIllIlIlIl = item -> item.getName().toLowerCase().contains(lllIIllllI[lllIIlllll[36]]))) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlII = new d(lllIIlllll[29], lllIIlllll[12], lllIIlllll[28]);
            bv.add(lllllllllllllllllIlllIIIllIlIlII);
            "".length();
        }
        int[] nArray6 = new int[lllIIlllll[1]];
        nArray6[aF.lllIIlllll[0]] = lllIIlllll[30];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIlllIIIllIlIlII = new d(lllIIlllll[30], lllIIlllll[31], lllIIlllll[32]);
            bv.add(lllllllllllllllllIlllIIIllIlIlII);
            "".length();
        }
    }

    private static boolean llIIIIlllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlllIlII(Object object) {
        return object != null;
    }

    private static void llIIIIllIllll() {
        lllIIlllll = new int[53];
        aF.lllIIlllll[0] = (86 + 53 - -102 + 6 ^ 102 + 106 - 186 + 126) & (0x6A ^ 0x67 ^ (0x41 ^ 0x2F) ^ -" ".length());
        aF.lllIIlllll[1] = " ".length();
        aF.lllIIlllll[2] = -(0xFFFFCEFB & 0x3D1D) & (0xFFFFBFFB & 0x4FFF);
        aF.lllIIlllll[3] = "  ".length();
        aF.lllIIlllll[4] = "   ".length();
        aF.lllIIlllll[5] = -(0xFFFFB154 & 0x6EEF) & (0xFFFFB3EB & 0x7FDF);
        aF.lllIIlllll[6] = 0x95 ^ 0x91;
        aF.lllIIlllll[7] = 0xFFFFD5CF & 0x2F77;
        aF.lllIIlllll[8] = 0xFFFFA5ED & 0x5F5B;
        aF.lllIIlllll[9] = 0xFFFFFD6B & 0x7DF;
        aF.lllIIlllll[10] = -(0xFFFF8AD7 & 0x7729) & (0xFFFF974F & 0x6FFD);
        aF.lllIIlllll[11] = -(0xFFFFDAD5 & 0x6F3B) & (0xFFFFDFFF & 0x6F5F);
        aF.lllIIlllll[12] = 0xE6 ^ 0xA3 ^ (0x4C ^ 0xC);
        aF.lllIIlllll[13] = 0x49 ^ 0x4F;
        aF.lllIIlllll[14] = 0x8B ^ 0x8C;
        aF.lllIIlllll[15] = 0x15 ^ 0x1A;
        aF.lllIIlllll[16] = 8 ^ 0x55 ^ (0x67 ^ 0x32);
        aF.lllIIlllll[17] = 0x67 ^ 0x4C ^ (0xB1 ^ 0x93);
        aF.lllIIlllll[18] = 0x67 ^ 0x28 ^ (0x27 ^ 0x62);
        aF.lllIIlllll[19] = 0x4E ^ 0x1F ^ (0xCB ^ 0x91);
        aF.lllIIlllll[20] = 0x4A ^ 0x4E ^ (0x4C ^ 0x44);
        aF.lllIIlllll[21] = 0xF3 ^ 0xA3 ^ (0x72 ^ 0x2F);
        aF.lllIIlllll[22] = 0x3C ^ 0x17 ^ (0x4B ^ 0x6E);
        aF.lllIIlllll[23] = 0x3F ^ 0x16;
        aF.lllIIlllll[24] = 0x6F ^ 0x70;
        aF.lllIIlllll[25] = 0x47 ^ 0x52;
        aF.lllIIlllll[26] = -(0xFFFFDDFE & 0x3A95) & (0xFFFFBFFF & 0x7BBB);
        aF.lllIIlllll[27] = 0xFFFFFEE7 & 0x2FF8;
        aF.lllIIlllll[28] = 0xFFFFE9AF & 0x77F8;
        aF.lllIIlllll[29] = 0xFFFFEEFE & 0x3FCD;
        aF.lllIIlllll[30] = -(0xFFFFBCB9 & 0x63C7) & (0xFFFFBFD7 & 0x7FEF);
        aF.lllIIlllll[31] = 144 + 54 - 92 + 60 ^ 108 + 94 - 92 + 32;
        aF.lllIIlllll[32] = 0xFFFFC3BF & 0x3FC4;
        aF.lllIIlllll[33] = 0x4C ^ 0x28;
        aF.lllIIlllll[34] = 0x3F ^ 0x2F;
        aF.lllIIlllll[35] = 155 + 85 - 235 + 195 ^ 115 + 88 - 202 + 170;
        aF.lllIIlllll[36] = 82 + 77 - 112 + 109 ^ 37 + 77 - 29 + 56;
        aF.lllIIlllll[37] = -(0xFFFFEFBF & 0x5349) & (0xFFFFCFFD & 0x7F5F);
        aF.lllIIlllll[38] = 0xFFFFAFAF & 0x5D7E;
        aF.lllIIlllll[39] = 0xFC ^ 0xB0 ^ (0x40 ^ 0x21);
        aF.lllIIlllll[40] = 0xFFFF9D7E & 0x6EFF;
        aF.lllIIlllll[41] = -(0xFFFFD3DF & 0x3CEB) & (0xFFFFFDEF & 0x1FFB);
        aF.lllIIlllll[42] = 0xFFFF9C8C & 0x6FF7;
        aF.lllIIlllll[43] = 0xFFFFFD75 & 0xFAF;
        aF.lllIIlllll[44] = 0xFFFFE4FF & 0x1FFC;
        aF.lllIIlllll[45] = -(0xFFFFC912 & 0x77EF) & (0xFFFFE7FF & 0x5DFF);
        aF.lllIIlllll[46] = -(0xFFFFAE71 & 0x5BEF) & (0xFFFF9F7F & 0x6FE2);
        aF.lllIIlllll[47] = 0xFFFFE7DE & 0x1D27;
        aF.lllIIlllll[48] = 0xFFFFEFCD & 0x3A76;
        aF.lllIIlllll[49] = -(0xFFFFFB3D & 0x6DB) & (0xFFFFEFFF & 0x17FF);
        aF.lllIIlllll[50] = -(0xFFFFBE0B & 0x69FF) & (0xFFFFFDFF & 0x2FFB);
        aF.lllIIlllll[51] = -(0xFFFFFBD7 & 0x6439) & (0xFFFFEDFF & 0x77FF);
        aF.lllIIlllll[52] = 0x66 ^ 0x41 ^ (0x4C ^ 0x79);
    }

    @Override
    public String ag() {
        return lllIIllllI[lllIIlllll[34]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[23])) {
            boolean bl;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                bl = lllIIlllll[1];
                "".length();
                if ("   ".length() >= 0) return bl;
                return ((0x39 ^ 0x3C ^ (4 ^ 0x1E)) & (0xD9 ^ 0xB9 ^ 36 + 55 - 67 + 103 ^ -" ".length())) != 0;
            }
            bl = lllIIlllll[0];
            return bl;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[24]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[23])) {
            int n3;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllIIlllll[1]];
                nArray2[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lllIIlllll[1];
                    "".length();
                    if ("   ".length() < (9 ^ 0x33 ^ (0x5E ^ 0x60))) return n3 != 0;
                    return ((235 + 40 - 110 + 90 ^ 83 + 32 - 113 + 197) & (106 + 56 - 35 + 24 ^ 10 + 85 - 82 + 162 ^ -" ".length())) != 0;
                }
            }
            n3 = lllIIlllll[0];
            return n3 != 0;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[25]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[24])) {
            int n4;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllIIlllll[1]];
                nArray3[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllIIlllll[1]];
                    nArray4[aF.lllIIlllll[0]] = lllIIlllll[9];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray4))) {
                        n4 = lllIIlllll[1];
                        "".length();
                        if (((29 + 1 - -138 + 82 ^ 119 + 24 - 53 + 86) & (0x11 ^ 9 ^ (0xEE ^ 0xBC) ^ -" ".length())) <= 0) return n4 != 0;
                        return ((0x3A ^ 0x6F ^ (0x59 ^ 2)) & (95 + 175 - 100 + 14 ^ 88 + 24 - -68 + 2 ^ -" ".length())) != 0;
                    }
                }
            }
            n4 = lllIIlllll[0];
            return n4 != 0;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[13]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[25])) {
            int n5;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllIIlllll[1]];
                nArray5[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllIIlllll[1]];
                    nArray6[aF.lllIIlllll[0]] = lllIIlllll[9];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllIIlllll[1]];
                        nArray7[aF.lllIIlllll[0]] = lllIIlllll[8];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray7))) {
                            n5 = lllIIlllll[1];
                            "".length();
                            if ((0xB5 ^ 0xBC ^ (0x5A ^ 0x57)) > 0) return n5 != 0;
                            return ((177 + 108 - 227 + 125 ^ 120 + 49 - 70 + 48) & (0x1D ^ 0x47 ^ (0x32 ^ 0x4C) ^ -" ".length())) != 0;
                        }
                    }
                }
            }
            n5 = lllIIlllll[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllIIlllll[1]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllIIlllll[1]];
            nArray8[aF.lllIIlllll[0]] = lllIIlllll[10];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllIIlllll[1]];
                nArray9[aF.lllIIlllll[0]] = lllIIlllll[9];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllIIlllll[1]];
                    nArray10[aF.lllIIlllll[0]] = lllIIlllll[8];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllIIlllll[1]];
                        nArray11[aF.lllIIlllll[0]] = lllIIlllll[7];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray11))) {
                            n2 = lllIIlllll[1];
                            "".length();
                            if ((0x25 ^ 2 ^ (0x50 ^ 0x73)) == (0x2F ^ 0x7F ^ (0xE0 ^ 0xB4))) return n2 != 0;
                            return ((0xBB ^ 0xAA ^ (0x19 ^ 0x11)) & (65 + 61 - 28 + 47 ^ 113 + 94 - 111 + 40 ^ -" ".length())) != 0;
                        }
                    }
                }
            }
        }
        n2 = lllIIlllll[0];
        return n2 != 0;
    }

    static {
        aF.llIIIIllIllll();
        aF.llIIIIllIlllI();
        py = lllIIlllll[11];
        pw = lllIIlllll[9];
        pv = lllIIlllll[8];
        px = lllIIlllll[10];
        pu = lllIIlllll[7];
        pz = new WorldArea(lllIIlllll[37], lllIIlllll[38], lllIIlllll[34], lllIIlllll[39], lllIIlllll[0]);
        pA = new WorldArea(lllIIlllll[40], lllIIlllll[41], lllIIlllll[22], lllIIlllll[34], lllIIlllll[0]);
        pB = new WorldPoint(lllIIlllll[42], lllIIlllll[43], lllIIlllll[0]);
        int[] nArray = new int[lllIIlllll[6]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[44];
        nArray[aF.lllIIlllll[1]] = lllIIlllll[45];
        nArray[aF.lllIIlllll[3]] = lllIIlllll[46];
        nArray[aF.lllIIlllll[4]] = lllIIlllll[47];
        ow = nArray;
        int[] nArray2 = new int[lllIIlllll[1]];
        nArray2[aF.lllIIlllll[0]] = lllIIlllll[48];
        ox = nArray2;
        int[] nArray3 = new int[lllIIlllll[4]];
        nArray3[aF.lllIIlllll[0]] = lllIIlllll[49];
        nArray3[aF.lllIIlllll[1]] = lllIIlllll[50];
        nArray3[aF.lllIIlllll[3]] = lllIIlllll[51];
        oy = nArray3;
        bv = new ArrayList<d>();
    }

    @Override
    public boolean ae() {
        return lllIIlllll[0];
    }

    private static void llIIIIllIlllI() {
        lllIIllllI = new String[lllIIlllll[52]];
        aF.lllIIllllI[aF.lllIIlllll[0]] = aF.llIIIIllIlIll("uOTmFcKCLOSOvv5YHRg7cw==", "GwsaT");
        aF.lllIIllllI[aF.lllIIlllll[1]] = aF.llIIIIllIllII("Z2imLIENr0lJ5vbiSgfrh5BWRB9MO+tmEczMumNZwJJoy0GGCjPC/H9GlFc0RUdpFSOedzY2lm8=", "TRlcU");
        aF.lllIIllllI[aF.lllIIlllll[3]] = aF.llIIIIllIllII("k3SemoywbYuha10/fo/t5AJ+IhwRtlej", "fJfId");
        aF.lllIIllllI[aF.lllIIlllll[4]] = aF.llIIIIllIllII("HcHURZ/0n91H8BB4nfZYtg==", "mhqNc");
        aF.lllIIllllI[aF.lllIIlllll[6]] = aF.llIIIIllIllIl("KS8CBw0IIAtDAwAgBwoPBg==", "aNlca");
        aF.lllIIllllI[aF.lllIIlllll[12]] = aF.llIIIIllIllIl("NTBHOAEHdQowABE8CT5TEjwEMhIaMBR1UxEiDi0QCjwJPlMWOkcbJjscKR4=", "bUgYs");
        aF.lllIIllllI[aF.lllIIlllll[13]] = aF.llIIIIllIllII("jhwRXuQieAAKj5BzOoP+6g==", "zfrbc");
        aF.lllIIllllI[aF.lllIIlllll[14]] = aF.llIIIIllIllII("M8mflICotHf3cm7JtjS+DA==", "HYpRc");
        aF.lllIIllllI[aF.lllIIlllll[16]] = aF.llIIIIllIllII("T9tD+oK1/MjZkYLuFGGqgg3K18ezkrci", "ykbmZ");
        aF.lllIIllllI[aF.lllIIlllll[17]] = aF.llIIIIllIllII("D9kTkXt3kE/sPbvJkIp7mw==", "gRuGi");
        aF.lllIIllllI[aF.lllIIlllll[18]] = aF.llIIIIllIlIll("LeSfsc/Dmw3MHU1EKwO5xQ==", "nqytH");
        aF.lllIIllllI[aF.lllIIlllll[19]] = aF.llIIIIllIllIl("JQEBP0gCBhkh", "finOh");
        aF.lllIIllllI[aF.lllIIlllll[20]] = aF.llIIIIllIllIl("Ogo2OCIDDHonJE0EOzhrGRk/Njg=", "mkZSK");
        aF.lllIIllllI[aF.lllIIlllll[21]] = aF.llIIIIllIlIll("jbVJurfkcGTbqlzq856Lpg==", "ysfUo");
        aF.lllIIllllI[aF.lllIIlllll[22]] = aF.llIIIIllIllIl("Ihs1IigIHT1yNwAYej43BgA=", "asZRX");
        aF.lllIIllllI[aF.lllIIlllll[15]] = aF.llIIIIllIllII("MmH+l5LBUGFRcjoIQZnUzA==", "rIqet");
        aF.lllIIllllI[aF.lllIIlllll[34]] = aF.llIIIIllIllII("044HI1bX+JOdFscDLBxReQ==", "xwqNM");
        aF.lllIIllllI[aF.lllIIlllll[36]] = aF.llIIIIllIllIl("GgstAG4HBGMQKwkONw9uQA==", "hbCgN");
    }

    private static boolean llIIIIlllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[35])) {
            bl = lllIIlllll[1];
            "".length();
            if (null != null) {
                return ((0x5D ^ 0x67 ^ (0x58 ^ 0x28)) & (182 + 81 - 241 + 203 ^ 148 + 147 - 180 + 56 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIlllll[0];
        }
        return bl;
    }

    private static String llIIIIllIlIll(String lllllllllllllllllIlllIIIlIlIIlll, String lllllllllllllllllIlllIIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlllll[16]), "DES");
            Cipher lllllllllllllllllIlllIIIlIlIlIIl = Cipher.getInstance("DES");
            lllllllllllllllllIlllIIIlIlIlIIl.init(lllIIlllll[3], lllllllllllllllllIlllIIIlIlIlIlI);
            return new String(lllllllllllllllllIlllIIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIlIlIlIII) {
            lllllllllllllllllIlllIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIllIllIl(String lllllllllllllllllIlllIIIlIllIlll, String lllllllllllllllllIlllIIIlIlllIll) {
        lllllllllllllllllIlllIIIlIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIlIlllIlI = new StringBuilder();
        char[] lllllllllllllllllIlllIIIlIlllIIl = lllllllllllllllllIlllIIIlIlllIll.toCharArray();
        int lllllllllllllllllIlllIIIlIlllIII = lllIIlllll[0];
        char[] lllllllllllllllllIlllIIIlIllIIlI = lllllllllllllllllIlllIIIlIllIlll.toCharArray();
        int lllllllllllllllllIlllIIIlIllIIIl = lllllllllllllllllIlllIIIlIllIIlI.length;
        int lllllllllllllllllIlllIIIlIllIIII = lllIIlllll[0];
        while (aF.llIIIIlllIIIl(lllllllllllllllllIlllIIIlIllIIII, lllllllllllllllllIlllIIIlIllIIIl)) {
            char lllllllllllllllllIlllIIIlIllllIl = lllllllllllllllllIlllIIIlIllIIlI[lllllllllllllllllIlllIIIlIllIIII];
            lllllllllllllllllIlllIIIlIlllIlI.append((char)(lllllllllllllllllIlllIIIlIllllIl ^ lllllllllllllllllIlllIIIlIlllIIl[lllllllllllllllllIlllIIIlIlllIII % lllllllllllllllllIlllIIIlIlllIIl.length]));
            "".length();
            ++lllllllllllllllllIlllIIIlIlllIII;
            ++lllllllllllllllllIlllIIIlIllIIII;
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIIIlIlllIlI);
    }

    @Override
    public int af() {
        aF.gs();
        return lllIIlllll[33];
    }

    private static String llIIIIllIllII(String lllllllllllllllllIlllIIIllIIllII, String lllllllllllllllllIlllIIIllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIIIllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIIIllIIlllI.init(lllIIlllll[3], lllllllllllllllllIlllIIIllIIllll);
            return new String(lllllllllllllllllIlllIIIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIllIIllIl) {
            lllllllllllllllllIlllIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlllIIlI(int n2) {
        return n2 == 0;
    }

    public static void gs() {
        block25: {
            BankLocation lllllllllllllllllIlllIIIllIllIII;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (aF.llIIIIlllIIII(bt ? 1 : 0)) {
                                                AccBuilderSotf.c = lllIIllllI[lllIIlllll[0]];
                                                b.a(bv);
                                                if (aF.llIIIIlllIIIl(bv.size(), lllIIlllll[1])) {
                                                    System.out.println(lllIIllllI[lllIIlllll[1]]);
                                                    bt = lllIIlllll[0];
                                                }
                                            }
                                            if (!aF.llIIIIlllIIlI(bt ? 1 : 0)) break block25;
                                            if (!aF.llIIIIlllIIII(aF.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lllIIlllll[1]];
                                            nArray[aF.lllIIlllll[0]] = lllIIlllll[2];
                                            if (!aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (aF.llIIIIlllIlII(lllllllllllllllllIlllIIIllIllIII = BankLocation.getNearest()) && aF.llIIIIlllIIlI(lllllllllllllllllIlllIIIllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[3]];
                                            a.a(lllllllllllllllllIlllIIIllIllIII);
                                        }
                                        if (!aF.llIIIIlllIlII(lllllllllllllllllIlllIIIllIllIII) || !aF.llIIIIlllIIII(lllllllllllllllllIlllIIIllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (aF.llIIIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlllll[5]);
                                            "".length();
                                        }
                                        if (!aF.llIIIIlllIIII(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderSotf.c = lllIIllllI[lllIIlllll[6]];
                                        if (aF.llIIIIlllIIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIlllll[6]);
                                            "".length();
                                        }
                                        if (aF.llIIIIlllIIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIlllll[3]);
                                            "".length();
                                        }
                                        int[] nArray = new int[lllIIlllll[1]];
                                        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                                        if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lllIIlllll[1]];
                                        nArray2[aF.lllIIlllll[0]] = lllIIlllll[7];
                                        if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray2), lllIIlllll[1])) break block29;
                                    }
                                    int[] nArray = new int[lllIIlllll[1]];
                                    nArray[aF.lllIIlllll[0]] = lllIIlllll[8];
                                    if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lllIIlllll[1]];
                                    nArray3[aF.lllIIlllll[0]] = lllIIlllll[8];
                                    if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray3), lllIIlllll[1])) break block29;
                                }
                                int[] nArray = new int[lllIIlllll[1]];
                                nArray[aF.lllIIlllll[0]] = lllIIlllll[9];
                                if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lllIIlllll[1]];
                                nArray4[aF.lllIIlllll[0]] = lllIIlllll[9];
                                if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray4), lllIIlllll[1])) break block29;
                            }
                            int[] nArray = new int[lllIIlllll[1]];
                            nArray[aF.lllIIlllll[0]] = lllIIlllll[10];
                            if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lllIIlllll[1]];
                            nArray5[aF.lllIIlllll[0]] = lllIIlllll[10];
                            if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray5), lllIIlllll[1])) break block29;
                        }
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lllIIlllll[1]];
                        nArray6[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (!aF.llIIIIlllIIIl(Inventory.getCount((int[])nArray6), lllIIlllll[1])) break block33;
                    }
                    aF.Q();
                    System.out.println(lllIIllllI[lllIIlllll[12]]);
                    bt = lllIIlllll[1];
                    return;
                }
                int[] nArray = new int[lllIIlllll[1]];
                nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[7], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];
                            "".length();
                            if ("   ".length() < " ".length()) {
                                return ((0x1C ^ 2) & ~(0x81 ^ 0x9F)) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);
                    "".length();
                }
                int[] nArray7 = new int[lllIIlllll[1]];
                nArray7[aF.lllIIlllll[0]] = lllIIlllll[8];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[8], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[8];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];
                            "".length();
                            if (-(161 + 180 - 257 + 114 ^ 37 + 16 - -9 + 132) >= 0) {
                                return ((0x5B ^ 0x7A ^ (0x30 ^ 0x43)) & (0xEA ^ 0xAF ^ (0xA1 ^ 0xB6) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);
                    "".length();
                }
                int[] nArray8 = new int[lllIIlllll[1]];
                nArray8[aF.lllIIlllll[0]] = lllIIlllll[9];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[9], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[9];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];
                            "".length();
                            if (null != null) {
                                return ((0x76 ^ 0x6F ^ (0x67 ^ 0x26)) & (0x82 ^ 0x96 ^ (0x1A ^ 0x56) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);
                    "".length();
                }
                int[] nArray9 = new int[lllIIlllll[1]];
                nArray9[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[10], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[10];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];
                            "".length();
                            if (null != null) {
                                return ((0x78 ^ 0x37) & ~(0x20 ^ 0x6F)) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);
                    "".length();
                }
                int[] nArray10 = new int[lllIIlllll[1]];
                nArray10[aF.lllIIlllll[0]] = lllIIlllll[11];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[11], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];
                            "".length();
                            if (-" ".length() == (0x6A ^ 0x6E)) {
                                return ((0x8F ^ 0xB6) & ~(0xA2 ^ 0x9B)) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);
                    "".length();
                }
            }
            if (aF.llIIIIlllIIII(aF.an() ? 1 : 0)) {
                if (aF.llIIIIlllIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllllI[lllIIlllll[13]];
                    System.out.println(lllIIllllI[lllIIlllll[14]]);
                    Inventory.getAll((int[])oy).stream().forEach(Item::drop);
                }
                if (aF.llIIIIlllIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (aF.llIIIIlllIIlI(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[16]];
                            Movement.walkTo((WorldPoint)pz.toWorldPoint());
                            "".length();
                            Time.sleepTicks((int)lllIIlllll[6]);
                            "".length();
                        }
                        if (aF.llIIIIlllIIII(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[17]];
                            lllllllllllllllllIlllIIIllIllIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ow);
                            if (aF.llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && aF.llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && aF.llIIIIlllIlII(lllllllllllllllllIlllIIIllIllIII)) {
                                System.out.println(lllIIllllI[lllIIlllll[18]]);
                                lllllllllllllllllIlllIIIllIllIII.interact(lllIIllllI[lllIIlllll[19]]);
                                Time.sleepTicks((int)lllIIlllll[4]);
                                "".length();
                            }
                        }
                    }
                    if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (aF.llIIIIlllIIlI(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[20]];
                            Movement.walkTo((WorldPoint)pB);
                            "".length();
                            Time.sleepTicks((int)lllIIlllll[6]);
                            "".length();
                        }
                        if (aF.llIIIIlllIIII(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[21]];
                            lllllllllllllllllIlllIIIllIllIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ox);
                            if (aF.llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && aF.llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && aF.llIIIIlllIlII(lllllllllllllllllIlllIIIllIllIII)) {
                                System.out.println(lllIIllllI[lllIIlllll[22]]);
                                lllllllllllllllllIlllIIIllIllIII.interact(lllIIllllI[lllIIlllll[15]]);
                                Time.sleepTicks((int)lllIIlllll[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
}

