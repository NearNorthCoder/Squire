package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.H  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/H.class */
public final class H {
    /* synthetic */ G west;
    public static final /* synthetic */ H CRABS_SINGLE;
    public static final /* synthetic */ H CRABS_DOUBLE_1;
    private static /* synthetic */ int[] lIlIlIlIIlll;
    public static final /* synthetic */ H CRABS_MOVABLE_3;
    private static /* synthetic */ String[] lIlIlIlIIllI;
    public static final /* synthetic */ H TEKTON_START;
    /* synthetic */ G east;
    public static final /* synthetic */ H CRABS_MOVABLE_4;
    public static final /* synthetic */ H CRABS_MOVABLE_1;
    /* synthetic */ G north;
    public static final /* synthetic */ H MYSTICS_SAFESPOT;
    public static final /* synthetic */ H CRABS_BASE_1;
    public static final /* synthetic */ H CRABS_DOUBLE_2;
    public static final /* synthetic */ H CRABS_BASE_2;
    public static final /* synthetic */ H VESPULA_ATTACK_POINT;
    private static final /* synthetic */ H[] $VALUES;
    public static final /* synthetic */ H CRABS_MOVABLE_2;

    private static void llIlllIllllIll() {
        lIlIlIlIIllI = new String[lIlIlIlIIlll[23]];
        lIlIlIlIIllI[lIlIlIlIIlll[0]] = llIlllIllllIII("Oj/1fqN42Ezbt6XBL85WqA==", "buFUg");
        lIlIlIlIIllI[lIlIlIlIIlll[4]] = llIlllIllllIIl("FBc3DxQIBzceAgh0", "WEvMG");
        lIlIlIlIIllI[lIlIlIlIIlll[10]] = llIlllIllllIII("Vhj4vRbGuQyBcYankZkSTw==", "LhkqX");
        lIlIlIlIIllI[lIlIlIlIIlll[14]] = llIlllIllllIII("mnXzdFSPTyWa/wZS9uiowg==", "Jaceo");
        lIlIlIlIIllI[lIlIlIlIIlll[16]] = llIlllIllllIIl("DiIMARsSPQIVCQ88CBx6", "MpMCH");
        lIlIlIlIIllI[lIlIlIlIIlll[18]] = llIlllIllllIlI("49a0GefHVAOlDlpvSbJU9A==", "DBsVD");
        lIlIlIlIIllI[lIlIlIlIIlll[20]] = llIlllIllllIIl("OgAsFzQmHyIDJjseKApT", "yRmUg");
        lIlIlIlIIllI[lIlIlIlIIlll[8]] = llIlllIllllIII("fQA/dwRsd5yCJySi89wi/A==", "ODqka");
        lIlIlIlIIllI[lIlIlIlIIlll[12]] = llIlllIllllIIl("CT8EGjsVKQoNKgYoGmk=", "JmEXh");
        lIlIlIlIIllI[lIlIlIlIIlll[6]] = llIlllIllllIII("RxhRi4ymfknpAtDfgRfz6A==", "fXziS");
        lIlIlIlIIllI[lIlIlIlIIlll[2]] = llIlllIllllIIl("AhUbDA4MHxcLBgkJGwgIGw==", "OLHXG");
        lIlIlIlIIllI[lIlIlIlIIlll[21]] = llIlllIllllIII("tRaBcXyA4vrqyR6SLh9vKlxpgVF8vWS8", "yELyD");
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }

    public G d(C0039n c0039n) {
        switch (I.cc[c0039n.bx.ordinal()]) {
            case 1:
                return this.east;
            case 2:
                return this.north;
            case 3:
                return this.west;
            default:
                return this.east;
        }
    }

