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
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

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

/* TASK: Danger Tile Handler -> DangertilehandlerTask */
@TaskDesc(name="Danger Tile Handler", priority=0x7FFFFFFF)
public class j
extends Task {
    private final /* synthetic */ int ai = 2;
    private static /* synthetic */ int[] lIllIllIIlII;
    private final /* synthetic */ SquireDukeSucellus ag;
    private final /* synthetic */ SquireDukeSucellusConfig ah;

    static {
        j.lllIlIIIlllIll();
    }

    private static void lllIlIIIlllIll() {
        lIllIllIIlII = new int[2];
        j.lIllIllIIlII[0] = 2;
        j.lIllIllIIlII[1] = (0x11 ^ 8) & ~(0x57 ^ 0x4E);
    }

    private static boolean lllIlIIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2;
        int n2 = Static.getClient().getTickCount();
        List<f> list = this.ag.r();
        int var1 = lIllIllIIlII[1];
        while (j.lllIlIIIllllIl(var1, var2.size())) {
            j var3;
            void var6;
            f var4 = (f)var2.get(var1);
            if (j.lllIlIIIllllIl((int)var6, lIllIllIIlII[0] + var4.I())) {
                0;
                if (((0xB0 ^ 0x96) & ~(0xA1 ^ 0x87)) <= ((0x6B ^ 0x3A) & ~(0xB ^ 0x5A))) break;
                return false;
            }
            var2.remove(var1);
            0;
            WorldPoint var5 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var4.J().getLocation());
            var3.ag.i().add(var5);
            0;
            0;
            if (3 <= (0xF1 ^ 0xA1 ^ (0x53 ^ 7))) continue;
            return false;
        }
        return lIllIllIIlII[1];
    }

    @Inject
    j(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.ai = lIllIllIIlII[0];
        this.ag = squireDukeSucellus;
        this.ah = squireDukeSucellusConfig;
    }
}

