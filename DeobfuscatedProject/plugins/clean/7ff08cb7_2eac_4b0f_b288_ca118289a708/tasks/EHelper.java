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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.account.AccBuilderGWD;
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

public class EHelper
implements ab {
    public static final  int fb;
    public static final  WorldPoint fd;
    public static final  WorldPoint fi;
    public static  boolean bv;
    static  int dy;
    static  WorldArea fj;
    public static final  WorldPoint fe;
    public static final  int eZ;
    public static final  WorldPoint fg;
    public static final  int fa;
    public static final  WorldPoint fh;
    public static  List<d> bx;
    public static final  int fc;
    public static final  WorldPoint ff;
    
    static  boolean dl;
    
    static  int dk;
    static  String[] cG;

    private static boolean lIlIIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return llIIIllII[llIIIllIl[178]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean bE() {
        int n2;
        block2: {
            block4: {
                block3: {
                    String[] stringArray = new String[llIIIllIl[0]];
                    stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[163]];
                    if (!E.lIlIIlllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) || !E.lIlIIlllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0)) break block2;
                    int[] nArray = new int[llIIIllIl[0]];
                    nArray[E.llIIIllIl[1]] = llIIIllIl[9];
                    if (!E.lIlIIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[llIIIllIl[0]];
                    stringArray2[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[164]];
                    if (!E.lIlIIlllIlII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block3;
                    String[] stringArray3 = new String[llIIIllIl[0]];
                    stringArray3[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[165]];
                    if (!E.lIlIIlllIIlI(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block2;
                }
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[166]];
                if (!E.lIlIIlllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
                int[] nArray = new int[llIIIllIl[0]];
                nArray[E.llIIIllIl[1]] = llIIIllIl[19];
                if (!E.lIlIIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[llIIIllIl[0]];
                nArray2[E.llIIIllIl[1]] = llIIIllIl[19];
                if (!E.lIlIIlllIIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = llIIIllIl[0];

            if (2 > -1) return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = llIIIllIl[1];
        return n2 != 0;
    }

        return String.valueOf(lIllIlIllIIIll);
    }

    private static boolean lIlIIllllIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (E.lIlIIlllIlIl(e.j(llIIIllIl[4]), llIIIllIl[145])) {
            bl = llIIIllIl[0];

            }
        } else {
            bl = llIIIllIl[1];
        }
        return bl;
    }

    @Override
    public int af() {
        try {
            E.bC();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= ((0xF1 ^ 0xB6) & ~(0x3A ^ 0x7D))) {
            return (0xD4 ^ 0x80) & ~(0x60 ^ 0x34);
        }
        return llIIIllIl[135];
    }

    private static boolean lIlIIlllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllllII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllllIll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bC() {
        if (E.lIlIIlllIIlI(bv ? 1 : 0)) {
            b.a(bx);
            if (E.lIlIIlllIIll(bx.size(), llIIIllIl[0])) {
                System.out.println(llIIIllII[llIIIllIl[1]]);
                bv = llIIIllIl[1];
            }
        }
        if (E.lIlIIlllIlII(bv ? 1 : 0)) {
            WorldPoint lIllIlIllllIlI;
            TileItem lIllIlIllllIll;
            Object lIllIlIlllllII;
            BankLocation lIllIllIIIIIII;
            if (!E.lIlIIlllIlIl(e.j(llIIIllIl[2]), llIIIllIl[3]) || E.lIlIIlllIIll(e.j(llIIIllIl[4]), llIIIllIl[5])) {
                G.bI();
            }
            if (E.lIlIIlllIlII(E.bE() ? 1 : 0) && E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[5]) && E.lIlIIlllIlIl(e.j(llIIIllIl[2]), llIIIllIl[3])) {
                lIllIllIIIIIII = BankLocation.getNearest();
                if (E.lIlIIlllIlll(lIllIllIIIIIII) && E.lIlIIlllIlII(lIllIllIIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[0]];
                    a.a(lIllIllIIIIIII);
                }
                if (E.lIlIIlllIlll(lIllIllIIIIIII) && E.lIlIIlllIIlI(lIllIllIIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (E.lIlIIlllIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIl[6]);

                    }
                    if (E.lIlIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[7]];
                        if (E.lIlIIllllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIllIl[8]);

                        }
                        if (E.lIlIIllllIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIllIl[7]);

                        }
                        int[] nArray = new int[llIIIllIl[0]];
                        nArray[E.llIIIllIl[1]] = llIIIllIl[9];
                        if (E.lIlIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIIIllIl[0]];
                            nArray2[E.llIIIllIl[1]] = llIIIllIl[9];
                            if (E.lIlIIlllIIll(Bank.getFirst((int[])nArray2).getQuantity(), llIIIllIl[10])) {
                                E.Q();
                                System.out.println(llIIIllII[llIIIllIl[11]]);
                                bv = llIIIllIl[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[llIIIllIl[12]];
                        nArray3[E.llIIIllIl[1]] = llIIIllIl[13];
                        nArray3[E.llIIIllIl[0]] = llIIIllIl[14];
                        nArray3[E.llIIIllIl[7]] = llIIIllIl[15];
                        nArray3[E.llIIIllIl[11]] = llIIIllIl[16];
                        nArray3[E.llIIIllIl[8]] = llIIIllIl[9];
                        nArray3[E.llIIIllIl[5]] = llIIIllIl[17];
                        if (E.lIlIIlllIlII(e.d(nArray3) ? 1 : 0)) {
                            E.Q();
                            System.out.println(llIIIllII[llIIIllIl[8]]);
                            bv = llIIIllIl[0];
                            return;
                        }
                        int[] nArray4 = new int[llIIIllIl[12]];
                        nArray4[E.llIIIllIl[1]] = llIIIllIl[13];
                        nArray4[E.llIIIllIl[0]] = llIIIllIl[14];
                        nArray4[E.llIIIllIl[7]] = llIIIllIl[15];
                        nArray4[E.llIIIllIl[11]] = llIIIllIl[16];
                        nArray4[E.llIIIllIl[8]] = llIIIllIl[9];
                        nArray4[E.llIIIllIl[5]] = llIIIllIl[17];
                        if (E.lIlIIlllIIlI(e.d(nArray4) ? 1 : 0)) {
                            a.a(llIIIllIl[18], llIIIllIl[7]);
                            a.a(llIIIllIl[19], llIIIllIl[0]);
                            a.a(llIIIllIl[20], llIIIllIl[0]);
                            a.a(llIIIllIl[13], llIIIllIl[10]);
                            a.a(llIIIllIl[14], llIIIllIl[10]);
                            a.a(llIIIllIl[15], llIIIllIl[0]);
                            a.a(llIIIllIl[16], llIIIllIl[11]);
                            a.a(llIIIllIl[17], llIIIllIl[8]);
                            a.a(llIIIllIl[9], llIIIllIl[21]);
                        }
                    }
                }
            }
            if (E.lIlIIlllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && E.lIlIIlllIIll(Movement.getRunEnergy(), llIIIllIl[22])) {
                Inventory.getFirst((int[])f.bc).interact(llIIIllII[llIIIllIl[5]]);
                Time.sleepTicks((int)llIIIllIl[0]);

            }
            int[] nArray = new int[llIIIllIl[0]];
            nArray[E.llIIIllIl[1]] = llIIIllIl[9];
            if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && E.lIlIIllllIIl(E.lIlIIlllIIIl(e.w(), 60.0))) {
                int[] nArray5 = new int[llIIIllIl[0]];
                nArray5[E.llIIIllIl[1]] = llIIIllIl[9];
                Inventory.getFirst((int[])nArray5).interact(llIIIllII[llIIIllIl[12]]);
                Time.sleepTicks((int)llIIIllIl[0]);

            }
            lIllIllIIIIIII = new WorldPoint(llIIIllIl[23], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint lIllIlIlllllll = new WorldPoint(llIIIllIl[25], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint lIllIlIllllllI = new WorldPoint(llIIIllIl[26], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint lIllIlIlllllIl = new WorldPoint(llIIIllIl[27], llIIIllIl[24], llIIIllIl[1]);
            if (!E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)lIllIllIIIIIII) ? 1 : 0) || !E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)lIllIlIlllllll) ? 1 : 0) || !E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)lIllIlIllllllI) ? 1 : 0) || E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIllIlIlllllIl) ? 1 : 0)) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[21]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIllII[llIIIllIl[28]]);
                Time.sleepTicks((int)llIIIllIl[29]);

            }
            if (E.lIlIIlllIlIl(e.j(llIIIllIl[4]), llIIIllIl[5]) && E.lIlIIlllIIll(e.j(llIIIllIl[4]), llIIIllIl[30]) && E.lIlIIlllIIlI(E.bE() ? 1 : 0)) {
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fd), llIIIllIl[31])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[32]];
                    int[] nArray6 = new int[llIIIllIl[0]];
                    nArray6[E.llIIIllIl[1]] = llIIIllIl[14];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray6) ? 1 : 0) && E.lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] nArray7 = new int[llIIIllIl[0]];
                        nArray7[E.llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst((int[])nArray7).interact(llIIIllII[llIIIllIl[10]]);
                        Time.sleepTicks((int)llIIIllIl[7]);

                    }
                }
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fd), llIIIllIl[31])) {
                    if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[34]];
                        if (E.lIlIIlllIIlI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0) || E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[37], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                            e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                            Time.sleepTicks((int)llIIIllIl[8]);

                        }
                        if (E.lIlIIlllIlll(lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                            Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);

                        }
                        if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                            Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);

                        }
                        lIllIlIllllIlI = new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1]);
                        if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIllIlIllllIlI) ? 1 : 0)) {
                            e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                            Time.sleepTicks((int)e.c(llIIIllIl[5], llIIIllIl[28]));

                        }
                        if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0) && E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[37], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)fh);

                            Time.sleepTicks((int)llIIIllIl[0]);

                        }
                    }
                    if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                        e.l(llIIIllIl[19]);
                        String[] stringArray = new String[llIIIllIl[0]];
                        stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[46]];
                        if (E.lIlIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIllII[llIIIllIl[47]];
                            String[] stringArray2 = new String[llIIIllIl[0]];
                            stringArray2[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[48]];
                            lIllIlIlllllII = TileItems.getNearest((String[])stringArray2);
                            if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                                String[] stringArray3 = new String[llIIIllIl[0]];
                                stringArray3[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[29]];
                                if (E.lIlIIlllllII(TileItems.getNearest((String[])stringArray3))) {
                                    lIllIlIlllllII.interact(llIIIllII[llIIIllIl[49]]);
                                    Time.sleepTicks((int)llIIIllIl[7]);

                                }
                            }
                            String[] stringArray4 = new String[llIIIllIl[0]];
                            stringArray4[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[41]];
                            lIllIlIllllIll = TileItems.getNearest((String[])stringArray4);
                            if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                                lIllIlIllllIll.interact(llIIIllII[llIIIllIl[50]]);
                                Time.sleepTicks((int)llIIIllIl[0]);

                            }
                        }
                        String[] stringArray5 = new String[llIIIllIl[0]];
                        stringArray5[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[51]];
                        if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            String[] stringArray6 = new String[llIIIllIl[0]];
                            stringArray6[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[30]];
                            if (E.lIlIIlllIlII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llIIIllIl[0]];
                                stringArray7[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[52]];
                                TileObjects.getNearest((String[])stringArray7).interact(llIIIllII[llIIIllIl[53]]);
                                Time.sleepTicks((int)llIIIllIl[7]);

                            }
                        }
                        String[] stringArray8 = new String[llIIIllIl[0]];
                        stringArray8[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[54]];
                        if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray8))) {
                            String[] stringArray9 = new String[llIIIllIl[0]];
                            stringArray9[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[55]];
                            TileObjects.getNearest((String[])stringArray9).interact(llIIIllII[llIIIllIl[56]]);
                            Time.sleepTicks((int)llIIIllIl[8]);

                        }
                        String[] stringArray10 = new String[llIIIllIl[0]];
                        stringArray10[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[57]];
                        if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray10))) {
                            g.a(llIIIllII[llIIIllIl[58]], cG);
                        }
                    }
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[30])) {
                dk = llIIIllIl[1];
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[59]];
                if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray11 = new String[llIIIllIl[0]];
                    stringArray11[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[60]];
                    if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIIllIl[0]];
                        nArray8[E.llIIIllIl[1]] = llIIIllIl[19];
                        if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llIIIllIl[0]];
                            nArray9[E.llIIIllIl[1]] = llIIIllIl[19];
                            if (E.lIlIIlllIlII(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIIllIl[0]];
                                nArray10[E.llIIIllIl[1]] = llIIIllIl[19];
                                Inventory.getFirst((int[])nArray10).interact(llIIIllII[llIIIllIl[61]]);
                            }
                        }
                        String[] stringArray12 = new String[llIIIllIl[0]];
                        stringArray12[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[62]];
                        if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray12))) {
                            String[] stringArray13 = new String[llIIIllIl[0]];
                            stringArray13[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[63]];
                            TileObjects.getNearest((String[])stringArray13).interact(llIIIllII[llIIIllIl[64]]);
                            Time.sleepTicks((int)llIIIllIl[8]);

                        }
                        String[] stringArray14 = new String[llIIIllIl[0]];
                        stringArray14[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[65]];
                        if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray14))) {
                            if (E.lIlIIlllIIll(dy, llIIIllIl[0])) {
                                String[] stringArray15 = new String[llIIIllIl[0]];
                                stringArray15[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[66]];
                                String[] stringArray16 = new String[llIIIllIl[0]];
                                stringArray16[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[67]];
                                Inventory.getFirst((String[])stringArray15).useOn((Actor)NPCs.getNearest((String[])stringArray16));
                                Time.sleepTicks((int)llIIIllIl[11]);

                                dy += llIIIllIl[0];
                            }
                            if (E.lIlIIlllIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray17 = new String[llIIIllIl[0]];
                                stringArray17[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[68]];
                                String[] stringArray18 = new String[llIIIllIl[0]];
                                stringArray18[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[69]];
                                Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                                Time.sleepTicks((int)llIIIllIl[11]);

                            }
                            g.a(cG);
                        }
                    }
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[56])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[70]];
                if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray19 = new String[llIIIllIl[0]];
                    stringArray19[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[71]];
                    TileObjects.getNearest((String[])stringArray19).interact(llIIIllII[llIIIllIl[72]]);
                    Time.sleepTicks((int)llIIIllIl[8]);

                }
                if (E.lIlIIlllIlII(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray20 = new String[llIIIllIl[0]];
                    stringArray20[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[73]];
                    String[] stringArray21 = new String[llIIIllIl[0]];
                    stringArray21[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[74]];
                    Inventory.getFirst((String[])stringArray20).useOn((Actor)NPCs.getNearest((String[])stringArray21));
                }
                g.a(cG);
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[61])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[75]];
                if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray22 = new String[llIIIllIl[0]];
                    stringArray22[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[76]];
                    TileObjects.getNearest((String[])stringArray22).interact(llIIIllII[llIIIllIl[77]]);
                    Time.sleepTicks((int)llIIIllIl[8]);

                }
                String[] stringArray23 = new String[llIIIllIl[0]];
                stringArray23[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[78]];
                if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray23))) {
                    g.a(llIIIllII[llIIIllIl[79]], cG);
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[66])) {
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[80]];
                    int[] nArray11 = new int[llIIIllIl[0]];
                    nArray11[E.llIIIllIl[1]] = llIIIllIl[14];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray11) ? 1 : 0) && E.lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] nArray12 = new int[llIIIllIl[0]];
                        nArray12[E.llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst((int[])nArray12).interact(llIIIllII[llIIIllIl[22]]);
                        Time.sleepTicks((int)llIIIllIl[7]);

                    }
                }
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[12]) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[81]];
                    Movement.walkTo((WorldPoint)fi);

                    Time.sleepTicks((int)llIIIllIl[0]);

                }
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[82]];
                if (E.lIlIIlllIlll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[llIIIllIl[0]];
                    stringArray24[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[83]];
                    TileObjects.getNearest((String[])stringArray24).interact(llIIIllII[llIIIllIl[84]]);
                    Time.sleepTicks((int)llIIIllIl[11]);

                }
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[29])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[85]];
                    g.a(llIIIllII[llIIIllIl[86]], cG);
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[71])) {
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[87]];
                    int[] nArray13 = new int[llIIIllIl[0]];
                    nArray13[E.llIIIllIl[1]] = llIIIllIl[14];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray13) ? 1 : 0) && E.lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] nArray14 = new int[llIIIllIl[0]];
                        nArray14[E.llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst((int[])nArray14).interact(llIIIllII[llIIIllIl[88]]);
                        Time.sleepTicks((int)llIIIllIl[7]);

                    }
                }
                if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[89]];
                    Movement.walkTo((WorldPoint)ff);

                    Time.sleepTicks((int)llIIIllIl[0]);

                    lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]);
                    if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                        Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);

                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                        Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);

                    }
                }
                if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0)) {
                    int[] nArray15 = new int[llIIIllIl[0]];
                    nArray15[E.llIIIllIl[1]] = llIIIllIl[90];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[llIIIllIl[0]];
                        nArray16[E.llIIIllIl[1]] = llIIIllIl[90];
                        Inventory.getFirst((int[])nArray16).interact(llIIIllII[llIIIllIl[3]]);
                        Time.sleepTicks((int)llIIIllIl[7]);

                    }
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[76])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[91]];
                lIllIlIlllllII = TileObjects.getNearest((String[])stringArray);
                if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                    lIllIlIlllllII.interact(llIIIllII[llIIIllIl[92]]);
                    Time.sleepTicks((int)llIIIllIl[7]);

                }
                String[] stringArray25 = new String[llIIIllIl[0]];
                stringArray25[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[93]];
                lIllIlIllllIll = TileItems.getNearest((String[])stringArray25);
                if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                    lIllIlIllllIll.interact(llIIIllII[llIIIllIl[94]]);
                    Time.sleepTicks((int)llIIIllIl[7]);

                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[22])) {
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[95]];
                    Movement.walkTo((WorldPoint)fh);

                    Time.sleepTicks((int)llIIIllIl[0]);

                    lIllIlIlllllII = new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1]);
                    if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(lIllIlIlllllII) ? 1 : 0)) {
                        e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                        Time.sleepTicks((int)e.c(llIIIllIl[5], llIIIllIl[28]));

                    }
                    if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                        e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                        Time.sleepTicks((int)llIIIllIl[8]);

                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                        Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);

                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIlI = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                        Mouse.click((int)lIllIlIllllIlI.getClickPoint().getX(), (int)lIllIlIllllIlI.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);

                    }
                }
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    String[] stringArray = new String[llIIIllIl[0]];
                    stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[96]];
                    if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray26 = new String[llIIIllIl[0]];
                        stringArray26[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[97]];
                        TileObjects.getNearest((String[])stringArray26).interact(llIIIllII[llIIIllIl[98]]);
                        Time.sleepTicks((int)llIIIllIl[8]);

                    }
                    String[] stringArray27 = new String[llIIIllIl[0]];
                    stringArray27[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[99]];
                    if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray27))) {
                        g.a(llIIIllII[llIIIllIl[100]], cG);
                    }
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[85])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[101]];
                if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray28 = new String[llIIIllIl[0]];
                    stringArray28[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[102]];
                    if (E.lIlIIllllIlI(Inventory.getAll((String[])stringArray28).size(), llIIIllIl[11])) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[103]];
                        String[] stringArray29 = new String[llIIIllIl[0]];
                        stringArray29[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[104]];
                        int[] nArray17 = new int[llIIIllIl[0]];
                        nArray17[E.llIIIllIl[1]] = llIIIllIl[105];
                        Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((int[])nArray17));
                        Time.sleepTicks((int)llIIIllIl[11]);

                    }
                }
                String[] stringArray30 = new String[llIIIllIl[0]];
                stringArray30[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[106]];
                if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray30) ? 1 : 0)) {
                    String[] stringArray31 = new String[llIIIllIl[0]];
                    stringArray31[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[107]];
                    int[] nArray18 = new int[llIIIllIl[0]];
                    nArray18[E.llIIIllIl[1]] = llIIIllIl[108];
                    Inventory.getFirst((String[])stringArray31).useOn(TileObjects.getNearest((int[])nArray18));
                    Time.sleepTicks((int)llIIIllIl[11]);

                }
                String[] stringArray32 = new String[llIIIllIl[0]];
                stringArray32[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[109]];
                if (E.lIlIIlllIlII(Inventory.contains((String[])stringArray32) ? 1 : 0)) {
                    String[] stringArray33 = new String[llIIIllIl[0]];
                    stringArray33[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[110]];
                    if (E.lIlIIllllIll(Inventory.getAll((String[])stringArray33).size(), llIIIllIl[11])) {
                        int[] nArray19 = new int[llIIIllIl[0]];
                        nArray19[E.llIIIllIl[1]] = llIIIllIl[111];
                        lIllIlIlllllII = TileObjects.getNearest((int[])nArray19).getWorldLocation();
                        if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(lIllIlIlllllII) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)lIllIlIlllllII);

                            Time.sleepTicks((int)llIIIllIl[0]);

                        }
                        if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(lIllIlIlllllII) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIllII[llIIIllIl[112]];
                            g.a(llIIIllII[llIIIllIl[113]], cG);
                        }
                    }
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[3]) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[10])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[114]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIllII[llIIIllIl[115]]);
                Time.sleepTicks((int)llIIIllIl[8]);

            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[95])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[116]];
                if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray20 = new int[llIIIllIl[0]];
                    nArray20[E.llIIIllIl[1]] = llIIIllIl[117];
                    TileObjects.getNearest((int[])nArray20).interact(llIIIllII[llIIIllIl[118]]);
                    Time.sleepTicks((int)llIIIllIl[8]);

                }
                String[] stringArray34 = new String[llIIIllIl[0]];
                stringArray34[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[119]];
                if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray34))) {
                    g.a(llIIIllII[llIIIllIl[120]], cG);
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[100])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[121]];
                if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray35 = new String[llIIIllIl[0]];
                    stringArray35[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[122]];
                    if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray35))) {
                        int[] nArray21 = new int[llIIIllIl[0]];
                        nArray21[E.llIIIllIl[1]] = llIIIllIl[117];
                        TileObjects.getNearest((int[])nArray21).interact(llIIIllII[llIIIllIl[123]]);
                        Time.sleepTicks((int)llIIIllIl[8]);

                    }
                }
                String[] stringArray36 = new String[llIIIllIl[0]];
                stringArray36[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[124]];
                if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray36))) {
                    g.a(llIIIllII[llIIIllIl[125]], cG);
                }
                String[] stringArray37 = new String[llIIIllIl[0]];
                stringArray37[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[126]];
                if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray37))) {
                    g.a(llIIIllII[llIIIllIl[127]], cG);
                }
            }
            if (E.lIlIIlllIlIl(e.j(llIIIllIl[4]), llIIIllIl[106]) && E.lIlIIllllIll(e.j(llIIIllIl[4]), llIIIllIl[119])) {
                if (E.lIlIIlllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    g.a(cG);
                }
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[128]];
                if (E.lIlIIlllIlll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray38 = new String[llIIIllIl[0]];
                    stringArray38[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[129]];
                    if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[130]];
                        int[] nArray22 = new int[llIIIllIl[0]];
                        nArray22[E.llIIIllIl[1]] = llIIIllIl[14];
                        if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray22) ? 1 : 0) && E.lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                            int[] nArray23 = new int[llIIIllIl[0]];
                            nArray23[E.llIIIllIl[1]] = llIIIllIl[14];
                            Inventory.getFirst((int[])nArray23).interact(llIIIllII[llIIIllIl[131]]);
                            Time.sleepTicks((int)llIIIllIl[7]);

                        }
                    }
                }
                if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    String[] stringArray39 = new String[llIIIllIl[0]];
                    stringArray39[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[132]];
                    if (E.lIlIIlllllII(TileObjects.getNearest((String[])stringArray39))) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[133]];
                        Movement.walkTo((WorldPoint)ff);

                        Time.sleepTicks((int)llIIIllIl[0]);

                        lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]);
                        if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                            Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);

                        }
                        if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                            Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);

                        }
                    }
                }
                if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0)) {
                    int[] nArray24 = new int[llIIIllIl[0]];
                    nArray24[E.llIIIllIl[1]] = llIIIllIl[134];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                        int[] nArray25 = new int[llIIIllIl[0]];
                        nArray25[E.llIIIllIl[1]] = llIIIllIl[134];
                        Inventory.getFirst((int[])nArray25).interact(llIIIllII[llIIIllIl[135]]);
                        Time.sleepTicks((int)llIIIllIl[7]);

                    }
                }
                String[] stringArray40 = new String[llIIIllIl[0]];
                stringArray40[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[136]];
                lIllIlIlllllII = TileObjects.getNearest((String[])stringArray40);
                if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                    lIllIlIlllllII.interact(llIIIllII[llIIIllIl[137]]);
                    Time.sleepTicks((int)llIIIllIl[7]);

                }
                String[] stringArray41 = new String[llIIIllIl[0]];
                stringArray41[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[138]];
                lIllIlIllllIll = TileItems.getNearest((String[])stringArray41);
                if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                    lIllIlIllllIll.interact(llIIIllII[llIIIllIl[139]]);
                    Time.sleepTicks((int)llIIIllIl[7]);

                }
                String[] stringArray42 = new String[llIIIllIl[0]];
                stringArray42[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[140]];
                if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray42) ? 1 : 0) && E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0)) {
                    String[] stringArray43 = new String[llIIIllIl[0]];
                    stringArray43[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[141]];
                    if (E.lIlIIlllIIlI(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[llIIIllIl[0]];
                        stringArray44[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[142]];
                        Inventory.getFirst((String[])stringArray44).interact(llIIIllII[llIIIllIl[143]]);
                        Time.sleepTicks((int)llIIIllIl[0]);

                    }
                }
            }
            if (E.lIlIIlllIlIl(e.j(llIIIllIl[4]), llIIIllIl[124]) && E.lIlIIlllIIll(e.j(llIIIllIl[4]), llIIIllIl[140])) {
                int[] nArray26 = new int[llIIIllIl[0]];
                nArray26[E.llIIIllIl[1]] = llIIIllIl[20];
                if (E.lIlIIlllIlII(Equipment.contains((int[])nArray26) ? 1 : 0)) {
                    int[] nArray27 = new int[llIIIllIl[0]];
                    nArray27[E.llIIIllIl[1]] = llIIIllIl[20];
                    if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                        int[] nArray28 = new int[llIIIllIl[0]];
                        nArray28[E.llIIIllIl[1]] = llIIIllIl[20];
                        Inventory.getFirst((int[])nArray28).interact(llIIIllII[llIIIllIl[144]]);
                    }
                }
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[145]];
                lIllIlIlllllII = NPCs.getAll((String[])stringArray);
                lIllIlIllllIll = lIllIlIlllllII.stream().filter(nPC -> {
                    String[] stringArray = new String[llIIIllIl[0]];
                    stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[181]];
                    return nPC.hasAction(stringArray);
                }).findFirst().orElse(null);
                if (E.lIlIIlllIIll(Prayers.getPoints(), llIIIllIl[30])) {
                    Inventory.getFirst(item -> item.getName().contains(llIIIllII[llIIIllIl[180]])).interact(llIIIllII[llIIIllIl[146]]);
                }
                if (E.lIlIIlllllII(lIllIlIllllIll)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[147]];
                    if (E.lIlIIlllIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] stringArray45 = new String[llIIIllIl[0]];
                    stringArray45[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[148]];
                    String[] stringArray46 = new String[llIIIllIl[0]];
                    stringArray46[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[149]];
                    Inventory.getFirst((String[])stringArray45).useOn((Actor)NPCs.getNearest((String[])stringArray46));
                    Time.sleepTicks((int)llIIIllIl[32]);

                }
                if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[150]];
                    if (E.lIlIIlllIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (E.lIlIIlllIlll(lIllIlIllllIll) && E.lIlIIlllllII(Players.getLocal().getInteracting())) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[151]];
                    lIllIlIllllIll.interact(llIIIllII[llIIIllIl[152]]);
                    Time.sleepTicks((int)llIIIllIl[7]);

                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[140])) {
                if (E.lIlIIlllIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8]) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[29])) {
                    E.bD();
                }
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    String[] stringArray = new String[llIIIllIl[0]];
                    stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[153]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIllII[llIIIllIl[154]]);
                    Time.sleepTicks((int)llIIIllIl[8]);

                }
                if (E.lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[29])) {
                    if (E.lIlIIlllIIll(dk, llIIIllIl[0])) {
                        as.nC += llIIIllIl[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIIIllIl[0];
                        as.nC = llIIIllIl[1];
                        dl = llIIIllIl[1];
                    }
                    String[] stringArray = new String[llIIIllIl[0]];
                    stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[155]];
                    if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray47 = new String[llIIIllIl[0]];
                        stringArray47[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[156]];
                        if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray47))) {
                            int[] nArray29 = new int[llIIIllIl[0]];
                            nArray29[E.llIIIllIl[1]] = llIIIllIl[117];
                            TileObjects.getNearest((int[])nArray29).interact(llIIIllII[llIIIllIl[157]]);
                            Time.sleepTicks((int)llIIIllIl[8]);

                        }
                    }
                    String[] stringArray48 = new String[llIIIllIl[0]];
                    stringArray48[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[158]];
                    if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray48))) {
                        g.a(llIIIllII[llIIIllIl[159]], cG);
                    }
                    String[] stringArray49 = new String[llIIIllIl[0]];
                    stringArray49[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[160]];
                    if (E.lIlIIlllIlll(NPCs.getNearest((String[])stringArray49))) {
                        g.a(llIIIllII[llIIIllIl[161]], cG);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllllIII(int n2) {
        return n2 > 0;
    }

    private static int lIlIIlllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void Q() {
        d lIllIlIlllIIlI;
        Object lIllIlIlllIIll;
        block12: {
            block11: {
                int[] nArray = new int[llIIIllIl[0]];
                nArray[E.llIIIllIl[1]] = llIIIllIl[20];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llIIIllIl[20], llIIIllIl[0], llIIIllIl[169]);
                    bx.add(d2);

                }
                int[] nArray2 = new int[llIIIllIl[0]];
                nArray2[E.llIIIllIl[1]] = llIIIllIl[18];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIllIlIlllIIll = new DHelper(llIIIllIl[18], llIIIllIl[0], llIIIllIl[170]);
                    bx.add((DHelper) IllIlIlllIIll);

                }
                int[] nArray3 = new int[llIIIllIl[0]];
                nArray3[E.llIIIllIl[1]] = llIIIllIl[14];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIllIlIlllIIll = new DHelper(llIIIllIl[14], llIIIllIl[10], e.c(llIIIllIl[171], llIIIllIl[172]));
                    bx.add((DHelper) IllIlIlllIIll);

                }
                int[] nArray4 = new int[llIIIllIl[0]];
                nArray4[E.llIIIllIl[1]] = llIIIllIl[16];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIllIlIlllIIll = new DHelper(llIIIllIl[16], llIIIllIl[11], llIIIllIl[173]);
                    bx.add((DHelper) IllIlIlllIIll);

                }
                int[] nArray5 = new int[llIIIllIl[0]];
                nArray5[E.llIIIllIl[1]] = llIIIllIl[17];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lIllIlIlllIIll = new DHelper(llIIIllIl[17], llIIIllIl[5], j.ch);
                    bx.add((DHelper) IllIlIlllIIll);

                }
                int[] nArray6 = new int[llIIIllIl[0]];
                nArray6[E.llIIIllIl[1]] = llIIIllIl[9];
                if (!E.lIlIIlllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block11;
                int[] nArray7 = new int[llIIIllIl[0]];
                nArray7[E.llIIIllIl[1]] = llIIIllIl[9];
                if (!E.lIlIIlllIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block12;
                int[] nArray8 = new int[llIIIllIl[0]];
                nArray8[E.llIIIllIl[1]] = llIIIllIl[9];
                if (!E.lIlIIlllIIll(Bank.getFirst((int[])nArray8).getQuantity(), llIIIllIl[10])) break block12;
            }
            lIllIlIlllIIll = new DHelper(llIIIllIl[9], llIIIllIl[61], llIIIllIl[174]);
            bx.add((DHelper) IllIlIlllIIll);

        }
        int[] nArray = new int[llIIIllIl[0]];
        nArray[E.llIIIllIl[1]] = llIIIllIl[15];
        if (E.lIlIIlllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIllIlIlllIIll = new DHelper(llIIIllIl[15], llIIIllIl[0], llIIIllIl[169]);
            bx.add((DHelper) IllIlIlllIIll);

        }
        if (E.lIlIIlllIlII(Bank.contains((Predicate)(lIllIlIlllIIll = item -> item.getName().toLowerCase().contains(llIIIllII[llIIIllIl[179]]))) ? 1 : 0)) {
            lIllIlIlllIIlI = new DHelper(llIIIllIl[175], llIIIllIl[5], llIIIllIl[176]);
            bx.add(lIllIlIlllIIlI);

        }
        int[] nArray9 = new int[llIIIllIl[0]];
        nArray9[E.llIIIllIl[1]] = llIIIllIl[13];
        if (E.lIlIIlllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIllIlIlllIIlI = new DHelper(llIIIllIl[13], llIIIllIl[71], llIIIllIl[177]);
            bx.add(lIllIlIlllIIlI);

        }
    }

    private static void lIlIIllIllll() {
        llIIIllII = new String[llIIIllIl[211]];
        E.llIIIllII[E.llIIIllIl[1]] = "Finished buying items, switching back to quest";
        E.llIIIllII[E.llIIIllIl[0]] = "Nav to bank";
        E.llIIIllII[E.llIIIllIl[7]] = "Handling banking";
        E.llIIIllII[E.llIIIllIl[11]] = "We are missing quest supplies, switching to BUYING";
        E.llIIIllII[E.llIIIllIl[8]] = "We are missing quest supplies, switching to BUYING";
        E.llIIIllII[E.llIIIllIl[5]] = "Drink";
        E.llIIIllII[E.llIIIllIl[12]] = "Eat";
        E.llIIIllII[E.llIIIllIl[21]] = "Gate";
        E.llIIIllII[E.llIIIllIl[28]] = "Open";
        E.llIIIllII[E.llIIIllIl[32]] = "Using salve tele";
        E.llIIIllII[E.llIIIllIl[10]] = "Break";
        E.llIIIllII[E.llIIIllIl[34]] = "Nav to grotto";
        E.llIIIllII[E.llIIIllIl[46]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[47]] = "Getting mirror";
        E.llIIIllII[E.llIIIllIl[48]] = "Washing bowl";
        E.llIIIllII[E.llIIIllIl[29]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[49]] = "Take";
        E.llIIIllII[E.llIIIllIl[41]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[50]] = "Take";
        E.llIIIllII[E.llIIIllIl[51]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[30]] = "Journal";
        E.llIIIllII[E.llIIIllIl[52]] = "Grotto tree";
        E.llIIIllII[E.llIIIllIl[53]] = "Search";
        E.llIIIllII[E.llIIIllIl[54]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[55]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[56]] = "Enter";
        E.llIIIllII[E.llIIIllIl[57]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[58]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[59]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[60]] = "Journal";
        E.llIIIllII[E.llIIIllIl[61]] = "Wear";
        E.llIIIllII[E.llIIIllIl[62]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[63]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[64]] = "Enter";
        E.llIIIllII[E.llIIIllIl[65]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[66]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[67]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[68]] = "Mirror";
        E.llIIIllII[E.llIIIllIl[69]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[70]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[71]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[72]] = "Enter";
        E.llIIIllII[E.llIIIllIl[73]] = "Journal";
        E.llIIIllII[E.llIIIllIl[74]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[75]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[76]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[77]] = "Enter";
        E.llIIIllII[E.llIIIllIl[78]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[79]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[80]] = "Breaking tab";
        E.llIIIllII[E.llIIIllIl[22]] = "Break";
        E.llIIIllII[E.llIIIllIl[81]] = "Nav to priest";
        E.llIIIllII[E.llIIIllIl[82]] = "Trapdoor";
        E.llIIIllII[E.llIIIllIl[83]] = "Trapdoor";
        E.llIIIllII[E.llIIIllIl[84]] = "Open";
        E.llIIIllII[E.llIIIllIl[85]] = "Interact priest";
        E.llIIIllII[E.llIIIllIl[86]] = "Drezel";
        E.llIIIllII[E.llIIIllIl[87]] = "Breaking tab";
        E.llIIIllII[E.llIIIllIl[88]] = "Break";
        E.llIIIllII[E.llIIIllIl[89]] = "Nav to log";
        E.llIIIllII[E.llIIIllIl[3]] = "Cast";
        E.llIIIllII[E.llIIIllIl[91]] = "Fungi on log";
        E.llIIIllII[E.llIIIllIl[92]] = "Pick";
        E.llIIIllII[E.llIIIllIl[93]] = "Fungi on log";
        E.llIIIllII[E.llIIIllIl[94]] = "Pick";
        E.llIIIllII[E.llIIIllIl[95]] = "Nav to grotto";
        E.llIIIllII[E.llIIIllIl[96]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[97]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[98]] = "Enter";
        E.llIIIllII[E.llIIIllIl[99]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[100]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[101]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[102]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[103]] = "Solving puzzle";
        E.llIIIllII[E.llIIIllIl[104]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[106]] = "A used spell";
        E.llIIIllII[E.llIIIllIl[107]] = "A used spell";
        E.llIIIllII[E.llIIIllIl[109]] = "A used spell";
        E.llIIIllII[E.llIIIllIl[110]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[112]] = "Talking to filliman";
        E.llIIIllII[E.llIIIllIl[113]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[114]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[115]] = "Enter";
        E.llIIIllII[E.llIIIllIl[116]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[118]] = "Search";
        E.llIIIllII[E.llIIIllIl[119]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[120]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[121]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[122]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[123]] = "Search";
        E.llIIIllII[E.llIIIllIl[124]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[125]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[126]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[127]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[128]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[129]] = "Druid pouch";
        E.llIIIllII[E.llIIIllIl[130]] = "Breaking tab";
        E.llIIIllII[E.llIIIllIl[131]] = "Break";
        E.llIIIllII[E.llIIIllIl[132]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[133]] = "Nav to log";
        E.llIIIllII[E.llIIIllIl[135]] = "Cast Bloom";
        E.llIIIllII[E.llIIIllIl[136]] = "Fungi on log";
        E.llIIIllII[E.llIIIllIl[137]] = "Pick";
        E.llIIIllII[E.llIIIllIl[138]] = "Fungi on log";
        E.llIIIllII[E.llIIIllIl[139]] = "Pick";
        E.llIIIllII[E.llIIIllIl[140]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[141]] = "Druid pouch";
        E.llIIIllII[E.llIIIllIl[142]] = "Druid pouch";
        E.llIIIllII[E.llIIIllIl[143]] = "Fill";
        E.llIIIllII[E.llIIIllIl[144]] = "Wield";
        E.llIIIllII[E.llIIIllIl[145]] = "Ghast";
        E.llIIIllII[E.llIIIllIl[146]] = "Drink";
        E.llIIIllII[E.llIIIllIl[147]] = "Using druid pouch on ghast";
        E.llIIIllII[E.llIIIllIl[148]] = "Druid pouch";
        E.llIIIllII[E.llIIIllIl[149]] = "Ghast";
        E.llIIIllII[E.llIIIllIl[150]] = "Killing ghasts";
        E.llIIIllII[E.llIIIllIl[151]] = "Killing ghasts, no interacting";
        E.llIIIllII[E.llIIIllIl[152]] = "Attack";
        E.llIIIllII[E.llIIIllIl[153]] = "Grotto";
        E.llIIIllII[E.llIIIllIl[154]] = "Enter";
        E.llIIIllII[E.llIIIllIl[155]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[156]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[157]] = "Search";
        E.llIIIllII[E.llIIIllIl[158]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[159]] = "Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[160]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[161]] = "Nature Spirit";
        E.llIIIllII[E.llIIIllIl[162]] = "Nav to grotto";
        E.llIIIllII[E.llIIIllIl[163]] = "Salve graveyard teleport";
        E.llIIIllII[E.llIIIllIl[164]] = "Silver sickle";
        E.llIIIllII[E.llIIIllIl[165]] = "Silver sickle";
        E.llIIIllII[E.llIIIllIl[166]] = "Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[167]] = E.lIlIIllIllII("+dqltrcNmXA=", "DeZUY");
        E.llIIIllII[E.llIIIllIl[168]] = E.lIlIIllIllII("5a9T0GlMQ/I=", "rqAUf");
        E.llIIIllII[E.llIIIllIl[178]] = "Nature spirit";
        E.llIIIllII[E.llIIIllIl[179]] = "ring of wealth (";
        E.llIIIllII[E.llIIIllIl[180]] = "Prayer";
        E.llIIIllII[E.llIIIllIl[181]] = "Attack";
        E.llIIIllII[E.llIIIllIl[192]] = "I'm looking for a quest!";
        E.llIIIllII[E.llIIIllIl[193]] = "Yes.";
        E.llIIIllII[E.llIIIllIl[31]] = "Ok, let me help then.";
        E.llIIIllII[E.llIIIllIl[194]] = "Yep, now tell me what the problem is.";
        E.llIIIllII[E.llIIIllIl[195]] = "Sure.";
        E.llIIIllII[E.llIIIllIl[196]] = "You're right, we don't.";
        E.llIIIllII[E.llIIIllIl[197]] = "Is there anything else interesting to do around here?";
        E.llIIIllII[E.llIIIllIl[198]] = "Well, what is it, I may be able to help?";
        E.llIIIllII[E.llIIIllIl[199]] = "Yes, I'll go and look for him.";
        E.llIIIllII[E.llIIIllIl[200]] = "Yes, I'm sure.";
        E.llIIIllII[E.llIIIllIl[201]] = "I'll get going.";
        E.llIIIllII[E.llIIIllIl[202]] = "I think I've solved the puzzle!";
        E.llIIIllII[E.llIIIllIl[203]] = "How can I help?";
        E.llIIIllII[E.llIIIllIl[204]] = "Roald sent me to check on Drezel.";
        E.llIIIllII[E.llIIIllIl[205]] = "Why is the river such a good defence?";
        E.llIIIllII[E.llIIIllIl[206]] = "You're right, we don't.";
        E.llIIIllII[E.llIIIllIl[207]] = "Yes, of course.";
        E.llIIIllII[E.llIIIllIl[208]] = "Do you know of anything I can do in Morytania?";
        E.llIIIllII[E.llIIIllIl[209]] = "How long have you been a ghost?";
        E.llIIIllII[E.llIIIllIl[210]] = "What's this pouch for?";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIIllIl[0]];
        stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[167]];
        if (E.lIlIIllllIII(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llIIIllIl[0]];
            stringArray2[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[168]];
            if (E.lIlIIllllIII(Inventory.getCount((String[])stringArray2))) {
                n2 = llIIIllIl[0];

                if ((0xB4 ^ 0xB0) > -1) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIllIl[1];
        return n2 != 0;
    }

    private static boolean lIlIIlllIIlI(int n2) {
        return n2 != 0;
    }

    static {
        E.lIlIIlllIIII();
        E.lIlIIllIllll();
        fa = llIIIllIl[142];
        fb = llIIIllIl[2];
        fc = llIIIllIl[4];
        eZ = llIIIllIl[182];
        fd = new WorldPoint(llIIIllIl[37], llIIIllIl[183], llIIIllIl[1]);
        fe = new WorldPoint(llIIIllIl[184], llIIIllIl[185], llIIIllIl[1]);
        ff = new WorldPoint(llIIIllIl[186], llIIIllIl[187], llIIIllIl[1]);
        fg = new WorldPoint(llIIIllIl[44], llIIIllIl[188], llIIIllIl[1]);
        fh = new WorldPoint(llIIIllIl[184], llIIIllIl[189], llIIIllIl[1]);
        fi = new WorldPoint(llIIIllIl[184], llIIIllIl[190], llIIIllIl[1]);
        bx = new ArrayList<d>();
        dy = llIIIllIl[1];
        fj = new WorldArea(llIIIllIl[191], llIIIllIl[43], llIIIllIl[51], llIIIllIl[47], llIIIllIl[1]);
        String[] stringArray = new String[llIIIllIl[30]];
        stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[192]];
        stringArray[E.llIIIllIl[0]] = llIIIllII[llIIIllIl[193]];
        stringArray[E.llIIIllIl[7]] = llIIIllII[llIIIllIl[31]];
        stringArray[E.llIIIllIl[11]] = llIIIllII[llIIIllIl[194]];
        stringArray[E.llIIIllIl[8]] = llIIIllII[llIIIllIl[195]];
        stringArray[E.llIIIllIl[5]] = llIIIllII[llIIIllIl[196]];
        stringArray[E.llIIIllIl[12]] = llIIIllII[llIIIllIl[197]];
        stringArray[E.llIIIllIl[21]] = llIIIllII[llIIIllIl[198]];
        stringArray[E.llIIIllIl[28]] = llIIIllII[llIIIllIl[199]];
        stringArray[E.llIIIllIl[32]] = llIIIllII[llIIIllIl[200]];
        stringArray[E.llIIIllIl[10]] = llIIIllII[llIIIllIl[201]];
        stringArray[E.llIIIllIl[34]] = llIIIllII[llIIIllIl[202]];
        stringArray[E.llIIIllIl[46]] = llIIIllII[llIIIllIl[203]];
        stringArray[E.llIIIllIl[47]] = llIIIllII[llIIIllIl[204]];
        stringArray[E.llIIIllIl[48]] = llIIIllII[llIIIllIl[205]];
        stringArray[E.llIIIllIl[29]] = llIIIllII[llIIIllIl[206]];
        stringArray[E.llIIIllIl[49]] = llIIIllII[llIIIllIl[207]];
        stringArray[E.llIIIllIl[41]] = llIIIllII[llIIIllIl[208]];
        stringArray[E.llIIIllIl[50]] = llIIIllII[llIIIllIl[209]];
        stringArray[E.llIIIllIl[51]] = llIIIllII[llIIIllIl[210]];
        cG = stringArray;
    }

    private static boolean lIlIIlllIlII(int n2) {
        return n2 == 0;
    }

    private static void bD() {
        if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
            Widget lIllIlIlllIllI;
            Widget lIllIlIlllIlll;
            AccBuilderGWD.c = llIIIllII[llIIIllIl[162]];
            Movement.walkTo((WorldPoint)fh);

            Time.sleepTicks((int)llIIIllIl[0]);

            if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                Time.sleepTicks((int)llIIIllIl[8]);

            }
            if (E.lIlIIlllIlll(lIllIlIlllIlll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                Mouse.click((int)lIllIlIlllIlll.getClickPoint().getX(), (int)lIllIlIlllIlll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                Time.sleepTicks((int)llIIIllIl[11]);

            }
            if (E.lIlIIlllIlll(lIllIlIlllIllI = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                Mouse.click((int)lIllIlIlllIllI.getClickPoint().getX(), (int)lIllIlIlllIllI.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                Time.sleepTicks((int)llIIIllIl[11]);

            }
        }
    }

    private static boolean lIlIIlllIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlllIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ae() {
        return llIIIllIl[1];
    }
}

