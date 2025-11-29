package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.Z  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/Z.class */
public class Z implements InterfaceC0003ac {
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIlIlIIIl;
    public static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint mE;
    public static final /* synthetic */ WorldPoint mF;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ int[] llIlIlIlll;
    public static final /* synthetic */ WorldPoint mG;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint mD;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIllIIllIllIl(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            es();
            "".length();
            if ((((((45 + 86) - 92) + 108) ^ (((102 + 55) - (-14)) + 3)) & (((((14 + 184) - 22) + 13) ^ (((30 + 100) - 73) + 71)) ^ (-" ".length()))) >= "  ".length()) {
                return ((35 ^ 18) ^ (230 ^ 156)) & (((((13 + 113) - 38) + 55) ^ (((145 + 142) - 187) + 96)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIlIlll[53];
    }

    private static boolean lIllIIlllllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean an() {
        int[] iArr = new int[llIlIlIlll[1]];
        iArr[llIlIlIlll[0]] = llIlIlIlll[9];
        return Inventory.contains(iArr);
    }

    private static boolean lIllIIlllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlllIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIlIlll[0];
    }

    private static boolean lIllIIlllIIII(int i) {
        return i > 0;
    }

    private static String lIllIIllIIIlI(String llllllllllllllllllIIIlllIllIIlIl, String llllllllllllllllllIIIlllIllIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIIIlllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlllIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlllIllIIlll.init(llIlIlIlll[3], llllllllllllllllllIIIlllIllIlIII);
            return new String(llllllllllllllllllIIIlllIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlllIllIIllI) {
            llllllllllllllllllIIIlllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void Q() {
        int[] iArr = new int[llIlIlIlll[1]];
        iArr[llIlIlIlll[0]] = llIlIlIlll[48];
        if (lIllIIllIllll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIlll[48], llIlIlIlll[10], C0023j.cf));
            "".length();
        }
        int[] iArr2 = new int[llIlIlIlll[1]];
        iArr2[llIlIlIlll[0]] = llIlIlIlll[9];
        if (lIllIIllIllll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIlll[9], llIlIlIlll[1], llIlIlIlll[49]));
            "".length();
        }
        if (lIllIIllIllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIlIIIl[llIlIlIlll[54]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIlll[50], llIlIlIlll[10], llIlIlIlll[51]));
            "".length();
        }
        int[] iArr3 = new int[llIlIlIlll[1]];
        iArr3[llIlIlIlll[0]] = llIlIlIlll[11];
        if (lIllIIllIllll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIlll[11], llIlIlIlll[20], llIlIlIlll[52]));
            "".length();
        }
    }

    private static void lIllIIllIlIll() {
        llIlIlIIIl = new String[llIlIlIlll[75]];
        llIlIlIIIl[llIlIlIlll[0]] = lIllIIllIIIIl("EhIzIQY3RyM8DT0U", "PgJHh");
        llIlIlIIIl[llIlIlIlll[1]] = lIllIIllIIIlI("cRTvvUx5R74gW4lj8+JuyPLFsOHPQ7Ya3nQv3LT8oG2CDYEvgZSExRQxGHyr9ych", "uGEtX");
        llIlIlIIIl[llIlIlIlll[3]] = lIllIIllIIIll("1Uur511rVAU=", "spOTF");
        llIlIlIIIl[llIlIlIlll[6]] = lIllIIllIIIlI("IpTaIUUfqt5HAIbZufIhYw==", "RlGgF");
        llIlIlIIIl[llIlIlIlll[7]] = lIllIIllIIIll("AGloLvhV+Y93n5xc/j1Nn8zUzVZcmI5k", "KEEcg");
        llIlIlIIIl[llIlIlIlll[10]] = lIllIIllIIIIl("HzBUIhwtdRkqHTs8GiROOSARMBpoJgEzHiQ8ETBCaCYDKhorPR0tCWghG2MsHQw9DSk=", "HUtCn");
        llIlIlIIIl[llIlIlIlll[14]] = lIllIIllIIIll("AD1oNFA/XF9LRoeWw2QsjQ==", "CSfJD");
        llIlIlIIIl[llIlIlIlll[15]] = lIllIIllIIIlI("d0/4n2uDfRTN48DSeVfWwQ==", "udlCN");
        llIlIlIIIl[llIlIlIlll[13]] = lIllIIllIIIll("zYS0nZWz2LQ=", "Oxtts");
        llIlIlIIIl[llIlIlIlll[16]] = lIllIIllIIIlI("1f4lr58cOYs=", "TVtEM");
        llIlIlIIIl[llIlIlIlll[12]] = lIllIIllIIIlI("uPnByWEF1SiOLDg8KjC41w==", "IKWAm");
        llIlIlIIIl[llIlIlIlll[17]] = lIllIIllIIIlI("hjy3/kk+nwDp8Ye369EHcw==", "aHWxQ");
        llIlIlIIIl[llIlIlIlll[18]] = lIllIIllIIIll("1R3hX2SLHRo=", "HhjXF");
        llIlIlIIIl[llIlIlIlll[19]] = lIllIIllIIIll("xOBkz5h0A3o=", "piTST");
        llIlIlIIIl[llIlIlIlll[21]] = lIllIIllIIIIl("OBQQbCUZVRQjPBMa", "vufLQ");
        llIlIlIIIl[llIlIlIlll[22]] = lIllIIllIIIIl("FjUoEAQsLy5CATAkOhY=", "EAIbp");
        llIlIlIIIl[llIlIlIlll[23]] = lIllIIllIIIll("CxNzHo3Nk8A=", "qDZkA");
        llIlIlIIIl[llIlIlIlll[25]] = lIllIIllIIIll("ZXhRBSaEZJehTz2JfmqvWQ==", "GKBXg");
        llIlIlIIIl[llIlIlIlll[26]] = lIllIIllIIIlI("8Z2UgS330RG5+Zzynynxgg==", "gtvxb");
        llIlIlIIIl[llIlIlIlll[27]] = lIllIIllIIIlI("M6XPIuhvOiVY+JdRYuTKoA==", "SGTdG");
        llIlIlIIIl[llIlIlIlll[20]] = lIllIIllIIIll("oUicGwNsrn3e+dwqVGnyEGFORzA6Rq/4", "PpMpX");
        llIlIlIIIl[llIlIlIlll[29]] = lIllIIllIIIll("9KE/zfBEW4io9+0EgOEH8g==", "qqlGt");
        llIlIlIIIl[llIlIlIlll[30]] = lIllIIllIIIIl("GCgJICo8OwcmOw==", "YXfTB");
        llIlIlIIIl[llIlIlIlll[31]] = lIllIIllIIIll("pkIWbQsbBuJwMUT7yZIaIQ==", "WQVqf");
        llIlIlIIIl[llIlIlIlll[32]] = lIllIIllIIIlI("U+lcx57JmHnHBqlLO9u92yNysAf0DkRM", "trIXB");
        llIlIlIIIl[llIlIlIlll[33]] = lIllIIllIIIlI("jnCPWHzAc7s5IeOfpEGM7w==", "SzWMJ");
        llIlIlIIIl[llIlIlIlll[34]] = lIllIIllIIIlI("HSibXpu//0RBOPd+W5J7aw==", "egdNL");
        llIlIlIIIl[llIlIlIlll[35]] = lIllIIllIIIlI("XMzAgrpeWr00BQ5gc4lLYQ==", "ZhKOq");
        llIlIlIIIl[llIlIlIlll[36]] = lIllIIllIIIIl("ARgWEzojWQIdOCsWHA==", "ByrrL");
        llIlIlIIIl[llIlIlIlll[37]] = lIllIIllIIIIl("NSc5JQ==", "bBXWS");
        llIlIlIIIl[llIlIlIlll[24]] = lIllIIllIIIll("uqw09mK9LlyNn4c5cwCSYw==", "GNLhH");
        llIlIlIIIl[llIlIlIlll[38]] = lIllIIllIIIll("+O7YExm6gwvsPKp3NzNnfw==", "XwGqJ");
        llIlIlIIIl[llIlIlIlll[39]] = lIllIIllIIIll("sku/nDzJX2k=", "gZxoi");
        llIlIlIIIl[llIlIlIlll[40]] = lIllIIllIIIll("74n1DIoOhEs=", "bbvdY");
        llIlIlIIIl[llIlIlIlll[42]] = lIllIIllIIIll("6BPUJ1zVAlYhQz01igB05w==", "OxTKX");
        llIlIlIIIl[llIlIlIlll[43]] = lIllIIllIIIIl("NAs0DDIaCzQCYQMXPxY1", "rbZeA");
        llIlIlIIIl[llIlIlIlll[44]] = lIllIIllIIIlI("Cdv5BjLLfAQ=", "bUvbS");
        llIlIlIIIl[llIlIlIlll[45]] = lIllIIllIIIll("Ei+RLr9rQChSRQpHUJf/Ag==", "pohHH");
        llIlIlIIIl[llIlIlIlll[46]] = lIllIIllIIIIl("MgIBBwATDQhDDhsNBAoCHQ==", "zcocl");
        llIlIlIIIl[llIlIlIlll[47]] = lIllIIllIIIIl("AjdHKDYwcgogNyY7CS5kJCcCOjB1IRI5NDk7AjpodSEQIDA2Og4nI3UmCGkGAAsuBwM=", "URgID");
        llIlIlIIIl[llIlIlIlll[28]] = lIllIIllIIIlI("MXi8H9rBRbIbOYKslpGYWVRILL92ncJ3", "lXOUV");
        llIlIlIIIl[llIlIlIlll[54]] = lIllIIllIIIlI("anQYbrN36sapX2IpDPuRukHInsl2frKv", "WOHdk");
        llIlIlIIIl[llIlIlIlll[55]] = lIllIIllIIIlI("klfaVfv8qIw=", "wiJJR");
        llIlIlIIIl[llIlIlIlll[58]] = lIllIIllIIIll("Jfz7D7jlf5U=", "etHhK");
        llIlIlIIIl[llIlIlIlll[59]] = lIllIIllIIIll("i+UzTA25esU=", "WNmlD");
        llIlIlIIIl[llIlIlIlll[60]] = lIllIIllIIIll("D/zdOQsRz7U=", "lstUO");
        llIlIlIIIl[llIlIlIlll[69]] = lIllIIllIIIIl("PjMeQEEudgUNFwJ2HgkECXYFCRNHNw4YFAY6ARVA", "gVmla");
        llIlIlIIIl[llIlIlIlll[70]] = lIllIIllIIIll("9l5WvoB7XL+cctgrYbFWopaDzBQN22i6OVATZaAqWAg=", "qiABO");
        llIlIlIIIl[llIlIlIlll[71]] = lIllIIllIIIlI("SJjxHAkWoLKMld4zkwP3oA==", "nfqhn");
        llIlIlIIIl[llIlIlIlll[72]] = lIllIIllIIIlI("AeSBNl1iM+jJzZjCN+3NeKsN1mQ/WautMp9mm13fGsA=", "bgELM");
        llIlIlIIIl[llIlIlIlll[2]] = lIllIIllIIIIl("OCo1A1ENKTYdBUwZNgUUA2t/SDsZJzANBUI=", "lKYhq");
        llIlIlIIIl[llIlIlIlll[73]] = lIllIIllIIIll("8zRfjsRoa6mYs8MCQ+hPDA==", "ZvFYl");
        llIlIlIIIl[llIlIlIlll[74]] = lIllIIllIIIIl("OAk3Vw==", "alDyN");
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIlIIIl[llIlIlIlll[28]];
    }

    private static String lIllIIllIIIIl(String llllllllllllllllllIIIlllIlIlIlIl, String llllllllllllllllllIIIlllIlIlIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIlllIlIlIlII.toCharArray();
        int llllllllllllllllllIIIlllIlIlIIIl = llIlIlIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIlll[0];
        while (lIllIIllIlllI(i, length)) {
            char llllllllllllllllllIIIlllIlIlIllI = charArray2[i];
            sb.append((char) (llllllllllllllllllIIIlllIlIlIllI ^ charArray[llllllllllllllllllIIIlllIlIlIIIl % charArray.length]));
            "".length();
            llllllllllllllllllIIIlllIlIlIIIl++;
            i++;
            "".length();
            if ("   ".length() == ((13 ^ 8) & ((53 ^ 48) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    private static void dA() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIllIIlllIIIl(nearest) && lIllIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[45]];
            C0000a.a(nearest);
            Time.sleepTicks(llIlIlIlll[3]);
            "".length();
        }
        if (lIllIIlllIIIl(nearest) && lIllIIllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[46]];
            if (lIllIIllIllll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIlIlIlll[8]);
                "".length();
            }
            if (lIllIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                if (lIllIIlllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIlIlIlll[7]);
                    "".length();
                }
                if (lIllIIlllIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIlIlIlll[3]);
                    "".length();
                }
                int[] iArr = new int[llIlIlIlll[1]];
                iArr[llIlIlIlll[0]] = llIlIlIlll[9];
                if (lIllIIllIllll(C0018e.c(iArr) ? 1 : 0)) {
                    Q();
                    System.out.println(llIlIlIIIl[llIlIlIlll[47]]);
                    bt = llIlIlIlll[1];
                    return;
                }
                int[] iArr2 = new int[llIlIlIlll[1]];
                iArr2[llIlIlIlll[0]] = llIlIlIlll[9];
                if (lIllIIllIllIl(C0018e.c(iArr2) ? 1 : 0)) {
                    C0000a.a(llIlIlIlll[9], llIlIlIlll[1]);
                    C0000a.b(C0019f.ba, llIlIlIlll[3]);
                    C0000a.a(llIlIlIlll[11], llIlIlIlll[12]);
                    C0000a.b(C0019f.bk, llIlIlIlll[1]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIlllllIl(C0018e.j(llIlIlIlll[5]), llIlIlIlll[53])) {
            ?? r0 = llIlIlIlll[1];
            "".length();
            return ((241 ^ 166) & ((144 ^ 199) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIlll[0];
    }

    static {
        lIllIIllIllII();
        lIllIIllIlIll();
        mD = new WorldPoint(llIlIlIlll[61], llIlIlIlll[62], llIlIlIlll[0]);
        mE = new WorldPoint(llIlIlIlll[63], llIlIlIlll[64], llIlIlIlll[1]);
        mF = new WorldPoint(llIlIlIlll[65], llIlIlIlll[66], llIlIlIlll[0]);
        mG = new WorldPoint(llIlIlIlll[67], llIlIlIlll[68], llIlIlIlll[0]);
        String[] strArr = new String[llIlIlIlll[15]];
        strArr[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[69]];
        strArr[llIlIlIlll[1]] = llIlIlIIIl[llIlIlIlll[70]];
        strArr[llIlIlIlll[3]] = llIlIlIIIl[llIlIlIlll[71]];
        strArr[llIlIlIlll[6]] = llIlIlIIIl[llIlIlIlll[72]];
        strArr[llIlIlIlll[7]] = llIlIlIIIl[llIlIlIlll[2]];
        strArr[llIlIlIlll[10]] = llIlIlIIIl[llIlIlIlll[73]];
        strArr[llIlIlIlll[14]] = llIlIlIIIl[llIlIlIlll[74]];
        cE = strArr;
        bv = new ArrayList();
        cG = llIlIlIlll[0];
    }

    private static boolean lIllIIlllIlII(int i, int i2) {
        return i == i2;
    }

    private static void lIllIIllIllII() {
        llIlIlIlll = new int[76];
        llIlIlIlll[0] = ((((199 + 160) - 209) + 102) ^ (((5 + 85) - (-59)) + 41)) & (((224 ^ 192) ^ (120 ^ 26)) ^ (-" ".length()));
        llIlIlIlll[1] = " ".length();
        llIlIlIlll[2] = 69 ^ 119;
        llIlIlIlll[3] = "  ".length();
        llIlIlIlll[4] = (-27657) & 28651;
        llIlIlIlll[5] = ((20 + 99) - 114) + 139;
        llIlIlIlll[6] = "   ".length();
        llIlIlIlll[7] = (((16 + 50) - (-60)) + 66) ^ (((171 + 103) - 196) + 118);
        llIlIlIlll[8] = (-27668) & 32667;
        llIlIlIlll[9] = (-((-2405) & 10605)) & (-18439) & 27391;
        llIlIlIlll[10] = (((131 + 100) - 97) + 61) ^ (((116 + 5) - 71) + 148);
        llIlIlIlll[11] = (-((-1761) & 18161)) & (-8329) & 32735;
        llIlIlIlll[12] = 46 ^ 36;
        llIlIlIlll[13] = 206 ^ 198;
        llIlIlIlll[14] = (((42 + 115) - 125) + 132) ^ (((75 + 55) - 101) + 133);
        llIlIlIlll[15] = 142 ^ 137;
        llIlIlIlll[16] = (71 ^ 23) ^ (118 ^ 47);
        llIlIlIlll[17] = 165 ^ 174;
        llIlIlIlll[18] = 23 ^ 27;
        llIlIlIlll[19] = 147 ^ 158;
        llIlIlIlll[20] = (68 ^ 24) ^ (111 ^ 39);
        llIlIlIlll[21] = (253 ^ 149) ^ (37 ^ 67);
        llIlIlIlll[22] = (214 ^ 191) ^ (17 ^ 119);
        llIlIlIlll[23] = 140 ^ 156;
        llIlIlIlll[24] = 61 ^ 35;
        llIlIlIlll[25] = 210 ^ 195;
        llIlIlIlll[26] = (168 ^ 136) ^ (85 ^ 103);
        llIlIlIlll[27] = (((100 + 91) - 120) + 80) ^ (((67 + 113) - 72) + 24);
        llIlIlIlll[28] = (((46 + 105) - 127) + 133) ^ (((64 + 26) - (-38)) + 53);
        llIlIlIlll[29] = 72 ^ 93;
        llIlIlIlll[30] = (((97 + 32) - 80) + 103) ^ (((1 + 111) - 78) + 108);
        llIlIlIlll[31] = 63 ^ 40;
        llIlIlIlll[32] = 163 ^ 187;
        llIlIlIlll[33] = 108 ^ 117;
        llIlIlIlll[34] = 93 ^ 71;
        llIlIlIlll[35] = (((45 + 142) - 44) + 4) ^ (((29 + 97) - 73) + 83);
        llIlIlIlll[36] = 47 ^ 51;
        llIlIlIlll[37] = (((82 + 108) - 81) + 79) ^ (((22 + 56) - 26) + 109);
        llIlIlIlll[38] = 47 ^ 48;
        llIlIlIlll[39] = (163 ^ 130) ^ " ".length();
        llIlIlIlll[40] = (13 ^ 113) ^ (71 ^ 26);
        llIlIlIlll[41] = (((146 + 72) - 193) + 142) ^ (((16 + 145) - 30) + 24);
        llIlIlIlll[42] = (56 ^ 112) ^ (99 ^ 9);
        llIlIlIlll[43] = 17 ^ 50;
        llIlIlIlll[44] = (49 ^ 56) ^ (101 ^ 72);
        llIlIlIlll[45] = 136 ^ 173;
        llIlIlIlll[46] = 99 ^ 69;
        llIlIlIlll[47] = (79 ^ 10) ^ (0 ^ 98);
        llIlIlIlll[48] = (-129) & 12753;
        llIlIlIlll[49] = (-((-7690) & 32475)) & (-1) & 30685;
        llIlIlIlll[50] = (-16434) & 28413;
        llIlIlIlll[51] = (-513) & 25512;
        llIlIlIlll[52] = (-((-527) & 27295)) & (-3) & 28670;
        llIlIlIlll[53] = 194 ^ 166;
        llIlIlIlll[54] = (((8 + 67) - 73) + 148) ^ (((118 + 1) - 94) + 166);
        llIlIlIlll[55] = 81 ^ 123;
        llIlIlIlll[56] = (-17066) & 20223;
        llIlIlIlll[57] = (-20613) & 24038;
        llIlIlIlll[58] = (4 ^ 3) ^ (96 ^ 76);
        llIlIlIlll[59] = 111 ^ 67;
        llIlIlIlll[60] = (((59 + 104) - 28) + 36) ^ (((9 + 64) - 67) + 128);
        llIlIlIlll[61] = (-4099) & 7310;
        llIlIlIlll[62] = (-16543) & 19966;
        llIlIlIlll[63] = (-16905) & 20061;
        llIlIlIlll[64] = (-((-11329) & 32451)) & (-9) & 24555;
        llIlIlIlll[65] = (-((-10913) & 31393)) & (-321) & 24055;
        llIlIlIlll[66] = (-29188) & 32671;
        llIlIlIlll[67] = (-((-27049) & 27565)) & (-16641) & 20351;
        llIlIlIlll[68] = (-((-5444) & 22359)) & (-161) & 20479;
        llIlIlIlll[69] = (132 ^ 186) ^ (183 ^ 167);
        llIlIlIlll[70] = (94 ^ 91) ^ (115 ^ 89);
        llIlIlIlll[71] = (((118 + 11) - 4) + 14) ^ (((137 + 124) - 131) + 57);
        llIlIlIlll[72] = 187 ^ 138;
        llIlIlIlll[73] = 180 ^ 135;
        llIlIlIlll[74] = 66 ^ 118;
        llIlIlIlll[75] = (((51 + 142) - 183) + 147) ^ (((96 + 149) - 171) + 94);
    }

    private static boolean lIllIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIllIllll(int i) {
        return i == 0;
    }

    private static String lIllIIllIIIll(String llllllllllllllllllIIIlllIlllIIlI, String llllllllllllllllllIIIlllIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlll[13]), "DES");
            Cipher llllllllllllllllllIIIlllIlllIlII = Cipher.getInstance("DES");
            llllllllllllllllllIIIlllIlllIlII.init(llIlIlIlll[3], secretKeySpec);
            return new String(llllllllllllllllllIIIlllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlllIlllIIll) {
            llllllllllllllllllIIIlllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
        if (lIllIIlllIIII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void es() {
        if (lIllIIllIllIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[0]];
            C0015b.a(bv);
            if (lIllIIllIlllI(bv.size(), llIlIlIlll[1])) {
                System.out.println(llIlIlIIIl[llIlIlIlll[1]]);
                bt = llIlIlIlll[0];
            }
        }
        if (lIllIIllIllll(bt ? 1 : 0)) {
            if (lIllIIllIllIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllIIllIlllI(Movement.getRunEnergy(), llIlIlIlll[2])) {
                Inventory.getFirst(C0019f.ba).interact(llIlIlIIIl[llIlIlIlll[3]]);
                Time.sleepTicks(llIlIlIlll[1]);
                "".length();
            }
            if (lIllIIllIllll(Movement.isRunEnabled() ? 1 : 0) && lIllIIlllIIII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllIIllIllIl(an() ? 1 : 0)) {
                int[] iArr = new int[llIlIlIlll[1]];
                iArr[llIlIlIlll[0]] = llIlIlIlll[4];
            }
            if (lIllIIllIlllI(C0018e.j(llIlIlIlll[5]), llIlIlIlll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIlllIIIl(nearest) && lIllIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIlIlIlll[3]);
                    "".length();
                }
                if (lIllIIlllIIIl(nearest) && lIllIIllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[7]];
                    if (lIllIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlIlll[8]);
                        "".length();
                    }
                    if (lIllIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIlllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlIlll[7]);
                            "".length();
                        }
                        if (lIllIIlllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlIlll[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[llIlIlIlll[1]];
                        iArr2[llIlIlIlll[0]] = llIlIlIlll[9];
                        if (lIllIIllIllll(C0018e.c(iArr2) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIlIIIl[llIlIlIlll[10]]);
                            bt = llIlIlIlll[1];
                            return;
                        }
                        int[] iArr3 = new int[llIlIlIlll[1]];
                        iArr3[llIlIlIlll[0]] = llIlIlIlll[9];
                        if (lIllIIllIllIl(C0018e.c(iArr3) ? 1 : 0)) {
                            C0000a.a(llIlIlIlll[9], llIlIlIlll[1]);
                            C0000a.b(C0019f.ba, llIlIlIlll[3]);
                            C0000a.a(llIlIlIlll[11], llIlIlIlll[12]);
                            C0000a.b(C0019f.bk, llIlIlIlll[1]);
                        }
                    }
                }
            }
            if (lIllIIllIllIl(an() ? 1 : 0) && lIllIIllIlllI(C0018e.j(llIlIlIlll[5]), llIlIlIlll[1])) {
                if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[14]];
                    if (lIllIIllIlllI(cG, llIlIlIlll[1])) {
                        C0018e.x();
                        cG += llIlIlIlll[1];
                    }
                    Movement.walkTo(mD);
                    "".length();
                    Time.sleepTicks(llIlIlIlll[1]);
                    "".length();
                }
                if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[15]];
                    C0020g.a(llIlIlIIIl[llIlIlIlll[13]], cE);
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[12])) {
                if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                    if (lIllIIllIllIl(Inventory.contains(C0019f.bk) ? 1 : 0) && lIllIIllIllll(Equipment.contains(C0019f.bk) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.bk).interact(llIlIlIIIl[llIlIlIlll[16]]);
                        Time.sleepTicks(llIlIlIlll[1]);
                        "".length();
                    }
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[12]];
                    Movement.walkTo(mE);
                    "".length();
                    Time.sleepTicks(llIlIlIlll[1]);
                    "".length();
                }
                if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (lIllIIllIllIl(tileObject.getName().contains(llIlIlIIIl[llIlIlIlll[59]]) ? 1 : 0) && lIllIIlllIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlll[56], llIlIlIlll[57], llIlIlIlll[1])), llIlIlIlll[3])) {
                            String[] strArr = new String[llIlIlIlll[1]];
                            strArr[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[60]];
                            if (lIllIIllIllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = llIlIlIlll[1];
                                "".length();
                                return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return llIlIlIlll[0];
                    });
                    if (lIllIIlllIIIl(nearest2)) {
                        nearest2.interact(llIlIlIIIl[llIlIlIlll[18]]);
                        Time.sleepTicks(llIlIlIlll[6]);
                        "".length();
                    }
                    C0020g.a(llIlIlIIIl[llIlIlIlll[19]], cE);
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[20])) {
                if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[21]];
                    Movement.walkTo(mD);
                    "".length();
                    Time.sleepTicks(llIlIlIlll[1]);
                    "".length();
                }
                if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[22]];
                    C0020g.a(llIlIlIIIl[llIlIlIlll[23]], cE);
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[24])) {
                if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mF), llIlIlIlll[10])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[25]];
                    Movement.walkTo(mF);
                    "".length();
                    Time.sleepTicks(llIlIlIlll[1]);
                    "".length();
                }
                if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mF), llIlIlIlll[10])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[26]];
                    C0020g.a(llIlIlIIIl[llIlIlIlll[27]], cE);
                }
                C0020g.a(cE);
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[28])) {
                if (lIllIIllIllll(an() ? 1 : 0)) {
                    dA();
                }
                if (lIllIIllIllIl(an() ? 1 : 0)) {
                    if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[20]];
                        Movement.walkTo(mG);
                        "".length();
                        Time.sleepTicks(llIlIlIlll[1]);
                        "".length();
                    }
                    if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[29]];
                        C0020g.a(llIlIlIIIl[llIlIlIlll[30]], cE);
                    }
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] strArr = new String[llIlIlIlll[1]];
                strArr[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[31]];
                if (lIllIIllIllll(Inventory.contains(strArr) ? 1 : 0) && lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                    if (lIllIIllIllll(an() ? 1 : 0)) {
                        dA();
                    }
                    if (lIllIIllIllIl(an() ? 1 : 0) && lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[32]];
                        Movement.walkTo(mG);
                        "".length();
                        Time.sleepTicks(llIlIlIlll[1]);
                        "".length();
                    }
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] strArr2 = new String[llIlIlIlll[1]];
                strArr2[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[33]];
                if (lIllIIllIllll(Inventory.contains(strArr2) ? 1 : 0) && lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                    di = llIlIlIlll[0];
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[34]];
                    C0020g.a(llIlIlIIIl[llIlIlIlll[35]], cE);
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] strArr3 = new String[llIlIlIlll[1]];
                strArr3[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[36]];
                if (lIllIIllIllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                        if (lIllIIllIllIl(Inventory.contains(C0019f.bk) ? 1 : 0) && lIllIIllIllll(Equipment.contains(C0019f.bk) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.bk).interact(llIlIlIIIl[llIlIlIlll[37]]);
                            Time.sleepTicks(llIlIlIlll[1]);
                            "".length();
                        }
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[24]];
                        Movement.walkTo(mE);
                        "".length();
                        Time.sleepTicks(llIlIlIlll[1]);
                        "".length();
                    }
                    if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[38]];
                        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                            if (lIllIIllIllIl(tileObject2.getName().contains(llIlIlIIIl[llIlIlIlll[55]]) ? 1 : 0) && lIllIIlllIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlll[56], llIlIlIlll[57], llIlIlIlll[1])), llIlIlIlll[3])) {
                                String[] strArr4 = new String[llIlIlIlll[1]];
                                strArr4[llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[58]];
                                if (lIllIIllIllIl(tileObject2.hasAction(strArr4) ? 1 : 0)) {
                                    ?? r0 = llIlIlIlll[1];
                                    "".length();
                                    return (-"   ".length()) >= 0 ? ((88 ^ 44) ^ (82 ^ 122)) & (((((49 + 21) - 26) + 165) ^ (((111 + 116) - 148) + 62)) ^ (-" ".length())) : r0;
                                }
                            }
                            return llIlIlIlll[0];
                        });
                        if (lIllIIlllIIIl(nearest3)) {
                            nearest3.interact(llIlIlIIIl[llIlIlIlll[39]]);
                            Time.sleepTicks(llIlIlIlll[6]);
                            "".length();
                        }
                        C0020g.a(llIlIlIIIl[llIlIlIlll[40]], cE);
                    }
                    C0020g.a(cE);
                }
            }
            if (lIllIIlllIlII(C0018e.j(llIlIlIlll[5]), llIlIlIlll[41])) {
                if (lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13]) && lIllIIllIllll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[42]];
                    Movement.walkTo(mD);
                    "".length();
                    Time.sleepTicks(llIlIlIlll[1]);
                    "".length();
                }
                if (lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[43]];
                    if (lIllIIllIlllI(di, llIlIlIlll[1])) {
                        aN.sT += llIlIlIlll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIlIlll[1];
                        aN.sT = llIlIlIlll[0];
                        dj = llIlIlIlll[0];
                    }
                    C0020g.a(llIlIlIIIl[llIlIlIlll[44]], cE);
                    Time.sleepTicks(llIlIlIlll[10]);
                    "".length();
                }
            }
            C0020g.a(cE);
            System.out.println("Setting: " + C0018e.j(llIlIlIlll[5]));
        }
    }
}
