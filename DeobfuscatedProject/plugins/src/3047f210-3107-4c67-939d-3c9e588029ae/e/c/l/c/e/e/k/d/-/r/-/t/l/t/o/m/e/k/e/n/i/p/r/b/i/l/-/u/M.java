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
import net.unethicalite.api.widgets.Dialog;

public class M
implements S {
    public static final /* synthetic */ WorldPoint ie;
    private static /* synthetic */ String[] llllIIllIl;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] llllIIlllI;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ int bS;
    public static final /* synthetic */ WorldPoint id;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint ic;
    static /* synthetic */ int ck;

    static {
        M.llIIlllIIIlll();
        M.llIIlllIIIllI();
        ic = new WorldPoint(llllIIlllI[45], llllIIlllI[46], llllIIlllI[1]);
        id = new WorldPoint(llllIIlllI[47], llllIIlllI[48], llllIIlllI[0]);
        ie = new WorldPoint(llllIIlllI[49], llllIIlllI[50], llllIIlllI[0]);
        String[] stringArray = new String[llllIIlllI[16]];
        stringArray[M.llllIIlllI[0]] = llllIIllIl[llllIIlllI[51]];
        stringArray[M.llllIIlllI[1]] = llllIIllIl[llllIIlllI[52]];
        stringArray[M.llllIIlllI[3]] = llllIIllIl[llllIIlllI[53]];
        stringArray[M.llllIIlllI[6]] = llllIIllIl[llllIIlllI[54]];
        stringArray[M.llllIIlllI[7]] = llllIIllIl[llllIIlllI[55]];
        stringArray[M.llllIIlllI[9]] = llllIIllIl[llllIIlllI[56]];
        stringArray[M.llllIIlllI[13]] = llllIIllIl[llllIIlllI[57]];
        stringArray[M.llllIIlllI[15]] = llllIIllIl[llllIIlllI[58]];
        bQ = stringArray;
        bu = new ArrayList<d>();
        bS = llllIIlllI[0];
    }

    private static boolean llIIlllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlllIIIIll(String lllllllllllllllllIlIllIIIlllIIIl, String lllllllllllllllllIlIllIIIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIllIIIlllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIllIIIlllIlIl.init(llllIIlllI[3], lllllllllllllllllIlIllIIIlllIllI);
            return new String(lllllllllllllllllIlIllIIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIIIlllIlII) {
            lllllllllllllllllIlIllIIIlllIlII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllIIlllI[1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllIIlllI[1]];
        nArray[M.llllIIlllI[0]] = llllIIlllI[10];
        if (M.llIIlllIIlIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llllIIlllI[1]];
            nArray2[M.llllIIlllI[0]] = llllIIlllI[11];
            if (M.llIIlllIIlIll(Inventory.getCount((int[])nArray2))) {
                n2 = llllIIlllI[1];
                "".length();
                if (-(0x72 ^ 0x76) < 0) return n2 != 0;
                return ((0x40 ^ 0x74) & ~(0xA0 ^ 0x94)) != 0;
            }
        }
        n2 = llllIIlllI[0];
        return n2 != 0;
    }

    private static boolean llIIlllIIlIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIIlllIIIlII(String lllllllllllllllllIlIllIIlIIlIlIl, String lllllllllllllllllIlIllIIlIIlIlII) {
        lllllllllllllllllIlIllIIlIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIIlIIlIIll = new StringBuilder();
        char[] lllllllllllllllllIlIllIIlIIlIIlI = lllllllllllllllllIlIllIIlIIlIlII.toCharArray();
        int lllllllllllllllllIlIllIIlIIlIIIl = llllIIlllI[0];
        char[] lllllllllllllllllIlIllIIlIIIlIll = lllllllllllllllllIlIllIIlIIlIlIl.toCharArray();
        int lllllllllllllllllIlIllIIlIIIlIlI = lllllllllllllllllIlIllIIlIIIlIll.length;
        int lllllllllllllllllIlIllIIlIIIlIIl = llllIIlllI[0];
        while (M.llIIlllIIlIIl(lllllllllllllllllIlIllIIlIIIlIIl, lllllllllllllllllIlIllIIlIIIlIlI)) {
            char lllllllllllllllllIlIllIIlIIlIllI = lllllllllllllllllIlIllIIlIIIlIll[lllllllllllllllllIlIllIIlIIIlIIl];
            lllllllllllllllllIlIllIIlIIlIIll.append((char)(lllllllllllllllllIlIllIIlIIlIllI ^ lllllllllllllllllIlIllIIlIIlIIlI[lllllllllllllllllIlIllIIlIIlIIIl % lllllllllllllllllIlIllIIlIIlIIlI.length]));
            "".length();
            ++lllllllllllllllllIlIllIIlIIlIIIl;
            ++lllllllllllllllllIlIllIIlIIIlIIl;
            "".length();
            if ((122 + 83 - 132 + 55 ^ 101 + 112 - 182 + 102) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIllIIlIIlIIll);
    }

    private static void ae() {
        d lllllllllllllllllIlIllIIlIlIIlII;
        Object lllllllllllllllllIlIllIIlIlIIlIl;
        int[] nArray = new int[llllIIlllI[1]];
        nArray[M.llllIIlllI[0]] = llllIIlllI[10];
        if (M.llIIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllIIlllI[10], llllIIlllI[14], llllIIlllI[36]);
            bu.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llllIIlllI[1]];
        nArray2[M.llllIIlllI[0]] = llllIIlllI[11];
        if (M.llIIlllIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlIllIIlIlIIlIl = new d(llllIIlllI[11], llllIIlllI[14], llllIIlllI[36]);
            bu.add((d)lllllllllllllllllIlIllIIlIlIIlIl);
            "".length();
        }
        int[] nArray3 = new int[llllIIlllI[1]];
        nArray3[M.llllIIlllI[0]] = llllIIlllI[12];
        if (M.llIIlllIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlIllIIlIlIIlIl = new d(llllIIlllI[12], llllIIlllI[1], llllIIlllI[37]);
            bu.add((d)lllllllllllllllllIlIllIIlIlIIlIl);
            "".length();
        }
        if (M.llIIlllIIlIlI(Bank.contains((Predicate)(lllllllllllllllllIlIllIIlIlIIlIl = item -> item.getName().toLowerCase().contains(llllIIllIl[llllIIlllI[43]]))) ? 1 : 0)) {
            lllllllllllllllllIlIllIIlIlIIlII = new d(llllIIlllI[38], llllIIlllI[9], llllIIlllI[37]);
            bu.add(lllllllllllllllllIlIllIIlIlIIlII);
            "".length();
        }
        int[] nArray4 = new int[llllIIlllI[1]];
        nArray4[M.llllIIlllI[0]] = llllIIlllI[10];
        if (M.llIIlllIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlIllIIlIlIIlII = new d(llllIIlllI[10], llllIIlllI[39], llllIIlllI[36]);
            bu.add(lllllllllllllllllIlIllIIlIlIIlII);
            "".length();
        }
        if (M.llIIlllIIlIlI(Bank.contains((int[])f.aU) ? 1 : 0)) {
            lllllllllllllllllIlIllIIlIlIIlII = new d(llllIIlllI[40], llllIIlllI[9], i.bp);
            bu.add(lllllllllllllllllIlIllIIlIlIIlII);
            "".length();
        }
    }

    private static String llIIlllIIIlIl(String lllllllllllllllllIlIllIIIllllllI, String lllllllllllllllllIlIllIIIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIlllllIl.getBytes(StandardCharsets.UTF_8)), llllIIlllI[16]), "DES");
            Cipher lllllllllllllllllIlIllIIlIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIIlIIIIIlI.init(llllIIlllI[3], lllllllllllllllllIlIllIIlIIIIIll);
            return new String(lllllllllllllllllIlIllIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIIlIIIIIIl) {
            lllllllllllllllllIlIllIIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int T() {
        try {
            M.dd();
            "".length();
        }
        catch (Exception lllllllllllllllllIlIllIIlIlIIIlI) {
            lllllllllllllllllIlIllIIlIlIIIlI.printStackTrace();
        }
        if (null != null) {
            return (0x3B ^ 0x11 ^ (0x2C ^ 0x19)) & (0xE5 ^ 0x85 ^ 115 + 119 - 233 + 126 ^ -" ".length());
        }
        return llllIIlllI[41];
    }

    private static boolean llIIlllIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlllIlIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIlllIIIllI() {
        llllIIllIl = new String[llllIIlllI[39]];
        M.llllIIllIl[M.llllIIlllI[0]] = M.llIIlllIIIIll("EAoLFS7kb5ut5xs6ObzYlA==", "RCeDB");
        M.llllIIllIl[M.llllIIlllI[1]] = M.llIIlllIIIlII("LwEIHTIBDQJUIxwRDxomSQESESwaREYHNgAcBRwoBw9GFiAKA0YALkkZExEyHQ==", "ihftA");
        M.llllIIllIl[M.llllIIlllI[3]] = M.llIIlllIIIIll("RUhqfKbN/18=", "Ctjty");
        M.llllIIllIl[M.llllIIlllI[6]] = M.llIIlllIIIIll("cnEhSYpMxDeHRcOZBbXKIXOb2+aq2B5Q", "STtBs");
        M.llllIIllIl[M.llllIIlllI[7]] = M.llIIlllIIIIll("C9034StnT/Mg8wexGSC6cA==", "GALEe");
        M.llllIIllIl[M.llllIIlllI[9]] = M.llIIlllIIIlII("LTUbKysMOhJvJQQ6HiYpAg==", "eTuOG");
        M.llllIIllIl[M.llllIIlllI[13]] = M.llIIlllIIIlIl("o/x/B+ro6yg4dwdH/8MJ/GXSAnbxWyReT0FDRUo00T8A70/sS6yAqpQ6vGddC4/zr49ewWDGV8M=", "ZhwSa");
        M.llllIIllIl[M.llllIIlllI[15]] = M.llIIlllIIIIll("oAWS3hjQJE8=", "cezvw");
        M.llllIIllIl[M.llllIIlllI[16]] = M.llIIlllIIIIll("+xY6iEgbceKoFBEoOgWgUAYbeWwhpZo4", "dcOfx");
        M.llllIIllIl[M.llllIIlllI[17]] = M.llIIlllIIIlII("OCwAMicZIwl2LxksAjksBSg=", "pMnVK");
        M.llllIIllIl[M.llllIIlllI[14]] = M.llIIlllIIIIll("uDmZV+/vt9U=", "YLWbF");
        M.llllIIllIl[M.llllIIlllI[18]] = M.llIIlllIIIlII("JjkhLw==", "iIDAc");
        M.llllIIllIl[M.llllIIlllI[19]] = M.llIIlllIIIlIl("9BGDLNUR1Dx0OrReKavOsQ==", "ZpRTT");
        M.llllIIllIl[M.llllIIlllI[20]] = M.llIIlllIIIIll("swA84aOKtWedXXP3Yz4hG3Do+OEzwqKN", "YthpK");
        M.llllIIllIl[M.llllIIlllI[21]] = M.llIIlllIIIIll("Y/JA+oLtyX71O45LJD8Q3g==", "ppeYd");
        M.llllIIllIl[M.llllIIlllI[22]] = M.llIIlllIIIIll("64N7OO0a3iByEtMTF2SsDA==", "IVgYo");
        M.llllIIllIl[M.llllIIlllI[23]] = M.llIIlllIIIlIl("AL129AKNpNIcrPbENoGcvFm9tXNtJCwd", "BqDDh");
        M.llllIIllIl[M.llllIIlllI[24]] = M.llIIlllIIIlII("MjspFBQTNCBQGxI7Mw==", "zZGpx");
        M.llllIIllIl[M.llllIIlllI[25]] = M.llIIlllIIIlIl("YvfkK9a1rV2jfM2eGRPOUYRl/+Qns/os", "LFZFd");
        M.llllIIllIl[M.llllIIlllI[26]] = M.llIIlllIIIlIl("39XuTeMyiKf0S+cyZNdGjy+gf3D7248K", "IBzmx");
        M.llllIIllIl[M.llllIIlllI[27]] = M.llIIlllIIIlII("JRsnMgIEFC52DQUbPQ==", "mzIVn");
        M.llllIIllIl[M.llllIIlllI[28]] = M.llIIlllIIIlIl("esjg9AMJP9o=", "BYJpC");
        M.llllIIllIl[M.llllIIlllI[29]] = M.llIIlllIIIlII("PgEJEzkeBxJWNgMQHwU=", "ldzvX");
        M.llllIIllIl[M.llllIIlllI[30]] = M.llIIlllIIIlIl("vhNgyq93Zy+4AOCCbWBTCb6dfE8imSDY", "kBrYP");
        M.llllIIllIl[M.llllIIlllI[31]] = M.llIIlllIIIlII("MzsxDikYO3AhLhslMRAi", "wIPwG");
        M.llllIIllIl[M.llllIIlllI[32]] = M.llIIlllIIIlII("PhkYLSofFhFpJR4ZAg==", "vxvIF");
        M.llllIIllIl[M.llllIIlllI[33]] = M.llIIlllIIIlII("NTsKDgsVLgxGNREtGw8CGzs=", "tIiff");
        M.llllIIllIl[M.llllIIlllI[34]] = M.llIIlllIIIlIl("TCYHIZOuL/4jsWox/zb5zA==", "MSeSf");
        M.llllIIllIl[M.llllIIlllI[35]] = M.llIIlllIIIlIl("omHJVFEMwRohhJM0BsawkdmXBLCdqxT9", "hYoXH");
        M.llllIIllIl[M.llllIIlllI[42]] = M.llIIlllIIIlII("Aj0LKmQ9MRY7ISIxRT4xNTsR", "PHeOD");
        M.llllIIllIl[M.llllIIlllI[43]] = M.llIIlllIIIlII("KAQABFc1C04UEjsBGgtXcg==", "Zmncw");
        M.llllIIllIl[M.llllIIlllI[44]] = M.llIIlllIIIlIl("ZmjWhWtqafA=", "BBuAp");
        M.llllIIllIl[M.llllIIlllI[51]] = M.llIIlllIIIlII("JTQDFFMUOgBREgMsVQAGCCYBAlMLOgdRHghq", "mUuqs");
        M.llllIIllIl[M.llllIIlllI[52]] = M.llIIlllIIIIll("vaARrx2l3d1kzmQi23fAg0T4EB9yNQwr", "ZwPlF");
        M.llllIIllIl[M.llllIIlllI[53]] = M.llIIlllIIIlIl("k+0i3rzbJPwKuDvmk3N0UOlGxp238/GT6138Tqh+b617Hrn1OdXM/g==", "zAohc");
        M.llllIIllIl[M.llllIIlllI[54]] = M.llIIlllIIIlII("KgMMD0BFAAgECUURAgNMBBoIWA==", "ehmvl");
        M.llllIIllIl[M.llllIIlllI[55]] = M.llIIlllIIIlIl("omwcwajYDQWGwD+aRMVnvw==", "TYFaI");
        M.llllIIllIl[M.llllIIlllI[56]] = M.llIIlllIIIIll("XK/i4BVjH793C2QC9GX85BdmAHkw/NmuH5E2jZj6As6F8cE2tyXsWpdvtU8f/bmh", "wOdti");
        M.llllIIllIl[M.llllIIlllI[57]] = M.llIIlllIIIlIl("jD0yON3lPZk=", "XFghu");
        M.llllIIllIl[M.llllIIlllI[58]] = M.llIIlllIIIlIl("qvOX/APIA4jfINYkKbOx0g==", "kpRUS");
    }

    @Override
    public boolean V() {
        boolean bl;
        if (M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[13])) {
            bl = llllIIlllI[1];
            "".length();
            if (((109 + 171 - 118 + 33 ^ 73 + 96 - 104 + 78) & (136 + 91 - 72 + 62 ^ 49 + 5 - -30 + 65 ^ -" ".length())) != 0) {
                return ((157 + 1 - 10 + 82 ^ 6 + 21 - -84 + 81) & (0x5B ^ 0x63 ^ (0xDE ^ 0xC0) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIIlllI[0];
        }
        return bl;
    }

    @Override
    public String U() {
        return llllIIllIl[llllIIlllI[42]];
    }

    public static void dd() {
        block45: {
            block48: {
                BankLocation lllllllllllllllllIlIllIIlIlIlIII2;
                block47: {
                    block46: {
                        if (M.llIIlllIIlIII(bs ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[0]];
                            b.a(bu);
                            if (M.llIIlllIIlIIl(bu.size(), llllIIlllI[1])) {
                                System.out.println(llllIIllIl[llllIIlllI[1]]);
                                bs = llllIIlllI[0];
                            }
                        }
                        if (!M.llIIlllIIlIlI(bs ? 1 : 0)) break block45;
                        if (M.llIIlllIIlIII(Inventory.contains((int[])f.aU) ? 1 : 0) && M.llIIlllIIlIIl(Movement.getRunEnergy(), llllIIlllI[2]) && M.llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aU).interact(llllIIllIl[llllIIlllI[3]]);
                            Time.sleepTicks((int)llllIIlllI[1]);
                            "".length();
                        }
                        if (!M.llIIlllIIlIII(M.aa() ? 1 : 0)) break block46;
                        int[] nArray = new int[llllIIlllI[1]];
                        nArray[M.llllIIlllI[0]] = llllIIlllI[4];
                        if (!M.llIIlllIIlIll(Inventory.getCount((int[])nArray))) break block47;
                    }
                    if (M.llIIlllIIlIIl(e.j(llllIIlllI[5]), llllIIlllI[1])) {
                        lllllllllllllllllIlIllIIlIlIlIII2 = BankLocation.getNearest();
                        if (M.llIIlllIIllII(lllllllllllllllllIlIllIIlIlIlIII2) && M.llIIlllIIlIlI(lllllllllllllllllIlIllIIlIlIlIII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[6]];
                            a.a(lllllllllllllllllIlIllIIlIlIlIII2);
                        }
                        if (M.llIIlllIIllII(lllllllllllllllllIlIllIIlIlIlIII2) && M.llIIlllIIlIII(lllllllllllllllllIlIllIIlIlIlIII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (M.llIIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[7]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlllI[8]);
                                "".length();
                            }
                            if (M.llIIlllIIlIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[9]];
                                if (M.llIIlllIIlIll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llllIIlllI[7]);
                                    "".length();
                                }
                                if (M.llIIlllIIlIll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llllIIlllI[3]);
                                    "".length();
                                }
                                int[] nArray = new int[llllIIlllI[6]];
                                nArray[M.llllIIlllI[0]] = llllIIlllI[10];
                                nArray[M.llllIIlllI[1]] = llllIIlllI[11];
                                nArray[M.llllIIlllI[3]] = llllIIlllI[12];
                                if (M.llIIlllIIlIlI(e.b(nArray) ? 1 : 0)) {
                                    M.ae();
                                    System.out.println(llllIIllIl[llllIIlllI[13]]);
                                    bs = llllIIlllI[1];
                                    return;
                                }
                                int[] nArray2 = new int[llllIIlllI[3]];
                                nArray2[M.llllIIlllI[0]] = llllIIlllI[10];
                                nArray2[M.llllIIlllI[1]] = llllIIlllI[11];
                                if (M.llIIlllIIlIII(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llllIIlllI[3]];
                                    nArray3[M.llllIIlllI[0]] = llllIIlllI[10];
                                    nArray3[M.llllIIlllI[1]] = llllIIlllI[11];
                                    a.a(nArray3, llllIIlllI[14]);
                                }
                                if (M.llIIlllIIlIII(Bank.contains((int[])f.aQ) ? 1 : 0)) {
                                    Bank.withdraw((int)llllIIlllI[12], (int)llllIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                }
                                if (M.llIIlllIIlIII(Bank.contains((int[])f.aU) ? 1 : 0)) {
                                    a.b(f.aU, llllIIlllI[1]);
                                }
                            }
                        }
                    }
                }
                if (M.llIIlllIIlIII(M.aa() ? 1 : 0) && M.llIIlllIIlIIl(e.j(llllIIlllI[5]), llllIIlllI[1])) {
                    if (M.llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                        if (M.llIIlllIIlIII(Bank.isOpen() ? 1 : 0)) {
                            Bank.close();
                            Time.sleepTicks((int)llllIIlllI[3]);
                            "".length();
                        }
                        if (M.llIIlllIIlIlI(Bank.isOpen() ? 1 : 0) && M.llIIlllIIlIII(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aQ).interact(llllIIllIl[llllIIlllI[15]]);
                            Time.sleepTicks((int)llllIIlllI[1]);
                            "".length();
                        }
                        if (M.llIIlllIIlIIl(bS, llllIIlllI[1])) {
                            e.v();
                            bS += llllIIlllI[1];
                        }
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[16]];
                        Movement.walkTo((WorldPoint)ic);
                        "".length();
                        Time.sleepTicks((int)llllIIlllI[6]);
                        "".length();
                    }
                    if (M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[17]];
                        lllllllllllllllllIlIllIIlIlIlIII2 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (M.llIIlllIIlIII(tileObject.getName().equalsIgnoreCase(llllIIllIl[llllIIlllI[44]]) ? 1 : 0) && M.llIIlllIIlllI(tileObject.getWorldLocation().distanceTo(ic), llllIIlllI[9])) {
                                n2 = llllIIlllI[1];
                                "".length();
                                if ((40 + 92 - 117 + 161 ^ 123 + 115 - 66 + 8) == "   ".length()) {
                                    return ((0x10 ^ 0xF ^ (0xF9 ^ 0xAD)) & (0x4A ^ 0x6C ^ (0x2B ^ 0x46) ^ -" ".length())) != 0;
                                }
                            } else {
                                n2 = llllIIlllI[0];
                            }
                            return n2 != 0;
                        });
                        if (M.llIIlllIIllII(lllllllllllllllllIlIllIIlIlIlIII2)) {
                            String[] stringArray = new String[llllIIlllI[1]];
                            stringArray[M.llllIIlllI[0]] = llllIIllIl[llllIIlllI[14]];
                            if (M.llIIlllIIlIII(lllllllllllllllllIlIllIIlIlIlIII2.hasAction(stringArray) ? 1 : 0)) {
                                lllllllllllllllllIlIllIIlIlIlIII2.interact(llllIIllIl[llllIIlllI[18]]);
                                Time.sleepTicks((int)llllIIlllI[6]);
                                "".length();
                            }
                        }
                        g.a(llllIIllIl[llllIIlllI[19]], bQ);
                    }
                }
                if (M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[1])) {
                    ck = llllIIlllI[0];
                    if (M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[20]];
                        g.a(llllIIllIl[llllIIlllI[21]], bQ);
                    }
                    if (M.llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        String[] stringArray = new String[llllIIlllI[1]];
                        stringArray[M.llllIIlllI[0]] = llllIIllIl[llllIIlllI[22]];
                        if (M.llIIlllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[23]];
                            Movement.walkTo((WorldPoint)id);
                            "".length();
                            Time.sleepTicks((int)llllIIlllI[1]);
                            "".length();
                        }
                    }
                    if (M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[24]];
                        g.a(llllIIllIl[llllIIlllI[25]], bQ);
                    }
                }
                if (M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[3]) && (!M.llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0) || M.llIIlllIIlIII(g.K() ? 1 : 0))) {
                    g.a(bQ);
                    Time.sleepTicks((int)llllIIlllI[1]);
                    "".length();
                }
                if (M.llIIlllIlIIII(e.j(llllIIlllI[5]), llllIIlllI[6]) && !M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[7])) break block48;
                try {
                    if (!M.llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0) || M.llIIlllIIlIII(g.K() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)llllIIlllI[1]);
                        "".length();
                    }
                    "".length();
                }
                catch (Exception lllllllllllllllllIlIllIIlIlIlIII2) {
                    // empty catch block
                }
                if (" ".length() == -" ".length()) {
                    return;
                }
                if (M.llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[6]) && M.llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[26]];
                    Movement.walkTo((WorldPoint)ie);
                    "".length();
                    Time.sleepTicks((int)llllIIlllI[1]);
                    "".length();
                }
                if (M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[6])) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[27]];
                    g.a(llllIIllIl[llllIIlllI[28]], bQ);
                }
            }
            if (M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[9])) {
                String[] stringArray = new String[llllIIlllI[1]];
                stringArray[M.llllIIlllI[0]] = llllIIllIl[llllIIlllI[29]];
                if (M.llIIlllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (M.llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[30]];
                        if (M.llIIlllIIlIII(Equipment.contains((int[])f.aQ) ? 1 : 0) && M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[14])) {
                            Equipment.getFirst((int[])f.aQ).interact(llllIIllIl[llllIIlllI[31]]);
                            Time.sleepTicks((int)llllIIlllI[9]);
                            "".length();
                        }
                        Movement.walkTo((WorldPoint)id);
                        "".length();
                        Time.sleepTicks((int)llllIIlllI[1]);
                        "".length();
                    }
                    if (M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[32]];
                        g.a(llllIIllIl[llllIIlllI[33]], bQ);
                    }
                }
            }
            if (M.llIIlllIIllll(e.j(llllIIlllI[5]), llllIIlllI[9]) && M.llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[34]];
                if (M.llIIlllIIlIIl(ck, llllIIlllI[1])) {
                    ac.mN += llllIIlllI[1];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += llllIIlllI[1];
                    ac.mN = llllIIlllI[0];
                    cl = llllIIlllI[0];
                }
                g.a(llllIIllIl[llllIIlllI[35]], bQ);
            }
            g.a(bQ);
        }
    }

    private static boolean llIIlllIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllIIllII(Object object) {
        return object != null;
    }

    private static void llIIlllIIIlll() {
        llllIIlllI = new int[59];
        M.llllIIlllI[0] = (0xEB ^ 0xC4) & ~(0x17 ^ 0x38);
        M.llllIIlllI[1] = " ".length();
        M.llllIIlllI[2] = 0x7A ^ 0x72 ^ (0x60 ^ 0x5A);
        M.llllIIlllI[3] = "  ".length();
        M.llllIIlllI[4] = 0xFFFFCBFF & 0x37E3;
        M.llllIIlllI[5] = 0x33 ^ 0x4F ^ (0x50 ^ 0x13);
        M.llllIIlllI[6] = "   ".length();
        M.llllIIlllI[7] = 0x96 ^ 0x92;
        M.llllIIlllI[8] = 0xFFFFBB9B & 0x57EC;
        M.llllIIlllI[9] = 0x2F ^ 0x22 ^ (0xB5 ^ 0xBD);
        M.llllIIlllI[10] = -(0xFFFFFFA9 & 0x60FF) & (0xFFFFFFFF & 0x7FEF);
        M.llllIIlllI[11] = 0xFFFFDFFA & 0x3F4D;
        M.llllIIlllI[12] = 0xFFFFEEDE & 0x3FEB;
        M.llllIIlllI[13] = 0xAD ^ 0xB8 ^ (0x24 ^ 0x37);
        M.llllIIlllI[14] = 0x6F ^ 0x65;
        M.llllIIlllI[15] = 0x7C ^ 0x7B;
        M.llllIIlllI[16] = 0x48 ^ 0x40;
        M.llllIIlllI[17] = 0xA8 ^ 0xA1;
        M.llllIIlllI[18] = 65 + 1 - 23 + 138 ^ 117 + 135 - 243 + 181;
        M.llllIIlllI[19] = 0x44 ^ 0x48;
        M.llllIIlllI[20] = 0x2A ^ 0x45 ^ (0xA0 ^ 0xC2);
        M.llllIIlllI[21] = 0x39 ^ 0x37;
        M.llllIIlllI[22] = 0x3E ^ 0x31;
        M.llllIIlllI[23] = 0x3F ^ 0x2F;
        M.llllIIlllI[24] = 0x14 ^ 5;
        M.llllIIlllI[25] = 14 + 11 - -72 + 43 ^ 81 + 104 - 140 + 113;
        M.llllIIlllI[26] = 0xBC ^ 0xB9 ^ (0x86 ^ 0x90);
        M.llllIIlllI[27] = 0x80 ^ 0x85 ^ (0x36 ^ 0x27);
        M.llllIIlllI[28] = 104 + 5 - 64 + 99 ^ 63 + 88 - 45 + 27;
        M.llllIIlllI[29] = 0x4A ^ 0x5C;
        M.llllIIlllI[30] = 0xE5 ^ 0xAD ^ (0x5C ^ 3);
        M.llllIIlllI[31] = 0x35 ^ 0x2D;
        M.llllIIlllI[32] = 4 ^ 0x1D;
        M.llllIIlllI[33] = 0x6A ^ 0x70;
        M.llllIIlllI[34] = 0x7E ^ 0x65;
        M.llllIIlllI[35] = 0x5E ^ 0x42;
        M.llllIIlllI[36] = -(0xFFFFFADF & 0x3DA3) & (0xFFFFFFFE & 0x3FEF);
        M.llllIIlllI[37] = 0xFFFFE7FD & 0x79AA;
        M.llllIIlllI[38] = -(0xFFFFDDD1 & 0x633F) & (0xFFFFEFFD & 0x7FDE);
        M.llllIIlllI[39] = 0xA2 ^ 0x8A;
        M.llllIIlllI[40] = -(0xFFFFAEEF & 0x5FB9) & (0xFFFFFFFB & 0x3FFD);
        M.llllIIlllI[41] = 0xE2 ^ 0x86;
        M.llllIIlllI[42] = 0x19 ^ 0x62 ^ (6 ^ 0x60);
        M.llllIIlllI[43] = 0x59 ^ 0x47;
        M.llllIIlllI[44] = 0x5D ^ 0x42;
        M.llllIIlllI[45] = -(0xFFFF957D & 0x7BB3) & (0xFFFF9FFB & 0x7DBE);
        M.llllIIlllI[46] = -(0xFFFFBD53 & 0x52AF) & (0xFFFFBE9E & 0x5DF7);
        M.llllIIlllI[47] = 0xFFFFCFDF & 0x3C3D;
        M.llllIIlllI[48] = 0xFFFFFD7F & 0x27E2;
        M.llllIIlllI[49] = -(0xFFFFFBAE & 0x375D) & (0xFFFFFFBF & 0x3FFF);
        M.llllIIlllI[50] = 0xFFFFCFF9 & 0x3D4F;
        M.llllIIlllI[51] = 166 + 120 - 271 + 161 ^ 47 + 140 - 134 + 91;
        M.llllIIlllI[52] = 0x8B ^ 0xAA;
        M.llllIIlllI[53] = 0x21 ^ 0x6D ^ (0x1E ^ 0x70);
        M.llllIIlllI[54] = 0xE ^ 0x2D;
        M.llllIIlllI[55] = 0x77 ^ 0x24 ^ (0x36 ^ 0x41);
        M.llllIIlllI[56] = 0x45 ^ 0x60;
        M.llllIIlllI[57] = 47 + 66 - -37 + 36 ^ 128 + 58 - 158 + 128;
        M.llllIIlllI[58] = 0xB9 ^ 0x9E;
    }
}

