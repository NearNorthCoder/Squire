package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@Singleton
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/b.class */
public class b {
    private static /* synthetic */ String[] lIIlIllIllIlI;
    final /* synthetic */ Client u;
    final /* synthetic */ SquireScurrius t;
    private static /* synthetic */ int[] lIIlIllIllIll;

    private static boolean lIlIllIlIlllIII(int i) {
        return i != 0;
    }

    @Subscribe(priority = -2.1474836E9f)
    public void a(GameTick gameTick) {
    }

    private static String lIlIllIlIllIIll(String llllllllllllllIllllIlIIllIIlIIIl, String llllllllllllllIllllIlIIllIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllIllIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllIllIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIllIIlIIlI) {
            llllllllllllllIllllIlIIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlIllIllI() {
        lIIlIllIllIll = new int[7];
        lIIlIllIllIll[0] = ((((102 + 65) - 15) + 50) ^ (((52 + 193) - 205) + 157)) & (((4 ^ 32) ^ (168 ^ 131)) ^ (-" ".length()));
        lIIlIllIllIll[1] = " ".length();
        lIIlIllIllIll[2] = "  ".length();
        lIIlIllIllIll[3] = (-26629) & 32727;
        lIIlIllIllIll[4] = 179 ^ 182;
        lIIlIllIllIll[5] = "   ".length();
        lIIlIllIllIll[6] = (((5 + 93) - 84) + 128) ^ (((103 + 128) - 220) + 123);
    }

    private static boolean lIlIllIlIlllIIl(Object obj) {
        return obj == null;
    }

    static {
        lIlIllIlIllIllI();
        lIlIllIlIllIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe(priority = 2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (lIlIllIlIlllIII(message.contains(lIIlIllIllIlI[lIIlIllIllIll[0]]) ? 1 : 0)) {
            o();
            System.out.println(lIIlIllIllIlI[lIIlIllIllIll[1]]);
            this.t.e();
        }
        if (lIlIllIlIlllIII(message.contains(lIIlIllIllIlI[lIIlIllIllIll[2]]) ? 1 : 0)) {
            this.t.d((boolean) lIIlIllIllIll[1]);
            o();
        }
    }

    private static String lIlIllIlIllIlII(String llllllllllllllIllllIlIIllIIIIlII, String llllllllllllllIllllIlIIllIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIllIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIllIIIIllI.init(lIIlIllIllIll[2], secretKeySpec);
            return new String(llllllllllllllIllllIlIIllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIllIIIIlIl) {
            llllllllllllllIllllIlIIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private WorldPoint b() {
        int[] iArr = new int[lIIlIllIllIll[1]];
        iArr[lIIlIllIllIll[0]] = d.A;
        TileObject nearest = TileObjects.getNearest(iArr);
        return lIlIllIlIlllIIl(nearest) ? new WorldPoint(lIIlIllIllIll[0], lIIlIllIllIll[0], lIIlIllIllIll[0]) : nearest.getWorldLocation().dx(lIIlIllIllIll[2]).dy(lIIlIllIllIll[4]);
    }

    private static boolean lIlIllIlIllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void o() {
        this.t.d();
    }

    public int p() {
        return Vars.getBit(lIIlIllIllIll[3]);
    }

    private static void lIlIllIlIllIlIl() {
        lIIlIllIllIlI = new String[lIIlIllIllIll[5]];
        lIIlIllIllIlI[lIIlIllIllIll[0]] = lIlIllIlIllIIll("LK4JI8SPv6+mdtYD6bxTHKoxRcgMHVTXEaglEYKe2vs=", "bUubz");
        lIIlIllIllIlI[lIIlIllIllIll[1]] = lIlIllIlIllIlII("VrtoBq2mFOJZIKRRJLsYfA==", "AvcCH");
        lIIlIllIllIlI[lIIlIllIllIll[2]] = lIlIllIlIllIIll("Qir6FRPt2//G/WTKJVwsanjV79YDOd8t", "fETyF");
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        npcSpawned.getNpc();
    }

    @Inject
    public b(SquireScurrius squireScurrius, Client client) {
        this.t = squireScurrius;
        this.u = client;
    }
}
