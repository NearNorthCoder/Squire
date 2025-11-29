/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class r_Unknown {
    public static final /* synthetic */ int ac;
    private static /* synthetic */ int[] lIIIIIIIIllIl;
    public static final /* synthetic */ String ad;
    private static /* synthetic */ String[] lIIIIIIIIllII;
    public static final /* synthetic */ int aa;
    public static final /* synthetic */ int ab;

    private static void lIIlIllIlIIIIII() {
        lIIIIIIIIllIl = new int[5];
        r.lIIIIIIIIllIl[0] = 1;
        r.lIIIIIIIIllIl[1] = 3;
        r.lIIIIIIIIllIl[2] = (0xCA ^ 0x88) & ~(0x5C ^ 0x1E);
        r.lIIIIIIIIllIl[3] = 2;
        r.lIIIIIIIIllIl[4] = 0x3A ^ 0x51 ^ (0x5E ^ 0x3D);
    }

    private static void lIIlIllIIllllll() {
        lIIIIIIIIllII = new String[lIIIIIIIIllIl[0]];
        r.lIIIIIIIIllII[r.lIIIIIIIIllIl[2]] = r."Digweed";
    }

    static {
        r.lIIlIllIlIIIIII();
        r.lIIlIllIIllllll();
        aa = lIIIIIIIIllIl[0];
        ac = lIIIIIIIIllIl[1];
        ad = lIIIIIIIIllII[lIIIIIIIIllIl[2]];
        ab = lIIIIIIIIllIl[3];
    }

    private static String lIIlIllIIlllllI(String var4, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIllIl[4]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIIIIIIIllIl[3], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}

