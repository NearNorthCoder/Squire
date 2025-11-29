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
import java.time.Duration;
import java.time.Instant;
import java.util.List;
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
    private static  String[] llIlIIIII;
    private  Object fI;
    private final  SquireQuestHelper fG;
    private static  int[] llIlIIIIl;
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

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    static {
        QuestInfoBox.var2();
        QuestInfoBox.var3();
        fF = llIlIIIII[llIlIIIIl[7]];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        String string;
        QuestInfoBox var10;
        if (QuestInfoBox.var11(this.fG.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var12 = Duration.between(var10.fG.getStarted(), Instant.now());
        var10.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIIIII[llIlIIIIl[0]]).build());
        0;
        List list = var10.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIIIII[llIlIIIIl[1]]);
        if (QuestInfoBox.var11(var10.fG.isEnabled() ? 1 : 0)) {
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
        if (QuestInfoBox.var1(var10.fG.isEnabled() ? 1 : 0)) {
            void var13;
            return super.render((Graphics2D)var13);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[4]]).right(String.valueOf(this.fI)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[5]]).right(String.valueOf(this.fJ)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIIIII[llIlIIIIl[6]]).right(this.fH.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var3() {
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

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = llIlIIIIl[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = llIlIIIIl[0];
        while (QuestInfoBox.var14(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static void var2() {
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

