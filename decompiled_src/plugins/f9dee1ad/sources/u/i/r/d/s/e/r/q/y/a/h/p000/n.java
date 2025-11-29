package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Entering hydra room", priority = 5, blocking = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.n  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/n.class */
public class n extends Task {
    public static final /* synthetic */ int ao;
    private static /* synthetic */ String[] llllIIlIllII;
    private static /* synthetic */ int[] llllIIlIllIl;
    private final /* synthetic */ C0000a ap;

    private static boolean lIIIllllllllIIl(Object obj) {
        return obj == null;
    }

    private static String lIIIlllllllIlII(String lllllllllllllllIIlIlIlIlIIIIlIll, String lllllllllllllllIIlIlIlIlIIIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIlIlIlIIIIlIII = lllllllllllllllIIlIlIlIlIIIIlIlI.toCharArray();
        int lllllllllllllllIIlIlIlIlIIIIIlll = llllIIlIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIlIllIl[0];
        while (lIIIllllllllIlI(i, length)) {
            char lllllllllllllllIIlIlIlIlIIIIllII = charArray[i];
            sb.append((char) (lllllllllllllllIIlIlIlIlIIIIllII ^ lllllllllllllllIIlIlIlIlIIIIlIII[lllllllllllllllIIlIlIlIlIIIIIlll % lllllllllllllllIIlIlIlIlIIIIlIII.length]));
            "".length();
            lllllllllllllllIIlIlIlIlIIIIIlll++;
            i++;
            "".length();
            if (((64 ^ 30) & ((112 ^ 46) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlllllllIIll(String lllllllllllllllIIlIlIlIlIIIllIll, String lllllllllllllllIIlIlIlIlIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIlIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIlIIIlllIl.init(llllIIlIllIl[3], lllllllllllllllIIlIlIlIlIIIllllI);
            return new String(lllllllllllllllIIlIlIlIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIlIIIlllII) {
            lllllllllllllllIIlIlIlIlIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllllIlI(int i, int i2) {
        return i < i2;
    }

    @Inject
    public n(C0000a c0000a) {
        this.ap = c0000a;
    }

    static {
        lIIIlllllllIllI();
        lIIIlllllllIlIl();
        ao = llllIIlIllIl[1];
    }

    private static void lIIIlllllllIllI() {
        llllIIlIllIl = new int[4];
        llllIIlIllIl[0] = (64 ^ 29) & ((192 ^ 157) ^ (-1));
        llllIIlIllIl[1] = (116 ^ 38) ^ (102 ^ 23);
        llllIIlIllIl[2] = " ".length();
        llllIIlIllIl[3] = "  ".length();
    }

    private static boolean lIIIlllllllIlll(int i) {
        return i == 0;
    }

    private static boolean lIIIllllllllIII(int i, int i2) {
        return i > i2;
    }

    private static void lIIIlllllllIlIl() {
        llllIIlIllII = new String[llllIIlIllIl[3]];
        llllIIlIllII[llllIIlIllIl[0]] = lIIIlllllllIIll("zUtYPwFcyMF6dud0alNP/w==", "NuiJi");
        llllIIlIllII[llllIIlIllIl[2]] = lIIIlllllllIlII("ASA4AD59OiEGOw==", "PUQcU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        if (!lIIIlllllllIlll(this.ap.g() ? 1 : 0) && !lIIIllllllllIII(RegionPoint.fromWorld(Players.getLocal().getWorldLocation()).getX(), llllIIlIllIl[1])) {
            String[] strArr = new String[llllIIlIllIl[2]];
            strArr[llllIIlIllIl[0]] = llllIIlIllII[llllIIlIllIl[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIIllllllllIIl(nearest)) {
                return llllIIlIllIl[0];
            }
            nearest.interact(llllIIlIllII[llllIIlIllIl[2]]);
            return llllIIlIllIl[2];
        }
        return llllIIlIllIl[0];
    }
}
