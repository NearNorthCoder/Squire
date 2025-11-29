package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Emptying birdhouse", priority = 5)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aH  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aH.class */
public class aH extends aG {
    private static /* synthetic */ String[] llIIIlIIllll;
    private static /* synthetic */ int[] llIIIlIlIIII;

    private static String llllIlIIIlllIl(String lllllllllllllllIlIlIlIIIIlIIIIlI, String lllllllllllllllIlIlIlIIIIIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIIIlIIIIll) {
            lllllllllllllllIlIlIlIIIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIIlllll() {
        llIIIlIlIIII = new int[5];
        llIIIlIlIIII[0] = " ".length();
        llIIIlIlIIII[1] = (177 ^ 163) & ((142 ^ 156) ^ (-1));
        llIIIlIlIIII[2] = 89 ^ 73;
        llIIIlIlIIII[3] = "  ".length();
        llIIIlIlIIII[4] = (163 ^ 167) ^ (43 ^ 39);
    }

    private static boolean llllIlIIlIIIIl(Object obj) {
        return obj != null;
    }

    private static void llllIlIIIllllI() {
        llIIIlIIllll = new String[llIIIlIlIIII[3]];
        llIIIlIIllll[llIIIlIlIIII[1]] = llllIlIIIlllII("WZO7QMtn9mk=", "DHslU");
        llIIIlIIllll[llIIIlIlIIII[0]] = llllIlIIIlllIl("/LA2cxnKS/jlECIq5yFRg68fvlbQGyoBpsSZjSGd2tBDCsVzSp6TDA==", "ONdmC");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected aH(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j) {
        super(squireFarmer, squireFarmerConfig, c0035j, r4);
        F[] fArr = new F[llIIIlIlIIII[0]];
        fArr[llIIIlIlIIII[1]] = F.SEEDED;
    }

    private static String llllIlIIIlllII(String lllllllllllllllIlIlIlIIIIlIIllll, String lllllllllllllllIlIlIlIIIIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), llIIIlIlIIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIIIlIIlIll) {
            lllllllllllllllIlIlIlIIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIlIIIll(int i) {
        return i != 0;
    }

    private static boolean llllIlIIlIIIlI(int i, int i2) {
        return i > i2;
    }

    static {
        llllIlIIIlllll();
        llllIlIIIllllI();
    }

    private static boolean llllIlIIlIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aG
    public boolean f(E e) {
        if (llllIlIIlIIIII(this.cu.c(e) ? 1 : 0)) {
            return llIIIlIlIIII[1];
        }
        TileObject a = this.cu.a(e);
        if (!llllIlIIlIIIIl(a) || llllIlIIlIIIlI(a.distanceTo(Players.getLocal()), llIIIlIlIIII[2])) {
            return llIIIlIlIIII[1];
        }
        if (!llllIlIIlIIIll(Dialog.isViewingOptions() ? 1 : 0) || !llllIlIIlIIIll(Dialog.hasOption(str -> {
            return str.contains(llIIIlIIllll[llIIIlIlIIII[0]]);
        }) ? 1 : 0)) {
            a.interact(llIIIlIIllll[llIIIlIlIIII[1]]);
            return llIIIlIlIIII[0];
        }
        this.cu.Q().add(e);
        "".length();
        D d = this.cu.R().get(e);
        this.cu.R().replace(e, new D(e, d.ax(), d.ay() + Duration.ofMinutes(5L).toSeconds()));
        "".length();
        return llIIIlIlIIII[0];
    }
}
