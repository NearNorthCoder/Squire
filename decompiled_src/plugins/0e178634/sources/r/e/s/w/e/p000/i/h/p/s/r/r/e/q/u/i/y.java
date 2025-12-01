package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.y  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/y.class */
public class y extends u {
    private static /* synthetic */ int[] lIlIllIlllIll;
    private static /* synthetic */ String[] lIlIllIlllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        if (llIIIIIllIlllll(Combat.getCurrentHealth(), this.i.eatAt())) {
            return lIlIllIlllIll[0];
        }
        Item first = Inventory.getFirst(item -> {
            String str = lIlIllIlllIlI[lIlIllIlllIll[1]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        });
        if (llIIIIIlllIIIII(first)) {
            return lIlIllIlllIll[0];
        }
        first.interact(lIlIllIlllIlI[lIlIllIlllIll[0]]);
        return lIlIllIlllIll[1];
    }

    private static boolean llIIIIIlllIIIII(Object obj) {
        return obj == null;
    }

    private static String llIIIIIllIllIll(String llllllllllllllIllIlIIIIlllIIIIII, String llllllllllllllIllIlIIIIllIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlllIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlllIIIIlI.init(lIlIllIlllIll[2], secretKeySpec);
            return new String(llllllllllllllIllIlIIIIlllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIllIllllII) {
            llllllllllllllIllIlIIIIllIllllII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIllIllllI() {
        lIlIllIlllIll = new int[4];
        lIlIllIlllIll[0] = ((58 ^ 105) ^ (198 ^ 138)) & (((129 ^ 140) ^ (73 ^ 91)) ^ (-" ".length()));
        lIlIllIlllIll[1] = " ".length();
        lIlIllIlllIll[2] = "  ".length();
        lIlIllIlllIll[3] = (91 ^ 69) ^ (191 ^ 169);
    }

    private static boolean llIIIIIllIlllll(int i, int i2) {
        return i > i2;
    }

    static {
        llIIIIIllIllllI();
        llIIIIIllIlllIl();
    }

    private static void llIIIIIllIlllIl() {
        lIlIllIlllIlI = new String[lIlIllIlllIll[2]];
        lIlIllIlllIlI[lIlIllIlllIll[0]] = llIIIIIllIllIll("pB4uUTvHlhw=", "mgHMj");
        lIlIllIlllIlI[lIlIllIlllIll[1]] = llIIIIIllIlllII("3e+jwI6lSh8=", "lQPXj");
    }

    private static String llIIIIIllIlllII(String llllllllllllllIllIlIIIIllIllIIll, String llllllllllllllIllIlIIIIllIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlllIll[3]), "DES");
            Cipher llllllllllllllIllIlIIIIllIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIllIllIlIl.init(lIlIllIlllIll[2], llllllllllllllIllIlIIIIllIllIllI);
            return new String(llllllllllllllIllIlIIIIllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIllIllIlII) {
            llllllllllllllIllIlIIIIllIllIlII.printStackTrace();
            return null;
        }
    }
}
