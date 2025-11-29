package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.q  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/q.class */
public class q implements o {
    private static /* synthetic */ String[] lIlIIIlllIlll;
    private static /* synthetic */ int[] lIlIIIllllIII;

    private static boolean lIlllIIIlIlIIII(int i) {
        return i != 0;
    }

    private static String lIlllIIIlIIllII(String llllllllllllllIlllIIIIlllIlllIII, String llllllllllllllIlllIIIIlllIllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlllIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIII[6]), "DES");
            Cipher llllllllllllllIlllIIIIlllIlllIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlllIlllIlI.init(lIlIIIllllIII[4], llllllllllllllIlllIIIIlllIlllIll);
            return new String(llllllllllllllIlllIIIIlllIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlllIlllIIl) {
            llllllllllllllIlllIIIIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIIllIl(String llllllllllllllIlllIIIIlllIlIlIll, String llllllllllllllIlllIIIIlllIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlllIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlllIlIllIl.init(lIlIIIllllIII[4], secretKeySpec);
            return new String(llllllllllllllIlllIIIIlllIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlllIlIllII) {
            llllllllllllllIlllIIIIlllIlIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        int[] iArr = new int[lIlIIIllllIII[0]];
        iArr[lIlIIIllllIII[1]] = lIlIIIllllIII[2];
        if (lIlllIIIlIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[lIlIIIllllIII[0]];
            strArr[lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[1]];
            if (!lIlllIIIlIlIIIl(TileObjects.getNearest(strArr))) {
                if (lIlllIIIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllllIII[3])) {
                    return lIlIIIllllIII[1];
                }
                String[] strArr2 = new String[lIlIIIllllIII[0]];
                strArr2[lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[0]];
                Item first = Inventory.getFirst(strArr2);
                String[] strArr3 = new String[lIlIIIllllIII[0]];
                strArr3[lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[4]];
                first.useOn(TileObjects.getNearest(strArr3));
                return lIlIIIllllIII[0];
            }
        }
        return lIlIIIllllIII[1];
    }

    private static void lIlllIIIlIIllll() {
        lIlIIIllllIII = new int[7];
        lIlIIIllllIII[0] = " ".length();
        lIlIIIllllIII[1] = ((117 ^ 67) ^ (188 ^ 168)) & (((163 ^ 155) ^ (174 ^ 180)) ^ (-" ".length()));
        lIlIIIllllIII[2] = (-16941) & 19454;
        lIlIIIllllIII[3] = -" ".length();
        lIlIIIllllIII[4] = "  ".length();
        lIlIIIllllIII[5] = "   ".length();
        lIlIIIllllIII[6] = 96 ^ 104;
    }

    private static boolean lIlllIIIlIlIIIl(Object obj) {
        return obj == null;
    }

    static {
        lIlllIIIlIIllll();
        lIlllIIIlIIlllI();
    }

    private static boolean lIlllIIIlIlIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlllIIIlIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlllIIIlIIlIll(String llllllllllllllIlllIIIIlllIIllIll, String llllllllllllllIlllIIIIlllIIllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIIIlllIIllIII = llllllllllllllIlllIIIIlllIIllIlI.toCharArray();
        int llllllllllllllIlllIIIIlllIIlIlll = lIlIIIllllIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIllllIII[1];
        while (lIlllIIIlIlIIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIIIlllIIllIII[llllllllllllllIlllIIIIlllIIlIlll % llllllllllllllIlllIIIIlllIIllIII.length]));
            "".length();
            llllllllllllllIlllIIIIlllIIlIlll++;
            i++;
            "".length();
            if ((-((((9 + 57) - 51) + 114) ^ (((1 + 56) - (-34)) + 42))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlllIIIlIIlllI() {
        lIlIIIlllIlll = new String[lIlIIIllllIII[5]];
        lIlIIIlllIlll[lIlIIIllllIII[1]] = lIlllIIIlIIlIll("HyoGCw==", "YCtnu");
        lIlIIIlllIlll[lIlIIIllllIII[0]] = lIlllIIIlIIllII("3IlFZLlGTRlj2uvQsQBv0g==", "lKQSb");
        lIlIIIlllIlll[lIlIIIllllIII[4]] = lIlllIIIlIIllIl("0XLoPumdhJI=", "yfxXW");
    }
}
