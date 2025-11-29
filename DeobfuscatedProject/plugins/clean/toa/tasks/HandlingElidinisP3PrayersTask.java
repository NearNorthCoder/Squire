/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Elidinis P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingElidinisP3PrayersTask
extends ToaTaskBase {
    
    private  Prayer ba;

    private static boolean lIllIllIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public HandlingElidinisP3PrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    private static boolean lIllIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var1;
        Actor actor = animationChanged.getActor();
        if (I.lIllIllIIIlllIl(actor instanceof Player)) {
            return;
        }
        if (I.lIllIllIIIllllI(var1.getAnimation(), lIlIIIIIlIllI[6])) {
            Prayer prayer;
            I var2;
            if (I.lIllIllIIIlllll(var2.ba, Prayer.PROTECT_FROM_MISSILES)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;

                if (2 != 2) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            var2.ba = prayer;

            if (3 <= 0) {
                return;
            }
        } else if (I.lIllIllIIIllllI(var1.getAnimation(), lIlIIIIIlIllI[7])) {
            var2.ba = Prayer.PROTECT_FROM_MISSILES;

        } else if (I.lIllIllIIIllllI(var1.getAnimation(), lIlIIIIIlIllI[8])) {
            var2.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    @Override
    public int F() {
        return lIlIIIIIlIllI[0];
    }

    static {
        I.lIllIllIIIllIll();
    }

    @Override
    public List<Prayer> E() {
        if (I.lIllIllIIIlllII(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (I.lIllIllIIIllllI(nPC.getId(), lIlIIIIIlIllI[9])) {
            this.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIlIllI[1]];
        nArray[I.lIlIIIIIlIllI[2]] = lIlIIIIIlIllI[3];
        nArray[I.lIlIIIIIlIllI[4]] = lIlIIIIIlIllI[5];
        return this.aS.a(nArray);
    }

    @Override
    public n J() {
        return this.aT.prayFlickLastWarden();
    }

    private static boolean lIllIllIIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIIlllII(Object object) {
        return object == null;
    }

    @Override
    public boolean HandlingElidinisP3PrayersTask() {
        return this.C();
    }
}

