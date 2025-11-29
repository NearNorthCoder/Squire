/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.Optional;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Exploring the gauntlet", priority=1)
public class ExploringTheGauntletTask
extends GauntletTaskBase {

    private static  int a(Player player, TileObject tileObject) {
        return (int)tileObject.getWorldLocation().distanceToHypotenuse(player.getWorldLocation());
    }

    @Inject
    public ExploringTheGauntletTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var3;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!player != null || !h2 != null || !(player.isMoving( == 0) ? 1 : 0) || (player.getInteracting( != null))) {
            return 1;
        }
        Optional<l> var4 = var3.ar();
        if ((var4.isEmpty( != 0) ? 1 : 0)) {
            Log.info((String)var2[1]);
            return 1;
        }
        l var5 = var3.as();
        if var5 != null {
            void var6;
            Q var7;
            Optional<l> var8 = var3.c(var5).stream().filter(l2 -> {
                int n2;
                if ((l2.aY( == 0) ? 1 : 0) && (l2.aS( != 0) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (((0xF0 ^ 0x93) & ~(0xFF ^ 0x9C)) < 0) {
                        return ((0xD1 ^ 0x98) & ~(0xCF ^ 0x86)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).findFirst();
            g var9 = var7.ba.J();
            l var10 = var4.get();
            if ((var3.b(l2 -> {
                int n2;
                if (Q.var11(l2.aY( != 0) ? 1 : 0) && ((Object)l2.aZ() == (Object)l2.aZ()2)var9)) {
                    n2 = 0;
                    0;
                    if ((0x73 ^ 0x77) < 0) {
                        return ((0xEA ^ 0xAC) & ~(0x3D ^ 0x7B)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && (var8.isPresent( != 0) ? 1 : 0)) {
                var10 = var8.get();
            }
            WorldArea var12 = var10.aR();
            Comparator<TileObject> var13 = Comparator.comparingInt(arg_0 -> Q.a((Player)var6, arg_0));
            Comparator<TileObject> var14 = Comparator.comparingInt(tileObject -> (int)var12.getCenter().distanceToHypotenuse(tileObject.getWorldLocation()));
            Optional<TileObject> var15 = TileObjects.getAll((int[])e.U).stream().filter(tileObject -> var5.e(tileObject.getWorldLocation())).min(var14.thenComparing(var13));
            var15.ifPresent(tileObject -> tileObject.interact(var2[0]));
            return 0;
        }
        return 1;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

}

