/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaTaskBase;
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
public class SwappingForObeliskTask
extends ToaTaskBase {

    @Override
    public boolean C() {
        return this.aL.obeliskGear().isSelected();
    }

    private static boolean lIllIlIlIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIlIlIIlIIII() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[1]];
        E.lIIlllllIlIIl[E.lIIlllllIlIlI[0]] = "Obelisk";
    }

    static {
        E.lIllIlIlIIlIIIl();
        E.lIllIlIlIIlIIII();
    }

    @Inject
    public SwappingForObeliskTask(TOAConfig tOAConfig, ExecutorService executorService) {
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

