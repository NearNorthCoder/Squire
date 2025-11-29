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
import gg.squire.toa.tasks.ToaManager;
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
extends ToaManager {
    
    private  Prayer ba;

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public HandlingElidinisP3PrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var4;
        Actor actor = animationChanged.getActor();
        if (I.var5(actor instanceof Player)) {
            return;
        }
        if (I.var2(var4.getAnimation(), var1[6])) {
            Prayer prayer;
            I var6;
            if (I.var3(var6.ba, Prayer.PROTECT_FROM_MISSILES)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            var6.ba = prayer;
            0;
            if (3 <= 0) {
                return;
            }
        } else if (I.var2(var4.getAnimation(), var1[7])) {
            var6.ba = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-3 > 0) {
                return;
            }
        } else if (I.var2(var4.getAnimation(), var1[8])) {
            var6.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    @Override
    public int F() {
        return var1[0];
    }

    static {
        I.var7();
    }

    @Override
    public List<Prayer> E() {
        if (I.var8(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (I.var2(nPC.getId(), var1[9])) {
            this.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void var7() {
        var1 = new int[10];
        I.var1[0] = -(0xFFFFC5DB & 0x7A27) & (0xFFFFFDF6 & 0x7F5B);
        I.var1[1] = 2;
        I.var1[2] = (0x55 ^ 0x4D) & ~(0x1C ^ 4);
        I.var1[3] = -(0xFFFFBA0D & 0x57FF) & (0xFFFFFFFF & 0x3FFD);
        I.var1[4] = 1;
        I.var1[5] = 0xFFFFEFFF & 0x3DF3;
        I.var1[6] = -(0xFFFFF4A9 & 0x4BD7) & (0xFFFFF7F5 & 0x6EBB);
        I.var1[7] = -(0xFFFFE359 & 0x5DF7) & (0xFFFFF77E & 0x6FFD);
        I.var1[8] = 0xFFFFBFBE & 0x666F;
        I.var1[9] = -(0xFFFFFF7F & 0x519B) & (0xFFFFFFBF & 0x7F5B);
    }

    @Override
    public boolean C() {
        int[] nArray = new int[var1[1]];
        nArray[I.var1[2]] = var1[3];
        nArray[I.var1[4]] = var1[5];
        return this.aS.a(nArray);
    }

    @Override
    public n J() {
        return this.aT.prayFlickLastWarden();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    @Override
    public boolean HandlingElidinisP3PrayersTask() {
        return this.C();
    }
}

