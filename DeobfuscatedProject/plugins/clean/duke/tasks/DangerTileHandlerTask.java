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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.f;
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
        j.lllIlIIIlllIll();
    }

    private static boolean lllIlIIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1;
        int n2 = Static.getClient().getTickCount();
        List<f> list = this.ag.r();
        int var2 = lIllIllIIlII[1];
        while (j.lllIlIIIllllIl(var2, var1.size())) {
            j var3;
            void var4;
            f var5 = (f)var1.get(var2);
            if (j.lllIlIIIllllIl((int)var4, lIllIllIIlII[0] + var5.I())) {

                if (((0xB0 ^ 0x96) & ~(0xA1 ^ 0x87)) <= ((0x6B ^ 0x3A) & ~(0xB ^ 0x5A))) break;
                return false;
            }
            var1.remove(var2);

            WorldPoint var6 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var5.J().getLocation());
            var3.ag.i().add(var6);

            if (3 <= (0xF1 ^ 0xA1 ^ (0x53 ^ 7))) continue;
            return false;
        }
        return lIllIllIIlII[1];
    }

    @Inject
    DangerTileHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.ai = lIllIllIIlII[0];
        this.ag = squireDukeSucellus;
        this.ah = squireDukeSucellusConfig;
    }
}

