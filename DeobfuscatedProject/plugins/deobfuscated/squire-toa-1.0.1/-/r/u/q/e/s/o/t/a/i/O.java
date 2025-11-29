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
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@TaskDesc(name="Kephri Gear Swapping", register=true)
public class O
extends y {
    private static /* synthetic */ int[] lIlIIIIIIIIII;
    private static /* synthetic */ String[] lIIllllllllll;

    private static String lIllIlIllIlIIll(String llllllllllllllIlllIIlllIIlIIIlll, String llllllllllllllIlllIIlllIIlIIIllI) {
        llllllllllllllIlllIIlllIIlIIIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlllIIlIIIlIl = new StringBuilder();
        char[] llllllllllllllIlllIIlllIIlIIIlII = llllllllllllllIlllIIlllIIlIIIllI.toCharArray();
        int llllllllllllllIlllIIlllIIlIIIIll = lIlIIIIIIIIII[1];
        char[] llllllllllllllIlllIIlllIIIllllIl = llllllllllllllIlllIIlllIIlIIIlll.toCharArray();
        int llllllllllllllIlllIIlllIIIllllII = llllllllllllllIlllIIlllIIIllllIl.length;
        int llllllllllllllIlllIIlllIIIlllIll = lIlIIIIIIIIII[1];
        while (O.lIllIlIllIllIII(llllllllllllllIlllIIlllIIIlllIll, llllllllllllllIlllIIlllIIIllllII)) {
            char llllllllllllllIlllIIlllIIlIIlIII = llllllllllllllIlllIIlllIIIllllIl[llllllllllllllIlllIIlllIIIlllIll];
            llllllllllllllIlllIIlllIIlIIIlIl.append((char)(llllllllllllllIlllIIlllIIlIIlIII ^ llllllllllllllIlllIIlllIIlIIIlII[llllllllllllllIlllIIlllIIlIIIIll % llllllllllllllIlllIIlllIIlIIIlII.length]));
            0;
            ++llllllllllllllIlllIIlllIIlIIIIll;
            ++llllllllllllllIlllIIlllIIIlllIll;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlllIIlIIIlIl);
    }

    private static boolean lIllIlIllIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIllIlIIIl(String llllllllllllllIlllIIlllIIlIlIlIl, String llllllllllllllIlllIIlllIIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIIII[6]), "DES");
            Cipher llllllllllllllIlllIIlllIIlIllIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlllIIlIllIIl.init(lIlIIIIIIIIII[3], llllllllllllllIlllIIlllIIlIllIlI);
            return new String(llllllllllllllIlllIIlllIIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlllIIlIllIII) {
            llllllllllllllIlllIIlllIIlIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIlIlII() {
        lIIllllllllll = new String[lIlIIIIIIIIII[5]];
        O.lIIllllllllll[O.lIlIIIIIIIIII[1]] = O."Soldier Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[2]] = O."Kephri";
        O.lIIllllllllll[O.lIlIIIIIIIIII[3]] = O."Arcane Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[4]] = O."Scarab Swarm";
    }

    @Inject
    public O(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static void lIllIlIllIlIlIl() {
        lIlIIIIIIIIII = new int[7];
        O.lIlIIIIIIIIII[0] = -1;
        O.lIlIIIIIIIIII[1] = (0x27 ^ 0x7A) & ~(0xA ^ 0x57);
        O.lIlIIIIIIIIII[2] = 1;
        O.lIlIIIIIIIIII[3] = 2;
        O.lIlIIIIIIIIII[4] = 3;
        O.lIlIIIIIIIIII[5] = 0x34 ^ 0x30;
        O.lIlIIIIIIIIII[6] = 62 + 84 - 28 + 72 ^ 78 + 40 - 47 + 111;
    }

    private static boolean lIllIlIllIlIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int llllllllllllllIlllIIlllIIllIIIIl;
        String string2 = string;
        int n2 = lIlIIIIIIIIII[0];
        switch (string2.hashCode()) {
            case 829390592: {
                void llllllllllllllIlllIIlllIIllIIIlI;
                if (!O.lIllIlIllIlIllI(llllllllllllllIlllIIlllIIllIIIlI.equals(lIIllllllllll[lIlIIIIIIIIII[1]]) ? 1 : 0)) break;
                llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[1];
                0;
                if (3 > 0) break;
                return null;
            }
            case -2051065175: {
                void llllllllllllllIlllIIlllIIllIIIlI;
                if (!O.lIllIlIllIlIllI(llllllllllllllIlllIIlllIIllIIIlI.equals(lIIllllllllll[lIlIIIIIIIIII[2]]) ? 1 : 0)) break;
                llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[2];
                0;
                if (-1 <= 0) break;
                return null;
            }
            case 32389500: {
                void llllllllllllllIlllIIlllIIllIIIlI;
                if (!O.lIllIlIllIlIllI(llllllllllllllIlllIIlllIIllIIIlI.equals(lIIllllllllll[lIlIIIIIIIIII[3]]) ? 1 : 0)) break;
                llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[3];
                0;
                if (3 >= 1) break;
                return null;
            }
            case -2127561158: {
                void llllllllllllllIlllIIlllIIllIIIlI;
                if (!O.lIllIlIllIlIllI(llllllllllllllIlllIIlllIIllIIIlI.equals(lIIllllllllll[lIlIIIIIIIIII[4]]) ? 1 : 0)) break;
                llllllllllllllIlllIIlllIIllIIIIl = lIlIIIIIIIIII[4];
            }
        }
        switch (llllllllllllllIlllIIlllIIllIIIIl) {
            case 0: {
                O llllllllllllllIlllIIlllIIllIIlII;
                return llllllllllllllIlllIIlllIIllIIlII.a(llllllllllllllIlllIIlllIIllIIlII.aL.kephriGearSwap());
            }
            case 1: {
                O llllllllllllllIlllIIlllIIllIIlII;
                return llllllllllllllIlllIIlllIIllIIlII.a(llllllllllllllIlllIIlllIIllIIlII.aL.kephriSpecialGear(), llllllllllllllIlllIIlllIIllIIlII.aL.kephriGearSwap(), llllllllllllllIlllIIlllIIllIIlII.aL.kephriSpecialReq());
            }
            case 2: {
                O llllllllllllllIlllIIlllIIllIIlII;
                return llllllllllllllIlllIIlllIIllIIlII.a(llllllllllllllIlllIIlllIIllIIlII.aL.kephriMager());
            }
            case 3: {
                O llllllllllllllIlllIIlllIIllIIlII;
                return llllllllllllllIlllIIlllIIllIIlII.a(llllllllllllllIlllIIlllIIllIIlII.aL.kephriSwarm());
            }
        }
        return new int[lIlIIIIIIIIII[1]];
    }

    static {
        O.lIllIlIllIlIlIl();
        O.lIllIlIllIlIlII();
    }

    private static String lIllIlIllIlIIlI(String llllllllllllllIlllIIlllIIIllIIII, String llllllllllllllIlllIIlllIIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlllIIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlllIIIllIlII.init(lIlIIIIIIIIII[3], llllllllllllllIlllIIlllIIIllIlIl);
            return new String(llllllllllllllIlllIIlllIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlllIIIllIIll) {
            llllllllllllllIlllIIlllIIIllIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!O.lIllIlIllIlIlll(this.aL.kephriGearSwap().isSelected() ? 1 : 0) || !O.lIllIlIllIlIlll(this.aL.kephriMager().isSelected() ? 1 : 0) || O.lIllIlIllIlIllI(this.aL.kephriSwarm().isSelected() ? 1 : 0)) {
            bl = lIlIIIIIIIIII[2];
            0;
            if (1 == ((0x86 ^ 0xB6) & ~(0x46 ^ 0x76))) {
                return ((0x73 ^ 0x50) & ~(0x82 ^ 0xA1)) != 0;
            }
        } else {
            bl = lIlIIIIIIIIII[1];
        }
        return bl;
    }
}

