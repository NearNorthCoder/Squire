/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.runelite.client.ui.overlay.outline.ModelOutlineRenderer
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.tithefarm.tasks;

import gg.squire.tithefarm.SquireTitheConfig;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.tithefarm.tasks.GameEnum4;
import gg.squire.tithefarm.tasks.GameEnum;
import gg.squire.tithefarm.tasks.TithefarmManager;

public class TithefarmManager
extends Overlay {
    
    private final  ModelOutlineRenderer B;
    private final  SquireTitheConfig z;
    
    private final  Client C;
    private final  i A;
    private final  SquireTitheFarm y;
    private final  Map<g, TileObject> D;

    private static boolean var3(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4;
        g[] gArray = g.values();
        int n2 = gArray.length;
        int var5 = var1[0];
        while (j.var6(var5, (int)var4)) {
            void var7;
            j var8;
            void var9;
            void var10 = var9[var5];
            var8.a((Graphics2D)var7, (g)var10);
            ++var5;
            0;
            if (2 > 0) continue;
            return null;
        }
        return null;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (j.var6(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static void var27() {
        var2 = new String[var1[4]];
        j.var2[j.var1[0]] = "Planted by: %s";
        j.var2[j.var1[1]] = "Type: %s";
    }

    private static boolean var28(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, g g2) {
        void var3_3;
        void var4_4;
        void var5_5;
        void var6_6;
        Color var29;
        Color color;
        void var30;
        j var31;
        if (j.var28((Object)g2)) {
            return;
        }
        TileObject var32 = var31.D.get(var30);
        if (j.var28(var32)) {
            return;
        }
        Point var33 = var32.getCanvasLocation();
        if (j.var28(var33)) {
            return;
        }
        Player var34 = var31.A.w().get(var30);
        if (!j.var3(var34) || j.var35(var34, var31.C.getLocalPlayer())) {
            color = Color.GREEN;
            0;
            if (-1 == 1) {
                return;
            }
        } else {
            color = Color.RED;
        }
        if (j.var35(var29 = color, Color.GREEN)) {
            return;
        }
        this.B.drawOutline(this.D.get((Object)g2), var1[1], (Color)var6_6, var1[1]);
        Object[] objectArray = new Object[var1[1]];
        objectArray[j.var1[0]] = var5_5.getName();
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(var1[2], var1[2]), (String)String.format(var2[var1[0]], objectArray), (Color)var6_6);
        Object[] objectArray2 = new Object[var1[1]];
        objectArray2[j.var1[0]] = e.c(var3_3.getId());
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(var1[2], var1[3]), (String)String.format(var2[var1[1]], objectArray2), (Color)var6_6);
    }

    private static void var36() {
        var1 = new int[5];
        j.var1[0] = (0x75 ^ 0x7C) & ~(0xA4 ^ 0xAD);
        j.var1[1] = 1;
        j.var1[2] = 0x37 ^ 0x23;
        j.var1[3] = 0xD ^ 0x17 ^ (0x60 ^ 0x64);
        j.var1[4] = 2;
    }

    private static boolean var35(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameTick gameTick) {
        void var37;
        this.D.clear();
        g[] gArray = this.z.rotation().o();
        int n2 = gArray.length;
        int var38 = var1[0];
        while (j.var6(var38, (int)var37)) {
            void var39;
            void var40;
            void v0 = var40 = var39[var38];
            Objects.requireNonNull(v0);
            0;
            TileObject var41 = TileObjects.getNearest(((g)v0)::a);
            if (j.var3(var41)) {
                j var42;
                var42.D.put((g)var40, var41);
                0;
            }
            ++var38;
            0;
            if (((0x10 ^ 0x23 ^ (0xD0 ^ 0xBB)) & (0xA0 ^ 0x9C ^ (0x79 ^ 0x1D) ^ -1)) == ((0x6D ^ 0x79 ^ (0x15 ^ 0x13)) & (0xA ^ 6 ^ (0x6F ^ 0x71) ^ -1))) continue;
            return;
        }
    }

    static {
        j.var36();
        j.var27();
    }

    @Inject
    public TithefarmManager(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig, i i2, ModelOutlineRenderer modelOutlineRenderer, Client client) {
        this.D = new HashMap<g, TileObject>();
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.y = squireTitheFarm;
        this.z = squireTitheConfig;
        this.A = i2;
        this.B = modelOutlineRenderer;
        this.C = client;
    }
}

