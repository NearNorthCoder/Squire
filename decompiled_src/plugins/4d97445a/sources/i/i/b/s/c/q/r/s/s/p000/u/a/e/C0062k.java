package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating Wild Pie", priority = 10)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/k.class */
public class C0062k extends Task {
    private final /* synthetic */ C0000a am;
    private static /* synthetic */ int[] llIlIlIIl;
    private static /* synthetic */ String[] llIlIlIII;

    private static String lIlllIlIlII(String lIlIllllllIIIll, String lIlIlllllIlllIl) {
        String lIlIllllllIIIll2 = new String(Base64.getDecoder().decode(lIlIllllllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllllIIIIl = new StringBuilder();
        char[] charArray = lIlIlllllIlllIl.toCharArray();
        int lIlIlllllIlllll = llIlIlIIl[0];
        char[] charArray2 = lIlIllllllIIIll2.toCharArray();
        int length = charArray2.length;
        int i2 = llIlIlIIl[0];
        while (lIlllIllIll(i2, length)) {
            char lIlIllllllIIlII = charArray2[i2];
            lIlIllllllIIIIl.append((char) (lIlIllllllIIlII ^ charArray[lIlIlllllIlllll % charArray.length]));
            "".length();
            lIlIlllllIlllll++;
            i2++;
            "".length();
            if (((78 ^ 92) ^ (182 ^ 160)) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIlIllllllIIIIl);
    }

    private static void lIlllIlIlll() {
        llIlIlIIl = new int[4];
        llIlIlIIl[0] = ((((239 + 193) - 407) + 230) ^ (((109 + 95) - 90) + 83)) & (((((53 + 204) - 242) + 240) ^ (((167 + 177) - 173) + 26)) ^ (-" ".length()));
        llIlIlIIl[1] = 84 ^ 15;
        llIlIlIIl[2] = " ".length();
        llIlIlIIl[3] = "  ".length();
    }

    private static boolean lIlllIllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlllIllIIl(Object obj) {
        return obj == null;
    }

    private static String lIlllIlIlIl(String lIlIlllllIIlllI, String lIlIlllllIIllIl) {
        try {
            SecretKeySpec lIlIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllllIlIIII = Cipher.getInstance("Blowfish");
            lIlIlllllIlIIII.init(llIlIlIIl[3], lIlIlllllIlIIIl);
            return new String(lIlIlllllIlIIII.doFinal(Base64.getDecoder().decode(lIlIlllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllllIIlIlI) {
            lIlIlllllIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlllIllIII(this.am.k()) || lIlllIllIIl(this.am.k().y())) {
            return llIlIlIIl[0];
        }
        if (lIlllIllIlI(Skills.getBoostedLevel(Skill.SLAYER), llIlIlIIl[1])) {
            return llIlIlIIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIlIlIII[llIlIlIIl[2]]);
        });
        if (lIlllIllIIl(first)) {
            return llIlIlIIl[0];
        }
        first.interact(llIlIlIII[llIlIlIIl[0]]);
        return llIlIlIIl[2];
    }

    static {
        lIlllIlIlll();
        lIlllIlIllI();
    }

    private static void lIlllIlIllI() {
        llIlIlIII = new String[llIlIlIIl[3]];
        llIlIlIII[llIlIlIIl[0]] = lIlllIlIlII("NCws", "qMXJa");
        llIlIlIII[llIlIlIIl[2]] = lIlllIlIlIl("QXZj2PcrluFJFbpq3ANekw==", "OHMVz");
    }

    @Inject
    public C0062k(C0000a c0000a) {
        this.am = c0000a;
    }

    private static boolean lIlllIllIlI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlllIllIII(Object obj) {
        return obj != null;
    }
}
