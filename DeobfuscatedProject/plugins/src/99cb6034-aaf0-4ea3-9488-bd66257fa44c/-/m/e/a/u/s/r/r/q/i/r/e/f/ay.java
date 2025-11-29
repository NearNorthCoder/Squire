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

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
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

public class ay
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

    private static String llllIIIIlIIIII(String lllllllllllllllIlIlIlllIlIIlIlIl, String lllllllllllllllIlIlIlllIlIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIlIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlllIlIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlllIlIIlIlll.init(lIllllllllIl[5], lllllllllllllllIlIlIlllIlIIllIII);
            return new String(lllllllllllllllIlIlIlllIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIlIIlIllI) {
            lllllllllllllllIlIlIlllIlIIlIllI.printStackTrace();
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
        ay lllllllllllllllIlIlIlllIlIlIIIIl;
        void lllllllllllllllIlIlIlllIlIIlllll;
        if (ay.llllIIIIlIlIII(n2)) {
            return;
        }
        an lllllllllllllllIlIlIlllIlIIllllI = lllllllllllllllIlIlIlllIlIIlllll.aI();
        if (ay.llllIIIIlIlIlI(lllllllllllllllIlIlIlllIlIlIIIIl.bG.containsKey(lllllllllllllllIlIlIlllIlIIlllll) ? 1 : 0)) {
            return;
        }
        Point lllllllllllllllIlIlIlllIlIIlllIl = lllllllllllllllIlIlIlllIlIlIIIIl.bG.get(lllllllllllllllIlIlIlllIlIIlllll).getCanvasLocation();
        if (ay.llllIIIIlIlIII(lllllllllllllllIlIlIlllIlIIlllIl)) {
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
        ay.lIllllllllIl[0] = (0x5D ^ 0x37 ^ (0xFD ^ 0x87)) & (0xB8 ^ 0x9B ^ (0xA4 ^ 0x97) ^ -" ".length());
        ay.lIllllllllIl[1] = " ".length();
        ay.lIllllllllIl[2] = 0x31 ^ 0x36 ^ (0 ^ 0x13);
        ay.lIllllllllIl[3] = 0xD0 ^ 0x9D ^ (0x69 ^ 0x3A);
        ay.lIllllllllIl[4] = 4 ^ 0x72 ^ (0x64 ^ 0x3A);
        ay.lIllllllllIl[5] = "  ".length();
        ay.lIllllllllIl[6] = "   ".length();
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
        ay.lIlllllllIll[ay.lIllllllllIl[0]] = ay.llllIIIIlIIIII("HBlYevpuc25PyJf3yXDwpg==", "GCIpA");
        ay.lIlllllllIll[ay.lIllllllllIl[1]] = ay.llllIIIIlIIIIl("mm4+d059xoiqaahfzgZQdg==", "kYbcO");
        ay.lIlllllllIll[ay.lIllllllllIl[5]] = ay.llllIIIIlIIIII("ThPAZFX4iMA6IRsclhIGiw==", "atJKL");
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        ay lllllllllllllllIlIlIlllIlIllIIlI;
        this.bv = this.bJ.x();
        if (ay.llllIIIIlIlIII(this.bv)) {
            return;
        }
        N[] lllllllllllllllIlIlIlllIlIllIIIl = lllllllllllllllIlIlIlllIlIllIIlI.bv.ae();
        int lllllllllllllllIlIlIlllIlIllIIII = lllllllllllllllIlIlIlllIlIllIIIl.length;
        int lllllllllllllllIlIlIlllIlIlIllll = lIllllllllIl[0];
        while (ay.llllIIIIlIlIIl(lllllllllllllllIlIlIlllIlIlIllll, lllllllllllllllIlIlIlllIlIllIIII)) {
            N lllllllllllllllIlIlIlllIlIlIlllI = lllllllllllllllIlIlIlllIlIllIIIl[lllllllllllllllIlIlIlllIlIlIllll];
            if (ay.llllIIIIlIlIII(lllllllllllllllIlIlIlllIlIlIlllI)) {
                "".length();
                if (((0x46 ^ 0xF) & ~(0x48 ^ 1)) < 0) {
                    return;
                }
            } else {
                TileObject lllllllllllllllIlIlIlllIlIlIllIl = lllllllllllllllIlIlIlllIlIlIlllI.b(lllllllllllllllIlIlIlllIlIllIIlI.bL);
                if (ay.llllIIIIlIlIII(lllllllllllllllIlIlIlllIlIlIllIl)) {
                    lllllllllllllllIlIlIlllIlIllIIlI.bG.remove(lllllllllllllllIlIlIlllIlIlIlllI);
                    "".length();
                    "".length();
                    if ("   ".length() == (0x75 ^ 0x71)) {
                        return;
                    }
                } else {
                    lllllllllllllllIlIlIlllIlIllIIlI.bG.put(lllllllllllllllIlIlIlllIlIlIlllI, lllllllllllllllIlIlIlllIlIlIllIl);
                    "".length();
                }
            }
            ++lllllllllllllllIlIlIlllIlIlIllll;
            "".length();
            if ("   ".length() != ((0x67 ^ 0x3E) & ~(0xEC ^ 0xB5))) continue;
            return;
        }
    }

    private static String llllIIIIlIIIIl(String lllllllllllllllIlIlIlllIlIIIlIII, String lllllllllllllllIlIlIlllIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIllllllllIl[7]), "DES");
            Cipher lllllllllllllllIlIlIlllIlIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlllIlIIIlIlI.init(lIllllllllIl[5], lllllllllllllllIlIlIlllIlIIIlIll);
            return new String(lllllllllllllllIlIlIlllIlIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIlIIIlIIl) {
            lllllllllllllllIlIlIlllIlIIIlIIl.printStackTrace();
            return null;
        }
    }
}

