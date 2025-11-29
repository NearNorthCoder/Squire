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
package gg.squire.quest.tasks;

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
public class UpgradingToMembersTask
extends Task {
    private final  SquireQuesterConfig aF;
    
    private final  SquireTutorialIsland aG;
    
    private final  ConfigManager aH;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (I.lIlllIIIllIIIIl(string.contains(lIlIIIllllIll[lIlIIIlllllII[14]]) ? 1 : 0)) {
            String string2 = string.split(lIlIIIllllIll[lIlIIIlllllII[18]])[lIlIIIlllllII[0]];
            this.aG.a(Text.sanitize((String)string2));
        }
        if (I.lIlllIIIllIIIIl(var1.contains(lIlIIIllllIll[lIlIIIlllllII[19]]) ? 1 : 0)) {
            I var2;
            var2.aG.a((String)null);
        }
    }

        return String.valueOf(var3);
    }

    @Inject
    public UpgradingToMembersTask(SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland, ConfigManager configManager) {
        this.aF = squireQuesterConfig;
        this.aG = squireTutorialIsland;
        this.aH = configManager;
    }

    public boolean run() {
        I var4;
        if (I.lIlllIIIlIlllIl(this.aF.bond() ? 1 : 0)) {
            return lIlIIIlllllII[0];
        }
        int var5 = Vars.getVarp((int)lIlIIIlllllII[1]);
        if (I.lIlllIIIlIllllI(var5, lIlIIIlllllII[2])) {
            return lIlIIIlllllII[0];
        }
        int var6 = Vars.getVarp((int)lIlIIIlllllII[3]);
        if (I.lIlllIIIlIlllll(var6, lIlIIIlllllII[4])) {
            System.out.println("You have " + var6 + " days of members left. You do not need a bond.");
            var4.aH.setConfiguration(lIlIIIllllIll[lIlIIIlllllII[0]], lIlIIIllllIll[lIlIIIlllllII[4]], (Object)lIlIIIlllllII[0]);
            return lIlIIIlllllII[0];
        }
        if (I.lIlllIIIlIllllI(var5, lIlIIIlllllII[5])) {
            return lIlIIIlllllII[0];
        }
        if (I.lIlllIIIlIlllIl(Trade.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIlIIIlllllII[4]];
            nArray[I.lIlIIIlllllII[0]] = lIlIIIlllllII[6];
            if (I.lIlllIIIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0) && I.lIlllIIIllIIIII(var4.aG.b())) {
                System.out.println(lIlIIIllllIll[lIlIIIlllllII[7]]);
                String[] stringArray = new String[lIlIIIlllllII[4]];
                stringArray[I.lIlIIIlllllII[0]] = var4.aG.b();
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

                if (((0xD7 ^ 0x9C) & ~(0xFD ^ 0xB6)) > 1) {
                    return false;
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
        I.lIlIIIllllIll[I.lIlIIIlllllII[0]] = "squirequester";
        I.lIlIIIllllIll[I.lIlIIIlllllII[4]] = "Bond";
        I.lIlIIIllllIll[I.lIlIIIlllllII[7]] = "Trading";
        I.lIlIIIllllIll[I.lIlIIIlllllII[8]] = "Trade with";
        I.lIlIIIllllIll[I.lIlIIIlllllII[10]] = "You've gained 14 days of membership.<br>Please log out before attempting to log into members' worlds.";
        I.lIlIIIllllIll[I.lIlIIIlllllII[5]] = "---";
        I.lIlIIIllllIll[I.lIlIIIlllllII[15]] = "1 Bond";
        I.lIlIIIllllIll[I.lIlIIIlllllII[12]] = "Confirm";
        I.lIlIIIllllIll[I.lIlIIIlllllII[16]] = "Confirm";
        I.lIlIIIllllIll[I.lIlIIIlllllII[17]] = "Redeem";
        I.lIlIIIllllIll[I.lIlIIIlllllII[14]] = "wishes to trade with you";
        I.lIlIIIllllIll[I.lIlIIIlllllII[18]] = " wishes";
        I.lIlIIIllllIll[I.lIlIIIlllllII[19]] = "Accepted trade.";
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

    static {
        I.lIlllIIIlIlllII();
        I.lIlllIIIlIllIll();
    }

    private static boolean lIlllIIIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

