package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.k  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/k.class */
public final class EnumC0010k {
    private final /* synthetic */ EnumC0015p zulrahPos;
    public static final /* synthetic */ EnumC0010k GREEN_CENTER_W;
    public static final /* synthetic */ EnumC0010k MAGMA_CENTER_E;
    public static final /* synthetic */ EnumC0010k GREEN_SOUTH_E;
    public static final /* synthetic */ EnumC0010k GREEN_SOUTH_W;
    public static final /* synthetic */ EnumC0010k JAD_PHASE_E;
    public static final /* synthetic */ EnumC0010k MAGMA_CENTER_NW;
    public static final /* synthetic */ EnumC0010k TANZ_EAST_E;
    public static final /* synthetic */ EnumC0010k GREEN_CENTER_E;
    public static final /* synthetic */ EnumC0010k TANZ_WEST_W;
    public static final /* synthetic */ EnumC0010k TANZ_CENTER_NE;
    public static final /* synthetic */ EnumC0010k TANZ_SOUTH_CW;
    public static final /* synthetic */ EnumC0010k GREEN_EAST_CE;
    private final /* synthetic */ EnumC0013n safeSpot;
    public static final /* synthetic */ EnumC0010k MAGMA_CENTER_NE;
    public static final /* synthetic */ EnumC0010k MAGMA_CENTER_W;
    private static final /* synthetic */ EnumC0010k[] $VALUES;
    public static final /* synthetic */ EnumC0010k GREEN_EAST_E;
    public static final /* synthetic */ EnumC0010k GREEN_EAST_NE;
    private final /* synthetic */ EnumC0017r zulrahType;
    private static /* synthetic */ String[] lIllIllIIlIIl;
    private static /* synthetic */ int[] lIllIllIIlIll;
    public static final /* synthetic */ EnumC0010k INITIAL;
    public static final /* synthetic */ EnumC0010k TANZ_SOUTH_C;
    public static final /* synthetic */ EnumC0010k JAD_PHASE_W;
    public static final /* synthetic */ EnumC0010k TANZ_CENTER_E;
    public static final /* synthetic */ EnumC0010k GREEN_WEST_W;
    public static final /* synthetic */ EnumC0010k TANZ_EAST_NE;

    public EnumC0017r w() {
        return this.zulrahType;
    }

