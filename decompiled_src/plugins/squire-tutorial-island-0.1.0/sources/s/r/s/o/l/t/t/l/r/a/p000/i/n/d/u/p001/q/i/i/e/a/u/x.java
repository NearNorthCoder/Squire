package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.x  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/x.class */
public class x implements o {
    private static /* synthetic */ int ah;
    private static /* synthetic */ String[] lIlIIIllIlIII;
    private static /* synthetic */ int[] lIlIIIllIlIIl;

    private static boolean lIlllIIIIlIlIII(int i) {
        return i == 0;
    }

    private static String lIlllIIIIlIIlIl(String llllllllllllllIlllIIIlIIlIIlllIl, String llllllllllllllIlllIIIlIIlIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIlIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIlIIlllll.init(lIlIIIllIlIIl[4], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIlIIllllI) {
            llllllllllllllIlllIIIlIIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlIlIll(int i) {
        return i != 0;
    }

    static {
        lIlllIIIIlIIlll();
        lIlllIIIIlIIllI();
    }

    private static boolean lIlllIIIIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllIIIIlIlIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIlllIIIIlIIlll() {
        lIlIIIllIlIIl = new int[5];
        lIlIIIllIlIIl[0] = ((118 ^ 14) ^ (85 ^ 119)) & (((83 ^ 72) ^ (240 ^ 177)) ^ (-" ".length()));
        lIlIIIllIlIIl[1] = " ".length();
        lIlIIIllIlIIl[2] = -" ".length();
        lIlIIIllIlIIl[3] = 2 ^ 6;
        lIlIIIllIlIIl[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIIIlIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIllIlIIl[0];
        }
        if (lIlllIIIIlIlIIl(ah, lIlIIIllIlIIl[1])) {
            ah -= lIlIIIllIlIIl[1];
            return lIlIIIllIlIIl[0];
        } else if (lIlllIIIIlIlIlI(Players.getLocal().getAnimation(), lIlIIIllIlIIl[2])) {
            return lIlIIIllIlIIl[0];
        } else {
            TileObjects.getNearest(tileObject -> {
                if (lIlllIIIIlIlIll(tileObject.getWorldLocation().equals(Static.getClient().getHintArrowPoint()) ? 1 : 0) && lIlllIIIIlIlIII(tileObject.getName().equals(lIlIIIllIlIII[lIlIIIllIlIIl[0]]) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIlIIl[1];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllIlIIl[0];
            }).interact(lIlIIIllIlIIl[0]);
            ah = M.a(lIlIIIllIlIIl[1], lIlIIIllIlIIl[3]);
            return lIlIIIllIlIIl[1];
        }
    }

    private static void lIlllIIIIlIIllI() {
        lIlIIIllIlIII = new String[lIlIIIllIlIIl[1]];
        lIlIIIllIlIII[lIlIIIllIlIIl[0]] = lIlllIIIIlIIlIl("n+lLr4+Rf7c=", "FXXDo");
    }
}
