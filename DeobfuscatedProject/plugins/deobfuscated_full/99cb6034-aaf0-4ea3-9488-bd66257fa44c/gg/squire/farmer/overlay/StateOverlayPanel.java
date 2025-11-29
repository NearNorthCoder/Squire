/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.farmer.overlay;

import -.m.e.a.u.s.r.r.q.i.r.e.f.b;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
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

public class StateOverlayPanel
extends OverlayPanel {
    private final /* synthetic */ SquireFarmer bP;
    private static /* synthetic */ String[] lIllllIllllI;
    private static /* synthetic */ int[] lIlllllIIIII;
    private final /* synthetic */ SquireFarmerConfig bO;
    private final /* synthetic */ b bN;
    private final /* synthetic */ f bM;
    private final /* synthetic */ TaskManager bQ;

    private static String lllIlllIlllIIl(String var11, String var17) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlllllIIIII[3], var19);
            return new String(var14.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        StateOverlayPanel.lllIllllIIlIIl();
        StateOverlayPanel.lllIlllIllllII();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.setBorder(new Rectangle(lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0], lIlllllIIIII[0]));
        String string = lIllllIllllI[lIlllllIIIII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[2]]).right(lIllllIllllI[lIlllllIIIII[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[4]]).right(String.valueOf(this.bQ.getCurrentTask())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[5]]).right(String.valueOf((Object)this.bP.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[6]]).right(String.valueOf(this.bM.x())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllllIllllI[lIlllllIIIII[7]]).right(String.valueOf(this.bM.v())).build());
        0;
        return super.render(graphics2D);
    }

    private static String lllIlllIlllIlI(String var8, String var2) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlllllIIIII[9]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlllllIIIII[3], var7);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    @Inject
    public StateOverlayPanel(f f2, b b2, SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer) {
        this.bM = f2;
        this.bN = b2;
        this.bO = squireFarmerConfig;
        this.bP = squireFarmer;
        this.bQ = squireFarmer.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lllIlllIllllII() {
        lIllllIllllI = new String[lIlllllIIIII[8]];
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[1]] = StateOverlayPanel."Squire Farmer";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[2]] = StateOverlayPanel."Version:";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[3]] = StateOverlayPanel."1.4.8";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[4]] = StateOverlayPanel."Currently";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[5]] = StateOverlayPanel."Run type";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[6]] = StateOverlayPanel."Region";
        StateOverlayPanel.lIllllIllllI[StateOverlayPanel.lIlllllIIIII[7]] = StateOverlayPanel."Patch";
    }

    private static boolean lllIllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlllIlllIII(String var9, String var3) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var15 = var3.toCharArray();
        int var16 = lIlllllIIIII[1];
        char[] var1 = var9.toCharArray();
        int var6 = var1.length;
        int var18 = lIlllllIIIII[1];
        while (StateOverlayPanel.lllIllllIIlIlI(var18, var6)) {
            char var5 = var1[var18];
            var13.append((char)(var5 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var18;
            0;
            if (1 >= -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static void lllIllllIIlIIl() {
        lIlllllIIIII = new int[10];
        StateOverlayPanel.lIlllllIIIII[0] = 0x74 ^ 0x7E;
        StateOverlayPanel.lIlllllIIIII[1] = (0xF5 ^ 0xA6) & ~(0x33 ^ 0x60);
        StateOverlayPanel.lIlllllIIIII[2] = 1;
        StateOverlayPanel.lIlllllIIIII[3] = 2;
        StateOverlayPanel.lIlllllIIIII[4] = 3;
        StateOverlayPanel.lIlllllIIIII[5] = 0xAF ^ 0xAB;
        StateOverlayPanel.lIlllllIIIII[6] = 63 + 174 - 236 + 198 ^ 15 + 105 - -41 + 33;
        StateOverlayPanel.lIlllllIIIII[7] = 0x97 ^ 0xC7 ^ (0xCD ^ 0x9B);
        StateOverlayPanel.lIlllllIIIII[8] = 45 + 19 - 41 + 145 ^ 131 + 93 - 114 + 65;
        StateOverlayPanel.lIlllllIIIII[9] = 0x79 ^ 0x71;
    }
}

