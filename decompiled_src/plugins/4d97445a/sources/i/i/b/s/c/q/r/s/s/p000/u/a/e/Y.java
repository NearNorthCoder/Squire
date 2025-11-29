package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.MenuAction;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.client.Static;
@TaskDesc(name = "Making molten glass")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.Y  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/Y.class */
public class Y extends Task {
    private static /* synthetic */ int[] lIIIlIIII;
    private /* synthetic */ int cs;

    private static boolean lllIllIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static void lllIllIIIl() {
        lIIIlIIII = new int[4];
        lIIIlIIII[0] = (57 ^ 97) ^ (221 ^ 129);
        lIIIlIIII[1] = (248 ^ 160) & ((234 ^ 178) ^ (-1));
        lIIIlIIII[2] = " ".length();
        lIIIlIIII[3] = (-(182 ^ 151)) & (-1025) & 30718;
    }

    static {
        lllIllIIIl();
    }

    private static boolean lllIllIIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lllIllIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lllIllIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        int tickCount = Static.getClient().getTickCount();
        if (!lllIllIIlI(Players.getLocal().isAnimating() ? 1 : 0) || lllIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            this.cs = tickCount;
        }
        if (lllIllIlII(tickCount - this.cs, lIIIlIIII[0])) {
            return lIIIlIIII[1];
        }
        if (lllIllIIll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.cs = tickCount;
            return lIIIlIIII[2];
        }
        int[] iArr = new int[lIIIlIIII[2]];
        iArr[lIIIlIIII[1]] = lIIIlIIII[3];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lllIllIlIl(nearest)) {
            return lIIIlIIII[1];
        }
        nearest.interact(lIIIlIIII[3], MenuAction.GAME_OBJECT_SECOND_OPTION.getId(), nearest.menuPoint().getX(), nearest.menuPoint().getY());
        return lIIIlIIII[2];
    }
}
