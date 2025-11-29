/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.runelite.client.ui.overlay.outline.ModelOutlineRenderer
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;

public class ay_Unknown
extends Overlay {
    private /* synthetic */ q bv;
    private static /* synthetic */ String[] lIlllllllIll;
    private static /* synthetic */ int[] lIllllllllIl;
    private final /* synthetic */ Map<N, TileObject> bG;
    private final /* synthetic */ SquireFarmer bH;
    private final /* synthetic */ f bJ;
    private final /* synthetic */ SquireFarmerConfig bI;
    private final /* synthetic */ ModelOutlineRenderer bK;
    private final /* synthetic */ Client bL;

    private static String llllIIIIlIIIII(String var16, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIllllllllIl[5], var2);
            return new String(var19.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIlIlIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, N n2) {
        void var4_4;
        void var3_3;
        ay var5;
        void var12;
        if (ay.llllIIIIlIlIII(n2)) {
            return;
        }
        an lllllllllllllllIlIlIlllIlIIllllI = var12.aI();
        if (ay.llllIIIIlIlIlI(var5.bG.containsKey(var12) ? 1 : 0)) {
            return;
        }
        Point var1 = var5.bG.get(var12).getCanvasLocation();
        if (ay.llllIIIIlIlIII(var1)) {
            return;
        }
        this.bK.drawOutline(this.bG.get(n2), lIllllllllIl[1], var3_3.aZ().V(), lIllllllllIl[1]);
        Object[] objectArray = new Object[lIllllllllIl[1]];
        objectArray[ay.lIllllllllIl[0]] = var3_3.aZ().name();
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(lIllllllllIl[2], lIllllllllIl[2]), (String)String.format(lIlllllllIll[lIllllllllIl[0]], objectArray), (Color)var3_3.aZ().V());
        Object[] objectArray2 = new Object[lIllllllllIl[1]];
        objectArray2[ay.lIllllllllIl[0]] = var3_3.aY();
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(lIllllllllIl[2], lIllllllllIl[3]), (String)String.format(lIlllllllIll[lIllllllllIl[1]], objectArray2), (Color)var3_3.aZ().V());
        Object[] objectArray3 = new Object[lIllllllllIl[1]];
        objectArray3[ay.lIllllllllIl[0]] = var3_3.bb();
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var4_4.offset(lIllllllllIl[2], lIllllllllIl[4]), (String)String.format(lIlllllllIll[lIllllllllIl[5]], objectArray3), (Color)var3_3.aZ().V());
    }

    private static void llllIIIIlIIlll() {
        lIllllllllIl = new int[8];
        ay.lIllllllllIl[0] = (0x5D ^ 0x37 ^ (0xFD ^ 0x87)) & (0xB8 ^ 0x9B ^ (0xA4 ^ 0x97) ^ -1);
        ay.lIllllllllIl[1] = 1;
        ay.lIllllllllIl[2] = 0x31 ^ 0x36 ^ (0 ^ 0x13);
        ay.lIllllllllIl[3] = 0xD0 ^ 0x9D ^ (0x69 ^ 0x3A);
        ay.lIllllllllIl[4] = 4 ^ 0x72 ^ (0x64 ^ 0x3A);
        ay.lIllllllllIl[5] = 2;
        ay.lIllllllllIl[6] = 3;
        ay.lIllllllllIl[7] = 0x62 ^ 0x6A;
    }

    private static boolean llllIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    static {
        ay.llllIIIIlIIlll();
        ay.llllIIIIlIIIll();
    }

    @Inject
    public ay(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, f f2, ModelOutlineRenderer modelOutlineRenderer, Client client) {
        this.bG = new HashMap<N, TileObject>();
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.bH = squireFarmer;
        this.bI = squireFarmerConfig;
        this.bJ = f2;
        this.bK = modelOutlineRenderer;
        this.bL = client;
    }

    public Dimension render(Graphics2D graphics2D) {
        q q2 = this.bJ.x();
        if (ay.llllIIIIlIlIII(q2)) {
            return null;
        }
        this.a(graphics2D, this.bJ.v());
        this.a(graphics2D, q2.aa());
        return null;
    }

    private static void llllIIIIlIIIll() {
        lIlllllllIll = new String[lIllllllllIl[6]];
        ay.lIlllllllIll[ay.lIllllllllIl[0]] = ay."Crop state: %s";
        ay.lIlllllllIll[ay.lIllllllllIl[1]] = ay."Produce: %s";
        ay.lIlllllllIll[ay.lIllllllllIl[5]] = ay."Stage: %d";
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        ay var14;
        this.bv = this.bJ.x();
        if (ay.llllIIIIlIlIII(this.bv)) {
            return;
        }
        N[] var17 = var14.bv.ae();
        int var6 = var17.length;
        int var18 = lIllllllllIl[0];
        while (ay.llllIIIIlIlIIl(var18, var6)) {
            N var3 = var17[var18];
            if (ay.llllIIIIlIlIII(var3)) {
                0;
                if (((0x46 ^ 0xF) & ~(0x48 ^ 1)) < 0) {
                    return;
                }
            } else {
                TileObject var8 = var3.b(var14.bL);
                if (ay.llllIIIIlIlIII(var8)) {
                    var14.bG.remove(var3);
                    0;
                    0;
                    if (3 == (0x75 ^ 0x71)) {
                        return;
                    }
                } else {
                    var14.bG.put(var3, var8);
                    0;
                }
            }
            ++var18;
            0;
            if (3 != ((0x67 ^ 0x3E) & ~(0xEC ^ 0xB5))) continue;
            return;
        }
    }

    private static String llllIIIIlIIIIl(String var9, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllllllllIl[7]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllllllllIl[5], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }
}

