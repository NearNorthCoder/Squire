package p000.r.u.q.e.s.o.t.a.i;

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
@TaskDesc(name = "Warden gear swapping", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.H  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/H.class */
public class H extends y {
    private static /* synthetic */ int[] lIIllllIlIIIl;
    private static /* synthetic */ String[] lIIllllIlIIII;

    private static String lIllIlIIlIIllII(String llllllllllllllIlllIlIIlIIIIlllIl, String llllllllllllllIlllIlIIlIIIIlllII) {
        String llllllllllllllIlllIlIIlIIIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlIIlIIIIllIlI = llllllllllllllIlllIlIIlIIIIlllII.toCharArray();
        int llllllllllllllIlllIlIIlIIIIllIIl = lIIllllIlIIIl[0];
        char[] charArray = llllllllllllllIlllIlIIlIIIIlllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIllllIlIIIl[0];
        while (lIllIlIIlIlIlIl(i, length)) {
            char llllllllllllllIlllIlIIlIIIIllllI = charArray[i];
            sb.append((char) (llllllllllllllIlllIlIIlIIIIllllI ^ llllllllllllllIlllIlIIlIIIIllIlI[llllllllllllllIlllIlIIlIIIIllIIl % llllllllllllllIlllIlIIlIIIIllIlI.length]));
            "".length();
            llllllllllllllIlllIlIIlIIIIllIIl++;
            i++;
            "".length();
            if ("  ".length() >= ((((62 + 160) - 48) + 9) ^ (((144 + 56) - 36) + 15))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlIIlIlIIlI(Object obj) {
        return obj == null;
    }

    private static String lIllIlIIlIIllIl(String llllllllllllllIlllIlIIlIIIIIIllI, String llllllllllllllIlllIlIIlIIIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIlIIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIlIIIIIlIlI.init(lIIllllIlIIIl[2], secretKeySpec);
            return new String(llllllllllllllIlllIlIIlIIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIlIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIlIIIIIlIIl) {
            llllllllllllllIlllIlIIlIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIIlIIllll();
        lIllIlIIlIIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (lIllIlIIlIlIIIl(this.aL.mageP2Warden().isSelected() ? 1 : 0) && lIllIlIIlIlIIIl(this.aL.rangedP2Warden().isSelected() ? 1 : 0) && lIllIlIIlIlIIIl(this.aL.normalCore().isSelected() ? 1 : 0) && !lIllIlIIlIlIIII(this.aL.specialCore().isSelected() ? 1 : 0)) {
            return lIIllllIlIIIl[0];
        }
        ?? r0 = lIIllllIlIIIl[1];
        "".length();
        return 0 != 0 ? ((33 ^ 84) ^ (90 ^ 60)) & (((((7 + 45) - (-122)) + 0) ^ (((171 + 133) - 137) + 22)) ^ (-" ".length())) : r0;
    }

    private static boolean lIllIlIIlIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIlIlIIIl(int i) {
        return i == 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String llllllllllllllIlllIlIIlIIIlIllII) {
        if (lIllIlIIlIlIIII(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[0]]) ? 1 : 0)) {
            return a(this.aL.specialCore(), this.aL.normalCore(), this.aL.specGearCore());
        }
        if (lIllIlIIlIlIIII(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[1]]) ? 1 : 0)) {
            return a(this.aL.skullsGear());
        }
        if (lIllIlIIlIlIIIl(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[2]]) ? 1 : 0) && lIllIlIIlIlIIIl(llllllllllllllIlllIlIIlIIIlIllII.equals(lIIllllIlIIII[lIIllllIlIIIl[3]]) ? 1 : 0)) {
            return new int[lIIllllIlIIIl[0]];
        }
        String[] strArr = new String[lIIllllIlIIIl[1]];
        strArr[lIIllllIlIIIl[0]] = llllllllllllllIlllIlIIlIIIlIllII;
        NPC nearest = NPCs.getNearest(strArr);
        if (lIllIlIIlIlIIlI(nearest)) {
            return new int[lIIllllIlIIIl[0]];
        }
        int id = nearest.getId();
        return (!lIllIlIIlIlIIll(id, lIIllllIlIIIl[4]) || lIllIlIIlIlIlII(id, lIIllllIlIIIl[5])) ? a(this.aL.rangedP2Warden()) : (!lIllIlIIlIlIIll(id, lIIllllIlIIIl[6]) || lIllIlIIlIlIlII(id, lIIllllIlIIIl[7])) ? a(this.aL.mageP2Warden()) : (lIllIlIIlIlIIll(id, lIIllllIlIIIl[8]) && lIllIlIIlIlIIll(id, lIIllllIlIIIl[9]) && lIllIlIIlIlIIll(id, lIIllllIlIIIl[10]) && !lIllIlIIlIlIlII(id, lIIllllIlIIIl[11])) ? new int[lIIllllIlIIIl[0]] : a(this.aL.finalWardenSpec(), this.aL.finalWardenGear(), this.aL.specFinalReq());
    }

    private static String lIllIlIIlIIlIll(String llllllllllllllIlllIlIIIllllllIll, String llllllllllllllIlllIlIIIllllllIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIllllllIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIIl[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIlIIIl[2], llllllllllllllIlllIlIIIllllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIlllllIlll) {
            llllllllllllllIlllIlIIIlllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlIIllll() {
        lIIllllIlIIIl = new int[14];
        lIIllllIlIIIl[0] = ((((4 + 0) - (-119)) + 74) ^ (((91 + 56) - 137) + 145)) & (((((89 + 160) - 47) + 45) ^ (((106 + 34) - 2) + 31)) ^ (-" ".length()));
        lIIllllIlIIIl[1] = " ".length();
        lIIllllIlIIIl[2] = "  ".length();
        lIIllllIlIIIl[3] = "   ".length();
        lIIllllIlIIIl[4] = (-17) & 11773;
        lIIllllIlIIIl[5] = (-((-1370) & 5471)) & (-16401) & 32255;
        lIIllllIlIIIl[6] = (-530) & 12285;
        lIIllllIlIIIl[7] = (-515) & 12267;
        lIIllllIlIIIl[8] = (-16903) & 28663;
        lIIllllIlIIIl[9] = (-((-8593) & 13209)) & (-1) & 16379;
        lIIllllIlIIIl[10] = (-16390) & 28151;
        lIIllllIlIIIl[11] = (-((-12634) & 13147)) & (-9) & 12285;
        lIIllllIlIIIl[12] = 57 ^ 61;
        lIIllllIlIIIl[13] = (149 ^ 162) ^ (123 ^ 68);
    }

    private static boolean lIllIlIIlIlIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlIIlIlIIll(int i, int i2) {
        return i != i2;
    }

    private static void lIllIlIIlIIlllI() {
        lIIllllIlIIII = new String[lIIllllIlIIIl[12]];
        lIIllllIlIIII[lIIllllIlIIIl[0]] = lIllIlIIlIIlIll("TZCIOfatJbU=", "zMeRI");
        lIIllllIlIIII[lIIllllIlIIIl[1]] = lIllIlIIlIIllII("KSs8GTcVZQoCIAQqNw==", "lEYkP");
        lIIllllIlIIII[lIIllllIlIIIl[2]] = lIllIlIIlIIllIl("SJCa8SSufeEJpg4Fg60BsmJPKvadE2hj", "IIEtu");
        lIIllllIlIIII[lIIllllIlIIIl[3]] = lIllIlIIlIIllIl("jDEW3CINQPD9gOi1bZDErFHmq2K8tZ1q", "NIXJB");
    }

    @Inject
    public H(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIIlIlIIII(int i) {
        return i != 0;
    }
}
