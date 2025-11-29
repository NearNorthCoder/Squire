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
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.e;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.g;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;

public class j
extends Overlay {
    private static /* synthetic */ int[] lIIlllllIlIlI;
    private final /* synthetic */ ModelOutlineRenderer B;
    private final /* synthetic */ SquireTitheConfig z;
    private static /* synthetic */ String[] lIIlllllIlIIl;
    private final /* synthetic */ Client C;
    private final /* synthetic */ i A;
    private final /* synthetic */ SquireTitheFarm y;
    private final /* synthetic */ Map<g, TileObject> D;

    private static boolean lIllIlIlllIllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var2;
        g[] gArray = g.values();
        int n2 = gArray.length;
        int var31 = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(var31, (int)var2)) {
            void var15;
            j var9;
            void var7;
            void var32 = var7[var31];
            var9.a((Graphics2D)var15, (g)var32);
            ++var31;
            0;
            if (2 > 0) continue;
            return null;
        }
        return null;
    }

    private static String lIllIlIlllIIlll(String var3, String var30) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var20 = var30.toCharArray();
        int var6 = lIIlllllIlIlI[0];
        char[] var29 = var3.toCharArray();
        int var4 = var29.length;
        int var10 = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(var10, var4)) {
            char var13 = var29[var10];
            var28.append((char)(var13 ^ var20[var6 % var20.length]));
            0;
            ++var6;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var28);
    }

    private static String lIllIlIlllIlIII(String var12, String var18) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIlllllIlIlI[4], var16);
            return new String(var19.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlllIlIIl() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[4]];
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[0]] = j."Planted by: %s";
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[1]] = j."Type: %s";
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
        Color var1;
        Color color;
        void var25;
        j var23;
        if (j.lIllIlIlllIllIl((Object)g2)) {
            return;
        }
        TileObject var17 = var23.D.get(var25);
        if (j.lIllIlIlllIllIl(var17)) {
            return;
        }
        Point var26 = var17.getCanvasLocation();
        if (j.lIllIlIlllIllIl(var26)) {
            return;
        }
        Player var5 = var23.A.w().get(var25);
        if (!j.lIllIlIlllIllII(var5) || j.lIllIlIlllIlllI(var5, var23.C.getLocalPlayer())) {
            color = Color.GREEN;
            0;
            if (-1 == 1) {
                return;
            }
        } else {
            color = Color.RED;
        }
        if (j.lIllIlIlllIlllI(var1 = color, Color.GREEN)) {
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

    private static void lIllIlIlllIlIlI() {
        lIIlllllIlIlI = new int[5];
        j.lIIlllllIlIlI[0] = (0x75 ^ 0x7C) & ~(0xA4 ^ 0xAD);
        j.lIIlllllIlIlI[1] = 1;
        j.lIIlllllIlIlI[2] = 0x37 ^ 0x23;
        j.lIIlllllIlIlI[3] = 0xD ^ 0x17 ^ (0x60 ^ 0x64);
        j.lIIlllllIlIlI[4] = 2;
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
        void var11;
        this.D.clear();
        g[] gArray = this.z.rotation().o();
        int n2 = gArray.length;
        int var24 = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(var24, (int)var11)) {
            void var22;
            void var14;
            void v0 = var14 = var22[var24];
            Objects.requireNonNull(v0);
            0;
            TileObject var8 = TileObjects.getNearest(((g)v0)::a);
            if (j.lIllIlIlllIllII(var8)) {
                j var27;
                var27.D.put((g)var14, var8);
                0;
            }
            ++var24;
            0;
            if (((0x10 ^ 0x23 ^ (0xD0 ^ 0xBB)) & (0xA0 ^ 0x9C ^ (0x79 ^ 0x1D) ^ -1)) == ((0x6D ^ 0x79 ^ (0x15 ^ 0x13)) & (0xA ^ 6 ^ (0x6F ^ 0x71) ^ -1))) continue;
            return;
        }
    }

    static {
        j.lIllIlIlllIlIlI();
        j.lIllIlIlllIlIIl();
    }

    @Inject
    public j(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig, i i2, ModelOutlineRenderer modelOutlineRenderer, Client client) {
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

