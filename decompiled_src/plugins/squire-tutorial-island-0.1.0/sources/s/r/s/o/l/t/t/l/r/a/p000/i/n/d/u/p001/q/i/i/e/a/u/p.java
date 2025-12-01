package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.p  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/p.class */
public class p implements o {
    private static /* synthetic */ int[] lIlIIIlIlIIll;
    private static /* synthetic */ String[] lIlIIIlIlIIlI;
    private static /* synthetic */ int ah;

    private static boolean lIlllIIIIIIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIIIIIIIIlI(int i, int i2) {
        return i >= i2;
    }

    static {
        lIllIllllllllIl();
        lIllIllllllllII();
    }

    private static String lIllIlllllllIlI(String llllllllllllllIlllIIIlIlIllllIIl, String llllllllllllllIlllIIIlIlIllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIlIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIlIllllIll.init(lIlIIIlIlIIll[5], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIlIllllIlI) {
            llllllllllllllIlllIIIlIlIllllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        int[] iArr = new int[lIlIIIlIlIIll[0]];
        iArr[lIlIIIlIlIIll[1]] = lIlIIIlIlIIll[2];
        if (lIllIlllllllllI(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[lIlIIIlIlIIll[0]];
            strArr[lIlIIIlIlIIll[1]] = lIlIIIlIlIIlI[lIlIIIlIlIIll[1]];
            if (!lIllIllllllllll(TileObjects.getNearest(strArr))) {
                if (!lIlllIIIIIIIIII(Players.getLocal().getAnimation(), lIlIIIlIlIIll[3]) && !lIlllIIIIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
                    if (lIlllIIIIIIIIlI(ah, lIlIIIlIlIIll[0])) {
                        ah -= lIlIIIlIlIIll[0];
                        return lIlIIIlIlIIll[1];
                    }
                    int[] iArr2 = new int[lIlIIIlIlIIll[0]];
                    iArr2[lIlIIIlIlIIll[1]] = lIlIIIlIlIIll[2];
                    Item first = Inventory.getFirst(iArr2);
                    String[] strArr2 = new String[lIlIIIlIlIIll[0]];
                    strArr2[lIlIIIlIlIIll[1]] = lIlIIIlIlIIlI[lIlIIIlIlIIll[0]];
                    first.useOn(TileObjects.getNearest(strArr2));
                    ah = M.a(lIlIIIlIlIIll[0], lIlIIIlIlIIll[4]);
                    return lIlIIIlIlIIll[0];
                }
                return lIlIIIlIlIIll[1];
            }
        }
        return lIlIIIlIlIIll[1];
    }

    private static void lIllIllllllllII() {
        lIlIIIlIlIIlI = new String[lIlIIIlIlIIll[5]];
        lIlIIIlIlIIlI[lIlIIIlIlIIll[1]] = lIllIlllllllIlI("o16+gammhvU=", "WVvLj");
        lIlIIIlIlIIlI[lIlIIIlIlIIll[0]] = lIllIlllllllIlI("dQvwLNuFO74=", "iRIxv");
    }

    private static boolean lIllIlllllllllI(int i) {
        return i != 0;
    }

    private static boolean lIllIllllllllll(Object obj) {
        return obj == null;
    }

    private static void lIllIllllllllIl() {
        lIlIIIlIlIIll = new int[6];
        lIlIIIlIlIIll[0] = " ".length();
        lIlIIIlIlIIll[1] = ((241 ^ 159) ^ (227 ^ 184)) & (((109 ^ 71) ^ (141 ^ 146)) ^ (-" ".length()));
        lIlIIIlIlIIll[2] = (-5357) & 7663;
        lIlIIIlIlIIll[3] = -" ".length();
        lIlIIIlIlIIll[4] = 154 ^ 158;
        lIlIIIlIlIIll[5] = "  ".length();
    }

    private static boolean lIlllIIIIIIIIII(int i, int i2) {
        return i != i2;
    }
}