    private static String llIlllIllllIII(String lllllllllllllllIllIlIIIIIIlIlIll, String lllllllllllllllIllIlIIIIIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIIIIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIIIIIlIllIl.init(lIlIlIlIIlll[10], secretKeySpec);
            return new String(lllllllllllllllIllIlIIIIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIIIIlIllII) {
            lllllllllllllllIllIlIIIIIIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        llIlllIlllllII();
        llIlllIllllIll();
        TEKTON_START = new H(lIlIlIlIIllI[lIlIlIlIIlll[0]], lIlIlIlIIlll[0], new G(lIlIlIlIIlll[1], lIlIlIlIIlll[2]), new G(lIlIlIlIIlll[3], lIlIlIlIIlll[1]), new G(lIlIlIlIIlll[1], lIlIlIlIIlll[2]));
        CRABS_BASE_1 = new H(lIlIlIlIIllI[lIlIlIlIIlll[4]], lIlIlIlIIlll[4], new G(lIlIlIlIIlll[5], lIlIlIlIIlll[6]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[8], lIlIlIlIIlll[9]));
        CRABS_BASE_2 = new H(lIlIlIlIIllI[lIlIlIlIIlll[10]], lIlIlIlIIlll[10], new G(lIlIlIlIIlll[11], lIlIlIlIIlll[8]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[12], lIlIlIlIIlll[13]));
        CRABS_MOVABLE_1 = new H(lIlIlIlIIllI[lIlIlIlIIlll[14]], lIlIlIlIIlll[14], new G(lIlIlIlIIlll[15], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[2], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_2 = new H(lIlIlIlIIllI[lIlIlIlIIlll[16]], lIlIlIlIIlll[16], new G(lIlIlIlIIlll[17], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[9], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_3 = new H(lIlIlIlIIllI[lIlIlIlIIlll[18]], lIlIlIlIIlll[18], new G(lIlIlIlIIlll[19], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_MOVABLE_4 = new H(lIlIlIlIIllI[lIlIlIlIIlll[20]], lIlIlIlIIlll[20], new G(lIlIlIlIIlll[9], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_SINGLE = new H(lIlIlIlIIllI[lIlIlIlIIlll[8]], lIlIlIlIIlll[8], new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[21], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_1 = new H(lIlIlIlIIllI[lIlIlIlIIlll[12]], lIlIlIlIIlll[12], new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[2], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_2 = new H(lIlIlIlIIllI[lIlIlIlIIlll[6]], lIlIlIlIIlll[6], new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[21], lIlIlIlIIlll[11]));
        MYSTICS_SAFESPOT = new H(lIlIlIlIIllI[lIlIlIlIIlll[2]], lIlIlIlIIlll[2], new G(lIlIlIlIIlll[6], lIlIlIlIIlll[6]), new G(lIlIlIlIIlll[15], lIlIlIlIIlll[15]), new G(lIlIlIlIIlll[15], lIlIlIlIIlll[6]));
        VESPULA_ATTACK_POINT = new H(lIlIlIlIIllI[lIlIlIlIIlll[21]], lIlIlIlIIlll[21], new G(lIlIlIlIIlll[22], lIlIlIlIIlll[23]), new G(lIlIlIlIIlll[1], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[19], lIlIlIlIIlll[23]));
        H[] hArr = new H[lIlIlIlIIlll[23]];
        hArr[lIlIlIlIIlll[0]] = TEKTON_START;
        hArr[lIlIlIlIIlll[4]] = CRABS_BASE_1;
        hArr[lIlIlIlIIlll[10]] = CRABS_BASE_2;
        hArr[lIlIlIlIIlll[14]] = CRABS_MOVABLE_1;
        hArr[lIlIlIlIIlll[16]] = CRABS_MOVABLE_2;
        hArr[lIlIlIlIIlll[18]] = CRABS_MOVABLE_3;
        hArr[lIlIlIlIIlll[20]] = CRABS_MOVABLE_4;
        hArr[lIlIlIlIIlll[8]] = CRABS_SINGLE;
        hArr[lIlIlIlIIlll[12]] = CRABS_DOUBLE_1;
        hArr[lIlIlIlIIlll[6]] = CRABS_DOUBLE_2;
        hArr[lIlIlIlIIlll[2]] = MYSTICS_SAFESPOT;
        hArr[lIlIlIlIIlll[21]] = VESPULA_ATTACK_POINT;
        $VALUES = hArr;
    }

    private static boolean llIlllIlllllIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlllIllllIlI(String lllllllllllllllIllIlIIIIIIIllllI, String lllllllllllllllIllIlIIIIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIIlll[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIIIIIlllll) {
            lllllllllllllllIllIlIIIIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llIlllIlllllII() {
        lIlIlIlIIlll = new int[24];
        lIlIlIlIIlll[0] = (18 ^ 66) & ((42 ^ 122) ^ (-1));
        lIlIlIlIIlll[1] = 109 ^ 98;
        lIlIlIlIIlll[2] = (95 ^ 101) ^ (241 ^ 193);
        lIlIlIlIIlll[3] = 125 ^ 104;
        lIlIlIlIIlll[4] = " ".length();
        lIlIlIlIIlll[5] = 4 ^ 29;
        lIlIlIlIIlll[6] = 34 ^ 43;
        lIlIlIlIIlll[7] = -" ".length();
        lIlIlIlIIlll[8] = (((165 + 166) - 224) + 65) ^ (((99 + 74) - 82) + 80);
        lIlIlIlIIlll[9] = 156 ^ 146;
        lIlIlIlIIlll[10] = "  ".length();
        lIlIlIlIIlll[11] = 178 ^ 170;
        lIlIlIlIIlll[12] = (((20 + 57) - (-51)) + 10) ^ (((91 + 115) - 171) + 95);
        lIlIlIlIIlll[13] = 171 ^ 187;
        lIlIlIlIIlll[14] = "   ".length();
        lIlIlIlIIlll[15] = 168 ^ 190;
        lIlIlIlIIlll[16] = (((66 + 167) - 142) + 83) ^ (((163 + 106) - 268) + 169);
        lIlIlIlIIlll[17] = (56 ^ 114) ^ (202 ^ 146);
        lIlIlIlIIlll[18] = 138 ^ 143;
        lIlIlIlIIlll[19] = 128 ^ 145;
        lIlIlIlIIlll[20] = (98 ^ 9) ^ (117 ^ 24);
        lIlIlIlIIlll[21] = 90 ^ 81;
        lIlIlIlIIlll[22] = (((4 + 93) - (-66)) + 19) ^ (((59 + 91) - 142) + 179);
        lIlIlIlIIlll[23] = 31 ^ 19;
    }

    private static String llIlllIllllIIl(String lllllllllllllllIllIlIIIIIlIIIIII, String lllllllllllllllIllIlIIIIIIllllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIlIIIIIIllllIl = lllllllllllllllIllIlIIIIIIllllll.toCharArray();
        int lllllllllllllllIllIlIIIIIIllllII = lIlIlIlIIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIlIIlll[0];
        while (llIlllIlllllIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIlIIIIIIllllIl[lllllllllllllllIllIlIIIIIIllllII % lllllllllllllllIllIlIIIIIIllllIl.length]));
            "".length();
            lllllllllllllllIllIlIIIIIIllllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private H(String str, int i, G g, G g2, G g3) {
        this.west = g;
        this.north = g2;
        this.east = g3;
    }

    public WorldPoint c(C0039n c0039n) {
        char c2 = c0039n.bu;
        WorldPoint worldPoint = c0039n.bq;
        S s = c0039n.bx;
        return d(c0039n).c(c2, worldPoint);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }
}
