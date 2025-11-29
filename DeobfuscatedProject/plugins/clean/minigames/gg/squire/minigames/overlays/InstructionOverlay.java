/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.MenuAction
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayMenuEntry
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.minigames.overlays;

import gg.squire.minigames.overlays.DHelper;
import gg.squire.minigames.overlays.MinigamesTaskBase;
import gg.squire.minigames.overlays.OHelper;
import gg.squire.minigames.overlays.MinigamesTaskBase;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Singleton
public class InstructionOverlay
extends OverlayPanel {
    @Inject
    private  o j;
    @Inject
    private  D aG;
    @Inject
    private  SquireBlastFurnaceConfig i;

    private static final  Color bU;
    public static final  String bT;
    private final  SquireBlastFurnace bV;

    private static void llIIlllIllIIII() {
        lIIllIIllIlI = new String[lIIllIIllIll[9]];
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[0]] = "Reset";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[1]] = "Easy blast furnace overlay";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[2]] = "Configure";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[3]] = "Easy blast furnace overlay";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[4]] = "No method selected";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[5]] = "Withdraw an ore from the bank to start. You can start a hybrid method by also withdrawing gold ore.";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[6]] = "XD";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[7]] = "Reset";
    }

    static {
        InstructionOverlay.llIIlllIllIIIl();
        InstructionOverlay.llIIlllIllIIII();
        bT = lIIllIIllIlI[lIIllIIllIll[7]];
        bU = new Color(lIIllIIllIll[8], lIIllIIllIll[8], lIIllIIllIll[8]);
    }

    @Inject
    InstructionOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.bV = squireBlastFurnace;
        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY, lIIllIIllIlI[lIIllIIllIll[0]], lIIllIIllIlI[lIIllIIllIll[1]]));

        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIIllIIllIlI[lIIllIIllIll[2]], lIIllIIllIlI[lIIllIIllIll[3]]));

    }

    private static boolean llIIlllIllIIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        String string;
        void var2;
        String string2;
        h h2 = this.aG.X();
        w w2 = this.aG.Y();
        if (InstructionOverlay.llIIlllIllIIlI(h2)) {
            string2 = h2.g();

            if (-(0x55 ^ 0x51) > 0) {
                return null;
            }
        } else {
            String var3;
            string2 = var3 = lIIllIIllIlI[lIIllIIllIll[4]];
        }
        if (InstructionOverlay.llIIlllIllIIlI(var2)) {
            string = var2.J();

            if (-1 >= 1) {
                return null;
            }
        } else {
            string = lIIllIIllIlI[lIIllIIllIll[5]];
        }
        String string3 = string;
        this.panelComponent.getChildren().add(TitleComponent.builder().text(lIIllIIllIlI[lIIllIIllIll[6]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left((String)var4_4).leftColor(ColorScheme.PROGRESS_COMPLETE_COLOR).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(string3).leftColor(bU).build());

        return super.render(graphics2D);
    }

    private static boolean llIIlllIllIIll(int n2, int n3) {
        return n2 < n3;
    }
}

