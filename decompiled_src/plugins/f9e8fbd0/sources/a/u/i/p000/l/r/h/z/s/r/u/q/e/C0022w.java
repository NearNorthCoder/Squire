package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.unethicalite.api.entities.Players;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.w  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/w.class */
public class C0022w extends Overlay {
    private final /* synthetic */ C0021v M;
    private static /* synthetic */ String[] lIllIIlllllll;
    private final /* synthetic */ Client L;
    private static /* synthetic */ int[] lIllIlIIIIIII;

    public Dimension render(Graphics2D graphics2D) {
        NPC W = this.M.W();
        if (llIIIlllIIllIlI(W)) {
            return null;
        }
        Player local = Players.getLocal();
        if (llIIIlllIIllIlI(local)) {
            return null;
        }
        String str = lIllIIlllllll[lIllIlIIIIIII[0]];
        Object[] objArr = new Object[lIllIlIIIIIII[1]];
        objArr[lIllIlIIIIIII[0]] = Integer.valueOf(W.getOrientation());
        objArr[lIllIlIIIIIII[2]] = Integer.valueOf(local.getOrientation());
        objArr[lIllIlIIIIIII[3]] = Integer.valueOf(W.getOrientation() + local.getOrientation());
        String format = String.format(str, objArr);
        Point canvasTextLocation = Perspective.getCanvasTextLocation(this.L, graphics2D, W.getLocalLocation(), format, lIllIlIIIIIII[2]);
        graphics2D.drawString(format, canvasTextLocation.getX(), canvasTextLocation.getY());
        return null;
    }

    private static String llIIIlllIIlIlIl(String llllllllllllllIllIIlIIIIlIlIIIlI, String llllllllllllllIllIIlIIIIlIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIIIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIIlIlIIIll) {
            llllllllllllllIllIIlIIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlllIIllIIl();
        llIIIlllIIllIII();
    }

    private static void llIIIlllIIllIIl() {
        lIllIlIIIIIII = new int[4];
        lIllIlIIIIIII[0] = ((((9 + 131) - 69) + 111) ^ (((145 + 129) - 108) + 6)) & (((((103 + 87) - 94) + 68) ^ (((75 + 39) - (-3)) + 73)) ^ (-" ".length()));
        lIllIlIIIIIII[1] = "   ".length();
        lIllIlIIIIIII[2] = " ".length();
        lIllIlIIIIIII[3] = "  ".length();
    }

    @Inject
    public C0022w(Client client, C0021v c0021v) {
        this.L = client;
        this.M = c0021v;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean llIIIlllIIllIlI(Object obj) {
        return obj == null;
    }

    private static void llIIIlllIIllIII() {
        lIllIIlllllll = new String[lIllIlIIIIIII[2]];
        lIllIIlllllll[lIllIlIIIIIII[0]] = llIIIlllIIlIlIl("OiHvlTYVfLiGoD6kD3xIvLR9L/0gY9BwjIqdeoS5TgFVFbndrjrWSw==", "kOiIC");
    }
}
