/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mta.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import gg.squire.mta.tasks.GameEnum2;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Checking points", priority=100, blocking=true)
public class CheckingPointsTask
extends Task {
    
    private final  SquireMTA aw;
    private static final  Pattern av;

    static {
        s.var3();
        s.var4();
        av = Pattern.compile(var2[var1[0]], var1[10]);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var1 = new int[11];
        s.var1[0] = (73 + 112 - 77 + 19 ^ (0x37 ^ 0xE)) & (1 ^ (0x36 ^ 0x71) ^ -1);
        s.var1[1] = 0xFFFFBBFB & 0x462D;
        s.var1[2] = 0x4A ^ 3 ^ (0x78 ^ 0x3B);
        s.var1[3] = 0x36 ^ 0x5A ^ (0xA1 ^ 0xC6);
        s.var1[4] = 0x9F ^ 0xC4 ^ (0x91 ^ 0xC6);
        s.var1[5] = 0x35 ^ 0x38;
        s.var1[6] = 1;
        s.var1[7] = 2;
        s.var1[8] = 3;
        s.var1[9] = 103 + 134 - 168 + 75 ^ 119 + 40 - 111 + 100;
        s.var1[10] = 0x63 ^ 0x43;
    }

    private static void var4() {
        var2 = new String[var1[6]];
        s.var2[s.var1[0]] = ".*?(\\d{1,5})\\sTelekinetic.*?(\\d{1,5})\\sAlchemist.*?(\\d{1,5})\\sEnchantment.*?(\\d{1,5})\\sGraveyard.*";
    }

    private void b(String string) {
        Matcher matcher = av.matcher(string);
        if (s.var11(matcher.find() ? 1 : 0)) {
            int n2 = Integer.parseInt(matcher.group(var1[6]));
            int n3 = Integer.parseInt(matcher.group(var1[7]));
            int n4 = Integer.parseInt(matcher.group(var1[8]));
            int n5 = Integer.parseInt(matcher.group(var1[9]));
            this.aw.a(c.ALCHEMY, n3);
            this.aw.a(c.ENCHANTMENT, n4);
            this.aw.a(c.GRAVEYARD, n5);
            this.aw.a(c.TELEKENETIC, n2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        void var3_3;
        void var1_1;
        void var2_2;
        if (s.var12(this.aw.a().isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        Widget var13 = Widgets.get((int)var1[1], (int)var1[2]);
        Widget var14 = Widgets.get((int)var1[1], (int)var1[3]);
        Widget var15 = Widgets.get((int)var1[1], (int)var1[4]);
        Widget var16 = Widgets.get((int)var1[1], (int)var1[5]);
        if (s.var12(Widgets.isVisible((Widget)var13) ? 1 : 0)) {
            return var1[0];
        }
        this.aw.a(c.ALCHEMY, Integer.parseInt(var2_2.getText()));
        this.aw.a(c.TELEKENETIC, Integer.parseInt(var1_1.getText()));
        this.aw.a(c.ENCHANTMENT, Integer.parseInt(var3_3.getText()));
        this.aw.a(c.GRAVEYARD, Integer.parseInt(var4_4.getText()));
        return var1[6];
    }

    @Inject
    public CheckingPointsTask(SquireMTA squireMTA) {
        this.aw = squireMTA;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }
}

