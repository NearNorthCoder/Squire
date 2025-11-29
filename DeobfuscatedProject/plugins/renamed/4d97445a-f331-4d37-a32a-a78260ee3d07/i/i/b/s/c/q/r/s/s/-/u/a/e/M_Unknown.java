/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.queries.NPCQuery
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.PluginChanged
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.basics.combat.Lure.SquireLurer;
import i.i.b.s.c.q.r.s.s.-.u.a.e.NEnum;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.queries.NPCQuery;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;

@Singleton
public class M_Unknown {
    @Inject
    private /* synthetic */ LureConfig bU;
    private /* synthetic */ boolean bV;
    @Inject
    private /* synthetic */ Client v;
    private final /* synthetic */ Set<NPC> bT;
    private static /* synthetic */ int[] lIIlIIIII;

    public M() {
        this.bT = new HashSet<NPC>();
    }

    private static boolean lllllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lllllIIllI(int n2) {
        return n2 != 0;
    }

    static {
        M.lllllIIIII();
    }

    private static void lllllIIIII() {
        lIIlIIIII = new int[2];
        M.lIIlIIIII[0] = 1;
        M.lIIlIIIII[1] = (0x4C ^ 8) & ~(0x5E ^ 0x1A);
    }

    private static boolean lllllIIlll(Object object, Object object2) {
        return object != object2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        N n2 = this.bU.luring();
        if (M.lllllIIIll(npcSpawned.getNpc().getId(), n2.P())) {
            return;
        }
        this.bT.add(npcSpawned.getNpc());
        0;
    }

    private static boolean lllllIIlII(int n2, int n3) {
        return n2 > n3;
    }

    public void aH() {
        int n2;
        if (M.lllllIIIlI(this.bV ? 1 : 0)) {
            n2 = lIIlIIIII[0];
            0;
            if (3 < 0) {
                return;
            }
        } else {
            n2 = lIIlIIIII[1];
        }
        this.bV = n2;
    }

    private static boolean lllllIIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        N n2 = this.bU.luring();
        if (M.lllllIIIll(npcDespawned.getNpc().getId(), n2.P())) {
            return;
        }
        this.bT.remove(npcDespawned.getNpc());
        0;
    }

    private static boolean lllllIIIIl(Object object, Object object2) {
        return object == object2;
    }

    public boolean aI() {
        return this.bV;
    }

    private static boolean lllllIIIlI(int n2) {
        return n2 == 0;
    }

    public N aG() {
        return this.bU.luring();
    }

    public NPC a(boolean bl2, NPC nPC3) {
        N n2 = this.bU.luring();
        Optional<NPC> optional = this.bT.stream().filter(nPC2 -> {
            boolean bl2;
            if (M.lllllIIlll(nPC2, nPC3)) {
                bl2 = lIIlIIIII[0];
                0;
                
                }
            } else {
                bl2 = lIIlIIIII[1];
            }
            return bl2;
        }).filter(nPC -> {
            int n3;
            if (M.lllllIIIlI(nPC.isDead() ? 1 : 0) && M.lllllIIllI(n2.g(nPC.getWorldLocation()) ? 1 : 0)) {
                n3 = lIIlIIIII[0];
                0;
                if ((2 ^ 6) == 0) {
                    return false;
                }
            } else {
                n3 = lIIlIIIII[1];
            }
            return n3 != 0;
        }).filter(nPC -> {
            boolean bl3;
            if (!M.lllllIIlIl(nPC.getInteracting()) || M.lllllIIIlI(bl2 ? 1 : 0)) {
                bl3 = lIIlIIIII[0];
                0;
                if (1 < ((0xF3 ^ 0xB5 ^ (0xC8 ^ 0xB3)) & (110 + 42 - 141 + 128 ^ 71 + 156 - 147 + 102 ^ -1))) {
                    return false;
                }
            } else {
                bl3 = lIIlIIIII[1];
            }
            return bl3;
        }).filter(nPC -> {
            boolean bl2;
            if (M.lllllIIlII(n2.h(nPC.getWorldLocation()), lIIlIIIII[0])) {
                bl2 = lIIlIIIII[0];
                0;
                if ((0x5C ^ 0x78 ^ (0x29 ^ 9)) == ((0x59 ^ 0x4C ^ (0x62 ^ 0x3C)) & (1 ^ (0x44 ^ 0xE) ^ -1))) {
                    return false;
                }
            } else {
                bl2 = lIIlIIIII[1];
            }
            return bl2;
        }).findFirst();
        return optional.orElse(null);
    }

    @Subscribe
    public void a(PluginChanged pluginChanged) {
        if (!M.lllllIIIIl(pluginChanged.getPlugin().getClass(), SquireLurer.class) || M.lllllIIIlI(pluginChanged.isLoaded() ? 1 : 0)) {
            return;
        }
        N n2 = this.bU.luring();
        int[] nArray = new int[lIIlIIIII[0]];
        nArray[M.lIIlIIIII[1]] = n2.P();
        this.bT.addAll((Collection<NPC>)new NPCQuery().idEquals(nArray).result(this.v));
        0;
        System.out.println(this.bT);
    }
}

