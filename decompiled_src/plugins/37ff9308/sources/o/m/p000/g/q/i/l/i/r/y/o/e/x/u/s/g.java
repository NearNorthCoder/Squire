package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.mixology.SquireMixology;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.g  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/g.class */
public class g extends Overlay {
    private static /* synthetic */ String[] lllllllllIll;
    private static /* synthetic */ int[] llllllllllII;
    private final /* synthetic */ SquireMixology H;
    private static final /* synthetic */ Logger G;

    private static void lIIlIlIlllIlIlI() {
        llllllllllII = new int[12];
        llllllllllII[0] = "   ".length();
        llllllllllII[1] = (232 ^ 173) & ((217 ^ 156) ^ (-1));
        llllllllllII[2] = (-((-13165) & 31597)) & (-1313) & 32764;
        llllllllllII[3] = " ".length();
        llllllllllII[4] = (-((-14877) & 32573)) & (-9) & 30719;
        llllllllllII[5] = "  ".length();
        llllllllllII[6] = (-((-25209) & 28539)) & (-16393) & 32734;
        llllllllllII[7] = (((((152 + 212) - 347) + 210) + (200 ^ 198)) - (((63 + 128) - 43) + 88)) + ((2 + 4) - (-76)) + 168;
        llllllllllII[8] = 175 ^ 182;
        llllllllllII[9] = 98 ^ 89;
        llllllllllII[10] = (174 ^ 158) ^ (171 ^ 176);
        llllllllllII[11] = 85 ^ 93;
    }

    private static void lIIlIlIlllIlIIl() {
        lllllllllIll = new String[llllllllllII[3]];
        lllllllllIll[llllllllllII[1]] = lIIlIlIlllIlIII("7rx3FVX+8p5ZNW4kwr7sMw==", "PwAgu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (lIIlIlIlllIlIll(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlIlIlllIlllI(obj, this)) {
            return llllllllllII[3];
        }
        if (lIIlIlIlllIlIll(obj instanceof g ? 1 : 0)) {
            return llllllllllII[1];
        }
        g gVar = (g) obj;
        if (lIIlIlIlllIlIll(gVar.a(this) ? 1 : 0)) {
            return llllllllllII[1];
        }
        SquireMixology plugin = getPlugin();
        SquireMixology plugin2 = gVar.getPlugin();
        if (lIIlIlIlllIllIl(plugin)) {
            if (lIIlIlIlllIllll(plugin2)) {
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((((49 + 33) - (-16)) + 37) ^ (((81 + 12) - 58) + 151)) & (((22 ^ 8) ^ (184 ^ 155)) ^ (-" ".length()));
                }
                return llllllllllII[1];
            }
            return llllllllllII[3];
        }
    }

    private static boolean lIIlIlIlllIlIll(int i) {
        return i == 0;
    }

    public String toString() {
        return "MixologyOverlay(plugin=" + String.valueOf(getPlugin()) + ")";
    }

    private static String lIIlIlIlllIlIII(String lllllllllllllllIIlIIIIlIlIlIIlIl, String lllllllllllllllIIlIIIIlIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlIlIlIIllI.getBytes(StandardCharsets.UTF_8)), llllllllllII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllllllII[5], lllllllllllllllIIlIIIIlIlIlIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIlIlIlIlIII) {
            lllllllllllllllIIlIIIIlIlIlIlIII.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public SquireMixology getPlugin() {
        return this.H;
    }

    static {
        lIIlIlIlllIlIlI();
        lIIlIlIlllIlIIl();
        G = LoggerFactory.getLogger(g.class);
    }

    private static boolean lIIlIlIlllIllIl(Object obj) {
        return obj == null;
    }

    @Inject
    private g(SquireMixology squireMixology) {
        this.H = squireMixology;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static boolean lIIlIlIlllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    protected boolean a(Object obj) {
        return obj instanceof g;
    }

    public int hashCode() {
        int hashCode;
        int i = llllllllllII[9];
        int i2 = llllllllllII[3];
        SquireMixology plugin = getPlugin();
        int i3 = i2 * llllllllllII[9];
        if (lIIlIlIlllIllIl(plugin)) {
            hashCode = llllllllllII[10];
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (23 ^ 12) & ((218 ^ 193) ^ (-1));
            }
        } else {
            hashCode = plugin.hashCode();
        }
        return i3 + hashCode;
    }

    private static boolean lIIlIlIlllIllll(Object obj) {
        return obj != null;
    }

    public Dimension render(Graphics2D graphics2D) {
        int[] iArr = new int[llllllllllII[0]];
        iArr[llllllllllII[1]] = llllllllllII[2];
        iArr[llllllllllII[3]] = llllllllllII[4];
        iArr[llllllllllII[5]] = llllllllllII[6];
        List all = NPCs.getAll(iArr);
        if (lIIlIlIlllIlIll(all.isEmpty() ? 1 : 0)) {
            int i = llllllllllII[1];
            while (lIIlIlIlllIllII(i, all.size())) {
                new Color(llllllllllII[7], llllllllllII[1], llllllllllII[1], llllllllllII[8]);
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(Static.getClient(), ((NPC) all.get(i)).getLocalLocation());
                if (lIIlIlIlllIllIl(canvasTilePoly)) {
                    System.out.println(lllllllllIll[llllllllllII[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.GREEN, new BasicStroke(1.0f));
                i++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean lIIlIlIlllIllII(int i, int i2) {
        return i < i2;
    }
}
