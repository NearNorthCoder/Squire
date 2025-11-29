/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class G
implements M {
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ int[] lIIlIIIIIIIlI;
    public static final /* synthetic */ WorldPoint hq;
    public static final /* synthetic */ WorldPoint hp;
    private static /* synthetic */ String[] lIIlIIIIIIIIl;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<d> bA;
    public static final /* synthetic */ WorldPoint ho;
    static /* synthetic */ int bY;
    static /* synthetic */ boolean cp;

    static {
        G.lIlIIllIllllIII();
        G.lIlIIllIlllIlll();
        ho = new WorldPoint(lIIlIIIIIIIlI[45], lIIlIIIIIIIlI[46], lIIlIIIIIIIlI[1]);
        hp = new WorldPoint(lIIlIIIIIIIlI[47], lIIlIIIIIIIlI[48], lIIlIIIIIIIlI[0]);
        hq = new WorldPoint(lIIlIIIIIIIlI[49], lIIlIIIIIIIlI[50], lIIlIIIIIIIlI[0]);
        String[] stringArray = new String[lIIlIIIIIIIlI[16]];
        stringArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[51]];
        stringArray[G.lIIlIIIIIIIlI[1]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[52]];
        stringArray[G.lIIlIIIIIIIlI[3]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[53]];
        stringArray[G.lIIlIIIIIIIlI[6]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[54]];
        stringArray[G.lIIlIIIIIIIlI[7]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[55]];
        stringArray[G.lIIlIIIIIIIlI[9]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[56]];
        stringArray[G.lIIlIIIIIIIlI[13]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[57]];
        stringArray[G.lIIlIIIIIIIlI[15]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[58]];
        bW = stringArray;
        bA = new ArrayList<d>();
        bY = lIIlIIIIIIIlI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIlIIIIIIIlI[1]];
        nArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (G.lIlIIllIlllllII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIlIIIIIIIlI[1]];
            nArray2[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[11];
            if (G.lIlIIllIlllllII(Inventory.getCount((int[])nArray2))) {
                n2 = lIIlIIIIIIIlI[1];
                "".length();
                if ("   ".length() != 0) return n2 != 0;
                return ((0xF4 ^ 0xAC) & ~(0x19 ^ 0x41)) != 0;
            }
        }
        n2 = lIIlIIIIIIIlI[0];
        return n2 != 0;
    }

    private static boolean lIlIIlllIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIllIlllIllI(String llllllllllllllIlllllllllIIIIIIII, String llllllllllllllIllllllllIllllllll) {
        try {
            SecretKeySpec llllllllllllllIlllllllllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllllIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllllIIIIIIlI.init(lIIlIIIIIIIlI[3], llllllllllllllIlllllllllIIIIIIll);
            return new String(llllllllllllllIlllllllllIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllllIIIIIIIl) {
            llllllllllllllIlllllllllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIllIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean X() {
        return lIIlIIIIIIIlI[1];
    }

    private static String lIlIIllIlllIlII(String llllllllllllllIlllllllllIIIlIIII, String llllllllllllllIlllllllllIIIlIlII) {
        llllllllllllllIlllllllllIIIlIIII = new String(Base64.getDecoder().decode(llllllllllllllIlllllllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllllllIIIlIIll = new StringBuilder();
        char[] llllllllllllllIlllllllllIIIlIIlI = llllllllllllllIlllllllllIIIlIlII.toCharArray();
        int llllllllllllllIlllllllllIIIlIIIl = lIIlIIIIIIIlI[0];
        char[] llllllllllllllIlllllllllIIIIlIll = llllllllllllllIlllllllllIIIlIIII.toCharArray();
        int llllllllllllllIlllllllllIIIIlIlI = llllllllllllllIlllllllllIIIIlIll.length;
        int llllllllllllllIlllllllllIIIIlIIl = lIIlIIIIIIIlI[0];
        while (G.lIlIIllIllllIlI(llllllllllllllIlllllllllIIIIlIIl, llllllllllllllIlllllllllIIIIlIlI)) {
            char llllllllllllllIlllllllllIIIlIllI = llllllllllllllIlllllllllIIIIlIll[llllllllllllllIlllllllllIIIIlIIl];
            llllllllllllllIlllllllllIIIlIIll.append((char)(llllllllllllllIlllllllllIIIlIllI ^ llllllllllllllIlllllllllIIIlIIlI[llllllllllllllIlllllllllIIIlIIIl % llllllllllllllIlllllllllIIIlIIlI.length]));
            "".length();
            ++llllllllllllllIlllllllllIIIlIIIl;
            ++llllllllllllllIlllllllllIIIIlIIl;
            "".length();
            if (((31 + 1 - -157 + 29 ^ 113 + 142 - 137 + 29) & (0x42 ^ 0x23 ^ (0x8E ^ 0xA6) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllllllIIIlIIll);
    }

    private static boolean lIlIIllIllllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void cp() {
        block45: {
            block48: {
                BankLocation llllllllllllllIlllllllllIIllIlIl2;
                block47: {
                    block46: {
                        if (G.lIlIIllIllllIIl(by ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[0]];
                            b.a(bA);
                            if (G.lIlIIllIllllIlI(bA.size(), lIIlIIIIIIIlI[1])) {
                                System.out.println(lIIlIIIIIIIIl[lIIlIIIIIIIlI[1]]);
                                by = lIIlIIIIIIIlI[0];
                            }
                        }
                        if (!G.lIlIIllIllllIll(by ? 1 : 0)) break block45;
                        if (G.lIlIIllIllllIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && G.lIlIIllIllllIlI(Movement.getRunEnergy(), lIIlIIIIIIIlI[2]) && G.lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0)) {
                            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[3]]);
                            Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                            "".length();
                        }
                        if (!G.lIlIIllIllllIIl(G.S() ? 1 : 0)) break block46;
                        int[] nArray = new int[lIIlIIIIIIIlI[1]];
                        nArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[4];
                        if (!G.lIlIIllIlllllII(Inventory.getCount((int[])nArray))) break block47;
                    }
                    if (G.lIlIIllIllllIlI(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                        llllllllllllllIlllllllllIIllIlIl2 = BankLocation.getNearest();
                        if (G.lIlIIllIlllllIl(llllllllllllllIlllllllllIIllIlIl2) && G.lIlIIllIllllIll(llllllllllllllIlllllllllIIllIlIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[6]];
                            a.a(llllllllllllllIlllllllllIIllIlIl2);
                        }
                        if (G.lIlIIllIlllllIl(llllllllllllllIlllllllllIIllIlIl2) && G.lIlIIllIllllIIl(llllllllllllllIlllllllllIIllIlIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (G.lIlIIllIllllIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[7]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIIIlI[8]);
                                "".length();
                            }
                            if (G.lIlIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[9]];
                                if (G.lIlIIllIlllllII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIlIIIIIIIlI[7]);
                                    "".length();
                                }
                                if (G.lIlIIllIlllllII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIlIIIIIIIlI[3]);
                                    "".length();
                                }
                                int[] nArray = new int[lIIlIIIIIIIlI[6]];
                                nArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                                nArray[G.lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                                nArray[G.lIIlIIIIIIIlI[3]] = lIIlIIIIIIIlI[12];
                                if (G.lIlIIllIllllIll(e.b(nArray) ? 1 : 0)) {
                                    G.W();
                                    System.out.println(lIIlIIIIIIIIl[lIIlIIIIIIIlI[13]]);
                                    by = lIIlIIIIIIIlI[1];
                                    return;
                                }
                                int[] nArray2 = new int[lIIlIIIIIIIlI[3]];
                                nArray2[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                                nArray2[G.lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                                if (G.lIlIIllIllllIIl(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIIlIIIIIIIlI[3]];
                                    nArray3[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                                    nArray3[G.lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                                    a.a(nArray3, lIIlIIIIIIIlI[14]);
                                }
                                if (G.lIlIIllIllllIIl(Bank.contains((int[])f.aW) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIlIIIIIIIlI[12], (int)lIIlIIIIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                }
                                if (G.lIlIIllIllllIIl(Bank.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIIlIIIIIIIlI[1]);
                                }
                            }
                        }
                    }
                }
                if (G.lIlIIllIllllIIl(G.S() ? 1 : 0) && G.lIlIIllIllllIlI(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                    if (G.lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                        if (G.lIlIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            Bank.close();
                            Time.sleepTicks((int)lIIlIIIIIIIlI[3]);
                            "".length();
                        }
                        if (G.lIlIIllIllllIll(Bank.isOpen() ? 1 : 0) && G.lIlIIllIllllIIl(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aW).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[15]]);
                            Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                            "".length();
                        }
                        if (G.lIlIIllIllllIlI(bY, lIIlIIIIIIIlI[1])) {
                            e.w();
                            bY += lIIlIIIIIIIlI[1];
                        }
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[16]];
                        Movement.walkTo((WorldPoint)ho);
                        "".length();
                        Time.sleepTicks((int)lIIlIIIIIIIlI[6]);
                        "".length();
                    }
                    if (G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[17]];
                        llllllllllllllIlllllllllIIllIlIl2 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (G.lIlIIllIllllIIl(tileObject.getName().equalsIgnoreCase(lIIlIIIIIIIIl[lIIlIIIIIIIlI[44]]) ? 1 : 0) && G.lIlIIllIlllllll(tileObject.getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[9])) {
                                n2 = lIIlIIIIIIIlI[1];
                                "".length();
                                if ((0x3A ^ 0x2A ^ (0x1E ^ 0xA)) < -" ".length()) {
                                    return ((0x93 ^ 0xAE ^ (0x64 ^ 0x13)) & (161 + 93 - 238 + 176 ^ 128 + 16 - 28 + 22 ^ -" ".length())) != 0;
                                }
                            } else {
                                n2 = lIIlIIIIIIIlI[0];
                            }
                            return n2 != 0;
                        });
                        if (G.lIlIIllIlllllIl(llllllllllllllIlllllllllIIllIlIl2)) {
                            String[] stringArray = new String[lIIlIIIIIIIlI[1]];
                            stringArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[14]];
                            if (G.lIlIIllIllllIIl(llllllllllllllIlllllllllIIllIlIl2.hasAction(stringArray) ? 1 : 0)) {
                                llllllllllllllIlllllllllIIllIlIl2.interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[18]]);
                                Time.sleepTicks((int)lIIlIIIIIIIlI[6]);
                                "".length();
                            }
                        }
                        g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[19]], bW);
                    }
                }
                if (G.lIlIIlllIIIIIII(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                    co = lIIlIIIIIIIlI[0];
                    if (G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[20]];
                        g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[21]], bW);
                    }
                    if (G.lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        String[] stringArray = new String[lIIlIIIIIIIlI[1]];
                        stringArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[22]];
                        if (G.lIlIIllIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[23]];
                            Movement.walkTo((WorldPoint)hp);
                            "".length();
                            Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                            "".length();
                        }
                    }
                    if (G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[24]];
                        g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[25]], bW);
                    }
                }
                if (G.lIlIIlllIIIIIII(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[3]) && (!G.lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0) || G.lIlIIllIllllIIl(g.L() ? 1 : 0))) {
                    g.a(bW);
                    Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                    "".length();
                }
                if (G.lIlIIlllIIIIIIl(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[6]) && !G.lIlIIlllIIIIIII(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[7])) break block48;
                try {
                    if (!G.lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0) || G.lIlIIllIllllIIl(g.L() ? 1 : 0)) {
                        g.a(bW);
                        Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                    "".length();
                }
                catch (Exception llllllllllllllIlllllllllIIllIlIl2) {
                    // empty catch block
                }
                if (" ".length() <= 0) {
                    return;
                }
                if (G.lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[6]) && G.lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[26]];
                    Movement.walkTo((WorldPoint)hq);
                    "".length();
                    Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                    "".length();
                }
                if (G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[6])) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[27]];
                    g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[28]], bW);
                }
            }
            if (G.lIlIIlllIIIIIII(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[9])) {
                String[] stringArray = new String[lIIlIIIIIIIlI[1]];
                stringArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[29]];
                if (G.lIlIIllIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (G.lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[30]];
                        if (G.lIlIIllIllllIIl(Equipment.contains((int[])f.aW) ? 1 : 0) && G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[14])) {
                            Equipment.getFirst((int[])f.aW).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[31]]);
                            Time.sleepTicks((int)lIIlIIIIIIIlI[9]);
                            "".length();
                        }
                        Movement.walkTo((WorldPoint)hp);
                        "".length();
                        Time.sleepTicks((int)lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                    if (G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[32]];
                        g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[33]], bW);
                    }
                }
            }
            if (G.lIlIIlllIIIIIII(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[9]) && G.lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[34]];
                if (G.lIlIIllIllllIlI(co, lIIlIIIIIIIlI[1])) {
                    P.lp += lIIlIIIIIIIlI[1];
                    P.d(AccBuilderRat.m);
                    co += lIIlIIIIIIIlI[1];
                    P.lp = lIIlIIIIIIIlI[0];
                    cp = lIIlIIIIIIIlI[0];
                }
                g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[35]], bW);
            }
            g.a(bW);
        }
    }

    private static boolean lIlIIllIllllIIl(int n2) {
        return n2 != 0;
    }

    private static void W() {
        d llllllllllllllIlllllllllIIllIIIl;
        Object llllllllllllllIlllllllllIIllIIlI;
        int[] nArray = new int[lIIlIIIIIIIlI[1]];
        nArray[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (G.lIlIIllIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIIIIIIIlI[10], lIIlIIIIIIIlI[14], lIIlIIIIIIIlI[36]);
            bA.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIIlIIIIIIIlI[1]];
        nArray2[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[11];
        if (G.lIlIIllIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllIlllllllllIIllIIlI = new d(lIIlIIIIIIIlI[11], lIIlIIIIIIIlI[14], lIIlIIIIIIIlI[36]);
            bA.add((d)llllllllllllllIlllllllllIIllIIlI);
            "".length();
        }
        int[] nArray3 = new int[lIIlIIIIIIIlI[1]];
        nArray3[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[12];
        if (G.lIlIIllIllllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllIlllllllllIIllIIlI = new d(lIIlIIIIIIIlI[12], lIIlIIIIIIIlI[1], lIIlIIIIIIIlI[37]);
            bA.add((d)llllllllllllllIlllllllllIIllIIlI);
            "".length();
        }
        if (G.lIlIIllIllllIll(Bank.contains((Predicate)(llllllllllllllIlllllllllIIllIIlI = item -> item.getName().toLowerCase().contains(lIIlIIIIIIIIl[lIIlIIIIIIIlI[43]]))) ? 1 : 0)) {
            llllllllllllllIlllllllllIIllIIIl = new d(lIIlIIIIIIIlI[38], lIIlIIIIIIIlI[9], lIIlIIIIIIIlI[37]);
            bA.add(llllllllllllllIlllllllllIIllIIIl);
            "".length();
        }
        int[] nArray4 = new int[lIIlIIIIIIIlI[1]];
        nArray4[G.lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (G.lIlIIllIllllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllIlllllllllIIllIIIl = new d(lIIlIIIIIIIlI[10], lIIlIIIIIIIlI[39], lIIlIIIIIIIlI[36]);
            bA.add(llllllllllllllIlllllllllIIllIIIl);
            "".length();
        }
        if (G.lIlIIllIllllIll(Bank.contains((int[])f.ba) ? 1 : 0)) {
            llllllllllllllIlllllllllIIllIIIl = new d(lIIlIIIIIIIlI[40], lIIlIIIIIIIlI[9], h.bv);
            bA.add(llllllllllllllIlllllllllIIllIIIl);
            "".length();
        }
    }

    private static boolean lIlIIlllIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int Y() {
        try {
            G.cp();
            "".length();
        }
        catch (Exception llllllllllllllIlllllllllIIlIllll) {
            llllllllllllllIlllllllllIIlIllll.printStackTrace();
        }
        if (null != null) {
            return (0xEF ^ 0x92 ^ (4 ^ 0x6A)) & (0x68 ^ 0x56 ^ (3 ^ 0x2E) ^ -" ".length());
        }
        return lIIlIIIIIIIlI[41];
    }

    private static void lIlIIllIllllIII() {
        lIIlIIIIIIIlI = new int[59];
        G.lIIlIIIIIIIlI[0] = (0xFF ^ 0xA3) & ~(0xEC ^ 0xB0);
        G.lIIlIIIIIIIlI[1] = " ".length();
        G.lIIlIIIIIIIlI[2] = 0x2D ^ 0x1F;
        G.lIIlIIIIIIIlI[3] = "  ".length();
        G.lIIlIIIIIIIlI[4] = 0xFFFFFBEB & 0x7F7;
        G.lIIlIIIIIIIlI[5] = 0x51 ^ 0x6E;
        G.lIIlIIIIIIIlI[6] = "   ".length();
        G.lIIlIIIIIIIlI[7] = 0x55 ^ 0x51;
        G.lIIlIIIIIIIlI[8] = -(0xFFFFEDEE & 0x7E75) & (0xFFFFFFEB & Short.MAX_VALUE);
        G.lIIlIIIIIIIlI[9] = 0x9B ^ 0x9E;
        G.lIIlIIIIIIIlI[10] = 0xFFFFFF4F & 0x1FF7;
        G.lIIlIIIIIIIlI[11] = 0xFFFFBFE8 & 0x5F5F;
        G.lIIlIIIIIIIlI[12] = 0xFFFFEFFE & 0x3ECB;
        G.lIIlIIIIIIIlI[13] = 112 + 48 - 55 + 26 ^ 105 + 11 - -7 + 10;
        G.lIIlIIIIIIIlI[14] = 0x92 ^ 0x98;
        G.lIIlIIIIIIIlI[15] = 0x72 ^ 0x75;
        G.lIIlIIIIIIIlI[16] = 80 + 113 - 75 + 67 ^ 167 + 46 - 91 + 55;
        G.lIIlIIIIIIIlI[17] = 0x48 ^ 0x41;
        G.lIIlIIIIIIIlI[18] = 0x2C ^ 0x27;
        G.lIIlIIIIIIIlI[19] = 0x3A ^ 0x36;
        G.lIIlIIIIIIIlI[20] = 52 + 145 - 145 + 94 ^ 5 + 57 - -58 + 39;
        G.lIIlIIIIIIIlI[21] = 0x55 ^ 0x5B;
        G.lIIlIIIIIIIlI[22] = 134 + 36 - 87 + 99 ^ 76 + 64 - 59 + 104;
        G.lIIlIIIIIIIlI[23] = 68 + 8 - -5 + 58 ^ 113 + 121 - 224 + 145;
        G.lIIlIIIIIIIlI[24] = 0x42 ^ 0x2D ^ (0x2E ^ 0x50);
        G.lIIlIIIIIIIlI[25] = 0x65 ^ 0x74 ^ "   ".length();
        G.lIIlIIIIIIIlI[26] = 0x8A ^ 0xA6 ^ (0x23 ^ 0x1C);
        G.lIIlIIIIIIIlI[27] = 0x38 ^ 0x2C;
        G.lIIlIIIIIIIlI[28] = 0x17 ^ 2;
        G.lIIlIIIIIIIlI[29] = 0x58 ^ 0x3D ^ (0xDD ^ 0xAE);
        G.lIIlIIIIIIIlI[30] = 0x59 ^ 0x4E;
        G.lIIlIIIIIIIlI[31] = 38 + 119 - 118 + 123 ^ 77 + 0 - -3 + 106;
        G.lIIlIIIIIIIlI[32] = 8 ^ 0x11;
        G.lIIlIIIIIIIlI[33] = 0xB8 ^ 0xA2;
        G.lIIlIIIIIIIlI[34] = 160 + 112 - 69 + 18 ^ 193 + 99 - 181 + 87;
        G.lIIlIIIIIIIlI[35] = 0xAD ^ 0xA3 ^ (0xBE ^ 0xAC);
        G.lIIlIIIIIIIlI[36] = -(0xBB ^ 0xA8) & (0xFFFFAF7E & 0x57FF);
        G.lIIlIIIIIIIlI[37] = 0xFFFFE3BE & 0x7DE9;
        G.lIIlIIIIIIIlI[38] = -(0xFFFFD936 & 0x76CB) & (0xFFFFFFFF & 0x7ECD);
        G.lIIlIIIIIIIlI[39] = 0x40 ^ 3 ^ (0xEA ^ 0x81);
        G.lIIlIIIIIIIlI[40] = 0xFFFFF37F & 0x3DD1;
        G.lIIlIIIIIIIlI[41] = 0x4D ^ 0x3A ^ (0x65 ^ 0x76);
        G.lIIlIIIIIIIlI[42] = 0x47 ^ 0x5C ^ (0xB3 ^ 0xB5);
        G.lIIlIIIIIIIlI[43] = 0x23 ^ 0x7F ^ (0x13 ^ 0x51);
        G.lIIlIIIIIIIlI[44] = 0xE0 ^ 0xC5 ^ (0x17 ^ 0x2D);
        G.lIIlIIIIIIIlI[45] = -(0xFFFFEF31 & 0x53DF) & (0xFFFFCFDB & 0x7FBE);
        G.lIIlIIIIIIIlI[46] = 0xFFFFBED4 & 0x4DBF;
        G.lIIlIIIIIIIlI[47] = -(0xFFFFD3EF & 0x7DF1) & (0xFFFFFFFF & 0x5DFD);
        G.lIIlIIIIIIIlI[48] = 0xFFFFA5F2 & 0x7F6F;
        G.lIIlIIIIIIIlI[49] = -(0xFFFFF39F & 0x7D6B) & (0xFFFFFDFF & 0x7FBE);
        G.lIIlIIIIIIIlI[50] = 0xFFFF9F4D & 0x6DFB;
        G.lIIlIIIIIIIlI[51] = 0xB0 ^ 0x8F ^ (0x78 ^ 0x67);
        G.lIIlIIIIIIIlI[52] = 0x62 ^ 0x43;
        G.lIIlIIIIIIIlI[53] = 0xA5 ^ 0x87;
        G.lIIlIIIIIIIlI[54] = 0x66 ^ 8 ^ (0x14 ^ 0x59);
        G.lIIlIIIIIIIlI[55] = 0x2F ^ 0xB;
        G.lIIlIIIIIIIlI[56] = 0x4B ^ 0x6E;
        G.lIIlIIIIIIIlI[57] = 0x95 ^ 0xB3;
        G.lIIlIIIIIIIlI[58] = 133 + 110 - 226 + 126 ^ 70 + 73 - 85 + 110;
    }

    private static boolean lIlIIllIlllllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlllllII(int n2) {
        return n2 > 0;
    }

    @Override
    public String Z() {
        return lIIlIIIIIIIIl[lIIlIIIIIIIlI[42]];
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (G.lIlIIlllIIIIIlI(e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[13])) {
            bl = lIIlIIIIIIIlI[1];
            "".length();
            if (((0x49 ^ 0x1D) & ~(0xED ^ 0xB9)) != 0) {
                return ((0xA6 ^ 0xBB) & ~(0x1B ^ 6)) != 0;
            }
        } else {
            bl = lIIlIIIIIIIlI[0];
        }
        return bl;
    }

    private static void lIlIIllIlllIlll() {
        lIIlIIIIIIIIl = new String[lIIlIIIIIIIlI[39]];
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[0]] = G.lIlIIllIlllIlII("FCUJCCgxcBkVIzsj", "VPpaF");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[1]] = G.lIlIIllIlllIlIl("4udTrBt9IghlgOJszn4tIfbuCsc0TQ9H2r5m9G0jgABQvj6HbmXI7M1aRUg6ZJRU", "VNdGI");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[3]] = G.lIlIIllIlllIllI("+nkOrmr2pLA=", "MfXjh");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[6]] = G.lIlIIllIlllIllI("QzekH9F/Pclszz4LZaQKT0koB5ELHFx1", "YSjSQ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[7]] = G.lIlIIllIlllIllI("IvN49oJfkoFGDqB68TTX5Q==", "GWFoa");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[9]] = G.lIlIIllIlllIllI("aO9/q5MHT15bNIXwIzVF4QjFzDfodFY6", "dvnru");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[13]] = G.lIlIIllIlllIlIl("jEYZbARXnzrM2t9zvj9RFbS9LYjRQuInmDazQUEtsxU7MQKvJknrDDECyJVVQ95J059Tcldp2jE=", "rMmcm");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[15]] = G.lIlIIllIlllIlIl("OAW57h/X4e4=", "uWHTb");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[16]] = G.lIlIIllIlllIlII("BCsHKAsrPhgvC2o+HmEfPisDNQ==", "JJqAl");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[17]] = G.lIlIIllIlllIlII("PyUhEiseKihWIx4lIxkgAiE=", "wDOvG");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[14]] = G.lIlIIllIlllIllI("9FcKFjPKdhY=", "JGEGV");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[18]] = G.lIlIIllIlllIlII("ADYBHw==", "OFdqG");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[19]] = G.lIlIIllIlllIlII("EjcxD0weLSgLDz8t", "VBZjl");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[20]] = G.lIlIIllIlllIlIl("MHUgV9twK6LYEu1dFtlnsWZJ2ccwBZMw", "jSLTn");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[21]] = G.lIlIIllIlllIlIl("NEleI/VTbWHpqFyuRXPnRA==", "lTkZo");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[22]] = G.lIlIIllIlllIlII("KzsqcDMLPjEjKgs8", "jRXPG");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[23]] = G.lIlIIllIlllIllI("rFQPw9MxArOc1fRXXyvTvvgObRrfC4zF", "RhWvO");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[24]] = G.lIlIIllIlllIlIl("RGEjC+EA48fKPoR2qbp/Qg==", "zsDdd");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[25]] = G.lIlIIllIlllIlIl("j2/CBQMeLf0ELTUXG0g9dkjZ+ZcQUlcP", "HyUZU");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[26]] = G.lIlIIllIlllIlIl("JayRp3+EJICE9q8HPkFMfR8H4BUTcMYk", "GnLAx");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[27]] = G.lIlIIllIlllIlIl("l0KhGajJBPJtkmO7pUFVDA==", "KVavv");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[28]] = G.lIlIIllIlllIlIl("dqPDflj2sv8=", "fJPjJ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[29]] = G.lIlIIllIlllIllI("7RcJ92SoFz6BqV6h3KS80Q==", "iZMUs");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[30]] = G.lIlIIllIlllIlIl("yUpoBqtGPv9m53KkmswPgJ1do5XP0i8y", "OnnSc");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[31]] = G.lIlIIllIlllIlIl("u8xWsw6Zlsj0d740GKUTUg==", "fmNci");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[32]] = G.lIlIIllIlllIlII("AygCNCYiJwtwKSMoGA==", "KIlPJ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[33]] = G.lIlIIllIlllIlII("CjosDDwqLypEAi4sPQ01JDo=", "KHOdQ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[34]] = G.lIlIIllIlllIllI("w9uC169VOWwkPhb3GrSgNg==", "NBsii");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[35]] = G.lIlIIllIlllIlIl("uQNhKHTACnIJR5Q3t4xc1jz+/Yo1hXnJ", "bGoCb");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[42]] = G.lIlIIllIlllIllI("l5fbNfhEL0tqlLIb/XqV8M0E+eOKBdFE", "aSRbo");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[43]] = G.lIlIIllIlllIlIl("sOAPiGw43ov7uJaXWOod04oALFU7xIkJ", "kcGkW");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[44]] = G.lIlIIllIlllIllI("thd7AseLNMI=", "vhYUQ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[51]] = G.lIlIIllIlllIlII("HxYfF0IuGBxSAzkOSQMXMgQdAUIxGBtSDzJI", "Wwirb");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[52]] = G.lIlIIllIlllIlIl("PLr1RpFy8ozwHSvUfuy/PV7rNNNM6x59", "DbVbT");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[53]] = G.lIlIIllIlllIlIl("eJ+YoLxwK7QLyXoNI4QGV2ppOPuVajkM+Omd6044YvLPgNnaaQEBIw==", "oWGGH");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[54]] = G.lIlIIllIlllIllI("RmFbmKtqFZedARGwW/kLE8WuiQDxJy23", "RzcdC");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[55]] = G.lIlIIllIlllIllI("bWsesCQJ8YHKt6BGTorXGA==", "SoqjU");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[56]] = G.lIlIIllIlllIlII("Hk8xIHE1DSIrcSQNKTFxPw01IHEgATMtcTZINyQyPAkgIHExBzVlKDgdaQ==", "WhGEQ");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[57]] = G.lIlIIllIlllIllI("KoktKrafbNA=", "UoENy");
        G.lIIlIIIIIIIIl[G.lIIlIIIIIIIlI[58]] = G.lIlIIllIlllIlII("PSl4KRwfJzxm", "zFXHt");
    }

    private static String lIlIIllIlllIlIl(String llllllllllllllIlllllllllIIlIIIll, String llllllllllllllIlllllllllIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllllllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIIlI[16]), "DES");
            Cipher llllllllllllllIlllllllllIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllllllIIlIIlll.init(lIIlIIIIIIIlI[3], llllllllllllllIlllllllllIIlIlIII);
            return new String(llllllllllllllIlllllllllIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllllIIlIIllI) {
            llllllllllllllIlllllllllIIlIIllI.printStackTrace();
            return null;
        }
    }
}

