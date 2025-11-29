/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Cracking scarab", priority=50)
public class CrackingScarabTask
extends AutotoaManager {
    private final  C cB;
    private final  SquireAutoTOA cC;
    private  int cD;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected CrackingScarabTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cB = c2;
        this.cC = squireAutoTOA;
    }

    static {
        ac.var9();
        ac.var10();
    }

    private static void var10() {
        var1 = new String[var2[3]];
        ac.var1[ac.var2[1]] = "Crack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ac.var11(this.cu.getTickCount() - this.cD, var2[0])) {
            return var2[1];
        }
        if (ac.var11(Skills.getLevel((SkiSkill.PRAYER) - Skills.getBoostedLevel((SkiSkill.PRAYER), var2[2])) {
            return var2[1];
        }
        Item var12 = Inventory.getFirst(item -> e.BLESSED_CRYSTAL_SCARAB.d(item.getId()));
        if (ac.var13(var12)) {
            return var2[1];
        }
        var1_1.interact(var1[var2[1]]);
        this.cD = this.cu.getTickCount();
        return var2[3];
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static void var9() {
        var2 = new int[6];
        ac.var2[0] = 0x7A ^ 0x31 ^ (0x1C ^ 0x7F);
        ac.var2[1] = (0x48 ^ 0x5F) & ~(0x1B ^ 0xC);
        ac.var2[2] = 0xB ^ 0x4D ^ (0xA ^ 0x46);
        ac.var2[3] = 1;
        ac.var2[4] = 0x67 ^ 0x49 ^ (0xA6 ^ 0x80);
        ac.var2[5] = 2;
    }
}

