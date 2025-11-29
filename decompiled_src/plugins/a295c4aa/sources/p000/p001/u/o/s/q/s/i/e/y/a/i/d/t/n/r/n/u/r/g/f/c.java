package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.c  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/c.class */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c ADAMANT_BAR;
    private static /* synthetic */ int[] llIlIlIIlIll;
    private final /* synthetic */ int productionSetting;
    public static final /* synthetic */ c IRON_BAR;
    public static final /* synthetic */ c BRONZE_BAR;
    private final /* synthetic */ int itemId;
    public static final /* synthetic */ c RUNE_BAR;
    private static /* synthetic */ String[] llIlIlIIlIlI;
    public static final /* synthetic */ c MITHRIL_BAR;
    public static final /* synthetic */ c STEEL_BAR;

    private static String lIIIIIlIlllIlII(String lllllllllllllllIlIIIIllIIIIIIllI, String lllllllllllllllIlIIIIllIIIIIlIlI) {
        String lllllllllllllllIlIIIIllIIIIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIllIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIllIIIIIlIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIllIIIIIlIlI.toCharArray();
        int lllllllllllllllIlIIIIllIIIIIIlll = llIlIlIIlIll[0];
        char[] charArray2 = lllllllllllllllIlIIIIllIIIIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIIlIll[0];
        while (lIIIIIlIllllIII(i, length)) {
            lllllllllllllllIlIIIIllIIIIIlIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIIIllIIIIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIllIIIIIIlll++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIllIIIIIlIIl);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public int w() {
        return this.productionSetting;
    }

    private static String lIIIIIlIlllIIll(String lllllllllllllllIlIIIIlIllllIIlll, String lllllllllllllllIlIIIIlIllllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIllllIlIlI) {
            lllllllllllllllIlIIIIlIllllIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlIlllIllI() {
        llIlIlIIlIlI = new String[llIlIlIIlIll[12]];
        llIlIlIIlIlI[llIlIlIIlIll[0]] = lIIIIIlIlllIIll("CgYZKWAn5wNz560ydSJSwA==", "OsPOk");
        llIlIlIIlIlI[llIlIlIIlIll[2]] = lIIIIIlIlllIIll("Frx55wx/GkmqR24HPKnSZw==", "AHNIW");
        llIlIlIIlIlI[llIlIlIIlIll[4]] = lIIIIIlIlllIlII("ASIhLT8NNCU6", "Rvdhs");
        llIlIlIIlIlI[llIlIlIIlIll[6]] = lIIIIIlIlllIlIl("Oouca3gI9+sYMh5GRjwUrQ==", "pWmlA");
        llIlIlIIlIlI[llIlIlIIlIll[8]] = lIIIIIlIlllIlIl("WwIkgt4FuOEyNrBGZuUx9Q==", "wsYjJ");
        llIlIlIIlIlI[llIlIlIIlIll[10]] = lIIIIIlIlllIIll("OxxTn75KcN6frUe+sG3TeQ==", "zbYhr");
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static String lIIIIIlIlllIlIl(String lllllllllllllllIlIIIIlIlllllIllI, String lllllllllllllllIlIIIIlIlllllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIlllllIIll.getBytes(StandardCharsets.UTF_8)), llIlIlIIlIll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIlllllIlll) {
            lllllllllllllllIlIIIIlIlllllIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIIIIIlIlllIlll();
        lIIIIIlIlllIllI();
        BRONZE_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[0]], llIlIlIIlIll[0], llIlIlIIlIll[1], llIlIlIIlIll[2]);
        IRON_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[2]], llIlIlIIlIll[2], llIlIlIIlIll[3], llIlIlIIlIll[4]);
        STEEL_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[4]], llIlIlIIlIll[4], llIlIlIIlIll[5], llIlIlIIlIll[6]);
        MITHRIL_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[6]], llIlIlIIlIll[6], llIlIlIIlIll[7], llIlIlIIlIll[8]);
        ADAMANT_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[8]], llIlIlIIlIll[8], llIlIlIIlIll[9], llIlIlIIlIll[10]);
        RUNE_BAR = new c(llIlIlIIlIlI[llIlIlIIlIll[10]], llIlIlIIlIll[10], llIlIlIIlIll[11], llIlIlIIlIll[12]);
        c[] cVarArr = new c[llIlIlIIlIll[12]];
        cVarArr[llIlIlIIlIll[0]] = BRONZE_BAR;
        cVarArr[llIlIlIIlIll[2]] = IRON_BAR;
        cVarArr[llIlIlIIlIll[4]] = STEEL_BAR;
        cVarArr[llIlIlIIlIll[6]] = MITHRIL_BAR;
        cVarArr[llIlIlIIlIll[8]] = ADAMANT_BAR;
        cVarArr[llIlIlIIlIll[10]] = RUNE_BAR;
        $VALUES = cVarArr;
    }

    private static void lIIIIIlIlllIlll() {
        llIlIlIIlIll = new int[14];
        llIlIlIIlIll[0] = (132 ^ 146) & ((10 ^ 28) ^ (-1));
        llIlIlIIlIll[1] = (-8915) & 11263;
        llIlIlIIlIll[2] = " ".length();
        llIlIlIIlIll[3] = (-((-22591) & 32511)) & (-16401) & 28671;
        llIlIlIIlIll[4] = "  ".length();
        llIlIlIIlIll[5] = (-((-5281) & 22179)) & (-8261) & 27511;
        llIlIlIIlIll[6] = "   ".length();
        llIlIlIIlIll[7] = (-((-10665) & 32745)) & (-8329) & 32767;
        llIlIlIIlIll[8] = 94 ^ 90;
        llIlIlIIlIll[9] = (-((-14489) & 32413)) & (-65) & 20349;
        llIlIlIIlIll[10] = (106 ^ 22) ^ (9 ^ 112);
        llIlIlIIlIll[11] = (-((-301) & 13741)) & (-16965) & 32767;
        llIlIlIIlIll[12] = 53 ^ 51;
        llIlIlIIlIll[13] = (81 ^ 94) ^ (77 ^ 74);
    }

    public int v() {
        return this.itemId;
    }

    private static boolean lIIIIIlIllllIII(int i, int i2) {
        return i < i2;
    }

    private c(String str, int i, int i2, int i3) {
        this.itemId = i2;
        this.productionSetting = i3;
    }
}
