package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Burning at brazier", register = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.g  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/g.class */
public class g extends Task {
    private static final /* synthetic */ int H;
    private static /* synthetic */ int[] lIlIllllIIlIl;
    private static final /* synthetic */ int G;
    private final /* synthetic */ b I;
    private static /* synthetic */ String[] lIlIllllIIlII;
    private final /* synthetic */ SquireWintertodtConfig J;
    private /* synthetic */ int K = lIlIllllIIlIl[0];

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (!llIIIIlIllIIlIl(message.contains(lIlIllllIIlII[lIlIllllIIlIl[6]]) ? 1 : 0) || llIIIIlIllIIIll(message.contains(lIlIllllIIlII[lIlIllllIIlIl[5]]) ? 1 : 0)) {
            this.K = lIlIllllIIlIl[0];
        }
    }

    private static String llIIIIlIlIllllI(String llllllllllllllIllIIllllIlIllIIII, String llllllllllllllIllIIllllIlIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIlIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIllllIIlIl[10]), "DES");
            Cipher llllllllllllllIllIIllllIlIllIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIlIllIIlI.init(lIlIllllIIlIl[6], secretKeySpec);
            return new String(llllllllllllllIllIIllllIlIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIlIllIIIl) {
            llllllllllllllIllIIllllIlIllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public g(SquireWintertodtConfig squireWintertodtConfig, b bVar) {
        this.J = squireWintertodtConfig;
        this.I = bVar;
    }

    private static boolean llIIIIlIllIIlIl(int i) {
        return i == 0;
    }

    private static void llIIIIlIllIIIlI() {
        lIlIllllIIlIl = new int[11];
        lIlIllllIIlIl[0] = ((((99 + 11) - (-9)) + 23) ^ (((71 + 69) - 73) + 85)) & ((((105 ^ 50) & ((196 ^ 159) ^ (-1))) ^ (20 ^ 2)) ^ (-" ".length()));
        lIlIllllIIlIl[1] = " ".length();
        lIlIllllIIlIl[2] = (-((-24635) & 31039)) & (-531) & 8182;
        lIlIllllIIlIl[3] = (-10281) & 30975;
        lIlIllllIIlIl[4] = (-((-545) & 32443)) & (-38) & 32767;
        lIlIllllIIlIl[5] = "   ".length();
        lIlIllllIIlIl[6] = "  ".length();
        lIlIllllIIlIl[7] = 194 ^ 198;
        lIlIllllIIlIl[8] = 124 ^ 121;
        lIlIllllIIlIl[9] = (77 ^ 87) ^ (56 ^ 36);
        lIlIllllIIlIl[10] = (11 ^ 2) ^ " ".length();
    }

    private static void llIIIIlIllIIIII() {
        lIlIllllIIlII = new String[lIlIllllIIlIl[9]];
        lIlIllllIIlII[lIlIllllIIlIl[0]] = llIIIIlIlIllllI("jdpeA1s1+pE=", "JqmnU");
        lIlIllllIIlII[lIlIllllIIlIl[1]] = llIIIIlIlIlllll("IAmkHLcd8J0=", "tDrhp");
        lIlIllllIIlII[lIlIllllIIlIl[6]] = llIIIIlIlIlllll("LqqZOGFcfWFvvZc7PPf8T+4Y6Bbpolo4", "Cwqgk");
        lIlIllllIIlII[lIlIllllIIlIl[5]] = llIIIIlIlIllllI("bkJRCeQ0c8O5qpQerebfzw==", "fdMiw");
        lIlIllllIIlII[lIlIllllIIlIl[7]] = llIIIIlIlIllllI("KlBpfkW050U=", "ouLau");
        lIlIllllIIlII[lIlIllllIIlIl[8]] = llIIIIlIlIlllll("Pc5qBgg4qUM=", "wvZFu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    public boolean run() {
        if (llIIIIlIllIIIll(this.I.i() ? 1 : 0) && llIIIIlIllIIlIl(this.I.u() ? 1 : 0) && !llIIIIlIllIIIll(this.I.j() ? 1 : 0)) {
            Player local = Players.getLocal();
            a q = this.I.q();
            GameObject nearest = TileObjects.getNearest(q.b(), tileObject -> {
                if (llIIIIlIllIIllI(tileObject.getName()) && llIIIIlIllIIIll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIIlII[lIlIllllIIlIl[7]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIllllIIlIl[1]];
                    strArr[lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[8]];
                    if (llIIIIlIllIIIll(tileObject.hasAction(strArr) ? 1 : 0) && llIIIIlIllIlIIl(q.b().distanceTo(tileObject), lIlIllllIIlIl[5])) {
                        ?? r0 = lIlIllllIIlIl[1];
                        "".length();
                        return (87 ^ 83) < (81 ^ 85) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIllllIIlIl[0];
            });
            if (!llIIIIlIllIIllI(nearest) || llIIIIlIllIIIll(local.isMoving() ? 1 : 0)) {
                return lIlIllllIIlIl[0];
            }
            GameObject gameObject = nearest;
            if (llIIIIlIllIIlIl(gameObject.getWorldArea().isInMeleeDistance(local.getWorldLocation()) ? 1 : 0)) {
                Movement.walk(q.b());
                return lIlIllllIIlIl[1];
            }
            if (llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[2])) {
                int[] iArr = new int[lIlIllllIIlIl[1]];
                iArr[lIlIllllIIlIl[0]] = lIlIllllIIlIl[3];
                if (llIIIIlIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    return lIlIllllIIlIl[0];
                }
            }
            String[] strArr = new String[lIlIllllIIlIl[1]];
            strArr[lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[0]];
            if (!llIIIIlIllIIIll(gameObject.hasAction(strArr) ? 1 : 0) || llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[4])) {
                this.K = lIlIllllIIlIl[5];
                return lIlIllllIIlIl[0];
            } else if (llIIIIlIllIlIII(this.K)) {
                this.K -= lIlIllllIIlIl[1];
                return lIlIllllIIlIl[1];
            } else {
                gameObject.interact(lIlIllllIIlII[lIlIllllIIlIl[1]]);
                return lIlIllllIIlIl[1];
            }
        }
        return lIlIllllIIlIl[0];
    }

    private static String llIIIIlIlIlllll(String llllllllllllllIllIIllllIlIlIIIll, String llllllllllllllIllIIllllIlIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIlIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIlIlIIlIl.init(lIlIllllIIlIl[6], llllllllllllllIllIIllllIlIlIIllI);
            return new String(llllllllllllllIllIIllllIlIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIlIlIIlII) {
            llllllllllllllIllIIllllIlIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIllIIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIlIllIlIII(int i) {
        return i > 0;
    }

    static {
        llIIIIlIllIIIlI();
        llIIIIlIllIIIII();
        G = lIlIllllIIlIl[4];
        H = lIlIllllIIlIl[2];
    }

    private static boolean llIIIIlIllIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIlIllIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIlIllIIIll(int i) {
        return i != 0;
    }
}
