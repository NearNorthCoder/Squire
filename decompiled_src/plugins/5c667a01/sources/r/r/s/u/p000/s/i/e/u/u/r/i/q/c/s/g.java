package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Stamina handler", priority = 2137483647)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.g  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIIlIllIlIllI;
    private static /* synthetic */ int[] lIIlIllIlIlll;
    private final /* synthetic */ SquireScurriusConfig P;
    private final /* synthetic */ SquireScurrius O;

    private static void lIlIllIlIlIIIlI() {
        lIIlIllIlIlll = new int[7];
        lIIlIllIlIlll[0] = (194 ^ 139) & ((115 ^ 58) ^ (-1));
        lIIlIllIlIlll[1] = (17 ^ 63) ^ (108 ^ 92);
        lIIlIllIlIlll[2] = 205 ^ 199;
        lIIlIllIlIlll[3] = " ".length();
        lIIlIllIlIlll[4] = "  ".length();
        lIIlIllIlIlll[5] = "   ".length();
        lIIlIllIlIlll[6] = (215 ^ 183) ^ (235 ^ 131);
    }

    private static String lIlIllIlIlIIIII(String llllllllllllllIllllIlIIlllllllIl, String llllllllllllllIllllIlIIlllllllII) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIlllllllII.getBytes(StandardCharsets.UTF_8)), lIIlIllIlIlll[6]), "DES");
            Cipher llllllllllllllIllllIlIIlllllllll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIlllllllll.init(lIIlIllIlIlll[4], llllllllllllllIllllIlIlIIIIIIIII);
            return new String(llllllllllllllIllllIlIIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIllllllllI) {
            llllllllllllllIllllIlIIllllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlIlIIIIl() {
        lIIlIllIlIllI = new String[lIIlIllIlIlll[5]];
        lIIlIllIlIllI[lIIlIllIlIlll[0]] = lIlIllIlIIllIII("aDUFz/Pg7Ko=", "eNZDw");
        lIIlIllIlIllI[lIIlIllIlIlll[3]] = lIlIllIlIlIIIII("Nz+QgIXglLk=", "XyVTE");
        lIIlIllIlIllI[lIIlIllIlIlll[4]] = lIlIllIlIlIIIII("HGXNgAdvD54=", "XwoZF");
    }

    private static boolean lIlIllIlIlIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIlIlIIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIIlIllIlIllI[lIIlIllIlIlll[4]]);
        });
        if (!lIlIllIlIlIIIll(first) && !lIlIllIlIlIIlII(Movement.getRunEnergy(), lIIlIllIlIlll[1])) {
            if (!lIlIllIlIlIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
                first.interact(lIIlIllIlIllI[lIIlIllIlIlll[3]]);
                return lIIlIllIlIlll[3];
            } else if (lIlIllIlIlIIllI(Movement.getRunEnergy(), lIIlIllIlIlll[2])) {
                first.interact(lIIlIllIlIllI[lIIlIllIlIlll[0]]);
                return lIIlIllIlIlll[3];
            } else {
                return lIIlIllIlIlll[0];
            }
        }
        return lIIlIllIlIlll[0];
    }

    private static boolean lIlIllIlIlIIlII(int i, int i2) {
        return i >= i2;
    }

    @Inject
    g(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.O = squireScurrius;
        this.P = squireScurriusConfig;
    }

    static {
        lIlIllIlIlIIIlI();
        lIlIllIlIlIIIIl();
    }

    private static String lIlIllIlIIllIII(String llllllllllllllIllllIlIlIIIIIlIlI, String llllllllllllllIllllIlIlIIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIlIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlIIIIIlIll) {
            llllllllllllllIllllIlIlIIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIlIIlIl(int i) {
        return i != 0;
    }
}
