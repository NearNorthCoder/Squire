package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Curing Poison", priority = 2)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.m  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/m.class */
public class m extends Task {
    private static /* synthetic */ int[] lIIllIIIIIlIl;
    private static /* synthetic */ String[] lIIllIIIIIlII;
    private static final /* synthetic */ Logger X;

    private static boolean lIlIlllIlIIIIll(int i) {
        return i == 0;
    }

    private static String lIlIlllIlIIIIII(String llllllllllllllIllllIIlIllllIlIII, String llllllllllllllIllllIIlIllllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIllllIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIlIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIllllIlIIl) {
            llllllllllllllIllllIIlIllllIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlllIlIIIIlI();
        lIlIlllIlIIIIIl();
        X = LoggerFactory.getLogger(m.class);
    }

    private static String lIlIlllIIllllll(String llllllllllllllIllllIIlIlllllllIl, String llllllllllllllIllllIIlIlllllllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIlllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlIlllllllII.toCharArray();
        int llllllllllllllIllllIIlIlllllIlII = lIIllIIIIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIIIlIl[0];
        while (lIlIlllIlIIIllI(i, length)) {
            char llllllllllllllIllllIIlIllllllllI = charArray2[i];
            sb.append((char) (llllllllllllllIllllIIlIllllllllI ^ charArray[llllllllllllllIllllIIlIlllllIlII % charArray.length]));
            "".length();
            llllllllllllllIllllIIlIlllllIlII++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIlIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIlIIIlII(Object obj) {
        return obj == null;
    }

    private static void lIlIlllIlIIIIlI() {
        lIIllIIIIIlIl = new int[5];
        lIIllIIIIIlIl[0] = ((((119 + 29) - 111) + 124) ^ (((65 + 42) - 29) + 62)) & (((100 ^ 60) ^ (181 ^ 192)) ^ (-" ".length()));
        lIIllIIIIIlIl[1] = " ".length();
        lIIllIIIIIlIl[2] = "  ".length();
        lIIllIIIIIlIl[3] = "   ".length();
        lIIllIIIIIlIl[4] = (((11 + 42) - 13) + 109) ^ (((40 + 93) - 43) + 67);
    }

    private static void lIlIlllIlIIIIIl() {
        lIIllIIIIIlII = new String[lIIllIIIIIlIl[3]];
        lIIllIIIIIlII[lIIllIIIIIlIl[0]] = lIlIlllIIllllll("LxEOCBw=", "kcgfw");
        lIIllIIIIIlII[lIIllIIIIIlIl[1]] = lIlIlllIIllllll("BQoGBw==", "ddrnq");
        lIIllIIIIIlII[lIIllIIIIIlIl[2]] = lIlIlllIlIIIIII("DbZZRggoM9k=", "sUsJM");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIlIlllIlIIIIll(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIIIIIlIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIlIlllIlIIIlIl(item.getName().toLowerCase().contains(lIIllIIIIIlII[lIIllIIIIIlIl[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIIllIIIIIlIl[1]];
                strArr[lIIllIIIIIlIl[0]] = lIIllIIIIIlII[lIIllIIIIIlIl[2]];
                if (lIlIlllIlIIIlIl(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllIIIIIlIl[1];
                    "".length();
                    return ((3 ^ 29) ^ (98 ^ 121)) <= 0 ? ("  ".length() ^ (130 ^ 196)) & (((140 ^ 184) ^ (50 ^ 66)) ^ (-" ".length())) : r0;
                }
            }
            return lIIllIIIIIlIl[0];
        });
        if (lIlIlllIlIIIlII(first)) {
            return lIIllIIIIIlIl[0];
        }
        first.interact(lIIllIIIIIlII[lIIllIIIIIlIl[0]]);
        return lIIllIIIIIlIl[1];
    }

    private static boolean lIlIlllIlIIIllI(int i, int i2) {
        return i < i2;
    }
}
