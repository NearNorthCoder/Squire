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

/* TASK: Swapping for obelisk -> SwappingforobeliskTask */
@TaskDesc(name="Swapping for obelisk", register=true)
public class aC
extends V {
    private static /* synthetic */ int[] lIlllIIlIII;
    private static /* synthetic */ String[] lIlllIIIllI;

    private static void lIIllIIIllllII() {
        lIlllIIlIII = new int[3];
        aC.lIlllIIlIII[0] = (0x68 ^ 0x50 ^ (0xDF ^ 0xB5)) & (0xE5 ^ 0xB9 ^ (0x81 ^ 0x8F) ^ -1);
        aC.lIlllIIlIII[1] = 1;
        aC.lIlllIIlIII[2] = 2;
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
        aC.lIlllIIIllI[aC.lIlllIIlIII[0]] = aC."Obelisk";
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

    private static String lIIllIIIllIIll(String var4, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlllIIlIII[2], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

