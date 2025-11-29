package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.q  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/q.class */
public final class EnumC0016q {
    private final /* synthetic */ int weedAmount;
    private static final /* synthetic */ EnumC0016q[] $VALUES;
    private static /* synthetic */ String[] lllIlIIIllI;
    public static final /* synthetic */ EnumC0016q SODA_ASH;
    private final /* synthetic */ int bucketAmount;
    private static /* synthetic */ int[] lllIlIIIlll;
    public static final /* synthetic */ EnumC0016q NORMAL_SEAWEED;
    private final /* synthetic */ int itemId;
    public static final /* synthetic */ EnumC0016q GIANT_SEAWEED;

    private static boolean lIlIllllIlIIIl(int i, int i2) {
        return i < i2;
    }

    public static EnumC0016q valueOf(String str) {
        return (EnumC0016q) Enum.valueOf(EnumC0016q.class, str);
    }

    private static void lIlIllllIlIIII() {
        lllIlIIIlll = new int[9];
        lllIlIIIlll[0] = (22 ^ 69) & ((17 ^ 66) ^ (-1));
        lllIlIIIlll[1] = (-2161) & 23664;
        lllIlIIIlll[2] = "   ".length();
        lllIlIIIlll[3] = 153 ^ 139;
        lllIlIIIlll[4] = " ".length();
        lllIlIIIlll[5] = (-8717) & 9117;
        lllIlIIIlll[6] = (239 ^ 142) ^ (250 ^ 150);
        lllIlIIIlll[7] = "  ".length();
        lllIlIIIlll[8] = (-((-17977) & 32569)) & (-16387) & 32759;
    }

    private EnumC0016q(String str, int i, int i2, int i3, int i4) {
        this.itemId = i2;
        this.weedAmount = i3;
        this.bucketAmount = i4;
    }

    private static String lIlIllllIIllIl(String llllllllllllllllIIlIIllIIlIllIlI, String llllllllllllllllIIlIIllIIlIlIlII) {
        String llllllllllllllllIIlIIllIIlIllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIllIIlIlIlII.toCharArray();
        int llllllllllllllllIIlIIllIIlIlIllI = lllIlIIIlll[0];
        char[] charArray2 = llllllllllllllllIIlIIllIIlIllIlI2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlIIllIIlIIlllI = lllIlIIIlll[0];
        while (lIlIllllIlIIIl(llllllllllllllllIIlIIllIIlIIlllI, length)) {
            char llllllllllllllllIIlIIllIIlIllIll = charArray2[llllllllllllllllIIlIIllIIlIIlllI];
            sb.append((char) (llllllllllllllllIIlIIllIIlIllIll ^ charArray[llllllllllllllllIIlIIllIIlIlIllI % charArray.length]));
            "".length();
            llllllllllllllllIIlIIllIIlIlIllI++;
            llllllllllllllllIIlIIllIIlIIlllI++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int P() {
        return this.bucketAmount;
    }

    private static void lIlIllllIIllll() {
        lllIlIIIllI = new String[lllIlIIIlll[2]];
        lllIlIIIllI[lllIlIIIlll[0]] = lIlIllllIIllIl("Iw8QHx07FRQQHiEDFQ==", "dFQQI");
        lllIlIIIllI[lllIlIIIlll[4]] = lIlIllllIIlllI("aJluaOP53BnUtq6VZsu+rQ==", "MCrrr");
        lllIlIIIllI[lllIlIIIlll[7]] = lIlIllllIIllIl("PCo8JzQuNjA=", "oexfk");
    }

    public static EnumC0016q[] values() {
        return (EnumC0016q[]) $VALUES.clone();
    }

    static {
        lIlIllllIlIIII();
        lIlIllllIIllll();
        GIANT_SEAWEED = new EnumC0016q(lllIlIIIllI[lllIlIIIlll[0]], lllIlIIIlll[0], lllIlIIIlll[1], lllIlIIIlll[2], lllIlIIIlll[3]);
        NORMAL_SEAWEED = new EnumC0016q(lllIlIIIllI[lllIlIIIlll[4]], lllIlIIIlll[4], lllIlIIIlll[5], lllIlIIIlll[6], lllIlIIIlll[6]);
        SODA_ASH = new EnumC0016q(lllIlIIIllI[lllIlIIIlll[7]], lllIlIIIlll[7], lllIlIIIlll[8], lllIlIIIlll[6], lllIlIIIlll[6]);
        EnumC0016q[] enumC0016qArr = new EnumC0016q[lllIlIIIlll[2]];
        enumC0016qArr[lllIlIIIlll[0]] = GIANT_SEAWEED;
        enumC0016qArr[lllIlIIIlll[4]] = NORMAL_SEAWEED;
        enumC0016qArr[lllIlIIIlll[7]] = SODA_ASH;
        $VALUES = enumC0016qArr;
    }

    public int N() {
        return this.itemId;
    }

    private static String lIlIllllIIlllI(String llllllllllllllllIIlIIllIIlIIIlIl, String llllllllllllllllIIlIIllIIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIlIIIlll.init(lllIlIIIlll[7], llllllllllllllllIIlIIllIIlIIlIII);
            return new String(llllllllllllllllIIlIIllIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIlIIIllI) {
            llllllllllllllllIIlIIllIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public int O() {
        return this.weedAmount;
    }
}
