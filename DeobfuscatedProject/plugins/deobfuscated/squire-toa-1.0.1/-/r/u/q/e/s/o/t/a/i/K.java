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

@TaskDesc(name="Gear Swapping Ba-Ba", register=true)
public class K
extends y {
    private static /* synthetic */ int[] lIlIIIIlIIllI;
    private static /* synthetic */ String[] lIlIIIIlIIlIl;

    private static String lIllIllIlIlIlIl(String llllllllllllllIlllIIlIlIIllIllIl, String llllllllllllllIlllIIlIlIIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIllI[5]), "DES");
            Cipher llllllllllllllIlllIIlIlIIllIllll = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlIIllIllll.init(lIlIIIIlIIllI[2], llllllllllllllIlllIIlIlIIlllIIII);
            return new String(llllllllllllllIlllIIlIlIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIIllIlllI) {
            llllllllllllllIlllIIlIlIIllIlllI.printStackTrace();
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
        K llllllllllllllIlllIIlIlIlIIIIlIl;
        void llllllllllllllIlllIIlIlIlIIIIlII;
        if (K.lIllIllIlIllIII(string.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[0]]) ? 1 : 0)) {
            return this.a(this.aL.babaSpecialStyle(), this.aL.babaAttackStyle(), this.aL.specGearBabaReq());
        }
        if (K.lIllIllIlIllIII(llllllllllllllIlllIIlIlIlIIIIlII.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[1]]) ? 1 : 0)) {
            return llllllllllllllIlllIIlIlIlIIIIlIl.a(llllllllllllllIlllIIlIlIlIIIIlIl.aL.babaBaboonAttackStyle());
        }
        if (K.lIllIllIlIllIII(llllllllllllllIlllIIlIlIlIIIIlII.contains(lIlIIIIlIIlIl[lIlIIIIlIIllI[2]]) ? 1 : 0)) {
            if (K.lIllIllIlIllIII(llllllllllllllIlllIIlIlIlIIIIlIl.aL.redirectBoulderClicks() ? 1 : 0)) {
                llllllllllllllIlllIIlIlIlIIIIlIl.c(lIlIIIIlIIllI[3]);
            }
            return llllllllllllllIlllIIlIlIlIIIIlIl.a(llllllllllllllIlllIIlIlIlIIIIlIl.aL.babaBoulderAttackStyle());
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
                return ((0x53 ^ 0x1E) & ~(0xC5 ^ 0x88)) != 0;
            }
        } else {
            n2 = lIlIIIIlIIllI[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIlIlIlII(String llllllllllllllIlllIIlIlIIllllIlI, String llllllllllllllIlllIIlIlIIlllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIIlllllII.init(lIlIIIIlIIllI[2], llllllllllllllIlllIIlIlIIlllllIl);
            return new String(llllllllllllllIlllIIlIlIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIIllllIll) {
            llllllllllllllIlllIIlIlIIllllIll.printStackTrace();
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

