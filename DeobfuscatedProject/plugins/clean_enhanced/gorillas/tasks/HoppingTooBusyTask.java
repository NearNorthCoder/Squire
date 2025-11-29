/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.World
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.NPC;
import net.runelite.api.World;
import net.unethicalite.api.Locations;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import gg.squire.gorillas.tasks.LootingGorillaTask;

@TaskDesc(name="Hopping (too busy)", priority=100, blocking=true)
public class HoppingTooBusyTask
extends Task {
    
    @Inject
    protected  y ah;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var8_8;
        int var3;
        u var4;
        if ((Locations.isRegionLoaded((int == 0)0) ? 1 : 0)) {
            return 1;
        }
        int var5 = Players.getAll().size();
        if (var5 < 2) {
            return 1;
        }
        if ((var4.ah.P( == 0).isEmpty() ? 1 : 0)) {
            return 1;
        }
        NPC var6 = (NPC)Players.getLocal().getInteracting();
        if (var6 != null && (var6.isDead( == 0) ? 1 : 0)) {
            return 1;
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getInteracting() == nPC.getInteracting()2)) && (nPC.hasAction(var2[1]::equals != 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if (1 <= 0) {
                    return ((1 ^ 0x11 ^ (0x1D ^ 6)) & (0x9B ^ 0xAA ^ (0xFC ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var7 != null {
            return 1;
        }
        World var8 = Worlds.getCurrentWorld();
        List var9 = Worlds.getAll(world2 -> {
            int n2;
            if ((world2.getId() != var8.getId()) && (world2.isNormal( != 0) ? 1 : 0) && (world2.isMembers( != 0) ? 1 : 0) && (world2.isSkillTotal( == 0) ? 1 : 0) && (world2.isAllPkWorld( == 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if ((1 & ~1) != 0) {
                    return ((0x6A ^ 0x2D) & ~(0x4D ^ 0xA)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }).stream().sorted(Comparator.comparingInt(World::getPlayerCount)).limit(100L).collect(Collectors.toList());
        if ((var9.isEmpty( != 0) ? 1 : 0)) {
            return 1;
        }
        int var10 = Rand.nextInt((int)1, (int)var9.size());
        World var11 = (World)var9.get(Math.min(var10, var3 = Rand.nextInt((int)1, (int)var9.size())));
        if var11 == null {
            return 1;
        }
        Worlds.hopTo((World)var8_8);
        return 3;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

}

