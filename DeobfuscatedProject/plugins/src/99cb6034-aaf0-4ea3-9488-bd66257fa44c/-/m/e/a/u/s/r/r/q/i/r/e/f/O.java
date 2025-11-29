/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class O
extends Enum<O> {
    public static final /* synthetic */ /* enum */ O HERB;
    private static /* synthetic */ int[] lIlllllIIlIl;
    public static final /* synthetic */ /* enum */ O BUSH;
    private final /* synthetic */ int animation;
    private static /* synthetic */ String[] lIlllllIIIIl;
    public static final /* synthetic */ /* enum */ O FLOWER;
    private final /* synthetic */ P allotment;
    private static final /* synthetic */ O[] $VALUES;
    public static final /* synthetic */ /* enum */ O ALLOTMENT;

    public int aP() {
        return this.animation;
    }

    private static void lllIllllIlIIlI() {
        lIlllllIIIIl = new String[lIlllllIIlIl[8]];
        O.lIlllllIIIIl[O.lIlllllIIlIl[0]] = O.lllIllllIIlIll("jByl/aj2/NjGmFs5XwJa7Q==", "PKhYn");
        O.lIlllllIIIIl[O.lIlllllIIlIl[2]] = O.lllIllllIIlIll("uaJ9QtGTavc=", "tsHNp");
        O.lIlllllIIIIl[O.lIlllllIIlIl[4]] = O.lllIllllIIlIll("IQoW3cGEJh8=", "OrSfp");
        O.lIlllllIIIIl[O.lIlllllIIlIl[6]] = O.lllIllllIlIIIl("PC0gNCso", "zaocn");
    }

    private static String lllIllllIlIIIl(String lllllllllllllllIlIllIIIlIIIIIIll, String lllllllllllllllIlIllIIIlIIIIIIlI) {
        lllllllllllllllIlIllIIIlIIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIlIIIIIllI = new StringBuilder();
        char[] lllllllllllllllIlIllIIIlIIIIIlIl = lllllllllllllllIlIllIIIlIIIIIIlI.toCharArray();
        int lllllllllllllllIlIllIIIlIIIIIlII = lIlllllIIlIl[0];
        char[] lllllllllllllllIlIllIIIIlllllllI = lllllllllllllllIlIllIIIlIIIIIIll.toCharArray();
        int lllllllllllllllIlIllIIIIllllllIl = lllllllllllllllIlIllIIIIlllllllI.length;
        int lllllllllllllllIlIllIIIIllllllII = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(lllllllllllllllIlIllIIIIllllllII, lllllllllllllllIlIllIIIIllllllIl)) {
            char lllllllllllllllIlIllIIIlIIIIlIIl = lllllllllllllllIlIllIIIIlllllllI[lllllllllllllllIlIllIIIIllllllII];
            lllllllllllllllIlIllIIIlIIIIIllI.append((char)(lllllllllllllllIlIllIIIlIIIIlIIl ^ lllllllllllllllIlIllIIIlIIIIIlIl[lllllllllllllllIlIllIIIlIIIIIlII % lllllllllllllllIlIllIIIlIIIIIlIl.length]));
            "".length();
            ++lllllllllllllllIlIllIIIlIIIIIlII;
            ++lllllllllllllllIlIllIIIIllllllII;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIIlIIIIIllI);
    }

    static {
        O.lllIllllIlIlIl();
        O.lllIllllIlIIlI();
        ALLOTMENT = new O(lIlllllIIlIl[1], P.ALLOTMENT);
        BUSH = new O(lIlllllIIlIl[3], P.BUSH);
        HERB = new O(lIlllllIIlIl[5], P.HERB);
        FLOWER = new O(lIlllllIIlIl[7], P.FLOWER);
        O[] oArray = new O[lIlllllIIlIl[8]];
        oArray[O.lIlllllIIlIl[0]] = ALLOTMENT;
        oArray[O.lIlllllIIlIl[2]] = BUSH;
        oArray[O.lIlllllIIlIl[4]] = HERB;
        oArray[O.lIlllllIIlIl[6]] = FLOWER;
        $VALUES = oArray;
    }

    private O(int n3, P p2) {
        this.animation = n3;
        this.allotment = p2;
    }

    public static O[] values() {
        return (O[])$VALUES.clone();
    }

    private static boolean lllIllllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public static O e(int n2) {
        void lllllllllllllllIlIllIIIlIIlIllII;
        O[] oArray = O.values();
        int n3 = oArray.length;
        int lllllllllllllllIlIllIIIlIIlIlIll = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(lllllllllllllllIlIllIIIlIIlIlIll, (int)lllllllllllllllIlIllIIIlIIlIllII)) {
            int lllllllllllllllIlIllIIIlIIlIlllI;
            void lllllllllllllllIlIllIIIlIIlIllIl;
            void lllllllllllllllIlIllIIIlIIlIlIlI = lllllllllllllllIlIllIIIlIIlIllIl[lllllllllllllllIlIllIIIlIIlIlIll];
            if (O.lllIllllIllIII(lllllllllllllllIlIllIIIlIIlIlIlI.aP(), lllllllllllllllIlIllIIIlIIlIlllI)) {
                return lllllllllllllllIlIllIIIlIIlIlIlI;
            }
            ++lllllllllllllllIlIllIIIlIIlIlIll;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static O b(P p2) {
        void lllllllllllllllIlIllIIIlIIlIIIlI;
        O[] oArray = O.values();
        int n2 = oArray.length;
        int lllllllllllllllIlIllIIIlIIlIIIIl = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(lllllllllllllllIlIllIIIlIIlIIIIl, (int)lllllllllllllllIlIllIIIlIIlIIIlI)) {
            P lllllllllllllllIlIllIIIlIIlIIlII;
            void lllllllllllllllIlIllIIIlIIlIIIll;
            void lllllllllllllllIlIllIIIlIIlIIIII = lllllllllllllllIlIllIIIlIIlIIIll[lllllllllllllllIlIllIIIlIIlIIIIl];
            if (O.lllIllllIllIIl((Object)lllllllllllllllIlIllIIIlIIlIIIII.aQ(), (Object)lllllllllllllllIlIllIIIlIIlIIlII)) {
                return lllllllllllllllIlIllIIIlIIlIIIII;
            }
            ++lllllllllllllllIlIllIIIlIIlIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return null;
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    public static O G(N n2) {
        return O.b(n2.aL());
    }

    public P aQ() {
        return this.allotment;
    }

    private static void lllIllllIlIlIl() {
        lIlllllIIlIl = new int[9];
        O.lIlllllIIlIl[0] = " ".length() & ~" ".length();
        O.lIlllllIIlIl[1] = 0xFFFFFBBF & 0x77E;
        O.lIlllllIIlIl[2] = " ".length();
        O.lIlllllIIlIl[3] = -(0xFFFFC519 & 0x7EF7) & (0xFFFFDDFB & 0x6EFD);
        O.lIlllllIIlIl[4] = "  ".length();
        O.lIlllllIIlIl[5] = 0xFFFFC8FF & 0x3FEA;
        O.lIlllllIIlIl[6] = "   ".length();
        O.lIlllllIIlIl[7] = 0xFFFFCBF4 & 0x3CFF;
        O.lIlllllIIlIl[8] = 0xD0 ^ 0x9E ^ (2 ^ 0x48);
    }

    private static boolean lllIllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIllllIIlIll(String lllllllllllllllIlIllIIIlIIIlIllI, String lllllllllllllllIlIllIIIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIlIIIllIlI.init(lIlllllIIlIl[4], lllllllllllllllIlIllIIIlIIIllIll);
            return new String(lllllllllllllllIlIllIIIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIlIIIllIIl) {
            lllllllllllllllIlIllIIIlIIIllIIl.printStackTrace();
            return null;
        }
    }
}

