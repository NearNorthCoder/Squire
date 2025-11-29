/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
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
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attack Duke West", priority=300, blocking=true)
public class AttackDukeWestTask
extends Task {
    
    final  a aF;
    
    final  SquireDukeSucellus aE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var15;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[5]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[0] = var1[2];
                if ((nPC.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (((0x7D ^ 0x3A) & ~(0xF7 ^ 0xB0)) == 0) return n2 != 0;
                    return ((0x80 ^ 0x8A) & ~(0x2F ^ 0x25)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if nPC2 == null {
            return 0;
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (((0x42 ^ 0x46) & ~(0x34 ^ 0x30)) < 3) return n2 != 0;
                    return ((0x12 ^ 0x3A) & ~(0x36 ^ 0x1E)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var16 == null {
            return 0;
        }
        Player var17 = Players.getLocal();
        if var17 == null {
            return 0;
        }
        if (!(e.var18.contains((Locatable)var17) ? 1 : 0) || (e.q(var16 == 0) ? 1 : 0)) {
            return 0;
        }
        int var19 = Static.getClient().getTickCount();
        var15.aE.b(0);
        if ((var19 - var15.aF.D() > 1) && (var19 - var15.aF.C() != 2)) {
            void var20;
            int var21;
            int n2;
            Actor var22 = Players.getLocal().getInteracting();
            if (var22 != null && (var22.hasAction(var1[0]::equals != 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if (2 != 2) {
                    return ((0x5B ^ 0x46 ^ (0x30 ^ 0x21)) & (111 + 55 - 148 + 137 ^ 86 + 111 - 129 + 83 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            if (var21 = n2 != 0) {
                return 3;
            }
            var20.interact(var1[3]);
            return 3;
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return 3;
    }

    @Inject
    public AttackDukeWestTask(SquireDukeSucellus squireDukeSucellus) {
        this.aE = squireDukeSucellus;
        this.aF = squireDukeSucellus.AttackDukeWestTask();
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = 0;
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = 0;
        while (var31 < var30) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            
            return null;
        }
        return String.valueOf(var26);
    }
}

