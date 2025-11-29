package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Handing in sword", priority = 10, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.l  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/l.class */
public class l extends Task {
    private final /* synthetic */ a aa;
    private static /* synthetic */ int[] llIlIlllIIlI;
    private static /* synthetic */ String[] llIlIlllIIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        if (!lIIIIIlllllIlll(this.aa.f() ? 1 : 0) && !lIIIIIllllllIII(this.aa.k()) && !lIIIIIllllllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            if (!lIIIIIllllllIIl(Dialog.getText().contains(llIlIlllIIIl[llIlIlllIIlI[0]]) ? 1 : 0)) {
                if (lIIIIIllllllIII(Players.getLocal().getInteracting())) {
                    return llIlIlllIIlI[0];
                }
                this.aa.a(llIlIlllIIIl[llIlIlllIIlI[2]]);
                "".length();
                sleep(llIlIlllIIlI[3]);
                return llIlIlllIIlI[2];
            }
            DialogOption[] dialogOptionArr = new DialogOption[llIlIlllIIlI[1]];
            dialogOptionArr[llIlIlllIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIlIlllIIlI[2]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArr[llIlIlllIIlI[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[llIlIlllIIlI[4]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[llIlIlllIIlI[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return llIlIlllIIlI[2];
        }
        return llIlIlllIIlI[0];
    }

    static {
        lIIIIIlllllIllI();
        lIIIIIlllllIlIl();
    }

    private static boolean lIIIIIllllllIII(Object obj) {
        return obj != null;
    }

    private static void lIIIIIlllllIllI() {
        llIlIlllIIlI = new int[7];
        llIlIlllIIlI[0] = ((251 ^ 154) ^ (15 ^ 55)) & (((232 ^ 147) ^ (52 ^ 22)) ^ (-" ".length()));
        llIlIlllIIlI[1] = (((104 + 56) - (-30)) + 6) ^ (((1 + 156) - 5) + 41);
        llIlIlllIIlI[2] = " ".length();
        llIlIlllIIlI[3] = "  ".length();
        llIlIlllIIlI[4] = "   ".length();
        llIlIlllIIlI[5] = (207 ^ 134) ^ (138 ^ 199);
        llIlIlllIIlI[6] = (((20 + 177) - 149) + 159) ^ (((78 + 42) - (-20)) + 59);
    }

    private static String lIIIIIlllllIIll(String lllllllllllllllIlIIIIIlIlIIIllII, String lllllllllllllllIlIIIIIlIlIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlllIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIlIIIllIl) {
            lllllllllllllllIlIIIIIlIlIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlllllIlII(String lllllllllllllllIlIIIIIlIIlllllll, String lllllllllllllllIlIIIIIlIIllllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIllllllI.getBytes(StandardCharsets.UTF_8)), llIlIlllIIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlllIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIlIIIIIII) {
            lllllllllllllllIlIIIIIlIlIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlllllIlIl() {
        llIlIlllIIIl = new String[llIlIlllIIlI[3]];
        llIlIlllIIIl[llIlIlllIIlI[0]] = lIIIIIlllllIIll("wpbshL789AK6RgwxJDmONw==", "OQivb");
        llIlIlllIIIl[llIlIlllIIlI[2]] = lIIIIIlllllIlII("PdycYyYqJ4U=", "lyjKA");
    }

    @Inject
    public l(a aVar) {
        this.aa = aVar;
    }

    private static boolean lIIIIIllllllIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlllllIlll(int i) {
        return i == 0;
    }
}
