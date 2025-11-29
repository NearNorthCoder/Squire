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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e_Unknown;

@Singleton
public class z_Unknown
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
                WorldPoint var22;
                WorldPoint var3;
                block48: {
                    z var29;
                    z var28;
                    block46: {
                        block47: {
                            WorldArea var19;
                            WorldArea var30;
                            block45: {
                                block43: {
                                    block44: {
                                        WorldPoint var21;
                                        WorldPoint var7;
                                        block42: {
                                            block40: {
                                                block41: {
                                                    WorldArea var23;
                                                    WorldArea var4;
                                                    block39: {
                                                        block37: {
                                                            block38: {
                                                                SquireNightmarePlugin var13;
                                                                SquireNightmarePlugin var14;
                                                                block36: {
                                                                    block34: {
                                                                        block35: {
                                                                            e var26;
                                                                            e var32;
                                                                            block33: {
                                                                                void var25;
                                                                                if (z.lIIIlllIIlllIII(object, (Object)this)) {
                                                                                    return lllIllllllIl[1];
                                                                                }
                                                                                if (z.lIIIlllIIllIlII(var25 instanceof z)) {
                                                                                    return lllIllllllIl[2];
                                                                                }
                                                                                var28 = (z)var25;
                                                                                if (z.lIIIlllIIllIlII(var28.a((Object)var29) ? 1 : 0)) {
                                                                                    return lllIllllllIl[2];
                                                                                }
                                                                                var32 = var29.aC();
                                                                                var26 = var28.aC();
                                                                                if (!z.lIIIlllIIllIlll(var32)) break block33;
                                                                                if (!z.lIIIlllIIllIllI(var26)) break block34;
                                                                                0;
                                                                                if (((0x5E ^ 0x6F ^ (0x44 ^ 0x56)) & (0x59 ^ 0x66 ^ (0x98 ^ 0x84) ^ -1)) != 0) {
                                                                                    return ((125 + 2 - 41 + 53 ^ 110 + 157 - 247 + 157) & (0x64 ^ 0x55 ^ (0x83 ^ 0x88) ^ -1)) != 0;
                                                                                }
                                                                                break block35;
                                                                            }
                                                                            if (!z.lIIIlllIIllIlII(((Object)var32).equals(var26) ? 1 : 0)) break block34;
                                                                        }
                                                                        return lllIllllllIl[2];
                                                                    }
                                                                    var14 = var29.aB();
                                                                    var13 = var28.aB();
                                                                    if (!z.lIIIlllIIllIlll((Object)var14)) break block36;
                                                                    if (!z.lIIIlllIIllIllI((Object)var13)) break block37;
                                                                    0;
                                                                    if (-1 != -1) {
                                                                        return false;
                                                                    }
                                                                    break block38;
                                                                }
                                                                if (!z.lIIIlllIIllIlII(((Object)((Object)var14)).equals((Object)var13) ? 1 : 0)) break block37;
                                                            }
                                                            return lllIllllllIl[2];
                                                        }
                                                        var4 = var29.ac();
                                                        var23 = var28.ac();
                                                        if (!z.lIIIlllIIllIlll(var4)) break block39;
                                                        if (!z.lIIIlllIIllIllI(var23)) break block40;
                                                        0;
                                                        if (((0x67 ^ 0x20) & ~(0x48 ^ 0xF)) != 0) {
                                                            return false;
                                                        }
                                                        break block41;
                                                    }
                                                    if (!z.lIIIlllIIllIlII(var4.equals(var23) ? 1 : 0)) break block40;
                                                }
                                                return lllIllllllIl[2];
                                            }
                                            var7 = var29.bS();
                                            var21 = var28.bS();
                                            if (!z.lIIIlllIIllIlll(var7)) break block42;
                                            if (!z.lIIIlllIIllIllI(var21)) break block43;
                                            0;
                                            if (2 >= 3) {
                                                return false;
                                            }
                                            break block44;
                                        }
                                        if (!z.lIIIlllIIllIlII(var7.equals(var21) ? 1 : 0)) break block43;
                                    }
                                    return lllIllllllIl[2];
                                }
                                var30 = var29.bT();
                                var19 = var28.bT();
                                if (!z.lIIIlllIIllIlll(var30)) break block45;
                                if (!z.lIIIlllIIllIllI(var19)) break block46;
                                0;
                                if (-1 == 3) {
                                    return ((50 + 188 - 189 + 189 ^ 141 + 33 - 33 + 48) & (0x58 ^ 0x43 ^ (0x68 ^ 0x20) ^ -1)) != 0;
                                }
                                break block47;
                            }
                            if (!z.lIIIlllIIllIlII(var30.equals(var19) ? 1 : 0)) break block46;
                        }
                        return lllIllllllIl[2];
                    }
                    var3 = var29.bU();
                    var22 = var28.bU();
                    if (!z.lIIIlllIIllIlll(var3)) break block48;
                    if (!z.lIIIlllIIllIllI(var22)) break block49;
                    0;
                    if (((0x8C ^ 0xAC) & ~(0 ^ 0x20)) > 0) {
                        return false;
                    }
                    break block50;
                }
                if (!z.lIIIlllIIllIlII(var3.equals(var22) ? 1 : 0)) break block49;
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
        z.lllIllllllIl[0] = 3;
        z.lllIllllllIl[1] = 1;
        z.lllIllllllIl[2] = (0x57 ^ 0x6F ^ (0x7F ^ 0x54)) & (0xD ^ 0x35 ^ (0xEB ^ 0xC0) ^ -1);
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
        z var17;
        int n7;
        int n8 = lllIllllllIl[3];
        int n9 = lllIllllllIl[1];
        e e2 = this.aC();
        int n10 = n9 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(e2)) {
            n7 = lllIllllllIl[4];
            0;
            
            }
        } else {
            void var2;
            n7 = var2.hashCode();
        }
        int var33 = n10 + n7;
        SquireNightmarePlugin var8 = var17.aB();
        int n11 = var33 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll((Object)var8)) {
            n6 = lllIllllllIl[4];
            0;
            if (3 <= 1) {
                return (0x88 ^ 0xA1 ^ (0x7F ^ 0x6C)) & (0xEF ^ 0x9A ^ (0xCB ^ 0x84) ^ -1);
            }
        } else {
            n6 = ((Object)((Object)var8)).hashCode();
        }
        var33 = n11 + n6;
        WorldArea var20 = var17.ac();
        int n12 = var33 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(var20)) {
            n5 = lllIllllllIl[4];
            0;
            if (-2 >= 0) {
                return (0x61 ^ 0x72 ^ (0x9C ^ 0xB5)) & (0xAD ^ 0xB5 ^ (0x40 ^ 0x62) ^ -1);
            }
        } else {
            n5 = var20.hashCode();
        }
        var33 = n12 + n5;
        WorldPoint var10 = var17.bS();
        int n13 = var33 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(var10)) {
            n4 = lllIllllllIl[4];
            0;
            if (2 <= 1) {
                return (0x5B ^ 2) & ~(0x18 ^ 0x41);
            }
        } else {
            n4 = var10.hashCode();
        }
        var33 = n13 + n4;
        WorldArea var5 = var17.bT();
        int n14 = var33 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(var5)) {
            n3 = lllIllllllIl[4];
            0;
            if ((0x6B ^ 0x6F) != (0x8F ^ 0x8B)) {
                return (0x6D ^ 0x2C) & ~(0xE ^ 0x4F);
            }
        } else {
            n3 = var5.hashCode();
        }
        var33 = n14 + n3;
        WorldPoint var31 = var17.bU();
        int n15 = var33 * lllIllllllIl[3];
        if (z.lIIIlllIIllIlll(var31)) {
            n2 = lllIllllllIl[4];
            0;
            if (((205 + 39 - 157 + 124 ^ 76 + 40 - 83 + 117) & (0x91 ^ 0xC4 ^ (0x77 ^ 0x67) ^ -1)) == 3) {
                return (0x44 ^ 0xE ^ (0x61 ^ 7)) & (0x2A ^ 0x12 ^ (0xB7 ^ 0xA3) ^ -1);
            }
        } else {
            n2 = var31.hashCode();
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
        z var24;
        if (!z.lIIIlllIIllIIll(Static.getClient().getPlane(), lllIllllllIl[0]) || z.lIIIlllIIllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        if (z.lIIIlllIIllIlIl(var24.cB.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        List<WorldArea> var15 = e.ax();
        if (z.lIIIlllIIllIllI(var15)) {
            Iterator<WorldArea> var11 = var15.iterator();
            while (z.lIIIlllIIllIlIl(var11.hasNext() ? 1 : 0)) {
                WorldArea var9 = var11.next();
                Iterator var16 = var9.toWorldPointList().iterator();
                while (z.lIIIlllIIllIlIl(var16.hasNext() ? 1 : 0)) {
                    void var12;
                    WorldPoint var27 = (WorldPoint)var16.next();
                    LocalPoint var1 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var27);
                    if (z.lIIIlllIIllIlll(var1)) {
                        0;
                        if (((78 + 110 - 86 + 142 ^ 134 + 112 - 148 + 96) & (0x60 ^ 0x57 ^ 1 ^ -1)) >= 0) continue;
                        return null;
                    }
                    Polygon var18 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var1);
                    if (z.lIIIlllIIllIlll(var18)) {
                        0;
                        
                        return null;
                    }
                    Color var6 = Color.BLACK;
                    OverlayUtil.renderPolygon((Graphics2D)var12, (Shape)var18, (Color)var6);
                    0;
                    if (-(0x86 ^ 0x8B ^ (0x72 ^ 0x7B)) <= 0) continue;
                    return null;
                }
                0;
                if (2 == 2) continue;
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

