/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class F
implements S {
    private static /* synthetic */ String[] llllIIIlII;
    public static /* synthetic */ WorldPoint hc;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] llllIIlIII;
    static /* synthetic */ int ck;
    static /* synthetic */ int bS;
    private static final /* synthetic */ String[] hb;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllIIlIII[1]];
        nArray[F.llllIIlIII[0]] = llllIIlIII[11];
        if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllIIlIII[1]];
            nArray2[F.llllIIlIII[0]] = llllIIlIII[12];
            if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllIIlIII[1]];
                nArray3[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llllIIlIII[1];
                    0;
                    if (1 <= 1) return n2 != 0;
                    return ((0xE6 ^ 0x8F ^ (0xE ^ 0x25)) & (0xB8 ^ 0xA9 ^ (0x4F ^ 0x1C) ^ -1)) != 0;
                }
            }
        }
        n2 = llllIIlIII[0];
        return n2 != 0;
    }

    public static void cq() {
        block49: {
            BankLocation lllllllllllllllllIlIllIlllIlllII;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (F.llIIllIIlIlIl(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[0]];
                                b.a(bu);
                                if (F.llIIllIIlIllI(bu.size(), llllIIlIII[1])) {
                                    System.out.println(llllIIIlII[llllIIlIII[1]]);
                                    bs = llllIIlIII[0];
                                }
                            }
                            if (!F.llIIllIIlIlll(bs ? 1 : 0)) break block49;
                            if (F.llIIllIIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && F.llIIllIIlIllI(Movement.getRunEnergy(), llllIIlIII[2]) && F.llIIllIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aU).interact(llllIIIlII[llllIIlIII[3]]);
                                Time.sleepTicks((int)llllIIlIII[1]);
                                0;
                            }
                            if (F.llIIllIIlIlll(F.aa() ? 1 : 0) && F.llIIllIIlIllI(e.j(llllIIlIII[4]), llllIIlIII[1])) {
                                lllllllllllllllllIlIllIlllIlllII = BankLocation.getNearest();
                                if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlllII) && F.llIIllIIlIlll(lllllllllllllllllIlIllIlllIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[5]];
                                    a.a(lllllllllllllllllIlIllIlllIlllII);
                                }
                                if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlllII) && F.llIIllIIlIlIl(lllllllllllllllllIlIllIlllIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (F.llIIllIIlIlll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIII[7]);
                                        0;
                                    }
                                    if (F.llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[8]];
                                        if (F.llIIllIIllIIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llllIIlIII[6]);
                                            0;
                                        }
                                        if (F.llIIllIIllIIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llllIIlIII[3]);
                                            0;
                                        }
                                        int[] nArray = new int[llllIIlIII[1]];
                                        nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                                        if (F.llIIllIIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[llllIIlIII[1]];
                                            nArray2[F.llllIIlIII[0]] = llllIIlIII[9];
                                            if (F.llIIllIIlIllI(Bank.getFirst((int[])nArray2).getQuantity(), llllIIlIII[5])) {
                                                F.ae();
                                                System.out.println(llllIIIlII[llllIIlIII[10]]);
                                                bs = llllIIlIII[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[llllIIlIII[8]];
                                        nArray3[F.llllIIlIII[0]] = llllIIlIII[11];
                                        nArray3[F.llllIIlIII[1]] = llllIIlIII[12];
                                        nArray3[F.llllIIlIII[3]] = llllIIlIII[9];
                                        nArray3[F.llllIIlIII[5]] = llllIIlIII[13];
                                        nArray3[F.llllIIlIII[6]] = llllIIlIII[14];
                                        if (F.llIIllIIlIlll(e.b(nArray3) ? 1 : 0)) {
                                            F.ae();
                                            System.out.println(llllIIIlII[llllIIlIII[15]]);
                                            bs = llllIIlIII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[llllIIlIII[8]];
                                    nArray[F.llllIIlIII[0]] = llllIIlIII[11];
                                    nArray[F.llllIIlIII[1]] = llllIIlIII[12];
                                    nArray[F.llllIIlIII[3]] = llllIIlIII[9];
                                    nArray[F.llllIIlIII[5]] = llllIIlIII[13];
                                    nArray[F.llllIIlIII[6]] = llllIIlIII[14];
                                    if (F.llIIllIIlIlIl(e.b(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)llllIIlIII[11], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                        Bank.withdraw((int)llllIIlIII[12], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                        Bank.withdraw((int)llllIIlIII[9], (int)llllIIlIII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                        Bank.withdraw((int)llllIIlIII[13], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                        Bank.withdraw((int)llllIIlIII[14], (int)llllIIlIII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                        a.b(f.be, llllIIlIII[1]);
                                        Time.sleepTicks((int)llllIIlIII[5]);
                                        0;
                                    }
                                }
                            }
                            if (F.llIIllIIlIlIl(F.aa() ? 1 : 0) && F.llIIllIIlIllI(e.j(llllIIlIII[4]), llllIIlIII[1])) {
                                if (F.llIIllIIlIllI(bS, llllIIlIII[1])) {
                                    e.v();
                                    bS += llllIIlIII[1];
                                }
                                if (F.llIIllIIllIIl(bS)) {
                                    if (F.llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[16]];
                                        Movement.walkTo((WorldPoint)hc);
                                        0;
                                        Time.sleepTicks((int)llllIIlIII[1]);
                                        0;
                                    }
                                    if (F.llIIllIIllIll(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[17]];
                                        String[] stringArray = new String[llllIIlIII[1]];
                                        stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[18]];
                                        lllllllllllllllllIlIllIlllIlllII = TileObjects.getNearest((String[])stringArray);
                                        if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlllII)) {
                                            String[] stringArray2 = new String[llllIIlIII[1]];
                                            stringArray2[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[19]];
                                            if (F.llIIllIIlIlIl(lllllllllllllllllIlIllIlllIlllII.hasAction(stringArray2) ? 1 : 0)) {
                                                lllllllllllllllllIlIllIlllIlllII.interact(llllIIIlII[llllIIlIII[20]]);
                                                Time.sleepTicks((int)llllIIlIII[5]);
                                                0;
                                            }
                                        }
                                        g.a(llllIIIlII[llllIIlIII[21]], hb);
                                    }
                                }
                            }
                            int[] nArray = new int[llllIIlIII[1]];
                            nArray[F.llllIIlIII[0]] = llllIIlIII[22];
                            if (!F.llIIllIIllIII(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[llllIIlIII[1]];
                            nArray4[F.llllIIlIII[0]] = llllIIlIII[23];
                            if (!F.llIIllIIllIII(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[llllIIlIII[1]];
                            nArray5[F.llllIIlIII[0]] = llllIIlIII[24];
                            if (!F.llIIllIIlllII(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(hb);
                    }
                    if (!F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[5])) break block52;
                    String[] stringArray = new String[llllIIlIII[1]];
                    stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[25]];
                    if (!F.llIIllIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[llllIIlIII[1]];
                    stringArray3[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[26]];
                    if (!F.llIIllIIlIlIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[27]];
                    String[] stringArray = new String[llllIIlIII[1]];
                    stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[28]];
                    lllllllllllllllllIlIllIlllIlllII = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[llllIIlIII[1]];
                    stringArray4[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[29]];
                    Item lllllllllllllllllIlIllIlllIllIll = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[llllIIlIII[1]];
                    nArray6[F.llllIIlIII[0]] = llllIIlIII[9];
                    Item lllllllllllllllllIlIllIlllIllIlI = Inventory.getFirst((int[])nArray6);
                    if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlllII) && F.llIIllIIllIII(lllllllllllllllllIlIllIlllIllIlI)) {
                        lllllllllllllllllIlIllIlllIlllII.useOn(lllllllllllllllllIlIllIlllIllIlI);
                        Time.sleepTicks((int)llllIIlIII[1]);
                        0;
                    }
                    int[] nArray7 = new int[llllIIlIII[1]];
                    nArray7[F.llllIIlIII[0]] = llllIIlIII[9];
                    lllllllllllllllllIlIllIlllIllIlI = Inventory.getFirst((int[])nArray7);
                    if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIllIll) && F.llIIllIIllIII(lllllllllllllllllIlIllIlllIllIlI)) {
                        lllllllllllllllllIlIllIlllIllIll.useOn(lllllllllllllllllIlIllIlllIllIlI);
                    }
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[5])) {
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIII[1]];
                    stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[30]];
                    if (F.llIIllIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        F.cc();
                    }
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[5])) {
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIII[1]];
                    stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[31]];
                    if (F.llIIllIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        ck = llllIIlIII[0];
                        if (F.llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[32]];
                            Movement.walkTo((WorldPoint)hc);
                            0;
                            Time.sleepTicks((int)llllIIlIII[1]);
                            0;
                        }
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[33]];
                        g.a(llllIIIlII[llllIIlIII[34]], hb, llllIIlIII[1]);
                    }
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[35])) {
                String[] stringArray = new String[llllIIlIII[1]];
                stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[36]];
                if (F.llIIllIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    F.cc();
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[35])) {
                String[] stringArray = new String[llllIIlIII[1]];
                stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[37]];
                if (F.llIIllIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (F.llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[38]];
                        Movement.walkTo((WorldPoint)hc);
                        0;
                        Time.sleepTicks((int)llllIIlIII[1]);
                        0;
                    }
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[39]];
                    g.a(llllIIIlII[llllIIlIII[40]], hb, llllIIlIII[1]);
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[41])) {
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    F.cc();
                }
            }
            if (F.llIIllIIlllIl(e.j(llllIIlIII[4]), llllIIlIII[41])) {
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[42]];
                    if (F.llIIllIIlIllI(ck, llllIIlIII[1])) {
                        ac.mV += llllIIlIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIIlIII[1];
                        ac.mV = llllIIlIII[0];
                        cl = llllIIlIII[0];
                    }
                    if (F.llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[43]];
                        Movement.walkTo((WorldPoint)hc);
                        0;
                        Time.sleepTicks((int)llllIIlIII[1]);
                        0;
                    }
                    g.a(llllIIIlII[llllIIlIII[44]], hb, llllIIlIII[1]);
                }
            }
            if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlllII = Widgets.get((int)llllIIlIII[45], (int)llllIIlIII[26]))) {
                lllllllllllllllllIlIllIlllIlllII.interact(llllIIlIII[0]);
            }
            g.a(new String[llllIIlIII[0]]);
        }
    }

    private static void llIIllIIlIlII() {
        llllIIlIII = new int[74];
        F.llllIIlIII[0] = (0x6B ^ 0x51) & ~(0xB6 ^ 0x8C);
        F.llllIIlIII[1] = 1;
        F.llllIIlIII[2] = 0x28 ^ 0x63;
        F.llllIIlIII[3] = 2;
        F.llllIIlIII[4] = 0xA7 ^ 0x99;
        F.llllIIlIII[5] = 3;
        F.llllIIlIII[6] = 0x67 ^ 0x6A ^ (0xB ^ 2);
        F.llllIIlIII[7] = -(0xFFFFA36F & 0x7CF3) & (0xFFFFB3EB & 0x7FFE);
        F.llllIIlIII[8] = 133 + 118 - 214 + 135 ^ 109 + 62 - 58 + 56;
        F.llllIIlIII[9] = -(0xFFFFD7BD & 0x38DF) & (0xFFFFF5BE & 0x1BFD);
        F.llllIIlIII[10] = 71 + 34 - -17 + 19 ^ 23 + 24 - -49 + 43;
        F.llllIIlIII[11] = -(0xFFFFD17D & 0x6F93) & (0xFFFFCFF7 & 0x77FF);
        F.llllIIlIII[12] = -(0xFFFFDBBF & 0x7D51) & (0xFFFFDFF9 & Short.MAX_VALUE);
        F.llllIIlIII[13] = -(0xFFFF9E8B & 0x6FF5) & (0xFFFFBFD3 & 0x7FFD);
        F.llllIIlIII[14] = 0xFFFFFF5B & 0x1FED;
        F.llllIIlIII[15] = 0x88 ^ 0x8F;
        F.llllIIlIII[16] = 0x79 ^ 0x32 ^ (0x33 ^ 0x70);
        F.llllIIlIII[17] = 0x93 ^ 0xC6 ^ (0x9C ^ 0xC0);
        F.llllIIlIII[18] = 149 + 147 - 198 + 63 ^ 36 + 65 - -23 + 47;
        F.llllIIlIII[19] = 0x82 ^ 0x89;
        F.llllIIlIII[20] = 0xEC ^ 0x88 ^ (0x28 ^ 0x40);
        F.llllIIlIII[21] = 0xB1 ^ 0xBC;
        F.llllIIlIII[22] = -(0xFFFFDF3F & 0x29CF) & (0xFFFFAFBE & 0x5BEF);
        F.llllIIlIII[23] = 0xFFFFC6B9 & 0x3BE7;
        F.llllIIlIII[24] = -(0xFFFFFAC7 & 0x3D79) & (0xFFFFFFFF & 0x3ADF);
        F.llllIIlIII[25] = 0xC0 ^ 0x81 ^ (0xE7 ^ 0xA8);
        F.llllIIlIII[26] = 0x2D ^ 0x22;
        F.llllIIlIII[27] = 0x35 ^ 0x25;
        F.llllIIlIII[28] = 0xF ^ 0x4D ^ (0x77 ^ 0x24);
        F.llllIIlIII[29] = 0xAE ^ 0xBC;
        F.llllIIlIII[30] = 115 + 59 - 79 + 50 ^ 82 + 110 - 153 + 91;
        F.llllIIlIII[31] = 0x56 ^ 0x42;
        F.llllIIlIII[32] = 0x39 ^ 0x74 ^ (0xF8 ^ 0xA0);
        F.llllIIlIII[33] = 8 + 100 - 74 + 125 ^ 69 + 59 - 76 + 85;
        F.llllIIlIII[34] = 0x7A ^ 0x6D;
        F.llllIIlIII[35] = -(0xFFFFDC8F & 0x6F71) & (0xFFFFEEF6 & 0x5F0D);
        F.llllIIlIII[36] = 0x3E ^ 0x2F ^ (0x42 ^ 0x4B);
        F.llllIIlIII[37] = 0x73 ^ 0x64 ^ (0x60 ^ 0x6E);
        F.llllIIlIII[38] = 34 + 64 - 92 + 129 ^ 61 + 85 - 139 + 150;
        F.llllIIlIII[39] = 47 + 122 - 158 + 123 ^ 10 + 31 - -106 + 10;
        F.llllIIlIII[40] = 0xAC ^ 0xB0;
        F.llllIIlIII[41] = -(0xFFFFF7FB & 0x7B3F) & (0xFFFFFFFF & 0x773F);
        F.llllIIlIII[42] = 0xBB ^ 0xA6;
        F.llllIIlIII[43] = 0x3D ^ 0x29 ^ (0xA1 ^ 0xAB);
        F.llllIIlIII[44] = 0x5E ^ 0x41;
        F.llllIIlIII[45] = -(0xFFFFAF3B & 0x72E7) & (0xFFFFFFBF & 0x2377);
        F.llllIIlIII[46] = 5 + 97 - -29 + 30 ^ 23 + 87 - -14 + 5;
        F.llllIIlIII[47] = 0x97 ^ 0xB6;
        F.llllIIlIII[48] = 9 ^ 0xF ^ (0x7A ^ 0x5E);
        F.llllIIlIII[49] = 0xF ^ 0x78 ^ (0x55 ^ 1);
        F.llllIIlIII[50] = 0x4E ^ 0x72 ^ (0x27 ^ 0x3F);
        F.llllIIlIII[51] = 0xA8 ^ 0x8D;
        F.llllIIlIII[52] = 0x2E ^ 8;
        F.llllIIlIII[53] = 0xB8 ^ 0x9F;
        F.llllIIlIII[54] = 163 + 55 - 190 + 158 ^ 126 + 91 - 164 + 93;
        F.llllIIlIII[55] = 0x17 ^ 0x3E;
        F.llllIIlIII[56] = -(0xFFFFCD9E & 0x7A65) & (0xFFFFEB2F & 0x7FFB);
        F.llllIIlIII[57] = -(2 ^ 0x20) & (0xFFFFFEFF & 0x2FED);
        F.llllIIlIII[58] = -(0xFFFFBA5F & 0x55B7) & (0xFFFFF3FE & 0x7DBF);
        F.llllIIlIII[59] = -(0xFFFFF89B & 0x677D) & (0xFFFFFF7F & 0x7FDF);
        F.llllIIlIII[60] = -(0xFFFFD6BB & 0x69C6) & (0xFFFFEFED & 0x57FF);
        F.llllIIlIII[61] = 0x10 ^ 0x74;
        F.llllIIlIII[62] = 0x9B ^ 0xB1;
        F.llllIIlIII[63] = 0x40 ^ 0x6B;
        F.llllIIlIII[64] = 0x25 ^ 9;
        F.llllIIlIII[65] = 0x8B ^ 0xA6;
        F.llllIIlIII[66] = 0 ^ 0x2E;
        F.llllIIlIII[67] = 0x4C ^ 0x63;
        F.llllIIlIII[68] = 148 + 1 - -38 + 4 ^ 91 + 74 - 148 + 126;
        F.llllIIlIII[69] = 0x1C ^ 0x2D;
        F.llllIIlIII[70] = 0xC5 ^ 0xAB ^ (0 ^ 0x5C);
        F.llllIIlIII[71] = -(0xFFFFFEB5 & 0x716B) & (0xFFFFFBFF & 0x7FAD);
        F.llllIIlIII[72] = 0xFFFF9DFE & 0x6FB9;
        F.llllIIlIII[73] = 0x2F ^ 0x1C;
    }

    private static boolean llIIllIIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return llllIIlIII[0];
    }

    private static boolean llIIllIIllIII(Object object) {
        return object != null;
    }

    private static void ae() {
        d lllllllllllllllllIlIllIlllIIlllI;
        Object lllllllllllllllllIlIllIlllIIllll;
        block10: {
            block9: {
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[11];
                if (F.llIIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllIIlIII[11], llllIIlIII[1], llllIIlIII[56]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllIIlIII[1]];
                nArray2[F.llllIIlIII[0]] = llllIIlIII[12];
                if (F.llIIllIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlllIIllll = new d(llllIIlIII[12], llllIIlIII[1], llllIIlIII[56]);
                    bu.add((d)lllllllllllllllllIlIllIlllIIllll);
                    0;
                }
                int[] nArray3 = new int[llllIIlIII[1]];
                nArray3[F.llllIIlIII[0]] = llllIIlIII[9];
                if (!F.llIIllIIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[llllIIlIII[1]];
                nArray4[F.llllIIlIII[0]] = llllIIlIII[9];
                if (!F.llIIllIIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[llllIIlIII[1]];
                nArray5[F.llllIIlIII[0]] = llllIIlIII[9];
                if (!F.llIIllIIlIllI(Bank.getFirst((int[])nArray5).getQuantity(), llllIIlIII[5])) break block10;
            }
            lllllllllllllllllIlIllIlllIIllll = new d(llllIIlIII[9], llllIIlIII[5], llllIIlIII[56]);
            bu.add((d)lllllllllllllllllIlIllIlllIIllll);
            0;
        }
        int[] nArray = new int[llllIIlIII[1]];
        nArray[F.llllIIlIII[0]] = llllIIlIII[14];
        if (F.llIIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllIlIllIlllIIllll = new d(llllIIlIII[14], llllIIlIII[8], llllIIlIII[56]);
            bu.add((d)lllllllllllllllllIlIllIlllIIllll);
            0;
        }
        if (F.llIIllIIlIlll(Bank.contains((Predicate)(lllllllllllllllllIlIllIlllIIllll = item -> item.getName().toLowerCase().contains(llllIIIlII[llllIIlIII[63]]))) ? 1 : 0)) {
            lllllllllllllllllIlIllIlllIIlllI = new d(llllIIlIII[57], llllIIlIII[8], llllIIlIII[58]);
            bu.add(lllllllllllllllllIlIllIlllIIlllI);
            0;
        }
        int[] nArray6 = new int[llllIIlIII[1]];
        nArray6[F.llllIIlIII[0]] = llllIIlIII[59];
        if (F.llIIllIIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIlIllIlllIIlllI = new d(llllIIlIII[59], llllIIlIII[54], llllIIlIII[60]);
            bu.add(lllllllllllllllllIlIllIlllIIlllI);
            0;
        }
        int[] nArray7 = new int[llllIIlIII[1]];
        nArray7[F.llllIIlIII[0]] = llllIIlIII[13];
        if (F.llIIllIIlIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllllllllllllllllIlIllIlllIIlllI = new d(llllIIlIII[13], llllIIlIII[8], i.bp);
            bu.add(lllllllllllllllllIlIllIlllIIlllI);
            0;
        }
    }

    private static boolean llIIllIIlllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIllIIlIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            F.cq();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((8 ^ 0xD ^ (0x18 ^ 0x2F)) & (0x7D ^ 0x6C ^ (0x4F ^ 0x6C) ^ -1)) >= 2) {
            return (0x71 ^ 0x7C ^ (0x50 ^ 2) & ~(0x5B ^ 9)) & (0x24 ^ 0x46 ^ (0x6E ^ 1) ^ -1);
        }
        return llllIIlIII[61];
    }

    private static boolean llIIllIIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIllIIlllII(Object object) {
        return object == null;
    }

    private static void cr() {
        block8: {
            block7: {
                String[] stringArray = new String[llllIIlIII[1]];
                stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[51]];
                if (!F.llIIllIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[llllIIlIII[1]];
                stringArray2[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[52]];
                if (!F.llIIllIIlIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[llllIIlIII[1]];
            nArray[F.llllIIlIII[0]] = llllIIlIII[9];
            if (F.llIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (F.llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(llllIIlIII[3], llllIIlIII[5]));
                    0;
                }
                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[53]];
                String[] stringArray = new String[llllIIlIII[1]];
                stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[54]];
                Item lllllllllllllllllIlIllIlllIlIlII = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[llllIIlIII[1]];
                stringArray3[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[55]];
                Item lllllllllllllllllIlIllIlllIlIIll = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[llllIIlIII[1]];
                nArray2[F.llllIIlIII[0]] = llllIIlIII[9];
                Item lllllllllllllllllIlIllIlllIlIIlI = Inventory.getFirst((int[])nArray2);
                if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlIlII) && F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlIIlI)) {
                    lllllllllllllllllIlIllIlllIlIlII.useOn(lllllllllllllllllIlIllIlllIlIIlI);
                    Time.sleepTicks((int)llllIIlIII[1]);
                    0;
                }
                int[] nArray3 = new int[llllIIlIII[1]];
                nArray3[F.llllIIlIII[0]] = llllIIlIII[9];
                lllllllllllllllllIlIllIlllIlIIlI = Inventory.getFirst((int[])nArray3);
                if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlIIll) && F.llIIllIIllIII(lllllllllllllllllIlIllIlllIlIIlI)) {
                    lllllllllllllllllIlIllIlllIlIIll.useOn(lllllllllllllllllIlIllIlllIlIIlI);
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (F.llIIllIIllllI(e.j(llllIIlIII[4]), llllIIlIII[10]) && !F.llIIllIIllllI(e.j(llllIIlIII[4]), llllIIlIII[18]) || F.llIIllIIlllll(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = llllIIlIII[1];
            0;
            if (-1 != -1) {
                return ((0x35 ^ 0x71) & ~(0x6C ^ 0x28)) != 0;
            }
        } else {
            bl = llllIIlIII[0];
        }
        return bl;
    }

    static {
        F.llIIllIIlIlII();
        F.llIIllIIlIIll();
        String[] stringArray = new String[llllIIlIII[15]];
        stringArray[F.llllIIlIII[0]] = llllIIIlII[llllIIlIII[64]];
        stringArray[F.llllIIlIII[1]] = llllIIIlII[llllIIlIII[65]];
        stringArray[F.llllIIlIII[3]] = llllIIIlII[llllIIlIII[66]];
        stringArray[F.llllIIlIII[5]] = llllIIIlII[llllIIlIII[67]];
        stringArray[F.llllIIlIII[6]] = llllIIIlII[llllIIlIII[68]];
        stringArray[F.llllIIlIII[8]] = llllIIIlII[llllIIlIII[69]];
        stringArray[F.llllIIlIII[10]] = llllIIIlII[llllIIlIII[70]];
        hb = stringArray;
        bu = new ArrayList<d>();
        hc = new WorldPoint(llllIIlIII[71], llllIIlIII[72], llllIIlIII[0]);
        bS = llllIIlIII[0];
    }

    private static boolean llIIllIIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIllIIlIIll() {
        llllIIIlII = new String[llllIIlIII[73]];
        F.llllIIIlII[F.llllIIlIII[0]] = F."Buying items";
        F.llllIIIlII[F.llllIIlIII[1]] = F."Finished buying items, switching back to quest";
        F.llllIIIlII[F.llllIIlIII[3]] = F."Drink";
        F.llllIIIlII[F.llllIIlIII[5]] = F."Navigating to bank";
        F.llllIIIlII[F.llllIIlIII[6]] = F."Opening bank";
        F.llllIIIlII[F.llllIIlIII[8]] = F."Handling banking";
        F.llllIIIlII[F.llllIIlIII[10]] = F."We are missing quest supplies, switching to BUYING";
        F.llllIIIlII[F.llllIIlIII[15]] = F."We are missing quest supplies, switching to BUYING";
        F.llllIIIlII[F.llllIIlIII[16]] = F."Nav to start";
        F.llllIIIlII[F.llllIIlIII[17]] = F."Starting quest";
        F.llllIIIlII[F.llllIIlIII[18]] = F."Large door";
        F.llllIIIlII[F.llllIIlIII[19]] = F."Open";
        F.llllIIIlII[F.llllIIlIII[20]] = F."Open";
        F.llllIIIlII[F.llllIIlIII[21]] = F."General Bentnoze";
        F.llllIIIlII[F.llllIIlIII[25]] = F."Blue dye";
        F.llllIIIlII[F.llllIIlIII[26]] = F."Orange dye";
        F.llllIIIlII[F.llllIIlIII[27]] = F."Dying armor";
        F.llllIIIlII[F.llllIIlIII[28]] = F."Orange dye";
        F.llllIIIlII[F.llllIIlIII[29]] = F."Blue dye";
        F.llllIIIlII[F.llllIIlIII[30]] = F."Orange goblin mail";
        F.llllIIIlII[F.llllIIlIII[31]] = F."Orange goblin mail";
        F.llllIIIlII[F.llllIIlIII[32]] = F."Nav to start";
        F.llllIIIlII[F.llllIIlIII[33]] = F."Turning in orange";
        F.llllIIIlII[F.llllIIlIII[34]] = F."General Bentnoze";
        F.llllIIIlII[F.llllIIlIII[36]] = F."Blue goblin mail";
        F.llllIIIlII[F.llllIIlIII[37]] = F."Blue goblin mail";
        F.llllIIIlII[F.llllIIlIII[38]] = F."Nav to start";
        F.llllIIIlII[F.llllIIlIII[39]] = F."Turning in blue";
        F.llllIIIlII[F.llllIIlIII[40]] = F."General Bentnoze";
        F.llllIIIlII[F.llllIIlIII[42]] = F."Turning in brown";
        F.llllIIIlII[F.llllIIlIII[43]] = F."Nav to start";
        F.llllIIIlII[F.llllIIlIII[44]] = F."General Bentnoze";
        F.llllIIIlII[F.llllIIlIII[46]] = F."Navigating to bank";
        F.llllIIIlII[F.llllIIlIII[47]] = F."Opening bank";
        F.llllIIIlII[F.llllIIlIII[48]] = F."Handling banking";
        F.llllIIIlII[F.llllIIlIII[49]] = F."We are missing quest supplies, switching to BUYING";
        F.llllIIIlII[F.llllIIlIII[50]] = F."We are missing quest supplies, switching to BUYING";
        F.llllIIIlII[F.llllIIlIII[51]] = F."Blue dye";
        F.llllIIIlII[F.llllIIlIII[52]] = F."Orange dye";
        F.llllIIIlII[F.llllIIlIII[53]] = F."Dying armor";
        F.llllIIIlII[F.llllIIlIII[54]] = F."Orange dye";
        F.llllIIIlII[F.llllIIlIII[55]] = F."Blue dye";
        F.llllIIIlII[F.llllIIlIII[62]] = F."Goblin Diplomacy";
        F.llllIIIlII[F.llllIIlIII[63]] = F."ring of wealth (";
        F.llllIIIlII[F.llllIIlIII[64]] = F."Yes.";
        F.llllIIIlII[F.llllIIlIII[65]] = F."Do you want me to pick an armour colour for you?";
        F.llllIIIlII[F.llllIIlIII[66]] = F."What about a different colour?";
        F.llllIIIlII[F.llllIIlIII[67]] = F."I have some orange armour here.";
        F.llllIIIlII[F.llllIIlIII[68]] = F."I have some blue armour here.";
        F.llllIIIlII[F.llllIIlIII[69]] = F."I have some brown armour here.";
        F.llllIIIlII[F.llllIIlIII[70]] = F."I'll leave you to it.";
    }

    private static boolean llIIllIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIlllllII(String lllllllllllllllllIlIllIlllIIIlII, String lllllllllllllllllIlIllIlllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIlllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIII[16]), "DES");
            Cipher lllllllllllllllllIlIllIlllIIIllI = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIlllIIIllI.init(llllIIlIII[3], lllllllllllllllllIlIllIlllIIIlll);
            return new String(lllllllllllllllllIlIllIlllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIlllIIIlIl) {
            lllllllllllllllllIlIllIlllIIIlIl.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return llllIIIlII[llllIIlIII[62]];
    }

    /*
     * WARNING - void declaration
     */
    private static void cc() {
        void lllllllllllllllllIlIllIlllIllIII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (F.llIIllIIllIII(bankLocation) && F.llIIllIIlIlll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[46]];
            a.a(bankLocation);
        }
        if (F.llIIllIIllIII(lllllllllllllllllIlIllIlllIllIII) && F.llIIllIIlIlIl(lllllllllllllllllIlIllIlllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (F.llIIllIIlIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIII[7]);
                0;
            }
            if (F.llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[48]];
                if (F.llIIllIIllIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIIlIII[6]);
                    0;
                }
                if (F.llIIllIIllIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llllIIlIII[3]);
                    0;
                }
                int[] nArray = new int[llllIIlIII[1]];
                nArray[F.llllIIlIII[0]] = llllIIlIII[9];
                if (F.llIIllIIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIIlIII[1]];
                    nArray2[F.llllIIlIII[0]] = llllIIlIII[9];
                    if (F.llIIllIIlIllI(Bank.getFirst((int[])nArray2).getQuantity(), llllIIlIII[5])) {
                        F.ae();
                        System.out.println(llllIIIlII[llllIIlIII[49]]);
                        bs = llllIIlIII[1];
                        return;
                    }
                }
                int[] nArray3 = new int[llllIIlIII[8]];
                nArray3[F.llllIIlIII[0]] = llllIIlIII[11];
                nArray3[F.llllIIlIII[1]] = llllIIlIII[12];
                nArray3[F.llllIIlIII[3]] = llllIIlIII[9];
                nArray3[F.llllIIlIII[5]] = llllIIlIII[13];
                nArray3[F.llllIIlIII[6]] = llllIIlIII[14];
                if (F.llIIllIIlIlll(e.b(nArray3) ? 1 : 0)) {
                    F.ae();
                    System.out.println(llllIIIlII[llllIIlIII[50]]);
                    bs = llllIIlIII[1];
                    return;
                }
            }
            int[] nArray = new int[llllIIlIII[8]];
            nArray[F.llllIIlIII[0]] = llllIIlIII[11];
            nArray[F.llllIIlIII[1]] = llllIIlIII[12];
            nArray[F.llllIIlIII[3]] = llllIIlIII[9];
            nArray[F.llllIIlIII[5]] = llllIIlIII[13];
            nArray[F.llllIIlIII[6]] = llllIIlIII[14];
            if (F.llIIllIIlIlIl(e.b(nArray) ? 1 : 0)) {
                Bank.withdraw((int)llllIIlIII[11], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llllIIlIII[1]);
                0;
                Bank.withdraw((int)llllIIlIII[12], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llllIIlIII[1]);
                0;
                Bank.withdraw((int)llllIIlIII[9], (int)llllIIlIII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llllIIlIII[1]);
                0;
                Bank.withdraw((int)llllIIlIII[13], (int)llllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llllIIlIII[1]);
                0;
                Bank.withdraw((int)llllIIlIII[14], (int)llllIIlIII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llllIIlIII[1]);
                0;
                a.b(f.be, llllIIlIII[1]);
                Time.sleepTicks((int)llllIIlIII[5]);
                0;
                Bank.close();
                F.cr();
            }
        }
    }

    private static String llIIlIlllllIl(String lllllllllllllllllIlIllIllIllIlII, String lllllllllllllllllIlIllIllIlIlllI) {
        lllllllllllllllllIlIllIllIllIlII = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIllIllIIlI = new StringBuilder();
        char[] lllllllllllllllllIlIllIllIllIIIl = lllllllllllllllllIlIllIllIlIlllI.toCharArray();
        int lllllllllllllllllIlIllIllIllIIII = llllIIlIII[0];
        char[] lllllllllllllllllIlIllIllIlIlIlI = lllllllllllllllllIlIllIllIllIlII.toCharArray();
        int lllllllllllllllllIlIllIllIlIlIIl = lllllllllllllllllIlIllIllIlIlIlI.length;
        int lllllllllllllllllIlIllIllIlIlIII = llllIIlIII[0];
        while (F.llIIllIIlIllI(lllllllllllllllllIlIllIllIlIlIII, lllllllllllllllllIlIllIllIlIlIIl)) {
            char lllllllllllllllllIlIllIllIllIlIl = lllllllllllllllllIlIllIllIlIlIlI[lllllllllllllllllIlIllIllIlIlIII];
            lllllllllllllllllIlIllIllIllIIlI.append((char)(lllllllllllllllllIlIllIllIllIlIl ^ lllllllllllllllllIlIllIllIllIIIl[lllllllllllllllllIlIllIllIllIIII % lllllllllllllllllIlIllIllIllIIIl.length]));
            0;
            ++lllllllllllllllllIlIllIllIllIIII;
            ++lllllllllllllllllIlIllIllIlIlIII;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIllIllIllIIlI);
    }

    private static String llIIlIllllllI(String lllllllllllllllllIlIllIllIIlllll, String lllllllllllllllllIlIllIllIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIllIllIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIllIllIlIIIIl.init(llllIIlIII[3], lllllllllllllllllIlIllIllIlIIIlI);
            return new String(lllllllllllllllllIlIllIllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIllIlIIIII) {
            lllllllllllllllllIlIllIllIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIlll(int n2) {
        return n2 == 0;
    }
}

