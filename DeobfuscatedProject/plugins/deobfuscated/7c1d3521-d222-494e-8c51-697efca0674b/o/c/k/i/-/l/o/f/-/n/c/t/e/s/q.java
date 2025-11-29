/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.h;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class q {
    static /* synthetic */ int cY;
    private static /* synthetic */ String[] llIIlIIIlI;
    static /* synthetic */ WorldPoint cU;
    static /* synthetic */ WorldArea cT;
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] llIIlIIIll;
    private static /* synthetic */ int[] cZ;
    static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ boolean cJ;
    static /* synthetic */ int cX;
    static /* synthetic */ WorldPoint cS;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int cW;

    private static boolean lIlIlIIlIllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void g(String string) {
        block52: {
            String llllllllllllllllllIlIIlllIlllIII;
            block53: {
                block56: {
                    block51: {
                        block54: {
                            block55: {
                                void llllllllllllllllllIlIIlllIllIlll;
                                BankLocation bankLocation = BankLocation.getNearest();
                                if (q.lIlIlIIlIIlIl(bankLocation) && q.lIlIlIIIllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[118]];
                                    a.a(bankLocation);
                                }
                                if (!q.lIlIlIIlIIlIl(llllllllllllllllllIlIIlllIllIlll) || !q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block52;
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[119]];
                                if (q.lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIIll[120]);
                                    0;
                                    Time.sleepTicks((int)e.c(llIIlIIIll[5], llIIlIIIll[8]));
                                    0;
                                }
                                if (!q.lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) break block52;
                                if (q.lIlIlIIlIlIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIIll[5]);
                                    0;
                                }
                                if (!q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIII.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[121]]) ? 1 : 0)) break block53;
                                if (q.lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    h.X();
                                }
                                int[] nArray = new int[llIIlIIIll[0]];
                                nArray[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                if (!q.lIlIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                int[] nArray2 = new int[llIIlIIIll[0]];
                                nArray2[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block54;
                                int[] nArray3 = new int[llIIlIIIll[0]];
                                nArray3[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block55;
                                int[] nArray4 = new int[llIIlIIIll[0]];
                                nArray4[q.llIIlIIIll[3]] = llIIlIIIll[122];
                                if (!q.lIlIlIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block54;
                            }
                            q.h(llIIlIIIlI[llIIlIIIll[123]]);
                            System.out.println(llIIlIIIlI[llIIlIIIll[124]]);
                            bt = llIIlIIIll[0];
                            return;
                        }
                        int[] nArray = new int[llIIlIIIll[0]];
                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[102];
                        if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIlIIIll[0]];
                            nArray5[q.llIIlIIIll[3]] = llIIlIIIll[102];
                            if (q.lIlIlIIIllIlI(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIIlIIIll[0]];
                                nArray6[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[llIIlIIIll[0]];
                                    nArray7[q.llIIlIIIll[3]] = llIIlIIIll[122];
                                    if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                        do {
                                            int[] nArray8 = new int[llIIlIIIll[0]];
                                            nArray8[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                            if (!q.lIlIlIIIllIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block51;
                                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[125]];
                                            int[] nArray9 = new int[llIIlIIIll[0]];
                                            nArray9[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                            if (q.lIlIlIIIllIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                                a.a(llIIlIIIll[101], llIIlIIIll[0]);
                                            }
                                            int[] nArray10 = new int[llIIlIIIll[0]];
                                            nArray10[q.llIIlIIIll[3]] = llIIlIIIll[122];
                                            if (q.lIlIlIIIllIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(llIIlIIIll[122], llIIlIIIll[0]);
                                            }
                                            int[] nArray11 = new int[llIIlIIIll[0]];
                                            nArray11[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                            if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                                int[] nArray12 = new int[llIIlIIIll[0]];
                                                nArray12[q.llIIlIIIll[3]] = llIIlIIIll[122];
                                                if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                                    int[] nArray13 = new int[llIIlIIIll[0]];
                                                    nArray13[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                                    int[] nArray14 = new int[llIIlIIIll[0]];
                                                    nArray14[q.llIIlIIIll[3]] = llIIlIIIll[122];
                                                    Inventory.getFirst((int[])nArray13).useOn(Inventory.getFirst((int[])nArray14));
                                                    Time.sleepTicks((int)llIIlIIIll[4]);
                                                    0;
                                                }
                                            }
                                            if (q.lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                int[] nArray15 = new int[llIIlIIIll[0]];
                                                nArray15[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    a.a(llIIlIIIll[102], llIIlIIIll[0]);
                                                }
                                            }
                                            int[] nArray16 = new int[llIIlIIIll[0]];
                                            nArray16[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                            if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                                                if (q.lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                                    a.a();
                                                    Time.sleepTicks((int)llIIlIIIll[9]);
                                                    0;
                                                }
                                                if (q.lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                    Bank.depositInventory();
                                                    Time.sleepTicks((int)llIIlIIIll[5]);
                                                    0;
                                                    0;
                                                    if (2 == 1) {
                                                        return;
                                                    }
                                                    break block51;
                                                }
                                            }
                                            Time.sleepTicks((int)llIIlIIIll[0]);
                                            0;
                                            0;
                                        } while (((0x50 ^ 0x61) & ~(3 ^ 0x32)) <= 0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray = new int[llIIlIIIll[0]];
                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block56;
                    int[] nArray17 = new int[llIIlIIIll[0]];
                    nArray17[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block53;
                    int[] nArray18 = new int[llIIlIIIll[0]];
                    nArray18[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIlllII(Bank.getFirst((int[])nArray18).getQuantity(), llIIlIIIll[126])) break block53;
                }
                int[] nArray = new int[llIIlIIIll[0]];
                nArray[q.llIIlIIIll[3]] = llIIlIIIll[92];
                if (q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    q.h(llIIlIIIlI[llIIlIIIll[127]]);
                    System.out.println(llIIlIIIlI[llIIlIIIll[128]]);
                    bt = llIIlIIIll[0];
                    return;
                }
            }
            if (q.lIlIlIIIllIlI(cJ ? 1 : 0)) {
                h.X();
                cJ = llIIlIIIll[0];
            }
            while (q.lIlIlIIIllIlI(h.bu ? 1 : 0) && q.lIlIlIIIllIlI(AccBuilderSotf.d ? 1 : 0)) {
                if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIII.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[129]]) ? 1 : 0)) {
                    h.d(llIIlIIIlI[llIIlIIIll[130]]);
                }
                if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIII.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[131]]) ? 1 : 0)) {
                    h.d(llIIlIIIlI[llIIlIIIll[132]]);
                }
                Time.sleepTicks((int)llIIlIIIll[0]);
                0;
                0;
                if (null == null) continue;
                return;
            }
            if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIII.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[133]]) ? 1 : 0)) {
                int[] nArray = new int[llIIlIIIll[0]];
                nArray[q.llIIlIIIll[3]] = llIIlIIIll[92];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdrawAll((int)llIIlIIIll[92], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    Time.sleepTicks((int)llIIlIIIll[4]);
                    0;
                    int[] nArray19 = new int[llIIlIIIll[0]];
                    nArray19[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[llIIlIIIll[0]];
                        nArray20[q.llIIlIIIll[3]] = llIIlIIIll[92];
                        Inventory.getFirst((int[])nArray20).interact(llIIlIIIlI[llIIlIIIll[134]]);
                        Time.sleepTicks((int)llIIlIIIll[0]);
                        0;
                    }
                    if (q.lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)llIIlIIIll[9]);
                        0;
                    }
                }
            }
            if (q.lIlIlIIIllIlI(q.an() ? 1 : 0) && (!q.lIlIlIIIllIlI(q.f(llIIlIIIlI[llIIlIIIll[135]]) ? 1 : 0) || q.lIlIlIIIllIIl(q.f(llIIlIIIlI[llIIlIIIll[136]]) ? 1 : 0))) {
                q.h(llIIlIIIlI[llIIlIIIll[137]]);
                System.out.println(llIIlIIIlI[llIIlIIIll[138]]);
                bt = llIIlIIIll[0];
                return;
            }
            if (q.lIlIlIIIllIIl(q.an() ? 1 : 0) && (!q.lIlIlIIIllIlI(q.f(llIIlIIIlI[llIIlIIIll[139]]) ? 1 : 0) || q.lIlIlIIIllIIl(q.f(llIIlIIIlI[llIIlIIIll[140]]) ? 1 : 0))) {
                while (q.lIlIlIIIllIlI(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a(llIIlIIIll[16], llIIlIIIll[141]);
                        a.b(f.ba, llIIlIIIll[4]);
                        Bank.withdraw(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[199]]), (int)llIIlIIIll[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIIlIIIll[0]);
                        0;
                    }
                    if (q.lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (q.lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cU), llIIlIIIll[8])) {
                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[142]];
                        Movement.walkTo((WorldPoint)cU);
                        0;
                        Time.sleepTicks((int)llIIlIIIll[0]);
                        0;
                    }
                    Time.sleepTicks((int)llIIlIIIll[0]);
                    0;
                    0;
                    if (-1 == -1) continue;
                    return;
                }
                if (q.lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[143]];
                    if (q.lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIIll[120]);
                        0;
                        Time.sleepTicks((int)e.c(llIIlIIIll[5], llIIlIIIll[8]));
                        0;
                    }
                    if (q.lIlIlIIlIlIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIIlIIIll[5]);
                        0;
                    }
                    if (q.lIlIlIIIlllII(Vars.getBit((int)llIIlIIIll[58]), llIIlIIIll[15])) {
                        a.a(llIIlIIIll[16], llIIlIIIll[144]);
                    }
                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIII.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[145]]) ? 1 : 0)) {
                        Bank.withdrawAll((int)llIIlIIIll[92], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIIlIIIll[4]);
                        0;
                    }
                    int[] nArray = new int[llIIlIIIll[0]];
                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        e.l(llIIlIIIll[92]);
                        if (q.lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIlIIIll[9]);
                            0;
                        }
                    }
                    a.a(llIIlIIIll[146], llIIlIIIll[27]);
                    a.a(llIIlIIIll[147], llIIlIIIll[13]);
                    a.a(llIIlIIIll[148], llIIlIIIll[13]);
                    a.a(llIIlIIIll[149], llIIlIIIll[13]);
                    a.a(llIIlIIIll[150], llIIlIIIll[13]);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIIIll[0]];
        nArray[q.llIIlIIIll[3]] = llIIlIIIll[146];
        if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIIlIIIll[0]];
            nArray2[q.llIIlIIIll[3]] = llIIlIIIll[151];
            if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIIll[0]];
                nArray3[q.llIIlIIIll[3]] = llIIlIIIll[152];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIIIll[0]];
                    nArray4[q.llIIlIIIll[3]] = llIIlIIIll[153];
                    if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray4) ? 1 : 0) && q.lIlIlIIIllIIl(Bank.contains(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[198]])) ? 1 : 0)) {
                        n2 = llIIlIIIll[0];
                        0;
                        if ((66 + 78 - 93 + 89 ^ 124 + 55 - 63 + 21) > 0) return n2 != 0;
                        return ((3 ^ (0x3E ^ 0x68)) & (0x39 ^ 0x30 ^ (6 ^ 0x5A) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = llIIlIIIll[3];
        return n2 != 0;
    }

    private static boolean lIlIlIIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIIIlIIlI(String llllllllllllllllllIlIIllIllllIII, String llllllllllllllllllIlIIllIlllIlll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIllIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIllIlllllII.init(llIIlIIIll[4], llllllllllllllllllIlIIllIlllllIl);
            return new String(llllllllllllllllllIlIIllIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIllIllllIll) {
            llllllllllllllllllIlIIllIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlIllII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlIIIlIlIl() {
        llIIlIIIlI = new String[llIIlIIIll[216]];
        q.llIIlIIIlI[q.llIIlIIIll[3]] = q."Buying items";
        q.llIIlIIIlI[q.llIIlIIIll[0]] = q."Finished buying items, switching back to melee training";
        q.llIIlIIIlI[q.llIIlIIIll[4]] = q."Portal";
        q.llIIlIIIlI[q.llIIlIIIll[5]] = q."Castle Wars";
        q.llIIlIIIlI[q.llIIlIIIll[7]] = q."Wear";
        q.llIIlIIIlI[q.llIIlIIIll[8]] = q."Exiting nmz dream";
        q.llIIlIIIlI[q.llIIlIIIll[9]] = q."Potion";
        q.llIIlIIIlI[q.llIIlIIIll[10]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[11]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[12]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[13]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[14]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[17]] = q."Handle coffer";
        q.llIIlIIIlI[q.llIIlIIIll[18]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[19]] = q."Unlock";
        q.llIIlIIIlI[q.llIIlIIIll[20]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[21]] = q."Unlock";
        q.llIIlIIIlI[q.llIIlIIIll[22]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[23]] = q."Use";
        q.llIIlIIIlI[q.llIIlIIIll[24]] = q."Deposit money.";
        q.llIIlIIIlI[q.llIIlIIIll[27]] = q."Nav to nmz start";
        q.llIIlIIIlI[q.llIIlIIIll[29]] = q."Open store";
        q.llIIlIIIlI[q.llIIlIIIll[30]] = q."Rewards chest";
        q.llIIlIIIlI[q.llIIlIIIll[31]] = q."Search";
        q.llIIlIIIlI[q.llIIlIIIll[32]] = q."Buying";
        q.llIIlIIIlI[q.llIIlIIIll[33]] = q."Buy-50";
        q.llIIlIIIlI[q.llIIlIIIll[34]] = q."null";
        q.llIIlIIIlI[q.llIIlIIIll[35]] = q."Overload (1)";
        q.llIIlIIIlI[q.llIIlIIIll[36]] = q."Getting overloads";
        q.llIIlIIIlI[q.llIIlIIIll[37]] = q."Overload potion";
        q.llIIlIIIlI[q.llIIlIIIll[15]] = q."Take";
        q.llIIlIIIlI[q.llIIlIIIll[40]] = q."Handle coffer";
        q.llIIlIIIlI[q.llIIlIIIll[41]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[42]] = q."Unlock";
        q.llIIlIIIlI[q.llIIlIIIll[43]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[44]] = q."Unlock";
        q.llIIlIIIlI[q.llIIlIIIll[45]] = q."Dominic's coffer";
        q.llIIlIIIlI[q.llIIlIIIll[46]] = q."Use";
        q.llIIlIIIlI[q.llIIlIIIll[47]] = q."Deposit money.";
        q.llIIlIIIlI[q.llIIlIIIll[49]] = q."Creating dream";
        q.llIIlIIIlI[q.llIIlIIIll[50]] = q."Dominic Onion";
        q.llIIlIIIlI[q.llIIlIIIll[51]] = q."Dominic Onion";
        q.llIIlIIIlI[q.llIIlIIIll[52]] = q."Dream";
        q.llIIlIIIlI[q.llIIlIIIll[53]] = q."Dominic Onion";
        q.llIIlIIIlI[q.llIIlIIIll[54]] = q."Dream";
        q.llIIlIIIlI[q.llIIlIIIll[55]] = q."Rumble";
        q.llIIlIIIlI[q.llIIlIIIll[56]] = q."Customisable - hard";
        q.llIIlIIIlI[q.llIIlIIIll[57]] = q."Yes";
        q.llIIlIIIlI[q.llIIlIIIll[60]] = q."Potion";
        q.llIIlIIIlI[q.llIIlIIIll[61]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[62]] = q."Handling boss selection";
        q.llIIlIIIlI[q.llIIlIIIll[65]] = q."Vampyre Slayer";
        q.llIIlIIIlI[q.llIIlIIIll[66]] = q."Toggle vamp";
        q.llIIlIIIlI[q.llIIlIIIll[67]] = q."Toggle";
        q.llIIlIIIlI[q.llIIlIIIll[68]] = q."Lost City";
        q.llIIlIIIlI[q.llIIlIIIll[69]] = q."Toggle tree spirit";
        q.llIIlIIIlI[q.llIIlIIIll[70]] = q."Toggle";
        q.llIIlIIIlI[q.llIIlIIIll[71]] = q."Fight Arena";
        q.llIIlIIIlI[q.llIIlIIIll[72]] = q."Toggle bouncer";
        q.llIIlIIIlI[q.llIIlIIIll[73]] = q."Toggle";
        q.llIIlIIIlI[q.llIIlIIIll[74]] = q."Grand Tree";
        q.llIIlIIIlI[q.llIIlIIIll[75]] = q."Toggle black demon";
        q.llIIlIIIlI[q.llIIlIIIll[76]] = q."Toggle";
        q.llIIlIIIlI[q.llIIlIIIll[77]] = q."Tree Gnome Village";
        q.llIIlIIIlI[q.llIIlIIIll[78]] = q."Toggle khazard warlord";
        q.llIIlIIIlI[q.llIIlIIIll[79]] = q."Toggle";
        q.llIIlIIIlI[q.llIIlIIIll[80]] = q."Entering dream";
        q.llIIlIIIlI[q.llIIlIIIll[81]] = q."Dominic Onion";
        q.llIIlIIIlI[q.llIIlIIIll[82]] = q."set tile";
        q.llIIlIIIlI[q.llIIlIIIll[83]] = q."Power surge";
        q.llIIlIIIlI[q.llIIlIIIll[84]] = q."Walk to middle";
        q.llIIlIIIlI[q.llIIlIIIll[85]] = q."Power surge";
        q.llIIlIIIlI[q.llIIlIIIll[86]] = q."Afking";
        q.llIIlIIIlI[q.llIIlIIIll[87]] = q."Attack";
        q.llIIlIIIlI[q.llIIlIIIll[88]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[89]] = q."Power surge";
        q.llIIlIIIlI[q.llIIlIIIll[90]] = q."Power surge";
        q.llIIlIIIlI[q.llIIlIIIll[91]] = q."Activate";
        q.llIIlIIIlI[q.llIIlIIIll[93]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[94]] = q."none";
        q.llIIlIIIlI[q.llIIlIIIll[95]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[110]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[118]] = q."Navigating to bank";
        q.llIIlIIIlI[q.llIIlIIIll[119]] = q."Handling banking";
        q.llIIlIIIlI[q.llIIlIIIll[121]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[123]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[124]] = q."We are missing magic short i, switching to BUYING";
        q.llIIlIIIlI[q.llIIlIIIll[125]] = q."Making MSB (i)";
        q.llIIlIIIlI[q.llIIlIIIll[127]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[128]] = q."We are missing rune arrows, switching to BUYING";
        q.llIIlIIIlI[q.llIIlIIIll[129]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[130]] = q."meleeNmz";
        q.llIIlIIIlI[q.llIIlIIIll[131]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[132]] = q."rangeNmz";
        q.llIIlIIIlI[q.llIIlIIIll[133]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[134]] = q."Wield";
        q.llIIlIIIlI[q.llIIlIIIll[135]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[136]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[137]] = q."supplies";
        q.llIIlIIIlI[q.llIIlIIIll[138]] = q."We are missing supplies, switching to BUYING";
        q.llIIlIIIlI[q.llIIlIIIll[139]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[140]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[142]] = q."Nav to nmz bank";
        q.llIIlIIIlI[q.llIIlIIIll[143]] = q."Handling banking";
        q.llIIlIIIlI[q.llIIlIIIll[145]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[154]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[155]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[158]] = q."Drink";
        q.llIIlIIIlI[q.llIIlIIIll[159]] = q."Dwarven rock cake";
        q.llIIlIIIlI[q.llIIlIIIll[160]] = q."Guzzle";
        q.llIIlIIIlI[q.llIIlIIIll[161]] = q."supplies";
        q.llIIlIIIlI[q.llIIlIIIll[167]] = q."melee";
        q.llIIlIIIlI[q.llIIlIIIll[184]] = q."range";
        q.llIIlIIIlI[q.llIIlIIIll[195]] = q."Absorption";
        q.llIIlIIIlI[q.llIIlIIIll[196]] = q."Overload";
        q.llIIlIIIlI[q.llIIlIIIll[197]] = q."Absorption";
        q.llIIlIIIlI[q.llIIlIIIll[198]] = q."dueling";
        q.llIIlIIIlI[q.llIIlIIIll[199]] = q."dueling";
        q.llIIlIIIlI[q.llIIlIIIll[200]] = q."Prayer";
        q.llIIlIIIlI[q.llIIlIIIll[201]] = q."Prayer";
        q.llIIlIIIlI[q.llIIlIIIll[162]] = q."(normal)";
        q.llIIlIIIlI[q.llIIlIIIll[202]] = q."(hard)";
        q.llIIlIIIlI[q.llIIlIIIll[203]] = q."Overload";
        q.llIIlIIIlI[q.llIIlIIIll[204]] = q."Black demon";
        q.llIIlIIIlI[q.llIIlIIIll[205]] = q."Prayer";
        q.llIIlIIIlI[q.llIIlIIIll[206]] = q."Prayer";
        q.llIIlIIIlI[q.llIIlIIIll[208]] = q."Overload";
    }

    private static String lIlIlIIIlIIll(String llllllllllllllllllIlIIlllIIlllll, String llllllllllllllllllIlIIlllIIlllII) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlllIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlllIIlllII.getBytes(StandardCharsets.UTF_8)), llIIlIIIll[11]), "DES");
            Cipher llllllllllllllllllIlIIlllIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlllIlIIIIl.init(llIIlIIIll[4], llllllllllllllllllIlIIlllIlIIIlI);
            return new String(llllllllllllllllllIlIIlllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIlllIlIIIII) {
            llllllllllllllllllIlIIlllIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlIlIIl(int n2) {
        return n2 > 0;
    }

    public static void e(String string) {
        e.t();
        if (q.lIlIlIIIllIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[3]];
            b.a(bv);
            if (q.lIlIlIIIlllII(bv.size(), llIIlIIIll[0])) {
                System.out.println(llIIlIIIlI[llIIlIIIll[0]]);
                bt = llIIlIIIll[3];
            }
        }
        if (q.lIlIlIIIllIlI(bt ? 1 : 0)) {
            String llllllllllllllllllIlIIllllIIlIIl;
            if (q.lIlIlIIIllIlI(q.f(llllllllllllllllllIlIIllllIIlIIl) ? 1 : 0) && q.lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                String[] stringArray = new String[llIIlIIIll[0]];
                stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[4]];
                if (q.lIlIlIIlIIlIl(TileObjects.getNearest((String[])stringArray))) {
                    if (q.lIlIlIIIllIIl(Equipment.contains((int[])f.aS) ? 1 : 0)) {
                        Equipment.getFirst((int[])f.aS).interact(llIIlIIIlI[llIIlIIIll[5]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIlIIIll[0]];
                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[207];
                            if (q.lIlIlIIlIlIII(TileObjects.getNearest((int[])nArray))) {
                                bl = llIIlIIIll[0];
                                0;
                                if (2 == 3) {
                                    return ((0x6A ^ 0x59) & ~(0x76 ^ 0x45)) != 0;
                                }
                            } else {
                                bl = llIIlIIIll[3];
                            }
                            return bl;
                        }, (int)llIIlIIIll[6]);
                        0;
                    }
                    if (q.lIlIlIIIllIlI(Equipment.contains((int[])f.aS) ? 1 : 0) && q.lIlIlIIIllIIl(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aS).interact(llIIlIIIlI[llIIlIIIll[7]]);
                    }
                }
                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[8]];
                String[] stringArray2 = new String[llIIlIIIll[0]];
                stringArray2[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[9]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIlIIIlI[llIIlIIIll[10]]);
                Time.sleepTicks((int)llIIlIIIll[7]);
                0;
            }
            if ((!q.lIlIlIIIllIIl(q.f(llllllllllllllllllIlIIllllIIlIIl) ? 1 : 0) || q.lIlIlIIIllIlI(Inventory.contains(item -> {
                int n2;
                if (q.lIlIlIIIllIIl(item.getName().contains(llIIlIIIlI[llIIlIIIll[206]]) ? 1 : 0) && q.lIlIlIIIllIlI(item.isNoted() ? 1 : 0)) {
                    n2 = llIIlIIIll[0];
                    0;
                    if ((0xF5 ^ 0xC5 ^ (0x99 ^ 0xAD)) != (0xD7 ^ 0x95 ^ (0xE8 ^ 0xAE))) {
                        return (3 & (3 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIIll[3];
                }
                return n2 != 0;
            }) ? 1 : 0)) && q.lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIlIIl.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[11]]) ? 1 : 0)) {
                    q.g(llIIlIIIlI[llIIlIIIll[12]]);
                }
                if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIlIIl.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[13]]) ? 1 : 0)) {
                    q.g(llIIlIIIlI[llIIlIIIll[14]]);
                }
            }
            if (q.lIlIlIIIllIIl(q.f(llllllllllllllllllIlIIllllIIlIIl) ? 1 : 0) && q.lIlIlIIIlllII(Vars.getBit((int)cX), llIIlIIIll[15]) && q.lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[llIIlIIIll[0]];
                nArray[q.llIIlIIIll[3]] = llIIlIIIll[16];
                if (q.lIlIlIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    q.g(llllllllllllllllllIlIIllllIIlIIl);
                }
                int[] nArray2 = new int[llIIlIIIll[0]];
                nArray2[q.llIIlIIIll[3]] = llIIlIIIll[16];
                if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[17]];
                    if (q.lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIIlIIIll[0]];
                        stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[18]];
                        String[] stringArray3 = new String[llIIlIIIll[0]];
                        stringArray3[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[19]];
                        if (q.lIlIlIIIllIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray3) ? 1 : 0)) {
                            String[] stringArray4 = new String[llIIlIIIll[0]];
                            stringArray4[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[20]];
                            TileObjects.getNearest((String[])stringArray4).interact(llIIlIIIlI[llIIlIIIll[21]]);
                            Time.sleepTicks((int)llIIlIIIll[4]);
                            0;
                            0;
                            if (3 <= -1) {
                                return;
                            }
                        } else {
                            String[] stringArray5 = new String[llIIlIIIll[0]];
                            stringArray5[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[22]];
                            TileObjects.getNearest((String[])stringArray5).interact(llIIlIIIlI[llIIlIIIll[23]]);
                        }
                    }
                    if (q.lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIIlIIIll[0]];
                        stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[24]];
                        g.a(stringArray);
                    }
                    if (q.lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)e.c(llIIlIIIll[25], llIIlIIIll[26]));
                        Time.sleepTicks((int)llIIlIIIll[9]);
                        0;
                        Dialog.close();
                    }
                }
            }
            if (q.lIlIlIIIllIIl(q.f(llllllllllllllllllIlIIllllIIlIIl) ? 1 : 0) && q.lIlIlIIIllIlI(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                q.g(llllllllllllllllllIlIIllllIIlIIl);
            }
            if (q.lIlIlIIIllIIl(q.f(llllllllllllllllllIlIIllllIIlIIl) ? 1 : 0) && q.lIlIlIIIllIIl(Inventory.contains(item -> {
                int n2;
                if (q.lIlIlIIIllIIl(item.getName().contains(llIIlIIIlI[llIIlIIIll[205]]) ? 1 : 0) && q.lIlIlIIIllIlI(item.isNoted() ? 1 : 0)) {
                    n2 = llIIlIIIll[0];
                    0;
                    if (((0x34 ^ 0x2D) & ~(0xB1 ^ 0xA8)) <= -1) {
                        return ((0x1E ^ 0x5F) & ~(0x6C ^ 0x2D)) != 0;
                    }
                } else {
                    n2 = llIIlIIIll[3];
                }
                return n2 != 0;
            }) ? 1 : 0) && q.lIlIlIIIllllI(Vars.getBit((int)cX), llIIlIIIll[15])) {
                Object llllllllllllllllllIlIIllllIIlIII;
                if (q.lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cV), llIIlIIIll[13]) && q.lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[27]];
                    Movement.walkTo((WorldPoint)cV);
                    0;
                    Time.sleepTicks((int)llIIlIIIll[0]);
                    0;
                }
                if (q.lIlIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(cV), llIIlIIIll[13])) {
                    if (q.lIlIlIIIllllI(Vars.getBit((int)cX), llIIlIIIll[15]) && q.lIlIlIIIlllII(Vars.getBit((int)cW), llIIlIIIll[27]) && q.lIlIlIIIllllI(e.j(llIIlIIIll[1]), llIIlIIIll[2])) {
                        while (q.lIlIlIIIlllII(Vars.getBit((int)cW), llIIlIIIll[27]) && q.lIlIlIIIllllI(e.j(llIIlIIIll[1]), llIIlIIIll[2]) && q.lIlIlIIIllIlI(AccBuilderSotf.d ? 1 : 0)) {
                            if (q.lIlIlIIIllIIl(Widgets.get((int)llIIlIIIll[28]).isEmpty() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[29]];
                                String[] stringArray = new String[llIIlIIIll[0]];
                                stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[30]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIlIIIlI[llIIlIIIll[31]]);
                                Time.sleepTicks((int)llIIlIIIll[5]);
                                0;
                            }
                            if (q.lIlIlIIIllIlI(Widgets.get((int)llIIlIIIll[28]).isEmpty() ? 1 : 0)) {
                                llllllllllllllllllIlIIllllIIlIII = Widgets.get((int)llIIlIIIll[28], (int)llIIlIIIll[4]).getChild(llIIlIIIll[7]);
                                Widget llllllllllllllllllIlIIllllIIIlll = Widgets.get((int)llIIlIIIll[28], (int)llIIlIIIll[9]).getChild(llIIlIIIll[9]);
                                if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIllllIIIlll)) {
                                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[32]];
                                    llllllllllllllllllIlIIllllIIIlll.interact(llIIlIIIlI[llIIlIIIll[33]]);
                                }
                                if (q.lIlIlIIlIlIII(llllllllllllllllllIlIIllllIIIlll)) {
                                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[34]];
                                    Shop.buyFifty((String)llIIlIIIlI[llIIlIIIll[35]]);
                                }
                            }
                            Time.sleepTicks((int)llIIlIIIll[4]);
                            0;
                            0;
                            if (((0x4C ^ 0x73) & ~(0x86 ^ 0xB9)) <= 0) continue;
                            return;
                        }
                    }
                    if (q.lIlIlIIIllllI(Vars.getBit((int)cX), llIIlIIIll[15]) && q.lIlIlIIlIlIIl(Vars.getBit((int)cW)) && q.lIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[36]];
                        if (q.lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIIlIIIll[0]];
                            stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[37]];
                            TileObjects.getNearest((String[])stringArray).interact(llIIlIIIlI[llIIlIIIll[15]]);
                            Time.sleepTicks((int)llIIlIIIll[5]);
                            0;
                        }
                        if (q.lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            Dialog.enterAmount((int)e.c(llIIlIIIll[38], llIIlIIIll[39]));
                        }
                    }
                    if (q.lIlIlIIIlllII(Vars.getBit((int)cX), llIIlIIIll[15])) {
                        int[] nArray = new int[llIIlIIIll[0]];
                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[16];
                        if (q.lIlIlIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[40]];
                            if (q.lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIIIll[0]];
                                stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[41]];
                                String[] stringArray6 = new String[llIIlIIIll[0]];
                                stringArray6[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[42]];
                                if (q.lIlIlIIIllIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIIlIIIll[0]];
                                    stringArray7[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[43]];
                                    TileObjects.getNearest((String[])stringArray7).interact(llIIlIIIlI[llIIlIIIll[44]]);
                                    Time.sleepTicks((int)llIIlIIIll[4]);
                                    0;
                                    0;
                                    if (1 == 0) {
                                        return;
                                    }
                                } else {
                                    String[] stringArray8 = new String[llIIlIIIll[0]];
                                    stringArray8[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[45]];
                                    TileObjects.getNearest((String[])stringArray8).interact(llIIlIIIlI[llIIlIIIll[46]]);
                                }
                            }
                            if (q.lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIIIll[0]];
                                stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[47]];
                                g.a(stringArray);
                            }
                            if (q.lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount((int)e.c(llIIlIIIll[25], llIIlIIIll[26]));
                                Time.sleepTicks((int)llIIlIIIll[5]);
                                0;
                                Dialog.close();
                            }
                        }
                    }
                    if (q.lIlIlIIIllIIl(q.aQ() ? 1 : 0) && q.lIlIlIIIllllI(Vars.getBit((int)cX), llIIlIIIll[15]) && q.lIlIlIIIlllII(Vars.getBit((int)llIIlIIIll[48]), llIIlIIIll[0])) {
                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[49]];
                        String[] stringArray = new String[llIIlIIIll[0]];
                        stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[50]];
                        if (q.lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo((Locatable)NPCs.getNearest((String[])stringArray)), llIIlIIIll[0]) && q.lIlIlIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray9 = new String[llIIlIIIll[0]];
                            stringArray9[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[51]];
                            NPCs.getNearest((String[])stringArray9).interact(llIIlIIIlI[llIIlIIIll[52]]);
                        }
                        if (q.lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray10 = new String[llIIlIIIll[0]];
                            stringArray10[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[53]];
                            NPCs.getNearest((String[])stringArray10).interact(llIIlIIIlI[llIIlIIIll[54]]);
                            Time.sleepTicks((int)llIIlIIIll[4]);
                            0;
                        }
                        String[] stringArray11 = new String[llIIlIIIll[5]];
                        stringArray11[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[55]];
                        stringArray11[q.llIIlIIIll[0]] = llIIlIIIlI[llIIlIIIll[56]];
                        stringArray11[q.llIIlIIIll[4]] = llIIlIIIlI[llIIlIIIll[57]];
                        g.a(stringArray11);
                    }
                    if (q.lIlIlIIIllllI(Vars.getBit((int)llIIlIIIll[58]), llIIlIIIll[15]) && q.lIlIlIIlIlIIl(Vars.getBit((int)llIIlIIIll[48]))) {
                        if (q.lIlIlIIIllIIl(Widgets.get((int)llIIlIIIll[59]).isEmpty() ? 1 : 0)) {
                            String[] stringArray = new String[llIIlIIIll[0]];
                            stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[60]];
                            TileObjects.getNearest((String[])stringArray).interact(llIIlIIIlI[llIIlIIIll[61]]);
                            Time.sleepTicks((int)llIIlIIIll[5]);
                            0;
                        }
                        if (q.lIlIlIIIllIlI(Widgets.get((int)llIIlIIIll[59]).isEmpty() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[62]];
                            llllllllllllllllllIlIIllllIIlIII = Widgets.get((int)llIIlIIIll[59], (int)llIIlIIIll[9]);
                            int llllllllllllllllllIlIIllllIIIlll = llIIlIIIll[63];
                            int llllllllllllllllllIlIIllllIIIllI = llIIlIIIll[64];
                            int llllllllllllllllllIlIIllllIIIlIl = llIIlIIIll[3];
                            int llllllllllllllllllIlIIllllIIIlII = llIIlIIIll[3];
                            Widget[] llllllllllllllllllIlIIllllIIIIll = Widgets.get((int)llIIlIIIll[59], (int)llIIlIIIll[18]).getChildren();
                            int llllllllllllllllllIlIIllllIIIIlI = llIIlIIIll[3];
                            while (q.lIlIlIIIlllII(llllllllllllllllllIlIIllllIIIIlI, llllllllllllllllllIlIIllllIIIIll.length)) {
                                if (q.lIlIlIIlIlIll(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIllllIIIIlI].getTextColor(), llllllllllllllllllIlIIllllIIIllI)) {
                                    ++llllllllllllllllllIlIIllllIIIlII;
                                    0;
                                    if (3 < 0) {
                                        return;
                                    }
                                } else {
                                    ++llllllllllllllllllIlIIllllIIIlIl;
                                }
                                ++llllllllllllllllllIlIIllllIIIIlI;
                                0;
                                if (-2 < 0) continue;
                                return;
                            }
                            if (q.lIlIlIIlIIllI(llllllllllllllllllIlIIllllIIIlII, llIIlIIIll[8]) && q.lIlIlIIlIIlIl(llllllllllllllllllIlIIllllIIIIlI = Widgets.get((int)llIIlIIIll[59], (int)llIIlIIIll[11]))) {
                                Mouse.click((int)llllllllllllllllllIlIIllllIIIIlI.getClickPoint().getX(), (int)llllllllllllllllllIlIIllllIIIIlI.getClickPoint().getY(), (boolean)llIIlIIIll[0]);
                                Time.sleepTicks((int)llIIlIIIll[0]);
                                0;
                            }
                            if (q.lIlIlIIIlllII(llllllllllllllllllIlIIllllIIIlII, llIIlIIIll[8])) {
                                llllllllllllllllllIlIIllllIIIIlI = llIIlIIIll[3];
                                int llllllllllllllllllIlIIllllIIIIIl = llIIlIIIll[3];
                                int llllllllllllllllllIlIIllllIIIIII = llIIlIIIll[3];
                                int llllllllllllllllllIlIIlllIllllll = llIIlIIIll[3];
                                int llllllllllllllllllIlIIlllIlllllI = llIIlIIIll[3];
                                int llllllllllllllllllIlIIlllIllllIl = llIIlIIIll[3];
                                while (q.lIlIlIIIlllII(llllllllllllllllllIlIIlllIllllIl, llllllllllllllllllIlIIllllIIIIll.length)) {
                                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].getName().contains(llIIlIIIlI[llIIlIIIll[65]]) ? 1 : 0) && q.lIlIlIIIllIlI(llllllllllllllllllIlIIllllIIIIlI)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[66]];
                                        llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].interact(llIIlIIIlI[llIIlIIIll[67]]);
                                        Time.sleepTicks((int)llIIlIIIll[0]);
                                        0;
                                        llllllllllllllllllIlIIllllIIIIlI = llIIlIIIll[0];
                                    }
                                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].getName().contains(llIIlIIIlI[llIIlIIIll[68]]) ? 1 : 0) && q.lIlIlIIIllIlI(llllllllllllllllllIlIIllllIIIIIl)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[69]];
                                        llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].interact(llIIlIIIlI[llIIlIIIll[70]]);
                                        Time.sleepTicks((int)llIIlIIIll[0]);
                                        0;
                                        llllllllllllllllllIlIIllllIIIIIl = llIIlIIIll[0];
                                    }
                                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].getName().contains(llIIlIIIlI[llIIlIIIll[71]]) ? 1 : 0) && q.lIlIlIIIllIlI(llllllllllllllllllIlIIllllIIIIII)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[72]];
                                        llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].interact(llIIlIIIlI[llIIlIIIll[73]]);
                                        Time.sleepTicks((int)llIIlIIIll[0]);
                                        0;
                                        llllllllllllllllllIlIIllllIIIIII = llIIlIIIll[0];
                                    }
                                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].getName().contains(llIIlIIIlI[llIIlIIIll[74]]) ? 1 : 0) && q.lIlIlIIIllIlI(llllllllllllllllllIlIIlllIllllll)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[75]];
                                        llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].interact(llIIlIIIlI[llIIlIIIll[76]]);
                                        Time.sleepTicks((int)llIIlIIIll[0]);
                                        0;
                                        llllllllllllllllllIlIIlllIllllll = llIIlIIIll[0];
                                    }
                                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].getName().contains(llIIlIIIlI[llIIlIIIll[77]]) ? 1 : 0) && q.lIlIlIIIllIlI(llllllllllllllllllIlIIlllIlllllI)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[78]];
                                        llllllllllllllllllIlIIllllIIIIll[llllllllllllllllllIlIIlllIllllIl].interact(llIIlIIIlI[llIIlIIIll[79]]);
                                        Time.sleepTicks((int)llIIlIIIll[0]);
                                        0;
                                        llllllllllllllllllIlIIlllIlllllI = llIIlIIIll[0];
                                    }
                                    ++llllllllllllllllllIlIIlllIllllIl;
                                    0;
                                    if (null == null) continue;
                                    return;
                                }
                            }
                            if (q.lIlIlIIlIlIll(llllllllllllllllllIlIIllllIIIlII, llIIlIIIll[8])) {
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[80]];
                                if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIllllIIlIII)) {
                                    Mouse.click((int)llllllllllllllllllIlIIllllIIlIII.getClickPoint().getX(), (int)llllllllllllllllllIlIIllllIIlIII.getClickPoint().getY(), (boolean)llIIlIIIll[0]);
                                    Time.sleepTicks((int)llIIlIIIll[8]);
                                    0;
                                }
                            }
                        }
                    }
                }
                String[] stringArray = new String[llIIlIIIll[0]];
                stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[81]];
                if (q.lIlIlIIlIIlIl(NPCs.getNearest((String[])stringArray))) {
                    cR = null;
                }
                if (q.lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && q.lIlIlIIlIlIII(cR)) {
                    Time.sleepTicks((int)llIIlIIIll[7]);
                    0;
                    System.out.println(llIIlIIIlI[llIIlIIIll[82]]);
                    cR = Players.getLocal().getWorldLocation();
                    cS = new WorldPoint(cR.getX() - e.c(llIIlIIIll[0], llIIlIIIll[5]), cR.getY() + e.c(llIIlIIIll[19], llIIlIIIll[21]), cR.getPlane());
                }
                if (q.lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && q.lIlIlIIlIIlIl(cR)) {
                    if (q.lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cS), llIIlIIIll[5])) {
                        String[] stringArray12 = new String[llIIlIIIll[0]];
                        stringArray12[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[83]];
                        if (q.lIlIlIIlIlIII(TileObjects.getNearest((String[])stringArray12))) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[84]];
                            e.c(cS);
                            Time.sleepTicks((int)llIIlIIIll[0]);
                            0;
                        }
                    }
                    if (q.lIlIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(cS), llIIlIIIll[5])) {
                        String[] stringArray13 = new String[llIIlIIIll[0]];
                        stringArray13[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[85]];
                        if (q.lIlIlIIlIlIII(TileObjects.getNearest((String[])stringArray13))) {
                            Item llllllllllllllllllIlIIllllIIIlll;
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[86]];
                            llllllllllllllllllIlIIllllIIlIII = NPCs.getAll(nPC -> nPC.getName().contains(llIIlIIIlI[llIIlIIIll[204]]));
                            if (q.lIlIlIIIllllI(llllllllllllllllllIlIIllllIIlIII.size(), llIIlIIIll[5]) && q.lIlIlIIlIlIII(Players.getLocal().getInteracting())) {
                                ((NPC)llllllllllllllllllIlIIllllIIlIII.get(llIIlIIIll[3])).interact(llIIlIIIlI[llIIlIIIll[87]]);
                                Time.sleepTicks((int)llIIlIIIll[4]);
                                0;
                            }
                            if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIllllIIIlll = Inventory.getFirst(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[203]]))) && q.lIlIlIIlIlIll(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlIlIIIllllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIIIll[65])) {
                                llllllllllllllllllIlIIllllIIIlll.interact(llIIlIIIlI[llIIlIIIll[88]]);
                                Time.sleepTicks((int)llIIlIIIll[5]);
                                0;
                                Time.sleepTicks((int)llIIlIIIll[20]);
                                0;
                            }
                        }
                    }
                    if (q.lIlIlIIIllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && q.lIlIlIIlIlIIl(Prayers.getPoints())) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (!q.lIlIlIIlIlIII(NPCs.getNearest(nPC -> nPC.getName().contains(llIIlIIIlI[llIIlIIIll[202]]))) || q.lIlIlIIlIIlIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIIlIIIlI[llIIlIIIll[162]])))) {
                    e.F();
                    if (q.lIlIlIIIllIIl(Equipment.contains(item -> {
                        boolean bl;
                        if (q.lIlIlIIlIlIll(item.getId(), llIIlIIIll[102])) {
                            bl = llIIlIIIll[0];
                            0;
                            if (1 > 1) {
                                return ((0xA6 ^ 0xA3 ^ (0x76 ^ 0x6D)) & (0x57 ^ 0x3B ^ (0x5B ^ 0x29) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIlIIIll[3];
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        if (q.lIlIlIIlIllII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
                        }
                        String[] stringArray14 = new String[llIIlIIIll[0]];
                        stringArray14[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[89]];
                        if (q.lIlIlIIlIIlIl(TileObjects.getNearest((String[])stringArray14))) {
                            String[] stringArray15 = new String[llIIlIIIll[0]];
                            stringArray15[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[90]];
                            TileObjects.getNearest((String[])stringArray15).interact(llIIlIIIlI[llIIlIIIll[91]]);
                            Time.sleepTicks((int)llIIlIIIll[5]);
                            0;
                        }
                        if (q.lIlIlIIIllllI(Combat.getSpecEnergy(), llIIlIIIll[62]) && q.lIlIlIIIllIlI(Combat.isSpecEnabled() ? 1 : 0)) {
                            int[] nArray = new int[llIIlIIIll[0]];
                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[92];
                            if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray3 = new int[llIIlIIIll[0]];
                                nArray3[q.llIIlIIIll[3]] = llIIlIIIll[92];
                                if (q.lIlIlIIIllllI(Equipment.getFirst((int[])nArray3).getQuantity(), llIIlIIIll[4])) {
                                    Combat.toggleSpec();
                                }
                            }
                        }
                    }
                    if (q.lIlIlIIIlllII(Prayers.getPoints(), llIIlIIIll[27]) && q.lIlIlIIIllIIl(Inventory.contains(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[201]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[200]])).interact(llIIlIIIlI[llIIlIIIll[93]]);
                        Time.sleepTicks((int)llIIlIIIll[0]);
                        0;
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean f(String string) {
        int n2;
        block38: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block37: {
                                            String llllllllllllllllllIlIIlllIlllIll;
                                            block25: {
                                                int n3;
                                                block34: {
                                                    block36: {
                                                        block35: {
                                                            block30: {
                                                                int n4;
                                                                block31: {
                                                                    block33: {
                                                                        block32: {
                                                                            block26: {
                                                                                int n5;
                                                                                block27: {
                                                                                    block29: {
                                                                                        block28: {
                                                                                            if (q.lIlIlIIIllIIl(string.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[94]]) ? 1 : 0)) {
                                                                                                return llIIlIIIll[0];
                                                                                            }
                                                                                            if (!q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIll.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[95]]) ? 1 : 0)) break block25;
                                                                                            if (!q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[62]) || !q.lIlIlIIIlllII(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[74])) break block26;
                                                                                            int[] nArray = new int[llIIlIIIll[0]];
                                                                                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[96];
                                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                            int[] nArray2 = new int[llIIlIIIll[0]];
                                                                                            nArray2[q.llIIlIIIll[3]] = llIIlIIIll[97];
                                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block27;
                                                                                            int[] nArray3 = new int[llIIlIIIll[0]];
                                                                                            nArray3[q.llIIlIIIll[3]] = llIIlIIIll[98];
                                                                                            if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block28;
                                                                                            int[] nArray4 = new int[llIIlIIIll[0]];
                                                                                            nArray4[q.llIIlIIIll[3]] = llIIlIIIll[99];
                                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block27;
                                                                                        }
                                                                                        int[] nArray = new int[llIIlIIIll[0]];
                                                                                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[100];
                                                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                        int[] nArray5 = new int[llIIlIIIll[0]];
                                                                                        nArray5[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                                                                        if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray5) ? 1 : 0)) break block29;
                                                                                        int[] nArray6 = new int[llIIlIIIll[0]];
                                                                                        nArray6[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                                                    }
                                                                                    int[] nArray = new int[llIIlIIIll[0]];
                                                                                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[103];
                                                                                    if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                                                        int[] nArray7 = new int[llIIlIIIll[0]];
                                                                                        nArray7[q.llIIlIIIll[3]] = llIIlIIIll[92];
                                                                                        if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                                                                                            int[] nArray8 = new int[llIIlIIIll[0]];
                                                                                            nArray8[q.llIIlIIIll[3]] = llIIlIIIll[104];
                                                                                            if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray8) ? 1 : 0)) {
                                                                                                int[] nArray9 = new int[llIIlIIIll[0]];
                                                                                                nArray9[q.llIIlIIIll[3]] = llIIlIIIll[105];
                                                                                                if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                                                                                                    n5 = llIIlIIIll[0];
                                                                                                    0;
                                                                                                    if (3 != 0) return n5 != 0;
                                                                                                    return ((0x3A ^ 4) & ~(0xD ^ 0x33)) != 0;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                n5 = llIIlIIIll[3];
                                                                                return n5 != 0;
                                                                            }
                                                                            if (!q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[74]) || !q.lIlIlIIIlllII(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[84])) break block30;
                                                                            int[] nArray = new int[llIIlIIIll[0]];
                                                                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[106];
                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                            int[] nArray10 = new int[llIIlIIIll[0]];
                                                                            nArray10[q.llIIlIIIll[3]] = llIIlIIIll[107];
                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block31;
                                                                            int[] nArray11 = new int[llIIlIIIll[0]];
                                                                            nArray11[q.llIIlIIIll[3]] = llIIlIIIll[98];
                                                                            if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray11) ? 1 : 0)) break block32;
                                                                            int[] nArray12 = new int[llIIlIIIll[0]];
                                                                            nArray12[q.llIIlIIIll[3]] = llIIlIIIll[99];
                                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block31;
                                                                        }
                                                                        int[] nArray = new int[llIIlIIIll[0]];
                                                                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[100];
                                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray13 = new int[llIIlIIIll[0]];
                                                                        nArray13[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                                                        if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block33;
                                                                        int[] nArray14 = new int[llIIlIIIll[0]];
                                                                        nArray14[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block31;
                                                                    }
                                                                    int[] nArray = new int[llIIlIIIll[0]];
                                                                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[103];
                                                                    if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                                        int[] nArray15 = new int[llIIlIIIll[0]];
                                                                        nArray15[q.llIIlIIIll[3]] = llIIlIIIll[92];
                                                                        if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                                                                            int[] nArray16 = new int[llIIlIIIll[0]];
                                                                            nArray16[q.llIIlIIIll[3]] = llIIlIIIll[104];
                                                                            if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                                                                int[] nArray17 = new int[llIIlIIIll[0]];
                                                                                nArray17[q.llIIlIIIll[3]] = llIIlIIIll[105];
                                                                                if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray17) ? 1 : 0)) {
                                                                                    n4 = llIIlIIIll[0];
                                                                                    0;
                                                                                    if (2 > 0) return n4 != 0;
                                                                                    return ((7 ^ 0x5A) & ~(0x73 ^ 0x2E)) != 0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                n4 = llIIlIIIll[3];
                                                                return n4 != 0;
                                                            }
                                                            if (!q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[84])) break block25;
                                                            int[] nArray = new int[llIIlIIIll[0]];
                                                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[108];
                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                                            int[] nArray18 = new int[llIIlIIIll[0]];
                                                            nArray18[q.llIIlIIIll[3]] = llIIlIIIll[109];
                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                            int[] nArray19 = new int[llIIlIIIll[0]];
                                                            nArray19[q.llIIlIIIll[3]] = llIIlIIIll[98];
                                                            if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray19) ? 1 : 0)) break block35;
                                                            int[] nArray20 = new int[llIIlIIIll[0]];
                                                            nArray20[q.llIIlIIIll[3]] = llIIlIIIll[99];
                                                            if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIIlIIIll[0]];
                                                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[100];
                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                                        int[] nArray21 = new int[llIIlIIIll[0]];
                                                        nArray21[q.llIIlIIIll[3]] = llIIlIIIll[101];
                                                        if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray21) ? 1 : 0)) break block36;
                                                        int[] nArray22 = new int[llIIlIIIll[0]];
                                                        nArray22[q.llIIlIIIll[3]] = llIIlIIIll[102];
                                                        if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block34;
                                                    }
                                                    int[] nArray = new int[llIIlIIIll[0]];
                                                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[103];
                                                    if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                        int[] nArray23 = new int[llIIlIIIll[0]];
                                                        nArray23[q.llIIlIIIll[3]] = llIIlIIIll[92];
                                                        if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray23) ? 1 : 0)) {
                                                            int[] nArray24 = new int[llIIlIIIll[0]];
                                                            nArray24[q.llIIlIIIll[3]] = llIIlIIIll[104];
                                                            if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray24) ? 1 : 0)) {
                                                                int[] nArray25 = new int[llIIlIIIll[0]];
                                                                nArray25[q.llIIlIIIll[3]] = llIIlIIIll[105];
                                                                if (q.lIlIlIIIllIIl(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                                                                    n3 = llIIlIIIll[0];
                                                                    0;
                                                                    if (((0xD0 ^ 0x9A) & ~(0x88 ^ 0xC2) & ~((0xA5 ^ 0xBB) & ~(0x19 ^ 7))) == 0) return n3 != 0;
                                                                    return ((0x2A ^ 0x3D) & ~(0x81 ^ 0x96)) != 0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                n3 = llIIlIIIll[3];
                                                return n3 != 0;
                                            }
                                            if (!q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlllIll.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[110]]) ? 1 : 0)) return llIIlIIIll[3];
                                            int[] nArray = new int[llIIlIIIll[0]];
                                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[111];
                                            if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block37;
                                            int[] nArray26 = new int[llIIlIIIll[0]];
                                            nArray26[q.llIIlIIIll[3]] = llIIlIIIll[111];
                                            if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) break block38;
                                        }
                                        int[] nArray = new int[llIIlIIIll[0]];
                                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[112];
                                        if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray27 = new int[llIIlIIIll[0]];
                                        nArray27[q.llIIlIIIll[3]] = llIIlIIIll[112];
                                        if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) break block38;
                                    }
                                    int[] nArray = new int[llIIlIIIll[0]];
                                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[113];
                                    if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block40;
                                    int[] nArray28 = new int[llIIlIIIll[0]];
                                    nArray28[q.llIIlIIIll[3]] = llIIlIIIll[113];
                                    if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) break block38;
                                }
                                int[] nArray = new int[llIIlIIIll[0]];
                                nArray[q.llIIlIIIll[3]] = llIIlIIIll[114];
                                if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray29 = new int[llIIlIIIll[0]];
                                nArray29[q.llIIlIIIll[3]] = llIIlIIIll[114];
                                if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) break block38;
                            }
                            int[] nArray = new int[llIIlIIIll[0]];
                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[115];
                            if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block42;
                            int[] nArray30 = new int[llIIlIIIll[0]];
                            nArray30[q.llIIlIIIll[3]] = llIIlIIIll[115];
                            if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) break block38;
                        }
                        int[] nArray = new int[llIIlIIIll[0]];
                        nArray[q.llIIlIIIll[3]] = llIIlIIIll[116];
                        if (!q.lIlIlIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block43;
                        int[] nArray31 = new int[llIIlIIIll[0]];
                        nArray31[q.llIIlIIIll[3]] = llIIlIIIll[116];
                        if (!q.lIlIlIIIllIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) break block38;
                    }
                    int[] nArray = new int[llIIlIIIll[0]];
                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[117];
                    if (!q.lIlIlIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                    int[] nArray32 = new int[llIIlIIIll[0]];
                    nArray32[q.llIIlIIIll[3]] = llIIlIIIll[117];
                    if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray32) ? 1 : 0)) break block38;
                }
                int[] nArray = new int[llIIlIIIll[0]];
                nArray[q.llIIlIIIll[3]] = llIIlIIIll[105];
                if (!q.lIlIlIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray33 = new int[llIIlIIIll[0]];
                nArray33[q.llIIlIIIll[3]] = llIIlIIIll[105];
                if (!q.lIlIlIIIllIIl(Equipment.contains((int[])nArray33) ? 1 : 0)) break block38;
            }
            n2 = llIIlIIIll[0];
            0;
            if (null == null) return n2 != 0;
            return ((0x2D ^ 9) & ~(0xA4 ^ 0x80)) != 0;
        }
        n2 = llIIlIIIll[3];
        return n2 != 0;
    }

    static {
        q.lIlIlIIIlIlll();
        q.lIlIlIIIlIlIl();
        bv = new ArrayList<d>();
        cR = null;
        cS = null;
        cT = new WorldArea(llIIlIIIll[209], llIIlIIIll[210], llIIlIIIll[37], llIIlIIIll[46], llIIlIIIll[3]);
        cU = new WorldPoint(llIIlIIIll[211], llIIlIIIll[212], llIIlIIIll[3]);
        cV = new WorldPoint(llIIlIIIll[213], llIIlIIIll[214], llIIlIIIll[3]);
        cW = llIIlIIIll[215];
        cX = llIIlIIIll[58];
        cY = llIIlIIIll[3];
        cI = e.c(llIIlIIIll[0], llIIlIIIll[4]);
        int[] nArray = new int[llIIlIIIll[12]];
        nArray[q.llIIlIIIll[3]] = llIIlIIIll[111];
        nArray[q.llIIlIIIll[0]] = llIIlIIIll[117];
        nArray[q.llIIlIIIll[4]] = llIIlIIIll[114];
        nArray[q.llIIlIIIll[5]] = llIIlIIIll[112];
        nArray[q.llIIlIIIll[7]] = llIIlIIIll[113];
        nArray[q.llIIlIIIll[8]] = llIIlIIIll[116];
        nArray[q.llIIlIIIll[9]] = llIIlIIIll[115];
        nArray[q.llIIlIIIll[10]] = llIIlIIIll[105];
        nArray[q.llIIlIIIll[11]] = llIIlIIIll[171];
        cZ = nArray;
    }

    public static void h(String string) {
        block53: {
            d llllllllllllllllllIlIIlllIlIllIl;
            block55: {
                block54: {
                    String llllllllllllllllllIlIIlllIlIlllI;
                    block52: {
                        block51: {
                            if (q.lIlIlIIIllIIl(string.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[161]]) ? 1 : 0)) {
                                int[] nArray = new int[llIIlIIIll[0]];
                                nArray[q.llIIlIIIll[3]] = llIIlIIIll[146];
                                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llIIlIIIll[146], llIIlIIIll[162], llIIlIIIll[163]);
                                    bv.add(d2);
                                    0;
                                }
                            }
                            int[] nArray = new int[llIIlIIIll[0]];
                            nArray[q.llIIlIIIll[3]] = llIIlIIIll[152];
                            if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                            int[] nArray2 = new int[llIIlIIIll[0]];
                            nArray2[q.llIIlIIIll[3]] = llIIlIIIll[152];
                            if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block52;
                            int[] nArray3 = new int[llIIlIIIll[0]];
                            nArray3[q.llIIlIIIll[3]] = llIIlIIIll[152];
                            if (!q.lIlIlIIIlllII(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIIIll[13])) break block52;
                        }
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[152], llIIlIIIll[13], j.cf);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray = new int[llIIlIIIll[0]];
                    nArray[q.llIIlIIIll[3]] = llIIlIIIll[164];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[164], llIIlIIIll[13], llIIlIIIll[165]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray4 = new int[llIIlIIIll[0]];
                    nArray4[q.llIIlIIIll[3]] = llIIlIIIll[153];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[153], llIIlIIIll[50], llIIlIIIll[166]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray5 = new int[llIIlIIIll[0]];
                    nArray5[q.llIIlIIIll[3]] = llIIlIIIll[151];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[151], llIIlIIIll[50], llIIlIIIll[166]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    if (q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlIlllI.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[167]]) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIIIll[0]];
                        nArray6[q.llIIlIIIll[3]] = llIIlIIIll[105];
                        if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[105], llIIlIIIll[0], llIIlIIIll[168]);
                            bv.add(llllllllllllllllllIlIIlllIlIllIl);
                            0;
                        }
                        if (q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIll[74]) && q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIll[74]) && q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIll[74])) {
                            int[] nArray7 = new int[llIIlIIIll[0]];
                            nArray7[q.llIIlIIIll[3]] = llIIlIIIll[111];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[111], llIIlIIIll[0], e.c(llIIlIIIll[169], llIIlIIIll[170]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray8 = new int[llIIlIIIll[0]];
                            nArray8[q.llIIlIIIll[3]] = llIIlIIIll[171];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[171], llIIlIIIll[0], e.c(llIIlIIIll[172], llIIlIIIll[173]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray9 = new int[llIIlIIIll[0]];
                            nArray9[q.llIIlIIIll[3]] = llIIlIIIll[116];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[116], llIIlIIIll[0], e.c(llIIlIIIll[174], llIIlIIIll[175]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray10 = new int[llIIlIIIll[0]];
                            nArray10[q.llIIlIIIll[3]] = llIIlIIIll[114];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[114], llIIlIIIll[0], e.c(llIIlIIIll[174], llIIlIIIll[175]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray11 = new int[llIIlIIIll[0]];
                            nArray11[q.llIIlIIIll[3]] = llIIlIIIll[112];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[112], llIIlIIIll[0], e.c(llIIlIIIll[176], llIIlIIIll[177]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray12 = new int[llIIlIIIll[0]];
                            nArray12[q.llIIlIIIll[3]] = llIIlIIIll[113];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[113], llIIlIIIll[0], e.c(llIIlIIIll[178], llIIlIIIll[179]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray13 = new int[llIIlIIIll[0]];
                            nArray13[q.llIIlIIIll[3]] = llIIlIIIll[115];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[115], llIIlIIIll[0], e.c(llIIlIIIll[180], llIIlIIIll[181]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                            int[] nArray14 = new int[llIIlIIIll[0]];
                            nArray14[q.llIIlIIIll[3]] = llIIlIIIll[117];
                            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[117], llIIlIIIll[0], e.c(llIIlIIIll[182], llIIlIIIll[183]));
                                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                                0;
                            }
                        }
                    }
                    if (!q.lIlIlIIIllIIl(llllllllllllllllllIlIIlllIlIlllI.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[184]]) ? 1 : 0)) break block53;
                    int[] nArray15 = new int[llIIlIIIll[0]];
                    nArray15[q.llIIlIIIll[3]] = llIIlIIIll[103];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[llIIlIIIll[0]];
                        nArray16[q.llIIlIIIll[3]] = llIIlIIIll[103];
                        if (q.lIlIlIIIllIlI(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                            llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[103], llIIlIIIll[0], e.c(llIIlIIIll[185], llIIlIIIll[186]));
                            bv.add(llllllllllllllllllIlIIlllIlIllIl);
                            0;
                        }
                    }
                    int[] nArray17 = new int[llIIlIIIll[0]];
                    nArray17[q.llIIlIIIll[3]] = llIIlIIIll[100];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray17) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[100], llIIlIIIll[4], llIIlIIIll[187]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray18 = new int[llIIlIIIll[0]];
                    nArray18[q.llIIlIIIll[3]] = llIIlIIIll[98];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[98], llIIlIIIll[4], llIIlIIIll[187]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray19 = new int[llIIlIIIll[0]];
                    nArray19[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block54;
                    int[] nArray20 = new int[llIIlIIIll[0]];
                    nArray20[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block55;
                    int[] nArray21 = new int[llIIlIIIll[0]];
                    nArray21[q.llIIlIIIll[3]] = llIIlIIIll[92];
                    if (!q.lIlIlIIIlllII(Bank.getFirst((int[])nArray21).getQuantity(), llIIlIIIll[126])) break block55;
                }
                llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[92], llIIlIIIll[188], e.c(llIIlIIIll[189], llIIlIIIll[190]));
                bv.add(llllllllllllllllllIlIIlllIlIllIl);
                0;
            }
            int[] nArray = new int[llIIlIIIll[0]];
            nArray[q.llIIlIIIll[3]] = llIIlIIIll[102];
            if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIIlIIIll[0]];
                nArray22[q.llIIlIIIll[3]] = llIIlIIIll[102];
                if (q.lIlIlIIIllIlI(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIIlIIIll[0]];
                    nArray23[q.llIIlIIIll[3]] = llIIlIIIll[122];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[122], llIIlIIIll[0], e.c(llIIlIIIll[191], llIIlIIIll[192]));
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                    int[] nArray24 = new int[llIIlIIIll[0]];
                    nArray24[q.llIIlIIIll[3]] = llIIlIIIll[101];
                    if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray24) ? 1 : 0)) {
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[101], llIIlIIIll[4], llIIlIIIll[187]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
            }
            if (q.lIlIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.RANGED), llIIlIIIll[74])) {
                int[] nArray25 = new int[llIIlIIIll[0]];
                nArray25[q.llIIlIIIll[3]] = llIIlIIIll[97];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray25) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[97], llIIlIIIll[4], llIIlIIIll[187]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray26 = new int[llIIlIIIll[0]];
                nArray26[q.llIIlIIIll[3]] = llIIlIIIll[97];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                    int[] nArray27 = new int[llIIlIIIll[0]];
                    nArray27[q.llIIlIIIll[3]] = llIIlIIIll[97];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray27).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray28 = new int[llIIlIIIll[0]];
                        nArray28[q.llIIlIIIll[3]] = llIIlIIIll[97];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[97], llIIlIIIll[4] - Bank.getFirst((int[])nArray28).getQuantity(), llIIlIIIll[187]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
                int[] nArray29 = new int[llIIlIIIll[0]];
                nArray29[q.llIIlIIIll[3]] = llIIlIIIll[96];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray29) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[96], llIIlIIIll[4], llIIlIIIll[187]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray30 = new int[llIIlIIIll[0]];
                nArray30[q.llIIlIIIll[3]] = llIIlIIIll[96];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIIlIIIll[0]];
                    nArray31[q.llIIlIIIll[3]] = llIIlIIIll[96];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray31).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray32 = new int[llIIlIIIll[0]];
                        nArray32[q.llIIlIIIll[3]] = llIIlIIIll[96];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[96], llIIlIIIll[4] - Bank.getFirst((int[])nArray32).getQuantity(), llIIlIIIll[187]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
            }
            if (q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[74]) && q.lIlIlIIIlllII(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[84])) {
                int[] nArray33 = new int[llIIlIIIll[0]];
                nArray33[q.llIIlIIIll[3]] = llIIlIIIll[107];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray33) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[107], llIIlIIIll[4], llIIlIIIll[193]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray34 = new int[llIIlIIIll[0]];
                nArray34[q.llIIlIIIll[3]] = llIIlIIIll[107];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray34) ? 1 : 0)) {
                    int[] nArray35 = new int[llIIlIIIll[0]];
                    nArray35[q.llIIlIIIll[3]] = llIIlIIIll[107];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray35).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray36 = new int[llIIlIIIll[0]];
                        nArray36[q.llIIlIIIll[3]] = llIIlIIIll[107];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[107], llIIlIIIll[4] - Bank.getFirst((int[])nArray36).getQuantity(), llIIlIIIll[193]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
                int[] nArray37 = new int[llIIlIIIll[0]];
                nArray37[q.llIIlIIIll[3]] = llIIlIIIll[106];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray37) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[106], llIIlIIIll[4], llIIlIIIll[194]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray38 = new int[llIIlIIIll[0]];
                nArray38[q.llIIlIIIll[3]] = llIIlIIIll[106];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray38) ? 1 : 0)) {
                    int[] nArray39 = new int[llIIlIIIll[0]];
                    nArray39[q.llIIlIIIll[3]] = llIIlIIIll[106];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray39).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray40 = new int[llIIlIIIll[0]];
                        nArray40[q.llIIlIIIll[3]] = llIIlIIIll[106];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[106], llIIlIIIll[4] - Bank.getFirst((int[])nArray40).getQuantity(), llIIlIIIll[194]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
            }
            if (q.lIlIlIIIllllI(Skills.getLevel((Skill)Skill.RANGED), llIIlIIIll[84])) {
                int[] nArray41 = new int[llIIlIIIll[0]];
                nArray41[q.llIIlIIIll[3]] = llIIlIIIll[109];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray41) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[109], llIIlIIIll[4], llIIlIIIll[193]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray42 = new int[llIIlIIIll[0]];
                nArray42[q.llIIlIIIll[3]] = llIIlIIIll[109];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray42) ? 1 : 0)) {
                    int[] nArray43 = new int[llIIlIIIll[0]];
                    nArray43[q.llIIlIIIll[3]] = llIIlIIIll[109];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray43).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray44 = new int[llIIlIIIll[0]];
                        nArray44[q.llIIlIIIll[3]] = llIIlIIIll[109];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[109], llIIlIIIll[4] - Bank.getFirst((int[])nArray44).getQuantity(), llIIlIIIll[193]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
                int[] nArray45 = new int[llIIlIIIll[0]];
                nArray45[q.llIIlIIIll[3]] = llIIlIIIll[108];
                if (q.lIlIlIIIllIlI(Bank.contains((int[])nArray45) ? 1 : 0)) {
                    llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[108], llIIlIIIll[4], llIIlIIIll[6]);
                    bv.add(llllllllllllllllllIlIIlllIlIllIl);
                    0;
                }
                int[] nArray46 = new int[llIIlIIIll[0]];
                nArray46[q.llIIlIIIll[3]] = llIIlIIIll[108];
                if (q.lIlIlIIIllIIl(Bank.contains((int[])nArray46) ? 1 : 0)) {
                    int[] nArray47 = new int[llIIlIIIll[0]];
                    nArray47[q.llIIlIIIll[3]] = llIIlIIIll[108];
                    if (q.lIlIlIIIlllII(Bank.getFirst((int[])nArray47).getQuantity(), llIIlIIIll[4])) {
                        int[] nArray48 = new int[llIIlIIIll[0]];
                        nArray48[q.llIIlIIIll[3]] = llIIlIIIll[108];
                        llllllllllllllllllIlIIlllIlIllIl = new d(llIIlIIIll[108], llIIlIIIll[4] - Bank.getFirst((int[])nArray48).getQuantity(), llIIlIIIll[6]);
                        bv.add(llllllllllllllllllIlIIlllIlIllIl);
                        0;
                    }
                }
            }
        }
    }

    private static void aR() {
        Item llllllllllllllllllIlIIlllIllIIll;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[197]]));
        Item item3 = Inventory.getFirst(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[196]]));
        if (q.lIlIlIIlIIlIl(item3) && q.lIlIlIIlIlIll(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlIlIIIllllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIIIll[65])) {
            item3.interact(llIIlIIIlI[llIIlIIIll[154]]);
            Time.sleepTicks((int)llIIlIIIll[5]);
            0;
            if (q.lIlIlIIlIIlIl(item2)) {
                item2.interact(llIIlIIIlI[llIIlIIIll[155]]);
                Time.sleepTicks((int)llIIlIIIll[0]);
                0;
            }
            Time.sleepTicks((int)llIIlIIIll[20]);
            0;
        }
        if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIlllIllIIll) && q.lIlIlIIlIIlll(Vars.getBit((int)llIIlIIIll[156]), llIIlIIIll[62]) && q.lIlIlIIlIllIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIIIll[65])) {
            while (q.lIlIlIIIlllII(Vars.getBit((int)llIIlIIIll[156]), llIIlIIIll[157])) {
                if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIlllIllIIll)) {
                    llllllllllllllllllIlIIlllIllIIll.interact(llIIlIIIlI[llIIlIIIll[158]]);
                    Time.sleepTicks((int)llIIlIIIll[0]);
                    0;
                }
                if (!q.lIlIlIIlIlIII(llllllllllllllllllIlIIlllIllIIll = Inventory.getFirst(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[195]])))) continue;
                0;
                if ((0x29 ^ 0x42 ^ (0xC3 ^ 0xAC)) > 1) break;
                return;
            }
        }
        String[] stringArray = new String[llIIlIIIll[0]];
        stringArray[q.llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[159]];
        Item llllllllllllllllllIlIIlllIllIIIl = Inventory.getFirst((String[])stringArray);
        if (q.lIlIlIIlIIlIl(llllllllllllllllllIlIIlllIllIIIl) && q.lIlIlIIlIllIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIIIll[65]) && q.lIlIlIIlIIllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIIIll[0])) {
            llllllllllllllllllIlIIlllIllIIIl.interact(llIIlIIIlI[llIIlIIIll[160]]);
            cI = e.c(llIIlIIIll[0], llIIlIIIll[4]);
        }
    }

    static boolean aQ() {
        boolean bl;
        if (q.lIlIlIIIllIIl(Inventory.contains(item -> item.getName().contains(llIIlIIIlI[llIIlIIIll[208]])) ? 1 : 0) && (!q.lIlIlIIIllIlI(Inventory.isFull() ? 1 : 0) || q.lIlIlIIIlllII(Vars.getBit((int)cW), llIIlIIIll[0]) && !q.lIlIlIIIllllI(Vars.getBit((int)llIIlIIIll[1]), llIIlIIIll[2])) || q.lIlIlIIIlllII(Vars.getBit((int)cW), llIIlIIIll[0]) && q.lIlIlIIIlllII(Vars.getBit((int)llIIlIIIll[1]), llIIlIIIll[2])) {
            bl = llIIlIIIll[0];
            0;
            if (((26 + 21 - -120 + 17 ^ 125 + 135 - 169 + 68) & (0xC3 ^ 0xBE ^ (0x72 ^ 0x28) ^ -1)) != 0) {
                return ((0xFD ^ 0xBB ^ (0x21 ^ 0x3C)) & (0xE ^ 0x69 ^ (0x85 ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            bl = llIIlIIIll[3];
        }
        return bl;
    }

    private static boolean lIlIlIIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIIIlIlII(String llllllllllllllllllIlIIlllIIIllll, String llllllllllllllllllIlIIlllIIIlIIl) {
        llllllllllllllllllIlIIlllIIIllll = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIlllIIIllIl = new StringBuilder();
        char[] llllllllllllllllllIlIIlllIIIllII = llllllllllllllllllIlIIlllIIIlIIl.toCharArray();
        int llllllllllllllllllIlIIlllIIIlIll = llIIlIIIll[3];
        char[] llllllllllllllllllIlIIlllIIIIlIl = llllllllllllllllllIlIIlllIIIllll.toCharArray();
        int llllllllllllllllllIlIIlllIIIIlII = llllllllllllllllllIlIIlllIIIIlIl.length;
        int llllllllllllllllllIlIIlllIIIIIll = llIIlIIIll[3];
        while (q.lIlIlIIIlllII(llllllllllllllllllIlIIlllIIIIIll, llllllllllllllllllIlIIlllIIIIlII)) {
            char llllllllllllllllllIlIIlllIIlIIII = llllllllllllllllllIlIIlllIIIIlIl[llllllllllllllllllIlIIlllIIIIIll];
            llllllllllllllllllIlIIlllIIIllIl.append((char)(llllllllllllllllllIlIIlllIIlIIII ^ llllllllllllllllllIlIIlllIIIllII[llllllllllllllllllIlIIlllIIIlIll % llllllllllllllllllIlIIlllIIIllII.length]));
            0;
            ++llllllllllllllllllIlIIlllIIIlIll;
            ++llllllllllllllllllIlIIlllIIIIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIIlllIIIllIl);
    }

    private static boolean lIlIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIIlIlll() {
        llIIlIIIll = new int[217];
        q.llIIlIIIll[0] = 1;
        q.llIIlIIIll[1] = -(0xFFFFDBD4 & 0x7E7F) & (0xFFFFDEF7 & 0x7F7F);
        q.llIIlIIIll[2] = 0xFFFFD5FC & 0x2FDF;
        q.llIIlIIIll[3] = (0xB4 ^ 0x86) & ~(0x12 ^ 0x20);
        q.llIIlIIIll[4] = 2;
        q.llIIlIIIll[5] = 3;
        q.llIIlIIIll[6] = -(0xFFFF9FF7 & 0x760B) & (0xFFFFB77F & 0x7FB6);
        q.llIIlIIIll[7] = 0x19 ^ 0xA ^ (0x58 ^ 0x4F);
        q.llIIlIIIll[8] = 0xBE ^ 0xBB;
        q.llIIlIIIll[9] = 0x12 ^ 0x40 ^ (0xE1 ^ 0xB5);
        q.llIIlIIIll[10] = 91 + 28 - 3 + 63 ^ 170 + 146 - 239 + 103;
        q.llIIlIIIll[11] = 0x2F ^ 0x4D ^ (0xF3 ^ 0x99);
        q.llIIlIIIll[12] = 0x29 ^ 0x20;
        q.llIIlIIIll[13] = 0x8F ^ 0x85;
        q.llIIlIIIll[14] = 0x60 ^ 0x6B;
        q.llIIlIIIll[15] = 143 + 162 - 198 + 78 ^ 32 + 73 - -57 + 5;
        q.llIIlIIIll[16] = -(0xFFFFEDAF & 0x565D) & (0xFFFFD7EF & 0x6FFF);
        q.llIIlIIIll[17] = 0x9F ^ 0x93;
        q.llIIlIIIll[18] = 73 + 34 - -19 + 57 ^ 36 + 63 - -87 + 0;
        q.llIIlIIIll[19] = 0x68 ^ 0x66;
        q.llIIlIIIll[20] = 17 + 111 - 112 + 172 ^ 68 + 39 - 42 + 114;
        q.llIIlIIIll[21] = 0x26 ^ 0x36;
        q.llIIlIIIll[22] = 3 ^ (0xBF ^ 0xAD);
        q.llIIlIIIll[23] = 0x5A ^ 0x48;
        q.llIIlIIIll[24] = 0x80 ^ 0x86 ^ (0xA0 ^ 0xB5);
        q.llIIlIIIll[25] = 0xFFFFFFF2 & 0x1E848D;
        q.llIIlIIIll[26] = 0xFFFFEFE2 & 0x2635BD;
        q.llIIlIIIll[27] = 0x78 ^ 0x6C;
        q.llIIlIIIll[28] = (0xD7 ^ 0xC6) + (110 + 20 - 89 + 105) - (0x3D ^ 0x51) + (36 + 1 - -71 + 43);
        q.llIIlIIIll[29] = 0x21 ^ 0x70 ^ (0xDF ^ 0x9B);
        q.llIIlIIIll[30] = 0x87 ^ 0x8E ^ (0x38 ^ 0x27);
        q.llIIlIIIll[31] = 172 + 150 - 273 + 128 ^ 50 + 30 - -62 + 24;
        q.llIIlIIIll[32] = 0x88 ^ 0xA1 ^ (0x6C ^ 0x5D);
        q.llIIlIIIll[33] = 0x5E ^ 0x47;
        q.llIIlIIIll[34] = 0x27 ^ 0x3D;
        q.llIIlIIIll[35] = 0x93 ^ 0xA3 ^ (0x4A ^ 0x61);
        q.llIIlIIIll[36] = 0xBD ^ 0xA1;
        q.llIIlIIIll[37] = 0x42 ^ 0x20 ^ 105 + 6 - -7 + 9;
        q.llIIlIIIll[38] = 0xFFFFE7AC & 0x197F;
        q.llIIlIIIll[39] = 0xFFFFD7FD & 0x29F6;
        q.llIIlIIIll[40] = 0xB2 ^ 0xBA ^ (0x8D ^ 0x9A);
        q.llIIlIIIll[41] = 0xC1 ^ 0xB4 ^ (0xE3 ^ 0xB6);
        q.llIIlIIIll[42] = 0x6E ^ 0x4F;
        q.llIIlIIIll[43] = 0x35 ^ 0x17;
        q.llIIlIIIll[44] = 0x9C ^ 0xBF;
        q.llIIlIIIll[45] = 0x13 ^ 0x1A ^ (0x51 ^ 0x7C);
        q.llIIlIIIll[46] = 156 + 162 - 254 + 114 ^ 104 + 130 - 218 + 135;
        q.llIIlIIIll[47] = 119 + 101 - 84 + 34 ^ 52 + 134 - 168 + 122;
        q.llIIlIIIll[48] = -(0xFFFFF2BD & 0x7DC3) & (0xFFFFFFFA & 0x7FEF);
        q.llIIlIIIll[49] = 0xAF ^ 0xB9 ^ (0x50 ^ 0x61);
        q.llIIlIIIll[50] = 0x1A ^ 0x45 ^ (0x77 ^ 0);
        q.llIIlIIIll[51] = 0xEC ^ 0xC5;
        q.llIIlIIIll[52] = 0 + 41 - -12 + 87 ^ 109 + 51 - 76 + 82;
        q.llIIlIIIll[53] = 0x7F ^ 0x54;
        q.llIIlIIIll[54] = 2 ^ (0xB2 ^ 0x9C);
        q.llIIlIIIll[55] = 97 + 14 - 71 + 87 ^ (0x67 ^ 0x35);
        q.llIIlIIIll[56] = 6 ^ 0x28 ^ (0xE5 ^ 0xB4) & ~(0x6B ^ 0x3A);
        q.llIIlIIIll[57] = 0x77 ^ 0x40 ^ (0x35 ^ 0x2D);
        q.llIIlIIIll[58] = -(0xFFFFE696 & 0x39FB) & (0xFFFFEFFD & 0x3FFF);
        q.llIIlIIIll[59] = (0x37 ^ 0x2B) + (0xB2 ^ 0x90) - -(0x9A ^ 0x9C) + (0x84 ^ 0xB9);
        q.llIIlIIIll[60] = 0xCC ^ 0xAC ^ (0xC ^ 0x5C);
        q.llIIlIIIll[61] = 0xAD ^ 0xA9 ^ (0x49 ^ 0x7C);
        q.llIIlIIIll[62] = 0x17 ^ 0x25;
        q.llIIlIIIll[63] = 0xFFFFEFFF & 0x8F9F8F;
        q.llIIlIIIll[64] = -(0xFFFFB77D & 0x4FE3) & (0xFFFF9FFF & 0xFFFF7F);
        q.llIIlIIIll[65] = 0xAC ^ 0x9F;
        q.llIIlIIIll[66] = 0x40 ^ 0x74;
        q.llIIlIIIll[67] = 0x4E ^ 0x79 ^ 2;
        q.llIIlIIIll[68] = 0x77 ^ 0x41;
        q.llIIlIIIll[69] = 0xAA ^ 0x9D;
        q.llIIlIIIll[70] = 0x3D ^ 0x3B ^ (0x3E ^ 0);
        q.llIIlIIIll[71] = 0xBF ^ 0x86;
        q.llIIlIIIll[72] = 110 + 38 - 60 + 39 ^ (0x59 ^ 0x1C);
        q.llIIlIIIll[73] = 0x6D ^ 0x75 ^ (2 ^ 0x21);
        q.llIIlIIIll[74] = 0xFF ^ 0xAE ^ (9 ^ 0x64);
        q.llIIlIIIll[75] = 0x90 ^ 0x87 ^ (0xB ^ 0x21);
        q.llIIlIIIll[76] = 0x95 ^ 0xAB;
        q.llIIlIIIll[77] = 107 + 146 - 192 + 188 ^ 97 + 83 - 86 + 104;
        q.llIIlIIIll[78] = 59 + 69 - -108 + 17 ^ 7 + 79 - -60 + 43;
        q.llIIlIIIll[79] = 1 ^ 0x40;
        q.llIIlIIIll[80] = 0x10 ^ 0x20 ^ (0xF7 ^ 0x85);
        q.llIIlIIIll[81] = 0x32 ^ 0x37 ^ (0xEF ^ 0xA9);
        q.llIIlIIIll[82] = 0x1F ^ 0x5B;
        q.llIIlIIIll[83] = 0x53 ^ 0x16;
        q.llIIlIIIll[84] = 0x76 ^ 0x30;
        q.llIIlIIIll[85] = 0xF6 ^ 0xB1;
        q.llIIlIIIll[86] = 0xD1 ^ 0xC0 ^ (0x75 ^ 0x2C);
        q.llIIlIIIll[87] = 0x32 ^ 0x5C ^ (0x1C ^ 0x3B);
        q.llIIlIIIll[88] = 245 + 113 - 122 + 12 ^ 44 + 118 - 151 + 167;
        q.llIIlIIIll[89] = 0x51 ^ 0x1A;
        q.llIIlIIIll[90] = 0x5D ^ 3 ^ (0x1E ^ 0xC);
        q.llIIlIIIll[91] = 0x24 ^ 0x15 ^ (0xF ^ 0x73);
        q.llIIlIIIll[92] = -(0xFFFFEFC3 & 0x583E) & (0xFFFFDF7D & 0x6BFF);
        q.llIIlIIIll[93] = 0x47 ^ 9;
        q.llIIlIIIll[94] = 0 + 25 - -71 + 151 ^ 51 + 115 - 156 + 174;
        q.llIIlIIIll[95] = 202 + 15 - 155 + 187 ^ 102 + 164 - 191 + 94;
        q.llIIlIIIll[96] = -(0xFFFFD5CB & 0x6E35) & (0xFFFFFDFF & 0x4FBD);
        q.llIIlIIIll[97] = 0xFFFFA9DF & 0x5FE3;
        q.llIIlIIIll[98] = -(0xFFFFBFDA & 0x676F) & (0xFFFFBFFF & Short.MAX_VALUE);
        q.llIIlIIIll[99] = 0xFFFFFE49 & 0x35FF;
        q.llIIlIIIll[100] = -(0xFFFFFCA7 & 0x6759) & (0xFFFFFDBE & 0x7EF9);
        q.llIIlIIIll[101] = -(0xFFFFBE17 & 0x79EB) & (0xFFFFFFDF & 0x3B7F);
        q.llIIlIIIll[102] = -(0xFFFFCE24 & 0x77DF) & (0xFFFFFFF7 & 0x77FF);
        q.llIIlIIIll[103] = -(0xFFFFB75C & 0x79E7) & (0xFFFFB7EF & 0x7FFB);
        q.llIIlIIIll[104] = -(0xFFFFEE3F & 0x53DD) & (0xFFFFFF1F & 0x6BFF);
        q.llIIlIIIll[105] = -(0xFFFFD63D & 0x79CB) & (0xFFFFFFFE & 0x7B7F);
        q.llIIlIIIll[106] = -(0xFFFFD63F & 0x3FC1) & (0xFFFF9FBF & Short.MAX_VALUE);
        q.llIIlIIIll[107] = 0xFFFFAFFF & 0x59C5;
        q.llIIlIIIll[108] = -(0xFFFFFEBD & 0x5573) & (0xFFFFDDFF & 0x7FF7);
        q.llIIlIIIll[109] = -(0xFFFFB77F & 0x5E8F) & (0xFFFFDFFF & 0x3FCF);
        q.llIIlIIIll[110] = 0x32 ^ 0x15 ^ (0x32 ^ 0x44);
        q.llIIlIIIll[111] = -(0xFFFFDC4D & 0x63B3) & (0xFFFFDDFF & 0x7B7B);
        q.llIIlIIIll[112] = -(0xFFFFADDB & 0x7EA7) & (0xFFFFFFB7 & Short.MAX_VALUE);
        q.llIIlIIIll[113] = -(0xFFFFBEED & 0x4557) & (0xFFFFF77E & 0x5FFD);
        q.llIIlIIIll[114] = -(0xFFFFEF19 & 0x38EF) & (0xFFFFFB7E & 0x7FBB);
        q.llIIlIIIll[115] = 0xFFFFFB7D & 0x1DFE;
        q.llIIlIIIll[116] = -(0xFFFFBFB3 & 0x665E) & (0xFFFFFFFD & 0x3FBB);
        q.llIIlIIIll[117] = 0xFFFFFFFC & 0x2B7B;
        q.llIIlIIIll[118] = 0x63 ^ 0x31;
        q.llIIlIIIll[119] = 0xFA ^ 0xA9;
        q.llIIlIIIll[120] = -(0xFFFF9E5F & 0x65E7) & (0xFFFFF7EE & 0x1FDF);
        q.llIIlIIIll[121] = 0x3D ^ 0x69;
        q.llIIlIIIll[122] = -(0xFFFFF70F & 0x4CFE) & (0xFFFFFDFF & 0x77FF);
        q.llIIlIIIll[123] = 0xDD ^ 0x88;
        q.llIIlIIIll[124] = 0x43 ^ 0x20 ^ (0x32 ^ 7);
        q.llIIlIIIll[125] = 2 ^ (0x20 ^ 0x75);
        q.llIIlIIIll[126] = -(0xFFFFDE4F & 0x35B4) & (0xFFFFDFFB & 0x37EF);
        q.llIIlIIIll[127] = 0xF6 ^ 0xAE;
        q.llIIlIIIll[128] = 0x54 ^ 0x2C ^ (0x49 ^ 0x68);
        q.llIIlIIIll[129] = 0x49 ^ 0x71 ^ (0xC1 ^ 0xA3);
        q.llIIlIIIll[130] = 0x3C ^ 7 ^ (0xC3 ^ 0xA3);
        q.llIIlIIIll[131] = 0xE6 ^ 0xBA;
        q.llIIlIIIll[132] = 0x96 ^ 0xB3 ^ (0x43 ^ 0x3B);
        q.llIIlIIIll[133] = 0xE5 ^ 0xBB;
        q.llIIlIIIll[134] = 0xF ^ 0x50;
        q.llIIlIIIll[135] = 119 + 172 - 95 + 54 ^ 4 + 2 - -104 + 44;
        q.llIIlIIIll[136] = 0x23 ^ 0x42;
        q.llIIlIIIll[137] = 48 + 69 - -32 + 14 ^ 134 + 156 - 224 + 127;
        q.llIIlIIIll[138] = 0x4F ^ 0x2C;
        q.llIIlIIIll[139] = 0x1B ^ 0x7F;
        q.llIIlIIIll[140] = 0x4A ^ 0x11 ^ (0x40 ^ 0x7E);
        q.llIIlIIIll[141] = 0xFFFFEDF9 & 0x25BF6;
        q.llIIlIIIll[142] = 0x93 ^ 0xC7 ^ (0xA7 ^ 0x95);
        q.llIIlIIIll[143] = 78 + 43 - 26 + 71 ^ 113 + 21 - 115 + 174;
        q.llIIlIIIll[144] = 0xFFFFF690 & 0x3D9FF;
        q.llIIlIIIll[145] = 0xCB ^ 0xA3;
        q.llIIlIIIll[146] = 0xFFFFAFF7 & 0x598A;
        q.llIIlIIIll[147] = -(0xFFFFDB6D & 0x74B7) & (0xFFFFFFF6 & 0x7DFF);
        q.llIIlIIIll[148] = -(0x46 ^ 0x67) & (0xFFFFEDF3 & 0x3FFF);
        q.llIIlIIIll[149] = 0xFFFFEFDD & 0x3DF6;
        q.llIIlIIIll[150] = -(0xFFFFDA57 & 0x35AB) & (0xFFFFBFFF & 0x7DD7);
        q.llIIlIIIll[151] = 0xFFFFDFEF & 0x3F5A;
        q.llIIlIIIll[152] = 0xFFFFBF79 & 0x71D7;
        q.llIIlIIIll[153] = -(0xFFFFF3FD & 0x6C23) & (0xFFFFFFE7 & 0x7F7F);
        q.llIIlIIIll[154] = 0xFB ^ 0x92;
        q.llIIlIIIll[155] = 0xED ^ 0x87;
        q.llIIlIIIll[156] = -(0xFFFFF599 & 0x7AEF) & (0xFFFFFFFE & 0x7FFD);
        q.llIIlIIIll[157] = 0xFFFFDBBC & 0x26FF;
        q.llIIlIIIll[158] = 0x19 ^ 0x60 ^ (0 ^ 0x12);
        q.llIIlIIIll[159] = 0xA9 ^ 0xC5;
        q.llIIlIIIll[160] = 0x7F ^ 0x12;
        q.llIIlIIIll[161] = 0x50 ^ 0x3E;
        q.llIIlIIIll[162] = 0x9E ^ 0xA1 ^ (0xC4 ^ 0x83);
        q.llIIlIIIll[163] = -(0xFFFFFDF7 & 0x5F8B) & (0xFFFFFFEE & 0x7FF3);
        q.llIIlIIIll[164] = -(0xFFFF8753 & 0x7CAD) & (0xFFFFDFFB & 0x2DFC);
        q.llIIlIIIll[165] = 0xFFFFFF7E & 0x7ED;
        q.llIIlIIIll[166] = -(0xFFFFEEFD & 0x7D3B) & (0xFFFFEFBC & Short.MAX_VALUE);
        q.llIIlIIIll[167] = 38 + 75 - -98 + 1 ^ 152 + 156 - 218 + 97;
        q.llIIlIIIll[168] = -(0xFFFFF7D7 & 0x3F6E) & (0xFFFFBFFF & 0xFFFD);
        q.llIIlIIIll[169] = 0xFFFFFDEF & 0x8EF38;
        q.llIIlIIIll[170] = 0xFFFFBF6B & 0x9C9FC;
        q.llIIlIIIll[171] = -(0xFFFFDFE7 & 0x719F) & (0xFFFFFFF6 & 0x7FCF);
        q.llIIlIIIll[172] = 0xFFFFBBF9 & 0x2EF9E;
        q.llIIlIIIll[173] = -(0xFFFFADF5 & 0x7B5E) & (0xFFFFFFFB & 0x2FBFF);
        q.llIIlIIIll[174] = 0xFFFFFA1B & 0xDADFC;
        q.llIIlIIIll[175] = -(78 + 92 - 132 + 125) & (0xFFFFDFFE & 0xE3DEB);
        q.llIIlIIIll[176] = -(0xFFFF99FF & 0x7EEC) & (0xFFFFBEFF & 0x1679FB);
        q.llIIlIIIll[177] = 0xFFFFBE5C & 0x16FDF3;
        q.llIIlIIIll[178] = 0xFFFF8F37 & 0x11FCF8;
        q.llIIlIIIll[179] = -(0xFFFFCF47 & 0x71BE) & (0xFFFFF7F7 & 0x135BDD);
        q.llIIlIIIll[180] = 0xFFFFDFF7 & 0xAA758;
        q.llIIlIIIll[181] = 0xFFFFFBE4 & 0xB4EBB;
        q.llIIlIIIll[182] = -(0xFFFFFEF5 & 0x798B) & (0xFFFFFFF6 & 0x2D7BF9);
        q.llIIlIIIll[183] = 0xFFFFFF9D & 0x2E9DFA;
        q.llIIlIIIll[184] = 226 + 166 - 327 + 184 ^ 15 + 85 - 15 + 52;
        q.llIIlIIIll[185] = -(0xFFFFF9A3 & 0x2E5F) & (0xFFFFFFFF & 0xFEDA);
        q.llIIlIIIll[186] = 0xFFFFFFEA & 0xFDFD;
        q.llIIlIIIll[187] = -(0xFFFFACF5 & 0x7B8E) & (0xFFFFBFFB & 0x7FF7);
        q.llIIlIIIll[188] = -(0xFFFFDBBA & 0x354D) & (0xFFFFFFFF & 0x3BFF);
        q.llIIlIIIll[189] = 42 + 47 - 14 + 55;
        q.llIIlIIIll[190] = 41 + 33 - 62 + 138;
        q.llIIlIIIll[191] = 0xFFFFBFEF & 0x65BBC;
        q.llIIlIIIll[192] = -(0xFFFFCD3B & 0x7BC5) & (0xFFFFFFCF & 0x6FFF0);
        q.llIIlIIIll[193] = 0xFFFFBFEC & 0x5D5F;
        q.llIIlIIIll[194] = -(0xFFFFFF6B & 0x2EFE) & (0xFFFFBFFD & Short.MAX_VALUE);
        q.llIIlIIIll[195] = 0x3F ^ 0x4E;
        q.llIIlIIIll[196] = 0xB1 ^ 0x88 ^ (0xD4 ^ 0x9F);
        q.llIIlIIIll[197] = 0x2E ^ 0x5D;
        q.llIIlIIIll[198] = 0xC1 ^ 0x81 ^ (0x3F ^ 0xB);
        q.llIIlIIIll[199] = 0x9D ^ 0xA7 ^ (0xE0 ^ 0xAF);
        q.llIIlIIIll[200] = 138 + 236 - 350 + 225 ^ 82 + 136 - 147 + 72;
        q.llIIlIIIll[201] = 3 + 104 - -49 + 21 ^ 145 + 86 - 220 + 187;
        q.llIIlIIIll[202] = 24 + 106 - 3 + 115 ^ 21 + 18 - -57 + 43;
        q.llIIlIIIll[203] = 0x8C ^ 0xAF ^ (0x5A ^ 3);
        q.llIIlIIIll[204] = 140 + 81 - 64 + 48 ^ 66 + 133 - 175 + 158;
        q.llIIlIIIll[205] = 88 + 146 - 178 + 177 ^ 106 + 133 - 223 + 133;
        q.llIIlIIIll[206] = 0xB8 ^ 0x8D ^ (0xCC ^ 0x84);
        q.llIIlIIIll[207] = -(0xFFFFFFF5 & 0x680B) & (0xFFFFFDFD & 0x7BAF);
        q.llIIlIIIll[208] = 0x9D ^ 0x97 ^ (0x33 ^ 0x47);
        q.llIIlIIIll[209] = -(0xFFFFF5AB & 0x7FDE) & (0xFFFFFFEF & 0x7FBB);
        q.llIIlIIIll[210] = 0xFFFFAD1E & 0x5EEF;
        q.llIIlIIIll[211] = 0xFFFFCBF5 & 0x3E3F;
        q.llIIlIIIll[212] = 0xFFFFAC1F & 0x5FF6;
        q.llIIlIIIll[213] = 0xFFFFCABF & 0x3F6C;
        q.llIIlIIIll[214] = -(0xFFFFF275 & 0x4FCF) & (0xFFFFDEEF & 0x6F7F);
        q.llIIlIIIll[215] = 0xFFFFDF79 & 0x2FF7;
        q.llIIlIIIll[216] = (0x14 ^ 0x39) + (0x5B ^ 0x62) - (0x11 ^ 0x5B) + (0xC5 ^ 0xA6);
    }

    private static boolean lIlIlIIlIlIII(Object object) {
        return object == null;
    }
}

