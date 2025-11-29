package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.o  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/o.class */
public class o extends Task {
    private final /* synthetic */ SquireVardorvisConfig ag;
    private final /* synthetic */ SquireVardorvis af;
    private static /* synthetic */ String[] lIlIlIIIIIIll;
    private static /* synthetic */ int[] lIlIlIIIIIlII;

    @Inject
    o(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.af = squireVardorvis;
        this.ag = squireVardorvisConfig;
    }

    private static String lIllllIIlllIlIl(String llllllllllllllIllIllIIlIllIIIIIl, String llllllllllllllIllIllIIlIlIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIlIlllllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIlII[6]), "DES");
            Cipher llllllllllllllIllIllIIlIllIIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIllIIIIll.init(lIlIlIIIIIlII[4], secretKeySpec);
            return new String(llllllllllllllIllIllIIlIllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIllIIIIlI) {
            llllllllllllllIllIllIIlIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIIllllIlI(int i) {
        return i != 0;
    }

    private static boolean lIllllIIllllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIIllllIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIllllIIlllIllI() {
        lIlIlIIIIIIll = new String[lIlIlIIIIIlII[5]];
        lIlIlIIIIIIll[lIlIlIIIIIlII[0]] = lIllllIIlllIlII("1neU6bIwBeA=", "IvORH");
        lIlIlIIIIIIll[lIlIlIIIIIlII[3]] = lIllllIIlllIlIl("ScnVayFXobI=", "DyfMN");
        lIlIlIIIIIIll[lIlIlIIIIIlII[4]] = lIllllIIlllIlII("mMJ8cJhSXk8=", "CAmiH");
    }

    static {
        lIllllIIlllIlll();
        lIllllIIlllIllI();
    }

    private static String lIllllIIlllIlII(String llllllllllllllIllIllIIlIllIIlllI, String llllllllllllllIllIllIIlIllIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIIIlII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIllIIllll) {
            llllllllllllllIllIllIIlIllIIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIlIlIIIIIIll[lIlIlIIIIIlII[4]]);
        });
        if (!lIllllIIllllIII(first) && !lIllllIIllllIIl(Movement.getRunEnergy(), lIlIlIIIIIlII[1])) {
            if (!lIllllIIllllIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
                first.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[3]]);
                return lIlIlIIIIIlII[3];
            } else if (lIllllIIllllIll(Movement.getRunEnergy(), lIlIlIIIIIlII[2])) {
                first.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[0]]);
                return lIlIlIIIIIlII[3];
            } else {
                return lIlIlIIIIIlII[0];
            }
        }
        return lIlIlIIIIIlII[0];
    }

    private static void lIllllIIlllIlll() {
        lIlIlIIIIIlII = new int[7];
        lIlIlIIIIIlII[0] = ((((31 + 1) - (-54)) + 54) ^ (((135 + 156) - 234) + 108)) & (((55 ^ 25) ^ (161 ^ 166)) ^ (-" ".length()));
        lIlIlIIIIIlII[1] = (94 ^ 98) ^ (7 ^ 37);
        lIlIlIIIIIlII[2] = (161 ^ 186) ^ (60 ^ 45);
        lIlIlIIIIIlII[3] = " ".length();
        lIlIlIIIIIlII[4] = "  ".length();
        lIlIlIIIIIlII[5] = "   ".length();
        lIlIlIIIIIlII[6] = 36 ^ 44;
    }
}
