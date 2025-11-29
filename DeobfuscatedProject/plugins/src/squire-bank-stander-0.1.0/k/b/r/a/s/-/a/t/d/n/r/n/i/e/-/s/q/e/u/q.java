/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class q
extends Enum<q> {
    private final /* synthetic */ int weedAmount;
    private static final /* synthetic */ q[] $VALUES;
    private static /* synthetic */ String[] lllIlIIIllI;
    public static final /* synthetic */ /* enum */ q SODA_ASH;
    private final /* synthetic */ int bucketAmount;
    private static /* synthetic */ int[] lllIlIIIlll;
    public static final /* synthetic */ /* enum */ q NORMAL_SEAWEED;
    private final /* synthetic */ int itemId;
    public static final /* synthetic */ /* enum */ q GIANT_SEAWEED;

    private static boolean lIlIllllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private static void lIlIllllIlIIII() {
        lllIlIIIlll = new int[9];
        q.lllIlIIIlll[0] = (0x16 ^ 0x45) & ~(0x11 ^ 0x42);
        q.lllIlIIIlll[1] = 0xFFFFF78F & 0x5C70;
        q.lllIlIIIlll[2] = "   ".length();
        q.lllIlIIIlll[3] = 0x99 ^ 0x8B;
        q.lllIlIIIlll[4] = " ".length();
        q.lllIlIIIlll[5] = 0xFFFFDDF3 & 0x239D;
        q.lllIlIIIlll[6] = 0xEF ^ 0x8E ^ (0xFA ^ 0x96);
        q.lllIlIIIlll[7] = "  ".length();
        q.lllIlIIIlll[8] = -(0xFFFFB9C7 & 0x7F39) & (0xFFFFBFFD & 0x7FF7);
    }

    private q(int n3, int n4, int n5) {
        this.itemId = n3;
        this.weedAmount = n4;
        this.bucketAmount = n5;
    }

    private static String lIlIllllIIllIl(String llllllllllllllllIIlIIllIIlIlIlIl, String llllllllllllllllIIlIIllIIlIllIIl) {
        llllllllllllllllIIlIIllIIlIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllIIlIllIII = new StringBuilder();
        char[] llllllllllllllllIIlIIllIIlIlIlll = llllllllllllllllIIlIIllIIlIllIIl.toCharArray();
        int llllllllllllllllIIlIIllIIlIlIllI = lllIlIIIlll[0];
        char[] llllllllllllllllIIlIIllIIlIlIIII = llllllllllllllllIIlIIllIIlIlIlIl.toCharArray();
        int llllllllllllllllIIlIIllIIlIIllll = llllllllllllllllIIlIIllIIlIlIIII.length;
        int llllllllllllllllIIlIIllIIlIIlllI = lllIlIIIlll[0];
        while (q.lIlIllllIlIIIl(llllllllllllllllIIlIIllIIlIIlllI, llllllllllllllllIIlIIllIIlIIllll)) {
            char llllllllllllllllIIlIIllIIlIllIll = llllllllllllllllIIlIIllIIlIlIIII[llllllllllllllllIIlIIllIIlIIlllI];
            llllllllllllllllIIlIIllIIlIllIII.append((char)(llllllllllllllllIIlIIllIIlIllIll ^ llllllllllllllllIIlIIllIIlIlIlll[llllllllllllllllIIlIIllIIlIlIllI % llllllllllllllllIIlIIllIIlIlIlll.length]));
            "".length();
            ++llllllllllllllllIIlIIllIIlIlIllI;
            ++llllllllllllllllIIlIIllIIlIIlllI;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllIIlIllIII);
    }

    public int P() {
        return this.bucketAmount;
    }

    private static void lIlIllllIIllll() {
        lllIlIIIllI = new String[lllIlIIIlll[2]];
        q.lllIlIIIllI[q.lllIlIIIlll[0]] = q.lIlIllllIIllIl("Iw8QHx07FRQQHiEDFQ==", "dFQQI");
        q.lllIlIIIllI[q.lllIlIIIlll[4]] = q.lIlIllllIIlllI("aJluaOP53BnUtq6VZsu+rQ==", "MCrrr");
        q.lllIlIIIllI[q.lllIlIIIlll[7]] = q.lIlIllllIIllIl("PCo8JzQuNjA=", "oexfk");
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    static {
        q.lIlIllllIlIIII();
        q.lIlIllllIIllll();
        GIANT_SEAWEED = new q(lllIlIIIlll[1], lllIlIIIlll[2], lllIlIIIlll[3]);
        NORMAL_SEAWEED = new q(lllIlIIIlll[5], lllIlIIIlll[6], lllIlIIIlll[6]);
        SODA_ASH = new q(lllIlIIIlll[8], lllIlIIIlll[6], lllIlIIIlll[6]);
        q[] qArray = new q[lllIlIIIlll[2]];
        qArray[q.lllIlIIIlll[0]] = GIANT_SEAWEED;
        qArray[q.lllIlIIIlll[4]] = NORMAL_SEAWEED;
        qArray[q.lllIlIIIlll[7]] = SODA_ASH;
        $VALUES = qArray;
    }

    public int N() {
        return this.itemId;
    }

    private static String lIlIllllIIlllI(String llllllllllllllllIIlIIllIIlIIIIll, String llllllllllllllllIIlIIllIIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIlIIIlll.init(lllIlIIIlll[7], llllllllllllllllIIlIIllIIlIIlIII);
            return new String(llllllllllllllllIIlIIllIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIlIIIllI) {
            llllllllllllllllIIlIIllIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public int O() {
        return this.weedAmount;
    }
}

