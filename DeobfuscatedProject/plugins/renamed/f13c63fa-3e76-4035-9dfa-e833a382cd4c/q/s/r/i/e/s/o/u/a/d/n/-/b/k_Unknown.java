/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import q.s.r.i.e.s.o.u.a.d.n.-.b.BEnum;

@Singleton
public class k_Unknown {
    private final /* synthetic */ Client C;
    private static /* synthetic */ int[] llIlllIllll;
    private final /* synthetic */ Map<Integer, Prayer> B;

    private static boolean lIlIlIlllIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIlllIllII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        b b2 = b.a(projectileSpawned.getProjectile());
        if (k.lIlIlIlllIllIl((Object)b2)) {
            return;
        }
        this.a(llIlllIllll[0], b2.e());
    }

    private static void lIlIlIlllIlIll() {
        llIlllIllll = new int[1];
        k.llIlllIllll[0] = 0x43 ^ 0x55 ^ (0x24 ^ 0x37);
    }

    @Inject
    public k(Client client) {
        this.B = new HashMap<Integer, Prayer>();
        this.C = client;
    }

    public Prayer a(int n2, boolean bl) {
        Prayer prayer;
        Integer n3 = this.C.getTickCount() + n2;
        if (k.lIlIlIlllIllII(bl ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (((78 + 45 - 37 + 50 ^ 22 + 30 - -50 + 47) & (148 + 135 - 145 + 39 ^ 117 + 102 - 196 + 149 ^ -1)) != 0) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return this.B.getOrDefault(n3, prayer);
    }

    static {
        k.lIlIlIlllIlIll();
    }

    private static boolean lIlIlIlllIllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var3_3;
        void var1;
        Actor actor = animationChanged.getActor();
        if (k.lIlIlIlllIllII(actor instanceof Player)) {
            return;
        }
        b var2 = b.a((NPC)var1);
        if (k.lIlIlIlllIllIl((Object)var2)) {
            return;
        }
        if (k.lIlIlIlllIlllI(var1.getAnimation(), var2.g())) {
            return;
        }
        this.a(llIlllIllll[0], var3_3.e());
    }

    private static boolean lIlIlIlllIllIl(Object object) {
        return object == null;
    }

    private void a(int n2, Prayer prayer) {
        int n3 = this.C.getTickCount() + n2;
        if (k.lIlIlIlllIllII(this.B.containsKey(n3) ? 1 : 0) && k.lIlIlIlllIllll(this.B.get(n3), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.B.put(this.C.getTickCount() + n2, prayer);
        0;
    }
}

