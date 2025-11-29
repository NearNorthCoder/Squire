/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.PlayerSpawned
 *  net.runelite.client.Notifier
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Notifying for player -> NotifyingforplayerTask */
@TaskDesc(name="Notifying for player", register=true)
public class aE
extends Task {
    private final /* synthetic */ RelogConfig eb;
    private static /* synthetic */ int[] lllIlIIIl;
    private static /* synthetic */ String[] lllIlIIII;
    private final /* synthetic */ Notifier ea;
    private final /* synthetic */ Set<String> dZ;

    private static boolean llIIlIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(PlayerSpawned playerSpawned) {
        void var2_2;
        void lIlIlIlIlIIllII;
        aE lIlIlIlIlIIllIl;
        if (aE.llIIIllllll(playerSpawned.getPlayer(), Players.getLocal())) {
            return;
        }
        if (aE.llIIlIIIIII(lIlIlIlIlIIllIl.eb.notifyPlayer() ? 1 : 0)) {
            return;
        }
        String lIlIlIlIlIIlIll = lIlIlIlIlIIllII.getPlayer().getName();
        if (aE.llIIlIIIIIl(lIlIlIlIlIIllIl.dZ.contains(lIlIlIlIlIIlIll) ? 1 : 0)) {
            return;
        }
        this.dZ.add((String)var2_2);
        0;
        this.ea.notify(lllIlIIII[lllIlIIIl[0]]);
    }

    private static void llIIIllllII() {
        lllIlIIII = new String[lllIlIIIl[1]];
        aE.lllIlIIII[aE.lllIlIIIl[0]] = aE."Player spawned near us!";
    }

    private static boolean llIIIllllll(Object object, Object object2) {
        return object == object2;
    }

    static {
        aE.llIIIllllIl();
        aE.llIIIllllII();
    }

    private static void llIIIllllIl() {
        lllIlIIIl = new int[2];
        aE.lllIlIIIl[0] = (4 ^ 0x54) & ~(0xD6 ^ 0x86);
        aE.lllIlIIIl[1] = 1;
    }

    private static boolean llIIlIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        return lllIlIIIl[0];
    }

    private static boolean llIIlIIIIII(int n2) {
        return n2 == 0;
    }

    private static String llIIIlllIll(String lIlIlIlIlIIIIII, String lIlIlIlIIllllll) {
        lIlIlIlIlIIIIII = new String(Base64.getDecoder().decode(lIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIIlllllI = new StringBuilder();
        char[] lIlIlIlIIllllIl = lIlIlIlIIllllll.toCharArray();
        int lIlIlIlIIllllII = lllIlIIIl[0];
        char[] lIlIlIlIIllIllI = lIlIlIlIlIIIIII.toCharArray();
        int lIlIlIlIIllIlIl = lIlIlIlIIllIllI.length;
        int lIlIlIlIIllIlII = lllIlIIIl[0];
        while (aE.llIIlIIIIlI(lIlIlIlIIllIlII, lIlIlIlIIllIlIl)) {
            char lIlIlIlIlIIIIIl = lIlIlIlIIllIllI[lIlIlIlIIllIlII];
            lIlIlIlIIlllllI.append((char)(lIlIlIlIlIIIIIl ^ lIlIlIlIIllllIl[lIlIlIlIIllllII % lIlIlIlIIllllIl.length]));
            0;
            ++lIlIlIlIIllllII;
            ++lIlIlIlIIllIlII;
            0;
            
            return null;
        }
        return String.valueOf(lIlIlIlIIlllllI);
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (aE.llIIIlllllI(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.dZ.clear();
        }
    }

    @Inject
    public aE(Notifier notifier, RelogConfig relogConfig) {
        this.dZ = new HashSet<String>();
        this.ea = notifier;
        this.eb = relogConfig;
    }

    private static boolean llIIIlllllI(Object object, Object object2) {
        return object != object2;
    }
}

