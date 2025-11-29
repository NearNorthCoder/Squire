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
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s;
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

public class r
implements S {
    static /* synthetic */ int ck;
    static /* synthetic */ WorldArea dh;
    public static final /* synthetic */ WorldPoint dd;
    public static final /* synthetic */ int cZ;
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ String[] llllllIlIl;
    public static final /* synthetic */ WorldPoint de;
    public static final /* synthetic */ int cX;
    public static final /* synthetic */ WorldPoint db;
    public static final /* synthetic */ WorldPoint da;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ int cW;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] llllllIlll;
    public static final /* synthetic */ int cY;
    public static final /* synthetic */ WorldPoint dc;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint df;
    static /* synthetic */ int dg;

    @Override
    public String U() {
        return llllllIlIl[llllllIlll[178]];
    }

    private static boolean llIlIlllllIII(int n2) {
        return n2 < 0;
    }

    private static String llIlIlllIlIII(String lllllllllllllllllIlIIIlIIlIIlIIl, String lllllllllllllllllIlIIIlIIlIIllIl) {
        lllllllllllllllllIlIIIlIIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIlIIlIIllII = new StringBuilder();
        char[] lllllllllllllllllIlIIIlIIlIIlIll = lllllllllllllllllIlIIIlIIlIIllIl.toCharArray();
        int lllllllllllllllllIlIIIlIIlIIlIlI = llllllIlll[1];
        char[] lllllllllllllllllIlIIIlIIlIIIlII = lllllllllllllllllIlIIIlIIlIIlIIl.toCharArray();
        int lllllllllllllllllIlIIIlIIlIIIIll = lllllllllllllllllIlIIIlIIlIIIlII.length;
        int lllllllllllllllllIlIIIlIIlIIIIlI = llllllIlll[1];
        while (r.llIlIllllIIlI(lllllllllllllllllIlIIIlIIlIIIIlI, lllllllllllllllllIlIIIlIIlIIIIll)) {
            char lllllllllllllllllIlIIIlIIlIIllll = lllllllllllllllllIlIIIlIIlIIIlII[lllllllllllllllllIlIIIlIIlIIIIlI];
            lllllllllllllllllIlIIIlIIlIIllII.append((char)(lllllllllllllllllIlIIIlIIlIIllll ^ lllllllllllllllllIlIIIlIIlIIlIll[lllllllllllllllllIlIIIlIIlIIlIlI % lllllllllllllllllIlIIIlIIlIIlIll.length]));
            0;
            ++lllllllllllllllllIlIIIlIIlIIlIlI;
            ++lllllllllllllllllIlIIIlIIlIIIIlI;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIlIIlIIllII);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llIlIllllIlII(e.j(llllllIlll[4]), llllllIlll[145])) {
            bl = llllllIlll[0];
            0;
            if (null != null) {
                return ((117 + 240 - 211 + 97 ^ 40 + 16 - -38 + 76) & (148 + 0 - 9 + 103 ^ 61 + 101 - 148 + 157 ^ -1)) != 0;
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

    private static String llIlIlllIIlll(String lllllllllllllllllIlIIIlIIlIlllII, String lllllllllllllllllIlIIIlIIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIlIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), llllllIlll[28]), "DES");
            Cipher lllllllllllllllllIlIIIlIIllIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIlIIllIIIII.init(llllllIlll[7], lllllllllllllllllIlIIIlIIllIIIIl);
            return new String(lllllllllllllllllIlIIIlIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIlIIlIlllll) {
            lllllllllllllllllIlIIIlIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static void ae() {
        d lllllllllllllllllIlIIIlIIlllIlIl;
        Object lllllllllllllllllIlIIIlIIlllIllI;
        block12: {
            block11: {
                int[] nArray = new int[llllllIlll[0]];
                nArray[r.llllllIlll[1]] = llllllIlll[20];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllllIlll[20], llllllIlll[0], llllllIlll[169]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllllIlll[0]];
                nArray2[r.llllllIlll[1]] = llllllIlll[18];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[18], llllllIlll[0], llllllIlll[170]);
                    bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
                    0;
                }
                int[] nArray3 = new int[llllllIlll[0]];
                nArray3[r.llllllIlll[1]] = llllllIlll[14];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[14], llllllIlll[10], e.c(llllllIlll[171], llllllIlll[172]));
                    bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
                    0;
                }
                int[] nArray4 = new int[llllllIlll[0]];
                nArray4[r.llllllIlll[1]] = llllllIlll[16];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[16], llllllIlll[11], llllllIlll[173]);
                    bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
                    0;
                }
                int[] nArray5 = new int[llllllIlll[0]];
                nArray5[r.llllllIlll[1]] = llllllIlll[17];
                if (r.llIlIllllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[17], llllllIlll[5], i.bp);
                    bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
                    0;
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
            lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[9], llllllIlll[61], llllllIlll[174]);
            bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
            0;
        }
        int[] nArray = new int[llllllIlll[0]];
        nArray[r.llllllIlll[1]] = llllllIlll[15];
        if (r.llIlIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllIlIIIlIIlllIllI = new d(llllllIlll[15], llllllIlll[0], llllllIlll[169]);
            bu.add((d)lllllllllllllllllIlIIIlIIlllIllI);
            0;
        }
        if (r.llIlIllllIIll(Bank.contains((Predicate)(lllllllllllllllllIlIIIlIIlllIllI = item -> item.getName().toLowerCase().contains(llllllIlIl[llllllIlll[179]]))) ? 1 : 0)) {
            lllllllllllllllllIlIIIlIIlllIlIl = new d(llllllIlll[175], llllllIlll[5], llllllIlll[176]);
            bu.add(lllllllllllllllllIlIIIlIIlllIlIl);
            0;
        }
        int[] nArray9 = new int[llllllIlll[0]];
        nArray9[r.llllllIlll[1]] = llllllIlll[13];
        if (r.llIlIllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllllllllllllllllIlIIIlIIlllIlIl = new d(llllllIlll[13], llllllIlll[71], llllllIlll[177]);
            bu.add(lllllllllllllllllIlIIIlIIlllIlIl);
            0;
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
            WorldPoint lllllllllllllllllIlIIIlIIlllllIl;
            TileItem lllllllllllllllllIlIIIlIIllllllI;
            Object lllllllllllllllllIlIIIlIIlllllll;
            BankLocation lllllllllllllllllIlIIIlIlIIIIIll;
            if (!r.llIlIllllIlII(e.j(llllllIlll[2]), llllllIlll[3]) || r.llIlIllllIIlI(e.j(llllllIlll[4]), llllllIlll[5])) {
                s.bc();
            }
            if (r.llIlIllllIIll(r.ba() ? 1 : 0) && r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[5]) && r.llIlIllllIlII(e.j(llllllIlll[2]), llllllIlll[3])) {
                lllllllllllllllllIlIIIlIlIIIIIll = BankLocation.getNearest();
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIlIIIIIll) && r.llIlIllllIIll(lllllllllllllllllIlIIIlIlIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[0]];
                    a.a(lllllllllllllllllIlIIIlIlIIIIIll);
                }
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIlIIIIIll) && r.llIlIllllIIIl(lllllllllllllllllIlIIIlIlIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.llIlIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIlll[6]);
                        0;
                    }
                    if (r.llIlIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[7]];
                        if (r.llIlIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllIlll[8]);
                            0;
                        }
                        if (r.llIlIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllllIlll[7]);
                            0;
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
                0;
            }
            int[] nArray = new int[llllllIlll[0]];
            nArray[r.llllllIlll[1]] = llllllIlll[9];
            if (r.llIlIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && r.llIlIlllllIII(r.llIlIllllIIII(e.u(), 60.0))) {
                int[] nArray5 = new int[llllllIlll[0]];
                nArray5[r.llllllIlll[1]] = llllllIlll[9];
                Inventory.getFirst((int[])nArray5).interact(llllllIlIl[llllllIlll[12]]);
                Time.sleepTicks((int)llllllIlll[0]);
                0;
            }
            lllllllllllllllllIlIIIlIlIIIIIll = new WorldPoint(llllllIlll[23], llllllIlll[24], llllllIlll[1]);
            WorldPoint lllllllllllllllllIlIIIlIlIIIIIlI = new WorldPoint(llllllIlll[25], llllllIlll[24], llllllIlll[1]);
            WorldPoint lllllllllllllllllIlIIIlIlIIIIIIl = new WorldPoint(llllllIlll[26], llllllIlll[24], llllllIlll[1]);
            WorldPoint lllllllllllllllllIlIIIlIlIIIIIII = new WorldPoint(llllllIlll[27], llllllIlll[24], llllllIlll[1]);
            if (!r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIIlIlIIIIIll) ? 1 : 0) || !r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIIlIlIIIIIlI) ? 1 : 0) || !r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIIlIlIIIIIIl) ? 1 : 0) || r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIIlIlIIIIIII) ? 1 : 0)) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[21]];
                TileObjects.getNearest((String[])stringArray).interact(llllllIlIl[llllllIlll[28]]);
                Time.sleepTicks((int)llllllIlll[29]);
                0;
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
                        0;
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
                            0;
                        }
                        if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                            Mouse.click((int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);
                            0;
                        }
                        if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                            Mouse.click((int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);
                            0;
                        }
                        lllllllllllllllllIlIIIlIIlllllIl = new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1]);
                        if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIIlIIlllllIl) ? 1 : 0)) {
                            e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                            Time.sleepTicks((int)e.c(llllllIlll[5], llllllIlll[28]));
                            0;
                        }
                        if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0) && r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[37], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)de);
                            0;
                            Time.sleepTicks((int)llllllIlll[0]);
                            0;
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
                            lllllllllllllllllIlIIIlIIlllllll = TileItems.getNearest((String[])stringArray2);
                            if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll)) {
                                String[] stringArray3 = new String[llllllIlll[0]];
                                stringArray3[r.llllllIlll[1]] = llllllIlIl[llllllIlll[29]];
                                if (r.llIlIlllllIll(TileItems.getNearest((String[])stringArray3))) {
                                    lllllllllllllllllIlIIIlIIlllllll.interact(llllllIlIl[llllllIlll[49]]);
                                    Time.sleepTicks((int)llllllIlll[7]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[llllllIlll[0]];
                            stringArray4[r.llllllIlll[1]] = llllllIlIl[llllllIlll[41]];
                            lllllllllllllllllIlIIIlIIllllllI = TileItems.getNearest((String[])stringArray4);
                            if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI)) {
                                lllllllllllllllllIlIIIlIIllllllI.interact(llllllIlIl[llllllIlll[50]]);
                                Time.sleepTicks((int)llllllIlll[0]);
                                0;
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
                                0;
                            }
                        }
                        String[] stringArray8 = new String[llllllIlll[0]];
                        stringArray8[r.llllllIlll[1]] = llllllIlIl[llllllIlll[54]];
                        if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray8))) {
                            String[] stringArray9 = new String[llllllIlll[0]];
                            stringArray9[r.llllllIlll[1]] = llllllIlIl[llllllIlll[55]];
                            TileObjects.getNearest((String[])stringArray9).interact(llllllIlIl[llllllIlll[56]]);
                            Time.sleepTicks((int)llllllIlll[8]);
                            0;
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
                            0;
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
                                0;
                                dg += llllllIlll[0];
                            }
                            if (r.llIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray17 = new String[llllllIlll[0]];
                                stringArray17[r.llllllIlll[1]] = llllllIlIl[llllllIlll[68]];
                                String[] stringArray18 = new String[llllllIlll[0]];
                                stringArray18[r.llllllIlll[1]] = llllllIlIl[llllllIlll[69]];
                                Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                                Time.sleepTicks((int)llllllIlll[11]);
                                0;
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
                    0;
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
                    0;
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
                        0;
                    }
                }
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[12]) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[81]];
                    Movement.walkTo((WorldPoint)df);
                    0;
                    Time.sleepTicks((int)llllllIlll[0]);
                    0;
                }
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[82]];
                if (r.llIlIllllIllI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[llllllIlll[0]];
                    stringArray24[r.llllllIlll[1]] = llllllIlIl[llllllIlll[83]];
                    TileObjects.getNearest((String[])stringArray24).interact(llllllIlIl[llllllIlll[84]]);
                    Time.sleepTicks((int)llllllIlll[11]);
                    0;
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
                        0;
                    }
                }
                if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[89]];
                    Movement.walkTo((WorldPoint)dc);
                    0;
                    Time.sleepTicks((int)llllllIlll[0]);
                    0;
                    lllllllllllllllllIlIIIlIIlllllll = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]);
                    if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll)) {
                        Mouse.click((int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);
                        0;
                    }
                    if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                        Mouse.click((int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);
                        0;
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
                        0;
                    }
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[76])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[91]];
                lllllllllllllllllIlIIIlIIlllllll = TileObjects.getNearest((String[])stringArray);
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll)) {
                    lllllllllllllllllIlIIIlIIlllllll.interact(llllllIlIl[llllllIlll[92]]);
                    Time.sleepTicks((int)llllllIlll[7]);
                    0;
                }
                String[] stringArray25 = new String[llllllIlll[0]];
                stringArray25[r.llllllIlll[1]] = llllllIlIl[llllllIlll[93]];
                lllllllllllllllllIlIIIlIIllllllI = TileItems.getNearest((String[])stringArray25);
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI)) {
                    lllllllllllllllllIlIIIlIIllllllI.interact(llllllIlIl[llllllIlll[94]]);
                    Time.sleepTicks((int)llllllIlll[7]);
                    0;
                }
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[22])) {
                if (r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[95]];
                    Movement.walkTo((WorldPoint)de);
                    0;
                    Time.sleepTicks((int)llllllIlll[0]);
                    0;
                    lllllllllllllllllIlIIIlIIlllllll = new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1]);
                    if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIIIlIIlllllll) ? 1 : 0)) {
                        e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                        Time.sleepTicks((int)e.c(llllllIlll[5], llllllIlll[28]));
                        0;
                    }
                    if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                        e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                        Time.sleepTicks((int)llllllIlll[8]);
                        0;
                    }
                    if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                        Mouse.click((int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);
                        0;
                    }
                    if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllIl = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                        Mouse.click((int)lllllllllllllllllIlIIIlIIlllllIl.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIlllllIl.getClickPoint().getY(), (boolean)llllllIlll[0]);
                        Time.sleepTicks((int)llllllIlll[11]);
                        0;
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
                        0;
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
                        0;
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
                    0;
                }
                String[] stringArray32 = new String[llllllIlll[0]];
                stringArray32[r.llllllIlll[1]] = llllllIlIl[llllllIlll[109]];
                if (r.llIlIllllIIll(Inventory.contains((String[])stringArray32) ? 1 : 0)) {
                    String[] stringArray33 = new String[llllllIlll[0]];
                    stringArray33[r.llllllIlll[1]] = llllllIlIl[llllllIlll[110]];
                    if (r.llIlIlllllIlI(Inventory.getAll((String[])stringArray33).size(), llllllIlll[11])) {
                        int[] nArray19 = new int[llllllIlll[0]];
                        nArray19[r.llllllIlll[1]] = llllllIlll[111];
                        lllllllllllllllllIlIIIlIIlllllll = TileObjects.getNearest((int[])nArray19).getWorldLocation();
                        if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIIIlIIlllllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIIlIIlllllll);
                            0;
                            Time.sleepTicks((int)llllllIlll[0]);
                            0;
                        }
                        if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIIIlIIlllllll) ? 1 : 0)) {
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
                0;
            }
            if (r.llIlIllllIlIl(e.j(llllllIlll[4]), llllllIlll[95])) {
                String[] stringArray = new String[llllllIlll[0]];
                stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[116]];
                if (r.llIlIlllllIll(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray20 = new int[llllllIlll[0]];
                    nArray20[r.llllllIlll[1]] = llllllIlll[117];
                    TileObjects.getNearest((int[])nArray20).interact(llllllIlIl[llllllIlll[118]]);
                    Time.sleepTicks((int)llllllIlll[8]);
                    0;
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
                        0;
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
                            0;
                        }
                    }
                }
                if (r.llIlIllllIIll(Players.getLocal().getWorldLocation().equals((Object)dc) ? 1 : 0) && r.llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    String[] stringArray39 = new String[llllllIlll[0]];
                    stringArray39[r.llllllIlll[1]] = llllllIlIl[llllllIlll[132]];
                    if (r.llIlIlllllIll(TileObjects.getNearest((String[])stringArray39))) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[133]];
                        Movement.walkTo((WorldPoint)dc);
                        0;
                        Time.sleepTicks((int)llllllIlll[0]);
                        0;
                        lllllllllllllllllIlIIIlIIlllllll = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]);
                        if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll)) {
                            Mouse.click((int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIlllllll.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);
                            0;
                        }
                        if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                            Mouse.click((int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllllI.getClickPoint().getY(), (boolean)llllllIlll[0]);
                            Time.sleepTicks((int)llllllIlll[11]);
                            0;
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
                        0;
                    }
                }
                String[] stringArray40 = new String[llllllIlll[0]];
                stringArray40[r.llllllIlll[1]] = llllllIlIl[llllllIlll[136]];
                lllllllllllllllllIlIIIlIIlllllll = TileObjects.getNearest((String[])stringArray40);
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIlllllll)) {
                    lllllllllllllllllIlIIIlIIlllllll.interact(llllllIlIl[llllllIlll[137]]);
                    Time.sleepTicks((int)llllllIlll[7]);
                    0;
                }
                String[] stringArray41 = new String[llllllIlll[0]];
                stringArray41[r.llllllIlll[1]] = llllllIlIl[llllllIlll[138]];
                lllllllllllllllllIlIIIlIIllllllI = TileItems.getNearest((String[])stringArray41);
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI)) {
                    lllllllllllllllllIlIIIlIIllllllI.interact(llllllIlIl[llllllIlll[139]]);
                    Time.sleepTicks((int)llllllIlll[7]);
                    0;
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
                        0;
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
                lllllllllllllllllIlIIIlIIlllllll = NPCs.getAll((String[])stringArray);
                lllllllllllllllllIlIIIlIIllllllI = lllllllllllllllllIlIIIlIIlllllll.stream().filter(nPC -> {
                    String[] stringArray = new String[llllllIlll[0]];
                    stringArray[r.llllllIlll[1]] = llllllIlIl[llllllIlll[181]];
                    return nPC.hasAction(stringArray);
                }).findFirst().orElse(null);
                if (r.llIlIllllIIlI(Prayers.getPoints(), llllllIlll[30])) {
                    Inventory.getFirst(item -> item.getName().contains(llllllIlIl[llllllIlll[180]])).interact(llllllIlIl[llllllIlll[146]]);
                }
                if (r.llIlIlllllIll(lllllllllllllllllIlIIIlIIllllllI)) {
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
                    0;
                }
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[150]];
                    if (r.llIlIllllIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllllI) && r.llIlIlllllIll(Players.getLocal().getInteracting())) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[151]];
                    lllllllllllllllllIlIIIlIIllllllI.interact(llllllIlIl[llllllIlll[152]]);
                    Time.sleepTicks((int)llllllIlll[7]);
                    0;
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
                    0;
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
                            0;
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

    private static String llIlIlllIIllI(String lllllllllllllllllIlIIIlIIllIlIIl, String lllllllllllllllllIlIIIlIIllIlIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIlIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIlIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIlIIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIlIIllIllIl.init(llllllIlll[7], lllllllllllllllllIlIIIlIIllIlllI);
            return new String(lllllllllllllllllIlIIIlIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIlIIllIllII) {
            lllllllllllllllllIlIIIlIIllIllII.printStackTrace();
            return null;
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
                0;
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

    private static void llIlIlllIllll() {
        llllllIlll = new int[212];
        r.llllllIlll[0] = 1;
        r.llllllIlll[1] = (0x51 ^ 0x43) & ~(3 ^ 0x11);
        r.llllllIlll[2] = -(0xFFFFFE79 & 0xBD7) & (0xFFFFCB7E & 0x3FFF);
        r.llllllIlll[3] = 64 + 130 - 32 + 29 ^ 76 + 94 - 137 + 98;
        r.llllllIlll[4] = 0xFFFFFB77 & 0x5BB;
        r.llllllIlll[5] = 0x2A ^ 0x2F;
        r.llllllIlll[6] = -(0xCD ^ 0xBE) & (0xFFFF93FB & 0x7FFE);
        r.llllllIlll[7] = 2;
        r.llllllIlll[8] = 0xC6 ^ 0xC2;
        r.llllllIlll[9] = -(0xFFFFC357 & 0x7EA9) & (0xFFFFF37B & 0x4FFF);
        r.llllllIlll[10] = 0x29 ^ 0x23;
        r.llllllIlll[11] = 3;
        r.llllllIlll[12] = 0x3C ^ 0x66 ^ (0x20 ^ 0x7C);
        r.llllllIlll[13] = 0xFFFF9FF7 & 0x7F4F;
        r.llllllIlll[14] = -(0x55 ^ 0x50) & (0xFFFFFDAF & 0x4EF7);
        r.llllllIlll[15] = -(0xFFFFFE5F & 0x15E3) & (0xFFFFFFDF & 0x1FF3);
        r.llllllIlll[16] = -(0xFFFFE46B & 0x5FF6) & (0xFFFFCFFB & Short.MAX_VALUE);
        r.llllllIlll[17] = -(0xFFFFF4BF & 0xF6D) & (0xFFFFB57D & Short.MAX_VALUE);
        r.llllllIlll[18] = -(0xFFFFB763 & 0x4ABE) & (0xFFFFBFEB & 0x4BB7);
        r.llllllIlll[19] = -(0xFFFFEDD8 & 0x1BFF) & (0xFFFF8FFF & 0x7BFF);
        r.llllllIlll[20] = -(0xFFFFD8CF & 0x7771) & (0xFFFFFF7B & 0x55F7);
        r.llllllIlll[21] = 0xAC ^ 0x9D ^ (0xB1 ^ 0x87);
        r.llllllIlll[22] = 0x17 ^ 0x25;
        r.llllllIlll[23] = 0xFFFFCD69 & 0x3FFE;
        r.llllllIlll[24] = -(0xFFFFDE6E & 0x31FB) & (0xFFFFBFFD & 0x5DEB);
        r.llllllIlll[25] = -(0xFFFFF383 & 0x3EFF) & (0xFFFFFFEF & 0x3FFB);
        r.llllllIlll[26] = -(0xFFFFB6BF & 0x6BD1) & (0xFFFFAFFE & 0x7FFB);
        r.llllllIlll[27] = 0xFFFFAF6F & 0x5DFB;
        r.llllllIlll[28] = 0x9C ^ 0x94;
        r.llllllIlll[29] = 0xA9 ^ 0xA6;
        r.llllllIlll[30] = 0x85 ^ 0xAA ^ (0x80 ^ 0xBB);
        r.llllllIlll[31] = (0x72 ^ 0x7D) + (1 + 39 - -42 + 49) - (0x2E ^ 0x52) + (0x6B ^ 0x1D);
        r.llllllIlll[32] = 143 + 137 - 276 + 154 ^ 112 + 100 - 81 + 20;
        r.llllllIlll[33] = -1;
        r.llllllIlll[34] = 132 + 75 - 203 + 166 ^ 126 + 21 - 115 + 129;
        r.llllllIlll[35] = 0xFFFF9F74 & 0x6DFF;
        r.llllllIlll[36] = 0xFFFFBD91 & 0x4FEF;
        r.llllllIlll[37] = 0xFFFFEF7F & 0x1DF3;
        r.llllllIlll[38] = -(0xFFFFFFD3 & 0x102F) & (0xFFFFBFFF & 0x5D6F);
        r.llllllIlll[39] = -(0xFFFFFBDB & 0x7625) & (0xFFFFFF7F & 0x7FFD);
        r.llllllIlll[40] = -(0xFFFFAAF9 & 0x5D97) & (0xFFFF9EFD & 0x6BD6);
        r.llllllIlll[41] = 0xBE ^ 0xAF;
        r.llllllIlll[42] = 0xFFFFCD6D & 0x3FF6;
        r.llllllIlll[43] = -(0xFFFFF7F7 & 0x5AB9) & (0xFFFFDFFB & 0x7FB7);
        r.llllllIlll[44] = 0xFFFFBDF9 & 0x4F77;
        r.llllllIlll[45] = 0xFFFFCDFF & 0x3EFF;
        r.llllllIlll[46] = 0x3D ^ 0x21 ^ (0x7A ^ 0x6A);
        r.llllllIlll[47] = 0x9C ^ 0x91;
        r.llllllIlll[48] = 0x1E ^ 0x10;
        r.llllllIlll[49] = 60 + 6 - 12 + 77 ^ 38 + 36 - -17 + 56;
        r.llllllIlll[50] = 0 + 111 - 2 + 61 ^ 108 + 69 - 62 + 69;
        r.llllllIlll[51] = 0x6D ^ 0x7E;
        r.llllllIlll[52] = 0x15 ^ 0x78 ^ (0x2C ^ 0x54);
        r.llllllIlll[53] = 0x90 ^ 0x86;
        r.llllllIlll[54] = 10 + 167 - 9 + 46 ^ 66 + 77 - 72 + 122;
        r.llllllIlll[55] = 64 + 78 - 102 + 124 ^ 129 + 9 - 84 + 134;
        r.llllllIlll[56] = 0xFE ^ 0xA9 ^ (0x8F ^ 0xC1);
        r.llllllIlll[57] = 113 + 22 - 40 + 50 ^ 51 + 63 - 16 + 41;
        r.llllllIlll[58] = 0x95 ^ 0x8E;
        r.llllllIlll[59] = 0xDF ^ 0xC3;
        r.llllllIlll[60] = 0x48 ^ 0 ^ (0xE7 ^ 0xB2);
        r.llllllIlll[61] = 171 + 188 - 311 + 143 ^ 27 + 100 - 11 + 45;
        r.llllllIlll[62] = 0xA5 ^ 0xB0 ^ (0xCA ^ 0xC0);
        r.llllllIlll[63] = 97 + 53 - 43 + 79 ^ 106 + 48 - 71 + 71;
        r.llllllIlll[64] = 0x43 ^ 0x62;
        r.llllllIlll[65] = 0x1B ^ 0x5E ^ (1 ^ 0x66);
        r.llllllIlll[66] = 0x66 ^ 0x7E ^ (0x41 ^ 0x7A);
        r.llllllIlll[67] = 0x82 ^ 0xA6;
        r.llllllIlll[68] = 0x5C ^ 0xE ^ (0xDA ^ 0xAD);
        r.llllllIlll[69] = 0xF8 ^ 0x81 ^ (0x60 ^ 0x3F);
        r.llllllIlll[70] = 99 + 142 - 127 + 62 ^ 116 + 57 - 128 + 106;
        r.llllllIlll[71] = 0x60 ^ 0x48;
        r.llllllIlll[72] = 0x41 ^ 0x68;
        r.llllllIlll[73] = 0x64 ^ 0x73 ^ (0xBF ^ 0x82);
        r.llllllIlll[74] = 0x22 ^ 9;
        r.llllllIlll[75] = 0x1D ^ 0x31;
        r.llllllIlll[76] = 0x1C ^ 0x31;
        r.llllllIlll[77] = 0xA3 ^ 0x8D;
        r.llllllIlll[78] = 0x97 ^ 0xB8;
        r.llllllIlll[79] = 0x2D ^ 0x1D;
        r.llllllIlll[80] = 109 + 77 - 70 + 12 ^ 98 + 154 - 179 + 104;
        r.llllllIlll[81] = 0xA8 ^ 0x9B;
        r.llllllIlll[82] = 0xE2 ^ 0xAE ^ (0xFD ^ 0x85);
        r.llllllIlll[83] = 23 + 162 - 80 + 78 ^ 50 + 47 - 27 + 60;
        r.llllllIlll[84] = 0x2F ^ 0x19;
        r.llllllIlll[85] = 0x96 ^ 0xA1;
        r.llllllIlll[86] = 0x57 ^ 0x34 ^ (0x29 ^ 0x72);
        r.llllllIlll[87] = 0x81 ^ 0xB8;
        r.llllllIlll[88] = 0x86 ^ 0xBC;
        r.llllllIlll[89] = 116 + 141 - 156 + 51 ^ 48 + 111 - 6 + 10;
        r.llllllIlll[90] = -(0xFFFFE45F & 0x7BE6) & (0xFFFFFFFD & 0x6BDF);
        r.llllllIlll[91] = 0xD ^ 0x20 ^ (0xAC ^ 0xBC);
        r.llllllIlll[92] = 36 + 128 - 36 + 17 ^ 117 + 46 - 14 + 26;
        r.llllllIlll[93] = 0x4C ^ 0x73;
        r.llllllIlll[94] = 0x51 ^ 9 ^ (0x6B ^ 0x73);
        r.llllllIlll[95] = 62 + 87 - -4 + 89 ^ 115 + 156 - 176 + 84;
        r.llllllIlll[96] = 0xEA ^ 0xB2 ^ (0x40 ^ 0x5A);
        r.llllllIlll[97] = 0xA4 ^ 0xC5 ^ (0xA ^ 0x28);
        r.llllllIlll[98] = 0x6F ^ 0x2C ^ (0x6E ^ 0x69);
        r.llllllIlll[99] = 0x6B ^ 0x2E;
        r.llllllIlll[100] = 0x4B ^ 0x1D ^ (0x7E ^ 0x6E);
        r.llllllIlll[101] = 218 + 198 - 194 + 14 ^ 22 + 59 - -74 + 16;
        r.llllllIlll[102] = 78 + 60 - 127 + 116 ^ (0x3E ^ 9);
        r.llllllIlll[103] = 0xD4 ^ 0x9D;
        r.llllllIlll[104] = 0x1C ^ 0x56;
        r.llllllIlll[105] = 0xFFFFFFE7 & 0xDDF;
        r.llllllIlll[106] = 0x5E ^ 0x15;
        r.llllllIlll[107] = 0xF9 ^ 0xB5;
        r.llllllIlll[108] = 0xFFFF8DED & 0x7FDB;
        r.llllllIlll[109] = 0x58 ^ 0x15;
        r.llllllIlll[110] = 0x34 ^ 5 ^ 28 + 31 - -32 + 36;
        r.llllllIlll[111] = -(0xFFFFDEBB & 0x7147) & (0xFFFFDFDA & 0x7DEF);
        r.llllllIlll[112] = 184 + 5 - -31 + 19 ^ 109 + 78 - 76 + 49;
        r.llllllIlll[113] = 139 + 139 - 166 + 38 ^ 156 + 8 - -1 + 33;
        r.llllllIlll[114] = 0x6E ^ 0x1E ^ (0x35 ^ 0x14);
        r.llllllIlll[115] = 0x46 ^ 0x14;
        r.llllllIlll[116] = 0xF3 ^ 0xA0;
        r.llllllIlll[117] = -(0x9A ^ 0xB5) & (0xFFFF8FEE & 0x7DFF);
        r.llllllIlll[118] = 44 + 16 - -110 + 76 ^ 101 + 146 - 226 + 141;
        r.llllllIlll[119] = 0xE8 ^ 0x90 ^ (8 ^ 0x25);
        r.llllllIlll[120] = 0x35 ^ 0x12 ^ (0x40 ^ 0x31);
        r.llllllIlll[121] = 0x91 ^ 0xC6;
        r.llllllIlll[122] = 0x73 ^ 0x5C ^ (0x5F ^ 0x28);
        r.llllllIlll[123] = 0x14 ^ 0x32 ^ 56 + 118 - 113 + 66;
        r.llllllIlll[124] = 0x50 ^ 0xA;
        r.llllllIlll[125] = 166 + 193 - 342 + 209 ^ 86 + 79 - 0 + 20;
        r.llllllIlll[126] = 0xE ^ 0x24 ^ (0x74 ^ 2);
        r.llllllIlll[127] = 0x19 ^ 0x65 ^ (0x38 ^ 0x19);
        r.llllllIlll[128] = 0x7A ^ 0x4B ^ (0x14 ^ 0x7B);
        r.llllllIlll[129] = 0x68 ^ 0x7B ^ (0x69 ^ 0x25);
        r.llllllIlll[130] = 0x6F ^ 0xF;
        r.llllllIlll[131] = 20 + 183 - 187 + 183 ^ 117 + 53 - 47 + 43;
        r.llllllIlll[132] = 0x4F ^ 0x2D;
        r.llllllIlll[133] = 4 ^ 0x36 ^ (0xC9 ^ 0x98);
        r.llllllIlll[134] = -(0xFFFFFD57 & 0x56AD) & (0xFFFFFFBF & 0x5FD7);
        r.llllllIlll[135] = 0x83 ^ 0x96 ^ (0x52 ^ 0x23);
        r.llllllIlll[136] = 0x3A ^ 0x19 ^ (0xED ^ 0xAB);
        r.llllllIlll[137] = 0xE8 ^ 0x8E;
        r.llllllIlll[138] = 0x6F ^ 0x55 ^ (0x54 ^ 9);
        r.llllllIlll[139] = 0x7A ^ 0x12;
        r.llllllIlll[140] = 0x70 ^ 0x19;
        r.llllllIlll[141] = 13 + 66 - -16 + 102 ^ 164 + 162 - 236 + 85;
        r.llllllIlll[142] = 0x7A ^ 0x16 ^ (0x1C ^ 0x1B);
        r.llllllIlll[143] = 0xC6 ^ 0xAA;
        r.llllllIlll[144] = 0x91 ^ 0x8E ^ (0x30 ^ 0x42);
        r.llllllIlll[145] = 101 + 188 - 80 + 11 ^ 61 + 29 - 39 + 127;
        r.llllllIlll[146] = 6 ^ 0x69;
        r.llllllIlll[147] = 0x6C ^ 0x1C;
        r.llllllIlll[148] = 0xD9 ^ 0xAC ^ (0x36 ^ 0x32);
        r.llllllIlll[149] = 0x4E ^ 0x3C;
        r.llllllIlll[150] = 0xC2 ^ 0xB1;
        r.llllllIlll[151] = 0xC ^ 0x78;
        r.llllllIlll[152] = 0x2D ^ 0x7E ^ (0x3D ^ 0x1B);
        r.llllllIlll[153] = 0x73 ^ 5;
        r.llllllIlll[154] = 0xD0 ^ 0xA7;
        r.llllllIlll[155] = 65 + 35 - 62 + 197 ^ 0 + 22 - -71 + 54;
        r.llllllIlll[156] = 94 + 28 - 111 + 226 ^ 18 + 66 - -52 + 12;
        r.llllllIlll[157] = 103 + 195 - 180 + 106 ^ 8 + 4 - -65 + 77;
        r.llllllIlll[158] = 0x56 ^ 0x2C ^ 1;
        r.llllllIlll[159] = 0x19 ^ 0x65;
        r.llllllIlll[160] = 0xBA ^ 0x9C ^ (1 ^ 0x5A);
        r.llllllIlll[161] = 0x39 ^ 0x47;
        r.llllllIlll[162] = (0x98 ^ 0x84) + (0x85 ^ 0x89) - -(0x24 ^ 0x13) + (0x2C ^ 0xC);
        r.llllllIlll[163] = 3 + 27 - -28 + 70;
        r.llllllIlll[164] = 92 + 45 - 73 + 65;
        r.llllllIlll[165] = (0x6B ^ 0x3D) + (0xC1 ^ 0x9D) - (0x75 ^ 0x15) + (0xAC ^ 0x9C);
        r.llllllIlll[166] = (0xE1 ^ 0xC6) + ((0x94 ^ 0xB2) & ~(0xE2 ^ 0xC4)) - -(0xC6 ^ 0x83) + (0xB1 ^ 0xA6);
        r.llllllIlll[167] = (2 ^ 0x45) + (0xD7 ^ 0xC0) - (0xBB ^ 0xA3) + (0x1E ^ 0x20);
        r.llllllIlll[168] = 20 + 32 - -42 + 39;
        r.llllllIlll[169] = 0xFFFFA36F & 0x7FB8;
        r.llllllIlll[170] = 0xFFFFBED8 & 0x7BBF;
        r.llllllIlll[171] = -(0xFFFFFBEB & 0x2677) & (0xFFFFFBFE & 0x3EFF);
        r.llllllIlll[172] = 0xFFFFDD3E & 0x3EE1;
        r.llllllIlll[173] = -(0xFFFFDC75 & 0x779E) & (0xFFFFFFFB & 0x57FF);
        r.llllllIlll[174] = 0xFFFF8FFD & 0x712E;
        r.llllllIlll[175] = -(0xFFFFD96B & 0x77B7) & (0xFFFFFFFF & 0x7FEE);
        r.llllllIlll[176] = 0xFFFFE9FB & 0x77AC;
        r.llllllIlll[177] = -(0xFFFFBD7B & 0x6AFD) & (0xFFFFBFFC & 0x6BFF);
        r.llllllIlll[178] = 104 + 65 - 55 + 20;
        r.llllllIlll[179] = 13 + 119 - 70 + 73;
        r.llllllIlll[180] = (0x72 ^ 0x7F) + (0x99 ^ 0xA3) - (0x4D ^ 0x77) + (9 ^ 0x72);
        r.llllllIlll[181] = (0x9E ^ 0xBE) + (5 ^ 0x75) - (0x21 ^ 0x76) + (0x2C ^ 0x7C);
        r.llllllIlll[182] = 0xFFFFF73B & 0xBFF;
        r.llllllIlll[183] = -(0xFFFFF27E & 0x3DCD) & (0xFFFFFDDF & 0x3FEF);
        r.llllllIlll[184] = -(21 + 113 - 119 + 127) & (0xFFFF8FFD & 0x7DFF);
        r.llllllIlll[185] = 0xFFFFEDFF & 0x1EFE;
        r.llllllIlll[186] = 0xFFFFFD7F & 0xFDD;
        r.llllllIlll[187] = 0xFFFFCF6F & 0x3DFF;
        r.llllllIlll[188] = -(0xFFFFD0FB & 0x7F67) & (0xFFFFF6EF & 0x7F7B);
        r.llllllIlll[189] = -(0xFFFFEFED & 0x72F7) & (0xFFFFFFEF & 0x6FFC);
        r.llllllIlll[190] = 0xFFFFEEEF & 0x37B7;
        r.llllllIlll[191] = -(0xFFFFFEBF & 0x6359) & (0xFFFFFFFF & 0x6FFF);
        r.llllllIlll[192] = 93 + 86 - 133 + 92;
        r.llllllIlll[193] = 108 + 106 - 110 + 35;
        r.llllllIlll[194] = 10 + 134 - 134 + 130 + (0x76 ^ 0x1A) - (196 + 174 - 302 + 138) + (0x3F ^ 0x5C);
        r.llllllIlll[195] = 21 + 7 - -62 + 52;
        r.llllllIlll[196] = 129 + 133 - 213 + 94;
        r.llllllIlll[197] = 40 + 40 - -40 + 24;
        r.llllllIlll[198] = 107 + 39 - 8 + 7;
        r.llllllIlll[199] = 9 + 52 - -76 + 9;
        r.llllllIlll[200] = (0x85 ^ 0xA4) + (0x57 ^ 0x79) - -(0x5E ^ 0x4E) + (0x4F ^ 0x7B);
        r.llllllIlll[201] = (0x6B ^ 0x33) + (0x2C ^ 0x51) - (0 ^ 0x56) + (0x50 ^ 0x45);
        r.llllllIlll[202] = (0xF0 ^ 0xBA) + (0x8E ^ 0x9D) - (0x1D ^ 0xC) + (0x75 ^ 0x3C);
        r.llllllIlll[203] = 37 + 72 - -19 + 22;
        r.llllllIlll[204] = 69 + 131 - 85 + 36;
        r.llllllIlll[205] = 98 + 69 - 119 + 83 + (0x9F ^ 0x80) - (0x35 ^ 8) + (0xF7 ^ 0xC4);
        r.llllllIlll[206] = 51 + 2 - 26 + 118 + (0x57 ^ 0x4B) - (0x6D ^ 0x38) + (0xF4 ^ 0xB5);
        r.llllllIlll[207] = 52 + 145 - 98 + 55;
        r.llllllIlll[208] = (0x63 ^ 0x1D) + (0x44 ^ 0x7A) - (0 + 34 - -1 + 93) + (0x2D ^ 0x72);
        r.llllllIlll[209] = 2 + 20 - -72 + 62;
        r.llllllIlll[210] = 57 + 124 - 147 + 120 + (68 + 31 - -5 + 34) - (182 + 165 - 269 + 133) + (0x64 ^ 0x28);
        r.llllllIlll[211] = (0xB7 ^ 0x8A) + (144 + 109 - 212 + 113) - (0x2B ^ 0x72) + (0xBC ^ 0x9C);
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
            0;
            if (3 > 0) return n2 != 0;
            return ((0x18 ^ 0x3D) & ~(0xA0 ^ 0x85)) != 0;
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
        r.llllllIlIl[r.llllllIlll[1]] = r."Finished buying items, switching back to quest";
        r.llllllIlIl[r.llllllIlll[0]] = r."Nav to bank";
        r.llllllIlIl[r.llllllIlll[7]] = r."Handling banking";
        r.llllllIlIl[r.llllllIlll[11]] = r."We are missing quest supplies, switching to BUYING";
        r.llllllIlIl[r.llllllIlll[8]] = r."We are missing quest supplies, switching to BUYING";
        r.llllllIlIl[r.llllllIlll[5]] = r."Drink";
        r.llllllIlIl[r.llllllIlll[12]] = r."Eat";
        r.llllllIlIl[r.llllllIlll[21]] = r."Gate";
        r.llllllIlIl[r.llllllIlll[28]] = r."Open";
        r.llllllIlIl[r.llllllIlll[32]] = r."Using salve tele";
        r.llllllIlIl[r.llllllIlll[10]] = r."Break";
        r.llllllIlIl[r.llllllIlll[34]] = r."Nav to grotto";
        r.llllllIlIl[r.llllllIlll[46]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[47]] = r."Getting mirror";
        r.llllllIlIl[r.llllllIlll[48]] = r."Washing bowl";
        r.llllllIlIl[r.llllllIlll[29]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[49]] = r."Take";
        r.llllllIlIl[r.llllllIlll[41]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[50]] = r."Take";
        r.llllllIlIl[r.llllllIlll[51]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[30]] = r."Journal";
        r.llllllIlIl[r.llllllIlll[52]] = r."Grotto tree";
        r.llllllIlIl[r.llllllIlll[53]] = r."Search";
        r.llllllIlIl[r.llllllIlll[54]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[55]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[56]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[57]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[58]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[59]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[60]] = r."Journal";
        r.llllllIlIl[r.llllllIlll[61]] = r."Wear";
        r.llllllIlIl[r.llllllIlll[62]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[63]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[64]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[65]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[66]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[67]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[68]] = r."Mirror";
        r.llllllIlIl[r.llllllIlll[69]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[70]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[71]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[72]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[73]] = r."Journal";
        r.llllllIlIl[r.llllllIlll[74]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[75]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[76]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[77]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[78]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[79]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[80]] = r."Breaking tab";
        r.llllllIlIl[r.llllllIlll[22]] = r."Break";
        r.llllllIlIl[r.llllllIlll[81]] = r."Nav to priest";
        r.llllllIlIl[r.llllllIlll[82]] = r."Trapdoor";
        r.llllllIlIl[r.llllllIlll[83]] = r."Trapdoor";
        r.llllllIlIl[r.llllllIlll[84]] = r."Open";
        r.llllllIlIl[r.llllllIlll[85]] = r."Interact priest";
        r.llllllIlIl[r.llllllIlll[86]] = r."Drezel";
        r.llllllIlIl[r.llllllIlll[87]] = r."Breaking tab";
        r.llllllIlIl[r.llllllIlll[88]] = r."Break";
        r.llllllIlIl[r.llllllIlll[89]] = r."Nav to log";
        r.llllllIlIl[r.llllllIlll[3]] = r."Cast";
        r.llllllIlIl[r.llllllIlll[91]] = r."Fungi on log";
        r.llllllIlIl[r.llllllIlll[92]] = r."Pick";
        r.llllllIlIl[r.llllllIlll[93]] = r."Fungi on log";
        r.llllllIlIl[r.llllllIlll[94]] = r."Pick";
        r.llllllIlIl[r.llllllIlll[95]] = r."Nav to grotto";
        r.llllllIlIl[r.llllllIlll[96]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[97]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[98]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[99]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[100]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[101]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[102]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[103]] = r."Solving puzzle";
        r.llllllIlIl[r.llllllIlll[104]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[106]] = r."A used spell";
        r.llllllIlIl[r.llllllIlll[107]] = r."A used spell";
        r.llllllIlIl[r.llllllIlll[109]] = r."A used spell";
        r.llllllIlIl[r.llllllIlll[110]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[112]] = r."Talking to filliman";
        r.llllllIlIl[r.llllllIlll[113]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[114]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[115]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[116]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[118]] = r."Search";
        r.llllllIlIl[r.llllllIlll[119]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[120]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[121]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[122]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[123]] = r."Search";
        r.llllllIlIl[r.llllllIlll[124]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[125]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[126]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[127]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[128]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[129]] = r."Druid pouch";
        r.llllllIlIl[r.llllllIlll[130]] = r."Breaking tab";
        r.llllllIlIl[r.llllllIlll[131]] = r."Break";
        r.llllllIlIl[r.llllllIlll[132]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[133]] = r."Nav to log";
        r.llllllIlIl[r.llllllIlll[135]] = r."Cast Bloom";
        r.llllllIlIl[r.llllllIlll[136]] = r."Fungi on log";
        r.llllllIlIl[r.llllllIlll[137]] = r."Pick";
        r.llllllIlIl[r.llllllIlll[138]] = r."Fungi on log";
        r.llllllIlIl[r.llllllIlll[139]] = r."Pick";
        r.llllllIlIl[r.llllllIlll[140]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[141]] = r."Druid pouch";
        r.llllllIlIl[r.llllllIlll[142]] = r."Druid pouch";
        r.llllllIlIl[r.llllllIlll[143]] = r."Fill";
        r.llllllIlIl[r.llllllIlll[144]] = r."Wield";
        r.llllllIlIl[r.llllllIlll[145]] = r."Ghast";
        r.llllllIlIl[r.llllllIlll[146]] = r."Drink";
        r.llllllIlIl[r.llllllIlll[147]] = r."Using druid pouch on ghast";
        r.llllllIlIl[r.llllllIlll[148]] = r."Druid pouch";
        r.llllllIlIl[r.llllllIlll[149]] = r."Ghast";
        r.llllllIlIl[r.llllllIlll[150]] = r."Killing ghasts";
        r.llllllIlIl[r.llllllIlll[151]] = r."Killing ghasts, no interacting";
        r.llllllIlIl[r.llllllIlll[152]] = r."Attack";
        r.llllllIlIl[r.llllllIlll[153]] = r."Grotto";
        r.llllllIlIl[r.llllllIlll[154]] = r."Enter";
        r.llllllIlIl[r.llllllIlll[155]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[156]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[157]] = r."Search";
        r.llllllIlIl[r.llllllIlll[158]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[159]] = r."Filliman Tarlock";
        r.llllllIlIl[r.llllllIlll[160]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[161]] = r."Nature Spirit";
        r.llllllIlIl[r.llllllIlll[162]] = r."Nav to grotto";
        r.llllllIlIl[r.llllllIlll[163]] = r."Salve graveyard teleport";
        r.llllllIlIl[r.llllllIlll[164]] = r."Silver sickle";
        r.llllllIlIl[r.llllllIlll[165]] = r."Silver sickle";
        r.llllllIlIl[r.llllllIlll[166]] = r."Mort myre fungus";
        r.llllllIlIl[r.llllllIlll[167]] = r."";
        r.llllllIlIl[r.llllllIlll[168]] = r."";
        r.llllllIlIl[r.llllllIlll[178]] = r."Nature spirit";
        r.llllllIlIl[r.llllllIlll[179]] = r."ring of wealth (";
        r.llllllIlIl[r.llllllIlll[180]] = r."Prayer";
        r.llllllIlIl[r.llllllIlll[181]] = r."Attack";
        r.llllllIlIl[r.llllllIlll[192]] = r."I'm looking for a quest!";
        r.llllllIlIl[r.llllllIlll[193]] = r."Yes.";
        r.llllllIlIl[r.llllllIlll[31]] = r."Ok, let me help then.";
        r.llllllIlIl[r.llllllIlll[194]] = r."Yep, now tell me what the problem is.";
        r.llllllIlIl[r.llllllIlll[195]] = r."Sure.";
        r.llllllIlIl[r.llllllIlll[196]] = r."You're right, we don't.";
        r.llllllIlIl[r.llllllIlll[197]] = r."Is there anything else interesting to do around here?";
        r.llllllIlIl[r.llllllIlll[198]] = r."Well, what is it, I may be able to help?";
        r.llllllIlIl[r.llllllIlll[199]] = r."Yes, I'll go and look for him.";
        r.llllllIlIl[r.llllllIlll[200]] = r."Yes, I'm sure.";
        r.llllllIlIl[r.llllllIlll[201]] = r."I'll get going.";
        r.llllllIlIl[r.llllllIlll[202]] = r."I think I've solved the puzzle!";
        r.llllllIlIl[r.llllllIlll[203]] = r."How can I help?";
        r.llllllIlIl[r.llllllIlll[204]] = r."Roald sent me to check on Drezel.";
        r.llllllIlIl[r.llllllIlll[205]] = r."Why is the river such a good defence?";
        r.llllllIlIl[r.llllllIlll[206]] = r."You're right, we don't.";
        r.llllllIlIl[r.llllllIlll[207]] = r."Yes, of course.";
        r.llllllIlIl[r.llllllIlll[208]] = r."Do you know of anything I can do in Morytania?";
        r.llllllIlIl[r.llllllIlll[209]] = r."How long have you been a ghost?";
        r.llllllIlIl[r.llllllIlll[210]] = r."What's this pouch for?";
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
            Widget lllllllllllllllllIlIIIlIIllllIIl;
            Widget lllllllllllllllllIlIIIlIIllllIlI;
            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[162]];
            Movement.walkTo((WorldPoint)de);
            0;
            Time.sleepTicks((int)llllllIlll[0]);
            0;
            if (r.llIlIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                Time.sleepTicks((int)llllllIlll[8]);
                0;
            }
            if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllIlI = Widgets.get((int)llllllIlll[40], (int)llllllIlll[30]))) {
                Mouse.click((int)lllllllllllllllllIlIIIlIIllllIlI.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllIlI.getClickPoint().getY(), (boolean)llllllIlll[0]);
                Time.sleepTicks((int)llllllIlll[11]);
                0;
            }
            if (r.llIlIllllIllI(lllllllllllllllllIlIIIlIIllllIIl = Widgets.get((int)llllllIlll[40], (int)llllllIlll[41]))) {
                Mouse.click((int)lllllllllllllllllIlIIIlIIllllIIl.getClickPoint().getX(), (int)lllllllllllllllllIlIIIlIIllllIIl.getClickPoint().getY(), (boolean)llllllIlll[0]);
                Time.sleepTicks((int)llllllIlll[11]);
                0;
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
            0;
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

