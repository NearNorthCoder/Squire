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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.tithefarm.tasks.GameEnum12;
import gg.squire.tithefarm.tasks.GameEnum;
import gg.squire.tithefarm.tasks.IHelper;

public class TithefarmManager
extends Overlay {
    
    private final  ModelOutlineRenderer B;
    private final  SquireTitheConfig z;
    
    private final  Client C;
    private final  i A;
    private final  SquireTitheFarm y;
    private final  Map<g, TileObject> D;

    private static boolean lIllIlIlllIllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var1;
        g[] gArray = g.values();
        int n2 = gArray.length;
        int var2 = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(var2, (int)var1)) {
            void var3;
            j var4;
            void var5;
            void var6 = var5[var2];
            var4.a((Graphics2D)var3, (GameEnum) ar6);
            ++var2;

            if (2 > 0) continue;
            return null;
        }
        return null;
    }

        return String.valueOf(var7);
    }

    private static void lIllIlIlllIlIIl() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[4]];
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[0]] = "Planted by: %s";
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[1]] = "Type: %s";
    }

    private static boolean lIllIlIlllIllIl(Object object) {
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
        Color var8;
        Color color;
        void var9;
        j var10;
        if (j.lIllIlIlllIllIl((Object)g2)) {
            return;
        }
        TileObject var11 = var10.D.get(var9);
        if (j.lIllIlIlllIllIl(var11)) {
            return;
        }
        Point var12 = var11.getCanvasLocation();
        if (j.lIllIlIlllIllIl(var12)) {
            return;
        }
        Player var13 = var10.A.w().get(var9);
        if (!j.lIllIlIlllIllII(var13) || j.lIllIlIlllIlllI(var13, var10.C.getLocalPlayer())) {
            color = Color.GREEN;

            if (-1 == 1) {
                return;
            }
        } else {
            color = Color.RED;
        }
        if (j.lIllIlIlllIlllI(var8 = color, Color.GREEN)) {
            return;
        }
        this.B.drawOutline(this.D.get((Object)g2), lIIlllllIlIlI[1], (Color)var6_6, lIIlllllIlIlI[1]);
        Object[] objectArray = new Object[lIIlllllIlIlI[1]];
        objectArray[j.lIIlllllIlIlI[0]] = var5_5.getName();
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(lIIlllllIlIlI[2], lIIlllllIlIlI[2]), (String)String.format(lIIlllllIlIIl[lIIlllllIlIlI[0]], objectArray), (Color)var6_6);
        Object[] objectArray2 = new Object[lIIlllllIlIlI[1]];
        objectArray2[j.lIIlllllIlIlI[0]] = e.c(var3_3.getId());
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(lIIlllllIlIlI[2], lIIlllllIlIlI[3]), (String)String.format(lIIlllllIlIIl[lIIlllllIlIlI[1]], objectArray2), (Color)var6_6);
    }

    private static boolean lIllIlIlllIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameTick gameTick) {
        void var14;
        this.D.clear();
        g[] gArray = this.z.rotation().o();
        int n2 = gArray.length;
        int var15 = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(var15, (int)var14)) {
            void var16;
            void var17;
            void v0 = var17 = var16[var15];
            Objects.requireNonNull(v0);

            TileObject var18 = TileObjects.getNearest(((GameEnum) 0)::a);
            if (j.lIllIlIlllIllII(var18)) {
                j var19;
                var19.D.put((GameEnum) ar17, var18);

            }
            ++var15;

            if (((0x10 ^ 0x23 ^ (0xD0 ^ 0xBB)) & (0xA0 ^ 0x9C ^ (0x79 ^ 0x1D) ^ -1)) == ((0x6D ^ 0x79 ^ (0x15 ^ 0x13)) & (0xA ^ 6 ^ (0x6F ^ 0x71) ^ -1))) continue;
            return;
        }
    }

    static {
        j.lIllIlIlllIlIlI();
        j.lIllIlIlllIlIIl();
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

