package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.basics.combat.Lure.SquireLurer;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.queries.NPCQuery;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
@Singleton
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.M  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/M.class */
public class M {
    @Inject
    private /* synthetic */ LureConfig bU;
    private /* synthetic */ boolean bV;
    @Inject
    private /* synthetic */ Client v;
    private final /* synthetic */ Set<NPC> bT = new HashSet();
    private static /* synthetic */ int[] lIIlIIIII;

    private static boolean lllllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lllllIIllI(int i2) {
        return i2 != 0;
    }

    static {
        lllllIIIII();
    }

    private static void lllllIIIII() {
        lIIlIIIII = new int[2];
        lIIlIIIII[0] = " ".length();
        lIIlIIIII[1] = (76 ^ 8) & ((94 ^ 26) ^ (-1));
    }

    private static boolean lllllIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lllllIIIll(npcSpawned.getNpc().getId(), this.bU.luring().P())) {
            return;
        }
        this.bT.add(npcSpawned.getNpc());
        "".length();
    }

    private static boolean lllllIIlII(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void aH() {
        boolean z;
        if (lllllIIIlI(this.bV ? 1 : 0)) {
            int i2 = lIIlIIIII[0];
            "".length();
            z = i2;
            if ("   ".length() < 0) {
                return;
            }
        } else {
            z = lIIlIIIII[1];
        }
        this.bV = z;
    }

    private static boolean lllllIIIll(int i2, int i3) {
        return i2 != i3;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lllllIIIll(npcDespawned.getNpc().getId(), this.bU.luring().P())) {
            return;
        }
        this.bT.remove(npcDespawned.getNpc());
        "".length();
    }

    private static boolean lllllIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public boolean aI() {
        return this.bV;
    }

    private static boolean lllllIIIlI(int i2) {
        return i2 == 0;
    }

    public N aG() {
        return this.bU.luring();
    }

    public NPC a(boolean z, NPC npc) {
        N luring = this.bU.luring();
        return this.bT.stream().filter(npc2 -> {
            if (lllllIIlll(npc2, npc)) {
                ?? r0 = lIIlIIIII[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIIII[1];
        }).filter(npc3 -> {
            if (lllllIIIlI(npc3.isDead() ? 1 : 0) && lllllIIllI(luring.g(npc3.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIlIIIII[0];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIIII[1];
        }).filter(npc4 -> {
            if (!lllllIIlIl(npc4.getInteracting()) || lllllIIIlI(z ? 1 : 0)) {
                ?? r0 = lIIlIIIII[0];
                "".length();
                return " ".length() < (((243 ^ 181) ^ (200 ^ 179)) & (((((110 + 42) - 141) + 128) ^ (((71 + 156) - 147) + 102)) ^ (-" ".length()))) ? ((((117 + 40) - 120) + 114) ^ (((16 + 75) - (-17)) + 53)) & (((((115 + 46) - 41) + 9) ^ (((91 + 65) - 31) + 58)) ^ (-" ".length())) : r0;
            }
            return lIIlIIIII[1];
        }).filter(npc5 -> {
            if (lllllIIlII(luring.h(npc5.getWorldLocation()), lIIlIIIII[0])) {
                ?? r0 = lIIlIIIII[0];
                "".length();
                return ((92 ^ 120) ^ (41 ^ 9)) == (((89 ^ 76) ^ (98 ^ 60)) & ((" ".length() ^ (68 ^ 14)) ^ (-" ".length()))) ? ((((142 + 87) - 141) + 164) ^ (((19 + 149) - 85) + 104)) & (((((25 + 71) - (-71)) + 62) ^ (((120 + 79) - 146) + 109)) ^ (-" ".length())) : r0;
            }
            return lIIlIIIII[1];
        }).findFirst().orElse(null);
    }

    @Subscribe
    public void a(PluginChanged pluginChanged) {
        if (!lllllIIIIl(pluginChanged.getPlugin().getClass(), SquireLurer.class) || lllllIIIlI(pluginChanged.isLoaded() ? 1 : 0)) {
            return;
        }
        N luring = this.bU.luring();
        Set<NPC> set = this.bT;
        NPCQuery nPCQuery = new NPCQuery();
        int[] iArr = new int[lIIlIIIII[0]];
        iArr[lIIlIIIII[1]] = luring.P();
        set.addAll(nPCQuery.idEquals(iArr).result(this.v));
        "".length();
        System.out.println(this.bT);
    }
}
