/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.h;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.m;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class g {
    public static final /* synthetic */ WorldArea O;
    public static final /* synthetic */ WorldArea K;
    public static /* synthetic */ WorldPoint aa;
    static /* synthetic */ WorldPoint ab;
    private static /* synthetic */ String[] lIllI;
    public static final /* synthetic */ WorldPoint L;
    public static final /* synthetic */ WorldArea T;
    public static final /* synthetic */ WorldArea Q;
    public static final /* synthetic */ WorldArea U;
    public static final /* synthetic */ WorldArea X;
    public static final /* synthetic */ WorldArea R;
    public static /* synthetic */ WorldPoint Z;
    public static final /* synthetic */ WorldArea Y;
    public static final /* synthetic */ WorldArea V;
    public static final /* synthetic */ WorldArea S;
    public static final /* synthetic */ WorldArea P;
    public static final /* synthetic */ WorldArea N;
    public static final /* synthetic */ WorldArea W;
    private static /* synthetic */ int[] lIlll;
    public static final /* synthetic */ WorldArea M;

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIlll[1]);
        "".length();
    }

    public static void b(int[] nArray) {
        int[] lllllIIIIIllllI;
        int lllllIIIIIlllIl = lIlll[2];
        while (g.lllIlll(lllllIIIIIlllIl, lllllIIIIIllllI.length)) {
            Bank.withdraw((int)lllllIIIIIllllI[lllllIIIIIlllIl], (int)lIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlll[1]);
            "".length();
            ++lllllIIIIIlllIl;
            "".length();
            if (null == null) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lllllIIIIIlIIll;
        int lllllIIIIIlIIIl = lIlll[2];
        while (g.lllIlll(lllllIIIIIlIIIl, lllllIIIIIlIIll.length)) {
            void lllllIIIIIlIIlI;
            Bank.withdraw((int)lllllIIIIIlIIll[lllllIIIIIlIIIl], (int)lllllIIIIIlIIlI, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlll[1]);
            "".length();
            int[] nArray2 = new int[lIlll[1]];
            nArray2[g.lIlll[2]] = lllllIIIIIlIIll[lllllIIIIIlIIIl];
            if (g.lllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                "".length();
                if ("  ".length() > 0) break;
                return;
            }
            ++lllllIIIIIlIIIl;
            "".length();
            if (-"   ".length() <= 0) continue;
            return;
        }
        Time.sleepTicks((int)lIlll[1]);
        "".length();
        if (g.lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
    }

    private static boolean lllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lllllIIIIIllIIl;
        int lllllIIIIIlIlll = lIlll[2];
        while (g.lllIlll(lllllIIIIIlIlll, lllllIIIIIllIIl.length)) {
            void lllllIIIIIllIII;
            Bank.withdraw((int)lllllIIIIIllIIl[lllllIIIIIlIlll], (int)lllllIIIIIllIII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlll[1]);
            "".length();
            ++lllllIIIIIlIlll;
            "".length();
            if (((0x37 ^ 0x7F) & ~(0xE3 ^ 0xAB)) == 0) continue;
            return;
        }
    }

    private static String llIllII(String llllIllllllIIII, String llllIlllllIllll) {
        llllIllllllIIII = new String(Base64.getDecoder().decode(llllIllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIllllllIIll = new StringBuilder();
        char[] llllIllllllIIlI = llllIlllllIllll.toCharArray();
        int llllIllllllIIIl = lIlll[2];
        char[] llllIlllllIlIll = llllIllllllIIII.toCharArray();
        int llllIlllllIlIlI = llllIlllllIlIll.length;
        int llllIlllllIlIIl = lIlll[2];
        while (g.lllIlll(llllIlllllIlIIl, llllIlllllIlIlI)) {
            char llllIllllllIllI = llllIlllllIlIll[llllIlllllIlIIl];
            llllIllllllIIll.append((char)(llllIllllllIllI ^ llllIllllllIIlI[llllIllllllIIIl % llllIllllllIIlI.length]));
            "".length();
            ++llllIllllllIIIl;
            ++llllIlllllIlIIl;
            "".length();
            if ((0x64 ^ 0x60) >= 0) continue;
            return null;
        }
        return String.valueOf(llllIllllllIIll);
    }

    static {
        g.lllIIII();
        g.llIllll();
        K = new WorldArea(lIlll[56], lIlll[57], lIlll[58], lIlll[59], lIlll[2]);
        L = new WorldPoint(lIlll[60], lIlll[61], lIlll[2]);
        M = new WorldArea(lIlll[62], lIlll[63], lIlll[64], lIlll[64], lIlll[2]);
        N = new WorldArea(lIlll[65], lIlll[66], lIlll[67], lIlll[68], lIlll[2]);
        O = new WorldArea(lIlll[69], lIlll[70], lIlll[46], lIlll[11], lIlll[2]);
        P = new WorldArea(lIlll[71], lIlll[72], lIlll[73], lIlll[74], lIlll[2]);
        Q = new WorldArea(lIlll[75], lIlll[76], lIlll[77], lIlll[78], lIlll[2]);
        R = new WorldArea(lIlll[79], lIlll[80], lIlll[43], lIlll[44], lIlll[2]);
        S = new WorldArea(lIlll[81], lIlll[82], lIlll[83], lIlll[84], lIlll[2]);
        T = new WorldArea(lIlll[85], lIlll[86], lIlll[87], lIlll[88], lIlll[2]);
        U = new WorldArea(lIlll[89], lIlll[90], lIlll[83], lIlll[77], lIlll[2]);
        V = new WorldArea(lIlll[91], lIlll[92], lIlll[42], lIlll[27], lIlll[2]);
        W = new WorldArea(lIlll[93], lIlll[94], lIlll[95], lIlll[96], lIlll[2]);
        X = new WorldArea(lIlll[97], lIlll[98], lIlll[54], lIlll[87], lIlll[2]);
        Y = new WorldArea(lIlll[99], lIlll[100], lIlll[67], lIlll[48], lIlll[2]);
        Z = new WorldPoint(lIlll[101], lIlll[102], lIlll[2]);
        aa = new WorldPoint(lIlll[103], lIlll[104], lIlll[2]);
        ab = new WorldPoint(lIlll[105], lIlll[106], lIlll[1]);
    }

    private static boolean lllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIl(Object object) {
        return object != null;
    }

    public static void a(BankLocation bankLocation) {
        if (g.lllIIIl(Vars.getBit((int)lIlll[0]), lIlll[1]) && g.lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[2]];
            n.c(stringArray);
        }
        WorldArea lllllIIIIlIllII = new WorldArea(lIlll[3], lIlll[4], lIlll[5], lIlll[6], lIlll[2]);
        WorldPoint lllllIIIIlIlIll = new WorldPoint(lIlll[7], lIlll[8], lIlll[2]);
        WorldPoint lllllIIIIlIlIlI = new WorldPoint(lIlll[9], lIlll[10], lIlll[2]);
        if ((!g.lllIIll(Players.getLocal().getWorldLocation().equals((Object)lllllIIIIlIlIll) ? 1 : 0) || !g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(lllllIIIIlIlIlI), lIlll[11]) || g.lllIIlI(lllllIIIIlIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && g.lllIIlI(Inventory.contains(item -> item.getName().contains(lIllI[lIlll[55]])) ? 1 : 0) && g.lllIIIl(Players.getLocal().getAnimation(), lIlll[12])) {
            Inventory.getFirst(item -> item.getName().contains(lIllI[lIlll[54]])).interact(lIllI[lIlll[1]]);
            Time.sleepTicks((int)lIlll[13]);
            "".length();
        }
        if (g.lllIIlI(Inventory.contains((int[])m.bW) ? 1 : 0) && g.lllIIll(Equipment.contains((int[])m.bW) ? 1 : 0)) {
            Inventory.getFirst((int[])m.bW).interact(lIllI[lIlll[14]]);
            Time.sleepTicks((int)lIlll[14]);
            "".length();
        }
        if (g.lllIIlI(Inventory.contains((int[])m.bF) ? 1 : 0) && g.lllIIll(Equipment.contains((int[])m.bF) ? 1 : 0)) {
            Inventory.getFirst((int[])m.bF).interact(lIllI[lIlll[15]]);
            Time.sleepTicks((int)lIlll[14]);
            "".length();
        }
        if (!g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(L), lIlll[11]) || g.lllIIlI(N.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks((int)lIlll[14]);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        } else if (!g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(Z), lIlll[16]) || !g.lllIIll(M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(P.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks((int)lIlll[14]);
            "".length();
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        } else if (g.lllIIlI(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks((int)lIlll[14]);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else if (g.lllIIlI(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)h.ac);
            "".length();
            Time.sleepTicks((int)lIlll[14]);
            "".length();
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        } else if (g.lllIIlI(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllIIIIlIlIIl = new WorldPoint(lIlll[17], lIlll[18], lIlll[2]);
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(lllllIIIIlIlIIl), lIlll[14])) {
                Movement.walkTo((WorldPoint)lllllIIIIlIlIIl);
                "".length();
                Time.sleepTicks((int)lIlll[1]);
                "".length();
            }
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        } else if (g.lllIIlI(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllIIIIlIlIIl = new WorldPoint(lIlll[19], lIlll[20], lIlll[2]);
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(lllllIIIIlIlIIl), lIlll[14])) {
                Movement.walkTo((WorldPoint)lllllIIIIlIlIIl);
                "".length();
                Time.sleepTicks((int)lIlll[1]);
                "".length();
            }
            "".length();
            if (((0 ^ 0x5C) & ~(0x32 ^ 0x6E)) > 0) {
                return;
            }
        } else if (g.lllIIlI(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(h.ac), lIlll[21])) {
                Movement.walkTo((WorldPoint)h.ac);
                "".length();
                Time.sleepTicks((int)lIlll[1]);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
        } else {
            BankLocation lllllIIIIlIllIl;
            WorldArea lllllIIIIlIIllI;
            WorldArea lllllIIIIlIlIIl = new WorldArea(lIlll[22], lIlll[23], lIlll[13], lIlll[21], lIlll[2]);
            WorldArea lllllIIIIlIlIII = new WorldArea(lIlll[24], lIlll[25], lIlll[26], lIlll[27], lIlll[2]);
            WorldArea lllllIIIIlIIlll = new WorldArea(lIlll[28], lIlll[29], lIlll[30], lIlll[31], lIlll[2]);
            if ((!g.lllIIll(lllllIIIIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !g.lllIIll(lllllIIIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(lllllIIIIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && g.lllIIlI(Inventory.contains(item -> item.getName().contains(lIllI[lIlll[53]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIllI[lIlll[52]])).interact(lIllI[lIlll[32]]);
                Time.sleepTicks((int)lIlll[32]);
                "".length();
            }
            if (g.lllIIlI((lllllIIIIlIIllI = new WorldArea(lIlll[33], lIlll[34], lIlll[35], lIlll[13], lIlll[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIlll[1]];
                stringArray[g.lIlll[2]] = lIllI[lIlll[21]];
                TileObject lllllIIIIlIIlIl = TileObjects.getNearest((String[])stringArray);
                if (g.lllIlIl(lllllIIIIlIIlIl)) {
                    lllllIIIIlIIlIl.interact(lIllI[lIlll[13]]);
                    Time.sleepTicks((int)lIlll[32]);
                    "".length();
                }
            }
            Movement.walkTo((BankLocation)lllllIIIIlIllIl);
            "".length();
            Time.sleepTicks((int)lIlll[14]);
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lllllIIIIIIlllI;
        int[] nArray = new int[lIlll[1]];
        nArray[g.lIlll[2]] = n2;
        if (g.lllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[lIlll[1]];
        nArray2[g.lIlll[2]] = lllllIIIIIIlllI;
        if (g.lllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lllllIIIIIIllIl;
            Bank.withdraw((int)lllllIIIIIIlllI, (int)lllllIIIIIIllIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlll[1]);
            "".length();
        }
        if (g.lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
    }

    private static String llIllIl(String lllllIIIIIIIlIl, String lllllIIIIIIIlII) {
        try {
            SecretKeySpec lllllIIIIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), lIlll[37]), "DES");
            Cipher lllllIIIIIIIlll = Cipher.getInstance("DES");
            lllllIIIIIIIlll.init(lIlll[14], lllllIIIIIIlIII);
            return new String(lllllIIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIIIIIllI) {
            lllllIIIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIllll() {
        lIllI = new String[lIlll[107]];
        g.lIllI[g.lIlll[2]] = g.llIllII("Dw09", "VhNUf");
        g.lIllI[g.lIlll[1]] = g.llIllIl("nRgl6FWo1O8=", "WkhKy");
        g.lIllI[g.lIlll[14]] = g.llIllII("MBIuGA==", "gwOjB");
        g.lIllI[g.lIlll[15]] = g.llIllIl("q9QlvZ/GbL4=", "JWKXk");
        g.lIllI[g.lIlll[32]] = g.llIlllI("h/EGr0gkJjE=", "rVThq");
        g.lIllI[g.lIlll[21]] = g.llIllII("IAAgBws=", "leVby");
        g.lIllI[g.lIlll[13]] = g.llIllII("JjEBDg==", "vDmbx");
        g.lIllI[g.lIlll[35]] = g.llIllIl("dN+SVEmXm/qFDfgb3/auVjGMHUbpgoVN", "xAQVi");
        g.lIllI[g.lIlll[37]] = g.llIllII("BhAqGw==", "DqDpT");
        g.lIllI[g.lIlll[39]] = g.llIlllI("ms1JjE+MwX7++CC2G9Ey8A==", "aRhBK");
        g.lIllI[g.lIlll[27]] = g.llIlllI("q0c/IzD5owU=", "UROBi");
        g.lIllI[g.lIlll[26]] = g.llIllIl("y1OYGbiza2k=", "vhOJY");
        g.lIllI[g.lIlll[40]] = g.llIllIl("0CTaQLiKiKE=", "vdmiQ");
        g.lIllI[g.lIlll[41]] = g.llIllIl("i6JaGzbJIRQ=", "egTXz");
        g.lIllI[g.lIlll[42]] = g.llIlllI("CJ95drBaEUnrB6XSNSGNFg==", "YKuMg");
        g.lIllI[g.lIlll[43]] = g.llIllIl("IOUTZsZBo+1SHWBW+hfodg==", "AcSkp");
        g.lIllI[g.lIlll[44]] = g.llIllIl("RLBfCXdAibU=", "LZkIW");
        g.lIllI[g.lIlll[45]] = g.llIlllI("XkSqQVA3ImM=", "PFFGP");
        g.lIllI[g.lIlll[46]] = g.llIllIl("FU3FpIXn0VU=", "BbhPK");
        g.lIllI[g.lIlll[47]] = g.llIlllI("bPU7DlU1BIY=", "PgeXQ");
        g.lIllI[g.lIlll[11]] = g.llIllII("JRUjHUMEGzgYFwIG", "gtMvc");
        g.lIllI[g.lIlll[48]] = g.llIlllI("yxtAt4EKkz0=", "JDXHO");
        g.lIllI[g.lIlll[49]] = g.llIllIl("FzKUcxdCybY=", "BbGoU");
        g.lIllI[g.lIlll[50]] = g.llIllIl("lVVNlxmxZv20nagiovy+IQ==", "duDcj");
        g.lIllI[g.lIlll[51]] = g.llIllII("LCsaIg==", "nJtIQ");
        g.lIllI[g.lIlll[52]] = g.llIllII("GhAPMhMBBxc=", "nucWc");
        g.lIllI[g.lIlll[53]] = g.llIllIl("3XwHZuN4P4SgnUOkCl2DLg==", "wRBMy");
        g.lIllI[g.lIlll[54]] = g.llIllII("JAgcHRI/HwQ=", "Pmpxb");
        g.lIllI[g.lIlll[55]] = g.llIllIl("r1Z6zOY4fgm2/rzIqwQAeQ==", "nMpFR");
    }

    private static boolean lllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIIII() {
        lIlll = new int[108];
        g.lIlll[0] = 0xFFFF8F8A & 0x78F5;
        g.lIlll[1] = " ".length();
        g.lIlll[2] = (0xB0 ^ 0xAE ^ (0x2E ^ 0x62)) & (0x19 ^ 0x70 ^ (0x26 ^ 0x1D) ^ -" ".length());
        g.lIlll[3] = -(0xFFFFFD67 & 0x5799) & (0xFFFFFFFD & 0x5FFE);
        g.lIlll[4] = -(0xFFFFE57E & 0x1BFF) & (0xFFFFA7FF & Short.MAX_VALUE);
        g.lIlll[5] = 0xB ^ 0x40;
        g.lIlll[6] = 0xBD ^ 0x98 ^ (0x54 ^ 0x6E);
        g.lIlll[7] = 0xFFFFBFDF & 0x49B4;
        g.lIlll[8] = 0xFFFF937B & 0x7DFD;
        g.lIlll[9] = 0xFFFFBBFD & 0x4F8A;
        g.lIlll[10] = -(0xFFFFE21B & 0x3DF7) & (0xFFFFFEFF & 0x379F);
        g.lIlll[11] = 0x18 ^ 0xC;
        g.lIlll[12] = -" ".length();
        g.lIlll[13] = 0x8A ^ 0x8C;
        g.lIlll[14] = "  ".length();
        g.lIlll[15] = "   ".length();
        g.lIlll[16] = 129 + 140 - 250 + 142 ^ 126 + 120 - 161 + 52;
        g.lIlll[17] = 0xFFFFBFBC & 0x4973;
        g.lIlll[18] = 0xFFFF8E7B & 0x7DDF;
        g.lIlll[19] = 0xFFFFDEF7 & 0x2BF8;
        g.lIlll[20] = -(0xFFFFDE1B & 0x61E5) & (0xFFFFDFFB & 0x77DF);
        g.lIlll[21] = 0x7D ^ 0x78;
        g.lIlll[22] = -(0xFFFFF1B8 & 0x5FCF) & (0xFFFFFBF7 & 0x5FBF);
        g.lIlll[23] = 0xFFFFEF44 & 0x1DFB;
        g.lIlll[24] = -(0xFFFF9BB5 & 0x75DB) & (0xFFFFDFF5 & 0x3B9E);
        g.lIlll[25] = 0xFFFFFBEF & 0xF3C;
        g.lIlll[26] = 0x11 ^ 0x1A;
        g.lIlll[27] = 0x37 ^ 0x3D;
        g.lIlll[28] = -(0xFFFFDDEB & 0x7B57) & (0xFFFFDFEF & 0x7FDF);
        g.lIlll[29] = 0xFFFFBFAE & 0x4DFF;
        g.lIlll[30] = 0xB5 ^ 0xAC ^ (0xB2 ^ 0x80);
        g.lIlll[31] = 0xC8 ^ 0x88 ^ (0xEE ^ 0x9A);
        g.lIlll[32] = 0x23 ^ 0x7E ^ (0xD8 ^ 0x81);
        g.lIlll[33] = 0xFFFF9ECF & 0x6D7F;
        g.lIlll[34] = -(0xFFFFF7EB & 0x389F) & (0xFFFFBFFB & 0x7FDF);
        g.lIlll[35] = 0xC1 ^ 0xC6;
        g.lIlll[36] = 0x86 ^ 0x98;
        g.lIlll[37] = 0xA4 ^ 0xAC;
        g.lIlll[38] = -(0xFFFFEAD7 & 0x757B) & (0xFFFFFFF3 & 0x6FFE);
        g.lIlll[39] = 0x60 ^ 0x5C ^ (0 ^ 0x35);
        g.lIlll[40] = 0x87 ^ 0x8B;
        g.lIlll[41] = 0x5B ^ 0xE ^ (0x4A ^ 0x12);
        g.lIlll[42] = 0x76 ^ 0x16 ^ (0xE0 ^ 0x8E);
        g.lIlll[43] = 20 + 107 - 83 + 91 ^ 124 + 6 - 67 + 73;
        g.lIlll[44] = 0x3B ^ 0x2B;
        g.lIlll[45] = 0xC ^ 0x68 ^ (0x18 ^ 0x6D);
        g.lIlll[46] = 0x5F ^ 0x4D;
        g.lIlll[47] = 0 ^ 0x13;
        g.lIlll[48] = 0x7A ^ 0x6F;
        g.lIlll[49] = 0xDC ^ 0xB3 ^ (0x4F ^ 0x36);
        g.lIlll[50] = 0xA9 ^ 0xBE;
        g.lIlll[51] = 154 + 141 - 167 + 58 ^ 42 + 83 - 27 + 64;
        g.lIlll[52] = 0x65 ^ 0x2F ^ (0xE1 ^ 0xB2);
        g.lIlll[53] = 0x5F ^ 0x45;
        g.lIlll[54] = 0xA3 ^ 0xB8;
        g.lIlll[55] = 0x8A ^ 0x96;
        g.lIlll[56] = -(0xFFFFFEEF & 0x73B1) & (0xFFFFFFFF & 0x7EE7);
        g.lIlll[57] = 0xFFFF8FFB & 0x7D95;
        g.lIlll[58] = 0xF1 ^ 0x92 ^ (0x4F ^ 5);
        g.lIlll[59] = 0x7E ^ 0x59;
        g.lIlll[60] = 0xFFFFAD8D & 0x5EF6;
        g.lIlll[61] = -(0xFFFFBBFD & 0x664B) & (0xFFFFEF6D & 0x3FFF);
        g.lIlll[62] = -(0xFFFFFFB9 & 0x44E7) & (0xFFFFFFFB & 0x4FFF);
        g.lIlll[63] = 0xFFFF9EBA & 0x6DCF;
        g.lIlll[64] = 0xF8 ^ 0x91;
        g.lIlll[65] = -(119 + 17 - 110 + 103) & (0xFFFFECFF & 0x1FFC);
        g.lIlll[66] = -(0xFFFFFAB9 & 0x57CF) & (0xFFFFFFBE & 0x5FEF);
        g.lIlll[67] = 0xAA ^ 0x89;
        g.lIlll[68] = 73 + 132 - 73 + 52 ^ 116 + 33 - 102 + 83;
        g.lIlll[69] = 0xFFFFDD7F & 0x2EB5;
        g.lIlll[70] = 0xFFFFDF67 & 0x2EBB;
        g.lIlll[71] = 0xFFFF8F5E & 0x7EBF;
        g.lIlll[72] = 0xFFFFCF5E & 0x3DFB;
        g.lIlll[73] = 0xEC ^ 0xB0;
        g.lIlll[74] = 0x10 ^ 0x35;
        g.lIlll[75] = -(0xFFFFF2F1 & 0x6DCF) & (0xFFFFECFE & 0x7FFB);
        g.lIlll[76] = 0xFFFF9F7F & 0x6DF1;
        g.lIlll[77] = 96 + 120 - 93 + 9 ^ 18 + 41 - -91 + 31;
        g.lIlll[78] = 0x6F ^ 0x71 ^ (0xD7 ^ 0x8D);
        g.lIlll[79] = 0xFFFFBFFF & 0x465E;
        g.lIlll[80] = -(80 + 73 - 150 + 145) & (0xFFFFAFFF & 0x5FF3);
        g.lIlll[81] = -(0xFFFFF05F & 0x5FA3) & (0xFFFFFFFF & 0x5B7E);
        g.lIlll[82] = 0xFFFFFEFF & 0xDED;
        g.lIlll[83] = 0x69 ^ 0x44;
        g.lIlll[84] = 0x23 ^ 0x1C ^ (0x23 ^ 0x38);
        g.lIlll[85] = -(0xFFFFD7F3 & 0x7C1D) & (0xFFFFFF1E & 0x5DFF);
        g.lIlll[86] = -(0xFFFF9FA2 & 0x62FF) & (0xFFFFDFFF & 0x2EEB);
        g.lIlll[87] = 0xE9 ^ 0xC3;
        g.lIlll[88] = 0x25 ^ 0x16;
        g.lIlll[89] = -(0xFFFFFB3B & 0x34F7) & (0xFFFFFBFF & 0x3EFF);
        g.lIlll[90] = -(0xFFFFFC77 & 0x23BB) & (0xFFFFF7FE & 0x3FFF);
        g.lIlll[91] = -(0xFFFFBAEF & 0x57DB) & (0xFFFF9FFF & 0x7FFB);
        g.lIlll[92] = -(0xFFFFFF6F & 0x5091) & (0xFFFFFFCF & 0x5CF2);
        g.lIlll[93] = 0xFFFFAADF & 0x5F6F;
        g.lIlll[94] = -(0xFFFF97BF & 0x6B71) & (0xFFFFDFFF & 0x2F75);
        g.lIlll[95] = 0xBF ^ 0xBA ^ (0x70 ^ 0x43);
        g.lIlll[96] = 122 + 138 - 208 + 107 ^ 20 + 39 - -3 + 129;
        g.lIlll[97] = 0xFFFFD4DE & 0x2FF3;
        g.lIlll[98] = -(0xFFFFD737 & 0x79ED) & (0xFFFFFFFF & 0x5FAF);
        g.lIlll[99] = -(0xFFFFD8FF & 0x6701) & (0xFFFFDDFF & 0x6E7F);
        g.lIlll[100] = -(0xFFFFD377 & 0x3EE9) & (0xFFFFFFFE & 0x1FFF);
        g.lIlll[101] = -(0xFFFFF7F3 & 0x7C2D) & (0xFFFFFFBF & Short.MAX_VALUE);
        g.lIlll[102] = -(0xFFFFFABE & 0x7753) & (0xFFFFFFFB & 0x7EBF);
        g.lIlll[103] = 0xFFFFEFFF & 0x16BA;
        g.lIlll[104] = -(0xFFFFF9BF & 0x3671) & (0xFFFFBDFD & 0x7FBB);
        g.lIlll[105] = -(0xFFFFF33D & 0x3CC3) & (0xFFFFBBF7 & 0x7FEC);
        g.lIlll[106] = -(0xFFFFF6F5 & 0x6D8B) & (0xFFFFF7FD & 0x7FEF);
        g.lIlll[107] = 0x20 ^ 0x78 ^ (0xC1 ^ 0x84);
    }

    public static void G() {
        if (g.lllIllI(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[35]];
            NPCs.getNearest((String[])stringArray).interact(lIllI[lIlll[37]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
            "".length();
        }
        if (!g.lllIIll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIlll[15]);
            "".length();
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
            "".length();
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        } else if (!(g.lllIIll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIIll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIIll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIIll(O.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIIll(R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !g.lllIllI(Players.getLocal().getWorldLocation().distanceTo(aa), lIlll[11]))) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[39]];
            TileObject lllllIIIIlIIIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (g.lllIlIl(lllllIIIIlIIIlI)) {
                String[] stringArray2 = new String[lIlll[1]];
                stringArray2[g.lIlll[2]] = lIllI[lIlll[27]];
                if (g.lllIIlI(lllllIIIIlIIIlI.hasAction(stringArray2) ? 1 : 0)) {
                    lllllIIIIlIIIlI.interact(lIllI[lIlll[26]]);
                    Time.sleepTicks((int)lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                    "".length();
                }
                String[] stringArray3 = new String[lIlll[1]];
                stringArray3[g.lIlll[2]] = lIllI[lIlll[40]];
                if (g.lllIIlI(lllllIIIIlIIIlI.hasAction(stringArray3) ? 1 : 0)) {
                    lllllIIIIlIIIlI.interact(lIllI[lIlll[41]]);
                    Time.sleepTicks((int)lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if ((12 + 157 - 164 + 183 ^ 106 + 13 - 72 + 137) != (0x34 ^ 0 ^ (0x8F ^ 0xBF))) {
                return;
            }
        } else if (!g.lllIIll(V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !g.lllIIll(X.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(W.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[42]];
            TileObject lllllIIIIlIIIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            String[] stringArray4 = new String[lIlll[1]];
            stringArray4[g.lIlll[2]] = lIllI[lIlll[43]];
            TileObject lllllIIIIlIIIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray4);
            if (g.lllIlIl(lllllIIIIlIIIlI)) {
                String[] stringArray5 = new String[lIlll[1]];
                stringArray5[g.lIlll[2]] = lIllI[lIlll[44]];
                if (g.lllIIlI(lllllIIIIlIIIlI.hasAction(stringArray5) ? 1 : 0)) {
                    lllllIIIIlIIIlI.interact(lIllI[lIlll[45]]);
                    Time.sleepTicks((int)lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                    "".length();
                }
            }
            if (g.lllIlIl(lllllIIIIlIIIIl)) {
                String[] stringArray6 = new String[lIlll[1]];
                stringArray6[g.lIlll[2]] = lIllI[lIlll[46]];
                if (g.lllIIlI(lllllIIIIlIIIIl.hasAction(stringArray6) ? 1 : 0)) {
                    lllllIIIIlIIIIl.interact(lIllI[lIlll[47]]);
                    Time.sleepTicks((int)lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        } else if (g.lllIIlI(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[11]];
            TileObject lllllIIIIlIIIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (g.lllIlIl(lllllIIIIlIIIlI)) {
                String[] stringArray7 = new String[lIlll[1]];
                stringArray7[g.lIlll[2]] = lIllI[lIlll[48]];
                if (g.lllIIlI(lllllIIIIlIIIlI.hasAction(stringArray7) ? 1 : 0)) {
                    lllllIIIIlIIIlI.interact(lIllI[lIlll[49]]);
                    Time.sleepTicks((int)lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        } else if (g.lllIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[50]];
            TileObject lllllIIIIlIIIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (g.lllIlIl(lllllIIIIlIIIlI)) {
                lllllIIIIlIIIlI.interact(lIllI[lIlll[51]]);
                Time.sleepTicks((int)lIlll[15]);
                "".length();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);
                "".length();
            }
        }
    }

    private static boolean lllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlllI(String llllIllllIllllI, String llllIllllIlllIl) {
        try {
            SecretKeySpec llllIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllllIIIlI = Cipher.getInstance("Blowfish");
            llllIlllllIIIlI.init(lIlll[14], llllIlllllIIIll);
            return new String(llllIlllllIIIlI.doFinal(Base64.getDecoder().decode(llllIllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllllIIIIl) {
            llllIlllllIIIIl.printStackTrace();
            return null;
        }
    }
}

