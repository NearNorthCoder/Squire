package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping Worlds", priority = 100, blocking = true, register = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.A  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/A.class */
public class A extends Task {
    private static /* synthetic */ int[] lllllIIIlIIl;
    private static /* synthetic */ String[] lllllIIIlIII;
    private final /* synthetic */ SquireMinerConfig P;
    private /* synthetic */ int Q = lllllIIIlIIl[0];
    private /* synthetic */ int R = lllllIIIlIIl[1];

    private static void lIIlIIlIIlIllII() {
        lllllIIIlIII = new String[lllllIIIlIIl[4]];
        lllllIIIlIII[lllllIIIlIIl[0]] = lIIlIIlIIlIlIll("ODUMAmQEKARHLRh6EwIlDyNBEytLOARHJwQ2DQInHz8FRyIZNQxHMAM/QRQlCDFP", "kZagD");
    }

    private static boolean lIIlIIlIIllIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIlIIllIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlIIllIIll(int i, int i2) {
        return i != i2;
    }

    private static void lIIlIIlIIlIllIl() {
        lllllIIIlIIl = new int[5];
        lllllIIIlIIl[0] = ((24 ^ 35) ^ (188 ^ 175)) & (((12 ^ 43) ^ (130 ^ 141)) ^ (-" ".length()));
        lllllIIIlIIl[1] = (59 ^ 72) ^ (195 ^ 181);
        lllllIIIlIIl[2] = 1 ^ 5;
        lllllIIIlIIl[3] = 78 ^ 73;
        lllllIIIlIIl[4] = " ".length();
    }

    private static boolean lIIlIIlIIlIlllI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlIIllIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIlIIlIllll(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIIlIIllIIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) || lIIlIIlIIlIlllI(chatMessage.getMessage().contains(lllllIIIlIII[lllllIIIlIIl[0]]) ? 1 : 0)) {
            return;
        }
        this.Q += lllllIIIlIIl[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlIIlIlllI(this.P.hop() ? 1 : 0) && !lIIlIIlIIlIllll(this.Q, this.R)) {
            int currentId = Worlds.getCurrentId();
            World random = Worlds.getRandom(world -> {
                if (lIIlIIlIIllIIlI(world.isNormal() ? 1 : 0) && lIIlIIlIIllIIlI(world.isMembers() ? 1 : 0) && lIIlIIlIIllIIll(currentId, world.getId())) {
                    ?? r0 = lllllIIIlIIl[4];
                    "".length();
                    return "   ".length() <= 0 ? ((89 ^ 121) ^ (176 ^ 163)) & (((87 ^ 110) ^ (106 ^ 96)) ^ (-" ".length())) : r0;
                }
                return lllllIIIlIIl[0];
            });
            if (lIIlIIlIIllIIII(random)) {
                return lllllIIIlIIl[0];
            }
            Worlds.hopTo(random);
            this.Q = lllllIIIlIIl[0];
            this.R = Rand.nextInt(lllllIIIlIIl[2], lllllIIIlIIl[3]);
            return lllllIIIlIIl[4];
        }
        return lllllIIIlIIl[0];
    }

    @Inject
    public A(SquireMinerConfig squireMinerConfig) {
        this.P = squireMinerConfig;
    }

    private static String lIIlIIlIIlIlIll(String lllllllllllllllIIlIIllIlIIlIIlIl, String lllllllllllllllIIlIIllIlIIlIIlII) {
        String lllllllllllllllIIlIIllIlIIlIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIlIIlIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllIlIIlIIlII.toCharArray();
        int lllllllllllllllIIlIIllIlIIlIIIIl = lllllIIIlIIl[0];
        char[] charArray2 = lllllllllllllllIIlIIllIlIIlIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllllIIIlIIl[0];
        while (lIIlIIlIIlIllll(i, length)) {
            lllllllllllllllIIlIIllIlIIlIIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIllIlIIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllIlIIlIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIllIlIIlIIIll);
    }

    static {
        lIIlIIlIIlIllIl();
        lIIlIIlIIlIllII();
    }
}
