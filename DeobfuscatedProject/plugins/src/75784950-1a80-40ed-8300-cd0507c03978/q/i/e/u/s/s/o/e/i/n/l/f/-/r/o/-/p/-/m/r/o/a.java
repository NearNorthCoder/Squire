/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class a
extends Overlay {
    private final /* synthetic */ SquireMoonsOfPeril n;
    private static /* synthetic */ String[] lIIIIIIlIIIIl;
    private static /* synthetic */ int[] lIIIIIIlIIIlI;
    private static final /* synthetic */ Logger m;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        int[] nArray = new int[lIIIIIIlIIIlI[0]];
        nArray[a.lIIIIIIlIIIlI[1]] = lIIIIIIlIIIlI[2];
        nArray[a.lIIIIIIlIIIlI[3]] = lIIIIIIlIIIlI[4];
        nArray[a.lIIIIIIlIIIlI[5]] = lIIIIIIlIIIlI[6];
        List list = NPCs.getAll((int[])nArray);
        if (a.lIIlIlllIlIIllI(list.isEmpty() ? 1 : 0)) {
            void lllllllllllllllIIIllllIIllIlIlIl;
            int lllllllllllllllIIIllllIIllIlIlII = lIIIIIIlIIIlI[1];
            while (a.lIIlIlllIlIIlll(lllllllllllllllIIIllllIIllIlIlII, lllllllllllllllIIIllllIIllIlIlIl.size())) {
                void lllllllllllllllIIIllllIIllIlIllI;
                Color lllllllllllllllIIIllllIIllIlIIll = new Color(lIIIIIIlIIIlI[7], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[8]);
                Polygon lllllllllllllllIIIllllIIllIlIIlI = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)((NPC)lllllllllllllllIIIllllIIllIlIlIl.get(lllllllllllllllIIIllllIIllIlIlII)).getLocalLocation());
                if (a.lIIlIlllIlIlIII(lllllllllllllllIIIllllIIllIlIIlI)) {
                    System.out.println(lIIIIIIlIIIIl[lIIIIIIlIIIlI[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIIIllllIIllIlIllI, (Shape)lllllllllllllllIIIllllIIllIlIIlI, (Color)Color.GREEN, (Stroke)new BasicStroke(1.0f));
                ++lllllllllllllllIIIllllIIllIlIlII;
                "".length();
                if (-"   ".length() <= 0) continue;
                return null;
            }
        }
        return null;
    }

    public String toString() {
        return "MoonsOverlay(plugin=" + String.valueOf((Object)this.a()) + ")";
    }

    private static String lIIlIlllIlIIIll(String lllllllllllllllIIIllllIIlIlllIII, String lllllllllllllllIIIllllIIlIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIIlIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllIIlIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllIIlIlllIlI.init(lIIIIIIlIIIlI[5], lllllllllllllllIIIllllIIlIlllIll);
            return new String(lllllllllllllllIIIllllIIlIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllIIlIlllIIl) {
            lllllllllllllllIIIllllIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIlIIllI(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                SquireMoonsOfPeril lllllllllllllllIIIllllIIllIIlIII;
                SquireMoonsOfPeril lllllllllllllllIIIllllIIllIIlIIl;
                block8: {
                    a lllllllllllllllIIIllllIIllIIllII;
                    void lllllllllllllllIIIllllIIllIIlIll;
                    if (a.lIIlIlllIlIlIIl(object, (Object)this)) {
                        return lIIIIIIlIIIlI[3];
                    }
                    if (a.lIIlIlllIlIIllI(lllllllllllllllIIIllllIIllIIlIll instanceof a)) {
                        return lIIIIIIlIIIlI[1];
                    }
                    a lllllllllllllllIIIllllIIllIIlIlI = (a)lllllllllllllllIIIllllIIllIIlIll;
                    if (a.lIIlIlllIlIIllI(lllllllllllllllIIIllllIIllIIlIlI.a((Object)lllllllllllllllIIIllllIIllIIllII) ? 1 : 0)) {
                        return lIIIIIIlIIIlI[1];
                    }
                    lllllllllllllllIIIllllIIllIIlIIl = lllllllllllllllIIIllllIIllIIllII.a();
                    lllllllllllllllIIIllllIIllIIlIII = lllllllllllllllIIIllllIIllIIlIlI.a();
                    if (!a.lIIlIlllIlIlIII((Object)lllllllllllllllIIIllllIIllIIlIIl)) break block8;
                    if (!a.lIIlIlllIlIlIlI((Object)lllllllllllllllIIIllllIIllIIlIII)) break block9;
                    "".length();
                    if (((0x3E ^ 0x53 ^ (0x75 ^ 0xE)) & (0x83 ^ 0x99 ^ (0x7B ^ 0x77) ^ -" ".length())) != 0) {
                        return ((9 + 15 - -82 + 93 ^ 42 + 44 - 57 + 122) & (5 ^ 0x33 ^ (0x2E ^ 0x48) ^ -" ".length())) != 0;
                    }
                    break block10;
                }
                if (!a.lIIlIlllIlIIllI(((Object)((Object)lllllllllllllllIIIllllIIllIIlIIl)).equals((Object)lllllllllllllllIIIllllIIllIIlIII) ? 1 : 0)) break block9;
            }
            return lIIIIIIlIIIlI[1];
        }
        return lIIIIIIlIIIlI[3];
    }

    private static boolean lIIlIlllIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlllIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllIlIlIII(Object object) {
        return object == null;
    }

    protected boolean a(Object object) {
        return object instanceof a;
    }

    @Inject
    private a(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.n = squireMoonsOfPeril;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    public /* synthetic */ Plugin getPlugin() {
        return this.a();
    }

    private static void lIIlIlllIlIIlII() {
        lIIIIIIlIIIIl = new String[lIIIIIIlIIIlI[3]];
        a.lIIIIIIlIIIIl[a.lIIIIIIlIIIlI[1]] = a.lIIlIlllIlIIIll("j5LEGmTCR31yijIgPK9U7w==", "qGKuH");
    }

    private static void lIIlIlllIlIIlIl() {
        lIIIIIIlIIIlI = new int[11];
        a.lIIIIIIlIIIlI[0] = "   ".length();
        a.lIIIIIIlIIIlI[1] = (0x63 ^ 0x33 ^ (0x3B ^ 0x7C)) & (7 ^ 0x16 ^ (0xAF ^ 0xA9) ^ -" ".length());
        a.lIIIIIIlIIIlI[2] = -(0xFFFFC527 & 0x7BFB) & (0xFFFFF3FE & Short.MAX_VALUE);
        a.lIIIIIIlIIIlI[3] = " ".length();
        a.lIIIIIIlIIIlI[4] = -(0xFFFFCDAB & 0x3F5D) & (0xFFFFFFFF & 0x3FDF);
        a.lIIIIIIlIIIlI[5] = "  ".length();
        a.lIIIIIIlIIIlI[6] = 0xFFFFF6D5 & 0x3BFE;
        a.lIIIIIIlIIIlI[7] = 158 + 28 - 0 + 9 + (75 + 208 - 275 + 206) - (128 + 113 - 190 + 196) + (0xED ^ 0xB0);
        a.lIIIIIIlIIIlI[8] = 0xB4 ^ 0xAD;
        a.lIIIIIIlIIIlI[9] = 28 + 14 - -14 + 92 ^ 102 + 45 - 8 + 36;
        a.lIIIIIIlIIIlI[10] = 0x97 ^ 0xBC;
    }

    public SquireMoonsOfPeril a() {
        return this.n;
    }

    private static boolean lIIlIlllIlIIlll(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2 = lIIIIIIlIIIlI[9];
        int n3 = lIIIIIIlIIIlI[3];
        SquireMoonsOfPeril squireMoonsOfPeril = this.a();
        int n4 = n3 * lIIIIIIlIIIlI[9];
        if (a.lIIlIlllIlIlIII((Object)squireMoonsOfPeril)) {
            n = lIIIIIIlIIIlI[10];
            "".length();
            if ((157 + 15 - 167 + 172 ^ 11 + 67 - -89 + 14) <= "   ".length()) {
                return (66 + 68 - -32 + 9 ^ 152 + 7 - 117 + 138) & (0x46 ^ 0x31 ^ (0x73 ^ 0x1F) ^ -" ".length());
            }
        } else {
            void lllllllllllllllIIIllllIIllIIIIII;
            n = lllllllllllllllIIIllllIIllIIIIII.hashCode();
        }
        n3 = n4 + n;
        return n3;
    }

    static {
        a.lIIlIlllIlIIlIl();
        a.lIIlIlllIlIIlII();
        m = LoggerFactory.getLogger(a.class);
    }
}

