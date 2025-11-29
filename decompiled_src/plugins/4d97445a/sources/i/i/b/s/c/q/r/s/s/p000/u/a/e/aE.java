package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.client.Notifier;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Notifying for player", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aE  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aE.class */
public class aE extends Task {
    private final /* synthetic */ RelogConfig eb;
    private static /* synthetic */ int[] lllIlIIIl;
    private static /* synthetic */ String[] lllIlIIII;
    private final /* synthetic */ Notifier ea;
    private final /* synthetic */ Set<String> dZ = new HashSet();

    private static boolean llIIlIIIIIl(int i2) {
        return i2 != 0;
    }

    @Subscribe
    public void a(PlayerSpawned playerSpawned) {
        if (llIIIllllll(playerSpawned.getPlayer(), Players.getLocal()) || llIIlIIIIII(this.eb.notifyPlayer() ? 1 : 0)) {
            return;
        }
        String lIlIlIlIlIIlIll = playerSpawned.getPlayer().getName();
        if (llIIlIIIIIl(this.dZ.contains(lIlIlIlIlIIlIll) ? 1 : 0)) {
            return;
        }
        this.dZ.add(lIlIlIlIlIIlIll);
        "".length();
        this.ea.notify(lllIlIIII[lllIlIIIl[0]]);
    }

    private static void llIIIllllII() {
        lllIlIIII = new String[lllIlIIIl[1]];
        lllIlIIII[lllIlIIIl[0]] = llIIIlllIll("GRo7NxU7Vik+ET4YPypQJxM7PFA8BXs=", "IvZNp");
    }

    private static boolean llIIIllllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llIIIllllIl();
        llIIIllllII();
    }

    private static void llIIIllllIl() {
        lllIlIIIl = new int[2];
        lllIlIIIl[0] = (4 ^ 84) & ((214 ^ 134) ^ (-1));
        lllIlIIIl[1] = " ".length();
    }

    private static boolean llIIlIIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lllIlIIIl[0];
    }

    private static boolean llIIlIIIIII(int i2) {
        return i2 == 0;
    }

    private static String llIIIlllIll(String lIlIlIlIlIIIIII, String lIlIlIlIIllllll) {
        String str = new String(Base64.getDecoder().decode(lIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIlIlIIllllIl = lIlIlIlIIllllll.toCharArray();
        int lIlIlIlIIllllII = lllIlIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lllIlIIIl[0];
        while (llIIlIIIIlI(i2, length)) {
            char lIlIlIlIlIIIIIl = charArray[i2];
            sb.append((char) (lIlIlIlIlIIIIIl ^ lIlIlIlIIllllIl[lIlIlIlIIllllII % lIlIlIlIIllllIl.length]));
            "".length();
            lIlIlIlIIllllII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (llIIIlllllI(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.dZ.clear();
        }
    }

    @Inject
    public aE(Notifier notifier, RelogConfig relogConfig) {
        this.ea = notifier;
        this.eb = relogConfig;
    }

    private static boolean llIIIlllllI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
