/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {

    private final  a ad;
    private final  SquireSaraConfig ae;
    private final  l ac;
    private final  g ab;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Inject
    public EatingFoodTask(g g2, l l2, a a2, SquireSaraConfig squireSaraConfig) {
        this.ab = g2;
        this.ac = l2;
        this.ad = a2;
        this.ae = squireSaraConfig;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (s.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-(76 + 114 - 164 + 148 ^ 134 + 22 - 14 + 28) < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var16() {
        var2 = new String[var1[4]];
        s.var2[s.var1[0]] = "Peach";
        s.var2[s.var1[1]] = "Eat";
        s.var2[s.var1[2]] = "Peach";
        s.var2[s.var1[3]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var17;
        if (s.var3(this.ab.m() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var4(var17.ab.l() ? 1 : 0) && s.var18(var17.ac.M())) {
            return var1[0];
        }
        int var19 = var17.ae.eatFoodAt();
        if (!s.var20(Combat.getCurrentHealth(), var19) || s.var3(var17.ad.d() ? 1 : 0)) {
            return var1[0];
        }
        Item var21 = Inventory.getFirst(item -> {
            int n2;
            if (s.var3(item.getName().equals(var2[var1[2]]) ? 1 : 0) && s.var4(item.hasAction(var2[var1[3]]::equals) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (3 < 0) {
                    return ((9 + 128 - 8 + 2 ^ 90 + 32 - 9 + 75) & (0x6B ^ 0x4E ^ (0x7F ^ 0x65) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (s.var22(var21)) {
            String[] stringArray = new String[var1[1]];
            stringArray[s.var1[0]] = var2[var1[0]];
            var21 = Inventory.getFirst((String[])stringArray);
        }
        if (s.var22(var21)) {
            return var17.U();
        }
        var2_2.interact(var2[var1[1]]);
        this.ad.c();
        return var1[1];
    }

    private boolean U() {
        return var1[0];
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.var29();
        s.var16();
    }

    private static void var29() {
        var1 = new int[6];
        s.var1[0] = (0xB ^ 0x22) & ~(0x42 ^ 0x6B);
        s.var1[1] = 1;
        s.var1[2] = 2;
        s.var1[3] = 3;
        s.var1[4] = 0x78 ^ 0x7C;
        s.var1[5] = 0x91 ^ 0x89 ^ (0x4F ^ 0x5F);
    }

    private static boolean var22(Object object) {
        return object == null;
    }

    private static boolean var20(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var18(Object object) {
        return object != null;
    }
}

