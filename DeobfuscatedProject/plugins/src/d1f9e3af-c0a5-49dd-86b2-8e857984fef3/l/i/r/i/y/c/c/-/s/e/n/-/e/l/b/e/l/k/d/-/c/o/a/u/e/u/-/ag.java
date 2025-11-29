/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
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
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import net.runelite.api.Skill;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

public class ag
implements W {
    private static /* synthetic */ int[] lIlllIIlI;
    private static /* synthetic */ String[] lIlllIIIl;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int lL;
    public static final /* synthetic */ WorldPoint lN;
    public static final /* synthetic */ WorldPoint lO;
    public static final /* synthetic */ int lK;
    public static final /* synthetic */ int lM;
    public static /* synthetic */ boolean bt;

    private static boolean lIIllIlIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIllIlIIllI(String llIIlIlIIlIlIl, String llIIlIlIIlIlII) {
        llIIlIlIIlIlIl = new String(Base64.getDecoder().decode(llIIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIlIIlIIll = new StringBuilder();
        char[] llIIlIlIIlIIlI = llIIlIlIIlIlII.toCharArray();
        int llIIlIlIIlIIIl = lIlllIIlI[0];
        char[] llIIlIlIIIlIll = llIIlIlIIlIlIl.toCharArray();
        int llIIlIlIIIlIlI = llIIlIlIIIlIll.length;
        int llIIlIlIIIlIIl = lIlllIIlI[0];
        while (ag.lIIllIlIllII(llIIlIlIIIlIIl, llIIlIlIIIlIlI)) {
            char llIIlIlIIlIllI = llIIlIlIIIlIll[llIIlIlIIIlIIl];
            llIIlIlIIlIIll.append((char)(llIIlIlIIlIllI ^ llIIlIlIIlIIlI[llIIlIlIIlIIIl % llIIlIlIIlIIlI.length]));
            "".length();
            ++llIIlIlIIlIIIl;
            ++llIIlIlIIIlIIl;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llIIlIlIIlIIll);
    }

    private static void lIIllIlIlIlI() {
        lIlllIIlI = new int[42];
        ag.lIlllIIlI[0] = (0x87 ^ 0x88) & ~(0x60 ^ 0x6F);
        ag.lIlllIIlI[1] = " ".length();
        ag.lIlllIIlI[2] = "  ".length();
        ag.lIlllIIlI[3] = "   ".length();
        ag.lIlllIIlI[4] = 0xFFFFF7E8 & 0x1B9F;
        ag.lIlllIIlI[5] = 0x21 ^ 0x34 ^ (0x71 ^ 0x6B);
        ag.lIlllIIlI[6] = 0xFFFF977F & 0x69BD;
        ag.lIlllIIlI[7] = 0x1F ^ 0x1B;
        ag.lIlllIIlI[8] = 0xA2 ^ 0xBC;
        ag.lIlllIIlI[9] = 0xFFFFBFCF & 0x417F;
        ag.lIlllIIlI[10] = 8 ^ 0x1D ^ (0x3A ^ 0x2A);
        ag.lIlllIIlI[11] = 0xFFFF9B7F & 0x65E7;
        ag.lIlllIIlI[12] = 102 + 108 - 91 + 12 ^ 61 + 95 - 95 + 72;
        ag.lIlllIIlI[13] = -(0xFFFFF3C7 & 0x7E3B) & (0xFFFFFBFE & 0x7FFB);
        ag.lIlllIIlI[14] = 0x72 ^ 0x32 ^ (0x62 ^ 0x3B);
        ag.lIlllIIlI[15] = 0x31 ^ 0x27 ^ (0xC ^ 0x1D);
        ag.lIlllIIlI[16] = 95 + 54 - 9 + 29 ^ 26 + 118 - 135 + 152;
        ag.lIlllIIlI[17] = 0xAC ^ 0xA5;
        ag.lIlllIIlI[18] = 0x30 ^ 0x3A;
        ag.lIlllIIlI[19] = 0x5F ^ 0x5B ^ (0x3D ^ 0x32);
        ag.lIlllIIlI[20] = 0x5A ^ 4 ^ (0x21 ^ 0x73);
        ag.lIlllIIlI[21] = -(0xFFFFA39E & 0x5E75) & (0xFFFFFFFF & 0xFFFB);
        ag.lIlllIIlI[22] = 8 + 24 - -45 + 173;
        ag.lIlllIIlI[23] = -(0xFFFFE99F & 0x5E71) & (0xFFFFFF7F & 0x49BC);
        ag.lIlllIIlI[24] = 0xFFFFDBF7 & 0x25FC;
        ag.lIlllIIlI[25] = (0x22 ^ 0x16) + (117 + 123 - 103 + 40) - (48 + 69 - 41 + 131) + (36 + 101 - 67 + 108);
        ag.lIlllIIlI[26] = 0x7D ^ 0x69;
        ag.lIlllIIlI[27] = 0xFFFFB7D3 & 0x4FFC;
        ag.lIlllIIlI[28] = 0xFFFFBFFF & 0x6ECC;
        ag.lIlllIIlI[29] = 0xFFFFFFE9 & 0x61BE;
        ag.lIlllIIlI[30] = 0xFFFFFF77 & 0x1FCF;
        ag.lIlllIIlI[31] = (0x4D ^ 0x1B) & ~(0x3D ^ 0x6B) ^ (0x7E ^ 0x56);
        ag.lIlllIIlI[32] = -(0xFFFFEE7A & 0x7DFF) & (0xFFFFFFFF & 0x6FFD);
        ag.lIlllIIlI[33] = 0xFE ^ 0x9A;
        ag.lIlllIIlI[34] = 0xF7 ^ 0xB9 ^ (0x5B ^ 0x18);
        ag.lIlllIIlI[35] = 109 + 131 - 191 + 176 ^ 92 + 34 - 4 + 8;
        ag.lIlllIIlI[36] = 15 + 85 - 31 + 67 ^ 117 + 73 - 169 + 113;
        ag.lIlllIIlI[37] = -(0xFFFFFA09 & 0x55FF) & (0xFFFFFDCF & 0x5EFD);
        ag.lIlllIIlI[38] = -(0xFFFFF7BF & 0x48D2) & (0xFFFFFDFD & 0x4EF3);
        ag.lIlllIIlI[39] = -(0xFFFFFE7F & 0x5395) & (0xFFFFFEDC & 0x5FFF);
        ag.lIlllIIlI[40] = -(0xFFFFFDD3 & 0x32BF) & (0xFFFFBEFF & 0x7DFE);
        ag.lIlllIIlI[41] = 0x56 ^ 0x46;
    }

    private static boolean ab() {
        boolean bl;
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            boolean bl2;
            int[] nArray = new int[lIlllIIlI[1]];
            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                bl2 = lIlllIIlI[1];
                "".length();
                if (-(0x6C ^ 0x68) >= 0) {
                    return ((0xBF ^ 0x80) & ~(0x7A ^ 0x45)) != 0;
                }
            } else {
                bl2 = lIlllIIlI[0];
            }
            return bl2;
        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            boolean bl3;
            int[] nArray = new int[lIlllIIlI[1]];
            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                bl3 = lIlllIIlI[1];
                "".length();
                if (null != null) {
                    return ((0xAE ^ 0x9E ^ (0xB2 ^ 0x99)) & (0x43 ^ 0x69 ^ (0x19 ^ 0x28) ^ -" ".length())) != 0;
                }
            } else {
                bl3 = lIlllIIlI[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIlllIIlI[1]];
        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
        if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
            bl = lIlllIIlI[1];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x72 ^ 0x4B ^ (0x19 ^ 0x12)) & (67 + 30 - 75 + 134 ^ 112 + 131 - 185 + 116 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlllIIlI[0];
        }
        return bl;
    }

    @Override
    public String U() {
        return lIlllIIIl[lIlllIIlI[34]];
    }

    private static boolean lIIllIlIlllI(Object object) {
        return object != null;
    }

    private static String lIIllIlIIlll(String llIIlIIlllIIIl, String llIIlIIlllIIII) {
        try {
            SecretKeySpec llIIlIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIlllIlIl = Cipher.getInstance("Blowfish");
            llIIlIIlllIlIl.init(lIlllIIlI[2], llIIlIIlllIllI);
            return new String(llIIlIIlllIlIl.doFinal(Base64.getDecoder().decode(llIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlllIlII) {
            llIIlIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIllIlIlIIl() {
        lIlllIIIl = new String[lIlllIIlI[41]];
        ag.lIlllIIIl[ag.lIlllIIlI[0]] = ag.lIIllIlIIllI("Ew0rPRQ2WDsgHzwL", "QxRTz");
        ag.lIlllIIIl[ag.lIlllIIlI[1]] = ag.lIIllIlIIlll("mYkPtHsIKae6OFI+M1O8KSny3Roaur17U0A36hIyy3Kxy917QQVggco5xbJ+UpHeaUtFDHU4oWA=", "acmwt");
        ag.lIlllIIIl[ag.lIlllIIlI[2]] = ag.lIIllIlIlIII("q2YERfCvqIm6rY3BYelNSlV99qTsdzjK", "GjdWj");
        ag.lIlllIIIl[ag.lIlllIIlI[3]] = ag.lIIllIlIIllI("MiYWIh8TKR9mERspEy8dHQ==", "zGxFs");
        ag.lIlllIIIl[ag.lIlllIIlI[7]] = ag.lIIllIlIIllI("ADZyCRQycz8BFSQ6PA9GJCYiGAo+NiFERiQkOxwFPzo8D0YjPHIqMw4aHC8=", "WSRhf");
        ag.lIlllIIIl[ag.lIlllIIlI[10]] = ag.lIIllIlIIlll("Axa7Ala4RqskKFFJ0JzIuVRbCvwRNBMt/4a7HXfYeSRewWwu8l4AYIt/VH0+CzJn", "LkQGm");
        ag.lIlllIIIl[ag.lIlllIIlI[12]] = ag.lIIllIlIlIII("LEp4H3LhKlhg4ehKxyg7+z4BXheFh1Z/jjiMYxZWlnXCOJkkWhTcBCmLnPS7cLFK", "Znhcg");
        ag.lIlllIIIl[ag.lIlllIIlI[15]] = ag.lIIllIlIlIII("9Yb9RnE0v/McFVgm8IwAww==", "deblG");
        ag.lIlllIIIl[ag.lIlllIIlI[16]] = ag.lIIllIlIIllI("NBwCPQ==", "cycOx");
        ag.lIlllIIIl[ag.lIlllIIlI[17]] = ag.lIIllIlIIlll("+AInVdcUpXB0fpuoyRUPxSZ/pcg/3RUu", "ZAbVh");
        ag.lIlllIIIl[ag.lIlllIIlI[18]] = ag.lIIllIlIlIII("AVan4kHWpO4=", "GeiRd");
        ag.lIlllIIIl[ag.lIlllIIlI[19]] = ag.lIIllIlIlIII("c0uLJCJW92A=", "PNQIh");
        ag.lIlllIIIl[ag.lIlllIIlI[20]] = ag.lIIllIlIlIII("bX2BMJ3BfN8=", "BfVDf");
        ag.lIlllIIIl[ag.lIlllIIlI[34]] = ag.lIIllIlIIllI("MCUKHhodLQ==", "sJeus");
        ag.lIlllIIIl[ag.lIlllIIlI[36]] = ag.lIIllIlIIlll("bJmApkCMdj0sNsltYyNrO4SXIKQTWrKJ", "tdpeo");
        ag.lIlllIIIl[ag.lIlllIIlI[5]] = ag.lIIllIlIlIII("9uuJ8xSQ5DWT3C/kVjtvuYl+ZftJRxbw", "yPtvs");
    }

    private static boolean lIIllIllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void af() {
        d llIIlIlIlIIIII;
        Object llIIlIlIlIIIIl;
        Object llIIlIlIlIIIlI;
        if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
            d d2 = new d(lIlllIIlI[6], lIlllIIlI[22], lIlllIIlI[23]);
            bv.add(d2);
            "".length();
        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            llIIlIlIlIIIlI = new d(lIlllIIlI[9], lIlllIIlI[24], lIlllIIlI[25]);
            bv.add((d)llIIlIlIlIIIlI);
            "".length();
        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            llIIlIlIlIIIlI = new d(lIlllIIlI[11], lIlllIIlI[24], lIlllIIlI[25]);
            bv.add((d)llIIlIlIlIIIlI);
            "".length();
        }
        if (ag.lIIllIlIllIl(Bank.contains(llIIlIlIlIIIlI = item -> item.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[5]])) ? 1 : 0)) {
            llIIlIlIlIIIIl = new d(lIlllIIlI[13], lIlllIIlI[26], lIlllIIlI[27]);
            bv.add((d)llIIlIlIlIIIIl);
            "".length();
        }
        if (ag.lIIllIlIllIl(Bank.contains(llIIlIlIlIIIIl = item -> item.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[36]])) ? 1 : 0)) {
            llIIlIlIlIIIII = new d(lIlllIIlI[28], lIlllIIlI[10], lIlllIIlI[29]);
            bv.add(llIIlIlIlIIIII);
            "".length();
        }
        int[] nArray = new int[lIlllIIlI[1]];
        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[30];
        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIIlIlIlIIIII = new d(lIlllIIlI[30], lIlllIIlI[31], lIlllIIlI[32]);
            bv.add(llIIlIlIlIIIII);
            "".length();
        }
    }

    private static String lIIllIlIlIII(String llIIlIIllllllI, String llIIlIIlllllIl) {
        try {
            SecretKeySpec llIIlIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllllIl.getBytes(StandardCharsets.UTF_8)), lIlllIIlI[16]), "DES");
            Cipher llIIlIlIIIIIlI = Cipher.getInstance("DES");
            llIIlIlIIIIIlI.init(lIlllIIlI[2], llIIlIlIIIIIll);
            return new String(llIIlIlIIIIIlI.doFinal(Base64.getDecoder().decode(llIIlIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIIIIIIl) {
            llIIlIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        ag.dG();
        return lIlllIIlI[33];
    }

    @Override
    public boolean S() {
        return lIlllIIlI[0];
    }

    static {
        ag.lIIllIlIlIlI();
        ag.lIIllIlIlIIl();
        lK = lIlllIIlI[6];
        lM = lIlllIIlI[11];
        lL = lIlllIIlI[9];
        lN = new WorldPoint(lIlllIIlI[37], lIlllIIlI[38], lIlllIIlI[0]);
        lO = new WorldPoint(lIlllIIlI[39], lIlllIIlI[40], lIlllIIlI[0]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIllIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static void dG() {
        if (ag.lIIllIlIlIll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[0]];
            b.a(bv);
            if (ag.lIIllIlIllII(bv.size(), lIlllIIlI[1])) {
                System.out.println(lIlllIIIl[lIlllIIlI[1]]);
                bt = lIlllIIlI[0];
            }
        }
        if (ag.lIIllIlIllIl(bt ? 1 : 0)) {
            BankLocation llIIlIlIlIIllI;
            if (ag.lIIllIlIllIl(ag.ab() ? 1 : 0)) {
                llIIlIlIlIIllI = BankLocation.getNearest();
                if (ag.lIIllIlIlllI(llIIlIlIlIIllI) && ag.lIIllIlIllIl(llIIlIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[2]];
                    a.a(llIIlIlIlIIllI);
                }
                if (ag.lIIllIlIlllI(llIIlIlIlIIllI) && ag.lIIllIlIlIll(llIIlIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[3]];
                    if (ag.lIIllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlI[4]);
                        "".length();
                    }
                    if (ag.lIIllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (ag.lIIllIlIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIIlI[1]);
                            "".length();
                        }
                        if (ag.lIIllIlIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIIlI[2]);
                            "".length();
                        }
                    }
                    if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[7]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[10]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[12]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIlllIIlI[1]];
                    nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                    if (ag.lIIllIlIllIl(Equipment.contains((int[])nArray) ? 1 : 0) && ag.lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[14])) {
                        a.b(f.aN, lIlllIIlI[1]);
                        Time.sleepTicks((int)lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];
                                "".length();
                                if (((0x1F ^ 0x24) & ~(0x26 ^ 0x1D)) != 0) {
                                    return ((0x10 ^ 0x3C) & ~(0x1C ^ 0x30)) != 0;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);
                        "".length();
                    }
                    if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
                        Bank.withdrawAll((int)lIlllIIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];
                                "".length();
                                if (-(0x7D ^ 0 ^ (0x6E ^ 0x16)) >= 0) {
                                    return ((0x69 ^ 0x11 ^ (0xFA ^ 0xB0)) & (0x47 ^ 1 ^ (4 ^ 0x70) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);
                        "".length();
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll((int)lIlllIIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];
                                "".length();
                                if (" ".length() <= 0) {
                                    return ((0xE ^ 0x37) & ~(0x74 ^ 0x4D)) != 0;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);
                        "".length();
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll((int)lIlllIIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];
                                "".length();
                                if (null != null) {
                                    return ((0xDA ^ 0x8A) & ~(0xFB ^ 0xAB)) != 0;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);
                        "".length();
                    }
                }
            }
            if (ag.lIIllIlIlIll(ag.ab() ? 1 : 0)) {
                int[] nArray = new int[lIlllIIlI[1]];
                nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                if (ag.lIIllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlllIIlI[1]];
                    nArray2[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                    if (ag.lIIllIlIllIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[15]];
                        int[] nArray3 = new int[lIlllIIlI[1]];
                        nArray3[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                        llIIlIlIlIIllI = Inventory.getFirst((int[])nArray3);
                        if (ag.lIIllIlIlllI(llIIlIlIlIIllI)) {
                            llIIlIlIlIIllI.interact(lIlllIIIl[lIlllIIlI[16]]);
                            Time.sleepTicks((int)lIlllIIlI[3]);
                            "".length();
                        }
                    }
                }
                if (ag.lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[17]];
                    Movement.walkTo((WorldPoint)lO);
                    "".length();
                    Time.sleepTicks((int)lIlllIIlI[7]);
                    "".length();
                }
                if (ag.lIIllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[18]];
                    String[] stringArray = new String[lIlllIIlI[1]];
                    stringArray[ag.lIlllIIlI[0]] = lIlllIIIl[lIlllIIlI[19]];
                    llIIlIlIlIIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (ag.lIIllIlIlllI(llIIlIlIlIIllI)) {
                        if (ag.lIIllIlIllIl(Production.isOpen() ? 1 : 0)) {
                            llIIlIlIlIIllI.interact(lIlllIIIl[lIlllIIlI[20]]);
                            Time.sleepTicks((int)lIlllIIlI[2]);
                            "".length();
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlllIIlI[4]);
                            "".length();
                        }
                        if (ag.lIIllIlIlIll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIlllIIlI[1]);
                            Time.sleepTicks((int)lIlllIIlI[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!ag.lIIllIlIlIll(ag.ab() ? 1 : 0) || ag.lIIllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlllIIlI[1];
                                    "".length();
                                    if ((1 ^ 0x30 ^ (0x52 ^ 0x67)) < "  ".length()) {
                                        return ((0x94 ^ 0x9D ^ (0x8E ^ 0x90)) & (0xFF ^ 0xB5 ^ (0x23 ^ 0x7E) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = lIlllIIlI[0];
                                }
                                return bl;
                            }, (int)lIlllIIlI[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIlIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[35])) {
            bl = lIlllIIlI[1];
            "".length();
            if (((0x84 ^ 0xB1) & ~(0x65 ^ 0x50)) != 0) {
                return ((0x7D ^ 0x65) & ~(0xD9 ^ 0xC1)) != 0;
            }
        } else {
            bl = lIlllIIlI[0];
        }
        return bl;
    }
}

