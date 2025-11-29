package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aw  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aw.class */
class C0023aw extends FocusAdapter {
    private static /* synthetic */ String[] lIIlIIlII;
    private static /* synthetic */ int[] lIIlIIlIl;
    final /* synthetic */ C0022av dA;

    private static boolean llllllIllI(int i2, int i3) {
        return i2 == i3;
    }

    static {
        llllllIlIl();
        llllllIIll();
    }

    private static String llllllIIlI(String llIIlIIllIIIIlI, String llIIlIIllIIIIIl) {
        String str = new String(Base64.getDecoder().decode(llIIlIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIlIIlIllllll = llIIlIIllIIIIIl.toCharArray();
        int llIIlIIlIlllllI = lIIlIIlIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llIIlIIlIllIllI = lIIlIIlIl[1];
        while (llllllIlll(llIIlIIlIllIllI, length)) {
            char llIIlIIllIIIIll = charArray[llIIlIIlIllIllI];
            sb.append((char) (llIIlIIllIIIIll ^ llIIlIIlIllllll[llIIlIIlIlllllI % llIIlIIlIllllll.length]));
            "".length();
            llIIlIIlIlllllI++;
            llIIlIIlIllIllI++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0023aw(C0022av c0022av) {
        this.dA = c0022av;
    }

    public void focusLost(FocusEvent focusEvent) {
        if (llllllIllI(this.dA.dy.getHotkey(), lIIlIIlIl[0])) {
            this.dA.dv.setText(lIIlIIlII[lIIlIIlIl[2]]);
        }
    }

    private static void llllllIlIl() {
        lIIlIIlIl = new int[5];
        lIIlIIlIl[0] = -" ".length();
        lIIlIIlIl[1] = (218 ^ 154) & ((247 ^ 183) ^ (-1));
        lIIlIIlIl[2] = " ".length();
        lIIlIIlIl[3] = "  ".length();
        lIIlIIlIl[4] = (((21 + 108) - 55) + 55) ^ (((28 + 78) - 93) + 124);
    }

    private static String llllllIIII(String llIIlIIlIlIllIl, String llIIlIIlIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlIlIllII.getBytes(StandardCharsets.UTF_8)), lIIlIIlIl[4]), "DES");
            Cipher llIIlIIlIlIllll = Cipher.getInstance("DES");
            llIIlIIlIlIllll.init(lIIlIIlIl[3], secretKeySpec);
            return new String(llIIlIIlIlIllll.doFinal(Base64.getDecoder().decode(llIIlIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIlIlIlllI) {
            llIIlIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public void focusGained(FocusEvent focusEvent) {
        this.dA.dy.setHotkey(lIIlIIlIl[0]);
        this.dA.dv.setText(lIIlIIlII[lIIlIIlIl[1]]);
        this.dA.dz = lIIlIIlIl[2];
    }

    private static void llllllIIll() {
        lIIlIIlII = new String[lIIlIIlIl[3]];
        lIIlIIlII[lIIlIIlIl[1]] = llllllIIII("7zGXe+y9wLh/rA16KiqXQg==", "OBicM");
        lIIlIIlII[lIIlIIlIl[2]] = llllllIIlI("EgEWFjksMCQ=", "IIybR");
    }
}
