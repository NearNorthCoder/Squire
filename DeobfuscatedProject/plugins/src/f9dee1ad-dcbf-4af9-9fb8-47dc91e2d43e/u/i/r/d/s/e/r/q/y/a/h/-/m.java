/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Perspective
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.api.entities.Players
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.Players;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.e;
import u.i.r.d.s.e.r.q.y.a.h.-.h;

public class m
extends Overlay {
    private static /* synthetic */ int[] llllIlIIIlIl;
    private final /* synthetic */ Client aj;
    private final /* synthetic */ SquireAlchemicalHydraConfig ai;
    private final /* synthetic */ SquireAlchemicalHydraPlugin ah;
    private static /* synthetic */ String[] llllIlIIIlII;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void lllllllllllllllIIlIlIIllIIIllIII;
        Projectile lllllllllllllllIIlIlIIllIIIlIIll;
        Object lllllllllllllllIIlIlIIllIIIlIlII;
        m lllllllllllllllIIlIlIIllIIIllIIl;
        if (m.lIIlIIIIlIIIIII(this.aj.getGameState(), GameState.LOGGED_IN)) {
            return null;
        }
        a lllllllllllllllIIlIlIIllIIIlIlll = lllllllllllllllIIlIlIIllIIIllIIl.ah.a();
        e lllllllllllllllIIlIlIIllIIIlIllI = lllllllllllllllIIlIlIIllIIIllIIl.ah.b();
        if (!m.lIIlIIIIlIIIIIl(lllllllllllllllIIlIlIIllIIIlIllI) || m.lIIlIIIIlIIIIlI(lllllllllllllllIIlIlIIllIIIlIlll)) {
            return null;
        }
        Object lllllllllllllllIIlIlIIllIIIlIlIl = lllllllllllllllIIlIlIIllIIIlIlll.i().keySet().iterator();
        while (m.lIIlIIIIlIIIIll(lllllllllllllllIIlIlIIllIIIlIlIl.hasNext() ? 1 : 0)) {
            lllllllllllllllIIlIlIIllIIIlIlII = lllllllllllllllIIlIlIIllIIIlIlIl.next();
            lllllllllllllllIIlIlIIllIIIlIIll = lllllllllllllllIIlIlIIllIIIlIlll.i().get(lllllllllllllllIIlIlIIllIIIlIlII);
            if (m.lIIlIIIIlIIIIlI(lllllllllllllllIIlIlIIllIIIlIIll)) {
                "".length();
                if (-" ".length() != ((0x39 ^ 0x37) & ~(0xBF ^ 0xB1))) continue;
                return null;
            }
            OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIIlIlIIllIIIllIII, (Shape)Perspective.getCanvasTilePoly((Client)lllllllllllllllIIlIlIIllIIIllIIl.aj, (LocalPoint)lllllllllllllllIIlIlIIllIIIlIlII), (Color)Color.GREEN);
            "".length();
            if (null == null) continue;
            return null;
        }
        Object[] objectArray = new Object[llllIlIIIlIl[1]];
        objectArray[m.llllIlIIIlIl[0]] = lllllllllllllllIIlIlIIllIIIlIllI.l();
        objectArray[m.llllIlIIIlIl[2]] = lllllllllllllllIIlIlIIllIIIlIllI.w();
        lllllllllllllllIIlIlIIllIIIlIlIl = String.format(llllIlIIIlII[llllIlIIIlIl[0]], objectArray);
        OverlayUtil.renderActorOverlay((Graphics2D)lllllllllllllllIIlIlIIllIIIllIII, (Actor)Players.getLocal(), (String)lllllllllllllllIIlIlIIllIIIlIlIl, (Color)Color.GREEN);
        lllllllllllllllIIlIlIIllIIIlIlII = lllllllllllllllIIlIlIIllIIIlIlll.k();
        if (m.lIIlIIIIlIIIIIl(lllllllllllllllIIlIlIIllIIIlIlII) && m.lIIlIIIIlIIIIIl(((h)lllllllllllllllIIlIlIIllIIIlIlII).K())) {
            String string;
            lllllllllllllllIIlIlIIllIIIlIIll = ((h)lllllllllllllllIIlIlIIllIIIlIlII).K().getInteracting();
            String string2 = llllIlIIIlII[llllIlIIIlIl[2]];
            Object[] objectArray2 = new Object[llllIlIIIlIl[3]];
            objectArray2[m.llllIlIIIlIl[0]] = lllllllllllllllIIlIlIIllIIIlIlll.l();
            objectArray2[m.llllIlIIIlIl[2]] = ((h)lllllllllllllllIIlIlIIllIIIlIlII).S();
            objectArray2[m.llllIlIIIlIl[1]] = lllllllllllllllIIlIlIIllIIIlIlll.k().Q();
            int n2 = llllIlIIIlIl[4];
            if (m.lIIlIIIIlIIIIlI(lllllllllllllllIIlIlIIllIIIlIIll)) {
                string = llllIlIIIlII[llllIlIIIlIl[1]];
                "".length();
                if ("  ".length() >= (0x25 ^ 0x22 ^ "   ".length())) {
                    return null;
                }
            } else {
                string = lllllllllllllllIIlIlIIllIIIlIIll.getName();
            }
            objectArray2[n2] = string;
            String lllllllllllllllIIlIlIIllIIIlIIlI = String.format(string2, objectArray2);
            OverlayUtil.renderActorOverlay((Graphics2D)lllllllllllllllIIlIlIIllIIIllIII, (Actor)((h)lllllllllllllllIIlIlIIllIIIlIlII).K(), (String)lllllllllllllllIIlIlIIllIIIlIIlI, (Color)Color.GREEN);
        }
        return null;
    }

    private static boolean lIIlIIIIlIIIIIl(Object object) {
        return object != null;
    }

    static {
        m.lIIlIIIIIllllll();
        m.lIIlIIIIIlllllI();
    }

    private static boolean lIIlIIIIlIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIlIIIIIllllIl(String lllllllllllllllIIlIlIIlIlllllIll, String lllllllllllllllIIlIlIIlIlllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIlllllIlI.getBytes(StandardCharsets.UTF_8)), llllIlIIIlIl[5]), "DES");
            Cipher lllllllllllllllIIlIlIIlIllllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIllllllll.init(llllIlIIIlIl[1], lllllllllllllllIIlIlIIllIIIIIIII);
            return new String(lllllllllllllllIIlIlIIlIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIlllllllI) {
            lllllllllllllllIIlIlIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIlllllI() {
        llllIlIIIlII = new String[llllIlIIIlIl[4]];
        m.llllIlIIIlII[m.llllIlIIIlIl[0]] = m.lIIlIIIIIllllII("n/+aD7rn6QuXL1NGNJz+OA==", "uXNKx");
        m.llllIlIIIlII[m.llllIlIIIlIl[2]] = m.lIIlIIIIIllllIl("0bNcIbqhMSnXBtNW+Q2ces0upLZEMMEWXf47GUhCugxvpUQYDIgkMTcQVfK3+lgQ", "kqdud");
        m.llllIlIIIlII[m.llllIlIIIlIl[1]] = m.lIIlIIIIIllllII("zTUlrzLORhQ=", "HxyOV");
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIIlIl = new int[6];
        m.llllIlIIIlIl[0] = (0x10 ^ 0x16) & ~(0x7D ^ 0x7B);
        m.llllIlIIIlIl[1] = "  ".length();
        m.llllIlIIIlIl[2] = " ".length();
        m.llllIlIIIlIl[3] = 0xA7 ^ 0xA3;
        m.llllIlIIIlIl[4] = "   ".length();
        m.llllIlIIIlIl[5] = 0x8E ^ 0x86;
    }

    @Inject
    public m(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.ah = squireAlchemicalHydraPlugin;
        this.ai = squireAlchemicalHydraConfig;
        this.aj = client;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static String lIIlIIIIIllllII(String lllllllllllllllIIlIlIIllIIIIlIII, String lllllllllllllllIIlIlIIllIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllIIIIllII.init(llllIlIIIlIl[1], lllllllllllllllIIlIlIIllIIIIllIl);
            return new String(lllllllllllllllIIlIlIIllIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIllIIIIlIll) {
            lllllllllllllllIIlIlIIllIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIIIlI(Object object) {
        return object == null;
    }
}

