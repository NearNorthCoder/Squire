/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Smelling salts", priority=100)
public class SmellingSaltsTask
extends AutotoaManager {
    
    private final  C cR;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[9];
        am.var1[0] = (155 + 43 - 108 + 71 ^ 112 + 57 - 114 + 74) & (0x5F ^ 0x4D ^ (0xB6 ^ 0x84) ^ -1);
        am.var1[1] = 1;
        am.var1[2] = -(0xFFFF9FFD & 0x657A) & (0xFFFFFF7F & 0x3DFF);
        am.var1[3] = 0x5F ^ 0x4B;
        am.var1[4] = 2;
        am.var1[5] = 3;
        am.var1[6] = 0x55 ^ 0x78 ^ (0x1E ^ 0x37);
        am.var1[7] = 0x1F ^ 7 ^ (0x31 ^ 0x2C);
        am.var1[8] = 0x49 ^ 0x41;
    }

    @Inject
    protected SmellingSaltsTask(Client client, C c2) {
        super(client);
        this.cR = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        am var5;
        if (am.var6(this.bc() ? 1 : 0)) {
            return var1[0];
        }
        Item var7 = Inventory.getFirst(item -> {
            int n2;
            if (am.var3(item.getName().contains(var2[var1[5]]) ? 1 : 0) && am.var3(item.getName().contains(var2[var1[6]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (1 >= 2) {
                    return ((0x7F ^ 0x3B ^ (0xD0 ^ 0xAB)) & (0xCF ^ 0xBC ^ (0x41 ^ 0xD) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (am.var8(var7) && am.var8(var7 = Inventory.getFirst(item -> item.getName().contains(var2[var1[4]])))) {
            return var1[0];
        }
        if (am.var3(var7.getName().contains(var2[var1[0]]) ? 1 : 0) && am.var9(var5.cR.av().getOrDefault((Object)e.SMELLING_SALTS, var1[0]), var1[1]) && am.var6(var5.aq() ? 1 : 0) && am.var6(var5.d.dehydration() ? 1 : 0)) {
            return var1[0];
        }
        if (am.var8(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        if (am.var10(Vars.getBit((int)var1[2]))) {
            return var1[0];
        }
        if (am.var11(Skills.getBoostedLevel((SkiSkill.STRENGTH) - Skills.getLevel((SkiSkill.STRENGTH), var1[3]) && (!am.var3(var5.aq() ? 1 : 0) || am.var6(var5.d.dehydration() ? 1 : 0))) {
            return var1[0];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[1];
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void var18() {
        var2 = new String[var1[7]];
        am.var2[am.var1[0]] = "1";
        am.var2[am.var1[1]] = "Crush";
        am.var2[am.var1[4]] = "salts";
        am.var2[am.var1[5]] = "salts";
        am.var2[am.var1[6]] = "1";
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    static {
        am.var4();
        am.var18();
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static String var25(String var26, String var27) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var29 = var27.toCharArray();
        int var30 = var1[0];
        char[] var31 = var26.toCharArray();
        int var32 = var31.length;
        int var33 = var1[0];
        while (am.var9(var33, var32)) {
            char var34 = var31[var33];
            var28.append((char)(var34 ^ var29[var30 % var29.length]));
            0;
            ++var30;
            ++var33;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var28);
    }

    private static boolean var10(int n2) {
        return n2 > 0;
    }
}

