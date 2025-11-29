package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Polishing sword", priority = 43, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.n  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/n.class */
public class n extends i {
    private static final /* synthetic */ int ac;
    private static /* synthetic */ int[] llIlIllIllII;
    private static /* synthetic */ String[] llIlIllIlIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean M() {
        if (lIIIIIllllIIlIl(Players.getLocal().getAnimation(), llIlIllIllII[0])) {
            sleep(llIlIllIllII[1]);
            return llIlIllIllII[2];
        }
        return N();
    }

    @Inject
    public n(a aVar) {
        super(aVar, g.POLISH);
    }

    private static boolean lIIIIIllllIIlIl(int i, int i2) {
        return i == i2;
    }

    private static void lIIIIIllllIIIll() {
        llIlIllIlIll = new String[llIlIllIllII[4]];
        llIlIllIlIll[llIlIllIllII[3]] = lIIIIIllllIIIIl("ybSWksIXsk9pkWJ+mZLNT0FdLBtN7YOc", "cGidF");
        llIlIllIlIll[llIlIllIllII[2]] = lIIIIIllllIIIlI("UMrG96VIJOU=", "lShUT");
    }

    static {
        lIIIIIllllIIlII();
        lIIIIIllllIIIll();
        ac = llIlIllIllII[0];
    }

    private static boolean lIIIIIllllIIllI(Object obj) {
        return obj == null;
    }

    private static String lIIIIIllllIIIIl(String lllllllllllllllIlIIIIIlIlllIIlII, String lllllllllllllllIlIIIIIlIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllIllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllIllII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIlllIIlIl) {
            lllllllllllllllIlIIIIIlIlllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIllllIIlII() {
        llIlIllIllII = new int[6];
        llIlIllIllII[0] = (-((-473) & 3033)) & (-16402) & 28415;
        llIlIllIllII[1] = 45 ^ 41;
        llIlIllIllII[2] = " ".length();
        llIlIllIllII[3] = (46 ^ 18) & ((69 ^ 121) ^ (-1));
        llIlIllIllII[4] = "  ".length();
        llIlIllIllII[5] = (31 ^ 6) ^ (208 ^ 193);
    }

    private static String lIIIIIllllIIIlI(String lllllllllllllllIlIIIIIlIllIlIlll, String lllllllllllllllIlIIIIIlIllIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlIllIllIIl.init(llIlIllIllII[4], lllllllllllllllIlIIIIIlIllIllIlI);
            return new String(lllllllllllllllIlIIIIIlIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIllIlIIll) {
            lllllllllllllllIlIIIIIlIllIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean N() {
        TileObject q = this.P.q();
        if (lIIIIIllllIIllI(q)) {
            Log.info(llIlIllIlIll[llIlIllIllII[3]]);
            return llIlIllIllII[3];
        }
        q.interact(llIlIllIlIll[llIlIllIllII[2]]);
        sleep(llIlIllIllII[1]);
        return llIlIllIllII[2];
    }
}
