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
package gg.squire.saradomin.tasks;

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
import gg.squire.saradomin.tasks.GameEnum2;

@Singleton
public class SaradominManager {
    private final  Map<Integer, Prayer> o;
    private final  Client p;

    private static boolean var2(Object object) {
        return object == null;
    }

    private static void var3() {
        var1 = new int[1];
        f.var1[0] = 140 + 80 - 122 + 44 ^ 78 + 34 - 94 + 121;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        k k2 = k.a(projectileSpawned.getProjectile());
        if (f.var2((Object)k2)) {
            return;
        }
        this.a(var1[0], k2.E());
    }

    private void a(int n2, Prayer prayer) {
        int n3 = this.p.getTickCount() + n2;
        if (f.var4(this.o.containsKey(n3) ? 1 : 0) && f.var5(this.o.get(n3), Prayer.PROTECT_FROM_MAGIC)) {
            return;
        }
        this.o.put(this.p.getTickCount() + n2, prayer);
        0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    static {
        f.var3();
    }

    @Inject
    public SaradominManager(Client client) {
        this.o = new HashMap<Integer, Prayer>();
        this.p = client;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public Prayer a(int n2, boolean bl) {
        Prayer prayer;
        Integer n3 = this.p.getTickCount() + n2;
        if (f.var4(bl)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (((0x99 ^ 0x8D) & ~(0x6C ^ 0x78)) != 0) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return this.o.getOrDefault(n3, prayer);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var3_3;
        void var7;
        Actor actor = animationChanged.getActor();
        if (f.var4(actor instanceof Player)) {
            return;
        }
        k var8 = k.c((NPC)var7);
        if (f.var2((Object)var8)) {
            return;
        }
        if (f.var6(var7.getAnimation(), var8.G())) {
            return;
        }
        this.a(var1[0], var3_3.E());
    }
}

