/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
public class THelper
extends AutotoaTaskBase {
    
    private final  Client bW;
    
    private final  p bX;
    private final  TOAConfig bY;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        NPC var1;
        Iterator<NPC> var2;
        void var3;
        T var4;
        if (T.lIlIIIllIllIll(f.s())) {
            this.a(graphics2D, f.s(), Color.GREEN, llIIlllIIll[llIIlllIlII[0]]);
        }
        if (T.lIlIIIllIllIll(f.t())) {
            var4.a((Graphics2D)var3, f.t(), Color.BLUE, llIIlllIIll[llIIlllIlII[1]]);
        }
        if (T.lIlIIIllIllIll(f.u())) {
            var2 = f.u().iterator();
            while (T.lIlIIIllIlllII(var2.hasNext() ? 1 : 0)) {
                var1 = var2.next();
                var4.a((Graphics2D)var3, var1.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[2]]);

                return null;
            }
        }
        if (T.lIlIIIllIllIll(f.v())) {
            var2 = f.v().iterator();
            while (T.lIlIIIllIlllII(var2.hasNext() ? 1 : 0)) {
                var1 = var2.next();
                var4.a((Graphics2D)var3, var1.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[3]]);

                if (((0x27 ^ 0x74) & ~(0xEA ^ 0xB9)) == 0) continue;
                return null;
            }
        }
        return null;
    }

    static {
        T.lIlIIIllIllIlI();
        T.lIlIIIllIllIIl();
    }

    private static void lIlIIIllIllIIl() {
        llIIlllIIll = new String[llIIlllIlII[4]];
        T.llIIlllIIll[T.llIIlllIlII[0]] = "WaveDodge";
        T.llIIlllIIll[T.llIIlllIlII[1]] = "WalkNext";
        T.llIIlllIIll[T.llIIlllIlII[2]] = "NorthWave";
        T.llIIlllIIll[T.llIIlllIlII[3]] = "SouthWave";
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, String string) {
        void var6_6;
        void var5;
        T var6;
        LocalPoint localPoint = LocalPoint.fromWorld((Client)this.bW, (WorldPoint)worldPoint);
        if (T.lIlIIIllIlllIl(localPoint)) {
            return;
        }
        Point var7 = Perspective.localToCanvas((Client)var6.bW, (LocalPoint)var5, (int)var6.bW.getPlane());
        if (T.lIlIIIllIlllIl(var7)) {
            return;
        }
        this.a(graphics2D, color, localPoint);
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)var6_6, (String)string, (Color)Color.WHITE);
    }

    private static boolean lIlIIIllIllIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllIlllIl(Object object) {
        return object == null;
    }

        return String.valueOf(var8);
    }

    private static boolean lIlIIIllIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIlllII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected THelper(Client client, p p2, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bW = client;
        this.bX = p2;
        this.bY = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }
}

