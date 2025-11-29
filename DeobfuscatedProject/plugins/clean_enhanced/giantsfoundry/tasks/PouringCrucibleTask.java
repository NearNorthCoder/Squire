/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pouring crucible", priority=200)
public class PouringCrucibleTask
extends GiantsfoundryTaskBase {
    private static final  int ar;
    private static final  WorldPoint as;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public PouringCrucibleTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    static {
        x.var4();
        x.var5();
        ar = var1[1];
        as = new WorldPoint(var1[4], var1[5], var1[0]);
    }

    private static void var4() {
        var1 = new int[7];
        x.var1[0] = (0xC6 ^ 0x87) & ~(0x6D ^ 0x2C);
        x.var1[1] = 0xFFFFF759 & 0x3EFF;
        x.var1[2] = 1;
        x.var1[3] = -(0xFFFFF9BB & 0x1757) & (0xFFFFBFFB & 0xFFFE);
        x.var1[4] = -(0xFFFF92CD & 0x7FF7) & (0xFFFF9FFF & 0x7FED);
        x.var1[5] = -(0x92 ^ 0x8F) & (0xFFFFBCFF & 0x6FFD);
        x.var1[6] = 2;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var2 = new String[var1[6]];
        x.var2[x.var1[0]] = "Pour";
        x.var2[x.var1[2]] = "Pour";
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        if (x.var6(this.T.g() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var7(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var7(Vars.getBit((int)var1[1])) && x.var6(Players.getLocal().getWorldLocation().equals((Object)as) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)as);
            return var1[2];
        }
        TileObject var14 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.var3(tileObject.getId(), var1[3])) {
                String[] stringArray = new String[var1[2]];
                stringArray[x.var1[0]] = var2[var1[2]];
                if (x.var7(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if (-1 < 2) return n2 != 0;
                    return ((28 + 108 - 31 + 74 ^ 126 + 65 - 190 + 140) & (0x1F ^ 0x7D ^ (0x11 ^ 0x4D) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (x.var15(var14)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[2];
    }

    private static boolean var15(Object object) {
        return object == null;
    }
}

