/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Swapping for obelisk", register=true)
public class SwappingForObeliskTask
extends AutotoaTaskBase {

    private static boolean lIIllIIIllllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aL() {
        return this.cf.obeliskGear().isSelected();
    }

    private static void lIIllIIIlllIll() {
        lIlllIIIllI = new String[lIlllIIlIII[1]];
        aC.lIlllIIIllI[aC.lIlllIIlIII[0]] = "Obelisk";
    }

    static {
        aC.lIIllIIIllllII();
        aC.lIIllIIIlllIll();
    }

    @Inject
    public SwappingForObeliskTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override
    public int[] j(String string) {
        if (aC.lIIllIIIllllIl(string.contains(lIlllIIIllI[lIlllIIlIII[0]]) ? 1 : 0)) {
            return this.a(this.cf.obeliskGear());
        }
        return new int[lIlllIIlIII[0]];
    }

}

