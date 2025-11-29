/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Dodge Gaze", priority=500, blocking=true)
public class DodgeGazeTask
extends Task {
    final  SquireDukeSucellus aG;
    
    final  a aH;
    
    final  SquireDukeSucellusConfig aI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t var3;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().equals(var1[1]));
        if nPC2 == null {
            return 0;
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[2];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (1 < 3) return n2 != 0;
                    return ((0x2A ^ 1) & ~(0x2D ^ 6)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var4 == null {
            return 0;
        }
        Player var5 = Players.getLocal();
        if var5 == null {
            return 0;
        }
        int var6 = Static.getClient().getTickCount();
        int var7 = var6 - var3.aH.C();
        if ((var3.aI.safeDodge( != 0) ? 1 : 0) && !(var7 <= 1) || (var3.aI.safeDodge( == 0) ? 1 : 0) && (var7 != 1)) {
            return 0;
        }
        if ((e.rlllllllllllllllIlIlllIlIIllIllIl)) {
            Movement.setDestination((WorldPoint)e.o(var4));
            return 2;
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return 2;
    }

    @Inject
    public DodgeGazeTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aG = squireDukeSucellus;
        this.aH = squireDukeSucellus.s();
        this.aI = squireDukeSucellusConfig;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

}

