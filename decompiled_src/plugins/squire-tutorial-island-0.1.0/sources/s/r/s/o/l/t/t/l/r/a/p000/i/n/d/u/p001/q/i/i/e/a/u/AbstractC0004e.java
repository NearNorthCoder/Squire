package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.e  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/e.class */
public abstract class AbstractC0004e implements InterfaceC0009j {
    private /* synthetic */ String P;
    private static /* synthetic */ int[] lIlIIlIIIllII;
    private static /* synthetic */ String[] lIlIIlIIIlIll;
    private /* synthetic */ String O;
    protected /* synthetic */ boolean N = lIlIIlIIIllII[0];
    private /* synthetic */ InterfaceC0009j Q = null;

    private static void lIlllIIlIIIIlII() {
        lIlIIlIIIlIll = new String[lIlIIlIIIllII[2]];
        lIlIIlIIIlIll[lIlIIlIIIllII[0]] = lIlllIIlIIIIIll("nW5nhmjOtag=", "bEyid");
        lIlIIlIIIlIll[lIlIIlIIIllII[1]] = lIlllIIlIIIIIll("jc7xX5my098=", "nPSKY");
    }

    private static String lIlllIIlIIIIIll(String llllllllllllllIlllIIIIlIIIlIlIIl, String llllllllllllllIlllIIIIlIIIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIllII[3]), "DES");
            Cipher llllllllllllllIlllIIIIlIIIlIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlIIIlIlIll.init(lIlIIlIIIllII[2], secretKeySpec);
            return new String(llllllllllllllIlllIIIIlIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlIIIlIlIlI) {
            llllllllllllllIlllIIIIlIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public boolean j() {
        return this.N;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public void d(String str) {
        this.P = str;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public InterfaceC0009j n() {
        return this.Q;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public void c(String str) {
        this.O = str;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public abstract String k();

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public abstract boolean a(Client client);

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public void a(InterfaceC0009j interfaceC0009j) {
        this.Q = interfaceC0009j;
    }

    private static boolean lIlllIIlIIIIllI(Object obj) {
        return obj != null;
    }

    private static void lIlllIIlIIIIlIl() {
        lIlIIlIIIllII = new int[4];
        lIlIIlIIIllII[0] = ((154 ^ 172) ^ (38 ^ 33)) & (((107 ^ 25) ^ (89 ^ 26)) ^ (-" ".length()));
        lIlIIlIIIllII[1] = " ".length();
        lIlIIlIIIllII[2] = "  ".length();
        lIlIIlIIIllII[3] = (79 ^ 32) ^ (80 ^ 55);
    }

    private static boolean lIlllIIlIIIIlll(int i) {
        return i != 0;
    }

    static {
        lIlllIIlIIIIlIl();
        lIlllIIlIIIIlII();
    }

    public void e(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String l = l();
        if (lIlllIIlIIIIllI(l)) {
            sb.append(l);
            "".length();
            if (lIlllIIlIIIIlll(l.isEmpty() ? 1 : 0)) {
                str2 = lIlIIlIIIlIll[lIlIIlIIIllII[0]];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                str2 = lIlIIlIIIlIll[lIlIIlIIIllII[1]];
            }
            sb.append(str2);
            "".length();
        }
        if (lIlllIIlIIIIllI(str)) {
            sb.append(str);
            "".length();
        }
        this.O = String.valueOf(sb);
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    @Nullable
    public String l() {
        return this.O;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    @Nullable
    public String m() {
        return this.P;
    }
}
