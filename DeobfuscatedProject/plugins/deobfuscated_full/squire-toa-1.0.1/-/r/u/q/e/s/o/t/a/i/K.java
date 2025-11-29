/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.y;
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

/* TASK: Gear Swapping Ba-Ba -> Gearswappingba-BaTask */
@TaskDesc(name="Gear Swapping Ba-Ba", register=true)
public class K
extends y {
    private static /* synthetic */ int[] lIlIIIIlIIllI;
    private static /* synthetic */ String[] lIlIIIIlIIlIl;

    private static String lIllIllIlIlIlIl(String var9, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIllI[5]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIIIIlIIllI[2], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    public K(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        K var12;
        void var8;
        if (K.lIllIllIlIllIII(string.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[0]]) ? 1 : 0)) {
            return this.a(this.aL.babaSpecialStyle(), this.aL.babaAttackStyle(), this.aL.specGearBabaReq());
        }
        if (K.lIllIllIlIllIII(var8.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[1]]) ? 1 : 0)) {
            return var12.a(var12.aL.babaBaboonAttackStyle());
        }
        if (K.lIllIllIlIllIII(var8.contains(lIlIIIIlIIlIl[lIlIIIIlIIllI[2]]) ? 1 : 0)) {
            if (K.lIllIllIlIllIII(var12.aL.redirectBoulderClicks() ? 1 : 0)) {
                var12.c(lIlIIIIlIIllI[3]);
            }
            return var12.a(var12.aL.babaBoulderAttackStyle());
        }
        return new int[lIlIIIIlIIllI[0]];
    }

    private static boolean lIllIllIlIllIII(int n2) {
        return n2 != 0;
    }

    private static void lIllIllIlIlIlll() {
        lIlIIIIlIIllI = new int[6];
        K.lIlIIIIlIIllI[0] = (0xEC ^ 0xA9) & ~(0x7F ^ 0x3A);
        K.lIlIIIIlIIllI[1] = 1;
        K.lIlIIIIlIIllI[2] = 2;
        K.lIlIIIIlIIllI[3] = 0xFFFFAF67 & 0x7E9F;
        K.lIlIIIIlIIllI[4] = 3;
        K.lIlIIIIlIIllI[5] = 54 + 117 - 91 + 52 ^ 105 + 17 - 45 + 63;
    }

    private static void lIllIllIlIlIllI() {
        lIlIIIIlIIlIl = new String[lIlIIIIlIIllI[4]];
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[0]] = K."Ba-Ba";
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[1]] = K."Baboon";
        K.lIlIIIIlIIlIl[K.lIlIIIIlIIllI[2]] = K."Boulder";
    }

    @Override
    public boolean C() {
        int n2;
        if (!K.lIllIllIlIllIIl(this.aL.babaAttackStyle().isSelected() ? 1 : 0) || !K.lIllIllIlIllIIl(this.aL.babaBaboonAttackStyle().isSelected() ? 1 : 0) || K.lIllIllIlIllIII(this.aL.babaBoulderAttackStyle().isSelected() ? 1 : 0)) {
            n2 = lIlIIIIlIIllI[1];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            n2 = lIlIIIIlIIllI[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIlIlIlII(String var11, String var7) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIIIlIIllI[2], var10);
            return new String(var1.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlIllIIl(int n2) {
        return n2 == 0;
    }

    static {
        K.lIllIllIlIlIlll();
        K.lIllIllIlIlIllI();
    }
}

