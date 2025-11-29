/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.GameEnum7;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Walking to veins", priority=10, blocking=true)
public class WalkingToVeinsTask
extends MiningTaskBase {

    private static final  RectangularArea ac;

    @Inject
    public WalkingToVeinsTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    static {
        F.var3();
        F.var4();
        ac = new RectangularArea(var2[8], var2[9], var2[10], var2[11]);
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var2 = new int[13];
        F.var2[0] = (0x4E ^ 0x15 ^ (0x37 ^ 0x57)) & (0xC5 ^ 0xAA ^ (0x27 ^ 0x73) ^ -1);
        F.var2[1] = 127 + 0 - 6 + 64 ^ 112 + 65 - 40 + 45;
        F.var2[2] = 156 + 47 - 36 + 16 ^ 44 + 19 - -10 + 96;
        F.var2[3] = -(0xFFFFF7FF & 0x7B99) & (0xFFFFFBFF & 0x7FBE);
        F.var2[4] = 1;
        F.var2[5] = -(0xFFFFD65B & 0x3DAF) & (0xFFFFDEFE & 0x7F6F);
        F.var2[6] = 0xC2 ^ 0xC6;
        F.var2[7] = 2;
        F.var2[8] = 0xFFFFEFFE & 0x1E9D;
        F.var2[9] = -(0xFFFFBC5F & 0x63B6) & (0xFFFFB67F & 0x7FBD);
        F.var2[10] = -(0xFFFFFBFF & 0x4511) & (0xFFFFDFBF & 0x6FFF);
        F.var2[11] = 0xFFFFDFFE & 0x361D;
        F.var2[12] = 0x1B ^ 0x68 ^ (0x55 ^ 0x2E);
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var15;
        F var16;
        Player player = Players.getLocal();
        if (!F.var17(player) || !F.var8(player.isAnimating() ? 1 : 0) || F.var6(this.Z.I() ? 1 : 0)) {
            return var2[0];
        }
        if (!F.var8(var16.Z.G() ? 1 : 0) || F.var6(var16.Z.WalkingToVeinsTask() ? 1 : 0)) {
            return var2[0];
        }
        TileObject var18 = var16.u();
        if (F.var17(var18) && F.var19(var18.getWorldLocation().distanceTo((Locatable)var15), var2[1]) && F.var6(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
            return var2[0];
        }
        if (F.var8(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        if (F.var8(Movement.isRunEnabled() ? 1 : 0) && F.var7(Movement.getRunEnergy(), var2[2])) {
            Movement.toggleRun();
        }
        if (F.var5((Object)var16.X.mlmArea(), (Object)d.UPPER_FLOOR) && (!F.var8(ac.contains((Locatable)var15) ? 1 : 0) || F.var8(Vars.getBit((int)var2[3])))) {
            int[] nArray = new int[var2[4]];
            nArray[F.var2[0]] = var2[5];
            TileObject var20 = TileObjects.getNearest((int[])nArray);
            var20.interact(var1[var2[0]]);
            var16.sleep(var2[6]);
            return var2[4];
        }
        Movement.walkTo((WorldPoint)this.X.mlmArea().g()[var2[0]]);
        0;
        this.sleep(var2[7]);
        return var2[4];
    }

    private static boolean var19(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static void var4() {
        var1 = new String[var2[4]];
        F.var1[F.var2[0]] = "Climb";
    }
}

