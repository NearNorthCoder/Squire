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
        void llllllllllllllIlllIIllIIllIIllll;
        g[] gArray = g.values();
        int n2 = gArray.length;
        int llllllllllllllIlllIIllIIllIIlllI = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(llllllllllllllIlllIIllIIllIIlllI, (int)llllllllllllllIlllIIllIIllIIllll)) {
            void llllllllllllllIlllIIllIIllIlIIIl;
            j llllllllllllllIlllIIllIIllIlIIlI;
            void llllllllllllllIlllIIllIIllIlIIII;
            void llllllllllllllIlllIIllIIllIIllIl = llllllllllllllIlllIIllIIllIlIIII[llllllllllllllIlllIIllIIllIIlllI];
            llllllllllllllIlllIIllIIllIlIIlI.a((Graphics2D)llllllllllllllIlllIIllIIllIlIIIl, (g)llllllllllllllIlllIIllIIllIIllIl);
            ++llllllllllllllIlllIIllIIllIIlllI;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return null;
    }

    private static String lIllIlIlllIIlll(String llllllllllllllIlllIIllIIlIIllIll, String llllllllllllllIlllIIllIIlIIllIlI) {
        llllllllllllllIlllIIllIIlIIllIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIlIIllIIl = new StringBuilder();
        char[] llllllllllllllIlllIIllIIlIIllIII = llllllllllllllIlllIIllIIlIIllIlI.toCharArray();
        int llllllllllllllIlllIIllIIlIIlIlll = lIIlllllIlIlI[0];
        char[] llllllllllllllIlllIIllIIlIIlIIIl = llllllllllllllIlllIIllIIlIIllIll.toCharArray();
        int llllllllllllllIlllIIllIIlIIlIIII = llllllllllllllIlllIIllIIlIIlIIIl.length;
        int llllllllllllllIlllIIllIIlIIIllll = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(llllllllllllllIlllIIllIIlIIIllll, llllllllllllllIlllIIllIIlIIlIIII)) {
            char llllllllllllllIlllIIllIIlIIlllII = llllllllllllllIlllIIllIIlIIlIIIl[llllllllllllllIlllIIllIIlIIIllll];
            llllllllllllllIlllIIllIIlIIllIIl.append((char)(llllllllllllllIlllIIllIIlIIlllII ^ llllllllllllllIlllIIllIIlIIllIII[llllllllllllllIlllIIllIIlIIlIlll % llllllllllllllIlllIIllIIlIIllIII.length]));
            "".length();
            ++llllllllllllllIlllIIllIIlIIlIlll;
            ++llllllllllllllIlllIIllIIlIIIllll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIlIIllIIl);
    }

    private static String lIllIlIlllIlIII(String llllllllllllllIlllIIllIIlIlIlIll, String llllllllllllllIlllIIllIIlIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIlIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIlIlIllIl.init(lIIlllllIlIlI[4], llllllllllllllIlllIIllIIlIlIlllI);
            return new String(llllllllllllllIlllIIllIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIlIlIllII) {
            llllllllllllllIlllIIllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlllIlIIl() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[4]];
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[0]] = j.lIllIlIlllIIlll("JQggLDcQAGEgOk9EZDE=", "udABC");
        j.lIIlllllIlIIl[j.lIIlllllIlIlI[1]] = j.lIllIlIlllIlIII("U4Yx8rJzF26nUurGKC+sDA==", "iXnBc");
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
        Color llllllllllllllIlllIIllIIlIllIIll;
        Color color;
        void llllllllllllllIlllIIllIIlIllIlll;
        j llllllllllllllIlllIIllIIlIlllIIl;
        if (j.lIllIlIlllIllIl((Object)g2)) {
            return;
        }
        TileObject llllllllllllllIlllIIllIIlIllIllI = llllllllllllllIlllIIllIIlIlllIIl.D.get(llllllllllllllIlllIIllIIlIllIlll);
        if (j.lIllIlIlllIllIl(llllllllllllllIlllIIllIIlIllIllI)) {
            return;
        }
        Point llllllllllllllIlllIIllIIlIllIlIl = llllllllllllllIlllIIllIIlIllIllI.getCanvasLocation();
        if (j.lIllIlIlllIllIl(llllllllllllllIlllIIllIIlIllIlIl)) {
            return;
        }
        Player llllllllllllllIlllIIllIIlIllIlII = llllllllllllllIlllIIllIIlIlllIIl.A.w().get(llllllllllllllIlllIIllIIlIllIlll);
        if (!j.lIllIlIlllIllII(llllllllllllllIlllIIllIIlIllIlII) || j.lIllIlIlllIlllI(llllllllllllllIlllIIllIIlIllIlII, llllllllllllllIlllIIllIIlIlllIIl.C.getLocalPlayer())) {
            color = Color.GREEN;
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        } else {
            color = Color.RED;
        }
        if (j.lIllIlIlllIlllI(llllllllllllllIlllIIllIIlIllIIll = color, Color.GREEN)) {
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
        j.lIIlllllIlIlI[1] = " ".length();
        j.lIIlllllIlIlI[2] = 0x37 ^ 0x23;
        j.lIIlllllIlIlI[3] = 0xD ^ 0x17 ^ (0x60 ^ 0x64);
        j.lIIlllllIlIlI[4] = "  ".length();
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
        void llllllllllllllIlllIIllIIllIIIlII;
        this.D.clear();
        g[] gArray = this.z.rotation().o();
        int n2 = gArray.length;
        int llllllllllllllIlllIIllIIllIIIIll = lIIlllllIlIlI[0];
        while (j.lIllIlIlllIlIll(llllllllllllllIlllIIllIIllIIIIll, (int)llllllllllllllIlllIIllIIllIIIlII)) {
            void llllllllllllllIlllIIllIIllIIIlIl;
            void llllllllllllllIlllIIllIIllIIIIlI;
            void v0 = llllllllllllllIlllIIllIIllIIIIlI = llllllllllllllIlllIIllIIllIIIlIl[llllllllllllllIlllIIllIIllIIIIll];
            Objects.requireNonNull(v0);
            "".length();
            TileObject llllllllllllllIlllIIllIIllIIIIIl = TileObjects.getNearest(((g)v0)::a);
            if (j.lIllIlIlllIllII(llllllllllllllIlllIIllIIllIIIIIl)) {
                j llllllllllllllIlllIIllIIllIIIllI;
                llllllllllllllIlllIIllIIllIIIllI.D.put((g)llllllllllllllIlllIIllIIllIIIIlI, llllllllllllllIlllIIllIIllIIIIIl);
                "".length();
            }
            ++llllllllllllllIlllIIllIIllIIIIll;
            "".length();
            if (((0x10 ^ 0x23 ^ (0xD0 ^ 0xBB)) & (0xA0 ^ 0x9C ^ (0x79 ^ 0x1D) ^ -" ".length())) == ((0x6D ^ 0x79 ^ (0x15 ^ 0x13)) & (0xA ^ 6 ^ (0x6F ^ 0x71) ^ -" ".length()))) continue;
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

