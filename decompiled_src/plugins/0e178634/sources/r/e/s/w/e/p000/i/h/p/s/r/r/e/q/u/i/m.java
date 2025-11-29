package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.whisperer.SquireWhisperer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@TaskDesc(name = "Withdrawing items")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.m  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/m.class */
public class m extends i {
    @Inject
    private /* synthetic */ SquireWhisperer Q;
    private static /* synthetic */ int[] lIlIllllIIIIl;
    private /* synthetic */ int R;
    private /* synthetic */ CompletableFuture<Boolean> S = null;
    private static /* synthetic */ String[] lIlIllllIIIII;

    static {
        llIIIIlIlIllIII();
        llIIIIlIlIlIlll();
    }

    private static String llIIIIlIlIlIllI(String llllllllllllllIllIIllllIlllIIIlI, String llllllllllllllIllIIllllIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIlllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIlllIIlII.init(lIlIllllIIIIl[3], secretKeySpec);
            return new String(llllllllllllllIllIIllllIlllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIlllIIIll) {
            llllllllllllllIllIIllllIlllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.i
    public boolean p() {
        if (llIIIIlIlIllIIl(n() ? 1 : 0)) {
            return lIlIllllIIIIl[0];
        }
        BankLoadout o = o();
        if (llIIIIlIlIllIlI(o)) {
            Log.error(lIlIllllIIIII[lIlIllllIIIIl[0]]);
            return lIlIllllIIIIl[0];
        }
        String str = lIlIllllIIIII[lIlIllllIIIIl[1]];
        Object[] objArr = new Object[lIlIllllIIIIl[1]];
        objArr[lIlIllllIIIIl[0]] = Boolean.valueOf(o.needsToBank());
        Log.info(str, objArr);
        if (llIIIIlIlIllIIl(o.needsToBank() ? 1 : 0)) {
            this.f.a(lIlIllllIIIIl[0]);
            return lIlIllllIIIIl[0];
        } else if (llIIIIlIlIllIIl(BankLoadouts.withdrawWithRetries(o, lIlIllllIIIIl[2]).booleanValue() ? 1 : 0)) {
            Log.info(lIlIllllIIIII[lIlIllllIIIIl[3]]);
            sleep(lIlIllllIIIIl[2]);
            return lIlIllllIIIIl[0];
        } else {
            return lIlIllllIIIIl[0];
        }
    }

    private static String llIIIIlIlIlIlIl(String llllllllllllllIllIIllllIlllIllll, String llllllllllllllIllIIllllIlllIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIlllIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllllIIIIl[5]), "DES");
            Cipher llllllllllllllIllIIllllIllllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIllllIIIl.init(lIlIllllIIIIl[3], llllllllllllllIllIIllllIllllIIlI);
            return new String(llllllllllllllIllIIllllIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIllllIIII) {
            llllllllllllllIllIIllllIllllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlIllIIl(int i) {
        return i == 0;
    }

    private static void llIIIIlIlIlIlll() {
        lIlIllllIIIII = new String[lIlIllllIIIIl[4]];
        lIlIllllIIIII[lIlIllllIIIIl[0]] = llIIIIlIlIlIlIl("X6SHHzx6NHwjhOtcJLpWpsCIrCbVnWPzBdauyJkyWAI=", "dpmOG");
        lIlIllllIIIII[lIlIllllIIIIl[1]] = llIIIIlIlIlIlIl("64bMd9CQ/B0SGyHROM6WHgp0jJZDyHRI", "XqOEJ");
        lIlIllllIIIII[lIlIllllIIIIl[3]] = llIIIIlIlIlIllI("aBLiBVov3nYAUZBk4ra//wH7SnGwIrlgy7MSko6JiF4dWdknX/Sc6yOfx+MEX19B1A7J8h4VFRYP6nHyQCNwyw==", "BqhyL");
    }

    private static void llIIIIlIlIllIII() {
        lIlIllllIIIIl = new int[6];
        lIlIllllIIIIl[0] = ((73 ^ 70) ^ (62 ^ 8)) & (((((76 + 10) - 24) + 87) ^ (((20 + 6) - (-11)) + 135)) ^ (-" ".length()));
        lIlIllllIIIIl[1] = " ".length();
        lIlIllllIIIIl[2] = 126 ^ 123;
        lIlIllllIIIIl[3] = "  ".length();
        lIlIllllIIIIl[4] = "   ".length();
        lIlIllllIIIIl[5] = (191 ^ 179) ^ (34 ^ 38);
    }

    private static boolean llIIIIlIlIllIlI(Object obj) {
        return obj == null;
    }
}
