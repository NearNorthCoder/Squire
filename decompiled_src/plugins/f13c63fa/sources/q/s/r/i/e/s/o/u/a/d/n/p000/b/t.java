package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
@TaskDesc(name = "Consuming peaches", priority = 5, blocking = true)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.t  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/t.class */
public class t extends Task {
    private static /* synthetic */ String[] llIlllIllIl;
    private final /* synthetic */ e aj;
    private static /* synthetic */ int[] llIllllIIIl;
    private final /* synthetic */ f ak;

    private static void lIlIlIllllIIIl() {
        llIlllIllIl = new String[llIllllIIIl[3]];
        llIlllIllIl[llIllllIIIl[0]] = lIlIlIlllIlIlI("Ehr8XXsvkIw=", "BRYlR");
        llIlllIllIl[llIllllIIIl[2]] = lIlIlIllllIIII("FCQFNDg=", "dAdWP");
    }

    private static String lIlIlIlllIlIlI(String llllllllllllllllIIlIlIlIIIlIIlII, String llllllllllllllllIIlIlIlIIIlIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllllIIIl[3], llllllllllllllllIIlIlIlIIIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIIlIIlIl) {
            llllllllllllllllIIlIlIlIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllllIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIllllIIII(String llllllllllllllllIIlIlIlIIIIlIlII, String llllllllllllllllIIlIlIlIIIIlIIll) {
        String llllllllllllllllIIlIlIlIIIIlIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIIIIlIIIl = llllllllllllllllIIlIlIlIIIIlIIll.toCharArray();
        int llllllllllllllllIIlIlIlIIIIIlIll = llIllllIIIl[0];
        char[] charArray = llllllllllllllllIIlIlIlIIIIlIlII2.toCharArray();
        int length = charArray.length;
        int i = llIllllIIIl[0];
        while (lIlIlIlllllIll(i, length)) {
            char llllllllllllllllIIlIlIlIIIIlIlIl = charArray[i];
            sb.append((char) (llllllllllllllllIIlIlIlIIIIlIlIl ^ llllllllllllllllIIlIlIlIIIIlIIIl[llllllllllllllllIIlIlIlIIIIIlIll % llllllllllllllllIIlIlIlIIIIlIIIl.length]));
            "".length();
            llllllllllllllllIIlIlIlIIIIIlIll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlllllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlllllIIl(int i) {
        return i == 0;
    }

    static {
        lIlIlIllllIllI();
        lIlIlIllllIIIl();
    }

    private static boolean lIlIlIlllllIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIlIllllIlll(this.aj.t() ? 1 : 0) || lIlIlIllllIlll(this.aj.s() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        if (!lIlIlIlllllIII(Combat.getMissingHealth(), llIllllIIIl[1]) || lIlIlIlllllIIl(this.ak.D() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIlllIllIl[llIllllIIIl[2]]);
        });
        if (lIlIlIlllllIlI(first)) {
            return llIllllIIIl[0];
        }
        first.interact(llIlllIllIl[llIllllIIIl[0]]);
        this.ak.C();
        return llIllllIIIl[2];
    }

    private static void lIlIlIllllIllI() {
        llIllllIIIl = new int[4];
        llIllllIIIl[0] = (58 ^ 124) & ((232 ^ 174) ^ (-1));
        llIllllIIIl[1] = (221 ^ 189) ^ (233 ^ 129);
        llIllllIIIl[2] = " ".length();
        llIllllIIIl[3] = "  ".length();
    }

    private static boolean lIlIlIllllIlll(int i) {
        return i != 0;
    }

    @Inject
    public t(e eVar, f fVar) {
        this.aj = eVar;
        this.ak = fVar;
    }
}
