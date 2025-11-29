package gg.squire.autotoa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.EnumC0056e;
@Singleton
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:gg/squire/autotoa/overlay/debug/DebugOverlay.class */
public class DebugOverlay extends OverlayPanel {
    private final /* synthetic */ C cb;
    private final /* synthetic */ SquireAutoTOA bZ;
    private final /* synthetic */ TaskManager ca;
    private static /* synthetic */ String[] llIIIlIIIIl;
    private static /* synthetic */ int[] llIIIlIlllI;

    @Inject
    protected DebugOverlay(SquireAutoTOA squireAutoTOA, C c) {
        this.bZ = squireAutoTOA;
        this.ca = squireAutoTOA.getManager();
        this.cb = c;
        setPosition(OverlayPosition.TOP_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    private static String lIIllllIIlllll(String llllllllllllllllIlIIIlIIIlIIllII, String llllllllllllllllIlIIIlIIIlIIlIll) {
        String llllllllllllllllIlIIIlIIIlIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIIIlIIIlIIlIIl = llllllllllllllllIlIIIlIIIlIIlIll.toCharArray();
        int llllllllllllllllIlIIIlIIIlIIlIII = llIIIlIlllI[0];
        char[] charArray = llllllllllllllllIlIIIlIIIlIIllII2.toCharArray();
        int llllllllllllllllIlIIIlIIIlIIIIIl = charArray.length;
        int i = llIIIlIlllI[0];
        while (lIIllllIlIIlII(i, llllllllllllllllIlIIIlIIIlIIIIIl)) {
            char llllllllllllllllIlIIIlIIIlIIllIl = charArray[i];
            sb.append((char) (llllllllllllllllIlIIIlIIIlIIllIl ^ llllllllllllllllIlIIIlIIIlIIlIIl[llllllllllllllllIlIIIlIIIlIIlIII % llllllllllllllllIlIIIlIIIlIIlIIl.length]));
            "".length();
            llllllllllllllllIlIIIlIIIlIIlIII++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllllIlIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIllllIlIIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIIllllIlIIIlI() {
        llIIIlIlllI = new int[9];
        llIIIlIlllI[0] = ((((55 + 77) - 99) + 186) ^ (((46 + 38) - (-22)) + 37)) & (((((205 + 40) - 34) + 19) ^ (((60 + 50) - 15) + 83)) ^ (-" ".length()));
        llIIIlIlllI[1] = " ".length();
        llIIIlIlllI[2] = "  ".length();
        llIIIlIlllI[3] = "   ".length();
        llIIIlIlllI[4] = (((90 + 145) - 137) + 68) ^ (((83 + 111) - 161) + 129);
        llIIIlIlllI[5] = (((104 + 117) - 137) + 53) ^ (((56 + 113) - 156) + 127);
        llIIIlIlllI[6] = (125 ^ 47) ^ (84 ^ 0);
        llIIIlIlllI[7] = 47 ^ 40;
        llIIIlIlllI[8] = (229 ^ 181) ^ (121 ^ 33);
    }

    private static void lIIllllIlIIIIl() {
        llIIIlIIIIl = new String[llIIIlIlllI[8]];
        llIIIlIIIIl[llIIIlIlllI[0]] = lIIlllIlllIlII("vgHcAerZj/GmMMXmWQ5BSA==", "gTVhh");
        llIIIlIIIIl[llIIIlIlllI[1]] = lIIllllIIlllll("IicbHBEdNw==", "pRuhx");
        llIIIlIIIIl[llIIIlIlllI[2]] = lIIlllIlllIlII("6vYfp+f0IcI=", "rsWBm");
        llIIIlIIIIl[llIIIlIlllI[3]] = lIIlllIlllIlII("x9KvagOmsbM=", "dpIRY");
        llIIIlIIIIl[llIIIlIlllI[4]] = lIIllllIIlllll("GywBJwQ5JBovDGsdEjIA", "KIsAk");
        llIIIlIIIIl[llIIIlIlllI[5]] = lIIlllIlllIlII("WbMWYxMzLeB0MhSUtxyjJA==", "rsWhX");
        llIIIlIIIIl[llIIIlIlllI[6]] = lIIllllIlIIIII("GQe7sD4ZNEuwV/Mun6Eo+mSaDRDnuzxX", "PDfmD");
        llIIIlIIIIl[llIIIlIlllI[7]] = lIIlllIlllIlII("SnNzBi46ZnpTCh45o5oP1g==", "HHYBA");
    }

    private static String lIIlllIlllIlII(String llllllllllllllllIlIIIlIIIIllIlll, String llllllllllllllllIlIIIlIIIIllIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIIIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIIIIlllIIl.init(llIIIlIlllI[2], llllllllllllllllIlIIIlIIIIlllIlI);
            return new String(llllllllllllllllIlIIIlIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIIIIlllIII) {
            llllllllllllllllIlIIIlIIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIlIIIII(String llllllllllllllllIlIIIlIIIlIllIlI, String llllllllllllllllIlIIIlIIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIlIllIll.getBytes(StandardCharsets.UTF_8)), llIIIlIlllI[8]), "DES");
            Cipher llllllllllllllllIlIIIlIIIlIllllI = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlIIIlIllllI.init(llIIIlIlllI[2], llllllllllllllllIlIIIlIIIlIlllll);
            return new String(llllllllllllllllIlIIIlIIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIIIlIlllIl) {
            llllllllllllllllIlIIIlIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIllllIlIIIlI();
        lIIllllIlIIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIllllIlIIIll(this.bZ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.bZ.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIIlIIIIl[llIIIlIlllI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[2]]).right(llIIIlIIIIl[llIIIlIlllI[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[4]]).right(this.ca.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[5]]).right(String.valueOf(this.bZ.i())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[6]]).right(String.valueOf(this.bZ.k())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[7]]).right(String.valueOf(this.bZ.j())).build());
        "".length();
        for (EnumC0056e enumC0056e : this.cb.av().keySet()) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(enumC0056e.toString()).right(this.cb.av().get(enumC0056e).toString()).build());
            "".length();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return super.render(graphics2D);
    }
}
