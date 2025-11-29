/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Keep Back Akkha", register=true, priority=100, blocking=true)
public class KeepBackAkkhaTask
extends AutotoaManager {
    private  int dj;

    private static boolean var2(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        boolean var4;
        boolean bl2;
        au var5;
        if (au.var6(this.cW.keepBack() ? 1 : 0)) {
            return var1[0];
        }
        if (au.var3(var5.bu() ? 1 : 0)) {
            return var1[0];
        }
        NPC var7 = var5.J();
        if (au.var8(var7)) {
            return var1[0];
        }
        Log.info((String)(var5.cu.getTickCount() - var5.dj + " since akkha attack"));
        WorldPoint var9 = Players.getLocal().getWorldLocation();
        if (au.var6(var5.cu.getTickCount() - var5.dj)) {
            bl2 = var1[1];
            0;
            if (((0x3A ^ 0x5B ^ (0x10 ^ 0x2B)) & (0x1A ^ 0x72 ^ (0x43 ^ 0x71) ^ -1)) == 3) {
                return ((0xDB ^ 0xB6 ^ 69 + 79 - 134 + 113) & (0x16 ^ 0x6A ^ (0x27 ^ 0x49) ^ -1)) != 0;
            }
        } else {
            bl2 = var4 = var1[0];
        }
        if (au.var6(var7.getWorldArea().isInMeleeDistance(var9) ? 1 : 0) && au.var6(var4)) {
            return var1[0];
        }
        if (au.var10(var5.cu.getTickCount() - var5.dj, var1[2]) && au.var6(var4)) {
            return var1[0];
        }
        if (!au.var2(var7.getId(), var1[3]) || au.var11(var7.getId(), var1[4])) {
            return var1[0];
        }
        WorldPoint var12 = var9.createWorldArea(var1[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            boolean bl2;
            if (au.var6(worldPoint2.equals((Object)var9) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if (2 == ((0x51 ^ 0x6C ^ (0xC9 ^ 0xA1)) & (0x95 ^ 0x92 ^ (0xC9 ^ 0x9B) ^ -1))) {
                    return ((0x99 ^ 0xA8 ^ (0x7A ^ 0x53)) & (0x32 ^ 0x12 ^ (0xA6 ^ 0x9E) ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            void var13;
            void var14;
            boolean bl3;
            if (au.var3(var4)) {
                bl3 = var7.getWorldArea().isInMeleeDistance(worldPoint);
                0;
                if (-(0xA0 ^ 0xA4) >= 0) {
                    return (3 & ~3) != 0;
                }
            } else if (au.var15(var14.getWorldArea().distanceTo((WorldPoint)var13), var1[1])) {
                bl3 = var1[1];
                0;
                if ((0x6C ^ 0x68) <= ((0x7B ^ 0x41) & ~(0x7C ^ 0x46))) {
                    return ((0x8B ^ 0xAC) & ~(0x34 ^ 0x13)) != 0;
                }
            } else {
                bl3 = var1[0];
            }
            return bl3;
        }).filter(worldPoint -> NPCs.getAll(nPC -> nPC.getWorldLocation().equals(worldPoint)).isEmpty()).filter(worldPoint -> {
            boolean bl2;
            if (au.var6(var7.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).filter(worldPoint2 -> {
            boolean bl2;
            if (!au.var2(worldPoint2.getWorldX(), var9.getWorldX()) || au.var11(worldPoint2.getWorldY(), var9.getWorldY())) {
                bl2 = var1[1];
                0;
                if (-1 >= 2) {
                    return ((6 ^ 0x6A ^ (8 ^ 0x73)) & (193 + 45 - 228 + 201 ^ 139 + 23 - 23 + 57 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(var7.getWorldLocation()))).orElse(null);
        if (au.var8(var12)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(var1[1]);
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var16;
        NPC nPC = this.J();
        if (au.var17(animationChanged.getActor(), nPC)) {
            return;
        }
        if (au.var11(var16.getAnimation(), var1[5])) {
            return;
        }
        this.dj = this.cu.getTickCount();
    }

    @Inject
    protected KeepBackAkkhaTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var17(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    static {
        au.var18();
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static void var18() {
        var1 = new int[6];
        au.var1[0] = (0x59 ^ 0x52 ^ (9 ^ 0x41)) & (0x97 ^ 0xB1 ^ (0xF6 ^ 0x93) ^ -1);
        au.var1[1] = 1;
        au.var1[2] = 0x2E ^ 0x2A;
        au.var1[3] = -(0xFFFFDB9B & 0x75E5) & (0xFFFFFFDF & 0x7FAE);
        au.var1[4] = -(0xFFFFF4E1 & 0x1B7F) & (0xFFFFBF7F & 0x7EF3);
        au.var1[5] = -1;
    }
}

