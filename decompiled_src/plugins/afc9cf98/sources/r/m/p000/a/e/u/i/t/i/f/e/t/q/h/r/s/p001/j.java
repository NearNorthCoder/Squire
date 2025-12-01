package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import gg.squire.tithefarm.SquireTitheConfig;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.j  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/j.class */
public class j extends Overlay {
    private static /* synthetic */ int[] lIIlllllIlIlI;
    private final /* synthetic */ ModelOutlineRenderer B;
    private final /* synthetic */ SquireTitheConfig z;
    private static /* synthetic */ String[] lIIlllllIlIIl;
    private final /* synthetic */ Client C;
    private final /* synthetic */ i A;
    private final /* synthetic */ SquireTitheFarm y;
    private final /* synthetic */ Map<g, TileObject> D = new HashMap();

    private static boolean lIllIlIlllIllII(Object obj) {
        return obj != null;
    }

    public Dimension render(Graphics2D graphics2D) {
        g[] values = g.values();
        int length = values.length;
        int i = lIIlllllIlIlI[0];
        while (lIllIlIlllIlIll(i, length)) {
            a(graphics2D, values[i]);
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return null;
    }

    private static String lIllIlIlllIIlll(String llllllllllllllIlllIIllIIlIIlIllI, String llllllllllllllIlllIIllIIlIIlIlIl) {
        String llllllllllllllIlllIIllIIlIIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIllIIlIIllIII = llllllllllllllIlllIIllIIlIIlIlIl.toCharArray();
        int llllllllllllllIlllIIllIIlIIlIlll = lIIlllllIlIlI[0];
        char[] charArray = llllllllllllllIlllIIllIIlIIlIllI2.toCharArray();
        int length = charArray.length;
        int i = lIIlllllIlIlI[0];
        while (lIllIlIlllIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIllIIlIIllIII[llllllllllllllIlllIIllIIlIIlIlll % llllllllllllllIlllIIllIIlIIllIII.length]));
            "".length();
            llllllllllllllIlllIIllIIlIIlIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIlIlllIlIII(String llllllllllllllIlllIIllIIlIlIlIll, String llllllllllllllIlllIIllIIlIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIlIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIlIlIllIl.init(lIIlllllIlIlI[4], llllllllllllllIlllIIllIIlIlIlllI);
            return new String(llllllllllllllIlllIIllIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIlIlIllII) {
            llllllllllllllIlllIIllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlllIlIIl() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[4]];
        lIIlllllIlIIl[lIIlllllIlIlI[0]] = lIllIlIlllIIlll("JQggLDcQAGEgOk9EZDE=", "udABC");
        lIIlllllIlIIl[lIIlllllIlIlI[1]] = lIllIlIlllIlIII("U4Yx8rJzF26nUurGKC+sDA==", "iXnBc");
    }

    private static boolean lIllIlIlllIllIl(Object obj) {
        return obj == null;
    }

    private void a(Graphics2D graphics2D, g gVar) {
        Color color;
        if (lIllIlIlllIllIl(gVar)) {
            return;
        }
        TileObject tileObject = this.D.get(gVar);
        if (lIllIlIlllIllIl(tileObject)) {
            return;
        }
        Point canvasLocation = tileObject.getCanvasLocation();
        if (lIllIlIlllIllIl(canvasLocation)) {
            return;
        }
        Player player = this.A.w().get(gVar);
        if (!lIllIlIlllIllII(player) || lIllIlIlllIlllI(player, this.C.getLocalPlayer())) {
            color = Color.GREEN;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return;
            }
        } else {
            color = Color.RED;
        }
        Color color2 = color;
        if (lIllIlIlllIlllI(color2, Color.GREEN)) {
            return;
        }
        this.B.drawOutline(this.D.get(gVar), lIIlllllIlIlI[1], color2, lIIlllllIlIlI[1]);
        Point offset = canvasLocation.offset(lIIlllllIlIlI[2], lIIlllllIlIlI[2]);
        String str = lIIlllllIlIIl[lIIlllllIlIlI[0]];
        Object[] objArr = new Object[lIIlllllIlIlI[1]];
        objArr[lIIlllllIlIlI[0]] = player.getName();
        OverlayUtil.renderTextLocation(graphics2D, offset, String.format(str, objArr), color2);
        Point offset2 = canvasLocation.offset(lIIlllllIlIlI[2], lIIlllllIlIlI[3]);
        String str2 = lIIlllllIlIIl[lIIlllllIlIlI[1]];
        Object[] objArr2 = new Object[lIIlllllIlIlI[1]];
        objArr2[lIIlllllIlIlI[0]] = e.c(tileObject.getId());
        OverlayUtil.renderTextLocation(graphics2D, offset2, String.format(str2, objArr2), color2);
    }

    private static void lIllIlIlllIlIlI() {
        lIIlllllIlIlI = new int[5];
        lIIlllllIlIlI[0] = (117 ^ 124) & ((164 ^ 173) ^ (-1));
        lIIlllllIlIlI[1] = " ".length();
        lIIlllllIlIlI[2] = 55 ^ 35;
        lIIlllllIlIlI[3] = (13 ^ 23) ^ (96 ^ 100);
        lIIlllllIlIlI[4] = "  ".length();
    }

    private static boolean lIllIlIlllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIlIlllIlIll(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.D.clear();
        g[] o = this.z.rotation().o();
        int length = o.length;
        int i = lIIlllllIlIlI[0];
        while (lIllIlIlllIlIll(i, length)) {
            g gVar = o[i];
            Objects.requireNonNull(gVar);
            "".length();
            TileObject nearest = TileObjects.getNearest(this::a);
            if (lIllIlIlllIllII(nearest)) {
                this.D.put(gVar, nearest);
                "".length();
            }
            i++;
            "".length();
            if ((((16 ^ 35) ^ (208 ^ 187)) & (((160 ^ 156) ^ (121 ^ 29)) ^ (-" ".length()))) != (((109 ^ 121) ^ (21 ^ 19)) & (((10 ^ 6) ^ (111 ^ 113)) ^ (-" ".length())))) {
                return;
            }
        }
    }

    static {
        lIllIlIlllIlIlI();
        lIllIlIlllIlIIl();
    }

    @Inject
    public j(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig, i iVar, ModelOutlineRenderer modelOutlineRenderer, Client client) {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
        this.y = squireTitheFarm;
        this.z = squireTitheConfig;
        this.A = iVar;
        this.B = modelOutlineRenderer;
        this.C = client;
    }
}
