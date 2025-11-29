/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.unethicalite.api.entities.Players
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.unethicalite.api.entities.Players;

public class w_Unknown
extends Overlay {
    private final /* synthetic */ v M;
    private static /* synthetic */ String[] lIllIIlllllll;
    private final /* synthetic */ Client L;
    private static /* synthetic */ int[] lIllIlIIIIIII;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var3_3;
        NPC nPC = this.M.W();
        if (w.llIIIlllIIllIlI(nPC)) {
            return null;
        }
        Player var5 = Players.getLocal();
        if (w.llIIIlllIIllIlI(var5)) {
            return null;
        }
        Object[] objectArray = new Object[lIllIlIIIIIII[1]];
        objectArray[w.lIllIlIIIIIII[0]] = nPC.getOrientation();
        objectArray[w.lIllIlIIIIIII[2]] = var3_3.getOrientation();
        objectArray[w.lIllIlIIIIIII[3]] = nPC.getOrientation() + var3_3.getOrientation();
        String string = String.format(lIllIIlllllll[lIllIlIIIIIII[0]], objectArray);
        Point point = Perspective.getCanvasTextLocation((Client)this.L, (Graphics2D)graphics2D, (LocalPoint)nPC.getLocalLocation(), (String)string, (int)lIllIlIIIIIII[2]);
        graphics2D.drawString(string, point.getX(), point.getY());
        return null;
    }

    private static String llIIIlllIIlIlIl(String var3, String var4) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllIlIIIIIII[3], var6);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        w.llIIIlllIIllIIl();
        w.llIIIlllIIllIII();
    }

    private static void llIIIlllIIllIIl() {
        lIllIlIIIIIII = new int[4];
        w.lIllIlIIIIIII[0] = (9 + 131 - 69 + 111 ^ 145 + 129 - 108 + 6) & (103 + 87 - 94 + 68 ^ 75 + 39 - -3 + 73 ^ -1);
        w.lIllIlIIIIIII[1] = 3;
        w.lIllIlIIIIIII[2] = 1;
        w.lIllIlIIIIIII[3] = 2;
    }

    @Inject
    public w(Client client, v v2) {
        this.L = client;
        this.M = v2;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean llIIIlllIIllIlI(Object object) {
        return object == null;
    }

    private static void llIIIlllIIllIII() {
        lIllIIlllllll = new String[lIllIlIIIIIII[2]];
        w.lIllIIlllllll[w.lIllIlIIIIIII[0]] = w."Zulrah: %d, Player: %d, Combined: %d";
    }
}

