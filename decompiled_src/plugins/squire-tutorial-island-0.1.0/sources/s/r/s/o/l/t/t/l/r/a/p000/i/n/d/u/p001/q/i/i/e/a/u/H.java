package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.H  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/H.class */
public class H implements o {
    private static /* synthetic */ int[] lIlIIlIIIlIlI;
    private static /* synthetic */ int aE;
    private static /* synthetic */ String[] lIlIIlIIIlIIl;

    private static boolean lIlllIIlIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIIlIIIIIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllIIIlllllll() {
        lIlIIlIIIlIlI = new int[15];
        lIlIIlIIIlIlI[0] = (228 ^ 197) & ((59 ^ 26) ^ (-1));
        lIlIIlIIIlIlI[1] = " ".length();
        lIlIIlIIIlIlI[2] = (-((-2731) & 24555)) & (-2073) & 24575;
        lIlIIlIIIlIlI[3] = "  ".length();
        lIlIIlIIIlIlI[4] = 117 ^ 121;
        lIlIIlIIIlIlI[5] = 101 ^ 104;
        lIlIIlIIIlIlI[6] = (180 ^ 144) ^ (55 ^ 3);
        lIlIIlIIIlIlI[7] = 156 ^ 141;
        lIlIIlIIIlIlI[8] = 163 ^ 183;
        lIlIIlIIIlIlI[9] = (39 ^ 30) ^ (147 ^ 191);
        lIlIIlIIIlIlI[10] = 147 ^ 184;
        lIlIIlIIIlIlI[11] = (51 ^ 66) ^ (20 ^ 73);
        lIlIIlIIIlIlI[12] = 65 ^ 114;
        lIlIIlIIIlIlI[13] = (((89 + 28) - 94) + 224) ^ (((72 + 151) - 94) + 66);
        lIlIIlIIIlIlI[14] = 112 ^ 52;
    }

    static {
        lIlllIIIlllllll();
        lIlllIIIllllllI();
    }

    private static boolean lIlllIIlIIIIIIl(Object obj) {
        return obj != null;
    }

    private static void lIlllIIIllllllI() {
        lIlIIlIIIlIIl = new String[lIlIIlIIIlIlI[3]];
        lIlIIlIIIlIIl[lIlIIlIIIlIlI[0]] = lIlllIIIlllllII("ff1a6QIZc/KhwFQQBK+VvKWhMLhlaMWWc3q2+InJ3+o=", "bcbeF");
        lIlIIlIIIlIIl[lIlIIlIIIlIlI[1]] = lIlllIIIlllllIl("AT8dKAcwPQ==", "BPsNn");
    }

    private static int a(int i, int i2) {
        if (lIlllIIlIIIIIII(i, i2)) {
            throw new IllegalArgumentException(lIlIIlIIIlIIl[lIlIIlIIIlIlI[0]]);
        }
        return new Random().nextInt((i2 - i) + lIlIIlIIIlIlI[1]) + i;
    }

    public void E() {
        if (lIlllIIlIIIIIIl(Widgets.get(lIlIIlIIIlIlI[2], lIlIIlIIIlIlI[3]))) {
            M.b(a(lIlIIlIIIlIlI[4], lIlIIlIIIlIlI[5]));
            aE = M.G();
            M.b(a(lIlIIlIIIlIlI[6], lIlIIlIIIlIlI[7]));
            aE = M.G();
            M.b(a(lIlIIlIIIlIlI[8], lIlIIlIIIlIlI[9]));
            aE = M.G();
            M.b(a(lIlIIlIIIlIlI[10], lIlIIlIIIlIlI[11]));
            aE = M.G();
            M.b(a(lIlIIlIIIlIlI[12], lIlIIlIIIlIlI[13]));
            aE = M.G();
        }
        aE = M.G();
        Widget widget = Widgets.get(lIlIIlIIIlIlI[2], lIlIIlIIIlIlI[14]);
        if (lIlllIIlIIIIIIl(widget)) {
            widget.interact(lIlIIlIIIlIIl[lIlIIlIIIlIlI[1]]);
            aE = M.G();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIlIIIIIII(aE, lIlIIlIIIlIlI[1])) {
            aE -= lIlIIlIIIlIlI[1];
            return lIlIIlIIIlIlI[0];
        }
        E();
        return lIlIIlIIIlIlI[0];
    }

    private static String lIlllIIIlllllIl(String llllllllllllllIlllIIIIlIIlIlIIII, String llllllllllllllIlllIIIIlIIlIIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIIlIIlIIlllI = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIIIlIIlIIllll.toCharArray();
        int llllllllllllllIlllIIIIlIIlIIllII = lIlIIlIIIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIIIIlIIlIIIlII = lIlIIlIIIlIlI[0];
        while (lIlllIIlIIIIIlI(llllllllllllllIlllIIIIlIIlIIIlII, length)) {
            llllllllllllllIlllIIIIlIIlIIlllI.append((char) (charArray2[llllllllllllllIlllIIIIlIIlIIIlII] ^ charArray[llllllllllllllIlllIIIIlIIlIIllII % charArray.length]));
            "".length();
            llllllllllllllIlllIIIIlIIlIIllII++;
            llllllllllllllIlllIIIIlIIlIIIlII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIIIlIIlIIlllI);
    }

    private static String lIlllIIIlllllII(String llllllllllllllIlllIIIIlIIllIIIII, String llllllllllllllIlllIIIIlIIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIIlIlI[3], llllllllllllllIlllIIIIlIIllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIlIIllIIIIl) {
            llllllllllllllIlllIIIIlIIllIIIIl.printStackTrace();
            return null;
        }
    }
}
