/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Swapping Sides", priority=301, blocking=true)
public class SwappingSidesTask
extends Task {
    final  SquireDukeSucellus bb;
    final  a bc;

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

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (1 < 3) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    @Inject
    public SwappingSidesTask(SquireDukeSucellus squireDukeSucellus) {
        this.bb = squireDukeSucellus;
        this.bc = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var25;
        if ((this.bb.k( == 0) ? 1 : 0)) {
            return 0;
        }
        NPC var26 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[2]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[3];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if null == null return n2 != 0;
                    return ((0x9E ^ 0x92) & ~(0x89 ^ 0x85)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var26 == null {
            var25.bb.c(0);
            return 0;
        }
        TileObject var27 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[1];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (2 != 0) return n2 != 0;
                    return (1 & ~1) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var27 == null {
            return 0;
        }
        int var28 = var25.bc.j() ? 1 : 0;
        if var28 {
            if ((e.qlllllllllllllllIlIllllIIlllIIIlI)) {
                var25.bb.c(0);
                return 0;
            }
            Movement.setDestination((WorldPoint)e.m(var27));
            return 1;
        }
        if ((e.rlllllllllllllllIlIllllIIlllIIIlI)) {
            var25.bb.c(0);
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return 1;
    }
}

