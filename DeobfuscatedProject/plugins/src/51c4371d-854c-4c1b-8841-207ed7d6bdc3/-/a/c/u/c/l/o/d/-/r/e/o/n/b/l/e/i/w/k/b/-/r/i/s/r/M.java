/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

public class M
implements F {
    private static /* synthetic */ int[] llIIllll;
    public static /* synthetic */ List<d> bB;
    public static final /* synthetic */ int iU;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] llIIllIl;
    public static final /* synthetic */ int iV;

    private static boolean lIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIlIlII(String lIlIlIIIlIIIlIl, String lIlIlIIIIllllll) {
        lIlIlIIIlIIIlIl = new String(Base64.getDecoder().decode(lIlIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIIlIIIIll = new StringBuilder();
        char[] lIlIlIIIlIIIIlI = lIlIlIIIIllllll.toCharArray();
        int lIlIlIIIlIIIIIl = llIIllll[0];
        char[] lIlIlIIIIlllIll = lIlIlIIIlIIIlIl.toCharArray();
        int lIlIlIIIIlllIlI = lIlIlIIIIlllIll.length;
        int lIlIlIIIIlllIIl = llIIllll[0];
        while (M.lIlIllIIlIl(lIlIlIIIIlllIIl, lIlIlIIIIlllIlI)) {
            char lIlIlIIIlIIIllI = lIlIlIIIIlllIll[lIlIlIIIIlllIIl];
            lIlIlIIIlIIIIll.append((char)(lIlIlIIIlIIIllI ^ lIlIlIIIlIIIIlI[lIlIlIIIlIIIIIl % lIlIlIIIlIIIIlI.length]));
            "".length();
            ++lIlIlIIIlIIIIIl;
            ++lIlIlIIIIlllIIl;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIIIlIIIIll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ac() {
        int n2;
        int[] nArray = new int[llIIllll[1]];
        nArray[M.llIIllll[0]] = llIIllll[7];
        if (M.lIlIllIIlll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIIllll[1]];
            nArray2[M.llIIllll[0]] = llIIllll[8];
            if (M.lIlIllIIlll(Inventory.getCount((int[])nArray2))) {
                n2 = llIIllll[1];
                "".length();
                if (null == null) return n2 != 0;
                return ((0x13 ^ 0x1F) & ~(0x73 ^ 0x7F)) != 0;
            }
        }
        n2 = llIIllll[0];
        return n2 != 0;
    }

    private static boolean lIlIllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean T() {
        return llIIllll[0];
    }

    private static void lIlIllIIIII() {
        llIIllIl = new String[llIIllll[46]];
        M.llIIllIl[M.llIIllll[0]] = M.lIlIlIlIIll("x4DWQwPn0F1RRhaCz7RPrw==", "quvxC");
        M.llIIllIl[M.llIIllll[1]] = M.lIlIlIlIIll("PHAyVke5PXWvpVwVggOF/grdiEpjKLiM4lr8I+g4I4EY5NE4Y8Mua45fbTVe0bUQgGv+uycPnic=", "WfkEA");
        M.llIIllIl[M.llIIllll[3]] = M.lIlIlIlIlII("GgciDA41Ej0LDnQSO0ULNQg/", "TfTei");
        M.llIIllIl[M.llIIllll[4]] = M.lIlIlIlIlIl("NvGBqIjYNeLwBKAFvTG6+Q==", "OmKgA");
        M.llIIllIl[M.llIIllll[6]] = M.lIlIlIlIlIl("eVlMXFFo4AStwWq3L+wodXw6DMw9ENSj", "VqfDh");
        M.llIIllIl[M.llIIllll[9]] = M.lIlIlIlIlII("Byh1Lh01bTgmHCMkOyhPIzglPwM5KCZjTyM6PDsMOCQ7KE8kInUNOgkEGwg=", "PMUOo");
        M.llIIllIl[M.llIIllll[10]] = M.lIlIlIlIIll("mYtntLm50j/jVLPoVZxLJg==", "tMTXx");
        M.llIIllIl[M.llIIllll[11]] = M.lIlIlIlIIll("sZ1qrmjg9OXc+v7PHfS6XA==", "aamQa");
        M.llIIllIl[M.llIIllll[12]] = M.lIlIlIlIlII("Mg4rGEQXBy8ZFw==", "pkNjd");
        M.llIIllIl[M.llIIllll[15]] = M.lIlIlIlIIll("2tq2pea5tGqt+S4v2iwCGH5dnR7wlGgZ", "PdtZx");
        M.llIIllIl[M.llIIllll[17]] = M.lIlIlIlIIll("UyNHFyW6xG0+6R1IdNyNJQ==", "lqrLs");
        M.llIIllIl[M.llIIllll[18]] = M.lIlIlIlIIll("s98qyr11ZIffUE6IX6i8Xg==", "qnChm");
        M.llIIllIl[M.llIIllll[14]] = M.lIlIlIlIIll("6CAmMcvvcSHfEgerC5msHw==", "xmIdi");
        M.llIIllIl[M.llIIllll[20]] = M.lIlIlIlIlII("IzEpJA==", "uXHHV");
        M.llIIllIl[M.llIIllll[22]] = M.lIlIlIlIlIl("qYechbSF1dFtDdJ1iYOcHjqWzsXxFPM6", "LvOfZ");
        M.llIIllIl[M.llIIllll[23]] = M.lIlIlIlIlIl("yu+fC7Hb1rkTHu9jJrUj9w==", "sprwB");
        M.llIIllIl[M.llIIllll[25]] = M.lIlIlIlIlII("ETgRIQY7JBdnHSAo", "RJpGr");
        M.llIIllIl[M.llIIllll[26]] = M.lIlIlIlIIll("XhdPt3tZhI6apg2SAGtsGGeIUT+ZjlGu", "FXjPW");
        M.llIIllIl[M.llIIllll[28]] = M.lIlIlIlIlIl("b7VMSvU1AZV8QUf3rmoiRw==", "pfvWZ");
        M.llIIllIl[M.llIIllll[29]] = M.lIlIlIlIlIl("4KtPf7UfRiKBHgYg8dRyLg==", "RTLCr");
        M.llIIllIl[M.llIIllll[30]] = M.lIlIlIlIIll("11dHxjeCYyA9LXjgxrKFBhQ/Yv2Nhi6H", "kLOZG");
        M.llIIllIl[M.llIIllll[31]] = M.lIlIlIlIIll("3JsF82XpcH+/PN6SiOyzBA==", "xiGjn");
        M.llIIllIl[M.llIIllll[32]] = M.lIlIlIlIlII("GzIjPy8+Zzc5LS0iNHYmNSYpJQ==", "YGZVA");
        M.llIIllIl[M.llIIllll[35]] = M.lIlIlIlIlIl("yeLFtAuJpiRicOxH2Se/FIvlwhI/E+Bi9V56iuRDwTk=", "THMfi");
        M.llIIllIl[M.llIIllll[43]] = M.lIlIlIlIlIl("zhrDnSOZ8Wpy+/di3yaUtg==", "ZQsia");
        M.llIIllIl[M.llIIllll[45]] = M.lIlIlIlIIll("p7pyzUHe3mKx5/2Yl3finNP/ANcdiVCi", "cExnf");
    }

    private static boolean lIlIllIIllI(int n2) {
        return n2 == 0;
    }

    static {
        M.lIlIllIIIll();
        M.lIlIllIIIII();
        iU = llIIllll[7];
        iV = llIIllll[8];
        bB = new ArrayList<d>();
    }

    @Override
    public String V() {
        return llIIllIl[llIIllll[43]];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[44])) {
            bl = llIIllll[1];
            "".length();
            if (((0x27 ^ 0x45) & ~(0x4A ^ 0x28)) >= (0x83 ^ 0x87)) {
                return ((0 ^ 0x41) & ~(0xC6 ^ 0x87)) != 0;
            }
        } else {
            bl = llIIllll[0];
        }
        return bl;
    }

    private static void lIlIllIIIll() {
        llIIllll = new int[47];
        M.llIIllll[0] = (23 + 19 - -100 + 12 ^ 165 + 3 - 151 + 178) & (0x17 ^ 0x22 ^ (0x52 ^ 0x3E) ^ -" ".length());
        M.llIIllll[1] = " ".length();
        M.llIIllll[2] = 0xFFFFA7EF & 0x5BF3;
        M.llIIllll[3] = "  ".length();
        M.llIIllll[4] = "   ".length();
        M.llIIllll[5] = 0xFFFF9399 & 0x7FEE;
        M.llIIllll[6] = 0x8F ^ 0x8B;
        M.llIIllll[7] = 0xFFFFF7EF & 0xEFF;
        M.llIIllll[8] = -(0xFFFFF5EF & 0x4B17) & (0xFFFFFFFF & 0x47FF);
        M.llIIllll[9] = 0xF2 ^ 0x8F ^ (0x2F ^ 0x57);
        M.llIIllll[10] = 0x4A ^ 0x4C;
        M.llIIllll[11] = 0x6B ^ 0x6C;
        M.llIIllll[12] = 10 + 109 - 52 + 67 ^ 138 + 92 - 184 + 96;
        M.llIIllll[13] = -(0xFFFFD666 & 0x3DDF) & (0xFFFFFED5 & 0xF7FF);
        M.llIIllll[14] = 0x28 ^ 0x48 ^ (0xA9 ^ 0xC5);
        M.llIIllll[15] = 0x75 ^ 0x35 ^ (0x25 ^ 0x6C);
        M.llIIllll[16] = 113 + 126 - 218 + 123 ^ 98 + 70 - 141 + 150;
        M.llIIllll[17] = 0x2B ^ 0x21;
        M.llIIllll[18] = 0x12 ^ 0x18 ^ " ".length();
        M.llIIllll[19] = 0xB2 ^ 0x98;
        M.llIIllll[20] = 0xAE ^ 0xA3;
        M.llIIllll[21] = 9 ^ 0x27;
        M.llIIllll[22] = 0xA9 ^ 0xA7;
        M.llIIllll[23] = 0xB7 ^ 0xB8;
        M.llIIllll[24] = 0x58 ^ 0x69;
        M.llIIllll[25] = 0x54 ^ 0x44;
        M.llIIllll[26] = 48 + 23 - -40 + 72 ^ 108 + 89 - 134 + 103;
        M.llIIllll[27] = 0x43 ^ 0x14;
        M.llIIllll[28] = 0xC ^ 0x1E;
        M.llIIllll[29] = 0x6D ^ 0x37 ^ (0x89 ^ 0xC0);
        M.llIIllll[30] = 0x88 ^ 0x9C;
        M.llIIllll[31] = 0x10 ^ 0x72 ^ (0x10 ^ 0x67);
        M.llIIllll[32] = 0xA5 ^ 0xB8 ^ (2 ^ 9);
        M.llIIllll[33] = -(0xFFFFEC8F & 0x7BF1) & (0xFFFFEFBE & 0x7FFB);
        M.llIIllll[34] = 211 + 136 - 192 + 88 ^ 60 + 31 - -3 + 63;
        M.llIIllll[35] = 0x7A ^ 0x6D;
        M.llIIllll[36] = 0xFFFF9DEE & 0x77FB;
        M.llIIllll[37] = -(0xFFFF87BE & 0x7965) & (0xFFFFFFEF & 0x2FFF);
        M.llIIllll[38] = -(0x42 ^ 0x57) & (0xFFFFFDBD & 0x63FE);
        M.llIIllll[39] = -(0x71 ^ 0x40) & (0xFFFFFFFF & 0x1F77);
        M.llIIllll[40] = 0x57 ^ 0x36 ^ (0x14 ^ 0x5D);
        M.llIIllll[41] = 0xFFFFABF6 & 0x578D;
        M.llIIllll[42] = 0x3F ^ 0x5B;
        M.llIIllll[43] = 0xC1 ^ 0xBC ^ (0xA6 ^ 0xC3);
        M.llIIllll[44] = 6 + 208 - 24 + 51 ^ 7 + 57 - -56 + 26;
        M.llIIllll[45] = 0x35 ^ 0x2F ^ "   ".length();
        M.llIIllll[46] = 76 + 72 - 127 + 113 ^ 73 + 131 - 167 + 119;
    }

    public static void ag() {
        d lIlIlIIIlIlIIII;
        Object lIlIlIIIlIlIIIl;
        int[] nArray = new int[llIIllll[1]];
        nArray[M.llIIllll[0]] = llIIllll[7];
        if (M.lIlIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIIllIl[llIIllll[32]]);
            d d2 = new d(llIIllll[7], llIIllll[33], llIIllll[34]);
            bB.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIIllll[1]];
        nArray2[M.llIIllll[0]] = llIIllll[8];
        if (M.lIlIllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llIIllIl[llIIllll[35]]);
            lIlIlIIIlIlIIIl = new d(llIIllll[8], llIIllll[1], llIIllll[36]);
            bB.add((d)lIlIlIIIlIlIIIl);
            "".length();
        }
        if (M.lIlIllIIllI(Bank.contains(lIlIlIIIlIlIIIl = item -> item.getName().toLowerCase().contains(llIIllIl[llIIllll[45]])) ? 1 : 0)) {
            lIlIlIIIlIlIIII = new d(llIIllll[37], llIIllll[9], llIIllll[38]);
            bB.add(lIlIlIIIlIlIIII);
            "".length();
        }
        int[] nArray3 = new int[llIIllll[1]];
        nArray3[M.llIIllll[0]] = llIIllll[39];
        if (M.lIlIllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIlIIIlIlIIII = new d(llIIllll[39], llIIllll[40], llIIllll[41]);
            bB.add(lIlIlIIIlIlIIII);
            "".length();
        }
    }

    @Override
    public int U() {
        M.cK();
        return llIIllll[42];
    }

    private static String lIlIlIlIlIl(String lIlIlIIIIllIIII, String lIlIlIIIIlIllIl) {
        try {
            SecretKeySpec lIlIlIIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), llIIllll[12]), "DES");
            Cipher lIlIlIIIIllIIlI = Cipher.getInstance("DES");
            lIlIlIIIIllIIlI.init(llIIllll[3], lIlIlIIIIllIIll);
            return new String(lIlIlIIIIllIIlI.doFinal(Base64.getDecoder().decode(lIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIllIIIl) {
            lIlIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIlll(int n2) {
        return n2 > 0;
    }

    public static void cK() {
        block29: {
            BankLocation lIlIlIIIlIlIlIl;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (M.lIlIllIIlII(bz ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIIllIl[llIIllll[0]];
                                    b.a(bB);
                                    if (M.lIlIllIIlIl(bB.size(), llIIllll[1])) {
                                        System.out.println(llIIllIl[llIIllll[1]]);
                                        bz = llIIllll[0];
                                    }
                                }
                                if (!M.lIlIllIIllI(bz ? 1 : 0)) break block29;
                                if (!M.lIlIllIIlII(M.ac() ? 1 : 0)) break block30;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[2];
                                if (!M.lIlIllIIlll(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (M.lIlIllIlIII(lIlIlIIIlIlIlIl = BankLocation.getNearest()) && M.lIlIllIIllI(lIlIlIIIlIlIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIllIl[llIIllll[3]];
                                a.a(lIlIlIIIlIlIlIl);
                            }
                            if (!M.lIlIllIlIII(lIlIlIIIlIlIlIl) || !M.lIlIllIIlII(lIlIlIIIlIlIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (M.lIlIllIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIllIl[llIIllll[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllll[5]);
                                "".length();
                            }
                            if (!M.lIlIllIIlII(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderBarrows.c = llIIllIl[llIIllll[6]];
                            if (M.lIlIllIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIllll[4]);
                                "".length();
                            }
                            if (M.lIlIllIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIllll[3]);
                                "".length();
                            }
                            int[] nArray = new int[llIIllll[1]];
                            nArray[M.llIIllll[0]] = llIIllll[7];
                            if (!M.lIlIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[llIIllll[1]];
                            nArray2[M.llIIllll[0]] = llIIllll[7];
                            if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray2), llIIllll[1])) break block33;
                        }
                        int[] nArray = new int[llIIllll[1]];
                        nArray[M.llIIllll[0]] = llIIllll[8];
                        if (!M.lIlIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[llIIllll[1]];
                        nArray3[M.llIIllll[0]] = llIIllll[8];
                        if (!M.lIlIllIIlIl(Inventory.getCount((int[])nArray3), llIIllll[1])) break block34;
                    }
                    M.ag();
                    System.out.println(llIIllIl[llIIllll[9]]);
                    bz = llIIllll[1];
                    return;
                }
                int[] nArray = new int[llIIllll[1]];
                nArray[M.llIIllll[0]] = llIIllll[8];
                if (M.lIlIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIllll[1]];
                    nArray4[M.llIIllll[0]] = llIIllll[8];
                    if (M.lIlIllIIlIl(Inventory.getCount((int[])nArray4), llIIllll[1])) {
                        Bank.withdraw((int)llIIllll[8], (int)llIIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIllll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIllll[1]];
                            nArray[M.llIIllll[0]] = llIIllll[8];
                            if (M.lIlIllIIlll(Inventory.getCount((int[])nArray))) {
                                bl = llIIllll[1];
                                "".length();
                                if (-"  ".length() >= 0) {
                                    return ((0xD0 ^ 0xB5 ^ (0x1F ^ 0x36)) & (0x43 ^ 0x73 ^ (0x51 ^ 0x2D) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = llIIllll[0];
                            }
                            return bl;
                        }, (int)llIIllll[5]);
                        "".length();
                    }
                }
                int[] nArray5 = new int[llIIllll[1]];
                nArray5[M.llIIllll[0]] = llIIllll[7];
                if (M.lIlIllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIllll[1]];
                    nArray6[M.llIIllll[0]] = llIIllll[7];
                    if (M.lIlIllIIlIl(Inventory.getCount((int[])nArray6), llIIllll[1])) {
                        int[] nArray7 = new int[llIIllll[1]];
                        nArray7[M.llIIllll[0]] = llIIllll[8];
                        if (M.lIlIllIIlll(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)llIIllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (M.lIlIllIIlll(Inventory.getCount((int[])nArray))) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if ("   ".length() < "  ".length()) {
                                        return ("  ".length() & ~"  ".length()) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[5]);
                            "".length();
                        }
                    }
                }
            }
            if (M.lIlIllIIlII(M.ac() ? 1 : 0)) {
                if (M.lIlIllIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (M.lIlIllIIllI(Bank.isOpen() ? 1 : 0) && M.lIlIllIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllIl[llIIllll[10]];
                    if (M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (M.lIlIllIIllI(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)llIIllll[3]);
                        "".length();
                        int[] nArray = new int[llIIllll[1]];
                        nArray[M.llIIllll[0]] = llIIllll[8];
                        lIlIlIIIlIlIlIl = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llIIllll[1]];
                        nArray8[M.llIIllll[0]] = llIIllll[7];
                        Item lIlIlIIIlIlIlII = Inventory.getFirst((int[])nArray8);
                        if (M.lIlIllIlIII(lIlIlIIIlIlIlIl) && M.lIlIllIlIII(lIlIlIIIlIlIlII)) {
                            lIlIlIIIlIlIlIl.useOn(lIlIlIIIlIlIlII);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIIllll[5]);
                            "".length();
                        }
                    }
                    if (M.lIlIllIIlII(Production.isOpen() ? 1 : 0)) {
                        if (M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[6])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[11]];
                            Production.chooseOption((String)llIIllIl[llIIllll[12]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (((0xBD ^ 0xAB) & ~(0x88 ^ 0x9E)) == "  ".length()) {
                                        return ((0x17 ^ 0x2C) & ~(0x97 ^ 0xAC)) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[6]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[14])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[15]];
                            Production.chooseOption((int)llIIllll[3]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if ("  ".length() < 0) {
                                        return ((113 + 81 - 37 + 38 ^ 80 + 7 - 79 + 123) & (0x6C ^ 0x3D ^ (0x39 ^ 0x28) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[14]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[16])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[17]];
                            Production.chooseOption((String)llIIllIl[llIIllll[18]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (-" ".length() != -" ".length()) {
                                        return ((0x99 ^ 0xA0 ^ (0x52 ^ 0x5E)) & (0xFB ^ 0x9D ^ (0xD3 ^ 0x80) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[16]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[19])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[14]];
                            Production.chooseOption((String)llIIllIl[llIIllll[20]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (null != null) {
                                        return ((0xF0 ^ 0xC5) & ~(0xF ^ 0x3A)) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[19]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[21])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[22]];
                            Production.chooseOption((String)llIIllIl[llIIllll[23]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if ("   ".length() < -" ".length()) {
                                        return ((35 + 184 - 157 + 150 ^ 110 + 86 - 82 + 28) & (0x4E ^ 0x3D ^ (0x71 ^ 0x58) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[21]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[24])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[25]];
                            Production.chooseOption((String)llIIllIl[llIIllll[26]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (((127 + 25 - 34 + 32 ^ 179 + 67 - 115 + 49) & (0xAE ^ 0x87 ^ (0x2B ^ 0x20) ^ -" ".length())) >= " ".length()) {
                                        return ((7 ^ 0x7A ^ (0xA3 ^ 0x82)) & (0x5C ^ 0x43 ^ (0xC5 ^ 0x86) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[24]) && M.lIlIllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[27])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[28]];
                            Production.chooseOption((String)llIIllIl[llIIllll[29]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (null != null) {
                                        return ((0x66 ^ 0x26) & ~(0xFF ^ 0xBF)) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                        if (M.lIlIllIlIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIIllll[27])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[30]];
                            Production.chooseOption((String)llIIllIl[llIIllll[31]]);
                            Time.sleepTicks((int)llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIllll[1]];
                                nArray[M.llIIllll[0]] = llIIllll[7];
                                if (!M.lIlIllIlIIl(Inventory.getCount((int[])nArray), llIIllll[1]) || M.lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIllll[1];
                                    "".length();
                                    if (-"   ".length() >= 0) {
                                        return ((0x92 ^ 0x81 ^ (0xF ^ 5)) & (22 + 125 - 36 + 23 ^ 143 + 10 - 141 + 147 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllll[0];
                                }
                                return bl;
                            }, (int)llIIllll[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static String lIlIlIlIIll(String lIlIlIIIIlIIIIl, String lIlIlIIIIlIIIlI) {
        try {
            SecretKeySpec lIlIlIIIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIlIIlIl = Cipher.getInstance("Blowfish");
            lIlIlIIIIlIIlIl.init(llIIllll[3], lIlIlIIIIlIIllI);
            return new String(lIlIlIIIIlIIlIl.doFinal(Base64.getDecoder().decode(lIlIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIlIIlII) {
            lIlIlIIIIlIIlII.printStackTrace();
            return null;
        }
    }
}

