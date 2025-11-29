/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum11;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Dropping unnecessary supplies", priority=10)
public class DroppingUnnecessarySuppliesTask
extends AutotoaManager {

    private final  C cM;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[9];
        aj.var1[0] = (3 ^ 0x50) & ~(0xC6 ^ 0x95);
        aj.var1[1] = 2;
        aj.var1[2] = 1;
        aj.var1[3] = 3;
        aj.var1[4] = 0x8D ^ 0x89;
        aj.var1[5] = 0x2D ^ 0x28;
        aj.var1[6] = 192 + 119 - 163 + 51 ^ 48 + 177 - 133 + 101;
        aj.var1[7] = 0x5C ^ 0x5B;
        aj.var1[8] = 0x26 ^ 0x2E;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    protected DroppingUnnecessarySuppliesTask(Client client, C c2) {
        super(client);
        this.cM = c2;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static boolean var13(int n2) {
        return n2 <= 0;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[0];
        while (aj.var23(var22, var21)) {
            char var24 = var20[var22];
            var17.append((char)(var24 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (1 < (0x23 ^ 0x27)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void var25() {
        var2 = new String[var1[8]];
        aj.var2[aj.var1[0]] = "Drop";
        aj.var2[aj.var1[2]] = "Drop";
        aj.var2[aj.var1[1]] = "Drink";
        aj.var2[aj.var1[3]] = "Drop";
        aj.var2[aj.var1[4]] = "Drink";
        aj.var2[aj.var1[5]] = "Drop";
        aj.var2[aj.var1[6]] = "anti";
        aj.var2[aj.var1[7]] = "anti";
    }

    static {
        aj.var4();
        aj.var25();
    }

    public boolean run() {
        aj var26;
        if (!aj.var27(this.aq() ? 1 : 0) || aj.var13(this.aX())) {
            return var1[0];
        }
        if (aj.var28(Inventory.getFreeSlots(), var1[1])) {
            return var1[0];
        }
        if (aj.var27(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[7]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[6]])).interact(var2[var1[0]]);
            return var1[2];
        }
        Item var29 = a.values();
        int llllllllllllllllIIllIlIllIllllll22 = ((a[])var29).length;
        int var30 = var1[0];
        while (aj.var23(var30, llllllllllllllllIIllIlIllIllllll22)) {
            a var31 = var29[var30];
            Item var32 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var31.l().toLowerCase()));
            if (aj.var33(var32)) {
                var32.interact(var2[var1[2]]);
                return var1[2];
            }
            ++var30;
            0;
            if (((0xA6 ^ 0xBD) & ~(0x87 ^ 0x9C)) <= ((0x42 ^ 0x18) & ~(0x17 ^ 0x4D))) continue;
            return ((0x8B ^ 0xB7) & ~(0x9F ^ 0xA3)) != 0;
        }
        var29 = Inventory.getFirst(item -> e.TEARS_OF_ELIDINIS.d(item.getId()));
        if (aj.var5(var26.cM.av().getOrDefault((Object)e.AMBROSIA, var1[0])) && aj.var33(var29) && aj.var27(var26.be() ? 1 : 0) && aj.var3(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.var23(Prayers.getPoints(), Skills.getLevel((SkiSkill.PRAYER))) {
                string = var2[var1[1]];
                0;
                if (((0x79 ^ 0x65 ^ (0xD ^ 0x71)) & (0x40 ^ 0x36 ^ (0x34 ^ 0x22) ^ -1)) >= 3) {
                    return ((229 + 65 - 118 + 64 ^ 112 + 88 - 197 + 161) & (215 + 181 - 381 + 213 ^ 121 + 117 - 204 + 142 ^ -1)) != 0;
                }
            } else {
                string = var2[var1[3]];
            }
            var29.interact(string);
            var26.sleep(var1[4]);
            return var1[2];
        }
        Item llllllllllllllllIIllIlIllIllllll22 = Inventory.getFirst(item -> e.NECTAR.d(item.getId()));
        if (aj.var5(var26.cM.av().getOrDefault((Object)e.AMBROSIA, var1[0])) && aj.var27(var26.be() ? 1 : 0) && aj.var3(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.var12(llllllllllllllllIIllIlIllIllllll22)) {
                return var1[0];
            }
            if (aj.var5(Combat.getMissingHealth())) {
                string = var2[var1[4]];
                0;
                if (2 >= 3) {
                    return ((0x65 ^ 0x3E) & ~(0x45 ^ 0x1E)) != 0;
                }
            } else {
                string = var2[var1[5]];
            }
            llllllllllllllllIIllIlIllIllllll22.interact(string);
            var26.sleep(var1[4]);
            return var1[2];
        }
        return var1[0];
    }

    private static boolean var33(Object object) {
        return object != null;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var28(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var27(int n2) {
        return n2 != 0;
    }
}

