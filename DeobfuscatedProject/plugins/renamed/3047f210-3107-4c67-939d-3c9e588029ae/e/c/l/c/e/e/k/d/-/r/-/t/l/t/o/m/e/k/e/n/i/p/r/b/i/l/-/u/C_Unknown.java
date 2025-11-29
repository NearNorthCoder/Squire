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
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class C_Unknown
implements S {
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ int bS;
    private static final /* synthetic */ int gJ;
    private static final /* synthetic */ WorldPoint gL;
    private static /* synthetic */ int[] lllIlllIIl;
    private static final /* synthetic */ int gK;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int gI;
    private static final /* synthetic */ String[] gM;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lllIlllIII;

    private static boolean llIIlIIlIlIII(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            C.cb();
            0;
        }
        catch (Exception var7) {
            var7.printStackTrace();
        }
        
        }
        return lllIlllIIl[18];
    }

    public static void cb() {
        block22: {
            BankLocation var2;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (C.llIIlIIlIIlII(bs ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[0]];
                                    b.a(bu);
                                    if (C.llIIlIIlIIlIl(bu.size(), lllIlllIIl[1])) {
                                        System.out.println(lllIlllIII[lllIlllIIl[1]]);
                                        bs = lllIlllIIl[0];
                                    }
                                }
                                if (!C.llIIlIIlIIllI(bs ? 1 : 0)) break block22;
                                if (C.llIIlIIlIIlII(Inventory.contains((int[])f.aU) ? 1 : 0) && C.llIIlIIlIIlIl(Movement.getRunEnergy(), lllIlllIIl[2])) {
                                    Inventory.getFirst((int[])f.aU).interact(lllIlllIII[lllIlllIIl[3]]);
                                    Time.sleepTicks((int)lllIlllIIl[1]);
                                    0;
                                }
                                if (C.llIIlIIlIIllI(Movement.isRunEnabled() ? 1 : 0) && C.llIIlIIlIIlll(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!C.llIIlIIlIIllI(C.aa() ? 1 : 0) || !C.llIIlIIlIIlIl(e.j(lllIlllIIl[4]), lllIlllIIl[1])) break block23;
                                var2 = BankLocation.getNearest();
                                if (C.llIIlIIlIlIII(var2) && C.llIIlIIlIIllI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[5]];
                                    a.a(var2);
                                    Time.sleepTicks((int)lllIlllIIl[3]);
                                    0;
                                }
                                if (!C.llIIlIIlIlIII(var2) || !C.llIIlIIlIIlII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[6]];
                                if (C.llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIIl[7]);
                                    0;
                                }
                                if (!C.llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) break block23;
                                if (C.llIIlIIlIIlll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIlllIIl[6]);
                                    0;
                                }
                                if (C.llIIlIIlIIlll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIlllIIl[3]);
                                    0;
                                }
                                int[] nArray = new int[lllIlllIIl[1]];
                                nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lllIlllIIl[1]];
                                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIlIIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIlllIIl[9])) break block25;
                            }
                            int[] nArray = new int[lllIlllIIl[1]];
                            nArray[C.lllIlllIIl[0]] = lllIlllIIl[10];
                            if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lllIlllIIl[1]];
                            nArray3[C.lllIlllIIl[0]] = lllIlllIIl[10];
                            if (!C.llIIlIIlIlIIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIIl[3])) break block25;
                        }
                        int[] nArray = new int[lllIlllIIl[1]];
                        nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lllIlllIIl[1]];
                        nArray4[C.lllIlllIIl[0]] = lllIlllIIl[11];
                        if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray4).getQuantity(), lllIlllIIl[6])) break block27;
                    }
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[12]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray = new int[lllIlllIIl[6]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIllI(e.b(nArray) ? 1 : 0)) {
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[9]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray5 = new int[lllIlllIIl[6]];
                nArray5[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray5[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray5[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray5[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIlII(e.b(nArray5) ? 1 : 0)) {
                    a.a(lllIlllIIl[11], lllIlllIIl[6]);
                    a.a(lllIlllIIl[10], lllIlllIIl[3]);
                    a.a(lllIlllIIl[8], lllIlllIIl[9]);
                    a.a(lllIlllIIl[13], lllIlllIIl[1]);
                }
                if (C.llIIlIIlIIlII(AccBuilderTempleTrek.e ? 1 : 0)) {
                    a.b(f.be, lllIlllIIl[1]);
                }
            }
            if (C.llIIlIIlIIllI(C.aa() ? 1 : 0) && C.llIIlIIlIIlll(e.j(lllIlllIIl[4])) && C.llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) {
                C.cc();
            }
            if ((!C.llIIlIIlIIllI(C.aa() ? 1 : 0) || C.llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) && C.llIIlIIlIIlIl(e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
                if (C.llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[6])) {
                    ck = lllIlllIIl[0];
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[15]];
                    if (C.llIIlIIlIIlIl(bS, lllIlllIIl[1])) {
                        e.v();
                        bS += lllIlllIIl[1];
                    }
                    Movement.walkTo((WorldPoint)gL);
                    0;
                }
                if (C.llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[9])) {
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[16]];
                    String[] stringArray = new String[lllIlllIIl[1]];
                    stringArray[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[17]];
                    var2 = TileObjects.getNearest((String[])stringArray);
                    if (C.llIIlIIlIlIII(var2)) {
                        String[] stringArray2 = new String[lllIlllIIl[1]];
                        stringArray2[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[18]];
                        if (C.llIIlIIlIIlII(var2.hasAction(stringArray2) ? 1 : 0)) {
                            var2.interact(lllIlllIII[lllIlllIIl[19]]);
                            Time.sleepTicks((int)lllIlllIIl[5]);
                            0;
                        }
                    }
                    if (C.llIIlIIlIIlIl(ck, lllIlllIIl[1])) {
                        ac.mY += lllIlllIIl[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIlllIIl[1];
                        ac.mY = lllIlllIIl[0];
                        cl = lllIlllIIl[0];
                    }
                    g.a(lllIlllIII[lllIlllIIl[20]], gM);
                }
            }
            g.a(new String[lllIlllIIl[0]]);
        }
        System.out.println("Setting: " + e.j(lllIlllIIl[4]));
    }

    @Override
    public boolean V() {
        boolean bl;
        if (C.llIIlIIlIlIIl(e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
            bl = lllIlllIIl[1];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            bl = lllIlllIIl[0];
        }
        return bl;
    }

    private static String llIIlIIlIIIII(String var21, String var6) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lllIlllIIl[16]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lllIlllIIl[3], var22);
            return new String(var13.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    static {
        C.llIIlIIlIIIll();
        C.llIIlIIlIIIlI();
        gI = lllIlllIIl[8];
        gK = lllIlllIIl[11];
        gJ = lllIlllIIl[10];
        gL = new WorldPoint(lllIlllIIl[32], lllIlllIIl[33], lllIlllIIl[0]);
        String[] stringArray = new String[lllIlllIIl[6]];
        stringArray[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[34]];
        stringArray[C.lllIlllIIl[1]] = lllIlllIII[lllIlllIIl[35]];
        stringArray[C.lllIlllIIl[3]] = lllIlllIII[lllIlllIIl[36]];
        stringArray[C.lllIlllIIl[5]] = lllIlllIII[lllIlllIIl[37]];
        gM = stringArray;
        bu = new ArrayList<d>();
        bS = lllIlllIIl[0];
    }

    private static String llIIlIIIlllll(String var4, String var3) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lllIlllIIl[3], var18);
            return new String(var23.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String U() {
        return lllIlllIII[lllIlllIIl[30]];
    }

    @Override
    public boolean S() {
        return lllIlllIIl[0];
    }

    private static void llIIlIIlIIIlI() {
        lllIlllIII = new String[lllIlllIIl[38]];
        C.lllIlllIII[C.lllIlllIIl[0]] = C."Buying items";
        C.lllIlllIII[C.lllIlllIIl[1]] = C."Finished buying items, switching back to quest";
        C.lllIlllIII[C.lllIlllIIl[3]] = C."Drink";
        C.lllIlllIII[C.lllIlllIIl[5]] = C."Nav to bank";
        C.lllIlllIII[C.lllIlllIIl[6]] = C."Handling banking";
        C.lllIlllIII[C.lllIlllIIl[12]] = C."We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[9]] = C."We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[15]] = C."Nav to start";
        C.lllIlllIII[C.lllIlllIIl[16]] = C."Handle dialog";
        C.lllIlllIII[C.lllIlllIIl[17]] = C."Door";
        C.lllIlllIII[C.lllIlllIIl[18]] = C."Open";
        C.lllIlllIII[C.lllIlllIIl[19]] = C."Open";
        C.lllIlllIII[C.lllIlllIIl[20]] = C."Doric";
        C.lllIlllIII[C.lllIlllIIl[21]] = C."Nav to bank";
        C.lllIlllIII[C.lllIlllIIl[22]] = C."Handling banking";
        C.lllIlllIII[C.lllIlllIIl[23]] = C."We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[30]] = C."Dorics quest";
        C.lllIlllIII[C.lllIlllIIl[31]] = C."ring of wealth (";
        C.lllIlllIII[C.lllIlllIIl[34]] = C."I wanted to use your anvils.";
        C.lllIlllIII[C.lllIlllIIl[35]] = C."Yes, I will get you the materials.";
        C.lllIlllIII[C.lllIlllIIl[36]] = C."Certainly, I'll be right back!";
        C.lllIlllIII[C.lllIlllIIl[37]] = C."Yes.";
    }

    private static boolean llIIlIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIIIll() {
        lllIlllIIl = new int[39];
        C.lllIlllIIl[0] = (0xA5 ^ 0x8A) & ~(0x98 ^ 0xB7);
        C.lllIlllIIl[1] = 1;
        C.lllIlllIIl[2] = 0x1B ^ 0x65 ^ (0xD8 ^ 0x94);
        C.lllIlllIIl[3] = 2;
        C.lllIlllIIl[4] = 0x77 ^ 0x68;
        C.lllIlllIIl[5] = 3;
        C.lllIlllIIl[6] = 0xD1 ^ 0x84 ^ (0x72 ^ 0x23);
        C.lllIlllIIl[7] = -(0xFFFFE66F & 0x5DF6) & (0xFFFFFFEF & 0x57FD);
        C.lllIlllIIl[8] = -(0xFFFFFD77 & 0x6E8E) & (0xFFFFFFFF & 0x6DB7);
        C.lllIlllIIl[9] = 0xB9 ^ 0xBF;
        C.lllIlllIIl[10] = -(0xFFFFFF7F & 0x7EC7) & (0xFFFFFFFE & Short.MAX_VALUE);
        C.lllIlllIIl[11] = 0xFFFFB1FC & 0x4FB7;
        C.lllIlllIIl[12] = 4 ^ 0x30 ^ (0x4E ^ 0x7F);
        C.lllIlllIIl[13] = 0xFFFF9F5B & 0x7FED;
        C.lllIlllIIl[14] = 0xC0 ^ 0xA4;
        C.lllIlllIIl[15] = 0xBA ^ 0xBD;
        C.lllIlllIIl[16] = 0x7D ^ 0x75;
        C.lllIlllIIl[17] = 0x59 ^ 0x50;
        C.lllIlllIIl[18] = 116 + 26 - 3 + 16 ^ 83 + 32 - 10 + 40;
        C.lllIlllIIl[19] = 7 ^ 0xC;
        C.lllIlllIIl[20] = 0x5B ^ 0x28 ^ 90 + 66 - 34 + 5;
        C.lllIlllIIl[21] = 0xAE ^ 0xA3;
        C.lllIlllIIl[22] = 0x85 ^ 0xA6 ^ (0xA3 ^ 0x8E);
        C.lllIlllIIl[23] = 0x4E ^ 0x2D ^ (0x3C ^ 0x50);
        C.lllIlllIIl[24] = -(0xFFFFDAAD & 0x7D53) & (0xFFFFDBFC & 0x7DF7);
        C.lllIlllIIl[25] = -(0xFFFFF1DB & 0x5F36) & (0xFFFFFFDF & 0x7FFD);
        C.lllIlllIIl[26] = 0xFFFFF1AE & 0x6FF9;
        C.lllIlllIIl[27] = 0xFFFFFFE7 & 0x1F5F;
        C.lllIlllIIl[28] = 0x8F ^ 0xA7;
        C.lllIlllIIl[29] = 0xFFFFD7FF & 0x2DDC;
        C.lllIlllIIl[30] = 0xAA ^ 0x94 ^ (0x8F ^ 0xA1);
        C.lllIlllIIl[31] = 76 + 157 - 197 + 123 ^ 35 + 36 - 6 + 77;
        C.lllIlllIIl[32] = 0xFFFFEBC7 & 0x1FBF;
        C.lllIlllIIl[33] = 0xFFFFDF7F & 0x2DFB;
        C.lllIlllIIl[34] = 0xA3 ^ 0x84 ^ (0xB ^ 0x3E);
        C.lllIlllIIl[35] = 0x36 ^ 0x25;
        C.lllIlllIIl[36] = 0x5B ^ 0x44 ^ (0x8A ^ 0x81);
        C.lllIlllIIl[37] = 0x36 ^ 0x23;
        C.lllIlllIIl[38] = 0x97 ^ 0x81;
    }

    private static void ae() {
        d var17;
        Object var24;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lllIlllIIl[1]];
                                nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lllIlllIIl[1]];
                                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lllIlllIIl[1]];
                                nArray3[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIIl[9])) break block13;
                            }
                            var24 = new d(lllIlllIIl[8], lllIlllIIl[9], lllIlllIIl[24]);
                            bu.add((d)var24);
                            0;
                        }
                        int[] nArray = new int[lllIlllIIl[1]];
                        nArray[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lllIlllIIl[1]];
                        nArray4[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lllIlllIIl[1]];
                        nArray5[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray5).getQuantity(), lllIlllIIl[3])) break block15;
                    }
                    var24 = new d(lllIlllIIl[10], lllIlllIIl[3], lllIlllIIl[24]);
                    bu.add((d)var24);
                    0;
                }
                int[] nArray = new int[lllIlllIIl[1]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lllIlllIIl[1]];
                nArray6[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lllIlllIIl[1]];
                nArray7[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lllIlllIIl[6])) break block17;
            }
            var24 = new d(lllIlllIIl[11], lllIlllIIl[6], lllIlllIIl[24]);
            bu.add((d)var24);
            0;
        }
        int[] nArray = new int[lllIlllIIl[1]];
        nArray[C.lllIlllIIl[0]] = lllIlllIIl[13];
        if (C.llIIlIIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var24 = new d(lllIlllIIl[13], lllIlllIIl[12], lllIlllIIl[7]);
            bu.add((d)var24);
            0;
        }
        if (C.llIIlIIlIIllI(Bank.contains((Predicate)(var24 = item -> item.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]))) ? 1 : 0)) {
            var17 = new d(lllIlllIIl[25], lllIlllIIl[12], lllIlllIIl[26]);
            bu.add(var17);
            0;
        }
        int[] nArray8 = new int[lllIlllIIl[1]];
        nArray8[C.lllIlllIIl[0]] = lllIlllIIl[27];
        if (C.llIIlIIlIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var17 = new d(lllIlllIIl[27], lllIlllIIl[28], lllIlllIIl[29]);
            bu.add(var17);
            0;
        }
    }

    private static boolean llIIlIIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIIlIIlIIIIl(String var14, String var20) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var9 = var20.toCharArray();
        int var12 = lllIlllIIl[0];
        char[] var1 = var14.toCharArray();
        int var19 = var1.length;
        int var10 = lllIlllIIl[0];
        while (C.llIIlIIlIIlIl(var10, var19)) {
            char var11 = var1[var10];
            var16.append((char)(var11 ^ var9[var12 % var9.length]));
            0;
            ++var12;
            ++var10;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean llIIlIIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cc() {
        void var15;
        BankLocation bankLocation = BankLocation.getNearest();
        if (C.llIIlIIlIlIII(bankLocation) && C.llIIlIIlIIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lllIlllIIl[3]);
            0;
        }
        if (C.llIIlIIlIlIII(var15) && C.llIIlIIlIIlII(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[22]];
            if (C.llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIIl[7]);
                0;
            }
            if (C.llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                if (C.llIIlIIlIIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIlllIIl[6]);
                    0;
                }
                if (C.llIIlIIlIIlll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlllIIl[3]);
                    0;
                }
                int[] nArray = new int[lllIlllIIl[6]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIllI(e.b(nArray) ? 1 : 0)) {
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[23]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray2 = new int[lllIlllIIl[6]];
                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray2[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray2[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray2[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIlII(e.b(nArray2) ? 1 : 0)) {
                    a.a(lllIlllIIl[11], lllIlllIIl[6]);
                    a.a(lllIlllIIl[10], lllIlllIIl[3]);
                    a.a(lllIlllIIl[8], lllIlllIIl[9]);
                    a.a(lllIlllIIl[13], lllIlllIIl[1]);
                }
                a.b(f.be, lllIlllIIl[1]);
            }
        }
    }

    private static boolean llIIlIIlIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lllIlllIIl[1]];
        nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
        if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray), lllIlllIIl[9])) {
            int[] nArray2 = new int[lllIlllIIl[1]];
            nArray2[C.lllIlllIIl[0]] = lllIlllIIl[10];
            if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray2), lllIlllIIl[3])) {
                int[] nArray3 = new int[lllIlllIIl[1]];
                nArray3[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray3), lllIlllIIl[6])) {
                    n2 = lllIlllIIl[1];
                    0;
                    if (3 > 0) return n2 != 0;
                    return (1 & (1 ^ -1)) != 0;
                }
            }
        }
        n2 = lllIlllIIl[0];
        return n2 != 0;
    }

    private static boolean llIIlIIlIIlll(int n2) {
        return n2 > 0;
    }
}

