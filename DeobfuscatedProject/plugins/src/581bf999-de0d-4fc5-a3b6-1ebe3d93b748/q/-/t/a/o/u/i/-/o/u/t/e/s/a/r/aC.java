/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.V;

@TaskDesc(name="Swapping for obelisk", register=true)
public class aC
extends V {
    private static /* synthetic */ int[] lIlllIIlIII;
    private static /* synthetic */ String[] lIlllIIIllI;

    private static void lIIllIIIllllII() {
        lIlllIIlIII = new int[3];
        aC.lIlllIIlIII[0] = (0x68 ^ 0x50 ^ (0xDF ^ 0xB5)) & (0xE5 ^ 0xB9 ^ (0x81 ^ 0x8F) ^ -" ".length());
        aC.lIlllIIlIII[1] = " ".length();
        aC.lIlllIIlIII[2] = "  ".length();
    }

    private static boolean lIIllIIIllllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aL() {
        return this.cf.obeliskGear().isSelected();
    }

    private static void lIIllIIIlllIll() {
        lIlllIIIllI = new String[lIlllIIlIII[1]];
        aC.lIlllIIIllI[aC.lIlllIIlIII[0]] = aC.lIIllIIIllIIll("jUKo8Y/fxQw=", "oxUWE");
    }

    static {
        aC.lIIllIIIllllII();
        aC.lIIllIIIlllIll();
    }

    @Inject
    public aC(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override
    public int[] j(String string) {
        if (aC.lIIllIIIllllIl(string.contains(lIlllIIIllI[lIlllIIlIII[0]]) ? 1 : 0)) {
            return this.a(this.cf.obeliskGear());
        }
        return new int[lIlllIIlIII[0]];
    }

    private static String lIIllIIIllIIll(String llllllllllllllllIlIIlllIIIIIlIll, String llllllllllllllllIlIIlllIIIIIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllIIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllIIIIIllIl.init(lIlllIIlIII[2], llllllllllllllllIlIIlllIIIIIlllI);
            return new String(llllllllllllllllIlIIlllIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIIIIIllII) {
            llllllllllllllllIlIIlllIIIIIllII.printStackTrace();
            return null;
        }
    }
}

