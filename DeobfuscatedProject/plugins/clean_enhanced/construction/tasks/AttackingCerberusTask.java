/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Attacking Cerberus", priority=5)
public class AttackingCerberusTask
extends Task {
    private final  a aA;
    private final  SquireCerberusConfig aB;
    private static  String[] lIIIIII;
    private static  int[] lIIIIIl;

    private static boolean lIIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIII(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (r.lIIIIIIlI(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0xA0 ^ 0xA5) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Inject
    private AttackingCerberusTask(a a2, SquireCerberusConfig squireCerberusConfig) {
        this.aA = a2;
        this.aB = squireCerberusConfig;
    }

    private static boolean lIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var15;
        NPC var16;
        if (!(this.aA.k( != null)) || (this.aA.k( == null).y())) {
            return 0;
        }
        if (!(Players.getLocal( == null).getInteracting()) || (Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0) && r.lIIIIIIII(Movement.getRunEnergy(), 1)) {
            Movement.toggleRun();
        }
        if ((var16 = var15.aA.k( == null).y())) {
            return 0;
        }
        if ((var15.aA.l( != 0) ? 1 : 0)) {
            var15.aA.a(0);
        }
        if ((Reachable.isInteractable((Locatable == 0)var16) ? 1 : 0)) {
            return var15.aA.c();
        }
        String[] stringArray = new String[2];
        stringArray[0] = lIIIIII[0];
        if ((var16.hasAction(stringArray == 0) ? 1 : 0)) {
            Player var17 = Players.getLocal();
            if ((var15.aA.l( == 0) ? 1 : 0) && r.lIIIIIIIl(var17.getWorldLocation().distanceTo((Locatable)var16), 3)) {
                Movement.setDestination((WorldPoint)var16.getWorldLocation());
                return 2;
            }
            Log.info((String)lIIIIII[2]);
            return 0;
        }
        var1_1.interact(lIIIIII[4]);
        this.sleep(4);
        return 2;
    }
}

