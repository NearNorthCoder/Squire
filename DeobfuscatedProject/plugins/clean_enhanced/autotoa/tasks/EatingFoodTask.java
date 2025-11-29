/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Eating Food", priority=250)
public class EatingFoodTask
extends AutotoaManager {
    private final  C cN;
    private final  SquireAutoTOA cO;

    @Inject
    protected EatingFoodTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cN = c2;
        this.cO = squireAutoTOA;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[4];
        ak.var1[0] = (130 + 148 - 111 + 11 ^ 178 + 160 - 336 + 181) & (139 + 31 - 58 + 51 ^ 129 + 30 - 144 + 151 ^ -1);
        ak.var1[1] = 1;
        ak.var1[2] = 2;
        ak.var1[3] = 0x64 ^ 0x6C;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        ak var11;
        if (ak.var3(this.cO.e() ? 1 : 0)) {
            return var1[0];
        }
        if (ak.var12(var11.cu.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (!ak.var3(var11.cN.al() ? 1 : 0) || ak.var12(var11.cN.ar() ? 1 : 0)) {
            return var1[0];
        }
        Item var13 = Inventory.getFirst(item -> item.hasAction(var2[var1[1]]::equals));
        if (ak.var14(var13)) {
            var11.cN.an();
            var13.interact(var2[var1[0]]);
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    static {
        ak.var4();
        ak.var15();
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static void var15() {
        var2 = new String[var1[2]];
        ak.var2[ak.var1[0]] = "Eat";
        ak.var2[ak.var1[1]] = "Eat";
    }
}

