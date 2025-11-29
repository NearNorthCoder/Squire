/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
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
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Warden gear swapping", register=true)
public class H
extends y {
    private static /* synthetic */ int[] lIIllllIlIIIl;
    private static /* synthetic */ String[] lIIllllIlIIII;

    private static String lIllIlIIlIIllII(String llllllllllllllIlllIlIIlIIIIllIII, String llllllllllllllIlllIlIIlIIIIlIlll) {
        llllllllllllllIlllIlIIlIIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIlIIIIllIll = new StringBuilder();
        char[] llllllllllllllIlllIlIIlIIIIllIlI = llllllllllllllIlllIlIIlIIIIlIlll.toCharArray();
        int llllllllllllllIlllIlIIlIIIIllIIl = lIIllllIlIIIl[0];
        char[] llllllllllllllIlllIlIIlIIIIlIIll = llllllllllllllIlllIlIIlIIIIllIII.toCharArray();
        int llllllllllllllIlllIlIIlIIIIlIIlI = llllllllllllllIlllIlIIlIIIIlIIll.length;
        int llllllllllllllIlllIlIIlIIIIlIIIl = lIIllllIlIIIl[0];
        while (H.lIllIlIIlIlIlIl(llllllllllllllIlllIlIIlIIIIlIIIl, llllllllllllllIlllIlIIlIIIIlIIlI)) {
            char llllllllllllllIlllIlIIlIIIIllllI = llllllllllllllIlllIlIIlIIIIlIIll[llllllllllllllIlllIlIIlIIIIlIIIl];
            llllllllllllllIlllIlIIlIIIIllIll.append((char)(llllllllllllllIlllIlIIlIIIIllllI ^ llllllllllllllIlllIlIIlIIIIllIlI[llllllllllllllIlllIlIIlIIIIllIIl % llllllllllllllIlllIlIIlIIIIllIlI.length]));
            "".length();
            ++llllllllllllllIlllIlIIlIIIIllIIl;
            ++llllllllllllllIlllIlIIlIIIIlIIIl;
            "".length();
            if ("  ".length() < (62 + 160 - 48 + 9 ^ 144 + 56 - 36 + 15)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlIIlIIIIllIll);
    }

    private static boolean lIllIlIIlIlIIlI(Object object) {
        return object == null;
    }

    private static String lIllIlIIlIIllIl(String llllllllllllllIlllIlIIlIIIIIlIII, String llllllllllllllIlllIlIIlIIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIlIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIlIIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIlIIIIIlIlI.init(lIIllllIlIIIl[2], llllllllllllllIlllIlIIlIIIIIlIll);
            return new String(llllllllllllllIlllIlIIlIIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIlIIIIIlIIl) {
            llllllllllllllIlllIlIIlIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        H.lIllIlIIlIIllll();
        H.lIllIlIIlIIlllI();
    }

    @Override
    public boolean C() {
        int n2;
        if (!H.lIllIlIIlIlIIIl(this.aL.mageP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.rangedP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.normalCore().isSelected() ? 1 : 0) || H.lIllIlIIlIlIIII(this.aL.specialCore().isSelected() ? 1 : 0)) {
            n2 = lIIllllIlIIIl[1];
            "".length();
            if (null != null) {
                return ((0x21 ^ 0x54 ^ (0x5A ^ 0x3C)) & (7 + 45 - -122 + 0 ^ 171 + 133 - 137 + 22 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIllllIlIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIlIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        H llllllllllllllIlllIlIIlIIIlIllIl;
        void llllllllllllllIlllIlIIlIIIlIllII;
        if (H.lIllIlIIlIlIIII(string.equals(lIIllllIlIIII[lIIllllIlIIIl[0]]) ? 1 : 0)) {
            return this.a(this.aL.specialCore(), this.aL.normalCore(), this.aL.specGearCore());
        }
        if (H.lIllIlIIlIlIIII(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[1]]) ? 1 : 0)) {
            return llllllllllllllIlllIlIIlIIIlIllIl.a(llllllllllllllIlllIlIIlIIIlIllIl.aL.skullsGear());
        }
        if (H.lIllIlIIlIlIIIl(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[2]]) ? 1 : 0) && H.lIllIlIIlIlIIIl(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[3]]) ? 1 : 0)) {
            return new int[lIIllllIlIIIl[0]];
        }
        String[] stringArray = new String[lIIllllIlIIIl[1]];
        stringArray[H.lIIllllIlIIIl[0]] = llllllllllllllIlllIlIIlIIIlIllII;
        NPC llllllllllllllIlllIlIIlIIIlIlIll = NPCs.getNearest((String[])stringArray);
        if (H.lIllIlIIlIlIIlI(llllllllllllllIlllIlIIlIIIlIlIll)) {
            return new int[lIIllllIlIIIl[0]];
        }
        int llllllllllllllIlllIlIIlIIIlIlIlI = llllllllllllllIlllIlIIlIIIlIlIll.getId();
        if (!H.lIllIlIIlIlIIll(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[4]) || H.lIllIlIIlIlIlII(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[5])) {
            return llllllllllllllIlllIlIIlIIIlIllIl.a(llllllllllllllIlllIlIIlIIIlIllIl.aL.rangedP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[6]) || H.lIllIlIIlIlIlII(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[7])) {
            return llllllllllllllIlllIlIIlIIIlIllIl.a(llllllllllllllIlllIlIIlIIIlIllIl.aL.mageP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[8]) || !H.lIllIlIIlIlIIll(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[9]) || !H.lIllIlIIlIlIIll(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[10]) || H.lIllIlIIlIlIlII(llllllllllllllIlllIlIIlIIIlIlIlI, lIIllllIlIIIl[11])) {
            return llllllllllllllIlllIlIIlIIIlIllIl.a(llllllllllllllIlllIlIIlIIIlIllIl.aL.finalWardenSpec(), llllllllllllllIlllIlIIlIIIlIllIl.aL.finalWardenGear(), llllllllllllllIlllIlIIlIIIlIllIl.aL.specFinalReq());
        }
        return new int[lIIllllIlIIIl[0]];
    }

    private static String lIllIlIIlIIlIll(String llllllllllllllIlllIlIIIllllllIIl, String llllllllllllllIlllIlIIIllllllIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllllllIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIIl[13]), "DES");
            Cipher llllllllllllllIlllIlIIIlllllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIlllllllIl.init(lIIllllIlIIIl[2], llllllllllllllIlllIlIIIllllllllI);
            return new String(llllllllllllllIlllIlIIIlllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIlllllllII) {
            llllllllllllllIlllIlIIIlllllllII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlIIllll() {
        lIIllllIlIIIl = new int[14];
        H.lIIllllIlIIIl[0] = (4 + 0 - -119 + 74 ^ 91 + 56 - 137 + 145) & (89 + 160 - 47 + 45 ^ 106 + 34 - 2 + 31 ^ -" ".length());
        H.lIIllllIlIIIl[1] = " ".length();
        H.lIIllllIlIIIl[2] = "  ".length();
        H.lIIllllIlIIIl[3] = "   ".length();
        H.lIIllllIlIIIl[4] = 0xFFFFFFEF & 0x2DFD;
        H.lIIllllIlIIIl[5] = -(0xFFFFFAA6 & 0x155F) & (0xFFFFBFEF & 0x7DFF);
        H.lIIllllIlIIIl[6] = 0xFFFFFDEE & 0x2FFD;
        H.lIIllllIlIIIl[7] = 0xFFFFFDFD & 0x2FEB;
        H.lIIllllIlIIIl[8] = 0xFFFFBDF9 & 0x6FF7;
        H.lIIllllIlIIIl[9] = -(0xFFFFDE6F & 0x3399) & (0xFFFFFFFF & 0x3FFB);
        H.lIIllllIlIIIl[10] = 0xFFFFBFFA & 0x6DF7;
        H.lIIllllIlIIIl[11] = -(0xFFFFCEA6 & 0x335B) & (0xFFFFFFF7 & 0x2FFD);
        H.lIIllllIlIIIl[12] = 0x39 ^ 0x3D;
        H.lIIllllIlIIIl[13] = 0x95 ^ 0xA2 ^ (0x7B ^ 0x44);
    }

    private static boolean lIllIlIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIlIIlIIlllI() {
        lIIllllIlIIII = new String[lIIllllIlIIIl[12]];
        H.lIIllllIlIIII[H.lIIllllIlIIIl[0]] = H.lIllIlIIlIIlIll("TZCIOfatJbU=", "zMeRI");
        H.lIIllllIlIIII[H.lIIllllIlIIIl[1]] = H.lIllIlIIlIIllII("KSs8GTcVZQoCIAQqNw==", "lEYkP");
        H.lIIllllIlIIII[H.lIIllllIlIIIl[2]] = H.lIllIlIIlIIllIl("SJCa8SSufeEJpg4Fg60BsmJPKvadE2hj", "IIEtu");
        H.lIIllllIlIIII[H.lIIllllIlIIIl[3]] = H.lIllIlIIlIIllIl("jDEW3CINQPD9gOi1bZDErFHmq2K8tZ1q", "NIXJB");
    }

    @Inject
    public H(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIIlIlIIII(int n2) {
        return n2 != 0;
    }
}

