/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class z_Unknown
implements S {
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint gu;
    public static final /* synthetic */ int gt;
    private static /* synthetic */ int[] llllIIIIII;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ int gs;
    public static final /* synthetic */ int gr;
    public static /* synthetic */ WorldPoint gw;
    private static /* synthetic */ String[] lllIlllllI;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ int ck;
    private static final /* synthetic */ String[] gv;
    static /* synthetic */ int bS;

    private static void ae() {
        d var19;
        Object var12;
        int[] nArray = new int[llllIIIIII[1]];
        nArray[z.llllIIIIII[0]] = llllIIIIII[9];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllIIIIII[9], llllIIIIII[1], llllIIIIII[6]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[llllIIIIII[1]];
        nArray2[z.llllIIIIII[0]] = llllIIIIII[8];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var12 = new d(llllIIIIII[8], llllIIIIII[1], llllIIIIII[6]);
            bu.add((d)var12);
            0;
        }
        int[] nArray3 = new int[llllIIIIII[1]];
        nArray3[z.llllIIIIII[0]] = llllIIIIII[7];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var12 = new d(llllIIIIII[7], llllIIIIII[1], llllIIIIII[6]);
            bu.add((d)var12);
            0;
        }
        int[] nArray4 = new int[llllIIIIII[1]];
        nArray4[z.llllIIIIII[0]] = llllIIIIII[10];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var12 = new d(llllIIIIII[10], llllIIIIII[14], llllIIIIII[15]);
            bu.add((d)var12);
            0;
        }
        if (z.llIIlIllIIIII(Bank.contains((Predicate)(var12 = item -> item.getName().toLowerCase().contains(lllIlllllI[llllIIIIII[23]]))) ? 1 : 0)) {
            var19 = new d(llllIIIIII[16], llllIIIIII[11], llllIIIIII[17]);
            bu.add(var19);
            0;
        }
        int[] nArray5 = new int[llllIIIIII[1]];
        nArray5[z.llllIIIIII[0]] = llllIIIIII[18];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var19 = new d(llllIIIIII[18], llllIIIIII[19], llllIIIIII[20]);
            bu.add(var19);
            0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllIIIIII[1]];
        nArray[z.llllIIIIII[0]] = llllIIIIII[7];
        if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llllIIIIII[1]];
            nArray2[z.llllIIIIII[0]] = llllIIIIII[9];
            if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[llllIIIIII[1]];
                nArray3[z.llllIIIIII[0]] = llllIIIIII[8];
                if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray3))) {
                    n2 = llllIIIIII[1];
                    0;
                    if (((99 + 57 - 23 + 87 ^ 79 + 16 - -32 + 7) & (0x6D ^ 0x51 ^ (0x3B ^ 0x5D) ^ -1)) < 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llllIIIIII[0];
        return n2 != 0;
    }

    private static boolean llIIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIlIllIIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (z.llIIlIlllIIIl(e.j(llllIIIIII[3]), llllIIIIII[4])) {
            bl = llllIIIIII[1];
            0;
            if (3 < 0) {
                return ((0xAA ^ 0x9D ^ 2) & (0xD9 ^ 0x9F ^ (0xE5 ^ 0x96) ^ -1)) != 0;
            }
        } else {
            bl = llllIIIIII[0];
        }
        return bl;
    }

    static {
        z.llIIlIlIlllIl();
        z.llIIlIlIlllII();
        gt = llllIIIIII[7];
        gs = llllIIIIII[8];
        gr = llllIIIIII[9];
        gu = new WorldPoint(llllIIIIII[24], llllIIIIII[25], llllIIIIII[0]);
        String[] stringArray = new String[llllIIIIII[11]];
        stringArray[z.llllIIIIII[0]] = lllIlllllI[llllIIIIII[14]];
        stringArray[z.llllIIIIII[1]] = lllIlllllI[llllIIIIII[26]];
        stringArray[z.llllIIIIII[4]] = lllIlllllI[llllIIIIII[27]];
        stringArray[z.llllIIIIII[5]] = lllIlllllI[llllIIIIII[28]];
        stringArray[z.llllIIIIII[2]] = lllIlllllI[llllIIIIII[29]];
        gv = stringArray;
        gw = new WorldPoint(llllIIIIII[30], llllIIIIII[31], llllIIIIII[4]);
        bu = new ArrayList<d>();
        bS = llllIIIIII[0];
    }

    private static String llIIlIlIllIlI(String var22, String var13) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllIIIIII[4], var23);
            return new String(var18.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static void bU() {
        if (z.llIIlIlIllllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[0]];
            b.a(bu);
            if (z.llIIlIlIlllll(bu.size(), llllIIIIII[1])) {
                System.out.println(lllIlllllI[llllIIIIII[1]]);
                bs = llllIIIIII[0];
            }
        }
        if (z.llIIlIllIIIII(bs ? 1 : 0)) {
            if (z.llIIlIllIIIII(z.aa() ? 1 : 0) && z.llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2]) && z.llIIlIlIlllll(e.j(llllIIIIII[3]), llllIIIIII[4])) {
                BankLocation var3 = BankLocation.getNearest();
                if (z.llIIlIllIIIlI(var3) && z.llIIlIllIIIII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[4]];
                    a.a(var3);
                }
                if (z.llIIlIllIIIlI(var3) && z.llIIlIlIllllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[5]];
                    if (z.llIIlIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIIII[6]);
                        0;
                    }
                    if (z.llIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        if (z.llIIlIllIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIIIII[2]);
                            0;
                        }
                        if (z.llIIlIllIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIIIII[4]);
                            0;
                        }
                        int[] nArray = new int[llllIIIIII[2]];
                        nArray[z.llllIIIIII[0]] = llllIIIIII[7];
                        nArray[z.llllIIIIII[1]] = llllIIIIII[8];
                        nArray[z.llllIIIIII[4]] = llllIIIIII[9];
                        nArray[z.llllIIIIII[5]] = llllIIIIII[10];
                        if (z.llIIlIllIIIII(e.b(nArray) ? 1 : 0)) {
                            z.ae();
                            System.out.println(lllIlllllI[llllIIIIII[2]]);
                            bs = llllIIIIII[1];
                            return;
                        }
                        if (z.llIIlIlIllllI(AccBuilderTempleTrek.e ? 1 : 0)) {
                            a.b(f.be, llllIIIIII[1]);
                        }
                        int[] nArray2 = new int[llllIIIIII[2]];
                        nArray2[z.llllIIIIII[0]] = llllIIIIII[7];
                        nArray2[z.llllIIIIII[1]] = llllIIIIII[8];
                        nArray2[z.llllIIIIII[4]] = llllIIIIII[9];
                        nArray2[z.llllIIIIII[5]] = llllIIIIII[10];
                        if (z.llIIlIlIllllI(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllIIIIII[2]];
                            nArray3[z.llllIIIIII[0]] = llllIIIIII[7];
                            nArray3[z.llllIIIIII[1]] = llllIIIIII[8];
                            nArray3[z.llllIIIIII[4]] = llllIIIIII[9];
                            nArray3[z.llllIIIIII[5]] = llllIIIIII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!z.llIIlIllIIIII(z.aa() ? 1 : 0) || z.llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2])) && z.llIIlIlIlllll(e.j(llllIIIIII[3]), llllIIIIII[4])) {
                AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[11]];
                if (z.llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    ck = llllIIIIII[0];
                    Movement.walkTo((WorldPoint)gu);
                    0;
                }
                if (z.llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    if (z.llIIlIlIlllll(ck, llllIIIIII[1])) {
                        ac.nb += llllIIIIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIIIIII[1];
                        ac.nb = llllIIIIII[0];
                        cl = llllIIIIII[0];
                    }
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[12]];
                    if (z.llIIlIlIlllll(bS, llllIIIIII[1])) {
                        e.v();
                        bS += llllIIIIII[1];
                    }
                    g.a(lllIlllllI[llllIIIIII[13]], gv);
                }
            }
            g.a(new String[llllIIIIII[0]]);
        }
    }

    @Override
    public int T() {
        try {
            z.bU();
            0;
        }
        catch (Exception var14) {
            var14.printStackTrace();
        }
        if ((0x2F ^ 6 ^ (0x31 ^ 0x1C)) != (0x7D ^ 0x2F ^ (0x11 ^ 0x47))) {
            return (20 + 72 - -95 + 1 ^ 180 + 11 - 140 + 133) & (0xE6 ^ 0xA9 ^ (0x6B ^ 0x20) ^ -1);
        }
        return llllIIIIII[21];
    }

    private static boolean llIIlIlllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlIlIlllII() {
        lllIlllllI = new String[llllIIIIII[32]];
        z.lllIlllllI[z.llllIIIIII[0]] = z."Buying items";
        z.lllIlllllI[z.llllIIIIII[1]] = z."Finished buying items, switching back to quest";
        z.lllIlllllI[z.llllIIIIII[4]] = z."Walking to bank";
        z.lllIlllllI[z.llllIIIIII[5]] = z."Handling banking";
        z.lllIlllllI[z.llllIIIIII[2]] = z."We are missing quest supplies, switching to BUYING";
        z.lllIlllllI[z.llllIIIIII[11]] = z."Nav to start";
        z.lllIlllllI[z.llllIIIIII[12]] = z."Handling dialog";
        z.lllIlllllI[z.llllIIIIII[13]] = z."Cook";
        z.lllIlllllI[z.llllIIIIII[22]] = z."Cooks Assistant Quest";
        z.lllIlllllI[z.llllIIIIII[23]] = z."ring of wealth (";
        z.lllIlllllI[z.llllIIIIII[14]] = z."Can you make me a cake?";
        z.lllIlllllI[z.llllIIIIII[26]] = z."I'm always happy to help a cook in distress.";
        z.lllIlllllI[z.llllIIIIII[27]] = z."Actually, I know where to find this stuff.";
        z.lllIlllllI[z.llllIIIIII[28]] = z."Yes.";
        z.lllIlllllI[z.llllIIIIII[29]] = z."What's wrong?";
    }

    private static String llIIlIlIllIll(String var2, String var9) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), llllIIIIII[22]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllIIIIII[4], var11);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIllIIl(String var10, String var20) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var16 = var20.toCharArray();
        int var7 = llllIIIIII[0];
        char[] var6 = var10.toCharArray();
        int var4 = var6.length;
        int var17 = llllIIIIII[0];
        while (z.llIIlIlIlllll(var17, var4)) {
            char var8 = var6[var17];
            var5.append((char)(var8 ^ var16[var7 % var16.length]));
            0;
            ++var7;
            ++var17;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean llIIlIllIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return llllIIIIII[0];
    }

    private static boolean llIIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIllllI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lllIlllllI[llllIIIIII[22]];
    }

    private static void llIIlIlIlllIl() {
        llllIIIIII = new int[33];
        z.llllIIIIII[0] = (0xF5 ^ 0x94) & ~(0xCD ^ 0xAC);
        z.llllIIIIII[1] = 1;
        z.llllIIIIII[2] = 0x63 ^ 0x6B ^ (0x64 ^ 0x68);
        z.llllIIIIII[3] = 0x7E ^ 0x63;
        z.llllIIIIII[4] = 2;
        z.llllIIIIII[5] = 3;
        z.llllIIIIII[6] = -(0xFFFFB81B & 0x6FF5) & (0xFFFFFFBB & 0x3BDC);
        z.llllIIIIII[7] = -(0xFFFFFDF7 & 0x324B) & (0xFFFFBFEF & 0x77DF);
        z.llllIIIIII[8] = 0xFFFFBFBB & 0x47DC;
        z.llllIIIIII[9] = 0xFFFFC797 & 0x3FEF;
        z.llllIIIIII[10] = 0xFFFFDFFF & 0x3F48;
        z.llllIIIIII[11] = 0xAE ^ 0xAB;
        z.llllIIIIII[12] = 0xF ^ 0x1B ^ (0xA ^ 0x18);
        z.llllIIIIII[13] = 0x22 ^ 0x25;
        z.llllIIIIII[14] = 0xC8 ^ 0xC2;
        z.llllIIIIII[15] = 0xFFFF97FC & 0x6FD3;
        z.llllIIIIII[16] = 0xFFFFEEFC & 0x3FCF;
        z.llllIIIIII[17] = 0xFFFFE7BC & 0x79EB;
        z.llllIIIIII[18] = -(0xFFFFF6BF & 0x29F9) & (0xFFFFBFFF & Short.MAX_VALUE);
        z.llllIIIIII[19] = 0x63 ^ 0x4D ^ (0x4B ^ 0x4D);
        z.llllIIIIII[20] = 0xFFFFAFEE & 0x577D;
        z.llllIIIIII[21] = 0xAD ^ 0x99 ^ (0x60 ^ 0x30);
        z.llllIIIIII[22] = 0xBF ^ 0xB6 ^ 1;
        z.llllIIIIII[23] = 0x65 ^ 0x6C;
        z.llllIIIIII[24] = -(0xFFFFF5F7 & 0x6A19) & (0xFFFFFEB7 & 0x6DDF);
        z.llllIIIIII[25] = -(0xFFFFFB72 & 0x25BF) & (0xFFFFFDFF & 0x2FBF);
        z.llllIIIIII[26] = 0xF8 ^ 0xAC ^ (0xE6 ^ 0xB9);
        z.llllIIIIII[27] = 131 + 73 - 82 + 85 ^ 47 + 180 - 157 + 125;
        z.llllIIIIII[28] = 0x2B ^ 0x3D ^ (0x14 ^ 0xF);
        z.llllIIIIII[29] = 0xA7 ^ 0xB9 ^ (0x9F ^ 0x8F);
        z.llllIIIIII[30] = 0xFFFF9CFB & 0x6F8D;
        z.llllIIIIII[31] = 0xFFFF8F9F & 0x7CF3;
        z.llllIIIIII[32] = 0x2B ^ 0x24;
    }
}

