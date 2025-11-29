/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening coin pouches", priority=0x7FFFFFFF)
public class OpeningCoinPouchesTask
extends Task {
    private  int y;
    private final  int x = 22;
    private final  SquireThievingConfig v;
    
    private final  int w = 15;

    private static void var3() {
        var1 = new int[11];
        j.var1[0] = 0xF5 ^ 0xC4 ^ (0x45 ^ 0x7B);
        j.var1[1] = 0x9D ^ 0x8B;
        j.var1[2] = (0x54 ^ 0x1A ^ (0xCD ^ 0xB4)) & (64 + 212 - 238 + 204 ^ 88 + 21 - 25 + 113 ^ -1);
        j.var1[3] = -1;
        j.var1[4] = 1;
        j.var1[5] = 2;
        j.var1[6] = 3;
        j.var1[7] = 0x59 ^ 0x5D;
        j.var1[8] = 0xC5 ^ 0xC0;
        j.var1[9] = 0x79 ^ 0x7F;
        j.var1[10] = 0x22 ^ 0x4F ^ (0xEE ^ 0x8B);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        j var13;
        if (j.var14(Game.getState(), GameState.LOGGED_IN)) {
            return var1[2];
        }
        Player var15 = Players.getLocal();
        if (j.var16(var15.getGraphic(), var1[3])) {
            String[] stringArray = new String[var1[4]];
            stringArray[j.var1[2]] = var2[var1[2]];
            if (j.var5(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[var1[4]];
                stringArray2[j.var1[2]] = var2[var1[4]];
                Inventory.getFirst((String[])stringArray2).interact(var2[var1[5]]);
                return var1[4];
            }
            return var1[2];
        }
        String[] stringArray = new String[var1[4]];
        stringArray[j.var1[2]] = var2[var1[6]];
        Item var17 = Inventory.getFirst((String[])stringArray);
        if (j.var12(var17)) {
            return var1[2];
        }
        if (j.var18(Inventory.getFreeSlots(), var1[5])) {
            var17.interact(var2[var1[7]]);
            return var1[4];
        }
        if (j.var4(var17.getQuantity(), var13.y)) {
            return var1[2];
        }
        var2_2.interact(var2[var1[8]]);
        this.y = Rand.nextInt((int)var1[0], (int)var1[1]);
        return var1[4];
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    static {
        j.var3();
        j.var19();
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[2];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[2];
        while (j.var4(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if ((0x89 ^ 0x98 ^ (0x67 ^ 0x72)) >= -1) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static void var19() {
        var2 = new String[var1[9]];
        j.var2[j.var1[2]] = "Coin pouch";
        j.var2[j.var1[4]] = "Coin pouch";
        j.var2[j.var1[5]] = "Open-all";
        j.var2[j.var1[6]] = "Coin pouch";
        j.var2[j.var1[7]] = "Open-all";
        j.var2[j.var1[8]] = "Open-all";
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    @Inject
    public OpeningCoinPouchesTask(SquireThievingConfig squireThievingConfig) {
        this.w = var1[0];
        this.x = var1[1];
        this.y = Rand.nextInt((int)var1[0], (int)var1[1]);
        this.v = squireThievingConfig;
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }
}

