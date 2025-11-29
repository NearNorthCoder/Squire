package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;
@TaskDesc(name = "Danger Tile Handler", priority = Integer.MAX_VALUE)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/j.class */
public class C0009j extends Task {
    private final /* synthetic */ int ai = lIllIllIIlII[0];
    private static /* synthetic */ int[] lIllIllIIlII;
    private final /* synthetic */ SquireDukeSucellus ag;
    private final /* synthetic */ SquireDukeSucellusConfig ah;

    static {
        lllIlIIIlllIll();
    }

    private static void lllIlIIIlllIll() {
        lIllIllIIlII = new int[2];
        lIllIllIIlII[0] = "  ".length();
        lIllIllIIlII[1] = (17 ^ 8) & ((87 ^ 78) ^ (-1));
    }

    private static boolean lllIlIIIllllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    public boolean run() {
        int tickCount = Static.getClient().getTickCount();
        List<C0005f> r = this.ag.r();
        int i = lIllIllIIlII[1];
        do {
            if (lllIlIIIllllIl(i, r.size())) {
                C0005f c0005f = r.get(i);
                if (lllIlIIIllllIl(tickCount, lIllIllIIlII[0] + c0005f.I())) {
                    "".length();
                    if (((176 ^ 150) & ((161 ^ 135) ^ (-1))) > ((107 ^ 58) & ((11 ^ 90) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    r.remove(i);
                    "".length();
                    this.ag.i().add(WorldPoint.fromLocal(Static.getClient(), c0005f.J().getLocation()));
                    "".length();
                    "".length();
                }
            }
            return lIllIllIIlII[1];
        } while ("   ".length() <= ((241 ^ 161) ^ (83 ^ 7)));
        return ((((243 + 88) - 81) + 2) ^ (((124 + 30) - 29) + 33)) & (((((122 + 162) - 223) + 138) ^ (((7 + 150) - 119) + 127)) ^ (-" ".length()));
    }

    @Inject
    C0009j(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.ag = squireDukeSucellus;
        this.ah = squireDukeSucellusConfig;
    }
}
