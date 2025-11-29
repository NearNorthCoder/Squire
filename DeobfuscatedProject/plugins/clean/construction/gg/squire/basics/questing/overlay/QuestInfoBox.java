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
    private static final  String fF;
    private  Object fJ;
    
    private  Object fI;
    private final  SquireQuestHelper fG;
    
    private final  TaskManager fH;

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

        List list = lIllIIlIIIlIIll.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIIIII[llIlIIIIl[1]]);
        if (QuestInfoBox.lIllIllIIII(lIllIIlIIIlIIll.fG.isEnabled() ? 1 : 0)) {
            string = llIlIIIII[llIlIIIIl[2]];

            if ((0x64 ^ 0x7B ^ (0x36 ^ 0x2D)) < 0) {
                return null;
            }
        } else {
            string = llIlIIIII[llIlIIIIl[3]];
        }
        list.add(lineComponentBuilder.right(string).build());

        if (QuestInfoBox.lIllIllIIIl(lIllIIlIIIlIIll.fG.isEnabled() ? 1 : 0)) {
            void lIllIIlIIIlIIlI;
            return super.render((Graphics2D)lIllIIlIIIlIIlI);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[4]]).right(String.valueOf(this.fI)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[5]]).right(String.valueOf(this.fJ)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[6]]).right(this.fH.getCurrentTask()).build());

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
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[0]] = "Squire Quest QOL";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[1]] = "Paused";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[2]] = "No";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[3]] = "Yes";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[4]] = "Current Quest";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[5]] = "Current Step";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[6]] = "Current Task";
        QuestInfoBox.llIlIIIII[QuestInfoBox.llIlIIIIl[7]] = "------------------------------------";
    }

        return String.valueOf(lIllIIIllllIlll);
    }

}

