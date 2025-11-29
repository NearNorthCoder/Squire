package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Banking")
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.b  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/b.class */
public class b extends Task {
    private static /* synthetic */ int[] llllllIIIllI;
    private final /* synthetic */ SquirePlankerConfig l;
    private static /* synthetic */ String[] llllllIIIlIl;

    private static void lIIlIIlllllllIl() {
        llllllIIIlIl = new String[llllllIIIllI[3]];
        llllllIIIlIl[llllllIIIllI[2]] = lIIlIIlllllIlll("yFzka4gNVoR2BxJBxUJqIQ==", "qrOaY");
        llllllIIIlIl[llllllIIIllI[0]] = lIIlIIlllllIlll("A7zCU5ag6HA=", "foEUA");
    }

    private static boolean lIIlIlIIIIIIIlI(int i) {
        return i != 0;
    }

    private static String lIIlIIlllllIlll(String lllllllllllllllIIlIIllllIIllllll, String lllllllllllllllIIlIIllllIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllllIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllIlIIIIII.getBytes(StandardCharsets.UTF_8)), llllllIIIllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIIllI[3], lllllllllllllllIIlIIllllIlIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllllIlIIIIlI) {
            lllllllllllllllIIlIIllllIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIlllllllll(int i) {
        return i == 0;
    }

    static {
        lIIlIIllllllllI();
        lIIlIIlllllllIl();
    }

    @Inject
    public b(SquirePlankerConfig squirePlankerConfig) {
        this.l = squirePlankerConfig;
    }

    private static void lIIlIIllllllllI() {
        llllllIIIllI = new int[5];
        llllllIIIllI[0] = " ".length();
        llllllIIIllI[1] = (((129 + 78) - 197) + 136) ^ (((73 + 152) - 131) + 66);
        llllllIIIllI[2] = ((((5 + 73) - (-22)) + 38) ^ (((105 + 130) - 183) + 95)) & (((82 ^ 46) ^ (192 ^ 165)) ^ (-" ".length()));
        llllllIIIllI[3] = "  ".length();
        llllllIIIllI[4] = 37 ^ 45;
    }

    private static boolean lIIlIlIIIIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIIIIIIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    public boolean run() {
        if (lIIlIIlllllllll(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIIllI[0];
        }
        if (lIIlIlIIIIIIIII(Movement.getRunEnergy(), llllllIIIllI[1]) && lIIlIIlllllllll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llllllIIIllI[0];
        }
        int[] iArr = new int[llllllIIIllI[0]];
        iArr[llllllIIIllI[2]] = this.l.plank().d();
        if (lIIlIlIIIIIIIIl(Inventory.getFirst(iArr))) {
            if (lIIlIlIIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return llllllIIIllI[2];
        } else if (!lIIlIIlllllllll(Bank.isOpen() ? 1 : 0)) {
            int[] iArr2 = new int[llllllIIIllI[0]];
            iArr2[llllllIIIllI[2]] = this.l.plank().f();
            Bank.depositAll(iArr2);
            Bank.withdrawAll(this.l.plank().d(), Bank.WithdrawMode.ITEM);
            return llllllIIIllI[0];
        } else {
            if (lIIlIlIIIIIIIlI(this.l.ironMode() ? 1 : 0)) {
                String[] strArr = new String[llllllIIIllI[0]];
                strArr[llllllIIIllI[2]] = llllllIIIlIl[llllllIIIllI[2]];
                TileObject nearest = TileObjects.getNearest(strArr);
                if (lIIlIlIIIIIIIll(nearest)) {
                    return llllllIIIllI[2];
                }
                nearest.interact(llllllIIIlIl[llllllIIIllI[0]]);
            }
            Bank.open();
            "".length();
            return llllllIIIllI[0];
        }
    }
}
