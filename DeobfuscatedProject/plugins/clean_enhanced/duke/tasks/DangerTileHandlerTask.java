/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.util.List;
import javax.inject.Inject;
import gg.squire.duke.tasks.FHelper;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;

@TaskDesc(name="Danger Tile Handler", priority=0x7FFFFFFF)
public class DangerTileHandlerTask
extends Task {
    private final  int ai = 2;
    
    private final  SquireDukeSucellus ag;
    private final  SquireDukeSucellusConfig ah;

    static {
        j.var2();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3;
        int n2 = Static.getClient().getTickCount();
        List<f> list = this.ag.r();
        int var4 = 1;
        while ((var4 < var3.size())) {
            j var5;
            void var6;
            f var7 = (f)var3.get(var4);
            if (((int)var6 < 0 + var7.I())) {
                0;
                if (((0xB0 ^ 0x96) & ~(0xA1 ^ 0x87)) <= ((0x6B ^ 0x3A) & ~(0xB ^ 0x5A))) break;
                return ((0xF5 ^ 0xB4) & ~(0x60 ^ 0x21)) != 0;
            }
            var3.remove(var4);
            0;
            WorldPoint var8 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var7.J().getLocation());
            var5.ag.i().add(var8);
            0;
            0;
            if (3 <= (0xF1 ^ 0xA1 ^ (0x53 ^ 7))) continue;
            return ((243 + 88 - 81 + 2 ^ 124 + 30 - 29 + 33) & (122 + 162 - 223 + 138 ^ 7 + 150 - 119 + 127 ^ -1)) != 0;
        }
        return 1;
    }

    @Inject
    DangerTileHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.ai = 0;
        this.ag = squireDukeSucellus;
        this.ah = squireDukeSucellusConfig;
    }
}

