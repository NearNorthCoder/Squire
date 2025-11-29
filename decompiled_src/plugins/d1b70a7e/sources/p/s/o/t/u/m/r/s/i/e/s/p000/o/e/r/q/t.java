package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
@TaskDesc(name = "Gathering rope", priority = 100, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.t  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/t.class */
public class t extends l {
    private static /* synthetic */ int[] lIIllIlllllIl;
    private static /* synthetic */ String[] lIIllIlllllII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIIlllllIll(this.ar.r() ? 1 : 0)) {
            ?? r0 = lIIllIlllllIl[0];
            "".length();
            return "  ".length() == 0 ? ((75 ^ 95) ^ (36 ^ 109)) & (((231 ^ 157) ^ (177 ^ 150)) ^ (-" ".length())) : r0;
        }
        return lIIllIlllllIl[1];
    }

    private static boolean lIllIIIllllllII(Object obj) {
        return obj != null;
    }

    private static void lIllIIIlllllIIl() {
        lIIllIlllllII = new String[lIIllIlllllIl[0]];
        lIIllIlllllII[lIIllIlllllIl[1]] = lIllIIIlllllIII("BXz7xmrWsQk=", "krLRu");
    }

    @Inject
    protected t(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlllllIll(int i) {
        return i == 0;
    }

    private static void lIllIIIlllllIlI() {
        lIIllIlllllIl = new int[3];
        lIIllIlllllIl[0] = " ".length();
        lIIllIlllllIl[1] = ((193 ^ 173) ^ (7 ^ 63)) & (((((85 + 181) - 253) + 197) ^ (((113 + 6) - 7) + 22)) ^ (-" ".length()));
        lIIllIlllllIl[2] = "  ".length();
    }

    private static String lIllIIIlllllIII(String llllllllllllllIlllIllIlIIlIlIlIl, String llllllllllllllIlllIllIlIIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlllllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIlIlIllI) {
            llllllllllllllIlllIllIlIIlIlIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIIlllllIlI();
        lIllIIIlllllIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        c N = this.ar.N();
        Locatable Q = N.Q();
        if (lIllIIIllllllII(Q) && lIllIIIlllllIll(this.au.a(Q) ? 1 : 0)) {
            Q.interact(lIIllIlllllII[lIIllIlllllIl[1]]);
            return lIIllIlllllIl[0];
        }
        this.au.b(N.Y());
        "".length();
        return lIIllIlllllIl[1];
    }
}
