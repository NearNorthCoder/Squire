package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Disturbing Odd Figure")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.o  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/o.class */
public class o extends f {
    private static /* synthetic */ String[] lIlIllIlIIlll;
    private static final /* synthetic */ int V;
    private static /* synthetic */ int[] lIlIllIlIlIII;
    @Inject
    private /* synthetic */ C0003d W;

    private static void llIIIIIlIlIIIII() {
        lIlIllIlIIlll = new String[lIlIllIlIlIII[4]];
        lIlIllIlIIlll[lIlIllIlIlIII[1]] = llIIIIIlIIlllIl("Nh4xcAQQHSAiJw==", "yzUPB");
        lIlIllIlIIlll[lIlIllIlIlIII[0]] = llIIIIIlIIllllI("U2gwdH2yWAk=", "waMNk");
        lIlIllIlIIlll[lIlIllIlIlIII[2]] = llIIIIIlIIllllI("DUiQ38JPU3c=", "DSWiI");
    }

    private static String llIIIIIlIIllllI(String llllllllllllllIllIlIIIllIlllIIlI, String llllllllllllllIllIlIIIllIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIllIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIllIlllIlII.init(lIlIllIlIlIII[2], secretKeySpec);
            return new String(llllllllllllllIllIlIIIllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIllIlllIIll) {
            llllllllllllllIllIlIIIllIlllIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIlIllIlIlIII[0]];
        strArr[lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (llIIIIIlIlIIIlI(nearest)) {
            return lIlIllIlIlIII[1];
        }
        if (!llIIIIIlIlIIIll(Dialog.isViewingOptions() ? 1 : 0)) {
            this.W.e();
            nearest.interact(lIlIllIlIIlll[lIlIllIlIlIII[2]]);
            return lIlIllIlIlIII[0];
        }
        String[] strArr2 = new String[lIlIllIlIlIII[0]];
        strArr2[lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[0]];
        Dialog.chooseOption(strArr2);
        "".length();
        return lIlIllIlIlIII[0];
    }

    private static boolean llIIIIIlIlIIIlI(Object obj) {
        return obj == null;
    }

    private static void llIIIIIlIlIIIIl() {
        lIlIllIlIlIII = new int[5];
        lIlIllIlIlIII[0] = " ".length();
        lIlIllIlIlIII[1] = ((33 ^ 48) ^ (21 ^ 75)) & (((55 ^ 44) ^ (78 ^ 26)) ^ (-" ".length()));
        lIlIllIlIlIII[2] = "  ".length();
        lIlIllIlIlIII[3] = -" ".length();
        lIlIllIlIlIII[4] = "   ".length();
    }

    private static boolean llIIIIIlIlIIIll(int i) {
        return i != 0;
    }

    private static boolean llIIIIIlIlIIlII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIIIlIlIIIIl();
        llIIIIIlIlIIIII();
        V = lIlIllIlIlIII[3];
    }

    private static String llIIIIIlIIlllIl(String llllllllllllllIllIlIIIlllIIIIlll, String llllllllllllllIllIlIIIlllIIIIllI) {
        String llllllllllllllIllIlIIIlllIIIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIIIlllIIIIlII = llllllllllllllIllIlIIIlllIIIIllI.toCharArray();
        int llllllllllllllIllIlIIIlllIIIIIll = lIlIllIlIlIII[1];
        char[] charArray = llllllllllllllIllIlIIIlllIIIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIlIllIlIlIII[1];
        while (llIIIIIlIlIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlIIIlllIIIIlII[llllllllllllllIllIlIIIlllIIIIIll % llllllllllllllIllIlIIIlllIIIIlII.length]));
            "".length();
            llllllllllllllIllIlIIIlllIIIIIll++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
