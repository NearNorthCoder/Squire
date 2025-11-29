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
public class a_Unknown {
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
        a.lIlIIIIllIIl[0] = (46 + 0 - -76 + 93 ^ 34 + 8 - 30 + 184) & (97 + 11 - 11 + 38 ^ 23 + 1 - -96 + 28 ^ -1);
        a.lIlIIIIllIIl[1] = 1;
        a.lIlIIIIllIIl[2] = 0x8E ^ 0x96 ^ (8 ^ 0x18);
        a.lIlIIIIllIIl[3] = 2;
    }

    private static boolean llIlIlIIIIllIl(int n) {
        return n != 0;
    }

    private static String llIlIlIIIIlIIl(String var4, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIIIllIIl[2]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIIIIllIIl[3], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public void h() {
        this.j = lIlIIIIllIIl[0];
    }

    private static void llIlIlIIIIlIlI() {
        lIlIIIIllIII = new String[lIlIIIIllIIl[1]];
        a.lIlIIIIllIII[a.lIlIIIIllIIl[0]] = a."You caught some fish";
    }
}

