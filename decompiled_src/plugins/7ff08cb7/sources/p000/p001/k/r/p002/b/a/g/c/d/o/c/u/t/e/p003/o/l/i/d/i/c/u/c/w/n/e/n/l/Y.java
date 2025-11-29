package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.Y  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/Y.class */
public class Y implements ab {
    static /* synthetic */ int dk;
    static /* synthetic */ int cI;
    public static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] lIIIIIlIlI;
    public static final /* synthetic */ WorldPoint lI;
    public static final /* synthetic */ WorldPoint lK;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint lJ;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lIIIIIlIll;
    public static final /* synthetic */ WorldPoint lL;

    private static boolean llIlllIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllIllIlI(int i) {
        return i == 0;
    }

    private static boolean llIlllIllIII(int i) {
        return i != 0;
    }

    private static String llIlllIlIlIl(String lIIIIlIIIllIl, String lIIIIlIIIllII) {
        String str = new String(Base64.getDecoder().decode(lIIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIIlIIIllII.toCharArray();
        int lIIIIlIIIlIIl = lIIIIIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIlIll[0];
        while (llIlllIllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIIIIlIIIlIIl % charArray.length]));
            "".length();
            lIIIIlIIIlIIl++;
            i++;
            "".length();
            if ((((144 ^ 190) ^ (15 ^ 120)) & (((((188 + 192) - 192) + 7) ^ (((106 + 88) - 121) + 81)) ^ (-" ".length()))) != (((17 ^ 48) ^ (209 ^ 183)) & (((187 ^ 133) ^ (239 ^ 150)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dL();
            "".length();
            if (0 != 0) {
                return ((225 ^ 141) ^ (130 ^ 174)) & (((45 ^ 48) ^ (158 ^ 195)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIIlIll[53];
    }

    private static boolean llIlllIllIll(int i) {
        return i > 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIIlIlI[lIIIIIlIll[28]];
    }

    private static String llIlllIlIlII(String lIIIIlIIlllIl, String lIIIIlIIlllII) {
        try {
            SecretKeySpec lIIIIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIlIll[3], lIIIIlIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIIllllI) {
            lIIIIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIlIll[0];
    }

    private static String llIlllIIlIIl(String lIIIIlIlIlIlI, String lIIIIlIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIlIll[13]), "DES");
            Cipher lIIIIlIlIllII = Cipher.getInstance("DES");
            lIIIIlIlIllII.init(lIIIIIlIll[3], secretKeySpec);
            return new String(lIIIIlIlIllII.doFinal(Base64.getDecoder().decode(lIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIlIlIll) {
            lIIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        llIlllIlIlll();
        llIlllIlIllI();
        lI = new WorldPoint(lIIIIIlIll[61], lIIIIIlIll[62], lIIIIIlIll[0]);
        lJ = new WorldPoint(lIIIIIlIll[63], lIIIIIlIll[64], lIIIIIlIll[1]);
        lK = new WorldPoint(lIIIIIlIll[65], lIIIIIlIll[66], lIIIIIlIll[0]);
        lL = new WorldPoint(lIIIIIlIll[67], lIIIIIlIll[68], lIIIIIlIll[0]);
        String[] strArr = new String[lIIIIIlIll[15]];
        strArr[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[69]];
        strArr[lIIIIIlIll[1]] = lIIIIIlIlI[lIIIIIlIll[70]];
        strArr[lIIIIIlIll[3]] = lIIIIIlIlI[lIIIIIlIll[71]];
        strArr[lIIIIIlIll[6]] = lIIIIIlIlI[lIIIIIlIll[72]];
        strArr[lIIIIIlIll[7]] = lIIIIIlIlI[lIIIIIlIll[2]];
        strArr[lIIIIIlIll[10]] = lIIIIIlIlI[lIIIIIlIll[73]];
        strArr[lIIIIIlIll[14]] = lIIIIIlIlI[lIIIIIlIll[74]];
        cG = strArr;
        bx = new ArrayList();
        cI = lIIIIIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllllIIIII(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[53])) {
            ?? r0 = lIIIIIlIll[1];
            "".length();
            return (-" ".length()) != (-" ".length()) ? ((171 ^ 172) ^ (68 ^ 7)) & (((66 ^ 106) ^ (198 ^ 170)) ^ (-" ".length())) : r0;
        }
        return lIIIIIlIll[0];
    }

    private static boolean llIlllIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllllIIIII(int i, int i2) {
        return i >= i2;
    }

    private static void Q() {
        int[] iArr = new int[lIIIIIlIll[1]];
        iArr[lIIIIIlIll[0]] = lIIIIIlIll[48];
        if (llIlllIllIlI(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIlIll[48], lIIIIIlIll[10], C0009j.ch));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIlIll[1]];
        iArr2[lIIIIIlIll[0]] = lIIIIIlIll[9];
        if (llIlllIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIlIll[9], lIIIIIlIll[1], lIIIIIlIll[49]));
            "".length();
        }
        if (llIlllIllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIlIlI[lIIIIIlIll[54]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIlIll[50], lIIIIIlIll[10], lIIIIIlIll[51]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIlIll[1]];
        iArr3[lIIIIIlIll[0]] = lIIIIIlIll[11];
        if (llIlllIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIlIll[11], lIIIIIlIll[20], lIIIIIlIll[52]));
            "".length();
        }
    }

    private static void llIlllIlIllI() {
        lIIIIIlIlI = new String[lIIIIIlIll[75]];
        lIIIIIlIlI[lIIIIIlIll[0]] = llIlllIIlIIl("lezDGvrV9TkO5TpzOQYHyw==", "xdEjv");
        lIIIIIlIlI[lIIIIIlIll[1]] = llIlllIlIlII("krJQHtL14Xp20GsW/ChUVOwV6bBwz92pJYxAgvXWyTccI/wkyVUKIvHAxwiyUK3e", "vWSAi");
        lIIIIIlIlI[lIIIIIlIll[3]] = llIlllIIlIIl("lijmqrtbqBI=", "aMQhD");
        lIIIIIlIlI[lIIIIIlIll[6]] = llIlllIIlIIl("kq79RbYMU/1K8kxZeqNqbQ==", "VoNyS");
        lIIIIIlIlI[lIIIIIlIll[7]] = llIlllIIlIIl("qI9mr5966G5sFiuourjiUgaTisd8fksH", "qVQfF");
        lIIIIIlIlI[lIIIIIlIll[10]] = llIlllIIlIIl("kLvDOFV7Kjqet8tccY8otsh0q2XqhPpoVrMU3y8uSUVM8R+cK7aGqtR1MsSAq+ebV1/Ck4GqVUY=", "RKdKX");
        lIIIIIlIlI[lIIIIIlIll[14]] = llIlllIIlIIl("SsYCZx+4bOB7RgUZ3d4jvQ==", "QigsG");
        lIIIIIlIlI[lIIIIIlIll[15]] = llIlllIlIlIl("ADIgCDg6KCZaPSYjMg4=", "SFAzL");
        lIIIIIlIlI[lIIIIIlIll[13]] = llIlllIlIlIl("Kj0LNwg=", "xRfRg");
        lIIIIIlIlI[lIIIIIlIll[16]] = llIlllIlIlII("ePHEmnZxgWQ=", "pATMx");
        lIIIIIlIlI[lIIIIIlIll[12]] = llIlllIIlIIl("PN3yb9CvLRaTnpJjIni3Zw==", "VjBFc");
        lIIIIIlIlI[lIIIIIlIll[17]] = llIlllIlIlIl("JBQJCnkEGkULLBwcABU=", "pueaY");
        lIIIIIlIlI[lIIIIIlIll[18]] = llIlllIlIlII("qA1RxaA+EkI=", "NuGav");
        lIIIIIlIlI[lIIIIIlIll[19]] = llIlllIIlIIl("C2y1+69XyCc=", "SqOqk");
        lIIIIIlIlI[lIIIIIlIll[21]] = llIlllIlIlII("s3dbF/PuJDyLXo0FAT3HIQ==", "Wrjwf");
        lIIIIIlIlI[lIIIIIlIll[22]] = llIlllIIlIIl("mQLRRZLLQIYlt/2O0kJ29A==", "vMSrf");
        lIIIIIlIlI[lIIIIIlIll[23]] = llIlllIlIlIl("OAMdEAM=", "jlpul");
        lIIIIIlIlI[lIIIIIlIll[25]] = llIlllIIlIIl("rXGBri/k9JWlogthFAtSxg==", "SfKnh");
        lIIIIIlIlI[lIIIIIlIll[26]] = llIlllIlIlII("icHII32mfk8FnkT5AJvN8g==", "NePJU");
        lIIIIIlIlI[lIIIIIlIll[27]] = llIlllIlIlIl("KzkeAiMfeCYLMR89BAkj", "mXjjF");
        lIIIIIlIlI[lIIIIIlIll[20]] = llIlllIlIlIl("BQcfbhMkRhkhEyIJB24APh8=", "KfiNg");
        lIIIIIlIlI[lIIIIIlIll[29]] = llIlllIlIlII("t561/tljLZqiSlPNSd+xWw==", "bEOdb");
        lIIIIIlIlI[lIIIIIlIll[30]] = llIlllIIlIIl("DaSpC1/LL6TMHvMKIxoqaA==", "OwRje");
        lIIIIIlIlI[lIIIIIlIll[31]] = llIlllIIlIIl("V49eNH/cn3xBTcASkcnB4g==", "fbxSp");
        lIIIIIlIlI[lIIIIIlIll[32]] = llIlllIIlIIl("gbo9NX6S6DZPlyDqSuVfr5u/oIf6mOt7", "ghRzT");
        lIIIIIlIlI[lIIIIIlIll[33]] = llIlllIIlIIl("wIbwTM4wkMc82M39tlugmQ==", "NnSQu");
        lIIIIIlIlI[lIIIIIlIll[34]] = llIlllIlIlIl("DSAJEm4JLhEQIRcy", "yAeyN");
        lIIIIIlIlI[lIIIIIlIll[35]] = llIlllIlIlII("mITNxsCII/LRsE11fO/HmA==", "fKSVm");
        lIIIIIlIlI[lIIIIIlIll[36]] = llIlllIlIlII("+nY+/jEpt7SulAivBQE3cQ==", "SwGfi");
        lIIIIIlIlI[lIIIIIlIll[37]] = llIlllIIlIIl("EKPMKmmpQP4=", "xAaeU");
        lIIIIIlIlI[lIIIIIlIll[24]] = llIlllIlIlII("wCDuIOadWDoM3hkWG2SJcQ==", "JvcnA");
        lIIIIIlIlI[lIIIIIlIll[38]] = llIlllIlIlIl("AAgDAlcgBk8DAjgACh0=", "Tioiw");
        lIIIIIlIlI[lIIIIIlIll[39]] = llIlllIlIlIl("OwACIw==", "tpgMt");
        lIIIIIlIlI[lIIIIIlIll[40]] = llIlllIlIlII("dQQLh8EL3Wg=", "IhZqR");
        lIIIIIlIlI[lIIIIIlIll[42]] = llIlllIlIlII("t3P6eoKM8ow2FA19jxnkpg==", "nbjRW");
        lIIIIIlIlI[lIIIIIlIll[43]] = llIlllIIlIIl("peN/OmEm6ELuxTSGzjfjnQ==", "fdZID");
        lIIIIIlIlI[lIIIIIlIll[44]] = llIlllIlIlII("eC17TM1uN28=", "jlDrd");
        lIIIIIlIlI[lIIIIIlIll[45]] = llIlllIIlIIl("c9JWf0xnLc5Yuhj/600/FQ==", "zJSnd");
        lIIIIIlIlI[lIIIIIlIll[46]] = llIlllIlIlII("lqEAVNuWH57V2YpRLJCvlpFMs3NMqc3N", "HvAGy");
        lIIIIIlIlI[lIIIIIlIll[47]] = llIlllIlIlII("n786+PI8d/vE/JqsGzppRtFQOOk3PoSYBZCk6pu1eshweRnzadz8YsgXbifmehWOte/GMYUUyz0=", "zQFyA");
        lIIIIIlIlI[lIIIIIlIll[28]] = llIlllIlIlII("2iI3a1h4QEeqrBi3BD0zqCnp5tWgNcyG", "cLAZx");
        lIIIIIlIlI[lIIIIIlIll[54]] = llIlllIIlIIl("9+l07BxNoOkPH7jdfMQlAb+8tl+d7jgW", "zYVYN");
        lIIIIIlIlI[lIIIIIlIll[55]] = llIlllIlIlIl("BTgmPw==", "AWIMR");
        lIIIIIlIlI[lIIIIIlIll[58]] = llIlllIIlIIl("HvxxXWkRW0Y=", "ulFUs");
        lIIIIIlIlI[lIIIIIlIll[59]] = llIlllIIlIIl("hy18WHx2mpc=", "aUABY");
        lIIIIIlIlI[lIIIIIlIll[60]] = llIlllIIlIIl("alYhvZAjNbc=", "KKHaG");
        lIIIIIlIlI[lIIIIIlIll[69]] = llIlllIlIlII("+85M6JHie7n9jyGaj/TeYCExtjFtMF+Zxz3ElIlIiF4=", "NskZm");
        lIIIIIlIlI[lIIIIIlIll[70]] = llIlllIlIlIl("Ng89QFMAAWJMOkgGIkwfCh5uBBYdSiUCHBhE", "ojNls");
        lIIIIIlIlI[lIIIIIlIll[71]] = llIlllIlIlIl("KjlNcDENMw87Nks=", "eRaPE");
        lIIIIIlIlI[lIIIIIlIll[72]] = llIlllIlIlII("Iisx1CKE1AP1otZrd7Fyng/lsoCYnTD+HLGH1v3J0Pw=", "TyrWN");
        lIIIIIlIlI[lIIIIIlIll[2]] = llIlllIIlIIl("yz5xlCWrVoMLycRjwgIVo6jLcpMGbTVeq+ezEGHgQPs=", "NxMeZ");
        lIIIIIlIlI[lIIIIIlIll[73]] = llIlllIlIlIl("PhxbZz8ZFhksOF8=", "qwwGK");
        lIIIIIlIlI[lIIIIIlIll[74]] = llIlllIIlIIl("2j+1KaI3oss=", "Ehesu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
        if (llIlllIllIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dL() {
        if (llIlllIllIII(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[0]];
            C0001b.a(bx);
            if (llIlllIllIIl(bx.size(), lIIIIIlIll[1])) {
                System.out.println(lIIIIIlIlI[lIIIIIlIll[1]]);
                bv = lIIIIIlIll[0];
            }
        }
        if (llIlllIllIlI(bv ? 1 : 0)) {
            if (llIlllIllIII(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlllIllIIl(Movement.getRunEnergy(), lIIIIIlIll[2])) {
                Inventory.getFirst(C0005f.bc).interact(lIIIIIlIlI[lIIIIIlIll[3]]);
                Time.sleepTicks(lIIIIIlIll[1]);
                "".length();
            }
            if (llIlllIllIlI(Movement.isRunEnabled() ? 1 : 0) && llIlllIllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIlllIllIII(an() ? 1 : 0)) {
                int[] iArr = new int[lIIIIIlIll[1]];
                iArr[lIIIIIlIll[0]] = lIIIIIlIll[4];
            }
            if (llIlllIllIIl(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIlllII(nearest) && llIlllIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIIIlIll[3]);
                    "".length();
                }
                if (llIlllIlllII(nearest) && llIlllIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[7]];
                    if (llIlllIllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIlIll[8]);
                        "".length();
                    }
                    if (llIlllIllIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIlllIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIlIll[7]);
                            "".length();
                        }
                        if (llIlllIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIlIll[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[lIIIIIlIll[1]];
                        iArr2[lIIIIIlIll[0]] = lIIIIIlIll[9];
                        if (llIlllIllIlI(C0004e.d(iArr2) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIIlIlI[lIIIIIlIll[10]]);
                            bv = lIIIIIlIll[1];
                            return;
                        }
                        int[] iArr3 = new int[lIIIIIlIll[1]];
                        iArr3[lIIIIIlIll[0]] = lIIIIIlIll[9];
                        if (llIlllIllIII(C0004e.d(iArr3) ? 1 : 0)) {
                            C0000a.a(lIIIIIlIll[9], lIIIIIlIll[1]);
                            C0000a.b(C0005f.bc, lIIIIIlIll[3]);
                            C0000a.a(lIIIIIlIll[11], lIIIIIlIll[12]);
                            C0000a.b(C0005f.bm, lIIIIIlIll[1]);
                        }
                    }
                }
            }
            if (llIlllIllIII(an() ? 1 : 0) && llIlllIllIIl(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[1])) {
                if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[14]];
                    if (llIlllIllIIl(cI, lIIIIIlIll[1])) {
                        C0004e.x();
                        cI += lIIIIIlIll[1];
                    }
                    Movement.walkTo(lI);
                    "".length();
                    Time.sleepTicks(lIIIIIlIll[1]);
                    "".length();
                }
                if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[15]];
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[13]], cG);
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[12])) {
                if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                    if (llIlllIllIII(Inventory.contains(C0005f.bm) ? 1 : 0) && llIlllIllIlI(Equipment.contains(C0005f.bm) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bm).interact(lIIIIIlIlI[lIIIIIlIll[16]]);
                        Time.sleepTicks(lIIIIIlIll[1]);
                        "".length();
                    }
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[12]];
                    Movement.walkTo(lJ);
                    "".length();
                    Time.sleepTicks(lIIIIIlIll[1]);
                    "".length();
                }
                if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (llIlllIllIII(tileObject.getName().contains(lIIIIIlIlI[lIIIIIlIll[59]]) ? 1 : 0) && llIlllIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIll[56], lIIIIIlIll[57], lIIIIIlIll[1])), lIIIIIlIll[3])) {
                            String[] strArr = new String[lIIIIIlIll[1]];
                            strArr[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[60]];
                            if (llIlllIllIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIIIIIlIll[1];
                                "".length();
                                return "   ".length() >= ((((154 + 77) - 128) + 80) ^ (((99 + 77) - 62) + 65)) ? (((26 ^ 0) & ((151 ^ 141) ^ (-1))) ^ (151 ^ 132)) & (("  ".length() ^ (84 ^ 69)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIIIIIlIll[0];
                    });
                    if (llIlllIlllII(nearest2)) {
                        nearest2.interact(lIIIIIlIlI[lIIIIIlIll[18]]);
                        Time.sleepTicks(lIIIIIlIll[6]);
                        "".length();
                    }
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[19]], cG);
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[20])) {
                if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[21]];
                    Movement.walkTo(lI);
                    "".length();
                    Time.sleepTicks(lIIIIIlIll[1]);
                    "".length();
                }
                if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[22]];
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[23]], cG);
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[24])) {
                if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lK), lIIIIIlIll[10])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[25]];
                    Movement.walkTo(lK);
                    "".length();
                    Time.sleepTicks(lIIIIIlIll[1]);
                    "".length();
                }
                if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lK), lIIIIIlIll[10])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[26]];
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[27]], cG);
                }
                C0006g.a(cG);
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[28])) {
                if (llIlllIllIlI(an() ? 1 : 0)) {
                    bm();
                }
                if (llIlllIllIII(an() ? 1 : 0)) {
                    if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[20]];
                        Movement.walkTo(lL);
                        "".length();
                        Time.sleepTicks(lIIIIIlIll[1]);
                        "".length();
                    }
                    if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[29]];
                        C0006g.a(lIIIIIlIlI[lIIIIIlIll[30]], cG);
                    }
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] strArr = new String[lIIIIIlIll[1]];
                strArr[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[31]];
                if (llIlllIllIlI(Inventory.contains(strArr) ? 1 : 0) && llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                    if (llIlllIllIlI(an() ? 1 : 0)) {
                        bm();
                    }
                    if (llIlllIllIII(an() ? 1 : 0) && llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[32]];
                        Movement.walkTo(lL);
                        "".length();
                        Time.sleepTicks(lIIIIIlIll[1]);
                        "".length();
                    }
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] strArr2 = new String[lIIIIIlIll[1]];
                strArr2[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[33]];
                if (llIlllIllIlI(Inventory.contains(strArr2) ? 1 : 0) && llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lL), lIIIIIlIll[10])) {
                    dk = lIIIIIlIll[0];
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[34]];
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[35]], cG);
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[2])) {
                String[] strArr3 = new String[lIIIIIlIll[1]];
                strArr3[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[36]];
                if (llIlllIllIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                        if (llIlllIllIII(Inventory.contains(C0005f.bm) ? 1 : 0) && llIlllIllIlI(Equipment.contains(C0005f.bm) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.bm).interact(lIIIIIlIlI[lIIIIIlIll[37]]);
                            Time.sleepTicks(lIIIIIlIll[1]);
                            "".length();
                        }
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[24]];
                        Movement.walkTo(lJ);
                        "".length();
                        Time.sleepTicks(lIIIIIlIll[1]);
                        "".length();
                    }
                    if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lJ), lIIIIIlIll[3])) {
                        AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[38]];
                        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                            if (llIlllIllIII(tileObject2.getName().contains(lIIIIIlIlI[lIIIIIlIll[55]]) ? 1 : 0) && llIlllIllllI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIll[56], lIIIIIlIll[57], lIIIIIlIll[1])), lIIIIIlIll[3])) {
                                String[] strArr4 = new String[lIIIIIlIll[1]];
                                strArr4[lIIIIIlIll[0]] = lIIIIIlIlI[lIIIIIlIll[58]];
                                if (llIlllIllIII(tileObject2.hasAction(strArr4) ? 1 : 0)) {
                                    ?? r0 = lIIIIIlIll[1];
                                    "".length();
                                    return (((((73 + 114) - 69) + 26) ^ (((34 + 28) - 20) + 121)) & (((62 ^ 106) ^ (224 ^ 135)) ^ (-" ".length()))) > (((188 ^ 175) ^ (47 ^ 6)) & (((48 ^ 52) ^ (186 ^ 132)) ^ (-" ".length()))) ? ((175 ^ 171) ^ (13 ^ 61)) & (((237 ^ 192) ^ (18 ^ 11)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIIIIlIll[0];
                        });
                        if (llIlllIlllII(nearest3)) {
                            nearest3.interact(lIIIIIlIlI[lIIIIIlIll[39]]);
                            Time.sleepTicks(lIIIIIlIll[6]);
                            "".length();
                        }
                        C0006g.a(lIIIIIlIlI[lIIIIIlIll[40]], cG);
                    }
                    C0006g.a(cG);
                }
            }
            if (llIlllIlllll(C0004e.j(lIIIIIlIll[5]), lIIIIIlIll[41])) {
                if (llIlllIlllIl(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13]) && llIlllIllIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[42]];
                    Movement.walkTo(lI);
                    "".length();
                    Time.sleepTicks(lIIIIIlIll[1]);
                    "".length();
                }
                if (llIlllIllllI(Players.getLocal().getWorldLocation().distanceTo(lI), lIIIIIlIll[13])) {
                    AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[43]];
                    if (llIlllIllIIl(dk, lIIIIIlIll[1])) {
                        as.pO += lIIIIIlIll[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIIlIll[1];
                        as.pO = lIIIIIlIll[0];
                        dl = lIIIIIlIll[0];
                    }
                    C0006g.a(lIIIIIlIlI[lIIIIIlIll[44]], cG);
                    Time.sleepTicks(lIIIIIlIll[10]);
                    "".length();
                }
            }
            C0006g.a(cG);
            System.out.println("Setting: " + C0004e.j(lIIIIIlIll[5]));
        }
    }

    private static boolean an() {
        int[] iArr = new int[lIIIIIlIll[1]];
        iArr[lIIIIIlIll[0]] = lIIIIIlIll[9];
        return Inventory.contains(iArr);
    }

    private static boolean llIlllIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIlllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlllIlllII(nearest) && llIlllIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[45]];
            C0000a.a(nearest);
            Time.sleepTicks(lIIIIIlIll[3]);
            "".length();
        }
        if (llIlllIlllII(nearest) && llIlllIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlIlI[lIIIIIlIll[46]];
            if (llIlllIllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIIlIll[8]);
                "".length();
            }
            if (llIlllIllIII(Bank.isOpen() ? 1 : 0)) {
                if (llIlllIllIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIIlIll[7]);
                    "".length();
                }
                if (llIlllIllIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIIIlIll[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIIIlIll[1]];
                iArr[lIIIIIlIll[0]] = lIIIIIlIll[9];
                if (llIlllIllIlI(C0004e.d(iArr) ? 1 : 0)) {
                    Q();
                    System.out.println(lIIIIIlIlI[lIIIIIlIll[47]]);
                    bv = lIIIIIlIll[1];
                    return;
                }
                int[] iArr2 = new int[lIIIIIlIll[1]];
                iArr2[lIIIIIlIll[0]] = lIIIIIlIll[9];
                if (llIlllIllIII(C0004e.d(iArr2) ? 1 : 0)) {
                    C0000a.a(lIIIIIlIll[9], lIIIIIlIll[1]);
                    C0000a.b(C0005f.bc, lIIIIIlIll[3]);
                    C0000a.a(lIIIIIlIll[11], lIIIIIlIll[12]);
                    C0000a.b(C0005f.bm, lIIIIIlIll[1]);
                }
            }
        }
    }

    private static void llIlllIlIlll() {
        lIIIIIlIll = new int[76];
        lIIIIIlIll[0] = (51 ^ 80) & ((71 ^ 36) ^ (-1));
        lIIIIIlIll[1] = " ".length();
        lIIIIIlIll[2] = 143 ^ 189;
        lIIIIIlIll[3] = "  ".length();
        lIIIIIlIll[4] = (-10261) & 11255;
        lIIIIIlIll[5] = (((240 ^ 147) + (116 ^ 81)) - (67 ^ 21)) + (209 ^ 143);
        lIIIIIlIll[6] = "   ".length();
        lIIIIIlIll[7] = (29 ^ 55) ^ (61 ^ 19);
        lIIIIIlIll[8] = (-((-20882) & 30199)) & (-18449) & 32765;
        lIIIIIlIll[9] = (-27659) & 28411;
        lIIIIIlIll[10] = 139 ^ 142;
        lIIIIIlIll[11] = (-16553) & 24559;
        lIIIIIlIll[12] = (211 ^ 177) ^ (99 ^ 11);
        lIIIIIlIll[13] = 166 ^ 174;
        lIIIIIlIll[14] = 165 ^ 163;
        lIIIIIlIll[15] = (((21 + 4) - (-75)) + 38) ^ (((23 + 135) - 64) + 47);
        lIIIIIlIll[16] = (155 ^ 130) ^ (146 ^ 130);
        lIIIIIlIll[17] = 148 ^ 159;
        lIIIIIlIll[18] = 148 ^ 152;
        lIIIIIlIll[19] = 62 ^ 51;
        lIIIIIlIll[20] = (((24 + 85) - 99) + 137) ^ (((83 + 35) - 106) + 123);
        lIIIIIlIll[21] = (240 ^ 140) ^ (115 ^ 1);
        lIIIIIlIll[22] = 130 ^ 141;
        lIIIIIlIll[23] = (244 ^ 181) ^ (203 ^ 154);
        lIIIIIlIll[24] = (2 ^ 21) ^ (111 ^ 102);
        lIIIIIlIll[25] = 132 ^ 149;
        lIIIIIlIll[26] = 80 ^ 66;
        lIIIIIlIll[27] = 52 ^ 39;
        lIIIIIlIll[28] = (((145 + 155) - 278) + 146) ^ (((53 + 37) - (-16)) + 22);
        lIIIIIlIll[29] = (105 ^ 78) ^ (165 ^ 151);
        lIIIIIlIll[30] = 110 ^ 120;
        lIIIIIlIll[31] = 37 ^ 50;
        lIIIIIlIll[32] = (((3 + 172) - 30) + 46) ^ (((165 + 61) - 82) + 23);
        lIIIIIlIll[33] = 140 ^ 149;
        lIIIIIlIll[34] = (123 ^ 101) ^ (6 ^ 2);
        lIIIIIlIll[35] = 140 ^ 151;
        lIIIIIlIll[36] = 86 ^ 74;
        lIIIIIlIll[37] = 132 ^ 153;
        lIIIIIlIll[38] = (113 ^ 105) ^ (159 ^ 152);
        lIIIIIlIll[39] = (50 ^ 5) ^ (160 ^ 183);
        lIIIIIlIll[40] = (44 ^ 5) ^ (22 ^ 30);
        lIIIIIlIll[41] = 11 ^ 55;
        lIIIIIlIll[42] = 134 ^ 164;
        lIIIIIlIll[43] = (((99 + 69) - 69) + 36) ^ (((102 + 0) - 11) + 73);
        lIIIIIlIll[44] = 99 ^ 71;
        lIIIIIlIll[45] = 161 ^ 132;
        lIIIIIlIll[46] = 117 ^ 83;
        lIIIIIlIll[47] = 108 ^ 75;
        lIIIIIlIll[48] = (-((-833) & 4079)) & (-16897) & 32767;
        lIIIIIlIll[49] = (-24724) & 30623;
        lIIIIIlIll[50] = (-1) & 11980;
        lIIIIIlIll[51] = (-2129) & 27128;
        lIIIIIlIll[52] = (-((-3013) & 11222)) & (-22659) & 32767;
        lIIIIIlIll[53] = 6 ^ 98;
        lIIIIIlIll[54] = (((125 + 146) - 187) + 69) ^ (((100 + 94) - 18) + 0);
        lIIIIIlIll[55] = 73 ^ 99;
        lIIIIIlIll[56] = (-((-1619) & 30683)) & (-33) & 32254;
        lIIIIIlIll[57] = (-((-14371) & 31411)) & (-8198) & 28663;
        lIIIIIlIll[58] = 107 ^ 64;
        lIIIIIlIll[59] = 4 ^ 40;
        lIIIIIlIll[60] = 39 ^ 10;
        lIIIIIlIll[61] = (-12547) & 15758;
        lIIIIIlIll[62] = (-((-2049) & 26647)) & (-4609) & 32630;
        lIIIIIlIll[63] = (-28833) & 31989;
        lIIIIIlIll[64] = (-16529) & 19953;
        lIIIIIlIll[65] = (-25409) & 28663;
        lIIIIIlIll[66] = (-20996) & 24479;
        lIIIIIlIll[67] = (-((-24681) & 29289)) & (-8321) & 16123;
        lIIIIIlIll[68] = (-20658) & 24061;
        lIIIIIlIll[69] = (((23 + 66) - 79) + 173) ^ (((152 + 2) - 105) + 104);
        lIIIIIlIll[70] = (72 ^ 114) ^ (112 ^ 101);
        lIIIIIlIll[71] = (66 ^ 38) ^ (101 ^ 49);
        lIIIIIlIll[72] = (((94 + 79) - 159) + 155) ^ (((65 + 99) - 127) + 115);
        lIIIIIlIll[73] = 106 ^ 89;
        lIIIIIlIll[74] = 136 ^ 188;
        lIIIIIlIll[75] = (((35 + 4) - (-115)) + 6) ^ (((17 + 48) - (-22)) + 62);
    }
}
