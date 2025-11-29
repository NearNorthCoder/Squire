/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating Wild Pie", priority=10)
public class EatingWildPieTask
extends Task {
    private final  a am;
    private static  int[] llIlIlIIl;
    private static  String[] llIlIlIII;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = llIlIlIIl[0];
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = llIlIlIIl[0];
        while (k.var10(var9, var8)) {
            char var11 = var7[var9];
            var4.append((char)(var11 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if ((0x4E ^ 0x5C ^ (0xB6 ^ 0xA0)) >= -1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static void var12() {
        llIlIlIIl = new int[4];
        k.llIlIlIIl[0] = (239 + 193 - 407 + 230 ^ 109 + 95 - 90 + 83) & (53 + 204 - 242 + 240 ^ 167 + 177 - 173 + 26 ^ -1);
        k.llIlIlIIl[1] = 0x54 ^ 0xF;
        k.llIlIlIIl[2] = 1;
        k.llIlIlIIl[3] = 2;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!k.var20(this.am.EatingWildPieTask()) || k.var13(this.am.EatingWildPieTask().y())) {
            return llIlIlIIl[0];
        }
        if (k.var21(Skills.getBoostedLevel((SkiSkill.SLAYER), llIlIlIIl[1])) {
            return llIlIlIIl[0];
        }
        Item var22 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIlIII[llIlIlIIl[2]]));
        if (k.var13(var22)) {
            return llIlIlIIl[0];
        }
        var1_1.interact(llIlIlIII[llIlIlIIl[0]]);
        return llIlIlIIl[2];
    }

    static {
        k.var12();
        k.var23();
    }

    private static void var23() {
        llIlIlIII = new String[llIlIlIIl[3]];
        k.llIlIlIII[k.llIlIlIIl[0]] = "Eat";
        k.llIlIlIII[k.llIlIlIIl[2]] = "wild pie";
    }

    @Inject
    public EatingWildPieTask(a a2) {
        this.am = a2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var20(Object object) {
        return object != null;
    }
}

