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
        j.lIllIllIIlII[0] = "  ".length();
        j.lIllIllIIlII[1] = (0x11 ^ 8) & ~(0x57 ^ 0x4E);
    }

    private static boolean lllIlIIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lllllllllllllllIlIlllIlllIllllII;
        int n2 = Static.getClient().getTickCount();
        List<f> list = this.ag.r();
        int lllllllllllllllIlIlllIlllIlllIll = lIllIllIIlII[1];
        while (j.lllIlIIIllllIl(lllllllllllllllIlIlllIlllIlllIll, lllllllllllllllIlIlllIlllIllllII.size())) {
            j lllllllllllllllIlIlllIlllIlllllI;
            void lllllllllllllllIlIlllIlllIllllIl;
            f lllllllllllllllIlIlllIlllIlllIlI = (f)lllllllllllllllIlIlllIlllIllllII.get(lllllllllllllllIlIlllIlllIlllIll);
            if (j.lllIlIIIllllIl((int)lllllllllllllllIlIlllIlllIllllIl, lIllIllIIlII[0] + lllllllllllllllIlIlllIlllIlllIlI.I())) {
                "".length();
                if (((0xB0 ^ 0x96) & ~(0xA1 ^ 0x87)) <= ((0x6B ^ 0x3A) & ~(0xB ^ 0x5A))) break;
                return ((0xF5 ^ 0xB4) & ~(0x60 ^ 0x21)) != 0;
            }
            lllllllllllllllIlIlllIlllIllllII.remove(lllllllllllllllIlIlllIlllIlllIll);
            "".length();
            WorldPoint lllllllllllllllIlIlllIlllIlllIIl = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIlIlllIlllIlllIlI.J().getLocation());
            lllllllllllllllIlIlllIlllIlllllI.ag.i().add(lllllllllllllllIlIlllIlllIlllIIl);
            "".length();
            "".length();
            if ("   ".length() <= (0xF1 ^ 0xA1 ^ (0x53 ^ 7))) continue;
            return ((243 + 88 - 81 + 2 ^ 124 + 30 - 29 + 33) & (122 + 162 - 223 + 138 ^ 7 + 150 - 119 + 127 ^ -" ".length())) != 0;
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

