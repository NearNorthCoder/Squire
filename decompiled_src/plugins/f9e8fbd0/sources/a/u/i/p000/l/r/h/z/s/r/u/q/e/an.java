package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using imbued heart", priority = 5)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.an  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/an.class */
public class an extends Task {
    private static /* synthetic */ int[] lIllIllIlIlIl;
    @Inject
    private /* synthetic */ SquireZulrah E;
    private static /* synthetic */ String[] lIllIllIlIlII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (llIIlIIlIIIllll(this.E.d() ? 1 : 0)) {
            return lIllIllIlIlIl[0];
        }
        int[] iArr = new int[lIllIllIlIlIl[1]];
        iArr[lIllIllIlIlIl[0]] = lIllIllIlIlIl[2];
        iArr[lIllIllIlIlIl[3]] = lIllIllIlIlIl[4];
        Item first = Inventory.getFirst(iArr);
        if (!llIIlIIlIIlIIII(first) && !llIIlIIlIIlIIIl(Vars.getBit(lIllIllIlIlIl[5]))) {
            first.interact(lIllIllIlIlII[lIllIllIlIlIl[0]]);
            return lIllIllIlIlIl[3];
        }
        return lIllIllIlIlIl[0];
    }

    private static boolean llIIlIIlIIlIIIl(int i) {
        return i > 0;
    }

    static {
        llIIlIIlIIIlllI();
        llIIlIIlIIIllIl();
    }

    private static boolean llIIlIIlIIIllll(int i) {
        return i != 0;
    }

    private static void llIIlIIlIIIlllI() {
        lIllIllIlIlIl = new int[7];
        lIllIllIlIlIl[0] = "   ".length() & ("   ".length() ^ (-1));
        lIllIllIlIlIl[1] = "  ".length();
        lIllIllIlIlIl[2] = (-9217) & 29940;
        lIllIllIlIlIl[3] = " ".length();
        lIllIllIlIlIl[4] = (-1) & 27641;
        lIllIllIlIlIl[5] = (-10501) & 15861;
        lIllIllIlIlIl[6] = 29 ^ 21;
    }

    private static boolean llIIlIIlIIlIIII(Object obj) {
        return obj == null;
    }

    private static String llIIlIIlIIIlIlI(String llllllllllllllIllIIIlIlIIlIlIlII, String llllllllllllllIllIIIlIlIIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIllIlIlIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIlIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIIlIlIlIl) {
            llllllllllllllIllIIIlIlIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlIIIllIl() {
        lIllIllIlIlII = new String[lIllIllIlIlIl[3]];
        lIllIllIlIlII[lIllIllIlIlIl[0]] = llIIlIIlIIIlIlI("eXixtB94F4WYXrfMVPl23g==", "fZMDE");
    }
}
