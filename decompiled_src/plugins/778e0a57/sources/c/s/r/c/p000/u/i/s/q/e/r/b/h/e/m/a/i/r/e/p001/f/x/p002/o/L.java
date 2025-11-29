package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.L  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/L.class */
public class L {
    private static final /* synthetic */ Pattern cg;
    private static /* synthetic */ String[] lIlIlIlllIII;
    private static final /* synthetic */ Logger ce;
    private static /* synthetic */ int[] lIlIlIlllIIl;
    private static final /* synthetic */ String[] ch;
    private static final /* synthetic */ List<K> cf;

    private static String llIllllIlllllI(String lllllllllllllllIllIIllIllIlIIllI, String lllllllllllllllIllIIllIllIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllIllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIllIllIlIIIll = lllllllllllllllIllIIllIllIlIIlIl.toCharArray();
        int lllllllllllllllIllIIllIllIlIIIlI = lIlIlIlllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIlllIIl[0];
        while (llIlllllIIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIllIllIlIIIll[lllllllllllllllIllIIllIllIlIIIlI % lllllllllllllllIllIIllIllIlIIIll.length]));
            "".length();
            lllllllllllllllIllIIllIllIlIIIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIlllllIIIIIl() {
        lIlIlIlllIII = new String[lIlIlIlllIIl[36]];
        lIlIlIlllIII[lIlIlIlllIIl[0]] = llIllllIlllllI("Og==", "tXNxJ");
        lIlIlIlllIII[lIlIlIlllIIl[1]] = llIllllIlllllI("Kw==", "nBqyJ");
        lIlIlIlllIII[lIlIlIlllIIl[7]] = llIllllIllllll("0SNcEruTJPY=", "Wchet");
        lIlIlIlllIII[lIlIlIlllIIl[4]] = llIllllIlllllI("PA==", "kLavq");
        lIlIlIlllIII[lIlIlIlllIIl[6]] = llIllllIlllllI("MkwQOHc2OWFQBkJMEDh3NjlhUHpBRGhRAS1JESRwRUdjIhtBPhZTc0g=", "ldKyZ");
        lIlIlIlllIII[lIlIlIlllIIl[12]] = llIllllIllllll("tRQOvZsdNZpFSSkhW1p+hBRYfaL7AA2Ut1xUe15f52g=", "dWoDp");
        lIlIlIlllIII[lIlIlIlllIIl[13]] = llIllllIllllll("UjfV0B2PSqstj6xsMRy+q96hlTMpcmDpuF2DJ9VvGkQ=", "pSBEF");
        lIlIlIlllIII[lIlIlIlllIIl[14]] = llIlllllIIIIII("tMN5u9EtXoCaGIplV0xsX463UZxeZEvmxLOxSZdRx84=", "kpeLz");
        lIlIlIlllIII[lIlIlIlllIIl[3]] = llIlllllIIIIII("6uj+saWn7hFMTM2spc9si5ILIHY2gEdDqt8FGvifIf4=", "KMCnS");
        lIlIlIlllIII[lIlIlIlllIIl[15]] = llIllllIlllllI("OAksNzZFCSwiNi1qQlFFJQ88NCMlaTgiMSUdPA==", "kJoqf");
        lIlIlIlllIII[lIlIlIlllIIl[16]] = llIllllIlllllI("HBYWMjdhFhMiNwl1fVFECgYVNCkYdhUiMBgbBw==", "OUPqg");
        lIlIlIlllIII[lIlIlIlllIIl[17]] = llIlllllIIIIII("DmrQywkaCjeallgdjbrVziEuOho1vKhc/n6hCjWk1vU=", "CqMsL");
        lIlIlIlllIII[lIlIlIlllIIl[18]] = llIllllIlllllI("PQwxBTMtYTQVMy0cMWZOTmwyFTQ5ASAVQCAKJAMtKxw=", "nOwFc");
        lIlIlIlllIII[lIlIlIlllIIl[19]] = llIllllIllllll("wocGnKACEV3wbicbmpYmxw2zhduDYoGRwnxPcDvJn60=", "KNmhm");
        lIlIlIlllIII[lIlIlIlllIIl[20]] = llIlllllIIIIII("8XAUngj7D1FneMFFoGXwxYw8SLuiX4bEanzoBe7bXd8=", "HvMZD");
        lIlIlIlllIII[lIlIlIlllIIl[21]] = llIlllllIIIIII("BRIJ2g3rpkLNtYPa0VRSpzYeJQayQrlw8DCuIo1XDuE=", "CfANc");
        lIlIlIlllIII[lIlIlIlllIIl[22]] = llIllllIlllllI("BQ8JEhR4DxoEBBBsdHR0GBsOAwQTbw4aEhMfHA==", "VLYTW");
        lIlIlIlllIII[lIlIlIlllIIl[23]] = llIlllllIIIIII("+T3Gx/JK4Idej6Z9cmgbf6sz6IjgDsKPgIP/riihK04=", "nLbWc");
        lIlIlIlllIII[lIlIlIlllIIl[24]] = llIlllllIIIIII("fIbgHn+CV/ZDBFW7jw7hLH6amIjlMzG8dgyCgNeCPjI=", "xnWfJ");
        lIlIlIlllIII[lIlIlIlllIIl[25]] = llIllllIlllllI("OSwRCQJELAEKFCxPb3lnLzwVDgo9TAcKASQqEQ==", "joBYD");
        lIlIlIlllIII[lIlIlIlllIIl[26]] = llIlllllIIIIII("JY3A+ziQhcJ3jeW5Zg7sglK7/TSDqD6XKsSy7QvH4RI=", "lVZnc");
        lIlIlIlllIII[lIlIlIlllIIl[27]] = llIllllIlllllI("JCIrMwpZNCsgCjFERVB6Mio/JwogRy0+HCQhJg==", "wdhpY");
        lIlIlIlllIII[lIlIlIlllIIl[28]] = llIllllIllllll("wXnD6qz/hskRj0qbFJfVjgPRA58+XVDiqHxys7jPcGc=", "TDjKq");
        lIlIlIlllIII[lIlIlIlllIIl[29]] = llIllllIllllll("wEIgK1FySpMzlYIcw5PIiNvoft/2MBqqgNIcOnmMbMs=", "WvgRm");
        lIlIlIlllIII[lIlIlIlllIIl[30]] = llIlllllIIIIII("m3H/EQZUTmZkJvzv6l1jKhSwi0zKUdrGJHfK0DOxiK4=", "DbwhE");
        lIlIlIlllIII[lIlIlIlllIIl[31]] = llIllllIllllll("ybw//l/IENj+ztRxvABWYjg7lXqQru/AcNmQjPd5TBQ=", "GzGNG");
        lIlIlIlllIII[lIlIlIlllIIl[11]] = llIllllIllllll("DMnpxQkdTsqgS6XPZA+fOF3xQbz1jffTCx4VsyX3ISw=", "MCENZ");
        lIlIlIlllIII[lIlIlIlllIIl[32]] = llIllllIllllll("rt9dKPf+gsnWEATKXWhxzVzXObqHWe0OfCVl/lvtJ1hD0AuQbcXZtQ==", "JOafL");
        lIlIlIlllIII[lIlIlIlllIIl[33]] = llIllllIlllllI("Aj4SITBqPREhMAJNb0JQEzoVMTYBTgcsJBM+FQ==", "DmBbs");
        lIlIlIlllIII[lIlIlIlllIIl[34]] = llIllllIlllllI("LiEmBxVGIiYXBi5SSGRmLTwyExI7USsBADs3Kw==", "hreDE");
        lIlIlIlllIII[lIlIlIlllIIl[35]] = llIllllIlllllI("MBk/EwhNGSwGGCV6QnVoLR8qBg4teTgGHDQUKg==", "cZoUK");
    }

