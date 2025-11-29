package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "talk to supervisor")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.p  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/p.class */
public class p extends Task {
    private static /* synthetic */ String[] lllllllIIlll;
    private static /* synthetic */ int[] lllllllIlIII;

    static {
        lIIlIlIlIIlIlll();
        lIIlIlIlIIlIllI();
    }

    private static String lIIlIlIlIIlIlIl(String lllllllllllllllIIlIIIlIIllIIIlIl, String lllllllllllllllIIlIIIlIIllIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIllIIIlII.getBytes(StandardCharsets.UTF_8)), lllllllIlIII[4]), "DES");
            Cipher lllllllllllllllIIlIIIlIIllIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIIllIIIlll.init(lllllllIlIII[3], lllllllllllllllIIlIIIlIIllIIlIII);
            return new String(lllllllllllllllIIlIIIlIIllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIllIIIllI) {
            lllllllllllllllIIlIIIlIIllIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIlIIllIII(Vars.getBit(lllllllIlIII[0]), lllllllIlIII[1]) && !lIIlIlIlIIllIIl(s.e() ? 1 : 0)) {
            if (!lIIlIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                if (lIIlIlIlIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                return lllllllIlIII[2];
            }
            String[] strArr = new String[lllllllIlIII[1]];
            strArr[lllllllIlIII[2]] = lllllllIIlll[lllllllIlIII[2]];
            NPCs.getNearest(strArr).interact(lllllllIIlll[lllllllIlIII[1]]);
            return lllllllIlIII[2];
        }
        return lllllllIlIII[2];
    }

    private static String lIIlIlIlIIlIlII(String lllllllllllllllIIlIIIlIIlIlllIII, String lllllllllllllllIIlIIIlIIlIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIIlIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIlIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIIlIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIIlIlllIlI.init(lllllllIlIII[3], lllllllllllllllIIlIIIlIIlIlllIll);
            return new String(lllllllllllllllIIlIIIlIIlIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIlIlllIIl) {
            lllllllllllllllIIlIIIlIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIlIlll() {
        lllllllIlIII = new int[5];
        lllllllIlIII[0] = (-20641) & 31976;
        lllllllIlIII[1] = " ".length();
        lllllllIlIII[2] = ((251 ^ 179) ^ (103 ^ 125)) & (((26 ^ 127) ^ (81 ^ 102)) ^ (-" ".length()));
        lllllllIlIII[3] = "  ".length();
        lllllllIlIII[4] = (((78 + 175) - 152) + 77) ^ (((99 + 27) - 47) + 107);
    }

    private static boolean lIIlIlIlIIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIlIIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIlIIllIlI(int i) {
        return i != 0;
    }

    private static void lIIlIlIlIIlIllI() {
        lllllllIIlll = new String[lllllllIlIII[3]];
        lllllllIIlll[lllllllIlIII[2]] = lIIlIlIlIIlIlII("W/OTEgYvSuJVKPM/O6bqaQ==", "qGfQB");
        lllllllIIlll[lllllllIlIII[1]] = lIIlIlIlIIlIlIl("4eTCglKyFmY=", "dyudZ");
    }
}