    private static void llIIlIIIllIllIl() {
        lIllIllIIlIll = new int[23];
        lIllIllIIlIll[0] = "  ".length();
        lIllIllIIlIll[1] = " ".length();
        lIllIllIIlIll[2] = ((23 ^ 106) ^ (26 ^ 82)) & (((((87 + 119) - 142) + 79) ^ (((0 + 144) - (-14)) + 28)) ^ (-" ".length()));
        lIllIllIIlIll[3] = "   ".length();
        lIllIllIIlIll[4] = (((21 + 48) - (-63)) + 31) ^ (((128 + 150) - 237) + 126);
        lIllIllIIlIll[5] = 33 ^ 36;
        lIllIllIIlIll[6] = 75 ^ 77;
        lIllIllIIlIll[7] = 175 ^ 168;
        lIllIllIIlIll[8] = 170 ^ 162;
        lIllIllIIlIll[9] = 57 ^ 48;
        lIllIllIIlIll[10] = 106 ^ 96;
        lIllIllIIlIll[11] = (((139 + 90) - 136) + 91) ^ (((40 + 123) - 116) + 132);
        lIllIllIIlIll[12] = (31 ^ 6) ^ (168 ^ 189);
        lIllIllIIlIll[13] = (3 ^ 76) ^ (119 ^ 53);
        lIllIllIIlIll[14] = (225 ^ 140) ^ (33 ^ 66);
        lIllIllIIlIll[15] = (242 ^ 129) ^ (215 ^ 171);
        lIllIllIIlIll[16] = (187 ^ 164) ^ (137 ^ 134);
        lIllIllIIlIll[17] = 128 ^ 145;
        lIllIllIIlIll[18] = 21 ^ 7;
        lIllIllIIlIll[19] = 169 ^ 186;
        lIllIllIIlIll[20] = 9 ^ 29;
        lIllIllIIlIll[21] = (117 ^ 43) ^ (235 ^ 160);
        lIllIllIIlIll[22] = (((81 + 123) - 184) + 112) ^ (((133 + 90) - 149) + 72);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean x() {
        if (!llIIlIIIllIlllI(this.zulrahType, EnumC0017r.JAD_RANGE_FIRST) || llIIlIIIllIllll(this.zulrahType, EnumC0017r.JAD_MAGIC_FIRST)) {
            ?? r0 = lIllIllIIlIll[1];
            "".length();
            return ((107 ^ 61) & ((125 ^ 43) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllIIlIll[2];
    }

    public static EnumC0010k[] values() {
        return (EnumC0010k[]) $VALUES.clone();
    }

    private static boolean llIIlIIIllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean A() {
        if (llIIlIIIllIllll(this.zulrahType, EnumC0017r.MELEE)) {
            ?? r0 = lIllIllIIlIll[1];
            "".length();
            return (22 ^ 18) <= ((81 ^ 5) & ((7 ^ 83) ^ (-1))) ? (true ^ true) & (true ^ true) : r0;
        }
        return lIllIllIIlIll[2];
    }

    private EnumC0010k(String str, int i, EnumC0017r enumC0017r, EnumC0013n enumC0013n, EnumC0015p enumC0015p) {
        this.zulrahType = enumC0017r;
        this.safeSpot = enumC0013n;
        this.zulrahPos = enumC0015p;
    }

    private static String llIIlIIIllIIllI(String llllllllllllllIllIIIlIllIlIllIlI, String llllllllllllllIllIIIlIllIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), lIllIllIIlIll[8]), "DES");
            Cipher llllllllllllllIllIIIlIllIlIllllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllIlIllllI.init(lIllIllIIlIll[0], secretKeySpec);
            return new String(llllllllllllllIllIIIlIllIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllIlIlllII) {
            llllllllllllllIllIIIlIllIlIlllII.printStackTrace();
            return null;
        }
    }

    public WorldPoint a(WorldPoint worldPoint) {
        return worldPoint.dx(this.safeSpot.G()).dy(this.safeSpot.H());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean y() {
        if (llIIlIIIllIllll(this.zulrahType, EnumC0017r.MAGIC)) {
            ?? r0 = lIllIllIIlIll[1];
            "".length();
            return "   ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllIIlIll[2];
    }

    private static String llIIlIIIllIIlIl(String llllllllllllllIllIIIlIllIIlllIII, String llllllllllllllIllIIIlIllIIllIlll) {
        String llllllllllllllIllIIIlIllIIlllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIllIIllIlll.toCharArray();
        int llllllllllllllIllIIIlIllIIllIlII = lIllIllIIlIll[2];
        char[] charArray2 = llllllllllllllIllIIIlIllIIlllIII2.toCharArray();
        int llllllllllllllIllIIIlIllIIlIlIll = charArray2.length;
        int llllllllllllllIllIIIlIllIIlIlIIl = lIllIllIIlIll[2];
        while (llIIlIIIlllIlII(llllllllllllllIllIIIlIllIIlIlIIl, llllllllllllllIllIIIlIllIIlIlIll)) {
            char llllllllllllllIllIIIlIllIIlllIlI = charArray2[llllllllllllllIllIIIlIllIIlIlIIl];
            sb.append((char) (llllllllllllllIllIIIlIllIIlllIlI ^ charArray[llllllllllllllIllIIIlIllIIllIlII % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIllIIllIlII++;
            llllllllllllllIllIIIlIllIIlIlIIl++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0010k valueOf(String str) {
        return (EnumC0010k) Enum.valueOf(EnumC0010k.class, str);
    }

    public WorldPoint b(WorldPoint worldPoint) {
        return worldPoint.dx(this.zulrahPos.G() - lIllIllIIlIll[0]).dy(this.zulrahPos.H() - lIllIllIIlIll[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean z() {
        if (llIIlIIIllIllll(this.zulrahType, EnumC0017r.RANGE)) {
            ?? r0 = lIllIllIIlIll[1];
            "".length();
            return (((((28 + 95) - 90) + 94) ^ (145 ^ 182)) & (((((0 + 82) - (-31)) + 87) ^ (((32 + 111) - 0) + 1)) ^ (-" ".length()))) != (((((115 + 70) - 178) + 124) ^ (((83 + 127) - 171) + 113)) & (((246 ^ 136) ^ (34 ^ 71)) ^ (-" ".length()))) ? ((117 ^ 88) ^ (144 ^ 131)) & (((63 ^ 16) ^ (166 ^ 183)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIlIll[2];
    }

    private static boolean llIIlIIIllIlllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIIlIIIlllIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean B() {
        if (llIIlIIIllIllll(this.zulrahPos, EnumC0015p.CENTER)) {
            ?? r0 = lIllIllIIlIll[1];
            "".length();
            return ((26 ^ 98) ^ (15 ^ 115)) == " ".length() ? ((116 ^ 78) ^ (191 ^ 154)) & (((150 ^ 162) ^ (10 ^ 33)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIlIll[2];
    }

    private static String llIIlIIIllIIlll(String llllllllllllllIllIIIlIllIIIllIIl, String llllllllllllllIllIIIlIllIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIIlIll[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllIIIllIlI) {
            llllllllllllllIllIIIlIllIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIIllIlIlI() {
        lIllIllIIlIIl = new String[lIllIllIIlIll[22]];
        lIllIllIIlIIl[lIllIllIIlIll[2]] = llIIlIIIllIIlIl("Ix8uJz4rHQ==", "jQgsw");
        lIllIllIIlIIl[lIllIllIIlIll[1]] = llIIlIIIllIIlIl("JCAmJwM8NyIxGTw8Jg==", "crcbM");
        lIllIllIIlIIl[lIllIllIIlIll[0]] = llIIlIIIllIIlIl("KD0hAxowKiUVADAsIQ==", "oodFT");
        lIllIllIIlIIl[lIllIllIIlIll[3]] = llIIlIIIllIIlIl("PyIpFTcnNS0DLSc1", "xplPy");
        lIllIllIIlIIl[lIllIllIIlIll[4]] = llIIlIIIllIIllI("TMDyjjmCCXCVMVfANzJBeQ==", "KvUOb");
        lIllIllIIlIIl[lIllIllIIlIll[5]] = llIIlIIIllIIlll("9+PRqfhKFCC1XNsgVUK21g==", "Navkd");
        lIllIllIIlIIl[lIllIllIIlIll[6]] = llIIlIIIllIIllI("hfCBvyxbW4xovbh8+OZhHg==", "XciWZ");
        lIllIllIIlIIl[lIllIllIIlIll[7]] = llIIlIIIllIIlIl("HyEPND0HIAUkJxAsHQ==", "XsJqs");
        lIllIllIIlIIl[lIllIllIIlIll[8]] = llIIlIIIllIIlIl("HjkiIx0GOCgzBxE0Ig==", "YkgfS");
        lIllIllIIlIIl[lIllIllIIlIll[9]] = llIIlIIIllIIlll("txST5creiVB9SJvPmtBY+w==", "wqlPH");
        lIllIllIIlIIl[lIllIllIIlIll[10]] = llIIlIIIllIIllI("FIXgH0o8DTEquRXpxc3S4A==", "gVWFL");
        lIllIllIIlIIl[lIllIllIIlIll[11]] = llIIlIIIllIIlIl("ESINMzUSJhA9NRI=", "EcCij");
        lIllIllIIlIIl[lIllIllIIlIll[12]] = llIIlIIIllIIllI("lJgh5WFgBsfadI07uS81Og==", "XJgHb");
        lIllIllIIlIIl[lIllIllIIlIll[13]] = llIIlIIIllIIlIl("OCY0FDcvIjQaLT44Pw==", "lgzNh");
        lIllIllIIlIIl[lIllIllIIlIll[14]] = llIIlIIIllIIlll("VTPkUL+hYITdjqQ1P2lbRg==", "OugbJ");
        lIllIllIIlIIl[lIllIllIIlIll[15]] = llIIlIIIllIIlll("msFgYXV4jXoXf60xxa8iyg==", "YYqSn");
        lIllIllIIlIIl[lIllIllIIlIll[16]] = llIIlIIIllIIllI("u82YrjGYuCc7aM+SDYjDHQ==", "jNuAM");
        lIllIllIIlIIl[lIllIllIIlIll[17]] = llIIlIIIllIIllI("bcvQsUj0Vw+T0e4e6IT/Ew==", "EOXaG");
        lIllIllIIlIIl[lIllIllIIlIll[18]] = llIIlIIIllIIlIl("HRkWPQkPGxQ+HBUKDj4N", "PXQpH");
        lIllIllIIlIIl[lIllIllIIlIll[19]] = llIIlIIIllIIlIl("NTUUCzMnNxYIJj0mDBE=", "xtSFr");
        lIllIllIIlIIl[lIllIllIIlIll[20]] = llIIlIIIllIIlIl("EBkmLykSGTE1Jh8=", "ZXbpy");
        lIllIllIIlIIl[lIllIllIIlIll[21]] = llIIlIIIllIIlll("K/Z+H844D1oODpgot9YP5g==", "XElvH");
    }

    static {
        llIIlIIIllIllIl();
        llIIlIIIllIlIlI();
        INITIAL = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[2]], lIllIllIIlIll[2], EnumC0017r.RANGE, EnumC0013n.NORTH_EAST, EnumC0015p.CENTER);
        GREEN_EAST_NE = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[1]], lIllIllIIlIll[1], EnumC0017r.RANGE, EnumC0013n.NORTH_EAST, EnumC0015p.EAST);
        GREEN_EAST_CE = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[0]], lIllIllIIlIll[0], EnumC0017r.RANGE, EnumC0013n.CENTER_EAST, EnumC0015p.EAST);
        GREEN_EAST_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[3]], lIllIllIIlIll[3], EnumC0017r.RANGE, EnumC0013n.EAST, EnumC0015p.EAST);
        GREEN_CENTER_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[4]], lIllIllIIlIll[4], EnumC0017r.RANGE, EnumC0013n.WEST, EnumC0015p.CENTER);
        GREEN_CENTER_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[5]], lIllIllIIlIll[5], EnumC0017r.RANGE, EnumC0013n.EAST, EnumC0015p.CENTER);
        GREEN_WEST_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[6]], lIllIllIIlIll[6], EnumC0017r.RANGE, EnumC0013n.WEST, EnumC0015p.WEST);
        GREEN_SOUTH_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[7]], lIllIllIIlIll[7], EnumC0017r.RANGE, EnumC0013n.WEST, EnumC0015p.SOUTH);
        GREEN_SOUTH_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[8]], lIllIllIIlIll[8], EnumC0017r.RANGE, EnumC0013n.EAST, EnumC0015p.SOUTH);
        TANZ_EAST_NE = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[9]], lIllIllIIlIll[9], EnumC0017r.MAGIC, EnumC0013n.NORTH_EAST, EnumC0015p.EAST);
        TANZ_EAST_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[10]], lIllIllIIlIll[10], EnumC0017r.MAGIC, EnumC0013n.EAST, EnumC0015p.EAST);
        TANZ_WEST_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[11]], lIllIllIIlIll[11], EnumC0017r.MAGIC, EnumC0013n.WEST, EnumC0015p.WEST);
        TANZ_CENTER_NE = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[12]], lIllIllIIlIll[12], EnumC0017r.MAGIC, EnumC0013n.NORTH_EAST, EnumC0015p.CENTER);
        TANZ_CENTER_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[13]], lIllIllIIlIll[13], EnumC0017r.MAGIC, EnumC0013n.EAST, EnumC0015p.CENTER);
        TANZ_SOUTH_CW = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[14]], lIllIllIIlIll[14], EnumC0017r.MAGIC, EnumC0013n.CENTER_WEST, EnumC0015p.SOUTH);
        TANZ_SOUTH_C = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[15]], lIllIllIIlIll[15], EnumC0017r.MAGIC, EnumC0013n.CENTER, EnumC0015p.SOUTH);
        MAGMA_CENTER_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[16]], lIllIllIIlIll[16], EnumC0017r.MELEE, EnumC0013n.EAST, EnumC0015p.CENTER);
        MAGMA_CENTER_NW = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[17]], lIllIllIIlIll[17], EnumC0017r.MELEE, EnumC0013n.NORTH_WEST, EnumC0015p.CENTER);
        MAGMA_CENTER_NE = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[18]], lIllIllIIlIll[18], EnumC0017r.MELEE, EnumC0013n.NORTH_EAST, EnumC0015p.CENTER);
        MAGMA_CENTER_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[19]], lIllIllIIlIll[19], EnumC0017r.MELEE, EnumC0013n.WEST, EnumC0015p.CENTER);
        JAD_PHASE_E = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[20]], lIllIllIIlIll[20], EnumC0017r.JAD_MAGIC_FIRST, EnumC0013n.EAST, EnumC0015p.EAST);
        JAD_PHASE_W = new EnumC0010k(lIllIllIIlIIl[lIllIllIIlIll[21]], lIllIllIIlIll[21], EnumC0017r.JAD_RANGE_FIRST, EnumC0013n.WEST, EnumC0015p.WEST);
        EnumC0010k[] enumC0010kArr = new EnumC0010k[lIllIllIIlIll[22]];
        enumC0010kArr[lIllIllIIlIll[2]] = INITIAL;
        enumC0010kArr[lIllIllIIlIll[1]] = GREEN_EAST_NE;
        enumC0010kArr[lIllIllIIlIll[0]] = GREEN_EAST_CE;
        enumC0010kArr[lIllIllIIlIll[3]] = GREEN_EAST_E;
        enumC0010kArr[lIllIllIIlIll[4]] = GREEN_CENTER_W;
        enumC0010kArr[lIllIllIIlIll[5]] = GREEN_CENTER_E;
        enumC0010kArr[lIllIllIIlIll[6]] = GREEN_WEST_W;
        enumC0010kArr[lIllIllIIlIll[7]] = GREEN_SOUTH_W;
        enumC0010kArr[lIllIllIIlIll[8]] = GREEN_SOUTH_E;
        enumC0010kArr[lIllIllIIlIll[9]] = TANZ_EAST_NE;
        enumC0010kArr[lIllIllIIlIll[10]] = TANZ_EAST_E;
        enumC0010kArr[lIllIllIIlIll[11]] = TANZ_WEST_W;
        enumC0010kArr[lIllIllIIlIll[12]] = TANZ_CENTER_NE;
        enumC0010kArr[lIllIllIIlIll[13]] = TANZ_CENTER_E;
        enumC0010kArr[lIllIllIIlIll[14]] = TANZ_SOUTH_CW;
        enumC0010kArr[lIllIllIIlIll[15]] = TANZ_SOUTH_C;
        enumC0010kArr[lIllIllIIlIll[16]] = MAGMA_CENTER_E;
        enumC0010kArr[lIllIllIIlIll[17]] = MAGMA_CENTER_NW;
        enumC0010kArr[lIllIllIIlIll[18]] = MAGMA_CENTER_NE;
        enumC0010kArr[lIllIllIIlIll[19]] = MAGMA_CENTER_W;
        enumC0010kArr[lIllIllIIlIll[20]] = JAD_PHASE_E;
        enumC0010kArr[lIllIllIIlIll[21]] = JAD_PHASE_W;
        $VALUES = enumC0010kArr;
    }
}
