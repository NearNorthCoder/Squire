/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.basics.questing.overlay;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class QuestInfoBox
extends OverlayPanel {
    private static final /* synthetic */ String fF;
    private /* synthetic */ Object fJ;
    private static /* synthetic */ String[] llIlIIIII;
    private /* synthetic */ Object fI;
    private final /* synthetic */ SquireQuestHelper fG;
    private static /* synthetic */ int[] llIlIIIIl;
    private final /* synthetic */ TaskManager fH;

    @Inject
    private QuestInfoBox(SquireQuestHelper squireQuestHelper) {
        this.fG = squireQuestHelper;
        this.fH = squireQuestHelper.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.fI = this.fG.cw();
        this.fJ = this.fG.cz();
    }

    private static boolean lIllIllIIIl(int n2) {
        return n2 == 0;
    }

    static {
        QuestInfoBox.lIllIlIllll();
        QuestInfoBox.lIllIlIlllI();
        fF = llIlIIIII[llIlIIIIl[7]];
    }

    private static String lIllIlIllIl(String lIllIIIlllIIIlI, String lIllIIIlllIIIll) {
        try {
            SecretKeySpec lIllIIIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), llIlIIIIl[8]), "DES");
            Cipher lIllIIIlllIIllI = Cipher.getInstance("DES");
            lIllIIIlllIIllI.init(llIlIIIIl[2], lIllIIIlllIIlll);
            return new String(lIllIIIlllIIllI.doFinal(Base64.getDecoder().decode(lIllIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIlllIIlIl) {
            lIllIIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        String string;
        QuestInfoBox lIllIIlIIIlIIll;
        if (QuestInfoBox.lIllIllIIII(this.fG.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lIllIIlIIIlIIIl = Duration.between(lIllIIlIIIlIIll.fG.getStarted(), Instant.now());
        lIllIIlIIIlIIll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIIIII[llIlIIIIl[0]]).build());
        0;
        List list = lIllIIlIIIlIIll.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIIIII[llIlIIIIl[1]]);
        if (QuestInfoBox.lIllIllIIII(lIllIIlIIIlIIll.fG.isEnabled() ? 1 : 0)) {
            string = llIlIIIII[llIlIIIIl[2]];
            0;
            if ((0x64 ^ 0x7B ^ (0x36 ^ 0x2D)) < 0) {
                return null;
            }
        } else {
            string = llIlIIIII[llIlIIIIl[3]];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        if (QuestInfoBox.lIllIllIIIl(lIllIIlIIIlIIll.fG.isEnabled() ? 1 : 0)) {
            void lIllIIlIIIlIIlI;
            return super.render((Graphics2D)lIllIIlIIIlIIlI);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[4]]).right(String.valueOf(this.fI)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[5]]).right(String.valueOf(this.fJ)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[6]]).right(this.fH.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean lIllIllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlllI() {
        llIlIIIII = new String[llIlIIIIl[8]];
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[0]] = QuestInfoBox."Squire Quest QOL";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[1]] = QuestInfoBox."Paused";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[2]] = QuestInfoBox."No";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[3]] = QuestInfoBox."Yes";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[4]] = QuestInfoBox."Current Quest";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[5]] = QuestInfoBox."Current Step";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[6]] = QuestInfoBox."Current Task";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[7]] = QuestInfoBox."------------------------------------";
    }

    private static String lIllIlIlIll(String lIllIIIllllIlII, String lIllIIIlllllIII) {
        lIllIIIllllIlII = new String(Base64.getDecoder().decode(lIllIIIllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIllllIlll = new StringBuilder();
        char[] lIllIIIllllIllI = lIllIIIlllllIII.toCharArray();
        int lIllIIIllllIlIl = llIlIIIIl[0];
        char[] lIllIIIlllIllll = lIllIIIllllIlII.toCharArray();
        int lIllIIIlllIlllI = lIllIIIlllIllll.length;
        int lIllIIIlllIllIl = llIlIIIIl[0];
        while (QuestInfoBox.lIllIllIIlI(lIllIIIlllIllIl, lIllIIIlllIlllI)) {
            char lIllIIIlllllIlI = lIllIIIlllIllll[lIllIIIlllIllIl];
            lIllIIIllllIlll.append((char)(lIllIIIlllllIlI ^ lIllIIIllllIllI[lIllIIIllllIlIl % lIllIIIllllIllI.length]));
            0;
            ++lIllIIIllllIlIl;
            ++lIllIIIlllIllIl;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(lIllIIIllllIlll);
    }

    private static String lIllIlIllII(String lIllIIlIIIIlIIl, String lIllIIlIIIIlIII) {
        try {
            SecretKeySpec lIllIIlIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIIIIlIll = Cipher.getInstance("Blowfish");
            lIllIIlIIIIlIll.init(llIlIIIIl[2], lIllIIlIIIIllII);
            return new String(lIllIIlIIIIlIll.doFinal(Base64.getDecoder().decode(lIllIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIIIIlIlI) {
            lIllIIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllll() {
        llIlIIIIl = new int[9];
        QuestInfoBox.llIlIIIIl[0] = (0x68 ^ 4 ^ (0xCC ^ 0x89)) & (0xA1 ^ 0xB7 ^ (0xF9 ^ 0xC6) ^ -1);
        QuestInfoBox.llIlIIIIl[1] = 1;
        QuestInfoBox.llIlIIIIl[2] = 2;
        QuestInfoBox.llIlIIIIl[3] = 3;
        QuestInfoBox.llIlIIIIl[4] = 0x56 ^ 0x63 ^ (0xAA ^ 0x9B);
        QuestInfoBox.llIlIIIIl[5] = 0x26 ^ 0x23;
        QuestInfoBox.llIlIIIIl[6] = 0xBF ^ 0xA8 ^ (0x25 ^ 0x34);
        QuestInfoBox.llIlIIIIl[7] = 0x7B ^ 0x5D ^ (0xB5 ^ 0x94);
        QuestInfoBox.llIlIIIIl[8] = 0xC8 ^ 0xC0;
    }
}

