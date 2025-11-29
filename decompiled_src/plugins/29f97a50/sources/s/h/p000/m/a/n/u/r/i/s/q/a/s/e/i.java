package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.pvm.SquireShamanConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.i  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/i.class */
public class i extends Overlay {
    @Inject
    /* synthetic */ SquireShamanConfig c;
    private static /* synthetic */ int[] lIIllIIIIllIl;
    private final /* synthetic */ c N;

    public Dimension render(Graphics2D graphics2D) {
        NPC o = this.N.o();
        Stream<WorldPoint> stream = this.c.room().z().stream();
        c cVar = this.N;
        Objects.requireNonNull(cVar);
        "".length();
        List<WorldPoint> list = (List) stream.filter(this::a).filter(worldPoint -> {
            if (!lIlIlllIllIlIII(o) || lIlIlllIllIlIIl(worldPoint.distanceTo(o.getWorldLocation()), lIIllIIIIllIl[0])) {
                ?? r0 = lIIllIIIIllIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIllIl[2];
        }).collect(Collectors.toList());
        Set<List<WorldPoint>> n = this.N.n();
        a(list, graphics2D, Color.GREEN);
        n.forEach(list2 -> {
            a(list2, graphics2D, Color.RED);
        });
        return null;
    }

    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : list) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lIlIlllIllIIllI(fromWorld)) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if ((-(133 ^ 129)) >= 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIlIlllIllIlIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIlllIllIIlII();
    }

    private static void lIlIlllIllIIlII() {
        lIIllIIIIllIl = new int[3];
        lIIllIIIIllIl[0] = "  ".length();
        lIIllIIIIllIl[1] = " ".length();
        lIIllIIIIllIl[2] = (70 ^ 126) & ((128 ^ 184) ^ (-1));
    }

    private static boolean lIlIlllIllIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIllIlIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlllIllIIllI(Object obj) {
        return obj == null;
    }

    @Inject
    public i(c cVar, SquireShamanConfig squireShamanConfig) {
        this.N = cVar;
        this.c = squireShamanConfig;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }
}
