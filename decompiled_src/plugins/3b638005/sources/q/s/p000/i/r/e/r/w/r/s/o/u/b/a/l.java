package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 133337)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.l  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/l.class */
public class l extends Task {
    private static /* synthetic */ int[] llllIlIIlII;
    private final /* synthetic */ SquireBarrows O;
    private final /* synthetic */ SquireBarrowsConfig P;
    private static /* synthetic */ String[] llllIlIIIll;

    private static boolean lIllIlIlIIllll(int i) {
        return i == 0;
    }

    private static void lIllIlIlIIllIl() {
        llllIlIIIll = new String[llllIlIIlII[3]];
        llllIlIIIll[llllIlIIlII[0]] = lIllIlIlIIlIll("XnkrOMKE41w=", "aYGkC");
        llllIlIIIll[llllIlIIlII[1]] = lIllIlIlIIllII("AQwW", "Dmbop");
    }

    private static boolean lIllIlIlIlIIII(int i) {
        return i != 0;
    }

    private static String lIllIlIlIIllII(String llllllllllllllllIIIllIlIIlIIlIII, String llllllllllllllllIIIllIlIIlIIIlll) {
        String llllllllllllllllIIIllIlIIlIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIIllIlIIlIIIlIl = llllllllllllllllIIIllIlIIlIIIlll.toCharArray();
        int llllllllllllllllIIIllIlIIlIIIlII = llllIlIIlII[0];
        char[] charArray = llllllllllllllllIIIllIlIIlIIlIII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIIllIlIIIllllII = llllIlIIlII[0];
        while (lIllIlIlIlIIll(llllllllllllllllIIIllIlIIIllllII, length)) {
            char llllllllllllllllIIIllIlIIlIIlIIl = charArray[llllllllllllllllIIIllIlIIIllllII];
            sb.append((char) (llllllllllllllllIIIllIlIIlIIlIIl ^ llllllllllllllllIIIllIlIIlIIIlIl[llllllllllllllllIIIllIlIIlIIIlII % llllllllllllllllIIIllIlIIlIIIlIl.length]));
            "".length();
            llllllllllllllllIIIllIlIIlIIIlII++;
            llllllllllllllllIIIllIlIIIllllII++;
            "".length();
            if (" ".length() > ((24 ^ 50) ^ (105 ^ 71))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlIlIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIlIlIIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIlIlIIlllI();
        lIllIlIlIIllIl();
    }

    @Inject
    public l(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.O = squireBarrows;
        this.P = squireBarrowsConfig;
    }

    private static boolean lIllIlIlIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static void lIllIlIlIIlllI() {
        llllIlIIlII = new int[4];
        llllIlIIlII[0] = ((79 ^ 80) ^ (241 ^ 166)) & (((((64 + 96) - 153) + 187) ^ (((83 + 89) - 122) + 88)) ^ (-" ".length()));
        llllIlIIlII[1] = " ".length();
        llllIlIIlII[2] = (-((-29379) & 30451)) & (-16449) & 20479;
        llllIlIIlII[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (lIllIlIlIIllll(this.O.h() ? 1 : 0)) {
            return llllIlIIlII[0];
        }
        int[] iArr = new int[llllIlIIlII[1]];
        iArr[llllIlIIlII[0]] = llllIlIIlII[2];
        if (lIllIlIlIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIlIIlII[1]];
            iArr2[llllIlIIlII[0]] = llllIlIIlII[2];
            Inventory.dropAll(iArr2);
            "".length();
        }
        int llllllllllllllllIIIllIlIIllIIIIl = Combat.getCurrentHealth();
        if (lIllIlIlIlIIIl(llllllllllllllllIIIllIlIIllIIIIl, this.P.eatAtHp())) {
            return llllIlIIlII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llllIlIIlII[1]];
            strArr[llllIlIIlII[0]] = llllIlIIIll[llllIlIIlII[1]];
            return item.hasAction(strArr);
        });
        if (lIllIlIlIlIIlI(first)) {
            return llllIlIIlII[0];
        }
        first.interact(llllIlIIIll[llllIlIIlII[0]]);
        return llllIlIIlII[1];
    }

    private static String lIllIlIlIIlIll(String llllllllllllllllIIIllIlIIlIllIII, String llllllllllllllllIIIllIlIIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIIlIllIlI.init(llllIlIIlII[3], llllllllllllllllIIIllIlIIlIllIll);
            return new String(llllllllllllllllIIIllIlIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlIIlIllIIl) {
            llllllllllllllllIIIllIlIIlIllIIl.printStackTrace();
            return null;
        }
    }
}
