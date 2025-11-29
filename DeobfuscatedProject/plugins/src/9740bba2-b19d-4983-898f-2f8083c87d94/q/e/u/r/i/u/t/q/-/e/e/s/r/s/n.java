/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Trade
 *  net.unethicalite.api.widgets.Widgets
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Upgrading to members", register=true)
public class n
extends Task {
    private static /* synthetic */ String[] lIIIllIllllIl;
    private final /* synthetic */ SquireQuesterConfig am;
    private static /* synthetic */ int[] lIIIllIlllllI;
    private final /* synthetic */ ConfigManager ao;
    private final /* synthetic */ SquireQuester an;

    private static String lIlIIIllIllIllI(String lllllllllllllllIIIIIlllIIlIllIIl, String lllllllllllllllIIIIIlllIIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlllIIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlllIIlIllIll.init(lIIIllIlllllI[6], lllllllllllllllIIIIIlllIIlIlllII);
            return new String(lllllllllllllllIIIIIlllIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlllIIlIllIlI) {
            lllllllllllllllIIIIIlllIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIllIlllIII() {
        lIIIllIllllIl = new String[lIIIllIlllllI[19]];
        n.lIIIllIllllIl[n.lIIIllIlllllI[0]] = n.lIlIIIllIllIlIl("k0ymtM9/OmJnjKEzTfKEGw==", "mjKcg");
        n.lIIIllIllllIl[n.lIIIllIlllllI[3]] = n.lIlIIIllIllIlIl("GAoQmzfTGcw=", "nDggW");
        n.lIIIllIllllIl[n.lIIIllIlllllI[6]] = n.lIlIIIllIllIlIl("XalgFjFn3/Y=", "KzFun");
        n.lIIIllIllllIl[n.lIIIllIlllllI[7]] = n.lIlIIIllIllIlIl("8R9OJZlFIX803cgIENIr4Q==", "XzKTt");
        n.lIIIllIllllIl[n.lIIIllIlllllI[9]] = n.lIlIIIllIllIllI("tdFqGD5CP0dBYWnp0+EdjV5f4mzmYspZic+ZYpaa5uhBxAcsL15+LCZO4YWw74GBDpwguHH6msOJlt1vmP6cJRYkIGGOrWG1Q31SF+tuJOB9+90a/mJJ+EDOKy5Yl8jDoTOytZ29aRo=", "ioIMs");
        n.lIIIllIllllIl[n.lIIIllIlllllI[4]] = n.lIlIIIllIllIlIl("ySxS+7hERHc=", "Sryzw");
        n.lIIIllIllllIl[n.lIIIllIlllllI[14]] = n.lIlIIIllIllIllI("7deGjvC6HiQ=", "zGURc");
        n.lIIIllIllllIl[n.lIIIllIlllllI[11]] = n.lIlIIIllIllIlIl("aqTKoJFXJ7E=", "cQBFy");
        n.lIIIllIllllIl[n.lIIIllIlllllI[15]] = n.lIlIIIllIllIllI("+gX1LnlGkzM=", "ZDtUy");
        n.lIIIllIllllIl[n.lIIIllIlllllI[16]] = n.lIlIIIllIllIllI("aT1qs9dkugk=", "LMGVZ");
        n.lIIIllIllllIl[n.lIIIllIlllllI[13]] = n.lIlIIIllIllIlIl("JR+S+OchtvLxCggt6Rs1LndtIFi0Gnvn4v8K0mHPpdw=", "atumk");
        n.lIIIllIllllIl[n.lIIIllIlllllI[17]] = n.lIlIIIllIllIlll("QzU5NBAGMQ==", "cBPGx");
        n.lIIIllIllllIl[n.lIIIllIlllllI[18]] = n.lIlIIIllIllIlll("OTsWIxoMPRFmHgo5ESNE", "xXuFj");
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIIIIlllIlIIIIlll;
        String string = chatMessage.getMessage();
        if (n.lIlIIIllIlllllI(string.contains(lIIIllIllllIl[lIIIllIlllllI[13]]) ? 1 : 0)) {
            String string2 = string.split(lIIIllIllllIl[lIIIllIlllllI[17]])[lIIIllIlllllI[0]];
            this.an.a(Text.sanitize((String)string2));
        }
        if (n.lIlIIIllIlllllI(lllllllllllllllIIIIIlllIlIIIIlll.contains(lIIIllIllllIl[lIIIllIlllllI[18]]) ? 1 : 0)) {
            n lllllllllllllllIIIIIlllIlIIIlIIl;
            lllllllllllllllIIIIIlllIlIIIlIIl.an.a((String)null);
        }
    }

    private static String lIlIIIllIllIlll(String lllllllllllllllIIIIIlllIIlllIllI, String lllllllllllllllIIIIIlllIIllllIlI) {
        lllllllllllllllIIIIIlllIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlllIIllllIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIlllIIllllIII = lllllllllllllllIIIIIlllIIllllIlI.toCharArray();
        int lllllllllllllllIIIIIlllIIlllIlll = lIIIllIlllllI[0];
        char[] lllllllllllllllIIIIIlllIIlllIIIl = lllllllllllllllIIIIIlllIIlllIllI.toCharArray();
        int lllllllllllllllIIIIIlllIIlllIIII = lllllllllllllllIIIIIlllIIlllIIIl.length;
        int lllllllllllllllIIIIIlllIIllIllll = lIIIllIlllllI[0];
        while (n.lIlIIIllIllllII(lllllllllllllllIIIIIlllIIllIllll, lllllllllllllllIIIIIlllIIlllIIII)) {
            char lllllllllllllllIIIIIlllIIlllllII = lllllllllllllllIIIIIlllIIlllIIIl[lllllllllllllllIIIIIlllIIllIllll];
            lllllllllllllllIIIIIlllIIllllIIl.append((char)(lllllllllllllllIIIIIlllIIlllllII ^ lllllllllllllllIIIIIlllIIllllIII[lllllllllllllllIIIIIlllIIlllIlll % lllllllllllllllIIIIIlllIIllllIII.length]));
            "".length();
            ++lllllllllllllllIIIIIlllIIlllIlll;
            ++lllllllllllllllIIIIIlllIIllIllll;
            "".length();
            if (((0xEF ^ 0xAB) & ~(0xCC ^ 0x88)) < (0x93 ^ 0x97)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIlllIIllllIIl);
    }

    @Inject
    public n(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, ConfigManager configManager) {
        this.am = squireQuesterConfig;
        this.an = squireQuester;
        this.ao = configManager;
    }

    private static boolean lIlIIIllIlllllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIllIllIlIl(String lllllllllllllllIIIIIlllIIllIIllI, String lllllllllllllllIIIIIlllIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllIlllllI[15]), "DES");
            Cipher lllllllllllllllIIIIIlllIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlllIIllIlIII.init(lIIIllIlllllI[6], lllllllllllllllIIIIIlllIIllIlIIl);
            return new String(lllllllllllllllIIIIIlllIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlllIIllIIlll) {
            lllllllllllllllIIIIIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIlllIIl() {
        lIIIllIlllllI = new int[20];
        n.lIIIllIlllllI[0] = (6 ^ 3) & ~(0xB4 ^ 0xB1);
        n.lIIIllIlllllI[1] = 0xFFFFD359 & 0x2DBF;
        n.lIIIllIlllllI[2] = 0xFFFFEEF5 & 0x17FE;
        n.lIIIllIlllllI[3] = " ".length();
        n.lIIIllIlllllI[4] = 0x3A ^ 0x5A ^ (0xF8 ^ 0x9D);
        n.lIIIllIlllllI[5] = 0xFFFFB7A9 & 0x7BDE;
        n.lIIIllIlllllI[6] = "  ".length();
        n.lIIIllIlllllI[7] = "   ".length();
        n.lIIIllIlllllI[8] = 33 + 177 - 143 + 162;
        n.lIIIllIlllllI[9] = 0x49 ^ 0x3F ^ (0x53 ^ 0x21);
        n.lIIIllIlllllI[10] = 0x20 ^ 0x39 ^ (0x25 ^ 0x7E);
        n.lIIIllIlllllI[11] = 0xB1 ^ 0xB6;
        n.lIIIllIlllllI[12] = 0x6D ^ 0x75;
        n.lIIIllIlllllI[13] = 0x1D ^ 0x2F ^ (0x99 ^ 0xA1);
        n.lIIIllIlllllI[14] = 0xB ^ 0x72 ^ 66 + 100 - 151 + 112;
        n.lIIIllIlllllI[15] = 0x68 ^ 0x60;
        n.lIIIllIlllllI[16] = 0x8F ^ 0x86;
        n.lIIIllIlllllI[17] = 0x53 ^ 0x66 ^ (4 ^ 0x3A);
        n.lIIIllIlllllI[18] = 0x38 ^ 0x34;
        n.lIIIllIlllllI[19] = 0xB1 ^ 0xAC ^ (0x6D ^ 0x7D);
    }

    private static boolean lIlIIIllIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIlllIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        n.lIlIIIllIlllIIl();
        n.lIlIIIllIlllIII();
    }

    public boolean run() {
        n lllllllllllllllIIIIIlllIlIIlIIII;
        if (n.lIlIIIllIlllIlI(this.am.bond() ? 1 : 0)) {
            return lIIIllIlllllI[0];
        }
        int lllllllllllllllIIIIIlllIlIIIllll = Vars.getVarp((int)lIIIllIlllllI[1]);
        int lllllllllllllllIIIIIlllIlIIIlllI = Vars.getVarp((int)lIIIllIlllllI[2]);
        if (n.lIlIIIllIlllIll(lllllllllllllllIIIIIlllIlIIIlllI, lIIIllIlllllI[3])) {
            System.out.println("You have " + lllllllllllllllIIIIIlllIlIIIlllI + " days of members left. You do not need a bond.");
            lllllllllllllllIIIIIlllIlIIlIIII.ao.setConfiguration(lIIIllIllllIl[lIIIllIlllllI[0]], lIIIllIllllIl[lIIIllIlllllI[3]], (Object)lIIIllIlllllI[0]);
            return lIIIllIlllllI[0];
        }
        if (n.lIlIIIllIllllII(lllllllllllllllIIIIIlllIlIIIllll, lIIIllIlllllI[4])) {
            return lIIIllIlllllI[0];
        }
        if (n.lIlIIIllIlllIlI(Trade.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIlllllI[3]];
            nArray[n.lIIIllIlllllI[0]] = lIIIllIlllllI[5];
            if (n.lIlIIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && n.lIlIIIllIllllIl(lllllllllllllllIIIIIlllIlIIlIIII.an.b())) {
                System.out.println(lIIIllIllllIl[lIIIllIlllllI[6]]);
                String[] stringArray = new String[lIIIllIlllllI[3]];
                stringArray[n.lIIIllIlllllI[0]] = lllllllllllllllIIIIIlllIlIIlIIII.an.b();
                Players.getNearest((String[])stringArray).interact(lIIIllIllllIl[lIIIllIlllllI[7]]);
            }
        }
        if (n.lIlIIIllIlllllI(Trade.isFirstScreenOpen() ? 1 : 0)) {
            Trade.acceptFirstScreen();
        }
        if (n.lIlIIIllIlllllI(Trade.isSecondScreenOpen() ? 1 : 0)) {
            Trade.acceptSecondScreen();
        }
        if (n.lIlIIIllIllllIl(Widgets.get((int)lIIIllIlllllI[8], (int)lIIIllIlllllI[3])) && n.lIlIIIllIlllllI(Widgets.get((int)lIIIllIlllllI[8], (int)lIIIllIlllllI[3]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[9]]) ? 1 : 0)) {
            Game.logout();
        }
        if (n.lIlIIIllIllllIl(Widgets.get((int)lIIIllIlllllI[10], (int)lIIIllIlllllI[11]))) {
            if (n.lIlIIIllIlllllI(Widgets.get((int)lIIIllIlllllI[10], (int)lIIIllIlllllI[12], (int)lIIIllIlllllI[13]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[4]]) ? 1 : 0)) {
                Widgets.get((int)lIIIllIlllllI[10], (int)lIIIllIlllllI[11]).interact(lIIIllIllllIl[lIIIllIlllllI[14]]);
            }
            if (n.lIlIIIllIlllllI(Widgets.get((int)lIIIllIlllllI[10], (int)lIIIllIlllllI[12], (int)lIIIllIlllllI[13]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[11]]) ? 1 : 0)) {
                Widgets.get((int)lIIIllIlllllI[10], (int)lIIIllIlllllI[12]).interact(lIIIllIllllIl[lIIIllIlllllI[15]]);
                "".length();
                if ("  ".length() <= 0) {
                    return ((0x10 ^ 0x34) & ~(0x90 ^ 0xB4)) != 0;
                }
            }
        } else {
            int[] nArray = new int[lIIIllIlllllI[3]];
            nArray[n.lIIIllIlllllI[0]] = lIIIllIlllllI[5];
            Inventory.getFirst((int[])nArray).interact(lIIIllIllllIl[lIIIllIlllllI[16]]);
        }
        return lIIIllIlllllI[3];
    }
}

