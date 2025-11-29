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
import gg.squire.construction.tasks.GameEnum6;
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
    
    private final  Map<Integer, Prayer> cG;
    private final  Client cH;

    private static boolean lIlIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        ae llIlllIllIlIIlI;
        void llIlllIllIlIIII;
        Actor actor = animationChanged.getActor();
        if (ae.lIlIIIIllI(actor instanceof Player)) {
            return;
        }
        Z llIlllIllIIllll = Z.h((NPC)llIlllIllIlIIII);
        if (ae.lIlIIIIlll((Object)llIlllIllIIllll)) {
            return;
        }
        if (ae.lIlIIIlIII(llIlllIllIlIIII.getAnimation(), llIlllIllIIllll.ba())) {
            return;
        }
        if (ae.lIlIIIlIIl(llIlllIllIIllll.P(), lIllIlIl[0])) {
            System.out.println(llIlllIllIIllll.aZ());
            llIlllIllIlIIlI.a(lIllIlIl[1], llIlllIllIIllll.aZ());
        }
        if (ae.lIlIIIlIIl(llIlllIllIIllll.P(), lIllIlIl[2])) {
            llIlllIllIlIIlI.a(lIllIlIl[1], llIlllIllIIllll.aZ());

            }
        } else {
            llIlllIllIlIIlI.a(lIllIlIl[3], llIlllIllIIllll.aZ());
        }
    }

    private static boolean lIlIIIlIIl(int n2, int n3) {
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
        if (ae.lIlIIIIllI(bl2 ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;

            if ((0 ^ 4) < 1) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return this.cG.getOrDefault(n3, prayer);
    }

    private static boolean lIlIIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIIlll(Object object) {
        return object == null;
    }

    private void a(int n2, Prayer prayer) {
        int n3 = this.cH.getTickCount() + n2;
        if (ae.lIlIIIIllI(this.cG.containsKey(n3) ? 1 : 0) && ae.lIlIIIlIlI(this.cG.get(n3), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.cG.put(this.cH.getTickCount() + n2, prayer);

    }

    static {
        ae.lIlIIIIlIl();
    }
}

