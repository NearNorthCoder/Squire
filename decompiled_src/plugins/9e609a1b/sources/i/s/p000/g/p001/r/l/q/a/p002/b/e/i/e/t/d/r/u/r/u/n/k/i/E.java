package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.E  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/E.class */
public class E implements M {
    static /* synthetic */ int bY;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ WorldPoint hj;
    private static /* synthetic */ int[] lIIIllllIIllI;
    private static /* synthetic */ String[] lIIIllllIIlIl;
    private static final /* synthetic */ WorldPoint hg;
    public static final /* synthetic */ String[] hf;
    private static final /* synthetic */ WorldPoint hi;
    private static final /* synthetic */ WorldPoint hh;
    public static /* synthetic */ boolean by;

    static {
        lIlIIlIlIllIllI();
        lIlIIlIlIllIlIl();
        String[] strArr = new String[lIIIllllIIllI[23]];
        strArr[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[54]];
        strArr[lIIIllllIIllI[1]] = lIIIllllIIlIl[lIIIllllIIllI[55]];
        strArr[lIIIllllIIllI[3]] = lIIIllllIIlIl[lIIIllllIIllI[56]];
        strArr[lIIIllllIIllI[5]] = lIIIllllIIlIl[lIIIllllIIllI[57]];
        strArr[lIIIllllIIllI[7]] = lIIIllllIIlIl[lIIIllllIIllI[58]];
        strArr[lIIIllllIIllI[8]] = lIIIllllIIlIl[lIIIllllIIllI[59]];
        strArr[lIIIllllIIllI[14]] = lIIIllllIIlIl[lIIIllllIIllI[60]];
        strArr[lIIIllllIIllI[20]] = lIIIllllIIlIl[lIIIllllIIllI[61]];
        strArr[lIIIllllIIllI[18]] = lIIIllllIIlIl[lIIIllllIIllI[62]];
        strArr[lIIIllllIIllI[21]] = lIIIllllIIlIl[lIIIllllIIllI[63]];
        strArr[lIIIllllIIllI[15]] = lIIIllllIIlIl[lIIIllllIIllI[64]];
        strArr[lIIIllllIIllI[19]] = lIIIllllIIlIl[lIIIllllIIllI[65]];
        strArr[lIIIllllIIllI[22]] = lIIIllllIIlIl[lIIIllllIIllI[66]];
        hf = strArr;
        hg = new WorldPoint(lIIIllllIIllI[16], lIIIllllIIllI[67], lIIIllllIIllI[0]);
        hh = new WorldPoint(lIIIllllIIllI[68], lIIIllllIIllI[69], lIIIllllIIllI[0]);
        hi = new WorldPoint(lIIIllllIIllI[70], lIIIllllIIllI[71], lIIIllllIIllI[0]);
        hj = new WorldPoint(lIIIllllIIllI[72], lIIIllllIIllI[73], lIIIllllIIllI[0]);
        bA = new ArrayList();
        bY = lIIIllllIIllI[0];
    }

