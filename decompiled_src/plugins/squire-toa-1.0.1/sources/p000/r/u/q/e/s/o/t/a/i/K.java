package p000.r.u.q.e.s.o.t.a.i;

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
@TaskDesc(name = "Gear Swapping Ba-Ba", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.K  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/K.class */
public class K extends y {
    private static /* synthetic */ int[] lIlIIIIlIIllI;
    private static /* synthetic */ String[] lIlIIIIlIIlIl;

    private static String lIllIllIlIlIlIl(String llllllllllllllIlllIIlIlIIllIllIl, String llllllllllllllIlllIIlIlIIllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIllIllII.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIlIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIIllIlllI) {
            llllllllllllllIlllIIlIlIIllIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public K(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String str) {
        if (lIllIllIlIllIII(str.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[0]]) ? 1 : 0)) {
            return a(this.aL.babaSpecialStyle(), this.aL.babaAttackStyle(), this.aL.specGearBabaReq());
        }
        if (lIllIllIlIllIII(str.equals(lIlIIIIlIIlIl[lIlIIIIlIIllI[1]]) ? 1 : 0)) {
            return a(this.aL.babaBaboonAttackStyle());
        }
        if (lIllIllIlIllIII(str.contains(lIlIIIIlIIlIl[lIlIIIIlIIllI[2]]) ? 1 : 0)) {
            if (lIllIllIlIllIII(this.aL.redirectBoulderClicks() ? 1 : 0)) {
                c(lIlIIIIlIIllI[3]);
            }
            return a(this.aL.babaBoulderAttackStyle());
        }
        return new int[lIlIIIIlIIllI[0]];
    }

    private static boolean lIllIllIlIllIII(int i) {
        return i != 0;
    }

    private static void lIllIllIlIlIlll() {
        lIlIIIIlIIllI = new int[6];
        lIlIIIIlIIllI[0] = (236 ^ 169) & ((127 ^ 58) ^ (-1));
        lIlIIIIlIIllI[1] = " ".length();
        lIlIIIIlIIllI[2] = "  ".length();
        lIlIIIIlIIllI[3] = (-20633) & 32415;
        lIlIIIIlIIllI[4] = "   ".length();
        lIlIIIIlIIllI[5] = (((54 + 117) - 91) + 52) ^ (((105 + 17) - 45) + 63);
    }

    private static void lIllIllIlIlIllI() {
        lIlIIIIlIIlIl = new String[lIlIIIIlIIllI[4]];
        lIlIIIIlIIlIl[lIlIIIIlIIllI[0]] = lIllIllIlIlIlII("ZNCO2O0vkhY=", "kizdP");
        lIlIIIIlIIlIl[lIlIIIIlIIllI[1]] = lIllIllIlIlIlIl("wZbSys7OzzA=", "avQhc");
        lIlIIIIlIIlIl[lIlIIIIlIIllI[2]] = lIllIllIlIlIlII("J8rvph3STJs=", "ZVHMu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        if (lIllIllIlIllIIl(this.aL.babaAttackStyle().isSelected() ? 1 : 0) && lIllIllIlIllIIl(this.aL.babaBaboonAttackStyle().isSelected() ? 1 : 0) && !lIllIllIlIllIII(this.aL.babaBoulderAttackStyle().isSelected() ? 1 : 0)) {
            return lIlIIIIlIIllI[0];
        }
        ?? r0 = lIlIIIIlIIllI[1];
        "".length();
        return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static String lIllIllIlIlIlII(String llllllllllllllIlllIIlIlIIllllIlI, String llllllllllllllIlllIIlIlIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIIlllllII.init(lIlIIIIlIIllI[2], llllllllllllllIlllIIlIlIIlllllIl);
            return new String(llllllllllllllIlllIIlIlIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIIllllIll) {
            llllllllllllllIlllIIlIlIIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlIllIIl(int i) {
        return i == 0;
    }

    static {
        lIllIllIlIlIlll();
        lIllIllIlIlIllI();
    }
}
