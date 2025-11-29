package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Plundering Urns", priority = 1)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.l  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/l.class */
public class l extends k {
    private static /* synthetic */ int[] llllllIllIIl;
    private final /* synthetic */ Set<Integer> E;
    private static /* synthetic */ String[] llllllIllIII;

    static {
        lIIlIlIIlIIIIlI();
        lIIlIlIIlIIIIIl();
    }

    private static void lIIlIlIIlIIIIlI() {
        llllllIllIIl = new int[7];
        llllllIllIIl[0] = (-((-881) & 10227)) & (-97) & 30703;
        llllllIllIIl[1] = (-((-20551) & 31863)) & (-194) & 32767;
        llllllIllIIl[2] = (-((-6923) & 8155)) & (-2049) & 24543;
        llllllIllIIl[3] = (141 ^ 137) & ((115 ^ 119) ^ (-1));
        llllllIllIIl[4] = " ".length();
        llllllIllIIl[5] = 10 ^ 2;
        llllllIllIIl[6] = "  ".length();
    }

    private static void lIIlIlIIlIIIIIl() {
        llllllIllIII = new String[llllllIllIIl[4]];
        llllllIllIII[llllllIllIIl[3]] = lIIlIlIIlIIIIII("oMYTkDRcvnE=", "wTdVi");
    }

    private static boolean lIIlIlIIlIIIlIl(int i) {
        return i != 0;
    }

    @Inject
    protected l(a aVar, Client client) {
        super(aVar, client);
        this.E = ImmutableSet.of(Integer.valueOf(llllllIllIIl[0]), Integer.valueOf(llllllIllIIl[1]), Integer.valueOf(llllllIllIIl[2]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // u.l.n.q.r.p.p000.u.r.d.i.e.e.s.k
    public boolean j() {
        c f = c.f();
        if (!lIIlIlIIlIIIIll(f) && !lIIlIlIIlIIIlII(this.D.b(f) ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIlIIlIIIlIl(this.D.h.contains(Integer.valueOf(tileObject.getActualId())) ? 1 : 0) && lIIlIlIIlIIIlIl(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                    ?? r0 = llllllIllIIl[4];
                    "".length();
                    return 0 != 0 ? (" ".length() ^ (23 ^ 75)) & (((((19 + 54) - (-102)) + 21) ^ (((67 + 12) - (-20)) + 54)) ^ (-" ".length())) : r0;
                }
                return llllllIllIIl[3];
            });
            if (lIIlIlIIlIIIIll(nearest)) {
                return llllllIllIIl[3];
            }
            nearest.interact(llllllIllIII[llllllIllIIl[3]]);
            return llllllIllIIl[4];
        }
        return llllllIllIIl[3];
    }

    private static String lIIlIlIIlIIIIII(String lllllllllllllllIIlIIllIllIlIIIII, String lllllllllllllllIIlIIllIllIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIllIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIllIIlllll.getBytes(StandardCharsets.UTF_8)), llllllIllIIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIllIIl[6], lllllllllllllllIIlIIllIllIlIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIllIlIIIIl) {
            lllllllllllllllIIlIIllIllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIlIIIlII(int i) {
        return i == 0;
    }
}
