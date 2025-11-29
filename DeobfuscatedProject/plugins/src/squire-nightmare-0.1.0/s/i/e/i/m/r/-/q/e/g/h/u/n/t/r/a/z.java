/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;

@Singleton
public class z
extends Overlay {
    private static final /* synthetic */ Logger cz;
    private final /* synthetic */ SquireNightmarePlugin cB;
    private final /* synthetic */ e cA;
    private static /* synthetic */ int[] lllIllllllIl;
    private /* synthetic */ WorldPoint cE;
    private /* synthetic */ WorldArea cD;
    public /* synthetic */ WorldArea aj;
    private /* synthetic */ WorldPoint cC;

    private static boolean lIIIlllIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIIllIlll(Object object) {
        return object == null;
    }

    public /* synthetic */ Plugin getPlugin() {
        return this.aB();
    }

    public WorldArea ac() {
        return this.aj;
    }

    public WorldPoint bU() {
        return this.cE;
    }

    static {
        z.lIIIlllIIllIIIl();
        cz = LoggerFactory.getLogger(z.class);
    }

    private static boolean lIIIlllIIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    public SquireNightmarePlugin aB() {
        return this.cB;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block49: {
            block50: {
                WorldPoint lllllllllllllllIIllIIIlIIllIlllI;
                WorldPoint lllllllllllllllIIllIIIlIIllIllll;
                block48: {
                    z lllllllllllllllIIllIIIlIIlllllII;
                    z lllllllllllllllIIllIIIlIIllllIlI;
                    block46: {
                        block47: {
                            WorldArea lllllllllllllllIIllIIIlIIlllIIII;
                            WorldArea lllllllllllllllIIllIIIlIIlllIIIl;
                            block45: {
                                block43: {
                                    block44: {
                                        WorldPoint lllllllllllllllIIllIIIlIIlllIIlI;
                                        WorldPoint lllllllllllllllIIllIIIlIIlllIIll;
                                        block42: {
                                            block40: {
                                                block41: {
                                                    WorldArea lllllllllllllllIIllIIIlIIlllIlII;
                                                    WorldArea lllllllllllllllIIllIIIlIIlllIlIl;
                                                    block39: {
                                                        block37: {
                                                            block38: {
                                                                SquireNightmarePlugin lllllllllllllllIIllIIIlIIlllIllI;
                                                                SquireNightmarePlugin lllllllllllllllIIllIIIlIIlllIlll;
                                                                block36: {
                                                                    block34: {
                                                                        block35: {
                                                                            e lllllllllllllllIIllIIIlIIllllIII;
                                                                            e lllllllllllllllIIllIIIlIIllllIIl;
                                                                            block33: {
                                                                                void lllllllllllllllIIllIIIlIIllllIll;
                                                                                if (z.lIIIlllIIlllIII(object, (Object)this)) {
                                                                                    return lllIllllllIl[1];
                                                                                }
                                                                                if (z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIllllIll instanceof z)) {
                                                                                    return lllIllllllIl[2];
                                                                                }
                                                                                lllllllllllllllIIllIIIlIIllllIlI = (z)lllllllllllllllIIllIIIlIIllllIll;
                                                                                if (z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIllllIlI.a((Object)lllllllllllllllIIllIIIlIIlllllII) ? 1 : 0)) {
                                                                                    return lllIllllllIl[2];
                                                                                }
                                                                                lllllllllllllllIIllIIIlIIllllIIl = lllllllllllllllIIllIIIlIIlllllII.aC();
                                                                                lllllllllllllllIIllIIIlIIllllIII = lllllllllllllllIIllIIIlIIllllIlI.aC();
                                                                                if (!z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIllllIIl)) break block33;
                                                                                if (!z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIIllllIII)) break block34;
                                                                                "".length();
                                                                                if (((0x5E ^ 0x6F ^ (0x44 ^ 0x56)) & (0x59 ^ 0x66 ^ (0x98 ^ 0x84) ^ -" ".length())) != 0) {
                                                                                    return ((125 + 2 - 41 + 53 ^ 110 + 157 - 247 + 157) & (0x64 ^ 0x55 ^ (0x83 ^ 0x88) ^ -" ".length())) != 0;
                                                                                }
                                                                                break block35;
                                                                            }
                                                                            if (!z.lIIIlllIIllIlII(((Object)lllllllllllllllIIllIIIlIIllllIIl).equals(lllllllllllllllIIllIIIlIIllllIII) ? 1 : 0)) break block34;
                                                                        }
                                                                        return lllIllllllIl[2];
                                                                    }
                                                                    lllllllllllllllIIllIIIlIIlllIlll = lllllllllllllllIIllIIIlIIlllllII.aB();
                                                                    lllllllllllllllIIllIIIlIIlllIllI = lllllllllllllllIIllIIIlIIllllIlI.aB();
                                                                    if (!z.lIIIlllIIllIlll((Object)lllllllllllllllIIllIIIlIIlllIlll)) break block36;
                                                                    if (!z.lIIIlllIIllIllI((Object)lllllllllllllllIIllIIIlIIlllIllI)) break block37;
                                                                    "".length();
                                                                    if (-" ".length() != -" ".length()) {
                                                                        return ((0x79 ^ 0x68) & ~(0x7C ^ 0x6D)) != 0;
                                                                    }
                                                                    break block38;
                                                                }
                                                                if (!z.lIIIlllIIllIlII(((Object)((Object)lllllllllllllllIIllIIIlIIlllIlll)).equals((Object)lllllllllllllllIIllIIIlIIlllIllI) ? 1 : 0)) break block37;
                                                            }
                                                            return lllIllllllIl[2];
                                                        }
                                                        lllllllllllllllIIllIIIlIIlllIlIl = lllllllllllllllIIllIIIlIIlllllII.ac();
                                                        lllllllllllllllIIllIIIlIIlllIlII = lllllllllllllllIIllIIIlIIllllIlI.ac();
                                                        if (!z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlllIlIl)) break block39;
                                                        if (!z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIIlllIlII)) break block40;
                                                        "".length();
                                                        if (((0x67 ^ 0x20) & ~(0x48 ^ 0xF)) != 0) {
                                                            return ((0x87 ^ 0x8A) & ~(0x60 ^ 0x6D)) != 0;
                                                        }
                                                        break block41;
                                                    }
                                                    if (!z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIlllIlIl.equals(lllllllllllllllIIllIIIlIIlllIlII) ? 1 : 0)) break block40;
                                                }
                                                return lllIllllllIl[2];
                                            }
                                            lllllllllllllllIIllIIIlIIlllIIll = lllllllllllllllIIllIIIlIIlllllII.bS();
                                            lllllllllllllllIIllIIIlIIlllIIlI = lllllllllllllllIIllIIIlIIllllIlI.bS();
                                            if (!z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlllIIll)) break block42;
                                            if (!z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIIlllIIlI)) break block43;
                                            "".length();
                                            if ("  ".length() >= "   ".length()) {
                                                return ((0x58 ^ 0x1C) & ~(0xD4 ^ 0x90)) != 0;
                                            }
                                            break block44;
                                        }
                                        if (!z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIlllIIll.equals(lllllllllllllllIIllIIIlIIlllIIlI) ? 1 : 0)) break block43;
                                    }
                                    return lllIllllllIl[2];
                                }
                                lllllllllllllllIIllIIIlIIlllIIIl = lllllllllllllllIIllIIIlIIlllllII.bT();
                                lllllllllllllllIIllIIIlIIlllIIII = lllllllllllllllIIllIIIlIIllllIlI.bT();
                                if (!z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlllIIIl)) break block45;
                                if (!z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIIlllIIII)) break block46;
                                "".length();
                                if (-" ".length() == "   ".length()) {
                                    return ((50 + 188 - 189 + 189 ^ 141 + 33 - 33 + 48) & (0x58 ^ 0x43 ^ (0x68 ^ 0x20) ^ -" ".length())) != 0;
                                }
                                break block47;
                            }
                            if (!z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIlllIIIl.equals(lllllllllllllllIIllIIIlIIlllIIII) ? 1 : 0)) break block46;
                        }
                        return lllIllllllIl[2];
                    }
                    lllllllllllllllIIllIIIlIIllIllll = lllllllllllllllIIllIIIlIIlllllII.bU();
                    lllllllllllllllIIllIIIlIIllIlllI = lllllllllllllllIIllIIIlIIllllIlI.bU();
                    if (!z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIllIllll)) break block48;
                    if (!z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIIllIlllI)) break block49;
                    "".length();
                    if (((0x8C ^ 0xAC) & ~(0 ^ 0x20)) > 0) {
                        return ((0x94 ^ 0x8C) & ~(0x4D ^ 0x55)) != 0;
                    }
                    break block50;
                }
                if (!z.lIIIlllIIllIlII(lllllllllllllllIIllIIIlIIllIllll.equals(lllllllllllllllIIllIIIlIIllIlllI) ? 1 : 0)) break block49;
            }
            return lllIllllllIl[2];
        }
        return lllIllllllIl[1];
    }

    public e aC() {
        return this.cA;
    }

    public void d(WorldArea worldArea) {
        this.cD = worldArea;
    }

    private static void lIIIlllIIllIIIl() {
        lllIllllllIl = new int[5];
        z.lllIllllllIl[0] = "   ".length();
        z.lllIllllllIl[1] = " ".length();
        z.lllIllllllIl[2] = (0x57 ^ 0x6F ^ (0x7F ^ 0x54)) & (0xD ^ 0x35 ^ (0xEB ^ 0xC0) ^ -" ".length());
        z.lllIllllllIl[3] = 0x82 ^ 0xB9;
        z.lllIllllllIl[4] = 138 + 112 - 146 + 42 ^ 51 + 71 - 45 + 108;
    }

    public void a(WorldArea worldArea) {
        this.aj = worldArea;
    }

    public String toString() {
        return "NightmareOverlay(areaManager=" + this.aC() + ", plugin=" + this.aB() + ", pnmDestination=" + this.ac() + ", ne=" + this.bS() + ", storeCharge=" + this.bT() + ", sw=" + this.bU() + ")";
    }

    private static boolean lIIIlllIIlllIII(Object object, Object object2) {
        return object == object2;
    }

    public void i(WorldPoint worldPoint) {
        this.cE = worldPoint;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        z lllllllllllllllIIllIIIlIIllIIlII;
        int n7;
        int n8 = lllIllllllIl[3];
        int n9 = lllIllllllIl[1];
        e e2 = this.aC();
        int n10 = n9 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(e2)) {
            n7 = lllIllllllIl[4];
            "".length();
            if (null != null) {
                return (28 + 36 - -59 + 82 ^ 111 + 18 - 63 + 63) & (0xB0 ^ 0x92 ^ (0x58 ^ 0x36) ^ -" ".length());
            }
        } else {
            void lllllllllllllllIIllIIIlIIllIIIIl;
            n7 = lllllllllllllllIIllIIIlIIllIIIIl.hashCode();
        }
        int lllllllllllllllIIllIIIlIIllIIIlI = n10 + n7;
        SquireNightmarePlugin lllllllllllllllIIllIIIlIIllIIIII = lllllllllllllllIIllIIIlIIllIIlII.aB();
        int n11 = lllllllllllllllIIllIIIlIIllIIIlI * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll((Object)lllllllllllllllIIllIIIlIIllIIIII)) {
            n6 = lllIllllllIl[4];
            "".length();
            if ("   ".length() <= " ".length()) {
                return (0x88 ^ 0xA1 ^ (0x7F ^ 0x6C)) & (0xEF ^ 0x9A ^ (0xCB ^ 0x84) ^ -" ".length());
            }
        } else {
            n6 = ((Object)((Object)lllllllllllllllIIllIIIlIIllIIIII)).hashCode();
        }
        lllllllllllllllIIllIIIlIIllIIIlI = n11 + n6;
        WorldArea lllllllllllllllIIllIIIlIIlIlllll = lllllllllllllllIIllIIIlIIllIIlII.ac();
        int n12 = lllllllllllllllIIllIIIlIIllIIIlI * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlIlllll)) {
            n5 = lllIllllllIl[4];
            "".length();
            if (-"  ".length() >= 0) {
                return (0x61 ^ 0x72 ^ (0x9C ^ 0xB5)) & (0xAD ^ 0xB5 ^ (0x40 ^ 0x62) ^ -" ".length());
            }
        } else {
            n5 = lllllllllllllllIIllIIIlIIlIlllll.hashCode();
        }
        lllllllllllllllIIllIIIlIIllIIIlI = n12 + n5;
        WorldPoint lllllllllllllllIIllIIIlIIlIllllI = lllllllllllllllIIllIIIlIIllIIlII.bS();
        int n13 = lllllllllllllllIIllIIIlIIllIIIlI * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlIllllI)) {
            n4 = lllIllllllIl[4];
            "".length();
            if ("  ".length() <= " ".length()) {
                return (0x5B ^ 2) & ~(0x18 ^ 0x41);
            }
        } else {
            n4 = lllllllllllllllIIllIIIlIIlIllllI.hashCode();
        }
        lllllllllllllllIIllIIIlIIllIIIlI = n13 + n4;
        WorldArea lllllllllllllllIIllIIIlIIlIlllIl = lllllllllllllllIIllIIIlIIllIIlII.bT();
        int n14 = lllllllllllllllIIllIIIlIIllIIIlI * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlIlllIl)) {
            n3 = lllIllllllIl[4];
            "".length();
            if ((0x6B ^ 0x6F) != (0x8F ^ 0x8B)) {
                return (0x6D ^ 0x2C) & ~(0xE ^ 0x4F);
            }
        } else {
            n3 = lllllllllllllllIIllIIIlIIlIlllIl.hashCode();
        }
        lllllllllllllllIIllIIIlIIllIIIlI = n14 + n3;
        WorldPoint lllllllllllllllIIllIIIlIIlIlllII = lllllllllllllllIIllIIIlIIllIIlII.bU();
        int n15 = lllllllllllllllIIllIIIlIIllIIIlI * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIIlIlllII)) {
            n2 = lllIllllllIl[4];
            "".length();
            if (((205 + 39 - 157 + 124 ^ 76 + 40 - 83 + 117) & (0x91 ^ 0xC4 ^ (0x77 ^ 0x67) ^ -" ".length())) == "   ".length()) {
                return (0x44 ^ 0xE ^ (0x61 ^ 7)) & (0x2A ^ 0x12 ^ (0xB7 ^ 0xA3) ^ -" ".length());
            }
        } else {
            n2 = lllllllllllllllIIllIIIlIIlIlllII.hashCode();
        }
        n9 = n15 + n2;
        return n9;
    }

    public WorldArea bT() {
        return this.cD;
    }

    public void h(WorldPoint worldPoint) {
        this.cC = worldPoint;
    }

    private static boolean lIIIlllIIllIllI(Object object) {
        return object != null;
    }

    @Inject
    private z(e e2, SquireNightmarePlugin squireNightmarePlugin) {
        this.cC = null;
        this.cB = squireNightmarePlugin;
        this.cA = e2;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.cD = null;
        this.aj = null;
    }

    protected boolean a(Object object) {
        return object instanceof z;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        z lllllllllllllllIIllIIIlIlIIlIlIl;
        if (!z.lIIIlllIIllIIll(Static.getClient().getPlane(), lllIllllllIl[0]) || z.lIIIlllIIllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        if (z.lIIIlllIIllIlIl(lllllllllllllllIIllIIIlIlIIlIlIl.cB.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        List<WorldArea> lllllllllllllllIIllIIIlIlIIlIIll = e.ax();
        if (z.lIIIlllIIllIllI(lllllllllllllllIIllIIIlIlIIlIIll)) {
            Iterator<WorldArea> lllllllllllllllIIllIIIlIlIIlIIlI = lllllllllllllllIIllIIIlIlIIlIIll.iterator();
            while (z.lIIIlllIIllIlIl(lllllllllllllllIIllIIIlIlIIlIIlI.hasNext() ? 1 : 0)) {
                WorldArea lllllllllllllllIIllIIIlIlIIlIIIl = lllllllllllllllIIllIIIlIlIIlIIlI.next();
                Iterator lllllllllllllllIIllIIIlIlIIlIIII = lllllllllllllllIIllIIIlIlIIlIIIl.toWorldPointList().iterator();
                while (z.lIIIlllIIllIlIl(lllllllllllllllIIllIIIlIlIIlIIII.hasNext() ? 1 : 0)) {
                    void lllllllllllllllIIllIIIlIlIIlIlII;
                    WorldPoint lllllllllllllllIIllIIIlIlIIIllll = (WorldPoint)lllllllllllllllIIllIIIlIlIIlIIII.next();
                    LocalPoint lllllllllllllllIIllIIIlIlIIIlllI = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)lllllllllllllllIIllIIIlIlIIIllll);
                    if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIlIIIlllI)) {
                        "".length();
                        if (((78 + 110 - 86 + 142 ^ 134 + 112 - 148 + 96) & (0x60 ^ 0x57 ^ " ".length() ^ -" ".length())) >= 0) continue;
                        return null;
                    }
                    Polygon lllllllllllllllIIllIIIlIlIIIllIl = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)lllllllllllllllIIllIIIlIlIIIlllI);
                    if (z.lIIIlllIIllIlll(lllllllllllllllIIllIIIlIlIIIllIl)) {
                        "".length();
                        if (null == null) continue;
                        return null;
                    }
                    Color lllllllllllllllIIllIIIlIlIIIllII = Color.BLACK;
                    OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIIllIIIlIlIIlIlII, (Shape)lllllllllllllllIIllIIIlIlIIIllIl, (Color)lllllllllllllllIIllIIIlIlIIIllII);
                    "".length();
                    if (-(0x86 ^ 0x8B ^ (0x72 ^ 0x7B)) <= 0) continue;
                    return null;
                }
                "".length();
                if ("  ".length() == "  ".length()) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIIIlllIIllIlII(int n2) {
        return n2 == 0;
    }

    public WorldPoint bS() {
        return this.cC;
    }
}

