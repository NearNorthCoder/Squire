package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Attacking NPC", priority = 15, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bi  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bi.class */
public class C0036bi extends Task {
    private static /* synthetic */ int[] lIlIIlIIl;
    private static /* synthetic */ String[] lIIllIlIl;
    private final /* synthetic */ SquireQuestHelper fK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIllI(Dialog.isOpen() ? 1 : 0) && !lIIlIIIIlll(this.fK.cz().equals(lIIllIlIl[lIlIIlIIl[0]]) ? 1 : 0)) {
            NPC cK = this.fK.cK();
            if (lIIlIIIlIII(cK)) {
                return lIlIIlIIl[0];
            }
            SquireQuestHelper squireQuestHelper = this.fK;
            String[] strArr = new String[lIlIIlIIl[1]];
            strArr[lIlIIlIIl[0]] = lIIllIlIl[lIlIIlIIl[2]];
            strArr[lIlIIlIIl[2]] = lIIllIlIl[lIlIIlIIl[3]];
            strArr[lIlIIlIIl[3]] = lIIllIlIl[lIlIIlIIl[1]];
            if (lIIlIIIIlll(squireQuestHelper.a(strArr) ? 1 : 0)) {
                return lIlIIlIIl[0];
            }
            if (lIIlIIIlIII(Players.getLocal().getInteracting())) {
                cK.interact(lIIllIlIl[lIlIIlIIl[4]]);
                sleep(lIlIIlIIl[3]);
            }
            return lIlIIlIIl[2];
        }
        return lIlIIlIIl[0];
    }

    private static boolean lIIlIIIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIIlIIIIII(String llIIIIlIIIlllII, String llIIIIlIIIllIll) {
        String str = new String(Base64.getDecoder().decode(llIIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIIIlIIIllIIl = llIIIIlIIIllIll.toCharArray();
        int llIIIIlIIIlIIll = lIlIIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIIlIIl[0];
        while (lIIlIIIlIIl(i2, length)) {
            sb.append((char) (charArray[i2] ^ llIIIIlIIIllIIl[llIIIIlIIIlIIll % llIIIIlIIIllIIl.length]));
            "".length();
            llIIIIlIIIlIIll++;
            i2++;
            "".length();
            if ((((((180 + 137) - 114) + 18) ^ (((63 + 78) - 101) + 100)) & (((201 ^ 128) ^ (14 ^ 22)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlIIIIlI(String llIIIIIlllllIlI, String llIIIIIlllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlllllIll) {
            llIIIIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIl(String llIIIIlIIIIIlll, String llIIIIlIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIlIIIIlIII) {
            llIIIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public C0036bi(SquireQuestHelper squireQuestHelper) {
        this.fK = squireQuestHelper;
    }

    private static boolean lIIlIIIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIIlIIIIll() {
        lIIllIlIl = new String[lIlIIlIIl[5]];
        lIIllIlIl[lIlIIlIIl[0]] = lIIIlIIIIII("GRMyHCUyEw==", "WcQOQ");
        lIIllIlIl[lIlIIlIIl[2]] = lIIIlIIIIIl("kqPVSMiAtu0=", "ZrsLp");
        lIIllIlIl[lIlIIlIIl[3]] = lIIIlIIIIlI("OwXy5ho0J0I=", "OWhYa");
        lIIllIlIl[lIlIIlIIl[1]] = lIIIlIIIIlI("ryhaJb252DI=", "zGhnH");
        lIIllIlIl[lIlIIlIIl[4]] = lIIIlIIIIlI("qkh+wJiUm4M=", "kxAnY");
    }

    private static boolean lIIlIIIIlll(int i2) {
        return i2 == 0;
    }

    private static void lIIlIIIIlIl() {
        lIlIIlIIl = new int[7];
        lIlIIlIIl[0] = ((((35 + 50) - 78) + 248) ^ (((20 + 113) - 89) + 127)) & (((66 ^ 45) ^ (148 ^ 175)) ^ (-" ".length()));
        lIlIIlIIl[1] = "   ".length();
        lIlIIlIIl[2] = " ".length();
        lIlIIlIIl[3] = "  ".length();
        lIlIIlIIl[4] = 159 ^ 155;
        lIlIIlIIl[5] = (134 ^ 193) ^ (75 ^ 9);
        lIlIIlIIl[6] = (99 ^ 14) ^ (251 ^ 158);
    }

    private static boolean lIIlIIIIllI(int i2) {
        return i2 != 0;
    }

    static {
        lIIlIIIIlIl();
        lIIIlIIIIll();
    }
}
