package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Curing poison", priority = 20)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.o  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/o.class */
public class o extends Task {
    private final /* synthetic */ C0000a aq;
    private static /* synthetic */ int[] llllIlIlIIll;
    private static /* synthetic */ String[] llllIlIlIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIlllIIll(this.aq.g() ? 1 : 0) && !lIIlIIIIlllIIll(Combat.isPoisoned() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIlIlIIll[2]];
                strArr[llllIlIlIIll[0]] = llllIlIlIIlI[llllIlIlIIll[2]];
                if (lIIlIIIIlllIlIl(item.hasAction(strArr) ? 1 : 0) && lIIlIIIIlllIlIl(item.getName().toLowerCase().contains(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0)) {
                    ?? r0 = llllIlIlIIll[2];
                    "".length();
                    return ((((152 + 117) - 198) + 124) ^ (((79 + 197) - 129) + 51)) <= 0 ? ((((37 + 175) - 205) + 241) ^ (((95 + 102) - 37) + 1)) & (((((18 + 3) - (-203)) + 18) ^ (((169 + 113) - 230) + 119)) ^ (-" ".length())) : r0;
                }
                return llllIlIlIIll[0];
            });
            if (lIIlIIIIlllIlII(first)) {
                return llllIlIlIIll[0];
            }
            first.interact(llllIlIlIIlI[llllIlIlIIll[0]]);
            sleep(llllIlIlIIll[1]);
            return llllIlIlIIll[2];
        }
        return llllIlIlIIll[0];
    }

    private static String lIIlIIIIlllIIII(String lllllllllllllllIIlIlIIIlllIIIllI, String lllllllllllllllIIlIlIIIlllIIIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIIlllIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIIIlllIIIlIl.toCharArray();
        int lllllllllllllllIIlIlIIIllIllllIl = llllIlIlIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIIll[0];
        while (lIIlIIIIlllIllI(i, length)) {
            char lllllllllllllllIIlIlIIIlllIIIlll = charArray2[i];
            lllllllllllllllIIlIlIIIlllIIIlII.append((char) (lllllllllllllllIIlIlIIIlllIIIlll ^ charArray[lllllllllllllllIIlIlIIIllIllllIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIIIllIllllIl++;
            i++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIIlllIIIlII);
    }

    private static String lIIlIIIIllIllll(String lllllllllllllllIIlIlIIIlllIlIllI, String lllllllllllllllIIlIlIIIlllIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIlIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIlllIlIlll) {
            lllllllllllllllIIlIlIIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIIl() {
        llllIlIlIIlI = new String[llllIlIlIIll[4]];
        llllIlIlIIlI[llllIlIlIIll[0]] = lIIlIIIIllIllll("Xng0ZpdELRk=", "corEG");
        llllIlIlIIlI[llllIlIlIIll[2]] = lIIlIIIIlllIIII("IRU7Bjo=", "egRhQ");
        llllIlIlIIlI[llllIlIlIIll[3]] = lIIlIIIIlllIIII("KDs1MQ==", "IUAXJ");
    }

    private static boolean lIIlIIIIlllIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIIIlllIIlI();
        lIIlIIIIlllIIIl();
    }

    private static boolean lIIlIIIIlllIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIlllIIll(int i) {
        return i == 0;
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIll = new int[6];
        llllIlIlIIll[0] = (223 ^ 134) & ((157 ^ 196) ^ (-1));
        llllIlIlIIll[1] = 85 ^ 81;
        llllIlIlIIll[2] = " ".length();
        llllIlIlIIll[3] = "  ".length();
        llllIlIlIIll[4] = "   ".length();
        llllIlIlIIll[5] = 86 ^ 94;
    }

    @Inject
    public o(C0000a c0000a) {
        this.aq = c0000a;
    }

    private static boolean lIIlIIIIlllIlII(Object obj) {
        return obj == null;
    }
}
