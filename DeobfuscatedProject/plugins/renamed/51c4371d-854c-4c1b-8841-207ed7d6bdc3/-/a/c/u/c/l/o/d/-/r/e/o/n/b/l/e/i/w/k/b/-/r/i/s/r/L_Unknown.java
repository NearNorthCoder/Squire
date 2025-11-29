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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f_Unknown;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class L_Unknown
implements F {
    public static final /* synthetic */ int iR;
    public static final /* synthetic */ WorldPoint iS;
    public static final /* synthetic */ int iP;
    public static final /* synthetic */ int iQ;
    private static /* synthetic */ int[] lIllllIl;
    private static /* synthetic */ String[] lIllllII;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ WorldPoint iT;

    private static boolean lIIllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int U() {
        L.cC();
        return lIllllIl[33];
    }

    private static void ag() {
        d lIlIlllIIIllIll;
        Object lIlIlllIIIlllII;
        Object lIlIlllIIIlllIl;
        if (L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5])) {
            d d2 = new d(lIllllIl[6], lIllllIl[22], lIllllIl[23]);
            bB.add(d2);
            0;
        }
        if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5]) && L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
            lIlIlllIIIlllIl = new d(lIllllIl[9], lIllllIl[24], lIllllIl[25]);
            bB.add((d)lIlIlllIIIlllIl);
            0;
        }
        if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
            lIlIlllIIIlllIl = new d(lIllllIl[11], lIllllIl[24], lIllllIl[25]);
            bB.add((d)lIlIlllIIIlllIl);
            0;
        }
        if (L.lIIlllllIlI(Bank.contains(lIlIlllIIIlllIl = item -> item.getName().toLowerCase().contains(lIllllII[lIllllIl[5]])) ? 1 : 0)) {
            lIlIlllIIIlllII = new d(lIllllIl[13], lIllllIl[26], lIllllIl[27]);
            bB.add((d)lIlIlllIIIlllII);
            0;
        }
        if (L.lIIlllllIlI(Bank.contains(lIlIlllIIIlllII = item -> item.getName().toLowerCase().contains(lIllllII[lIllllIl[36]])) ? 1 : 0)) {
            lIlIlllIIIllIll = new d(lIllllIl[28], lIllllIl[10], lIllllIl[29]);
            bB.add(lIlIlllIIIllIll);
            0;
        }
        int[] nArray = new int[lIllllIl[1]];
        nArray[L.lIllllIl[0]] = lIllllIl[30];
        if (L.lIIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlllIIIllIll = new d(lIllllIl[30], lIllllIl[31], lIllllIl[32]);
            bB.add(lIlIlllIIIllIll);
            0;
        }
    }

    public static void cC() {
        if (L.lIIlllllIII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllllII[lIllllIl[0]];
            b.a(bB);
            if (L.lIIlllllIIl(bB.size(), lIllllIl[1])) {
                System.out.println(lIllllII[lIllllIl[1]]);
                bz = lIllllIl[0];
            }
        }
        if (L.lIIlllllIlI(bz ? 1 : 0)) {
            BankLocation lIlIlllIIlIIIIl;
            if (L.lIIlllllIlI(L.ac() ? 1 : 0)) {
                lIlIlllIIlIIIIl = BankLocation.getNearest();
                if (L.lIIlllllIll(lIlIlllIIlIIIIl) && L.lIIlllllIlI(lIlIlllIIlIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[2]];
                    a.a(lIlIlllIIlIIIIl);
                }
                if (L.lIIlllllIll(lIlIlllIIlIIIIl) && L.lIIlllllIII(lIlIlllIIlIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[3]];
                    if (L.lIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIl[4]);
                        0;
                    }
                    if (L.lIIlllllIII(Bank.isOpen() ? 1 : 0)) {
                        if (L.lIIllllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllIl[1]);
                            0;
                        }
                        if (L.lIIllllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllllIl[2]);
                            0;
                        }
                    }
                    if (L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5])) {
                        int[] nArray = new int[lIllllIl[1]];
                        nArray[L.lIllllIl[0]] = lIllllIl[6];
                        if (L.lIIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            L.ag();
                            System.out.println(lIllllII[lIllllIl[7]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5]) && L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
                        int[] nArray = new int[lIllllIl[1]];
                        nArray[L.lIllllIl[0]] = lIllllIl[9];
                        if (L.lIIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            L.ag();
                            System.out.println(lIllllII[lIllllIl[10]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
                        int[] nArray = new int[lIllllIl[1]];
                        nArray[L.lIllllIl[0]] = lIllllIl[11];
                        if (L.lIIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            L.ag();
                            System.out.println(lIllllII[lIllllIl[12]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIllllIl[1]];
                    nArray[L.lIllllIl[0]] = lIllllIl[13];
                    if (L.lIIlllllIlI(Equipment.contains((int[])nArray) ? 1 : 0) && L.lIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[14])) {
                        a.b(f.aT, lIllllIl[1]);
                        Time.sleepTicks((int)lIllllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllllIl[1]];
                            nArray[L.lIllllIl[0]] = lIllllIl[13];
                            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                                bl = lIllllIl[1];
                                0;
                                if (-3 >= 0) {
                                    return ((9 + 77 - -97 + 8 ^ 164 + 117 - 242 + 134) & (0x7D ^ 0x24 ^ (0xF ^ 0x44) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllllIl[0];
                            }
                            return bl;
                        }, (int)lIllllIl[4]);
                        0;
                    }
                    if (L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5])) {
                        Bank.withdrawAll((int)lIllllIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllllIl[1]];
                            nArray[L.lIllllIl[0]] = lIllllIl[6];
                            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                                bl = lIllllIl[1];
                                0;
                                if ((0x91 ^ 0xBD ^ (0x52 ^ 0x7B)) == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIllllIl[0];
                            }
                            return bl;
                        }, (int)lIllllIl[4]);
                        0;
                    }
                    if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5]) && L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
                        Bank.withdrawAll((int)lIllllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllllIl[1]];
                            nArray[L.lIllllIl[0]] = lIllllIl[9];
                            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                                bl = lIllllIl[1];
                                0;
                                if (3 <= 0) {
                                    return ((216 + 194 - 350 + 164 ^ 56 + 119 - 69 + 23) & (0x23 ^ 0x1D ^ (0xC ^ 0x53) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllllIl[0];
                            }
                            return bl;
                        }, (int)lIllllIl[4]);
                        0;
                    }
                    if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
                        Bank.withdrawAll((int)lIllllIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllllIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllllIl[1]];
                            nArray[L.lIllllIl[0]] = lIllllIl[11];
                            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                                bl = lIllllIl[1];
                                0;
                                if (-3 >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIllllIl[0];
                            }
                            return bl;
                        }, (int)lIllllIl[4]);
                        0;
                    }
                }
            }
            if (L.lIIlllllIII(L.ac() ? 1 : 0)) {
                int[] nArray = new int[lIllllIl[1]];
                nArray[L.lIllllIl[0]] = lIllllIl[13];
                if (L.lIIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllllIl[1]];
                    nArray2[L.lIllllIl[0]] = lIllllIl[13];
                    if (L.lIIlllllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllllII[lIllllIl[15]];
                        int[] nArray3 = new int[lIllllIl[1]];
                        nArray3[L.lIllllIl[0]] = lIllllIl[13];
                        lIlIlllIIlIIIIl = Inventory.getFirst((int[])nArray3);
                        if (L.lIIlllllIll(lIlIlllIIlIIIIl)) {
                            lIlIlllIIlIIIIl.interact(lIllllII[lIllllIl[16]]);
                            Time.sleepTicks((int)lIllllIl[3]);
                            0;
                        }
                    }
                }
                if (L.lIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[10])) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[17]];
                    Movement.walkTo((WorldPoint)iT);
                    0;
                    Time.sleepTicks((int)lIllllIl[7]);
                    0;
                }
                if (L.lIIllllllll(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[10])) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[18]];
                    String[] stringArray = new String[lIllllIl[1]];
                    stringArray[L.lIllllIl[0]] = lIllllII[lIllllIl[19]];
                    lIlIlllIIlIIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (L.lIIlllllIll(lIlIlllIIlIIIIl)) {
                        if (L.lIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                            lIlIlllIIlIIIIl.interact(lIllllII[lIllllIl[20]]);
                            Time.sleepTicks((int)lIllllIl[2]);
                            0;
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIllllIl[4]);
                            0;
                        }
                        if (L.lIIlllllIII(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIllllIl[1]);
                            Time.sleepTicks((int)lIllllIl[7]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!L.lIIlllllIII(L.ac() ? 1 : 0) || L.lIIlllllIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIllllIl[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIllllIl[0];
                                }
                                return bl;
                            }, (int)lIllllIl[21]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlllllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return lIllllIl[0];
    }

    private static boolean lIIlllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllllIlll() {
        lIllllIl = new int[42];
        L.lIllllIl[0] = (0xDE ^ 0xBF) & ~(0xA2 ^ 0xC3);
        L.lIllllIl[1] = 1;
        L.lIllllIl[2] = 2;
        L.lIllllIl[3] = 3;
        L.lIllllIl[4] = 0xFFFF9BCC & 0x77BB;
        L.lIllllIl[5] = 0xBC ^ 0xB0 ^ 3;
        L.lIllllIl[6] = -(22 + 30 - -121 + 22) & (0xFFFFF7FF & 0x9FF);
        L.lIllllIl[7] = 0xC2 ^ 0xB2 ^ (0x69 ^ 0x1D);
        L.lIllllIl[8] = 0x89 ^ 0x97;
        L.lIllllIl[9] = -(0xFFFFEA9D & 0x3F73) & (0xFFFFEFDF & 0x3B7F);
        L.lIllllIl[10] = 0x78 ^ 0x7D;
        L.lIllllIl[11] = -(0xFFFFBF9B & 0x68F5) & (0xFFFFEDFF & 0x3BF7);
        L.lIllllIl[12] = 0x5E ^ 0x22 ^ (0xFA ^ 0x80);
        L.lIllllIl[13] = -(0xFFFFAFF4 & 0x560F) & (0xFFFFEFFB & 0x1FFF);
        L.lIllllIl[14] = 0x9A ^ 0x83;
        L.lIllllIl[15] = 170 + 15 - 180 + 173 ^ 150 + 60 - 96 + 67;
        L.lIllllIl[16] = 0x23 ^ 0x2B;
        L.lIllllIl[17] = 0x40 ^ 0x49;
        L.lIllllIl[18] = 0x97 ^ 0x9D;
        L.lIllllIl[19] = 0x82 ^ 0x89;
        L.lIllllIl[20] = 152 + 111 - 142 + 56 ^ 136 + 154 - 109 + 8;
        L.lIllllIl[21] = -(0xFFFFBF17 & 0x42FA) & (0xFFFFFFFF & 0xFFF9);
        L.lIllllIl[22] = 175 + 59 - 164 + 180;
        L.lIllllIl[23] = 0xFFFFB33E & 0x4DED;
        L.lIllllIl[24] = -(0xFFFFEE83 & 0x5D7D) & (0xFFFFEFFE & 0x5DF5);
        L.lIllllIl[25] = 106 + 70 - 114 + 100 + (38 + 125 - 106 + 112) - (136 + 27 - -14 + 25) + (0x2D ^ 0x6A);
        L.lIllllIl[26] = 0x34 ^ 0x20;
        L.lIllllIl[27] = -(0x60 ^ 0x69) & (0xFFFFE7FF & 0x1FD8);
        L.lIllllIl[28] = -(0xFFFFF93E & 0x46F5) & (0xFFFFFEFF & 0x6FFF);
        L.lIllllIl[29] = 0xFFFFE5BB & 0x7BEC;
        L.lIllllIl[30] = 0xFFFFDFEF & 0x3F57;
        L.lIllllIl[31] = 0x24 ^ 0x14 ^ (0xA5 ^ 0xBD);
        L.lIllllIl[32] = -(0xFFFFF5FF & 0x5A7B) & (0xFFFFDBFF & 0x77FE);
        L.lIllllIl[33] = 0x14 ^ 0x31 ^ (0x51 ^ 0x10);
        L.lIllllIl[34] = 89 + 76 - 80 + 55 ^ 56 + 58 - 89 + 104;
        L.lIllllIl[35] = 0x2F ^ 0x4C;
        L.lIllllIl[36] = 11 + 24 - -61 + 65 ^ 32 + 120 - 103 + 126;
        L.lIllllIl[37] = -(0xFFFFBAFB & 0x773F) & (0xFFFFBFFF & 0x7EFF);
        L.lIllllIl[38] = 0xFFFFFE7B & 0xDE4;
        L.lIllllIl[39] = -(0xFFFFEEFD & 0x7317) & (0xFFFFEEFF & 0x7FDC);
        L.lIllllIl[40] = -(0xFFFFC3AF & 0x7FD4) & (0xFFFFDFEF & 0x6FFF);
        L.lIllllIl[41] = 0x23 ^ 0x33;
    }

    private static String lIIllllIlIl(String lIlIllIlllIlllI, String lIlIllIlllIlIll) {
        try {
            SecretKeySpec lIlIllIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIllllIl[16]), "DES");
            Cipher lIlIllIllllIIII = Cipher.getInstance("DES");
            lIlIllIllllIIII.init(lIllllIl[2], lIlIllIllllIIIl);
            return new String(lIlIllIllllIIII.doFinal(Base64.getDecoder().decode(lIlIllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlllIllll) {
            lIlIllIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIllllIlII(String lIlIllIlllllIIl, String lIlIllIlllllIlI) {
        try {
            SecretKeySpec lIlIllIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIllllllIl = Cipher.getInstance("Blowfish");
            lIlIllIllllllIl.init(lIllllIl[2], lIlIllIlllllllI);
            return new String(lIlIllIllllllIl.doFinal(Base64.getDecoder().decode(lIlIllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIllllllII) {
            lIlIllIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIll(Object object) {
        return object != null;
    }

    private static String lIIllllIIll(String lIlIlllIIIIlIll, String lIlIlllIIIIllll) {
        lIlIlllIIIIlIll = new String(Base64.getDecoder().decode(lIlIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlllIIIIlllI = new StringBuilder();
        char[] lIlIlllIIIIllIl = lIlIlllIIIIllll.toCharArray();
        int lIlIlllIIIIllII = lIllllIl[0];
        char[] lIlIlllIIIIIllI = lIlIlllIIIIlIll.toCharArray();
        int lIlIlllIIIIIlIl = lIlIlllIIIIIllI.length;
        int lIlIlllIIIIIlII = lIllllIl[0];
        while (L.lIIlllllIIl(lIlIlllIIIIIlII, lIlIlllIIIIIlIl)) {
            char lIlIlllIIIlIIIl = lIlIlllIIIIIllI[lIlIlllIIIIIlII];
            lIlIlllIIIIlllI.append((char)(lIlIlllIIIlIIIl ^ lIlIlllIIIIllIl[lIlIlllIIIIllII % lIlIlllIIIIllIl.length]));
            0;
            ++lIlIlllIIIIllII;
            ++lIlIlllIIIIIlII;
            0;
            if (((0x9B ^ 0xC4) & ~(5 ^ 0x5A)) <= 3) continue;
            return null;
        }
        return String.valueOf(lIlIlllIIIIlllI);
    }

    @Override
    public String V() {
        return lIllllII[lIllllIl[34]];
    }

    private static void lIIllllIllI() {
        lIllllII = new String[lIllllIl[41]];
        L.lIllllII[L.lIllllIl[0]] = L."Buying items";
        L.lIllllII[L.lIllllIl[1]] = L."Finished buying items, switching back to cooking";
        L.lIllllII[L.lIllllIl[2]] = L."Navigating to bank";
        L.lIllllII[L.lIllllIl[3]] = L."Handling banking";
        L.lIllllII[L.lIllllIl[7]] = L."We are missing supplies, switching to BUYING";
        L.lIllllII[L.lIllllIl[10]] = L."We are missing supplies, switching to BUYING";
        L.lIllllII[L.lIllllIl[12]] = L."We are missing supplies, switching to BUYING";
        L.lIllllII[L.lIllllIl[15]] = L."Equiping duel";
        L.lIllllII[L.lIllllIl[16]] = L."Wear";
        L.lIllllII[L.lIllllIl[17]] = L."Navigate to range";
        L.lIllllII[L.lIllllIl[18]] = L."Cooking";
        L.lIllllII[L.lIllllIl[19]] = L."Range";
        L.lIllllII[L.lIllllIl[20]] = L."Cook";
        L.lIllllII[L.lIllllIl[34]] = L."Cooking";
        L.lIllllII[L.lIllllIl[36]] = L."ring of wealth (";
        L.lIllllII[L.lIllllIl[5]] = L."ring of dueling(";
    }

    private static boolean lIIllllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllllII(int n2) {
        return n2 > 0;
    }

    private static boolean ac() {
        boolean bl;
        if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
            boolean bl2;
            int[] nArray = new int[lIllllIl[1]];
            nArray[L.lIllllIl[0]] = lIllllIl[11];
            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                bl2 = lIllllIl[1];
                0;
                if (((0xC0 ^ 0x82) & ~(0x7E ^ 0x3C)) != 0) {
                    return false;
                }
            } else {
                bl2 = lIllllIl[0];
            }
            return bl2;
        }
        if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[5]) && L.lIIlllllIIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[8])) {
            boolean bl3;
            int[] nArray = new int[lIllllIl[1]];
            nArray[L.lIllllIl[0]] = lIllllIl[9];
            if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
                bl3 = lIllllIl[1];
                0;
                if (-(0x6A ^ 0x6F) >= 0) {
                    return false;
                }
            } else {
                bl3 = lIllllIl[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIllllIl[1]];
        nArray[L.lIllllIl[0]] = lIllllIl[6];
        if (L.lIIllllllII(Inventory.getCount((int[])nArray))) {
            bl = lIllllIl[1];
            0;
            if ((4 ^ 0x1F ^ (0xBE ^ 0xA1)) <= 3) {
                return ((0x2A ^ 0x49 ^ (0xF2 ^ 0xAB)) & (0x5E ^ 0x4E ^ (0x85 ^ 0xAF) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIl[0];
        }
        return bl;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (L.lIIllllllIl(Skills.getLevel((Skill)Skill.COOKING), lIllllIl[35])) {
            bl = lIllllIl[1];
            0;
            if (1 < 0) {
                return ((6 + 205 - 166 + 189 ^ 110 + 48 - 79 + 57) & (0x17 ^ 0x1E ^ (0xE7 ^ 0x8C) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIl[0];
        }
        return bl;
    }

    static {
        L.lIIllllIlll();
        L.lIIllllIllI();
        iQ = lIllllIl[9];
        iP = lIllllIl[6];
        iR = lIllllIl[11];
        iS = new WorldPoint(lIllllIl[37], lIllllIl[38], lIllllIl[0]);
        iT = new WorldPoint(lIllllIl[39], lIllllIl[40], lIllllIl[0]);
        bB = new ArrayList<d>();
    }
}

