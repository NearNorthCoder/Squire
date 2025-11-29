package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.Players;
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.m  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/m.class */
public class m extends Overlay {
    private static /* synthetic */ int[] llllIlIIIlIl;
    private final /* synthetic */ Client aj;
    private final /* synthetic */ SquireAlchemicalHydraConfig ai;
    private final /* synthetic */ SquireAlchemicalHydraPlugin ah;
    private static /* synthetic */ String[] llllIlIIIlII;

    public Dimension render(Graphics2D graphics2D) {
        String name;
        if (lIIlIIIIlIIIIII(this.aj.getGameState(), GameState.LOGGED_IN)) {
            return null;
        }
        C0000a a = this.ah.a();
        e b = this.ah.b();
        if (!lIIlIIIIlIIIIIl(b) || lIIlIIIIlIIIIlI(a)) {
            return null;
        }
        for (LocalPoint localPoint : a.i().keySet()) {
            if (lIIlIIIIlIIIIlI(a.i().get(localPoint))) {
                "".length();
                if ((-" ".length()) == ((57 ^ 55) & ((191 ^ 177) ^ (-1)))) {
                    return null;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(this.aj, localPoint), Color.GREEN);
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        String str = llllIlIIIlII[llllIlIIIlIl[0]];
        Object[] objArr = new Object[llllIlIIIlIl[1]];
        objArr[llllIlIIIlIl[0]] = Integer.valueOf(b.l());
        objArr[llllIlIIIlIl[2]] = Integer.valueOf(b.w());
        String lllllllllllllllIIlIlIIllIIIlIlIl = String.format(str, objArr);
        OverlayUtil.renderActorOverlay(graphics2D, Players.getLocal(), lllllllllllllllIIlIlIIllIIIlIlIl, Color.GREEN);
        h k = a.k();
        if (lIIlIIIIlIIIIIl(k) && lIIlIIIIlIIIIIl(k.K())) {
            Actor interacting = k.K().getInteracting();
            String str2 = llllIlIIIlII[llllIlIIIlIl[2]];
            Object[] objArr2 = new Object[llllIlIIIlIl[3]];
            objArr2[llllIlIIIlIl[0]] = Integer.valueOf(a.l());
            objArr2[llllIlIIIlIl[2]] = k.S();
            objArr2[llllIlIIIlIl[1]] = Boolean.valueOf(a.k().Q());
            int i = llllIlIIIlIl[4];
            if (lIIlIIIIlIIIIlI(interacting)) {
                name = llllIlIIIlII[llllIlIIIlIl[1]];
                "".length();
                if ("  ".length() >= ((37 ^ 34) ^ "   ".length())) {
                    return null;
                }
            } else {
                name = interacting.getName();
            }
            objArr2[i] = name;
            OverlayUtil.renderActorOverlay(graphics2D, k.K(), String.format(str2, objArr2), Color.GREEN);
            return null;
        }
        return null;
    }

    private static boolean lIIlIIIIlIIIIIl(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIIIIllllll();
        lIIlIIIIIlllllI();
    }

    private static boolean lIIlIIIIlIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIlIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIlIIIIIllllIl(String lllllllllllllllIIlIlIIlIllllllIl, String lllllllllllllllIIlIlIIlIllllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIllllllII.getBytes(StandardCharsets.UTF_8)), llllIlIIIlIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIlllllllI) {
            lllllllllllllllIIlIlIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIlllllI() {
        llllIlIIIlII = new String[llllIlIIIlIl[4]];
        llllIlIIIlII[llllIlIIIlIl[0]] = lIIlIIIIIllllII("n/+aD7rn6QuXL1NGNJz+OA==", "uXNKx");
        llllIlIIIlII[llllIlIIIlIl[2]] = lIIlIIIIIllllIl("0bNcIbqhMSnXBtNW+Q2ces0upLZEMMEWXf47GUhCugxvpUQYDIgkMTcQVfK3+lgQ", "kqdud");
        llllIlIIIlII[llllIlIIIlIl[1]] = lIIlIIIIIllllII("zTUlrzLORhQ=", "HxyOV");
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIIlIl = new int[6];
        llllIlIIIlIl[0] = (16 ^ 22) & ((125 ^ 123) ^ (-1));
        llllIlIIIlIl[1] = "  ".length();
        llllIlIIIlIl[2] = " ".length();
        llllIlIIIlIl[3] = 167 ^ 163;
        llllIlIIIlIl[4] = "   ".length();
        llllIlIIIlIl[5] = 142 ^ 134;
    }

    @Inject
    public m(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, Client client) {
        this.ah = squireAlchemicalHydraPlugin;
        this.ai = squireAlchemicalHydraConfig;
        this.aj = client;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static String lIIlIIIIIllllII(String lllllllllllllllIIlIlIIllIIIIlIlI, String lllllllllllllllIIlIlIIllIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIllIIIIlIll) {
            lllllllllllllllIIlIlIIllIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIIIlI(Object obj) {
        return obj == null;
    }
}
