/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ao;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class B
implements ab {
    private static /* synthetic */ WorldPoint ek;
    private static /* synthetic */ WorldPoint ei;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ String[] llIlIlllI;
    static /* synthetic */ boolean dl;
    static /* synthetic */ WorldArea ee;
    static /* synthetic */ boolean ef;
    static /* synthetic */ String[] cG;
    private static /* synthetic */ WorldPoint eh;
    static /* synthetic */ int dk;
    private static /* synthetic */ WorldPoint dg;
    private static /* synthetic */ WorldPoint eg;
    private static /* synthetic */ WorldPoint ej;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] llIlIllll;
    private static /* synthetic */ int el;

    private static String lIllIlIlllll(String lIIIllIIIlIlll, String lIIIllIIIlIllI) {
        lIIIllIIIlIlll = new String(Base64.getDecoder().decode(lIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIllIIIlIlIl = new StringBuilder();
        char[] lIIIllIIIlIlII = lIIIllIIIlIllI.toCharArray();
        int lIIIllIIIlIIll = llIlIllll[2];
        char[] lIIIllIIIIllIl = lIIIllIIIlIlll.toCharArray();
        int lIIIllIIIIllII = lIIIllIIIIllIl.length;
        int lIIIllIIIIlIll = llIlIllll[2];
        while (B.lIllIllIIlII(lIIIllIIIIlIll, lIIIllIIIIllII)) {
            char lIIIllIIIllIII = lIIIllIIIIllIl[lIIIllIIIIlIll];
            lIIIllIIIlIlIl.append((char)(lIIIllIIIllIII ^ lIIIllIIIlIlII[lIIIllIIIlIIll % lIIIllIIIlIlII.length]));
            0;
            ++lIIIllIIIlIIll;
            ++lIIIllIIIIlIll;
            0;
            if ((89 + 101 - 185 + 133 ^ 12 + 3 - -87 + 41) != 0) continue;
            return null;
        }
        return String.valueOf(lIIIllIIIlIlIl);
    }

    private static boolean lIllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllIllIIIIl(String lIIIllIIlIIlIl, String lIIIllIIlIIllI) {
        try {
            SecretKeySpec lIIIllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIllIIlIlIIl = Cipher.getInstance("Blowfish");
            lIIIllIIlIlIIl.init(llIlIllll[3], lIIIllIIlIlIlI);
            return new String(lIIIllIIlIlIIl.doFinal(Base64.getDecoder().decode(lIIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIIlIlIII) {
            lIIIllIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static void Q() {
        d lIIIllIIlllllI;
        Object lIIIllIIllllll;
        int[] nArray = new int[llIlIllll[1]];
        nArray[B.llIlIllll[2]] = llIlIllll[12];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIllll[12], llIlIllll[1], llIlIllll[57]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIllll[1]];
        nArray2[B.llIlIllll[2]] = llIlIllll[10];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIllIIllllll = new d(llIlIllll[10], llIlIllll[1], llIlIllll[4]);
            bx.add((d)lIIIllIIllllll);
            0;
        }
        int[] nArray3 = new int[llIlIllll[1]];
        nArray3[B.llIlIllll[2]] = llIlIllll[9];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIllIIllllll = new d(llIlIllll[9], llIlIllll[1], llIlIllll[4]);
            bx.add((d)lIIIllIIllllll);
            0;
        }
        int[] nArray4 = new int[llIlIllll[1]];
        nArray4[B.llIlIllll[2]] = llIlIllll[14];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIIllIIllllll = new d(llIlIllll[14], llIlIllll[24], llIlIllll[4]);
            bx.add((d)lIIIllIIllllll);
            0;
        }
        int[] nArray5 = new int[llIlIllll[1]];
        nArray5[B.llIlIllll[2]] = llIlIllll[16];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIIllIIllllll = new d(llIlIllll[16], llIlIllll[24], j.ch);
            bx.add((d)lIIIllIIllllll);
            0;
        }
        int[] nArray6 = new int[llIlIllll[1]];
        nArray6[B.llIlIllll[2]] = llIlIllll[11];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIIllIIllllll = new d(llIlIllll[11], llIlIllll[0], llIlIllll[58]);
            bx.add((d)lIIIllIIllllll);
            0;
        }
        if (B.lIllIllIIlll(Bank.contains((Predicate)(lIIIllIIllllll = item -> item.getName().toLowerCase().contains(llIlIlllI[llIlIllll[64]]))) ? 1 : 0)) {
            lIIIllIIlllllI = new d(llIlIllll[59], llIlIllll[13], llIlIllll[60]);
            bx.add(lIIIllIIlllllI);
            0;
        }
        int[] nArray7 = new int[llIlIllll[1]];
        nArray7[B.llIlIllll[2]] = llIlIllll[8];
        if (B.lIllIllIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIIllIIlllllI = new d(llIlIllll[8], llIlIllll[52], llIlIllll[61]);
            bx.add(lIIIllIIlllllI);
            0;
        }
    }

    @Override
    public String ag() {
        return llIlIlllI[llIlIllll[63]];
    }

    static {
        B.lIllIllIIIll();
        B.lIllIllIIIlI();
        bx = new ArrayList<d>();
        ee = new WorldArea(llIlIllll[65], llIlIllll[66], llIlIllll[24], llIlIllll[25], llIlIllll[2]);
        String[] stringArray = new String[llIlIllll[22]];
        stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[67]];
        stringArray[B.llIlIllll[1]] = llIlIlllI[llIlIllll[68]];
        stringArray[B.llIlIllll[3]] = llIlIlllI[llIlIllll[69]];
        stringArray[B.llIlIllll[5]] = llIlIlllI[llIlIllll[19]];
        stringArray[B.llIlIllll[6]] = llIlIlllI[llIlIllll[70]];
        stringArray[B.llIlIllll[13]] = llIlIlllI[llIlIllll[71]];
        stringArray[B.llIlIllll[15]] = llIlIlllI[llIlIllll[72]];
        stringArray[B.llIlIllll[7]] = llIlIlllI[llIlIllll[73]];
        cG = stringArray;
        dg = new WorldPoint(llIlIllll[74], llIlIllll[75], llIlIllll[2]);
        eg = new WorldPoint(llIlIllll[76], llIlIllll[77], llIlIllll[2]);
        eh = new WorldPoint(llIlIllll[78], llIlIllll[79], llIlIllll[2]);
        ei = new WorldPoint(llIlIllll[80], llIlIllll[81], llIlIllll[2]);
        ej = new WorldPoint(llIlIllll[82], llIlIllll[83], llIlIllll[2]);
        ek = new WorldPoint(llIlIllll[84], llIlIllll[85], llIlIllll[2]);
        el = llIlIllll[24];
    }

    private static boolean lIllIllIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIlIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIllll[2];
    }

    public static void bs() {
        if (B.lIllIllIIlII(Skills.getLevel((Skill)Skill.FISHING), llIlIllll[0])) {
            ao.ey();
        }
        if (B.lIllIllIIlIl(Skills.getLevel((Skill)Skill.FISHING), llIlIllll[0])) {
            if (B.lIllIllIIllI(bv ? 1 : 0)) {
                b.a(bx);
                if (B.lIllIllIIlII(bx.size(), llIlIllll[1])) {
                    System.out.println(llIlIlllI[llIlIllll[2]]);
                    bv = llIlIllll[2];
                }
            }
            if (B.lIllIllIIlll(bv ? 1 : 0)) {
                if (B.lIllIllIIlll(B.an() ? 1 : 0) && B.lIllIllIIlII(e.j(el), llIlIllll[1])) {
                    String[] stringArray = new String[llIlIllll[1]];
                    stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[1]];
                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation lIIIllIlIIIIlI = BankLocation.getNearest();
                        if (B.lIllIllIlIII(lIIIllIlIIIIlI) && B.lIllIllIIlll(lIIIllIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[3]];
                            a.a(lIIIllIlIIIIlI);
                        }
                        if (B.lIllIllIlIII(lIIIllIlIIIIlI) && B.lIllIllIIllI(lIIIllIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (B.lIllIllIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllll[4]);
                                0;
                            }
                            if (B.lIllIllIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIlllI[llIlIllll[5]];
                                if (B.lIllIllIlIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIllll[6]);
                                    0;
                                }
                                if (B.lIllIllIlIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIllll[3]);
                                    0;
                                }
                                int[] nArray = new int[llIlIllll[7]];
                                nArray[B.llIlIllll[2]] = llIlIllll[8];
                                nArray[B.llIlIllll[1]] = llIlIllll[9];
                                nArray[B.llIlIllll[3]] = llIlIllll[10];
                                nArray[B.llIlIllll[5]] = llIlIllll[11];
                                nArray[B.llIlIllll[6]] = llIlIllll[12];
                                nArray[B.llIlIllll[13]] = llIlIllll[14];
                                nArray[B.llIlIllll[15]] = llIlIllll[16];
                                if (B.lIllIllIIlll(e.d(nArray) ? 1 : 0)) {
                                    B.Q();
                                    System.out.println(llIlIlllI[llIlIllll[6]]);
                                    bv = llIlIllll[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIllll[15]];
                                nArray2[B.llIlIllll[2]] = llIlIllll[8];
                                nArray2[B.llIlIllll[1]] = llIlIllll[9];
                                nArray2[B.llIlIllll[3]] = llIlIllll[10];
                                nArray2[B.llIlIllll[5]] = llIlIllll[11];
                                nArray2[B.llIlIllll[6]] = llIlIllll[12];
                                nArray2[B.llIlIllll[13]] = llIlIllll[14];
                                if (B.lIllIllIIllI(e.d(nArray2) ? 1 : 0)) {
                                    a.a(llIlIllll[8], llIlIllll[0]);
                                    a.a(llIlIllll[14], llIlIllll[0]);
                                    a.a(llIlIllll[9], llIlIllll[1]);
                                    a.a(llIlIllll[10], llIlIllll[1]);
                                    a.a(llIlIllll[11], llIlIllll[0]);
                                    a.a(llIlIllll[12], llIlIllll[1]);
                                    a.a(llIlIllll[16], llIlIllll[5]);
                                    a.a(llIlIllll[17], llIlIllll[18]);
                                }
                            }
                        }
                    }
                }
                if (B.lIllIllIIllI(Inventory.contains((int[])f.bc) ? 1 : 0) && B.lIllIllIIlII(Movement.getRunEnergy(), llIlIllll[19])) {
                    Inventory.getFirst((int[])f.bc).interact(llIlIlllI[llIlIllll[13]]);
                    Time.sleepTicks((int)llIlIllll[1]);
                    0;
                }
                if (B.lIllIllIIllI(B.an() ? 1 : 0) && B.lIllIllIIlII(e.j(el), llIlIllll[1])) {
                    int[] nArray = new int[llIlIllll[1]];
                    nArray[B.llIlIllll[2]] = llIlIllll[20];
                    if (B.lIllIllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[0])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[15]];
                            if (B.lIllIllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dg);
                            0;
                            Time.sleepTicks((int)llIlIllll[1]);
                            0;
                        }
                        if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[21])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[7]];
                            g.a(llIlIlllI[llIlIllll[22]], cG);
                        }
                    }
                }
                if (B.lIllIllIllII(e.j(el), llIlIllll[1])) {
                    int[] nArray = new int[llIlIllll[1]];
                    nArray[B.llIlIllll[2]] = llIlIllll[20];
                    if (B.lIllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIllll[1]];
                        stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[23]];
                        if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dk = llIlIllll[2];
                            String[] stringArray2 = new String[llIlIllll[1]];
                            stringArray2[B.llIlIllll[2]] = llIlIlllI[llIlIllll[0]];
                            if (B.lIllIllIIlll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[24]];
                                    Movement.walkTo((WorldPoint)eh);
                                    0;
                                }
                                if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[21]];
                                    String[] stringArray3 = new String[llIlIllll[1]];
                                    stringArray3[B.llIlIllll[2]] = llIlIlllI[llIlIllll[25]];
                                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIlIllll[1]];
                                        stringArray4[B.llIlIllll[2]] = llIlIlllI[llIlIllll[26]];
                                        if (B.lIllIllIlIII(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIlIllll[1]];
                                            stringArray5[B.llIlIllll[2]] = llIlIlllI[llIlIllll[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIlIlllI[llIlIllll[28]]);
                                            Time.sleepTicks((int)llIlIllll[3]);
                                            0;
                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIlIllll[1]];
                            stringArray6[B.llIlIllll[2]] = llIlIlllI[llIlIllll[29]];
                            if (B.lIllIllIIllI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (B.lIllIllIIlll(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[30]];
                                    if (B.lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)ek);
                                        0;
                                        Time.sleepTicks((int)llIlIllll[1]);
                                        0;
                                    }
                                    g.a(cG);
                                }
                                if (B.lIllIllIIllI(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIlIllll[1]];
                                    stringArray7[B.llIlIllll[2]] = llIlIlllI[llIlIllll[31]];
                                    if (B.lIllIllIIllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[32]];
                                        String[] stringArray8 = new String[llIlIllll[1]];
                                        stringArray8[B.llIlIllll[2]] = llIlIlllI[llIlIllll[33]];
                                        if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIlIllll[3])) {
                                            String[] stringArray9 = new String[llIlIllll[1]];
                                            stringArray9[B.llIlIllll[2]] = llIlIlllI[llIlIllll[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());
                                            0;
                                            Time.sleepTicks((int)llIlIllll[6]);
                                            0;
                                        }
                                        if (B.lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIlIllll[1]];
                                            stringArray10[B.llIlIllll[2]] = llIlIlllI[llIlIllll[35]];
                                            String[] stringArray11 = new String[llIlIllll[1]];
                                            stringArray11[B.llIlIllll[2]] = llIlIlllI[llIlIllll[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIlIllll[3]);
                                            0;
                                        }
                                        g.a(cG);
                                    }
                                    String[] stringArray12 = new String[llIlIllll[1]];
                                    stringArray12[B.llIlIllll[2]] = llIlIlllI[llIlIllll[37]];
                                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray12) ? 1 : 0) && B.lIllIllIIlll(ef ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[38]];
                                        g.a(llIlIlllI[llIlIllll[20]], cG);
                                        if (B.lIllIllIIllI(Dialog.getText().contains(llIlIlllI[llIlIllll[39]]) ? 1 : 0)) {
                                            ef = llIlIllll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (B.lIllIllIllII(e.j(el), llIlIllll[5])) {
                    String[] stringArray = new String[llIlIllll[1]];
                    stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[40]];
                    if (B.lIllIllIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIlIllll[1]];
                        stringArray13[B.llIlIllll[2]] = llIlIlllI[llIlIllll[41]];
                        if (B.lIllIllIIlll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[42]];
                            int[] nArray = new int[llIlIllll[1]];
                            nArray[B.llIlIllll[2]] = llIlIllll[43];
                            NPCs.getNearest((int[])nArray).interact(llIlIlllI[llIlIllll[44]]);
                            Time.sleepTicks((int)llIlIllll[13]);
                            0;
                        }
                    }
                    String[] stringArray14 = new String[llIlIllll[1]];
                    stringArray14[B.llIlIllll[2]] = llIlIlllI[llIlIllll[45]];
                    if (B.lIllIllIIllI(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[46]];
                        g.a(llIlIlllI[llIlIllll[47]], cG);
                    }
                }
                String[] stringArray = new String[llIlIllll[1]];
                stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[48]];
                if (B.lIllIllIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (B.lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[49]];
                        Movement.walkTo((WorldPoint)dg);
                        0;
                        Time.sleepTicks((int)llIlIllll[1]);
                        0;
                    }
                    if (B.lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[50]];
                        if (B.lIllIllIIlII(dk, llIlIllll[1])) {
                            as.na += llIlIllll[1];
                            as.u(AccBuilderGWD.m);
                            dk += llIlIllll[1];
                            as.na = llIlIllll[2];
                            dl = llIlIllll[2];
                        }
                        g.a(llIlIlllI[llIlIllll[51]], cG);
                    }
                }
            }
        }
    }

    private static boolean lIllIllIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int af() {
        try {
            B.bs();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((95 + 123 - 148 + 64 ^ 82 + 102 - 173 + 120) == 0) {
            return (0x44 ^ 0x70 ^ (0x52 ^ 0x2A)) & (0xAA ^ 0xC7 ^ (0xBD ^ 0x9C) ^ -1);
        }
        return llIlIllll[62];
    }

    private static String lIllIllIIIII(String lIIIllIIllIlII, String lIIIllIIllIIIl) {
        try {
            SecretKeySpec lIIIllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllll[22]), "DES");
            Cipher lIIIllIIllIllI = Cipher.getInstance("DES");
            lIIIllIIllIllI.init(llIlIllll[3], lIIIllIIllIlll);
            return new String(lIIIllIIllIllI.doFinal(Base64.getDecoder().decode(lIIIllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIIllIlIl) {
            lIIIllIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIIlI() {
        llIlIlllI = new String[llIlIllll[86]];
        B.llIlIlllI[B.llIlIllll[2]] = B."Finished buying items, switching back to quest";
        B.llIlIlllI[B.llIlIllll[1]] = B."Fishing pass";
        B.llIlIlllI[B.llIlIllll[3]] = B."Nav to bank";
        B.llIlIlllI[B.llIlIllll[5]] = B."Handling banking";
        B.llIlIlllI[B.llIlIllll[6]] = B."We are missing quest supplies, switching to BUYING";
        B.llIlIlllI[B.llIlIllll[13]] = B."Drink";
        B.llIlIlllI[B.llIlIllll[15]] = B."Nav to start";
        B.llIlIlllI[B.llIlIllll[7]] = B."Starting quest";
        B.llIlIlllI[B.llIlIllll[22]] = B."Vestri";
        B.llIlIlllI[B.llIlIllll[23]] = B."Fishing trophy";
        B.llIlIlllI[B.llIlIllll[0]] = B."Red vine worm";
        B.llIlIlllI[B.llIlIllll[24]] = B."Nav to vine";
        B.llIlIlllI[B.llIlIllll[21]] = B."Digging";
        B.llIlIlllI[B.llIlIllll[25]] = B."Red vine worm";
        B.llIlIlllI[B.llIlIllll[26]] = B."Vine";
        B.llIlIlllI[B.llIlIllll[27]] = B."Vine";
        B.llIlIlllI[B.llIlIllll[28]] = B."Check";
        B.llIlIlllI[B.llIlIllll[29]] = B."Red vine worm";
        B.llIlIlllI[B.llIlIllll[30]] = B."Nav to contest";
        B.llIlIlllI[B.llIlIllll[31]] = B."Garlic";
        B.llIlIlllI[B.llIlIllll[32]] = B."Using garlic";
        B.llIlIlllI[B.llIlIllll[33]] = B."Wall Pipe";
        B.llIlIlllI[B.llIlIllll[34]] = B."Wall Pipe";
        B.llIlIlllI[B.llIlIllll[35]] = B."Garlic";
        B.llIlIlllI[B.llIlIllll[36]] = B."Wall Pipe";
        B.llIlIlllI[B.llIlIllll[37]] = B."Garlic";
        B.llIlIlllI[B.llIlIllll[38]] = B."Start contest";
        B.llIlIlllI[B.llIlIllll[20]] = B."Bonzo";
        B.llIlIlllI[B.llIlIllll[39]] = B."I might still be able to find a bigger fish";
        B.llIlIlllI[B.llIlIllll[40]] = B."Garlic";
        B.llIlIlllI[B.llIlIllll[41]] = B."Raw giant carp";
        B.llIlIlllI[B.llIlIllll[42]] = B."Fishing";
        B.llIlIlllI[B.llIlIllll[44]] = B."Bait";
        B.llIlIlllI[B.llIlIllll[45]] = B."Raw giant carp";
        B.llIlIlllI[B.llIlIllll[46]] = B."Handing in fish";
        B.llIlIlllI[B.llIlIllll[47]] = B."Bonzo";
        B.llIlIlllI[B.llIlIllll[48]] = B."Fishing trophy";
        B.llIlIlllI[B.llIlIllll[49]] = B."Nav to start";
        B.llIlIlllI[B.llIlIllll[50]] = B."Finishing quest";
        B.llIlIlllI[B.llIlIllll[51]] = B."Vestri";
        B.llIlIlllI[B.llIlIllll[52]] = B."Camelot teleport";
        B.llIlIlllI[B.llIlIllll[53]] = B."Garlic";
        B.llIlIlllI[B.llIlIllll[54]] = B."Spade";
        B.llIlIlllI[B.llIlIllll[55]] = B."Fishing rod";
        B.llIlIlllI[B.llIlIllll[56]] = B."Fishing bait";
        B.llIlIlllI[B.llIlIllll[63]] = B."Fishing contest";
        B.llIlIlllI[B.llIlIllll[64]] = B."ring of wealth (";
        B.llIlIlllI[B.llIlIllll[67]] = B."I was wondering what was down those stairs?";
        B.llIlIlllI[B.llIlIllll[68]] = B."Why not?";
        B.llIlIlllI[B.llIlIllll[69]] = B."If you were my friend I wouldn't mind it.";
        B.llIlIlllI[B.llIlIllll[19]] = B."Well, let's be friends!";
        B.llIlIlllI[B.llIlIllll[70]] = B."And how am I meant to do that?";
        B.llIlIlllI[B.llIlIllll[71]] = B."I'll enter the competition please.";
        B.llIlIlllI[B.llIlIllll[72]] = B."I have this big fish. Is it enough to win?";
        B.llIlIlllI[B.llIlIllll[73]] = B."Yes.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIllll[1]];
        nArray[B.llIlIllll[2]] = llIlIllll[8];
        if (B.lIllIllIlIIl(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIlIllll[1]];
            stringArray[B.llIlIllll[2]] = llIlIlllI[llIlIllll[52]];
            if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIllll[1]];
                stringArray2[B.llIlIllll[2]] = llIlIlllI[llIlIllll[53]];
                if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIlIllll[1]];
                    stringArray3[B.llIlIllll[2]] = llIlIlllI[llIlIllll[54]];
                    if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIlIllll[1]];
                        stringArray4[B.llIlIllll[2]] = llIlIlllI[llIlIllll[55]];
                        if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIlIllll[1]];
                            stringArray5[B.llIlIllll[2]] = llIlIlllI[llIlIllll[56]];
                            if (B.lIllIllIlIIl(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIlIllll[1]];
                                nArray2[B.llIlIllll[2]] = llIlIllll[17];
                                if (B.lIllIllIlIIl(Inventory.getCount((int[])nArray2)) && B.lIllIllIIllI(Inventory.contains((int[])f.bc) ? 1 : 0)) {
                                    n2 = llIlIllll[1];
                                    0;
                                    if (-2 < 0) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIllll[2];
        return n2 != 0;
    }

    private static boolean lIllIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (B.lIllIllIIlIl(e.j(el), llIlIllll[13])) {
            bl = llIlIllll[1];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            bl = llIlIllll[2];
        }
        return bl;
    }

    private static boolean lIllIllIlIII(Object object) {
        return object != null;
    }

    private static void lIllIllIIIll() {
        llIlIllll = new int[87];
        B.llIlIllll[0] = 0x15 ^ 0x1F;
        B.llIlIllll[1] = 1;
        B.llIlIllll[2] = (0 + 150 - 23 + 30 ^ 64 + 68 - 51 + 49) & (39 + 133 - 137 + 129 ^ 101 + 6 - 67 + 147 ^ -1);
        B.llIlIllll[3] = 2;
        B.llIlIllll[4] = 0xFFFFDBBE & 0x37C9;
        B.llIlIllll[5] = 3;
        B.llIlIllll[6] = 0xB2 ^ 0xB6;
        B.llIlIllll[7] = 0x30 ^ 0x37;
        B.llIlIllll[8] = -(20 + 6 - -125 + 10) & (0xFFFFDFE7 & 0x3FFF);
        B.llIlIllll[9] = 0xFFFF93B9 & 0x6FFE;
        B.llIlIllll[10] = -(0xFFFFFEFF & 0x7FC5) & (0xFFFFFFF7 & Short.MAX_VALUE);
        B.llIlIllll[11] = 0xFFFFE1BF & 0x1F79;
        B.llIlIllll[12] = 0xFFFFA6DF & 0x5F2E;
        B.llIlIllll[13] = 0x39 ^ 0x3C;
        B.llIlIllll[14] = 0xFFFFDFCE & 0x3F7B;
        B.llIlIllll[15] = 0x7D ^ 0x7B;
        B.llIlIllll[16] = 0xFFFFB3FD & 0x7D53;
        B.llIlIllll[17] = 0xFFFF8FFB & 0x73E7;
        B.llIlIllll[18] = 0xFFFFF3E9 & 0xFFE;
        B.llIlIllll[19] = 0xC ^ 0x3E;
        B.llIlIllll[20] = 8 + 40 - -65 + 54 ^ 49 + 135 - 137 + 141;
        B.llIlIllll[21] = 133 + 88 - 191 + 126 ^ 40 + 55 - 89 + 138;
        B.llIlIllll[22] = 0x86 ^ 0xB6 ^ (0x51 ^ 0x69);
        B.llIlIllll[23] = 0x38 ^ 0x31;
        B.llIlIllll[24] = 0x2E ^ 0x44 ^ (0x52 ^ 0x33);
        B.llIlIllll[25] = 126 + 4 - 14 + 39 ^ 131 + 137 - 243 + 125;
        B.llIlIllll[26] = 0x90 ^ 0x9E;
        B.llIlIllll[27] = 0x83 ^ 0x8C;
        B.llIlIllll[28] = 0xED ^ 0xC0 ^ (0xE ^ 0x33);
        B.llIlIllll[29] = 7 + 37 - 29 + 126 ^ 49 + 137 - 41 + 11;
        B.llIlIllll[30] = 0x8B ^ 0x99;
        B.llIlIllll[31] = 0x1C ^ 0xF;
        B.llIlIllll[32] = 0xD ^ 0x19;
        B.llIlIllll[33] = 0xD2 ^ 0xC7;
        B.llIlIllll[34] = 0x40 ^ 0x62 ^ (0x17 ^ 0x23);
        B.llIlIllll[35] = 0x45 ^ 0x52;
        B.llIlIllll[36] = 0x41 ^ 0x71 ^ (0xB ^ 0x23);
        B.llIlIllll[37] = 0x43 ^ 0x5A;
        B.llIlIllll[38] = 0x6F ^ 0x75;
        B.llIlIllll[39] = 0x30 ^ 0x2C;
        B.llIlIllll[40] = 0x96 ^ 0xB2 ^ (0x27 ^ 0x1E);
        B.llIlIllll[41] = 0x78 ^ 0x1F ^ (0xF0 ^ 0x89);
        B.llIlIllll[42] = 0x14 ^ 0x63 ^ (0xCB ^ 0xA3);
        B.llIlIllll[43] = -(0xFFFFA69D & 0x7967) & (0xFFFFEFF7 & 0x3FFC);
        B.llIlIllll[44] = 0xB3 ^ 0xA5 ^ (0xB0 ^ 0x86);
        B.llIlIllll[45] = 4 ^ 0x25;
        B.llIlIllll[46] = 134 + 151 - 174 + 62 ^ 72 + 72 - 80 + 79;
        B.llIlIllll[47] = 0x57 ^ 0x32 ^ (0xC2 ^ 0x84);
        B.llIlIllll[48] = 0xA ^ 0x5F ^ (0x20 ^ 0x51);
        B.llIlIllll[49] = 0x89 ^ 0xA2 ^ (0xCC ^ 0xC2);
        B.llIlIllll[50] = 0x71 ^ 0x57;
        B.llIlIllll[51] = 0x5A ^ 0x71 ^ (0x24 ^ 0x28);
        B.llIlIllll[52] = 0x18 ^ 0x30;
        B.llIlIllll[53] = 24 + 127 - 21 + 20 ^ 7 + 81 - 25 + 128;
        B.llIlIllll[54] = 0x75 ^ 0x7F ^ (0x5F ^ 0x7F);
        B.llIlIllll[55] = 100 + 46 - 50 + 53 ^ 8 + 147 - 14 + 49;
        B.llIlIllll[56] = 0x52 ^ 0x7E;
        B.llIlIllll[57] = 0xFFFFA72C & 0x7BFB;
        B.llIlIllll[58] = -3 & (0xFFFFB7F7 & 0x49FE);
        B.llIlIllll[59] = -(0xFFFFDBFF & 0x6404) & (0xFFFFEEFF & 0x7FCF);
        B.llIlIllll[60] = 0xFFFFEBEE & 0x75B9;
        B.llIlIllll[61] = 0xFFFFBFD7 & 0x43AC;
        B.llIlIllll[62] = 0x2F ^ 0x1B ^ (0x5B ^ 0xB);
        B.llIlIllll[63] = 0xEA ^ 0xC7;
        B.llIlIllll[64] = 0x40 ^ 0x78 ^ (0xAD ^ 0xBB);
        B.llIlIllll[65] = -(0xFFFFF5E6 & 0x5F9F) & (0xFFFFFFCF & 0x5FFD);
        B.llIlIllll[66] = 0xFFFFAD6B & 0x5FFE;
        B.llIlIllll[67] = 93 + 98 - 87 + 35 ^ 157 + 143 - 168 + 32;
        B.llIlIllll[68] = 0x56 ^ 0x66;
        B.llIlIllll[69] = (0xB2 ^ 0x89) & ~(0x50 ^ 0x6B) ^ (0x2F ^ 0x1E);
        B.llIlIllll[70] = 0x17 ^ 0x24;
        B.llIlIllll[71] = 33 + 57 - -18 + 51 ^ 150 + 118 - 134 + 37;
        B.llIlIllll[72] = 0xB1 ^ 0x84;
        B.llIlIllll[73] = 0x58 ^ 0x6E;
        B.llIlIllll[74] = -(0xFFFFF5F5 & 0x7EAF) & (0xFFFFFFB7 & 0x7FEF);
        B.llIlIllll[75] = -(0xFFFFFB3A & 0x56D7) & (0xFFFFDFB7 & 0x7FF9);
        B.llIlIllll[76] = -(0xFFFFC78F & 0x39FD) & (0xFFFFDBEF & 0x2FFF);
        B.llIlIllll[77] = 0xFFFFAFED & 0x5DBE;
        B.llIlIllll[78] = -(0xFFFFF5BF & 0x6FF9) & (0xFFFFFFFF & 0x6FFF);
        B.llIlIllll[79] = -(0xFFFFF655 & 0x29AB) & (0xFFFFAFAE & 0x7DF7);
        B.llIlIllll[80] = 0xFFFFCB54 & 0x3EFF;
        B.llIlIllll[81] = -(0xFFFFCFAF & 0x70D5) & (0xFFFFEDF6 & 0x5FFF);
        B.llIlIllll[82] = -(0xFFFFFCFF & 0x6391) & (0xFFFFEBDF & 0x7EFE);
        B.llIlIllll[83] = 0xFFFFCF75 & 0x3DFF;
        B.llIlIllll[84] = -(0xFFFFFD3F & 0x36E7) & (0xFFFFBEF7 & 0x7F7F);
        B.llIlIllll[85] = 0xFFFFAFEF & 0x5D7F;
        B.llIlIllll[86] = 86 + 34 - 22 + 73 ^ 22 + 58 - 35 + 111;
    }

    private static boolean lIllIllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIlIll(int n2, int n3) {
        return n2 <= n3;
    }
}

