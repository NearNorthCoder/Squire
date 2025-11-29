/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class f_Unknown {
    private static /* synthetic */ int[] lIlIIIIIIllII;
    private final /* synthetic */ List<NPC> w;
    public static final /* synthetic */ int v;

    private static void lIllIlIlllllIIl() {
        lIlIIIIIIllII = new int[1];
        f.lIlIIIIIIllII[0] = -(0xFFFFD11B & 0x6FFD) & (0xFFFFEFFF & 0x7F1F);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (f.lIllIlIlllllIlI(nPC.getId(), lIlIIIIIIllII[0])) {
            this.w.add(nPC);
            0;
        }
    }

    public void c() {
        this.w.clear();
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC nPC = npcDespawned.getNpc();
        if (f.lIllIlIlllllIlI(nPC.getId(), lIlIIIIIIllII[0])) {
            this.w.remove(nPC);
            0;
        }
    }

    public f() {
        this.w = new ArrayList<NPC>();
    }

    private static boolean lIllIlIlllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    public List<NPC> e() {
        return this.w;
    }

    static {
        f.lIllIlIlllllIIl();
        v = lIlIIIIIIllII[0];
    }
}

