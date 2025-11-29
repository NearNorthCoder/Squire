/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.query.items.ItemQuery
 *  net.unethicalite.api.query.results.ItemQueryResults
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.query.results.ItemQueryResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Consuming")
public class ConsumingTask
extends Task {
    private static final  Logger q;

    private final  AgilityConfig s;
    private final  SquireAgilityPlugin r;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private boolean u() {
        return Inventory.contains(item -> item.getName().startsWith(var2[var1[6]]));
    }

    static {
        d.var9();
        d.var10();
        q = LoggerFactory.getLogger(ConsumingTask.class);
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n) {
        return n != 0;
    }

    private static int var13(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var14(int n) {
        return n == 0;
    }

    private boolean t() {
        int n;
        b var15;
        b b2;
        if (d.var12(this.s.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if ((0x19 ^ 0x1D) == 1) {
                return ((0x46 ^ 4) & ~(0x5F ^ 0x1D)) != 0;
            }
        } else {
            d var16;
            b2 = var16.s.course();
        }
        if (d.var17((Object)(var15 = b2), (Object)b.ARDOUGNE) && d.var18(Skills.getBoostedLevel((SkiSkill.AGILITY), var1[5])) {
            n = var1[2];
            0;
            if (3 != 3) {
                return ((58 + 133 - 51 + 34 ^ 115 + 41 - 98 + 113) & (91 + 12 - -45 + 47 ^ 125 + 195 - 277 + 155 ^ -1)) != 0;
            }
        } else {
            n = var1[1];
        }
        return n != 0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        Item var25;
        d var26;
        if (d.var12(this.u() ? 1 : 0) && d.var14(Movement.isStaminaBoosted() ? 1 : 0) && d.var18(Movement.getRunEnergy(), var1[0])) {
            Inventory.getFirst(item -> item.getName().startsWith(var2[var1[8]])).interact(var2[var1[1]]);
            return var1[2];
        }
        int n = var26.t();
        if (d.var27(d.var13(Combat.getHealthPercent(), var26.s.stopAtHp())) && !d.var12(n) || d.var12(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[1];
        }
        ItemQuery var28 = Inventory.query();
        if (d.var12(n)) {
            var28 = (ItemQuery)var28.filter(item -> item.getName().toLowerCase().contains(var2[var1[7]]));
            0;
            if (-2 > 0) {
                return ((0x44 ^ 0xE ^ 105 + 96 - 105 + 31) & (38 + 101 - 20 + 14 ^ 147 + 29 - 141 + 141 ^ -1)) != 0;
            }
        } else {
            String[] stringArray = new String[var1[2]];
            stringArray[d.var1[1]] = var2[var1[2]];
            var28 = var28.actions(stringArray);
        }
        if (d.var11(var25 = (Item)((ItemQueryResults)var28.results()).first())) {
            Log.info((String)var2[var1[3]]);
            var26.r.forceStop();
            return var1[1];
        }
        var3_3.interact(var2[var1[4]]);
        return var1[2];
    }

    private static boolean var17(Object object, Object object2) {
        return object == object2;
    }

    private static void var9() {
        var1 = new int[11];
        d.var1[0] = 0x59 ^ 0x4F ^ (0x56 ^ 0x5E);
        d.var1[1] = (0x51 ^ 0x23 ^ (0xD3 ^ 0xBB)) & (0x5D ^ 0x25 ^ (2 ^ 0x60) ^ -1);
        d.var1[2] = 1;
        d.var1[3] = 2;
        d.var1[4] = 3;
        d.var1[5] = 0xAB ^ 0xAD ^ (0x9A ^ 0xC6);
        d.var1[6] = 0x33 ^ 0x37;
        d.var1[7] = 0xC ^ 5 ^ (1 ^ 0xD);
        d.var1[8] = 0x5C ^ 0x5A;
        d.var1[9] = 20 + 59 - -31 + 31 ^ 43 + 13 - -3 + 79;
        d.var1[10] = 0x89 ^ 0x81;
    }

    @Inject
    public ConsumingTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.r = squireAgilityPlugin;
        this.s = agilityConfig;
    }

    private static void var10() {
        var2 = new String[var1[9]];
        d.var2[d.var1[1]] = "Drink";
        d.var2[d.var1[2]] = "Eat";
        d.var2[d.var1[3]] = "[SquireAgility] - Out of food and low HP, stopping.";
        d.var2[d.var1[4]] = "Eat";
        d.var2[d.var1[6]] = "Stamina";
        d.var2[d.var1[7]] = "summer pie";
        d.var2[d.var1[8]] = "Stamina";
    }

    private static boolean var27(int n) {
        return n > 0;
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var1[1];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var1[1];
        while (d.var18(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var32);
    }
}

