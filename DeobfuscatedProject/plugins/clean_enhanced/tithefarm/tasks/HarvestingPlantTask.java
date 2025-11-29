/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Harvesting Plant")
public class HarvestingPlantTask
extends TithefarmTaskBase {

    @Inject
    protected HarvestingPlantTask(i i2) {
        super(i2);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        p.var4();
        p.var5();
    }

    private static boolean var6(Object object) {
        return object != null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        p var13;
        TileObject tileObject = this.Z.a(var1[var2[0]]);
        if (p.var6(tileObject)) {
            return var2[0];
        }
        TileObject var14 = var13.Z.a(var1[var2[1]]);
        if (p.var15(var14)) {
            return var2[0];
        }
        var14.interact(var1[var2[2]]);
        GameObject var16 = (GameObject)var14;
        Player var17 = Players.getLocal();
        if (p.var3(var16.getWorldArea().isInMeleeDistance(var17.getWorldArea()) ? 1 : 0)) {
            var13.sleep(var2[2]);
        }
        return var2[1];
    }

    private static boolean var15(Object object) {
        return object == null;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new String[var2[3]];
        p.var1[p.var2[0]] = "Water";
        p.var1[p.var2[1]] = "Harvest";
        p.var1[p.var2[2]] = "Harvest";
    }

    private static void var4() {
        var2 = new int[5];
        p.var2[0] = (0x66 ^ 0x5A) & ~(0xC ^ 0x30);
        p.var2[1] = 1;
        p.var2[2] = 2;
        p.var2[3] = 3;
        p.var2[4] = 0x28 ^ 0x20;
    }
}

