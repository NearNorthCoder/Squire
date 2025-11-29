package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/e.class */
public abstract class AbstractC0004e implements j {
    private /* synthetic */ String N;
    private static /* synthetic */ int[] lIIIllIIlIlII;
    private /* synthetic */ String O;
    private static /* synthetic */ String[] lIIIllIIlIIll;
    protected /* synthetic */ boolean M = lIIIllIIlIlII[0];
    private /* synthetic */ j P = null;

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public void c(String str) {
        this.O = str;
    }

    static {
        lIlIIIIllllIIlI();
        lIlIIIIllllIIIl();
    }

    private static boolean lIlIIIIllllIlII(int i) {
        return i != 0;
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public j m() {
        return this.P;
    }

    public void d(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String k = k();
        if (lIlIIIIllllIIll(k)) {
            sb.append(k);
            "".length();
            if (lIlIIIIllllIlII(k.isEmpty() ? 1 : 0)) {
                str2 = lIIIllIIlIIll[lIIIllIIlIlII[0]];
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                str2 = lIIIllIIlIIll[lIIIllIIlIlII[1]];
            }
            sb.append(str2);
            "".length();
        }
        if (lIlIIIIllllIIll(str)) {
            sb.append(str);
            "".length();
        }
        this.N = String.valueOf(sb);
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public void a(j jVar) {
        this.P = jVar;
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public boolean i() {
        return this.M;
    }

    private static String lIlIIIIllllIIII(String lllllllllllllllIIIIlIlIlIlllllll, String lllllllllllllllIIIIlIlIlIllllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIlIllllllI.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIlII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIlIlII[2], lllllllllllllllIIIIlIlIllIIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIllIIIIIII) {
            lllllllllllllllIIIIlIlIllIIIIIII.printStackTrace();
            return null;
        }
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public abstract boolean a(Client client);

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public void b(String str) {
        this.N = str;
    }

    private static boolean lIlIIIIllllIIll(Object obj) {
        return obj != null;
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    @Nullable
    public String l() {
        return this.O;
    }

    private static void lIlIIIIllllIIlI() {
        lIIIllIIlIlII = new int[4];
        lIIIllIIlIlII[0] = (45 ^ 116) & ((90 ^ 3) ^ (-1));
        lIIIllIIlIlII[1] = " ".length();
        lIIIllIIlIlII[2] = "  ".length();
        lIIIllIIlIlII[3] = (114 ^ 47) ^ (91 ^ 14);
    }

    private static void lIlIIIIllllIIIl() {
        lIIIllIIlIIll = new String[lIIIllIIlIlII[2]];
        lIIIllIIlIIll[lIIIllIIlIlII[0]] = lIlIIIIllllIIII("AaSFLJ5z5f0=", "kjwzk");
        lIIIllIIlIIll[lIIIllIIlIlII[1]] = lIlIIIIllllIIII("PPV4/gTxkfM=", "ewauM");
    }

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    public abstract String j();

    @Override // q.e.u.r.i.u.t.q.p000.e.e.s.r.s.j
    @Nullable
    public String k() {
        return this.N;
    }
}
