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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class CHelper
implements G {
    static  boolean cl;
    static  int hW;
    
    static  String[] bR;
    public static  WorldPoint hS;
    public static  WorldPoint hT;
    public static  WorldPoint cg;
    static  int ck;
    static  WorldArea hX;
    public static  WorldPoint hU;
    public static  boolean bt;
    
    public static  WorldPoint hV;
    public static  List<d> bv;

    private static boolean lIIIIllIIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void var1;
        int[] nArray = new int[lIIllllIIl[4]];
        nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
        nArray[C.lIIllllIIl[0]] = lIIllllIIl[6];
        nArray[C.lIIllllIIl[3]] = lIIllllIIl[7];
        nArray[C.lIIllllIIl[8]] = lIIllllIIl[9];
        int[] nArray2 = nArray;
        int var2 = lIIllllIIl[1];
        while (C.lIIIIllIIIIlI(var2, ((void)var1).length)) {
            int[] nArray3 = new int[lIIllllIIl[0]];
            nArray3[C.lIIllllIIl[1]] = var1[var2];
            if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIllllIIl[1];
            }
            ++var2;

            return false;
        }
        return lIIllllIIl[0];
    }

    private static int lIIIIllIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIIllIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIllIIIlII(Object object) {
        return object != null;
    }

    public static void bH() {
        block134: {
            BankLocation var3;
            block135: {
                WorldArea var4;
                TileItem var5;
                block137: {
                    block136: {
                        if (C.lIIIIllIIIIIl(bt ? 1 : 0)) {
                            b.a(bv);
                            if (C.lIIIIllIIIIlI(bv.size(), lIIllllIIl[0])) {
                                System.out.println(lIIlllIlll[lIIllllIIl[1]]);
                                bt = lIIllllIIl[1];
                            }
                        }
                        if (!C.lIIIIllIIIIll(bt ? 1 : 0)) break block134;
                        if (C.lIIIIllIIIIll(C.ab() ? 1 : 0) && C.lIIIIllIIIIlI(e.j(hW), lIIllllIIl[0])) {
                            var3 = BankLocation.getNearest();
                            if (C.lIIIIllIIIlII(var3) && C.lIIIIllIIIIll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[0]];
                                a.a(var3);
                            }
                            if (C.lIIIIllIIIlII(var3) && C.lIIIIllIIIIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (C.lIIIIllIIIIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllllIIl[2]);

                                }
                                if (C.lIIIIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[3]];
                                    if (C.lIIIIllIIIlIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIllllIIl[4]);

                                    }
                                    if (C.lIIIIllIIIlIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIllllIIl[3]);

                                    }
                                    int[] nArray = new int[lIIllllIIl[4]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
                                    nArray[C.lIIllllIIl[0]] = lIIllllIIl[6];
                                    nArray[C.lIIllllIIl[3]] = lIIllllIIl[7];
                                    nArray[C.lIIllllIIl[8]] = lIIllllIIl[9];
                                    if (C.lIIIIllIIIIll(e.b(nArray) ? 1 : 0)) {
                                        C.af();
                                        System.out.println(lIIlllIlll[lIIllllIIl[8]]);
                                        bt = lIIllllIIl[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIllllIIl[4]];
                                    nArray2[C.lIIllllIIl[1]] = lIIllllIIl[5];
                                    nArray2[C.lIIllllIIl[0]] = lIIllllIIl[6];
                                    nArray2[C.lIIllllIIl[3]] = lIIllllIIl[7];
                                    nArray2[C.lIIllllIIl[8]] = lIIllllIIl[9];
                                    if (C.lIIIIllIIIIIl(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIllllIIl[5], lIIllllIIl[10]);
                                        a.a(lIIllllIIl[6], lIIllllIIl[10]);
                                        a.a(lIIllllIIl[7], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[11], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[9], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[12], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[13], lIIllllIIl[14]);
                                    }
                                }
                            }
                        }
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && C.lIIIIllIIIIlI(Movement.getRunEnergy(), lIIllllIIl[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIlllIlll[lIIllllIIl[4]]);
                            Time.sleepTicks((int)lIIllllIIl[0]);

                        }
                        int[] nArray = new int[lIIllllIIl[0]];
                        nArray[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && C.lIIIIllIIIllI(C.lIIIIllIIIIII(e.u(), 50.0))) {
                            int[] nArray3 = new int[lIIllllIIl[0]];
                            nArray3[C.lIIllllIIl[1]] = lIIllllIIl[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlllIlll[lIIllllIIl[14]]);
                            Time.sleepTicks((int)lIIllllIIl[3]);

                        }
                        if (C.lIIIIllIIIIIl(C.ab() ? 1 : 0) && C.lIIIIllIIIIll(e.j(hW))) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[17]];
                                Movement.walkTo((WorldPoint)cg);

                                Time.sleepTicks((int)lIIllllIIl[0]);

                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[18]];
                                if (C.lIIIIllIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlllIlll[lIIllllIIl[16]], bR);
                            }
                        }
                        if (!C.lIIIIllIIlIIl(e.j(hW), lIIllllIIl[0])) break block135;
                        ck = lIIllllIIl[1];
                        int[] nArray4 = new int[lIIllllIIl[0]];
                        nArray4[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllllIIl[0]];
                            nArray5[C.lIIllllIIl[1]] = lIIllllIIl[19];
                            if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIllllIIl[0]];
                                stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[20]];
                                if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var3 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[22], lIIllllIIl[0]);
                                    int[] nArray6 = new int[lIIllllIIl[0]];
                                    nArray6[C.lIIllllIIl[1]] = lIIllllIIl[11];
                                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIIllllIIl[14])) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[10]];
                                            Movement.walkTo((WorldPoint)var3);

                                            Time.sleepTicks((int)lIIllllIIl[0]);

                                        }
                                        if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIIllllIIl[14])) {
                                            int[] nArray7 = new int[lIIllllIIl[0]];
                                            nArray7[C.lIIllllIIl[1]] = lIIllllIIl[11];
                                            var5 = TileItems.getNearest((int[])nArray7);
                                            if (C.lIIIIllIIIlII(var5)) {
                                                if (C.lIIIIllIIIIll(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
                                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[23]];
                                                    Movement.walkTo((WorldPoint)var5.getWorldLocation());

                                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                                }
                                                if (C.lIIIIllIIIIIl(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
                                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[24]];
                                                    var5.interact(lIIlllIlll[lIIllllIIl[25]]);
                                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIllllIIl[0]];
                        nArray8[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (!C.lIIIIllIIIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIllllIIl[0]];
                        nArray9[C.lIIllllIIl[1]] = lIIllllIIl[19];
                        if (!C.lIIIIllIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIllllIIl[0]];
                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIllllIIl[0]];
                        nArray10[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[26]];
                            int[] nArray11 = new int[lIIllllIIl[0]];
                            nArray11[C.lIIllllIIl[1]] = lIIllllIIl[11];
                            int[] nArray12 = new int[lIIllllIIl[0]];
                            nArray12[C.lIIllllIIl[1]] = lIIllllIIl[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIllllIIl[0]);

                        }
                    }
                    int[] nArray13 = new int[lIIllllIIl[0]];
                    nArray13[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllllIIl[0]];
                        stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[27]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[28]];
                                Movement.walkTo((WorldPoint)hS);

                                Time.sleepTicks((int)lIIllllIIl[0]);

                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[29]];
                                String[] stringArray2 = new String[lIIllllIIl[0]];
                                stringArray2[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlllIlll[lIIllllIIl[31]]);
                                Time.sleepTicks((int)lIIllllIIl[20]);

                            }
                        }
                        String[] stringArray3 = new String[lIIllllIIl[0]];
                        stringArray3[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[32]];
                        if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[33]];
                                Movement.walkTo((WorldPoint)hT);

                                Time.sleepTicks((int)lIIllllIIl[0]);

                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                                int[] nArray14 = new int[lIIllllIIl[0]];
                                nArray14[C.lIIllllIIl[1]] = lIIllllIIl[19];
                                String[] stringArray4 = new String[lIIllllIIl[0]];
                                stringArray4[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIllllIIl[0]);

                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIllllIIl[0]];
                stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[35]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIllllIIl[0]];
                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIllllIIl[0]];
                        stringArray5[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[36]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[37]];
                            if (C.lIIIIllIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIllllIIl[0]];
                                stringArray6[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlllIlll[lIIllllIIl[39]]);
                                Time.sleepTicks((int)lIIllllIIl[4]);

                            }
                            g.a(bR);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIllllIIl[0]];
                stringArray7[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[40]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIllllIIl[0]];
                    stringArray8[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[41]];
                    if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIllllIIl[0]];
                        stringArray9[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[42]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var3 = new WorldPoint(lIIllllIIl[43], lIIllllIIl[44], lIIllllIIl[1]);
                            var5 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[44], lIIllllIIl[1]);
                            var4 = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                            if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0) && C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0) && C.lIIIIllIIIIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[46]];
                                Movement.walkTo((WorldPoint)var3);

                                Time.sleepTicks((int)lIIllllIIl[0]);

                            }
                            if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIllllIIl[0]];
                                stringArray10[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlllIlll[lIIllllIIl[48]]);
                                Time.sleepTicks((int)lIIllllIIl[3]);

                            }
                            if (C.lIIIIllIIIIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[49]];
                                String[] stringArray11 = new String[lIIllllIIl[0]];
                                stringArray11[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlllIlll[lIIllllIIl[51]]);
                                Time.sleepTicks((int)lIIllllIIl[8]);

                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIllllIIl[0]];
                stringArray12[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[52]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllllIIl[0]];
                    stringArray13[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[53]];
                    if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var3 = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                        var5 = new WorldArea(lIIllllIIl[54], lIIllllIIl[55], lIIllllIIl[18], lIIllllIIl[23], lIIllllIIl[1]);
                        if (C.lIIIIllIIIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIllllIIl[0]];
                            stringArray14[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlllIlll[lIIllllIIl[57]]);
                            Time.sleepTicks((int)lIIllllIIl[3]);

                        }
                        if (C.lIIIIllIIIIll(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[58]];
                            Movement.walkTo((WorldPoint)hU);

                            Time.sleepTicks((int)lIIllllIIl[0]);

                        }
                        if (C.lIIIIllIIIIIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIllllIIl[0]];
                            stringArray15[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlllIlll[lIIllllIIl[60]]);
                            Time.sleepTicks((int)lIIllllIIl[4]);

                        }
                        if (C.lIIIIllIIIIIl(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var6;
                            WorldPoint var7;
                            WorldPoint var8;
                            var4 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[61], lIIllllIIl[1]);
                            WorldPoint var9 = new WorldPoint(lIIllllIIl[62], lIIllllIIl[63], lIIllllIIl[1]);
                            WorldPoint var10 = new WorldPoint(lIIllllIIl[64], lIIllllIIl[65], lIIllllIIl[1]);
                            WorldPoint var11 = new WorldPoint(lIIllllIIl[43], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint var12 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint var13 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldArea var14 = new WorldArea(lIIllllIIl[68], lIIllllIIl[69], lIIllllIIl[20], lIIllllIIl[23], lIIllllIIl[1]);
                            WorldArea var15 = new WorldArea(lIIllllIIl[70], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[17], lIIllllIIl[1]);
                            WorldArea var16 = new WorldArea(lIIllllIIl[72], lIIllllIIl[73], lIIllllIIl[32], lIIllllIIl[25], lIIllllIIl[1]);
                            if (C.lIIIIllIIlIlI(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[76]];
                                    Movement.walkTo((WorldPoint)var4);

                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[77]];
                                    String[] stringArray16 = new String[lIIllllIIl[0]];
                                    stringArray16[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlllIlll[lIIllllIIl[79]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var9) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[81]];
                                    Movement.walkTo((WorldPoint)var9);

                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var9) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[82]];
                                    String[] stringArray17 = new String[lIIllllIIl[0]];
                                    stringArray17[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlllIlll[lIIllllIIl[83]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[80]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var8 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[84], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[85]];
                                        Movement.walkTo((WorldPoint)var8);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIllllIIl[0]];
                                        stringArray18[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlllIlll[lIIllllIIl[87]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[88]];
                                    String[] stringArray19 = new String[lIIllllIIl[0]];
                                    stringArray19[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlllIlll[lIIllllIIl[90]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[80]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (C.lIIIIllIIIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var8 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[91], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[92]];
                                        Movement.walkTo((WorldPoint)var8);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIllllIIl[0]];
                                        stringArray20[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlllIlll[lIIllllIIl[94]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var9) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[95]];
                                        Movement.walkTo((WorldPoint)var9);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var9) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[96]];
                                        String[] stringArray21 = new String[lIIllllIIl[0]];
                                        stringArray21[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlllIlll[lIIllllIIl[98]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[99]];
                                    Movement.walkTo((WorldPoint)var4);

                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[100]];
                                    String[] stringArray22 = new String[lIIllllIIl[0]];
                                    stringArray22[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlllIlll[lIIllllIIl[102]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                if (C.lIIIIllIIIIll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var8 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[84], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[105]];
                                            Movement.walkTo((WorldPoint)var8);

                                            Time.sleepTicks((int)lIIllllIIl[0]);

                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIllllIIl[0]];
                                            stringArray23[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlllIlll[lIIllllIIl[107]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);

                                        }
                                    }
                                    if (C.lIIIIllIIIIIl((var8 = new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                        var7 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[109], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[110]];
                                            Movement.walkTo((WorldPoint)var7);

                                            Time.sleepTicks((int)lIIllllIIl[0]);

                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIllllIIl[0]];
                                            stringArray24[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlllIlll[lIIllllIIl[112]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);

                                        }
                                    }
                                    if (C.lIIIIllIIIIIl((var7 = new WorldArea(lIIllllIIl[70], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var6 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[113], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[114]];
                                            Movement.walkTo((WorldPoint)var6);

                                            Time.sleepTicks((int)lIIllllIIl[0]);

                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIllllIIl[0]];
                                            stringArray25[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlllIlll[lIIllllIIl[116]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);

                                        }
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[117]];
                                        Movement.walkTo((WorldPoint)var12);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[118]];
                                        String[] stringArray26 = new String[lIIllllIIl[0]];
                                        stringArray26[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlllIlll[lIIllllIIl[120]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[121]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[122]];
                                    Movement.walkTo((WorldPoint)var13);

                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[123]];
                                    String[] stringArray27 = new String[lIIllllIIl[0]];
                                    stringArray27[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlllIlll[lIIllllIIl[125]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[126]))) {
                                var8 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[128]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIllllIIl[0]];
                                        stringArray28[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlllIlll[lIIllllIIl[130]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[131], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[132]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIllllIIl[0]];
                                        stringArray29[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlllIlll[lIIllllIIl[134]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[135]];
                                    String[] stringArray30 = new String[lIIllllIIl[0]];
                                    stringArray30[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlllIlll[lIIllllIIl[137]]);
                                    Time.sleepTicks((int)lIIllllIIl[16]);

                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
                                var8 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[138], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[139]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIllllIIl[0]];
                                        stringArray31[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlllIlll[lIIllllIIl[141]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[142]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIllllIIl[0]];
                                        stringArray32[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlllIlll[lIIllllIIl[144]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[145]];
                                        Movement.walkTo((WorldPoint)var12);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[146]];
                                        String[] stringArray33 = new String[lIIllllIIl[0]];
                                        stringArray33[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlllIlll[lIIllllIIl[148]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
                                var8 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[149]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIllllIIl[0]];
                                        stringArray34[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlllIlll[lIIllllIIl[151]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[152], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[153]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIllllIIl[0]);

                                        String[] stringArray35 = new String[lIIllllIIl[0]];
                                        stringArray35[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlllIlll[lIIllllIIl[155]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);

                                    }
                                }
                                if (C.lIIIIllIIIIIl((var7 = new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[156]];
                                    Time.sleepTicks((int)lIIllllIIl[0]);

                                    int[] nArray = new int[lIIllllIIl[0]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[158]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                                if (C.lIIIIllIIIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIllllIIl[0]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[160]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);

                                }
                                if (C.lIIIIllIIIIIl((var6 = new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIllllIIl[0]];
                                    stringArray36[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[163]];
                                    if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIllllIIl[0]];
                                        stringArray37[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlllIlll[lIIllllIIl[165]]);
                                        Time.sleepTicks((int)lIIllllIIl[14]);

                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIllllIIl[0]];
                stringArray38[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[166]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIllllIIl[0]];
                    stringArray39[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[167]];
                    if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var3 = new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1]);
                        if (C.lIIIIllIIIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIllllIIl[0]];
                            nArray[C.lIIllllIIl[1]] = lIIllllIIl[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[168]]);
                            Time.sleepTicks((int)lIIllllIIl[14]);

                        }
                        if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[169]];
                            Movement.walkTo((WorldPoint)hV);

                            Time.sleepTicks((int)lIIllllIIl[0]);

                        }
                        if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            var5 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (C.lIIIIllIIIIIl(tileObject.getName().contains(lIIlllIlll[lIIllllIIl[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIllllIIl[0]];
                                    stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[186]];
                                    if (C.lIIIIllIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && C.lIIIIllIIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                        n2 = lIIllllIIl[0];

                                        if (3 == 3) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lIIllllIIl[1];
                                return n2 != 0;
                            });
                            if (C.lIIIIllIIIlII(var5)) {
                                var5.interact(lIIlllIlll[lIIllllIIl[170]]);
                                Time.sleepTicks((int)lIIllllIIl[8]);

                            }
                            if (C.lIIIIllIIlIll(var5)) {
                                g.a(lIIlllIlll[lIIllllIIl[171]], bR, lIIllllIIl[0]);
                            }
                        }
                    }
                }
            }
            if (C.lIIIIllIIlIIl(e.j(hW), lIIllllIIl[3])) {
                if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[172]];
                    Movement.walkTo((WorldPoint)hV);

                    Time.sleepTicks((int)lIIllllIIl[0]);

                }
                if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    var3 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (C.lIIIIllIIIIIl(tileObject.getName().contains(lIIlllIlll[lIIllllIIl[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllllIIl[0]];
                            stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[183]];
                            if (C.lIIIIllIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && C.lIIIIllIIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                n2 = lIIllllIIl[0];

                                if (-1 <= 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIllllIIl[1];
                        return n2 != 0;
                    });
                    if (C.lIIIIllIIIlII(var3)) {
                        var3.interact(lIIlllIlll[lIIllllIIl[173]]);
                        Time.sleepTicks((int)lIIllllIIl[8]);

                    }
                    if (C.lIIIIllIIlIll(var3)) {
                        if (C.lIIIIllIIIIlI(ck, lIIllllIIl[0])) {
                            U.mQ += lIIllllIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllllIIl[0];
                            U.mQ = lIIllllIIl[1];
                            cl = lIIllllIIl[1];
                        }
                        g.a(lIIlllIlll[lIIllllIIl[174]], bR, lIIllllIIl[0]);
                    }
                }
            }
            g.a(bR);
        }
    }

    @Override
    public String U() {
        return lIIlllIlll[lIIllllIIl[180]];
    }

    static boolean bI() {
        int n2;
        if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
            n2 = lIIllllIIl[0];

            if (((0x57 ^ 0x60) & ~(0x4F ^ 0x78)) >= 3) {
                return false;
            }
        } else {
            n2 = lIIllllIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIllIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIllIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIllIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var17);
    }

    private static boolean lIIIIllIIIIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (C.lIIIIllIIllII(e.j(lIIllllIIl[47]), lIIllllIIl[8])) {
            bl = lIIllllIIl[0];

            if ((21 + 73 - 11 + 106 ^ 29 + 157 - 104 + 103) <= 3) {
                return ((0xC1 ^ 0x9A ^ (0x30 ^ 0x3C)) & (0xB ^ 0x65 ^ (0xD ^ 0x34) ^ -1)) != 0;
            }
        } else {
            bl = lIIllllIIl[1];
        }
        return bl;
    }

    private static void lIIIIlIllIIIl() {
        lIIlllIlll = new String[lIIllllIIl[197]];
        C.lIIlllIlll[C.lIIllllIIl[1]] = "Finished buying items, switching back to quest";
        C.lIIlllIlll[C.lIIllllIIl[0]] = "Nav to bank";
        C.lIIlllIlll[C.lIIllllIIl[3]] = "Handling banking";
        C.lIIlllIlll[C.lIIllllIIl[8]] = "We are missing quest supplies, switching to BUYING";
        C.lIIlllIlll[C.lIIllllIIl[4]] = "Drink";
        C.lIIlllIlll[C.lIIllllIIl[14]] = "Eat";
        C.lIIlllIlll[C.lIIllllIIl[17]] = "Nav to start";
        C.lIIlllIlll[C.lIIllllIIl[18]] = "Start quest";
        C.lIIlllIlll[C.lIIllllIIl[16]] = "Veronica";
        C.lIIlllIlll[C.lIIllllIIl[20]] = "Key";
        C.lIIlllIlll[C.lIIllllIIl[10]] = "Nav to fish food";
        C.lIIlllIlll[C.lIIllllIIl[23]] = "Can't reach, navigating";
        C.lIIlllIlll[C.lIIllllIIl[24]] = "Taking food";
        C.lIIlllIlll[C.lIIllllIIl[25]] = "Take";
        C.lIIlllIlll[C.lIIllllIIl[26]] = "Making poison fish food";
        C.lIIlllIlll[C.lIIllllIIl[27]] = "Key";
        C.lIIlllIlll[C.lIIllllIIl[28]] = "Nav to compost";
        C.lIIlllIlll[C.lIIllllIIl[29]] = "Digging";
        C.lIIlllIlll[C.lIIllllIIl[30]] = "Compost heap";
        C.lIIlllIlll[C.lIIllllIIl[31]] = "Search";
        C.lIIlllIlll[C.lIIllllIIl[32]] = "Key";
        C.lIIlllIlll[C.lIIllllIIl[33]] = "Nav to fountain";
        C.lIIlllIlll[C.lIIllllIIl[34]] = "Fountain";
        C.lIIlllIlll[C.lIIllllIIl[35]] = "Key";
        C.lIIlllIlll[C.lIIllllIIl[36]] = "Pressure gauge";
        C.lIIlllIlll[C.lIIllllIIl[37]] = "Getting guage";
        C.lIIlllIlll[C.lIIllllIIl[38]] = "Fountain";
        C.lIIlllIlll[C.lIIllllIIl[39]] = "Search";
        C.lIIlllIlll[C.lIIllllIIl[40]] = "Key";
        C.lIIlllIlll[C.lIIllllIIl[41]] = "Pressure gauge";
        C.lIIlllIlll[C.lIIllllIIl[42]] = "Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[46]] = "Nav to door";
        C.lIIlllIlll[C.lIIllllIIl[47]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[48]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[49]] = "Get tube";
        C.lIIlllIlll[C.lIIllllIIl[50]] = "Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[51]] = "Take";
        C.lIIlllIlll[C.lIIllllIIl[52]] = "Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[53]] = "Oil can";
        C.lIIlllIlll[C.lIIllllIIl[56]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[57]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[58]] = "Nav to final room";
        C.lIIlllIlll[C.lIIllllIIl[59]] = "Ladder";
        C.lIIlllIlll[C.lIIllllIIl[60]] = "Climb-down";
        C.lIIlllIlll[C.lIIllllIIl[76]] = "Nav to a";
        C.lIIlllIlll[C.lIIllllIIl[77]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[78]] = "Lever A";
        C.lIIlllIlll[C.lIIllllIIl[79]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[81]] = "Nav to b";
        C.lIIlllIlll[C.lIIllllIIl[82]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[15]] = "Lever B";
        C.lIIlllIlll[C.lIIllllIIl[83]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[85]] = "Nav to d";
        C.lIIlllIlll[C.lIIllllIIl[86]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[87]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[88]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[89]] = "Lever D";
        C.lIIlllIlll[C.lIIllllIIl[90]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[92]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[93]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[94]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[95]] = "Nav to b";
        C.lIIlllIlll[C.lIIllllIIl[96]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[97]] = "Lever B";
        C.lIIlllIlll[C.lIIllllIIl[98]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[99]] = "Nav to a";
        C.lIIlllIlll[C.lIIllllIIl[100]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[101]] = "Lever A";
        C.lIIlllIlll[C.lIIllllIIl[102]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[105]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[106]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[107]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[110]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[111]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[112]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[114]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[115]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[116]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[117]] = "Nav to e";
        C.lIIlllIlll[C.lIIllllIIl[118]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[119]] = "Lever E";
        C.lIIlllIlll[C.lIIllllIIl[120]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[122]] = "Nav to f";
        C.lIIlllIlll[C.lIIllllIIl[123]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[124]] = "Lever F";
        C.lIIlllIlll[C.lIIllllIIl[125]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[128]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[129]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[130]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[132]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[133]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[134]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[135]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[136]] = "Lever C";
        C.lIIlllIlll[C.lIIllllIIl[137]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[139]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[140]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[141]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[142]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[143]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[144]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[145]] = "Nav to e";
        C.lIIlllIlll[C.lIIllllIIl[146]] = "Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[147]] = "Lever E";
        C.lIIlllIlll[C.lIIllllIIl[148]] = "Pull";
        C.lIIlllIlll[C.lIIllllIIl[149]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[150]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[151]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[153]] = "Move to door";
        C.lIIlllIlll[C.lIIllllIIl[154]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[155]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[156]] = "Opening 145";
        C.lIIlllIlll[C.lIIllllIIl[158]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[160]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[163]] = "Oil can";
        C.lIIlllIlll[C.lIIllllIIl[164]] = "Oil can";
        C.lIIlllIlll[C.lIIllllIIl[165]] = "Take";
        C.lIIlllIlll[C.lIIllllIIl[166]] = "Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[167]] = "Oil can";
        C.lIIlllIlll[C.lIIllllIIl[168]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[169]] = "Nav to professor";
        C.lIIlllIlll[C.lIIllllIIl[170]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[171]] = "Professor Oddenstein";
        C.lIIlllIlll[C.lIIllllIIl[172]] = "Nav to professor";
        C.lIIlllIlll[C.lIIllllIIl[173]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[174]] = "Professor Oddenstein";
        C.lIIlllIlll[C.lIIllllIIl[180]] = "Ernest the Chicken";
        C.lIIlllIlll[C.lIIllllIIl[181]] = "ring of wealth (";
        C.lIIlllIlll[C.lIIllllIIl[182]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[183]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[185]] = "Door";
        C.lIIlllIlll[C.lIIllllIIl[186]] = "Open";
        C.lIIlllIlll[C.lIIllllIIl[193]] = "Yes.";
        C.lIIlllIlll[C.lIIllllIIl[194]] = "I'm looking for a guy called Ernest.";
        C.lIIlllIlll[C.lIIllllIIl[195]] = "I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean lIIIIllIIIllI(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean S() {
        return lIIllllIIl[1];
    }

    private static boolean lIIIIllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        C.lIIIIlIllllll();
        C.lIIIIlIllIIIl();
        bv = new ArrayList<d>();
        cg = new WorldPoint(lIIllllIIl[64], lIIllllIIl[187], lIIllllIIl[1]);
        hS = new WorldPoint(lIIllllIIl[188], lIIllllIIl[189], lIIllllIIl[1]);
        hT = new WorldPoint(lIIllllIIl[161], lIIllllIIl[190], lIIllllIIl[1]);
        hU = new WorldPoint(lIIllllIIl[191], lIIllllIIl[192], lIIllllIIl[1]);
        hV = new WorldPoint(lIIllllIIl[64], lIIllllIIl[45], lIIllllIIl[3]);
        hW = lIIllllIIl[47];
        String[] stringArray = new String[lIIllllIIl[8]];
        stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[193]];
        stringArray[C.lIIllllIIl[0]] = lIIlllIlll[lIIllllIIl[194]];
        stringArray[C.lIIllllIIl[3]] = lIIlllIlll[lIIllllIIl[195]];
        bR = stringArray;
        hX = new WorldArea(lIIllllIIl[188], lIIllllIIl[196], lIIllllIIl[50], lIIllllIIl[40], lIIllllIIl[1]);
    }

    private static void af() {
        block14: {
            d var18;
            block13: {
                block12: {
                    block11: {
                        Object var19;
                        int[] nArray = new int[lIIllllIIl[0]];
                        nArray[C.lIIllllIIl[1]] = lIIllllIIl[6];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIllllIIl[6], lIIllllIIl[10], lIIllllIIl[175]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIllllIIl[0]];
                        nArray2[C.lIIllllIIl[1]] = lIIllllIIl[7];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var19 = new DHelper(lIIllllIIl[7], lIIllllIIl[0], lIIllllIIl[175]);
                            bv.add((DHelper) ar19);

                        }
                        int[] nArray3 = new int[lIIllllIIl[0]];
                        nArray3[C.lIIllllIIl[1]] = lIIllllIIl[9];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var19 = new DHelper(lIIllllIIl[9], lIIllllIIl[0], lIIllllIIl[175]);
                            bv.add((DHelper) ar19);

                        }
                        if (C.lIIIIllIIIIll(Bank.contains((Predicate)(var19 = item -> item.getName().toLowerCase().contains(lIIlllIlll[lIIllllIIl[181]]))) ? 1 : 0)) {
                            var18 = new DHelper(lIIllllIIl[176], lIIllllIIl[14], lIIllllIIl[177]);
                            bv.add(var18);

                        }
                        int[] nArray4 = new int[lIIllllIIl[0]];
                        nArray4[C.lIIllllIIl[1]] = lIIllllIIl[12];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var18 = new DHelper(lIIllllIIl[12], lIIllllIIl[4], i.bq);
                            bv.add(var18);

                        }
                        int[] nArray5 = new int[lIIllllIIl[0]];
                        nArray5[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIllllIIl[0]];
                        nArray6[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIllllIIl[0]];
                        nArray7[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIllllIIl[14])) break block12;
                    }
                    var18 = new DHelper(lIIllllIIl[13], lIIllllIIl[10], lIIllllIIl[178]);
                    bv.add(var18);

                }
                int[] nArray = new int[lIIllllIIl[0]];
                nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIllllIIl[0]];
                nArray8[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIllllIIl[0]];
                nArray9[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIIllllIIl[27])) break block14;
            }
            var18 = new DHelper(lIIllllIIl[5], lIIllllIIl[57], lIIllllIIl[179]);
            bv.add(var18);

        }
    }

    private static boolean lIIIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            C.bH();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIllllIIl[144];
    }

}

