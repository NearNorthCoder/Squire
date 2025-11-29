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
@TaskDesc(name = "Hammering sword", priority = 100, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.m  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/m.class */
public class m extends i {
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] llIlIlIllIIl;
    private static /* synthetic */ int[] llIlIlIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean M() {
        return lIIIIIllIlIIlll(Players.getLocal().getAnimation(), llIlIlIllIlI[0]) ? llIlIlIllIlI[1] : N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i
    protected boolean N() {
        TileObject r = this.P.r();
        if (lIIIIIllIlIlIII(r)) {
            Log.info(llIlIlIllIIl[llIlIlIllIlI[2]]);
            return llIlIlIllIlI[2];
        }
        r.interact(llIlIlIllIIl[llIlIlIllIlI[1]]);
        return llIlIlIllIlI[1];
    }

    private static boolean lIIIIIllIlIIlll(int i, int i2) {
        return i == i2;
    }

    @Inject
    public m(a aVar) {
        super(aVar, g.HAMMER);
    }

    private static boolean lIIIIIllIlIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIIIIllIlIIlIl() {
        llIlIlIllIIl = new String[llIlIlIllIlI[3]];
        llIlIlIllIIl[llIlIlIllIlI[2]] = lIIIIIllIlIIIll("gid5iFiZK2CxISZ1tIruwg==", "sDYqk");
        llIlIlIllIIl[llIlIlIllIlI[1]] = lIIIIIllIlIIlII("nH1loXi+4Bs=", "IiTiX");
    }

    static {
        lIIIIIllIlIIllI();
        lIIIIIllIlIIlIl();
        ab = llIlIlIllIlI[0];
    }

    private static String lIIIIIllIlIIlII(String lllllllllllllllIlIIIIlIIlIIlllII, String lllllllllllllllIlIIIIlIIlIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), llIlIlIllIlI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIllIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIIlIIlllIl) {
            lllllllllllllllIlIIIIlIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIllIlIIIll(String lllllllllllllllIlIIIIlIIlIlIlIIl, String lllllllllllllllIlIIIIlIIlIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIIlIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIlIlIlIll.init(llIlIlIllIlI[3], lllllllllllllllIlIIIIlIIlIlIllII);
            return new String(lllllllllllllllIlIIIIlIIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIIlIlIlIlI) {
            lllllllllllllllIlIIIIlIIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIllIlIIllI() {
        llIlIlIllIlI = new int[5];
        llIlIlIllIlI[0] = (-16897) & 26351;
        llIlIlIllIlI[1] = " ".length();
        llIlIlIllIlI[2] = (86 ^ 74) & ((184 ^ 164) ^ (-1));
        llIlIlIllIlI[3] = "  ".length();
        llIlIlIllIlI[4] = (197 ^ 165) ^ (16 ^ 120);
    }
}
