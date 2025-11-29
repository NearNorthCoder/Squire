package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Escaping water", priority = 50, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bT  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bT.class */
public class bT extends bX {
    private static /* synthetic */ int[] lIllIlIIlII;
    private static /* synthetic */ String[] lIllIlIIIlI;

    @Inject
    protected bT(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIIlIllIlllIIl() {
        lIllIlIIlII = new int[5];
        lIllIlIIlII[0] = ((((107 + 122) - 225) + 169) ^ (((126 + 94) - 182) + 119)) & (((67 ^ 76) ^ (22 ^ 41)) ^ (-" ".length()));
        lIllIlIIlII[1] = 36 ^ 58;
        lIllIlIIlII[2] = " ".length();
        lIllIlIIlII[3] = "  ".length();
        lIllIlIIlII[4] = 51 ^ 59;
    }

    private static boolean lIIlIllIlllIll(int i) {
        return i == 0;
    }

    private static void lIIlIllIllIllI() {
        lIllIlIIIlI = new String[lIllIlIIlII[3]];
        lIllIlIIIlI[lIllIlIIlII[0]] = lIIlIllIllIlII("3E8AFWsBhQlJd/1VFRfQZg==", "zNylS");
        lIllIlIIIlI[lIllIlIIlII[2]] = lIIlIllIllIlIl("rajMkonWMDwex/hx72cBNA==", "jhzaY");
    }

    private static String lIIlIllIllIlIl(String llllllllllllllllIlIlIIIlllllIlIl, String llllllllllllllllIlIlIIIlllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIlllllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIlllllIlll.init(lIllIlIIlII[3], secretKeySpec);
            return new String(llllllllllllllllIlIlIIIlllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlllllIllI) {
            llllllllllllllllIlIlIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllIllllII(int i) {
        return i != 0;
    }

    static {
        lIIlIllIlllIIl();
        lIIlIllIllIllI();
    }

    private static String lIIlIllIllIlII(String llllllllllllllllIlIlIIIllllIlIII, String llllllllllllllllIlIlIIIllllIIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllllIIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIIlII[4]), "DES");
            Cipher llllllllllllllllIlIlIIIllllIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIllllIlIlI.init(lIllIlIIlII[3], llllllllllllllllIlIlIIIllllIlIll);
            return new String(llllllllllllllllIlIlIIIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIllllIlIIl) {
            llllllllllllllllIlIlIIIllllIlIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        if (lIIlIllIlllIlI(cB())) {
            return lIllIlIIlII[0];
        }
        Point point = new Point(lIllIlIIlII[1], lIllIlIIlII[1]);
        if (!lIIlIllIlllIll(Reachable.isWalkable(a(point)) ? 1 : 0) || lIIlIllIllllII(Reachable.isObstacle(a(point)) ? 1 : 0)) {
            return lIllIlIIlII[0];
        }
        String[] strArr = new String[lIllIlIIlII[2]];
        strArr[lIllIlIIlII[0]] = lIllIlIIIlI[lIllIlIIlII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIlIllIlllIlI(nearest)) {
            return lIllIlIIlII[0];
        }
        if (lIIlIllIllllIl(cF(), bY.ATTACK)) {
            Movement.setDestination(nearest.getWorldLocation());
            return lIllIlIIlII[2];
        }
        nearest.interact(lIllIlIIIlI[lIllIlIIlII[2]]);
        return lIllIlIIlII[2];
    }

    private static boolean lIIlIllIllllIl(Object obj, Object obj2) {
        return obj != obj2;
    }
}
