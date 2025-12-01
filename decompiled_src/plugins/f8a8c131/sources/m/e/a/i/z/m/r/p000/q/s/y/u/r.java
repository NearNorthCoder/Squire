package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 8)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.r  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/r.class */
public class r extends Task {
    private final /* synthetic */ SquireZammyConfig aa;
    private static /* synthetic */ String[] lIllIIIllIlII;
    private final /* synthetic */ u Z;
    private final /* synthetic */ C0002c X;
    private final /* synthetic */ f Y;
    private static /* synthetic */ int[] lIllIIIllIlll;
    private final /* synthetic */ l W;

    private static boolean llIIIlIlIlIIIII(int i) {
        return i != 0;
    }

    static {
        llIIIlIlIIlllll();
        llIIIlIlIIllIll();
    }

    private static boolean llIIIlIlIlIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIlIlIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlIlIlIIlII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public r(l lVar, C0002c c0002c, f fVar, u uVar, SquireZammyConfig squireZammyConfig) {
        this.W = lVar;
        this.X = c0002c;
        this.Y = fVar;
        this.Z = uVar;
        this.aa = squireZammyConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean N() {
        return lIllIIIllIlll[0];
    }

    private static boolean llIIIlIlIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static void llIIIlIlIIllIll() {
        lIllIIIllIlII = new String[lIllIIIllIlll[5]];
        lIllIIIllIlII[lIllIIIllIlll[0]] = llIIIlIlIIlIlll("GCMmGxI=", "HFGxz");
        lIllIIIllIlII[lIllIIIllIlll[2]] = llIIIlIlIIlIlll("HAAH", "YasLK");
        lIllIIIllIlII[lIllIIIllIlll[3]] = llIIIlIlIIllIIl("RtCOfQev1A4=", "tAWlH");
        lIllIIIllIlII[lIllIIIllIlll[4]] = llIIIlIlIIlIlll("LzQu", "jUZKP");
    }

    private static void llIIIlIlIIlllll() {
        lIllIIIllIlll = new int[6];
        lIllIIIllIlll[0] = (202 ^ 192) & ((134 ^ 140) ^ (-1));
        lIllIIIllIlll[1] = (((16 + 65) - (-76)) + 0) ^ (((75 + 99) - 52) + 10);
        lIllIIIllIlll[2] = " ".length();
        lIllIIIllIlll[3] = "  ".length();
        lIllIIIllIlll[4] = "   ".length();
        lIllIIIllIlll[5] = (((64 + 92) - 72) + 115) ^ (((5 + 167) - 143) + 166);
    }

    private static boolean llIIIlIlIlIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIlIlIlIIIll(int i, int i2) {
        return i <= i2;
    }

    private static String llIIIlIlIIlIlll(String llllllllllllllIllIIlIllIIllllIll, String llllllllllllllIllIIlIllIIllllIlI) {
        String llllllllllllllIllIIlIllIIllllIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIllIIllllIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIllIIllllIlI.toCharArray();
        int llllllllllllllIllIIlIllIIlllIlll = lIllIIIllIlll[0];
        char[] charArray2 = llllllllllllllIllIIlIllIIllllIll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIllIlll[0];
        while (llIIIlIlIlIIllI(i, length)) {
            llllllllllllllIllIIlIllIIllllIIl.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIlIllIIlllIlll % charArray.length]));
            "".length();
            llllllllllllllIllIIlIllIIlllIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIllIIllllIIl);
    }

    private static String llIIIlIlIIllIIl(String llllllllllllllIllIIlIllIlIIIlIll, String llllllllllllllIllIIlIllIlIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIllIlll[3], llllllllllllllIllIIlIllIlIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIlIIIllII) {
            llllllllllllllIllIIlIllIlIIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIlIIIII(this.W.B() ? 1 : 0) || llIIIlIlIlIIIIl(this.W.G() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (llIIIlIlIlIIIII(this.W.A() ? 1 : 0) && llIIIlIlIlIIIlI(this.X.e())) {
            return lIllIIIllIlll[0];
        }
        if (!llIIIlIlIlIIIll(Combat.getCurrentHealth(), this.aa.eatFoodAt()) || llIIIlIlIlIIIIl(this.Y.t() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (llIIIlIlIlIIIII(this.Z.O() ? 1 : 0) && llIIIlIlIlIIIII(this.W.A() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (llIIIlIlIlIIIII(this.W.D() ? 1 : 0) && llIIIlIlIlIIIIl(this.W.A() ? 1 : 0) && llIIIlIlIlIIlII(Combat.getCurrentHealth(), lIllIIIllIlll[1])) {
            return lIllIIIllIlll[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (llIIIlIlIlIIIIl(item.getName().equals(lIllIIIllIlII[lIllIIIllIlll[3]]) ? 1 : 0)) {
                String str = lIllIIIllIlII[lIllIIIllIlll[4]];
                if (llIIIlIlIlIIIII(item.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = lIllIIIllIlll[2];
                    "".length();
                    return 0 != 0 ? ((2 ^ 38) ^ (250 ^ 151)) & (((111 ^ 12) ^ (171 ^ 129)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIIIllIlll[0];
        });
        if (llIIIlIlIlIIlIl(first)) {
            String[] strArr = new String[lIllIIIllIlll[2]];
            strArr[lIllIIIllIlll[0]] = lIllIIIllIlII[lIllIIIllIlll[0]];
            first = Inventory.getFirst(strArr);
        }
        if (llIIIlIlIlIIlIl(first)) {
            return N();
        }
        first.interact(lIllIIIllIlII[lIllIIIllIlll[2]]);
        this.Y.s();
        return lIllIIIllIlll[2];
    }
}
