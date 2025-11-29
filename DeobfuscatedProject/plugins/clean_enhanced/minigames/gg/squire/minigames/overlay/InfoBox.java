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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireSorceressGarden;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private final  SquireSorceressGarden p;
    private final  TaskManager q;
    
    private final  SquireSorceressGardenConfig r;

    public long n(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (InfoBox.var3(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static void var4() {
        var2 = new String[var1[19]];
        InfoBox.var2[InfoBox.var1[1]] = "Squire Sorceress Garden";
        InfoBox.var2[InfoBox.var1[2]] = "Runtime";
        InfoBox.var2[InfoBox.var1[3]] = "Task: ";
        InfoBox.var2[InfoBox.var1[4]] = "Sq'irks Collected: ";
        InfoBox.var2[InfoBox.var1[5]] = "XP PH: ";
        InfoBox.var2[InfoBox.var1[6]] = "Herbs Collected: ";
        InfoBox.var2[InfoBox.var1[7]] = "Guams Collected: ";
        InfoBox.var2[InfoBox.var1[8]] = "Marrentills Collected: ";
        InfoBox.var2[InfoBox.var1[9]] = "Tarromins Collected: ";
        InfoBox.var2[InfoBox.var1[10]] = "Harralanders Collected: ";
        InfoBox.var2[InfoBox.var1[0]] = "Irits Collected: ";
        InfoBox.var2[InfoBox.var1[11]] = "Avantoes Collected: ";
        InfoBox.var2[InfoBox.var1[12]] = "Ranarrs Collected: ";
        InfoBox.var2[InfoBox.var1[13]] = "Kwuarms Collected: ";
        InfoBox.var2[InfoBox.var1[14]] = "Cadantines Collected: ";
        InfoBox.var2[InfoBox.var1[15]] = "Lantadymes Collected: ";
        InfoBox.var2[InfoBox.var1[16]] = "Dwarf Weeds Collected: ";
    }

    @Inject
    private InfoBox(SquireSorceressGarden squireSorceressGarden, SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.p = squireSorceressGarden;
        this.q = squireSorceressGarden.getManager();
        this.r = squireSorceressGardenConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[1];
        while (InfoBox.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (((0xEB ^ 0xA3) & ~(0x8E ^ 0xC6)) == 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var28(int n) {
        return n != 0;
    }

    static {
        InfoBox.var29();
        InfoBox.var4();
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var30;
        if (InfoBox.var28(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var31 = Duration.between(var30.p.getStarted(), Instant.now());
        var30.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        var30.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[var1[1]]).build());
        0;
        var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(Time.format((Duration)var31)).build());
        0;
        var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[3]]).right(var30.q.getCurrentTask()).build());
        0;
        if (InfoBox.var3(var30.r.pickHerbs() ? 1 : 0)) {
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(var30.p.a() + " (" + var30.n(var30.p.a()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(NumberFormat.getIntegerInstance().format(var30.n())).build());
            0;
            0;
            if (((0x42 ^ 0x18) & ~(0x3B ^ 0x61)) >= 2) {
                return null;
            }
        } else if (InfoBox.var3(var30.r.breakDownHerbs() ? 1 : 0)) {
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(var30.p.b() + " (" + var30.n(var30.p.b()) + "/h)").build());
            0;
            0;
            if ((66 + 72 - 116 + 109 ^ 37 + 62 - 21 + 57) <= 0) {
                return null;
            }
        } else {
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(var30.p.c() + " (" + var30.n(var30.p.c()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[8]]).right(var30.p.d() + " (" + var30.n(var30.p.d()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[9]]).right(var30.p.e() + " (" + var30.n(var30.p.e()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[10]]).right(var30.p.f() + " (" + var30.n(var30.p.f()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[0]]).right(var30.p.g() + " (" + var30.n(var30.p.g()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(var30.p.h() + " (" + var30.n(var30.p.h()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(var30.p.i() + " (" + var30.n(var30.p.i()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[13]]).right(var30.p.j() + " (" + var30.n(var30.p.j()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[14]]).right(var30.p.k() + " (" + var30.n(var30.p.k()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[15]]).right(var30.p.l() + " (" + var30.n(var30.p.l()) + "/h)").build());
            0;
            var30.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[16]]).right(var30.p.m() + " (" + var30.n(var30.p.m()) + "/h)").build());
            0;
        }
        int n = var1[17];
        this.panelComponent.setPreferredSize(new Dimension(n + var1[18], var1[1]));
        return super.render(graphics2D);
    }

    private static boolean var3(int n) {
        return n == 0;
    }

    public long n() {
        int n = (int)this.n(this.p.a());
        return (long)n * 1500L;
    }

    private static boolean var26(int n, int n2) {
        return n < n2;
    }

    private static void var29() {
        var1 = new int[20];
        InfoBox.var1[0] = 65 + 123 - 111 + 94 ^ 133 + 29 - 68 + 67;
        InfoBox.var1[1] = (0x93 ^ 0xBA) & ~(0x25 ^ 0xC);
        InfoBox.var1[2] = 1;
        InfoBox.var1[3] = 2;
        InfoBox.var1[4] = 3;
        InfoBox.var1[5] = 0x5E ^ 0x5A;
        InfoBox.var1[6] = 0x2A ^ 3 ^ (0x7D ^ 0x51);
        InfoBox.var1[7] = 0xC0 ^ 0xC6;
        InfoBox.var1[8] = 0x68 ^ 0x6F;
        InfoBox.var1[9] = 0 ^ 0x57 ^ (0x26 ^ 0x79);
        InfoBox.var1[10] = 0x43 ^ 0x2E ^ (0x32 ^ 0x56);
        InfoBox.var1[11] = 0x68 ^ 0x56 ^ (0x85 ^ 0xB0);
        InfoBox.var1[12] = 0xB1 ^ 0xBD;
        InfoBox.var1[13] = 0x6E ^ 0x63;
        InfoBox.var1[14] = 0xBA ^ 0xB4;
        InfoBox.var1[15] = 0x35 ^ 8 ^ (0xAD ^ 0x9F);
        InfoBox.var1[16] = 0x39 ^ 0x29;
        InfoBox.var1[17] = 0xFFFF9B3E & 0x65C3;
        InfoBox.var1[18] = 0 ^ 0x14;
        InfoBox.var1[19] = 0x19 ^ 0x23 ^ (0x34 ^ 0x1F);
    }
}

