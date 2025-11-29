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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class j {
    private final /* synthetic */ List<NPC> S;
    private static /* synthetic */ int[] llIIlIlIIII;
    public static final /* synthetic */ int R;

    public j() {
        this.S = new ArrayList<NPC>();
    }

    public void w() {
        this.S.clear();
    }

    private static void lIlIIIIIlIllIl() {
        llIIlIlIIII = new int[1];
        j.llIIlIlIIII[0] = -(0xFFFFDFE9 & 0x307F) & (0xFFFFBEEF & 0x7F7F);
    }

    public List<NPC> B() {
        return this.S;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC nPC = npcDespawned.getNpc();
        if (j.lIlIIIIIlIlllI(nPC.getId(), llIIlIlIIII[0])) {
            this.S.remove(nPC);
            0;
        }
    }

    private static boolean lIlIIIIIlIlllI(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (j.lIlIIIIIlIlllI(nPC.getId(), llIIlIlIIII[0])) {
            this.S.add(nPC);
            0;
        }
    }

    static {
        j.lIlIIIIIlIllIl();
        R = llIIlIlIIII[0];
    }
}

