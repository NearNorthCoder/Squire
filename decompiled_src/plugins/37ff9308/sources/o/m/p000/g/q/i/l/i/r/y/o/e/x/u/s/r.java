package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.r  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/r.class */
public class r {
    public static final /* synthetic */ int ac;
    private static /* synthetic */ int[] lIIIIIIIIllIl;
    public static final /* synthetic */ String ad;
    private static /* synthetic */ String[] lIIIIIIIIllII;
    public static final /* synthetic */ int aa;
    public static final /* synthetic */ int ab;

    private static void lIIlIllIlIIIIII() {
        lIIIIIIIIllIl = new int[5];
        lIIIIIIIIllIl[0] = " ".length();
        lIIIIIIIIllIl[1] = "   ".length();
        lIIIIIIIIllIl[2] = (202 ^ 136) & ((92 ^ 30) ^ (-1));
        lIIIIIIIIllIl[3] = "  ".length();
        lIIIIIIIIllIl[4] = (58 ^ 81) ^ (94 ^ 61);
    }

    private static void lIIlIllIIllllll() {
        lIIIIIIIIllII = new String[lIIIIIIIIllIl[0]];
        lIIIIIIIIllII[lIIIIIIIIllIl[2]] = lIIlIllIIlllllI("43ROvQ/sAYc=", "LgVje");
    }

    static {
        lIIlIllIlIIIIII();
        lIIlIllIIllllll();
        aa = lIIIIIIIIllIl[0];
        ac = lIIIIIIIIllIl[1];
        ad = lIIIIIIIIllII[lIIIIIIIIllIl[2]];
        ab = lIIIIIIIIllIl[3];
    }

    private static String lIIlIllIIlllllI(String lllllllllllllllIIIlllllllIlllIll, String lllllllllllllllIIIlllllllIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllllIllIllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIllIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIllIl[3], lllllllllllllllIIIllllllllIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllllIllllIl) {
            lllllllllllllllIIIlllllllIllllIl.printStackTrace();
            return null;
        }
    }
}
