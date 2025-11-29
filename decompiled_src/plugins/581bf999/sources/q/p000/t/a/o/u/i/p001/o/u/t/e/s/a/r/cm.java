package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Logging out and stopping", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cm  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cm.class */
public class cm extends ck {
    private static /* synthetic */ int[] lIlllIlllII;
    private /* synthetic */ boolean ia;
    private static /* synthetic */ String[] lIlllIllIll;

    private static boolean lIIllIIlllllll(int i) {
        return i == 0;
    }

    @Inject
    protected cm(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        if (lIIllIIlllllll(this.ia ? 1 : 0)) {
            return lIlllIlllII[0];
        }
        Squire.stop();
        this.aY.forceStop();
        return lIlllIlllII[1];
    }

    private static void lIIllIIllllllI() {
        lIlllIlllII = new int[3];
        lIlllIlllII[0] = ((215 ^ 180) ^ "   ".length()) & (((((76 + 13) - (-59)) + 61) ^ (((46 + 15) - 0) + 116)) ^ (-" ".length()));
        lIlllIlllII[1] = " ".length();
        lIlllIlllII[2] = "  ".length();
    }

    private static String lIIllIIlllIIll(String llllllllllllllllIlIIlIllllllIlIl, String llllllllllllllllIlIIlIllllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlllllllIII) {
            llllllllllllllllIlIIlIlllllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIIIIII(int i) {
        return i != 0;
    }

    static {
        lIIllIIllllllI();
        lIIllIIlllllIl();
    }

    private static void lIIllIIlllllIl() {
        lIlllIllIll = new String[lIlllIlllII[1]];
        lIlllIllIll[lIlllIlllII[0]] = lIIllIIlllIIll("ZhA1urzx1eWi6Atf5BEZbg==", "caTnW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIllIlIIIIIII(chatMessage.getMessage().contains(lIlllIllIll[lIlllIlllII[0]]) ? 1 : 0)) {
            this.ia = lIlllIlllII[1];
        }
    }
}
