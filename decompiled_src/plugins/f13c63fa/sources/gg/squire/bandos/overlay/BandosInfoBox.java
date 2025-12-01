package gg.squire.bandos.overlay;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.e;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.k;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.w;
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:gg/squire/bandos/overlay/BandosInfoBox.class */
public class BandosInfoBox extends OverlayPanel {
    private final /* synthetic */ TaskManager G;
    private final /* synthetic */ k F;
    private final /* synthetic */ e E;
    private final /* synthetic */ SquireBandos D;
    private final /* synthetic */ w H;
    private static /* synthetic */ int[] lllIIIIIIlI;
    private static /* synthetic */ String[] lllIIIIIIIl;

    private static void lIlIllIIlIllII() {
        lllIIIIIIIl = new String[lllIIIIIIlI[8]];
        lllIIIIIIIl[lllIIIIIIlI[1]] = lIlIllIIlIlIlI("KgsjOzccWhQzKx0VJQ==", "yzVRE");
        lllIIIIIIIl[lllIIIIIIlI[2]] = lIlIllIIlIlIlI("FxMcDSImUhMFJCMX", "UrriM");
        lllIIIIIIIl[lllIIIIIIlI[3]] = lIlIllIIlIlIlI("ICgmGQoMZicfAQQ=", "iFUpn");
        lllIIIIIIIl[lllIIIIIIlI[4]] = lIlIllIIlIlIll("CmuPcmG4lbRvNuuhydOMKw==", "iJBJE");
        lllIIIIIIIl[lllIIIIIIlI[5]] = lIlIllIIlIlIll("Xu7pbl7ZOWLvnabQt8hF6Dyn/G/9VWXi", "KJCWq");
        lllIIIIIIIl[lllIIIIIIlI[6]] = lIlIllIIlIlIlI("EQwqRSUzHjBFJGAd", "RmDeF");
        lllIIIIIIIl[lllIIIIIIlI[7]] = lIlIllIIlIlIll("IxuoVlhEXvjVDxDmr0iTcg==", "Bqqvf");
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIllIIlIllll(this.D.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0], lllIIIIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIIIIIIl[lllIIIIIIlI[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[2]]).right(String.valueOf(this.E.s())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[3]]).right(String.valueOf(this.E.t())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[4]]).right(String.valueOf(this.E.A())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[5]]).right(String.valueOf(Math.max(lllIIIIIIlI[1], this.H.Q() - Static.getClient().getTickCount()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[6]]).right(String.valueOf(SpellBook.Standard.BONES_TO_PEACHES.canCast())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIIIIIIl[lllIIIIIIlI[7]]).right(this.G.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean lIlIllIIlIllll(int i) {
        return i != 0;
    }

    private static String lIlIllIIlIlIlI(String llllllllllllllllIIlIlIIIlllIIlll, String llllllllllllllllIIlIlIIIlllIIllI) {
        String llllllllllllllllIIlIlIIIlllIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlllIIlIl = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIlllIIlII = llllllllllllllllIIlIlIIIlllIIllI.toCharArray();
        int llllllllllllllllIIlIlIIIlllIIIll = lllIIIIIIlI[1];
        char[] charArray = llllllllllllllllIIlIlIIIlllIIlll2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIlIlIIIllIllIll = lllIIIIIIlI[1];
        while (lIlIllIIllIIII(llllllllllllllllIIlIlIIIllIllIll, length)) {
            char llllllllllllllllIIlIlIIIlllIlIII = charArray[llllllllllllllllIIlIlIIIllIllIll];
            llllllllllllllllIIlIlIIIlllIIlIl.append((char) (llllllllllllllllIIlIlIIIlllIlIII ^ llllllllllllllllIIlIlIIIlllIIlII[llllllllllllllllIIlIlIIIlllIIIll % llllllllllllllllIIlIlIIIlllIIlII.length]));
            "".length();
            llllllllllllllllIIlIlIIIlllIIIll++;
            llllllllllllllllIIlIlIIIllIllIll++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlllIIlIl);
    }

    private static void lIlIllIIlIlllI() {
        lllIIIIIIlI = new int[10];
        lllIIIIIIlI[0] = (((70 + 64) - 26) + 69) ^ (((185 + 36) - 54) + 20);
        lllIIIIIIlI[1] = (54 ^ 108) & ((85 ^ 15) ^ (-1));
        lllIIIIIIlI[2] = " ".length();
        lllIIIIIIlI[3] = "  ".length();
        lllIIIIIIlI[4] = "   ".length();
        lllIIIIIIlI[5] = 140 ^ 136;
        lllIIIIIIlI[6] = 56 ^ 61;
        lllIIIIIIlI[7] = 23 ^ 17;
        lllIIIIIIlI[8] = (107 ^ 73) ^ (78 ^ 107);
        lllIIIIIIlI[9] = 77 ^ 69;
    }

    @Inject
    public BandosInfoBox(SquireBandos squireBandos, e eVar, k kVar, w wVar) {
        this.D = squireBandos;
        this.E = eVar;
        this.F = kVar;
        this.G = squireBandos.getManager();
        this.H = wVar;
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lIlIllIIllIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIIlIlllI();
        lIlIllIIlIllII();
    }

    private static String lIlIllIIlIlIll(String llllllllllllllllIIlIlIIIllllIlll, String llllllllllllllllIIlIlIIIllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllllIllI.getBytes(StandardCharsets.UTF_8)), lllIIIIIIlI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIlllllIII) {
            llllllllllllllllIIlIlIIIlllllIII.printStackTrace();
            return null;
        }
    }
}
