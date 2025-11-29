package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
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
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.ay  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/ay.class */
public class C0025ay extends Overlay {
    private /* synthetic */ C0042q bv;
    private static /* synthetic */ String[] lIlllllllIll;
    private static /* synthetic */ int[] lIllllllllIl;
    private final /* synthetic */ Map<N, TileObject> bG = new HashMap();
    private final /* synthetic */ SquireFarmer bH;
    private final /* synthetic */ C0031f bJ;
    private final /* synthetic */ SquireFarmerConfig bI;
    private final /* synthetic */ ModelOutlineRenderer bK;
    private final /* synthetic */ Client bL;

    private static String llllIIIIlIIIII(String lllllllllllllllIlIlIlllIlIIlIlIl, String lllllllllllllllIlIlIlllIlIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIlIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllllllIl[5], lllllllllllllllIlIlIlllIlIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIlIIlIllI) {
            lllllllllllllllIlIlIlllIlIIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIlIlIII(Object obj) {
        return obj == null;
    }

    private void a(Graphics2D graphics2D, N n) {
        if (llllIIIIlIlIII(n)) {
            return;
        }
        C0014an aI = n.aI();
        if (llllIIIIlIlIlI(this.bG.containsKey(n) ? 1 : 0)) {
            return;
        }
        Point canvasLocation = this.bG.get(n).getCanvasLocation();
        if (llllIIIIlIlIII(canvasLocation)) {
            return;
        }
        this.bK.drawOutline(this.bG.get(n), lIllllllllIl[1], aI.aZ().V(), lIllllllllIl[1]);
        Point offset = canvasLocation.offset(lIllllllllIl[2], lIllllllllIl[2]);
        String str = lIlllllllIll[lIllllllllIl[0]];
        Object[] objArr = new Object[lIllllllllIl[1]];
        objArr[lIllllllllIl[0]] = aI.aZ().name();
        OverlayUtil.renderTextLocation(graphics2D, offset, String.format(str, objArr), aI.aZ().V());
        Point offset2 = canvasLocation.offset(lIllllllllIl[2], lIllllllllIl[3]);
        String str2 = lIlllllllIll[lIllllllllIl[1]];
        Object[] objArr2 = new Object[lIllllllllIl[1]];
        objArr2[lIllllllllIl[0]] = aI.aY();
        OverlayUtil.renderTextLocation(graphics2D, offset2, String.format(str2, objArr2), aI.aZ().V());
        Point offset3 = canvasLocation.offset(lIllllllllIl[2], lIllllllllIl[4]);
        String str3 = lIlllllllIll[lIllllllllIl[5]];
        Object[] objArr3 = new Object[lIllllllllIl[1]];
        objArr3[lIllllllllIl[0]] = Integer.valueOf(aI.bb());
        OverlayUtil.renderTextLocation(graphics2D, offset3, String.format(str3, objArr3), aI.aZ().V());
    }

    private static void llllIIIIlIIlll() {
        lIllllllllIl = new int[8];
        lIllllllllIl[0] = ((93 ^ 55) ^ (253 ^ 135)) & (((184 ^ 155) ^ (164 ^ 151)) ^ (-" ".length()));
        lIllllllllIl[1] = " ".length();
        lIllllllllIl[2] = (49 ^ 54) ^ (0 ^ 19);
        lIllllllllIl[3] = (208 ^ 157) ^ (105 ^ 58);
        lIllllllllIl[4] = (4 ^ 114) ^ (100 ^ 58);
        lIllllllllIl[5] = "  ".length();
        lIllllllllIl[6] = "   ".length();
        lIllllllllIl[7] = 98 ^ 106;
    }

    private static boolean llllIIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIIIIlIlIlI(int i) {
        return i == 0;
    }

    static {
        llllIIIIlIIlll();
        llllIIIIlIIIll();
    }

    @Inject
    public C0025ay(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0031f c0031f, ModelOutlineRenderer modelOutlineRenderer, Client client) {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
        this.bH = squireFarmer;
        this.bI = squireFarmerConfig;
        this.bJ = c0031f;
        this.bK = modelOutlineRenderer;
        this.bL = client;
    }

    public Dimension render(Graphics2D graphics2D) {
        C0042q x = this.bJ.x();
        if (llllIIIIlIlIII(x)) {
            return null;
        }
        a(graphics2D, this.bJ.v());
        a(graphics2D, x.aa());
        return null;
    }

    private static void llllIIIIlIIIll() {
        lIlllllllIll = new String[lIllllllllIl[6]];
        lIlllllllIll[lIllllllllIl[0]] = llllIIIIlIIIII("HBlYevpuc25PyJf3yXDwpg==", "GCIpA");
        lIlllllllIll[lIllllllllIl[1]] = llllIIIIlIIIIl("mm4+d059xoiqaahfzgZQdg==", "kYbcO");
        lIlllllllIll[lIllllllllIl[5]] = llllIIIIlIIIII("ThPAZFX4iMA6IRsclhIGiw==", "atJKL");
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.bv = this.bJ.x();
        if (llllIIIIlIlIII(this.bv)) {
            return;
        }
        N[] ae = this.bv.ae();
        int length = ae.length;
        int i = lIllllllllIl[0];
        while (llllIIIIlIlIIl(i, length)) {
            N n = ae[i];
            if (llllIIIIlIlIII(n)) {
                "".length();
                if (((70 ^ 15) & ((72 ^ 1) ^ (-1))) < 0) {
                    return;
                }
            } else {
                TileObject b = n.b(this.bL);
                if (llllIIIIlIlIII(b)) {
                    this.bG.remove(n);
                    "".length();
                    "".length();
                    if ("   ".length() == (117 ^ 113)) {
                        return;
                    }
                } else {
                    this.bG.put(n, b);
                    "".length();
                }
            }
            i++;
            "".length();
            if ("   ".length() == ((103 ^ 62) & ((236 ^ 181) ^ (-1)))) {
                return;
            }
        }
    }

    private static String llllIIIIlIIIIl(String lllllllllllllllIlIlIlllIlIIIlIII, String lllllllllllllllIlIlIlllIlIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIllllllllIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllllllIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIlIIIlIIl) {
            lllllllllllllllIlIlIlllIlIIIlIIl.printStackTrace();
            return null;
        }
    }
}
