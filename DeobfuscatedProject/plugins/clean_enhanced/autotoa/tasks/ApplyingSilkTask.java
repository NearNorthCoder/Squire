/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Applying Silk", priority=100)
public class ApplyingSilkTask
extends AutotoaManager {
    private  int cA;
    private final  C cy;
    
    private final  SquireAutoTOA cz;

    public boolean run() {
        ab var3;
        if (ab.var4(this.cz.e() ? 1 : 0)) {
            return var2[0];
        }
        if (ab.var5(var3.aq() ? 1 : 0)) {
            return var2[0];
        }
        if (!ab.var6(Combat.getMissingHealth(), var2[1]) || ab.var5(var3.cy.al() ? 1 : 0)) {
            return var2[0];
        }
        if (ab.var7(var3.cu.getTickCount() - var3.cA, var2[2])) {
            return var2[0];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[3]]));
        if (ab.var9(var8)) {
            var8.interact(var1[var2[0]]);
            var3.cA = var3.cu.getTickCount();
            var3.cy.an();
            return var2[3];
        }
        return var2[0];
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static void var10() {
        var2 = new int[6];
        ab.var2[0] = (0x77 ^ 0x32) & ~(0x37 ^ 0x72);
        ab.var2[1] = 0x3C ^ 0x22;
        ab.var2[2] = 79 + 5 - -21 + 61 ^ 42 + 97 - 130 + 185;
        ab.var2[3] = 1;
        ab.var2[4] = 2;
        ab.var2[5] = 0x7F ^ 0x16 ^ (0x56 ^ 0x37);
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ApplyingSilkTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cy = c2;
        this.cz = squireAutoTOA;
    }

    static {
        ab.var10();
        ab.var17();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var17() {
        var1 = new String[var2[4]];
        ab.var1[ab.var2[0]] = "Apply";
        ab.var1[ab.var2[3]] = "Silk dressing";
    }
}

