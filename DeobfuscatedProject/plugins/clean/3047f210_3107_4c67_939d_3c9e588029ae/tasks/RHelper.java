/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.SHelper;
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
import net.runelite.api.Actor;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class RHelper
implements S {
    static  int ck;
    static  WorldArea dh;
    public static final  WorldPoint dd;
    public static final  int cZ;
    public static  List<d> bu;
    
    public static final  WorldPoint de;
    public static final  int cX;
    public static final  WorldPoint db;
    public static final  WorldPoint da;
    public static  boolean bs;
    public static final  int cW;
    static  String[] bQ;
    
    public static final  int cY;
    public static final  WorldPoint dc;
    static  boolean cl;
    public static final  WorldPoint df;
    static  int dg;

    @Override
    public String U() {
        return llllllIlIl[llllllIlll[178]];
    }

    private static boolean llIlIlllllIII(int n2) {
        return n2 < 0;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llIlIllllIlII(e.j(llllllIlll[4]), llllllIlll[145])) {
            bl = llllllIlll[0];

            }
        } else {
            bl = llllllIlll[1];
        }
        return bl;
    }

    private static boolean llIlIllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllllIllI(Object object) {
        return object != null;
    }

    private static boolean llIlIlllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void ae() {
        d var2;
        Object var3;
        block12: {
            block11: {
                int[] nArray = new int[llllllIlll[0]];
                nArray[r.llllllIlll[1]] = llllllIlll[20];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llllllIlll[20], llllllIlll[0], llllllIlll[169]);
                    bu.add(d2);

                }
                int[] nArray2 = new int[llllllIlll[0]];
                nArray2[r.llllllIlll[1]] = llllllIlll[18];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var3 = new DHelper(llllllIlll[18], llllllIlll[0], llllllIlll[170]);
                    bu.add((DHelper) ar3);

                }
                int[] nArray3 = new int[llllllIlll[0]];
                nArray3[r.llllllIlll[1]] = llllllIlll[14];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var3 = new DHelper(llllllIlll[14], llllllIlll[10], e.c(llllllIlll[171], llllllIlll[172]));
                    bu.add((DHelper) ar3);

                }
                int[] nArray4 = new int[llllllIlll[0]];
                nArray4[r.llllllIlll[1]] = llllllIlll[16];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var3 = new DHelper(llllllIlll[16], llllllIlll[11], llllllIlll[173]);
                    bu.add((DHelper) ar3);

                }
                int[] nArray5 = new int[llllllIlll[0]];
                nArray5[r.llllllIlll[1]] = llllllIlll[17];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var3 = new DHelper(llllllIlll[17], llllllIlll[5], i.bp);
                    bu.add((DHelper) ar3);

                }
                int[] nArray6 = new int[llllllIlll[0]];
                nArray6[r.llllllIlll[1]] = llllllIlll[9];
                if (!r.llIlIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block11;
                int[] nArray7 = new int[llllllIlll[0]];
                nArray7[r.llllllIlll[1]] = llllllIlll[9];
                if (!r.llIlIllllIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block12;
                int[] nArray8 = new int[llllllIlll[0]];
                nArray8[r.llllllIlll[1]] = llllllIlll[9];
                if (!r.llIlIllllIIlI(Bank.getFirst((int[])nArray8).getQuantity(), llllllIlll[10])) break block12;
            }
            var3 = new DHelper(llllllIlll[9], llllllIlll[61], llllllIlll[174]);
            bu.add((DHelper) ar3);

        }
        int[] nArray = new int[llllllIlll[0]];
        nArray[r.llllllIlll[1]] = llllllIlll[15];
        if (r.llIlIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var3 = new DHelper(llllllIlll[15], llllllIlll[0], llllllIlll[169]);
            bu.add((DHelper) ar3);

        }
        if (r.llIlIllllIIll(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llllllIlIl[llllllIlll[179]]))) ? 1 : 0)) {
            var2 = new DHelper(llllllIlll[175], llllllIlll[5], llllllIlll[176]);
            bu.add(var2);

        }
        int[] nArray9 = new int[llllllIlll[0]];
        nArray9[r.llllllIlll[1]] = llllllIlll[13];
        if (r.llIlIllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var2 = new DHelper(llllllIlll[13], llllllIlll[71], llllllIlll[177]);
            bu.add(var2);

        }
    }

    public static void aY() {
        if (r.llIlIllllIIIl(bs ? 1 : 0)) {
            b.a(bu);
            if (r.llIlIllllIIlI(bu.size(), llllllIlll[0])) {
                System.out.println(llllllIlIl[llllllIlll[1]]);
                bs = llllllIlll[1];
            }
        }
        if (r.llIlIllllIIll(bs ? 1 : 0)) {
            WorldPoint var4;
            TileItem var5;
            Object var6;
            BankLocation var7;
            if (!r.llIlIllllIlII(e.j(llllllIlll[2]), llllllIlll[3]) || r.llIlIllllIIlI(e.j(llllllIlll[4]), llllllIlll[5])) {
                s.bc();
            }
            if (r.llIlIllllIIll(r.ba() ? 1 : 0) && r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[5]) && r.llIlIllllIlII(e.j(llllllIlll[2]), llllllIlll[3])) {
                var7 = BankLocation.getNearest();
                if (r.llIlIllllIllI(var7) && r.llIlIllllIIll(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[0]];
                    a.a(var7);
                }
                if (r.llIlIllllIllI(var7) && r.llIlIllllIIIl(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.llIlIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIlll[6]);

                    }
                    if (r.llIlIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[7]];
                        if (r.llIlIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllIlll[8]);

                        }
                        if (r.llIlIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllllIlll[7]);

                        }
                        int[] nArray = new int[llllllIlll[0]];
                        nArray[r.llllllIlll[1]] = llllllIlll[9];
                        if (r.llIlIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llllllIlll[0]];
                            nArray2[r.llllllIlll[1]] = llllllIlll[9];
                            if (r.llIlIllllIIlI(Bank.getFirst((int[])nArray2).getQuantity(), llllllIlll[10])) {
                                r.ae();
                                System.out.println(llllllIlIl[llllllIlll[11]]);
                                bs = llllllIlll[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[llllllIlll[12]];
                        nArray3[r.llllllIlll[1]] = llllllIlll[13];
                        nArray3[r.llllllIlll[0]] = llllllIlll[14];
                        nArray3[r.llllllIlll[7]] = llllllIlll[15];
                        nArray3[r.llllllIlll[11]] = llllllIlll[16];
                        nArray3[r.llllllIlll[8]] = llllllIlll[9];
                        nArray3[r.llllllIlll[5]] = llllllIlll[17];
                        if (r.llIlIllllIIll(e.b(nArray3) ? 1 : 0)) {
                            r.ae();
                            System.out.println(llllllIlIl[llllllIlll[8]]);
                            bs = llllllIlll[0];
                            return;
                        }
                        int[] nArray4 = new int[llllllIlll[12]];
                        nArray4[r.llllllIlll[1]] = llllllIlll[13];
                        nArray4[r.llllllIlll[0]] = llllllIlll[14];
                        nArray4[r.llllllIlll[7]] = llllllIlll[15];
                        nArray4[r.llllllIlll[11]] = llllllIlll[16];
                        nArray4[r.llllllIlll[8]] = llllllIlll[9];
                        nArray4[r.llllllIlll[5]] = llllllIlll[17];
                        if (r.llIlIllllIIIl(e.b(nArray4) ? 1 : 0)) {
                            a.a(llllllIlll[18], llllllIlll[7]);
                            a.a(llllllIlll[19], llllllIlll[0]);
                            a.a(llllllIlll[20], llllllIlll[0]);
                            a.a(llllllIlll[13], llllllIlll[10]);
                            a.a(llllllIlll[14], llllllIlll[10]);
                            a.a(llllllIlll[15], llllllIlll[0]);
                            a.a(llllllIlll[16], llllllIlll[11]);
                            a.a(llllllIlll[17], llllllIlll[8]);
                            a.a(llllllIlll[9], llllllIlll[21]);
                        }
                    }
                }
            }
            if (r.llIlIllllIIIl(Inventory.contains((int[])f.aU) ? 1 : 0) && r.llIlIllllIIlI(Movement.getRunEnergy(), llllllIlll[22])) {
                Inventory.getFirst((int[])f.aU).interact(llllllIlIl[llllllIlll[5]]);
                Time.sleepTicks((int)llllllIlll[0]);

            }
            int[] nArray = new int[llllllIlll[0]];
            nArray[r.llllllIlll[1]] = llllllIlll[9];
            if (r.llIlIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && r.llIlIlllllIII(r.llIlIllllIIII(e.u(), 60.0))) {
                int[] nArray5 = new int[llllllIlll[0]];
                nArray5[r.llllllIlll[1]] = llllllIlll[9];
                Inventory.getFirst((int[])nArray5).interact(llllllIlIl[llllllIlll[12]]);
                Time.sleepTicks((int)llllllIlll[0]);

            }
            var7 = new WorldPoint(llllllIlll[23], llllllIlll[24], llllllIlll[1]);
            WorldPoint var8 = new WorldPoint(llllllIlll[25], llllllIlll[24], llllllIlll[1]);
            WorldPoint var9 = new WorldPoint(llllllIlll[26], llllllIlll[24], llllllIlll[1]);
            WorldPoint var10 = new WorldPoint(llllllIlll[27], llllllIlll[24], llllllIlll[1]);
            if (!r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0) || !r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0) || !r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)var9) ? 1 : 0) || r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[21]];
                TileObjects.getNearest((String[])stringArray).interact(llllllIlIl[llllllIlll[28]]);
                Time.sleepTicks((int)llllllIlll[29]);

            }
            if (r.llIlIllllIlII(e.j(llllllIlll[4]), llllllIlll[5]) && r.llIlIllllIIlI(e.j(llllllIlll[4]), llllllIlll[30]) && r.llIlIllllIIIl(r.ba() ? 1 : 0)) {
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(da), llllllIlll[31])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[32]];
                    int[] nArray6 = new int[llllllIlll[0]];
                    nArray6[r.llllllIlll[1]] = llllllIlll[14];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0) && r.llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] nArray7 = new int[llllllIlll[0]];
                        nArray7[r.llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst((int[])nArray7).interact(llllllIlIl[llllllIlll[10]]);
                        Time.sleepTicks((int)llllllIlll[7]);

                    }
                }
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(da), llllllIlll[31])) {
                    if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[34]];
                        if (r.llIlIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0) || r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[37], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                            e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                            Time.sleepTicks((int)llllllIlll[8]);

                        }
                        if (r.llIlIllllIllI(var6 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                            Mouse.click((int)var6.getClickPoint().getX(), (int)var6.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);

                        }
                        if (r.llIlIllllIllI(var5 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                            Mouse.click((int)var5.getClickPoint().getX(), (int)var5.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);

                        }
                        var4 = new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1]);
                        if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                            e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                            Time.sleepTicks((int)e.c(llllllIlll[5], llllllIlll[28]));

                        }
                        if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0) && r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[37], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)de);

                            Time.sleepTicks((int)llllllIlll[0]);

                        }
                    }
                    if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                        e.l(llllllIlll[19]);
                        String[] stringArray = new String[llllllIlll[0]];
                        stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[46]];
                        if (r.llIlIllllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[47]];
                            String[] stringArray2 = new String[llllllIlll[0]];
                            stringArray2[r.llllllIlll[1]] = llllllIlIl[llllllIlll[48]];
                            var6 = TileItems.getNearest((String[])stringArray2);
                            if (r.llIlIllllIllI(var6)) {
                                String[] stringArray3 = new String[llllllIlll[0]];
                                stringArray3[r.llllllIlll[1]] = llllllIlIl[llllllIlll[29]];
                                if (r.llIlIlllllIll(TileItems.getNearest((String[])stringArray3))) {
                                    var6.interact(llllllIlIl[llllllIlll[49]]);
                                    Time.sleepTicks((int)llllllIlll[7]);

                                }
                            }
                            String[] stringArray4 = new String[llllllIlll[0]];
                            stringArray4[r.llllllIlll[1]] = llllllIlIl[llllllIlll[41]];
                            var5 = TileItems.getNearest((String[])stringArray4);
                            if (r.llIlIllllIllI(var5)) {
                                var5.interact(llllllIlIl[llllllIlll[50]]);
                                Time.sleepTicks((int)llllllIlll[0]);

                            }
                        }
                        String[] stringArray5 = new String[llllllIlll[0]];
                        stringArray5[r.llllllIlll[1]] = llllllIlIl[llllllIlll[51]];
                        if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            String[] stringArray6 = new String[llllllIlll[0]];
                            stringArray6[r.llllllIlll[1]] = llllllIlIl[llllllIlll[30]];
                            if (r.llIlIllllIIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llllllIlll[0]];
                                stringArray7[r.llllllIlll[1]] = llllllIlIl[llllllIlll[52]];
                                TileObjects.getNearest((String[])stringArray7).interact(llllllIlIl[llllllIlll[53]]);
                                Time.sleepTicks((int)llllllIlll[7]);

                            }
                        }
                        String[] stringArray8 = new String[llllllIlll[0]];
                        stringArray8[r.llllllIlll[1]] = llllllIlIl[llllllIlll[54]];
                        if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray8))) {
                            String[] stringArray9 = new String[llllllIlll[0]];
                            stringArray9[r.llllllIlll[1]] = llllllIlIl[llllllIlll[55]];
                            TileObjects.getNearest((String[])stringArray9).interact(llllllIlIl[llllllIlll[56]]);
                            Time.sleepTicks((int)llllllIlll[8]);

                        }
                        String[] stringArray10 = new String[llllllIlll[0]];
                        stringArray10[r.llllllIlll[1]] = llllllIlIl[llllllIlll[57]];
                        if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray10))) {
                            g.a(llllllIlIl[llllllIlll[58]], bQ);
                        }
                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[30])) {
                ck = llllllIlll[1];
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[59]];
                if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray11 = new String[llllllIlll[0]];
                    stringArray11[r.llllllIlll[1]] = llllllIlIl[llllllIlll[60]];
                    if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                        int[] nArray8 = new int[llllllIlll[0]];
                        nArray8[r.llllllIlll[1]] = llllllIlll[19];
                        if (r.llIlIllllIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llllllIlll[0]];
                            nArray9[r.llllllIlll[1]] = llllllIlll[19];
                            if (r.llIlIllllIIll(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllllIlll[0]];
                                nArray10[r.llllllIlll[1]] = llllllIlll[19];
                                Inventory.getFirst((int[])nArray10).interact(llllllIlIl[llllllIlll[61]]);
                            }
                        }
                        String[] stringArray12 = new String[llllllIlll[0]];
                        stringArray12[r.llllllIlll[1]] = llllllIlIl[llllllIlll[62]];
                        if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray12))) {
                            String[] stringArray13 = new String[llllllIlll[0]];
                            stringArray13[r.llllllIlll[1]] = llllllIlIl[llllllIlll[63]];
                            TileObjects.getNearest((String[])stringArray13).interact(llllllIlIl[llllllIlll[64]]);
                            Time.sleepTicks((int)llllllIlll[8]);

                        }
                        String[] stringArray14 = new String[llllllIlll[0]];
                        stringArray14[r.llllllIlll[1]] = llllllIlIl[llllllIlll[65]];
                        if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray14))) {
                            if (r.llIlIllllIIlI(dg, llllllIlll[0])) {
                                String[] stringArray15 = new String[llllllIlll[0]];
                                stringArray15[r.llllllIlll[1]] = llllllIlIl[llllllIlll[66]];
                                String[] stringArray16 = new String[llllllIlll[0]];
                                stringArray16[r.llllllIlll[1]] = llllllIlIl[llllllIlll[67]];
                                Inventory.getFirst((String[])stringArray15).useOn((Actor)NPCs.getNearest((String[])stringArray16));
                                Time.sleepTicks((int)llllllIlll[11]);

                                dg += llllllIlll[0];
                            }
                            if (r.llIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray17 = new String[llllllIlll[0]];
                                stringArray17[r.llllllIlll[1]] = llllllIlIl[llllllIlll[68]];
                                String[] stringArray18 = new String[llllllIlll[0]];
                                stringArray18[r.llllllIlll[1]] = llllllIlIl[llllllIlll[69]];
                                Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                                Time.sleepTicks((int)llllllIlll[11]);

                            }
                            g.a(bQ);
                        }
                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[56])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[70]];
                if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray19 = new String[llllllIlll[0]];
                    stringArray19[r.llllllIlll[1]] = llllllIlIl[llllllIlll[71]];
                    TileObjects.getNearest((String[])stringArray19).interact(llllllIlIl[llllllIlll[72]]);
                    Time.sleepTicks((int)llllllIlll[8]);

                }
                if (r.llIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray20 = new String[llllllIlll[0]];
                    stringArray20[r.llllllIlll[1]] = llllllIlIl[llllllIlll[73]];
                    String[] stringArray21 = new String[llllllIlll[0]];
                    stringArray21[r.llllllIlll[1]] = llllllIlIl[llllllIlll[74]];
                    Inventory.getFirst((String[])stringArray20).useOn((Actor)NPCs.getNearest((String[])stringArray21));
                }
                g.a(bQ);
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[61])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[75]];
                if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray22 = new String[llllllIlll[0]];
                    stringArray22[r.llllllIlll[1]] = llllllIlIl[llllllIlll[76]];
                    TileObjects.getNearest((String[])stringArray22).interact(llllllIlIl[llllllIlll[77]]);
                    Time.sleepTicks((int)llllllIlll[8]);

                }
                String[] stringArray23 = new String[llllllIlll[0]];
                stringArray23[r.llllllIlll[1]] = llllllIlIl[llllllIlll[78]];
                if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray23))) {
                    g.a(llllllIlIl[llllllIlll[79]], bQ);
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[66])) {
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[80]];
                    int[] nArray11 = new int[llllllIlll[0]];
                    nArray11[r.llllllIlll[1]] = llllllIlll[14];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray11) ? 1 : 0) && r.llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] nArray12 = new int[llllllIlll[0]];
                        nArray12[r.llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst((int[])nArray12).interact(llllllIlIl[llllllIlll[22]]);
                        Time.sleepTicks((int)llllllIlll[7]);

                    }
                }
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[12]) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[81]];
                    Movement.walkTo((WorldPoint)df);

                    Time.sleepTicks((int)llllllIlll[0]);

                }
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[82]];
                if (r.llIlIllllIllI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[llllllIlll[0]];
                    stringArray24[r.llllllIlll[1]] = llllllIlIl[llllllIlll[83]];
                    TileObjects.getNearest((String[])stringArray24).interact(llllllIlIl[llllllIlll[84]]);
                    Time.sleepTicks((int)llllllIlll[11]);

                }
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[29])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[85]];
                    g.a(llllllIlIl[llllllIlll[86]], bQ);
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[71])) {
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[87]];
                    int[] nArray13 = new int[llllllIlll[0]];
                    nArray13[r.llllllIlll[1]] = llllllIlll[14];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray13) ? 1 : 0) && r.llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] nArray14 = new int[llllllIlll[0]];
                        nArray14[r.llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst((int[])nArray14).interact(llllllIlIl[llllllIlll[88]]);
                        Time.sleepTicks((int)llllllIlll[7]);

                    }
                }
                if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[89]];
                    Movement.walkTo((WorldPoint)dc);

                    Time.sleepTicks((int)llllllIlll[0]);

                    var6 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]);
                    if (r.llIlIllllIllI(var6)) {
                        Mouse.click((int)var6.getClickPoint().getX(), (int)var6.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);

                    }
                    if (r.llIlIllllIllI(var5 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                        Mouse.click((int)var5.getClickPoint().getX(), (int)var5.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);

                    }
                }
                if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0)) {
                    int[] nArray15 = new int[llllllIlll[0]];
                    nArray15[r.llllllIlll[1]] = llllllIlll[90];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[llllllIlll[0]];
                        nArray16[r.llllllIlll[1]] = llllllIlll[90];
                        Inventory.getFirst((int[])nArray16).interact(llllllIlIl[llllllIlll[3]]);
                        Time.sleepTicks((int)llllllIlll[7]);

                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[76])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[91]];
                var6 = TileObjects.getNearest((String[])stringArray);
                if (r.llIlIllllIllI(var6)) {
                    var6.interact(llllllIlIl[llllllIlll[92]]);
                    Time.sleepTicks((int)llllllIlll[7]);

                }
                String[] stringArray25 = new String[llllllIlll[0]];
                stringArray25[r.llllllIlll[1]] = llllllIlIl[llllllIlll[93]];
                var5 = TileItems.getNearest((String[])stringArray25);
                if (r.llIlIllllIllI(var5)) {
                    var5.interact(llllllIlIl[llllllIlll[94]]);
                    Time.sleepTicks((int)llllllIlll[7]);

                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[22])) {
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[95]];
                    Movement.walkTo((WorldPoint)de);

                    Time.sleepTicks((int)llllllIlll[0]);

                    var6 = new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1]);
                    if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(var6) ? 1 : 0)) {
                        e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                        Time.sleepTicks((int)e.c(llllllIlll[5], llllllIlll[28]));

                    }
                    if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                        e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                        Time.sleepTicks((int)llllllIlll[8]);

                    }
                    if (r.llIlIllllIllI(var5 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                        Mouse.click((int)var5.getClickPoint().getX(), (int)var5.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);

                    }
                    if (r.llIlIllllIllI(var4 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                        Mouse.click((int)var4.getClickPoint().getX(), (int)var4.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);

                    }
                }
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[96]];
                    if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray26 = new String[llllllIlll[0]];
                        stringArray26[r.llllllIlll[1]] = llllllIlIl[llllllIlll[97]];
                        TileObjects.getNearest((String[])stringArray26).interact(llllllIlIl[llllllIlll[98]]);
                        Time.sleepTicks((int)llllllIlll[8]);

                    }
                    String[] stringArray27 = new String[llllllIlll[0]];
                    stringArray27[r.llllllIlll[1]] = llllllIlIl[llllllIlll[99]];
                    if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray27))) {
                        g.a(llllllIlIl[llllllIlll[100]], bQ);
                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[85])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[101]];
                if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray28 = new String[llllllIlll[0]];
                    stringArray28[r.llllllIlll[1]] = llllllIlIl[llllllIlll[102]];
                    if (r.llIlIlllllIIl(Inventory.getAll((String[])stringArray28).size(), llllllIlll[11])) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[103]];
                        String[] stringArray29 = new String[llllllIlll[0]];
                        stringArray29[r.llllllIlll[1]] = llllllIlIl[llllllIlll[104]];
                        int[] nArray17 = new int[llllllIlll[0]];
                        nArray17[r.llllllIlll[1]] = llllllIlll[105];
                        Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((int[])nArray17));
                        Time.sleepTicks((int)llllllIlll[11]);

                    }
                }
                String[] stringArray30 = new String[llllllIlll[0]];
                stringArray30[r.llllllIlll[1]] = llllllIlIl[llllllIlll[106]];
                if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray30) ? 1 : 0)) {
                    String[] stringArray31 = new String[llllllIlll[0]];
                    stringArray31[r.llllllIlll[1]] = llllllIlIl[llllllIlll[107]];
                    int[] nArray18 = new int[llllllIlll[0]];
                    nArray18[r.llllllIlll[1]] = llllllIlll[108];
                    Inventory.getFirst((String[])stringArray31).useOn(TileObjects.getNearest((int[])nArray18));
                    Time.sleepTicks((int)llllllIlll[11]);

                }
                String[] stringArray32 = new String[llllllIlll[0]];
                stringArray32[r.llllllIlll[1]] = llllllIlIl[llllllIlll[109]];
                if (r.llIlIllllIIll(Inventory.contains((String[])stringArray32) ? 1 : 0)) {
                    String[] stringArray33 = new String[llllllIlll[0]];
                    stringArray33[r.llllllIlll[1]] = llllllIlIl[llllllIlll[110]];
                    if (r.llIlIlllllIlI(Inventory.getAll((String[])stringArray33).size(), llllllIlll[11])) {
                        int[] nArray19 = new int[llllllIlll[0]];
                        nArray19[r.llllllIlll[1]] = llllllIlll[111];
                        var6 = TileObjects.getNearest((int[])nArray19).getWorldLocation();
                        if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals(var6) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)var6);

                            Time.sleepTicks((int)llllllIlll[0]);

                        }
                        if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(var6) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[112]];
                            g.a(llllllIlIl[llllllIlll[113]], bQ);
                        }
                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[3]) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[10])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[114]];
                TileObjects.getNearest((String[])stringArray).interact(llllllIlIl[llllllIlll[115]]);
                Time.sleepTicks((int)llllllIlll[8]);

            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[95])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[116]];
                if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray20 = new int[llllllIlll[0]];
                    nArray20[r.llllllIlll[1]] = llllllIlll[117];
                    TileObjects.getNearest((int[])nArray20).interact(llllllIlIl[llllllIlll[118]]);
                    Time.sleepTicks((int)llllllIlll[8]);

                }
                String[] stringArray34 = new String[llllllIlll[0]];
                stringArray34[r.llllllIlll[1]] = llllllIlIl[llllllIlll[119]];
                if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray34))) {
                    g.a(llllllIlIl[llllllIlll[120]], bQ);
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[100])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[121]];
                if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray35 = new String[llllllIlll[0]];
                    stringArray35[r.llllllIlll[1]] = llllllIlIl[llllllIlll[122]];
                    if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray35))) {
                        int[] nArray21 = new int[llllllIlll[0]];
                        nArray21[r.llllllIlll[1]] = llllllIlll[117];
                        TileObjects.getNearest((int[])nArray21).interact(llllllIlIl[llllllIlll[123]]);
                        Time.sleepTicks((int)llllllIlll[8]);

                    }
                }
                String[] stringArray36 = new String[llllllIlll[0]];
                stringArray36[r.llllllIlll[1]] = llllllIlIl[llllllIlll[124]];
                if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray36))) {
                    g.a(llllllIlIl[llllllIlll[125]], bQ);
                }
                String[] stringArray37 = new String[llllllIlll[0]];
                stringArray37[r.llllllIlll[1]] = llllllIlIl[llllllIlll[126]];
                if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray37))) {
                    g.a(llllllIlIl[llllllIlll[127]], bQ);
                }
            }
            if (r.llIlIllllIlII(e.j(llllllIlll[4]), llllllIlll[106]) && r.llIlIlllllIlI(e.j(llllllIlll[4]), llllllIlll[119])) {
                if (r.llIlIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                    g.a(bQ);
                }
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[128]];
                if (r.llIlIllllIllI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray38 = new String[llllllIlll[0]];
                    stringArray38[r.llllllIlll[1]] = llllllIlIl[llllllIlll[129]];
                    if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[130]];
                        int[] nArray22 = new int[llllllIlll[0]];
                        nArray22[r.llllllIlll[1]] = llllllIlll[14];
                        if (r.llIlIllllIIIl(Inventory.contains((int[])nArray22) ? 1 : 0) && r.llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                            int[] nArray23 = new int[llllllIlll[0]];
                            nArray23[r.llllllIlll[1]] = llllllIlll[14];
                            Inventory.getFirst((int[])nArray23).interact(llllllIlIl[llllllIlll[131]]);
                            Time.sleepTicks((int)llllllIlll[7]);

                        }
                    }
                }
                if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    String[] stringArray39 = new String[llllllIlll[0]];
                    stringArray39[r.llllllIlll[1]] = llllllIlIl[llllllIlll[132]];
                    if (r.llIlIlllllIll(TileObjects.getNearest((String[])stringArray39))) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[133]];
                        Movement.walkTo((WorldPoint)dc);

                        Time.sleepTicks((int)llllllIlll[0]);

                        var6 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]);
                        if (r.llIlIllllIllI(var6)) {
                            Mouse.click((int)var6.getClickPoint().getX(), (int)var6.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);

                        }
                        if (r.llIlIllllIllI(var5 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                            Mouse.click((int)var5.getClickPoint().getX(), (int)var5.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);

                        }
                    }
                }
                if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0)) {
                    int[] nArray24 = new int[llllllIlll[0]];
                    nArray24[r.llllllIlll[1]] = llllllIlll[134];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                        int[] nArray25 = new int[llllllIlll[0]];
                        nArray25[r.llllllIlll[1]] = llllllIlll[134];
                        Inventory.getFirst((int[])nArray25).interact(llllllIlIl[llllllIlll[135]]);
                        Time.sleepTicks((int)llllllIlll[7]);

                    }
                }
                String[] stringArray40 = new String[llllllIlll[0]];
                stringArray40[r.llllllIlll[1]] = llllllIlIl[llllllIlll[136]];
                var6 = TileObjects.getNearest((String[])stringArray40);
                if (r.llIlIllllIllI(var6)) {
                    var6.interact(llllllIlIl[llllllIlll[137]]);
                    Time.sleepTicks((int)llllllIlll[7]);

                }
                String[] stringArray41 = new String[llllllIlll[0]];
                stringArray41[r.llllllIlll[1]] = llllllIlIl[llllllIlll[138]];
                var5 = TileItems.getNearest((String[])stringArray41);
                if (r.llIlIllllIllI(var5)) {
                    var5.interact(llllllIlIl[llllllIlll[139]]);
                    Time.sleepTicks((int)llllllIlll[7]);

                }
                String[] stringArray42 = new String[llllllIlll[0]];
                stringArray42[r.llllllIlll[1]] = llllllIlIl[llllllIlll[140]];
                if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray42) ? 1 : 0) && r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0)) {
                    String[] stringArray43 = new String[llllllIlll[0]];
                    stringArray43[r.llllllIlll[1]] = llllllIlIl[llllllIlll[141]];
                    if (r.llIlIllllIIIl(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[llllllIlll[0]];
                        stringArray44[r.llllllIlll[1]] = llllllIlIl[llllllIlll[142]];
                        Inventory.getFirst((String[])stringArray44).interact(llllllIlIl[llllllIlll[143]]);
                        Time.sleepTicks((int)llllllIlll[0]);

                    }
                }
            }
            if (r.llIlIllllIlII(e.j(llllllIlll[4]), llllllIlll[124]) && r.llIlIllllIIlI(e.j(llllllIlll[4]), llllllIlll[140])) {
                int[] nArray26 = new int[llllllIlll[0]];
                nArray26[r.llllllIlll[1]] = llllllIlll[20];
                if (r.llIlIllllIIll(Equipment.contains((int[])nArray26) ? 1 : 0)) {
                    int[] nArray27 = new int[llllllIlll[0]];
                    nArray27[r.llllllIlll[1]] = llllllIlll[20];
                    if (r.llIlIllllIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                        int[] nArray28 = new int[llllllIlll[0]];
                        nArray28[r.llllllIlll[1]] = llllllIlll[20];
                        Inventory.getFirst((int[])nArray28).interact(llllllIlIl[llllllIlll[144]]);
                    }
                }
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[145]];
                var6 = NPCs.getAll((String[])stringArray);
                var5 = var6.stream().filter(nPC -> {
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[181]];
                    return nPC.hasAction(stringArray);
                }).findFirst().orElse(null);
                if (r.llIlIllllIIlI(Prayers.getPoints(), llllllIlll[30])) {
                    Inventory.getFirst(item -> item.getName().contains(llllllIlIl[llllllIlll[180]])).interact(llllllIlIl[llllllIlll[146]]);
                }
                if (r.llIlIlllllIll(var5)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[147]];
                    if (r.llIlIllllIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] stringArray45 = new String[llllllIlll[0]];
                    stringArray45[r.llllllIlll[1]] = llllllIlIl[llllllIlll[148]];
                    String[] stringArray46 = new String[llllllIlll[0]];
                    stringArray46[r.llllllIlll[1]] = llllllIlIl[llllllIlll[149]];
                    Inventory.getFirst((String[])stringArray45).useOn((Actor)NPCs.getNearest((String[])stringArray46));
                    Time.sleepTicks((int)llllllIlll[32]);

                }
                if (r.llIlIllllIllI(var5)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[150]];
                    if (r.llIlIllllIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (r.llIlIllllIllI(var5) && r.llIlIlllllIll(Players.getLocal().getInteracting())) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[151]];
                    var5.interact(llllllIlIl[llllllIlll[152]]);
                    Time.sleepTicks((int)llllllIlll[7]);

                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[140])) {
                if (r.llIlIllllIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8]) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[29])) {
                    r.aZ();
                }
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[153]];
                    TileObjects.getNearest((String[])stringArray).interact(llllllIlIl[llllllIlll[154]]);
                    Time.sleepTicks((int)llllllIlll[8]);

                }
                if (r.llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[29])) {
                    if (r.llIlIllllIIlI(ck, llllllIlll[0])) {
                        ac.kC += llllllIlll[0];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllllIlll[0];
                        ac.kC = llllllIlll[1];
                        cl = llllllIlll[1];
                    }
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[155]];
                    if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray47 = new String[llllllIlll[0]];
                        stringArray47[r.llllllIlll[1]] = llllllIlIl[llllllIlll[156]];
                        if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray47))) {
                            int[] nArray29 = new int[llllllIlll[0]];
                            nArray29[r.llllllIlll[1]] = llllllIlll[117];
                            TileObjects.getNearest((int[])nArray29).interact(llllllIlIl[llllllIlll[157]]);
                            Time.sleepTicks((int)llllllIlll[8]);

                        }
                    }
                    String[] stringArray48 = new String[llllllIlll[0]];
                    stringArray48[r.llllllIlll[1]] = llllllIlIl[llllllIlll[158]];
                    if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray48))) {
                        g.a(llllllIlIl[llllllIlll[159]], bQ);
                    }
                    String[] stringArray49 = new String[llllllIlll[0]];
                    stringArray49[r.llllllIlll[1]] = llllllIlIl[llllllIlll[160]];
                    if (r.llIlIllllIllI(NPCs.getNearest((String[])stringArray49))) {
                        g.a(llllllIlIl[llllllIlll[161]], bQ);
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        String[] stringArray = new String[llllllIlll[0]];
        stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[167]];
        if (r.llIlIllllIlll(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llllllIlll[0]];
            stringArray2[r.llllllIlll[1]] = llllllIlIl[llllllIlll[168]];
            if (r.llIlIllllIlll(Inventory.getCount((String[])stringArray2))) {
                n2 = llllllIlll[0];

                if (3 > 0) return n2 != 0;
                return ((217 + 183 - 162 + 12 ^ 135 + 58 - 106 + 99) & (0x2E ^ 0x60 ^ (0x33 ^ 0x3D) ^ -1)) != 0;
            }
        }
        n2 = llllllIlll[1];
        return n2 != 0;
    }

    private static boolean llIlIllllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlllllIll(Object object) {
        return object == null;
    }

    private static boolean llIlIllllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean ba() {
        int n2;
        block2: {
            block4: {
                block3: {
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[163]];
                    if (!r.llIlIllllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) || !r.llIlIllllIIIl(Inventory.contains((int[])f.aU) ? 1 : 0)) break block2;
                    int[] nArray = new int[llllllIlll[0]];
                    nArray[r.llllllIlll[1]] = llllllIlll[9];
                    if (!r.llIlIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[llllllIlll[0]];
                    stringArray2[r.llllllIlll[1]] = llllllIlIl[llllllIlll[164]];
                    if (!r.llIlIllllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block3;
                    String[] stringArray3 = new String[llllllIlll[0]];
                    stringArray3[r.llllllIlll[1]] = llllllIlIl[llllllIlll[165]];
                    if (!r.llIlIllllIIIl(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block2;
                }
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[166]];
                if (!r.llIlIllllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
                int[] nArray = new int[llllllIlll[0]];
                nArray[r.llllllIlll[1]] = llllllIlll[19];
                if (!r.llIlIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[llllllIlll[0]];
                nArray2[r.llllllIlll[1]] = llllllIlll[19];
                if (!r.llIlIllllIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = llllllIlll[0];

            if (3 > 0) return n2 != 0;
            return false;
        }
        n2 = llllllIlll[1];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return llllllIlll[1];
    }

    private static boolean llIlIllllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlIlllIlIIl() {
        llllllIlIl = new String[llllllIlll[211]];
        r.llllllIlIl[r.llllllIlll[1]] = "Finished buying items, switching back to quest";
        r.llllllIlIl[r.llllllIlll[0]] = "Nav to bank";
        r.llllllIlIl[r.llllllIlll[7]] = "Handling banking";
        r.llllllIlIl[r.llllllIlll[11]] = "We are missing quest supplies, switching to BUYING";
        r.llllllIlIl[r.llllllIlll[8]] = "We are missing quest supplies, switching to BUYING";
        r.llllllIlIl[r.llllllIlll[5]] = "Drink";
        r.llllllIlIl[r.llllllIlll[12]] = "Eat";
        r.llllllIlIl[r.llllllIlll[21]] = "Gate";
        r.llllllIlIl[r.llllllIlll[28]] = "Open";
        r.llllllIlIl[r.llllllIlll[32]] = "Using salve tele";
        r.llllllIlIl[r.llllllIlll[10]] = "Break";
        r.llllllIlIl[r.llllllIlll[34]] = "Nav to grotto";
        r.llllllIlIl[r.llllllIlll[46]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[47]] = "Getting mirror";
        r.llllllIlIl[r.llllllIlll[48]] = "Washing bowl";
        r.llllllIlIl[r.llllllIlll[29]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[49]] = "Take";
        r.llllllIlIl[r.llllllIlll[41]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[50]] = "Take";
        r.llllllIlIl[r.llllllIlll[51]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[30]] = "Journal";
        r.llllllIlIl[r.llllllIlll[52]] = "Grotto tree";
        r.llllllIlIl[r.llllllIlll[53]] = "Search";
        r.llllllIlIl[r.llllllIlll[54]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[55]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[56]] = "Enter";
        r.llllllIlIl[r.llllllIlll[57]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[58]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[59]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[60]] = "Journal";
        r.llllllIlIl[r.llllllIlll[61]] = "Wear";
        r.llllllIlIl[r.llllllIlll[62]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[63]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[64]] = "Enter";
        r.llllllIlIl[r.llllllIlll[65]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[66]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[67]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[68]] = "Mirror";
        r.llllllIlIl[r.llllllIlll[69]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[70]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[71]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[72]] = "Enter";
        r.llllllIlIl[r.llllllIlll[73]] = "Journal";
        r.llllllIlIl[r.llllllIlll[74]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[75]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[76]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[77]] = "Enter";
        r.llllllIlIl[r.llllllIlll[78]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[79]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[80]] = "Breaking tab";
        r.llllllIlIl[r.llllllIlll[22]] = "Break";
        r.llllllIlIl[r.llllllIlll[81]] = "Nav to priest";
        r.llllllIlIl[r.llllllIlll[82]] = "Trapdoor";
        r.llllllIlIl[r.llllllIlll[83]] = "Trapdoor";
        r.llllllIlIl[r.llllllIlll[84]] = "Open";
        r.llllllIlIl[r.llllllIlll[85]] = "Interact priest";
        r.llllllIlIl[r.llllllIlll[86]] = "Drezel";
        r.llllllIlIl[r.llllllIlll[87]] = "Breaking tab";
        r.llllllIlIl[r.llllllIlll[88]] = "Break";
        r.llllllIlIl[r.llllllIlll[89]] = "Nav to log";
        r.llllllIlIl[r.llllllIlll[3]] = "Cast";
        r.llllllIlIl[r.llllllIlll[91]] = "Fungi on log";
        r.llllllIlIl[r.llllllIlll[92]] = "Pick";
        r.llllllIlIl[r.llllllIlll[93]] = "Fungi on log";
        r.llllllIlIl[r.llllllIlll[94]] = "Pick";
        r.llllllIlIl[r.llllllIlll[95]] = "Nav to grotto";
        r.llllllIlIl[r.llllllIlll[96]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[97]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[98]] = "Enter";
        r.llllllIlIl[r.llllllIlll[99]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[100]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[101]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[102]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[103]] = "Solving puzzle";
        r.llllllIlIl[r.llllllIlll[104]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[106]] = "A used spell";
        r.llllllIlIl[r.llllllIlll[107]] = "A used spell";
        r.llllllIlIl[r.llllllIlll[109]] = "A used spell";
        r.llllllIlIl[r.llllllIlll[110]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[112]] = "Talking to filliman";
        r.llllllIlIl[r.llllllIlll[113]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[114]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[115]] = "Enter";
        r.llllllIlIl[r.llllllIlll[116]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[118]] = "Search";
        r.llllllIlIl[r.llllllIlll[119]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[120]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[121]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[122]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[123]] = "Search";
        r.llllllIlIl[r.llllllIlll[124]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[125]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[126]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[127]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[128]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[129]] = "Druid pouch";
        r.llllllIlIl[r.llllllIlll[130]] = "Breaking tab";
        r.llllllIlIl[r.llllllIlll[131]] = "Break";
        r.llllllIlIl[r.llllllIlll[132]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[133]] = "Nav to log";
        r.llllllIlIl[r.llllllIlll[135]] = "Cast Bloom";
        r.llllllIlIl[r.llllllIlll[136]] = "Fungi on log";
        r.llllllIlIl[r.llllllIlll[137]] = "Pick";
        r.llllllIlIl[r.llllllIlll[138]] = "Fungi on log";
        r.llllllIlIl[r.llllllIlll[139]] = "Pick";
        r.llllllIlIl[r.llllllIlll[140]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[141]] = "Druid pouch";
        r.llllllIlIl[r.llllllIlll[142]] = "Druid pouch";
        r.llllllIlIl[r.llllllIlll[143]] = "Fill";
        r.llllllIlIl[r.llllllIlll[144]] = "Wield";
        r.llllllIlIl[r.llllllIlll[145]] = "Ghast";
        r.llllllIlIl[r.llllllIlll[146]] = "Drink";
        r.llllllIlIl[r.llllllIlll[147]] = "Using druid pouch on ghast";
        r.llllllIlIl[r.llllllIlll[148]] = "Druid pouch";
        r.llllllIlIl[r.llllllIlll[149]] = "Ghast";
        r.llllllIlIl[r.llllllIlll[150]] = "Killing ghasts";
        r.llllllIlIl[r.llllllIlll[151]] = "Killing ghasts, no interacting";
        r.llllllIlIl[r.llllllIlll[152]] = "Attack";
        r.llllllIlIl[r.llllllIlll[153]] = "Grotto";
        r.llllllIlIl[r.llllllIlll[154]] = "Enter";
        r.llllllIlIl[r.llllllIlll[155]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[156]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[157]] = "Search";
        r.llllllIlIl[r.llllllIlll[158]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[159]] = "Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[160]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[161]] = "Nature Spirit";
        r.llllllIlIl[r.llllllIlll[162]] = "Nav to grotto";
        r.llllllIlIl[r.llllllIlll[163]] = "Salve graveyard teleport";
        r.llllllIlIl[r.llllllIlll[164]] = "Silver sickle";
        r.llllllIlIl[r.llllllIlll[165]] = "Silver sickle";
        r.llllllIlIl[r.llllllIlll[166]] = "Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[167]] = r.llIlIlllIlIII("", "gWcOi");
        r.llllllIlIl[r.llllllIlll[168]] = r.llIlIlllIIlll("jFH11Sc+T6A=", "lQpdk");
        r.llllllIlIl[r.llllllIlll[178]] = "Nature spirit";
        r.llllllIlIl[r.llllllIlll[179]] = "ring of wealth (";
        r.llllllIlIl[r.llllllIlll[180]] = "Prayer";
        r.llllllIlIl[r.llllllIlll[181]] = "Attack";
        r.llllllIlIl[r.llllllIlll[192]] = "I'm looking for a quest!";
        r.llllllIlIl[r.llllllIlll[193]] = "Yes.";
        r.llllllIlIl[r.llllllIlll[31]] = "Ok, let me help then.";
        r.llllllIlIl[r.llllllIlll[194]] = "Yep, now tell me what the problem is.";
        r.llllllIlIl[r.llllllIlll[195]] = "Sure.";
        r.llllllIlIl[r.llllllIlll[196]] = "You're right, we don't.";
        r.llllllIlIl[r.llllllIlll[197]] = "Is there anything else interesting to do around here?";
        r.llllllIlIl[r.llllllIlll[198]] = "Well, what is it, I may be able to help?";
        r.llllllIlIl[r.llllllIlll[199]] = "Yes, I'll go and look for him.";
        r.llllllIlIl[r.llllllIlll[200]] = "Yes, I'm sure.";
        r.llllllIlIl[r.llllllIlll[201]] = "I'll get going.";
        r.llllllIlIl[r.llllllIlll[202]] = "I think I've solved the puzzle!";
        r.llllllIlIl[r.llllllIlll[203]] = "How can I help?";
        r.llllllIlIl[r.llllllIlll[204]] = "Roald sent me to check on Drezel.";
        r.llllllIlIl[r.llllllIlll[205]] = "Why is the river such a good defence?";
        r.llllllIlIl[r.llllllIlll[206]] = "You're right, we don't.";
        r.llllllIlIl[r.llllllIlll[207]] = "Yes, of course.";
        r.llllllIlIl[r.llllllIlll[208]] = "Do you know of anything I can do in Morytania?";
        r.llllllIlIl[r.llllllIlll[209]] = "How long have you been a ghost?";
        r.llllllIlIl[r.llllllIlll[210]] = "What's this pouch for?";
    }

    static {
        r.llIlIlllIllll();
        r.llIlIlllIlIIl();
        cZ = llllllIlll[4];
        cW = llllllIlll[182];
        cX = llllllIlll[142];
        cY = llllllIlll[2];
        da = new WorldPoint(llllllIlll[37], llllllIlll[183], llllllIlll[1]);
        db = new WorldPoint(llllllIlll[184], llllllIlll[185], llllllIlll[1]);
        dc = new WorldPoint(llllllIlll[186], llllllIlll[187], llllllIlll[1]);
        dd = new WorldPoint(llllllIlll[44], llllllIlll[188], llllllIlll[1]);
        de = new WorldPoint(llllllIlll[184], llllllIlll[189], llllllIlll[1]);
        df = new WorldPoint(llllllIlll[184], llllllIlll[190], llllllIlll[1]);
        bu = new ArrayList<d>();
        dg = llllllIlll[1];
        dh = new WorldArea(llllllIlll[191], llllllIlll[43], llllllIlll[51], llllllIlll[47], llllllIlll[1]);
        String[] stringArray = new String[llllllIlll[30]];
        stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[192]];
        stringArray[r.llllllIlll[0]] = llllllIlIl[llllllIlll[193]];
        stringArray[r.llllllIlll[7]] = llllllIlIl[llllllIlll[31]];
        stringArray[r.llllllIlll[11]] = llllllIlIl[llllllIlll[194]];
        stringArray[r.llllllIlll[8]] = llllllIlIl[llllllIlll[195]];
        stringArray[r.llllllIlll[5]] = llllllIlIl[llllllIlll[196]];
        stringArray[r.llllllIlll[12]] = llllllIlIl[llllllIlll[197]];
        stringArray[r.llllllIlll[21]] = llllllIlIl[llllllIlll[198]];
        stringArray[r.llllllIlll[28]] = llllllIlIl[llllllIlll[199]];
        stringArray[r.llllllIlll[32]] = llllllIlIl[llllllIlll[200]];
        stringArray[r.llllllIlll[10]] = llllllIlIl[llllllIlll[201]];
        stringArray[r.llllllIlll[34]] = llllllIlIl[llllllIlll[202]];
        stringArray[r.llllllIlll[46]] = llllllIlIl[llllllIlll[203]];
        stringArray[r.llllllIlll[47]] = llllllIlIl[llllllIlll[204]];
        stringArray[r.llllllIlll[48]] = llllllIlIl[llllllIlll[205]];
        stringArray[r.llllllIlll[29]] = llllllIlIl[llllllIlll[206]];
        stringArray[r.llllllIlll[49]] = llllllIlIl[llllllIlll[207]];
        stringArray[r.llllllIlll[41]] = llllllIlIl[llllllIlll[208]];
        stringArray[r.llllllIlll[50]] = llllllIlIl[llllllIlll[209]];
        stringArray[r.llllllIlll[51]] = llllllIlIl[llllllIlll[210]];
        bQ = stringArray;
    }

    private static boolean llIlIllllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIllllIIll(int n2) {
        return n2 == 0;
    }

    private static void aZ() {
        if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
            Widget var11;
            Widget var12;
            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[162]];
            Movement.walkTo((WorldPoint)de);

            Time.sleepTicks((int)llllllIlll[0]);

            if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                Time.sleepTicks((int)llllllIlll[8]);

            }
            if (r.llIlIllllIllI(var12 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                Mouse.click((int)var12.getClickPoint().getX(), (int)var12.getClickPoint().getY(), (boolean)llllllIlll[0]);
                Time.sleepTicks((int)llllllIlll[11]);

            }
            if (r.llIlIllllIllI(var11 = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                Mouse.click((int)var11.getClickPoint().getX(), (int)var11.getClickPoint().getY(), (boolean)llllllIlll[0]);
                Time.sleepTicks((int)llllllIlll[11]);

            }
        }
    }

    private static int llIlIllllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public int T() {
        try {
            r.aY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 1) {
            return (0x8F ^ 0xB3) & ~(0x4E ^ 0x72);
        }
        return llllllIlll[135];
    }
}

