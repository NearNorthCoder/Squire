/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Polishing sword", priority=43, blocking=true)
public class PolishingSwordTask
extends GiantsfoundryTaskBase {
    private static final  int ac;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (n.var3(player.getAnimation(), var1[0])) {
            this.sleep(var1[1]);
            return var1[2];
        }
        return this.N();
    }

    @Inject
    public PolishingSwordTask(a a2) {
        super(a2, g.POLISH);
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static void var4() {
        var2 = new String[var1[4]];
        n.var2[n.var1[3]] = "Polishing wheel is null";
        n.var2[n.var1[2]] = "Use";
    }

    static {
        n.var5();
        n.var4();
        ac = var1[0];
    }

    private static boolean var6(Object object) {
        return object == null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new int[6];
        n.var1[0] = -(0xFFFFFE27 & 0xBD9) & (0xFFFFBFEE & 0x6EFF);
        n.var1[1] = 0x2D ^ 0x29;
        n.var1[2] = 1;
        n.var1[3] = (0x2E ^ 0x12) & ~(0x45 ^ 0x79);
        n.var1[4] = 2;
        n.var1[5] = 0x1F ^ 6 ^ (0xD0 ^ 0xC1);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.q();
        if (n.var6(tileObject)) {
            Log.info((String)var2[var1[3]]);
            return var1[3];
        }
        tileObject.interact(var2[var1[2]]);
        this.sleep(var1[1]);
        return var1[2];
    }
}

