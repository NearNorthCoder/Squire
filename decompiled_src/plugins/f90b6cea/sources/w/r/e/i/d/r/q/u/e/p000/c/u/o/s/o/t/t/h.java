package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Checking state", priority = 133337, register = true)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.h  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/h.class */
public class h extends Task {
    private static /* synthetic */ String[] lIllIIIlIIIlI;
    private static /* synthetic */ int[] lIllIIIlIIIll;
    private final /* synthetic */ SquireWoodcutterConfig H;
    private final /* synthetic */ SquireWoodcutterPlugin G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (llIIIlIIllIIIlI(this.G.g() ? 1 : 0) && llIIIlIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
            Log.info(lIllIIIlIIIlI[lIllIIIlIIIll[0]]);
            this.G.a((boolean) lIllIIIlIIIll[0]);
            Bank.close();
        }
        if (llIIIlIIllIIIlI(this.G.p() ? 1 : 0)) {
            return lIllIIIlIIIll[0];
        }
        if (llIIIlIIllIIIlI(Inventory.isFull() ? 1 : 0) && llIIIlIIllIIIlI(this.H.bank() ? 1 : 0)) {
            Log.info(lIllIIIlIIIlI[lIllIIIlIIIll[1]]);
            this.G.a((boolean) lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        } else if (!llIIIlIIllIIIll(this.G.d() ? 1 : 0) || (llIIIlIIllIIIll(this.H.fastTickChop() ? 1 : 0) && !llIIIlIIllIIIlI(this.H.tickChop() ? 1 : 0))) {
            return lIllIIIlIIIll[0];
        } else {
            Log.info(lIllIIIlIIIlI[lIllIIIlIIIll[2]]);
            this.G.a((boolean) lIllIIIlIIIll[1]);
            return lIllIIIlIIIll[1];
        }
    }

    private static boolean llIIIlIIllIIIll(int i) {
        return i == 0;
    }

    @Inject
    public h(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.G = squireWoodcutterPlugin;
        this.H = squireWoodcutterConfig;
    }

    private static String llIIIlIIlIlllll(String llllllllllllllIllIIlIlllllllIllI, String llllllllllllllIllIIlIlllllllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllllllllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllllllllIII.init(lIllIIIlIIIll[2], llllllllllllllIllIIlIllllllllIIl);
            return new String(llllllllllllllIllIIlIllllllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlllllllIlll) {
            llllllllllllllIllIIlIlllllllIlll.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIlIllllI(String llllllllllllllIllIIllIIIIIIIlIll, String llllllllllllllIllIIllIIIIIIIlIlI) {
        String llllllllllllllIllIIllIIIIIIIlIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIllIIIIIIIlIII = llllllllllllllIllIIllIIIIIIIlIlI.toCharArray();
        int llllllllllllllIllIIllIIIIIIIIlll = lIllIIIlIIIll[0];
        char[] charArray = llllllllllllllIllIIllIIIIIIIlIll2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIIlIlllllllllll = lIllIIIlIIIll[0];
        while (llIIIlIIllIIlII(llllllllllllllIllIIlIlllllllllll, length)) {
            char llllllllllllllIllIIllIIIIIIIllII = charArray[llllllllllllllIllIIlIlllllllllll];
            sb.append((char) (llllllllllllllIllIIllIIIIIIIllII ^ llllllllllllllIllIIllIIIIIIIlIII[llllllllllllllIllIIllIIIIIIIIlll % llllllllllllllIllIIllIIIIIIIlIII.length]));
            "".length();
            llllllllllllllIllIIllIIIIIIIIlll++;
            llllllllllllllIllIIlIlllllllllll++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIlIIllIIlII(int i, int i2) {
        return i < i2;
    }

    private static void llIIIlIIllIIIIl() {
        lIllIIIlIIIll = new int[4];
        lIllIIIlIIIll[0] = ((72 ^ 108) ^ (46 ^ 85)) & (("   ".length() ^ (48 ^ 108)) ^ (-" ".length()));
        lIllIIIlIIIll[1] = " ".length();
        lIllIIIlIIIll[2] = "  ".length();
        lIllIIIlIIIll[3] = "   ".length();
    }

    private static boolean llIIIlIIllIIIlI(int i) {
        return i != 0;
    }

    static {
        llIIIlIIllIIIIl();
        llIIIlIIllIIIII();
    }

    private static void llIIIlIIllIIIII() {
        lIllIIIlIIIlI = new String[lIllIIIlIIIll[3]];
        lIllIIIlIIIlI[lIllIIIlIIIll[0]] = llIIIlIIlIllllI("FQkhPVAzByEzGT8BY3gTPQk8MR42Ri05HjpI", "QfOXp");
        lIllIIIlIIIlI[lIllIIIlIIIll[1]] = llIIIlIIlIlllll("qJgKy4JGBoxxk2FXJ3ZrqHitva1+Jh8Ep7+a2DudqZvPGv+BH6xVyw==", "iuQqC");
        lIllIIIlIIIlI[lIllIIIlIIIll[2]] = llIIIlIIlIlllll("ZHWwRyGqwFnO35Z6OHDquz0eKRmDx9XkYNicwAn21Xb7Nf5JFAcA3uujXjIbaEkQL9X9M/qRNe/26pMI2O13qQ==", "LQGDN");
    }
}
