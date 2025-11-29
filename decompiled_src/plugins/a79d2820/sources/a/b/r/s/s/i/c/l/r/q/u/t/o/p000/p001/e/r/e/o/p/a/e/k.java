package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Entering house portal", priority = 100, blocking = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.k  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/k.class */
public class k extends Task {
    private static /* synthetic */ String[] lIllIIIIlIII;
    private static /* synthetic */ int[] lIllIIIIlIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIIlllIlllI(lIllIIIIlIII[lIllIIIIlIIl[1]].equals(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[lIllIIIIlIIl[1]];
                strArr[lIllIIIIlIIl[0]] = lIllIIIIlIII[lIllIIIIlIIl[2]];
                if (lllIIIlllIlllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIIIlIIl[1];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIIIIlIIl[0];
        });
        if (lllIIIlllIllIl(nearest)) {
            return lIllIIIIlIIl[0];
        }
        nearest.interact(lIllIIIIlIII[lIllIIIIlIIl[0]]);
        return lIllIIIIlIIl[1];
    }

    private static void lllIIIlllIlIll() {
        lIllIIIIlIII = new String[lIllIIIIlIIl[3]];
        lIllIIIIlIII[lIllIIIIlIIl[0]] = lllIIIlllIlIlI("wIu4cihPyQg=", "xGacG");
        lIllIIIIlIII[lIllIIIIlIIl[1]] = lllIIIlllIlIlI("y8hj7jhYmu8=", "epzPJ");
        lIllIIIIlIII[lIllIIIIlIIl[2]] = lllIIIlllIlIlI("Y/GAs5sSJ14=", "UCxcZ");
    }

    private static boolean lllIIIlllIllIl(Object obj) {
        return obj == null;
    }

    static {
        lllIIIlllIllII();
        lllIIIlllIlIll();
    }

    private static void lllIIIlllIllII() {
        lIllIIIIlIIl = new int[4];
        lIllIIIIlIIl[0] = ((202 ^ 137) ^ (97 ^ 62)) & (((141 ^ 154) ^ (91 ^ 80)) ^ (-" ".length()));
        lIllIIIIlIIl[1] = " ".length();
        lIllIIIIlIIl[2] = "  ".length();
        lIllIIIIlIIl[3] = "   ".length();
    }

    private static String lllIIIlllIlIlI(String lllllllllllllllIllIIIlIlIIIIIIll, String lllllllllllllllIllIIIlIlIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlIlIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlIlIIIIIlIl.init(lIllIIIIlIIl[2], lllllllllllllllIllIIIlIlIIIIIllI);
            return new String(lllllllllllllllIllIIIlIlIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlIlIIIIIlII) {
            lllllllllllllllIllIIIlIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlllIlllI(int i) {
        return i != 0;
    }
}
