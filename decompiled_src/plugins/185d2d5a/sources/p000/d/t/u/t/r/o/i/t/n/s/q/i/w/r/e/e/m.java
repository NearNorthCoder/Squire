package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
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
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Fixing brazier", priority = 2, blocking = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.m  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/m.class */
public class m extends Task {
    private final /* synthetic */ SquireWintertodtConfig T;
    private static /* synthetic */ String[] lIllIIIIIIIII;
    private final /* synthetic */ b S;
    private static /* synthetic */ int[] lIllIIIIIIIIl;

    private static boolean llIIIIlllIllIll(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (!llIIIIlllIlIlIl(message.contains(lIllIIIIIIIII[lIllIIIIIIIIl[3]]) ? 1 : 0) || llIIIIlllIlIlII(message.contains(lIllIIIIIIIII[lIllIIIIIIIIl[2]]) ? 1 : 0)) {
            sleep(lIllIIIIIIIIl[0]);
        }
    }

    private static String llIIIIlllIIllll(String llllllllllllllIllIIllIllllIIllII, String llllllllllllllIllIIllIllllIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllllIIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIIl[6]), "DES");
            Cipher llllllllllllllIllIIllIllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllllIIlllI.init(lIllIIIIIIIIl[2], secretKeySpec);
            return new String(llllllllllllllIllIIllIllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIllllIIllIl) {
            llllllllllllllIllIIllIllllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIllIII(Object obj) {
        return obj != null;
    }

    private static void llIIIIlllIlIIll() {
        lIllIIIIIIIIl = new int[7];
        lIllIIIIIIIIl[0] = ((134 ^ 166) ^ (218 ^ 182)) & (((152 ^ 162) ^ (4 ^ 114)) ^ (-" ".length()));
        lIllIIIIIIIIl[1] = "   ".length();
        lIllIIIIIIIIl[2] = "  ".length();
        lIllIIIIIIIIl[3] = " ".length();
        lIllIIIIIIIIl[4] = (168 ^ 173) ^ " ".length();
        lIllIIIIIIIIl[5] = 11 ^ 14;
        lIllIIIIIIIIl[6] = (66 ^ 17) ^ (5 ^ 94);
    }

    private static boolean llIIIIlllIllIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIlllIlIlll(Object obj) {
        return obj == null;
    }

    static {
        llIIIIlllIlIIll();
        llIIIIlllIlIIlI();
    }

    private static String llIIIIlllIIlllI(String llllllllllllllIllIIllIlllllIIIIl, String llllllllllllllIllIIllIlllllIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllIlllllIIIII.toCharArray();
        int llllllllllllllIllIIllIllllIlllIl = lIllIIIIIIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIIIIIl[0];
        while (llIIIIlllIllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIllIllllIlllIl % charArray.length]));
            "".length();
            llllllllllllllIllIIllIllllIlllIl++;
            i++;
            "".length();
            if (((161 ^ 175) ^ (78 ^ 68)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIlllIlIlII(int i) {
        return i != 0;
    }

    private static boolean llIIIIlllIlIlIl(int i) {
        return i == 0;
    }

    @Inject
    public m(b bVar, SquireWintertodtConfig squireWintertodtConfig) {
        this.S = bVar;
        this.T = squireWintertodtConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (llIIIIlllIlIlII(this.S.i() ? 1 : 0) && llIIIIlllIlIlIl(this.S.u() ? 1 : 0) && !llIIIIlllIlIlII(this.S.j() ? 1 : 0)) {
            a q = this.S.q();
            if (llIIIIlllIlIllI(q.b().distanceTo(Players.getLocal()), lIllIIIIIIIIl[1])) {
                return lIllIIIIIIIIl[0];
            }
            TileObject nearest = TileObjects.getNearest(q.b(), tileObject -> {
                if (llIIIIlllIllIII(tileObject.getName()) && llIIIIlllIlIlII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIllIIIIIIIII[lIllIIIIIIIIl[1]]) ? 1 : 0) && llIIIIlllIllIlI(q.b().distanceTo(tileObject), lIllIIIIIIIIl[1])) {
                    String[] strArr = new String[lIllIIIIIIIIl[3]];
                    strArr[lIllIIIIIIIIl[0]] = lIllIIIIIIIII[lIllIIIIIIIIl[4]];
                    if (llIIIIlllIlIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIllIIIIIIIIl[3];
                        "".length();
                        return "  ".length() == "   ".length() ? ((245 ^ 178) ^ (199 ^ 158)) & (((2 ^ 39) ^ (59 ^ 0)) ^ (-" ".length())) : r0;
                    }
                }
                return lIllIIIIIIIIl[0];
            });
            if (llIIIIlllIlIlll(nearest)) {
                return lIllIIIIIIIIl[0];
            }
            nearest.interact(lIllIIIIIIIII[lIllIIIIIIIIl[0]]);
            sleep(lIllIIIIIIIIl[2]);
            return lIllIIIIIIIIl[3];
        }
        return lIllIIIIIIIIl[0];
    }

    private static boolean llIIIIlllIlIllI(int i, int i2) {
        return i > i2;
    }

    private static void llIIIIlllIlIIlI() {
        lIllIIIIIIIII = new String[lIllIIIIIIIIl[5]];
        lIllIIIIIIIII[lIllIIIIIIIIl[0]] = llIIIIlllIIlllI("Mg8x", "tfIXu");
        lIllIIIIIIIII[lIllIIIIIIIIl[3]] = llIIIIlllIIllll("1mdoKzIQe/kFAvxO0tvUVOfwE9uLZCbP", "CDNef");
        lIllIIIIIIIII[lIllIIIIIIIIl[2]] = llIIIIlllIlIIII("kaGDldusI5BNfR95rOdEbg==", "pZzrZ");
        lIllIIIIIIIII[lIllIIIIIIIIl[1]] = llIIIIlllIlIIII("W/ct45zD08g=", "vOkkU");
        lIllIIIIIIIII[lIllIIIIIIIIl[4]] = llIIIIlllIlIIII("lTUAfBjC7M0=", "wqiwZ");
    }

    private static String llIIIIlllIlIIII(String llllllllllllllIllIIllIlllIllllll, String llllllllllllllIllIIllIlllIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIIIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlllIlllIll) {
            llllllllllllllIllIIllIlllIlllIll.printStackTrace();
            return null;
        }
    }
}
