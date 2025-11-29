package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.movement.Movement;
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.p  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/p.class */
class p implements Runnable {
    private static /* synthetic */ int[] lIIlllIIlIlII;
    final /* synthetic */ o X;
    private static /* synthetic */ String[] lIIlllIIlIIll;
    final /* synthetic */ TileObject W;

    private static boolean lIllIIllIIIIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(o oVar, TileObject tileObject) {
        this.X = oVar;
        this.W = tileObject;
    }

    static {
        lIllIIllIIIIlII();
        lIllIIllIIIIIll();
    }

    private static void lIllIIllIIIIIll() {
        lIIlllIIlIIll = new String[lIIlllIIlIlII[2]];
        lIIlllIIlIIll[lIIlllIIlIlII[0]] = lIllIIllIIIIIIl("ReyKwiP1TIA=", "GisDm");
        lIIlllIIlIIll[lIIlllIIlIlII[1]] = lIllIIllIIIIIlI("OxErJA==", "taNJW");
    }

    private static void lIllIIllIIIIlII() {
        lIIlllIIlIlII = new int[4];
        lIIlllIIlIlII[0] = ((192 ^ 186) ^ (66 ^ 109)) & (((47 ^ 32) ^ (51 ^ 105)) ^ (-" ".length()));
        lIIlllIIlIlII[1] = " ".length();
        lIIlllIIlIlII[2] = "  ".length();
        lIIlllIIlIlII[3] = (102 ^ 77) ^ (48 ^ 19);
    }

    private static boolean lIllIIllIIIIlIl(int i) {
        return i != 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        TileObject tileObject = this.W;
        String str = lIIlllIIlIIll[lIIlllIIlIlII[0]];
        if (lIllIIllIIIIlIl(tileObject.hasAction((v1) -> {
            return r1.equals(v1);
        }) ? 1 : 0)) {
            this.W.interact(lIIlllIIlIIll[lIIlllIIlIlII[1]]);
            return;
        }
        Movement.walkTo(this.W.getWorldLocation().dy(lIIlllIIlIlII[1]));
        "".length();
    }

    private static String lIllIIllIIIIIlI(String llllllllllllllIlllIllIIIIlIIIlll, String llllllllllllllIlllIllIIIIlIIIllI) {
        String llllllllllllllIlllIllIIIIlIIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIIIIlIIIllI.toCharArray();
        int llllllllllllllIlllIllIIIIlIIIIll = lIIlllIIlIlII[0];
        char[] charArray2 = llllllllllllllIlllIllIIIIlIIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIlIlII[0];
        while (lIllIIllIIIIllI(i, length)) {
            char llllllllllllllIlllIllIIIIlIIlIII = charArray2[i];
            sb.append((char) (llllllllllllllIlllIllIIIIlIIlIII ^ charArray[llllllllllllllIlllIllIIIIlIIIIll % charArray.length]));
            "".length();
            llllllllllllllIlllIllIIIIlIIIIll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIIllIIIIIIl(String llllllllllllllIlllIllIIIIIllIIlI, String llllllllllllllIlllIllIIIIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIlIlII[3]), "DES");
            Cipher llllllllllllllIlllIllIIIIIllIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIIIIllIlII.init(lIIlllIIlIlII[2], secretKeySpec);
            return new String(llllllllllllllIlllIllIIIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIIIllIIll) {
            llllllllllllllIlllIllIIIIIllIIll.printStackTrace();
            return null;
        }
    }
}
