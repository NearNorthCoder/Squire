/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class MoonsManager
extends Overlay {
    private final  SquireMoonsOfPeril n;

    private static final  Logger m;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        int[] nArray = new int[var2[0]];
        nArray[a.var2[1]] = var2[2];
        nArray[a.var2[3]] = var2[4];
        nArray[a.var2[5]] = var2[6];
        List list = NPCs.getAll((int[])nArray);
        if (a.var3(list.isEmpty() ? 1 : 0)) {
            void var4;
            int var5 = var2[1];
            while (a.var6(var5, var4.size())) {
                void var7;
                Color var8 = new Color(var2[7], var2[1], var2[1], var2[8]);
                Polygon var9 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)((NPC)var4.get(var5)).getLocalLocation());
                if (a.var10(var9)) {
                    System.out.println(var1[var2[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var7, (Shape)var9, (Color)Color.GREEN, (Stroke)new BasicStroke(1.0f));
                ++var5;
                0;
                if (-3 <= 0) continue;
                return null;
            }
        }
        return null;
    }

    public String toString() {
        return "MoonsOverlay(plugin=" + String.valueOf((Object)this.MoonsManager()) + ")";
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var3(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                SquireMoonsOfPeril var17;
                SquireMoonsOfPeril var18;
                block8: {
                    a var19;
                    void var20;
                    if (a.var21(object, (Object)this)) {
                        return var2[3];
                    }
                    if (a.var3(var20 instanceof a)) {
                        return var2[1];
                    }
                    a var22 = (a)var20;
                    if (a.var3(var22.MoonsManager((Object)var19) ? 1 : 0)) {
                        return var2[1];
                    }
                    var18 = var19.MoonsManager();
                    var17 = var22.MoonsManager();
                    if (!a.var10((Object)var18)) break block8;
                    if (!a.var23((Object)var17)) break block9;
                    0;
                    if (((0x3E ^ 0x53 ^ (0x75 ^ 0xE)) & (0x83 ^ 0x99 ^ (0x7B ^ 0x77) ^ -1)) != 0) {
                        return ((9 + 15 - -82 + 93 ^ 42 + 44 - 57 + 122) & (5 ^ 0x33 ^ (0x2E ^ 0x48) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!a.var3(((Object)((Object)var18)).equals((Object)var17) ? 1 : 0)) break block9;
            }
            return var2[1];
        }
        return var2[3];
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var23(Object object) {
        return object != null;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    protected boolean MoonsManager(Object object) {
        return object instanceof a;
    }

    @Inject
    private MoonsManager(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.n = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    public  Plugin getPlugin() {
        return this.MoonsManager();
    }

    private static void var24() {
        var1 = new String[var2[3]];
        a.var1[a.var2[1]] = "poly is null";
    }

    private static void var25() {
        var2 = new int[11];
        a.var2[0] = 3;
        a.var2[1] = (0x63 ^ 0x33 ^ (0x3B ^ 0x7C)) & (7 ^ 0x16 ^ (0xAF ^ 0xA9) ^ -1);
        a.var2[2] = -(0xFFFFC527 & 0x7BFB) & (0xFFFFF3FE & Short.MAX_VALUE);
        a.var2[3] = 1;
        a.var2[4] = -(0xFFFFCDAB & 0x3F5D) & (0xFFFFFFFF & 0x3FDF);
        a.var2[5] = 2;
        a.var2[6] = 0xFFFFF6D5 & 0x3BFE;
        a.var2[7] = 158 + 28 - 0 + 9 + (75 + 208 - 275 + 206) - (128 + 113 - 190 + 196) + (0xED ^ 0xB0);
        a.var2[8] = 0xB4 ^ 0xAD;
        a.var2[9] = 28 + 14 - -14 + 92 ^ 102 + 45 - 8 + 36;
        a.var2[10] = 0x97 ^ 0xBC;
    }

    public SquireMoonsOfPeril MoonsManager() {
        return this.n;
    }

    private static boolean var6(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2 = var2[9];
        int n3 = var2[3];
        SquireMoonsOfPeril squireMoonsOfPeril = this.MoonsManager();
        int n4 = n3 * var2[9];
        if (a.var10((Object)squireMoonsOfPeril)) {
            n = var2[10];
            0;
            if ((157 + 15 - 167 + 172 ^ 11 + 67 - -89 + 14) <= 3) {
                return (66 + 68 - -32 + 9 ^ 152 + 7 - 117 + 138) & (0x46 ^ 0x31 ^ (0x73 ^ 0x1F) ^ -1);
            }
        } else {
            void var26;
            n = var26.hashCode();
        }
        n3 = n4 + n;
        return n3;
    }

    static {
        a.var25();
        a.var24();
        m = LoggerFactory.getLogger(MoonsManager.class);
    }
}

