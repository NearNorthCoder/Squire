package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Dodge Gaze", priority = 500, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.t  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/t.class */
public class t extends Task {
    final /* synthetic */ SquireDukeSucellus aG;
    private static /* synthetic */ String[] lIllIlllIIlI;
    final /* synthetic */ C0000a aH;
    private static /* synthetic */ int[] lIllIlllIIll;
    final /* synthetic */ SquireDukeSucellusConfig aI;

    private static boolean lllIlIIllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIlllIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    public boolean run() {
        if (lllIlIIllIllll(NPCs.getNearest(npc -> {
            return npc.getName().equals(lIllIlllIIlI[lIllIlllIIll[1]]);
        }))) {
            return lIllIlllIIll[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIlllIIII(tileObject.getName().equals(lIllIlllIIlI[lIllIlllIIll[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlllIIll[2]];
                strArr[lIllIlllIIll[0]] = lIllIlllIIlI[lIllIlllIIll[2]];
                if (lllIlIIlllIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlllIIll[2];
                    "".length();
                    return " ".length() >= "   ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlllIIll[0];
        });
        if (!lllIlIIllIllll(nearest) && !lllIlIIllIllll(Players.getLocal())) {
            int tickCount = Static.getClient().getTickCount() - this.aH.C();
            if ((!lllIlIIlllIIII(this.aI.safeDodge() ? 1 : 0) || lllIlIIlllIIIl(tickCount, lIllIlllIIll[1])) && !(lllIlIIlllIIlI(this.aI.safeDodge() ? 1 : 0) && lllIlIIlllIIll(tickCount, lIllIlllIIll[1]))) {
                if (lllIlIIlllIIII(C0004e.r(nearest) ? 1 : 0)) {
                    Movement.setDestination(C0004e.o(nearest));
                    return lIllIlllIIll[2];
                }
                Movement.setDestination(C0004e.m(nearest));
                return lIllIlllIIll[2];
            }
            return lIllIlllIIll[0];
        }
        return lIllIlllIIll[0];
    }

    private static void lllIlIIllIllIl() {
        lIllIlllIIlI = new String[lIllIlllIIll[3]];
        lIllIlllIIlI[lIllIlllIIll[0]] = lllIlIIllIllII("1Z+YPtOH3Ac=", "npoyk");
        lIllIlllIIlI[lIllIlllIIll[2]] = lllIlIIllIllII("mKRLdiXbDtmltHkacX8mNw==", "EFPlg");
        lIllIlllIIlI[lIllIlllIIll[1]] = lllIlIIllIllII("Sx+J0+nWkOu+a9e2vjC2Hw==", "sJYgK");
    }

    @Inject
    public t(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aG = squireDukeSucellus;
        this.aH = squireDukeSucellus.s();
        this.aI = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlllIIlI(int i) {
        return i == 0;
    }

    private static void lllIlIIllIlllI() {
        lIllIlllIIll = new int[4];
        lIllIlllIIll[0] = (57 ^ 107) & ((19 ^ 65) ^ (-1));
        lIllIlllIIll[1] = "  ".length();
        lIllIlllIIll[2] = " ".length();
        lIllIlllIIll[3] = "   ".length();
    }

    private static boolean lllIlIIlllIIII(int i) {
        return i != 0;
    }

    private static boolean lllIlIIlllIIll(int i, int i2) {
        return i != i2;
    }

    private static String lllIlIIllIllII(String lllllllllllllllIlIlllIlIIllIIIII, String lllllllllllllllIlIlllIlIIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIllIIIlI.init(lIllIlllIIll[1], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIllIIIIl) {
            lllllllllllllllIlIlllIlIIllIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIIllIlllI();
        lllIlIIllIllIl();
    }
}
