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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Elidinis P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingElidinisP3PrayersTask
extends AutotoaTaskBase {
    private  Prayer dE;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var1;
        Actor actor = animationChanged.getActor();
        if (aF.lIIlIllIIIIllI(actor instanceof Player)) {
            return;
        }
        if (aF.lIIlIllIIIIlll(var1.getAnimation(), lIllIIllIII[6])) {
            Prayer prayer;
            aF var2;
            if (aF.lIIlIllIIIlIII(var2.dE, Prayer.PROTECT_FROM_MISSILES)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;

                if (((0x25 ^ 0xD) & ~(0x6C ^ 0x44)) < -1) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            var2.dE = prayer;

            if (-1 != -1) {
                return;
            }
        } else if (aF.lIIlIllIIIIlll(var1.getAnimation(), lIllIIllIII[7])) {
            var2.dE = Prayer.PROTECT_FROM_MISSILES;

            if (2 <= -1) {
                return;
            }
        } else if (aF.lIIlIllIIIIlll(var1.getAnimation(), lIllIIllIII[8])) {
            var2.dE = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (aF.lIIlIllIIIIlll(nPC.getId(), lIllIIllIII[9])) {
            this.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean lIIlIllIIIIlIl(Object object) {
        return object == null;
    }

    @Override
    public List<Prayer> aN() {
        if (aF.lIIlIllIIIIlIl(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }

    private static boolean lIIlIllIIIIllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Override
    public int aO() {
        return lIllIIllIII[0];
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

    private static boolean lIIlIllIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[lIllIIllIII[1]];
        nArray[aF.lIllIIllIII[2]] = lIllIIllIII[3];
        nArray[aF.lIllIIllIII[4]] = lIllIIllIII[5];
        return this.cm.a(nArray);
    }

    private static boolean lIIlIllIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        aF.lIIlIllIIIIlII();
    }
}

