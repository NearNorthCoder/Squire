package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Plundering Sarcophagus", priority = 1)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.j  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/j.class */
public class j extends k {
    private static /* synthetic */ String[] llllllIIllIl;
    private static /* synthetic */ int[] llllllIIlllI;

    private static void lIIlIlIIIlIIIII() {
        llllllIIlllI = new int[5];
        llllllIIlllI[0] = (229 ^ 168) & ((194 ^ 143) ^ (-1));
        llllllIIlllI[1] = (-8193) & 12536;
        llllllIIlllI[2] = " ".length();
        llllllIIlllI[3] = (-8249) & 29503;
        llllllIIlllI[4] = "  ".length();
    }

    private static boolean lIIlIlIIIlIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIIIlllIl(String lllllllllllllllIIlIIlllIIlIlIIII, String lllllllllllllllIIlIIlllIIlIIllll) {
        String lllllllllllllllIIlIIlllIIlIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlllIIlIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlllIIlIIllIl = lllllllllllllllIIlIIlllIIlIIllll.toCharArray();
        int lllllllllllllllIIlIIlllIIlIIllII = llllllIIlllI[0];
        char[] charArray = lllllllllllllllIIlIIlllIIlIlIIII2.toCharArray();
        int length = charArray.length;
        int i = llllllIIlllI[0];
        while (lIIlIlIIIlIIlIl(i, length)) {
            char lllllllllllllllIIlIIlllIIlIlIIIl = charArray[i];
            lllllllllllllllIIlIIlllIIlIIlllI.append((char) (lllllllllllllllIIlIIlllIIlIlIIIl ^ lllllllllllllllIIlIIlllIIlIIllIl[lllllllllllllllIIlIIlllIIlIIllII % lllllllllllllllIIlIIlllIIlIIllIl.length]));
            "".length();
            lllllllllllllllIIlIIlllIIlIIllII++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlllIIlIIlllI);
    }

    private static boolean lIIlIlIIIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIIIlIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // u.l.n.q.r.p.p000.u.r.d.i.e.e.s.k
    public boolean j() {
        c f = c.f();
        if (!lIIlIlIIIlIIIIl(f) && !lIIlIlIIIlIIIlI(this.D.c(f) ? 1 : 0) && !lIIlIlIIIlIIIll(Players.getLocal().getAnimation(), llllllIIlllI[1])) {
            int[] iArr = new int[llllllIIlllI[2]];
            iArr[llllllIIlllI[0]] = llllllIIlllI[3];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIlIlIIIlIIlII(nearest)) {
                String[] strArr = new String[llllllIIlllI[2]];
                strArr[llllllIIlllI[0]] = llllllIIllIl[llllllIIlllI[0]];
                if (!lIIlIlIIIlIIIlI(nearest.hasAction(strArr) ? 1 : 0)) {
                    nearest.interact(llllllIIllIl[llllllIIlllI[2]]);
                    return llllllIIlllI[2];
                }
            }
            return llllllIIlllI[0];
        }
        return llllllIIlllI[0];
    }

    @Inject
    protected j(a aVar, Client client) {
        super(aVar, client);
    }

    private static String lIIlIlIIIIllllI(String lllllllllllllllIIlIIlllIIllIIIII, String lllllllllllllllIIlIIlllIIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIlllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIIllIIIIl) {
            lllllllllllllllIIlIIlllIIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIlIIIlI(int i) {
        return i == 0;
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIllIl = new String[llllllIIlllI[4]];
        llllllIIllIl[llllllIIlllI[0]] = lIIlIlIIIIlllIl("IBYpJw==", "ofLIm");
        llllllIIllIl[llllllIIlllI[2]] = lIIlIlIIIIllllI("3BWuOUJ5aaE=", "Ooyzk");
    }

    private static boolean lIIlIlIIIlIIIll(int i, int i2) {
        return i == i2;
    }

    static {
        lIIlIlIIIlIIIII();
        lIIlIlIIIIlllll();
    }
}
