package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Making mould", priority = 10)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.u  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/u.class */
public class u extends j {
    private static /* synthetic */ String[] llIlIllIlIII;
    private static /* synthetic */ int[] llIlIllIlIIl;

    private static boolean lIIIIIlllIllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIlllIlllll(int i) {
        return i == 0;
    }

    private static void lIIIIIlllIllIll() {
        llIlIllIlIII = new String[llIlIllIlIIl[8]];
        llIlIllIlIII[llIlIllIlIIl[0]] = lIIIIIlllIllIIl("h4iLrcg5ngHVIjvBdlSnIqJkSgx2zF1M", "OQRbB");
        llIlIllIlIII[llIlIllIlIIl[1]] = lIIIIIlllIllIlI("CL87ASZXKzHHxMfc596n0kjB+tHYCR2ozEzF/TZnqRY=", "aJgpY");
        llIlIllIlIII[llIlIllIlIIl[3]] = lIIIIIlllIllIIl("98Jqzml6XdA=", "ciqcG");
        llIlIllIlIII[llIlIllIlIIl[4]] = lIIIIIlllIllIIl("Hw0/HfoUVEZSTMrhYNlZZtVCp9goyroI", "poCYu");
        llIlIllIlIII[llIlIllIlIIl[5]] = lIIIIIlllIllIIl("Gi7wAB0zZsjjZNScDF3uIlen+TVzhHTq", "amaOq");
        llIlIllIlIII[llIlIllIlIIl[6]] = lIIIIIlllIllIlI("mPCr4rUCX5GHwnNAnqaQP3M+RW7Db/WZ", "COOpJ");
    }

    private static void lIIIIIlllIlllII() {
        llIlIllIlIIl = new int[10];
        llIlIllIlIIl[0] = (90 ^ 3) & ((208 ^ 137) ^ (-1));
        llIlIllIlIIl[1] = " ".length();
        llIlIllIlIIl[2] = (-4357) & 49133;
        llIlIllIlIIl[3] = "  ".length();
        llIlIllIlIIl[4] = "   ".length();
        llIlIllIlIIl[5] = (((149 + 66) - 97) + 46) ^ (((143 + 151) - 230) + 96);
        llIlIllIlIIl[6] = (62 ^ 44) ^ (38 ^ 49);
        llIlIllIlIIl[7] = (-((-17771) & 32107)) & (-16417) & 31470;
        llIlIllIlIIl[8] = 168 ^ 174;
        llIlIllIlIIl[9] = 92 ^ 84;
    }

    private boolean u() {
        return Widgets.isVisible(Widgets.get(llIlIllIlIIl[7], llIlIllIlIIl[3]));
    }

    static {
        lIIIIIlllIlllII();
        lIIIIIlllIllIll();
    }

    private static String lIIIIIlllIllIIl(String lllllllllllllllIlIIIIIllIIlIlIIl, String lllllllllllllllIlIIIIIllIIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), llIlIllIlIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIllIIlIlIlI) {
            lllllllllllllllIlIIIIIllIIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public u(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (lIIIIIlllIlllIl(this.T.g() ? 1 : 0)) {
            return llIlIllIlIIl[0];
        }
        int[] iArr = new int[llIlIllIlIIl[1]];
        iArr[llIlIllIlIIl[0]] = llIlIllIlIIl[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIIIIlllIllllI(nearest)) {
            Log.info(llIlIllIlIII[llIlIllIlIIl[0]]);
            return llIlIllIlIIl[0];
        } else if (lIIIIIlllIlllll(u() ? 1 : 0)) {
            Log.info(llIlIllIlIII[llIlIllIlIIl[1]]);
            nearest.interact(llIlIllIlIII[llIlIllIlIIl[3]]);
            return llIlIllIlIIl[1];
        } else if (lIIIIIlllIlllll(Vars.getBit(f.FORTE.E()))) {
            Log.info(llIlIllIlIII[llIlIllIlIIl[4]]);
            if (lIIIIIlllIlllll(f.FORTE.B() ? 1 : 0)) {
                f.FORTE.C();
                return llIlIllIlIIl[1];
            }
            f.FORTE.D();
            return llIlIllIlIIl[1];
        } else if (lIIIIIlllIlllll(Vars.getBit(f.BLADE.E()))) {
            Log.info(llIlIllIlIII[llIlIllIlIIl[5]]);
            if (lIIIIIlllIlllll(f.BLADE.B() ? 1 : 0)) {
                f.BLADE.C();
                return llIlIllIlIIl[1];
            }
            f.BLADE.D();
            return llIlIllIlIIl[1];
        } else if (lIIIIIlllIlllll(Vars.getBit(f.TIP.E()))) {
            Log.info(llIlIllIlIII[llIlIllIlIIl[6]]);
            if (lIIIIIlllIlllll(f.TIP.B() ? 1 : 0)) {
                f.TIP.C();
                return llIlIllIlIIl[1];
            }
            f.TIP.D();
            return llIlIllIlIIl[1];
        } else {
            return llIlIllIlIIl[0];
        }
    }

    private static boolean lIIIIIlllIlllIl(int i) {
        return i != 0;
    }

    private static String lIIIIIlllIllIlI(String lllllllllllllllIlIIIIIllIIIlllII, String lllllllllllllllIlIIIIIllIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIllIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIllIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIllIIIllllI.init(llIlIllIlIIl[3], lllllllllllllllIlIIIIIllIIIlllll);
            return new String(lllllllllllllllIlIIIIIllIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIllIIIlllIl) {
            lllllllllllllllIlIIIIIllIIIlllIl.printStackTrace();
            return null;
        }
    }
}
