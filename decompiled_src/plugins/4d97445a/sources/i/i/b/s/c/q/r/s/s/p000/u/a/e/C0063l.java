package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping worlds", priority = 2147470310, register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/l.class */
public class C0063l extends Task {
    private /* synthetic */ boolean an = lIIIIll[0];
    private static /* synthetic */ String[] llllll;
    private static /* synthetic */ int[] lIIIIll;

    private static boolean lIIIIlIII(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIlIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIIIlIII(this.an ? 1 : 0)) {
            return lIIIIll[0];
        }
        World currentWorld = Worlds.getCurrentWorld();
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIIIIlIlI(world.isNormal() ? 1 : 0) && lIIIIllII(world.getLocation(), currentWorld.getLocation()) && lIIIIllIl(world.getId(), currentWorld.getId()) && lIIIIlIlI(world.isMembers() ? 1 : 0)) {
                ?? r0 = lIIIIll[1];
                "".length();
                return "   ".length() < 0 ? ((11 ^ 7) ^ (111 ^ 100)) & (((115 ^ 29) ^ (39 ^ 78)) ^ (-" ".length())) & ((((46 ^ 61) ^ (109 ^ 101)) & (((198 ^ 178) ^ (69 ^ 42)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
            }
            return lIIIIll[0];
        }));
        return lIIIIll[1];
    }

    private static boolean lIIIIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        ChatMessageType type = chatMessage.getType();
        if (!(lIIIIlIIl(type, ChatMessageType.GAMEMESSAGE) && lIIIIlIIl(type, ChatMessageType.SPAM)) && lIIIIlIlI(chatMessage.getMessage().contains(llllll[lIIIIll[0]]) ? 1 : 0)) {
            this.an = lIIIIll[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        Log.info("Game state changed to " + gameStateChanged.getGameState());
        if (lIIIIlIll(gameStateChanged.getGameState(), GameState.HOPPING)) {
            this.an = lIIIIll[0];
        }
    }

    private static boolean lIIIIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIIIIIlll();
        lIIIIIllI();
    }

    private static void lIIIIIlll() {
        lIIIIll = new int[3];
        lIIIIll[0] = ((((21 + 62) - (-24)) + 69) ^ (((178 + 63) - 70) + 18)) & (((60 ^ 126) ^ (12 ^ 67)) ^ (-" ".length()));
        lIIIIll[1] = " ".length();
        lIIIIll[2] = "  ".length();
    }

    private static void lIIIIIllI() {
        llllll = new String[lIIIIll[1]];
        llllll[lIIIIll[0]] = llllIIIl("FNSifkZKerHCKiedrqGQf6kDkeUm33z/csfcAE+U87w=", "VwsjF");
    }

    private static String llllIIIl(String llllIIlIIIIllIl, String llllIIlIIIIlIlI) {
        try {
            SecretKeySpec llllIIlIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIlIIIIllll = Cipher.getInstance("Blowfish");
            llllIIlIIIIllll.init(lIIIIll[2], llllIIlIIIlIIII);
            return new String(llllIIlIIIIllll.doFinal(Base64.getDecoder().decode(llllIIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIlIIIIlllI) {
            llllIIlIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIIllII(int i2, int i3) {
        return i2 == i3;
    }
}
