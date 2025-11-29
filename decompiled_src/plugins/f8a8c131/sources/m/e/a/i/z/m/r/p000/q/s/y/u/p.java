package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking Poison Cure", priority = 8)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.p  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/p.class */
public class p extends Task {
    private static /* synthetic */ String[] lIllIIlIIIIlI;
    private final /* synthetic */ C0002c P;
    private static /* synthetic */ int[] lIllIIlIIIIll;
    private final /* synthetic */ l O;
    private final /* synthetic */ u R;
    private final /* synthetic */ f Q;

    private static String llIIIlIllIlIlII(String llllllllllllllIllIIlIlIlIIlIIIlI, String llllllllllllllIllIIlIlIlIIlIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlIlIlIIIlllll = llllllllllllllIllIIlIlIlIIlIIIIl.toCharArray();
        int llllllllllllllIllIIlIlIlIIIllllI = lIllIIlIIIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIIIIll[0];
        while (llIIIlIllIlllII(i, length)) {
            char llllllllllllllIllIIlIlIlIIlIIIll = charArray[i];
            sb.append((char) (llllllllllllllIllIIlIlIlIIlIIIll ^ llllllllllllllIllIIlIlIlIIIlllll[llllllllllllllIllIIlIlIlIIIllllI % llllllllllllllIllIIlIlIlIIIlllll.length]));
            "".length();
            llllllllllllllIllIIlIlIlIIIllllI++;
            i++;
            "".length();
            if ((((((34 + 61) - (-33)) + 49) ^ (((14 + 23) - (-50)) + 67)) & (((214 ^ 179) ^ (2 ^ 76)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlIllIllIII(this.O.B() ? 1 : 0) || llIIIlIllIllIIl(this.O.G() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        if (!llIIIlIllIllIlI(this.P.e()) && !llIIIlIllIllIII(this.R.O() ? 1 : 0)) {
            if (llIIIlIllIllIIl(Combat.isPoisoned() ? 1 : 0) && llIIIlIllIllIIl(Combat.isVenomed() ? 1 : 0)) {
                return lIllIIlIIIIll[0];
            }
            Item first = Inventory.getFirst(item -> {
                if (!llIIIlIllIllIIl(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[2]]) ? 1 : 0) || llIIIlIllIllIII(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[3]]) ? 1 : 0)) {
                    ?? r0 = lIllIIlIIIIll[1];
                    "".length();
                    return (-" ".length()) == " ".length() ? ((((144 + 32) - 154) + 166) ^ (((115 + 67) - 37) + 6)) & (((((2 + 54) - 14) + 127) ^ (((83 + 77) - 69) + 39)) ^ (-" ".length())) : r0;
                }
                return lIllIIlIIIIll[0];
            });
            if (llIIIlIllIllIll(first)) {
                return this.O.a(lIllIIlIIIIlI[lIllIIlIIIIll[0]]);
            }
            first.interact(lIllIIlIIIIlI[lIllIIlIIIIll[1]]);
            this.Q.r();
            return lIllIIlIIIIll[1];
        }
        return lIllIIlIIIIll[0];
    }

    private static boolean llIIIlIllIllIll(Object obj) {
        return obj == null;
    }

    @Inject
    public p(l lVar, C0002c c0002c, f fVar, u uVar) {
        this.O = lVar;
        this.P = c0002c;
        this.Q = fVar;
        this.R = uVar;
    }

    private static boolean llIIIlIllIllIlI(Object obj) {
        return obj != null;
    }

    private static void llIIIlIllIlIlll() {
        lIllIIlIIIIll = new int[5];
        lIllIIlIIIIll[0] = ((((75 + 72) - (-27)) + 77) ^ (((143 + 11) - 4) + 14)) & (((57 ^ 31) ^ (252 ^ 133)) ^ (-" ".length()));
        lIllIIlIIIIll[1] = " ".length();
        lIllIIlIIIIll[2] = "  ".length();
        lIllIIlIIIIll[3] = "   ".length();
        lIllIIlIIIIll[4] = 106 ^ 110;
    }

    private static void llIIIlIllIlIllI() {
        lIllIIlIIIIlI = new String[lIllIIlIIIIll[4]];
        lIllIIlIIIIlI[lIllIIlIIIIll[0]] = llIIIlIllIlIlII("CgIVQyUjVxEMIzYYD0MpMAUEEA==", "EwacJ");
        lIllIIlIIIIlI[lIllIIlIIIIll[1]] = llIIIlIllIlIlIl("NQzRAjjD/OI=", "ztJbI");
        lIllIIlIIIIlI[lIllIIlIIIIll[2]] = llIIIlIllIlIlIl("C6Ener9Wa0U=", "AWGnj");
        lIllIIlIIIIlI[lIllIIlIIIIll[3]] = llIIIlIllIlIlII("ARYYCSwF", "rwvoI");
    }

    private static boolean llIIIlIllIllIII(int i) {
        return i != 0;
    }

    private static boolean llIIIlIllIllIIl(int i) {
        return i == 0;
    }

    private static String llIIIlIllIlIlIl(String llllllllllllllIllIIlIlIlIIllIIlI, String llllllllllllllIllIIlIlIlIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIIIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIlIIllIIll) {
            llllllllllllllIllIIlIlIlIIllIIll.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIllIlIlll();
        llIIIlIllIlIllI();
    }

    private static boolean llIIIlIllIlllII(int i, int i2) {
        return i < i2;
    }
}
