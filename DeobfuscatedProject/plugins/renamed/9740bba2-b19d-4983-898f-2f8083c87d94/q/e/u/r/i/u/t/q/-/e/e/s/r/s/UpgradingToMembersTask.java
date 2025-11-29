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

/* TASK: Upgrading to members -> UpgradingtomembersTask */
@TaskDesc(name="Upgrading to members", register=true)
public class UpgradingToMembersTask
extends Task {
    private static /* synthetic */ String[] lIIIllIllllIl;
    private final /* synthetic */ SquireQuesterConfig am;
    private static /* synthetic */ int[] lIIIllIlllllI;
    private final /* synthetic */ ConfigManager ao;
    private final /* synthetic */ SquireQuester an;

    private static String lIlIIIllIllIllI(String var11, String var6) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIIIllIlllllI[6], var4);
            return new String(var18.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIllIlllIII() {
        lIIIllIllllIl = new String[lIIIllIlllllI[19]];
        n.lIIIllIllllIl[n.lIIIllIlllllI[0]] = n."squirequester";
        n.lIIIllIllllIl[n.lIIIllIlllllI[3]] = n."Bond";
        n.lIIIllIllllIl[n.lIIIllIlllllI[6]] = n."Trading";
        n.lIIIllIllllIl[n.lIIIllIlllllI[7]] = n."Trade with";
        n.lIIIllIllllIl[n.lIIIllIlllllI[9]] = n."You've gained 14 days of membership.<br>Please log out before attempting to log into members' worlds.";
        n.lIIIllIllllIl[n.lIIIllIlllllI[4]] = n."---";
        n.lIIIllIllllIl[n.lIIIllIlllllI[14]] = n."1 Bond";
        n.lIIIllIllllIl[n.lIIIllIlllllI[11]] = n."Confirm";
        n.lIIIllIllllIl[n.lIIIllIlllllI[15]] = n."Confirm";
        n.lIIIllIllllIl[n.lIIIllIlllllI[16]] = n."Redeem";
        n.lIIIllIllllIl[n.lIIIllIlllllI[13]] = n."wishes to trade with you";
        n.lIIIllIllllIl[n.lIIIllIlllllI[17]] = n." wishes";
        n.lIIIllIllllIl[n.lIIIllIlllllI[18]] = n."Accepted trade.";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (n.lIlIIIllIlllllI(string.contains(lIIIllIllllIl[lIIIllIlllllI[13]]) ? 1 : 0)) {
            String string2 = string.split(lIIIllIllllIl[lIIIllIlllllI[17]])[lIIIllIlllllI[0]];
            this.an.a(Text.sanitize((String)string2));
        }
        if (n.lIlIIIllIlllllI(var1.contains(lIIIllIllllIl[lIIIllIlllllI[18]]) ? 1 : 0)) {
            n var17;
            var17.an.a((String)null);
        }
    }

    private static String lIlIIIllIllIlll(String var8, String var24) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var5 = var24.toCharArray();
        int var12 = lIIIllIlllllI[0];
        char[] var14 = var8.toCharArray();
        int var21 = var14.length;
        int var2 = lIIIllIlllllI[0];
        while (n.lIlIIIllIllllII(var2, var21)) {
            char var15 = var14[var2];
            var20.append((char)(var15 ^ var5[var12 % var5.length]));
            0;
            ++var12;
            ++var2;
            0;
            if (((0xEF ^ 0xAB) & ~(0xCC ^ 0x88)) < (0x93 ^ 0x97)) continue;
            return null;
        }
        return String.valueOf(var20);
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

    private static String lIlIIIllIllIlIl(String var13, String var16) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIIIllIlllllI[15]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIIllIlllllI[6], var23);
            return new String(var7.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIlllIIl() {
        lIIIllIlllllI = new int[20];
        n.lIIIllIlllllI[0] = (6 ^ 3) & ~(0xB4 ^ 0xB1);
        n.lIIIllIlllllI[1] = 0xFFFFD359 & 0x2DBF;
        n.lIIIllIlllllI[2] = 0xFFFFEEF5 & 0x17FE;
        n.lIIIllIlllllI[3] = 1;
        n.lIIIllIlllllI[4] = 0x3A ^ 0x5A ^ (0xF8 ^ 0x9D);
        n.lIIIllIlllllI[5] = 0xFFFFB7A9 & 0x7BDE;
        n.lIIIllIlllllI[6] = 2;
        n.lIIIllIlllllI[7] = 3;
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
        n var19;
        if (n.lIlIIIllIlllIlI(this.am.bond() ? 1 : 0)) {
            return lIIIllIlllllI[0];
        }
        int var9 = Vars.getVarp((int)lIIIllIlllllI[1]);
        int var22 = Vars.getVarp((int)lIIIllIlllllI[2]);
        if (n.lIlIIIllIlllIll(var22, lIIIllIlllllI[3])) {
            System.out.println("You have " + var22 + " days of members left. You do not need a bond.");
            var19.ao.setConfiguration(lIIIllIllllIl[lIIIllIlllllI[0]], lIIIllIllllIl[lIIIllIlllllI[3]], (Object)lIIIllIlllllI[0]);
            return lIIIllIlllllI[0];
        }
        if (n.lIlIIIllIllllII(var9, lIIIllIlllllI[4])) {
            return lIIIllIlllllI[0];
        }
        if (n.lIlIIIllIlllIlI(Trade.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIlllllI[3]];
            nArray[n.lIIIllIlllllI[0]] = lIIIllIlllllI[5];
            if (n.lIlIIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && n.lIlIIIllIllllIl(var19.an.b())) {
                System.out.println(lIIIllIllllIl[lIIIllIlllllI[6]]);
                String[] stringArray = new String[lIIIllIlllllI[3]];
                stringArray[n.lIIIllIlllllI[0]] = var19.an.b();
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
                0;
                if (2 <= 0) {
                    return false;
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

