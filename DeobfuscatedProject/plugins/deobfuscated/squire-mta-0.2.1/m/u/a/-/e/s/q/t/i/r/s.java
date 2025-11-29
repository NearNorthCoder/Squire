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
package m.u.a.-.e.s.q.t.i.r;

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
import m.u.a.-.e.s.q.t.i.r.c;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Checking points", priority=100, blocking=true)
public class s
extends Task {
    private static /* synthetic */ int[] lllIlIlllllI;
    private final /* synthetic */ SquireMTA aw;
    private static final /* synthetic */ Pattern av;
    private static /* synthetic */ String[] lllIlIllllII;

    static {
        s.lIIIllIIlIllIlI();
        s.lIIIllIIlIlIlIl();
        av = Pattern.compile(lllIlIllllII[lllIlIlllllI[0]], lllIlIlllllI[10]);
    }

    private static String lIIIllIIlIlIlII(String lllllllllllllllIIllIlIIlIlIIIIII, String lllllllllllllllIIllIlIIlIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlIlIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlIlIIIIlI.init(lllIlIlllllI[7], lllllllllllllllIIllIlIIlIlIIIIll);
            return new String(lllllllllllllllIIllIlIIlIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIlIIIIIl) {
            lllllllllllllllIIllIlIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIlIllIlI() {
        lllIlIlllllI = new int[11];
        s.lllIlIlllllI[0] = (73 + 112 - 77 + 19 ^ (0x37 ^ 0xE)) & (1 ^ (0x36 ^ 0x71) ^ -1);
        s.lllIlIlllllI[1] = 0xFFFFBBFB & 0x462D;
        s.lllIlIlllllI[2] = 0x4A ^ 3 ^ (0x78 ^ 0x3B);
        s.lllIlIlllllI[3] = 0x36 ^ 0x5A ^ (0xA1 ^ 0xC6);
        s.lllIlIlllllI[4] = 0x9F ^ 0xC4 ^ (0x91 ^ 0xC6);
        s.lllIlIlllllI[5] = 0x35 ^ 0x38;
        s.lllIlIlllllI[6] = 1;
        s.lllIlIlllllI[7] = 2;
        s.lllIlIlllllI[8] = 3;
        s.lllIlIlllllI[9] = 103 + 134 - 168 + 75 ^ 119 + 40 - 111 + 100;
        s.lllIlIlllllI[10] = 0x63 ^ 0x43;
    }

    private static void lIIIllIIlIlIlIl() {
        lllIlIllllII = new String[lllIlIlllllI[6]];
        s.lllIlIllllII[s.lllIlIlllllI[0]] = s.".*?(\\d{1,5})\\sTelekinetic.*?(\\d{1,5})\\sAlchemist.*?(\\d{1,5})\\sEnchantment.*?(\\d{1,5})\\sGraveyard.*";
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
        Widget lllllllllllllllIIllIlIIlIlIllIIl = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[2]);
        Widget lllllllllllllllIIllIlIIlIlIllIII = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[3]);
        Widget lllllllllllllllIIllIlIIlIlIlIlll = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[4]);
        Widget lllllllllllllllIIllIlIIlIlIlIllI = Widgets.get((int)lllIlIlllllI[1], (int)lllIlIlllllI[5]);
        if (s.lIIIllIIlIllIll(Widgets.isVisible((Widget)lllllllllllllllIIllIlIIlIlIllIIl) ? 1 : 0)) {
            return lllIlIlllllI[0];
        }
        this.aw.a(c.ALCHEMY, Integer.parseInt(var2_2.getText()));
        this.aw.a(c.TELEKENETIC, Integer.parseInt(var1_1.getText()));
        this.aw.a(c.ENCHANTMENT, Integer.parseInt(var3_3.getText()));
        this.aw.a(c.GRAVEYARD, Integer.parseInt(var4_4.getText()));
        return lllIlIlllllI[6];
    }

    @Inject
    public s(SquireMTA squireMTA) {
        this.aw = squireMTA;
    }

    private static boolean lIIIllIIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIIlIlllII(int n2) {
        return n2 != 0;
    }
}

