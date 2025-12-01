package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Using Portal", priority = 100, blocking = true)
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.g  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/g.class */
public class g extends Task {
    private static /* synthetic */ String[] lIllIIIIllI;
    private static /* synthetic */ int[] lIllIIIlIII;
    private final /* synthetic */ AgilityConfig v;

    private static boolean lIIlIlIlIIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public g(AgilityConfig agilityConfig) {
        this.v = agilityConfig;
    }

    private static String lIIlIlIlIIIIlI(String llllllllllllllllIlIlIlIIlllIlllI, String llllllllllllllllIlIlIlIIlllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIllIIIlIII[4]), "DES");
            Cipher llllllllllllllllIlIlIlIIllllIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIIllllIIII.init(lIllIIIlIII[2], llllllllllllllllIlIlIlIIllllIIIl);
            return new String(llllllllllllllllIlIlIlIIllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIlllIllll) {
            llllllllllllllllIlIlIlIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIllII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIlIIlIll(Object obj) {
        return obj == null;
    }

    static {
        lIIlIlIlIIIlll();
        lIIlIlIlIIIIll();
    }

    private static boolean lIIlIlIlIIlIlI(int i) {
        return i != 0;
    }

    private static String lIIlIlIlIIIIIl(String llllllllllllllllIlIlIlIIlllllIll, String llllllllllllllllIlIlIlIIlllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIllllllII) {
            llllllllllllllllIlIlIlIIllllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIIIll() {
        lIllIIIIllI = new String[lIllIIIlIII[3]];
        lIllIIIIllI[lIllIIIlIII[0]] = lIIlIlIlIIIIIl("oF/sGJOM6s0=", "eiOKl");
        lIllIIIIllI[lIllIIIlIII[1]] = lIIlIlIlIIIIlI("8iNr7TNzk3w=", "xZuUY");
        lIllIIIIllI[lIllIIIlIII[2]] = lIIlIlIlIIIIlI("+3IIei2F+mw=", "gBCOo");
    }

    private static boolean lIIlIlIlIIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIlIIIlll() {
        lIllIIIlIII = new int[5];
        lIllIIIlIII[0] = ((((121 + 90) - 138) + 66) ^ (((118 + 54) - 134) + 115)) & (((((25 + 113) - 1) + 52) ^ (((95 + 140) - 232) + 172)) ^ (-" ".length()));
        lIllIIIlIII[1] = " ".length();
        lIllIIIlIII[2] = "  ".length();
        lIllIIIlIII[3] = "   ".length();
        lIllIIIlIII[4] = 82 ^ 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIlIlIlIIlIII(this.v.course(), b.PRIFDDINAS)) {
            return lIllIIIlIII[0];
        }
        Player local = Players.getLocal();
        if (!lIIlIlIlIIlIIl(local) || lIIlIlIlIIlIlI(local.isAnimating() ? 1 : 0)) {
            return lIllIIIlIII[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlIlIlIIlIlI(tileObject.getName().equals(lIllIIIIllI[lIllIIIlIII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIIlIII[1]];
                strArr[lIllIIIlIII[0]] = lIllIIIIllI[lIllIIIlIII[2]];
                if (lIIlIlIlIIlIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIIlIII[1];
                    "".length();
                    return ((243 ^ 134) ^ (247 ^ 134)) < (((((73 + 7) - 47) + 94) ^ (17 ^ 33)) & (((31 ^ 16) ^ (198 ^ 134)) ^ (-" ".length()))) ? ((54 ^ 35) ^ (103 ^ 98)) & (((241 ^ 180) ^ (49 ^ 100)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIIIlIII[0];
        });
        if (lIIlIlIlIIlIll(nearest)) {
            return lIllIIIlIII[0];
        }
        if (lIIlIlIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIlIII[1];
        }
        nearest.interact(lIllIIIIllI[lIllIIIlIII[0]]);
        return lIllIIIlIII[1];
    }
}
