/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.DHelper;
import gg.squire.farmer.tasks.GameEnum20;
import gg.squire.farmer.tasks.GameEnum15;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.time.Duration;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Emptying birdhouse", priority=5)
public class EmptyingBirdhouseTask
extends aG {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected EmptyingBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[0];
        fArray[1] = F.SEEDED;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
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
    public boolean f(E e2) {
        void var2_2;
        void var15;
        aH var16;
        if ((this.cu.c(e2 == 0) ? 1 : 0)) {
            return 1;
        }
        TileObject var17 = var16.cu.a((E)var15);
        if (!var17 != null || (var17.distanceTo((Locatable)Players.getLocal()) > 2)) {
            return 1;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(string -> string.contains(var1[0] != 0)) ? 1 : 0)) {
            var16.cu.Q().add((E)var15);
            0;
            D var18 = (D)var16.cu.R().get(var15);
            var16.cu.R().replace((E)var15, new DHelper((E)var15, var18.ax(), var18.ay() + Duration.ofMinutes(5L).toSeconds()));
            0;
            return 0;
        }
        var2_2.interact(var1[1]);
        return 0;
    }
}

