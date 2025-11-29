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
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.construction.tasks.GameEnum3;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class ConstructionManager {
    private static  int[] lIllIlIl;
    private final  Map<Integer, Prayer> cG;
    private final  Client cH;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        ae var3;
        void var4;
        Actor actor = animationChanged.getActor();
        if (ae.var1(actor instanceof Player)) {
            return;
        }
        Z var5 = Z.h((NPC)var4);
        if (ae.var6((Object)var5)) {
            return;
        }
        if (ae.var7(var4.getAnimation(), var5.ba())) {
            return;
        }
        if (ae.var8(var5.P(), lIllIlIl[0])) {
            System.out.println(var5.aZ());
            var3.a(lIllIlIl[1], var5.aZ());
        }
        if (ae.var8(var5.P(), lIllIlIl[2])) {
            var3.a(lIllIlIl[1], var5.aZ());
            0;
            if null != null {
                return;
            }
        } else {
            var3.a(lIllIlIl[3], var5.aZ());
        }
    }

    private static void var9() {
        lIllIlIl = new int[4];
        ae.lIllIlIl[0] = 0x7E ^ 0x6C ^ (0xDF ^ 0xA5);
        ae.lIllIlIl[1] = (5 ^ 0xD) & ~(0xA4 ^ 0xAC);
        ae.lIllIlIl[2] = 0xFFFFCFDF & 0x38FB;
        ae.lIllIlIl[3] = 0x75 ^ 0x71;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public ConstructionManager(Client client) {
        this.cG = new HashMap<Integer, Prayer>();
        this.cH = client;
    }

    public Prayer a(int n2, boolean bl2) {
        Prayer prayer;
        Integer n3 = this.cH.getTickCount() + n2;
        if (ae.var1(bl2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            if ((0 ^ 4) < 1) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return this.cG.getOrDefault(n3, prayer);
    }

    private static boolean var7(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private void a(int n2, Prayer prayer) {
        int n3 = this.cH.getTickCount() + n2;
        if (ae.var1(this.cG.containsKey(n3) ? 1 : 0) && ae.var2(this.cG.get(n3), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.cG.put(this.cH.getTickCount() + n2, prayer);
        0;
    }

    static {
        ae.var9();
    }
}

