/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class N_Unknown
implements W {
    private static /* synthetic */ int[] lIIllIIlI;
    public static /* synthetic */ WorldPoint jg;
    private static /* synthetic */ String[] lIIlIllll;
    static /* synthetic */ String[] bR;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ WorldPoint bX;
    static /* synthetic */ int cl;
    static /* synthetic */ WorldArea jl;
    public static /* synthetic */ WorldPoint ji;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint jj;
    public static /* synthetic */ WorldPoint jh;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int jk;

    public static void cn() {
        block134: {
            BankLocation lIIIIIlIIIlllIl;
            block135: {
                WorldArea lIIIIIlIIIllIll;
                TileItem lIIIIIlIIIlllII;
                block137: {
                    block136: {
                        if (N.llllllllllI(bt ? 1 : 0)) {
                            b.a(bv);
                            if (N.lllllllllll(bv.size(), lIIllIIlI[0])) {
                                System.out.println(lIIlIllll[lIIllIIlI[1]]);
                                bt = lIIllIIlI[1];
                            }
                        }
                        if (!N.lIIIIIIIIIII(bt ? 1 : 0)) break block134;
                        if (N.lIIIIIIIIIII(N.ab() ? 1 : 0) && N.lllllllllll(e.j(jk), lIIllIIlI[0])) {
                            lIIIIIlIIIlllIl = BankLocation.getNearest();
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl) && N.lIIIIIIIIIII(lIIIIIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[0]];
                                a.a(lIIIIIlIIIlllIl);
                            }
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl) && N.llllllllllI(lIIIIIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (N.lIIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIlI[2]);
                                    0;
                                }
                                if (N.llllllllllI(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[3]];
                                    if (N.lIIIIIIIIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIllIIlI[4]);
                                        0;
                                    }
                                    if (N.lIIIIIIIIIlI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIllIIlI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIllIIlI[4]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
                                    nArray[N.lIIllIIlI[0]] = lIIllIIlI[6];
                                    nArray[N.lIIllIIlI[3]] = lIIllIIlI[7];
                                    nArray[N.lIIllIIlI[8]] = lIIllIIlI[9];
                                    if (N.lIIIIIIIIIII(e.b(nArray) ? 1 : 0)) {
                                        N.af();
                                        System.out.println(lIIlIllll[lIIllIIlI[8]]);
                                        bt = lIIllIIlI[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIllIIlI[4]];
                                    nArray2[N.lIIllIIlI[1]] = lIIllIIlI[5];
                                    nArray2[N.lIIllIIlI[0]] = lIIllIIlI[6];
                                    nArray2[N.lIIllIIlI[3]] = lIIllIIlI[7];
                                    nArray2[N.lIIllIIlI[8]] = lIIllIIlI[9];
                                    if (N.llllllllllI(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIllIIlI[5], lIIllIIlI[10]);
                                        a.a(lIIllIIlI[6], lIIllIIlI[10]);
                                        a.a(lIIllIIlI[7], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[11], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[9], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[12], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[13], lIIllIIlI[14]);
                                    }
                                }
                            }
                        }
                        if (N.llllllllllI(Inventory.contains((int[])f.aV) ? 1 : 0) && N.lllllllllll(Movement.getRunEnergy(), lIIllIIlI[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIlIllll[lIIllIIlI[4]]);
                            Time.sleepTicks((int)lIIllIIlI[0]);
                            0;
                        }
                        int[] nArray = new int[lIIllIIlI[0]];
                        nArray[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (N.llllllllllI(Inventory.contains((int[])nArray) ? 1 : 0) && N.lIIIIIIIIIll(N.lllllllllIl(e.u(), 50.0))) {
                            int[] nArray3 = new int[lIIllIIlI[0]];
                            nArray3[N.lIIllIIlI[1]] = lIIllIIlI[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIllll[lIIllIIlI[14]]);
                            Time.sleepTicks((int)lIIllIIlI[3]);
                            0;
                        }
                        if (N.llllllllllI(N.ab() ? 1 : 0) && N.lIIIIIIIIIII(e.j(jk))) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIlI[16])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[17]];
                                Movement.walkTo((WorldPoint)bX);
                                0;
                                Time.sleepTicks((int)lIIllIIlI[0]);
                                0;
                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIlI[16])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[18]];
                                if (N.llllllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlIllll[lIIllIIlI[16]], bR);
                            }
                        }
                        if (!N.lIIIIIIIIllI(e.j(jk), lIIllIIlI[0])) break block135;
                        cl = lIIllIIlI[1];
                        int[] nArray4 = new int[lIIllIIlI[0]];
                        nArray4[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllIIlI[0]];
                            nArray5[N.lIIllIIlI[1]] = lIIllIIlI[19];
                            if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIllIIlI[0]];
                                stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[20]];
                                if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    lIIIIIlIIIlllIl = new WorldPoint(lIIllIIlI[21], lIIllIIlI[22], lIIllIIlI[0]);
                                    int[] nArray6 = new int[lIIllIIlI[0]];
                                    nArray6[N.lIIllIIlI[1]] = lIIllIIlI[11];
                                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIlIIIlllIl), lIIllIIlI[14])) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[10]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlllIl);
                                            0;
                                            Time.sleepTicks((int)lIIllIIlI[0]);
                                            0;
                                        }
                                        if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIlIIIlllIl), lIIllIIlI[14])) {
                                            int[] nArray7 = new int[lIIllIIlI[0]];
                                            nArray7[N.lIIllIIlI[1]] = lIIllIIlI[11];
                                            lIIIIIlIIIlllII = TileItems.getNearest((int[])nArray7);
                                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllII)) {
                                                if (N.lIIIIIIIIIII(Reachable.isInteractable((Locatable)lIIIIIlIIIlllII) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[23]];
                                                    Movement.walkTo((WorldPoint)lIIIIIlIIIlllII.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                                    0;
                                                }
                                                if (N.llllllllllI(Reachable.isInteractable((Locatable)lIIIIIlIIIlllII) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[24]];
                                                    lIIIIIlIIIlllII.interact(lIIlIllll[lIIllIIlI[25]]);
                                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIllIIlI[0]];
                        nArray8[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (!N.lIIIIIIIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIllIIlI[0]];
                        nArray9[N.lIIllIIlI[1]] = lIIllIIlI[19];
                        if (!N.llllllllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIllIIlI[0]];
                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIllIIlI[0]];
                        nArray10[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (N.llllllllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[26]];
                            int[] nArray11 = new int[lIIllIIlI[0]];
                            nArray11[N.lIIllIIlI[1]] = lIIllIIlI[11];
                            int[] nArray12 = new int[lIIllIIlI[0]];
                            nArray12[N.lIIllIIlI[1]] = lIIllIIlI[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIllIIlI[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lIIllIIlI[0]];
                    nArray13[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.llllllllllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIlI[0]];
                        stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[27]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jg), lIIllIIlI[4])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[28]];
                                Movement.walkTo((WorldPoint)jg);
                                0;
                                Time.sleepTicks((int)lIIllIIlI[0]);
                                0;
                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jg), lIIllIIlI[4])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[29]];
                                String[] stringArray2 = new String[lIIllIIlI[0]];
                                stringArray2[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlIllll[lIIllIIlI[31]]);
                                Time.sleepTicks((int)lIIllIIlI[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lIIllIIlI[0]];
                        stringArray3[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[32]];
                        if (N.llllllllllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jh), lIIllIIlI[8])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[33]];
                                Movement.walkTo((WorldPoint)jh);
                                0;
                                Time.sleepTicks((int)lIIllIIlI[0]);
                                0;
                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jh), lIIllIIlI[8])) {
                                int[] nArray14 = new int[lIIllIIlI[0]];
                                nArray14[N.lIIllIIlI[1]] = lIIllIIlI[19];
                                String[] stringArray4 = new String[lIIllIIlI[0]];
                                stringArray4[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIllIIlI[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIllIIlI[0]];
                stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[35]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIllIIlI[0]];
                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIllIIlI[0]];
                        stringArray5[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[36]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[37]];
                            if (N.lIIIIIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIllIIlI[0]];
                                stringArray6[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlIllll[lIIllIIlI[39]]);
                                Time.sleepTicks((int)lIIllIIlI[4]);
                                0;
                            }
                            g.a(bR);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIllIIlI[0]];
                stringArray7[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[40]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIllIIlI[0]];
                    stringArray8[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[41]];
                    if (N.llllllllllI(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIllIIlI[0]];
                        stringArray9[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[42]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            lIIIIIlIIIlllIl = new WorldPoint(lIIllIIlI[43], lIIllIIlI[44], lIIllIIlI[1]);
                            lIIIIIlIIIlllII = new WorldPoint(lIIllIIlI[21], lIIllIIlI[44], lIIllIIlI[1]);
                            lIIIIIlIIIllIll = new WorldArea(lIIllIIlI[21], lIIllIIlI[45], lIIllIIlI[14], lIIllIIlI[8], lIIllIIlI[1]);
                            if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllIl) ? 1 : 0) && N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllII) ? 1 : 0) && N.lIIIIIIIIIII(lIIIIIlIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[46]];
                                Movement.walkTo((WorldPoint)lIIIIIlIIIlllIl);
                                0;
                                Time.sleepTicks((int)lIIllIIlI[0]);
                                0;
                            }
                            if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllIl) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIllIIlI[0]];
                                stringArray10[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlIllll[lIIllIIlI[48]]);
                                Time.sleepTicks((int)lIIllIIlI[3]);
                                0;
                            }
                            if (N.llllllllllI(lIIIIIlIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[49]];
                                String[] stringArray11 = new String[lIIllIIlI[0]];
                                stringArray11[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlIllll[lIIllIIlI[51]]);
                                Time.sleepTicks((int)lIIllIIlI[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIllIIlI[0]];
                stringArray12[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[52]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllIIlI[0]];
                    stringArray13[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[53]];
                    if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        lIIIIIlIIIlllIl = new WorldArea(lIIllIIlI[21], lIIllIIlI[45], lIIllIIlI[14], lIIllIIlI[8], lIIllIIlI[1]);
                        lIIIIIlIIIlllII = new WorldArea(lIIllIIlI[54], lIIllIIlI[55], lIIllIIlI[18], lIIllIIlI[23], lIIllIIlI[1]);
                        if (N.llllllllllI(lIIIIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIllIIlI[0]];
                            stringArray14[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlIllll[lIIllIIlI[57]]);
                            Time.sleepTicks((int)lIIllIIlI[3]);
                            0;
                        }
                        if (N.lIIIIIIIIIII(lIIIIIlIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(jl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[58]];
                            Movement.walkTo((WorldPoint)ji);
                            0;
                            Time.sleepTicks((int)lIIllIIlI[0]);
                            0;
                        }
                        if (N.llllllllllI(lIIIIIlIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIllIIlI[0]];
                            stringArray15[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlIllll[lIIllIIlI[60]]);
                            Time.sleepTicks((int)lIIllIIlI[4]);
                            0;
                        }
                        if (N.llllllllllI(jl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint lIIIIIlIIIlIIII;
                            WorldPoint lIIIIIlIIIlIIIl;
                            WorldPoint lIIIIIlIIIlIIlI;
                            lIIIIIlIIIllIll = new WorldPoint(lIIllIIlI[21], lIIllIIlI[61], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIlI = new WorldPoint(lIIllIIlI[62], lIIllIIlI[63], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIIl = new WorldPoint(lIIllIIlI[64], lIIllIIlI[65], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIII = new WorldPoint(lIIllIIlI[43], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIlIlll = new WorldPoint(lIIllIIlI[67], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIlIllI = new WorldPoint(lIIllIIlI[67], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIlIl = new WorldArea(lIIllIIlI[68], lIIllIIlI[69], lIIllIIlI[20], lIIllIIlI[23], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIlII = new WorldArea(lIIllIIlI[70], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[17], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIIll = new WorldArea(lIIllIIlI[72], lIIllIIlI[73], lIIllIIlI[32], lIIllIIlI[25], lIIllIIlI[1]);
                            if (N.lIIIIIIIIlll(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[76]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIll);
                                    0;
                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                    0;
                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[77]];
                                    String[] stringArray16 = new String[lIIllIIlI[0]];
                                    stringArray16[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlIllll[lIIllIIlI[79]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[81]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIlI);
                                    0;
                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                    0;
                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[82]];
                                    String[] stringArray17 = new String[lIIllIIlI[0]];
                                    stringArray17[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlIllll[lIIllIIlI[83]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[80]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[21], lIIllIIlI[84], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[85]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIllIIlI[0]];
                                        stringArray18[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIllll[lIIllIIlI[87]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[88]];
                                    String[] stringArray19 = new String[lIIllIIlI[0]];
                                    stringArray19[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlIllll[lIIllIIlI[90]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[80]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0])) {
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[21], lIIllIIlI[91], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[92]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIllIIlI[0]];
                                        stringArray20[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlIllll[lIIllIIlI[94]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[95]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIllIlI);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[96]];
                                        String[] stringArray21 = new String[lIIllIIlI[0]];
                                        stringArray21[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlIllll[lIIllIIlI[98]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0])) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[99]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIll);
                                    0;
                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                    0;
                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[100]];
                                    String[] stringArray22 = new String[lIIllIIlI[0]];
                                    stringArray22[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlIllll[lIIllIIlI[102]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.llllllllllI(lIIIIIlIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[104], lIIllIIlI[84], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[105]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);
                                            0;
                                            Time.sleepTicks((int)lIIllIIlI[0]);
                                            0;
                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIllIIlI[0]];
                                            stringArray23[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlIllll[lIIllIIlI[107]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);
                                            0;
                                        }
                                    }
                                    if (N.llllllllllI((lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                        lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[108], lIIllIIlI[109], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[110]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                            0;
                                            Time.sleepTicks((int)lIIllIIlI[0]);
                                            0;
                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIllIIlI[0]];
                                            stringArray24[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlIllll[lIIllIIlI[112]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);
                                            0;
                                        }
                                    }
                                    if (N.llllllllllI((lIIIIIlIIIlIIIl = new WorldArea(lIIllIIlI[70], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIIIIIlIIIlIIII = new WorldPoint(lIIllIIlI[67], lIIllIIlI[113], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIII) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[114]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIII);
                                            0;
                                            Time.sleepTicks((int)lIIllIIlI[0]);
                                            0;
                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIII) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIllIIlI[0]];
                                            stringArray25[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlIllll[lIIllIIlI[116]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);
                                            0;
                                        }
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[117]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIlll);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[118]];
                                        String[] stringArray26 = new String[lIIllIIlI[0]];
                                        stringArray26[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlIllll[lIIllIIlI[120]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[121]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIllI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[122]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIlIllI);
                                    0;
                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                    0;
                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIllI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[123]];
                                    String[] stringArray27 = new String[lIIllIIlI[0]];
                                    stringArray27[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlIllll[lIIllIIlI[125]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[126]))) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[127], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[128]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIllIIlI[0]];
                                        stringArray28[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlIllll[lIIllIIlI[130]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[131], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[132]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIllIIlI[0]];
                                        stringArray29[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlIllll[lIIllIIlI[134]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[135]];
                                    String[] stringArray30 = new String[lIIllIIlI[0]];
                                    stringArray30[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlIllll[lIIllIIlI[137]]);
                                    Time.sleepTicks((int)lIIllIIlI[16]);
                                    0;
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[138], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[139]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIllIIlI[0]];
                                        stringArray31[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlIllll[lIIllIIlI[141]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[108], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[142]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIllIIlI[0]];
                                        stringArray32[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIllll[lIIllIIlI[144]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[145]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIlll);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[146]];
                                        String[] stringArray33 = new String[lIIllIIlI[0]];
                                        stringArray33[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlIllll[lIIllIIlI[148]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[127], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[149]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIllIIlI[0]];
                                        stringArray34[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlIllll[lIIllIIlI[151]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[104], lIIllIIlI[152], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[153]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);
                                        0;
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIllIIlI[0]);
                                        0;
                                        String[] stringArray35 = new String[lIIllIIlI[0]];
                                        stringArray35[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlIllll[lIIllIIlI[155]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);
                                        0;
                                    }
                                }
                                if (N.llllllllllI((lIIIIIlIIIlIIIl = new WorldArea(lIIllIIlI[72], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[156]];
                                    Time.sleepTicks((int)lIIllIIlI[0]);
                                    0;
                                    int[] nArray = new int[lIIllIIlI[0]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[158]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIllIIlI[0]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[160]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);
                                    0;
                                }
                                if (N.llllllllllI((lIIIIIlIIIlIIII = new WorldArea(lIIllIIlI[161], lIIllIIlI[162], lIIllIIlI[23], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIllIIlI[0]];
                                    stringArray36[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[163]];
                                    if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIllIIlI[0]];
                                        stringArray37[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlIllll[lIIllIIlI[165]]);
                                        Time.sleepTicks((int)lIIllIIlI[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIllIIlI[0]];
                stringArray38[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[166]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIllIIlI[0]];
                    stringArray39[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[167]];
                    if (N.llllllllllI(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        lIIIIIlIIIlllIl = new WorldArea(lIIllIIlI[161], lIIllIIlI[162], lIIllIIlI[23], lIIllIIlI[14], lIIllIIlI[1]);
                        if (N.llllllllllI(lIIIIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIllIIlI[0]];
                            nArray[N.lIIllIIlI[1]] = lIIllIIlI[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[168]]);
                            Time.sleepTicks((int)lIIllIIlI[14]);
                            0;
                        }
                        if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[169]];
                            Movement.walkTo((WorldPoint)jj);
                            0;
                            Time.sleepTicks((int)lIIllIIlI[0]);
                            0;
                        }
                        if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                            lIIIIIlIIIlllII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (N.llllllllllI(tileObject.getName().contains(lIIlIllll[lIIllIIlI[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIllIIlI[0]];
                                    stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[186]];
                                    if (N.llllllllllI(tileObject.hasAction(stringArray) ? 1 : 0) && N.lIIIIIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIIlI[21], lIIllIIlI[184], lIIllIIlI[3])), lIIllIIlI[3])) {
                                        n2 = lIIllIIlI[0];
                                        0;
                                        if (2 < (0xA4 ^ 0xA0)) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lIIllIIlI[1];
                                return n2 != 0;
                            });
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllII)) {
                                lIIIIIlIIIlllII.interact(lIIlIllll[lIIllIIlI[170]]);
                                Time.sleepTicks((int)lIIllIIlI[8]);
                                0;
                            }
                            if (N.lIIIIIIIlIII(lIIIIIlIIIlllII)) {
                                g.a(lIIlIllll[lIIllIIlI[171]], bR, lIIllIIlI[0]);
                            }
                        }
                    }
                }
            }
            if (N.lIIIIIIIIllI(e.j(jk), lIIllIIlI[3])) {
                if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[172]];
                    Movement.walkTo((WorldPoint)jj);
                    0;
                    Time.sleepTicks((int)lIIllIIlI[0]);
                    0;
                }
                if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                    lIIIIIlIIIlllIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (N.llllllllllI(tileObject.getName().contains(lIIlIllll[lIIllIIlI[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIIlI[0]];
                            stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[183]];
                            if (N.llllllllllI(tileObject.hasAction(stringArray) ? 1 : 0) && N.lIIIIIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIIlI[21], lIIllIIlI[184], lIIllIIlI[3])), lIIllIIlI[3])) {
                                n2 = lIIllIIlI[0];
                                0;
                                if (((0xE7 ^ 0x8E ^ (0x9B ^ 0xA0)) & (34 + 21 - -144 + 4 ^ 102 + 1 - 12 + 62 ^ -1)) <= 0) return n2 != 0;
                                return ((0x8D ^ 0xBB ^ (0xD5 ^ 0x80)) & (0xB9 ^ 0x93 ^ (0xE ^ 0x47) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIllIIlI[1];
                        return n2 != 0;
                    });
                    if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl)) {
                        lIIIIIlIIIlllIl.interact(lIIlIllll[lIIllIIlI[173]]);
                        Time.sleepTicks((int)lIIllIIlI[8]);
                        0;
                    }
                    if (N.lIIIIIIIlIII(lIIIIIlIIIlllIl)) {
                        if (N.lllllllllll(cl, lIIllIIlI[0])) {
                            an.pM += lIIllIIlI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIllIIlI[0];
                            an.pM = lIIllIIlI[1];
                            cm = lIIllIIlI[1];
                        }
                        g.a(lIIlIllll[lIIllIIlI[174]], bR, lIIllIIlI[0]);
                    }
                }
            }
            g.a(bR);
        }
    }

    static boolean co() {
        int n2;
        if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
            n2 = lIIllIIlI[0];
            0;
            if (1 == -1) {
                return ((0x38 ^ 0x6A ^ (0x5D ^ 0x59)) & (0x20 ^ 0xE ^ (0x44 ^ 0x3C) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIIlI[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.lIIIIIIIlIIl(e.j(lIIllIIlI[47]), lIIllIIlI[8])) {
            bl = lIIllIIlI[0];
            0;
            
            }
        } else {
            bl = lIIllIIlI[1];
        }
        return bl;
    }

    @Override
    public boolean S() {
        return lIIllIIlI[1];
    }

    private static boolean lIIIIIIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIII(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            N.cn();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 >= 0) {
            return (35 + 117 - 116 + 138 ^ 86 + 75 - 31 + 2) & (20 + 4 - -112 + 15 ^ 149 + 129 - 248 + 159 ^ -1);
        }
        return lIIllIIlI[144];
    }

    private static boolean llllllllllI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlIllll[lIIllIIlI[180]];
    }

    private static void af() {
        block14: {
            d lIIIIIlIIIIlIII;
            block13: {
                block12: {
                    block11: {
                        Object lIIIIIlIIIIlIIl;
                        int[] nArray = new int[lIIllIIlI[0]];
                        nArray[N.lIIllIIlI[1]] = lIIllIIlI[6];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIllIIlI[6], lIIllIIlI[10], lIIllIIlI[175]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIllIIlI[0]];
                        nArray2[N.lIIllIIlI[1]] = lIIllIIlI[7];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIIIlIIIIlIIl = new d(lIIllIIlI[7], lIIllIIlI[0], lIIllIIlI[175]);
                            bv.add((d)lIIIIIlIIIIlIIl);
                            0;
                        }
                        int[] nArray3 = new int[lIIllIIlI[0]];
                        nArray3[N.lIIllIIlI[1]] = lIIllIIlI[9];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIIIlIIIIlIIl = new d(lIIllIIlI[9], lIIllIIlI[0], lIIllIIlI[175]);
                            bv.add((d)lIIIIIlIIIIlIIl);
                            0;
                        }
                        if (N.lIIIIIIIIIII(Bank.contains((Predicate)(lIIIIIlIIIIlIIl = item -> item.getName().toLowerCase().contains(lIIlIllll[lIIllIIlI[181]]))) ? 1 : 0)) {
                            lIIIIIlIIIIlIII = new d(lIIllIIlI[176], lIIllIIlI[14], lIIllIIlI[177]);
                            bv.add(lIIIIIlIIIIlIII);
                            0;
                        }
                        int[] nArray4 = new int[lIIllIIlI[0]];
                        nArray4[N.lIIllIIlI[1]] = lIIllIIlI[12];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIIIlIIIIlIII = new d(lIIllIIlI[12], lIIllIIlI[4], i.bq);
                            bv.add(lIIIIIlIIIIlIII);
                            0;
                        }
                        int[] nArray5 = new int[lIIllIIlI[0]];
                        nArray5[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.llllllllllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIllIIlI[0]];
                        nArray6[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.llllllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIllIIlI[0]];
                        nArray7[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.lllllllllll(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIIlI[14])) break block12;
                    }
                    lIIIIIlIIIIlIII = new d(lIIllIIlI[13], lIIllIIlI[10], lIIllIIlI[178]);
                    bv.add(lIIIIIlIIIIlIII);
                    0;
                }
                int[] nArray = new int[lIIllIIlI[0]];
                nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.llllllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIllIIlI[0]];
                nArray8[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.llllllllllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIllIIlI[0]];
                nArray9[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.lllllllllll(Bank.getFirst((int[])nArray9).getQuantity(), lIIllIIlI[27])) break block14;
            }
            lIIIIIlIIIIlIII = new d(lIIllIIlI[5], lIIllIIlI[57], lIIllIIlI[179]);
            bv.add(lIIIIIlIIIIlIII);
            0;
        }
    }

    static {
        N.lllllllllII();
        N.llllllIllII();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIllIIlI[64], lIIllIIlI[187], lIIllIIlI[1]);
        jg = new WorldPoint(lIIllIIlI[188], lIIllIIlI[189], lIIllIIlI[1]);
        jh = new WorldPoint(lIIllIIlI[161], lIIllIIlI[190], lIIllIIlI[1]);
        ji = new WorldPoint(lIIllIIlI[191], lIIllIIlI[192], lIIllIIlI[1]);
        jj = new WorldPoint(lIIllIIlI[64], lIIllIIlI[45], lIIllIIlI[3]);
        jk = lIIllIIlI[47];
        String[] stringArray = new String[lIIllIIlI[8]];
        stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[193]];
        stringArray[N.lIIllIIlI[0]] = lIIlIllll[lIIllIIlI[194]];
        stringArray[N.lIIllIIlI[3]] = lIIlIllll[lIIllIIlI[195]];
        bR = stringArray;
        jl = new WorldArea(lIIllIIlI[188], lIIllIIlI[196], lIIllIIlI[50], lIIllIIlI[40], lIIllIIlI[1]);
    }

    private static boolean lIIIIIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llllllIlIII(String lIIIIIIllIlIIll, String lIIIIIIllIlIlII) {
        try {
            SecretKeySpec lIIIIIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIlI[16]), "DES");
            Cipher lIIIIIIllIlIlll = Cipher.getInstance("DES");
            lIIIIIIllIlIlll.init(lIIllIIlI[3], lIIIIIIllIllIII);
            return new String(lIIIIIIllIlIlll.doFinal(Base64.getDecoder().decode(lIIIIIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIllIlIllI) {
            lIIIIIIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIIIlIIIIllIl;
        int[] nArray = new int[lIIllIIlI[4]];
        nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
        nArray[N.lIIllIIlI[0]] = lIIllIIlI[6];
        nArray[N.lIIllIIlI[3]] = lIIllIIlI[7];
        nArray[N.lIIllIIlI[8]] = lIIllIIlI[9];
        int[] nArray2 = nArray;
        int lIIIIIlIIIIllII = lIIllIIlI[1];
        while (N.lllllllllll(lIIIIIlIIIIllII, ((void)lIIIIIlIIIIllIl).length)) {
            int[] nArray3 = new int[lIIllIIlI[0]];
            nArray3[N.lIIllIIlI[1]] = lIIIIIlIIIIllIl[lIIIIIlIIIIllII];
            if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIllIIlI[1];
            }
            ++lIIIIIlIIIIllII;
            0;
            
            return false;
        }
        return lIIllIIlI[0];
    }

    private static boolean lIIIIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllllIIlll(String lIIIIIIlllllIII, String lIIIIIIllllIlll) {
        try {
            SecretKeySpec lIIIIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIIllllllII = Cipher.getInstance("Blowfish");
            lIIIIIIllllllII.init(lIIllIIlI[3], lIIIIIIllllllIl);
            return new String(lIIIIIIllllllII.doFinal(Base64.getDecoder().decode(lIIIIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIlllllIll) {
            lIIIIIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static void lllllllllII() {
        lIIllIIlI = new int[198];
        N.lIIllIIlI[0] = 1;
        N.lIIllIIlI[1] = (0x43 ^ 0x75 ^ (0x61 ^ 0x14)) & (0x53 ^ 0x45 ^ (0xFA ^ 0xAF) ^ -1);
        N.lIIllIIlI[2] = 0xFFFF97CC & 0x7BBB;
        N.lIIllIIlI[3] = 2;
        N.lIIllIIlI[4] = 0x1C ^ 0x18;
        N.lIIllIIlI[5] = 0xFFFF9FC7 & 0x7F7F;
        N.lIIllIIlI[6] = 0xFFFFFEDF & 0x4DBF;
        N.lIIllIIlI[7] = 0xFFFF9BFC & 0x67BB;
        N.lIIllIIlI[8] = 3;
        N.lIIllIIlI[9] = -(0xFFFFD7FD & 0x7CE3) & (0xFFFFFDF5 & 0x57FB);
        N.lIIllIIlI[10] = 17 + 11 - -1 + 111 ^ 92 + 48 - 82 + 76;
        N.lIIllIIlI[11] = -(0xFFFFFDED & 0x4E77) & (0xFFFFCF7C & 0x7DF7);
        N.lIIllIIlI[12] = 0xFFFFF3FB & 0x3D55;
        N.lIIllIIlI[13] = -(0xFFFF9CFF & 0x7385) & (0xFFFF91FF & Short.MAX_VALUE);
        N.lIIllIIlI[14] = 0x76 ^ 0x73;
        N.lIIllIIlI[15] = 0x64 ^ 0x37 ^ (0xDB ^ 0xBA);
        N.lIIllIIlI[16] = 0x2D ^ 0x7D ^ (0x5D ^ 5);
        N.lIIllIIlI[17] = 0x2A ^ 0x2C;
        N.lIIllIIlI[18] = 6 ^ 0x30 ^ (0x3A ^ 0xB);
        N.lIIllIIlI[19] = 0xFFFFFB5E & 0x5B3;
        N.lIIllIIlI[20] = 0xCB ^ 0x84 ^ (0x81 ^ 0xC7);
        N.lIIllIIlI[21] = 0xFFFFBDFE & 0x4E25;
        N.lIIllIIlI[22] = 0xFFFF8FDD & 0x7D3F;
        N.lIIllIIlI[23] = 0x93 ^ 0xA8 ^ (0xAB ^ 0x9B);
        N.lIIllIIlI[24] = 0x44 ^ 0x48;
        N.lIIllIIlI[25] = 0x1A ^ 0x3E ^ (0xE8 ^ 0xC1);
        N.lIIllIIlI[26] = 0x1C ^ 0x41 ^ (0xE1 ^ 0xB2);
        N.lIIllIIlI[27] = 0xA1 ^ 0xAE;
        N.lIIllIIlI[28] = 0x57 ^ 2 ^ (0xDF ^ 0x9A);
        N.lIIllIIlI[29] = 0x60 ^ 0x71;
        N.lIIllIIlI[30] = 3 ^ 0x29 ^ (0x1F ^ 0x27);
        N.lIIllIIlI[31] = 0xD4 ^ 0xC7;
        N.lIIllIIlI[32] = 5 ^ 0x11;
        N.lIIllIIlI[33] = 0xD3 ^ 0xC6;
        N.lIIllIIlI[34] = 0x30 ^ 0x26;
        N.lIIllIIlI[35] = 0x39 ^ 3 ^ (0x26 ^ 0xB);
        N.lIIllIIlI[36] = 0x76 ^ 0x5A ^ (0xA7 ^ 0x93);
        N.lIIllIIlI[37] = 0x74 ^ 0x70 ^ (0xDA ^ 0xC7);
        N.lIIllIIlI[38] = 0x97 ^ 0x8D;
        N.lIIllIIlI[39] = 3 + 95 - 74 + 122 ^ 134 + 112 - 113 + 4;
        N.lIIllIIlI[40] = 0x67 ^ 0x4F ^ (0x48 ^ 0x7C);
        N.lIIllIIlI[41] = 0x9C ^ 0x81;
        N.lIIllIIlI[42] = 26 + 30 - -90 + 2 ^ 27 + 136 - 25 + 0;
        N.lIIllIIlI[43] = -(0xFFFFB7B9 & 0x4AC7) & (0xFFFFAEE7 & 0x5FBB);
        N.lIIllIIlI[44] = -(0xFFFFFF91 & 0x72FF) & (0xFFFFFFFF & 0x7FB7);
        N.lIIllIIlI[45] = 0xFFFFFFF7 & 0xD2E;
        N.lIIllIIlI[46] = 0xEB ^ 0xB1 ^ (0x4A ^ 0xF);
        N.lIIllIIlI[47] = 85 + 53 - 100 + 118 ^ 165 + 161 - 202 + 64;
        N.lIIllIIlI[48] = 0x9B ^ 0xBA;
        N.lIIllIIlI[49] = 0x78 ^ 0x5A;
        N.lIIllIIlI[50] = 0xE4 ^ 0xC7;
        N.lIIllIIlI[51] = 0 ^ 5 ^ (0x36 ^ 0x17);
        N.lIIllIIlI[52] = 0x8F ^ 0xAA;
        N.lIIllIIlI[53] = 0x41 ^ 0x67;
        N.lIIllIIlI[54] = 0xFFFFAF97 & 0x5C7A;
        N.lIIllIIlI[55] = -(0xFFFFF2EB & 0x7F77) & (0xFFFFFF7B & Short.MAX_VALUE);
        N.lIIllIIlI[56] = 0x62 ^ 0x45;
        N.lIIllIIlI[57] = 3 ^ (0xEF ^ 0xC4);
        N.lIIllIIlI[58] = 0x50 ^ 0x79;
        N.lIIllIIlI[59] = 121 + 18 - 37 + 56 ^ 17 + 160 - 91 + 94;
        N.lIIllIIlI[60] = 0x91 ^ 0xBA;
        N.lIIllIIlI[61] = 0xFFFFB796 & 0x6E7B;
        N.lIIllIIlI[62] = 0xFFFFBCFC & 0x4F2F;
        N.lIIllIIlI[63] = 0xFFFFFFB9 & 0x265E;
        N.lIIllIIlI[64] = 0xFFFFACAE & 0x5F77;
        N.lIIllIIlI[65] = -(0xFFFFFDBF & 0x4AD9) & (0xFFFFEFFF & 0x7EB9);
        N.lIIllIIlI[66] = 0xFFFFFE6D & 0x27B7;
        N.lIIllIIlI[67] = -(0xFFFFD7DF & 0x38A1) & (0xFFFFDEDF & 0x3DB9);
        N.lIIllIIlI[68] = -(0xFFFFB53F & 0x4BCF) & (0xFFFFEDAF & 0x1F7F);
        N.lIIllIIlI[69] = 0xFFFFB65F & 0x6FBE;
        N.lIIllIIlI[70] = -(0xFFFFFF31 & 0x53CF) & (0xFFFFDF7F & 0x7F97);
        N.lIIllIIlI[71] = 0xFFFFF76B & 0x2EB7;
        N.lIIllIIlI[72] = 0xFFFF9E9C & 0x6D7F;
        N.lIIllIIlI[73] = -(0xFFFFA9FB & 0x5F4F) & (0xFFFFEFFB & 0x3F5F);
        N.lIIllIIlI[74] = -(0xFFFFEF0D & 0x38F3) & (0xFFFFAFFF & 0x7EFC);
        N.lIIllIIlI[75] = 0xFFFFCFFF & 0x36FF;
        N.lIIllIIlI[76] = 134 + 104 - 94 + 92 ^ 137 + 134 - 118 + 39;
        N.lIIllIIlI[77] = 0x83 ^ 0xAE;
        N.lIIllIIlI[78] = 13 + 103 - 89 + 133 ^ 106 + 135 - 202 + 103;
        N.lIIllIIlI[79] = 163 + 93 - 204 + 119 ^ 70 + 114 - 84 + 32;
        N.lIIllIIlI[80] = 0xFFFFB6FF & 0x4FFD;
        N.lIIllIIlI[81] = 0x86 ^ 0xB6;
        N.lIIllIIlI[82] = 0x19 ^ 0x28;
        N.lIIllIIlI[83] = 0x85 ^ 0xB6;
        N.lIIllIIlI[84] = -(0xFFFF9B63 & 0x7D9F) & (0xFFFFFF1F & 0x3FFF);
        N.lIIllIIlI[85] = 0x4E ^ 0x6A ^ (0xA5 ^ 0xB5);
        N.lIIllIIlI[86] = 0x51 ^ 0x64;
        N.lIIllIIlI[87] = 96 + 117 - 196 + 156 ^ 24 + 43 - 27 + 115;
        N.lIIllIIlI[88] = 0xEA ^ 0xC3 ^ (0x6F ^ 0x71);
        N.lIIllIIlI[89] = 15 + 33 - -163 + 37 ^ 92 + 150 - 108 + 58;
        N.lIIllIIlI[90] = 100 + 3 - 15 + 39 ^ (0xEF ^ 0xA9);
        N.lIIllIIlI[91] = -(0xFFFFD3D7 & 0x6CE9) & (0xFFFFF7DF & 0x6EFF);
        N.lIIllIIlI[92] = 0x33 ^ 9;
        N.lIIllIIlI[93] = 129 + 93 - 76 + 9 ^ 74 + 107 - 33 + 12;
        N.lIIllIIlI[94] = 0x86 ^ 0xBA;
        N.lIIllIIlI[95] = 0x12 ^ 0x2F;
        N.lIIllIIlI[96] = 53 + 131 - 138 + 109 ^ 93 + 17 - 94 + 149;
        N.lIIllIIlI[97] = 0x9C ^ 0xC7 ^ (0x75 ^ 0x11);
        N.lIIllIIlI[98] = 0x38 ^ 0x78;
        N.lIIllIIlI[99] = 18 + 0 - -11 + 214 ^ 7 + 137 - 128 + 162;
        N.lIIllIIlI[100] = 0x26 ^ 0x74 ^ (0xA ^ 0x1A);
        N.lIIllIIlI[101] = 0x96 ^ 0x8B ^ (0x4F ^ 0x11);
        N.lIIllIIlI[102] = 0x50 ^ 0x14;
        N.lIIllIIlI[103] = -(0xFFFFDCFD & 0x3356) & (0xFFFFF7DF & 0x1F73);
        N.lIIllIIlI[104] = 0xFFFFFEBF & 0xD5E;
        N.lIIllIIlI[105] = 0xD2 ^ 0xBD ^ (0x3E ^ 0x14);
        N.lIIllIIlI[106] = 0xF9 ^ 0xBF;
        N.lIIllIIlI[107] = 0x44 ^ 3;
        N.lIIllIIlI[108] = -(0xFFFFE7EB & 0x5BF5) & (0xFFFFEFFF & 0x5FFD);
        N.lIIllIIlI[109] = -(0xFFFFF21F & 0x4DFF) & (0xFFFFFFBF & 0x667E);
        N.lIIllIIlI[110] = 0xF4 ^ 0xBC;
        N.lIIllIIlI[111] = 65 + 227 - 129 + 67 ^ 131 + 131 - 133 + 46;
        N.lIIllIIlI[112] = 0x5E ^ 0x14;
        N.lIIllIIlI[113] = -(0xFFFFDEB2 & 0x695F) & (0xFFFFFF37 & 0x6EFB);
        N.lIIllIIlI[114] = 0x2B ^ 0x60;
        N.lIIllIIlI[115] = 0xE7 ^ 0x81 ^ (0x9E ^ 0xB4);
        N.lIIllIIlI[116] = 0x9E ^ 0xC4 ^ (0x61 ^ 0x76);
        N.lIIllIIlI[117] = 0xEF ^ 0xA1;
        N.lIIllIIlI[118] = 0xB9 ^ 0xAB ^ (0xD6 ^ 0x8B);
        N.lIIllIIlI[119] = 0x10 ^ 1 ^ (0xED ^ 0xAC);
        N.lIIllIIlI[120] = 208 + 202 - 222 + 40 ^ 91 + 177 - 215 + 128;
        N.lIIllIIlI[121] = 0xFFFF9F39 & 0x67C7;
        N.lIIllIIlI[122] = 134 + 95 - 114 + 80 ^ 46 + 4 - 45 + 140;
        N.lIIllIIlI[123] = 0xF3 ^ 0xA0;
        N.lIIllIIlI[124] = 0x7C ^ 0x64 ^ (0xD9 ^ 0x95);
        N.lIIllIIlI[125] = 0x95 ^ 0xC0;
        N.lIIllIIlI[126] = -(0xFFFFFE6B & 0x3996) & (0xFFFFFFFF & 0x3EFF);
        N.lIIllIIlI[127] = 0xFFFFBC3B & 0x4FDF;
        N.lIIllIIlI[128] = 0 ^ 0x3E ^ (0xEC ^ 0x84);
        N.lIIllIIlI[129] = 0x12 ^ 0x45;
        N.lIIllIIlI[130] = 125 + 18 - 108 + 92 ^ (0x35 ^ 0x12);
        N.lIIllIIlI[131] = -(0xFFFFEB9F & 0x377D) & (0xFFFFBFBF & 0x6F7C);
        N.lIIllIIlI[132] = 0 ^ 9 ^ (0xE2 ^ 0xB2);
        N.lIIllIIlI[133] = 0x33 ^ 0x4E ^ (0x14 ^ 0x33);
        N.lIIllIIlI[134] = 27 + 64 - 18 + 148 ^ 37 + 126 - 49 + 20;
        N.lIIllIIlI[135] = 0x4D ^ 0xD ^ (0x42 ^ 0x5E);
        N.lIIllIIlI[136] = 104 + 14 - 18 + 92 ^ 125 + 127 - 175 + 80;
        N.lIIllIIlI[137] = 0xAF ^ 0xB8 ^ (0xEB ^ 0xA2);
        N.lIIllIIlI[138] = 0xFFFF9C77 & 0x6FAA;
        N.lIIllIIlI[139] = 0x17 ^ 0x48;
        N.lIIllIIlI[140] = 2 ^ 0x62;
        N.lIIllIIlI[141] = 0xBF ^ 0xB6 ^ (0x5B ^ 0x33);
        N.lIIllIIlI[142] = 0x26 ^ 0x44;
        N.lIIllIIlI[143] = 0x4F ^ 0x2C;
        N.lIIllIIlI[144] = 0x55 ^ 0x5A ^ (6 ^ 0x6D);
        N.lIIllIIlI[145] = 0x6D ^ 6 ^ (0x97 ^ 0x99);
        N.lIIllIIlI[146] = 0xE9 ^ 0x8F;
        N.lIIllIIlI[147] = 67 + 102 - 51 + 44 ^ 148 + 73 - 57 + 33;
        N.lIIllIIlI[148] = 0xD6 ^ 0xBE;
        N.lIIllIIlI[149] = 0x87 ^ 0xC0 ^ (0xA5 ^ 0x8B);
        N.lIIllIIlI[150] = 0x13 ^ 0x18 ^ (0x3D ^ 0x5C);
        N.lIIllIIlI[151] = 0xCE ^ 0xA5;
        N.lIIllIIlI[152] = 0xFFFFE66E & 0x3FB5;
        N.lIIllIIlI[153] = 0xDD ^ 0xC0 ^ (0xF7 ^ 0x86);
        N.lIIllIIlI[154] = 0x23 ^ 0x36 ^ (0xBB ^ 0xC3);
        N.lIIllIIlI[155] = 0xC3 ^ 0x81 ^ (0xA7 ^ 0x8B);
        N.lIIllIIlI[156] = 0x7E ^ 0x11;
        N.lIIllIIlI[157] = (0x74 ^ 0x64) + (0x5B ^ 0x7F) - -(0x5E ^ 3) + ((0x18 ^ 0x7A) & ~(0x2E ^ 0x4C));
        N.lIIllIIlI[158] = 0x78 ^ 8;
        N.lIIllIIlI[159] = 95 + 74 - 39 + 11;
        N.lIIllIIlI[160] = 0xED ^ 0x9C;
        N.lIIllIIlI[161] = 0xFFFFDED5 & 0x2D3B;
        N.lIIllIIlI[162] = 0xFFFFAED9 & 0x773F;
        N.lIIllIIlI[163] = 0x48 ^ 0x3A;
        N.lIIllIIlI[164] = 2 ^ (0xED ^ 0x9C);
        N.lIIllIIlI[165] = 0x75 ^ 0x7B ^ (0x5E ^ 0x24);
        N.lIIllIIlI[166] = 0xD1 ^ 0xA4;
        N.lIIllIIlI[167] = 31 + 59 - -12 + 136 ^ 96 + 86 - 154 + 124;
        N.lIIllIIlI[168] = 209 + 207 - 341 + 147 ^ 128 + 161 - 168 + 48;
        N.lIIllIIlI[169] = 3 ^ 0x7B;
        N.lIIllIIlI[170] = 0xF6 ^ 0x91 ^ (0x75 ^ 0x6B);
        N.lIIllIIlI[171] = 8 ^ 0x72;
        N.lIIllIIlI[172] = 0x5E ^ 0x17 ^ (0xBC ^ 0x8E);
        N.lIIllIIlI[173] = 0x30 ^ 0x6F ^ (0x5C ^ 0x7F);
        N.lIIllIIlI[174] = 0x3A ^ 0x47;
        N.lIIllIIlI[175] = 0xFFFFE495 & 0x3F6E;
        N.lIIllIIlI[176] = -(0xFFFFBBFD & 0x5523) & (0xFFFFFFFD & 0x3FEE);
        N.lIIllIIlI[177] = -(0xFFFFB9BB & 0x4E55) & (0xFFFFEBBD & 0x7DFA);
        N.lIIllIIlI[178] = -(0xFFFFEEDE & 0x5BB5) & (0xFFFFFBFF & 0x4FBF);
        N.lIIllIIlI[179] = -(0xFFFFBDC7 & 0x62FB) & (0xFFFFF5D6 & 0x2FFF);
        N.lIIllIIlI[180] = 0x45 ^ 0x60 ^ (5 ^ 0x5E);
        N.lIIllIIlI[181] = 114 + 55 - 83 + 41;
        N.lIIllIIlI[182] = 92 + 28 - 114 + 122;
        N.lIIllIIlI[183] = 86 + 126 - 91 + 8;
        N.lIIllIIlI[184] = 0xFFFFCDFF & 0x3F25;
        N.lIIllIIlI[185] = 65 + 104 - 65 + 26;
        N.lIIllIIlI[186] = 17 + 58 - 69 + 125;
        N.lIIllIIlI[187] = 0xFFFF9D13 & 0x6FED;
        N.lIIllIIlI[188] = -(0xFFFFE2F9 & 0x7F17) & (0xFFFFFEDF & 0x6F3F);
        N.lIIllIIlI[189] = -(0xFFFFF3EF & 0x7C51) & (0xFFFFFD60 & Short.MAX_VALUE);
        N.lIIllIIlI[190] = 0xFFFFCD9A & 0x3F6D;
        N.lIIllIIlI[191] = 0xFFFFAF36 & 0x5CDF;
        N.lIIllIIlI[192] = -(0xFFFFFAC1 & 0x7FF) & (0xFFFFDFDF & 0x2FFF);
        N.lIIllIIlI[193] = 73 + 75 - 97 + 81;
        N.lIIllIIlI[194] = (0xC8 ^ 0xBB) + (0xE ^ 0x68) - (0x3F ^ 0x4F) + (0x91 ^ 0x8D);
        N.lIIllIIlI[195] = 84 + 93 - 121 + 78;
        N.lIIllIIlI[196] = -(120 + 61 - 96 + 108) & (0xFFFFEEDF & 0x37EF);
        N.lIIllIIlI[197] = 93 + 111 - 130 + 61;
    }

    private static boolean lIIIIIIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static int lllllllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llllllIllII() {
        lIIlIllll = new String[lIIllIIlI[197]];
        N.lIIlIllll[N.lIIllIIlI[1]] = N."Finished buying items, switching back to quest";
        N.lIIlIllll[N.lIIllIIlI[0]] = N."Nav to bank";
        N.lIIlIllll[N.lIIllIIlI[3]] = N."Handling banking";
        N.lIIlIllll[N.lIIllIIlI[8]] = N."We are missing quest supplies, switching to BUYING";
        N.lIIlIllll[N.lIIllIIlI[4]] = N."Drink";
        N.lIIlIllll[N.lIIllIIlI[14]] = N."Eat";
        N.lIIlIllll[N.lIIllIIlI[17]] = N."Nav to start";
        N.lIIlIllll[N.lIIllIIlI[18]] = N."Start quest";
        N.lIIlIllll[N.lIIllIIlI[16]] = N."Veronica";
        N.lIIlIllll[N.lIIllIIlI[20]] = N."Key";
        N.lIIlIllll[N.lIIllIIlI[10]] = N."Nav to fish food";
        N.lIIlIllll[N.lIIllIIlI[23]] = N."Can't reach, navigating";
        N.lIIlIllll[N.lIIllIIlI[24]] = N."Taking food";
        N.lIIlIllll[N.lIIllIIlI[25]] = N."Take";
        N.lIIlIllll[N.lIIllIIlI[26]] = N."Making poison fish food";
        N.lIIlIllll[N.lIIllIIlI[27]] = N."Key";
        N.lIIlIllll[N.lIIllIIlI[28]] = N."Nav to compost";
        N.lIIlIllll[N.lIIllIIlI[29]] = N."Digging";
        N.lIIlIllll[N.lIIllIIlI[30]] = N."Compost heap";
        N.lIIlIllll[N.lIIllIIlI[31]] = N."Search";
        N.lIIlIllll[N.lIIllIIlI[32]] = N."Key";
        N.lIIlIllll[N.lIIllIIlI[33]] = N."Nav to fountain";
        N.lIIlIllll[N.lIIllIIlI[34]] = N."Fountain";
        N.lIIlIllll[N.lIIllIIlI[35]] = N."Key";
        N.lIIlIllll[N.lIIllIIlI[36]] = N."Pressure gauge";
        N.lIIlIllll[N.lIIllIIlI[37]] = N."Getting guage";
        N.lIIlIllll[N.lIIllIIlI[38]] = N."Fountain";
        N.lIIlIllll[N.lIIllIIlI[39]] = N."Search";
        N.lIIlIllll[N.lIIllIIlI[40]] = N."Key";
        N.lIIlIllll[N.lIIllIIlI[41]] = N."Pressure gauge";
        N.lIIlIllll[N.lIIllIIlI[42]] = N."Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[46]] = N."Nav to door";
        N.lIIlIllll[N.lIIllIIlI[47]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[48]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[49]] = N."Get tube";
        N.lIIlIllll[N.lIIllIIlI[50]] = N."Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[51]] = N."Take";
        N.lIIlIllll[N.lIIllIIlI[52]] = N."Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[53]] = N."Oil can";
        N.lIIlIllll[N.lIIllIIlI[56]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[57]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[58]] = N."Nav to final room";
        N.lIIlIllll[N.lIIllIIlI[59]] = N."Ladder";
        N.lIIlIllll[N.lIIllIIlI[60]] = N."Climb-down";
        N.lIIlIllll[N.lIIllIIlI[76]] = N."Nav to a";
        N.lIIlIllll[N.lIIllIIlI[77]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[78]] = N."Lever A";
        N.lIIlIllll[N.lIIllIIlI[79]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[81]] = N."Nav to b";
        N.lIIlIllll[N.lIIllIIlI[82]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[15]] = N."Lever B";
        N.lIIlIllll[N.lIIllIIlI[83]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[85]] = N."Nav to d";
        N.lIIlIllll[N.lIIllIIlI[86]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[87]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[88]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[89]] = N."Lever D";
        N.lIIlIllll[N.lIIllIIlI[90]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[92]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[93]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[94]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[95]] = N."Nav to b";
        N.lIIlIllll[N.lIIllIIlI[96]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[97]] = N."Lever B";
        N.lIIlIllll[N.lIIllIIlI[98]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[99]] = N."Nav to a";
        N.lIIlIllll[N.lIIllIIlI[100]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[101]] = N."Lever A";
        N.lIIlIllll[N.lIIllIIlI[102]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[105]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[106]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[107]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[110]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[111]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[112]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[114]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[115]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[116]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[117]] = N."Nav to e";
        N.lIIlIllll[N.lIIllIIlI[118]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[119]] = N."Lever E";
        N.lIIlIllll[N.lIIllIIlI[120]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[122]] = N."Nav to f";
        N.lIIlIllll[N.lIIllIIlI[123]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[124]] = N."Lever F";
        N.lIIlIllll[N.lIIllIIlI[125]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[128]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[129]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[130]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[132]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[133]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[134]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[135]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[136]] = N."Lever C";
        N.lIIlIllll[N.lIIllIIlI[137]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[139]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[140]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[141]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[142]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[143]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[144]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[145]] = N."Nav to e";
        N.lIIlIllll[N.lIIllIIlI[146]] = N."Pull lever";
        N.lIIlIllll[N.lIIllIIlI[147]] = N."Lever E";
        N.lIIlIllll[N.lIIllIIlI[148]] = N."Pull";
        N.lIIlIllll[N.lIIllIIlI[149]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[150]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[151]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[153]] = N."Move to door";
        N.lIIlIllll[N.lIIllIIlI[154]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[155]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[156]] = N."Opening 145";
        N.lIIlIllll[N.lIIllIIlI[158]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[160]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[163]] = N."Oil can";
        N.lIIlIllll[N.lIIllIIlI[164]] = N."Oil can";
        N.lIIlIllll[N.lIIllIIlI[165]] = N."Take";
        N.lIIlIllll[N.lIIllIIlI[166]] = N."Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[167]] = N."Oil can";
        N.lIIlIllll[N.lIIllIIlI[168]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[169]] = N."Nav to professor";
        N.lIIlIllll[N.lIIllIIlI[170]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[171]] = N."Professor Oddenstein";
        N.lIIlIllll[N.lIIllIIlI[172]] = N."Nav to professor";
        N.lIIlIllll[N.lIIllIIlI[173]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[174]] = N."Professor Oddenstein";
        N.lIIlIllll[N.lIIllIIlI[180]] = N."Ernest the Chicken";
        N.lIIlIllll[N.lIIllIIlI[181]] = N."ring of wealth (";
        N.lIIlIllll[N.lIIllIIlI[182]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[183]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[185]] = N."Door";
        N.lIIlIllll[N.lIIllIIlI[186]] = N."Open";
        N.lIIlIllll[N.lIIllIIlI[193]] = N."Yes.";
        N.lIIlIllll[N.lIIllIIlI[194]] = N."I'm looking for a guy called Ernest.";
        N.lIIlIllll[N.lIIllIIlI[195]] = N."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static String llllllIIllI(String lIIIIIIlllIIlIl, String lIIIIIIlllIIlII) {
        lIIIIIIlllIIlIl = new String(Base64.getDecoder().decode(lIIIIIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIIlllIlIII = new StringBuilder();
        char[] lIIIIIIlllIIlll = lIIIIIIlllIIlII.toCharArray();
        int lIIIIIIlllIIllI = lIIllIIlI[1];
        char[] lIIIIIIlllIIIII = lIIIIIIlllIIlIl.toCharArray();
        int lIIIIIIllIlllll = lIIIIIIlllIIIII.length;
        int lIIIIIIllIllllI = lIIllIIlI[1];
        while (N.lllllllllll(lIIIIIIllIllllI, lIIIIIIllIlllll)) {
            char lIIIIIIlllIlIll = lIIIIIIlllIIIII[lIIIIIIllIllllI];
            lIIIIIIlllIlIII.append((char)(lIIIIIIlllIlIll ^ lIIIIIIlllIIlll[lIIIIIIlllIIllI % lIIIIIIlllIIlll.length]));
            0;
            ++lIIIIIIlllIIllI;
            ++lIIIIIIllIllllI;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(lIIIIIIlllIlIII);
    }
}

