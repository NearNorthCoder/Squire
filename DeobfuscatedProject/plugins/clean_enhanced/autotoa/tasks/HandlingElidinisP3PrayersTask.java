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
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Elidinis P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingElidinisP3PrayersTask
extends AutotoaManager {
    private  Prayer dE;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2;
        Actor actor = animationChanged.getActor();
        if (aF.var3(actor instanceof Player)) {
            return;
        }
        if (aF.var4(var2.getAnimation(), var1[6])) {
            Prayer prayer;
            aF var5;
            if (aF.var6(var5.dE, Prayer.PROTECT_FROM_MISSILES)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                0;
                if (((0x25 ^ 0xD) & ~(0x6C ^ 0x44)) < -1) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            var5.dE = prayer;
            0;
            if (-1 != -1) {
                return;
            }
        } else if (aF.var4(var2.getAnimation(), var1[7])) {
            var5.dE = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (2 <= -1) {
                return;
            }
        } else if (aF.var4(var2.getAnimation(), var1[8])) {
            var5.dE = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    private static void var7() {
        var1 = new int[10];
        aF.var1[0] = -(0xFFFFF3EF & 0x4CB9) & (0xFFFFFDFE & 0x7FF9);
        aF.var1[1] = 2;
        aF.var1[2] = (0 ^ 0x22) & ~(0x78 ^ 0x5A);
        aF.var1[3] = -1 & (0xFFFFEDF7 & 0x3FF9);
        aF.var1[4] = 1;
        aF.var1[5] = -(0xFFFFE01D & 0x5FEB) & (0xFFFFFFFF & 0x6DFB);
        aF.var1[6] = 0xFFFFA635 & 0x7FFB;
        aF.var1[7] = -(0xFFFFF3FE & 0x1D55) & (0xFFFFF7FF & 0x3F7F);
        aF.var1[8] = 0xFFFFBE3E & 0x67EF;
        aF.var1[9] = 0xFFFFFF0F & 0x2EF1;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (aF.var4(nPC.getId(), var1[9])) {
            this.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    @Override
    public List<Prayer> aN() {
        if (aF.var8(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Override
    public int aO() {
        return var1[0];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Inject
    public HandlingElidinisP3PrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[var1[1]];
        nArray[aF.var1[2]] = var1[3];
        nArray[aF.var1[4]] = var1[5];
        return this.cm.a(nArray);
    }

    private static boolean var6(Object object, Object object2) {
        return object == object2;
    }

    static {
        aF.var7();
    }
}

