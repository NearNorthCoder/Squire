package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
@TaskDesc(name = "Recharging trident (sea trident)", priority = 1200, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.L  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/L.class */
public class L extends N {
    private static /* synthetic */ String[] llllIIIIllIl;
    private static /* synthetic */ int[] llllIIIIllll;

    private static boolean lIIIlllIlllIIll(int i) {
        return i == 0;
    }

    private static void lIIIlllIlllIIII() {
        llllIIIIllIl = new String[llllIIIIllll[8]];
        llllIIIIllIl[llllIIIIllll[13]] = lIIIlllIllIllII("DtkvhnlpEWojptnb346ps9tdU8t2L1EwlEH7fTetaKR6Ki/2FJRgNif7m4+OgNZA", "IJCvf");
    }

    @Inject
    public L(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.dp = List.of(Integer.valueOf(llllIIIIllll[0]), Integer.valueOf(llllIIIIllll[1]), Integer.valueOf(llllIIIIllll[2]), Integer.valueOf(llllIIIIllll[3]), Integer.valueOf(llllIIIIllll[4]));
        this.dq = Map.of(Integer.valueOf(llllIIIIllll[5]), Integer.valueOf(llllIIIIllll[6]), Integer.valueOf(llllIIIIllll[7]), Integer.valueOf(llllIIIIllll[8]), Integer.valueOf(llllIIIIllll[9]), Integer.valueOf(llllIIIIllll[8]), Integer.valueOf(llllIIIIllll[10]), Integer.valueOf(llllIIIIllll[11]));
        this.dr = List.of(Integer.valueOf(llllIIIIllll[12]), Integer.valueOf(llllIIIIllll[10]), Integer.valueOf(llllIIIIllll[7]), Integer.valueOf(llllIIIIllll[9]));
        this.f0do = this.dp.size() + this.dr.size();
    }

    private static String lIIIlllIllIllII(String lllllllllllllllIIllIIIIIlIlIIIII, String lllllllllllllllIIllIIIIIlIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), llllIIIIllll[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIIllll[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIlIlIIIIl) {
            lllllllllllllllIIllIIIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlllIIlI(int i) {
        return i != 0;
    }

    static {
        lIIIlllIlllIIIl();
        lIIIlllIlllIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIlllIlllIIlI(this.cV.useFireSpells() ? 1 : 0) && !lIIIlllIlllIIll(this.cW.n() ? 1 : 0) && !lIIIlllIlllIIlI(this.cW.ae() ? 1 : 0)) {
            if (lIIIlllIlllIIlI(this.dp.contains(ca()) ? 1 : 0)) {
                String str = llllIIIIllIl[llllIIIIllll[13]];
                Object[] objArr = new Object[llllIIIIllll[14]];
                objArr[llllIIIIllll[13]] = ca();
                objArr[llllIIIIllll[8]] = this.dp;
                Log.info(str, objArr);
                return llllIIIIllll[13];
            }
            return cf();
        }
        return llllIIIIllll[13];
    }

    private static void lIIIlllIlllIIIl() {
        llllIIIIllll = new int[16];
        llllIIIIllll[0] = (-((-7311) & 23807)) & (-4354) & 32757;
        llllIIIIllll[1] = (-16725) & 28631;
        llllIIIIllll[2] = (-((-29073) & 31197)) & (-8193) & 32606;
        llllIIIIllll[3] = (-163) & 22450;
        llllIIIIllll[4] = (-267) & 12171;
        llllIIIIllll[5] = (-16405) & 17399;
        llllIIIIllll[6] = 94 ^ 84;
        llllIIIIllll[7] = (-2369) & 2928;
        llllIIIIllll[8] = " ".length();
        llllIIIIllll[9] = (-28933) & 29494;
        llllIIIIllll[10] = (-8597) & 9150;
        llllIIIIllll[11] = (204 ^ 151) ^ (104 ^ 54);
        llllIIIIllll[12] = (-((-21394) & 23539)) & (-1025) & 16103;
        llllIIIIllll[13] = " ".length() & (" ".length() ^ (-1));
        llllIIIIllll[14] = "  ".length();
        llllIIIIllll[15] = 18 ^ 26;
    }
}
