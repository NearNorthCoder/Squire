/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.O_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.i_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.o_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class n_Unknown
implements M {
    public static final /* synthetic */ WorldPoint cu;
    public static final /* synthetic */ WorldPoint cy;
    static /* synthetic */ WorldArea cE;
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ String[] lIIIlllIIllIl;
    public static final /* synthetic */ WorldPoint cA;
    static /* synthetic */ WorldArea cF;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint cx;
    public static final /* synthetic */ WorldPoint ct;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int co;
    public static final /* synthetic */ WorldPoint cB;
    public static final /* synthetic */ WorldPoint cz;
    public static final /* synthetic */ WorldPoint cv;
    public static final /* synthetic */ WorldPoint cC;
    static /* synthetic */ int cD;
    public static /* synthetic */ List<d> bA;
    public static final /* synthetic */ WorldPoint cw;
    private static /* synthetic */ int[] lIIIlllIlIIlI;

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var25;
        int[] nArray = new int[lIIIlllIlIIlI[5]];
        nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
        nArray[n.lIIIlllIlIIlI[0]] = lIIIlllIlIIlI[11];
        nArray[n.lIIIlllIlIIlI[3]] = lIIIlllIlIIlI[14];
        int[] nArray2 = nArray;
        int var19 = lIIIlllIlIIlI[1];
        while (n.lIlIIlIIIlIllII(var19, ((void)var25).length)) {
            int[] nArray3 = new int[lIIIlllIlIIlI[0]];
            nArray3[n.lIIIlllIlIIlI[1]] = var25[var19];
            if (n.lIlIIlIIIlIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIlIIlI[1];
            }
            ++var19;
            0;
            if ((0x51 ^ 0x55 ^ 1) != 0) continue;
            return ((0xA5 ^ 0xA3 ^ (0xD2 ^ 0x99)) & (0x32 ^ 0x1A ^ (0x35 ^ 0x50) ^ -1)) != 0;
        }
        return lIIIlllIlIIlI[0];
    }

    public static void aD() {
        block82: {
            Object var18;
            BankLocation lllllllllllllllIIIIIlIllIIlIlllI2;
            block83: {
                block88: {
                    block85: {
                        block87: {
                            block86: {
                                block84: {
                                    if (n.lIlIIlIIIlIlIll(by ? 1 : 0)) {
                                        b.a(bA);
                                        if (n.lIlIIlIIIlIllII(bA.size(), lIIIlllIlIIlI[0])) {
                                            System.out.println(lIIIlllIIllIl[lIIIlllIlIIlI[1]]);
                                            by = lIIIlllIlIIlI[1];
                                        }
                                    }
                                    if (!n.lIlIIlIIIlIllIl(by ? 1 : 0)) break block82;
                                    if (n.lIlIIlIIIlIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIlIIlI[2])) {
                                        O.cL();
                                    }
                                    if (n.lIlIIlIIIlIlllI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIlIIlI[2]) && n.lIlIIlIIIlIlIll(Inventory.contains((int[])f.bf) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.bf).interact(lIIIlllIIllIl[lIIIlllIlIIlI[0]]);
                                    }
                                    if (!n.lIlIIlIIIlIllIl(n.S() ? 1 : 0) || !n.lIlIIlIIIlIllII(e.j(cD), lIIIlllIlIIlI[0]) || !n.lIlIIlIIIlIlllI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIlIIlI[2])) break block83;
                                    lllllllllllllllIIIIIlIllIIlIlllI2 = BankLocation.getNearest();
                                    if (n.lIlIIlIIIlIllll(lllllllllllllllIIIIIlIllIIlIlllI2) && n.lIlIIlIIIlIllIl(lllllllllllllllIIIIIlIllIIlIlllI2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[3]];
                                        a.a(lllllllllllllllIIIIIlIllIIlIlllI2);
                                    }
                                    if (!n.lIlIIlIIIlIllll(lllllllllllllllIIIIIlIllIIlIlllI2) || !n.lIlIIlIIIlIlIll(lllllllllllllllIIIIIlIllIIlIlllI2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                                    if (n.lIlIIlIIIlIllIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIlI[4]);
                                        0;
                                    }
                                    if (!n.lIlIIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) break block83;
                                    AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[5]];
                                    if (n.lIlIIlIIIllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlllIlIIlI[6]);
                                        0;
                                    }
                                    if (n.lIlIIlIIIllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIIlllIlIIlI[0]];
                                    nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                    if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                    int[] nArray2 = new int[lIIIlllIlIIlI[0]];
                                    nArray2[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                    if (!n.lIlIIlIIIlIlllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIlIIlI[8])) break block85;
                                }
                                int[] nArray = new int[lIIIlllIlIIlI[0]];
                                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[9];
                                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block86;
                                int[] nArray3 = new int[lIIIlllIlIIlI[0]];
                                nArray3[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[9];
                                if (!n.lIlIIlIIIlIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIlIIlI[8])) break block85;
                            }
                            int[] nArray = new int[lIIIlllIlIIlI[0]];
                            nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                            if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                            int[] nArray4 = new int[lIIIlllIlIIlI[0]];
                            nArray4[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                            if (!n.lIlIIlIIIlIlllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIlIIlI[8])) break block85;
                        }
                        int[] nArray = new int[lIIIlllIlIIlI[0]];
                        nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[11];
                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                        int[] nArray5 = new int[lIIIlllIlIIlI[0]];
                        nArray5[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[11];
                        if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIlIIlI[12])) break block88;
                    }
                    n.W();
                    System.out.println(lIIIlllIIllIl[lIIIlllIlIIlI[6]]);
                    by = lIIIlllIlIIlI[0];
                    return;
                }
                int[] nArray = new int[lIIIlllIlIIlI[12]];
                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
                nArray[n.lIIIlllIlIIlI[0]] = lIIIlllIlIIlI[11];
                nArray[n.lIIIlllIlIIlI[3]] = lIIIlllIlIIlI[14];
                nArray[n.lIIIlllIlIIlI[5]] = lIIIlllIlIIlI[10];
                nArray[n.lIIIlllIlIIlI[6]] = lIIIlllIlIIlI[9];
                nArray[n.lIIIlllIlIIlI[15]] = lIIIlllIlIIlI[7];
                if (n.lIlIIlIIIlIllIl(e.b(nArray) ? 1 : 0)) {
                    n.W();
                    System.out.println(lIIIlllIIllIl[lIIIlllIlIIlI[15]]);
                    by = lIIIlllIlIIlI[0];
                    return;
                }
                while (n.lIlIIlIIIlIllIl(m.av() ? 1 : 0)) {
                    m.at();
                    Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                    0;
                    0;
                    if (-1 <= 3) continue;
                    return;
                }
                if (n.lIlIIlIIIlIllIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIIIlllIlIIlI[12]);
                    0;
                }
                int[] nArray6 = new int[lIIIlllIlIIlI[16]];
                nArray6[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
                nArray6[n.lIIIlllIlIIlI[0]] = lIIIlllIlIIlI[11];
                nArray6[n.lIIIlllIlIIlI[3]] = lIIIlllIlIIlI[14];
                nArray6[n.lIIIlllIlIIlI[5]] = lIIIlllIlIIlI[17];
                nArray6[n.lIIIlllIlIIlI[6]] = lIIIlllIlIIlI[10];
                nArray6[n.lIIIlllIlIIlI[15]] = lIIIlllIlIIlI[9];
                nArray6[n.lIIIlllIlIIlI[12]] = lIIIlllIlIIlI[7];
                if (n.lIlIIlIIIlIlIll(e.b(nArray6) ? 1 : 0)) {
                    a.a(lIIIlllIlIIlI[17], lIIIlllIlIIlI[6]);
                    a.b(f.aS, lIIIlllIlIIlI[0]);
                    a.a(lIIIlllIlIIlI[11], lIIIlllIlIIlI[12]);
                    a.a(lIIIlllIlIIlI[18], lIIIlllIlIIlI[19]);
                    a.a(lIIIlllIlIIlI[14], lIIIlllIlIIlI[5]);
                    a.a(lIIIlllIlIIlI[13], lIIIlllIlIIlI[20]);
                    int[] nArray7 = new int[lIIIlllIlIIlI[0]];
                    nArray7[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                    if (n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIIlllIlIIlI[0]];
                        nArray8[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                        if (n.lIlIIlIIIlIllII(Inventory.getCount((int[])nArray8), lIIIlllIlIIlI[0])) {
                            Bank.withdraw((int)lIIIlllIlIIlI[7], (int)lIIIlllIlIIlI[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIlllIlIIlI[0]];
                                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                if (n.lIlIIlIIIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIlllIlIIlI[0];
                                    0;
                                    if (-3 > 0) {
                                        return ((0xDE ^ 0xC6 ^ 2) & (0xB0 ^ 0xC5 ^ (0x16 ^ 0x79) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIlllIlIIlI[1];
                                }
                                return bl;
                            }, (int)lIIIlllIlIIlI[4]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[lIIIlllIlIIlI[0]];
                    nArray9[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                    if (n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIIlllIlIIlI[0]];
                        nArray10[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                        if (n.lIlIIlIIIlIllII(Inventory.getCount((int[])nArray10), lIIIlllIlIIlI[0])) {
                            Bank.withdraw((int)lIIIlllIlIIlI[10], (int)lIIIlllIlIIlI[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIlllIlIIlI[0]];
                                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                                if (n.lIlIIlIIIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIlllIlIIlI[0];
                                    0;
                                    if (2 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIlllIlIIlI[1];
                                }
                                return bl;
                            }, (int)lIIIlllIlIIlI[4]);
                            0;
                        }
                    }
                    if (n.lIlIIlIIIlIllII(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIlIIlI[23])) {
                        a.a(lIIIlllIlIIlI[9], lIIIlllIlIIlI[21]);
                    }
                }
            }
            if (n.lIlIIlIIIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && n.lIlIIlIIIlIllII(Movement.getRunEnergy(), lIIIlllIlIIlI[24])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIlllIIllIl[lIIIlllIlIIlI[12]]);
                Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                0;
            }
            if (n.lIlIIlIIIllIIIl(n.lIlIIlIIIlIlIlI(e.v(), 50.0))) {
                int[] nArray = new int[lIIIlllIlIIlI[0]];
                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[18];
                if (n.lIlIIlIIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[lIIIlllIlIIlI[0]];
                    nArray11[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[18];
                    Inventory.getFirst((int[])nArray11).interact(lIIIlllIIllIl[lIIIlllIlIIlI[16]]);
                    Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                    0;
                }
            }
            if (n.lIlIIlIIIlIlIll(n.S() ? 1 : 0) && n.lIlIIlIIIlIllII(e.j(cD), lIIIlllIlIIlI[0])) {
                if (n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n.aE();
                }
                if (n.lIlIIlIIIlIlIll(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIIIlllIIllIl[lIIIlllIlIIlI[19]], bW);
                }
            }
            if ((!n.lIlIIlIIIllIIlI(e.j(cD), lIIIlllIlIIlI[0]) || !n.lIlIIlIIIllIIlI(e.j(cD), lIIIlllIlIIlI[3]) || n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[5])) && n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIlllIlIIlI[19]) && n.lIlIIlIIIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[25]];
                    Movement.walkTo((WorldPoint)cu);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                    0;
                }
                if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIlllIlIIlI[19])) {
                    g.a(lIIIlllIIllIl[lIIIlllIlIIlI[20]], bW);
                }
            }
            if (n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[6])) {
                co = lIIIlllIlIIlI[1];
                if (n.lIlIIlIIIlIllIl(Vars.getBit((int)lIIIlllIlIIlI[26]))) {
                    if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cw), lIIIlllIlIIlI[6])) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[27]];
                        Movement.walkTo((WorldPoint)cw);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cw), lIIIlllIlIIlI[6])) {
                        String[] stringArray = new String[lIIIlllIlIIlI[0]];
                        stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[28]];
                        String[] stringArray2 = new String[lIIIlllIlIIlI[0]];
                        stringArray2[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[23]];
                        if (n.lIlIIlIIIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIIIlllIlIIlI[0]];
                            stringArray3[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIIllIl[lIIIlllIlIIlI[30]]);
                            Time.sleepTicks((int)lIIIlllIlIIlI[5]);
                            0;
                        }
                        String[] stringArray4 = new String[lIIIlllIlIIlI[0]];
                        stringArray4[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[31]];
                        String[] stringArray5 = new String[lIIIlllIlIIlI[0]];
                        stringArray5[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[32]];
                        if (n.lIlIIlIIIlIllIl(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(lIIIlllIIllIl[lIIIlllIlIIlI[33]], bW);
                        }
                    }
                }
                if (n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[26]), lIIIlllIlIIlI[0]) && n.lIlIIlIIIlIllIl(Vars.getBit((int)lIIIlllIlIIlI[34]))) {
                    if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cx), lIIIlllIlIIlI[12])) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[35]];
                        Movement.walkTo((WorldPoint)cx);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cx), lIIIlllIlIIlI[12])) {
                        g.a(lIIIlllIIllIl[lIIIlllIlIIlI[36]], bW);
                    }
                }
                if (n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[26]), lIIIlllIlIIlI[0]) && n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[34]), lIIIlllIlIIlI[0]) && n.lIlIIlIIIlIllIl(Vars.getBit((int)lIIIlllIlIIlI[37]))) {
                    if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cy), lIIIlllIlIIlI[12])) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[38]];
                        Movement.walkTo((WorldPoint)cy);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cy), lIIIlllIlIIlI[12])) {
                        g.a(lIIIlllIIllIl[lIIIlllIlIIlI[39]], bW);
                    }
                }
                if (n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[26]), lIIIlllIlIIlI[0]) && n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[34]), lIIIlllIlIIlI[0]) && n.lIlIIlIIIllIIll(Vars.getBit((int)lIIIlllIlIIlI[37]), lIIIlllIlIIlI[0])) {
                    if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cz), lIIIlllIlIIlI[3])) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[40]];
                        Movement.walkTo((WorldPoint)cz);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cz), lIIIlllIlIIlI[3])) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[41]];
                        if (n.lIlIIlIIIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIlIIlI[0]];
                            stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[42]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIllIl[lIIIlllIlIIlI[43]]);
                            Time.sleepTicks((int)lIIIlllIlIIlI[5]);
                            0;
                        }
                        int lllllllllllllllIIIIIlIllIIlIlllI2 = Vars.getBit((int)lIIIlllIlIIlI[44]);
                        var18 = Dialog.getOptions();
                        if (n.lIlIIlIIIlIllIl(var18.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lllllllllllllllIIIIIlIllIIlIlllI2);
                            if (n.lIlIIlIIIlIllIl(lllllllllllllllIIIIIlIllIIlIlllI2)) {
                                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[45]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (n.lIlIIlIIIllIIll(lllllllllllllllIIIIIlIllIIlIlllI2, lIIIlllIlIIlI[0])) {
                                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[46]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (n.lIlIIlIIIllIIll(lllllllllllllllIIIIIlIllIIlIlllI2, lIIIlllIlIIlI[3])) {
                                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[47]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (n.lIlIIlIIIllIIll(lllllllllllllllIIIIIlIllIIlIlllI2, lIIIlllIlIIlI[5])) {
                                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[48]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                            0;
                        }
                    }
                }
            }
            if (n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[15])) {
                lllllllllllllllIIIIIlIllIIlIlllI2 = new WorldArea(lIIIlllIlIIlI[49], lIIIlllIlIIlI[50], lIIIlllIlIIlI[16], lIIIlllIlIIlI[15], lIIIlllIlIIlI[1]);
                if (n.lIlIIlIIIlIllIl(Players.getLocal().getWorldLocation().getPlane())) {
                    var18 = new WorldArea(lIIIlllIlIIlI[51], lIIIlllIlIIlI[50], lIIIlllIlIIlI[28], lIIIlllIlIIlI[12], lIIIlllIlIIlI[1]);
                    WorldArea var26 = new WorldArea(lIIIlllIlIIlI[51], lIIIlllIlIIlI[52], lIIIlllIlIIlI[6], lIIIlllIlIIlI[15], lIIIlllIlIIlI[1]);
                    WorldArea var12 = new WorldArea(lIIIlllIlIIlI[53], lIIIlllIlIIlI[54], lIIIlllIlIIlI[6], lIIIlllIlIIlI[3], lIIIlllIlIIlI[1]);
                    WorldArea var11 = new WorldArea(lIIIlllIlIIlI[53], lIIIlllIlIIlI[52], lIIIlllIlIIlI[5], lIIIlllIlIIlI[5], lIIIlllIlIIlI[1]);
                    if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlllIlIIlI[3]) && n.lIlIIlIIIlIllIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[55]];
                        Movement.walkTo((WorldPoint)cA);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlllIlIIlI[3]) && n.lIlIIlIIIlIllIl(lllllllllllllllIIIIIlIllIIlIlllI2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlllIlIIlI[0]];
                        stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[56]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIllIl[lIIIlllIlIIlI[57]]);
                        Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                        0;
                    }
                    if (n.lIlIIlIIIlIlIll(lllllllllllllllIIIIIlIllIIlIlllI2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIIlI[58], lIIIlllIlIIlI[59], lIIIlllIlIIlI[1])), lIIIlllIlIIlI[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIlIIlI[58], lIIIlllIlIIlI[59], lIIIlllIlIIlI[1]));
                            0;
                            Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                            0;
                        }
                        if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIIlI[58], lIIIlllIlIIlI[59], lIIIlllIlIIlI[1])), lIIIlllIlIIlI[3])) {
                            String[] stringArray = new String[lIIIlllIlIIlI[0]];
                            stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[60]];
                            String[] stringArray6 = new String[lIIIlllIlIIlI[0]];
                            stringArray6[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[61]];
                            if (n.lIlIIlIIIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIIIlllIlIIlI[0]];
                                stringArray7[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIIIlllIIllIl[lIIIlllIlIIlI[63]]);
                                Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                                0;
                            }
                            String[] stringArray8 = new String[lIIIlllIlIIlI[0]];
                            stringArray8[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[64]];
                            String[] stringArray9 = new String[lIIIlllIlIIlI[0]];
                            stringArray9[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[65]];
                            if (n.lIlIIlIIIlIllIl(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIIlllIlIIlI[0]];
                                stringArray10[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIIlllIIllIl[lIIIlllIlIIlI[67]]);
                                Time.sleepTicks((int)lIIIlllIlIIlI[15]);
                                0;
                            }
                        }
                        if (!n.lIlIIlIIIlIllIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !n.lIlIIlIIIlIllIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !n.lIlIIlIIIlIllIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.lIlIIlIIIlIlIll(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIlIIlI[0]];
                            stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[68]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIllIl[lIIIlllIlIIlI[69]]);
                            Time.sleepTicks((int)lIIIlllIlIIlI[15]);
                            0;
                        }
                    }
                }
                if (n.lIlIIlIIIllIIll(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIlIIlI[0])) {
                    AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[70]];
                    String[] stringArray = new String[lIIIlllIlIIlI[0]];
                    stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[2]];
                    if (n.lIlIIlIIIlIllll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[lIIIlllIlIIlI[0]];
                        stringArray11[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIIllIl[lIIIlllIlIIlI[72]]);
                        Time.sleepTicks((int)lIIIlllIlIIlI[15]);
                        0;
                    }
                    String[] stringArray12 = new String[lIIIlllIlIIlI[0]];
                    stringArray12[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[73]];
                    if (n.lIlIIlIIIlIllll(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[lIIIlllIlIIlI[0]];
                        stringArray13[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(lIIIlllIIllIl[lIIIlllIlIIlI[24]]);
                        Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                        0;
                    }
                }
            }
            if (n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[12])) {
                if (n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n.aE();
                }
                if (n.lIlIIlIIIlIlIll(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIIIlllIIllIl[lIIIlllIlIIlI[75]], bW);
                }
            }
            if (n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[16])) {
                if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlllIlIIlI[25])) {
                    AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[76]];
                    Movement.walkTo((WorldPoint)cC);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIIlI[3]);
                    0;
                }
                if (n.lIlIIlIIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlllIlIIlI[25])) {
                    if (n.lIlIIlIIIlIllIl(i.U() ? 1 : 0)) {
                        i.V();
                    }
                    String[] stringArray = new String[lIIIlllIlIIlI[0]];
                    stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[77]];
                    lllllllllllllllIIIIIlIllIIlIlllI2 = NPCs.getNearest((String[])stringArray);
                    var18 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (n.lIlIIlIIIlIlIll(nPC.getName().contains(lIIIlllIIllIl[lIIIlllIlIIlI[111]]) ? 1 : 0) && n.lIlIIlIIlIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIIlllIlIIlI[0];
                            0;
                            if ((186 + 44 - 76 + 40 ^ 17 + 144 - 145 + 183) == 0) {
                                return ((0x6B ^ 0x3C ^ (0x7F ^ 0x73)) & (3 ^ (0x5B ^ 3) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIIlllIlIIlI[1];
                        }
                        return n2 != 0;
                    });
                    if (n.lIlIIlIIIlIllll(lllllllllllllllIIIIIlIllIIlIlllI2) && n.lIlIIlIIIllIllI(var18)) {
                        String[] stringArray14 = new String[lIIIlllIlIIlI[0]];
                        stringArray14[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[78]];
                        if (n.lIlIIlIIIlIllIl(lllllllllllllllIIIIIlIllIIlIlllI2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(lIIIlllIIllIl[lIIIlllIlIIlI[79]], bW);
                        }
                        String[] stringArray15 = new String[lIIIlllIlIIlI[0]];
                        stringArray15[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[80]];
                        if (n.lIlIIlIIIlIlIll(lllllllllllllllIIIIIlIllIIlIlllI2.hasAction(stringArray15) ? 1 : 0) && n.lIlIIlIIIllIllI(Players.getLocal().getInteracting())) {
                            AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[81]];
                            if (n.lIlIIlIIIlIllIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (n.lIlIIlIIIlIllII(Prayers.getPoints(), lIIIlllIlIIlI[40]) && n.lIlIIlIIIlIlIll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aX).interact(lIIIlllIIllIl[lIIIlllIlIIlI[82]]);
                        Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                        0;
                    }
                    g.a(bW);
                }
            }
            if (n.lIlIIlIIIllIIll(e.j(cD), lIIIlllIlIIlI[19])) {
                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[83]];
                if (n.lIlIIlIIIlIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[84]];
                    String[] stringArray16 = new String[lIIIlllIlIIlI[0]];
                    stringArray16[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[85]];
                    TileItems.getNearest((String[])stringArray16).interact(lIIIlllIIllIl[lIIIlllIlIIlI[86]]);
                    Time.sleepTicks((int)lIIIlllIlIIlI[6]);
                    0;
                }
                String[] stringArray17 = new String[lIIIlllIlIIlI[0]];
                stringArray17[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[87]];
                if (n.lIlIIlIIIlIlIll(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (n.lIlIIlIIIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        n.aE();
                    }
                    if (n.lIlIIlIIIlIlIll(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (n.lIlIIlIIIlIllII(co, lIIIlllIlIIlI[0])) {
                            P.iH += lIIIlllIlIIlI[0];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlIIlI[0];
                            P.iH = lIIIlllIlIIlI[1];
                            cp = lIIIlllIlIIlI[1];
                        }
                        g.a(lIIIlllIIllIl[lIIIlllIlIIlI[88]], bW);
                    }
                }
            }
            g.a(bW);
        }
    }

    private static int lIlIIlIIIlIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void W() {
        block33: {
            d var27;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object var4;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[lIIIlllIlIIlI[0]];
                                                        nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[11];
                                                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[lIIIlllIlIIlI[0]];
                                                        nArray2[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[11];
                                                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[lIIIlllIlIIlI[0]];
                                                        nArray3[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[11];
                                                        if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIlIIlI[12])) break block23;
                                                    }
                                                    var4 = new d(lIIIlllIlIIlI[11], lIIIlllIlIIlI[12], lIIIlllIlIIlI[103]);
                                                    bA.add((d)var4);
                                                    0;
                                                }
                                                if (n.lIlIIlIIIlIllIl(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIIlllIIllIl[lIIIlllIlIIlI[110]]))) ? 1 : 0)) {
                                                    var27 = new d(lIIIlllIlIIlI[104], lIIIlllIlIIlI[15], lIIIlllIlIIlI[105]);
                                                    bA.add(var27);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIlllIlIIlI[0]];
                                                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[14];
                                                if (n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[lIIIlllIlIIlI[0]];
                                                    nArray4[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[14];
                                                    if (n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIlIIlI[6])) {
                                                        int[] nArray5 = new int[lIIIlllIlIIlI[0]];
                                                        nArray5[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[14];
                                                        var27 = new d(lIIIlllIlIIlI[14], lIIIlllIlIIlI[6] - Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIlIIlI[106]);
                                                        bA.add(var27);
                                                        0;
                                                    }
                                                }
                                                int[] nArray6 = new int[lIIIlllIlIIlI[0]];
                                                nArray6[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[9];
                                                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[lIIIlllIlIIlI[0]];
                                                nArray7[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[9];
                                                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[lIIIlllIlIIlI[0]];
                                                nArray8[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[9];
                                                if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIlIIlI[8])) break block25;
                                            }
                                            var27 = new d(lIIIlllIlIIlI[9], lIIIlllIlIIlI[8], lIIIlllIlIIlI[20]);
                                            bA.add(var27);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIlllIlIIlI[0]];
                                        nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[lIIIlllIlIIlI[0]];
                                        nArray9[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[lIIIlllIlIIlI[0]];
                                        nArray10[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[7];
                                        if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllIlIIlI[8])) break block27;
                                    }
                                    var27 = new d(lIIIlllIlIIlI[7], lIIIlllIlIIlI[8], lIIIlllIlIIlI[20]);
                                    bA.add(var27);
                                    0;
                                }
                                int[] nArray = new int[lIIIlllIlIIlI[0]];
                                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[lIIIlllIlIIlI[0]];
                                nArray11[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[lIIIlllIlIIlI[0]];
                                nArray12[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[10];
                                if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllIlIIlI[8])) break block29;
                            }
                            var27 = new d(lIIIlllIlIIlI[10], lIIIlllIlIIlI[8], lIIIlllIlIIlI[20]);
                            bA.add(var27);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIlIIlI[0]];
                        nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[14];
                        if (n.lIlIIlIIIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var27 = new d(lIIIlllIlIIlI[14], lIIIlllIlIIlI[6], lIIIlllIlIIlI[106]);
                            bA.add(var27);
                            0;
                        }
                        int[] nArray13 = new int[lIIIlllIlIIlI[0]];
                        nArray13[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[17];
                        if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[lIIIlllIlIIlI[0]];
                        nArray14[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[17];
                        if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray14).getQuantity(), lIIIlllIlIIlI[6])) break block31;
                    }
                    var27 = new d(lIIIlllIlIIlI[17], lIIIlllIlIIlI[6], h.bv);
                    bA.add(var27);
                    0;
                }
                int[] nArray = new int[lIIIlllIlIIlI[0]];
                nArray[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[lIIIlllIlIIlI[0]];
                nArray15[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
                if (!n.lIlIIlIIIlIlIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[lIIIlllIlIIlI[0]];
                nArray16[n.lIIIlllIlIIlI[1]] = lIIIlllIlIIlI[13];
                if (!n.lIlIIlIIIlIllII(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllIlIIlI[30])) break block33;
            }
            var27 = new d(lIIIlllIlIIlI[13], lIIIlllIlIIlI[66], lIIIlllIlIIlI[107]);
            bA.add(var27);
            0;
        }
    }

    static {
        n.lIlIIlIIIlIlIIl();
        n.lIlIIlIIIlIIlIl();
        ct = new WorldPoint(lIIIlllIlIIlI[112], lIIIlllIlIIlI[113], lIIIlllIlIIlI[1]);
        cu = new WorldPoint(lIIIlllIlIIlI[114], lIIIlllIlIIlI[115], lIIIlllIlIIlI[1]);
        cv = new WorldPoint(lIIIlllIlIIlI[116], lIIIlllIlIIlI[117], lIIIlllIlIIlI[1]);
        cw = new WorldPoint(lIIIlllIlIIlI[118], lIIIlllIlIIlI[119], lIIIlllIlIIlI[1]);
        cx = new WorldPoint(lIIIlllIlIIlI[120], lIIIlllIlIIlI[121], lIIIlllIlIIlI[1]);
        cy = new WorldPoint(lIIIlllIlIIlI[122], lIIIlllIlIIlI[123], lIIIlllIlIIlI[1]);
        cz = new WorldPoint(lIIIlllIlIIlI[124], lIIIlllIlIIlI[125], lIIIlllIlIIlI[1]);
        cA = new WorldPoint(lIIIlllIlIIlI[124], lIIIlllIlIIlI[126], lIIIlllIlIIlI[1]);
        cB = new WorldPoint(lIIIlllIlIIlI[127], lIIIlllIlIIlI[54], lIIIlllIlIIlI[1]);
        cC = new WorldPoint(lIIIlllIlIIlI[128], lIIIlllIlIIlI[129], lIIIlllIlIIlI[1]);
        bA = new ArrayList<d>();
        String[] stringArray = new String[lIIIlllIlIIlI[12]];
        stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[130]];
        stringArray[n.lIIIlllIlIIlI[0]] = lIIIlllIIllIl[lIIIlllIlIIlI[131]];
        stringArray[n.lIIIlllIlIIlI[3]] = lIIIlllIIllIl[lIIIlllIlIIlI[132]];
        stringArray[n.lIIIlllIlIIlI[5]] = lIIIlllIIllIl[lIIIlllIlIIlI[133]];
        stringArray[n.lIIIlllIlIIlI[6]] = lIIIlllIIllIl[lIIIlllIlIIlI[134]];
        stringArray[n.lIIIlllIlIIlI[15]] = lIIIlllIIllIl[lIIIlllIlIIlI[135]];
        bW = stringArray;
        cD = lIIIlllIlIIlI[136];
        cE = new WorldArea(lIIIlllIlIIlI[137], lIIIlllIlIIlI[113], lIIIlllIlIIlI[20], lIIIlllIlIIlI[12], lIIIlllIlIIlI[1]);
        cF = new WorldArea(lIIIlllIlIIlI[138], lIIIlllIlIIlI[139], lIIIlllIlIIlI[48], lIIIlllIlIIlI[30], lIIIlllIlIIlI[1]);
    }

    private static boolean lIlIIlIIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (n.lIlIIlIIIlIlllI(e.j(cD), lIIIlllIlIIlI[25])) {
            bl = lIIIlllIlIIlI[0];
            0;
            if ((0x9D ^ 0x98) == 0) {
                return false;
            }
        } else {
            bl = lIIIlllIlIIlI[1];
        }
        return bl;
    }

    private static boolean lIlIIlIIIlIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aE() {
        if (n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlIIlI[3])) {
            void var14;
            void var29;
            void var17;
            AccBuilderRat.c = lIIIlllIIllIl[lIIIlllIlIIlI[89]];
            WorldArea worldArea = new WorldArea(lIIIlllIlIIlI[90], lIIIlllIlIIlI[91], lIIIlllIlIIlI[92], lIIIlllIlIIlI[93], lIIIlllIlIIlI[1]);
            WorldPoint worldPoint = new WorldPoint(lIIIlllIlIIlI[94], lIIIlllIlIIlI[95], lIIIlllIlIIlI[1]);
            WorldArea worldArea2 = new WorldArea(lIIIlllIlIIlI[96], lIIIlllIlIIlI[97], lIIIlllIlIIlI[35], lIIIlllIlIIlI[6], lIIIlllIlIIlI[1]);
            WorldArea worldArea3 = new WorldArea(lIIIlllIlIIlI[98], lIIIlllIlIIlI[99], lIIIlllIlIIlI[19], lIIIlllIlIIlI[15], lIIIlllIlIIlI[1]);
            if (n.lIlIIlIIIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (n.lIlIIlIIIlIllIl(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aS).interact(lIIIlllIIllIl[lIIIlllIlIIlI[100]]);
                Time.sleepTicks((int)lIIIlllIlIIlI[15]);
                0;
            }
            if (n.lIlIIlIIIlIllIl(o.dU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)o.dV);
                0;
            }
            if (n.lIlIIlIIIlIlIll(o.dU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIlIIlIIIlIllIl(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(o.cZ));
                0;
                Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                0;
            }
            if (!n.lIlIIlIIIlIllIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.lIlIIlIIIlIlIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlllIlIIlI[0]];
                stringArray[n.lIIIlllIlIIlI[1]] = lIIIlllIIllIl[lIIIlllIlIIlI[101]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIllIl[lIIIlllIlIIlI[102]]);
                Time.sleepTicks((int)lIIIlllIlIIlI[6]);
                0;
            }
            if ((!n.lIlIIlIIIlIllIl(cE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || n.lIlIIlIIIlIlIll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && n.lIlIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlIIlI[3])) {
                Movement.walkTo((WorldPoint)ct);
                0;
                Time.sleepTicks((int)lIIIlllIlIIlI[0]);
                0;
            }
        }
    }

    @Override
    public boolean X() {
        return lIIIlllIlIIlI[1];
    }

    private static boolean lIlIIlIIIlIllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String Z() {
        return lIIIlllIIllIl[lIIIlllIlIIlI[109]];
    }

    private static boolean lIlIIlIIlIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlIIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIIlIIIIIlIIl(String var15, String var28) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var13 = var28.toCharArray();
        int var22 = lIIIlllIlIIlI[1];
        char[] var3 = var15.toCharArray();
        int var8 = var3.length;
        int var16 = lIIIlllIlIIlI[1];
        while (n.lIlIIlIIIlIllII(var16, var8)) {
            char var10 = var3[var16];
            var6.append((char)(var10 ^ var13[var22 % var13.length]));
            0;
            ++var22;
            ++var16;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean lIlIIlIIIllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIIllIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIIIIIlll(String var7, String var9) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIIlI[19]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIIIlllIlIIlI[3], var30);
            return new String(var21.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIIlIIlIl() {
        lIIIlllIIllIl = new String[lIIIlllIlIIlI[140]];
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[1]] = n."Finished buying items, switching back to quest";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[0]] = n."Drop";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[3]] = n."Nav to bank";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[5]] = n."Handling banking";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[6]] = n."We are missing runes, switching to BUYING";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[15]] = n."We are missing quest supplies, switching to BUYING";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[12]] = n."Drink";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[16]] = n."Eat";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[19]] = n."King Bolren";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[25]] = n."Nav to commander";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[20]] = n."Commander Montai";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[27]] = n."Nav to tracker";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[28]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[23]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[29]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[30]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[31]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[32]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[33]] = n."Tracker gnome 2";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[35]] = n."Nav to tracker";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[36]] = n."Tracker gnome 1";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[38]] = n."Nav to tracker";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[39]] = n."Tracker gnome 3";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[40]] = n."Nav to ballista";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[41]] = n."Firing";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[42]] = n."Ballista";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[43]] = n."Fire";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[45]] = n."0001";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[46]] = n."0002";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[47]] = n."0003";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[48]] = n."0004";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[55]] = n."Nav to crumble";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[56]] = n."Crumbled wall";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[57]] = n."Climb-over";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[60]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[61]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[62]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[63]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[64]] = n."Door";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[65]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[66]] = n."Ladder";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[67]] = n."Climb-up";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[68]] = n."Ladder";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[69]] = n."Climb-up";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[70]] = n."Grab orb";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[2]] = n."Closed chest";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[71]] = n."Closed chest";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[72]] = n."Open";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[73]] = n."Open chest";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[74]] = n."Open chest";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[24]] = n."Search";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[75]] = n."King Bolren";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[76]] = n."Travel to final fight";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[77]] = n."Khazard warlord";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[78]] = n."Attack";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[79]] = n."Khazard warlord";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[80]] = n."Attack";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[81]] = n."Handle fight";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[82]] = n."Drink";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[83]] = n."Orbs of protection";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[84]] = n."Taking orbs";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[85]] = n."Orbs of protection";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[86]] = n."Take";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[87]] = n."Orbs of protection";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[88]] = n."King Bolren";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[89]] = n."Nav to start";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[100]] = n."Castle Wars";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[101]] = n."Loose Railing";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[102]] = n."Squeeze-through";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[109]] = n."Tree Gnome Village";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[110]] = n."ring of wealth (";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[111]] = n."trooper";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[130]] = n."Can I help at all?";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[131]] = n."I would be glad to help.";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[132]] = n."Ok, I'll gather some wood.";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[133]] = n."I'll try my best.";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[134]] = n."I will find the warlord and bring back the orbs.";
        n.lIIIlllIIllIl[n.lIIIlllIlIIlI[135]] = n."Yes.";
    }

    private static boolean lIlIIlIIIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIlIIIIIlIII(String var2, String var5) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIIlllIlIIlI[3], var23);
            return new String(var20.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIlIIIlIlIIl() {
        lIIIlllIlIIlI = new int[141];
        n.lIIIlllIlIIlI[0] = 1;
        n.lIIIlllIlIIlI[1] = (0x2D ^ 0x21) & ~(0x9B ^ 0x97);
        n.lIIIlllIlIIlI[2] = 0x7B ^ 0x56;
        n.lIIIlllIlIIlI[3] = 2;
        n.lIIIlllIlIIlI[4] = -(0xFFFFECF9 & 0x572E) & (0xFFFFFFFF & 0x57AF);
        n.lIIIlllIlIIlI[5] = 3;
        n.lIIIlllIlIIlI[6] = 3 ^ (0x81 ^ 0x86);
        n.lIIIlllIlIIlI[7] = -(0xFFFFBDD9 & 0x7F37) & (0xFFFFFFBF & 0x3F7E);
        n.lIIIlllIlIIlI[8] = -(0xFFFFBDFE & 0x6E17) & (0xFFFFBFFD & 0x6FFF);
        n.lIIIlllIlIIlI[9] = -(0xFFFFFD5B & 0x5BF5) & (0xFFFFFB7F & 0x5FFD);
        n.lIIIlllIlIIlI[10] = 0xFFFFA7AE & 0x5A7B;
        n.lIIIlllIlIIlI[11] = 0xFFFF9DFF & 0x67E7;
        n.lIIIlllIlIIlI[12] = 0x3D ^ 0x3B;
        n.lIIIlllIlIIlI[13] = -(0xFFFFFFDF & 0x40B9) & (0xFFFFDFDF & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[14] = -(0xFFFFD6EF & 0x3D79) & (0xFFFFFFFE & 0x1DEB);
        n.lIIIlllIlIIlI[15] = 0x66 ^ 0x63;
        n.lIIIlllIlIIlI[16] = 0x77 ^ 0x70;
        n.lIIIlllIlIIlI[17] = -(0xFFFFEB2F & 0x56FF) & (0xFFFFFFFF & 0x737F);
        n.lIIIlllIlIIlI[18] = 0xFFFF89FB & 0x777F;
        n.lIIIlllIlIIlI[19] = 0x2A ^ 0x22;
        n.lIIIlllIlIIlI[20] = 0x6C ^ 0x27 ^ (0xD5 ^ 0x94);
        n.lIIIlllIlIIlI[21] = 0xFFFFE9FF & 0x17F4;
        n.lIIIlllIlIIlI[22] = -(0xFFFF9AE4 & 0x7F3F) & (0xFFFFDFFF & 0x3FFF);
        n.lIIIlllIlIIlI[23] = 0x48 ^ 0x25 ^ (0x3B ^ 0x5B);
        n.lIIIlllIlIIlI[24] = 1 ^ 0x33;
        n.lIIIlllIlIIlI[25] = 2 ^ 0x68 ^ (0xED ^ 0x8E);
        n.lIIIlllIlIIlI[26] = -(34 + 42 - 20 + 107) & (0xFFFFC6FF & 0x3BFA);
        n.lIIIlllIlIIlI[27] = 1 ^ 0xA;
        n.lIIIlllIlIIlI[28] = 0x76 ^ 0x7A;
        n.lIIIlllIlIIlI[29] = 0x31 ^ 0x3F;
        n.lIIIlllIlIIlI[30] = 0x33 ^ 0x3C;
        n.lIIIlllIlIIlI[31] = 0x50 ^ 0xC ^ (0xC1 ^ 0x8D);
        n.lIIIlllIlIIlI[32] = 166 + 41 - 155 + 119 ^ 118 + 128 - 127 + 67;
        n.lIIIlllIlIIlI[33] = 0x83 ^ 0x91;
        n.lIIIlllIlIIlI[34] = -(0xFFFFFD9B & 0xEED) & (0xFFFFDEFF & 0x2FDF);
        n.lIIIlllIlIIlI[35] = 0x8B ^ 0x98;
        n.lIIIlllIlIIlI[36] = 91 + 150 - 37 + 11 ^ 0 + 87 - 38 + 146;
        n.lIIIlllIlIIlI[37] = -(0xFFFFFC53 & 0x7BAF) & (0xFFFFFBFF & 0x7E5B);
        n.lIIIlllIlIIlI[38] = 1 ^ 0x14;
        n.lIIIlllIlIIlI[39] = 81 + 6 - 79 + 161 ^ 173 + 184 - 181 + 15;
        n.lIIIlllIlIIlI[40] = 98 + 176 - 184 + 95 ^ 53 + 55 - -38 + 28;
        n.lIIIlllIlIIlI[41] = 0x8F ^ 0x97;
        n.lIIIlllIlIIlI[42] = 0x57 ^ 0x23 ^ (0x7C ^ 0x11);
        n.lIIIlllIlIIlI[43] = 0x9A ^ 0x8F ^ (0x1B ^ 0x14);
        n.lIIIlllIlIIlI[44] = -(0xFFFFDCB3 & 0x7F4E) & (0xFFFFDFFB & 0x7E5F);
        n.lIIIlllIlIIlI[45] = 99 + 73 - 68 + 117 ^ 151 + 48 - 122 + 121;
        n.lIIIlllIlIIlI[46] = 30 + 97 - 18 + 52 ^ 173 + 145 - 314 + 185;
        n.lIIIlllIlIIlI[47] = 0x33 ^ 0x74 ^ (0x70 ^ 0x2A);
        n.lIIIlllIlIIlI[48] = 0xBD ^ 0xA3;
        n.lIIIlllIlIIlI[49] = 0xFFFFE9DB & 0x1FED;
        n.lIIIlllIlIIlI[50] = 0xFFFFFCB7 & 0xFFE;
        n.lIIIlllIlIIlI[51] = -(0xFFFFE537 & 0x7EFA) & (0xFFFFEFFF & 0x7DF5);
        n.lIIIlllIlIIlI[52] = 0xFFFFCFFB & 0x3CB7;
        n.lIIIlllIlIIlI[53] = -(0xFFFFBB5E & 0x76BB) & (0xFFFFFBFF & 0x3FDF);
        n.lIIIlllIlIIlI[54] = 0xFFFF9DF5 & 0x6EBF;
        n.lIIIlllIlIIlI[55] = 0x97 ^ 0x88;
        n.lIIIlllIlIIlI[56] = 0x89 ^ 0xA9;
        n.lIIIlllIlIIlI[57] = 0x72 ^ 0x39 ^ (0x31 ^ 0x5B);
        n.lIIIlllIlIIlI[58] = 0xFFFFB9EF & 0x4FDB;
        n.lIIIlllIlIIlI[59] = -(0xFFFFAF5F & 0x71A1) & (0xFFFFFDBB & 0x2FFD);
        n.lIIIlllIlIIlI[60] = 7 ^ 0x2D ^ (5 ^ 0xD);
        n.lIIIlllIlIIlI[61] = 0x7E ^ 0x5D;
        n.lIIIlllIlIIlI[62] = 0x7B ^ 0x5F;
        n.lIIIlllIlIIlI[63] = 0x38 ^ 3 ^ (0xA6 ^ 0xB8);
        n.lIIIlllIlIIlI[64] = 0xBA ^ 0xB0 ^ (0x75 ^ 0x59);
        n.lIIIlllIlIIlI[65] = 0x70 ^ 0x2C ^ (0x4C ^ 0x37);
        n.lIIIlllIlIIlI[66] = 0x3D ^ 0x15;
        n.lIIIlllIlIIlI[67] = 0x86 ^ 0xAF;
        n.lIIIlllIlIIlI[68] = 35 + 137 - 43 + 32 ^ 69 + 122 - 176 + 124;
        n.lIIIlllIlIIlI[69] = 36 + 63 - 34 + 105 ^ 20 + 101 - 40 + 48;
        n.lIIIlllIlIIlI[70] = 0x43 ^ 3 ^ (0xAC ^ 0xC0);
        n.lIIIlllIlIIlI[71] = 0x6A ^ 0x43 ^ (0x30 ^ 0x37);
        n.lIIIlllIlIIlI[72] = 0x1A ^ 0x35;
        n.lIIIlllIlIIlI[73] = 69 + 173 - 179 + 119 ^ 52 + 130 - 131 + 83;
        n.lIIIlllIlIIlI[74] = 0xB8 ^ 0x89;
        n.lIIIlllIlIIlI[75] = 88 + 152 - 155 + 81 ^ 41 + 11 - -7 + 90;
        n.lIIIlllIlIIlI[76] = 0x47 ^ 0x21 ^ (0x49 ^ 0x1B);
        n.lIIIlllIlIIlI[77] = 0x5A ^ 0x6F;
        n.lIIIlllIlIIlI[78] = 145 + 29 - 105 + 91 ^ 114 + 105 - 145 + 76;
        n.lIIIlllIlIIlI[79] = 72 + 8 - -40 + 39 ^ 51 + 167 - 64 + 14;
        n.lIIIlllIlIIlI[80] = 0x4E ^ 0x76;
        n.lIIIlllIlIIlI[81] = 99 + 73 - 48 + 29 ^ 13 + 134 - 74 + 87;
        n.lIIIlllIlIIlI[82] = 0x43 ^ 0x79;
        n.lIIIlllIlIIlI[83] = 0x7D ^ 0x46;
        n.lIIIlllIlIIlI[84] = 0x79 ^ 0x26 ^ (0x43 ^ 0x20);
        n.lIIIlllIlIIlI[85] = 0xF ^ 0x32;
        n.lIIIlllIlIIlI[86] = 0x24 ^ 0x1A;
        n.lIIIlllIlIIlI[87] = 0xB ^ 0x35 ^ 1;
        n.lIIIlllIlIIlI[88] = 5 ^ 0x45;
        n.lIIIlllIlIIlI[89] = 0xFF ^ 0xBE;
        n.lIIIlllIlIIlI[90] = 0xFFFFAB7A & 0x5DE7;
        n.lIIIlllIlIIlI[91] = -(0xFFFFFE1F & 0x25ED) & (0xFFFFBFFD & 0x6FFE);
        n.lIIIlllIlIIlI[92] = 136 + 64 - 112 + 72 + (0x25 ^ 0x4C) - (0x52 ^ 0x16) + (0x28 ^ 9);
        n.lIIIlllIlIIlI[93] = 33 + 41 - 42 + 122;
        n.lIIIlllIlIIlI[94] = 0xFFFFFFE7 & 0x9FB;
        n.lIIIlllIlIIlI[95] = -(0xFFFFF3CB & 0x3D3D) & (0xFFFFFDDF & 0x3F7B);
        n.lIIIlllIlIIlI[96] = 0xFFFF99FF & 0x6FD7;
        n.lIIIlllIlIIlI[97] = 0xFFFFEF5B & 0x1CF6;
        n.lIIIlllIlIIlI[98] = -(0xFFFFE51F & 0x7EED) & (0xFFFFFDFE & 0x6FDF);
        n.lIIIlllIlIIlI[99] = 0xFFFFFCFC & 0xF57;
        n.lIIIlllIlIIlI[100] = 0xFC ^ 0xBE;
        n.lIIIlllIlIIlI[101] = 0xED ^ 0xAE;
        n.lIIIlllIlIIlI[102] = 0x18 ^ 0x7E ^ (0x36 ^ 0x14);
        n.lIIIlllIlIIlI[103] = 98 + 29 - -10 + 63;
        n.lIIIlllIlIIlI[104] = -(0xFFFFF9C4 & 0x573F) & (0xFFFFFFFF & 0x7FCF);
        n.lIIIlllIlIIlI[105] = -(0xFFFFEF5F & 0x1CB7) & (0xFFFFEDBE & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[106] = 0xFFFFBEFD & 0x7B9A;
        n.lIIIlllIlIIlI[107] = -(0xFFFFFD5F & 0x7EE9) & (0xFFFFFFCC & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[108] = 0x5F ^ 0x3B;
        n.lIIIlllIlIIlI[109] = 0x6D ^ 0x28;
        n.lIIIlllIlIIlI[110] = 0xE3 ^ 0xA2 ^ (0x47 ^ 0x40);
        n.lIIIlllIlIIlI[111] = 0x21 ^ 0x66;
        n.lIIIlllIlIIlI[112] = -(0xFFFFDFD5 & 0x362F) & (0xFFFFDFFF & 0x3FEF);
        n.lIIIlllIlIIlI[113] = -(0xFFFFDBA7 & 0x7479) & (0xFFFFFD7F & 0x5EFF);
        n.lIIIlllIlIIlI[114] = 0xFFFF8BFC & 0x7DDB;
        n.lIIIlllIlIIlI[115] = 0xFFFFDDE7 & 0x2E9F;
        n.lIIIlllIlIIlI[116] = -(0xFFFFFD6C & 0x22B7) & (0xFFFFADFF & 0x7BFF);
        n.lIIIlllIlIIlI[117] = -(0xFFFFFECF & 0x7133) & (0xFFFFFCBA & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[118] = -(0xFFFFFEEB & 0x3735) & (0xFFFFBFFE & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[119] = -(0xFFFFF2CB & 0x3F7E) & (0xFFFFBEFD & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[120] = -(0xFFFFF5B7 & 0x3A6D) & (0xFFFFFBEF & 0x3DF7);
        n.lIIIlllIlIIlI[121] = 0xFFFFCFBE & 0x3CFD;
        n.lIIIlllIlIIlI[122] = -(0xFFFFFF7D & 0x62BF) & (0xFFFFFBFC & 0x6FFF);
        n.lIIIlllIlIIlI[123] = -(0xFFFFD517 & 0x3AEB) & (0xFFFF9CE6 & 0x7FBF);
        n.lIIIlllIlIIlI[124] = -(0xFFFFB6B7 & 0x6F79) & (0xFFFFEFFF & 0x3FFE);
        n.lIIIlllIlIIlI[125] = -(0xFFFFF5D5 & 0x6A3B) & (0xFFFFECDF & 0x7FB9);
        n.lIIIlllIlIIlI[126] = 0xFFFFFCB7 & 0xFFA;
        n.lIIIlllIlIIlI[127] = 0xFFFF9BD7 & 0x6DEF;
        n.lIIIlllIlIIlI[128] = 0xFFFFABDB & 0x5DBE;
        n.lIIIlllIlIIlI[129] = 0xFFFFCFE2 & 0x3CFF;
        n.lIIIlllIlIIlI[130] = 0xEA ^ 0xA2;
        n.lIIIlllIlIIlI[131] = 0x6C ^ 0x25;
        n.lIIIlllIlIIlI[132] = 0xED ^ 0x81 ^ (0xA7 ^ 0x81);
        n.lIIIlllIlIIlI[133] = 169 + 145 - 184 + 74 ^ 83 + 113 - 140 + 79;
        n.lIIIlllIlIIlI[134] = 0x18 ^ 0x31 ^ (0x40 ^ 0x25);
        n.lIIIlllIlIIlI[135] = 0x43 ^ 0xE;
        n.lIIIlllIlIIlI[136] = 0x75 ^ 0x1A;
        n.lIIIlllIlIIlI[137] = -(0xFFFFF39E & 0x7E77) & (0xFFFFFBFF & Short.MAX_VALUE);
        n.lIIIlllIlIIlI[138] = 0xFFFF9FFB & 0x69D5;
        n.lIIIlllIlIIlI[139] = 0xFFFFAFFF & 0x5C59;
        n.lIIIlllIlIIlI[140] = 28 + 236 - 206 + 197 ^ 6 + 35 - -72 + 64;
    }

    private static boolean lIlIIlIIIllIllI(Object object) {
        return object == null;
    }

    @Override
    public int Y() {
        try {
            n.aD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 2) {
            return (0x4B ^ 0x52) & ~(0x27 ^ 0x3E);
        }
        return lIIIlllIlIIlI[108];
    }
}

