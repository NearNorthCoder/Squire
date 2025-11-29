package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.moons.SquireMoonsOfPeril;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.a  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/a.class */
public class a extends Overlay {
    private final /* synthetic */ SquireMoonsOfPeril n;
    private static /* synthetic */ String[] lIIIIIIlIIIIl;
    private static /* synthetic */ int[] lIIIIIIlIIIlI;
    private static final /* synthetic */ Logger m;

    public Dimension render(Graphics2D graphics2D) {
        int[] iArr = new int[lIIIIIIlIIIlI[0]];
        iArr[lIIIIIIlIIIlI[1]] = lIIIIIIlIIIlI[2];
        iArr[lIIIIIIlIIIlI[3]] = lIIIIIIlIIIlI[4];
        iArr[lIIIIIIlIIIlI[5]] = lIIIIIIlIIIlI[6];
        List all = NPCs.getAll(iArr);
        if (lIIlIlllIlIIllI(all.isEmpty() ? 1 : 0)) {
            int i = lIIIIIIlIIIlI[1];
            while (lIIlIlllIlIIlll(i, all.size())) {
                new Color(lIIIIIIlIIIlI[7], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[1], lIIIIIIlIIIlI[8]);
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(Static.getClient(), ((NPC) all.get(i)).getLocalLocation());
                if (lIIlIlllIlIlIII(canvasTilePoly)) {
                    System.out.println(lIIIIIIlIIIIl[lIIIIIIlIIIlI[1]]);
                    return null;
                }
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.GREEN, new BasicStroke(1.0f));
                i++;
                "".length();
                if ((-"   ".length()) > 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public String toString() {
        return "MoonsOverlay(plugin=" + String.valueOf(getPlugin()) + ")";
    }

    private static String lIIlIlllIlIIIll(String lllllllllllllllIIIllllIIlIlllIII, String lllllllllllllllIIIllllIIlIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlIIIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIIlIlllIIl) {
            lllllllllllllllIIIllllIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIlIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
        if (lIIlIlllIlIIllI(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlIlllIlIlIIl(obj, this)) {
            return lIIIIIIlIIIlI[3];
        }
        if (lIIlIlllIlIIllI(obj instanceof a ? 1 : 0)) {
            return lIIIIIIlIIIlI[1];
        }
        a aVar = (a) obj;
        if (lIIlIlllIlIIllI(aVar.a(this) ? 1 : 0)) {
            return lIIIIIIlIIIlI[1];
        }
        SquireMoonsOfPeril plugin = getPlugin();
        SquireMoonsOfPeril plugin2 = aVar.getPlugin();
        if (lIIlIlllIlIlIII(plugin)) {
            if (lIIlIlllIlIlIlI(plugin2)) {
                "".length();
                if ((((62 ^ 83) ^ (117 ^ 14)) & (((131 ^ 153) ^ (123 ^ 119)) ^ (-" ".length()))) != 0) {
                    return ((((9 + 15) - (-82)) + 93) ^ (((42 + 44) - 57) + 122)) & (((5 ^ 51) ^ (46 ^ 72)) ^ (-" ".length()));
                }
                return lIIIIIIlIIIlI[1];
            }
            return lIIIIIIlIIIlI[3];
        }
    }

    private static boolean lIIlIlllIlIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlllIlIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlllIlIlIII(Object obj) {
        return obj == null;
    }

    protected boolean a(Object obj) {
        return obj instanceof a;
    }

    @Inject
    private a(SquireMoonsOfPeril squireMoonsOfPeril) {
        this.n = squireMoonsOfPeril;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static void lIIlIlllIlIIlII() {
        lIIIIIIlIIIIl = new String[lIIIIIIlIIIlI[3]];
        lIIIIIIlIIIIl[lIIIIIIlIIIlI[1]] = lIIlIlllIlIIIll("j5LEGmTCR31yijIgPK9U7w==", "qGKuH");
    }

    private static void lIIlIlllIlIIlIl() {
        lIIIIIIlIIIlI = new int[11];
        lIIIIIIlIIIlI[0] = "   ".length();
        lIIIIIIlIIIlI[1] = ((99 ^ 51) ^ (59 ^ 124)) & (((7 ^ 22) ^ (175 ^ 169)) ^ (-" ".length()));
        lIIIIIIlIIIlI[2] = (-((-15065) & 31739)) & (-3074) & 32767;
        lIIIIIIlIIIlI[3] = " ".length();
        lIIIIIIlIIIlI[4] = (-((-12885) & 16221)) & (-1) & 16351;
        lIIIIIIlIIIlI[5] = "  ".length();
        lIIIIIIlIIIlI[6] = (-2347) & 15358;
        lIIIIIIlIIIlI[7] = (((((158 + 28) - 0) + 9) + (((75 + 208) - 275) + 206)) - (((128 + 113) - 190) + 196)) + (237 ^ 176);
        lIIIIIIlIIIlI[8] = 180 ^ 173;
        lIIIIIIlIIIlI[9] = (((28 + 14) - (-14)) + 92) ^ (((102 + 45) - 8) + 36);
        lIIIIIIlIIIlI[10] = 151 ^ 188;
    }

    /* renamed from: a */
    public SquireMoonsOfPeril getPlugin() {
        return this.n;
    }

    private static boolean lIIlIlllIlIIlll(int i, int i2) {
        return i < i2;
    }

    public int hashCode() {
        int hashCode;
        int i = lIIIIIIlIIIlI[9];
        int i2 = lIIIIIIlIIIlI[3];
        SquireMoonsOfPeril plugin = getPlugin();
        int i3 = i2 * lIIIIIIlIIIlI[9];
        if (lIIlIlllIlIlIII(plugin)) {
            hashCode = lIIIIIIlIIIlI[10];
            "".length();
            if (((((157 + 15) - 167) + 172) ^ (((11 + 67) - (-89)) + 14)) <= "   ".length()) {
                return ((((66 + 68) - (-32)) + 9) ^ (((152 + 7) - 117) + 138)) & (((70 ^ 49) ^ (115 ^ 31)) ^ (-" ".length()));
            }
        } else {
            hashCode = plugin.hashCode();
        }
        return i3 + hashCode;
    }

    static {
        lIIlIlllIlIIlIl();
        lIIlIlllIlIIlII();
        m = LoggerFactory.getLogger(a.class);
    }
}
