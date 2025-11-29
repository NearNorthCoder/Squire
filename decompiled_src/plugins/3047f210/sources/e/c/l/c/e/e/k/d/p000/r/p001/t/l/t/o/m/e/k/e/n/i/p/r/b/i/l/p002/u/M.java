package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.M  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/M.class */
public class M implements S {
    public static final /* synthetic */ WorldPoint ie;
    private static /* synthetic */ String[] llllIIllIl;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] llllIIlllI;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ int bS;
    public static final /* synthetic */ WorldPoint id;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint ic;
    static /* synthetic */ int ck;

    static {
        llIIlllIIIlll();
        llIIlllIIIllI();
        ic = new WorldPoint(llllIIlllI[45], llllIIlllI[46], llllIIlllI[1]);
        id = new WorldPoint(llllIIlllI[47], llllIIlllI[48], llllIIlllI[0]);
        ie = new WorldPoint(llllIIlllI[49], llllIIlllI[50], llllIIlllI[0]);
        String[] strArr = new String[llllIIlllI[16]];
        strArr[llllIIlllI[0]] = llllIIllIl[llllIIlllI[51]];
        strArr[llllIIlllI[1]] = llllIIllIl[llllIIlllI[52]];
        strArr[llllIIlllI[3]] = llllIIllIl[llllIIlllI[53]];
        strArr[llllIIlllI[6]] = llllIIllIl[llllIIlllI[54]];
        strArr[llllIIlllI[7]] = llllIIllIl[llllIIlllI[55]];
        strArr[llllIIlllI[9]] = llllIIllIl[llllIIlllI[56]];
        strArr[llllIIlllI[13]] = llllIIllIl[llllIIlllI[57]];
        strArr[llllIIlllI[15]] = llllIIllIl[llllIIlllI[58]];
        bQ = strArr;
        bu = new ArrayList();
        bS = llllIIlllI[0];
    }

    private static boolean llIIlllIIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIIlllIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIlllIIIIll(String lllllllllllllllllIlIllIIIlllIIll, String lllllllllllllllllIlIllIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIIIllIllll) {
            lllllllllllllllllIlIllIIIllIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIlllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIIlllI[1]];
        iArr[llllIIlllI[0]] = llllIIlllI[10];
        if (llIIlllIIlIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llllIIlllI[1]];
            iArr2[llllIIlllI[0]] = llllIIlllI[11];
            if (llIIlllIIlIll(Inventory.getCount(iArr2))) {
                ?? r0 = llllIIlllI[1];
                "".length();
                return (-(114 ^ 118)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llllIIlllI[0];
    }

    private static boolean llIIlllIIlIll(int i) {
        return i > 0;
    }

    private static boolean llIIlllIIlllI(int i, int i2) {
        return i <= i2;
    }

    private static String llIIlllIIIlII(String lllllllllllllllllIlIllIIlIIlIIII, String lllllllllllllllllIlIllIIlIIlIlII) {
        String lllllllllllllllllIlIllIIlIIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIIlIIlIIll = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIllIIlIIlIlII.toCharArray();
        int lllllllllllllllllIlIllIIlIIlIIIl = llllIIlllI[0];
        char[] charArray2 = lllllllllllllllllIlIllIIlIIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIlllI[0];
        while (llIIlllIIlIIl(i, length)) {
            char lllllllllllllllllIlIllIIlIIlIllI = charArray2[i];
            lllllllllllllllllIlIllIIlIIlIIll.append((char) (lllllllllllllllllIlIllIIlIIlIllI ^ charArray[lllllllllllllllllIlIllIIlIIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllllIlIllIIlIIlIIIl++;
            i++;
            "".length();
            if (((((122 + 83) - 132) + 55) ^ (((101 + 112) - 182) + 102)) == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIllIIlIIlIIll);
    }

    private static void ae() {
        int[] iArr = new int[llllIIlllI[1]];
        iArr[llllIIlllI[0]] = llllIIlllI[10];
        if (llIIlllIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[10], llllIIlllI[14], llllIIlllI[36]));
            "".length();
        }
        int[] iArr2 = new int[llllIIlllI[1]];
        iArr2[llllIIlllI[0]] = llllIIlllI[11];
        if (llIIlllIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[11], llllIIlllI[14], llllIIlllI[36]));
            "".length();
        }
        int[] iArr3 = new int[llllIIlllI[1]];
        iArr3[llllIIlllI[0]] = llllIIlllI[12];
        if (llIIlllIIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[12], llllIIlllI[1], llllIIlllI[37]));
            "".length();
        }
        if (llIIlllIIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllIIllIl[llllIIlllI[43]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[38], llllIIlllI[9], llllIIlllI[37]));
            "".length();
        }
        int[] iArr4 = new int[llllIIlllI[1]];
        iArr4[llllIIlllI[0]] = llllIIlllI[10];
        if (llIIlllIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[10], llllIIlllI[39], llllIIlllI[36]));
            "".length();
        }
        if (llIIlllIIlIlI(Bank.contains(C0005f.aU) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlllI[40], llllIIlllI[9], C0008i.bp));
            "".length();
        }
    }

    private static String llIIlllIIIlIl(String lllllllllllllllllIlIllIIlIIIIIII, String lllllllllllllllllIlIllIIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), llllIIlllI[16]), "DES");
            Cipher lllllllllllllllllIlIllIIlIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIIlIIIIIlI.init(llllIIlllI[3], secretKeySpec);
            return new String(lllllllllllllllllIlIllIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIIlIIIIIIl) {
            lllllllllllllllllIlIllIIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIllll(int i, int i2) {
        return i == i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dd();
            "".length();
            if (0 != 0) {
                return ((59 ^ 17) ^ (44 ^ 25)) & (((229 ^ 133) ^ (((115 + 119) - 233) + 126)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return llllIIlllI[41];
    }

    private static boolean llIIlllIIlIII(int i) {
        return i != 0;
    }

    private static boolean llIIlllIlIIII(int i, int i2) {
        return i != i2;
    }

    private static void llIIlllIIIllI() {
        llllIIllIl = new String[llllIIlllI[39]];
        llllIIllIl[llllIIlllI[0]] = llIIlllIIIIll("EAoLFS7kb5ut5xs6ObzYlA==", "RCeDB");
        llllIIllIl[llllIIlllI[1]] = llIIlllIIIlII("LwEIHTIBDQJUIxwRDxomSQESESwaREYHNgAcBRwoBw9GFiAKA0YALkkZExEyHQ==", "ihftA");
        llllIIllIl[llllIIlllI[3]] = llIIlllIIIIll("RUhqfKbN/18=", "Ctjty");
        llllIIllIl[llllIIlllI[6]] = llIIlllIIIIll("cnEhSYpMxDeHRcOZBbXKIXOb2+aq2B5Q", "STtBs");
        llllIIllIl[llllIIlllI[7]] = llIIlllIIIIll("C9034StnT/Mg8wexGSC6cA==", "GALEe");
        llllIIllIl[llllIIlllI[9]] = llIIlllIIIlII("LTUbKysMOhJvJQQ6HiYpAg==", "eTuOG");
        llllIIllIl[llllIIlllI[13]] = llIIlllIIIlIl("o/x/B+ro6yg4dwdH/8MJ/GXSAnbxWyReT0FDRUo00T8A70/sS6yAqpQ6vGddC4/zr49ewWDGV8M=", "ZhwSa");
        llllIIllIl[llllIIlllI[15]] = llIIlllIIIIll("oAWS3hjQJE8=", "cezvw");
        llllIIllIl[llllIIlllI[16]] = llIIlllIIIIll("+xY6iEgbceKoFBEoOgWgUAYbeWwhpZo4", "dcOfx");
        llllIIllIl[llllIIlllI[17]] = llIIlllIIIlII("OCwAMicZIwl2LxksAjksBSg=", "pMnVK");
        llllIIllIl[llllIIlllI[14]] = llIIlllIIIIll("uDmZV+/vt9U=", "YLWbF");
        llllIIllIl[llllIIlllI[18]] = llIIlllIIIlII("JjkhLw==", "iIDAc");
        llllIIllIl[llllIIlllI[19]] = llIIlllIIIlIl("9BGDLNUR1Dx0OrReKavOsQ==", "ZpRTT");
        llllIIllIl[llllIIlllI[20]] = llIIlllIIIIll("swA84aOKtWedXXP3Yz4hG3Do+OEzwqKN", "YthpK");
        llllIIllIl[llllIIlllI[21]] = llIIlllIIIIll("Y/JA+oLtyX71O45LJD8Q3g==", "ppeYd");
        llllIIllIl[llllIIlllI[22]] = llIIlllIIIIll("64N7OO0a3iByEtMTF2SsDA==", "IVgYo");
        llllIIllIl[llllIIlllI[23]] = llIIlllIIIlIl("AL129AKNpNIcrPbENoGcvFm9tXNtJCwd", "BqDDh");
        llllIIllIl[llllIIlllI[24]] = llIIlllIIIlII("MjspFBQTNCBQGxI7Mw==", "zZGpx");
        llllIIllIl[llllIIlllI[25]] = llIIlllIIIlIl("YvfkK9a1rV2jfM2eGRPOUYRl/+Qns/os", "LFZFd");
        llllIIllIl[llllIIlllI[26]] = llIIlllIIIlIl("39XuTeMyiKf0S+cyZNdGjy+gf3D7248K", "IBzmx");
        llllIIllIl[llllIIlllI[27]] = llIIlllIIIlII("JRsnMgIEFC52DQUbPQ==", "mzIVn");
        llllIIllIl[llllIIlllI[28]] = llIIlllIIIlIl("esjg9AMJP9o=", "BYJpC");
        llllIIllIl[llllIIlllI[29]] = llIIlllIIIlII("PgEJEzkeBxJWNgMQHwU=", "ldzvX");
        llllIIllIl[llllIIlllI[30]] = llIIlllIIIlIl("vhNgyq93Zy+4AOCCbWBTCb6dfE8imSDY", "kBrYP");
        llllIIllIl[llllIIlllI[31]] = llIIlllIIIlII("MzsxDikYO3AhLhslMRAi", "wIPwG");
        llllIIllIl[llllIIlllI[32]] = llIIlllIIIlII("PhkYLSofFhFpJR4ZAg==", "vxvIF");
        llllIIllIl[llllIIlllI[33]] = llIIlllIIIlII("NTsKDgsVLgxGNREtGw8CGzs=", "tIiff");
        llllIIllIl[llllIIlllI[34]] = llIIlllIIIlIl("TCYHIZOuL/4jsWox/zb5zA==", "MSeSf");
        llllIIllIl[llllIIlllI[35]] = llIIlllIIIlIl("omHJVFEMwRohhJM0BsawkdmXBLCdqxT9", "hYoXH");
        llllIIllIl[llllIIlllI[42]] = llIIlllIIIlII("Aj0LKmQ9MRY7ISIxRT4xNTsR", "PHeOD");
        llllIIllIl[llllIIlllI[43]] = llIIlllIIIlII("KAQABFc1C04UEjsBGgtXcg==", "Zmncw");
        llllIIllIl[llllIIlllI[44]] = llIIlllIIIlIl("ZmjWhWtqafA=", "BBuAp");
        llllIIllIl[llllIIlllI[51]] = llIIlllIIIlII("JTQDFFMUOgBREgMsVQAGCCYBAlMLOgdRHghq", "mUuqs");
        llllIIllIl[llllIIlllI[52]] = llIIlllIIIIll("vaARrx2l3d1kzmQi23fAg0T4EB9yNQwr", "ZwPlF");
        llllIIllIl[llllIIlllI[53]] = llIIlllIIIlIl("k+0i3rzbJPwKuDvmk3N0UOlGxp238/GT6138Tqh+b617Hrn1OdXM/g==", "zAohc");
        llllIIllIl[llllIIlllI[54]] = llIIlllIIIlII("KgMMD0BFAAgECUURAgNMBBoIWA==", "ehmvl");
        llllIIllIl[llllIIlllI[55]] = llIIlllIIIlIl("omwcwajYDQWGwD+aRMVnvw==", "TYFaI");
        llllIIllIl[llllIIlllI[56]] = llIIlllIIIIll("XK/i4BVjH793C2QC9GX85BdmAHkw/NmuH5E2jZj6As6F8cE2tyXsWpdvtU8f/bmh", "wOdti");
        llllIIllIl[llllIIlllI[57]] = llIIlllIIIlIl("jD0yON3lPZk=", "XFghu");
        llllIIllIl[llllIIlllI[58]] = llIIlllIIIlIl("qvOX/APIA4jfINYkKbOx0g==", "kpRUS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[13])) {
            ?? r0 = llllIIlllI[1];
            "".length();
            return (((((109 + 171) - 118) + 33) ^ (((73 + 96) - 104) + 78)) & (((((136 + 91) - 72) + 62) ^ (((49 + 5) - (-30)) + 65)) ^ (-" ".length()))) != 0 ? ((((157 + 1) - 10) + 82) ^ (((6 + 21) - (-84)) + 81)) & (((91 ^ 99) ^ (222 ^ 192)) ^ (-" ".length())) : r0;
        }
        return llllIIlllI[0];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIIllIl[llllIIlllI[42]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
        if (llIIlllIIlIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dd() {
        if (llIIlllIIlIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[0]];
            C0001b.a(bu);
            if (llIIlllIIlIIl(bu.size(), llllIIlllI[1])) {
                System.out.println(llllIIllIl[llllIIlllI[1]]);
                bs = llllIIlllI[0];
            }
        }
        if (llIIlllIIlIlI(bs ? 1 : 0)) {
            if (llIIlllIIlIII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIlllIIlIIl(Movement.getRunEnergy(), llllIIlllI[2]) && llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.aU).interact(llllIIllIl[llllIIlllI[3]]);
                Time.sleepTicks(llllIIlllI[1]);
                "".length();
            }
            if (llIIlllIIlIII(aa() ? 1 : 0)) {
                int[] iArr = new int[llllIIlllI[1]];
                iArr[llllIIlllI[0]] = llllIIlllI[4];
            }
            if (llIIlllIIlIIl(C0004e.j(llllIIlllI[5]), llllIIlllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlllIIllII(nearest) && llIIlllIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[6]];
                    C0000a.a(nearest);
                }
                if (llIIlllIIllII(nearest) && llIIlllIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[7]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIlllI[8]);
                        "".length();
                    }
                    if (llIIlllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[9]];
                        if (llIIlllIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIlllI[7]);
                            "".length();
                        }
                        if (llIIlllIIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIlllI[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[llllIIlllI[6]];
                        iArr2[llllIIlllI[0]] = llllIIlllI[10];
                        iArr2[llllIIlllI[1]] = llllIIlllI[11];
                        iArr2[llllIIlllI[3]] = llllIIlllI[12];
                        if (llIIlllIIlIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIIllIl[llllIIlllI[13]]);
                            bs = llllIIlllI[1];
                            return;
                        }
                        int[] iArr3 = new int[llllIIlllI[3]];
                        iArr3[llllIIlllI[0]] = llllIIlllI[10];
                        iArr3[llllIIlllI[1]] = llllIIlllI[11];
                        if (llIIlllIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llllIIlllI[3]];
                            iArr4[llllIIlllI[0]] = llllIIlllI[10];
                            iArr4[llllIIlllI[1]] = llllIIlllI[11];
                            C0000a.a(iArr4, llllIIlllI[14]);
                        }
                        if (llIIlllIIlIII(Bank.contains(C0005f.aQ) ? 1 : 0)) {
                            Bank.withdraw(llllIIlllI[12], llllIIlllI[1], Bank.WithdrawMode.DEFAULT);
                        }
                        if (llIIlllIIlIII(Bank.contains(C0005f.aU) ? 1 : 0)) {
                            C0000a.b(C0005f.aU, llllIIlllI[1]);
                        }
                    }
                }
            }
            if (llIIlllIIlIII(aa() ? 1 : 0) && llIIlllIIlIIl(C0004e.j(llllIIlllI[5]), llllIIlllI[1])) {
                if (llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                    if (llIIlllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(llllIIlllI[3]);
                        "".length();
                    }
                    if (llIIlllIIlIlI(Bank.isOpen() ? 1 : 0) && llIIlllIIlIII(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aQ).interact(llllIIllIl[llllIIlllI[15]]);
                        Time.sleepTicks(llllIIlllI[1]);
                        "".length();
                    }
                    if (llIIlllIIlIIl(bS, llllIIlllI[1])) {
                        C0004e.v();
                        bS += llllIIlllI[1];
                    }
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[16]];
                    Movement.walkTo(ic);
                    "".length();
                    Time.sleepTicks(llllIIlllI[6]);
                    "".length();
                }
                if (llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (llIIlllIIlIII(tileObject.getName().equalsIgnoreCase(llllIIllIl[llllIIlllI[44]]) ? 1 : 0) && llIIlllIIlllI(tileObject.getWorldLocation().distanceTo(ic), llllIIlllI[9])) {
                            ?? r0 = llllIIlllI[1];
                            "".length();
                            return ((((40 + 92) - 117) + 161) ^ (((123 + 115) - 66) + 8)) == "   ".length() ? ((16 ^ 15) ^ (249 ^ 173)) & (((74 ^ 108) ^ (43 ^ 70)) ^ (-" ".length())) : r0;
                        }
                        return llllIIlllI[0];
                    });
                    if (llIIlllIIllII(nearest2)) {
                        String[] strArr = new String[llllIIlllI[1]];
                        strArr[llllIIlllI[0]] = llllIIllIl[llllIIlllI[14]];
                        if (llIIlllIIlIII(nearest2.hasAction(strArr) ? 1 : 0)) {
                            nearest2.interact(llllIIllIl[llllIIlllI[18]]);
                            Time.sleepTicks(llllIIlllI[6]);
                            "".length();
                        }
                    }
                    C0006g.a(llllIIllIl[llllIIlllI[19]], bQ);
                }
            }
            if (llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[1])) {
                ck = llllIIlllI[0];
                if (llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ic), llllIIlllI[7])) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[20]];
                    C0006g.a(llllIIllIl[llllIIlllI[21]], bQ);
                }
                if (llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                    String[] strArr2 = new String[llllIIlllI[1]];
                    strArr2[llllIIlllI[0]] = llllIIllIl[llllIIlllI[22]];
                    if (llIIlllIIlIII(Inventory.contains(strArr2) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[23]];
                        Movement.walkTo(id);
                        "".length();
                        Time.sleepTicks(llllIIlllI[1]);
                        "".length();
                    }
                }
                if (llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[24]];
                    C0006g.a(llllIIllIl[llllIIlllI[25]], bQ);
                }
            }
            if (llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[3]) && (!llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0) || llIIlllIIlIII(C0006g.K() ? 1 : 0))) {
                C0006g.a(bQ);
                Time.sleepTicks(llllIIlllI[1]);
                "".length();
            }
            if (!llIIlllIlIIII(C0004e.j(llllIIlllI[5]), llllIIlllI[6]) || llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[7])) {
                try {
                    if (!llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0) || llIIlllIIlIII(C0006g.K() ? 1 : 0)) {
                        C0006g.a(bQ);
                        Time.sleepTicks(llllIIlllI[1]);
                        "".length();
                    }
                    "".length();
                    if (" ".length() == (-" ".length())) {
                        return;
                    }
                } catch (Exception e2) {
                }
                if (llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[6]) && llIIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[26]];
                    Movement.walkTo(ie);
                    "".length();
                    Time.sleepTicks(llllIIlllI[1]);
                    "".length();
                }
                if (llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[6])) {
                    AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[27]];
                    C0006g.a(llllIIllIl[llllIIlllI[28]], bQ);
                }
            }
            if (llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[9])) {
                String[] strArr3 = new String[llllIIlllI[1]];
                strArr3[llllIIlllI[0]] = llllIIllIl[llllIIlllI[29]];
                if (llIIlllIIlIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (llIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[30]];
                        if (llIIlllIIlIII(Equipment.contains(C0005f.aQ) ? 1 : 0) && llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ie), llllIIlllI[14])) {
                            Equipment.getFirst(C0005f.aQ).interact(llllIIllIl[llllIIlllI[31]]);
                            Time.sleepTicks(llllIIlllI[9]);
                            "".length();
                        }
                        Movement.walkTo(id);
                        "".length();
                        Time.sleepTicks(llllIIlllI[1]);
                        "".length();
                    }
                    if (llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                        AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[32]];
                        C0006g.a(llllIIllIl[llllIIlllI[33]], bQ);
                    }
                }
            }
            if (llIIlllIIllll(C0004e.j(llllIIlllI[5]), llllIIlllI[9]) && llIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(id), llllIIlllI[6])) {
                AccBuilderTempleTrek.c = llllIIllIl[llllIIlllI[34]];
                if (llIIlllIIlIIl(ck, llllIIlllI[1])) {
                    ac.mN += llllIIlllI[1];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += llllIIlllI[1];
                    ac.mN = llllIIlllI[0];
                    cl = llllIIlllI[0];
                }
                C0006g.a(llllIIllIl[llllIIlllI[35]], bQ);
            }
            C0006g.a(bQ);
        }
    }

    private static boolean llIIlllIIllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlllIIllII(Object obj) {
        return obj != null;
    }

    private static void llIIlllIIIlll() {
        llllIIlllI = new int[59];
        llllIIlllI[0] = (235 ^ 196) & ((23 ^ 56) ^ (-1));
        llllIIlllI[1] = " ".length();
        llllIIlllI[2] = (122 ^ 114) ^ (96 ^ 90);
        llllIIlllI[3] = "  ".length();
        llllIIlllI[4] = (-13313) & 14307;
        llllIIlllI[5] = (51 ^ 79) ^ (80 ^ 19);
        llllIIlllI[6] = "   ".length();
        llllIIlllI[7] = 150 ^ 146;
        llllIIlllI[8] = (-17509) & 22508;
        llllIIlllI[9] = (47 ^ 34) ^ (181 ^ 189);
        llllIIlllI[10] = (-((-87) & 24831)) & (-1) & 32751;
        llllIIlllI[11] = (-8198) & 16205;
        llllIIlllI[12] = (-4386) & 16363;
        llllIIlllI[13] = (173 ^ 184) ^ (36 ^ 55);
        llllIIlllI[14] = 111 ^ 101;
        llllIIlllI[15] = 124 ^ 123;
        llllIIlllI[16] = 72 ^ 64;
        llllIIlllI[17] = 168 ^ 161;
        llllIIlllI[18] = (((65 + 1) - 23) + 138) ^ (((117 + 135) - 243) + 181);
        llllIIlllI[19] = 68 ^ 72;
        llllIIlllI[20] = (42 ^ 69) ^ (160 ^ 194);
        llllIIlllI[21] = 57 ^ 55;
        llllIIlllI[22] = 62 ^ 49;
        llllIIlllI[23] = 63 ^ 47;
        llllIIlllI[24] = 20 ^ 5;
        llllIIlllI[25] = (((14 + 11) - (-72)) + 43) ^ (((81 + 104) - 140) + 113);
        llllIIlllI[26] = (188 ^ 185) ^ (134 ^ 144);
        llllIIlllI[27] = (128 ^ 133) ^ (54 ^ 39);
        llllIIlllI[28] = (((104 + 5) - 64) + 99) ^ (((63 + 88) - 45) + 27);
        llllIIlllI[29] = 74 ^ 92;
        llllIIlllI[30] = (229 ^ 173) ^ (92 ^ 3);
        llllIIlllI[31] = 53 ^ 45;
        llllIIlllI[32] = 4 ^ 29;
        llllIIlllI[33] = 106 ^ 112;
        llllIIlllI[34] = 126 ^ 101;
        llllIIlllI[35] = 94 ^ 66;
        llllIIlllI[36] = (-((-1313) & 15779)) & (-2) & 16367;
        llllIIlllI[37] = (-6147) & 31146;
        llllIIlllI[38] = (-((-8751) & 25407)) & (-4099) & 32734;
        llllIIlllI[39] = 162 ^ 138;
        llllIIlllI[40] = (-((-20753) & 24505)) & (-5) & 16381;
        llllIIlllI[41] = 226 ^ 134;
        llllIIlllI[42] = (25 ^ 98) ^ (6 ^ 96);
        llllIIlllI[43] = 89 ^ 71;
        llllIIlllI[44] = 93 ^ 66;
        llllIIlllI[45] = (-((-27267) & 31667)) & (-24581) & 32190;
        llllIIlllI[46] = (-((-17069) & 21167)) & (-16738) & 24055;
        llllIIlllI[47] = (-12321) & 15421;
        llllIIlllI[48] = (-641) & 10210;
        llllIIlllI[49] = (-((-1106) & 14173)) & (-65) & 16383;
        llllIIlllI[50] = (-12295) & 15695;
        llllIIlllI[51] = (((166 + 120) - 271) + 161) ^ (((47 + 140) - 134) + 91);
        llllIIlllI[52] = 139 ^ 170;
        llllIIlllI[53] = (33 ^ 109) ^ (30 ^ 112);
        llllIIlllI[54] = 14 ^ 45;
        llllIIlllI[55] = (119 ^ 36) ^ (54 ^ 65);
        llllIIlllI[56] = 69 ^ 96;
        llllIIlllI[57] = (((47 + 66) - (-37)) + 36) ^ (((128 + 58) - 158) + 128);
        llllIIlllI[58] = 185 ^ 158;
    }
}
