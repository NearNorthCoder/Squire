package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Fix Boss Task Thing", priority = 10, blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.i  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/i.class */
public class i extends Task {
    private static /* synthetic */ int[] lIlIIlIIlIllI;
    private static /* synthetic */ String[] lIlIIlIIlIlII;

    static {
        lIlllIlIlIIIIlI();
        lIlllIlIIlllllI();
    }

    private static void lIlllIlIIlllllI() {
        lIlIIlIIlIlII = new String[lIlIIlIIlIllI[5]];
        lIlIIlIIlIlII[lIlIIlIIlIllI[0]] = lIlllIlIIlllIll("aOc4z5MIYWfzelrxAsIpf33TYlkTnoNk0FY3quLM/tY=", "ZreHb");
        lIlIIlIIlIlII[lIlIIlIIlIllI[1]] = lIlllIlIIlllIll("MEe7G+5WrqghFER8PrtRqE2TV5fdgY+B", "Cvehq");
        lIlIIlIIlIlII[lIlIIlIIlIllI[2]] = lIlllIlIIllllII("HBpDKDMgXg==", "SrcQV");
        lIlIIlIIlIlII[lIlIIlIIlIllI[3]] = lIlllIlIIllllII("LyELChcOaBEMChpoBwIKAg==", "iHscy");
        lIlIIlIIlIlII[lIlIIlIIlIllI[4]] = lIlllIlIIllllIl("owEabd62aD/ahG29gshJGSR97ixzSqh2", "oeHLj");
    }

    private static void lIlllIlIlIIIIlI() {
        lIlIIlIIlIllI = new int[7];
        lIlIIlIIlIllI[0] = ((41 ^ 105) ^ (199 ^ 162)) & (((35 ^ 111) ^ (238 ^ 135)) ^ (-" ".length()));
        lIlIIlIIlIllI[1] = " ".length();
        lIlIIlIIlIllI[2] = "  ".length();
        lIlIIlIIlIllI[3] = "   ".length();
        lIlIIlIIlIllI[4] = (((51 + 99) - 63) + 79) ^ (((57 + 1) - 0) + 104);
        lIlIIlIIlIllI[5] = 70 ^ 67;
        lIlIIlIIlIllI[6] = 187 ^ 179;
    }

    private static boolean lIlllIlIlIIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (lIlllIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIlIllI[0];
        }
        if (lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[0]]) ? 1 : 0)) {
            Log.info(lIlIIlIIlIlII[lIlIIlIIlIllI[1]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        } else if (lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[2]]) ? 1 : 0)) {
            Log.info(lIlIIlIIlIlII[lIlIIlIIlIllI[3]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        } else if (lIlllIlIlIIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Log.info(lIlIIlIIlIlII[lIlIIlIIlIllI[4]]);
            Dialog.enterAmount(lIlIIlIIlIllI[5]);
            return lIlIIlIIlIllI[1];
        } else {
            return lIlIIlIIlIllI[0];
        }
    }

    private static boolean lIlllIlIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIlIlIIIIll(int i) {
        return i == 0;
    }

    private static String lIlllIlIIlllIll(String llllllllllllllIllIlllIllIIlIIIlI, String llllllllllllllIllIlllIllIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlllIllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIllI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIlIllI[2], llllllllllllllIllIlllIllIIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIllIIlIIIll) {
            llllllllllllllIllIlllIllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIllllIl(String llllllllllllllIllIlllIllIIIlIlIl, String llllllllllllllIllIlllIllIIIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIllIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIlIllI[2], llllllllllllllIllIlllIllIIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIllIIIlIllI) {
            llllllllllllllIllIlllIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIllllII(String llllllllllllllIllIlllIllIIllIlll, String llllllllllllllIllIlllIllIIllIllI) {
        String llllllllllllllIllIlllIllIIllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlllIllIIllIlII = llllllllllllllIllIlllIllIIllIllI.toCharArray();
        int llllllllllllllIllIlllIllIIlIlllI = lIlIIlIIlIllI[0];
        char[] charArray = llllllllllllllIllIlllIllIIllIlll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIlIllI[0];
        while (lIlllIlIlIIIlIl(i, length)) {
            char llllllllllllllIllIlllIllIIlllIII = charArray[i];
            sb.append((char) (llllllllllllllIllIlllIllIIlllIII ^ llllllllllllllIllIlllIllIIllIlII[llllllllllllllIllIlllIllIIlIlllI % llllllllllllllIllIlllIllIIllIlII.length]));
            "".length();
            llllllllllllllIllIlllIllIIlIlllI++;
            i++;
            "".length();
            if ((((((18 + 21) - (-47)) + 163) ^ (((88 + 91) - 26) + 16)) & (((((196 + 100) - 242) + 197) ^ (((138 + 142) - 161) + 52)) ^ (-" ".length()))) > ((((98 + 41) - 48) + 62) ^ (((37 + 75) - 87) + 132))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
