/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Gear
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Gear;
import gg.squire.nightmarezone.tasks.NightmarezoneManager;

@TaskDesc(name="Swapping Gear", priority=0x7FFFFFFF)
public class SwappingGearTask
extends Task {
    
    private final  a ae;
    private final  Client ad;
    private final  SquireNightmareZone ab;
    private final  SquireNightmareZoneConfig ac;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[1];
        k.var1[0] = (0xD5 ^ 0x9B) & ~(0x4F ^ 1);
    }

    static {
        k.var3();
    }

    @Inject
    public SwappingGearTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client, a a2) {
        this.ab = squireNightmareZone;
        this.ac = squireNightmareZoneConfig;
        this.ad = client;
        this.ae = a2;
    }

    public boolean run() {
        k var4;
        if (k.var5(this.ad.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var2(var4.ab.g() ? 1 : 0)) {
            return Gear.swapTo((int[])var4.ae.i());
        }
        return Gear.swapTo((int[])this.ab.h());
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }
}

