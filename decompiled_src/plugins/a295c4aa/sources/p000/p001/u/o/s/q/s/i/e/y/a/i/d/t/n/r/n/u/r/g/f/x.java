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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Pouring crucible", priority = 200)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.x  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/x.class */
public class x extends j {
    private static final /* synthetic */ int ar;
    private static final /* synthetic */ WorldPoint as;
    private static /* synthetic */ int[] llIlIlIlllII;
    private static /* synthetic */ String[] llIlIlIllIll;

    private static boolean lIIIIIllIlIllll(int i, int i2) {
        return i == i2;
    }

    @Inject
    public x(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    static {
        lIIIIIllIlIlIll();
        lIIIIIllIlIlIlI();
        ar = llIlIlIlllII[1];
        as = new WorldPoint(llIlIlIlllII[4], llIlIlIlllII[5], llIlIlIlllII[0]);
    }

    private static void lIIIIIllIlIlIll() {
        llIlIlIlllII = new int[7];
        llIlIlIlllII[0] = (198 ^ 135) & ((109 ^ 44) ^ (-1));
        llIlIlIlllII[1] = (-2215) & 16127;
        llIlIlIlllII[2] = " ".length();
        llIlIlIlllII[3] = (-((-1605) & 5975)) & (-16389) & 65534;
        llIlIlIlllII[4] = (-((-27955) & 32759)) & (-24577) & 32749;
        llIlIlIlllII[5] = (-(146 ^ 143)) & (-17153) & 28669;
        llIlIlIlllII[6] = "  ".length();
    }

    private static boolean lIIIIIllIlIllII(int i) {
        return i == 0;
    }

    private static void lIIIIIllIlIlIlI() {
        llIlIlIllIll = new String[llIlIlIlllII[6]];
        llIlIlIllIll[llIlIlIlllII[0]] = lIIIIIllIlIlIIl("5VhRSOwvdZE=", "LDZOn");
        llIlIlIllIll[llIlIlIlllII[2]] = lIIIIIllIlIlIIl("r4ofreIwRy8=", "yfENI");
    }

    private static boolean lIIIIIllIlIllIl(int i) {
        return i != 0;
    }

    private static String lIIIIIllIlIlIIl(String lllllllllllllllIlIIIIlIIlIIIIIll, String lllllllllllllllIlIIIIlIIlIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIIlIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIlIIIIlIl.init(llIlIlIlllII[6], lllllllllllllllIlIIIIlIIlIIIIllI);
            return new String(lllllllllllllllIlIIIIlIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIIlIIIIlII) {
            lllllllllllllllIlIIIIlIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (!lIIIIIllIlIllII(this.T.g() ? 1 : 0) && !lIIIIIllIlIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            if (lIIIIIllIlIllIl(Vars.getBit(llIlIlIlllII[1])) && lIIIIIllIlIllII(Players.getLocal().getWorldLocation().equals(as) ? 1 : 0)) {
                Movement.setDestination(as);
                return llIlIlIlllII[2];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIIIIllIlIllll(tileObject.getId(), llIlIlIlllII[3])) {
                    String[] strArr = new String[llIlIlIlllII[2]];
                    strArr[llIlIlIlllII[0]] = llIlIlIllIll[llIlIlIlllII[2]];
                    if (lIIIIIllIlIllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llIlIlIlllII[2];
                        "".length();
                        return (-" ".length()) >= "  ".length() ? ((((28 + 108) - 31) + 74) ^ (((126 + 65) - 190) + 140)) & (((31 ^ 125) ^ (17 ^ 77)) ^ (-" ".length())) : r0;
                    }
                }
                return llIlIlIlllII[0];
            });
            if (lIIIIIllIlIlllI(nearest)) {
                return llIlIlIlllII[0];
            }
            nearest.interact(llIlIlIllIll[llIlIlIlllII[0]]);
            return llIlIlIlllII[2];
        }
        return llIlIlIlllII[0];
    }

    private static boolean lIIIIIllIlIlllI(Object obj) {
        return obj == null;
    }
}
