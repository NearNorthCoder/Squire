/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class H_Unknown
implements M {
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIIlllIIIlIl;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ List<d> bA;
    public static /* synthetic */ int hr;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ WorldPoint hs;
    private static /* synthetic */ String[] lIIIlllIIIIll;

    private static void lIlIIIlllIlIlII() {
        lIIIlllIIIlIl = new int[38];
        H.lIIIlllIIIlIl[0] = (0x76 ^ 0x37) & ~(0x7E ^ 0x3F);
        H.lIIIlllIIIlIl[1] = 1;
        H.lIIIlllIIIlIl[2] = 0x19 ^ 0x2B;
        H.lIIIlllIIIlIl[3] = 2;
        H.lIIIlllIIIlIl[4] = 127 + 145 - 228 + 112 + (0xB5 ^ 0xA0) - (123 + 54 - 117 + 111) + (0 + 15 - 6 + 164);
        H.lIIIlllIIIlIl[5] = 3;
        H.lIIIlllIIIlIl[6] = 0x56 ^ 0x52;
        H.lIIIlllIIIlIl[7] = -(0xFFFFCC6E & 0x3FF3) & (0xFFFFBFF9 & 0x5FEF);
        H.lIIIlllIIIlIl[8] = 0x57 ^ 0x52;
        H.lIIIlllIIIlIl[9] = -(0xFFFF8C47 & 0x7BB9) & (0xFFFFBFDF & 0x4EFF);
        H.lIIIlllIIIlIl[10] = 0x89 ^ 0xB3 ^ (0x46 ^ 0x68);
        H.lIIIlllIIIlIl[11] = 0xBD ^ 0xAF ^ (0x16 ^ 2);
        H.lIIIlllIIIlIl[12] = 0xFFFFBFCF & 0x5F78;
        H.lIIIlllIIIlIl[13] = -(0xFFFFCB7B & 0x74AD) & (0xFFFFFFFF & 0x5F6F);
        H.lIIIlllIIIlIl[14] = 0x66 ^ 0x61;
        H.lIIIlllIIIlIl[15] = -(0xFFFFF7BD & 0x6877) & (0xFFFFFF7D & Short.MAX_VALUE);
        H.lIIIlllIIIlIl[16] = 0xAD ^ 0xC5 ^ (0 ^ 0x60);
        H.lIIIlllIIIlIl[17] = 195 + 204 - 260 + 67 ^ 121 + 152 - 227 + 153;
        H.lIIIlllIIIlIl[18] = 0x55 ^ 0x5F;
        H.lIIIlllIIIlIl[19] = 0x8C ^ 0x87;
        H.lIIIlllIIIlIl[20] = 46 + 52 - 55 + 91 ^ 37 + 118 - 96 + 79;
        H.lIIIlllIIIlIl[21] = -(0xFFFFFCDF & 0x1765) & (0xFFFFFFFD & 0x1FFE);
        H.lIIIlllIIIlIl[22] = 0 + 25 - -133 + 10 ^ 4 + 100 - 66 + 127;
        H.lIIIlllIIIlIl[23] = 0x89 ^ 0x87;
        H.lIIIlllIIIlIl[24] = 0x4C ^ 0x43;
        H.lIIIlllIIIlIl[25] = -(0xFFFFBFB4 & 0x68DF) & (0xFFFFBFFF & 0x6FFF);
        H.lIIIlllIIIlIl[26] = -(0xFFFFB41A & 0x5BF7) & (0xFFFFFEFF & 0x3FDD);
        H.lIIIlllIIIlIl[27] = 0xFFFFF5AD & 0x6BFA;
        H.lIIIlllIIIlIl[28] = 0xAA ^ 0x82;
        H.lIIIlllIIIlIl[29] = -(0xFFFFDEEF & 0x6DBD) & (0xFFFFFFFF & 0x7DFD);
        H.lIIIlllIIIlIl[30] = 107 + 135 - 71 + 43 ^ 161 + 69 - 101 + 49;
        H.lIIIlllIIIlIl[31] = 122 + 156 - 156 + 52 ^ 153 + 140 - 246 + 143;
        H.lIIIlllIIIlIl[32] = 0x26 ^ 0x77 ^ (0x72 ^ 0x36);
        H.lIIIlllIIIlIl[33] = 0x25 ^ 0x58 ^ (0xC0 ^ 0xAC);
        H.lIIIlllIIIlIl[34] = -(0xFFFFF75F & 0x7BAB) & (0xFFFFFFFF & 0x7F7F);
        H.lIIIlllIIIlIl[35] = 0xFFFFDFC8 & 0x2CFF;
        H.lIIIlllIIIlIl[36] = 0xA1 ^ 0xB3;
        H.lIIIlllIIIlIl[37] = 0x85 ^ 0x96;
    }

    @Override
    public int Y() {
        try {
            H.cr();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x50 ^ 0x55) & ~(0x29 ^ 0x2C)) != ((0x38 ^ 0x3E) & ~(0xB3 ^ 0xB5))) {
            return (0xD ^ 2) & ~(0x2B ^ 0x24);
        }
        return lIIIlllIIIlIl[30];
    }

    private static boolean lIlIIIlllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlllIllIIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIIlllIlIIII() {
        lIIIlllIIIIll = new String[lIIIlllIIIlIl[32]];
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[0]] = H."Buying items";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[1]] = H."Finished buying items, switching back to questing";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[3]] = H."Drink";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[5]] = H."Navigating to bank";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[6]] = H."Opening bank";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[8]] = H."Handling banking";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[11]] = H."We are missing supplies, switching to BUYING";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[14]] = H."We are missing supplies, switching to BUYING";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[16]] = H."Nav to start";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[17]] = H."Fred the Farmer";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[18]] = H."Nav to start";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[19]] = H."Fred the Farmer";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[20]] = H."Talk-to";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[22]] = H."I'm looking for a quest.";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[23]] = H."Yes, okay. I can do that.";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[24]] = H."Yes.";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[31]] = H."Sheep shearer quest";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[33]] = H."ring of wealth (";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[36]] = H."I'm looking for a quest.";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[37]] = H."Yes, okay. I can do that.";
        H.lIIIlllIIIIll[H.lIIIlllIIIlIl[10]] = H."Yes.";
    }

    private static boolean lIlIIIlllIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void W() {
        d var24;
        Object var10;
        block8: {
            block7: {
                int[] nArray = new int[lIIIlllIIIlIl[1]];
                nArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                if (!H.lIlIIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lIIIlllIIIlIl[1]];
                nArray2[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                if (!H.lIlIIIlllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                int[] nArray3 = new int[lIIIlllIIIlIl[1]];
                nArray3[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                if (!H.lIlIIIlllIlIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIIlIl[10])) break block8;
            }
            var10 = new d(lIIIlllIIIlIl[9], lIIIlllIIIlIl[10], lIIIlllIIIlIl[25]);
            bA.add((d)var10);
            0;
        }
        int[] nArray = new int[lIIIlllIIIlIl[1]];
        nArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[12];
        if (H.lIlIIIlllIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var10 = new d(lIIIlllIIIlIl[12], lIIIlllIIIlIl[18], lIIIlllIIIlIl[25]);
            bA.add((d)var10);
            0;
        }
        if (H.lIlIIIlllIlIlll(Bank.contains((Predicate)(var10 = item -> item.getName().toLowerCase().contains(lIIIlllIIIIll[lIIIlllIIIlIl[33]]))) ? 1 : 0)) {
            var24 = new d(lIIIlllIIIlIl[26], lIIIlllIIIlIl[8], lIIIlllIIIlIl[27]);
            bA.add(var24);
            0;
        }
        int[] nArray4 = new int[lIIIlllIIIlIl[1]];
        nArray4[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[13];
        if (H.lIlIIIlllIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var24 = new d(lIIIlllIIIlIl[13], lIIIlllIIIlIl[28], lIIIlllIIIlIl[25]);
            bA.add(var24);
            0;
        }
        if (H.lIlIIIlllIlIlll(Bank.contains((int[])f.ba) ? 1 : 0)) {
            var24 = new d(lIIIlllIIIlIl[29], lIIIlllIIIlIl[8], h.bv);
            bA.add(var24);
            0;
        }
    }

    private static boolean lIlIIIlllIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIlllIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIIlllIIllIl(String var22, String var6) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIIlllIIIlIl[3], var16);
            return new String(var12.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static void cr() {
        block22: {
            block23: {
                BankLocation var17;
                block24: {
                    block26: {
                        block25: {
                            if (H.lIlIIIlllIlIlIl(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[0]];
                                b.a(bA);
                                if (H.lIlIIIlllIlIllI(bA.size(), lIIIlllIIIlIl[1])) {
                                    System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[1]]);
                                    by = lIIIlllIIIlIl[0];
                                }
                            }
                            if (!H.lIlIIIlllIlIlll(by ? 1 : 0)) break block22;
                            if (H.lIlIIIlllIlIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && H.lIlIIIlllIlIllI(Movement.getRunEnergy(), lIIIlllIIIlIl[2]) && H.lIlIIIlllIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIlllIIIIll[lIIIlllIIIlIl[3]]);
                                Time.sleepTicks((int)lIIIlllIIIlIl[1]);
                                0;
                            }
                            if (!H.lIlIIIlllIlIllI(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1])) break block23;
                            if (!H.lIlIIIlllIlIlll(H.aJ() ? 1 : 0)) break block24;
                            var17 = BankLocation.getNearest();
                            if (H.lIlIIIlllIllIII(var17) && H.lIlIIIlllIlIlll(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[5]];
                                a.a(var17);
                            }
                            if (!H.lIlIIIlllIllIII(var17) || !H.lIlIIIlllIlIlIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block24;
                            if (H.lIlIIIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[6]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIIlIl[7]);
                                0;
                            }
                            if (!H.lIlIIIlllIlIlIl(Bank.isOpen() ? 1 : 0)) break block24;
                            AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[8]];
                            if (H.lIlIIIlllIllIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlllIIIlIl[5]);
                                0;
                            }
                            if (H.lIlIIIlllIllIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlllIIIlIl[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIlllIIIlIl[1]];
                            nArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                            if (H.lIlIIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIlllIIIlIl[1]];
                                nArray2[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                                if (H.lIlIIIlllIlIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIIIlIl[10])) {
                                    H.W();
                                    System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[11]]);
                                    by = lIIIlllIIIlIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIIlllIIIlIl[1]];
                            nArray3[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                            if (!H.lIlIIIlllIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lIIIlllIIIlIl[1]];
                            nArray4[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[12];
                            if (!H.lIlIIIlllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                            int[] nArray5 = new int[lIIIlllIIIlIl[1]];
                            nArray5[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[13];
                            if (!H.lIlIIIlllIlIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block26;
                        }
                        H.W();
                        System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[14]]);
                        by = lIIIlllIIIlIl[1];
                        return;
                    }
                    Bank.withdraw((int)lIIIlllIIIlIl[9], (int)lIIIlllIIIlIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lIIIlllIIIlIl[12], (int)lIIIlllIIIlIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lIIIlllIIIlIl[15], (int)lIIIlllIIIlIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    a.b(f.bk, lIIIlllIIIlIl[1]);
                }
                if (H.lIlIIIlllIlIlIl(H.aJ() ? 1 : 0)) {
                    if (H.lIlIIIlllIllIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        if (H.lIlIIIlllIlIllI(bY, lIIIlllIIIlIl[1])) {
                            e.w();
                            bY += lIIIlllIIIlIl[1];
                        }
                        AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[16]];
                        Movement.walkTo((WorldPoint)hs);
                        0;
                    }
                    if (H.lIlIIIlllIllIll(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        String[] stringArray = new String[lIIIlllIIIlIl[1]];
                        stringArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[17]];
                        var17 = NPCs.getNearest((String[])stringArray);
                        if (H.lIlIIIlllIllIII(var17) && H.lIlIIIlllIllIlI(var17.getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                            e.w();
                        }
                        if (H.lIlIIIlllIlIllI(co, lIIIlllIIIlIl[1])) {
                            P.lo += lIIIlllIIIlIl[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIIIlIl[1];
                            P.lo = lIIIlllIIIlIl[0];
                            cp = lIIIlllIIIlIl[0];
                        }
                        H.cs();
                    }
                }
            }
            if (!H.lIlIIIlllIlllII(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1]) || H.lIlIIIlllIlllIl(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[10])) {
                if (H.lIlIIIlllIlllIl(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1])) {
                    if (H.lIlIIIlllIllIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[18]];
                        Movement.walkTo((WorldPoint)hs);
                        0;
                        Time.sleepTicks((int)lIIIlllIIIlIl[1]);
                        0;
                    }
                    H.cs();
                }
                if (H.lIlIIIlllIlllIl(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[10])) {
                    H.cs();
                }
            }
            g.a(new String[lIIIlllIIIlIl[0]]);
        }
    }

    @Override
    public boolean X() {
        return lIIIlllIIIlIl[0];
    }

    private static boolean lIlIIIlllIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void cs() {
        List var13;
        if (H.lIlIIIlllIlIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlllIIIlIl[1]];
            stringArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[19]];
            List list = NPCs.getAll((String[])stringArray);
            if (H.lIlIIIlllIllIIl(list.size())) {
                ((NPC)list.get(lIIIlllIIIlIl[0])).interact(lIIIlllIIIIll[lIIIlllIIIlIl[20]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllIIIlIl[21]);
                0;
            }
        }
        if (H.lIlIIIlllIlIlIl(Dialog.isOpen() ? 1 : 0) && H.lIlIIIlllIlIlIl(Dialog.isViewingOptions() ? 1 : 0) && H.lIlIIIlllIlIlll((var13 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
            int var1 = lIIIlllIIIlIl[0];
            while (H.lIlIIIlllIlIllI(var1, var13.size())) {
                if (H.lIlIIIlllIlIlIl(((Widget)var13.get(var1)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIIIlIl[1]];
                    stringArray[H.lIIIlllIIIlIl[0]] = ((Widget)var13.get(var1)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (3 != (0x71 ^ 0x75)) break;
                    return;
                }
                if (H.lIlIIIlllIlIlIl(((Widget)var13.get(var1)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[23]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIIIlIl[1]];
                    stringArray[H.lIIIlllIIIlIl[0]] = ((Widget)var13.get(var1)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (3 > 2) break;
                    return;
                }
                if (H.lIlIIIlllIlIlIl(((Widget)var13.get(var1)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIIIlIl[1]];
                    stringArray[H.lIIIlllIIIlIl[0]] = ((Widget)var13.get(var1)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (2 != 0) break;
                    return;
                }
                if (H.lIlIIIlllIlIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                    0;
                    if (1 >= 1) break;
                    return;
                }
                ++var1;
                0;
                
                return;
            }
        }
    }

    private static boolean lIlIIIlllIlIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIlllIIIIll[lIIIlllIIIlIl[31]];
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (H.lIlIIIlllIllllI(e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[32])) {
            bl = lIIIlllIIIlIl[1];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            bl = lIIIlllIIIlIl[0];
        }
        return bl;
    }

    private static String lIlIIIlllIIlllI(String var18, String var14) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var19 = var14.toCharArray();
        int var2 = lIIIlllIIIlIl[0];
        char[] var3 = var18.toCharArray();
        int var23 = var3.length;
        int var4 = lIIIlllIIIlIl[0];
        while (H.lIlIIIlllIlIllI(var4, var23)) {
            char var15 = var3[var4];
            var7.append((char)(var15 ^ var19[var2 % var19.length]));
            0;
            ++var2;
            ++var4;
            0;
            if (((0x9B ^ 0x8F ^ (0x3F ^ 0x61)) & (201 + 85 - 114 + 31 ^ 68 + 42 - 36 + 55 ^ -1)) <= 1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIlIIIlllIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlllIllIII(Object object) {
        return object != null;
    }

    static {
        H.lIlIIIlllIlIlII();
        H.lIlIIIlllIlIIII();
        bA = new ArrayList<d>();
        hr = lIIIlllIIIlIl[9];
        hs = new WorldPoint(lIIIlllIIIlIl[34], lIIIlllIIIlIl[35], lIIIlllIIIlIl[0]);
        String[] stringArray = new String[lIIIlllIIIlIl[5]];
        stringArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[36]];
        stringArray[H.lIIIlllIIIlIl[1]] = lIIIlllIIIIll[lIIIlllIIIlIl[37]];
        stringArray[H.lIIIlllIIIlIl[3]] = lIIIlllIIIIll[lIIIlllIIIlIl[10]];
        bW = stringArray;
    }

    private static boolean lIlIIIlllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIlllIIllll(String var21, String var11) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIIlllIIIlIl[16]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIIlllIIIlIl[3], var20);
            return new String(var9.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aJ() {
        int n2;
        int[] nArray = new int[lIIIlllIIIlIl[1]];
        nArray[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
        if (H.lIlIIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlllIIIlIl[1]];
            nArray2[H.lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
            if (H.lIlIIIlllIllllI(Inventory.getAll((int[])nArray2).size(), lIIIlllIIIlIl[10])) {
                n2 = lIIIlllIIIlIl[1];
                0;
                if (-1 <= 3) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIlllIIIlIl[0];
        return n2 != 0;
    }
}

