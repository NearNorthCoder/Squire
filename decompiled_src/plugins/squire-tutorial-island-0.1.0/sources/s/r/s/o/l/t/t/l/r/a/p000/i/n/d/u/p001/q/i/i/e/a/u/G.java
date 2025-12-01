package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.quest.SquireTutorialIsland;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.input.Keyboard;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.G  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/G.class */
public class G implements o {
    private static /* synthetic */ int aC;
    private static /* synthetic */ String[] lIlIIIllIIllI;
    private final /* synthetic */ SquireTutorialIsland aD;
    private static /* synthetic */ int[] lIlIIIllIIlll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        String c = this.aD.c();
        String replace = M.b(lIlIIIllIIlll[0], lIlIIIllIIlll[1]).replace(lIlIIIllIIllI[lIlIIIllIIlll[2]], lIlIIIllIIllI[lIlIIIllIIlll[3]]);
        String b = M.b(lIlIIIllIIlll[0], lIlIIIllIIlll[4]);
        if (lIlllIIIIlIIIll(replace.length(), c.length())) {
            Keyboard.type(String.valueOf(c.charAt(aC)));
            aC += lIlIIIllIIlll[3];
            "".length();
            if ("  ".length() == "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            aC = lIlIIIllIIlll[2];
            if (lIlllIIIIlIIlII(replace.equals(c) ? 1 : 0)) {
                if (lIlllIIIIlIIlII(b.equals(lIlIIIllIIllI[lIlIIIllIIlll[5]]) ? 1 : 0)) {
                    M.a(lIlIIIllIIlll[0], lIlIIIllIIlll[6], lIlIIIllIIllI[lIlIIIllIIlll[7]]);
                    "".length();
                    return lIlIIIllIIlll[3];
                } else if (lIlllIIIIlIIlII(b.contains(lIlIIIllIIllI[lIlIIIllIIlll[8]]) ? 1 : 0)) {
                    M.a(lIlIIIllIIlll[0], lIlIIIllIIlll[9], lIlIIIllIIllI[lIlIIIllIIlll[10]]);
                    "".length();
                    return lIlIIIllIIlll[3];
                }
            }
        }
        return lIlIIIllIIlll[3];
    }

    @Inject
    public G(SquireTutorialIsland squireTutorialIsland) {
        this.aD = squireTutorialIsland;
    }

    private static boolean lIlllIIIIlIIlII(int i) {
        return i != 0;
    }

    private static String lIlllIIIIIlllll(String llllllllllllllIlllIIIlIIlIllllII, String llllllllllllllIlllIIIlIIlIlllIll) {
        String llllllllllllllIlllIIIlIIlIllllII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIIlIIlIlllIll.toCharArray();
        int llllllllllllllIlllIIIlIIlIlllIII = lIlIIIllIIlll[2];
        char[] charArray2 = llllllllllllllIlllIIIlIIlIllllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIllIIlll[2];
        while (lIlllIIIIlIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIIIlIIlIlllIII % charArray.length]));
            "".length();
            llllllllllllllIlllIIIlIIlIlllIII++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlllIIIIIllllI(String llllllllllllllIlllIIIlIIllIIllII, String llllllllllllllIlllIIIlIIllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIlll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIllIIlll[5], llllllllllllllIlllIIIlIIllIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIllIIllIl) {
            llllllllllllllIlllIIIlIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlIIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlllIIIIlIIIIl() {
        lIlIIIllIIllI = new String[lIlIIIllIIlll[11]];
        lIlIIIllIIllI[lIlIIIllIIlll[2]] = lIlllIIIIIllllI("tVJNlsyuWxQ=", "mAKkH");
        lIlIIIllIIllI[lIlIIIllIIlll[3]] = lIlllIIIIIllllI("F3iPU1Ce4c8=", "lYGMu");
        lIlIIIllIIllI[lIlIIIllIIlll[5]] = lIlllIIIIIlllll("ASApMAI0bCA+HjpsOSFRMGwiMBw0bDg+USIpKXEGOSk4ORQjbCUlUTg/bDAHMCUgMBM9KWI=", "QLLQq");
        lIlIIIllIIllI[lIlIIIllIIlll[7]] = lIlllIIIIlIIIII("uKG70EAM+R7QEmiiP4+uiA==", "auPnf");
        lIlIIIllIIllI[lIlIIIllIIlll[8]] = lIlllIIIIIllllI("rrXbdPzYvi0=", "uzdwI");
        lIlIIIllIIllI[lIlIIIllIIlll[10]] = lIlllIIIIIllllI("heWY8Y4vPTazeQ7zlvhTXQ==", "vOLdm");
    }

    static {
        lIlllIIIIlIIIlI();
        lIlllIIIIlIIIIl();
        aC = lIlIIIllIIlll[2];
    }

    private static void lIlllIIIIlIIIlI() {
        lIlIIIllIIlll = new int[13];
        lIlIIIllIIlll[0] = (-5185) & 5742;
        lIlIIIllIIlll[1] = 37 ^ 41;
        lIlIIIllIIlll[2] = ((251 ^ 164) ^ (83 ^ 60)) & (((94 ^ 5) ^ (221 ^ 182)) ^ (-" ".length()));
        lIlIIIllIIlll[3] = " ".length();
        lIlIIIllIIlll[4] = 62 ^ 51;
        lIlIIIllIIlll[5] = "  ".length();
        lIlIIIllIIlll[6] = 70 ^ 84;
        lIlIIIllIIlll[7] = "   ".length();
        lIlIIIllIIlll[8] = (((142 + 69) - 164) + 152) ^ (((157 + 119) - 266) + 185);
        lIlIIIllIIlll[9] = 153 ^ 138;
        lIlIIIllIIlll[10] = 80 ^ 85;
        lIlIIIllIIlll[11] = (((6 + 141) - (-15)) + 6) ^ (((150 + 161) - 177) + 40);
        lIlIIIllIIlll[12] = (((72 + 21) - (-52)) + 6) ^ (((18 + 120) - (-6)) + 15);
    }

    private static String lIlllIIIIlIIIII(String llllllllllllllIlllIIIlIIllIllIIl, String llllllllllllllIlllIIIlIIllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIllIllIll.init(lIlIIIllIIlll[5], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIllIllIlI) {
            llllllllllllllIlllIIIlIIllIllIlI.printStackTrace();
            return null;
        }
    }
}
