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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;

@Singleton
public class T
extends S {
    private static /* synthetic */ int[] llIIlllIlII;
    private final /* synthetic */ Client bW;
    private static /* synthetic */ String[] llIIlllIIll;
    private final /* synthetic */ p bX;
    private final /* synthetic */ TOAConfig bY;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        NPC llllllllllllllllIIlllIlIllIIllll;
        Iterator<NPC> llllllllllllllllIIlllIlIllIlIIII;
        void llllllllllllllllIIlllIlIllIlIIIl;
        T llllllllllllllllIIlllIlIllIlIIlI;
        if (T.lIlIIIllIllIll(f.s())) {
            this.a(graphics2D, f.s(), Color.GREEN, llIIlllIIll[llIIlllIlII[0]]);
        }
        if (T.lIlIIIllIllIll(f.t())) {
            llllllllllllllllIIlllIlIllIlIIlI.a((Graphics2D)llllllllllllllllIIlllIlIllIlIIIl, f.t(), Color.BLUE, llIIlllIIll[llIIlllIlII[1]]);
        }
        if (T.lIlIIIllIllIll(f.u())) {
            llllllllllllllllIIlllIlIllIlIIII = f.u().iterator();
            while (T.lIlIIIllIlllII(llllllllllllllllIIlllIlIllIlIIII.hasNext() ? 1 : 0)) {
                llllllllllllllllIIlllIlIllIIllll = llllllllllllllllIIlllIlIllIlIIII.next();
                llllllllllllllllIIlllIlIllIlIIlI.a((Graphics2D)llllllllllllllllIIlllIlIllIlIIIl, llllllllllllllllIIlllIlIllIIllll.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[2]]);
                "".length();
                if (null == null) continue;
                return null;
            }
        }
        if (T.lIlIIIllIllIll(f.v())) {
            llllllllllllllllIIlllIlIllIlIIII = f.v().iterator();
            while (T.lIlIIIllIlllII(llllllllllllllllIIlllIlIllIlIIII.hasNext() ? 1 : 0)) {
                llllllllllllllllIIlllIlIllIIllll = llllllllllllllllIIlllIlIllIlIIII.next();
                llllllllllllllllIIlllIlIllIlIIlI.a((Graphics2D)llllllllllllllllIIlllIlIllIlIIIl, llllllllllllllllIIlllIlIllIIllll.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[3]]);
                "".length();
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
        T.llIIlllIIll[T.llIIlllIlII[0]] = T.lIlIIIllIlIlll("Dww3IRQ3CSYh", "XmADP");
        T.llIIlllIIll[T.llIIlllIlII[1]] = T.lIlIIIllIllIII("TQCxZ3tUWaytE5VTeoFmmg==", "QJZos");
        T.llIIlllIIll[T.llIIlllIlII[2]] = T.lIlIIIllIlIlll("DTokIgEUNCAz", "CUVVi");
        T.llIIlllIIll[T.llIIlllIlII[3]] = T.lIlIIIllIllIII("GxPpIqZzdg7Qexy69HZ9kQ==", "sngoz");
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, String string) {
        void var6_6;
        void llllllllllllllllIIlllIlIllIIIIlI;
        T llllllllllllllllIIlllIlIllIIIlll;
        LocalPoint localPoint = LocalPoint.fromWorld((Client)this.bW, (WorldPoint)worldPoint);
        if (T.lIlIIIllIlllIl(localPoint)) {
            return;
        }
        Point llllllllllllllllIIlllIlIllIIIIIl = Perspective.localToCanvas((Client)llllllllllllllllIIlllIlIllIIIlll.bW, (LocalPoint)llllllllllllllllIIlllIlIllIIIIlI, (int)llllllllllllllllIIlllIlIllIIIlll.bW.getPlane());
        if (T.lIlIIIllIlllIl(llllllllllllllllIIlllIlIllIIIIIl)) {
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

    private static String lIlIIIllIlIlll(String llllllllllllllllIIlllIlIlIlIlIIl, String llllllllllllllllIIlllIlIlIlIIIll) {
        llllllllllllllllIIlllIlIlIlIlIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlIlIlIIlll = new StringBuilder();
        char[] llllllllllllllllIIlllIlIlIlIIllI = llllllllllllllllIIlllIlIlIlIIIll.toCharArray();
        int llllllllllllllllIIlllIlIlIlIIlIl = llIIlllIlII[0];
        char[] llllllllllllllllIIlllIlIlIIlllll = llllllllllllllllIIlllIlIlIlIlIIl.toCharArray();
        int llllllllllllllllIIlllIlIlIIllllI = llllllllllllllllIIlllIlIlIIlllll.length;
        int llllllllllllllllIIlllIlIlIIlllIl = llIIlllIlII[0];
        while (T.lIlIIIllIllllI(llllllllllllllllIIlllIlIlIIlllIl, llllllllllllllllIIlllIlIlIIllllI)) {
            char llllllllllllllllIIlllIlIlIlIlIlI = llllllllllllllllIIlllIlIlIIlllll[llllllllllllllllIIlllIlIlIIlllIl];
            llllllllllllllllIIlllIlIlIlIIlll.append((char)(llllllllllllllllIIlllIlIlIlIlIlI ^ llllllllllllllllIIlllIlIlIlIIllI[llllllllllllllllIIlllIlIlIlIIlIl % llllllllllllllllIIlllIlIlIlIIllI.length]));
            "".length();
            ++llllllllllllllllIIlllIlIlIlIIlIl;
            ++llllllllllllllllIIlllIlIlIIlllIl;
            "".length();
            if ((0x6B ^ 0x6F) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIlIlIlIIlll);
    }

    private static boolean lIlIIIllIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIllIllIII(String llllllllllllllllIIlllIlIlIllIlll, String llllllllllllllllIIlllIlIlIlllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIlIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), llIIlllIlII[5]), "DES");
            Cipher llllllllllllllllIIlllIlIlIlllIll = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlIlIlllIll.init(llIIlllIlII[2], llllllllllllllllIIlllIlIlIllllII);
            return new String(llllllllllllllllIIlllIlIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlIlIlllIlI) {
            llllllllllllllllIIlllIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlllII(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllIllIlI() {
        llIIlllIlII = new int[6];
        T.llIIlllIlII[0] = (113 + 112 - 218 + 144 ^ 6 + 95 - 67 + 125) & (146 + 27 - 87 + 105 ^ 34 + 112 - -2 + 35 ^ -" ".length());
        T.llIIlllIlII[1] = " ".length();
        T.llIIlllIlII[2] = "  ".length();
        T.llIIlllIlII[3] = "   ".length();
        T.llIIlllIlII[4] = 0x4D ^ 0x49;
        T.llIIlllIlII[5] = 0xD ^ 5;
    }

    @Inject
    protected T(Client client, p p2, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bW = client;
        this.bX = p2;
        this.bY = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }
}

