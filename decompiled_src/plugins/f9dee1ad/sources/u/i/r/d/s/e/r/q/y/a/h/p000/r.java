package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating", priority = 10)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.r  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/r.class */
public class r extends Task {
    private final /* synthetic */ C0000a av;
    private static /* synthetic */ int[] llllIlIIllIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig aw;
    private static /* synthetic */ String[] llllIlIIllII;

    private static boolean lIIlIIIIlIlllll(int i, int i2) {
        return i > i2;
    }

    @Inject
    public r(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.av = c0000a;
        this.aw = squireAlchemicalHydraConfig;
    }

    private static void lIIlIIIIlIlllII() {
        llllIlIIllII = new String[llllIlIIllIl[3]];
        llllIlIIllII[llllIlIIllIl[0]] = lIIlIIIIlIllIlI("iRpk+eojotM=", "tfpdG");
        llllIlIIllII[llllIlIIllIl[2]] = lIIlIIIIlIllIll("r5AMezSgCFM=", "vQXxG");
    }

    private static String lIIlIIIIlIllIll(String lllllllllllllllIIlIlIIlIIlIIlllI, String lllllllllllllllIIlIlIIlIIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIlIIlIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIlIIlIlIIII.init(llllIlIIllIl[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlIIlIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIIlIIllll) {
            lllllllllllllllIIlIlIIlIIlIIllll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIIlIlllIl();
        lIIlIIIIlIlllII();
    }

    private static void lIIlIIIIlIlllIl() {
        llllIlIIllIl = new int[5];
        llllIlIIllIl[0] = ((58 ^ 63) ^ (20 ^ 2)) & (((141 ^ 131) ^ (121 ^ 100)) ^ (-" ".length()));
        llllIlIIllIl[1] = (((72 + 91) - (-29)) + 0) ^ (((10 + 71) - (-60)) + 55);
        llllIlIIllIl[2] = " ".length();
        llllIlIIllIl[3] = "  ".length();
        llllIlIIllIl[4] = (45 ^ 62) ^ (220 ^ 199);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIlIllllI(this.av.g() ? 1 : 0) && !lIIlIIIIlIlllll(Combat.getCurrentHealth(), this.aw.eatAt())) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIlIIllIl[2]];
                strArr[llllIlIIllIl[0]] = llllIlIIllII[llllIlIIllIl[2]];
                return item.hasAction(strArr);
            });
            if (lIIlIIIIllIIIII(first)) {
                return llllIlIIllIl[0];
            }
            first.interact(llllIlIIllII[llllIlIIllIl[0]]);
            sleep(llllIlIIllIl[1]);
            return llllIlIIllIl[2];
        }
        return llllIlIIllIl[0];
    }

    private static boolean lIIlIIIIllIIIII(Object obj) {
        return obj == null;
    }

    private static String lIIlIIIIlIllIlI(String lllllllllllllllIIlIlIIlIIlIIIIIl, String lllllllllllllllIIlIlIIlIIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlIIIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIllIl[4]), "DES");
            Cipher lllllllllllllllIIlIlIIlIIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIIlIIIIll.init(llllIlIIllIl[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlIIlIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIIlIIIIlI) {
            lllllllllllllllIIlIlIIlIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIllllI(int i) {
        return i == 0;
    }
}
