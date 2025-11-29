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

@TaskDesc(name="Hammering sword", priority=100, blocking=true)
public class HammeringSwordTask
extends GiantsfoundryTaskBase {
    private static final  int ab;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (m.var3(player.getAnimation(), var2[0])) {
            return var2[1];
        }
        return this.N();
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.r();
        if (m.var4(tileObject)) {
            Log.info((String)var1[var2[2]]);
            return var2[2];
        }
        tileObject.interact(var1[var2[1]]);
        return var2[1];
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public HammeringSwordTask(a a2) {
        super(a2, g.HAMMER);
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static void var5() {
        var1 = new String[var2[3]];
        m.var1[m.var2[2]] = "Hammer is null";
        m.var1[m.var2[1]] = "Use";
    }

    static {
        m.var6();
        m.var5();
        ab = var2[0];
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var6() {
        var2 = new int[5];
        m.var2[0] = 0xFFFFBDFF & 0x66EF;
        m.var2[1] = 1;
        m.var2[2] = (0x56 ^ 0x4A) & ~(0xB8 ^ 0xA4);
        m.var2[3] = 2;
        m.var2[4] = 0xC5 ^ 0xA5 ^ (0x10 ^ 0x78);
    }
}

