package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.z  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/z.class */
public class C0029z extends Overlay {
    private static final /* synthetic */ Logger cz;
    private final /* synthetic */ SquireNightmarePlugin cB;
    private final /* synthetic */ C0008e cA;
    private static /* synthetic */ int[] lllIllllllIl;
    private /* synthetic */ WorldPoint cE;
    private /* synthetic */ WorldArea cD;
    public /* synthetic */ WorldArea aj;
    private /* synthetic */ WorldPoint cC = null;

    private static boolean lIIIlllIIllIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIIllIlll(Object obj) {
        return obj == null;
    }

    public WorldArea ac() {
        return this.aj;
    }

    public WorldPoint bU() {
        return this.cE;
    }

    static {
        lIIIlllIIllIIIl();
        cz = LoggerFactory.getLogger(C0029z.class);
    }

    private static boolean lIIIlllIIllIIll(int i, int i2) {
        return i == i2;
    }

    /* renamed from: aB */
    public SquireNightmarePlugin getPlugin() {
        return this.cB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a8, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021a, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0270, code lost:
        if (lIIIlllIIllIlII(r0.equals(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v129, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllIIlllIII(obj, this)) {
            return lllIllllllIl[1];
        }
        if (lIIIlllIIllIlII(obj instanceof C0029z ? 1 : 0)) {
            return lllIllllllIl[2];
        }
        C0029z c0029z = (C0029z) obj;
        if (lIIIlllIIllIlII(c0029z.a(this) ? 1 : 0)) {
            return lllIllllllIl[2];
        }
        C0008e aC = aC();
        C0008e aC2 = c0029z.aC();
        if (lIIIlllIIllIlll(aC)) {
            if (lIIIlllIIllIllI(aC2)) {
                "".length();
                if ((((94 ^ 111) ^ (68 ^ 86)) & (((89 ^ 102) ^ (152 ^ 132)) ^ (-" ".length()))) != 0) {
                    return ((((125 + 2) - 41) + 53) ^ (((110 + 157) - 247) + 157)) & (((100 ^ 85) ^ (131 ^ 136)) ^ (-" ".length()));
                }
                return lllIllllllIl[2];
            }
            SquireNightmarePlugin plugin = getPlugin();
            SquireNightmarePlugin plugin2 = c0029z.getPlugin();
            if (lIIIlllIIllIlll(plugin)) {
                if (lIIIlllIIllIllI(plugin2)) {
                    "".length();
                    if ((-" ".length()) != (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return lllIllllllIl[2];
                }
                WorldArea ac = ac();
                WorldArea ac2 = c0029z.ac();
                if (lIIIlllIIllIlll(ac)) {
                    if (lIIIlllIIllIllI(ac2)) {
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return lllIllllllIl[2];
                    }
                    WorldPoint bS = bS();
                    WorldPoint bS2 = c0029z.bS();
                    if (lIIIlllIIllIlll(bS)) {
                        if (lIIIlllIIllIllI(bS2)) {
                            "".length();
                            if ("  ".length() >= "   ".length()) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                            return lllIllllllIl[2];
                        }
                        WorldArea bT = bT();
                        WorldArea bT2 = c0029z.bT();
                        if (lIIIlllIIllIlll(bT)) {
                            if (lIIIlllIIllIllI(bT2)) {
                                "".length();
                                if ((-" ".length()) == "   ".length()) {
                                    return ((((50 + 188) - 189) + 189) ^ (((141 + 33) - 33) + 48)) & (((88 ^ 67) ^ (104 ^ 32)) ^ (-" ".length()));
                                }
                                return lllIllllllIl[2];
                            }
                            WorldPoint bU = bU();
                            WorldPoint bU2 = c0029z.bU();
                            if (lIIIlllIIllIlll(bU)) {
                                if (lIIIlllIIllIllI(bU2)) {
                                    "".length();
                                    if (((140 ^ 172) & ((0 ^ 32) ^ (-1))) > 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                    return lllIllllllIl[2];
                                }
                                return lllIllllllIl[1];
                            }
                        }
                    }
                }
            }
        }
    }

    public C0008e aC() {
        return this.cA;
    }

    public void d(WorldArea worldArea) {
        this.cD = worldArea;
    }

    private static void lIIIlllIIllIIIl() {
        lllIllllllIl = new int[5];
        lllIllllllIl[0] = "   ".length();
        lllIllllllIl[1] = " ".length();
        lllIllllllIl[2] = ((87 ^ 111) ^ (127 ^ 84)) & (((13 ^ 53) ^ (235 ^ 192)) ^ (-" ".length()));
        lllIllllllIl[3] = 130 ^ 185;
        lllIllllllIl[4] = (((138 + 112) - 146) + 42) ^ (((51 + 71) - 45) + 108);
    }

    public void a(WorldArea worldArea) {
        this.aj = worldArea;
    }

    public String toString() {
        return "NightmareOverlay(areaManager=" + aC() + ", plugin=" + getPlugin() + ", pnmDestination=" + ac() + ", ne=" + bS() + ", storeCharge=" + bT() + ", sw=" + bU() + ")";
    }

    private static boolean lIIIlllIIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public void i(WorldPoint worldPoint) {
        this.cE = worldPoint;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = lllIllllllIl[3];
        int i2 = lllIllllllIl[1];
        C0008e aC = aC();
        int i3 = i2 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(aC)) {
            hashCode = lllIllllllIl[4];
            "".length();
            if (0 != 0) {
                return ((((28 + 36) - (-59)) + 82) ^ (((111 + 18) - 63) + 63)) & (((176 ^ 146) ^ (88 ^ 54)) ^ (-" ".length()));
            }
        } else {
            hashCode = aC.hashCode();
        }
        int i4 = i3 + hashCode;
        SquireNightmarePlugin plugin = getPlugin();
        int i5 = i4 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(plugin)) {
            hashCode2 = lllIllllllIl[4];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((136 ^ 161) ^ (127 ^ 108)) & (((239 ^ 154) ^ (203 ^ 132)) ^ (-" ".length()));
            }
        } else {
            hashCode2 = plugin.hashCode();
        }
        int i6 = i5 + hashCode2;
        WorldArea ac = ac();
        int i7 = i6 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(ac)) {
            hashCode3 = lllIllllllIl[4];
            "".length();
            if ((-"  ".length()) >= 0) {
                return ((97 ^ 114) ^ (156 ^ 181)) & (((173 ^ 181) ^ (64 ^ 98)) ^ (-" ".length()));
            }
        } else {
            hashCode3 = ac.hashCode();
        }
        int i8 = i7 + hashCode3;
        WorldPoint bS = bS();
        int i9 = i8 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(bS)) {
            hashCode4 = lllIllllllIl[4];
            "".length();
            if ("  ".length() <= " ".length()) {
                return (91 ^ 2) & ((24 ^ 65) ^ (-1));
            }
        } else {
            hashCode4 = bS.hashCode();
        }
        int i10 = i9 + hashCode4;
        WorldArea bT = bT();
        int i11 = i10 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(bT)) {
            hashCode5 = lllIllllllIl[4];
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return (109 ^ 44) & ((14 ^ 79) ^ (-1));
            }
        } else {
            hashCode5 = bT.hashCode();
        }
        int i12 = i11 + hashCode5;
        WorldPoint bU = bU();
        int i13 = i12 * lllIllllllIl[3];
        if (lIIIlllIIllIlll(bU)) {
            hashCode6 = lllIllllllIl[4];
            "".length();
            if ((((((205 + 39) - 157) + 124) ^ (((76 + 40) - 83) + 117)) & (((145 ^ 196) ^ (119 ^ 103)) ^ (-" ".length()))) == "   ".length()) {
                return ((68 ^ 14) ^ (97 ^ 7)) & (((42 ^ 18) ^ (183 ^ 163)) ^ (-" ".length()));
            }
        } else {
            hashCode6 = bU.hashCode();
        }
        return i13 + hashCode6;
    }

    public WorldArea bT() {
        return this.cD;
    }

    public void h(WorldPoint worldPoint) {
        this.cC = worldPoint;
    }

    private static boolean lIIIlllIIllIllI(Object obj) {
        return obj != null;
    }

    @Inject
    private C0029z(C0008e c0008e, SquireNightmarePlugin squireNightmarePlugin) {
        this.cB = squireNightmarePlugin;
        this.cA = c0008e;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        this.cD = null;
        this.aj = null;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0029z;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (!lIIIlllIIllIIll(Static.getClient().getPlane(), lllIllllllIl[0]) || lIIIlllIIllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) || lIIIlllIIllIlIl(this.cB.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        List<WorldArea> ax = C0008e.ax();
        if (lIIIlllIIllIllI(ax)) {
            for (WorldArea worldArea : ax) {
                for (WorldPoint worldPoint : worldArea.toWorldPointList()) {
                    LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
                    if (lIIIlllIIllIlll(fromWorld)) {
                        "".length();
                        if ((((((78 + 110) - 86) + 142) ^ (((134 + 112) - 148) + 96)) & (((96 ^ 87) ^ " ".length()) ^ (-" ".length()))) < 0) {
                            return null;
                        }
                    } else {
                        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(Static.getClient(), fromWorld);
                        if (lIIIlllIIllIlll(canvasTilePoly)) {
                            "".length();
                            if (0 != 0) {
                                return null;
                            }
                        } else {
                            OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.BLACK);
                            "".length();
                            if ((-((134 ^ 139) ^ (114 ^ 123))) > 0) {
                                return null;
                            }
                        }
                    }
                }
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean lIIIlllIIllIlII(int i) {
        return i == 0;
    }

    public WorldPoint bS() {
        return this.cC;
    }
}
