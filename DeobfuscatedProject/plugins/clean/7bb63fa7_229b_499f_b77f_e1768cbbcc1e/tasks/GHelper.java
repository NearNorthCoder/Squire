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
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.HHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.MHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.NHelper;
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

public class GHelper {
    public static final  WorldArea O;
    public static final  WorldArea K;
    public static  WorldPoint aa;
    static  WorldPoint ab;
    
    public static final  WorldPoint L;
    public static final  WorldArea T;
    public static final  WorldArea Q;
    public static final  WorldArea U;
    public static final  WorldArea X;
    public static final  WorldArea R;
    public static  WorldPoint Z;
    public static final  WorldArea Y;
    public static final  WorldArea V;
    public static final  WorldArea S;
    public static final  WorldArea P;
    public static final  WorldArea N;
    public static final  WorldArea W;
    
    public static final  WorldArea M;

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIlll[1]);

    }

    public static void b(int[] nArray) {
        int[] lllllIIIIIllllI;
        int lllllIIIIIlllIl = lIlll[2];
        while (g.lllIlll(lllllIIIIIlllIl, lllllIIIIIllllI.length)) {
            Bank.withdraw((int)lllllIIIIIllllI[lllllIIIIIlllIl], (int)lIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIlll[1]);

            ++lllllIIIIIlllIl;

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

            int[] nArray2 = new int[lIlll[1]];
            nArray2[g.lIlll[2]] = lllllIIIIIlIIll[lllllIIIIIlIIIl];
            if (g.lllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {

                if (2 > 0) break;
                return;
            }
            ++lllllIIIIIlIIIl;

            if (-3 <= 0) continue;
            return;
        }
        Time.sleepTicks((int)lIlll[1]);

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

            ++lllllIIIIIlIlll;

            if (((0x37 ^ 0x7F) & ~(0xE3 ^ 0xAB)) == 0) continue;
            return;
        }
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

        }
        if (g.lllIIlI(Inventory.contains((int[])m.bW) ? 1 : 0) && g.lllIIll(Equipment.contains((int[])m.bW) ? 1 : 0)) {
            Inventory.getFirst((int[])m.bW).interact(lIllI[lIlll[14]]);
            Time.sleepTicks((int)lIlll[14]);

        }
        if (g.lllIIlI(Inventory.contains((int[])m.bF) ? 1 : 0) && g.lllIIll(Equipment.contains((int[])m.bF) ? 1 : 0)) {
            Inventory.getFirst((int[])m.bF).interact(lIllI[lIlll[15]]);
            Time.sleepTicks((int)lIlll[14]);

        }
        if (!g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(L), lIlll[11]) || g.lllIIlI(N.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);

            Time.sleepTicks((int)lIlll[14]);

            }
        } else if (!g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(Z), lIlll[16]) || !g.lllIIll(M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(P.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);

            Time.sleepTicks((int)lIlll[14]);

            if (3 < -1) {
                return;
            }
        } else if (g.lllIIlI(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);

            Time.sleepTicks((int)lIlll[14]);

            if (3 <= 0) {
                return;
            }
        } else if (g.lllIIlI(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)h.ac);

            Time.sleepTicks((int)lIlll[14]);

        } else if (g.lllIIlI(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllIIIIlIlIIl = new WorldPoint(lIlll[17], lIlll[18], lIlll[2]);
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(lllllIIIIlIlIIl), lIlll[14])) {
                Movement.walkTo((WorldPoint)lllllIIIIlIlIIl);

                Time.sleepTicks((int)lIlll[1]);

            }

        } else if (g.lllIIlI(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllllIIIIlIlIIl = new WorldPoint(lIlll[19], lIlll[20], lIlll[2]);
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(lllllIIIIlIlIIl), lIlll[14])) {
                Movement.walkTo((WorldPoint)lllllIIIIlIlIIl);

                Time.sleepTicks((int)lIlll[1]);

            }

            if (((0 ^ 0x5C) & ~(0x32 ^ 0x6E)) > 0) {
                return;
            }
        } else if (g.lllIIlI(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(h.ac), lIlll[21])) {
                Movement.walkTo((WorldPoint)h.ac);

                Time.sleepTicks((int)lIlll[1]);

                if (3 <= 0) {
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

            }
            if (g.lllIIlI((lllllIIIIlIIllI = new WorldArea(lIlll[33], lIlll[34], lIlll[35], lIlll[13], lIlll[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIlll[1]];
                stringArray[g.lIlll[2]] = lIllI[lIlll[21]];
                TileObject lllllIIIIlIIlIl = TileObjects.getNearest((String[])stringArray);
                if (g.lllIlIl(lllllIIIIlIIlIl)) {
                    lllllIIIIlIIlIl.interact(lIllI[lIlll[13]]);
                    Time.sleepTicks((int)lIlll[32]);

                }
            }
            Movement.walkTo((BankLocation)lllllIIIIlIllIl);

            Time.sleepTicks((int)lIlll[14]);

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

        }
        if (g.lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
    }

    private static boolean lllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIllll() {
        lIllI = new String[lIlll[107]];
        g.lIllI[g.lIlll[2]] = "Yes";
        g.lIllI[g.lIlll[1]] = "Break";
        g.lIllI[g.lIlll[14]] = "Wear";
        g.lIllI[g.lIlll[15]] = "Wear";
        g.lIllI[g.lIlll[32]] = "Break";
        g.lIllI[g.lIlll[21]] = "Lever";
        g.lIllI[g.lIlll[13]] = "Pull";
        g.lIllI[g.lIlll[35]] = "Emerald Benedict";
        g.lIllI[g.lIlll[37]] = "Bank";
        g.lIllI[g.lIlll[39]] = "Bank chest";
        g.lIllI[g.lIlll[27]] = "Use";
        g.lIllI[g.lIlll[26]] = "Use";
        g.lIllI[g.lIlll[40]] = "Bank";
        g.lIllI[g.lIlll[41]] = "Bank";
        g.lIllI[g.lIlll[42]] = "Open chest";
        g.lIllI[g.lIlll[43]] = "Bank chest";
        g.lIllI[g.lIlll[44]] = "Bank";
        g.lIllI[g.lIlll[45]] = "Bank";
        g.lIllI[g.lIlll[46]] = "Use";
        g.lIllI[g.lIlll[47]] = "Use";
        g.lIllI[g.lIlll[11]] = "Bank counter";
        g.lIllI[g.lIlll[48]] = "Bank";
        g.lIllI[g.lIlll[49]] = "Bank";
        g.lIllI[g.lIlll[50]] = "Bank booth";
        g.lIllI[g.lIlll[51]] = "Bank";
        g.lIllI[g.lIlll[52]] = "teleport";
        g.lIllI[g.lIlll[53]] = "teleport";
        g.lIllI[g.lIlll[54]] = "teleport";
        g.lIllI[g.lIlll[55]] = "teleport";
    }

    private static boolean lllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void G() {
        if (g.lllIllI(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[35]];
            NPCs.getNearest((String[])stringArray).interact(lIllI[lIlll[37]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

        }
        if (!g.lllIIll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || g.lllIIlI(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIlll[15]);

            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

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

                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

                }
                String[] stringArray3 = new String[lIlll[1]];
                stringArray3[g.lIlll[2]] = lIllI[lIlll[40]];
                if (g.lllIIlI(lllllIIIIlIIIlI.hasAction(stringArray3) ? 1 : 0)) {
                    lllllIIIIlIIIlI.interact(lIllI[lIlll[41]]);
                    Time.sleepTicks((int)lIlll[15]);

                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

                }
            }

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

                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

                }
            }
            if (g.lllIlIl(lllllIIIIlIIIIl)) {
                String[] stringArray6 = new String[lIlll[1]];
                stringArray6[g.lIlll[2]] = lIllI[lIlll[46]];
                if (g.lllIIlI(lllllIIIIlIIIIl.hasAction(stringArray6) ? 1 : 0)) {
                    lllllIIIIlIIIIl.interact(lIllI[lIlll[47]]);
                    Time.sleepTicks((int)lIlll[15]);

                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

                }
            }

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

                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

                }
            }

            }
        } else if (g.lllIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && g.lllIlII(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
            String[] stringArray = new String[lIlll[1]];
            stringArray[g.lIlll[2]] = lIllI[lIlll[50]];
            TileObject lllllIIIIlIIIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (g.lllIlIl(lllllIIIIlIIIlI)) {
                lllllIIIIlIIIlI.interact(lIllI[lIlll[51]]);
                Time.sleepTicks((int)lIlll[15]);

                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlll[38]);

            }
        }
    }

    private static boolean lllIlll(int n2, int n3) {
        return n2 < n3;
    }

}

