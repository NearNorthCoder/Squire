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
        void var3;
        String string = chatMessage.getMessage();
        if (I.var4(string.contains(var1[var2[14]]) ? 1 : 0)) {
            String string2 = string.split(var1[var2[18]])[var2[0]];
            this.aG.a(Text.sanitize((String)string2));
        }
        if (I.var4(var3.contains(var1[var2[19]]) ? 1 : 0)) {
            I var5;
            var5.aG.a((String)null);
        }
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (I.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0x8F ^ 0xAB ^ (0x77 ^ 0x57)) > 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    public UpgradingToMembersTask(SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland, ConfigManager configManager) {
        this.aF = squireQuesterConfig;
        this.aG = squireTutorialIsland;
        this.aH = configManager;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        I var23;
        if (I.var24(this.aF.bond() ? 1 : 0)) {
            return var2[0];
        }
        int var25 = Vars.getVarp((int)var2[1]);
        if (I.var15(var25, var2[2])) {
            return var2[0];
        }
        int var26 = Vars.getVarp((int)var2[3]);
        if (I.var27(var26, var2[4])) {
            System.out.println("You have " + var26 + " days of members left. You do not need a bond.");
            var23.aH.setConfiguration(var1[var2[0]], var1[var2[4]], (Object)var2[0]);
            return var2[0];
        }
        if (I.var15(var25, var2[5])) {
            return var2[0];
        }
        if (I.var24(Trade.isOpen() ? 1 : 0)) {
            int[] nArray = new int[var2[4]];
            nArray[I.var2[0]] = var2[6];
            if (I.var24(Inventory.contains((int[])nArray) ? 1 : 0) && I.var28(var23.aG.b())) {
                System.out.println(var1[var2[7]]);
                String[] stringArray = new String[var2[4]];
                stringArray[I.var2[0]] = var23.aG.b();
                Players.getNearest((String[])stringArray).interact(var1[var2[8]]);
            }
        }
        if (I.var4(Trade.isFirstScreenOpen() ? 1 : 0)) {
            Trade.acceptFirstScreen();
        }
        if (I.var4(Trade.isSecondScreenOpen() ? 1 : 0)) {
            Trade.acceptSecondScreen();
        }
        if (I.var28(Widgets.get((int)var2[9], (int)var2[4])) && I.var4(Widgets.get((int)var2[9], (int)var2[4]).getText().equals(var1[var2[10]]) ? 1 : 0)) {
            Game.logout();
        }
        if (I.var28(Widgets.get((int)var2[11], (int)var2[12]))) {
            if (I.var4(Widgets.get((int)var2[11], (int)var2[13], (int)var2[14]).getText().equals(var1[var2[5]]) ? 1 : 0)) {
                Widgets.get((int)var2[11], (int)var2[12]).interact(var1[var2[15]]);
            }
            if (I.var4(Widgets.get((int)var2[11], (int)var2[13], (int)var2[14]).getText().equals(var1[var2[12]]) ? 1 : 0)) {
                Widgets.get((int)var2[11], (int)var2[13]).interact(var1[var2[16]]);
                0;
                if (((0xD7 ^ 0x9C) & ~(0xFD ^ 0xB6)) > 1) {
                    return ((0x83 ^ 0xBC) & ~(0x77 ^ 0x48)) != 0;
                }
            }
        } else {
            int[] nArray = new int[var2[4]];
            nArray[I.var2[0]] = var2[6];
            Inventory.getFirst((int[])nArray).interact(var1[var2[17]]);
        }
        return var2[4];
    }

    private static boolean var27(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var29() {
        var1 = new String[var2[20]];
        I.var1[I.var2[0]] = "squirequester";
        I.var1[I.var2[4]] = "Bond";
        I.var1[I.var2[7]] = "Trading";
        I.var1[I.var2[8]] = "Trade with";
        I.var1[I.var2[10]] = "You've gained 14 days of membership.<br>Please log out before attempting to log into members' worlds.";
        I.var1[I.var2[5]] = "---";
        I.var1[I.var2[15]] = "1 Bond";
        I.var1[I.var2[12]] = "Confirm";
        I.var1[I.var2[16]] = "Confirm";
        I.var1[I.var2[17]] = "Redeem";
        I.var1[I.var2[14]] = "wishes to trade with you";
        I.var1[I.var2[18]] = " wishes";
        I.var1[I.var2[19]] = "Accepted trade.";
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var28(Object object) {
        return object != null;
    }

    private static void var30() {
        var2 = new int[21];
        I.var2[0] = (0x2A ^ 0x53 ^ 11 + 70 - 70 + 116) & (0x11 ^ 0x23 ^ (0x27 ^ 0x13) ^ -1);
        I.var2[1] = -(0xFFFFCE2B & 0x3FD7) & (0xFFFFAFBB & 0x5F5F);
        I.var2[2] = -(0xFFFFF8DF & 0x7F21) & (0xFFFFFFF8 & 0x7BEF);
        I.var2[3] = -(0xFFFFEBAF & 0x555B) & (0xFFFFE7FF & 0x5FFE);
        I.var2[4] = 1;
        I.var2[5] = 0xC ^ 0x33 ^ (8 ^ 0x32);
        I.var2[6] = 0xFFFFBF8C & 0x73FB;
        I.var2[7] = 2;
        I.var2[8] = 3;
        I.var2[9] = (0x4D ^ 0xC) + (155 + 152 - 278 + 133) - (0x8F ^ 0xB6) + (0x20 ^ 0x1B);
        I.var2[10] = 0x61 ^ 0x4E ^ (0x82 ^ 0xA9);
        I.var2[11] = 0xF8 ^ 0xBA;
        I.var2[12] = 0x3F ^ 0x38;
        I.var2[13] = 0x69 ^ 0x71;
        I.var2[14] = 0x5E ^ 0x54;
        I.var2[15] = 0xF8 ^ 0x92 ^ (0x53 ^ 0x3F);
        I.var2[16] = 0x1A ^ 0x12;
        I.var2[17] = 0x5E ^ 0x76 ^ (0x88 ^ 0xA9);
        I.var2[18] = 45 + 52 - 87 + 154 ^ 71 + 172 - 236 + 168;
        I.var2[19] = 127 + 104 - 192 + 100 ^ 18 + 2 - -20 + 95;
        I.var2[20] = 0x8F ^ 0x82;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    static {
        I.var30();
        I.var29();
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }
}

