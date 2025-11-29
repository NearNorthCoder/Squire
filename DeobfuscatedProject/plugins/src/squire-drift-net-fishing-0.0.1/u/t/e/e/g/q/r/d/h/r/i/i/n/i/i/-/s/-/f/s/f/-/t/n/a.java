/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

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
public class a {
    private static /* synthetic */ String[] lIlIIIIllIII;
    private static /* synthetic */ int[] lIlIIIIllIIl;
    private /* synthetic */ int j;

    public int i() {
        return this.j;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (a.llIlIlIIIIllIl(string.contains(lIlIIIIllIII[lIlIIIIllIIl[0]]) ? 1 : 0)) {
            this.j += lIlIIIIllIIl[1];
        }
    }

    static {
        a.llIlIlIIIIllII();
        a.llIlIlIIIIlIlI();
    }

    private static void llIlIlIIIIllII() {
        lIlIIIIllIIl = new int[4];
        a.lIlIIIIllIIl[0] = (46 + 0 - -76 + 93 ^ 34 + 8 - 30 + 184) & (97 + 11 - 11 + 38 ^ 23 + 1 - -96 + 28 ^ -" ".length());
        a.lIlIIIIllIIl[1] = " ".length();
        a.lIlIIIIllIIl[2] = 0x8E ^ 0x96 ^ (8 ^ 0x18);
        a.lIlIIIIllIIl[3] = "  ".length();
    }

    private static boolean llIlIlIIIIllIl(int n) {
        return n != 0;
    }

    private static String llIlIlIIIIlIIl(String lllllllllllllllIlllIIllIlllIIlII, String lllllllllllllllIlllIIllIlllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIllIIl[2]), "DES");
            Cipher lllllllllllllllIlllIIllIlllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIllIlllIlIII.init(lIlIIIIllIIl[3], lllllllllllllllIlllIIllIlllIlIIl);
            return new String(lllllllllllllllIlllIIllIlllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllIlllIIlll) {
            lllllllllllllllIlllIIllIlllIIlll.printStackTrace();
            return null;
        }
    }

    public void h() {
        this.j = lIlIIIIllIIl[0];
    }

    private static void llIlIlIIIIlIlI() {
        lIlIIIIllIII = new String[lIlIIIIllIIl[1]];
        a.lIlIIIIllIII[a.lIlIIIIllIIl[0]] = a.llIlIlIIIIlIIl("o00TzR9VKiiA5tLDHnDck6OLMYOJ6wtw", "pKKPH");
    }
}

