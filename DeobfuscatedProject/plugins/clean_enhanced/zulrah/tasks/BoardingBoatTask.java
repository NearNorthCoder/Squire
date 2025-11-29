/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum9;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Boarding boat", priority=10)
public class BoardingBoatTask
extends am {
    private static final  int aF;
    
    private static final  int aE;
    private final  SquireZulrah aG;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected BoardingBoatTask(Client client, SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah) {
        super(client, squireZulrahConfig);
        this.aG = squireZulrah;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var1_1;
        aj var9;
        if (((Object)this.aG.a() != (Object)this.aG.a()2)c.DONE)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject var10 = TileObjects.getNearest((int[])nArray);
        if (!var10 != null || (Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        int var11 = Static.getClient().getTickCount();
        if ((var11 - var9.aG.c() > 3) && (var9.aJ.hop( != 0) ? 1 : 0)) {
            if ((Worlds.isHopperOpen( != 0) ? 1 : 0)) {
                var9.aG.a(var11);
            }
            World var12 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if ((world2 != world22) && (world2.isNormal( != 0) ? 1 : 0) && (world2.isMembers( != 0) ? 1 : 0) && (world2.getLocation() == var12.getLocation())) {
                    n2 = 1;
                    0;
                    if ((125 + 136 - 222 + 120 ^ 76 + 30 - -14 + 35) <= 0) {
                        return ((95 + 28 - 16 + 35 ^ 53 + 164 - 93 + 52) & (95 + 38 - 71 + 108 ^ 2 + 102 - 55 + 99 ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }));
            return 1;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

    static {
        aj.var13();
        aj.var14();
        aE = 2;
        aF = 3;
    }

}

