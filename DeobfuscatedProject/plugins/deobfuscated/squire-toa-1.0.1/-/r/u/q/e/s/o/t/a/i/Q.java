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

@TaskDesc(name="Gear Swapping Zebak", register=true)
public class Q
extends y {
    private static /* synthetic */ int[] lIIlllllIllII;
    private static /* synthetic */ String[] lIIlllllIlIll;

    private static boolean lIllIlIlIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlIIlIllI() {
        lIIlllllIlIll = new String[lIIlllllIllII[4]];
        Q.lIIlllllIlIll[Q.lIIlllllIllII[0]] = Q."Zebak";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[2]] = Q."Jug";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[1]] = Q."Wave";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[3]] = Q."Crocodile";
    }

    static {
        Q.lIllIlIlIIlIlll();
        Q.lIllIlIlIIlIllI();
    }

    @Inject
    public Q(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIlIIlIlII(String llllllllllllllIlllIlIIIIIIlIIIlI, String llllllllllllllIlllIlIIIIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), lIIlllllIllII[5]), "DES");
            Cipher llllllllllllllIlllIlIIIIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIIIIlIIlII.init(lIIlllllIllII[1], llllllllllllllIlllIlIIIIIIlIIlIl);
            return new String(llllllllllllllIlllIlIIIIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIIIlIIIll) {
            llllllllllllllIlllIlIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIIllIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!Q.lIllIlIlIIllIlI(this.aL.gearSwapZebak().isSelected() ? 1 : 0) || Q.lIllIlIlIIllIII(this.aL.gearSwapCrocodile().isSelected() ? 1 : 0)) {
            bl = lIIlllllIllII[2];
            0;
            if (((0x35 ^ 0x1F ^ (0x32 ^ 0x37)) & (99 + 44 - 65 + 49 ^ (2 ^ 0x52) ^ -1)) > 0) {
                return ((156 + 155 - 309 + 237 ^ 122 + 154 - 142 + 59) & (0x4B ^ 0x23 ^ (0x6D ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllIllII[0];
        }
        return bl;
    }

    private static void lIllIlIlIIlIlll() {
        lIIlllllIllII = new int[6];
        Q.lIIlllllIllII[0] = (0xE1 ^ 0x82 ^ (0x46 ^ 0x7A)) & (38 + 203 - 193 + 156 ^ 80 + 80 - 101 + 88 ^ -1);
        Q.lIIlllllIllII[1] = 2;
        Q.lIIlllllIllII[2] = 1;
        Q.lIIlllllIllII[3] = 3;
        Q.lIIlllllIllII[4] = 113 + 52 - 127 + 110 ^ 59 + 60 - 99 + 124;
        Q.lIIlllllIllII[5] = 0x23 ^ 0x2B;
    }

    private static boolean lIllIlIlIIllIIl(Object object) {
        return object != null;
    }

    private static String lIllIlIlIIlIIll(String llllllllllllllIlllIlIIIIIIIlIlIl, String llllllllllllllIlllIlIIIIIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIIIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIIIIlIlll.init(lIIlllllIllII[1], llllllllllllllIlllIlIIIIIIIllIII);
            return new String(llllllllllllllIlllIlIIIIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIIIIlIllI) {
            llllllllllllllIlllIlIIIIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIIlIlIl(String llllllllllllllIlllIlIIIIIIIIIIII, String llllllllllllllIlllIIllllllllllll) {
        llllllllllllllIlllIlIIIIIIIIIIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIIIIIIIIIll = new StringBuilder();
        char[] llllllllllllllIlllIlIIIIIIIIIIlI = llllllllllllllIlllIIllllllllllll.toCharArray();
        int llllllllllllllIlllIlIIIIIIIIIIIl = lIIlllllIllII[0];
        char[] llllllllllllllIlllIIlllllllllIll = llllllllllllllIlllIlIIIIIIIIIIII.toCharArray();
        int llllllllllllllIlllIIlllllllllIlI = llllllllllllllIlllIIlllllllllIll.length;
        int llllllllllllllIlllIIlllllllllIIl = lIIlllllIllII[0];
        while (Q.lIllIlIlIIllIll(llllllllllllllIlllIIlllllllllIIl, llllllllllllllIlllIIlllllllllIlI)) {
            char llllllllllllllIlllIlIIIIIIIIIllI = llllllllllllllIlllIIlllllllllIll[llllllllllllllIlllIIlllllllllIIl];
            llllllllllllllIlllIlIIIIIIIIIIll.append((char)(llllllllllllllIlllIlIIIIIIIIIllI ^ llllllllllllllIlllIlIIIIIIIIIIlI[llllllllllllllIlllIlIIIIIIIIIIIl % llllllllllllllIlllIlIIIIIIIIIIlI.length]));
            0;
            ++llllllllllllllIlllIlIIIIIIIIIIIl;
            ++llllllllllllllIlllIIlllllllllIIl;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlIIIIIIIIIIll);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        void llllllllllllllIlllIlIIIIIIlIllIl;
        Q llllllllllllllIlllIlIIIIIIlIlllI;
        if (Q.lIllIlIlIIllIII(string.equals(lIIlllllIlIll[lIIlllllIllII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIIlllllIllII[1]];
            stringArray[Q.lIIlllllIllII[0]] = lIIlllllIlIll[lIIlllllIllII[2]];
            stringArray[Q.lIIlllllIllII[2]] = lIIlllllIlIll[lIIlllllIllII[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (Q.lIllIlIlIIllIIl(nPC)) {
                return this.a(this.aL.gearSwapZebak());
            }
            return llllllllllllllIlllIlIIIIIIlIlllI.a(llllllllllllllIlllIlIIIIIIlIlllI.aL.specGearZebak(), llllllllllllllIlllIlIIIIIIlIlllI.aL.gearSwapZebak(), llllllllllllllIlllIlIIIIIIlIlllI.aL.specGearZebakReq());
        }
        if (Q.lIllIlIlIIllIII(llllllllllllllIlllIlIIIIIIlIllIl.equals(lIIlllllIlIll[lIIlllllIllII[3]]) ? 1 : 0)) {
            return llllllllllllllIlllIlIIIIIIlIlllI.a(llllllllllllllIlllIlIIIIIIlIlllI.aL.gearSwapCrocodile());
        }
        return new int[lIIlllllIllII[0]];
    }
}

