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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import gg.squire.account.AccBuilderGWD;
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

public class ar
implements ab {
    public static final /* synthetic */ int mJ;
    public static final /* synthetic */ WorldArea mM;
    public static final /* synthetic */ WorldArea mN;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] lllIIllIl;
    public static /* synthetic */ int[] mP;
    public static final /* synthetic */ WorldPoint mO;
    public static final /* synthetic */ int mK;
    public static final /* synthetic */ int mI;
    public static final /* synthetic */ int mH;
    public static /* synthetic */ int[] mQ;
    private static /* synthetic */ String[] lllIIllII;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ int[] my;
    public static final /* synthetic */ int mL;

    @Override
    public int af() {
        ar.eP();
        return lllIIllIl[33];
    }

    private static boolean llIIIIllllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[35])) {
            bl = lllIIllIl[1];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0x95 ^ 0x8D ^ (0x2C ^ 0x20)) & (0x15 ^ 0x4D ^ (0x7F ^ 0x33) ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIllIl[0];
        }
        return bl;
    }

    static {
        ar.llIIIIllllII();
        ar.llIIIIlllIll();
        mL = lllIIllIl[11];
        mK = lllIIllIl[10];
        mJ = lllIIllIl[9];
        mH = lllIIllIl[7];
        mI = lllIIllIl[8];
        mM = new WorldArea(lllIIllIl[37], lllIIllIl[38], lllIIllIl[34], lllIIllIl[39], lllIIllIl[0]);
        mN = new WorldArea(lllIIllIl[40], lllIIllIl[41], lllIIllIl[22], lllIIllIl[34], lllIIllIl[0]);
        mO = new WorldPoint(lllIIllIl[42], lllIIllIl[43], lllIIllIl[0]);
        int[] nArray = new int[lllIIllIl[6]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[44];
        nArray[ar.lllIIllIl[1]] = lllIIllIl[45];
        nArray[ar.lllIIllIl[3]] = lllIIllIl[46];
        nArray[ar.lllIIllIl[4]] = lllIIllIl[47];
        mP = nArray;
        int[] nArray2 = new int[lllIIllIl[1]];
        nArray2[ar.lllIIllIl[0]] = lllIIllIl[48];
        mQ = nArray2;
        int[] nArray3 = new int[lllIIllIl[4]];
        nArray3[ar.lllIIllIl[0]] = lllIIllIl[49];
        nArray3[ar.lllIIllIl[1]] = lllIIllIl[50];
        nArray3[ar.lllIIllIl[3]] = lllIIllIl[51];
        my = nArray3;
        bx = new ArrayList<d>();
    }

    private static boolean llIIIlIIIIII(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[23])) {
            boolean bl;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                bl = lllIIllIl[1];
                "".length();
                if (" ".length() == " ".length()) return bl;
                return ((0x93 ^ 0xAB ^ (0x3E ^ 0x65)) & (121 + 124 - 36 + 39 ^ 142 + 45 - 143 + 111 ^ -" ".length())) != 0;
            }
            bl = lllIIllIl[0];
            return bl;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[24]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[23])) {
            int n3;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllIIllIl[1]];
                nArray2[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = lllIIllIl[1];
                    "".length();
                    if (" ".length() != (64 + 74 - 124 + 131 ^ 17 + 37 - -30 + 65)) return n3 != 0;
                    return ((0x99 ^ 0x8D ^ (0xCB ^ 0x8C)) & (0xE ^ 0x6F ^ (0x81 ^ 0xB3) ^ -" ".length())) != 0;
                }
            }
            n3 = lllIIllIl[0];
            return n3 != 0;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[25]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[24])) {
            int n4;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllIIllIl[1]];
                nArray3[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllIIllIl[1]];
                    nArray4[ar.lllIIllIl[0]] = lllIIllIl[9];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray4))) {
                        n4 = lllIIllIl[1];
                        "".length();
                        if (((0x96 ^ 0xB6) & ~(0xA2 ^ 0x82)) == 0) return n4 != 0;
                        return ((0x29 ^ 0x19) & ~(0xBD ^ 0x8D)) != 0;
                    }
                }
            }
            n4 = lllIIllIl[0];
            return n4 != 0;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[13]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[25])) {
            int n5;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllIIllIl[1]];
                nArray5[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllIIllIl[1]];
                    nArray6[ar.lllIIllIl[0]] = lllIIllIl[9];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllIIllIl[1]];
                        nArray7[ar.lllIIllIl[0]] = lllIIllIl[8];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray7))) {
                            n5 = lllIIllIl[1];
                            "".length();
                            if (" ".length() <= "  ".length()) return n5 != 0;
                            return ((0xA5 ^ 0x93) & ~(0xF1 ^ 0xC7)) != 0;
                        }
                    }
                }
            }
            n5 = lllIIllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllIIllIl[1]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllIIllIl[1]];
            nArray8[ar.lllIIllIl[0]] = lllIIllIl[10];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllIIllIl[1]];
                nArray9[ar.lllIIllIl[0]] = lllIIllIl[9];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllIIllIl[1]];
                    nArray10[ar.lllIIllIl[0]] = lllIIllIl[8];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllIIllIl[1]];
                        nArray11[ar.lllIIllIl[0]] = lllIIllIl[7];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray11))) {
                            n2 = lllIIllIl[1];
                            "".length();
                            if ((0xC3 ^ 0xC6) > 0) return n2 != 0;
                            return ((0xA6 ^ 0x8E) & ~(0xB9 ^ 0x91)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lllIIllIl[0];
        return n2 != 0;
    }

    private static boolean llIIIIllllll(int n2) {
        return n2 == 0;
    }

    private static String llIIIIlllIII(String lllIllIIllIIl, String lllIllIIllIII) {
        lllIllIIllIIl = new String(Base64.getDecoder().decode(lllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIIlIlll = new StringBuilder();
        char[] lllIllIIlIllI = lllIllIIllIII.toCharArray();
        int lllIllIIlIlIl = lllIIllIl[0];
        char[] lllIllIIIllll = lllIllIIllIIl.toCharArray();
        int lllIllIIIlllI = lllIllIIIllll.length;
        int lllIllIIIllIl = lllIIllIl[0];
        while (ar.llIIIIlllllI(lllIllIIIllIl, lllIllIIIlllI)) {
            char lllIllIIllIlI = lllIllIIIllll[lllIllIIIllIl];
            lllIllIIlIlll.append((char)(lllIllIIllIlI ^ lllIllIIlIllI[lllIllIIlIlIl % lllIllIIlIllI.length]));
            "".length();
            ++lllIllIIlIlIl;
            ++lllIllIIIllIl;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllIllIIlIlll);
    }

    private static String llIIIIlllIlI(String lllIllIIIIIlI, String lllIllIIIIIIl) {
        try {
            SecretKeySpec lllIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIllIl[16]), "DES");
            Cipher lllIllIIIIllI = Cipher.getInstance("DES");
            lllIllIIIIllI.init(lllIIllIl[3], lllIllIIIIlll);
            return new String(lllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIIIlIl) {
            lllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    public static void Q() {
        d lllIllIlIIlII;
        Object lllIllIlIIlIl;
        int[] nArray = new int[lllIIllIl[1]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIllIl[7], lllIIllIl[1], lllIIllIl[5]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIIllIl[1]];
        nArray2[ar.lllIIllIl[0]] = lllIIllIl[8];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIllIlIIlIl = new d(lllIIllIl[8], lllIIllIl[1], lllIIllIl[5]);
            bx.add((d)lllIllIlIIlIl);
            "".length();
        }
        int[] nArray3 = new int[lllIIllIl[1]];
        nArray3[ar.lllIIllIl[0]] = lllIIllIl[9];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIllIlIIlIl = new d(lllIIllIl[9], lllIIllIl[1], lllIIllIl[26]);
            bx.add((d)lllIllIlIIlIl);
            "".length();
        }
        int[] nArray4 = new int[lllIIllIl[1]];
        nArray4[ar.lllIIllIl[0]] = lllIIllIl[10];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIllIlIIlIl = new d(lllIIllIl[10], lllIIllIl[1], lllIIllIl[27]);
            bx.add((d)lllIllIlIIlIl);
            "".length();
        }
        int[] nArray5 = new int[lllIIllIl[1]];
        nArray5[ar.lllIIllIl[0]] = lllIIllIl[11];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIllIlIIlIl = new d(lllIIllIl[11], lllIIllIl[1], lllIIllIl[28]);
            bx.add((d)lllIllIlIIlIl);
            "".length();
        }
        if (ar.llIIIIllllll(Bank.contains((Predicate)(lllIllIlIIlIl = item -> item.getName().toLowerCase().contains(lllIIllII[lllIIllIl[36]]))) ? 1 : 0)) {
            lllIllIlIIlII = new d(lllIIllIl[29], lllIIllIl[12], lllIIllIl[28]);
            bx.add(lllIllIlIIlII);
            "".length();
        }
        int[] nArray6 = new int[lllIIllIl[1]];
        nArray6[ar.lllIIllIl[0]] = lllIIllIl[30];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIllIlIIlII = new d(lllIIllIl[30], lllIIllIl[31], lllIIllIl[32]);
            bx.add(lllIllIlIIlII);
            "".length();
        }
    }

    private static void llIIIIlllIll() {
        lllIIllII = new String[lllIIllIl[52]];
        ar.lllIIllII[ar.lllIIllIl[0]] = ar.llIIIIlllIII("JDI7OSYBZyskLQs0", "fGBPH");
        ar.lllIIllII[ar.lllIIllIl[1]] = ar.llIIIIlllIII("BRkWKzsrFRxiKjYJESwvYxkMJyUwXFgxPyoEGyohLRdYICkgG1g2J2MHFy0sIAUMNiEtFw==", "CpxBH");
        ar.lllIIllII[ar.lllIIllIl[3]] = ar.llIIIIlllIIl("8a7jpN3+WHrBzpeO08gzTfHA5tNiwsdS", "IXGvf");
        ar.lllIIllII[ar.lllIIllIl[4]] = ar.llIIIIlllIIl("Ut9t+VV1nCQa7hzuO/8HOw==", "SOcsB");
        ar.lllIIllII[ar.lllIIllIl[6]] = ar.llIIIIlllIIl("Gn85XzJ/aCsGhaLpi9RfJ6BzDoADUkVb", "LAAqs");
        ar.lllIIllII[ar.lllIIllIl[12]] = ar.llIIIIlllIII("HyJ4EwEtZzUbADsuNhVTOC47GRIwIiteUzswMQYQIC42FVM8KHgwJhEOFjU=", "HGXrs");
        ar.lllIIllII[ar.lllIIllIl[13]] = ar.llIIIIlllIIl("o8lfoTLRoD3ogaeqkeFFdA==", "RtoQO");
        ar.lllIIllII[ar.lllIIllIl[14]] = ar.llIIIIlllIII("Ejs1Ggg/Jz1KFDkuKQ==", "VIZjx");
        ar.lllIIllII[ar.lllIIllIl[16]] = ar.llIIIIlllIlI("E5Mavd1nsgPIxhxqGf5VrmYqXRaQzNB0", "FeDda");
        ar.lllIIllII[ar.lllIIllIl[17]] = ar.llIIIIlllIlI("E9T+XC6cqJVpg9cg0Bu/NA==", "ybhRP");
        ar.lllIIllII[ar.lllIIllIl[18]] = ar.llIIIIlllIIl("KRul6JGQlibdwuDcMtviZQ==", "MubTL");
        ar.lllIIllII[ar.lllIIllIl[19]] = ar.llIIIIlllIlI("bM5tld6pKUkBWzFtkGtdFg==", "vRiyh");
        ar.lllIIllII[ar.lllIIllIl[20]] = ar.llIIIIlllIIl("XLxoH+wMcPZqw/AwBHt+r+Q9exj7xb8V", "iLodU");
        ar.lllIIllII[ar.lllIIllIl[21]] = ar.llIIIIlllIIl("kZ5yPVw4AG8BpGGyA268jw==", "uBQkb");
        ar.lllIIllII[ar.lllIIllIl[22]] = ar.llIIIIlllIII("DTwhEgYnOilCGS8/bg4ZKSc=", "NTNbv");
        ar.lllIIllII[ar.lllIIllIl[15]] = ar.llIIIIlllIlI("gE9dH7EiRtB17RbzKI6OsQ==", "EdOqf");
        ar.lllIIllII[ar.lllIIllIl[34]] = ar.llIIIIlllIlI("tIgILuXoK/0GPrjC04Pjpw==", "JpvoW");
        ar.lllIIllII[ar.lllIIllIl[36]] = ar.llIIIIlllIII("Cwc0CkQWCHoaARgCLgVEUQ==", "ynZmd");
    }

    private static void llIIIIllllII() {
        lllIIllIl = new int[53];
        ar.lllIIllIl[0] = (0x45 ^ 0xF) & ~(0xF7 ^ 0xBD);
        ar.lllIIllIl[1] = " ".length();
        ar.lllIIllIl[2] = -(0xFFFFA00B & 0x7FFD) & (0xFFFFABEF & 0x77FB);
        ar.lllIIllIl[3] = "  ".length();
        ar.lllIIllIl[4] = "   ".length();
        ar.lllIIllIl[5] = -(0xFFFFDF73 & 0x6CFE) & (0xFFFFFFFD & 0x5FFB);
        ar.lllIIllIl[6] = 0x55 ^ 0x3D ^ (0x71 ^ 0x1D);
        ar.lllIIllIl[7] = -(0xFFFFF5D9 & 0x6ABF) & (0xFFFFEDDF & 0x77FF);
        ar.lllIIllIl[8] = -(0xFFFFD49B & 0x3BE7) & (0xFFFFBFDF & 0x55EB);
        ar.lllIIllIl[9] = 0xFFFFDDCF & 0x277B;
        ar.lllIIllIl[10] = -(0xFFFFEBBF & 0x5EE1) & (0xFFFFFFFF & 0x4FED);
        ar.lllIIllIl[11] = -(0xFFFFCBFF & 0x7611) & (0xFFFFF7DF & 0x4F7F);
        ar.lllIIllIl[12] = 16 + 43 - 33 + 152 ^ 30 + 87 - -28 + 38;
        ar.lllIIllIl[13] = 0x7C ^ 0x60 ^ (0x51 ^ 0x4B);
        ar.lllIIllIl[14] = 31 + 137 - 36 + 28 ^ 161 + 159 - 186 + 33;
        ar.lllIIllIl[15] = 0x1A ^ 0x15;
        ar.lllIIllIl[16] = 0x23 ^ 0x2B;
        ar.lllIIllIl[17] = 86 + 16 - 46 + 122 ^ 20 + 35 - -53 + 79;
        ar.lllIIllIl[18] = 0x68 ^ 0x22 ^ (0x54 ^ 0x14);
        ar.lllIIllIl[19] = 0xB3 ^ 0xB8;
        ar.lllIIllIl[20] = 0x63 ^ 0xF ^ (0x10 ^ 0x70);
        ar.lllIIllIl[21] = 140 + 13 - 37 + 30 ^ 98 + 101 - 82 + 42;
        ar.lllIIllIl[22] = 0x64 ^ 0x6A;
        ar.lllIIllIl[23] = 0x89 ^ 0xA0;
        ar.lllIIllIl[24] = 7 ^ 0x2E ^ (0x56 ^ 0x60);
        ar.lllIIllIl[25] = 151 + 170 - 265 + 133 ^ 45 + 162 - 127 + 88;
        ar.lllIIllIl[26] = -(0xFFFFDC3B & 0x2FD7) & (0xFFFFFF3A & 0x2FFF);
        ar.lllIIllIl[27] = -(0xFFFFFDBE & 0x134F) & (0xFFFFFFFF & 0x3FED);
        ar.lllIIllIl[28] = 0xFFFFE5A8 & 0x7BFF;
        ar.lllIIllIl[29] = 0xFFFFEECD & 0x3FFE;
        ar.lllIIllIl[30] = 0xFFFFFF67 & 0x1FDF;
        ar.lllIIllIl[31] = 0x6B ^ 0x6F ^ (0xEE ^ 0xC2);
        ar.lllIIllIl[32] = 0xFFFFE784 & 0x1BFF;
        ar.lllIIllIl[33] = 0x2F ^ 0x4D ^ (0x3A ^ 0x3C);
        ar.lllIIllIl[34] = 0xDC ^ 0xB9 ^ (0x77 ^ 2);
        ar.lllIIllIl[35] = 0x58 ^ 0x33 ^ (0xB4 ^ 0xBC);
        ar.lllIIllIl[36] = 0x92 ^ 0xBA ^ (0x35 ^ 0xC);
        ar.lllIIllIl[37] = 0xFFFFDE77 & 0x2DDD;
        ar.lllIIllIl[38] = -(0xFFFF98F9 & 0x7797) & (0xFFFF9DFF & 0x7FBE);
        ar.lllIIllIl[39] = 0xB8 ^ 0x95;
        ar.lllIIllIl[40] = -(0xFFFFB7FE & 0x6883) & (0xFFFFAFFF & 0x7CFF);
        ar.lllIIllIl[41] = 0xFFFF9D7B & 0x6FA5;
        ar.lllIIllIl[42] = -(0xFFFFBC9B & 0x7367) & (0xFFFFBF8F & 0x7CF6);
        ar.lllIIllIl[43] = -(0xFFFFE5FF & 0x7A91) & (0xFFFFEDFD & 0x7FB7);
        ar.lllIIllIl[44] = 0xFFFFACFE & 0x57FD;
        ar.lllIIllIl[45] = 0xFFFFBCFE & 0x47FF;
        ar.lllIIllIl[46] = -(2 ^ 0xC) & (0xFFFFFD0F & 0x7FF);
        ar.lllIIllIl[47] = 0xFFFFA79E & 0x5D67;
        ar.lllIIllIl[48] = 0xFFFFBA74 & 0x6FCF;
        ar.lllIIllIl[49] = 0xFFFFBDEF & 0x47F7;
        ar.lllIIllIl[50] = -(0xFFFFE23F & 0x5DCF) & (0xFFFFCDFF & 0x77FF);
        ar.lllIIllIl[51] = 0xFFFFEDFF & 0x17EF;
        ar.lllIIllIl[52] = 0xE4 ^ 0x96 ^ (0x24 ^ 0x44);
    }

    private static boolean llIIIlIIIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lllIIllIl[0];
    }

    private static boolean llIIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lllIIllII[lllIIllIl[34]];
    }

    private static boolean llIIIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIIIlllIIl(String lllIlIlllIlll, String lllIlIlllIllI) {
        try {
            SecretKeySpec lllIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIllllIIl = Cipher.getInstance("Blowfish");
            lllIlIllllIIl.init(lllIIllIl[3], lllIlIllllIlI);
            return new String(lllIlIllllIIl.doFinal(Base64.getDecoder().decode(lllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIllllIII) {
            lllIlIllllIII.printStackTrace();
            return null;
        }
    }

    public static void eP() {
        block25: {
            BankLocation lllIllIlIlIII;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (ar.llIIIIllllIl(bv ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIIllII[lllIIllIl[0]];
                                                b.a(bx);
                                                if (ar.llIIIIlllllI(bx.size(), lllIIllIl[1])) {
                                                    System.out.println(lllIIllII[lllIIllIl[1]]);
                                                    bv = lllIIllIl[0];
                                                }
                                            }
                                            if (!ar.llIIIIllllll(bv ? 1 : 0)) break block25;
                                            if (!ar.llIIIIllllIl(ar.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lllIIllIl[1]];
                                            nArray[ar.lllIIllIl[0]] = lllIIllIl[2];
                                            if (!ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (ar.llIIIlIIIIIl(lllIllIlIlIII = BankLocation.getNearest()) && ar.llIIIIllllll(lllIllIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIllII[lllIIllIl[3]];
                                            a.a(lllIllIlIlIII);
                                        }
                                        if (!ar.llIIIlIIIIIl(lllIllIlIlIII) || !ar.llIIIIllllIl(lllIllIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (ar.llIIIIllllll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIllII[lllIIllIl[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIl[5]);
                                            "".length();
                                        }
                                        if (!ar.llIIIIllllIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderGWD.c = lllIIllII[lllIIllIl[6]];
                                        if (ar.llIIIlIIIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIllIl[6]);
                                            "".length();
                                        }
                                        if (ar.llIIIlIIIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIllIl[3]);
                                            "".length();
                                        }
                                        int[] nArray = new int[lllIIllIl[1]];
                                        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                                        if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lllIIllIl[1]];
                                        nArray2[ar.lllIIllIl[0]] = lllIIllIl[7];
                                        if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray2), lllIIllIl[1])) break block29;
                                    }
                                    int[] nArray = new int[lllIIllIl[1]];
                                    nArray[ar.lllIIllIl[0]] = lllIIllIl[8];
                                    if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lllIIllIl[1]];
                                    nArray3[ar.lllIIllIl[0]] = lllIIllIl[8];
                                    if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray3), lllIIllIl[1])) break block29;
                                }
                                int[] nArray = new int[lllIIllIl[1]];
                                nArray[ar.lllIIllIl[0]] = lllIIllIl[9];
                                if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lllIIllIl[1]];
                                nArray4[ar.lllIIllIl[0]] = lllIIllIl[9];
                                if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray4), lllIIllIl[1])) break block29;
                            }
                            int[] nArray = new int[lllIIllIl[1]];
                            nArray[ar.lllIIllIl[0]] = lllIIllIl[10];
                            if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lllIIllIl[1]];
                            nArray5[ar.lllIIllIl[0]] = lllIIllIl[10];
                            if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray5), lllIIllIl[1])) break block29;
                        }
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lllIIllIl[1]];
                        nArray6[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (!ar.llIIIIlllllI(Inventory.getCount((int[])nArray6), lllIIllIl[1])) break block33;
                    }
                    ar.Q();
                    System.out.println(lllIIllII[lllIIllIl[12]]);
                    bv = lllIIllIl[1];
                    return;
                }
                int[] nArray = new int[lllIIllIl[1]];
                nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[7], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];
                            "".length();
                            if ("   ".length() == "  ".length()) {
                                return ((15 + 23 - -61 + 128 ^ 68 + 79 - 120 + 151) & (0x86 ^ 0xBB ^ (0x60 ^ 0xC) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);
                    "".length();
                }
                int[] nArray7 = new int[lllIIllIl[1]];
                nArray7[ar.lllIIllIl[0]] = lllIIllIl[8];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[8], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[8];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];
                            "".length();
                            if ("  ".length() == -" ".length()) {
                                return ((0x6F ^ 0x4A ^ (0xF9 ^ 0x82)) & (71 + 13 - -48 + 79 ^ 111 + 5 - 36 + 61 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);
                    "".length();
                }
                int[] nArray8 = new int[lllIIllIl[1]];
                nArray8[ar.lllIIllIl[0]] = lllIIllIl[9];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[9], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[9];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];
                            "".length();
                            if ("   ".length() < 0) {
                                return ((1 ^ 0x50) & ~(0xF0 ^ 0xA1)) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);
                    "".length();
                }
                int[] nArray9 = new int[lllIIllIl[1]];
                nArray9[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[10], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[10];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];
                            "".length();
                            if (((0x2D ^ 0x6F ^ (0x39 ^ 0x2F)) & (0x7D ^ 0x6A ^ (0x57 ^ 0x14) ^ -" ".length())) != 0) {
                                return ((0x7C ^ 0x19 ^ (0x66 ^ 0x38)) & (0xEF ^ 0xAD ^ (0x1F ^ 0x66) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);
                    "".length();
                }
                int[] nArray10 = new int[lllIIllIl[1]];
                nArray10[ar.lllIIllIl[0]] = lllIIllIl[11];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[11], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];
                            "".length();
                            if (((0xC ^ 0x3B ^ "  ".length()) & (0x30 ^ 0x4D ^ (0xCA ^ 0x82) ^ -" ".length())) != 0) {
                                return ((162 + 8 - 32 + 110 ^ 4 + 168 - 48 + 64) & (0xF3 ^ 0xB1 ^ (0x65 ^ 0x63) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);
                    "".length();
                }
            }
            if (ar.llIIIIllllIl(ar.an() ? 1 : 0)) {
                if (ar.llIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIllII[lllIIllIl[13]];
                    System.out.println(lllIIllII[lllIIllIl[14]]);
                    Inventory.getAll((int[])my).stream().forEach(Item::drop);
                }
                if (ar.llIIIIllllll(Inventory.isFull() ? 1 : 0)) {
                    if (ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (ar.llIIIIllllll(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[16]];
                            Movement.walkTo((WorldPoint)mM.toWorldPoint());
                            "".length();
                            Time.sleepTicks((int)lllIIllIl[6]);
                            "".length();
                        }
                        if (ar.llIIIIllllIl(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[17]];
                            lllIllIlIlIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mP);
                            if (ar.llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && ar.llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && ar.llIIIlIIIIIl(lllIllIlIlIII)) {
                                System.out.println(lllIIllII[lllIIllIl[18]]);
                                lllIllIlIlIII.interact(lllIIllII[lllIIllIl[19]]);
                                Time.sleepTicks((int)lllIIllIl[4]);
                                "".length();
                            }
                        }
                    }
                    if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (ar.llIIIIllllll(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[20]];
                            Movement.walkTo((WorldPoint)mO);
                            "".length();
                            Time.sleepTicks((int)lllIIllIl[6]);
                            "".length();
                        }
                        if (ar.llIIIIllllIl(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[21]];
                            lllIllIlIlIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mQ);
                            if (ar.llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && ar.llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && ar.llIIIlIIIIIl(lllIllIlIlIII)) {
                                System.out.println(lllIIllII[lllIIllIl[22]]);
                                lllIllIlIlIII.interact(lllIIllII[lllIIllIl[15]]);
                                Time.sleepTicks((int)lllIIllIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
}

