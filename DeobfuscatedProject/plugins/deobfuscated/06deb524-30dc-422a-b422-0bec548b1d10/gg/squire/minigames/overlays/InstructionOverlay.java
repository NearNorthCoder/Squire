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

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
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
    private /* synthetic */ o j;
    @Inject
    private /* synthetic */ D aG;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static /* synthetic */ int[] lIIllIIllIll;
    private static /* synthetic */ String[] lIIllIIllIlI;
    private static final /* synthetic */ Color bU;
    public static final /* synthetic */ String bT;
    private final /* synthetic */ SquireBlastFurnace bV;

    private static String llIIlllIlIllll(String lllllllllllllllIlllIlllIlIlIlIlI, String lllllllllllllllIlllIlllIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIllIll[9]), "DES");
            Cipher lllllllllllllllIlllIlllIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllIlIlIllII.init(lIIllIIllIll[2], lllllllllllllllIlllIlllIlIlIllIl);
            return new String(lllllllllllllllIlllIlllIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIlIlIlIll) {
            lllllllllllllllIlllIlllIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIllIIII() {
        lIIllIIllIlI = new String[lIIllIIllIll[9]];
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[0]] = InstructionOverlay."Reset";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[1]] = InstructionOverlay."Easy blast furnace overlay";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[2]] = InstructionOverlay."Configure";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[3]] = InstructionOverlay."Easy blast furnace overlay";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[4]] = InstructionOverlay."No method selected";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[5]] = InstructionOverlay."Withdraw an ore from the bank to start. You can start a hybrid method by also withdrawing gold ore.";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[6]] = InstructionOverlay."XD";
        InstructionOverlay.lIIllIIllIlI[InstructionOverlay.lIIllIIllIll[7]] = InstructionOverlay."Reset";
    }

    static {
        InstructionOverlay.llIIlllIllIIIl();
        InstructionOverlay.llIIlllIllIIII();
        bT = lIIllIIllIlI[lIIllIIllIll[7]];
        bU = new Color(lIIllIIllIll[8], lIIllIIllIll[8], lIIllIIllIll[8]);
    }

    private static void llIIlllIllIIIl() {
        lIIllIIllIll = new int[10];
        InstructionOverlay.lIIllIIllIll[0] = (0x6F ^ 0x3C) & ~(0xFB ^ 0xA8);
        InstructionOverlay.lIIllIIllIll[1] = 1;
        InstructionOverlay.lIIllIIllIll[2] = 2;
        InstructionOverlay.lIIllIIllIll[3] = 3;
        InstructionOverlay.lIIllIIllIll[4] = 0x29 ^ 0x2D;
        InstructionOverlay.lIIllIIllIll[5] = 0xF8 ^ 0x91 ^ (0xF9 ^ 0x95);
        InstructionOverlay.lIIllIIllIll[6] = 0xA5 ^ 0xA3;
        InstructionOverlay.lIIllIIllIll[7] = 0x45 ^ 0x56 ^ (0x28 ^ 0x3C);
        InstructionOverlay.lIIllIIllIll[8] = 102 + 16 - 25 + 97;
        InstructionOverlay.lIIllIIllIll[9] = 0x48 ^ 0x40;
    }

    @Inject
    InstructionOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.bV = squireBlastFurnace;
        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY, lIIllIIllIlI[lIIllIIllIll[0]], lIIllIIllIlI[lIIllIIllIll[1]]));
        0;
        this.getMenuEntries().add(new OverlayMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIIllIIllIlI[lIIllIIllIll[2]], lIIllIIllIlI[lIIllIIllIll[3]]));
        0;
    }

    private static boolean llIIlllIllIIlI(Object object) {
        return object != null;
    }

    private static String llIIlllIlIlllI(String lllllllllllllllIlllIlllIlIlllIlI, String lllllllllllllllIlllIlllIlIlllIIl) {
        lllllllllllllllIlllIlllIlIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlllIlllIlIllllII = lllllllllllllllIlllIlllIlIlllIIl.toCharArray();
        int lllllllllllllllIlllIlllIlIlllIll = lIIllIIllIll[0];
        char[] lllllllllllllllIlllIlllIlIllIlIl = lllllllllllllllIlllIlllIlIlllIlI.toCharArray();
        int lllllllllllllllIlllIlllIlIllIlII = lllllllllllllllIlllIlllIlIllIlIl.length;
        int lllllllllllllllIlllIlllIlIllIIll = lIIllIIllIll[0];
        while (InstructionOverlay.llIIlllIllIIll(lllllllllllllllIlllIlllIlIllIIll, lllllllllllllllIlllIlllIlIllIlII)) {
            char lllllllllllllllIlllIlllIllIIIIII = lllllllllllllllIlllIlllIlIllIlIl[lllllllllllllllIlllIlllIlIllIIll];
            lllllllllllllllIlllIlllIlIllllIl.append((char)(lllllllllllllllIlllIlllIllIIIIII ^ lllllllllllllllIlllIlllIlIllllII[lllllllllllllllIlllIlllIlIlllIll % lllllllllllllllIlllIlllIlIllllII.length]));
            0;
            ++lllllllllllllllIlllIlllIlIlllIll;
            ++lllllllllllllllIlllIlllIlIllIIll;
            0;
            if (((0xA4 ^ 0x96) & ~(0xA6 ^ 0x94)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlllIlIllllIl);
    }

    private static String llIIlllIlIllIl(String lllllllllllllllIlllIlllIllIIllIl, String lllllllllllllllIlllIlllIllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIllIlIIIl.init(lIIllIIllIll[2], lllllllllllllllIlllIlllIllIlIIlI);
            return new String(lllllllllllllllIlllIlllIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIllIlIIII) {
            lllllllllllllllIlllIlllIllIlIIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        String string;
        void lllllllllllllllIlllIlllIllIllIIl;
        String string2;
        h h2 = this.aG.X();
        w w2 = this.aG.Y();
        if (InstructionOverlay.llIIlllIllIIlI(h2)) {
            string2 = h2.g();
            0;
            if (-(0x55 ^ 0x51) > 0) {
                return null;
            }
        } else {
            String lllllllllllllllIlllIlllIllIllIII;
            string2 = lllllllllllllllIlllIlllIllIllIII = lIIllIIllIlI[lIIllIIllIll[4]];
        }
        if (InstructionOverlay.llIIlllIllIIlI(lllllllllllllllIlllIlllIllIllIIl)) {
            string = lllllllllllllllIlllIlllIllIllIIl.J();
            0;
            if (-1 >= 1) {
                return null;
            }
        } else {
            string = lIIllIIllIlI[lIIllIIllIll[5]];
        }
        String string3 = string;
        this.panelComponent.getChildren().add(TitleComponent.builder().text(lIIllIIllIlI[lIIllIIllIll[6]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left((String)var4_4).leftColor(ColorScheme.PROGRESS_COMPLETE_COLOR).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(string3).leftColor(bU).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean llIIlllIllIIll(int n2, int n3) {
        return n2 < n3;
    }
}

