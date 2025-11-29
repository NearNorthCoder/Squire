package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.config.ConfigManager;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/x.class */
public final class C0049x {
    private final /* synthetic */ boolean aX;
    private final /* synthetic */ EnumC0020at aY;
    private final /* synthetic */ EnumC0016ap aZ;
    private final /* synthetic */ EnumC0016ap ba;
    private final /* synthetic */ EnumC0019as bd;
    private final /* synthetic */ EnumC0017aq bc;
    private static /* synthetic */ String[] llIIIIllllll;
    private final /* synthetic */ EnumC0018ar bb;
    private final /* synthetic */ EnumC0024ax be;
    private static /* synthetic */ int[] llIIIlIIIIll;
    private final /* synthetic */ Boolean bf;

    public Boolean ar() {
        return this.bf;
    }

    private InterfaceC0023aw D(N n) {
        switch (C0050y.bg[n.aL().ordinal()]) {
            case 1:
                return this.bb;
            case 2:
                return this.aY;
            case 3:
                if (llllIIlllllIII(n.ac())) {
                    return null;
                }
                return llllIIllllIlll(n.ac().contains(llIIIIllllll[llIIIlIIIIll[10]]) ? 1 : 0) ? this.aZ : this.ba;
            case 4:
                return this.bc;
            case 5:
                return this.be;
            case 6:
                return this.bd;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean ai() {
        if (llllIIllllIllI(this.bf) && llllIIllllIlll(this.bf.booleanValue() ? 1 : 0)) {
            ?? r0 = llIIIlIIIIll[1];
            "".length();
            return " ".length() == 0 ? ((((31 + 65) - 82) + 161) ^ (((94 + 103) - 68) + 58)) & (((71 ^ 46) ^ (22 ^ 107)) ^ (-" ".length())) : r0;
        }
        return llIIIlIIIIll[0];
    }

    private static boolean llllIIllllllII(int i, int i2) {
        return i < i2;
    }

    private static void llllIIllllIlIl() {
        llIIIlIIIIll = new int[17];
        llIIIlIIIIll[0] = ((((1 + 168) - (-31)) + 17) ^ (((88 + 89) - 35) + 1)) & (((34 ^ 59) ^ (79 ^ 0)) ^ (-" ".length()));
        llIIIlIIIIll[1] = " ".length();
        llIIIlIIIIll[2] = "  ".length();
        llIIIlIIIIll[3] = "   ".length();
        llIIIlIIIIll[4] = 95 ^ 91;
        llIIIlIIIIll[5] = (206 ^ 191) ^ (73 ^ 61);
        llIIIlIIIIll[6] = (104 ^ 44) ^ (125 ^ 63);
        llIIIlIIIIll[7] = (((80 + 45) - (-20)) + 5) ^ (((20 + 63) - (-31)) + 31);
        llIIIlIIIIll[8] = 81 ^ 89;
        llIIIlIIIIll[9] = 145 ^ 152;
        llIIIlIIIIll[10] = (225 ^ 199) ^ (131 ^ 175);
        llIIIlIIIIll[11] = (((133 + 14) - 25) + 37) ^ (((45 + 25) - 3) + 81);
        llIIIlIIIIll[12] = (((74 + 43) - (-28)) + 36) ^ (((133 + 121) - 138) + 26);
        llIIIlIIIIll[13] = 74 ^ 5;
        llIIIlIIIIll[14] = 125 ^ 28;
        llIIIlIIIIll[15] = 149 ^ 190;
        llIIIlIIIIll[16] = (67 ^ 108) ^ (75 ^ 104);
    }

    public boolean aj() {
        return this.aX;
    }

    private static boolean llllIIlllllIlI(int i) {
        return i == 0;
    }

    private static boolean llllIIlllllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIllllIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i2 = llIIIlIIIIll[12];
        int i3 = llIIIlIIIIll[1] * llIIIlIIIIll[12];
        if (llllIIllllIlll(aj() ? 1 : 0)) {
            i = llIIIlIIIIll[13];
            "".length();
            if (0 != 0) {
                return (118 ^ 58) & ((195 ^ 143) ^ (-1));
            }
        } else {
            i = llIIIlIIIIll[14];
        }
        int i4 = i3 + i;
        Boolean ar = ar();
        int i5 = i4 * llIIIlIIIIll[12];
        if (llllIIlllllIII(ar)) {
            hashCode = llIIIlIIIIll[15];
            "".length();
            if (((39 ^ 17) & ((12 ^ 58) ^ (-1))) < 0) {
                return (208 ^ 147) & ((102 ^ 37) ^ (-1));
            }
        } else {
            hashCode = ar.hashCode();
        }
        int i6 = i5 + hashCode;
        EnumC0020at ak = ak();
        int i7 = i6 * llIIIlIIIIll[12];
        if (llllIIlllllIII(ak)) {
            hashCode2 = llIIIlIIIIll[15];
            "".length();
            if ("  ".length() < "  ".length()) {
                return (184 ^ 159) & ((48 ^ 23) ^ (-1));
            }
        } else {
            hashCode2 = ak.hashCode();
        }
        int i8 = i7 + hashCode2;
        EnumC0016ap al = al();
        int i9 = i8 * llIIIlIIIIll[12];
        if (llllIIlllllIII(al)) {
            hashCode3 = llIIIlIIIIll[15];
            "".length();
            if ("   ".length() >= (56 ^ 60)) {
                return (137 ^ 193) & ((227 ^ 171) ^ (-1));
            }
        } else {
            hashCode3 = al.hashCode();
        }
        int i10 = i9 + hashCode3;
        EnumC0016ap am = am();
        int i11 = i10 * llIIIlIIIIll[12];
        if (llllIIlllllIII(am)) {
            hashCode4 = llIIIlIIIIll[15];
            "".length();
            if (0 != 0) {
                return (34 ^ 18) & ((183 ^ 135) ^ (-1));
            }
        } else {
            hashCode4 = am.hashCode();
        }
        int i12 = i11 + hashCode4;
        EnumC0018ar an = an();
        int i13 = i12 * llIIIlIIIIll[12];
        if (llllIIlllllIII(an)) {
            hashCode5 = llIIIlIIIIll[15];
            "".length();
            if ("  ".length() < ((166 ^ 171) & ((14 ^ 3) ^ (-1)))) {
                return (179 ^ 166) & ((69 ^ 80) ^ (-1));
            }
        } else {
            hashCode5 = an.hashCode();
        }
        int i14 = i13 + hashCode5;
        EnumC0017aq ao = ao();
        int i15 = i14 * llIIIlIIIIll[12];
        if (llllIIlllllIII(ao)) {
            hashCode6 = llIIIlIIIIll[15];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (114 ^ 69) & ((95 ^ 104) ^ (-1));
            }
        } else {
            hashCode6 = ao.hashCode();
        }
        int i16 = i15 + hashCode6;
        EnumC0019as ap = ap();
        int i17 = i16 * llIIIlIIIIll[12];
        if (llllIIlllllIII(ap)) {
            hashCode7 = llIIIlIIIIll[15];
            "".length();
            if (0 != 0) {
                return ((((61 + 104) - 94) + 154) ^ (((35 + 97) - 0) + 31)) & (((151 ^ 128) ^ (5 ^ 80)) ^ (-" ".length()));
            }
        } else {
            hashCode7 = ap.hashCode();
        }
        int i18 = i17 + hashCode7;
        EnumC0024ax aq = aq();
        int i19 = i18 * llIIIlIIIIll[12];
        if (llllIIlllllIII(aq)) {
            hashCode8 = llIIIlIIIIll[15];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((((194 + 92) - 129) + 38) ^ (((127 + 101) - 217) + 122)) & (((179 ^ 189) ^ (192 ^ 136)) ^ (-" ".length()));
            }
        } else {
            hashCode8 = aq.hashCode();
        }
        return i19 + hashCode8;
    }

    public EnumC0017aq ao() {
        return this.bc;
    }

    private static <T> T a(ConfigManager configManager, String str, String str2, Class<T> cls) {
        return (T) configManager.getConfiguration(llIIIIllllll[llIIIlIIIIll[9]], str + "." + str2, cls);
    }

    public EnumC0019as ap() {
        return this.bd;
    }

    private static boolean llllIIllllIlll(int i) {
        return i != 0;
    }

    public String toString() {
        return "LocationProfile(enabled=" + aj() + ", herbType=" + String.valueOf(ak()) + ", north=" + String.valueOf(al()) + ", south=" + String.valueOf(am()) + ", flower=" + String.valueOf(an()) + ", bush=" + String.valueOf(ao()) + ", grape=" + String.valueOf(ap()) + ", seaweed=" + String.valueOf(aq()) + ", bin=" + ar() + ")";
    }

    public EnumC0016ap am() {
        return this.ba;
    }

    public EnumC0024ax aq() {
        return this.be;
    }

    public EnumC0022av C(N n) {
        return a(D(n));
    }

    private static void llllIIlllIllII() {
        llIIIIllllll = new String[llIIIlIIIIll[16]];
        llIIIIllllll[llIIIlIIIIll[0]] = llllIIlllIIlll("cNz2UKtG1k0=", "bqZEe");
        llIIIIllllll[llIIIlIIIIll[1]] = llllIIlllIlIII("jCEYZAWiiMo=", "iRVjQ");
        llIIIIllllll[llIIIlIIIIll[2]] = llllIIlllIlIIl("BwIrMhIT", "anDEw");
        llIIIIllllll[llIIIlIIIIll[3]] = llllIIlllIIlll("hwiZgi8fcpYjakGyqueddg==", "BTwNr");
        llIIIIllllll[llIIIlIIIIll[4]] = llllIIlllIlIIl("IycdOjUvLh8hbzEkBCEp", "BKqUA");
        llIIIIllllll[llIIIlIIIIll[5]] = llllIIlllIlIII("aOrjaufKd3M=", "gKjDu");
        llIIIIllllll[llIIIlIIIIll[6]] = llllIIlllIlIII("w87p3X9tlFA=", "WrTuK");
        llIIIIllllll[llIIIlIIIIll[7]] = llllIIlllIlIIl("ERkJJTYF", "vkhUS");
        llIIIIllllll[llIIIlIIIIll[8]] = llllIIlllIlIII("ZNTIJa0fplA=", "ZSHuw");
        llIIIIllllll[llIIIlIIIIll[9]] = llllIIlllIlIIl("BzQCBAARIxYfHxE3", "tEwmr");
        llIIIIllllll[llIIIlIIIIll[10]] = llllIIlllIIlll("pe8V6ELLVqU=", "mswdh");
        llIIIIllllll[llIIIlIIIIll[11]] = llllIIlllIIlll("FFaz5i4oO5U=", "kePzA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean F(N n) {
        InterfaceC0023aw D = D(n);
        if (llllIIllllIlll(this.aX ? 1 : 0) && llllIIllllIllI(D) && llllIIllllIllI(D.bf())) {
            ?? r0 = llIIIlIIIIll[1];
            "".length();
            return " ".length() > "  ".length() ? ((((120 + 101) - 134) + 81) ^ (((136 + 71) - 176) + 108)) & (((237 ^ 197) ^ (170 ^ 161)) ^ (-" ".length())) : r0;
        }
        return llIIIlIIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean E(N n) {
        P aL = n.aL();
        if (llllIIlllllIIl(aL, P.ALLOTMENT)) {
            if (llllIIllllIlll(n.ac().contains(llIIIIllllll[llIIIlIIIIll[11]]) ? 1 : 0)) {
                if (llllIIllllIllI(this.aZ)) {
                    ?? r0 = llIIIlIIIIll[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIlIIIIll[0];
            } else if (llllIIllllIllI(this.ba)) {
                ?? r02 = llIIIlIIIIll[1];
                "".length();
                return (161 ^ 165) <= ((76 ^ 96) & ((121 ^ 85) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
            } else {
                return llIIIlIIIIll[0];
            }
        } else if ((!llllIIlllllIIl(aL, P.HERB) || llllIIlllllIII(this.aY)) && ((!llllIIlllllIIl(aL, P.FLOWER) || llllIIlllllIII(this.bb)) && ((!llllIIlllllIIl(aL, P.BUSH) || llllIIlllllIII(this.bc)) && ((!llllIIlllllIIl(aL, P.GRAPES) || llllIIlllllIII(this.bd)) && !(llllIIlllllIIl(aL, P.SEAWEED) && llllIIllllIllI(this.be)))))) {
            return llIIIlIIIIll[0];
        } else {
            ?? r03 = llIIIlIIIIll[1];
            "".length();
            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
        }
    }

    private static String llllIIlllIIlll(String lllllllllllllllIlIlIlIIIlllIlllI, String lllllllllllllllIlIlIlIIIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIIIIll[2], lllllllllllllllIlIlIlIIIllllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIIlllIllll) {
            lllllllllllllllIlIlIlIIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static String llllIIlllIlIII(String lllllllllllllllIlIlIlIIlIIIlIIll, String lllllllllllllllIlIlIlIIlIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIIlIIIIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIIIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIlIIIlIlII) {
            lllllllllllllllIlIlIlIIlIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlllllIII(Object obj) {
        return obj == null;
    }

    public EnumC0018ar an() {
        return this.bb;
    }

    private static boolean llllIIlllllIll(int i, int i2) {
        return i != i2;
    }

    public C0049x(boolean z, EnumC0020at enumC0020at, EnumC0016ap enumC0016ap, EnumC0016ap enumC0016ap2, EnumC0018ar enumC0018ar, EnumC0017aq enumC0017aq, EnumC0019as enumC0019as, EnumC0024ax enumC0024ax, Boolean bool) {
        this.aX = z;
        this.aY = enumC0020at;
        this.aZ = enumC0016ap;
        this.ba = enumC0016ap2;
        this.bb = enumC0018ar;
        this.bc = enumC0017aq;
        this.bd = enumC0019as;
        this.be = enumC0024ax;
        this.bf = bool;
    }

    private static String llllIIlllIlIIl(String lllllllllllllllIlIlIlIIlIIIIIIll, String lllllllllllllllIlIlIlIIlIIIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIIlIIIIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIlIIlIIIIIIlI.toCharArray();
        int lllllllllllllllIlIlIlIIIllllllll = llIIIlIIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIlIlIIIllllIlll = llIIIlIIIIll[0];
        while (llllIIllllllII(lllllllllllllllIlIlIlIIIllllIlll, length)) {
            lllllllllllllllIlIlIlIIlIIIIIIIl.append((char) (charArray2[lllllllllllllllIlIlIlIIIllllIlll] ^ charArray[lllllllllllllllIlIlIlIIIllllllll % charArray.length]));
            "".length();
            lllllllllllllllIlIlIlIIIllllllll++;
            lllllllllllllllIlIlIlIIIllllIlll++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlIIlIIIIIIIl);
    }

    public EnumC0016ap al() {
        return this.aZ;
    }

    public static C0049x a(ConfigManager configManager, EnumC0041p enumC0041p) {
        String lowerCase = enumC0041p.toString().toLowerCase();
        boolean booleanValue = ((Boolean) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[0]], Boolean.TYPE)).booleanValue();
        EnumC0020at enumC0020at = (EnumC0020at) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[1]], EnumC0020at.class);
        EnumC0018ar enumC0018ar = (EnumC0018ar) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[2]], EnumC0018ar.class);
        return new C0049x(booleanValue, enumC0020at, (EnumC0016ap) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[3]], EnumC0016ap.class), (EnumC0016ap) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[4]], EnumC0016ap.class), enumC0018ar, (EnumC0017aq) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[5]], EnumC0017aq.class), (EnumC0019as) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[7]], EnumC0019as.class), (EnumC0024ax) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[6]], EnumC0024ax.class), (Boolean) a(configManager, lowerCase, llIIIIllllll[llIIIlIIIIll[8]], Boolean.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0357, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b4, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0225, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0272, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ce, code lost:
        if (llllIIlllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v171, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v183, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllIIlllllIIl(obj, this)) {
            return llIIIlIIIIll[1];
        }
        if (llllIIlllllIlI(obj instanceof C0049x ? 1 : 0)) {
            return llIIIlIIIIll[0];
        }
        C0049x c0049x = (C0049x) obj;
        if (llllIIlllllIll(aj() ? 1 : 0, c0049x.aj() ? 1 : 0)) {
            return llIIIlIIIIll[0];
        }
        Boolean ar = ar();
        Boolean ar2 = c0049x.ar();
        if (llllIIlllllIII(ar)) {
            if (llllIIllllIllI(ar2)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & (true ^ true);
                }
                return llIIIlIIIIll[0];
            }
            EnumC0020at ak = ak();
            EnumC0020at ak2 = c0049x.ak();
            if (llllIIlllllIII(ak)) {
                if (llllIIllllIllI(ak2)) {
                    "".length();
                    if (" ".length() <= ((225 ^ 177) & ((221 ^ 141) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llIIIlIIIIll[0];
                }
                EnumC0016ap al = al();
                EnumC0016ap al2 = c0049x.al();
                if (llllIIlllllIII(al)) {
                    if (llllIIllllIllI(al2)) {
                        "".length();
                        if (0 != 0) {
                            return ((((44 + 79) - 107) + 193) ^ (((34 + 6) - (-90)) + 49)) & ((" ".length() ^ (241 ^ 146)) ^ (-" ".length()));
                        }
                        return llIIIlIIIIll[0];
                    }
                    EnumC0016ap am = am();
                    EnumC0016ap am2 = c0049x.am();
                    if (llllIIlllllIII(am)) {
                        if (llllIIllllIllI(am2)) {
                            "".length();
                            if (" ".length() < " ".length()) {
                                return ((((22 + 16) - (-50)) + 45) ^ (((150 + 70) - 129) + 89)) & (((247 ^ 181) ^ (247 ^ 132)) ^ (-" ".length()));
                            }
                            return llIIIlIIIIll[0];
                        }
                        EnumC0018ar an = an();
                        EnumC0018ar an2 = c0049x.an();
                        if (llllIIlllllIII(an)) {
                            if (llllIIllllIllI(an2)) {
                                "".length();
                                if ("   ".length() <= 0) {
                                    return ((141 ^ 128) ^ (154 ^ 196)) & (((((96 + 157) - 227) + 166) ^ (((97 + 78) - 158) + 130)) ^ (-" ".length()));
                                }
                                return llIIIlIIIIll[0];
                            }
                            EnumC0017aq ao = ao();
                            EnumC0017aq ao2 = c0049x.ao();
                            if (llllIIlllllIII(ao)) {
                                if (llllIIllllIllI(ao2)) {
                                    "".length();
                                    if ("   ".length() <= 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                    return llIIIlIIIIll[0];
                                }
                                EnumC0019as ap = ap();
                                EnumC0019as ap2 = c0049x.ap();
                                if (llllIIlllllIII(ap)) {
                                    if (llllIIllllIllI(ap2)) {
                                        "".length();
                                        if (0 != 0) {
                                            return ((225 ^ 178) ^ (11 ^ 72)) & (((185 ^ 135) ^ (114 ^ 92)) ^ (-" ".length()));
                                        }
                                        return llIIIlIIIIll[0];
                                    }
                                    EnumC0024ax aq = aq();
                                    EnumC0024ax aq2 = c0049x.aq();
                                    if (llllIIlllllIII(aq)) {
                                        if (llllIIllllIllI(aq2)) {
                                            "".length();
                                            if ("   ".length() == ((30 ^ 101) ^ (((18 + 70) - (-1)) + 38))) {
                                                return ((((223 + 118) - 285) + 179) ^ (((54 + 73) - 0) + 64)) & (((((207 + 143) - 150) + 17) ^ (((118 + 17) - 35) + 41)) ^ (-" ".length()));
                                            }
                                            return llIIIlIIIIll[0];
                                        }
                                        return llIIIlIIIIll[1];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private EnumC0022av a(InterfaceC0023aw interfaceC0023aw) {
        if (llllIIlllllIII(interfaceC0023aw)) {
            "".length();
            return ((((119 + 90) - 111) + 51) ^ (((50 + 96) - 127) + 126)) <= 0 ? null : null;
        }
        return interfaceC0023aw.bf();
    }

    static {
        llllIIllllIlIl();
        llllIIlllIllII();
    }

    public EnumC0020at ak() {
        return this.aY;
    }
}
