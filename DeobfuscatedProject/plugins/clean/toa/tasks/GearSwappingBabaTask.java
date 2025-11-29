/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;

@TaskDesc(name="Gear Swapping Ba-Ba", register=true)
public class GearSwappingBabaTask
extends ToaTaskBase {

    @Inject
    public GearSwappingBabaTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        K var1;
        void var2;
        if (K.lIllIllIlIllIII(string.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[0]]) ? 1 : 0)) {
            return this.a(this.aL.babaSpecialStyle(), this.aL.babaAttackStyle(), this.aL.specGearBabaReq());
        }
        if (K.lIllIllIlIllIII(var2.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[1]]) ? 1 : 0)) {
            return var1.a(var1.aL.babaBaboonAttackStyle());
        }
        if (K.lIllIllIlIllIII(var2.contains(lIlIIIIlIIlIl[lIlIIIIlIIllI[2]]) ? 1 : 0)) {
            if (K.lIllIllIlIllIII(var1.aL.redirectBoulderClicks() ? 1 : 0)) {
                var1.c(lIlIIIIlIIllI[3]);
            }
            return var1.a(var1.aL.babaBoulderAttackStyle());
        }
        return new int[lIlIIIIlIIllI[0]];
    }

    private static boolean lIllIllIlIllIII(int n2) {
        return n2 != 0;
    }

    private static void lIllIllIlIlIllI() {
        lIlIIIIlIIlIl = new String[lIlIIIIlIIllI[4]];
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[0]] = "Ba-Ba";
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[1]] = "Baboon";
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[2]] = "Boulder";
    }

    @Override
    public boolean C() {
        int n2;
        if (!K.lIllIllIlIllIIl(this.aL.babaAttackStyle().isSelected() ? 1 : 0) || !K.lIllIllIlIllIIl(this.aL.babaBaboonAttackStyle().isSelected() ? 1 : 0) || K.lIllIllIlIllIII(this.aL.babaBoulderAttackStyle().isSelected() ? 1 : 0)) {
            n2 = lIlIIIIlIIllI[1];

        } else {
            n2 = lIlIIIIlIIllI[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIllIlIllIIl(int n2) {
        return n2 == 0;
    }

    static {
        K.lIllIllIlIlIlll();
        K.lIllIllIlIlIllI();
    }
}

