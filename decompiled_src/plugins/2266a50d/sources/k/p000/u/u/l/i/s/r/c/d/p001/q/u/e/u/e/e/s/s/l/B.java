package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Swapping Sides", priority = 301, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.B  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/B.class */
public class B extends Task {
    final /* synthetic */ SquireDukeSucellus bb;
    final /* synthetic */ C0000a bc;
    private static /* synthetic */ String[] lIllIlIIllIl;
    private static /* synthetic */ int[] lIllIlIllIlI;

    private static void lllIIlllIllIII() {
        lIllIlIIllIl = new String[lIllIlIllIlI[4]];
        lIllIlIIllIl[lIllIlIllIlI[0]] = lllIIlllIlIlIl("FoKjsPoeGSE=", "bDnMc");
        lIllIlIIllIl[lIllIlIllIlI[1]] = lllIIlllIlIllI("EB4zMC1sDikwJzEO", "AkZSF");
        lIllIlIIllIl[lIllIlIllIlI[2]] = lllIIlllIlIlll("WxO3uYnNYZiPlNX6LYy5ww==", "MthGp");
        lIllIlIIllIl[lIllIlIllIlI[3]] = lllIIlllIlIlIl("U2G0ZT+2+Os=", "KhLyY");
    }

    private static boolean lllIlIIIIlIlll(int i, int i2) {
        return i < i2;
    }

    static {
        lllIlIIIIlIIll();
        lllIIlllIllIII();
    }

    private static boolean lllIlIIIIlIllI(int i) {
        return i != 0;
    }

    private static String lllIIlllIlIlll(String lllllllllllllllIlIllllIIllIlIIll, String lllllllllllllllIlIllllIIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIllIlIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIllIlI[5]), "DES");
            Cipher lllllllllllllllIlIllllIIllIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIllIlIlll.init(lIllIlIllIlI[2], lllllllllllllllIlIllllIIllIllIII);
            return new String(lllllllllllllllIlIllllIIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIllIlIllI) {
            lllllllllllllllIlIllllIIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIlIl(String lllllllllllllllIlIllllIIllIIlIII, String lllllllllllllllIlIllllIIllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIllIIlIIl) {
            lllllllllllllllIlIllllIIllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIllI(String lllllllllllllllIlIllllIIlIlllIII, String lllllllllllllllIlIllllIIlIllIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIIlIllIllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllllIIlIllIlll.toCharArray();
        int lllllllllllllllIlIllllIIlIllIlII = lIllIlIllIlI[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIllllIIlIlIllIl = charArray2.length;
        int i = lIllIlIllIlI[0];
        while (lllIlIIIIlIlll(i, lllllllllllllllIlIllllIIlIlIllIl)) {
            char lllllllllllllllIlIllllIIlIlllIIl = charArray2[i];
            lllllllllllllllIlIllllIIlIllIllI.append((char) (lllllllllllllllIlIllllIIlIlllIIl ^ charArray[lllllllllllllllIlIllllIIlIllIlII % charArray.length]));
            "".length();
            lllllllllllllllIlIllllIIlIllIlII++;
            i++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllllIIlIllIllI);
    }

    private static boolean lllIlIIIIlIlII(int i) {
        return i == 0;
    }

    @Inject
    public B(SquireDukeSucellus squireDukeSucellus) {
        this.bb = squireDukeSucellus;
        this.bc = squireDukeSucellus.s();
    }

    private static void lllIlIIIIlIIll() {
        lIllIlIllIlI = new int[6];
        lIllIlIllIlI[0] = (11 ^ 52) & ((3 ^ 60) ^ (-1));
        lIllIlIllIlI[1] = " ".length();
        lIllIlIllIlI[2] = "  ".length();
        lIllIlIllIlI[3] = "   ".length();
        lIllIlIllIlI[4] = 50 ^ 54;
        lIllIlIllIlI[5] = 117 ^ 125;
    }

    private static boolean lllIlIIIIlIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (lllIlIIIIlIlII(this.bb.k() ? 1 : 0)) {
            return lIllIlIllIlI[0];
        }
        if (lllIlIIIIlIlIl(NPCs.getNearest(npc -> {
            if (lllIlIIIIlIllI(npc.getName().equals(lIllIlIIllIl[lIllIlIllIlI[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIllIlI[1]];
                strArr[lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[3]];
                if (lllIlIIIIlIllI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIllIlI[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlIllIlI[0];
        }))) {
            this.bb.c((boolean) lIllIlIllIlI[0]);
            return lIllIlIllIlI[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIIIlIllI(tileObject.getName().equals(lIllIlIIllIl[lIllIlIllIlI[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIllIlI[1]];
                strArr[lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[1]];
                if (lllIlIIIIlIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIllIlI[1];
                    "".length();
                    return "  ".length() == 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                }
            }
            return lIllIlIllIlI[0];
        });
        if (lllIlIIIIlIlIl(nearest)) {
            return lIllIlIllIlI[0];
        }
        if (!lllIlIIIIlIllI(this.bc.j() ? 1 : 0)) {
            if (lllIlIIIIlIllI(C0004e.r(nearest) ? 1 : 0)) {
                this.bb.c((boolean) lIllIlIllIlI[0]);
            }
            Movement.setDestination(C0004e.o(nearest));
            return lIllIlIllIlI[1];
        } else if (lllIlIIIIlIllI(C0004e.q(nearest) ? 1 : 0)) {
            this.bb.c((boolean) lIllIlIllIlI[0]);
            return lIllIlIllIlI[0];
        } else {
            Movement.setDestination(C0004e.m(nearest));
            return lIllIlIllIlI[1];
        }
    }
}
