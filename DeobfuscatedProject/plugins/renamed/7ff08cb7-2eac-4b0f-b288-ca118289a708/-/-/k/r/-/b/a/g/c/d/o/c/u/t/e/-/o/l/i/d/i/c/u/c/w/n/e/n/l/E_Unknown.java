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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.G_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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

public class E_Unknown
implements ab {
    public static final /* synthetic */ int fb;
    public static final /* synthetic */ WorldPoint fd;
    public static final /* synthetic */ WorldPoint fi;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int dy;
    static /* synthetic */ WorldArea fj;
    public static final /* synthetic */ WorldPoint fe;
    public static final /* synthetic */ int eZ;
    public static final /* synthetic */ WorldPoint fg;
    public static final /* synthetic */ int fa;
    public static final /* synthetic */ WorldPoint fh;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ int fc;
    public static final /* synthetic */ WorldPoint ff;
    private static /* synthetic */ int[] llIIIllIl;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ String[] llIIIllII;
    static /* synthetic */ int dk;
    static /* synthetic */ String[] cG;

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
            0;
            if (2 > -1) return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = llIIIllIl[1];
        return n2 != 0;
    }

    private static String lIlIIllIlllI(String lIllIlIllIIlIl, String lIllIlIllIIlII) {
        lIllIlIllIIlIl = new String(Base64.getDecoder().decode(lIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIllIIIll = new StringBuilder();
        char[] lIllIlIllIIIlI = lIllIlIllIIlII.toCharArray();
        int lIllIlIllIIIIl = llIIIllIl[1];
        char[] lIllIlIlIllIll = lIllIlIllIIlIl.toCharArray();
        int lIllIlIlIllIlI = lIllIlIlIllIll.length;
        int lIllIlIlIllIIl = llIIIllIl[1];
        while (E.lIlIIlllIIll(lIllIlIlIllIIl, lIllIlIlIllIlI)) {
            char lIllIlIllIIllI = lIllIlIlIllIll[lIllIlIlIllIIl];
            lIllIlIllIIIll.append((char)(lIllIlIllIIllI ^ lIllIlIllIIIlI[lIllIlIllIIIIl % lIllIlIllIIIlI.length]));
            0;
            ++lIllIlIllIIIIl;
            ++lIllIlIlIllIIl;
            0;
            if (1 == 1) continue;
            return null;
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
            0;
            
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
            0;
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
                        0;
                    }
                    if (E.lIlIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[7]];
                        if (E.lIlIIllllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIllIl[8]);
                            0;
                        }
                        if (E.lIlIIllllIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIllIl[7]);
                            0;
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
                0;
            }
            int[] nArray = new int[llIIIllIl[0]];
            nArray[E.llIIIllIl[1]] = llIIIllIl[9];
            if (E.lIlIIlllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && E.lIlIIllllIIl(E.lIlIIlllIIIl(e.w(), 60.0))) {
                int[] nArray5 = new int[llIIIllIl[0]];
                nArray5[E.llIIIllIl[1]] = llIIIllIl[9];
                Inventory.getFirst((int[])nArray5).interact(llIIIllII[llIIIllIl[12]]);
                Time.sleepTicks((int)llIIIllIl[0]);
                0;
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
                0;
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
                        0;
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
                            0;
                        }
                        if (E.lIlIIlllIlll(lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                            Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);
                            0;
                        }
                        if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                            Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);
                            0;
                        }
                        lIllIlIllllIlI = new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1]);
                        if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIllIlIllllIlI) ? 1 : 0)) {
                            e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                            Time.sleepTicks((int)e.c(llIIIllIl[5], llIIIllIl[28]));
                            0;
                        }
                        if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0) && E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[37], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)fh);
                            0;
                            Time.sleepTicks((int)llIIIllIl[0]);
                            0;
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
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[llIIIllIl[0]];
                            stringArray4[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[41]];
                            lIllIlIllllIll = TileItems.getNearest((String[])stringArray4);
                            if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                                lIllIlIllllIll.interact(llIIIllII[llIIIllIl[50]]);
                                Time.sleepTicks((int)llIIIllIl[0]);
                                0;
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
                                0;
                            }
                        }
                        String[] stringArray8 = new String[llIIIllIl[0]];
                        stringArray8[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[54]];
                        if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray8))) {
                            String[] stringArray9 = new String[llIIIllIl[0]];
                            stringArray9[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[55]];
                            TileObjects.getNearest((String[])stringArray9).interact(llIIIllII[llIIIllIl[56]]);
                            Time.sleepTicks((int)llIIIllIl[8]);
                            0;
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
                            0;
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
                                0;
                                dy += llIIIllIl[0];
                            }
                            if (E.lIlIIlllIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray17 = new String[llIIIllIl[0]];
                                stringArray17[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[68]];
                                String[] stringArray18 = new String[llIIIllIl[0]];
                                stringArray18[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[69]];
                                Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                                Time.sleepTicks((int)llIIIllIl[11]);
                                0;
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
                    0;
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
                    0;
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
                        0;
                    }
                }
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[12]) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[81]];
                    Movement.walkTo((WorldPoint)fi);
                    0;
                    Time.sleepTicks((int)llIIIllIl[0]);
                    0;
                }
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[82]];
                if (E.lIlIIlllIlll(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[llIIIllIl[0]];
                    stringArray24[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[83]];
                    TileObjects.getNearest((String[])stringArray24).interact(llIIIllII[llIIIllIl[84]]);
                    Time.sleepTicks((int)llIIIllIl[11]);
                    0;
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
                        0;
                    }
                }
                if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[89]];
                    Movement.walkTo((WorldPoint)ff);
                    0;
                    Time.sleepTicks((int)llIIIllIl[0]);
                    0;
                    lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]);
                    if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                        Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);
                        0;
                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                        Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);
                        0;
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
                        0;
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
                    0;
                }
                String[] stringArray25 = new String[llIIIllIl[0]];
                stringArray25[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[93]];
                lIllIlIllllIll = TileItems.getNearest((String[])stringArray25);
                if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                    lIllIlIllllIll.interact(llIIIllII[llIIIllIl[94]]);
                    Time.sleepTicks((int)llIIIllIl[7]);
                    0;
                }
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[22])) {
                if (E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[95]];
                    Movement.walkTo((WorldPoint)fh);
                    0;
                    Time.sleepTicks((int)llIIIllIl[0]);
                    0;
                    lIllIlIlllllII = new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1]);
                    if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(lIllIlIlllllII) ? 1 : 0)) {
                        e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                        Time.sleepTicks((int)e.c(llIIIllIl[5], llIIIllIl[28]));
                        0;
                    }
                    if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                        e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                        Time.sleepTicks((int)llIIIllIl[8]);
                        0;
                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                        Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);
                        0;
                    }
                    if (E.lIlIIlllIlll(lIllIlIllllIlI = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                        Mouse.click((int)lIllIlIllllIlI.getClickPoint().getX(), (int)lIllIlIllllIlI.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                        Time.sleepTicks((int)llIIIllIl[11]);
                        0;
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
                        0;
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
                        0;
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
                    0;
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
                            0;
                            Time.sleepTicks((int)llIIIllIl[0]);
                            0;
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
                0;
            }
            if (E.lIlIIlllIllI(e.j(llIIIllIl[4]), llIIIllIl[95])) {
                String[] stringArray = new String[llIIIllIl[0]];
                stringArray[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[116]];
                if (E.lIlIIlllllII(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray20 = new int[llIIIllIl[0]];
                    nArray20[E.llIIIllIl[1]] = llIIIllIl[117];
                    TileObjects.getNearest((int[])nArray20).interact(llIIIllII[llIIIllIl[118]]);
                    Time.sleepTicks((int)llIIIllIl[8]);
                    0;
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
                        0;
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
                            0;
                        }
                    }
                }
                if (E.lIlIIlllIlII(Players.getLocal().getWorldLocation().equals((Object)ff) ? 1 : 0) && E.lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    String[] stringArray39 = new String[llIIIllIl[0]];
                    stringArray39[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[132]];
                    if (E.lIlIIlllllII(TileObjects.getNearest((String[])stringArray39))) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[133]];
                        Movement.walkTo((WorldPoint)ff);
                        0;
                        Time.sleepTicks((int)llIIIllIl[0]);
                        0;
                        lIllIlIlllllII = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]);
                        if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                            Mouse.click((int)lIllIlIlllllII.getClickPoint().getX(), (int)lIllIlIlllllII.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);
                            0;
                        }
                        if (E.lIlIIlllIlll(lIllIlIllllIll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                            Mouse.click((int)lIllIlIllllIll.getClickPoint().getX(), (int)lIllIlIllllIll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                            Time.sleepTicks((int)llIIIllIl[11]);
                            0;
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
                        0;
                    }
                }
                String[] stringArray40 = new String[llIIIllIl[0]];
                stringArray40[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[136]];
                lIllIlIlllllII = TileObjects.getNearest((String[])stringArray40);
                if (E.lIlIIlllIlll(lIllIlIlllllII)) {
                    lIllIlIlllllII.interact(llIIIllII[llIIIllIl[137]]);
                    Time.sleepTicks((int)llIIIllIl[7]);
                    0;
                }
                String[] stringArray41 = new String[llIIIllIl[0]];
                stringArray41[E.llIIIllIl[1]] = llIIIllII[llIIIllIl[138]];
                lIllIlIllllIll = TileItems.getNearest((String[])stringArray41);
                if (E.lIlIIlllIlll(lIllIlIllllIll)) {
                    lIllIlIllllIll.interact(llIIIllII[llIIIllIl[139]]);
                    Time.sleepTicks((int)llIIIllIl[7]);
                    0;
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
                        0;
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
                    0;
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
                    0;
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
                    0;
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
                            0;
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
                    d d2 = new d(llIIIllIl[20], llIIIllIl[0], llIIIllIl[169]);
                    bx.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIIIllIl[0]];
                nArray2[E.llIIIllIl[1]] = llIIIllIl[18];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIllIlIlllIIll = new d(llIIIllIl[18], llIIIllIl[0], llIIIllIl[170]);
                    bx.add((d)lIllIlIlllIIll);
                    0;
                }
                int[] nArray3 = new int[llIIIllIl[0]];
                nArray3[E.llIIIllIl[1]] = llIIIllIl[14];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIllIlIlllIIll = new d(llIIIllIl[14], llIIIllIl[10], e.c(llIIIllIl[171], llIIIllIl[172]));
                    bx.add((d)lIllIlIlllIIll);
                    0;
                }
                int[] nArray4 = new int[llIIIllIl[0]];
                nArray4[E.llIIIllIl[1]] = llIIIllIl[16];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIllIlIlllIIll = new d(llIIIllIl[16], llIIIllIl[11], llIIIllIl[173]);
                    bx.add((d)lIllIlIlllIIll);
                    0;
                }
                int[] nArray5 = new int[llIIIllIl[0]];
                nArray5[E.llIIIllIl[1]] = llIIIllIl[17];
                if (E.lIlIIlllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lIllIlIlllIIll = new d(llIIIllIl[17], llIIIllIl[5], j.ch);
                    bx.add((d)lIllIlIlllIIll);
                    0;
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
            lIllIlIlllIIll = new d(llIIIllIl[9], llIIIllIl[61], llIIIllIl[174]);
            bx.add((d)lIllIlIlllIIll);
            0;
        }
        int[] nArray = new int[llIIIllIl[0]];
        nArray[E.llIIIllIl[1]] = llIIIllIl[15];
        if (E.lIlIIlllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIllIlIlllIIll = new d(llIIIllIl[15], llIIIllIl[0], llIIIllIl[169]);
            bx.add((d)lIllIlIlllIIll);
            0;
        }
        if (E.lIlIIlllIlII(Bank.contains((Predicate)(lIllIlIlllIIll = item -> item.getName().toLowerCase().contains(llIIIllII[llIIIllIl[179]]))) ? 1 : 0)) {
            lIllIlIlllIIlI = new d(llIIIllIl[175], llIIIllIl[5], llIIIllIl[176]);
            bx.add(lIllIlIlllIIlI);
            0;
        }
        int[] nArray9 = new int[llIIIllIl[0]];
        nArray9[E.llIIIllIl[1]] = llIIIllIl[13];
        if (E.lIlIIlllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIllIlIlllIIlI = new d(llIIIllIl[13], llIIIllIl[71], llIIIllIl[177]);
            bx.add(lIllIlIlllIIlI);
            0;
        }
    }

    private static String lIlIIllIllII(String lIllIlIlIIlllI, String lIllIlIlIIllll) {
        try {
            SecretKeySpec lIllIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lIllIlIlIlIIlI.init(llIIIllIl[7], lIllIlIlIlIIll);
            return new String(lIllIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lIllIlIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIlIIIl) {
            lIllIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIllll() {
        llIIIllII = new String[llIIIllIl[211]];
        E.llIIIllII[E.llIIIllIl[1]] = E."Finished buying items, switching back to quest";
        E.llIIIllII[E.llIIIllIl[0]] = E."Nav to bank";
        E.llIIIllII[E.llIIIllIl[7]] = E."Handling banking";
        E.llIIIllII[E.llIIIllIl[11]] = E."We are missing quest supplies, switching to BUYING";
        E.llIIIllII[E.llIIIllIl[8]] = E."We are missing quest supplies, switching to BUYING";
        E.llIIIllII[E.llIIIllIl[5]] = E."Drink";
        E.llIIIllII[E.llIIIllIl[12]] = E."Eat";
        E.llIIIllII[E.llIIIllIl[21]] = E."Gate";
        E.llIIIllII[E.llIIIllIl[28]] = E."Open";
        E.llIIIllII[E.llIIIllIl[32]] = E."Using salve tele";
        E.llIIIllII[E.llIIIllIl[10]] = E."Break";
        E.llIIIllII[E.llIIIllIl[34]] = E."Nav to grotto";
        E.llIIIllII[E.llIIIllIl[46]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[47]] = E."Getting mirror";
        E.llIIIllII[E.llIIIllIl[48]] = E."Washing bowl";
        E.llIIIllII[E.llIIIllIl[29]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[49]] = E."Take";
        E.llIIIllII[E.llIIIllIl[41]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[50]] = E."Take";
        E.llIIIllII[E.llIIIllIl[51]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[30]] = E."Journal";
        E.llIIIllII[E.llIIIllIl[52]] = E."Grotto tree";
        E.llIIIllII[E.llIIIllIl[53]] = E."Search";
        E.llIIIllII[E.llIIIllIl[54]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[55]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[56]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[57]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[58]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[59]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[60]] = E."Journal";
        E.llIIIllII[E.llIIIllIl[61]] = E."Wear";
        E.llIIIllII[E.llIIIllIl[62]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[63]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[64]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[65]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[66]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[67]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[68]] = E."Mirror";
        E.llIIIllII[E.llIIIllIl[69]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[70]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[71]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[72]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[73]] = E."Journal";
        E.llIIIllII[E.llIIIllIl[74]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[75]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[76]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[77]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[78]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[79]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[80]] = E."Breaking tab";
        E.llIIIllII[E.llIIIllIl[22]] = E."Break";
        E.llIIIllII[E.llIIIllIl[81]] = E."Nav to priest";
        E.llIIIllII[E.llIIIllIl[82]] = E."Trapdoor";
        E.llIIIllII[E.llIIIllIl[83]] = E."Trapdoor";
        E.llIIIllII[E.llIIIllIl[84]] = E."Open";
        E.llIIIllII[E.llIIIllIl[85]] = E."Interact priest";
        E.llIIIllII[E.llIIIllIl[86]] = E."Drezel";
        E.llIIIllII[E.llIIIllIl[87]] = E."Breaking tab";
        E.llIIIllII[E.llIIIllIl[88]] = E."Break";
        E.llIIIllII[E.llIIIllIl[89]] = E."Nav to log";
        E.llIIIllII[E.llIIIllIl[3]] = E."Cast";
        E.llIIIllII[E.llIIIllIl[91]] = E."Fungi on log";
        E.llIIIllII[E.llIIIllIl[92]] = E."Pick";
        E.llIIIllII[E.llIIIllIl[93]] = E."Fungi on log";
        E.llIIIllII[E.llIIIllIl[94]] = E."Pick";
        E.llIIIllII[E.llIIIllIl[95]] = E."Nav to grotto";
        E.llIIIllII[E.llIIIllIl[96]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[97]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[98]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[99]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[100]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[101]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[102]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[103]] = E."Solving puzzle";
        E.llIIIllII[E.llIIIllIl[104]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[106]] = E."A used spell";
        E.llIIIllII[E.llIIIllIl[107]] = E."A used spell";
        E.llIIIllII[E.llIIIllIl[109]] = E."A used spell";
        E.llIIIllII[E.llIIIllIl[110]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[112]] = E."Talking to filliman";
        E.llIIIllII[E.llIIIllIl[113]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[114]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[115]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[116]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[118]] = E."Search";
        E.llIIIllII[E.llIIIllIl[119]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[120]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[121]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[122]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[123]] = E."Search";
        E.llIIIllII[E.llIIIllIl[124]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[125]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[126]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[127]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[128]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[129]] = E."Druid pouch";
        E.llIIIllII[E.llIIIllIl[130]] = E."Breaking tab";
        E.llIIIllII[E.llIIIllIl[131]] = E."Break";
        E.llIIIllII[E.llIIIllIl[132]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[133]] = E."Nav to log";
        E.llIIIllII[E.llIIIllIl[135]] = E."Cast Bloom";
        E.llIIIllII[E.llIIIllIl[136]] = E."Fungi on log";
        E.llIIIllII[E.llIIIllIl[137]] = E."Pick";
        E.llIIIllII[E.llIIIllIl[138]] = E."Fungi on log";
        E.llIIIllII[E.llIIIllIl[139]] = E."Pick";
        E.llIIIllII[E.llIIIllIl[140]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[141]] = E."Druid pouch";
        E.llIIIllII[E.llIIIllIl[142]] = E."Druid pouch";
        E.llIIIllII[E.llIIIllIl[143]] = E."Fill";
        E.llIIIllII[E.llIIIllIl[144]] = E."Wield";
        E.llIIIllII[E.llIIIllIl[145]] = E."Ghast";
        E.llIIIllII[E.llIIIllIl[146]] = E."Drink";
        E.llIIIllII[E.llIIIllIl[147]] = E."Using druid pouch on ghast";
        E.llIIIllII[E.llIIIllIl[148]] = E."Druid pouch";
        E.llIIIllII[E.llIIIllIl[149]] = E."Ghast";
        E.llIIIllII[E.llIIIllIl[150]] = E."Killing ghasts";
        E.llIIIllII[E.llIIIllIl[151]] = E."Killing ghasts, no interacting";
        E.llIIIllII[E.llIIIllIl[152]] = E."Attack";
        E.llIIIllII[E.llIIIllIl[153]] = E."Grotto";
        E.llIIIllII[E.llIIIllIl[154]] = E."Enter";
        E.llIIIllII[E.llIIIllIl[155]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[156]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[157]] = E."Search";
        E.llIIIllII[E.llIIIllIl[158]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[159]] = E."Filliman Tarlock";
        E.llIIIllII[E.llIIIllIl[160]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[161]] = E."Nature Spirit";
        E.llIIIllII[E.llIIIllIl[162]] = E."Nav to grotto";
        E.llIIIllII[E.llIIIllIl[163]] = E."Salve graveyard teleport";
        E.llIIIllII[E.llIIIllIl[164]] = E."Silver sickle";
        E.llIIIllII[E.llIIIllIl[165]] = E."Silver sickle";
        E.llIIIllII[E.llIIIllIl[166]] = E."Mort myre fungus";
        E.llIIIllII[E.llIIIllIl[167]] = E."";
        E.llIIIllII[E.llIIIllIl[168]] = E."";
        E.llIIIllII[E.llIIIllIl[178]] = E."Nature spirit";
        E.llIIIllII[E.llIIIllIl[179]] = E."ring of wealth (";
        E.llIIIllII[E.llIIIllIl[180]] = E."Prayer";
        E.llIIIllII[E.llIIIllIl[181]] = E."Attack";
        E.llIIIllII[E.llIIIllIl[192]] = E."I'm looking for a quest!";
        E.llIIIllII[E.llIIIllIl[193]] = E."Yes.";
        E.llIIIllII[E.llIIIllIl[31]] = E."Ok, let me help then.";
        E.llIIIllII[E.llIIIllIl[194]] = E."Yep, now tell me what the problem is.";
        E.llIIIllII[E.llIIIllIl[195]] = E."Sure.";
        E.llIIIllII[E.llIIIllIl[196]] = E."You're right, we don't.";
        E.llIIIllII[E.llIIIllIl[197]] = E."Is there anything else interesting to do around here?";
        E.llIIIllII[E.llIIIllIl[198]] = E."Well, what is it, I may be able to help?";
        E.llIIIllII[E.llIIIllIl[199]] = E."Yes, I'll go and look for him.";
        E.llIIIllII[E.llIIIllIl[200]] = E."Yes, I'm sure.";
        E.llIIIllII[E.llIIIllIl[201]] = E."I'll get going.";
        E.llIIIllII[E.llIIIllIl[202]] = E."I think I've solved the puzzle!";
        E.llIIIllII[E.llIIIllIl[203]] = E."How can I help?";
        E.llIIIllII[E.llIIIllIl[204]] = E."Roald sent me to check on Drezel.";
        E.llIIIllII[E.llIIIllIl[205]] = E."Why is the river such a good defence?";
        E.llIIIllII[E.llIIIllIl[206]] = E."You're right, we don't.";
        E.llIIIllII[E.llIIIllIl[207]] = E."Yes, of course.";
        E.llIIIllII[E.llIIIllIl[208]] = E."Do you know of anything I can do in Morytania?";
        E.llIIIllII[E.llIIIllIl[209]] = E."How long have you been a ghost?";
        E.llIIIllII[E.llIIIllIl[210]] = E."What's this pouch for?";
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
                0;
                if ((0xB4 ^ 0xB0) > -1) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIllIl[1];
        return n2 != 0;
    }

    private static String lIlIIllIllIl(String lIllIlIlIIIIIl, String lIllIlIlIIIIlI) {
        try {
            SecretKeySpec lIllIlIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIllIl[28]), "DES");
            Cipher lIllIlIlIIIlIl = Cipher.getInstance("DES");
            lIllIlIlIIIlIl.init(llIIIllIl[7], lIllIlIlIIIllI);
            return new String(lIllIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lIllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIIIlII) {
            lIllIlIlIIIlII.printStackTrace();
            return null;
        }
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
            0;
            Time.sleepTicks((int)llIIIllIl[0]);
            0;
            if (E.lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                Time.sleepTicks((int)llIIIllIl[8]);
                0;
            }
            if (E.lIlIIlllIlll(lIllIlIlllIlll = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[30]))) {
                Mouse.click((int)lIllIlIlllIlll.getClickPoint().getX(), (int)lIllIlIlllIlll.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                Time.sleepTicks((int)llIIIllIl[11]);
                0;
            }
            if (E.lIlIIlllIlll(lIllIlIlllIllI = Widgets.get((int)llIIIllIl[40], (int)llIIIllIl[41]))) {
                Mouse.click((int)lIllIlIlllIllI.getClickPoint().getX(), (int)lIllIlIlllIllI.getClickPoint().getY(), (boolean)llIIIllIl[0]);
                Time.sleepTicks((int)llIIIllIl[11]);
                0;
            }
        }
    }

    private static boolean lIlIIlllIlll(Object object) {
        return object != null;
    }

    private static void lIlIIlllIIII() {
        llIIIllIl = new int[212];
        E.llIIIllIl[0] = 1;
        E.llIIIllIl[1] = (124 + 58 - 73 + 19 ^ 163 + 74 - 141 + 80) & (146 + 55 - 195 + 177 ^ 8 + 114 - 51 + 64 ^ -1);
        E.llIIIllIl[2] = 0xFFFFBB7F & 0x45AE;
        E.llIIIllIl[3] = 0x74 ^ 0x48;
        E.llIIIllIl[4] = 0xFFFF9137 & 0x6FFB;
        E.llIIIllIl[5] = 0x62 ^ 0x67;
        E.llIIIllIl[6] = 0xFFFFFFAE & 0x13D9;
        E.llIIIllIl[7] = 2;
        E.llIIIllIl[8] = 0x97 ^ 0x93;
        E.llIIIllIl[9] = -(0xFFFFBA95 & 0x6FEF) & (0xFFFFBFFF & 0x6BFF);
        E.llIIIllIl[10] = 0xCF ^ 0xC5;
        E.llIIIllIl[11] = 3;
        E.llIIIllIl[12] = 147 + 13 - 36 + 56 ^ 23 + 83 - 41 + 113;
        E.llIIIllIl[13] = 0xFFFFDFEF & 0x3F57;
        E.llIIIllIl[14] = -(0xFFFFFB3F & 0x37DD) & (0xFFFFFFBF & Short.MAX_VALUE);
        E.llIIIllIl[15] = -(0xFFFFE4DF & 0x1F23) & (0xFFFFAF9B & 0x5FF7);
        E.llIIIllIl[16] = -(0xFFFFDC37 & 0x63CD) & (0xFFFFEF9E & 0x5BFF);
        E.llIIIllIl[17] = 0xFFFFFDFF & 0x3351;
        E.llIIIllIl[18] = 0xFFFFD9BA & 0x2FC7;
        E.llIIIllIl[19] = 0xFFFFAABD & 0x576A;
        E.llIIIllIl[20] = -(0xFFFFFA9D & 0xFE7) & (0xFFFF8FF7 & 0x7FBF);
        E.llIIIllIl[21] = 0x74 ^ 0x57 ^ (0x67 ^ 0x43);
        E.llIIIllIl[22] = 0x8E ^ 0xBC;
        E.llIIIllIl[23] = -(0xFFFFBBFA & 0x6697) & (0xFFFFBFFB & 0x6FFD);
        E.llIIIllIl[24] = -(0xFFFFF7EE & 0x4A71) & (0xFFFFDFDF & 0x6FFF);
        E.llIIIllIl[25] = 0xFFFF9DFD & 0x6F6B;
        E.llIIIllIl[26] = -(0xFFFFFBCB & 0x7636) & (0xFFFFFFEF & 0x7F7B);
        E.llIIIllIl[27] = -(0xFFFF927D & 0x7F93) & (0xFFFFBFFB & 0x5F7F);
        E.llIIIllIl[28] = 0xA9 ^ 0x9E ^ (0xA0 ^ 0x9F);
        E.llIIIllIl[29] = 0x14 ^ 0x4B ^ (0xFB ^ 0xAB);
        E.llIIIllIl[30] = 0x5C ^ 0x48;
        E.llIIIllIl[31] = (0xA ^ 0x57) + (0x98 ^ 0xC3) - (0xDB ^ 0x95) + (9 ^ 0x2B);
        E.llIIIllIl[32] = 116 + 1 - 104 + 169 ^ 122 + 34 - 2 + 37;
        E.llIIIllIl[33] = -1;
        E.llIIIllIl[34] = 31 + 35 - 25 + 106 ^ 112 + 90 - 67 + 17;
        E.llIIIllIl[35] = 0xFFFFEDFF & 0x1F74;
        E.llIIIllIl[36] = 0xFFFFBF89 & 0x4DF7;
        E.llIIIllIl[37] = -(0xFFFFB391 & 0x7EEF) & (0xFFFFFFF7 & 0x3FFB);
        E.llIIIllIl[38] = 0xFFFFBF7F & 0x4DED;
        E.llIIIllIl[39] = 0xFFFF9DFD & 0x6F7F;
        E.llIIIllIl[40] = -(0xFFFF9B3F & 0x7DF3) & (0xFFFF9BF6 & 0x7F7F);
        E.llIIIllIl[41] = 0x67 ^ 0x76;
        E.llIIIllIl[42] = 0xFFFFCD7E & 0x3FE5;
        E.llIIIllIl[43] = 0xFFFFBDF7 & 0x4F0B;
        E.llIIIllIl[44] = -(0xFFFFF61F & 0x79E7) & (0xFFFFFDF7 & 0x7F7F);
        E.llIIIllIl[45] = 0xFFFFCDFF & 0x3EFF;
        E.llIIIllIl[46] = 0x98 ^ 0x8E ^ (0x1A ^ 0);
        E.llIIIllIl[47] = 3 ^ (0x9B ^ 0x95);
        E.llIIIllIl[48] = 0x5C ^ 0x52;
        E.llIIIllIl[49] = 0xB8 ^ 0xA8;
        E.llIIIllIl[50] = 0x57 ^ 0x2E ^ (0x71 ^ 0x1A);
        E.llIIIllIl[51] = 0x80 ^ 0x93;
        E.llIIIllIl[52] = 0xB9 ^ 0xAC;
        E.llIIIllIl[53] = 64 + 111 - 131 + 128 ^ 160 + 93 - 176 + 109;
        E.llIIIllIl[54] = 67 + 68 - 4 + 27 ^ 52 + 61 - -1 + 23;
        E.llIIIllIl[55] = 0x67 ^ 0x7F;
        E.llIIIllIl[56] = 0x70 ^ 0x31 ^ (0x6C ^ 0x34);
        E.llIIIllIl[57] = 107 + 107 - 51 + 14 ^ 55 + 121 - 7 + 2;
        E.llIIIllIl[58] = 0x9D ^ 0x86;
        E.llIIIllIl[59] = 0x61 ^ 0x7D;
        E.llIIIllIl[60] = 0xD8 ^ 0xC5;
        E.llIIIllIl[61] = 0x57 ^ 0x49;
        E.llIIIllIl[62] = 0x68 ^ 0x77;
        E.llIIIllIl[63] = (0x78 ^ 0x23) & ~(0x32 ^ 0x69) ^ (0xB7 ^ 0x97);
        E.llIIIllIl[64] = 0x79 ^ 1 ^ (8 ^ 0x51);
        E.llIIIllIl[65] = 0x93 ^ 0xB1;
        E.llIIIllIl[66] = 0x77 ^ 0x54;
        E.llIIIllIl[67] = 0x29 ^ 0x4D ^ (0x42 ^ 2);
        E.llIIIllIl[68] = 189 + 36 - 6 + 5 ^ 105 + 77 - 123 + 138;
        E.llIIIllIl[69] = 0x68 ^ 0x4E;
        E.llIIIllIl[70] = 0x63 ^ 0x27 ^ (0x1C ^ 0x7F);
        E.llIIIllIl[71] = 0x7C ^ 5 ^ (0xE4 ^ 0xB5);
        E.llIIIllIl[72] = 0x60 ^ 0x49;
        E.llIIIllIl[73] = 0xB3 ^ 0x99;
        E.llIIIllIl[74] = 0x85 ^ 0xAE;
        E.llIIIllIl[75] = 0xB8 ^ 0x94;
        E.llIIIllIl[76] = 0x6D ^ 0x40;
        E.llIIIllIl[77] = 0x52 ^ 0x7C;
        E.llIIIllIl[78] = 0x75 ^ 0x5A;
        E.llIIIllIl[79] = 0x37 ^ 0x16 ^ (0x8D ^ 0x9C);
        E.llIIIllIl[80] = 82 + 111 - 176 + 166 ^ 29 + 41 - -9 + 55;
        E.llIIIllIl[81] = 0x73 ^ 0x40;
        E.llIIIllIl[82] = 65 + 131 - 124 + 100 ^ 145 + 137 - 132 + 2;
        E.llIIIllIl[83] = 0x9F ^ 0xAA;
        E.llIIIllIl[84] = 0x4C ^ 7 ^ (0x36 ^ 0x4B);
        E.llIIIllIl[85] = 0xB5 ^ 0x82;
        E.llIIIllIl[86] = 134 + 164 - 212 + 82 ^ 60 + 57 - -6 + 21;
        E.llIIIllIl[87] = 0x21 ^ 0x18;
        E.llIIIllIl[88] = 0xA ^ 0x30;
        E.llIIIllIl[89] = 0x8C ^ 0xB6 ^ 1;
        E.llIIIllIl[90] = -(0xFFFFFEDE & 0x2163) & (0xFFFFBFDF & 0x6BF9);
        E.llIIIllIl[91] = 0x67 ^ 0x5A;
        E.llIIIllIl[92] = 0xE1 ^ 0xA1 ^ (0x30 ^ 0x4E);
        E.llIIIllIl[93] = 50 + 82 - 9 + 14 ^ 58 + 12 - 15 + 127;
        E.llIIIllIl[94] = 0xF8 ^ 0xB8;
        E.llIIIllIl[95] = 0x1F ^ 0x5E;
        E.llIIIllIl[96] = 0xD7 ^ 0xBC ^ (0x5D ^ 0x74);
        E.llIIIllIl[97] = 0xC0 ^ 0x83;
        E.llIIIllIl[98] = 18 + 136 - 129 + 209 ^ 5 + 3 - -1 + 165;
        E.llIIIllIl[99] = 8 ^ 0x4D;
        E.llIIIllIl[100] = 0x3A ^ 0x40 ^ (0x33 ^ 0xF);
        E.llIIIllIl[101] = 0xC3 ^ 0x84;
        E.llIIIllIl[102] = 0xE7 ^ 0xAF;
        E.llIIIllIl[103] = 0xCD ^ 0x84;
        E.llIIIllIl[104] = 0x13 ^ 0x59;
        E.llIIIllIl[105] = 0xFFFFEFFF & 0x1DC7;
        E.llIIIllIl[106] = 0x8E ^ 0xC5;
        E.llIIIllIl[107] = 0xE7 ^ 0xAB;
        E.llIIIllIl[108] = -(0xFFFFC637 & 0x7BEB) & (0xFFFFDFEB & 0x6FFF);
        E.llIIIllIl[109] = 0x6D ^ 0x20;
        E.llIIIllIl[110] = 0x1B ^ 0x6A ^ (0xB2 ^ 0x8D);
        E.llIIIllIl[111] = 0xFFFFDFEB & 0x2DDC;
        E.llIIIllIl[112] = 0x7B ^ 0x34;
        E.llIIIllIl[113] = 0xC0 ^ 0x90;
        E.llIIIllIl[114] = 0x1E ^ 0x4F;
        E.llIIIllIl[115] = 0xC5 ^ 0xB1 ^ (0x2E ^ 8);
        E.llIIIllIl[116] = 0x62 ^ 0x31;
        E.llIIIllIl[117] = 0xFFFFFDC1 & 0xFFE;
        E.llIIIllIl[118] = 0xB7 ^ 0x8C ^ (0x35 ^ 0x5A);
        E.llIIIllIl[119] = 0x70 ^ 0x25;
        E.llIIIllIl[120] = 0x5C ^ 0xA;
        E.llIIIllIl[121] = 0x73 ^ 0x24;
        E.llIIIllIl[122] = 0xDE ^ 0x86;
        E.llIIIllIl[123] = 0xA1 ^ 0xBC ^ (0xC2 ^ 0x86);
        E.llIIIllIl[124] = 40 + 7 - -115 + 88 ^ 133 + 75 - 132 + 84;
        E.llIIIllIl[125] = 0xA ^ 0x71 ^ (0xB7 ^ 0x97);
        E.llIIIllIl[126] = 0x51 ^ 0x21 ^ (3 ^ 0x2F);
        E.llIIIllIl[127] = 99 + 73 - 163 + 240 ^ 75 + 35 - 1 + 55;
        E.llIIIllIl[128] = 0x53 ^ 0xD;
        E.llIIIllIl[129] = 0x54 ^ 0xB;
        E.llIIIllIl[130] = 0x32 ^ 0x52;
        E.llIIIllIl[131] = 0x20 ^ 0x41;
        E.llIIIllIl[132] = 0x25 ^ 0x47;
        E.llIIIllIl[133] = 8 ^ 0x6B;
        E.llIIIllIl[134] = -(0xFFFFDDA5 & 0x365F) & (0xFFFFDF97 & 0x3FFF);
        E.llIIIllIl[135] = 0x62 ^ 6;
        E.llIIIllIl[136] = 0xEB ^ 0xB7 ^ (0x28 ^ 0x11);
        E.llIIIllIl[137] = 0x5D ^ 0x3B;
        E.llIIIllIl[138] = 89 + 109 - 19 + 42 ^ 178 + 43 - 54 + 19;
        E.llIIIllIl[139] = 57 + 22 - 52 + 210 ^ 66 + 99 - 69 + 37;
        E.llIIIllIl[140] = 184 + 59 - 217 + 190 ^ 40 + 54 - 63 + 146;
        E.llIIIllIl[141] = 0x56 ^ 0x3C;
        E.llIIIllIl[142] = 0x7B ^ 0x40 ^ (0xFC ^ 0xAC);
        E.llIIIllIl[143] = 0xAB ^ 0xC7;
        E.llIIIllIl[144] = 0x38 ^ 0x55;
        E.llIIIllIl[145] = 0x19 ^ 0x77;
        E.llIIIllIl[146] = 0xF ^ 0x60;
        E.llIIIllIl[147] = 0x20 ^ 0x50;
        E.llIIIllIl[148] = 153 + 57 - 68 + 89 ^ 26 + 26 - -77 + 21;
        E.llIIIllIl[149] = 3 ^ 0x10 ^ (0xD6 ^ 0xB7);
        E.llIIIllIl[150] = 200 + 174 - 330 + 193 ^ 119 + 54 - 15 + 0;
        E.llIIIllIl[151] = 0x4E ^ 0x3A;
        E.llIIIllIl[152] = 0xE5 ^ 0x90;
        E.llIIIllIl[153] = 120 + 63 - 115 + 59 ^ (0x31 ^ 0x38);
        E.llIIIllIl[154] = 18 + 194 - 141 + 134 ^ 154 + 163 - 175 + 44;
        E.llIIIllIl[155] = 0xC9 ^ 0x83 ^ (0xF ^ 0x3D);
        E.llIIIllIl[156] = 0x74 ^ 0xD;
        E.llIIIllIl[157] = 0xB ^ 0x71;
        E.llIIIllIl[158] = 0x1B ^ 0x41 ^ (0x9E ^ 0xBF);
        E.llIIIllIl[159] = 0x2E ^ 0x52;
        E.llIIIllIl[160] = 69 + 164 - 113 + 130 ^ 110 + 79 - 155 + 101;
        E.llIIIllIl[161] = 0x70 ^ 0xD ^ 3;
        E.llIIIllIl[162] = (0xC3 ^ 0xB5) + (0x2E ^ 0x5D) - (64 + 90 - 84 + 79) + (0x6C ^ 0x47);
        E.llIIIllIl[163] = 25 + 4 - -59 + 40;
        E.llIIIllIl[164] = (0xAC ^ 0x94) + (0x43 ^ 0x1A) - (0xC0 ^ 0x84) + (0x21 ^ 0x15);
        E.llIIIllIl[165] = 37 + 49 - 36 + 80;
        E.llIIIllIl[166] = (0xCD ^ 0x95) + (0xAC ^ 0x9E) - (0x52 ^ 0x7C) + (0xA1 ^ 0x86);
        E.llIIIllIl[167] = (0x3C ^ 0x37) + (0xD7 ^ 0x83) - -3 + (6 ^ 0x24);
        E.llIIIllIl[168] = 98 + 62 - 66 + 33 + (0x13 ^ 0xA) - (0x3C ^ 0x6C) + (0x87 ^ 0xBA);
        E.llIIIllIl[169] = 0xFFFFAB3B & 0x77EC;
        E.llIIIllIl[170] = 0xFFFFBEB9 & 0x7BDE;
        E.llIIIllIl[171] = 0xFFFFFB9D & 0x1CFE;
        E.llIIIllIl[172] = 0xFFFFDFFC & 0x3C23;
        E.llIIIllIl[173] = 0xFFFFAFFF & 0x53E8;
        E.llIIIllIl[174] = -(0xFFFFF6FF & 0x49D2) & (0xFFFFFDFD & 0x43FF);
        E.llIIIllIl[175] = -(0xFFFFD96D & 0x7793) & (0xFFFFFFDC & 0x7FEF);
        E.llIIIllIl[176] = -(0xFFFF9A47 & 0x6FB9) & (0xFFFFEFFC & 0x7BAB);
        E.llIIIllIl[177] = -(0xFFFFEF6B & 0x34F7) & (0xFFFFE7F7 & 0x3FEE);
        E.llIIIllIl[178] = 88 + 119 - 115 + 42;
        E.llIIIllIl[179] = (0x2F ^ 0x4A) + (0xED ^ 0x8A) - (147 + 44 - 163 + 148) + (0x62 ^ 9);
        E.llIIIllIl[180] = (0xF5 ^ 0xB6) + (75 + 120 - 156 + 90) - (43 + 82 - 122 + 170) + (0x52 ^ 0x23);
        E.llIIIllIl[181] = 12 + 52 - -68 + 5;
        E.llIIIllIl[182] = 0xFFFFAF7B & 0x53BF;
        E.llIIIllIl[183] = 0xFFFF9DA4 & 0x6FDF;
        E.llIIIllIl[184] = 0xFFFFFF7D & 0xDF2;
        E.llIIIllIl[185] = 0xFFFFBFFF & 0x4CFE;
        E.llIIIllIl[186] = 0xFFFFFDFF & 0xF5D;
        E.llIIIllIl[187] = -(0xFFFFD07F & 0x7F91) & (0xFFFFDFFF & 0x7D7F);
        E.llIIIllIl[188] = 0xFFFFEFC9 & 0x363F;
        E.llIIIllIl[189] = -(0xFFFFF9F6 & 0x76DB) & (0xFFFFFFD9 & 0x7DFF);
        E.llIIIllIl[190] = 0xFFFFE7BF & 0x3EE7;
        E.llIIIllIl[191] = 0xFFFF9FEF & 0x6DF7;
        E.llIIIllIl[192] = (7 ^ 0x72) + (0xC7 ^ 0x89) - (51 + 79 - 41 + 86) + (0x40 ^ 0x36);
        E.llIIIllIl[193] = 92 + 138 - 108 + 17;
        E.llIIIllIl[194] = (0xE ^ 0x2C) + (0x1E ^ 9) - -(0xC0 ^ 0xC4) + (0xA ^ 0x5A);
        E.llIIIllIl[195] = (0x64 ^ 0x3E) + (0x31 ^ 0x7A) - (0x3A ^ 0x22) + 1;
        E.llIIIllIl[196] = 112 + 17 - 121 + 135;
        E.llIIIllIl[197] = 81 + 113 - 141 + 91;
        E.llIIIllIl[198] = 24 + 68 - 88 + 141;
        E.llIIIllIl[199] = (0x5D ^ 0x47) + (0x29 ^ 0x61) - -(0x2A ^ 0xE) + (0x1F ^ 0x13);
        E.llIIIllIl[200] = (0xBE ^ 0xB4) + (0x36 ^ 0x56) - (0x5D ^ 4) + (108 + 27 - 33 + 28);
        E.llIIIllIl[201] = 103 + 114 - 149 + 80;
        E.llIIIllIl[202] = (0x52 ^ 0x47) + (87 + 26 - -6 + 17) - (126 + 106 - 116 + 14) + (0x1A ^ 0x60);
        E.llIIIllIl[203] = (0x45 ^ 0x1F) + (6 ^ 0x5A) - (0x33 ^ 0x57) + (0x4D ^ 9);
        E.llIIIllIl[204] = 91 + 147 - 120 + 33;
        E.llIIIllIl[205] = 25 + 135 - 99 + 91;
        E.llIIIllIl[206] = 133 + 135 - 200 + 85;
        E.llIIIllIl[207] = 107 + 15 - 110 + 116 + (0x4D ^ 0x78) - (0xF3 ^ 0xC3) + (0x94 ^ 0x81);
        E.llIIIllIl[208] = 104 + 99 - 172 + 124;
        E.llIIIllIl[209] = 130 + 121 - 250 + 141 + (9 ^ 0x41) - (89 + 51 - 9 + 38) + (0xC7 ^ 0xA8);
        E.llIIIllIl[210] = (0x43 ^ 0x28) + (0x71 ^ 0x65) - -(0x5B ^ 0x42) + (0x9C ^ 0x99);
        E.llIIIllIl[211] = 89 + 41 - 67 + 95;
    }

    private static boolean lIlIIlllIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ae() {
        return llIIIllIl[1];
    }
}

