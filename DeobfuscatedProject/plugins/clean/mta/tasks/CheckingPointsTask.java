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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mta.tasks.GameEnum8;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Checking points", priority=100, blocking=true)
public class CheckingPointsTask
extends Task {
    
    private final  SquireMTA aw;
    private static final  Pattern av;

    static {
        s.lIIIllIIlIllIlI();
        s.lIIIllIIlIlIlIl();
        av = Pattern.compile(lllIlIllllII[lllIlIlllllI[0]], lllIlIlllllI[10]);
    }

    private static void lIIIllIIlIlIlIl() {
        lllIlIllllII = new String[lllIlIlllllI[6]];
        s.lllIlIllllII[s.lllIlIlllllI[0]] = ".*?(\\d{1,5})\\sTelekinetic.*?(\\d{1,5})\\sAlchemist.*?(\\d{1,5})\\sEnchantment.*?(\\d{1,5})\\sGraveyard.*";
    }

    private void b(String string) {
        Matcher matcher = av.matcher(string);
        if (s.lIIIllIIlIlllII(matcher.find() ? 1 : 0)) {
            int n2 = Integer.parseInt(matcher.group(lllIlIlllllI[6]));
            int n3 = Integer.parseInt(matcher.group(lllIlIlllllI[7]));
            int n4 = Integer.parseInt(matcher.group(lllIlIlllllI[8]));
            int n5 = Integer.parseInt(matcher.group(lllIlIlllllI[9]));
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
        if (s.lIIIllIIlIllIll(this.aw.a().isEmpty() ? 1 : 0)) {
            return lllIlIlllllI[0];
        }
        Widget var1 = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[2]);
        Widget var2 = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[3]);
        Widget var3 = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[4]);
        Widget var4 = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[5]);
        if (s.lIIIllIIlIllIll(Widgets.isVisible((Widget)var1) ? 1 : 0)) {
            return lllIlIlllllI[0];
        }
        this.aw.a(c.ALCHEMY, Integer.parseInt(var2_2.getText()));
        this.aw.a(c.TELEKENETIC, Integer.parseInt(var1_1.getText()));
        this.aw.a(c.ENCHANTMENT, Integer.parseInt(var3_3.getText()));
        this.aw.a(c.GRAVEYARD, Integer.parseInt(var4_4.getText()));
        return lllIlIlllllI[6];
    }

    @Inject
    public CheckingPointsTask(SquireMTA squireMTA) {
        this.aw = squireMTA;
    }

    private static boolean lIIIllIIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIIlIlllII(int n2) {
        return n2 != 0;
    }
}