    private static boolean lIlIIlIlIllllII(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlIlIlllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIlIlIllIlII(String lllllllllllllllIIIIIIlllllIIIlII, String lllllllllllllllIIIIIIlllllIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlllllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIlllllIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIlllllIIIllI.init(lIIIllllIIllI[3], lllllllllllllllIIIIIIlllllIIIlll);
            return new String(lllllllllllllllIIIIIIlllllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIlllllIIIlIl) {
            lllllllllllllllIIIIIIlllllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIllIIll(String lllllllllllllllIIIIIIllllIIlllll, String lllllllllllllllIIIIIIllllIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllllIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIllllIIllI[18]), "DES");
            Cipher lllllllllllllllIIIIIIllllIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIllllIlIIIIl.init(lIIIllllIIllI[3], secretKeySpec);
            return new String(lllllllllllllllIIIIIIllllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIllllIlIIIII) {
            lllllllllllllllIIIIIIllllIlIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIllllIIllI[1]];
        iArr[lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (lIlIIlIlIlllIII(Inventory.contains(iArr) ? 1 : 0) && ((!lIlIIlIlIlllIlI(Inventory.contains(C0005f.aW) ? 1 : 0) || lIlIIlIlIlllIII(Equipment.contains(C0005f.aW) ? 1 : 0)) && lIlIIlIlIlllIII(Inventory.contains(C0005f.ba) ? 1 : 0))) {
            int[] iArr2 = new int[lIIIllllIIllI[1]];
            iArr2[lIIIllllIIllI[0]] = lIIIllllIIllI[13];
            if (lIlIIlIlIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllIIllI[1]];
                iArr3[lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (lIlIIlIlIlllIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIIllllIIllI[1];
                    "".length();
                    return (19 ^ 23) < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIllllIIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIllIIIIlI(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[8])) {
            ?? r0 = lIIIllllIIllI[1];
            "".length();
            return "   ".length() < "   ".length() ? ((185 ^ 159) ^ (246 ^ 155)) & (((202 ^ 148) ^ (10 ^ 31)) ^ (-" ".length())) & ((((((190 + 56) - 138) + 142) ^ (((62 + 81) - 141) + 161)) & (((227 ^ 159) ^ (106 ^ 79)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
        }
        return lIIIllllIIllI[0];
    }

    private static boolean lIlIIlIlIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIllIIIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIllIIIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIllIIIIlI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlIlIlllIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIlIllllll(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIlIlIllIIlI(String lllllllllllllllIIIIIIllllIllIlII, String lllllllllllllllIIIIIIllllIllIIll) {
        String lllllllllllllllIIIIIIllllIllIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIllllIllIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIIllllIllIIll.toCharArray();
        int lllllllllllllllIIIIIIllllIllIIII = lIIIllllIIllI[0];
        char[] charArray2 = lllllllllllllllIIIIIIllllIllIlII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIllllIIllI[0];
        while (lIlIIlIlIlllIIl(i2, length)) {
            char lllllllllllllllIIIIIIllllIllIlIl = charArray2[i2];
            lllllllllllllllIIIIIIllllIllIIlI.append((char) (lllllllllllllllIIIIIIllllIllIlIl ^ charArray[lllllllllllllllIIIIIIllllIllIIII % charArray.length]));
            "".length();
            lllllllllllllllIIIIIIllllIllIIII++;
            i2++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIIllllIllIIlI);
    }

    private static void lIlIIlIlIllIlIl() {
        lIIIllllIIlIl = new String[lIIIllllIIllI[74]];
        lIIIllllIIlIl[lIIIllllIIllI[0]] = lIlIIlIlIllIIlI("FwA3MAIyVSctCTgG", "UuNYl");
        lIIIllllIIlIl[lIIIllllIIllI[1]] = lIlIIlIlIllIIlI("MSEWJisfLRxvOgIxESE/VyEMKjUEZFg8Lx48GycxGS9YLTkUI1g7N1c5DSorAw==", "wHxOX");
        lIIIllllIIlIl[lIIIllllIIllI[3]] = lIlIIlIlIllIIll("q9Rxn8RFD54=", "ineTi");
        lIIIllllIIlIl[lIIIllllIIllI[5]] = lIlIIlIlIllIlII("gl95HcS+Rgk=", "gfWEl");
        lIIIllllIIlIl[lIIIllllIIllI[7]] = lIlIIlIlIllIIlI("IyMYTR0CYgwMBwY=", "mBnmi");
        lIIIllllIIlIl[lIIIllllIIllI[8]] = lIlIIlIlIllIIlI("GBgiPg45Fyt6ADEXJzMMNw==", "PyLZb");
        lIIIllllIIlIl[lIIIllllIIllI[14]] = lIlIIlIlIllIlII("QXmQdQumt6ajkI4zUbABcX508btC/IV3n1OIAvGF7wFW47xLcXtMR52ndkQWl4zNNZ8hSwhVVKA=", "TOPGx");
        lIIIllllIIlIl[lIIIllllIIllI[20]] = lIlIIlIlIllIlII("h4j6ZebXbKflL0GQCIimaQ==", "sTgBm");
        lIIIllllIIlIl[lIIIllllIIllI[18]] = lIlIIlIlIllIlII("wWcPz6ZH/fz7d87hx6tuuA==", "izvSn");
        lIIIllllIIlIl[lIIIllllIIllI[21]] = lIlIIlIlIllIIll("4+3F7jW/sOYE6VqSRg2FZQ==", "lWvjG");
        lIIIllllIIlIl[lIIIllllIIllI[15]] = lIlIIlIlIllIlII("FRvRWxK9RwhCR0G7guvUwg==", "pRRsL");
        lIIIllllIIlIl[lIIIllllIIllI[19]] = lIlIIlIlIllIlII("FqtPsMWcV0DnRgqxmYScyokR4RVjTNOe", "yfEVD");
        lIIIllllIIlIl[lIIIllllIIllI[22]] = lIlIIlIlIllIIll("jSuBrQ0ft6bVtQOGjxnpug==", "JdPdi");
        lIIIllllIIlIl[lIIIllllIIllI[23]] = lIlIIlIlIllIlII("/nxorBTSAtc=", "OgLwX");
        lIIIllllIIlIl[lIIIllllIIllI[24]] = lIlIIlIlIllIIll("6knAMrrFx80=", "ZsFBs");
        lIIIllllIIlIl[lIIIllllIIllI[25]] = lIlIIlIlIllIIlI("BAcfKw==", "KwzEI");
        lIIIllllIIlIl[lIIIllllIIllI[26]] = lIlIIlIlIllIIll("U1mVhhl0f7ie2V0OZzax0g==", "TngKk");
        lIIIllllIIlIl[lIIIllllIIllI[28]] = lIlIIlIlIllIIll("Zu7u4nFnZt8=", "eCoHB");
        lIIIllllIIlIl[lIIIllllIIllI[29]] = lIlIIlIlIllIlII("8Dq2e9divxq6nI0xV6dQHw==", "YZZgo");
        lIIIllllIIlIl[lIIIllllIIllI[30]] = lIlIIlIlIllIlII("fePfTWNLBpGcCigxZht+1Q==", "RTQEK");
        lIIIllllIIlIl[lIIIllllIIllI[31]] = lIlIIlIlIllIIll("iN1oVi9QT85SM7xeo7AHRA==", "LWwwm");
        lIIIllllIIlIl[lIIIllllIIllI[32]] = lIlIIlIlIllIIll("a9PrZnmtkf7SNEgJgxRCNg==", "HiLOI");
        lIIIllllIIlIl[lIIIllllIIllI[33]] = lIlIIlIlIllIIlI("OQkcLj0U", "zfzHT");
        lIIIllllIIlIl[lIIIllllIIllI[34]] = lIlIIlIlIllIlII("ghji0s4yyMg=", "mSDOW");
        lIIIllllIIlIl[lIIIllllIIllI[35]] = lIlIIlIlIllIlII("TK1O9vUVBlm4qPtUZmSb7g==", "LTUCD");
        lIIIllllIIlIl[lIIIllllIIllI[36]] = lIlIIlIlIllIlII("KYhLRlruVQOsLS45q14VQw==", "jylgq");
        lIIIllllIIlIl[lIIIllllIIllI[37]] = lIlIIlIlIllIIlI("LgInOAI=", "onSYp");
        lIIIllllIIlIl[lIIIllllIIllI[38]] = lIlIIlIlIllIIlI("CigRNjox", "YMpDY");
        lIIIllllIIlIl[lIIIllllIIllI[39]] = lIlIIlIlIllIlII("YCbwcX/rN8w=", "EfuCa");
        lIIIllllIIlIl[lIIIllllIIllI[40]] = lIlIIlIlIllIIlI("OjY7SzEbdy4EIxI+Iw==", "tWMkE");
        lIIIllllIIlIl[lIIIllllIIllI[41]] = lIlIIlIlIllIlII("hryto2efngXHIUbK6dq+Xw==", "uLXPr");
        lIIIllllIIlIl[lIIIllllIIllI[42]] = lIlIIlIlIllIlII("FXbbKysh2rA=", "BMxcM");
        lIIIllllIIlIl[lIIIllllIIllI[43]] = lIlIIlIlIllIlII("5SKOrSQuMUM=", "jMfqX");
        lIIIllllIIlIl[lIIIllllIIllI[44]] = lIlIIlIlIllIIll("EJk6xsIEOS0=", "Wbooa");
        lIIIllllIIlIl[lIIIllllIIllI[45]] = lIlIIlIlIllIlII("A8zntLsT8zDp4oOvw3akeQ==", "anNnh");
        lIIIllllIIlIl[lIIIllllIIllI[52]] = lIlIIlIlIllIIlI("EQgbHBQmHhtIHysCGxxYMhgNGww=", "Cmhhx");
        lIIIllllIIlIl[lIIIllllIIllI[53]] = lIlIIlIlIllIlII("gg1ufmDp/cojNrD7LsAtpANk/F8v2VVJ", "KKaNp");
        lIIIllllIIlIl[lIIIllllIIllI[54]] = lIlIIlIlIllIIll("dNvZe/IQbAlm7XL70o+PXb0qu7Yzp9p29mL2MECS53c=", "oXSyU");
        lIIIllllIIlIl[lIIIllllIIllI[55]] = lIlIIlIlIllIIll("YwomfIsbbnISyIRZadN2VqYLJVdsm+mppcZRPqz+lhke/fbay6T4Nw==", "izDXy");
        lIIIllllIIlIl[lIIIllllIIllI[56]] = lIlIIlIlIllIlII("2/0QrGbAkoYM6l+js2qhRnxBTY6Zfqbm", "UjEXN");
        lIIIllllIIlIl[lIIIllllIIllI[57]] = lIlIIlIlIllIIll("3Tq6zx9akA4=", "WOZOj");
        lIIIllllIIlIl[lIIIllllIIllI[58]] = lIlIIlIlIllIlII("jWM2r5KZ4ewvYmESaP3svAJ0djIciANtSdN9bARu6N8=", "NBiVt");
        lIIIllllIIlIl[lIIIllllIIllI[59]] = lIlIIlIlIllIIlI("Nx5ZWScdAVUULlgdEBU7WAEdHCVW", "xuuyK");
        lIIIllllIIlIl[lIIIllllIIllI[60]] = lIlIIlIlIllIIlI("DCkgCwY4aBUGES8rP0MQLyYgQw4vaCAMQz4pOAhDPid0Ggw/Zg==", "JHTcc");
        lIIIllllIIlIl[lIIIllllIIllI[61]] = lIlIIlIlIllIIlI("OBJWHkUXGAVNBFAQGQIWBFcZDBAeAxgDAlAfGB5FFwUQGwAJFgMJSw==", "pwqme");
        lIIIllllIIlIl[lIIIllllIIllI[62]] = lIlIIlIlIllIIlI("OysoW2UMIS9XMQciNFcoB24vHyQWbiwfIEI+KhgnDis1VywRYA==", "bNXwE");
        lIIIllllIIlIl[lIIIllllIIllI[63]] = lIlIIlIlIllIIlI("Pj0GEkk=", "mHtwg");
        lIIIllllIIlIl[lIIIllllIIllI[64]] = lIlIIlIlIllIIlI("OE87VhQUCSQfDRZINxhDEAUjGgYFSDkQQxYAOQUXURsmEwIaSQ==", "qhVvc");
        lIIIllllIIlIl[lIIIllllIIllI[65]] = lIlIIlIlIllIIlI("MSsyWVQhaSxVBx08JFs=", "hNAut");
        lIIIllllIIlIl[lIIIllllIIllI[66]] = lIlIIlIlIllIlII("2slisWn3BU/9IzttrYutrw==", "JVBHc");
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIllllIIlIl[lIIIllllIIllI[52]];
    }

    private static void W() {
        int[] iArr = new int[lIIIllllIIllI[1]];
        iArr[lIIIllllIIllI[0]] = lIIIllllIIllI[10];
        if (lIlIIlIlIlllIlI(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[10], lIIIllllIIllI[1], lIIIllllIIllI[46]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllllIIllI[1]];
        iArr2[lIIIllllIIllI[0]] = lIIIllllIIllI[4];
        if (lIlIIlIlIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[4], lIIIllllIIllI[15], lIIIllllIIllI[47]));
            "".length();
        }
        if (lIlIIlIlIlllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllllIIlIl[lIIIllllIIllI[53]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[48], lIIIllllIIllI[8], lIIIllllIIllI[49]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllllIIllI[1]];
        iArr3[lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (lIlIIlIlIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[11], lIIIllllIIllI[15], lIIIllllIIllI[50]));
            "".length();
        }
        int[] iArr4 = new int[lIIIllllIIllI[1]];
        iArr4[lIIIllllIIllI[0]] = lIIIllllIIllI[13];
        if (lIlIIlIlIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[13], lIIIllllIIllI[31], lIIIllllIIllI[50]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllIIllI[1]];
        iArr5[lIIIllllIIllI[0]] = lIIIllllIIllI[12];
        if (lIlIIlIlIlllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIllI[12], lIIIllllIIllI[8], C0007h.bv));
            "".length();
        }
    }

    private static boolean lIlIIlIlIlllIll(int i2) {
        return i2 < 0;
    }

    private static int lIlIIlIlIllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIlIlIlllllI(Object obj) {
        return obj == null;
    }

    private static void lIlIIlIlIllIllI() {
        lIIIllllIIllI = new int[75];
        lIIIllllIIllI[0] = ((83 ^ 59) ^ (35 ^ 100)) & (((217 ^ 188) ^ (71 ^ 13)) ^ (-" ".length()));
        lIIIllllIIllI[1] = " ".length();
        lIIIllllIIllI[2] = 92 ^ 26;
        lIIIllllIIllI[3] = "  ".length();
        lIIIllllIIllI[4] = (-21637) & 22015;
        lIIIllllIIllI[5] = "   ".length();
        lIIIllllIIllI[6] = (220 ^ 146) ^ (65 ^ 100);
        lIIIllllIIllI[7] = 154 ^ 158;
        lIIIllllIIllI[8] = (204 ^ 135) ^ (62 ^ 112);
        lIIIllllIIllI[9] = (-1058) & 6057;
        lIIIllllIIllI[10] = (-((-2889) & 23373)) & (-306) & 32767;
        lIIIllllIIllI[11] = (-8327) & 16334;
        lIIIllllIIllI[12] = (-1067) & 13691;
        lIIIllllIIllI[13] = (-(((27 + 23) - (-22)) + 73)) & (-8233) & 16383;
        lIIIllllIIllI[14] = (5 ^ 88) ^ (255 ^ 164);
        lIIIllllIIllI[15] = 53 ^ 63;
        lIIIllllIIllI[16] = (-(63 ^ 57)) & (-8705) & 11949;
        lIIIllllIIllI[17] = (-8713) & 11916;
        lIIIllllIIllI[18] = (232 ^ 164) ^ (94 ^ 26);
        lIIIllllIIllI[19] = (132 ^ 181) ^ (67 ^ 121);
        lIIIllllIIllI[20] = (113 ^ 3) ^ (233 ^ 156);
        lIIIllllIIllI[21] = 157 ^ 148;
        lIIIllllIIllI[22] = 65 ^ 77;
        lIIIllllIIllI[23] = (168 ^ 132) ^ (32 ^ 1);
        lIIIllllIIllI[24] = 95 ^ 81;
        lIIIllllIIllI[25] = (205 ^ 141) ^ (122 ^ 53);
        lIIIllllIIllI[26] = 9 ^ 25;
        lIIIllllIIllI[27] = (-((-9763) & 32679)) & (-1044) & 24511;
        lIIIllllIIllI[28] = (((136 + 8) - 53) + 49) ^ (((4 + 156) - 76) + 73);
        lIIIllllIIllI[29] = 99 ^ 113;
        lIIIllllIIllI[30] = (43 ^ 123) ^ (130 ^ 193);
        lIIIllllIIllI[31] = 116 ^ 96;
        lIIIllllIIllI[32] = 172 ^ 185;
        lIIIllllIIllI[33] = 148 ^ 130;
        lIIIllllIIllI[34] = (((141 + 38) - 96) + 67) ^ (((98 + 34) - 30) + 27);
        lIIIllllIIllI[35] = (((98 + 78) - 76) + 48) ^ (((105 + 112) - 155) + 78);
        lIIIllllIIllI[36] = 59 ^ 34;
        lIIIllllIIllI[37] = 44 ^ 54;
        lIIIllllIIllI[38] = 174 ^ 181;
        lIIIllllIIllI[39] = 95 ^ 67;
        lIIIllllIIllI[40] = (35 ^ 4) ^ (71 ^ 125);
        lIIIllllIIllI[41] = (((84 + 130) - 188) + 114) ^ (((49 + 105) - 110) + 102);
        lIIIllllIIllI[42] = (53 ^ 117) ^ (206 ^ 145);
        lIIIllllIIllI[43] = (208 ^ 137) ^ (36 ^ 93);
        lIIIllllIIllI[44] = 145 ^ 176;
        lIIIllllIIllI[45] = (109 ^ 71) ^ (163 ^ 171);
        lIIIllllIIllI[46] = (-354) & 16253;
        lIIIllllIIllI[47] = (-((-6733) & 31342)) & (-2243) & 32751;
        lIIIllllIIllI[48] = (-16691) & 28670;
        lIIIllllIIllI[49] = (-4104) & 29103;
        lIIIllllIIllI[50] = (-((-895) & 13183)) & (-2050) & 16237;
        lIIIllllIIllI[51] = (((88 + 57) - 79) + 173) ^ (((46 + 100) - 59) + 52);
        lIIIllllIIllI[52] = 171 ^ 136;
        lIIIllllIIllI[53] = 188 ^ 152;
        lIIIllllIIllI[54] = 167 ^ 130;
        lIIIllllIIllI[55] = 228 ^ 194;
        lIIIllllIIllI[56] = (((148 + 110) - 243) + 169) ^ (((99 + 7) - (-1)) + 52);
        lIIIllllIIllI[57] = 144 ^ 184;
        lIIIllllIIllI[58] = 170 ^ 131;
        lIIIllllIIllI[59] = 100 ^ 78;
        lIIIllllIIllI[60] = 80 ^ 123;
        lIIIllllIIllI[61] = (108 ^ 54) ^ (182 ^ 192);
        lIIIllllIIllI[62] = (((51 + 26) - (-26)) + 43) ^ (((167 + 150) - 245) + 119);
        lIIIllllIIllI[63] = (((1 + 144) - 8) + 15) ^ (((70 + 100) - 105) + 117);
        lIIIllllIIllI[64] = (70 ^ 104) ^ " ".length();
        lIIIllllIIllI[65] = (((50 + 135) - 168) + 130) ^ (((3 + 27) - (-128)) + 5);
        lIIIllllIIllI[66] = 162 ^ 147;
        lIIIllllIIllI[67] = (-53) & 3262;
        lIIIllllIIllI[68] = (-29205) & 32350;
        lIIIllllIIllI[69] = (-28677) & 31852;
        lIIIllllIIllI[70] = (-20545) & 23793;
        lIIIllllIIllI[71] = (-((-21506) & 21891)) & (-20481) & 24059;
        lIIIllllIIllI[72] = (-29265) & 32382;
        lIIIllllIIllI[73] = (-16417) & 25982;
        lIIIllllIIllI[74] = (91 ^ 104) ^ " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void ck() {
        if (lIlIIlIlIlllIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[0]];
            C0001b.a(bA);
            if (lIlIIlIlIlllIIl(bA.size(), lIIIllllIIllI[1])) {
                System.out.println(lIIIllllIIlIl[lIIIllllIIllI[1]]);
                by = lIIIllllIIllI[0];
            }
        }
        if (lIlIIlIlIlllIlI(by ? 1 : 0)) {
            if (lIlIIlIlIlllIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIlIlllIIl(Movement.getRunEnergy(), lIIIllllIIllI[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIllllIIlIl[lIIIllllIIllI[3]]);
                Time.sleepTicks(lIIIllllIIllI[1]);
                "".length();
            }
            if (lIlIIlIlIlllIll(lIlIIlIlIllIlll(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIIIllllIIllI[1]];
                iArr[lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (lIlIIlIlIlllIII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllIIllI[1]];
                    iArr2[lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                    Inventory.getFirst(iArr2).interact(lIIIllllIIlIl[lIIIllllIIllI[5]]);
                }
            }
            if (lIlIIlIlIlllIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIlIllllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlIlIlllIlI(S() ? 1 : 0) && lIlIIlIlIlllIIl(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlIllllIl(nearest) && lIlIIlIlIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIllllIIllI[3]);
                    "".length();
                }
                if (lIlIIlIlIllllIl(nearest) && lIlIIlIlIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[8]];
                    if (lIlIIlIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllIIllI[9]);
                        "".length();
                    }
                    if (lIlIIlIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlIllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllIIllI[7]);
                            "".length();
                        }
                        if (lIlIIlIlIllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllIIllI[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIIllllIIllI[8]];
                        iArr3[lIIIllllIIllI[0]] = lIIIllllIIllI[10];
                        iArr3[lIIIllllIIllI[1]] = lIIIllllIIllI[11];
                        iArr3[lIIIllllIIllI[3]] = lIIIllllIIllI[12];
                        iArr3[lIIIllllIIllI[5]] = lIIIllllIIllI[13];
                        iArr3[lIIIllllIIllI[7]] = lIIIllllIIllI[4];
                        if (lIlIIlIlIlllIlI(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIllllIIlIl[lIIIllllIIllI[14]]);
                            by = lIIIllllIIllI[1];
                            return;
                        }
                        Bank.withdraw(lIIIllllIIllI[11], lIIIllllIIllI[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIllI[13], lIIIllllIIllI[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIIllI[10], lIIIllllIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIIllI[1]);
                        "".length();
                        C0000a.b(C0005f.ba, lIIIllllIIllI[1]);
                        C0000a.a(lIIIllllIIllI[4], lIIIllllIIllI[15]);
                        C0000a.b(C0005f.bk, lIIIllllIIllI[1]);
                    }
                }
            }
            if (lIlIIlIlIlllIII(S() ? 1 : 0) && lIlIIlIlIlllIIl(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                new WorldArea(lIIIllllIIllI[16], lIIIllllIIllI[17], lIIIllllIIllI[18], lIIIllllIIllI[19], lIIIllllIIllI[0]);
                String[] strArr = new String[lIIIllllIIllI[1]];
                strArr[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (lIlIIlIlIlllllI(nearest2) && lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hg), lIIIllllIIllI[5]) && lIlIIlIlIlllIlI(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[18]];
                    if (lIlIIlIlIlllIIl(bY, lIIIllllIIllI[1])) {
                        C0004e.w();
                        bY += lIIIllllIIllI[1];
                    }
                    Movement.walkTo(hg);
                    "".length();
                    Time.sleepTicks(lIIIllllIIllI[1]);
                    "".length();
                }
                if (lIlIIlIlIllllIl(nearest2)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[21]];
                    C0006g.a(lIIIllllIIlIl[lIIIllllIIllI[15]], hf, lIIIllllIIllI[1]);
                }
            }
            if (lIlIIlIllIIIIII(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                if (lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[19]];
                    Movement.walkTo(hh);
                    "".length();
                    Time.sleepTicks(lIIIllllIIllI[1]);
                    "".length();
                }
                if (lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[22]];
                    String[] strArr2 = new String[lIIIllllIIllI[1]];
                    strArr2[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (lIlIIlIlIllllIl(nearest3)) {
                        String[] strArr3 = new String[lIIIllllIIllI[1]];
                        strArr3[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[24]];
                        if (lIlIIlIlIlllIII(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lIIIllllIIlIl[lIIIllllIIllI[25]]);
                            Time.sleepTicks(lIIIllllIIllI[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lIIIllllIIlIl[lIIIllllIIllI[26]], hf);
                }
            }
            if (lIlIIlIllIIIIII(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[3])) {
                if (lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] iArr4 = new int[lIIIllllIIllI[1]];
                    iArr4[lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (lIlIIlIlIlllIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIllllIIllI[1]];
                        iArr5[lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst(iArr5).interact(lIIIllllIIlIl[lIIIllllIIllI[28]]);
                        Time.sleepTicks(lIIIllllIIllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[29]];
                    Movement.walkTo(hi);
                    "".length();
                    Time.sleepTicks(lIIIllllIIllI[1]);
                    "".length();
                }
                if (lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[30]];
                    String[] strArr4 = new String[lIIIllllIIllI[1]];
                    strArr4[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (lIlIIlIlIllllIl(nearest4)) {
                        C0006g.a(lIIIllllIIlIl[lIIIllllIIllI[32]], hf);
                    }
                    if (lIlIIlIlIlllllI(nearest4)) {
                        String[] strArr5 = new String[lIIIllllIIllI[1]];
                        strArr5[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[33]];
                        TileObjects.getNearest(strArr5).interact(lIIIllllIIlIl[lIIIllllIIllI[34]]);
                        Time.sleepTicks(lIIIllllIIllI[3]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIllIIIIII(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[5])) {
                co = lIIIllllIIllI[0];
                if (lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[35]];
                    Movement.walkTo(hj);
                    "".length();
                    Time.sleepTicks(lIIIllllIIllI[1]);
                    "".length();
                }
                if (lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[36]];
                    String[] strArr6 = new String[lIIIllllIIllI[1]];
                    strArr6[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (lIlIIlIlIllllIl(nearest5)) {
                        nearest5.interact(lIIIllllIIlIl[lIIIllllIIllI[38]]);
                    }
                }
            }
            if (lIlIIlIllIIIIII(C0004e.j(lIIIllllIIllI[6]), lIIIllllIIllI[7])) {
                if (lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] iArr6 = new int[lIIIllllIIllI[1]];
                    iArr6[lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (lIlIIlIlIlllIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIllllIIllI[1]];
                        iArr7[lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst(iArr7).interact(lIIIllllIIlIl[lIIIllllIIllI[39]]);
                        Time.sleepTicks(lIIIllllIIllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[40]];
                    Movement.walkTo(hi);
                    "".length();
                    Time.sleepTicks(lIIIllllIIllI[1]);
                    "".length();
                }
                if (lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[41]];
                    String[] strArr7 = new String[lIIIllllIIllI[1]];
                    strArr7[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (lIlIIlIlIllllIl(nearest6)) {
                        String[] strArr8 = new String[lIIIllllIIllI[1]];
                        strArr8[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[43]];
                        if (lIlIIlIlIlllIII(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lIIIllllIIlIl[lIIIllllIIllI[44]]);
                            Time.sleepTicks(lIIIllllIIllI[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIIIllllIIllI[1]];
                        strArr9[lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (lIlIIlIlIllllIl(first)) {
                            if (lIlIIlIlIlllIIl(co, lIIIllllIIllI[1])) {
                                P.lr += lIIIllllIIllI[1];
                                P.d(AccBuilderRat.m);
                                co += lIIIllllIIllI[1];
                                P.lr = lIIIllllIIllI[0];
                                cp = lIIIllllIIllI[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lIIIllllIIllI[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(hf);
            }
            C0006g.a(new String[lIIIllllIIllI[0]]);
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ck();
            "".length();
            if ((-" ".length()) > 0) {
                return (84 ^ 120) & ((53 ^ 25) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllIIllI[51];
    }

    private static boolean lIlIIlIlIlllIlI(int i2) {
        return i2 == 0;
    }
}
