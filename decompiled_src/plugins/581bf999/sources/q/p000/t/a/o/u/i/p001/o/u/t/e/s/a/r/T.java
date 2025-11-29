package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
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
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.T  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/T.class */
public class T extends S {
    private static /* synthetic */ int[] llIIlllIlII;
    private final /* synthetic */ Client bW;
    private static /* synthetic */ String[] llIIlllIIll;
    private final /* synthetic */ C0067p bX;
    private final /* synthetic */ TOAConfig bY;

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIIIllIllIll(C0057f.s())) {
            a(graphics2D, C0057f.s(), Color.GREEN, llIIlllIIll[llIIlllIlII[0]]);
        }
        if (lIlIIIllIllIll(C0057f.t())) {
            a(graphics2D, C0057f.t(), Color.BLUE, llIIlllIIll[llIIlllIlII[1]]);
        }
        if (lIlIIIllIllIll(C0057f.u())) {
            for (NPC npc : C0057f.u()) {
                a(graphics2D, npc.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[2]]);
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        if (lIlIIIllIllIll(C0057f.v())) {
            for (NPC npc2 : C0057f.v()) {
                a(graphics2D, npc2.getWorldLocation(), Color.RED, llIIlllIIll[llIIlllIlII[3]]);
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    static {
        lIlIIIllIllIlI();
        lIlIIIllIllIIl();
    }

    private static void lIlIIIllIllIIl() {
        llIIlllIIll = new String[llIIlllIlII[4]];
        llIIlllIIll[llIIlllIlII[0]] = lIlIIIllIlIlll("Dww3IRQ3CSYh", "XmADP");
        llIIlllIIll[llIIlllIlII[1]] = lIlIIIllIllIII("TQCxZ3tUWaytE5VTeoFmmg==", "QJZos");
        llIIlllIIll[llIIlllIlII[2]] = lIlIIIllIlIlll("DTokIgEUNCAz", "CUVVi");
        llIIlllIIll[llIIlllIlII[3]] = lIlIIIllIllIII("GxPpIqZzdg7Qexy69HZ9kQ==", "sngoz");
    }

    private void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, String str) {
        LocalPoint fromWorld = LocalPoint.fromWorld(this.bW, worldPoint);
        if (lIlIIIllIlllIl(fromWorld)) {
            return;
        }
        Point localToCanvas = Perspective.localToCanvas(this.bW, fromWorld, this.bW.getPlane());
        if (lIlIIIllIlllIl(localToCanvas)) {
            return;
        }
        a(graphics2D, color, fromWorld);
        OverlayUtil.renderTextLocation(graphics2D, localToCanvas, str, Color.WHITE);
    }

    private static boolean lIlIIIllIllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIllIlllIl(Object obj) {
        return obj == null;
    }

    private static String lIlIIIllIlIlll(String llllllllllllllllIIlllIlIlIlIlIIl, String llllllllllllllllIIlllIlIlIlIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIlIlIlIlIII.toCharArray();
        int llllllllllllllllIIlllIlIlIlIIlIl = llIIlllIlII[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllIIlllIlIlIIllllI = charArray2.length;
        int i = llIIlllIlII[0];
        while (lIlIIIllIllllI(i, llllllllllllllllIIlllIlIlIIllllI)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlllIlIlIlIIlIl % charArray.length]));
            "".length();
            llllllllllllllllIIlllIlIlIlIIlIl++;
            i++;
            "".length();
            if ((107 ^ 111) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIllIllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIllIllIII(String llllllllllllllllIIlllIlIlIlllIIl, String llllllllllllllllIIlllIlIlIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), llIIlllIlII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlIlIlllIlI) {
            llllllllllllllllIIlllIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlllII(int i) {
        return i != 0;
    }

    private static void lIlIIIllIllIlI() {
        llIIlllIlII = new int[6];
        llIIlllIlII[0] = ((((113 + 112) - 218) + 144) ^ (((6 + 95) - 67) + 125)) & (((((146 + 27) - 87) + 105) ^ (((34 + 112) - (-2)) + 35)) ^ (-" ".length()));
        llIIlllIlII[1] = " ".length();
        llIIlllIlII[2] = "  ".length();
        llIIlllIlII[3] = "   ".length();
        llIIlllIlII[4] = 77 ^ 73;
        llIIlllIlII[5] = 13 ^ 5;
    }

    @Inject
    protected T(Client client, C0067p c0067p, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bW = client;
        this.bX = c0067p;
        this.bY = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }
}
