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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
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
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea D;
    public static /* synthetic */ WorldPoint G;
    private static /* synthetic */ int[] lIIIlIIllI;
    public static final /* synthetic */ WorldArea E;
    private static /* synthetic */ String[] lIIIlIIlIl;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldPoint y;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea z;
    static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldArea x;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea F;

    private static boolean lllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllIlIIlIlll(int n2) {
        return n2 != 0;
    }

    public static void a(BankLocation bankLocation) {
        if (a.lllIlIIlIllI(Vars.getBit((int)lIIIlIIllI[0]), lIIIlIIllI[1]) && a.lllIlIIlIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlIIllI[1]];
            stringArray[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[2]];
            g.a(stringArray);
        }
        WorldPoint lIllIIIIlIII = new WorldPoint(lIIIlIIllI[3], lIIIlIIllI[4], lIIIlIIllI[2]);
        WorldPoint lIllIIIIIlll = new WorldPoint(lIIIlIIllI[5], lIIIlIIllI[6], lIIIlIIllI[2]);
        WorldArea lIllIIIIIllI = new WorldArea(lIIIlIIllI[7], lIIIlIIllI[8], lIIIlIIllI[9], lIIIlIIllI[10], lIIIlIIllI[2]);
        if ((!a.lllIlIIllIII(Players.getLocal().getWorldLocation().equals((Object)lIllIIIIlIII) ? 1 : 0) || !a.lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(lIllIIIIIlll), lIIIlIIllI[11]) || a.lllIlIIlIlll(lIllIIIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lllIlIIlIlll(Inventory.contains(item -> item.getName().contains(lIIIlIIlIl[lIIIlIIllI[39]])) ? 1 : 0) && a.lllIlIIlIllI(Players.getLocal().getAnimation(), lIIIlIIllI[12])) {
            Inventory.getFirst(item -> item.getName().contains(lIIIlIIlIl[lIIIlIIllI[38]])).interact(lIIIlIIlIl[lIIIlIIllI[1]]);
            Time.sleepTicks((int)lIIIlIIllI[13]);
            0;
        }
        if (a.lllIlIIlIlll(Inventory.contains((int[])f.bf) ? 1 : 0) && a.lllIlIIllIII(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIlIIlIl[lIIIlIIllI[14]]);
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
        }
        if (a.lllIlIIlIlll(Inventory.contains((int[])f.aO) ? 1 : 0) && a.lllIlIIllIII(Equipment.contains((int[])f.aO) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aO).interact(lIIIlIIlIl[lIIIlIIllI[15]]);
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
        }
        if (!a.lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(y), lIIIlIIllI[11]) || a.lllIlIIlIlll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
            0;
            if (2 < ((66 + 63 - 91 + 112 ^ 103 + 102 - 113 + 106) & (82 + 87 - 60 + 88 ^ 41 + 38 - -70 + 0 ^ -1))) {
                return;
            }
        } else if (!a.lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(G), lIIIlIIllI[16]) || !a.lllIlIIllIII(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIlIIlIlll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
            0;
            if (((8 ^ 7) & ~(0x60 ^ 0x6F)) >= 1) {
                return;
            }
        } else if (a.lllIlIIlIlll(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
            0;
            if ((163 + 3 - 22 + 44 ^ 171 + 142 - 285 + 156) < 1) {
                return;
            }
        } else if (a.lllIlIIlIlll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.J);
            0;
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
            0;
            if (null != null) {
                return;
            }
        } else {
            BankLocation lIllIIIIlIIl;
            WorldArea lIllIIIIIIll;
            WorldArea lIllIIIIIlIl = new WorldArea(lIIIlIIllI[17], lIIIlIIllI[18], lIIIlIIllI[13], lIIIlIIllI[19], lIIIlIIllI[2]);
            WorldArea lIllIIIIIlII = new WorldArea(lIIIlIIllI[20], lIIIlIIllI[21], lIIIlIIllI[22], lIIIlIIllI[23], lIIIlIIllI[2]);
            if ((!a.lllIlIIllIII(lIllIIIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIlIIlIlll(lIllIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lllIlIIlIlll(Inventory.contains(item -> item.getName().contains(lIIIlIIlIl[lIIIlIIllI[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIIIlIIlIl[lIIIlIIllI[36]])).interact(lIIIlIIlIl[lIIIlIIllI[24]]);
                Time.sleepTicks((int)lIIIlIIllI[24]);
                0;
            }
            if (a.lllIlIIlIlll((lIllIIIIIIll = new WorldArea(lIIIlIIllI[25], lIIIlIIllI[26], lIIIlIIllI[27], lIIIlIIllI[13], lIIIlIIllI[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIllI[1]];
                stringArray[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[19]];
                TileObject lIllIIIIIIlI = TileObjects.getNearest((String[])stringArray);
                if (a.lllIlIIllIlI(lIllIIIIIIlI)) {
                    lIllIIIIIIlI.interact(lIIIlIIlIl[lIIIlIIllI[13]]);
                    Time.sleepTicks((int)lIIIlIIllI[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)lIllIIIIlIIl);
            0;
            Time.sleepTicks((int)lIIIlIIllI[14]);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lIlIlllllIII;
        int lIlIllllIllI = lIIIlIIllI[2];
        while (a.lllIlIIlllII(lIlIllllIllI, lIlIlllllIII.length)) {
            void lIlIllllIlll;
            Bank.withdraw((int)lIlIlllllIII[lIlIllllIllI], (int)lIlIllllIlll, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIIllI[1]);
            0;
            ++lIlIllllIllI;
            0;
            if (-(0x35 ^ 0x4D ^ (0xF ^ 0x72)) < 0) continue;
            return;
        }
    }

    private static String lllIlIIlIIll(String lIlIlllIIlII, String lIlIlllIIIll) {
        try {
            SecretKeySpec lIlIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllI[29]), "DES");
            Cipher lIlIlllIIllI = Cipher.getInstance("DES");
            lIlIlllIIllI.init(lIIIlIIllI[14], lIlIlllIIlll);
            return new String(lIlIlllIIllI.doFinal(Base64.getDecoder().decode(lIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIIlIl) {
            lIlIlllIIlIl.printStackTrace();
            return null;
        }
    }

    public static void a(int[] nArray) {
        int[] lIlIllllllIl;
        int lIlIllllllII = lIIIlIIllI[2];
        while (a.lllIlIIlllII(lIlIllllllII, lIlIllllllIl.length)) {
            Bank.withdraw((int)lIlIllllllIl[lIlIllllllII], (int)lIIIlIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIIllI[1]);
            0;
            ++lIlIllllllII;
            0;
            if (2 != 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lIlIllllIIlI;
        int lIlIllllIIII = lIIIlIIllI[2];
        while (a.lllIlIIlllII(lIlIllllIIII, lIlIllllIIlI.length)) {
            void lIlIllllIIIl;
            Bank.withdraw((int)lIlIllllIIlI[lIlIllllIIII], (int)lIlIllllIIIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIIllI[1]);
            0;
            int[] nArray2 = new int[lIIIlIIllI[1]];
            nArray2[a.lIIIlIIllI[2]] = lIlIllllIIlI[lIlIllllIIII];
            if (a.lllIlIIlIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if ((0x4D ^ 0x49) > ((0xCF ^ 0x9B) & ~(0xC2 ^ 0x96))) break;
                return;
            }
            ++lIlIllllIIII;
            0;
            if (null == null) continue;
            return;
        }
    }

    private static void lllIlIIlIlII() {
        lIIIlIIlIl = new String[lIIIlIIllI[11]];
        a.lIIIlIIlIl[a.lIIIlIIllI[2]] = a."Yes";
        a.lIIIlIIlIl[a.lIIIlIIllI[1]] = a."Break";
        a.lIIIlIIlIl[a.lIIIlIIllI[14]] = a."Wear";
        a.lIIIlIIlIl[a.lIIIlIIllI[15]] = a."Wear";
        a.lIIIlIIlIl[a.lIIIlIIllI[24]] = a."Break";
        a.lIIIlIIlIl[a.lIIIlIIllI[19]] = a."Lever";
        a.lIIIlIIlIl[a.lIIIlIIllI[13]] = a."Pull";
        a.lIIIlIIlIl[a.lIIIlIIllI[27]] = a."Emerald Benedict";
        a.lIIIlIIlIl[a.lIIIlIIllI[29]] = a."Bank";
        a.lIIIlIIlIl[a.lIIIlIIllI[31]] = a."Bank chest";
        a.lIIIlIIlIl[a.lIIIlIIllI[23]] = a."Use";
        a.lIIIlIIlIl[a.lIIIlIIllI[22]] = a."Use";
        a.lIIIlIIlIl[a.lIIIlIIllI[32]] = a."Bank";
        a.lIIIlIIlIl[a.lIIIlIIllI[33]] = a."Bank";
        a.lIIIlIIlIl[a.lIIIlIIllI[34]] = a."Bank booth";
        a.lIIIlIIlIl[a.lIIIlIIllI[35]] = a."Bank";
        a.lIIIlIIlIl[a.lIIIlIIllI[36]] = a."teleport";
        a.lIIIlIIlIl[a.lIIIlIIllI[37]] = a."teleport";
        a.lIIIlIIlIl[a.lIIIlIIllI[38]] = a."teleport";
        a.lIIIlIIlIl[a.lIIIlIIllI[39]] = a."teleport";
    }

    private static boolean lllIlIIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lIlIlllIllIl;
        int[] nArray = new int[lIIIlIIllI[1]];
        nArray[a.lIIIlIIllI[2]] = n2;
        if (a.lllIlIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[lIIIlIIllI[1]];
        nArray2[a.lIIIlIIllI[2]] = lIlIlllIllIl;
        if (a.lllIlIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lIlIlllIllII;
            Bank.withdraw((int)lIlIlllIllIl, (int)lIlIlllIllII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIIlIIllI[1]);
            0;
        }
    }

    public static void a() {
        if (a.lllIlIIllIll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIllI[28])) {
            String[] stringArray = new String[lIIIlIIllI[1]];
            stringArray[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[27]];
            NPCs.getNearest((String[])stringArray).interact(lIIIlIIlIl[lIIIlIIllI[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIllI[30]);
            0;
        }
        if (!a.lllIlIIllIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lllIlIIlIlll(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIIIlIIllI[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIllI[30]);
            0;
            0;
            if (1 > 1) {
                return;
            }
        } else if (!(a.lllIlIIllIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIlIIllIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIlIIllIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIlIIllIII(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIlIIllIII(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lllIlIIllIll(Players.getLocal().getWorldLocation().distanceTo(H), lIIIlIIllI[11]))) {
            String[] stringArray = new String[lIIIlIIllI[1]];
            stringArray[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[31]];
            TileObject lIllIIIIIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lllIlIIllIlI(lIllIIIIIIII)) {
                String[] stringArray2 = new String[lIIIlIIllI[1]];
                stringArray2[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[23]];
                if (a.lllIlIIlIlll(lIllIIIIIIII.hasAction(stringArray2) ? 1 : 0)) {
                    lIllIIIIIIII.interact(lIIIlIIlIl[lIIIlIIllI[22]]);
                    Time.sleepTicks((int)lIIIlIIllI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIllI[30]);
                    0;
                }
                String[] stringArray3 = new String[lIIIlIIllI[1]];
                stringArray3[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[32]];
                if (a.lllIlIIlIlll(lIllIIIIIIII.hasAction(stringArray3) ? 1 : 0)) {
                    lIllIIIIIIII.interact(lIIIlIIlIl[lIIIlIIllI[33]]);
                    Time.sleepTicks((int)lIIIlIIllI[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIllI[30]);
                    0;
                }
            }
            0;
            if (1 < 1) {
                return;
            }
        } else if (a.lllIlIIllIII(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIllI[28])) {
            String[] stringArray = new String[lIIIlIIllI[1]];
            stringArray[a.lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[34]];
            TileObject lIllIIIIIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lllIlIIllIlI(lIllIIIIIIII)) {
                lIllIIIIIIII.interact(lIIIlIIlIl[lIIIlIIllI[35]]);
                Time.sleepTicks((int)lIIIlIIllI[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIllI[30]);
                0;
            }
        }
    }

    private static boolean lllIlIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIlIIlIIII(String lIlIllIlIlIl, String lIlIllIlIlII) {
        try {
            SecretKeySpec lIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIllIIl = Cipher.getInstance("Blowfish");
            lIlIllIllIIl.init(lIIIlIIllI[14], lIlIllIllIlI);
            return new String(lIlIllIllIIl.doFinal(Base64.getDecoder().decode(lIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIllIII) {
            lIlIllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        a.lllIlIIlIlIl();
        a.lllIlIIlIlII();
        x = new WorldArea(lIIIlIIllI[40], lIIIlIIllI[41], lIIIlIIllI[42], lIIIlIIllI[43], lIIIlIIllI[2]);
        y = new WorldPoint(lIIIlIIllI[44], lIIIlIIllI[45], lIIIlIIllI[2]);
        z = new WorldArea(lIIIlIIllI[46], lIIIlIIllI[47], lIIIlIIllI[48], lIIIlIIllI[48], lIIIlIIllI[2]);
        A = new WorldArea(lIIIlIIllI[49], lIIIlIIllI[50], lIIIlIIllI[51], lIIIlIIllI[52], lIIIlIIllI[2]);
        B = new WorldArea(lIIIlIIllI[53], lIIIlIIllI[54], lIIIlIIllI[38], lIIIlIIllI[11], lIIIlIIllI[2]);
        C = new WorldArea(lIIIlIIllI[55], lIIIlIIllI[56], lIIIlIIllI[57], lIIIlIIllI[58], lIIIlIIllI[2]);
        D = new WorldArea(lIIIlIIllI[59], lIIIlIIllI[60], lIIIlIIllI[61], lIIIlIIllI[62], lIIIlIIllI[2]);
        E = new WorldArea(lIIIlIIllI[63], lIIIlIIllI[64], lIIIlIIllI[35], lIIIlIIllI[36], lIIIlIIllI[2]);
        F = new WorldArea(lIIIlIIllI[7], lIIIlIIllI[65], lIIIlIIllI[66], lIIIlIIllI[67], lIIIlIIllI[2]);
        G = new WorldPoint(lIIIlIIllI[68], lIIIlIIllI[69], lIIIlIIllI[2]);
        H = new WorldPoint(lIIIlIIllI[70], lIIIlIIllI[71], lIIIlIIllI[2]);
        I = new WorldPoint(lIIIlIIllI[72], lIIIlIIllI[73], lIIIlIIllI[1]);
    }

    private static boolean lllIlIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIIIlIIllI[1]);
        0;
    }

    private static boolean lllIlIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIIlIIlI(String lIlIllIIIIlI, String lIlIllIIIllI) {
        lIlIllIIIIlI = new String(Base64.getDecoder().decode(lIlIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIlIl = new StringBuilder();
        char[] lIlIllIIIlII = lIlIllIIIllI.toCharArray();
        int lIlIllIIIIll = lIIIlIIllI[2];
        char[] lIlIlIllllIl = lIlIllIIIIlI.toCharArray();
        int lIlIlIllllII = lIlIlIllllIl.length;
        int lIlIlIlllIll = lIIIlIIllI[2];
        while (a.lllIlIIlllII(lIlIlIlllIll, lIlIlIllllII)) {
            char lIlIllIIlIII = lIlIlIllllIl[lIlIlIlllIll];
            lIlIllIIIlIl.append((char)(lIlIllIIlIII ^ lIlIllIIIlII[lIlIllIIIIll % lIlIllIIIlII.length]));
            0;
            ++lIlIllIIIIll;
            ++lIlIlIlllIll;
            0;
            if (2 > ((51 + 6 - -42 + 50 ^ 103 + 112 - 51 + 7) & (0x72 ^ 1 ^ (0x58 ^ 0x15) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lIlIllIIIlIl);
    }

    private static void lllIlIIlIlIl() {
        lIIIlIIllI = new int[74];
        a.lIIIlIIllI[0] = -(0xFFFFFF3F & 0x74FF) & (0xFFFFFEFF & 0x7DBE);
        a.lIIIlIIllI[1] = 1;
        a.lIIIlIIllI[2] = (0x4D ^ 0x6F) & ~(0x1D ^ 0x3F);
        a.lIIIlIIllI[3] = 0xFFFFFBDE & 0xDB5;
        a.lIIIlIIllI[4] = 0xFFFF9979 & 0x77FF;
        a.lIIIlIIllI[5] = -(0xFFFFFD6B & 0x56DC) & (0xFFFFFFDF & 0x5FEF);
        a.lIIIlIIllI[6] = -(0xFFFFFFFF & 0x4851) & (0xFFFFDFFD & 0x7EDF);
        a.lIIIlIIllI[7] = -(0xFFFFF595 & 0x1EEB) & (0xFFFF9FFF & 0x7FFC);
        a.lIIIlIIllI[8] = -(0xFFFFF3EE & 0x6C57) & (0xFFFFF6DD & 0x7FE7);
        a.lIIIlIIllI[9] = 0x4E ^ 0x55;
        a.lIIIlIIllI[10] = 0x6B ^ 0x77;
        a.lIIIlIIllI[11] = 0x76 ^ 0x62;
        a.lIIIlIIllI[12] = -1;
        a.lIIIlIIllI[13] = 0x1C ^ 0x1A;
        a.lIIIlIIllI[14] = 2;
        a.lIIIlIIllI[15] = 3;
        a.lIIIlIIllI[16] = 0x2C ^ 2 ^ (0x7C ^ 0x7A);
        a.lIIIlIIllI[17] = 0xFFFF8AF2 & 0x7F3D;
        a.lIIIlIIllI[18] = 0xFFFFBFF3 & 0x4D4C;
        a.lIIIlIIllI[19] = 0x3B ^ 0x3E;
        a.lIIIlIIllI[20] = -(0xFFFFA7FA & 0x7DBF) & (0xFFFFAFBF & 0x7FFD);
        a.lIIIlIIllI[21] = -(0xFFFFC22B & 0x7DD6) & (0xFFFFEF3F & 0x5BED);
        a.lIIIlIIllI[22] = 135 + 102 - 226 + 150 ^ 133 + 53 - 124 + 108;
        a.lIIIlIIllI[23] = 0x85 ^ 0x8F;
        a.lIIIlIIllI[24] = 108 + 130 - 178 + 88 ^ 79 + 72 - 126 + 119;
        a.lIIIlIIllI[25] = -(0xFFFFD7FB & 0x6BB5) & (0xFFFFFFFF & 0x4FFF);
        a.lIIIlIIllI[26] = -(0xFFFFFAF7 & 0x550B) & (0xFFFFDF57 & 0x7FFB);
        a.lIIIlIIllI[27] = 133 + 63 - 84 + 47 ^ 125 + 78 - 91 + 40;
        a.lIIIlIIllI[28] = 1 ^ 0x1F;
        a.lIIIlIIllI[29] = 17 + 8 - -113 + 69 ^ 3 + 22 - -104 + 70;
        a.lIIIlIIllI[30] = -(0x71 ^ 0x66) & (0xFFFFCFBF & 0x3FF6);
        a.lIIIlIIllI[31] = 0xA8 ^ 0xB6 ^ (0x9B ^ 0x8C);
        a.lIIIlIIllI[32] = 0x3D ^ 0x20 ^ (0xD3 ^ 0xC2);
        a.lIIIlIIllI[33] = 113 + 118 - 95 + 18 ^ 105 + 49 - 42 + 39;
        a.lIIIlIIllI[34] = 0x5D ^ 0x53;
        a.lIIIlIIllI[35] = 0xF1 ^ 0xAB ^ (0x7F ^ 0x2A);
        a.lIIIlIIllI[36] = 0x30 ^ 0x20;
        a.lIIIlIIllI[37] = 0x34 ^ 0x25;
        a.lIIIlIIllI[38] = 0xA9 ^ 0xC7 ^ (0xF4 ^ 0x88);
        a.lIIIlIIllI[39] = 114 + 58 - 154 + 129 ^ 52 + 28 - 37 + 85;
        a.lIIIlIIllI[40] = -(69 + 77 - 81 + 72) & (0xFFFFCFEF & 0x3CDF);
        a.lIIIlIIllI[41] = 0xFFFFAFB1 & 0x5DDF;
        a.lIIIlIIllI[42] = 43 + 92 - 25 + 51 ^ 82 + 130 - 188 + 112;
        a.lIIIlIIllI[43] = 0x24 ^ 3;
        a.lIIIlIIllI[44] = -(0xFFFFB543 & 0x7BBF) & (0xFFFFFFB6 & 0x3DCF);
        a.lIIIlIIllI[45] = 0xFFFFAD27 & 0x5FFD;
        a.lIIIlIIllI[46] = -(0xFFFFF0B3 & 0x3F4D) & (0xFFFFBB5F & 0x7FFB);
        a.lIIIlIIllI[47] = 0xFFFFCD9F & 0x3EEA;
        a.lIIIlIIllI[48] = 0x46 ^ 0x6A ^ (0x2E ^ 0x6B);
        a.lIIIlIIllI[49] = -(0xFFFFFBE7 & 0x7519) & (0xFFFFFF7E & 0x7DFD);
        a.lIIIlIIllI[50] = 0xFFFFFFE7 & 0xD3E;
        a.lIIIlIIllI[51] = 0x3E ^ 0x1D;
        a.lIIIlIIllI[52] = 0x75 ^ 0x2D ^ (0xA7 ^ 0xC5);
        a.lIIIlIIllI[53] = 0xFFFFAC75 & 0x5FBF;
        a.lIIIlIIllI[54] = -(0x98 ^ 0x9D) & (0xFFFF9EFF & 0x6F27);
        a.lIIIlIIllI[55] = 0xFFFFAFDE & 0x5E3F;
        a.lIIIlIIllI[56] = 0xFFFFCF7F & 0x3DDA;
        a.lIIIlIIllI[57] = 195 + 32 - 83 + 109 ^ 126 + 158 - 185 + 62;
        a.lIIIlIIllI[58] = 0x63 ^ 0x46;
        a.lIIIlIIllI[59] = -(0xFFFF91E6 & 0x7E9F) & (0xFFFFBDFF & 0x5EBF);
        a.lIIIlIIllI[60] = 0xFFFF9DF9 & 0x6F77;
        a.lIIIlIIllI[61] = 0x37 ^ 0x78 ^ (0xC0 ^ 0xBE);
        a.lIIIlIIllI[62] = 105 + 44 - 111 + 159 ^ 46 + 43 - 66 + 106;
        a.lIIIlIIllI[63] = 0xFFFFEEFF & 0x175E;
        a.lIIIlIIllI[64] = -(0xFFFF902E & 0x7FD3) & (0xFFFFFF71 & 0x1FEF);
        a.lIIIlIIllI[65] = -(0xFFFFF239 & 0x3FD7) & (0xFFFFBFFD & 0x7EFF);
        a.lIIIlIIllI[66] = 1 + 32 - -13 + 102 ^ 182 + 145 - 163 + 21;
        a.lIIIlIIllI[67] = 0x20 ^ 0x64 ^ (0x4F ^ 0x2F);
        a.lIIIlIIllI[68] = -(0xFFFF94F7 & 0x7B69) & (0xFFFFFBFF & 0x1FFF);
        a.lIIIlIIllI[69] = -(0xFFFFA7DF & 0x7B36) & (0xFFFFBFFF & 0x6FBF);
        a.lIIIlIIllI[70] = -(0xFFFF8FF6 & 0x794F) & (0xFFFF8FFF & Short.MAX_VALUE);
        a.lIIIlIIllI[71] = -(0xFFFFD87F & 0x77E5) & (0xFFFFFFEF & 0x5DFD);
        a.lIIIlIIllI[72] = 0xFFFFEBF7 & 0x1FEC;
        a.lIIIlIIllI[73] = -(0xFFFFECDF & 0x5FB1) & (0xFFFFFFFF & 0x5FFD);
    }
}