    public L() {
        bQ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
        if (llIlllllIIIIll(r9) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
        r7 = r0;
        r8 = r8 + 1;
        c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.L.ce.debug("Found matching layout: " + r0.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
        if (0 == 0) goto L2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K a(String str) {
        K k = null;
        int lllllllllllllllIllIIlllIIIIIIlIl = lIlIlIlllIIl[0];
        Iterator<K> it = cf.iterator();
        while (llIlllllIIIIll(it.hasNext() ? 1 : 0)) {
            K next = it.next();
            int i = lIlIlIlllIIl[1];
            int i2 = lIlIlIlllIIl[0];
            while (true) {
                if (!llIlllllIIIlII(i2, str.length())) {
                    break;
                }
                O w = next.w(i2);
                char charAt = str.charAt(i2);
                if (llIlllllIIIlIl(w) && llIlllllIIIllI(charAt, lIlIlIlllIIl[2]) && llIlllllIIIllI(charAt, w.ca())) {
                    i = lIlIlIlllIIl[0];
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    i2++;
                    "".length();
                    if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                        return null;
                    }
                }
            }
        }
        if (llIlllllIIIlll(lllllllllllllllIllIIlllIIIIIIlIl, lIlIlIlllIIl[1])) {
            return k;
        }
        return null;
    }

    private static boolean llIlllllIIlIIl(int i) {
        return i == 0;
    }

    private static boolean llIlllllIIlIII(int i) {
        return i >= 0;
    }

    private static boolean llIlllllIIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void bQ() {
        char c2;
        String[] strArr = ch;
        int length = strArr.length;
        int i = lIlIlIlllIIl[0];
        while (llIlllllIIIlII(i, length)) {
            Matcher matcher = cg.matcher(strArr[i]);
            if (llIlllllIIlIIl(matcher.find() ? 1 : 0)) {
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else {
                int b = b(matcher.group(lIlIlIlllIIl[4]));
                K k = new K();
                O o = null;
                int i2 = lIlIlIlllIIl[0];
                while (llIlllllIIIlII(i2, lIlIlIlllIIl[7])) {
                    String lllllllllllllllIllIIllIlllIlIlII = matcher.group(lIlIlIlllIIl[1] + i2);
                    String lllllllllllllllIllIIllIlllIlIIll = matcher.group(lIlIlIlllIIl[4] + i2);
                    int lllllllllllllllIllIIllIlllIIllIl = lIlIlIlllIIl[0];
                    while (llIlllllIIIlII(lllllllllllllllIllIIllIlllIIllIl, lllllllllllllllIllIIllIlllIlIIll.length())) {
                        if (llIlllllIIlIIl(lllllllllllllllIllIIllIlllIIllIl)) {
                            char c3 = lIlIlIlllIIl[9];
                            "".length();
                            c2 = c3;
                            if (" ".length() < 0) {
                                return;
                            }
                        } else {
                            c2 = lllllllllllllllIllIIllIlllIlIlII.charAt(lllllllllllllllIllIIllIlllIIllIl - lIlIlIlllIIl[1]);
                        }
                        O o2 = new O(b, c2);
                        if (llIlllllIIIlIl(o)) {
                            o.b(o2);
                            o2.c(o);
                        }
                        k.a(o2);
                        o = o2;
                        b += b(lllllllllllllllIllIIllIlllIlIIll.charAt(lllllllllllllllIllIIllIlllIIllIl));
                        lllllllllllllllIllIIllIlllIIllIl++;
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                    O o3 = new O(b, lIlIlIlllIIl[10]);
                    o3.c(o);
                    o.b(o3);
                    k.a(o3);
                    b += 8;
                    i2++;
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                cf.add(k);
                "".length();
            }
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
        }
    }

    private static boolean llIlllllIIIllI(int i, int i2) {
        return i != i2;
    }

    private static void llIlllllIIIIlI() {
        lIlIlIlllIIl = new int[37];
        lIlIlIlllIIl[0] = ((((34 + 11) - (-46)) + 85) ^ (((117 + 132) - 62) + 4)) & (((199 ^ 140) ^ (16 ^ 84)) ^ (-" ".length()));
        lIlIlIlllIIl[1] = " ".length();
        lIlIlIlllIIl[2] = (((123 + 88) - 164) + 135) ^ (((77 + 67) - 28) + 34);
        lIlIlIlllIIl[3] = 5 ^ 13;
        lIlIlIlllIIl[4] = "   ".length();
        lIlIlIlllIIl[5] = -" ".length();
        lIlIlIlllIIl[6] = (233 ^ 192) ^ (103 ^ 74);
        lIlIlIlllIIl[7] = "  ".length();
        lIlIlIlllIIl[8] = -(40 ^ 44);
        lIlIlIlllIIl[9] = (98 ^ 100) ^ (185 ^ 156);
        lIlIlIlllIIl[10] = ((123 + 7) - 54) + 88;
        lIlIlIlllIIl[11] = (120 ^ 31) ^ (250 ^ 135);
        lIlIlIlllIIl[12] = 74 ^ 79;
        lIlIlIlllIIl[13] = (((140 + 52) - 160) + 136) ^ (((85 + 80) - 98) + 107);
        lIlIlIlllIIl[14] = 179 ^ 180;
        lIlIlIlllIIl[15] = (187 ^ 142) ^ (47 ^ 19);
        lIlIlIlllIIl[16] = (((34 + 138) - 88) + 71) ^ (((61 + 80) - 105) + 109);
        lIlIlIlllIIl[17] = 167 ^ 172;
        lIlIlIlllIIl[18] = 40 ^ 36;
        lIlIlIlllIIl[19] = 143 ^ 130;
        lIlIlIlllIIl[20] = 92 ^ 82;
        lIlIlIlllIIl[21] = (123 ^ 78) ^ (20 ^ 46);
        lIlIlIlllIIl[22] = 20 ^ 4;
        lIlIlIlllIIl[23] = (106 ^ 1) ^ (91 ^ 33);
        lIlIlIlllIIl[24] = (((30 + 72) - 25) + 104) ^ (((62 + 35) - (-11)) + 59);
        lIlIlIlllIIl[25] = (13 ^ 82) ^ (49 ^ 125);
        lIlIlIlllIIl[26] = (161 ^ 185) ^ (117 ^ 121);
        lIlIlIlllIIl[27] = (53 ^ 84) ^ (209 ^ 165);
        lIlIlIlllIIl[28] = (((105 + 151) - 73) + 0) ^ (((105 + 12) - 91) + 135);
        lIlIlIlllIIl[29] = 32 ^ 55;
        lIlIlIlllIIl[30] = (44 ^ 26) ^ (181 ^ 155);
        lIlIlIlllIIl[31] = (((110 + 12) - 42) + 59) ^ (((136 + 83) - 209) + 136);
        lIlIlIlllIIl[32] = (219 ^ 146) ^ (46 ^ 124);
        lIlIlIlllIIl[33] = 105 ^ 117;
        lIlIlIlllIIl[34] = 19 ^ 14;
        lIlIlIlllIIl[35] = 9 ^ 23;
        lIlIlIlllIIl[36] = (((172 + 25) - 28) + 47) ^ (((189 + 151) - 330) + 189);
    }

    static {
        llIlllllIIIIlI();
        llIlllllIIIIIl();
        ce = LoggerFactory.getLogger(L.class);
        cf = new ArrayList();
        cg = Pattern.compile(lIlIlIlllIII[lIlIlIlllIIl[6]]);
        String[] strArr = new String[lIlIlIlllIIl[11]];
        strArr[lIlIlIlllIIl[0]] = lIlIlIlllIII[lIlIlIlllIIl[12]];
        strArr[lIlIlIlllIIl[1]] = lIlIlIlllIII[lIlIlIlllIIl[13]];
        strArr[lIlIlIlllIIl[7]] = lIlIlIlllIII[lIlIlIlllIIl[14]];
        strArr[lIlIlIlllIIl[4]] = lIlIlIlllIII[lIlIlIlllIIl[3]];
        strArr[lIlIlIlllIIl[6]] = lIlIlIlllIII[lIlIlIlllIIl[15]];
        strArr[lIlIlIlllIIl[12]] = lIlIlIlllIII[lIlIlIlllIIl[16]];
        strArr[lIlIlIlllIIl[13]] = lIlIlIlllIII[lIlIlIlllIIl[17]];
        strArr[lIlIlIlllIIl[14]] = lIlIlIlllIII[lIlIlIlllIIl[18]];
        strArr[lIlIlIlllIIl[3]] = lIlIlIlllIII[lIlIlIlllIIl[19]];
        strArr[lIlIlIlllIIl[15]] = lIlIlIlllIII[lIlIlIlllIIl[20]];
        strArr[lIlIlIlllIIl[16]] = lIlIlIlllIII[lIlIlIlllIIl[21]];
        strArr[lIlIlIlllIIl[17]] = lIlIlIlllIII[lIlIlIlllIIl[22]];
        strArr[lIlIlIlllIIl[18]] = lIlIlIlllIII[lIlIlIlllIIl[23]];
        strArr[lIlIlIlllIIl[19]] = lIlIlIlllIII[lIlIlIlllIIl[24]];
        strArr[lIlIlIlllIIl[20]] = lIlIlIlllIII[lIlIlIlllIIl[25]];
        strArr[lIlIlIlllIIl[21]] = lIlIlIlllIII[lIlIlIlllIIl[26]];
        strArr[lIlIlIlllIIl[22]] = lIlIlIlllIII[lIlIlIlllIIl[27]];
        strArr[lIlIlIlllIIl[23]] = lIlIlIlllIII[lIlIlIlllIIl[28]];
        strArr[lIlIlIlllIIl[24]] = lIlIlIlllIII[lIlIlIlllIIl[29]];
        strArr[lIlIlIlllIIl[25]] = lIlIlIlllIII[lIlIlIlllIIl[30]];
        strArr[lIlIlIlllIIl[26]] = lIlIlIlllIII[lIlIlIlllIIl[31]];
        strArr[lIlIlIlllIIl[27]] = lIlIlIlllIII[lIlIlIlllIIl[11]];
        strArr[lIlIlIlllIIl[28]] = lIlIlIlllIII[lIlIlIlllIIl[32]];
        strArr[lIlIlIlllIIl[29]] = lIlIlIlllIII[lIlIlIlllIIl[33]];
        strArr[lIlIlIlllIIl[30]] = lIlIlIlllIII[lIlIlIlllIIl[34]];
        strArr[lIlIlIlllIIl[31]] = lIlIlIlllIII[lIlIlIlllIIl[35]];
        ch = strArr;
    }

    private static boolean llIlllllIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllllIIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllllIIIIll(int i) {
        return i != 0;
    }

    private static String llIllllIllllll(String lllllllllllllllIllIIllIllIllIllI, String lllllllllllllllIllIIllIllIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllIllIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllIllIlllIII.init(lIlIlIlllIIl[7], secretKeySpec);
            return new String(lllllllllllllllIllIIllIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIllIllIlll) {
            lllllllllllllllIllIIllIllIllIlll.printStackTrace();
            return null;
        }
    }

    private int b(char c2) {
        String valueOf = String.valueOf(c2);
        int i = lIlIlIlllIIl[5];
        switch (valueOf.hashCode()) {
            case 69:
                if (llIlllllIIIIll(valueOf.equals(lIlIlIlllIII[lIlIlIlllIIl[1]]) ? 1 : 0)) {
                    i = lIlIlIlllIIl[1];
                    "".length();
                    if ((" ".length() & (" ".length() ^ (-" ".length()))) != 0) {
                        return ((((146 + 56) - 64) + 32) ^ (((38 + 73) - 97) + 149)) & (((16 ^ 63) ^ (46 ^ 8)) ^ (-" ".length()));
                    }
                }
                break;
            case 78:
                if (llIlllllIIIIll(valueOf.equals(lIlIlIlllIII[lIlIlIlllIIl[0]]) ? 1 : 0)) {
                    i = lIlIlIlllIIl[0];
                    "".length();
                    if ((-((137 ^ 143) ^ "  ".length())) >= 0) {
                        return ((((65 + 88) - 41) + 17) ^ (((131 + 163) - 144) + 14)) & (((((0 + 15) - (-116)) + 2) ^ (((16 + 35) - 1) + 110)) ^ (-" ".length()));
                    }
                }
                break;
            case 83:
                if (llIlllllIIIIll(valueOf.equals(lIlIlIlllIII[lIlIlIlllIIl[7]]) ? 1 : 0)) {
                    i = lIlIlIlllIIl[7];
                    "".length();
                    if (0 != 0) {
                        return (24 ^ 16) & ((96 ^ 104) ^ (-1));
                    }
                }
                break;
            case 87:
                if (llIlllllIIIIll(valueOf.equals(lIlIlIlllIII[lIlIlIlllIIl[4]]) ? 1 : 0)) {
                    i = lIlIlIlllIIl[4];
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                return lIlIlIlllIIl[8];
            case 1:
                return lIlIlIlllIIl[1];
            case 2:
                return lIlIlIlllIIl[6];
            case 3:
                return lIlIlIlllIIl[5];
            default:
                return lIlIlIlllIIl[0];
        }
    }

    private static String llIlllllIIIIII(String lllllllllllllllIllIIllIlllIIIIll, String lllllllllllllllIllIIllIlllIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIIl[3]), "DES");
            Cipher lllllllllllllllIllIIllIlllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIllIlllIIIlIl.init(lIlIlIlllIIl[7], secretKeySpec);
            return new String(lllllllllllllllIllIIllIlllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIlllIIIlII) {
            lllllllllllllllIllIIllIlllIIIlII.printStackTrace();
            return null;
        }
    }

    private int b(String str) {
        int i = lIlIlIlllIIl[0];
        int i2 = lIlIlIlllIIl[0];
        int lllllllllllllllIllIIllIlllllIIll = lIlIlIlllIIl[0];
        while (llIlllllIIIlII(lllllllllllllllIllIIllIlllllIIll, str.length())) {
            int lllllllllllllllIllIIllIlllllIIIl = b(str.charAt(lllllllllllllllIllIIllIlllllIIll));
            i2 += lllllllllllllllIllIIllIlllllIIIl;
            if (!llIlllllIIlIII(i2) || !llIlllllIIIlII(i2, lIlIlIlllIIl[3]) || ((llIlllllIIIlll(i2, lIlIlIlllIIl[4]) && !llIlllllIIIllI(lllllllllllllllIllIIllIlllllIIIl, lIlIlIlllIIl[5])) || (llIlllllIIIlll(i2, lIlIlIlllIIl[6]) && llIlllllIIIlll(lllllllllllllllIllIIllIlllllIIIl, lIlIlIlllIIl[1])))) {
                i2 -= lllllllllllllllIllIIllIlllllIIIl;
                i -= lllllllllllllllIllIIllIlllllIIIl;
            }
            lllllllllllllllIllIIllIlllllIIll++;
            "".length();
            if (0 != 0) {
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
        }
        return i;
    }

    public static List<K> bR() {
        return cf;
    }
}
