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
        void var1;
        Projectile var2;
        Object var7;
        m var5;
        if (m.lIIlIIIIlIIIIII(this.aj.getGameState(), GameState.LOGGED_IN)) {
            return null;
        }
        a var16 = var5.ah.a();
        e var14 = var5.ah.b();
        if (!m.lIIlIIIIlIIIIIl(var14) || m.lIIlIIIIlIIIIlI(var16)) {
            return null;
        }
        Object var11 = var16.i().keySet().iterator();
        while (m.lIIlIIIIlIIIIll(var11.hasNext() ? 1 : 0)) {
            var7 = var11.next();
            var2 = var16.i().get(var7);
            if (m.lIIlIIIIlIIIIlI(var2)) {
                0;
                if (-1 != ((0x39 ^ 0x37) & ~(0xBF ^ 0xB1))) continue;
                return null;
            }
            OverlayUtil.renderPolygon((Graphics2D)var1, (Shape)Perspective.getCanvasTilePoly((Client)var5.aj, (LocalPoint)var7), (Color)Color.GREEN);
            0;
            
            return null;
        }
        Object[] objectArray = new Object[llllIlIIIlIl[1]];
        objectArray[m.llllIlIIIlIl[0]] = var14.l();
        objectArray[m.llllIlIIIlIl[2]] = var14.w();
        var11 = String.format(llllIlIIIlII[llllIlIIIlIl[0]], objectArray);
        OverlayUtil.renderActorOverlay((Graphics2D)var1, (Actor)Players.getLocal(), (String)var11, (Color)Color.GREEN);
        var7 = var16.k();
        if (m.lIIlIIIIlIIIIIl(var7) && m.lIIlIIIIlIIIIIl(((h)var7).K())) {
            String string;
            var2 = ((h)var7).K().getInteracting();
            String string2 = llllIlIIIlII[llllIlIIIlIl[2]];
            Object[] objectArray2 = new Object[llllIlIIIlIl[3]];
            objectArray2[m.llllIlIIIlIl[0]] = var16.l();
            objectArray2[m.llllIlIIIlIl[2]] = ((h)var7).S();
            objectArray2[m.llllIlIIIlIl[1]] = var16.k().Q();
            int n2 = llllIlIIIlIl[4];
            if (m.lIIlIIIIlIIIIlI(var2)) {
                string = llllIlIIIlII[llllIlIIIlIl[1]];
                0;
                if (2 >= (0x25 ^ 0x22 ^ 3)) {
                    return null;
                }
            } else {
                string = var2.getName();
            }
            objectArray2[n2] = string;
            String var17 = String.format(string2, objectArray2);
            OverlayUtil.renderActorOverlay((Graphics2D)var1, (Actor)((h)var7).K(), (String)var17, (Color)Color.GREEN);
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

    private static String lIIlIIIIIllllIl(String var12, String var18) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), llllIlIIIlIl[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llllIlIIIlIl[1], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIlllllI() {
        llllIlIIIlII = new String[llllIlIIIlIl[4]];
        m.llllIlIIIlII[m.llllIlIIIlIl[0]] = m."LA %d, AS %d";
        m.llllIlIIIlII[m.llllIlIIIlIl[2]] = m."LA %d, Phase: %s, Immune: %s, Interacting %s";
        m.llllIlIIIlII[m.llllIlIIIlIl[1]] = m."none";
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIIlIl = new int[6];
        m.llllIlIIIlIl[0] = (0x10 ^ 0x16) & ~(0x7D ^ 0x7B);
        m.llllIlIIIlIl[1] = 2;
        m.llllIlIIIlIl[2] = 1;
        m.llllIlIIIlIl[3] = 0xA7 ^ 0xA3;
        m.llllIlIIIlIl[4] = 3;
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

    private static String lIIlIIIIIllllII(String var3, String var13) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllIlIIIlIl[1], var15);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIIIlI(Object object) {
        return object == null;
    }
}

