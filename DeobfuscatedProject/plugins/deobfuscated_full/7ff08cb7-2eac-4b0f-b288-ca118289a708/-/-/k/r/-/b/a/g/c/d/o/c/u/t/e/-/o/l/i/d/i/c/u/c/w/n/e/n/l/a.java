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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
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

public class a {
    static /* synthetic */ WorldPoint J;
    private static /* synthetic */ String[] llIlIllII;
    public static final /* synthetic */ WorldArea D;
    private static /* synthetic */ int[] llIlIllIl;
    public static final /* synthetic */ WorldArea B;
    public static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea G;
    public static final /* synthetic */ WorldArea F;
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldPoint z;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea A;

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lIIIlllIIllIII;
        int lIIIlllIIlIllI = llIlIllIl[2];
        while (a.lIllIlIllllI(lIIIlllIIlIllI, lIIIlllIIllIII.length)) {
            void lIIIlllIIlIlll;
            Bank.withdraw((int)lIIIlllIIllIII[lIIIlllIIlIllI], (int)lIIIlllIIlIlll, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIllIl[1]);
            0;
            ++lIIIlllIIlIllI;
            0;
            
            return;
        }
    }

    private static boolean lIllIlIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIlIlIlIl(String lIIIllIllIIIlI, String lIIIllIllIIIIl) {
        lIIIllIllIIIlI = new String(Base64.getDecoder().decode(lIIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIllIllIIlIl = new StringBuilder();
        char[] lIIIllIllIIlII = lIIIllIllIIIIl.toCharArray();
        int lIIIllIllIIIll = llIlIllIl[2];
        char[] lIIIllIlIlllIl = lIIIllIllIIIlI.toCharArray();
        int lIIIllIlIlllII = lIIIllIlIlllIl.length;
        int lIIIllIlIllIll = llIlIllIl[2];
        while (a.lIllIlIllllI(lIIIllIlIllIll, lIIIllIlIlllII)) {
            char lIIIllIllIlIII = lIIIllIlIlllIl[lIIIllIlIllIll];
            lIIIllIllIIlIl.append((char)(lIIIllIllIlIII ^ lIIIllIllIIlII[lIIIllIllIIIll % lIIIllIllIIlII.length]));
            0;
            ++lIIIllIllIIIll;
            ++lIIIllIlIllIll;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(lIIIllIllIIlIl);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lIIIlllIIIllIl;
        int[] nArray = new int[llIlIllIl[1]];
        nArray[a.llIlIllIl[2]] = n2;
        if (a.lIllIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[llIlIllIl[1]];
        nArray2[a.llIlIllIl[2]] = lIIIlllIIIllIl;
        if (a.lIllIlIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lIIIlllIIIllII;
            Bank.withdraw((int)lIIIlllIIIllIl, (int)lIIIlllIIIllII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIllIl[1]);
            0;
        }
    }

    public static void a() {
        if (a.lIllIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(J), llIlIllIl[28])) {
            String[] stringArray = new String[llIlIllIl[1]];
            stringArray[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[27]];
            NPCs.getNearest((String[])stringArray).interact(llIlIllII[llIlIllIl[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIl[30]);
            0;
        }
        if (!a.lIllIlIllIlI(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIlIllIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)llIlIllIl[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIl[30]);
            0;
            0;
            if ((135 + 55 - 95 + 83 ^ 48 + 54 - -80 + 0) <= 2) {
                return;
            }
        } else if (!(a.lIllIlIllIlI(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIlIllIlI(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIlIllIlI(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIlIllIlI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIlIllIlI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lIllIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(I), llIlIllIl[11]))) {
            String[] stringArray = new String[llIlIllIl[1]];
            stringArray[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[31]];
            TileObject lIIIlllIlIIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIllIlIlllII(lIIIlllIlIIIII)) {
                String[] stringArray2 = new String[llIlIllIl[1]];
                stringArray2[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[23]];
                if (a.lIllIlIllIIl(lIIIlllIlIIIII.hasAction(stringArray2) ? 1 : 0)) {
                    lIIIlllIlIIIII.interact(llIlIllII[llIlIllIl[22]]);
                    Time.sleepTicks((int)llIlIllIl[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIl[30]);
                    0;
                }
                String[] stringArray3 = new String[llIlIllIl[1]];
                stringArray3[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[32]];
                if (a.lIllIlIllIIl(lIIIlllIlIIIII.hasAction(stringArray3) ? 1 : 0)) {
                    lIIIlllIlIIIII.interact(llIlIllII[llIlIllIl[33]]);
                    Time.sleepTicks((int)llIlIllIl[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIl[30]);
                    0;
                }
            }
            0;
            
            }
        } else if (a.lIllIlIllIlI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(J), llIlIllIl[28])) {
            String[] stringArray = new String[llIlIllIl[1]];
            stringArray[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[34]];
            TileObject lIIIlllIlIIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIllIlIlllII(lIIIlllIlIIIII)) {
                lIIIlllIlIIIII.interact(llIlIllII[llIlIllIl[35]]);
                Time.sleepTicks((int)llIlIllIl[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIl[30]);
                0;
            }
        }
    }

    private static boolean lIllIlIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIlIllI() {
        llIlIllII = new String[llIlIllIl[11]];
        a.llIlIllII[a.llIlIllIl[2]] = a."Yes";
        a.llIlIllII[a.llIlIllIl[1]] = a."Break";
        a.llIlIllII[a.llIlIllIl[14]] = a."Wear";
        a.llIlIllII[a.llIlIllIl[15]] = a."Wear";
        a.llIlIllII[a.llIlIllIl[24]] = a."Break";
        a.llIlIllII[a.llIlIllIl[19]] = a."Lever";
        a.llIlIllII[a.llIlIllIl[13]] = a."Pull";
        a.llIlIllII[a.llIlIllIl[27]] = a."Emerald Benedict";
        a.llIlIllII[a.llIlIllIl[29]] = a."Bank";
        a.llIlIllII[a.llIlIllIl[31]] = a."Bank chest";
        a.llIlIllII[a.llIlIllIl[23]] = a."Use";
        a.llIlIllII[a.llIlIllIl[22]] = a."Use";
        a.llIlIllII[a.llIlIllIl[32]] = a."Bank";
        a.llIlIllII[a.llIlIllIl[33]] = a."Bank";
        a.llIlIllII[a.llIlIllIl[34]] = a."Bank booth";
        a.llIlIllII[a.llIlIllIl[35]] = a."Bank";
        a.llIlIllII[a.llIlIllIl[36]] = a."teleport";
        a.llIlIllII[a.llIlIllIl[37]] = a."teleport";
        a.llIlIllII[a.llIlIllIl[38]] = a."teleport";
        a.llIlIllII[a.llIlIllIl[39]] = a."teleport";
    }

    private static boolean lIllIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lIIIlllIIlIIlI;
        int lIIIlllIIlIIII = llIlIllIl[2];
        while (a.lIllIlIllllI(lIIIlllIIlIIII, lIIIlllIIlIIlI.length)) {
            void lIIIlllIIlIIIl;
            Bank.withdraw((int)lIIIlllIIlIIlI[lIIIlllIIlIIII], (int)lIIIlllIIlIIIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIllIl[1]);
            0;
            int[] nArray2 = new int[llIlIllIl[1]];
            nArray2[a.llIlIllIl[2]] = lIIIlllIIlIIlI[lIIIlllIIlIIII];
            if (a.lIllIlIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (3 >= 0) break;
                return;
            }
            ++lIIIlllIIlIIII;
            0;
            if (1 != 0) continue;
            return;
        }
    }

    private static boolean lIllIlIlllII(Object object) {
        return object != null;
    }

    public static void a(int[] nArray) {
        int[] lIIIlllIIlllIl;
        int lIIIlllIIlllII = llIlIllIl[2];
        while (a.lIllIlIllllI(lIIIlllIIlllII, lIIIlllIIlllIl.length)) {
            Bank.withdraw((int)lIIIlllIIlllIl[lIIIlllIIlllII], (int)llIlIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llIlIllIl[1]);
            0;
            ++lIIIlllIIlllII;
            0;
            if (((0xB ^ 0x54) & ~(0x7A ^ 0x25)) <= 0) continue;
            return;
        }
    }

    public static void a(BankLocation bankLocation) {
        if (a.lIllIlIllIII(Vars.getBit((int)llIlIllIl[0]), llIlIllIl[1]) && a.lIllIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIlIllIl[1]];
            stringArray[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[2]];
            g.a(stringArray);
        }
        WorldPoint lIIIlllIlIlIII = new WorldPoint(llIlIllIl[3], llIlIllIl[4], llIlIllIl[2]);
        WorldPoint lIIIlllIlIIlll = new WorldPoint(llIlIllIl[5], llIlIllIl[6], llIlIllIl[2]);
        WorldArea lIIIlllIlIIllI = new WorldArea(llIlIllIl[7], llIlIllIl[8], llIlIllIl[9], llIlIllIl[10], llIlIllIl[2]);
        if ((!a.lIllIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIlIlIII) ? 1 : 0) || !a.lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(lIIIlllIlIIlll), llIlIllIl[11]) || a.lIllIlIllIIl(lIIIlllIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIllIlIllIIl(Inventory.contains(item -> item.getName().contains(llIlIllII[llIlIllIl[39]])) ? 1 : 0) && a.lIllIlIllIII(Players.getLocal().getAnimation(), llIlIllIl[12])) {
            Inventory.getFirst(item -> item.getName().contains(llIlIllII[llIlIllIl[38]])).interact(llIlIllII[llIlIllIl[1]]);
            Time.sleepTicks((int)llIlIllIl[13]);
            0;
        }
        if (a.lIllIlIllIIl(Inventory.contains((int[])f.bm) ? 1 : 0) && a.lIllIlIllIlI(Equipment.contains((int[])f.bm) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bm).interact(llIlIllII[llIlIllIl[14]]);
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
        }
        if (a.lIllIlIllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && a.lIllIlIllIlI(Equipment.contains((int[])f.aV) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aV).interact(llIlIllII[llIlIllIl[15]]);
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
        }
        if (!a.lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(z), llIlIllIl[11]) || a.lIllIlIllIIl(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
            0;
            if (-(0xB ^ 0xF) >= 0) {
                return;
            }
        } else if (!a.lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(H), llIlIllIl[16]) || !a.lIllIlIllIlI(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIlIllIIl(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
            0;
            if (1 == -1) {
                return;
            }
        } else if (a.lIllIlIllIIl(G.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
            0;
            if (-1 >= 3) {
                return;
            }
        } else if (a.lIllIlIllIIl(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.K);
            0;
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
            0;
            if ((0xFA ^ 0x8B ^ (0xC2 ^ 0xB7)) == 0) {
                return;
            }
        } else {
            BankLocation lIIIlllIlIlIIl;
            WorldArea lIIIlllIlIIIll;
            WorldArea lIIIlllIlIIlIl = new WorldArea(llIlIllIl[17], llIlIllIl[18], llIlIllIl[13], llIlIllIl[19], llIlIllIl[2]);
            WorldArea lIIIlllIlIIlII = new WorldArea(llIlIllIl[20], llIlIllIl[21], llIlIllIl[22], llIlIllIl[23], llIlIllIl[2]);
            if ((!a.lIllIlIllIlI(lIIIlllIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIllIlIllIIl(lIIIlllIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIllIlIllIIl(Inventory.contains(item -> item.getName().contains(llIlIllII[llIlIllIl[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIlIllII[llIlIllIl[36]])).interact(llIlIllII[llIlIllIl[24]]);
                Time.sleepTicks((int)llIlIllIl[24]);
                0;
            }
            if (a.lIllIlIllIIl((lIIIlllIlIIIll = new WorldArea(llIlIllIl[25], llIlIllIl[26], llIlIllIl[27], llIlIllIl[13], llIlIllIl[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIllIl[1]];
                stringArray[a.llIlIllIl[2]] = llIlIllII[llIlIllIl[19]];
                TileObject lIIIlllIlIIIlI = TileObjects.getNearest((String[])stringArray);
                if (a.lIllIlIlllII(lIIIlllIlIIIlI)) {
                    lIIIlllIlIIIlI.interact(llIlIllII[llIlIllIl[13]]);
                    Time.sleepTicks((int)llIlIllIl[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)lIIIlllIlIlIIl);
            0;
            Time.sleepTicks((int)llIlIllIl[14]);
            0;
        }
    }

    private static boolean lIllIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static String lIllIlIlIIll(String lIIIlllIIIIlII, String lIIIlllIIIIIIl) {
        try {
            SecretKeySpec lIIIlllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllIl[29]), "DES");
            Cipher lIIIlllIIIIllI = Cipher.getInstance("DES");
            lIIIlllIIIIllI.init(llIlIllIl[14], lIIIlllIIIIlll);
            return new String(lIIIlllIIIIllI.doFinal(Base64.getDecoder().decode(lIIIlllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIIIIlIl) {
            lIIIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlII(String lIIIllIlllIlll, String lIIIllIlllIlII) {
        try {
            SecretKeySpec lIIIllIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIllIllllIIl = Cipher.getInstance("Blowfish");
            lIIIllIllllIIl.init(llIlIllIl[14], lIIIllIllllIlI);
            return new String(lIIIllIllllIIl.doFinal(Base64.getDecoder().decode(lIIIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIllllIII) {
            lIIIllIllllIII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlll() {
        llIlIllIl = new int[74];
        a.llIlIllIl[0] = 0xFFFF8A9D & 0x7DE2;
        a.llIlIllIl[1] = 1;
        a.llIlIllIl[2] = (96 + 11 - -47 + 97 ^ 61 + 108 - -20 + 2) & (50 + 56 - -13 + 109 ^ 13 + 19 - -91 + 37 ^ -1);
        a.llIlIllIl[3] = -(0xFFFFD2FB & 0x7D6F) & (0xFFFFFDFE & 0x5BFF);
        a.llIlIllIl[4] = -(0xFFFFFFDF & 0x2EA7) & (0xFFFFBFFF & Short.MAX_VALUE);
        a.llIlIllIl[5] = 0xFFFF9FFF & 0x6B88;
        a.llIlIllIl[6] = 0xFFFFDE9D & 0x37EF;
        a.llIlIllIl[7] = 0xFFFFBBFD & 0x4F7E;
        a.llIlIllIl[8] = 0xFFFFD7F5 & 0x3E8A;
        a.llIlIllIl[9] = 0x7C ^ 0x67;
        a.llIlIllIl[10] = 0x8A ^ 0x96;
        a.llIlIllIl[11] = 0x9D ^ 0x89;
        a.llIlIllIl[12] = -1;
        a.llIlIllIl[13] = 0x64 ^ 0x6B ^ (0xF ^ 6);
        a.llIlIllIl[14] = 2;
        a.llIlIllIl[15] = 3;
        a.llIlIllIl[16] = 0xA5 ^ 0x8D;
        a.llIlIllIl[17] = -(0xFFFFF3DD & 0x7DEB) & (0xFFFFFFFF & 0x7BF8);
        a.llIlIllIl[18] = 0xFFFFADD8 & 0x5F67;
        a.llIlIllIl[19] = 0x90 ^ 0xB8 ^ (0x12 ^ 0x3F);
        a.llIlIllIl[20] = 0xFFFFAF54 & 0x5AAF;
        a.llIlIllIl[21] = 0xFFFFAFFC & 0x5B2F;
        a.llIlIllIl[22] = 0 ^ 0xB;
        a.llIlIllIl[23] = 146 + 23 - 123 + 104 ^ 55 + 56 - -39 + 6;
        a.llIlIllIl[24] = 0x62 ^ 0x66;
        a.llIlIllIl[25] = 0xFFFF8F7F & 0x7CCF;
        a.llIlIllIl[26] = 0xFFFFAFF3 & 0x5F5D;
        a.llIlIllIl[27] = 0x1A ^ 6 ^ (1 ^ 0x1A);
        a.llIlIllIl[28] = 0x66 ^ 0x53 ^ (0x2D ^ 6);
        a.llIlIllIl[29] = 0x4F ^ 0x34 ^ (0x5C ^ 0x2F);
        a.llIlIllIl[30] = -(0xFFFFDBF7 & 0x741F) & (0xFFFFDFB7 & 0x7FFE);
        a.llIlIllIl[31] = 0x78 ^ 0x69 ^ (0x4D ^ 0x55);
        a.llIlIllIl[32] = 0xB ^ 0x2C ^ (0xC ^ 0x27);
        a.llIlIllIl[33] = 0x69 ^ 0x64;
        a.llIlIllIl[34] = 0x27 ^ 0x29;
        a.llIlIllIl[35] = 0x46 ^ 0x49;
        a.llIlIllIl[36] = 0x5B ^ 0xF ^ (0x34 ^ 0x70);
        a.llIlIllIl[37] = 0xAE ^ 0xBF;
        a.llIlIllIl[38] = 0x87 ^ 0xB7 ^ (0x5A ^ 0x78);
        a.llIlIllIl[39] = 0xA9 ^ 0xBA;
        a.llIlIllIl[40] = 0xFFFFEE57 & 0x1DEF;
        a.llIlIllIl[41] = 0xFFFFEFDF & 0x1DB1;
        a.llIlIllIl[42] = 0x38 ^ 0x42 ^ (0x34 ^ 0x67);
        a.llIlIllIl[43] = 0xE9 ^ 0x99 ^ (0xB ^ 0x5C);
        a.llIlIllIl[44] = -(0xFFFFFD7A & 0x43F7) & (0xFFFFFDF7 & 0x4FFD);
        a.llIlIllIl[45] = -(0xFFFFFF7F & 0x50C3) & (0xFFFFDDFF & 0x7F67);
        a.llIlIllIl[46] = -(0xFFFFCDAD & 0x76F7) & (0xFFFFCFFF & Short.MAX_VALUE);
        a.llIlIllIl[47] = -(0xFFFF9F65 & 0x73DF) & (0xFFFFBFCF & 0x5FFE);
        a.llIlIllIl[48] = 0xF0 ^ 0x99;
        a.llIlIllIl[49] = -(0xFFFFA19E & 0x7F65) & (0xFFFFED7F & 0x3FFF);
        a.llIlIllIl[50] = 0xFFFFEDF7 & 0x1F2E;
        a.llIlIllIl[51] = 0x11 ^ 0x32;
        a.llIlIllIl[52] = 0xFD ^ 0xBC ^ (0xE5 ^ 0x9E);
        a.llIlIllIl[53] = 0xFFFFBDBF & 0x4E75;
        a.llIlIllIl[54] = 0xFFFFFFAF & 0xE73;
        a.llIlIllIl[55] = 0xFFFFFF1E & 0xEFF;
        a.llIlIllIl[56] = 0xFFFFAFDF & 0x5D7A;
        a.llIlIllIl[57] = 0x2D ^ 0x71;
        a.llIlIllIl[58] = 51 + 29 - 30 + 124 ^ 35 + 93 - 126 + 137;
        a.llIlIllIl[59] = 0xFFFFDC7B & 0x2FBE;
        a.llIlIllIl[60] = -(0xFFFF90DF & 0x7F27) & (0xFFFF9DF7 & 0x7F7F);
        a.llIlIllIl[61] = 107 + 16 - 77 + 92 ^ 77 + 102 - 173 + 181;
        a.llIlIllIl[62] = 0x1F ^ 0x19 ^ (0xC3 ^ 0x81);
        a.llIlIllIl[63] = 0xFFFF96FE & 0x6F5F;
        a.llIlIllIl[64] = 0xFFFF8FF7 & 0x7F68;
        a.llIlIllIl[65] = 0xFFFFDCEF & 0x2FFD;
        a.llIlIllIl[66] = 0x8E ^ 0xA3;
        a.llIlIllIl[67] = 0x39 ^ 0x1D;
        a.llIlIllIl[68] = -(0xFFFFFBEB & 0x6455) & (0xFFFFEFDF & 0x7BFF);
        a.llIlIllIl[69] = -(0xFFFFFB67 & 0x75DA) & (0xFFFFFDFF & 0x7FEB);
        a.llIlIllIl[70] = 0xFFFFC6BE & 0x3FFB;
        a.llIlIllIl[71] = -(0xFFFFD537 & 0x7ADF) & (0xFFFFDDDF & 0x7FBF);
        a.llIlIllIl[72] = -(0xFFFFF474 & 0x5F9F) & (0xFFFFFFFF & 0x5FF7);
        a.llIlIllIl[73] = -(0xFFFFBD2D & 0x6ED3) & (0xFFFFFFFD & 0x3F6F);
    }

    static {
        a.lIllIlIlIlll();
        a.lIllIlIlIllI();
        y = new WorldArea(llIlIllIl[40], llIlIllIl[41], llIlIllIl[42], llIlIllIl[43], llIlIllIl[2]);
        z = new WorldPoint(llIlIllIl[44], llIlIllIl[45], llIlIllIl[2]);
        A = new WorldArea(llIlIllIl[46], llIlIllIl[47], llIlIllIl[48], llIlIllIl[48], llIlIllIl[2]);
        B = new WorldArea(llIlIllIl[49], llIlIllIl[50], llIlIllIl[51], llIlIllIl[52], llIlIllIl[2]);
        C = new WorldArea(llIlIllIl[53], llIlIllIl[54], llIlIllIl[38], llIlIllIl[11], llIlIllIl[2]);
        D = new WorldArea(llIlIllIl[55], llIlIllIl[56], llIlIllIl[57], llIlIllIl[58], llIlIllIl[2]);
        E = new WorldArea(llIlIllIl[59], llIlIllIl[60], llIlIllIl[61], llIlIllIl[62], llIlIllIl[2]);
        F = new WorldArea(llIlIllIl[63], llIlIllIl[64], llIlIllIl[35], llIlIllIl[36], llIlIllIl[2]);
        G = new WorldArea(llIlIllIl[7], llIlIllIl[65], llIlIllIl[66], llIlIllIl[67], llIlIllIl[2]);
        H = new WorldPoint(llIlIllIl[68], llIlIllIl[69], llIlIllIl[2]);
        I = new WorldPoint(llIlIllIl[70], llIlIllIl[71], llIlIllIl[2]);
        J = new WorldPoint(llIlIllIl[72], llIlIllIl[73], llIlIllIl[1]);
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)llIlIllIl[1]);
        0;
    }
}

