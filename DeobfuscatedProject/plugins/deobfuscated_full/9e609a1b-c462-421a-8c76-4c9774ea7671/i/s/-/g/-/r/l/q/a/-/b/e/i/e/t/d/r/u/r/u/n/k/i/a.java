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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.K;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
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
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea A;
    static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea w;
    public static final /* synthetic */ WorldPoint x;
    private static /* synthetic */ String[] lIIIlllllllll;
    public static /* synthetic */ WorldPoint F;
    private static /* synthetic */ int[] lIIlIIIIIIIII;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea y;

    private static void lIlIIllIllIlIll() {
        lIIIlllllllll = new String[lIIlIIIIIIIII[11]];
        a.lIIIlllllllll[a.lIIlIIIIIIIII[2]] = a."Yes";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[1]] = a."Break";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[14]] = a."Wear";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[15]] = a."Wear";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[24]] = a."Break";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[19]] = a."Lever";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[13]] = a."Pull";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[27]] = a."Emerald Benedict";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[29]] = a."Bank";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[31]] = a."Bank chest";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[23]] = a."Use";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[22]] = a."Use";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[32]] = a."Bank";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[33]] = a."Bank";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[34]] = a."Bank booth";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[35]] = a."Bank";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[36]] = a."teleport";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[37]] = a."teleport";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[38]] = a."teleport";
        a.lIIIlllllllll[a.lIIlIIIIIIIII[39]] = a."teleport";
    }

    public static void a(BankLocation bankLocation) {
        if (a.lIlIIllIllIllIl(Vars.getBit((int)lIIlIIIIIIIII[0]), lIIlIIIIIIIII[1]) && a.lIlIIllIllIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIIIIIIII[1]];
            stringArray[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[2]];
            g.a(stringArray);
        }
        WorldPoint var21 = new WorldPoint(lIIlIIIIIIIII[3], lIIlIIIIIIIII[4], lIIlIIIIIIIII[2]);
        WorldPoint var4 = new WorldPoint(lIIlIIIIIIIII[5], lIIlIIIIIIIII[6], lIIlIIIIIIIII[2]);
        WorldArea var34 = new WorldArea(lIIlIIIIIIIII[7], lIIlIIIIIIIII[8], lIIlIIIIIIIII[9], lIIlIIIIIIIII[10], lIIlIIIIIIIII[2]);
        if ((!a.lIlIIllIllIllll(Players.getLocal().getWorldLocation().equals((Object)var21) ? 1 : 0) || !a.lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(var4), lIIlIIIIIIIII[11]) || a.lIlIIllIllIlllI(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIlIIllIllIlllI(Inventory.contains(item -> item.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[39]])) ? 1 : 0) && a.lIlIIllIllIllIl(Players.getLocal().getAnimation(), lIIlIIIIIIIII[12])) {
            Inventory.getFirst(item -> item.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[38]])).interact(lIIIlllllllll[lIIlIIIIIIIII[1]]);
            Time.sleepTicks((int)lIIlIIIIIIIII[13]);
            0;
        }
        if (a.lIlIIllIllIlllI(Inventory.contains((int[])f.bk) ? 1 : 0) && a.lIlIIllIllIllll(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(lIIIlllllllll[lIIlIIIIIIIII[14]]);
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
        }
        if (a.lIlIIllIllIlllI(Inventory.contains((int[])f.aT) ? 1 : 0) && a.lIlIIllIllIllll(Equipment.contains((int[])f.aT) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aT).interact(lIIIlllllllll[lIIlIIIIIIIII[15]]);
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
        }
        if (!a.lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(x), lIIlIIIIIIIII[11]) || a.lIlIIllIllIlllI(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
            0;
            
            }
        } else if (!a.lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(F), lIIlIIIIIIIII[16]) || !a.lIlIIllIllIllll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !a.lIlIIllIllIllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(K.hT), lIIlIIIIIIIII[16])) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            0;
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
            0;
            if ((0x46 ^ 0x43) <= 0) {
                return;
            }
        } else if (a.lIlIIllIllIlllI(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            0;
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
            0;
            if ((44 + 26 - -107 + 5 ^ 41 + 29 - -31 + 77) < (116 + 141 - 139 + 26 ^ 111 + 125 - 94 + 6)) {
                return;
            }
        } else if (a.lIlIIllIllIlllI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.I);
            0;
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
            0;
            if ((0x77 ^ 0x72) == 0) {
                return;
            }
        } else {
            BankLocation var12;
            WorldArea var37;
            WorldArea var9 = new WorldArea(lIIlIIIIIIIII[17], lIIlIIIIIIIII[18], lIIlIIIIIIIII[13], lIIlIIIIIIIII[19], lIIlIIIIIIIII[2]);
            WorldArea var1 = new WorldArea(lIIlIIIIIIIII[20], lIIlIIIIIIIII[21], lIIlIIIIIIIII[22], lIIlIIIIIIIII[23], lIIlIIIIIIIII[2]);
            if ((!a.lIlIIllIllIllll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIIllIllIlllI(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.lIlIIllIllIlllI(Inventory.contains(item -> item.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[36]])).interact(lIIIlllllllll[lIIlIIIIIIIII[24]]);
                Time.sleepTicks((int)lIIlIIIIIIIII[24]);
                0;
            }
            if (a.lIlIIllIllIlllI((var37 = new WorldArea(lIIlIIIIIIIII[25], lIIlIIIIIIIII[26], lIIlIIIIIIIII[27], lIIlIIIIIIIII[13], lIIlIIIIIIIII[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIIIIIIIII[1]];
                stringArray[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[19]];
                TileObject var31 = TileObjects.getNearest((String[])stringArray);
                if (a.lIlIIllIlllIIlI(var31)) {
                    var31.interact(lIIIlllllllll[lIIlIIIIIIIII[13]]);
                    Time.sleepTicks((int)lIIlIIIIIIIII[24]);
                    0;
                }
            }
            Movement.walkTo((BankLocation)var12);
            0;
            Time.sleepTicks((int)lIIlIIIIIIIII[14]);
            0;
        }
    }

    private static boolean lIlIIllIlllIIII(int n2, int n3) {
        return n2 > n3;
    }

    public static void a() {
        if (a.lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(H), lIIlIIIIIIIII[28])) {
            String[] stringArray = new String[lIIlIIIIIIIII[1]];
            stringArray[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[27]];
            NPCs.getNearest((String[])stringArray).interact(lIIIlllllllll[lIIlIIIIIIIII[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIII[30]);
            0;
        }
        if (!a.lIlIIllIllIllll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.lIlIIllIllIlllI(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)lIIlIIIIIIIII[15]);
            0;
            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIII[30]);
            0;
            0;
            if ((0x36 ^ 0x32) == -1) {
                return;
            }
        } else if (!(a.lIlIIllIllIllll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIIllIllIllll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIIllIllIllll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIIllIllIllll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIIllIllIllll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(G), lIIlIIIIIIIII[11]))) {
            String[] stringArray = new String[lIIlIIIIIIIII[1]];
            stringArray[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[31]];
            TileObject var22 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIlIIllIlllIIlI(var22)) {
                String[] stringArray2 = new String[lIIlIIIIIIIII[1]];
                stringArray2[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[23]];
                if (a.lIlIIllIllIlllI(var22.hasAction(stringArray2) ? 1 : 0)) {
                    var22.interact(lIIIlllllllll[lIIlIIIIIIIII[22]]);
                    Time.sleepTicks((int)lIIlIIIIIIIII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIII[30]);
                    0;
                }
                String[] stringArray3 = new String[lIIlIIIIIIIII[1]];
                stringArray3[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[32]];
                if (a.lIlIIllIllIlllI(var22.hasAction(stringArray3) ? 1 : 0)) {
                    var22.interact(lIIIlllllllll[lIIlIIIIIIIII[33]]);
                    Time.sleepTicks((int)lIIlIIIIIIIII[15]);
                    0;
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIII[30]);
                    0;
                }
            }
            0;
            if (-2 >= 0) {
                return;
            }
        } else if (a.lIlIIllIllIllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(H), lIIlIIIIIIIII[28])) {
            String[] stringArray = new String[lIIlIIIIIIIII[1]];
            stringArray[a.lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[34]];
            TileObject var22 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.lIlIIllIlllIIlI(var22)) {
                var22.interact(lIIIlllllllll[lIIlIIIIIIIII[35]]);
                Time.sleepTicks((int)lIIlIIIIIIIII[15]);
                0;
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIII[30]);
                0;
            }
        }
    }

    public static void a(int[] nArray) {
        int[] var16;
        int var5 = lIIlIIIIIIIII[2];
        while (a.lIlIIllIlllIIll(var5, var16.length)) {
            Bank.withdraw((int)var16[var5], (int)lIIlIIIIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIlIIIIIIIII[1]);
            0;
            ++var5;
            0;
            if (2 >= 1) continue;
            return;
        }
    }

    private static boolean lIlIIllIllIllll(int n2) {
        return n2 == 0;
    }

    static {
        a.lIlIIllIllIllII();
        a.lIlIIllIllIlIll();
        w = new WorldArea(lIIlIIIIIIIII[40], lIIlIIIIIIIII[41], lIIlIIIIIIIII[42], lIIlIIIIIIIII[43], lIIlIIIIIIIII[2]);
        x = new WorldPoint(lIIlIIIIIIIII[44], lIIlIIIIIIIII[45], lIIlIIIIIIIII[2]);
        y = new WorldArea(lIIlIIIIIIIII[46], lIIlIIIIIIIII[47], lIIlIIIIIIIII[48], lIIlIIIIIIIII[48], lIIlIIIIIIIII[2]);
        z = new WorldArea(lIIlIIIIIIIII[49], lIIlIIIIIIIII[50], lIIlIIIIIIIII[51], lIIlIIIIIIIII[52], lIIlIIIIIIIII[2]);
        A = new WorldArea(lIIlIIIIIIIII[53], lIIlIIIIIIIII[54], lIIlIIIIIIIII[38], lIIlIIIIIIIII[11], lIIlIIIIIIIII[2]);
        B = new WorldArea(lIIlIIIIIIIII[55], lIIlIIIIIIIII[56], lIIlIIIIIIIII[57], lIIlIIIIIIIII[58], lIIlIIIIIIIII[2]);
        C = new WorldArea(lIIlIIIIIIIII[59], lIIlIIIIIIIII[60], lIIlIIIIIIIII[61], lIIlIIIIIIIII[62], lIIlIIIIIIIII[2]);
        D = new WorldArea(lIIlIIIIIIIII[63], lIIlIIIIIIIII[64], lIIlIIIIIIIII[35], lIIlIIIIIIIII[36], lIIlIIIIIIIII[2]);
        E = new WorldArea(lIIlIIIIIIIII[7], lIIlIIIIIIIII[65], lIIlIIIIIIIII[66], lIIlIIIIIIIII[67], lIIlIIIIIIIII[2]);
        F = new WorldPoint(lIIlIIIIIIIII[68], lIIlIIIIIIIII[69], lIIlIIIIIIIII[2]);
        G = new WorldPoint(lIIlIIIIIIIII[70], lIIlIIIIIIIII[71], lIIlIIIIIIIII[2]);
        H = new WorldPoint(lIIlIIIIIIIII[72], lIIlIIIIIIIII[73], lIIlIIIIIIIII[1]);
    }

    private static boolean lIlIIllIllIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int var28;
        int[] nArray = new int[lIIlIIIIIIIII[1]];
        nArray[a.lIIlIIIIIIIII[2]] = n2;
        if (a.lIlIIllIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[lIIlIIIIIIIII[1]];
        nArray2[a.lIIlIIIIIIIII[2]] = var28;
        if (a.lIlIIllIllIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void var17;
            Bank.withdraw((int)var28, (int)var17, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIlIIIIIIIII[1]);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] var36;
        int var29 = lIIlIIIIIIIII[2];
        while (a.lIlIIllIlllIIll(var29, var36.length)) {
            void var35;
            Bank.withdraw((int)var36[var29], (int)var35, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIlIIIIIIIII[1]);
            0;
            int[] nArray2 = new int[lIIlIIIIIIIII[1]];
            nArray2[a.lIIlIIIIIIIII[2]] = var36[var29];
            if (a.lIlIIllIllIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (2 > 0) break;
                return;
            }
            ++var29;
            0;
            if (-1 == -1) continue;
            return;
        }
    }

    private static String lIlIIllIllIlIIl(String var38, String var27) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var27.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIIII[29]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIlIIIIIIIII[14], var30);
            return new String(var6.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIllIlIII(String var3, String var20) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var13 = var20.toCharArray();
        int var2 = lIIlIIIIIIIII[2];
        char[] var14 = var3.toCharArray();
        int var8 = var14.length;
        int var24 = lIIlIIIIIIIII[2];
        while (a.lIlIIllIlllIIll(var24, var8)) {
            char var11 = var14[var24];
            var18.append((char)(var11 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var24;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    private static String lIlIIllIllIlIlI(String var33, String var25) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var32 = Cipher.getInstance("Blowfish");
            var32.init(lIIlIIIIIIIII[14], var26);
            return new String(var32.doFinal(Base64.getDecoder().decode(var33.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] var23;
        int var10 = lIIlIIIIIIIII[2];
        while (a.lIlIIllIlllIIll(var10, var23.length)) {
            void var15;
            Bank.withdraw((int)var23[var10], (int)var15, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)lIIlIIIIIIIII[1]);
            0;
            ++var10;
            0;
            if ((12 + 30 - -64 + 73 ^ 135 + 171 - 199 + 76) >= 0) continue;
            return;
        }
    }

    private static boolean lIlIIllIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)lIIlIIIIIIIII[1]);
        0;
    }

    private static void lIlIIllIllIllII() {
        lIIlIIIIIIIII = new int[74];
        a.lIIlIIIIIIIII[0] = -(0xFFFFF36C & 0x7FF3) & (0xFFFFFFFF & 0x7BDF);
        a.lIIlIIIIIIIII[1] = 1;
        a.lIIlIIIIIIIII[2] = (0x84 ^ 0x82 ^ (0x9F ^ 0xC6)) & (0x37 ^ 0x21 ^ (0x61 ^ 0x28) ^ -1);
        a.lIIlIIIIIIIII[3] = -(0xFFFFD27F & 0x6FA9) & (0xFFFFDBBE & 0x6FFD);
        a.lIIlIIIIIIIII[4] = 0xFFFFF1FB & 0x1F7D;
        a.lIIlIIIIIIIII[5] = -(0xFFFFE57B & 0x3EA6) & (0xFFFFFFED & 0x2FBB);
        a.lIIlIIIIIIIII[6] = -(0xFFFFEF5F & 0x79F3) & (0xFFFFFFDF & Short.MAX_VALUE);
        a.lIIlIIIIIIIII[7] = -(0xFFFFBDFA & 0x6687) & (0xFFFFBFFD & 0x6FFF);
        a.lIIlIIIIIIIII[8] = 0xFFFFDF92 & 0x36ED;
        a.lIIlIIIIIIIII[9] = 81 + 170 - 235 + 175 ^ 89 + 63 - 121 + 133;
        a.lIIlIIIIIIIII[10] = 0xFD ^ 0x9B ^ (0x6B ^ 0x11);
        a.lIIlIIIIIIIII[11] = 6 + 11 - -167 + 5 ^ 112 + 20 - -26 + 11;
        a.lIIlIIIIIIIII[12] = -1;
        a.lIIlIIIIIIIII[13] = 0x45 ^ 0x74 ^ (0x1B ^ 0x2C);
        a.lIIlIIIIIIIII[14] = 2;
        a.lIIlIIIIIIIII[15] = 3;
        a.lIIlIIIIIIIII[16] = 45 + 166 - 207 + 183 ^ 117 + 65 - 127 + 92;
        a.lIIlIIIIIIIII[17] = -(0xFFFFB7AF & 0x7D5F) & (0xFFFFBFFF & 0x7F3E);
        a.lIIlIIIIIIIII[18] = 0xFFFF9F5B & 0x6DE4;
        a.lIIlIIIIIIIII[19] = 0x2A ^ 0x41 ^ (6 ^ 0x68);
        a.lIIlIIIIIIIII[20] = -(0xFFFFADFB & 0x560F) & (0xFFFF8FAE & 0x7E5F);
        a.lIIlIIIIIIIII[21] = 0xFFFF8B3D & 0x7FEE;
        a.lIIlIIIIIIIII[22] = 156 + 18 - 84 + 90 ^ 70 + 42 - 79 + 158;
        a.lIIlIIIIIIIII[23] = 0xDF ^ 0xB2 ^ (0xFD ^ 0x9A);
        a.lIIlIIIIIIIII[24] = 0x59 ^ 0x5D;
        a.lIIlIIIIIIIII[25] = 0xFFFFCECF & 0x3D7F;
        a.lIIlIIIIIIIII[26] = 0xFFFFCF5B & 0x3FF5;
        a.lIIlIIIIIIIII[27] = 0x90 ^ 0x97;
        a.lIIlIIIIIIIII[28] = 135 + 103 - 126 + 75 ^ 85 + 5 - -30 + 45;
        a.lIIlIIIIIIIII[29] = 0x6C ^ 0x64;
        a.lIIlIIIIIIIII[30] = -(0xFFFFFCDB & 0x1336) & (0xFFFFDFB1 & 0x3FFF);
        a.lIIlIIIIIIIII[31] = 27 + 45 - 45 + 136 ^ 47 + 90 - 24 + 57;
        a.lIIlIIIIIIIII[32] = 69 + 19 - -70 + 23 ^ 112 + 117 - 122 + 78;
        a.lIIlIIIIIIIII[33] = 57 + 131 - 111 + 112 ^ 160 + 106 - 239 + 149;
        a.lIIlIIIIIIIII[34] = 0x54 ^ 0x5A;
        a.lIIlIIIIIIIII[35] = 0x6C ^ 0x63;
        a.lIIlIIIIIIIII[36] = 0x2A ^ 0x48 ^ (0xDC ^ 0xAE);
        a.lIIlIIIIIIIII[37] = 0x86 ^ 0x97;
        a.lIIlIIIIIIIII[38] = 0x82 ^ 0x99 ^ (0x86 ^ 0x8F);
        a.lIIlIIIIIIIII[39] = 0x90 ^ 0x83;
        a.lIIlIIIIIIIII[40] = -(0xFFFFDBFF & 0x26B9) & (0xFFFFEEFF & 0x1FFF);
        a.lIIlIIIIIIIII[41] = 0xFFFFDD9D & 0x2FF3;
        a.lIIlIIIIIIIII[42] = 31 + 85 - 93 + 163 ^ 84 + 33 - 74 + 104;
        a.lIIlIIIIIIIII[43] = 0xA9 ^ 0x8E;
        a.lIIlIIIIIIIII[44] = 0xFFFF9DA4 & 0x6EDF;
        a.lIIlIIIIIIIII[45] = 0xFFFFCFF7 & 0x3D2D;
        a.lIIlIIIIIIIII[46] = 0xFFFFDBDB & 0x2F7F;
        a.lIIlIIIIIIIII[47] = 0xFFFFDFBF & 0x2CCA;
        a.lIIlIIIIIIIII[48] = 0xC2 ^ 0x93 ^ (0x62 ^ 0x5A);
        a.lIIlIIIIIIIII[49] = -(0xFFFFF7E7 & 0x5A9B) & (0xFFFFFFFE & 0x5EFF);
        a.lIIlIIIIIIIII[50] = -(0xFFFFFC8D & 0x7373) & (0xFFFFFD36 & 0x7FEF);
        a.lIIlIIIIIIIII[51] = 0x30 ^ 0x13;
        a.lIIlIIIIIIIII[52] = 37 + 9 - 35 + 124 ^ 105 + 139 - 119 + 64;
        a.lIIlIIIIIIIII[53] = -(0xFFFFE653 & 0x7BED) & (0xFFFFFF77 & 0x6EFD);
        a.lIIlIIIIIIIII[54] = -(0xFFFFF7FB & 0x59DD) & (0xFFFFFFFF & 0x5FFB);
        a.lIIlIIIIIIIII[55] = 0xFFFFEE5F & 0x1FBE;
        a.lIIlIIIIIIIII[56] = -(0xFFFFBFB7 & 0x72ED) & (0xFFFFBFFE & Short.MAX_VALUE);
        a.lIIlIIIIIIIII[57] = 0x2F ^ 0x73;
        a.lIIlIIIIIIIII[58] = 142 + 4 - 50 + 81 ^ 86 + 22 - 16 + 56;
        a.lIIlIIIIIIIII[59] = 0xFFFF9DFE & 0x6E3B;
        a.lIIlIIIIIIIII[60] = -(0xFFFFA8CD & 0x77B7) & (0xFFFFBFFF & 0x6DF5);
        a.lIIlIIIIIIIII[61] = 0x2E ^ 0x24 ^ (0x8B ^ 0xB0);
        a.lIIlIIIIIIIII[62] = 0x67 ^ 0x23;
        a.lIIlIIIIIIIII[63] = 0xFFFFEEDE & 0x177F;
        a.lIIlIIIIIIIII[64] = -(0xFFFFF29F & 0x7DEC) & (0xFFFFFFFB & 0x7FEF);
        a.lIIlIIIIIIIII[65] = -(0xFFFFE351 & 0x5FBF) & (0xFFFFCFFF & 0x7FFD);
        a.lIIlIIIIIIIII[66] = 0x7B ^ 0x7C ^ (4 ^ 0x2E);
        a.lIIlIIIIIIIII[67] = 13 + 12 - -100 + 54 ^ 52 + 111 - 88 + 76;
        a.lIIlIIIIIIIII[68] = 0xFFFFBFDF & 0x4BBF;
        a.lIIlIIIIIIIII[69] = 0xFFFFCFFB & 0x3CAE;
        a.lIIlIIIIIIIII[70] = -(0xFFFFE77D & 0x78C7) & (0xFFFFEEFE & 0x77FF);
        a.lIIlIIIIIIIII[71] = -(0xFFFFE267 & 0x7FFD) & (0xFFFFEFFD & 0x7FEF);
        a.lIIlIIIIIIIII[72] = -(0xFFFFB569 & 0x6E9F) & (0xFFFFFFED & 0x2FFE);
        a.lIIlIIIIIIIII[73] = 0xFFFF9BFF & 0x776D;
    }

    private static boolean lIlIIllIlllIIIl(int n2, int n3) {
        return n2 <= n3;
    }
}

