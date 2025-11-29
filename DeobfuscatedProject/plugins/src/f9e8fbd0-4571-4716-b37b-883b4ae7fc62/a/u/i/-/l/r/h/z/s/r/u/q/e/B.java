/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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

@TaskDesc(name="Pressing continue", priority=0x7FFFFFFD, blocking=true)
public class B
extends Task {
    private static /* synthetic */ String[] lIllIllIIIIll;
    private final /* synthetic */ v W;
    private static /* synthetic */ int[] lIllIllIIIlIl;

    private static String llIIlIIIlIllIII(String llllllllllllllIllIIIlIllllIlIlll, String llllllllllllllIllIIIlIllllIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllllIlIllI.getBytes(StandardCharsets.UTF_8)), lIllIllIIIlIl[2]), "DES");
            Cipher llllllllllllllIllIIIlIllllIllIll = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllllIllIll.init(lIllIllIIIlIl[3], llllllllllllllIllIIIlIllllIlllII);
            return new String(llllllllllllllIllIIIlIllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIllllIllIlI) {
            llllllllllllllIllIIIlIllllIllIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public B(v v2) {
        this.W = v2;
    }

    public boolean run() {
        if (B.llIIlIIIlIllllI(Dialog.canContinue() ? 1 : 0)) {
            if (B.llIIlIIIlIllllI(Dialog.getText().contains(lIllIllIIIIll[lIllIllIIIlIl[0]]) ? 1 : 0)) {
                this.W.R();
            }
            Dialog.continueSpace();
            return lIllIllIIIlIl[1];
        }
        return lIllIllIIIlIl[0];
    }

    static {
        B.llIIlIIIlIlllIl();
        B.llIIlIIIlIllIIl();
    }

    private static boolean llIIlIIIlIllllI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIIlIlllIl() {
        lIllIllIIIlIl = new int[4];
        B.lIllIllIIIlIl[0] = (0x9B ^ 0xA1) & ~(0x23 ^ 0x19);
        B.lIllIllIIIlIl[1] = " ".length();
        B.lIllIllIIIlIl[2] = 0x37 ^ 0x31 ^ (0x14 ^ 0x1A);
        B.lIllIllIIIlIl[3] = "  ".length();
    }

    private static void llIIlIIIlIllIIl() {
        lIllIllIIIIll = new String[lIllIllIIIlIl[1]];
        B.lIllIllIIIIll[B.lIllIllIIIlIl[0]] = B.llIIlIIIlIllIII("K395LBogIfHkUD7MnYTS26lzyNukE+UI", "WdJUZ");
    }
}

