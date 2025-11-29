package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Pressing continue", priority = 2147483645, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.B  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/B.class */
public class B extends Task {
    private static /* synthetic */ String[] lIllIllIIIIll;
    private final /* synthetic */ C0021v W;
    private static /* synthetic */ int[] lIllIllIIIlIl;

    private static String llIIlIIIlIllIII(String llllllllllllllIllIIIlIllllIllIIl, String llllllllllllllIllIIIlIllllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllllIllIII.getBytes(StandardCharsets.UTF_8)), lIllIllIIIlIl[2]), "DES");
            Cipher llllllllllllllIllIIIlIllllIllIll = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllllIllIll.init(lIllIllIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllIllIIIlIllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllllIllIlI) {
            llllllllllllllIllIIIlIllllIllIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public B(C0021v c0021v) {
        this.W = c0021v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (llIIlIIIlIllllI(Dialog.canContinue() ? 1 : 0)) {
            if (llIIlIIIlIllllI(Dialog.getText().contains(lIllIllIIIIll[lIllIllIIIlIl[0]]) ? 1 : 0)) {
                this.W.R();
            }
            Dialog.continueSpace();
            return lIllIllIIIlIl[1];
        }
        return lIllIllIIIlIl[0];
    }

    static {
        llIIlIIIlIlllIl();
        llIIlIIIlIllIIl();
    }

    private static boolean llIIlIIIlIllllI(int i) {
        return i != 0;
    }

    private static void llIIlIIIlIlllIl() {
        lIllIllIIIlIl = new int[4];
        lIllIllIIIlIl[0] = (155 ^ 161) & ((35 ^ 25) ^ (-1));
        lIllIllIIIlIl[1] = " ".length();
        lIllIllIIIlIl[2] = (55 ^ 49) ^ (20 ^ 26);
        lIllIllIIIlIl[3] = "  ".length();
    }

    private static void llIIlIIIlIllIIl() {
        lIllIllIIIIll = new String[lIllIllIIIlIl[1]];
        lIllIllIIIIll[lIllIllIIIlIl[0]] = llIIlIIIlIllIII("K395LBogIfHkUD7MnYTS26lzyNukE+UI", "WdJUZ");
    }
}
