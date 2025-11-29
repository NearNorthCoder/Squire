package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer", priority = 10000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.p  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/p.class */
public class p extends Task {
    private final /* synthetic */ SquireScurriusConfig aa;
    private final /* synthetic */ b ab;
    private static /* synthetic */ String[] lIIlIllIIlIlI;
    private static /* synthetic */ int[] lIIlIllIIlIll;
    private final /* synthetic */ SquireScurrius Z;

    private static String lIlIllIIlllIIII(String llllllllllllllIllllIlIllIlIIIIlI, String llllllllllllllIllllIlIllIlIIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIllIlIIIIII = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIllIlIIIIIl.toCharArray();
        int llllllllllllllIllllIlIllIIlllllI = lIIlIllIIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIIlIll[0];
        while (lIlIllIIllllIII(i, length)) {
            char llllllllllllllIllllIlIllIIllIlIl = charArray2[i];
            llllllllllllllIllllIlIllIlIIIIII.append((char) (llllllllllllllIllllIlIllIIllIlIl ^ charArray[llllllllllllllIllllIlIllIIlllllI % charArray.length]));
            "".length();
            llllllllllllllIllllIlIllIIlllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIllIlIIIIII);
    }

    private static boolean lIlIllIIlllIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIlllIlIl(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIlllIIIl(String llllllllllllllIllllIlIllIIlIllIl, String llllllllllllllIllllIlIllIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIllIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIllIIlIllll.init(lIIlIllIIlIll[2], secretKeySpec);
            return new String(llllllllllllllIllllIlIllIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIllIIlIlllI) {
            llllllllllllllIllllIlIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.Z = squireScurrius;
        this.aa = squireScurriusConfig;
        this.ab = squireScurrius.n();
    }

    private static boolean lIlIllIIllllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIIlllIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIlIllIIlllIlII(Prayers.getPoints(), this.aa.drinkPrayerAt())) {
            return lIIlIllIIlIll[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIllIIlllIllI(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[1]]) ? 1 : 0) || lIlIllIIlllIlll(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[2]]) ? 1 : 0)) {
                ?? r0 = lIIlIllIIlIll[1];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIllIIlIll[0];
        });
        if (lIlIllIIlllIlIl(first)) {
            return lIIlIllIIlIll[0];
        }
        first.interact(lIIlIllIIlIlI[lIIlIllIIlIll[0]]);
        return lIIlIllIIlIll[1];
    }

    private static void lIlIllIIlllIIll() {
        lIIlIllIIlIll = new int[4];
        lIIlIllIIlIll[0] = ((((74 + 91) - 17) + 7) ^ (((48 + 39) - (-2)) + 67)) & (((((56 + 82) - 97) + 87) ^ (((2 + 90) - 16) + 59)) ^ (-" ".length()));
        lIIlIllIIlIll[1] = " ".length();
        lIIlIllIIlIll[2] = "  ".length();
        lIIlIllIIlIll[3] = "   ".length();
    }

    private static void lIlIllIIlllIIlI() {
        lIIlIllIIlIlI = new String[lIIlIllIIlIll[3]];
        lIIlIllIIlIlI[lIIlIllIIlIll[0]] = lIlIllIIlllIIII("PD8mCyE=", "xMOeJ");
        lIIlIllIIlIlI[lIIlIllIIlIll[1]] = lIlIllIIlllIIII("BT8YDw4HbQkZHxwiFw==", "uMyvk");
        lIIlIllIIlIlI[lIIlIllIIlIll[2]] = lIlIllIIlllIIIl("7tiSJL6HHzhBLJRayFT1LQ==", "mGWdf");
    }

    static {
        lIlIllIIlllIIll();
        lIlIllIIlllIIlI();
    }

    private static boolean lIlIllIIlllIllI(int i) {
        return i == 0;
    }
}
