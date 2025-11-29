package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.a  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/a.class */
public class a {
    private static /* synthetic */ String[] lIlIIIIllIII;
    private static /* synthetic */ int[] lIlIIIIllIIl;
    private /* synthetic */ int j;

    public int i() {
        return this.j;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIlIlIIIIllIl(chatMessage.getMessage().contains(lIlIIIIllIII[lIlIIIIllIIl[0]]) ? 1 : 0)) {
            this.j += lIlIIIIllIIl[1];
        }
    }

    static {
        llIlIlIIIIllII();
        llIlIlIIIIlIlI();
    }

    private static void llIlIlIIIIllII() {
        lIlIIIIllIIl = new int[4];
        lIlIIIIllIIl[0] = ((((46 + 0) - (-76)) + 93) ^ (((34 + 8) - 30) + 184)) & (((((97 + 11) - 11) + 38) ^ (((23 + 1) - (-96)) + 28)) ^ (-" ".length()));
        lIlIIIIllIIl[1] = " ".length();
        lIlIIIIllIIl[2] = (142 ^ 150) ^ (8 ^ 24);
        lIlIIIIllIIl[3] = "  ".length();
    }

    private static boolean llIlIlIIIIllIl(int i) {
        return i != 0;
    }

    private static String llIlIlIIIIlIIl(String lllllllllllllllIlllIIllIlllIIllI, String lllllllllllllllIlllIIllIlllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIllIIl[2]), "DES");
            Cipher lllllllllllllllIlllIIllIlllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIllIlllIlIII.init(lIlIIIIllIIl[3], lllllllllllllllIlllIIllIlllIlIIl);
            return new String(lllllllllllllllIlllIIllIlllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllIlllIIlll) {
            lllllllllllllllIlllIIllIlllIIlll.printStackTrace();
            return null;
        }
    }

    public void h() {
        this.j = lIlIIIIllIIl[0];
    }

    private static void llIlIlIIIIlIlI() {
        lIlIIIIllIII = new String[lIlIIIIllIIl[1]];
        lIlIIIIllIII[lIlIIIIllIIl[0]] = llIlIlIIIIlIIl("o00TzR9VKiiA5tLDHnDck6OLMYOJ6wtw", "pKKPH");
    }
}
