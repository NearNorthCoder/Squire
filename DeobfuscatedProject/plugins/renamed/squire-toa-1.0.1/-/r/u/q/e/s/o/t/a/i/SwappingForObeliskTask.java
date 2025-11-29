/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.y_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* TASK: Swapping for obelisk -> SwappingforobeliskTask */
@TaskDesc(name="Swapping for obelisk", register=true)
public class SwappingForObeliskTask
extends y_Unknown {
    private static /* synthetic */ String[] lIIlllllIlIIl;
    private static /* synthetic */ int[] lIIlllllIlIlI;

    private static String lIllIlIlIIIllll(String var5, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIlllllIlIlI[2], var3);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean C() {
        return this.aL.obeliskGear().isSelected();
    }

    private static boolean lIllIlIlIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIlIlIIlIIII() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[1]];
        E.lIIlllllIlIIl[E.lIIlllllIlIlI[0]] = E."Obelisk";
    }

    static {
        E.lIllIlIlIIlIIIl();
        E.lIllIlIlIIlIIII();
    }

    private static void lIllIlIlIIlIIIl() {
        lIIlllllIlIlI = new int[3];
        E.lIIlllllIlIlI[0] = (0x19 ^ 9) & ~(0x12 ^ 2);
        E.lIIlllllIlIlI[1] = 1;
        E.lIIlllllIlIlI[2] = 2;
    }

    @Inject
    public E(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override
    public int[] a(String string) {
        if (E.lIllIlIlIIlIIlI(string.contains(lIIlllllIlIIl[lIIlllllIlIlI[0]]) ? 1 : 0)) {
            return this.a(this.aL.obeliskGear());
        }
        return new int[lIIlllllIlIlI[0]];
    }
}

