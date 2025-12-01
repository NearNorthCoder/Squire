package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping empty vials", priority = 15)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.x  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/x.class */
public class x extends Task {
    private static /* synthetic */ String[] lIlIllIlIlIlI;
    private static /* synthetic */ int[] lIlIllIlIlIll;

    static {
        llIIIIIlIllIIII();
        llIIIIIlIlIllll();
    }

    private static boolean llIIIIIlIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static void llIIIIIlIlIllll() {
        lIlIllIlIlIlI = new String[lIlIllIlIlIll[2]];
        lIlIllIlIlIlI[lIlIllIlIlIll[1]] = llIIIIIlIlIllIl("JS8vDw==", "sFNco");
        lIlIllIlIlIlI[lIlIllIlIlIll[0]] = llIIIIIlIlIlllI("NdqE0teqVXQ=", "ZKoTO");
    }

    private static String llIIIIIlIlIllIl(String llllllllllllllIllIlIIIlIllllIIII, String llllllllllllllIllIlIIIlIlllIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIlllIllIl = llllllllllllllIllIlIIIlIlllIllll.toCharArray();
        int llllllllllllllIllIlIIIlIlllIllII = lIlIllIlIlIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIllIlIlIll[1];
        while (llIIIIIlIllIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlIIIlIlllIllIl[llllllllllllllIllIlIIIlIlllIllII % llllllllllllllIllIlIIIlIlllIllIl.length]));
            "".length();
            llllllllllllllIllIlIIIlIlllIllII++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIIIIlIllIIII() {
        lIlIllIlIlIll = new int[4];
        lIlIllIlIlIll[0] = " ".length();
        lIlIllIlIlIll[1] = ((160 ^ 148) ^ (128 ^ 169)) & (((245 ^ 142) ^ (49 ^ 87)) ^ (-" ".length()));
        lIlIllIlIlIll[2] = "  ".length();
        lIlIllIlIlIll[3] = 163 ^ 171;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIlIllIlIlIll[0]];
        strArr[lIlIllIlIlIll[1]] = lIlIllIlIlIlI[lIlIllIlIlIll[1]];
        Item first = Inventory.getFirst(strArr);
        if (llIIIIIlIllIIIl(first)) {
            return lIlIllIlIlIll[1];
        }
        first.interact(lIlIllIlIlIlI[lIlIllIlIlIll[0]]);
        return lIlIllIlIlIll[0];
    }

    private static boolean llIIIIIlIllIIIl(Object obj) {
        return obj == null;
    }

    private static String llIIIIIlIlIlllI(String llllllllllllllIllIlIIIlIllIllIll, String llllllllllllllIllIlIIIlIllIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIll[3]), "DES");
            Cipher llllllllllllllIllIlIIIlIllIlllIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIllIlllIl.init(lIlIllIlIlIll[2], secretKeySpec);
            return new String(llllllllllllllIllIlIIIlIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIllIlllII) {
            llllllllllllllIllIlIIIlIllIlllII.printStackTrace();
            return null;
        }
    }
}
