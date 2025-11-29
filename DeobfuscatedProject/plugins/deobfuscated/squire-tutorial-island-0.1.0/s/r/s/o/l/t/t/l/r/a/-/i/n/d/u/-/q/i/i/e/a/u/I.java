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
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.SquireTutorialIsland;
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
public class I
extends Task {
    private final /* synthetic */ SquireQuesterConfig aF;
    private static /* synthetic */ String[] lIlIIIllllIll;
    private final /* synthetic */ SquireTutorialIsland aG;
    private static /* synthetic */ int[] lIlIIIlllllII;
    private final /* synthetic */ ConfigManager aH;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllIlllIIIIllIlIllIll;
        String string = chatMessage.getMessage();
        if (I.lIlllIIIllIIIIl(string.contains(lIlIIIllllIll[lIlIIIlllllII[14]]) ? 1 : 0)) {
            String string2 = string.split(lIlIIIllllIll[lIlIIIlllllII[18]])[lIlIIIlllllII[0]];
            this.aG.a(Text.sanitize((String)string2));
        }
        if (I.lIlllIIIllIIIIl(llllllllllllllIlllIIIIllIlIllIll.contains(lIlIIIllllIll[lIlIIIlllllII[19]]) ? 1 : 0)) {
            I llllllllllllllIlllIIIIllIlIlllIl;
            llllllllllllllIlllIIIIllIlIlllIl.aG.a((String)null);
        }
    }

    private static String lIlllIIIlIllIIl(String llllllllllllllIlllIIIIllIIllllIl, String llllllllllllllIlllIIIIllIIllllII) {
        llllllllllllllIlllIIIIllIIllllIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIIllIlIIIIII = new StringBuilder();
        char[] llllllllllllllIlllIIIIllIIllllll = llllllllllllllIlllIIIIllIIllllII.toCharArray();
        int llllllllllllllIlllIIIIllIIlllllI = lIlIIIlllllII[0];
        char[] llllllllllllllIlllIIIIllIIlllIII = llllllllllllllIlllIIIIllIIllllIl.toCharArray();
        int llllllllllllllIlllIIIIllIIllIlll = llllllllllllllIlllIIIIllIIlllIII.length;
        int llllllllllllllIlllIIIIllIIllIllI = lIlIIIlllllII[0];
        while (I.lIlllIIIlIllllI(llllllllllllllIlllIIIIllIIllIllI, llllllllllllllIlllIIIIllIIllIlll)) {
            char llllllllllllllIlllIIIIllIlIIIIll = llllllllllllllIlllIIIIllIIlllIII[llllllllllllllIlllIIIIllIIllIllI];
            llllllllllllllIlllIIIIllIlIIIIII.append((char)(llllllllllllllIlllIIIIllIlIIIIll ^ llllllllllllllIlllIIIIllIIllllll[llllllllllllllIlllIIIIllIIlllllI % llllllllllllllIlllIIIIllIIllllll.length]));
            0;
            ++llllllllllllllIlllIIIIllIIlllllI;
            ++llllllllllllllIlllIIIIllIIllIllI;
            0;
            if ((0x8F ^ 0xAB ^ (0x77 ^ 0x57)) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIIllIlIIIIII);
    }

    @Inject
    public I(SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland, ConfigManager configManager) {
        this.aF = squireQuesterConfig;
        this.aG = squireTutorialIsland;
        this.aH = configManager;
    }

    private static String lIlllIIIlIllIlI(String llllllllllllllIlllIIIIllIlIlIIII, String llllllllllllllIlllIIIIllIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlllllII[16]), "DES");
            Cipher llllllllllllllIlllIIIIllIlIlIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIllIlIlIlII.init(lIlIIIlllllII[7], llllllllllllllIlllIIIIllIlIlIlIl);
            return new String(llllllllllllllIlllIIIIllIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIllIlIlIIll) {
            llllllllllllllIlllIIIIllIlIlIIll.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        I llllllllllllllIlllIIIIllIllIIlII;
        if (I.lIlllIIIlIlllIl(this.aF.bond() ? 1 : 0)) {
            return lIlIIIlllllII[0];
        }
        int llllllllllllllIlllIIIIllIllIIIll = Vars.getVarp((int)lIlIIIlllllII[1]);
        if (I.lIlllIIIlIllllI(llllllllllllllIlllIIIIllIllIIIll, lIlIIIlllllII[2])) {
            return lIlIIIlllllII[0];
        }
        int llllllllllllllIlllIIIIllIllIIIlI = Vars.getVarp((int)lIlIIIlllllII[3]);
        if (I.lIlllIIIlIlllll(llllllllllllllIlllIIIIllIllIIIlI, lIlIIIlllllII[4])) {
            System.out.println("You have " + llllllllllllllIlllIIIIllIllIIIlI + " days of members left. You do not need a bond.");
            llllllllllllllIlllIIIIllIllIIlII.aH.setConfiguration(lIlIIIllllIll[lIlIIIlllllII[0]], lIlIIIllllIll[lIlIIIlllllII[4]], (Object)lIlIIIlllllII[0]);
            return lIlIIIlllllII[0];
        }
        if (I.lIlllIIIlIllllI(llllllllllllllIlllIIIIllIllIIIll, lIlIIIlllllII[5])) {
            return lIlIIIlllllII[0];
        }
        if (I.lIlllIIIlIlllIl(Trade.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIlIIIlllllII[4]];
            nArray[I.lIlIIIlllllII[0]] = lIlIIIlllllII[6];
            if (I.lIlllIIIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0) && I.lIlllIIIllIIIII(llllllllllllllIlllIIIIllIllIIlII.aG.b())) {
                System.out.println(lIlIIIllllIll[lIlIIIlllllII[7]]);
                String[] stringArray = new String[lIlIIIlllllII[4]];
                stringArray[I.lIlIIIlllllII[0]] = llllllllllllllIlllIIIIllIllIIlII.aG.b();
                Players.getNearest((String[])stringArray).interact(lIlIIIllllIll[lIlIIIlllllII[8]]);
            }
        }
        if (I.lIlllIIIllIIIIl(Trade.isFirstScreenOpen() ? 1 : 0)) {
            Trade.acceptFirstScreen();
        }
        if (I.lIlllIIIllIIIIl(Trade.isSecondScreenOpen() ? 1 : 0)) {
            Trade.acceptSecondScreen();
        }
        if (I.lIlllIIIllIIIII(Widgets.get((int)lIlIIIlllllII[9], (int)lIlIIIlllllII[4])) && I.lIlllIIIllIIIIl(Widgets.get((int)lIlIIIlllllII[9], (int)lIlIIIlllllII[4]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[10]]) ? 1 : 0)) {
            Game.logout();
        }
        if (I.lIlllIIIllIIIII(Widgets.get((int)lIlIIIlllllII[11], (int)lIlIIIlllllII[12]))) {
            if (I.lIlllIIIllIIIIl(Widgets.get((int)lIlIIIlllllII[11], (int)lIlIIIlllllII[13], (int)lIlIIIlllllII[14]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[5]]) ? 1 : 0)) {
                Widgets.get((int)lIlIIIlllllII[11], (int)lIlIIIlllllII[12]).interact(lIlIIIllllIll[lIlIIIlllllII[15]]);
            }
            if (I.lIlllIIIllIIIIl(Widgets.get((int)lIlIIIlllllII[11], (int)lIlIIIlllllII[13], (int)lIlIIIlllllII[14]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[12]]) ? 1 : 0)) {
                Widgets.get((int)lIlIIIlllllII[11], (int)lIlIIIlllllII[13]).interact(lIlIIIllllIll[lIlIIIlllllII[16]]);
                0;
                if (((0xD7 ^ 0x9C) & ~(0xFD ^ 0xB6)) > 1) {
                    return ((0x83 ^ 0xBC) & ~(0x77 ^ 0x48)) != 0;
                }
            }
        } else {
            int[] nArray = new int[lIlIIIlllllII[4]];
            nArray[I.lIlIIIlllllII[0]] = lIlIIIlllllII[6];
            Inventory.getFirst((int[])nArray).interact(lIlIIIllllIll[lIlIIIlllllII[17]]);
        }
        return lIlIIIlllllII[4];
    }

    private static boolean lIlllIIIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIlIllIll() {
        lIlIIIllllIll = new String[lIlIIIlllllII[20]];
        I.lIlIIIllllIll[I.lIlIIIlllllII[0]] = I."squirequester";
        I.lIlIIIllllIll[I.lIlIIIlllllII[4]] = I."Bond";
        I.lIlIIIllllIll[I.lIlIIIlllllII[7]] = I."Trading";
        I.lIlIIIllllIll[I.lIlIIIlllllII[8]] = I."Trade with";
        I.lIlIIIllllIll[I.lIlIIIlllllII[10]] = I."You've gained 14 days of membership.<br>Please log out before attempting to log into members' worlds.";
        I.lIlIIIllllIll[I.lIlIIIlllllII[5]] = I."---";
        I.lIlIIIllllIll[I.lIlIIIlllllII[15]] = I."1 Bond";
        I.lIlIIIllllIll[I.lIlIIIlllllII[12]] = I."Confirm";
        I.lIlIIIllllIll[I.lIlIIIlllllII[16]] = I."Confirm";
        I.lIlIIIllllIll[I.lIlIIIlllllII[17]] = I."Redeem";
        I.lIlIIIllllIll[I.lIlIIIlllllII[14]] = I."wishes to trade with you";
        I.lIlIIIllllIll[I.lIlIIIlllllII[18]] = I." wishes";
        I.lIlIIIllllIll[I.lIlIIIlllllII[19]] = I."Accepted trade.";
    }

    private static boolean lIlllIIIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIllIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIllIIIII(Object object) {
        return object != null;
    }

    private static void lIlllIIIlIlllII() {
        lIlIIIlllllII = new int[21];
        I.lIlIIIlllllII[0] = (0x2A ^ 0x53 ^ 11 + 70 - 70 + 116) & (0x11 ^ 0x23 ^ (0x27 ^ 0x13) ^ -1);
        I.lIlIIIlllllII[1] = -(0xFFFFCE2B & 0x3FD7) & (0xFFFFAFBB & 0x5F5F);
        I.lIlIIIlllllII[2] = -(0xFFFFF8DF & 0x7F21) & (0xFFFFFFF8 & 0x7BEF);
        I.lIlIIIlllllII[3] = -(0xFFFFEBAF & 0x555B) & (0xFFFFE7FF & 0x5FFE);
        I.lIlIIIlllllII[4] = 1;
        I.lIlIIIlllllII[5] = 0xC ^ 0x33 ^ (8 ^ 0x32);
        I.lIlIIIlllllII[6] = 0xFFFFBF8C & 0x73FB;
        I.lIlIIIlllllII[7] = 2;
        I.lIlIIIlllllII[8] = 3;
        I.lIlIIIlllllII[9] = (0x4D ^ 0xC) + (155 + 152 - 278 + 133) - (0x8F ^ 0xB6) + (0x20 ^ 0x1B);
        I.lIlIIIlllllII[10] = 0x61 ^ 0x4E ^ (0x82 ^ 0xA9);
        I.lIlIIIlllllII[11] = 0xF8 ^ 0xBA;
        I.lIlIIIlllllII[12] = 0x3F ^ 0x38;
        I.lIlIIIlllllII[13] = 0x69 ^ 0x71;
        I.lIlIIIlllllII[14] = 0x5E ^ 0x54;
        I.lIlIIIlllllII[15] = 0xF8 ^ 0x92 ^ (0x53 ^ 0x3F);
        I.lIlIIIlllllII[16] = 0x1A ^ 0x12;
        I.lIlIIIlllllII[17] = 0x5E ^ 0x76 ^ (0x88 ^ 0xA9);
        I.lIlIIIlllllII[18] = 45 + 52 - 87 + 154 ^ 71 + 172 - 236 + 168;
        I.lIlIIIlllllII[19] = 127 + 104 - 192 + 100 ^ 18 + 2 - -20 + 95;
        I.lIlIIIlllllII[20] = 0x8F ^ 0x82;
    }

    private static String lIlllIIIlIllIII(String llllllllllllllIlllIIIIllIIlIllIl, String llllllllllllllIlllIIIIllIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIllIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIllIIlIllll.init(lIlIIIlllllII[7], llllllllllllllIlllIIIIllIIllIIII);
            return new String(llllllllllllllIlllIIIIllIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIllIIlIlllI) {
            llllllllllllllIlllIIIIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    static {
        I.lIlllIIIlIlllII();
        I.lIlllIIIlIllIll();
    }

    private static boolean lIlllIIIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

