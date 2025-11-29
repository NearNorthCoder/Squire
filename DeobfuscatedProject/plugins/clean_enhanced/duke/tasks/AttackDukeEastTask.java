/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.GraphicsObject
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
import net.runelite.api.GraphicsObject;
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

@TaskDesc(name="Attack Duke East", priority=300, blocking=true)
public class AttackDukeEastTask
extends Task {
    final  SquireDukeSucellus aC;
    final  a aD;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var3;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var2[5]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[3];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((0x5B ^ 0x65) & ~(0x73 ^ 0x4D)) == ((0xB2 ^ 0x8F) & ~(0x25 ^ 0x18))) return n2 != 0;
                    return ((0x6D ^ 0x47) & ~(0xB ^ 0x21)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if nPC2 == null {
            return 0;
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[2]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if null == null return n2 != 0;
                    return ((0x5D ^ 0x45) & ~(0x3E ^ 0x26)) != 0;
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
        if (!(e.var6.contains((Locatable)var5) ? 1 : 0) || (e.AttackDukeEastTask(var4 == 0) ? 1 : 0)) {
            return 0;
        }
        GraphicsObject var7 = var3.aD.B();
        int var8 = Static.getClient().getTickCount();
        var3.aC.b(1);
        if ((var8 - var3.aD.D() > 2) && (var8 - var3.aD.C() != 3)) {
            void var9;
            int var10;
            int n2;
            Actor var11 = Players.getLocal().getInteracting();
            if (var11 != null && (var11.hasAction(var2[0]::equals != 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if ((0x57 ^ 0x53) == 2) {
                    return ((0x97 ^ 0x8A) & ~(0x82 ^ 0x9F)) != 0;
                }
            } else {
                n2 = 0;
            }
            if (var10 = n2 != 0) {
                return 1;
            }
            var9.interact(var2[1]);
            return 1;
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return 1;
    }

    @Inject
    public AttackDukeEastTask(SquireDukeSucellus squireDukeSucellus) {
        this.aC = squireDukeSucellus;
        this.aD = squireDukeSucellus.s();
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-(19 + 122 - 23 + 18 ^ 105 + 52 - 61 + 44) <= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

