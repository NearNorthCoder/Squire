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
@TaskDesc(name = "Gear swapping for Akkha", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.C  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/C.class */
public class C extends y {
    private static /* synthetic */ String[] lIIllllIllIll;
    private static /* synthetic */ int[] lIIllllIlllII;
    private /* synthetic */ int aW;

    private static void lIllIlIIllIlIIl() {
        lIIllllIlllII = new int[10];
        lIIllllIlllII[0] = -" ".length();
        lIIllllIlllII[1] = ((16 ^ 86) ^ (157 ^ 150)) & (((159 ^ 179) ^ (243 ^ 146)) ^ (-" ".length()));
        lIIllllIlllII[2] = " ".length();
        lIIllllIlllII[3] = (-((-87) & 20855)) & (-1) & 32558;
        lIIllllIlllII[4] = (-4289) & 16079;
        lIIllllIlllII[5] = (-234) & 12025;
        lIIllllIlllII[6] = (-((-14375) & 30831)) & (-4129) & 32379;
        lIIllllIlllII[7] = "  ".length();
        lIIllllIlllII[8] = "   ".length();
        lIIllllIlllII[9] = (123 ^ 126) ^ (51 ^ 62);
    }

    private static boolean lIllIlIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIllIlIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (lIllIlIIllIllII(this.aL.mageGearAkkha().isSelected() ? 1 : 0) && lIllIlIIllIllII(this.aL.meleeGearAkkha().isSelected() ? 1 : 0) && lIllIlIIllIllII(this.aL.rangeGearAkkha().isSelected() ? 1 : 0) && lIllIlIIllIllII(this.aL.akkhaFinalSpec().isSelected() ? 1 : 0) && !lIllIlIIllIlIlI(this.aL.akkhaFinalNormal().isSelected() ? 1 : 0)) {
            return lIIllllIlllII[1];
        }
        ?? r0 = lIIllllIlllII[2];
        "".length();
        return (-" ".length()) != (-" ".length()) ? ((((146 + 63) - 67) + 21) ^ (((31 + 139) - 166) + 177)) & (((98 ^ 89) ^ (165 ^ 136)) ^ (-" ".length())) : r0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String str) {
        return lIllIlIIllIlIlI(str.equals(lIIllllIllIll[lIIllllIlllII[1]]) ? 1 : 0) ? a(this.aL.shadowAttackStyle()) : (!lIllIlIIllIlIlI(str.equals(lIIllllIllIll[lIIllllIlllII[2]]) ? 1 : 0) || lIllIlIIllIlIll(this.aW, lIIllllIlllII[0])) ? new int[lIIllllIlllII[1]] : lIllIlIIllIlIll(this.aW, lIIllllIlllII[3]) ? a(this.aL.mageGearAkkha()) : lIllIlIIllIlIll(this.aW, lIIllllIlllII[4]) ? a(this.aL.meleeGearAkkha()) : lIllIlIIllIlIll(this.aW, lIIllllIlllII[5]) ? a(this.aL.rangeGearAkkha()) : lIllIlIIllIlIll(this.aW, lIIllllIlllII[6]) ? a(this.aL.akkhaFinalSpec(), this.aL.akkhaFinalNormal(), this.aL.specGearAkkhaFinalReq()) : new int[lIIllllIlllII[1]];
    }

    private static String lIllIlIIllIIlll(String llllllllllllllIlllIlIIIlIlIlIIII, String llllllllllllllIlllIlIIIlIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIlIlIlIIlI.init(lIIllllIlllII[7], secretKeySpec);
            return new String(llllllllllllllIlllIlIIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIlIlIlIIIl) {
            llllllllllllllIlllIlIIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIllIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean run() {
        String[] strArr = new String[lIIllllIlllII[2]];
        strArr[lIIllllIlllII[1]] = lIIllllIllIll[lIIllllIlllII[7]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIllIlIIllIllIl(nearest)) {
            return lIIllllIlllII[1];
        }
        this.aW = nearest.getId();
        return lIIllllIlllII[1];
    }

    private static String lIllIlIIllIIllI(String llllllllllllllIlllIlIIIlIlIIIIll, String llllllllllllllIlllIlIIIlIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIlIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIlllII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIlllII[7], llllllllllllllIlllIlIIIlIlIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIlIlIIIlII) {
            llllllllllllllIlllIlIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
        this.aW = lIIllllIlllII[0];
    }

    private static String lIllIlIIllIIlIl(String llllllllllllllIlllIlIIIlIIllIIll, String llllllllllllllIlllIlIIIlIIllIIlI) {
        String llllllllllllllIlllIlIIIlIIllIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIIlIIllIIIl = new StringBuilder();
        char[] llllllllllllllIlllIlIIIlIIllIIII = llllllllllllllIlllIlIIIlIIllIIlI.toCharArray();
        int llllllllllllllIlllIlIIIlIIlIllll = lIIllllIlllII[1];
        char[] charArray = llllllllllllllIlllIlIIIlIIllIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIllllIlllII[1];
        while (lIllIlIIllIlllI(i, length)) {
            llllllllllllllIlllIlIIIlIIllIIIl.append((char) (charArray[i] ^ llllllllllllllIlllIlIIIlIIllIIII[llllllllllllllIlllIlIIIlIIlIllll % llllllllllllllIlllIlIIIlIIllIIII.length]));
            "".length();
            llllllllllllllIlllIlIIIlIIlIllll++;
            i++;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlIIIlIIllIIIl);
    }

    private static void lIllIlIIllIlIII() {
        lIIllllIllIll = new String[lIIllllIlllII[8]];
        lIIllllIllIll[lIIllllIlllII[1]] = lIllIlIIllIIlIl("GQY6LTJ/HnEWOzkJPjI=", "XmQES");
        lIIllllIllIll[lIIllllIlllII[2]] = lIllIlIIllIIllI("NOODvrighKo=", "vYORr");
        lIIllllIllIll[lIIllllIlllII[7]] = lIllIlIIllIIlll("nmhq8Ce+T+s=", "dlOxE");
    }

    private static boolean lIllIlIIllIllII(int i) {
        return i == 0;
    }

    static {
        lIllIlIIllIlIIl();
        lIllIlIIllIlIII();
    }

    private static boolean lIllIlIIllIllIl(Object obj) {
        return obj == null;
    }
}
