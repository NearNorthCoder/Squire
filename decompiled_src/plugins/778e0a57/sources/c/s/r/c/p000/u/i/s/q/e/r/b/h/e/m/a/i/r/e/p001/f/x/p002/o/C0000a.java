package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/a.class */
public class C0000a {
    private static final /* synthetic */ String[] a;
    private /* synthetic */ K d;
    private /* synthetic */ WorldPoint e;
    private static /* synthetic */ String[] lIlIllIIllIl;
    private static /* synthetic */ int[] lIlIllIIlllI;
    private /* synthetic */ int f;
    private /* synthetic */ String g;
    private final /* synthetic */ N[] b = new N[lIlIllIIlllI[0]];

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ WorldPoint[] f1c = new WorldPoint[lIlIllIIlllI[0]];

    private static boolean llIllllllllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public List<N> e() {
        ArrayList arrayList = new ArrayList();
        for (O o : j().bP()) {
            N b = b(o.bZ());
            if (llIllllllllIlI(b)) {
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                arrayList.add(b);
                "".length();
                "".length();
                if ((((92 ^ 126) ^ (102 ^ 85)) & (((140 ^ 186) ^ (127 ^ 88)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    private static boolean llIllllllllIll(int i, int i2) {
        return i < i2;
    }

    public N b(int i) {
        return this.b[i];
    }

    private static String llIlllllllIllI(String lllllllllllllllIllIIlIllllIIlIll, String lllllllllllllllIllIIlIllllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIllllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIlIllllIIlIII = lllllllllllllllIllIIlIllllIIlIlI.toCharArray();
        int lllllllllllllllIllIIlIllllIIIlll = lIlIllIIlllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIllIIlIlllIllllll = lIlIllIIlllI[1];
        while (llIllllllllIll(lllllllllllllllIllIIlIlllIllllll, length)) {
            char lllllllllllllllIllIIlIllllIIllII = charArray[lllllllllllllllIllIIlIlllIllllll];
            sb.append((char) (lllllllllllllllIllIIlIllllIIllII ^ lllllllllllllllIllIIlIllllIIlIII[lllllllllllllllIllIIlIllllIIIlll % lllllllllllllllIllIIlIllllIIlIII.length]));
            "".length();
            lllllllllllllllIllIIlIllllIIIlll++;
            lllllllllllllllIllIIlIlllIllllll++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public K j() {
        return this.d;
    }

    public N[] c() {
        ArrayList arrayList = new ArrayList();
        for (O o : this.d.bP()) {
            if (llIllllllllIlI(o)) {
                "".length();
                if ("   ".length() < (((43 ^ 0) ^ (72 ^ 41)) & (((245 ^ 151) ^ (100 ^ 76)) ^ (-" ".length())))) {
                    return null;
                }
            } else {
                if (llIllllllllllI(this.b[o.bZ()].bY(), P.COMBAT)) {
                    arrayList.add(this.b[o.bZ()]);
                    "".length();
                }
                "".length();
                if ((-"   ".length()) >= 0) {
                    return null;
                }
            }
        }
        return (N[]) arrayList.toArray(new N[lIlIllIIlllI[1]]);
    }

    public int a() {
        int i = lIlIllIIlllI[1];
        while (llIllllllllIll(i, lIlIllIIlllI[0])) {
            if (llIlllllllllII(new WorldArea(a(i), lIlIllIIlllI[8], lIlIllIIlllI[8]).contains(Players.getLocal()) ? 1 : 0)) {
                return i;
            }
            i++;
            "".length();
            if ("  ".length() > ((12 ^ 38) ^ (187 ^ 149))) {
                return ((((19 + 55) - (-54)) + 8) ^ (((63 + 133) - 108) + 111)) & (((16 ^ 39) ^ (84 ^ 44)) ^ (-" ".length()));
            }
        }
        return lIlIllIIlllI[9];
    }

    public void a(K k) {
        if (llIllllllllIlI(k)) {
            return;
        }
        String[] strArr = a;
        int length = strArr.length;
        int i = lIlIllIIlllI[1];
        while (llIllllllllIll(i, length)) {
            String str = strArr[i];
            if (llIlllllllllII(str.startsWith(k.bO()) ? 1 : 0)) {
                this.g = str.split(lIlIllIIllIl[lIlIllIIlllI[1]])[lIlIllIIlllI[2]].trim();
            }
            i++;
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return;
            }
        }
        this.d = k;
        int i2 = lIlIllIIlllI[1];
        while (llIllllllllIll(i2, this.b.length)) {
            if (llIllllllllIlI(k.w(i2))) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else if (llIllllllllIlI(this.b[i2])) {
                a(P.c(k.w(i2).ca()).ce(), i2);
            }
            i2++;
            "".length();
            if ((-((((29 + 41) - 10) + 130) ^ (((172 + 117) - 184) + 81))) > 0) {
                return;
            }
        }
    }

    private static boolean llIlllllllllII(int i) {
        return i != 0;
    }

    private static boolean lllIIIIIIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llIlllllllIlll(String lllllllllllllllIllIIlIlllIlIlIIl, String lllllllllllllllIllIIlIlllIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIIlllI[7], lllllllllllllllIllIIlIlllIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlllIlIlIlI) {
            lllllllllllllllIllIIlIlllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllllllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    public boolean g() {
        List<N> e = e();
        if (lllIIIIIIIIIII(e.contains(N.VESPULA) ? 1 : 0)) {
            return lIlIllIIlllI[1];
        }
        int i = lIlIllIIlllI[1];
        do {
            if (llIllllllllIll(i, e.size())) {
                N n = e.get(i);
                if (lllIIIIIIIIIIl(n, N.START) && lllIIIIIIIIIIl(n, N.SCAVENGERS) && lllIIIIIIIIIIl(n, N.FARMING)) {
                    if (llIllllllllllI(n, N.END)) {
                        "".length();
                        if ("   ".length() < 0) {
                            return ((108 ^ 58) ^ (157 ^ 145)) & (((39 ^ 76) ^ (4 ^ 53)) ^ (-" ".length()));
                        }
                    } else if (llIllllllllllI(n, N.VESPULA)) {
                        "".length();
                        if (" ".length() <= (-" ".length())) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (llIlllllllllII(b(n) ? 1 : 0)) {
                        return lIlIllIIlllI[2];
                    }
                }
                i++;
                "".length();
            }
            return lIlIllIIlllI[1];
        } while ((-" ".length()) <= 0);
        return ((62 ^ 27) ^ (178 ^ 193)) & (((((83 + 6) - (-54)) + 2) ^ (((160 + 130) - 269) + 178)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a(N n) {
        switch (C0027b.i[n.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return lIlIllIIlllI[2];
            default:
                return lIlIllIIlllI[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean b(N n) {
        switch (C0027b.i[n.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
                return lIlIllIIlllI[2];
            default:
                return lIlIllIIlllI[1];
        }
    }

    public WorldPoint k() {
        return this.e;
    }

    String f() {
        StringBuilder sb = new StringBuilder();
        for (N n : e()) {
            switch (C0027b.h[n.bY().ordinal()]) {
                case 1:
                case 2:
                    sb.append(n.bX()).append(lIlIllIIllIl[lIlIllIIlllI[2]]);
                    "".length();
                    break;
            }
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        String valueOf = String.valueOf(sb);
        return valueOf.substring(lIlIllIIlllI[1], valueOf.length() - lIlIllIIlllI[7]);
    }

    private WorldPoint a(int lllllllllllllllIllIIllIIIlIlIIII) {
        int i;
        int i2;
        int i3;
        int i4;
        int l = l();
        int i5 = l % lIlIllIIlllI[3];
        if (llIlllllllllIl(l % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            i = lIlIllIIlllI[2];
            "".length();
            if ((162 ^ 167) <= 0) {
                return null;
            }
        } else {
            i = lIlIllIIlllI[1];
        }
        int i6 = i;
        if (llIlllllllllIl(l, lIlIllIIlllI[6])) {
            i2 = lIlIllIIlllI[7];
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        } else {
            i2 = lIlIllIIlllI[5];
        }
        int i7 = i2;
        WorldPoint k = k();
        int i8 = lllllllllllllllIllIIllIIIlIlIIII % lIlIllIIlllI[3];
        if (llIlllllllllIl(lllllllllllllllIllIIllIIIlIlIIII % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            i3 = lIlIllIIlllI[2];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        } else {
            i3 = lIlIllIIlllI[1];
        }
        int i9 = i3;
        if (llIlllllllllIl(lllllllllllllllIllIIllIIIlIlIIII, lIlIllIIlllI[6])) {
            i4 = lIlIllIIlllI[7];
            "".length();
            if (((95 ^ 65) ^ (35 ^ 57)) == "   ".length()) {
                return null;
            }
        } else {
            i4 = lIlIllIIlllI[5];
        }
        int i10 = i4;
        return new WorldPoint(k.getX() + (lIlIllIIlllI[8] * (i8 - i5)), k.getY() - (lIlIllIIlllI[8] * (i9 - i6)), k.getPlane() + (i10 - i7));
    }

    public int b() {
        int i = lIlIllIIlllI[1];
        while (llIllllllllIll(i, this.f1c.length)) {
            if (llIlllllllllII(new WorldArea(this.f1c[i], lIlIllIIlllI[8], lIlIllIIlllI[8]).contains(Players.getLocal()) ? 1 : 0)) {
                return i;
            }
            i++;
            "".length();
            if ("   ".length() == 0) {
                return (170 ^ 155) & ((89 ^ 104) ^ (-1));
            }
        }
        return lIlIllIIlllI[9];
    }

    public N[] h() {
        return this.b;
    }

    public int l() {
        return this.f;
    }

    static {
        llIllllllllIIl();
        llIllllllllIII();
        String[] strArr = new String[lIlIllIIlllI[10]];
        strArr[lIlIllIIlllI[1]] = lIlIllIIllIl[lIlIllIIlllI[7]];
        strArr[lIlIllIIlllI[2]] = lIlIllIIllIl[lIlIllIIlllI[5]];
        strArr[lIlIllIIlllI[7]] = lIlIllIIllIl[lIlIllIIlllI[3]];
        strArr[lIlIllIIlllI[5]] = lIlIllIIllIl[lIlIllIIlllI[11]];
        strArr[lIlIllIIlllI[3]] = lIlIllIIllIl[lIlIllIIlllI[12]];
        strArr[lIlIllIIlllI[11]] = lIlIllIIllIl[lIlIllIIlllI[6]];
        strArr[lIlIllIIlllI[12]] = lIlIllIIllIl[lIlIllIIlllI[4]];
        strArr[lIlIllIIlllI[6]] = lIlIllIIllIl[lIlIllIIlllI[13]];
        strArr[lIlIllIIlllI[4]] = lIlIllIIllIl[lIlIllIIlllI[14]];
        strArr[lIlIllIIlllI[13]] = lIlIllIIllIl[lIlIllIIlllI[15]];
        strArr[lIlIllIIlllI[14]] = lIlIllIIllIl[lIlIllIIlllI[16]];
        strArr[lIlIllIIlllI[15]] = lIlIllIIllIl[lIlIllIIlllI[17]];
        strArr[lIlIllIIlllI[16]] = lIlIllIIllIl[lIlIllIIlllI[18]];
        strArr[lIlIllIIlllI[17]] = lIlIllIIllIl[lIlIllIIlllI[19]];
        strArr[lIlIllIIlllI[18]] = lIlIllIIllIl[lIlIllIIlllI[0]];
        strArr[lIlIllIIlllI[19]] = lIlIllIIllIl[lIlIllIIlllI[20]];
        strArr[lIlIllIIlllI[0]] = lIlIllIIllIl[lIlIllIIlllI[21]];
        strArr[lIlIllIIlllI[20]] = lIlIllIIllIl[lIlIllIIlllI[22]];
        strArr[lIlIllIIlllI[21]] = lIlIllIIllIl[lIlIllIIlllI[23]];
        strArr[lIlIllIIlllI[22]] = lIlIllIIllIl[lIlIllIIlllI[24]];
        strArr[lIlIllIIlllI[23]] = lIlIllIIllIl[lIlIllIIlllI[25]];
        strArr[lIlIllIIlllI[24]] = lIlIllIIllIl[lIlIllIIlllI[26]];
        strArr[lIlIllIIlllI[25]] = lIlIllIIllIl[lIlIllIIlllI[27]];
        strArr[lIlIllIIlllI[26]] = lIlIllIIllIl[lIlIllIIlllI[28]];
        strArr[lIlIllIIlllI[27]] = lIlIllIIllIl[lIlIllIIlllI[10]];
        strArr[lIlIllIIlllI[28]] = lIlIllIIllIl[lIlIllIIlllI[29]];
        a = strArr;
    }

    private static void llIllllllllIIl() {
        lIlIllIIlllI = new int[31];
        lIlIllIIlllI[0] = (204 ^ 165) ^ (187 ^ 194);
        lIlIllIIlllI[1] = (170 ^ 187) & ((20 ^ 5) ^ (-1));
        lIlIllIIlllI[2] = " ".length();
        lIlIllIIlllI[3] = (80 ^ 61) ^ (54 ^ 95);
        lIlIllIIlllI[4] = 73 ^ 65;
        lIlIllIIlllI[5] = "   ".length();
        lIlIllIIlllI[6] = (30 ^ 100) ^ (30 ^ 99);
        lIlIllIIlllI[7] = "  ".length();
        lIlIllIIlllI[8] = (22 ^ 71) ^ (231 ^ 150);
        lIlIllIIlllI[9] = -" ".length();
        lIlIllIIlllI[10] = (157 ^ 167) ^ (225 ^ 193);
        lIlIllIIlllI[11] = (118 ^ 103) ^ (188 ^ 168);
        lIlIllIIlllI[12] = (30 ^ 3) ^ (128 ^ 155);
        lIlIllIIlllI[13] = 26 ^ 19;
        lIlIllIIlllI[14] = (((74 + 104) - 108) + 62) ^ (((130 + 87) - 201) + 126);
        lIlIllIIlllI[15] = 47 ^ 36;
        lIlIllIIlllI[16] = 178 ^ 190;
        lIlIllIIlllI[17] = (((68 + 68) - 135) + 155) ^ (((2 + 21) - 14) + 136);
        lIlIllIIlllI[18] = 127 ^ 113;
        lIlIllIIlllI[19] = 41 ^ 38;
        lIlIllIIlllI[20] = (61 ^ 28) ^ (241 ^ 193);
        lIlIllIIlllI[21] = 212 ^ 198;
        lIlIllIIlllI[22] = (((29 + 131) - 104) + 91) ^ (((62 + 33) - (-24)) + 9);
        lIlIllIIlllI[23] = (18 ^ 94) ^ (5 ^ 93);
        lIlIllIIlllI[24] = 164 ^ 177;
        lIlIllIIlllI[25] = 117 ^ 99;
        lIlIllIIlllI[26] = (((76 + 129) - 125) + 70) ^ (((54 + 72) - 85) + 88);
        lIlIllIIlllI[27] = 177 ^ 169;
        lIlIllIIlllI[28] = 29 ^ 4;
        lIlIllIIlllI[29] = 178 ^ 169;
        lIlIllIIlllI[30] = 30 ^ 2;
    }

    public WorldPoint[] i() {
        return this.f1c;
    }

    public C0000a(WorldPoint worldPoint, int i) {
        this.e = worldPoint;
        this.f = i;
    }

    private static boolean lllIIIIIIIIIII(int i) {
        return i == 0;
    }

    public void a(N[] nArr) {
        int i = lIlIllIIlllI[1];
        for (O o : this.d.bP()) {
            if (llIllllllllIlI(o)) {
                "".length();
                if (" ".length() <= ((124 ^ 89) & ((51 ^ 22) ^ (-1)))) {
                    return;
                }
            } else {
                if (llIllllllllllI(this.b[o.bZ()].bY(), P.COMBAT)) {
                    this.b[o.bZ()] = nArr[i];
                    i++;
                }
                "".length();
                if ((-"  ".length()) >= 0) {
                    return;
                }
            }
        }
    }

    public M c(int i) {
        int i2;
        int i3;
        int i4;
        int l = l() % lIlIllIIlllI[3];
        if (llIlllllllllIl(l() % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            i2 = lIlIllIIlllI[2];
            "".length();
            if (((201 ^ 191) ^ (49 ^ 67)) == (-" ".length())) {
                return null;
            }
        } else {
            i2 = lIlIllIIlllI[1];
        }
        int i5 = i2;
        int i6 = i % lIlIllIIlllI[3];
        if (llIlllllllllIl(i % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            i3 = lIlIllIIlllI[2];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        } else {
            i3 = lIlIllIIlllI[1];
        }
        int i7 = i3;
        if (llIlllllllllIl(i, lIlIllIIlllI[6])) {
            i4 = lIlIllIIlllI[7];
            "".length();
            if ("  ".length() >= (110 ^ 106)) {
                return null;
            }
        } else {
            i4 = lIlIllIIlllI[5];
        }
        int lllllllllllllllIllIIllIIIIlIIIll = i4;
        int x = k().getX() + ((i6 - l) * lIlIllIIlllI[8]);
        int y = k().getY() - ((i7 - i5) * lIlIllIIlllI[8]);
        int baseX = x - Static.getClient().getBaseX();
        int baseY = y - Static.getClient().getBaseY();
        if (llIllllllllIll(baseX, lIlIllIIlllI[2])) {
            baseX = lIlIllIIlllI[2];
        }
        if (llIllllllllIll(baseY, lIlIllIIlllI[2])) {
            baseY = lIlIllIIlllI[2];
        }
        return a(Static.getClient().getScene().getTiles()[lllllllllllllllIllIIllIIIIlIIIll][baseX][baseY]);
    }

    private static void llIllllllllIII() {
        lIlIllIIllIl = new String[lIlIllIIlllI[30]];
        lIlIllIIllIl[lIlIllIIlllI[1]] = llIlllllllIlIl("HnzpnOwKNM0=", "TidWm");
        lIlIllIIllIl[lIlIllIIlllI[2]] = llIlllllllIllI("dmo=", "ZJqlc");
        lIlIllIIllIl[lIlIllIIlllI[7]] = llIlllllllIlIl("oDsu+cDCK8fAPHNcVKmXJ1GxkngNHyF8/XR2Se4xIpw=", "kRlPS");
        lIlIllIIllIl[lIlIllIIlllI[5]] = llIlllllllIlll("QDjD5iPafMd5nbkATKr1GNJgIrWvGWfTdgmfLo+6yEE=", "IENKx");
        lIlIllIIllIl[lIlIllIIlllI[3]] = llIlllllllIlIl("4GUlkpELt8WKeFDRMrp5SW5DfcdLaor9g+toyv3tdXo=", "DgFVz");
        lIlIllIIllIl[lIlIllIIlllI[11]] = llIlllllllIllI("CykKKg0IOQo/CHhHaU8LHS8HOxl7PRopCx0k", "XjIlN");
        lIlIllIIllIl[lIlIllIIlllI[12]] = llIlllllllIlIl("qu5nETs3TGW48FD3eBAAJIL49GkaagonOYi14EIe388=", "rKYEa");
        lIlIllIIllIl[lIlIllIIlllI[6]] = llIlllllllIllI("OAAXKzQoAAI4IktucUshOAYUJjNIBgI/MyUU", "kCQhd");
        lIlIllIIllIl[lIlIllIIlllI[4]] = llIlllllllIlIl("+fA5PNT4ks5AJsI5KyWxt1h/jpLIU1kMQqWrDfXqfQs=", "yDAxl");
        lIlIllIIllIl[lIlIllIIlllI[13]] = llIlllllllIlIl("iYYDvYQSH1F14zvPcDb6RvG6ebNPs0+hKPtvKjR4zsk=", "uLxSB");
        lIlIllIIllIl[lIlIllIIlllI[14]] = llIlllllllIllI("PBEXHQosAQEOD09/cW4ePAUGAwxMBQIIDCEX", "oRQMI");
        lIlIllIIllIl[lIlIllIIlllI[15]] = llIlllllllIllI("HCURBS0fJRQGKG9Ld3Y5HCMSGytsMQACPQoj", "OfWUn");
        lIlIllIIllIl[lIlIllIIlllI[16]] = llIlllllllIlll("Sp4ZIOUMBLO08DEsB11iN0rqIhh2RrYt06k6Zl+IwbI=", "qocns");
        lIlIllIIllIl[lIlIllIIlllI[17]] = llIlllllllIlll("JUrVH1coAAP7JSxL2lwSNnZPkSuyq2/gjpTncnTh9MI=", "jSKiu");
        lIlIllIIllIl[lIlIllIIlllI[18]] = llIlllllllIllI("AjIaJC0SIhohKHFcakEgFDQPMTlyJh0sKxQ0", "QqJbn");
        lIlIllIIllIl[lIlIllIIlllI[19]] = llIlllllllIllI("EgkoLiwCGSg7KWFnWEs4Fhk9LSpiBC87OBYE", "AJxho");
        lIlIllIIllIl[lIlIllIIlllI[0]] = llIlllllllIlIl("BrkxdtFIhMg8tqYtfJbWAAW8y/5mctrKpzYqcU8iY94=", "tlveM");
        lIlIllIIllIl[lIlIllIIlllI[20]] = llIlllllllIlIl("DOmvChYeVU6wb+4N8yUuJUYhbeiiz9zUxELvTfG3HWw=", "FUTpZ");
        lIlIllIIllIl[lIlIllIIlllI[21]] = llIlllllllIlll("I/bfDmYGc5g3PboTDEpDKmYqtjjLBrnwhGrxKYGhmHw=", "ysTxb");
        lIlIllIIllIl[lIlIllIIlllI[22]] = llIlllllllIllI("BCogIgcUKTMnAndXQ0cTADQmIQF0LTAzCgAp", "WzcdD");
        lIlIllIIllIl[lIlIllIIlllI[23]] = llIlllllllIllI("FDcmAzQUJCYVMWdKRWYyFCIrACRkMDISOQIi", "GgeEw");
        lIlIllIIllIl[lIlIllIIlllI[24]] = llIlllllllIlIl("JGP7kjXDH2BV0mDi64W+bie2WYC7J2O4jq9HHyWCM24=", "SmATF");
        lIlIllIIllIl[lIlIllIIlllI[25]] = llIlllllllIlll("GXNEy4BnphqraHK3aGch3SXnRkPXxa3h0JONg+5q7g0=", "PqqLz");
        lIlIllIIllIl[lIlIllIIlllI[26]] = llIlllllllIlIl("rmC45jkeUuy8W8nADGPbCWueG8kmDuY7tPI7xcGIdgg=", "EFYqc");
        lIlIllIIllIl[lIlIllIIlllI[27]] = llIlllllllIlIl("vc7NDZCzjPwIh2YFmAl2veUVSeGqDX6UI24WKgqYWJE=", "qcjjK");
        lIlIllIIllIl[lIlIllIIlllI[28]] = llIlllllllIlIl("e9AtgHvaEoxlaGWAWudoUFrm8vqmSDkIKqLS6G7yiqk=", "QwcSV");
        lIlIllIIllIl[lIlIllIIlllI[10]] = llIlllllllIlll("Lt7oLu1GjI4F78EMw3OQeDrEkGfK91zqnj6thzf7y+8=", "abeVE");
        lIlIllIIllIl[lIlIllIIlllI[29]] = llIlllllllIlIl("itC/y8xYLnLTAMoLn/R3Yar6Vnf51/zX9l7LtoFAaMQ=", "AvuRE");
    }

    public String m() {
        return this.g;
    }

    public M a(Tile tile) {
        M x = M.x(Static.getClient().getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / lIlIllIIlllI[4]][tile.getSceneLocation().getY() / lIlIllIIlllI[4]]);
        return llIllllllllIlI(x) ? M.RAIDS_EMPTY : x;
    }

    private static boolean llIlllllllllll(Object obj) {
        return obj != null;
    }

    private static String llIlllllllIlIl(String lllllllllllllllIllIIlIlllIllIllI, String lllllllllllllllIllIIlIlllIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlllIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlllIlllIII.init(lIlIllIIlllI[7], secretKeySpec);
            return new String(lllllllllllllllIllIIlIlllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlllIllIlll) {
            lllllllllllllllIllIIlIlllIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllllllIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        StringBuilder sb = new StringBuilder();
        N[] nArr = this.b;
        int length = nArr.length;
        int i = lIlIllIIlllI[1];
        while (llIllllllllIll(i, length)) {
            N n = nArr[i];
            if (llIlllllllllll(n)) {
                sb.append(n.bY().cf());
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                sb.append(lIlIllIIlllI[8]);
                "".length();
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public void a(N n, int i) {
        if (llIllllllllIll(i, this.b.length)) {
            this.b[i] = n;
            this.f1c[i] = a(i);
        }
    }
}
