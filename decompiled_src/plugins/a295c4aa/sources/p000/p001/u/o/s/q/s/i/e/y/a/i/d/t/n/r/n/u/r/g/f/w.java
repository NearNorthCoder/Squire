package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Picking up sword", priority = 300, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.w  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/w.class */
public class w extends j {
    private static /* synthetic */ String[] llIlIllIlIlI;
    private static /* synthetic */ int[] llIlIlllIllI;

    private static void lIIIIlIIIIIIIII() {
        llIlIllIlIlI = new String[llIlIlllIllI[2]];
        llIlIllIlIlI[llIlIlllIllI[0]] = lIIIIIllllIIIII("V20kH7jIqJs=", "jtgzJ");
        llIlIllIlIlI[llIlIlllIllI[1]] = lIIIIIllllIIIII("J+a6Gfj9vVg=", "dPUCC");
    }

    private static boolean lIIIIlIIIIIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIIIIllllIIIII(String lllllllllllllllIlIIIIIlIIllIIllI, String lllllllllllllllIlIIIIIlIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlllIllI[2], lllllllllllllllIlIIIIIlIIllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIIllIIlll) {
            lllllllllllllllIlIIIIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[llIlIlllIllI[1]];
            strArr[llIlIlllIllI[0]] = llIlIllIlIlI[llIlIlllIllI[1]];
            return tileObject.hasAction(strArr);
        });
        if (lIIIIlIIIIIIIlI(nearest)) {
            return llIlIlllIllI[0];
        }
        nearest.interact(llIlIllIlIlI[llIlIlllIllI[0]]);
        return llIlIlllIllI[1];
    }

    static {
        lIIIIlIIIIIIIIl();
        lIIIIlIIIIIIIII();
    }

    @Inject
    public w(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIlIIIIIIIIl() {
        llIlIlllIllI = new int[3];
        llIlIlllIllI[0] = (57 ^ 3) & ((110 ^ 84) ^ (-1));
        llIlIlllIllI[1] = " ".length();
        llIlIlllIllI[2] = "  ".length();
    }
}
