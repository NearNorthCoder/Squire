package p000.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: -.r.u.q.e.s.o.t.a.i.e  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/e.class */
public class C0004e {
    private static /* synthetic */ int[] lIlIIIIlIIIII;
    private final /* synthetic */ List<GraphicsObject> t = new ArrayList();
    private /* synthetic */ int u = lIlIIIIlIIIII[0];

    public List<GraphicsObject> d() {
        return this.t;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.t.removeIf((v0) -> {
            return v0.finished();
        });
        "".length();
    }

    public void c() {
        this.u = lIlIIIIlIIIII[0];
        this.t.clear();
    }

    private static boolean lIllIllIlIIllIl(int i) {
        return i != 0;
    }

    private static boolean lIllIllIlIIlIll(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int id = graphicsObject.getId();
        if (lIllIllIlIIlIll(id, lIlIIIIlIIIII[1]) && lIllIllIlIIlIll(id, lIlIIIIlIIIII[2]) && lIllIllIlIIlIll(id, lIlIIIIlIIIII[3]) && !lIllIllIlIIllII(id, lIlIIIIlIIIII[4])) {
            return;
        }
        this.t.add(graphicsObject);
        "".length();
    }

    private static boolean lIllIllIlIIllII(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIllIllIlIIllIl(actor instanceof Player ? 1 : 0) || lIllIllIlIIllII(actor.getAnimation(), lIlIIIIlIIIII[5])) {
            return;
        }
        this.t.clear();
    }

    static {
        lIllIllIlIIlIlI();
    }

    private static void lIllIllIlIIlIlI() {
        lIlIIIIlIIIII = new int[6];
        lIlIIIIlIIIII[0] = (185 ^ 153) & ((181 ^ 149) ^ (-1));
        lIlIIIIlIIIII[1] = (-((-16907) & 26459)) & (-16386) & 28157;
        lIlIIIIlIIIII[2] = (-29763) & 31983;
        lIlIIIIlIIIII[3] = (-28994) & 31215;
        lIlIIIIlIIIII[4] = (-17937) & 20159;
        lIlIIIIlIIIII[5] = (-2593) & 12277;
    }
}
