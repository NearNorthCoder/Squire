package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Entering portal", priority = 1000, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.F  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/F.class */
public class F extends E {
    private static /* synthetic */ String[] lIllIlIlIIlIl;
    private static /* synthetic */ int[] lIllIlIlIIllI;

    private static void llIIIlllllllIlI() {
        lIllIlIlIIlIl = new String[lIllIlIlIIllI[1]];
        lIllIlIlIIlIl[lIllIlIlIIllI[0]] = llIIIlllllllIIl("3Z8YevdZehI=", "OhCBd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean run() {
        if (!llIIIllllllllIl(this.aa.d() ? 1 : 0) || llIIIllllllllIl(ad() ? 1 : 0)) {
            return lIllIlIlIIllI[0];
        }
        int[] iArr = new int[lIllIlIlIIllI[1]];
        iArr[lIllIlIlIIllI[0]] = lIllIlIlIIllI[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!llIIIlllllllllI(nearest) && !llIIIllllllllll(ae().needsToBank() ? 1 : 0)) {
            nearest.interact(lIllIlIlIIlIl[lIllIlIlIIllI[0]]);
            return lIllIlIlIIllI[1];
        }
        return lIllIlIlIIllI[0];
    }

    @Inject
    protected F(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
    }

    private static boolean llIIIllllllllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        return lIllIlIlIIllI[0];
    }

    private static String llIIIlllllllIIl(String llllllllllllllIllIIIlllIIIIllIII, String llllllllllllllIllIIIlllIIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIllI[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIlIIllI[4], llllllllllllllIllIIIlllIIIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllIIIIllIIl) {
            llllllllllllllIllIIIlllIIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIllllllllII() {
        lIllIlIlIIllI = new int[5];
        lIllIlIlIIllI[0] = (91 ^ 106) & ((29 ^ 44) ^ (-1));
        lIllIlIlIIllI[1] = " ".length();
        lIllIlIlIIllI[2] = (-1259) & 27903;
        lIllIlIlIIllI[3] = 190 ^ 182;
        lIllIlIlIIllI[4] = "  ".length();
    }

    static {
        llIIIllllllllII();
        llIIIlllllllIlI();
    }

    private static boolean llIIIllllllllll(int i) {
        return i != 0;
    }

    private static boolean llIIIlllllllllI(Object obj) {
        return obj == null;
    }
}
