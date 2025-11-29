/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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

public class Y
implements ab {
    static /* synthetic */ int dk;
    static /* synthetic */ int cI;
    public static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] lIIIIIlIlI;
    public static final /* synthetic */ WorldPoint lI;
    public static final /* synthetic */ WorldPoint lK;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint lJ;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lIIIIIlIll;
    public static final /* synthetic */ WorldPoint lL;

    private static boolean llIlllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIllIII(int n2) {
        return n2 != 0;
    }

    private static String llIlllIlIlIl(String lIIIIlIIIllIl, String lIIIIlIIIIlll) {
        lIIIIlIIIllIl = new String(Base64.getDecoder().decode(lIIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIIlIll = new StringBuilder();
        char[] lIIIIlIIIlIlI = lIIIIlIIIIlll.toCharArray();
        int lIIIIlIIIlIIl = lIIIIIlIll[0];
        char[] lIIIIlIIIIIll = lIIIIlIIIllIl.toCharArray();
        int lIIIIlIIIIIlI = lIIIIlIIIIIll.length;
        int lIIIIlIIIIIIl = lIIIIIlIll[0];
        while (Y.llIlllIllIIl(lIIIIlIIIIIIl, lIIIIlIIIIIlI)) {
            char lIIIIlIIIlllI = lIIIIlIIIIIll[lIIIIlIIIIIIl];
            lIIIIlIIIlIll.append((char)(lIIIIlIIIlllI ^ lIIIIlIIIlIlI[lIIIIlIIIlIIl % lIIIIlIIIlIlI.length]));
            0;
            ++lIIIIlIIIlIIl;
            ++lIIIIlIIIIIIl;
            0;
            if (((0x90 ^ 0xBE ^ (0xF ^ 0x78)) & (188 + 192 - 192 + 7 ^ 106 + 88 - 121 + 81 ^ -1)) == ((0x11 ^ 0x30 ^ (0xD1 ^ 0xB7)) & (0xBB ^ 0x85 ^ (0xEF ^ 0x96) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lIIIIlIIIlIll);
    }

    @Override
    public int af() {
        try {
            Y.dL();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIIlIll[53];
    }

    private static boolean llIlllIllIll(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return lIIIIIlIlI[lIIIIIlIll[28]];
    }

    private static String llIlllIlIlII(String lIIIIlIIlllIl, String lIIIIlIIllIlI) {
        try {
            SecretKeySpec lIIIIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlIIlllll = Cipher.getInstance("Blowfish");
            lIIIIlIIlllll.init(lIIIIIlIll[3], lIIIIlIlIIIII);
            return new String(lIIIIlIIlllll.doFinal(Base64.getDecoder().decode(lIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIllllI) {
            lIIIIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return lIIIIIlIll[0];
    }

    private static String llIlllIIlIIl(String lIIIIlIlIlIlI, String lIIIIlIlIlIIl) {
        try {
            SecretKeySpec lIIIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIlIll[13]), "DES");
            Cipher lIIIIlIlIllII = Cipher.getInstance("DES");
            lIIIIlIlIllII.init(lIIIIIlIll[3], lIIIIlIlIllIl);
            return new String(lIIIIlIlIllII.doFinal(Base64.getDecoder().decode(lIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIlIlIll) {
            lIIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        Y.llIlllIlIlll();
        Y.llIlllIlIllI();
        lI = new WorldPoint(lIIIIIlIll[61], lIIIIIlIll[62], lIIIIIlIll[0]);
        lJ = new WorldPoint(lIIIIIlIll[63], lIIIIIlIll[64], lIIIIIlIll[1]);
        lK = new WorldPoint(lIIIIIlIll[65], lIIIIIlIll[66], lIIIIIlIll[0]);
        lL = new WorldPoint(lIIIIIlIll[67], lIIIIIlIll[68], lIIIIIlIll[0]);
        String[] stringArray = new String[lIIIIIlIll[15]];
        stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[69]];
        stringArray[Y.lIIIIIlIll[1]] = lIIIIIlIlI[lIIIIIlIll[70]];
        stringArray[Y.lIIIIIlIll[3]] = lIIIIIlIlI[lIIIIIlIll[71]];
        stringArray[Y.lIIIIIlIll[6]] = lIIIIIlIlI[lIIIIIlIll[72]];
        stringArray[Y.lIIIIIlIll[7]] = lIIIIIlIlI[lIIIIIlIll[2]];
        stringArray[Y.lIIIIIlIll[10]] = lIIIIIlIlI[lIIIIIlIll[73]];
        stringArray[Y.lIIIIIlIll[14]] = lIIIIIlIlI[lIIIIIlIll[74]];
        cG = stringArray;
        bx = new ArrayList<d>();
        cI = lIIIIIlIll[0];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Y.llIllllIIIII(e.j(lIIIIIlIll[5]), lIIIIIlIll[53])) {
            bl = lIIIIIlIll[1];
            0;
            if (-1 != -1) {
                return ((0xAB ^ 0xAC ^ (0x44 ^ 7)) & (0x42 ^ 0x6A ^ (0xC6 ^ 0xAA) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIlIll[0];
        }
        return bl;
    }

    private static boolean llIlllIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d lIIIIlIlllIII;
        Object lIIIIlIlllIIl;
        int[] nArray = new int[lIIIIIlIll[1]];
        nArray[Y.lIIIIIlIll[0]] = lIIIIIlIll[48];
        if (Y.llIlllIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIlIll[48], lIIIIIlIll[10], j.ch);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIlIll[1]];
        nArray2[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
        if (Y.llIlllIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIIlIlllIIl = new d(lIIIIIlIll[9], lIIIIIlIll[1], lIIIIIlIll[49]);
            bx.add((d)lIIIIlIlllIIl);
            0;
        }
        if (Y.llIlllIllIlI(Bank.contains(lIIIIlIlllIIl = item -> item.getName().toLowerCase().contains(lIIIIIlIlI[lIIIIIlIll[54]])) ? 1 : 0)) {
            lIIIIlIlllIII = new d(lIIIIIlIll[50], lIIIIIlIll[10], lIIIIIlIll[51]);
            bx.add(lIIIIlIlllIII);
            0;
        }
        int[] nArray3 = new int[lIIIIIlIll[1]];
        nArray3[Y.lIIIIIlIll[0]] = lIIIIIlIll[11];
        if (Y.llIlllIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIIlIlllIII = new d(lIIIIIlIll[11], lIIIIIlIll[20], lIIIIIlIll[52]);
            bx.add(lIIIIlIlllIII);
            0;
        }
    }

    private static void llIlllIlIllI() {
        lIIIIIlIlI = new String[lIIIIIlIll[75]];
        Y.lIIIIIlIlI[Y.lIIIIIlIll[0]] = Y."Buying items";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[1]] = Y."Finished buying items, switching back to quest";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[3]] = Y."Drink";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[6]] = Y."Nav to bank";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[7]] = Y."Handling banking";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[10]] = Y."We are missing quest supplies, switching to BUYING";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[14]] = Y."Nav to romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[15]] = Y."Starting quest";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[13]] = Y."Romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[16]] = Y."Wear";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[12]] = Y."Nav to juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[17]] = Y."Talk to juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[18]] = Y."Open";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[19]] = Y."Juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[21]] = Y."Nav to romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[22]] = Y."Starting quest";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[23]] = Y."Romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[25]] = Y."Nav to father";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[26]] = Y."talk father";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[27]] = Y."Father Lawrence";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[20]] = Y."Nav to potion guy";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[29]] = Y."talk potions";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[30]] = Y."Apothecary";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[31]] = Y."Cadava potion";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[32]] = Y."Nav to potion guy";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[33]] = Y."Cadava potion";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[34]] = Y."talk potions";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[35]] = Y."Apothecary";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[36]] = Y."Cadava potion";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[37]] = Y."Wear";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[24]] = Y."Nav to juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[38]] = Y."Talk to juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[39]] = Y."Open";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[40]] = Y."Juliet";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[42]] = Y."Nav to romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[43]] = Y."Finishing quest";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[44]] = Y."Romeo";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[45]] = Y."Nav to bank";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[46]] = Y."Handling banking";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[47]] = Y."We are missing quest supplies, switching to BUYING";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[28]] = Y."Romeo & Juliet quest";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[54]] = Y."ring of wealth (";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[55]] = Y."Door";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[58]] = Y."Open";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[59]] = Y."Door";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[60]] = Y."Open";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[69]] = Y."Yes, I have seen her actually!";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[70]] = Y."Yes, ok, I'll let her know.";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[71]] = Y."Ok, thanks.";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[72]] = Y."Talk about something else.";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[2]] = Y."Talk about Romeo & Juliet.";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[73]] = Y."Ok, thanks.";
        Y.lIIIIIlIlI[Y.lIIIIIlIll[74]] = Y."Yes.";
    }

    public static void dL() {
        block52: {
            BankLocation lIIIIlIlllllI;
            block54: {
                block53: {
                    if (Y.llIlllIllIII(bv ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[0]];
                        b.a(bx);
                        if (Y.llIlllIllIIl(bx.size(), lIIIIIlIll[1])) {
                            System.out.println(lIIIIIlIlI[lIIIIIlIll[1]]);
                            bv = lIIIIIlIll[0];
                        }
                    }
                    if (!Y.llIlllIllIlI(bv ? 1 : 0)) break block52;
                    if (Y.llIlllIllIII(Inventory.contains((int[])f.bc) ? 1 : 0) && Y.llIlllIllIIl(Movement.getRunEnergy(), lIIIIIlIll[2])) {
                        Inventory.getFirst((int[])f.bc).interact(lIIIIIlIlI[lIIIIIlIll[3]]);
                        Time.sleepTicks((int)lIIIIIlIll[1]);
                        0;
                    }
                    if (Y.llIlllIllIlI(Movement.isRunEnabled() ? 1 : 0) && Y.llIlllIllIll(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!Y.llIlllIllIII(Y.an() ? 1 : 0)) break block53;
                    int[] nArray = new int[lIIIIIlIll[1]];
                    nArray[Y.lIIIIIlIll[0]] = lIIIIIlIll[4];
                    if (!Y.llIlllIllIll(Inventory.getCount((int[])nArray))) break block54;
                }
                if (Y.llIlllIllIIl(e.j(lIIIIIlIll[5]), lIIIIIlIll[1])) {
                    lIIIIlIlllllI = BankLocation.getNearest();
                    if (Y.llIlllIlllII(lIIIIlIlllllI) && Y.llIlllIllIlI(lIIIIlIlllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[6]];
                        a.a(lIIIIlIlllllI);
                        Time.sleepTicks((int)lIIIIIlIll[3]);
                        0;
                    }
                    if (Y.llIlllIlllII(lIIIIlIlllllI) && Y.llIlllIllIII(lIIIIlIlllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[7]];
                        if (Y.llIlllIllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIll[8]);
                            0;
                        }
                        if (Y.llIlllIllIII(Bank.isOpen() ? 1 : 0)) {
                            if (Y.llIlllIllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIlIll[7]);
                                0;
                            }
                            if (Y.llIlllIllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIlIll[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIIIlIll[1]];
                            nArray[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
                            if (Y.llIlllIllIlI(e.d(nArray) ? 1 : 0)) {
                                Y.Q();
                                System.out.println(lIIIIIlIlI[lIIIIIlIll[10]]);
                                bv = lIIIIIlIll[1];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIlIll[1]];
                            nArray2[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
                            if (Y.llIlllIllIII(e.d(nArray2) ? 1 : 0)) {
                                a.a(lIIIIIlIll[9], lIIIIIlIll[1]);
                                a.b(f.bc, lIIIIIlIll[3]);
                                a.a(lIIIIIlIll[11], lIIIIIlIll[12]);
                                a.b(f.bm, lIIIIIlIll[1]);
                            }
                        }
                    }
                }
            }
            if (Y.llIlllIllIII(Y.an() ? 1 : 0) && Y.llIlllIllIIl(e.j(lIIIIIlIll[5]), lIIIIIlIll[1])) {
                if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[14]];
                    if (Y.llIlllIllIIl(cI, lIIIIIlIll[1])) {
                        e.x();
                        cI += lIIIIIlIll[1];
                    }
                    Movement.walkTo((WorldPoint)lI);
                    0;
                    Time.sleepTicks((int)lIIIIIlIll[1]);
                    0;
                }
                if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[15]];
                    g.a(lIIIIIlIlI[lIIIIIlIll[13]], cG);
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[12])) {
                if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                    if (Y.llIlllIllIII(Inventory.contains((int[])f.bm) ? 1 : 0) && Y.llIlllIllIlI(Equipment.contains((int[])f.bm) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bm).interact(lIIIIIlIlI[lIIIIIlIll[16]]);
                        Time.sleepTicks((int)lIIIIIlIll[1]);
                        0;
                    }
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[12]];
                    Movement.walkTo((WorldPoint)lJ);
                    0;
                    Time.sleepTicks((int)lIIIIIlIll[1]);
                    0;
                }
                if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[17]];
                    lIIIIlIlllllI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (Y.llIlllIllIII(tileObject.getName().contains(lIIIIIlIlI[lIIIIIlIll[59]]) ? 1 : 0) && Y.llIlllIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIll[56], lIIIIIlIll[57], lIIIIIlIll[1])), lIIIIIlIll[3])) {
                            String[] stringArray = new String[lIIIIIlIll[1]];
                            stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[60]];
                            if (Y.llIlllIllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIIIIlIll[1];
                                0;
                                if (3 < (154 + 77 - 128 + 80 ^ 99 + 77 - 62 + 65)) return n2 != 0;
                                return (((0x1A ^ 0) & ~(0x97 ^ 0x8D) ^ (0x97 ^ 0x84)) & (2 ^ (0x54 ^ 0x45) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIIIIlIll[0];
                        return n2 != 0;
                    });
                    if (Y.llIlllIlllII(lIIIIlIlllllI)) {
                        lIIIIlIlllllI.interact(lIIIIIlIlI[lIIIIIlIll[18]]);
                        Time.sleepTicks((int)lIIIIIlIll[6]);
                        0;
                    }
                    g.a(lIIIIIlIlI[lIIIIIlIll[19]], cG);
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[20])) {
                if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[21]];
                    Movement.walkTo((WorldPoint)lI);
                    0;
                    Time.sleepTicks((int)lIIIIIlIll[1]);
                    0;
                }
                if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[22]];
                    g.a(lIIIIIlIlI[lIIIIIlIll[23]], cG);
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[24])) {
                if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lK), lIIIIIlIll[10])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[25]];
                    Movement.walkTo((WorldPoint)lK);
                    0;
                    Time.sleepTicks((int)lIIIIIlIll[1]);
                    0;
                }
                if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lK), lIIIIIlIll[10])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[26]];
                    g.a(lIIIIIlIlI[lIIIIIlIll[27]], cG);
                }
                g.a(cG);
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[28])) {
                if (Y.llIlllIllIlI(Y.an() ? 1 : 0)) {
                    Y.bm();
                }
                if (Y.llIlllIllIII(Y.an() ? 1 : 0)) {
                    if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[20]];
                        Movement.walkTo((WorldPoint)lL);
                        0;
                        Time.sleepTicks((int)lIIIIIlIll[1]);
                        0;
                    }
                    if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[29]];
                        g.a(lIIIIIlIlI[lIIIIIlIll[30]], cG);
                    }
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] stringArray = new String[lIIIIIlIll[1]];
                stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[31]];
                if (Y.llIlllIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                    if (Y.llIlllIllIlI(Y.an() ? 1 : 0)) {
                        Y.bm();
                    }
                    if (Y.llIlllIllIII(Y.an() ? 1 : 0) && Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[32]];
                        Movement.walkTo((WorldPoint)lL);
                        0;
                        Time.sleepTicks((int)lIIIIIlIll[1]);
                        0;
                    }
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] stringArray = new String[lIIIIIlIll[1]];
                stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[33]];
                if (Y.llIlllIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                    dk = lIIIIIlIll[0];
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[34]];
                    g.a(lIIIIIlIlI[lIIIIIlIll[35]], cG);
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] stringArray = new String[lIIIIIlIll[1]];
                stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[36]];
                if (Y.llIlllIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                        if (Y.llIlllIllIII(Inventory.contains((int[])f.bm) ? 1 : 0) && Y.llIlllIllIlI(Equipment.contains((int[])f.bm) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bm).interact(lIIIIIlIlI[lIIIIIlIll[37]]);
                            Time.sleepTicks((int)lIIIIIlIll[1]);
                            0;
                        }
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[24]];
                        Movement.walkTo((WorldPoint)lJ);
                        0;
                        Time.sleepTicks((int)lIIIIIlIll[1]);
                        0;
                    }
                    if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[38]];
                        lIIIIlIlllllI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (Y.llIlllIllIII(tileObject.getName().contains(lIIIIIlIlI[lIIIIIlIll[55]]) ? 1 : 0) && Y.llIlllIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIll[56], lIIIIIlIll[57], lIIIIIlIll[1])), lIIIIIlIll[3])) {
                                String[] stringArray = new String[lIIIIIlIll[1]];
                                stringArray[Y.lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[58]];
                                if (Y.llIlllIllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIIlIll[1];
                                    0;
                                    if (((73 + 114 - 69 + 26 ^ 34 + 28 - 20 + 121) & (0x3E ^ 0x6A ^ (0xE0 ^ 0x87) ^ -1)) <= ((0xBC ^ 0xAF ^ (0x2F ^ 6)) & (0x30 ^ 0x34 ^ (0xBA ^ 0x84) ^ -1))) return n2 != 0;
                                    return ((0xAF ^ 0xAB ^ (0xD ^ 0x3D)) & (0xED ^ 0xC0 ^ (0x12 ^ 0xB) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIIIlIll[0];
                            return n2 != 0;
                        });
                        if (Y.llIlllIlllII(lIIIIlIlllllI)) {
                            lIIIIlIlllllI.interact(lIIIIIlIlI[lIIIIIlIll[39]]);
                            Time.sleepTicks((int)lIIIIIlIll[6]);
                            0;
                        }
                        g.a(lIIIIIlIlI[lIIIIIlIll[40]], cG);
                    }
                    g.a(cG);
                }
            }
            if (Y.llIlllIlllll(e.j(lIIIIIlIll[5]), lIIIIIlIll[41])) {
                if (Y.llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13]) && Y.llIlllIllIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[42]];
                    Movement.walkTo((WorldPoint)lI);
                    0;
                    Time.sleepTicks((int)lIIIIIlIll[1]);
                    0;
                }
                if (Y.llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[43]];
                    if (Y.llIlllIllIIl(dk, lIIIIIlIll[1])) {
                        as.pO += lIIIIIlIll[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIIlIll[1];
                        as.pO = lIIIIIlIll[0];
                        dl = lIIIIIlIll[0];
                    }
                    g.a(lIIIIIlIlI[lIIIIIlIll[44]], cG);
                    Time.sleepTicks((int)lIIIIIlIll[10]);
                    0;
                }
            }
            g.a(cG);
            System.out.println("Setting: " + e.j(lIIIIIlIll[5]));
        }
    }

    private static boolean an() {
        int[] nArray = new int[lIIIIIlIll[1]];
        nArray[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
        return Inventory.contains((int[])nArray);
    }

    private static boolean llIlllIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIlllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lIIIIlIllllII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (Y.llIlllIlllII(bankLocation) && Y.llIlllIllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[45]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIIIlIll[3]);
            0;
        }
        if (Y.llIlllIlllII(lIIIIlIllllII) && Y.llIlllIllIII(lIIIIlIllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[46]];
            if (Y.llIlllIllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIll[8]);
                0;
            }
            if (Y.llIlllIllIII(Bank.isOpen() ? 1 : 0)) {
                if (Y.llIlllIllIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIIlIll[7]);
                    0;
                }
                if (Y.llIlllIllIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIIIlIll[3]);
                    0;
                }
                int[] nArray = new int[lIIIIIlIll[1]];
                nArray[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
                if (Y.llIlllIllIlI(e.d(nArray) ? 1 : 0)) {
                    Y.Q();
                    System.out.println(lIIIIIlIlI[lIIIIIlIll[47]]);
                    bv = lIIIIIlIll[1];
                    return;
                }
                int[] nArray2 = new int[lIIIIIlIll[1]];
                nArray2[Y.lIIIIIlIll[0]] = lIIIIIlIll[9];
                if (Y.llIlllIllIII(e.d(nArray2) ? 1 : 0)) {
                    a.a(lIIIIIlIll[9], lIIIIIlIll[1]);
                    a.b(f.bc, lIIIIIlIll[3]);
                    a.a(lIIIIIlIll[11], lIIIIIlIll[12]);
                    a.b(f.bm, lIIIIIlIll[1]);
                }
            }
        }
    }

    private static void llIlllIlIlll() {
        lIIIIIlIll = new int[76];
        Y.lIIIIIlIll[0] = (0x33 ^ 0x50) & ~(0x47 ^ 0x24);
        Y.lIIIIIlIll[1] = 1;
        Y.lIIIIIlIll[2] = 0x8F ^ 0xBD;
        Y.lIIIIIlIll[3] = 2;
        Y.lIIIIIlIll[4] = 0xFFFFD7EB & 0x2BF7;
        Y.lIIIIIlIll[5] = (0xF0 ^ 0x93) + (0x74 ^ 0x51) - (0x43 ^ 0x15) + (0xD1 ^ 0x8F);
        Y.lIIIIIlIll[6] = 3;
        Y.lIIIIIlIll[7] = 0x1D ^ 0x37 ^ (0x3D ^ 0x13);
        Y.lIIIIIlIll[8] = -(0xFFFFAE6E & 0x75F7) & (0xFFFFB7EF & 0x7FFD);
        Y.lIIIIIlIll[9] = 0xFFFF93F5 & 0x6EFB;
        Y.lIIIIIlIll[10] = 0x8B ^ 0x8E;
        Y.lIIIIIlIll[11] = 0xFFFFBF57 & 0x5FEF;
        Y.lIIIIIlIll[12] = 0xD3 ^ 0xB1 ^ (0x63 ^ 0xB);
        Y.lIIIIIlIll[13] = 0xA6 ^ 0xAE;
        Y.lIIIIIlIll[14] = 0xA5 ^ 0xA3;
        Y.lIIIIIlIll[15] = 21 + 4 - -75 + 38 ^ 23 + 135 - 64 + 47;
        Y.lIIIIIlIll[16] = 0x9B ^ 0x82 ^ (0x92 ^ 0x82);
        Y.lIIIIIlIll[17] = 0x94 ^ 0x9F;
        Y.lIIIIIlIll[18] = 0x94 ^ 0x98;
        Y.lIIIIIlIll[19] = 0x3E ^ 0x33;
        Y.lIIIIIlIll[20] = 24 + 85 - 99 + 137 ^ 83 + 35 - 106 + 123;
        Y.lIIIIIlIll[21] = 0xF0 ^ 0x8C ^ (0x73 ^ 1);
        Y.lIIIIIlIll[22] = 0x82 ^ 0x8D;
        Y.lIIIIIlIll[23] = 0xF4 ^ 0xB5 ^ (0xCB ^ 0x9A);
        Y.lIIIIIlIll[24] = 2 ^ 0x15 ^ (0x6F ^ 0x66);
        Y.lIIIIIlIll[25] = 0x84 ^ 0x95;
        Y.lIIIIIlIll[26] = 0x50 ^ 0x42;
        Y.lIIIIIlIll[27] = 0x34 ^ 0x27;
        Y.lIIIIIlIll[28] = 145 + 155 - 278 + 146 ^ 53 + 37 - -16 + 22;
        Y.lIIIIIlIll[29] = 0x69 ^ 0x4E ^ (0xA5 ^ 0x97);
        Y.lIIIIIlIll[30] = 0x6E ^ 0x78;
        Y.lIIIIIlIll[31] = 0x25 ^ 0x32;
        Y.lIIIIIlIll[32] = 3 + 172 - 30 + 46 ^ 165 + 61 - 82 + 23;
        Y.lIIIIIlIll[33] = 0x8C ^ 0x95;
        Y.lIIIIIlIll[34] = 0x7B ^ 0x65 ^ (6 ^ 2);
        Y.lIIIIIlIll[35] = 0x8C ^ 0x97;
        Y.lIIIIIlIll[36] = 0x56 ^ 0x4A;
        Y.lIIIIIlIll[37] = 0x84 ^ 0x99;
        Y.lIIIIIlIll[38] = 0x71 ^ 0x69 ^ (0x9F ^ 0x98);
        Y.lIIIIIlIll[39] = 0x32 ^ 5 ^ (0xA0 ^ 0xB7);
        Y.lIIIIIlIll[40] = 0x2C ^ 5 ^ (0x16 ^ 0x1E);
        Y.lIIIIIlIll[41] = 0xB ^ 0x37;
        Y.lIIIIIlIll[42] = 0x86 ^ 0xA4;
        Y.lIIIIIlIll[43] = 99 + 69 - 69 + 36 ^ 102 + 0 - 11 + 73;
        Y.lIIIIIlIll[44] = 0x63 ^ 0x47;
        Y.lIIIIIlIll[45] = 0xA1 ^ 0x84;
        Y.lIIIIIlIll[46] = 0x75 ^ 0x53;
        Y.lIIIIIlIll[47] = 0x6C ^ 0x4B;
        Y.lIIIIIlIll[48] = -(0xFFFFFCBF & 0xFEF) & (0xFFFFBDFF & Short.MAX_VALUE);
        Y.lIIIIIlIll[49] = 0xFFFF9F6C & 0x779F;
        Y.lIIIIIlIll[50] = 0xFFFFFFFF & 0x2ECC;
        Y.lIIIIIlIll[51] = 0xFFFFF7AF & 0x69F8;
        Y.lIIIIIlIll[52] = -(0xFFFFF43B & 0x2BD6) & (0xFFFFA77D & Short.MAX_VALUE);
        Y.lIIIIIlIll[53] = 6 ^ 0x62;
        Y.lIIIIIlIll[54] = 125 + 146 - 187 + 69 ^ 100 + 94 - 18 + 0;
        Y.lIIIIIlIll[55] = 0x49 ^ 0x63;
        Y.lIIIIIlIll[56] = -(0xFFFFF9AD & 0x77DB) & (0xFFFFFFDF & 0x7DFE);
        Y.lIIIIIlIll[57] = -(0xFFFFC7DD & 0x7AB3) & (0xFFFFDFFA & 0x6FF7);
        Y.lIIIIIlIll[58] = 0x6B ^ 0x40;
        Y.lIIIIIlIll[59] = 4 ^ 0x28;
        Y.lIIIIIlIll[60] = 0x27 ^ 0xA;
        Y.lIIIIIlIll[61] = 0xFFFFCEFD & 0x3D8E;
        Y.lIIIIIlIll[62] = -(0xFFFFF7FF & 0x6817) & (0xFFFFEDFF & 0x7F76);
        Y.lIIIIIlIll[63] = 0xFFFF8F5F & 0x7CF5;
        Y.lIIIIIlIll[64] = 0xFFFFBF6F & 0x4DF1;
        Y.lIIIIIlIll[65] = 0xFFFF9CBF & 0x6FF7;
        Y.lIIIIIlIll[66] = 0xFFFFADFC & 0x5F9F;
        Y.lIIIIIlIll[67] = -(0xFFFF9F97 & 0x7269) & (0xFFFFDF7F & 0x3EFB);
        Y.lIIIIIlIll[68] = 0xFFFFAF4E & 0x5DFD;
        Y.lIIIIIlIll[69] = 23 + 66 - 79 + 173 ^ 152 + 2 - 105 + 104;
        Y.lIIIIIlIll[70] = 0x48 ^ 0x72 ^ (0x70 ^ 0x65);
        Y.lIIIIIlIll[71] = 0x42 ^ 0x26 ^ (0x65 ^ 0x31);
        Y.lIIIIIlIll[72] = 94 + 79 - 159 + 155 ^ 65 + 99 - 127 + 115;
        Y.lIIIIIlIll[73] = 0x6A ^ 0x59;
        Y.lIIIIIlIll[74] = 0x88 ^ 0xBC;
        Y.lIIIIIlIll[75] = 35 + 4 - -115 + 6 ^ 17 + 48 - -22 + 62;
    }
}

