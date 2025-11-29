/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.y;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@TaskDesc(name="Swapping for obelisk", register=true)
public class E
extends y {
    private static /* synthetic */ String[] lIIlllllIlIIl;
    private static /* synthetic */ int[] lIIlllllIlIlI;

    private static String lIllIlIlIIIllll(String llllllllllllllIlllIlIIIIIIlllIIl, String llllllllllllllIlllIlIIIIIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIIIlllIll.init(lIIlllllIlIlI[2], llllllllllllllIlllIlIIIIIIllllII);
            return new String(llllllllllllllIlllIlIIIIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIIIlllIlI) {
            llllllllllllllIlllIlIIIIIIlllIlI.printStackTrace();
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
        E.lIIlllllIlIIl[E.lIIlllllIlIlI[0]] = E.lIllIlIlIIIllll("gIsnCFSfJ6Q=", "YVGXn");
    }

    static {
        E.lIllIlIlIIlIIIl();
        E.lIllIlIlIIlIIII();
    }

    private static void lIllIlIlIIlIIIl() {
        lIIlllllIlIlI = new int[3];
        E.lIIlllllIlIlI[0] = (0x19 ^ 9) & ~(0x12 ^ 2);
        E.lIIlllllIlIlI[1] = " ".length();
        E.lIIlllllIlIlI[2] = "  ".length();
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

