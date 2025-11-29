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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import m.e.a.i.z.m.r.-.q.s.y.u.e;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class k {
    private final /* synthetic */ Map<Integer, Prayer> u;
    private final /* synthetic */ Client v;
    private static /* synthetic */ int[] lIllIIlIIllIl;

    private static boolean llIIIlIlllllIIl(Object object) {
        return object == null;
    }

    private static boolean llIIIlIlllllIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIllllIlll() {
        lIllIIlIIllIl = new int[1];
        k.lIllIIlIIllIl[0] = 0x23 ^ 0x26;
    }

    @Inject
    public k(Client client) {
        this.u = new HashMap<Integer, Prayer>();
        this.v = client;
    }

    static {
        k.llIIIlIllllIlll();
    }

    private static boolean llIIIlIlllllIll(Object object, Object object2) {
        return object == object2;
    }

    public Prayer a(int n2, boolean bl) {
        Prayer prayer;
        Integer n3 = this.v.getTickCount() + n2;
        if (k.llIIIlIlllllIII(bl ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (((0xD4 ^ 0x87) & ~(0x27 ^ 0x74)) != 0) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return this.u.getOrDefault(n3, prayer);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        e e2 = e.a(projectileSpawned.getProjectile());
        if (k.llIIIlIlllllIIl((Object)e2)) {
            return;
        }
        this.a(lIllIIlIIllIl[0], e2.o());
    }

    private static boolean llIIIlIlllllIlI(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var3_3;
        void var1;
        Actor actor = animationChanged.getActor();
        if (k.llIIIlIlllllIII(actor instanceof Player)) {
            return;
        }
        e var2 = e.a((NPC)var1);
        if (k.llIIIlIlllllIIl((Object)var2)) {
            return;
        }
        if (k.llIIIlIlllllIlI(var1.getAnimation(), var2.q())) {
            return;
        }
        this.a(lIllIIlIIllIl[0], var3_3.o());
    }

    private void a(int n2, Prayer prayer) {
        int n3 = this.v.getTickCount() + n2;
        if (k.llIIIlIlllllIII(this.u.containsKey(n3) ? 1 : 0) && k.llIIIlIlllllIll(this.u.get(n3), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.u.put(this.v.getTickCount() + n2, prayer);
        0;
    }
}

