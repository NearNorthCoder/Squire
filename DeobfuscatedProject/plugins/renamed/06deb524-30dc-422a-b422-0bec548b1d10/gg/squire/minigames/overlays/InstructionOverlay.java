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

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
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

    private static String llIIlllIlIllll(String var1, String var15) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIllIIllIll[9]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIllIIllIll[2], var6);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
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

    private static String llIIlllIlIlllI(String var17, String var20) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var12 = var20.toCharArray();
        int var5 = lIIllIIllIll[0];
        char[] var21 = var17.toCharArray();
        int var2 = var21.length;
        int var11 = lIIllIIllIll[0];
        while (InstructionOverlay.llIIlllIllIIll(var11, var2)) {
            char var7 = var21[var11];
            var9.append((char)(var7 ^ var12[var5 % var12.length]));
            0;
            ++var5;
            ++var11;
            0;
            if (((0xA4 ^ 0x96) & ~(0xA6 ^ 0x94)) == 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static String llIIlllIlIllIl(String var18, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIllIIllIll[2], var16);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        String string;
        void var4;
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
            String var8;
            string2 = var8 = lIIllIIllIlI[lIIllIIllIll[4]];
        }
        if (InstructionOverlay.llIIlllIllIIlI(var4)) {
            string = var4.J();
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

