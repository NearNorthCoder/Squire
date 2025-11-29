package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking Prayer Potion")
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.n  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/n.class */
public class n extends Task {
    private static /* synthetic */ int[] lIIllIIIlIIll;
    private static /* synthetic */ String[] lIIllIIIlIIIl;
    private final /* synthetic */ c Y;

    private static void lIlIlllIllllIll() {
        lIIllIIIlIIIl = new String[lIIllIIIlIIll[3]];
        lIIllIIIlIIIl[lIIllIIIlIIll[0]] = lIlIlllIllllIIl("LtKwaj5aPv0=", "dOJfK");
        lIIllIIIlIIIl[lIIllIIIlIIll[2]] = lIlIlllIllllIlI("AzsAFhUhaREABDomDw==", "SIaop");
    }

    private static void lIlIlllIlllllIl() {
        lIIllIIIlIIll = new int[5];
        lIIllIIIlIIll[0] = (230 ^ 160) & ((106 ^ 44) ^ (-1));
        lIIllIIIlIIll[1] = 76 ^ 67;
        lIIllIIIlIIll[2] = " ".length();
        lIIllIIIlIIll[3] = "  ".length();
        lIIllIIIlIIll[4] = (((79 + 160) - 80) + 4) ^ (((154 + 146) - 212) + 83);
    }

    private static boolean lIlIlllIllllllI(int i) {
        return i == 0;
    }

    private static boolean lIlIllllIIIIIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean run() {
        if (!lIlIlllIllllllI(this.Y.s() ? 1 : 0) && !lIlIlllIlllllll(Prayers.getPoints(), lIIllIIIlIIll[1])) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIllIIIlIIIl[lIIllIIIlIIll[2]]);
            });
            if (lIlIllllIIIIIII(first)) {
                return lIIllIIIlIIll[0];
            }
            first.interact(lIIllIIIlIIIl[lIIllIIIlIIll[0]]);
            return lIIllIIIlIIll[2];
        }
        return lIIllIIIlIIll[0];
    }

    private static boolean lIlIlllIlllllll(int i, int i2) {
        return i > i2;
    }

    @Inject
    public n(c cVar) {
        this.Y = cVar;
    }

    static {
        lIlIlllIlllllIl();
        lIlIlllIllllIll();
    }

    private static boolean lIlIllllIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIllllIIl(String llllllllllllllIllllIIlIIIIllIlIl, String llllllllllllllIllllIIlIIIIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIIll[4]), "DES");
            Cipher llllllllllllllIllllIIlIIIIllIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIIIIllIlll.init(lIIllIIIlIIll[3], secretKeySpec);
            return new String(llllllllllllllIllllIIlIIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIIIIllIllI) {
            llllllllllllllIllllIIlIIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIllllIlI(String llllllllllllllIllllIIlIIIlIIlIlI, String llllllllllllllIllllIIlIIIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIIlIIIlIIIlll = llllllllllllllIllllIIlIIIlIIlIIl.toCharArray();
        int llllllllllllllIllllIIlIIIlIIIllI = lIIllIIIlIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIIIlIIll[0];
        while (lIlIllllIIIIIIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllllIIlIIIlIIIlll[llllllllllllllIllllIIlIIIlIIIllI % llllllllllllllIllllIIlIIIlIIIlll.length]));
            "".length();
            llllllllllllllIllllIIlIIIlIIIllI++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
