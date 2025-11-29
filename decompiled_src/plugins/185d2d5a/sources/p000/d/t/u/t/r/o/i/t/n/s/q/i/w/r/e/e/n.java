package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Fletching Logs", priority = 1, blocking = true, register = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.n  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/n.class */
public class n extends Task {
    private static final /* synthetic */ int U;
    private static /* synthetic */ int[] lIlIllllIlIIl;
    private static /* synthetic */ String[] lIlIllllIIlll;
    private final /* synthetic */ SquireWintertodtConfig W;
    private final /* synthetic */ b V;
    private /* synthetic */ int X;

    private static boolean llIIIIlIlllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    public boolean run() {
        if (llIIIIlIlllIlIl(this.V.i() ? 1 : 0) && llIIIIlIlllIllI(this.V.u() ? 1 : 0) && !llIIIIlIlllIlIl(this.V.j() ? 1 : 0)) {
            int[] iArr = new int[lIlIllllIlIIl[1]];
            iArr[lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
            int count = Inventory.getCount(iArr);
            if (!llIIIIlIlllIlIl(this.W.fletch() ? 1 : 0) || llIIIIlIlllIlll(this.V.f(), lIlIllllIlIIl[3] - (count * lIlIllllIlIIl[4]))) {
                return lIlIllllIlIIl[0];
            }
            int[] iArr2 = new int[lIlIllllIlIIl[1]];
            iArr2[lIlIllllIlIIl[0]] = lIlIllllIlIIl[5];
            if (llIIIIlIllllIII(count + Inventory.getCount(iArr2), this.V.g())) {
                return lIlIllllIlIIl[0];
            }
            Player local = Players.getLocal();
            if (llIIIIlIllllIII(this.V.q().b().distanceTo(local), lIlIllllIlIIl[6]) && llIIIIlIlllIllI(local.isMoving() ? 1 : 0)) {
                return lIlIllllIlIIl[0];
            }
            int[] iArr3 = new int[lIlIllllIlIIl[1]];
            iArr3[lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
            Item first = Inventory.getFirst(iArr3);
            int[] iArr4 = new int[lIlIllllIlIIl[1]];
            iArr4[lIlIllllIlIIl[0]] = lIlIllllIlIIl[7];
            Item first2 = Inventory.getFirst(iArr4);
            if (!llIIIIlIllllIIl(first) || llIIIIlIllllIlI(first2)) {
                return lIlIllllIlIIl[0];
            }
            if (llIIIIlIllllIll(Players.getLocal().getAnimation(), lIlIllllIlIIl[8])) {
                int i = this.X;
                this.X = i - lIlIllllIlIIl[1];
                if (llIIIIlIlllllII(i)) {
                    this.X = lIlIllllIlIIl[6];
                    return lIlIllllIlIIl[0];
                }
            }
            first.useOn(first2);
            this.X = lIlIllllIlIIl[6];
            this.V.n();
            return lIlIllllIlIIl[1];
        }
        return lIlIllllIlIIl[0];
    }

    private static boolean llIIIIlIllllIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIllllIll(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (!llIIIIlIlllIllI(message.contains(lIlIllllIIlll[lIlIllllIlIIl[0]]) ? 1 : 0) || llIIIIlIlllIlIl(message.contains(lIlIllllIIlll[lIlIllllIlIIl[1]]) ? 1 : 0)) {
            this.X = lIlIllllIlIIl[0];
        }
    }

    @Inject
    public n(b bVar, SquireWintertodtConfig squireWintertodtConfig) {
        this.V = bVar;
        this.W = squireWintertodtConfig;
    }

    private static boolean llIIIIlIllllIIl(Object obj) {
        return obj != null;
    }

    private static void llIIIIlIlllIlII() {
        lIlIllllIlIIl = new int[10];
        lIlIllllIlIIl[0] = ((36 ^ 104) ^ (8 ^ 123)) & (((169 ^ 176) ^ (72 ^ 110)) ^ (-" ".length()));
        lIlIllllIlIIl[1] = " ".length();
        lIlIllllIlIIl[2] = (-((-23763) & 32219)) & (-2081) & 31231;
        lIlIllllIlIIl[3] = (-((-1415) & 32655)) & (-1027) & 32766;
        lIlIllllIlIIl[4] = ((172 ^ 129) & ((73 ^ 100) ^ (-1))) ^ (7 ^ 13);
        lIlIllllIlIIl[5] = (-1832) & 22527;
        lIlIllllIlIIl[6] = "  ".length();
        lIlIllllIlIIl[7] = (-((-12690) & 32159)) & (-12353) & 32767;
        lIlIllllIlIIl[8] = (-((-1479) & 24543)) & (-8197) & 32508;
        lIlIllllIlIIl[9] = 19 ^ 27;
    }

    private static void llIIIIlIlllIIII() {
        lIlIllllIIlll = new String[lIlIllllIlIIl[6]];
        lIlIllllIIlll[lIlIllllIlIIl[0]] = llIIIIlIllIllII("sJyibpYwifV9Lqqulekh5M9zdvQ4mu0n", "lDTPZ");
        lIlIllllIIlll[lIlIllllIlIIl[1]] = llIIIIlIllIlllI("i4tlsY+NEW0VRAOL4YE+hQ==", "jDCeM");
    }

    private static boolean llIIIIlIlllIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIlIllllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIlIlllIlIl(int i) {
        return i != 0;
    }

    private static String llIIIIlIllIllII(String llllllllllllllIllIIllllIIIlIlIII, String llllllllllllllIllIIllllIIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllllIlIIl[6], llllllllllllllIllIIllllIIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIIIlIlIIl) {
            llllllllllllllIllIIllllIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlllllII(int i) {
        return i >= 0;
    }

    static {
        llIIIIlIlllIlII();
        llIIIIlIlllIIII();
        U = lIlIllllIlIIl[8];
    }

    private static String llIIIIlIllIlllI(String llllllllllllllIllIIllllIIIIllIll, String llllllllllllllIllIIllllIIIIllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIIIllIlI.getBytes(StandardCharsets.UTF_8)), lIlIllllIlIIl[9]), "DES");
            Cipher llllllllllllllIllIIllllIIIIlllIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIIIIlllIl.init(lIlIllllIlIIl[6], llllllllllllllIllIIllllIIIIllllI);
            return new String(llllllllllllllIllIIllllIIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIIIIlllII) {
            llllllllllllllIllIIllllIIIIlllII.printStackTrace();
            return null;
        }
    }
}
