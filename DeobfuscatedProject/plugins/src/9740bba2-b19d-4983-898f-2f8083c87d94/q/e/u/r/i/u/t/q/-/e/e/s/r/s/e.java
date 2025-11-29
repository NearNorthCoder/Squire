/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.Client
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.j;

public abstract class e
implements j {
    private /* synthetic */ String N;
    private static /* synthetic */ int[] lIIIllIIlIlII;
    protected /* synthetic */ boolean M;
    private /* synthetic */ String O;
    private static /* synthetic */ String[] lIIIllIIlIIll;
    private /* synthetic */ j P;

    @Override
    public void c(String string) {
        this.O = string;
    }

    static {
        e.lIlIIIIllllIIlI();
        e.lIlIIIIllllIIIl();
    }

    private static boolean lIlIIIIllllIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public j m() {
        return this.P;
    }

    /*
     * WARNING - void declaration
     */
    public void d(String string) {
        void lllllllllllllllIIIIlIlIllIIIlIIl;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.k();
        if (e.lIlIIIIllllIIll(string2)) {
            String string3;
            stringBuilder.append(string2);
            "".length();
            if (e.lIlIIIIllllIlII(string2.isEmpty() ? 1 : 0)) {
                string3 = lIIIllIIlIIll[lIIIllIIlIlII[0]];
                "".length();
                if (null != null) {
                    return;
                }
            } else {
                string3 = lIIIllIIlIIll[lIIIllIIlIlII[1]];
            }
            stringBuilder.append(string3);
            "".length();
        }
        if (e.lIlIIIIllllIIll(lllllllllllllllIIIIlIlIllIIIlIIl)) {
            void lllllllllllllllIIIIlIlIllIIIlIII;
            lllllllllllllllIIIIlIlIllIIIlIII.append((String)lllllllllllllllIIIIlIlIllIIIlIIl);
            "".length();
        }
        this.N = String.valueOf(stringBuilder);
    }

    @Override
    public void a(j j2) {
        this.P = j2;
    }

    @Override
    public boolean i() {
        return this.M;
    }

    public e() {
        this.M = lIIIllIIlIlII[0];
        this.P = null;
    }

    private static String lIlIIIIllllIIII(String lllllllllllllllIIIIlIlIlIlllllIl, String lllllllllllllllIIIIlIlIlIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIlIlllllII.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIlII[3]), "DES");
            Cipher lllllllllllllllIIIIlIlIllIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIlIllIIIIIIl.init(lIIIllIIlIlII[2], lllllllllllllllIIIIlIlIllIIIIIlI);
            return new String(lllllllllllllllIIIIlIlIllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlIllIIIIIII) {
            lllllllllllllllIIIIlIlIllIIIIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public abstract boolean a(Client var1);

    @Override
    public void b(String string) {
        this.N = string;
    }

    private static boolean lIlIIIIllllIIll(Object object) {
        return object != null;
    }

    @Override
    @Nullable
    public String l() {
        return this.O;
    }

    private static void lIlIIIIllllIIlI() {
        lIIIllIIlIlII = new int[4];
        e.lIIIllIIlIlII[0] = (0x2D ^ 0x74) & ~(0x5A ^ 3);
        e.lIIIllIIlIlII[1] = " ".length();
        e.lIIIllIIlIlII[2] = "  ".length();
        e.lIIIllIIlIlII[3] = 0x72 ^ 0x2F ^ (0x5B ^ 0xE);
    }

    private static void lIlIIIIllllIIIl() {
        lIIIllIIlIIll = new String[lIIIllIIlIlII[2]];
        e.lIIIllIIlIIll[e.lIIIllIIlIlII[0]] = e.lIlIIIIllllIIII("AaSFLJ5z5f0=", "kjwzk");
        e.lIIIllIIlIIll[e.lIIIllIIlIlII[1]] = e.lIlIIIIllllIIII("PPV4/gTxkfM=", "ewauM");
    }

    @Override
    public abstract String j();

    @Override
    @Nullable
    public String k() {
        return this.N;
    }
}

