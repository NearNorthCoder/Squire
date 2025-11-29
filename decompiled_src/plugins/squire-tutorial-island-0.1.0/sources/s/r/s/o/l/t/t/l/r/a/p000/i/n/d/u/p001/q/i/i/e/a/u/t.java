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
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.t  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/t.class */
public class t implements o {
    private static /* synthetic */ String[] lIlIIlIIIllIl;
    private static /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIlIIIlllI;

    private static void lIlllIIlIIIlIIl() {
        lIlIIlIIIllIl = new String[lIlIIlIIIlllI[0]];
        lIlIIlIIIllIl[lIlIIlIIIlllI[1]] = lIlllIIlIIIlIII("EJTHcpmdL+8=", "GTWVF");
    }

    private static String lIlllIIlIIIlIII(String llllllllllllllIlllIIIIlIIIIllIII, String llllllllllllllIlllIIIIlIIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIIlllI[6], llllllllllllllIlllIIIIlIIIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlIIIIllIIl) {
            llllllllllllllIlllIIIIlIIIIllIIl.printStackTrace();
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
        int[] iArr = new int[lIlIIlIIIlllI[0]];
        iArr[lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[2];
        if (lIlllIIlIIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIlIIIlllI[0]];
            iArr2[lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[3];
            if (!lIlllIIlIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                if (!lIlllIIlIIIllIl(Players.getLocal().getAnimation(), lIlIIlIIIlllI[4]) && !lIlllIIlIIIllII(Movement.shouldWalk() ? 1 : 0)) {
                    if (lIlllIIlIIIlllI(ah, lIlIIlIIIlllI[0])) {
                        ah -= lIlIIlIIIlllI[0];
                        return lIlIIlIIIlllI[1];
                    }
                    int[] iArr3 = new int[lIlIIlIIIlllI[0]];
                    iArr3[lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[2];
                    Item first = Inventory.getFirst(iArr3);
                    String[] strArr = new String[lIlIIlIIIlllI[0]];
                    strArr[lIlIIlIIIlllI[1]] = lIlIIlIIIllIl[lIlIIlIIIlllI[1]];
                    first.useOn(TileObjects.getNearest(strArr));
                    ah = M.a(lIlIIlIIIlllI[0], lIlIIlIIIlllI[5]);
                    return lIlIIlIIIlllI[0];
                }
                return lIlIIlIIIlllI[1];
            }
        }
        return lIlIIlIIIlllI[1];
    }

    private static boolean lIlllIIlIIIllIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIlllIIlIIIlIlI();
        lIlllIIlIIIlIIl();
    }

    private static void lIlllIIlIIIlIlI() {
        lIlIIlIIIlllI = new int[7];
        lIlIIlIIIlllI[0] = " ".length();
        lIlIIlIIIlllI[1] = (3 ^ 10) & ((46 ^ 39) ^ (-1));
        lIlIIlIIIlllI[2] = (-14348) & 14783;
        lIlIIlIIIlllI[3] = (-((-206) & 30415)) & (-2049) & 32695;
        lIlIIlIIIlllI[4] = -" ".length();
        lIlIIlIIIlllI[5] = 87 ^ 83;
        lIlIIlIIIlllI[6] = "  ".length();
    }

    private static boolean lIlllIIlIIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlllIIlIIIllII(int i) {
        return i == 0;
    }

    private static boolean lIlllIIlIIIlllI(int i, int i2) {
        return i >= i2;
    }
}
