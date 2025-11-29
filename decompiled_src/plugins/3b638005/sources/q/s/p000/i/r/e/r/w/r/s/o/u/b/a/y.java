package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Opening chest", priority = 220, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.y  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/y.class */
public class y extends Task {
    private final /* synthetic */ SquireBarrows an;
    private final /* synthetic */ SquireBarrowsConfig ao;
    private static /* synthetic */ int[] llllIIIIlII;
    private static /* synthetic */ String[] llllIIIIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (lIllIIllIIIlII(this.an.h() ? 1 : 0)) {
            return llllIIIIlII[0];
        }
        String[] strArr = new String[llllIIIIlII[1]];
        strArr[llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIIllIIIlIl(nearest)) {
            return llllIIIIlII[0];
        }
        String[] strArr2 = new String[llllIIIIlII[1]];
        strArr2[llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[1]];
        if (lIllIIllIIIllI(nearest.hasAction(strArr2) ? 1 : 0) && lIllIIllIIIllI(Reachable.isInteractable(nearest) ? 1 : 0) && !lIllIIllIIIlll(nearest.distanceTo(Players.getLocal().getWorldLocation()), llllIIIIlII[2])) {
            nearest.interact(llllIIIIIll[llllIIIIlII[3]]);
            return llllIIIIlII[1];
        }
        return llllIIIIlII[0];
    }

    private static boolean lIllIIllIIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIllIIIIIl(String llllllllllllllllIIIllllIIlllIIIl, String llllllllllllllllIIIllllIIlllIIII) {
        String llllllllllllllllIIIllllIIlllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllllIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllllIIllIllll = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllllIIlllIIII.toCharArray();
        int llllllllllllllllIIIllllIIllIllIl = llllIIIIlII[0];
        char[] charArray2 = llllllllllllllllIIIllllIIlllIIIl2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIlII[0];
        while (lIllIIllIIlIII(i, length)) {
            char llllllllllllllllIIIllllIIlllIIlI = charArray2[i];
            llllllllllllllllIIIllllIIllIllll.append((char) (llllllllllllllllIIIllllIIlllIIlI ^ charArray[llllllllllllllllIIIllllIIllIllIl % charArray.length]));
            "".length();
            llllllllllllllllIIIllllIIllIllIl++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllllIIllIllll);
    }

    static {
        lIllIIllIIIIll();
        lIllIIllIIIIlI();
    }

    private static void lIllIIllIIIIll() {
        llllIIIIlII = new int[5];
        llllIIIIlII[0] = (85 ^ 9) & ((44 ^ 112) ^ (-1));
        llllIIIIlII[1] = " ".length();
        llllIIIIlII[2] = 40 ^ 46;
        llllIIIIlII[3] = "  ".length();
        llllIIIIlII[4] = "   ".length();
    }

    private static void lIllIIllIIIIlI() {
        llllIIIIIll = new String[llllIIIIlII[4]];
        llllIIIIIll[llllIIIIlII[0]] = lIllIIllIIIIII("83PnX4IKnqc=", "FBHBM");
        llllIIIIIll[llllIIIIlII[1]] = lIllIIllIIIIIl("ATYVHg==", "NFppm");
        llllIIIIIll[llllIIIIlII[3]] = lIllIIllIIIIII("EiGP0rtjUEg=", "klSVR");
    }

    private static String lIllIIllIIIIII(String llllllllllllllllIIIllllIIlIlllII, String llllllllllllllllIIIllllIIlIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllllIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllllIIlIllllI.init(llllIIIIlII[3], secretKeySpec);
            return new String(llllllllllllllllIIIllllIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllllIIlIlllIl) {
            llllllllllllllllIIIllllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIllIIllIIIlII(int i) {
        return i == 0;
    }

    private static boolean lIllIIllIIIlll(int i, int i2) {
        return i > i2;
    }

    @Inject
    public y(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.an = squireBarrows;
        this.ao = squireBarrowsConfig;
    }
}
