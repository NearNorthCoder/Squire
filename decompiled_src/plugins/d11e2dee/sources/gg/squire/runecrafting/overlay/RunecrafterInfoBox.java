package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u.a;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
@Singleton
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:gg/squire/runecrafting/overlay/RunecrafterInfoBox.class */
public class RunecrafterInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lIllIIllIIllI;
    private static /* synthetic */ int[] lIllIIllIIlll;
    private final /* synthetic */ SquireZeahRunecrafter m;
    private final /* synthetic */ a o;
    private final /* synthetic */ TaskManager n;

    public Dimension render(Graphics2D graphics2D) {
        if (llIIIllIlIlIlIl(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIllIIllI[lIllIIllIIlll[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIllIIllIIlll[2] + lIllIIllIIlll[3], lIllIIllIIlll[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[4]]).right(Time.format(Duration.between(this.m.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[5]]).right(this.n.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[6]]).right(this.m.b() + " (" + d(this.m.b()) + "/h)").build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[7]]);
        String str = lIllIIllIIllI[lIllIIllIIlll[8]];
        Object[] objArr = new Object[lIllIIllIIlll[4]];
        objArr[lIllIIllIIlll[1]] = Integer.valueOf(this.m.c());
        String format = String.format(str, objArr);
        String str2 = lIllIIllIIllI[lIllIIllIIlll[9]];
        Object[] objArr2 = new Object[lIllIIllIIlll[4]];
        objArr2[lIllIIllIIlll[1]] = Long.valueOf(d(this.m.c()));
        children.add(left.right(format + " (" + String.format(str2, objArr2) + "/h)").build());
        "".length();
        return super.render(graphics2D);
    }

    public long d(int i) {
        Duration between = Duration.between(this.m.getStarted(), Instant.now());
        if (llIIIllIlIlIllI(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    static {
        llIIIllIlIlIlII();
        llIIIllIlIlIIll();
    }

    private static String llIIIllIlIlIIIl(String llllllllllllllIllIIlIIIlllllIIII, String llllllllllllllIllIIlIIIllllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIllIIlll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIlllllIIIl) {
            llllllllllllllIllIIlIIIlllllIIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIlIlIIlI(String llllllllllllllIllIIlIIlIIIIIIlIl, String llllllllllllllIllIIlIIIlllllllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlIIlIIIIIIIlI = llllllllllllllIllIIlIIIlllllllll.toCharArray();
        int llllllllllllllIllIIlIIlIIIIIIIIl = lIllIIllIIlll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIllIIlll[1];
        while (llIIIllIlIlIlll(i, length)) {
            char llllllllllllllIllIIlIIlIIIIIIllI = charArray[i];
            sb.append((char) (llllllllllllllIllIIlIIlIIIIIIllI ^ llllllllllllllIllIIlIIlIIIIIIIlI[llllllllllllllIllIIlIIlIIIIIIIIl % llllllllllllllIllIIlIIlIIIIIIIlI.length]));
            "".length();
            llllllllllllllIllIIlIIlIIIIIIIIl++;
            i++;
            "".length();
            if (((((4 + 29) - (-151)) + 4) ^ (((102 + 138) - 163) + 107)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIllIlIlIlll(int i, int i2) {
        return i < i2;
    }

    private static void llIIIllIlIlIIll() {
        lIllIIllIIllI = new String[lIllIIllIIlll[10]];
        lIllIIllIIllI[lIllIIllIIlll[1]] = llIIIllIlIlIIIl("RPO01aAEL78IxhwZdIjCx80+7JWdhDRpJ+6fKKw/HrM=", "zHeGe");
        lIllIIllIIllI[lIllIIllIIlll[4]] = llIIIllIlIlIIlI("FgYCDS8pFlY=", "DslyF");
        lIllIIllIIllI[lIllIIllIIlll[5]] = llIIIllIlIlIIIl("7xD7R1PynU0=", "vCyZK");
        lIllIIllIIllI[lIllIIllIIlll[6]] = llIIIllIlIlIIIl("BMtbCGUsXNHCj7eap1Nnvw==", "QIGVC");
        lIllIIllIIllI[lIllIIllIIlll[7]] = llIIIllIlIlIIlI("KAs5C2A=", "odUoZ");
        lIllIIllIIllI[lIllIIllIIlll[8]] = llIIIllIlIlIIIl("k24+cEviv7o=", "QfuEJ");
        lIllIIllIIllI[lIllIIllIIlll[9]] = llIIIllIlIlIIIl("H0qhYyrzjz8=", "kAiqb");
    }

    private static void llIIIllIlIlIlII() {
        lIllIIllIIlll = new int[11];
        lIllIIllIIlll[0] = 90 ^ 80;
        lIllIIllIIlll[1] = (165 ^ 131) & ((6 ^ 32) ^ (-1));
        lIllIIllIIlll[2] = (((225 ^ 194) + (232 ^ 134)) - (150 ^ 183)) + (215 ^ 134);
        lIllIIllIIlll[3] = (1 ^ 112) ^ (8 ^ 109);
        lIllIIllIIlll[4] = " ".length();
        lIllIIllIIlll[5] = "  ".length();
        lIllIIllIIlll[6] = "   ".length();
        lIllIIllIIlll[7] = 65 ^ 69;
        lIllIIllIIlll[8] = 139 ^ 142;
        lIllIIllIIlll[9] = (((22 + 106) - 29) + 29) ^ (((95 + 61) - 127) + 105);
        lIllIIllIIlll[10] = 136 ^ 143;
    }

    private static boolean llIIIllIlIlIllI(int i) {
        return i == 0;
    }

    private static boolean llIIIllIlIlIlIl(int i) {
        return i != 0;
    }

    @Inject
    public RunecrafterInfoBox(SquireZeahRunecrafter squireZeahRunecrafter, a aVar) {
        this.m = squireZeahRunecrafter;
        this.n = squireZeahRunecrafter.getManager();
        this.o = aVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
