/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Talisman", priority=10)
public class DroppingTalismanTask
extends RunecraftingTaskBase {

    static {
        u.var3();
        u.var4();
    }

    private static void var4() {
        var1 = new String[var2[2]];
        u.var1[u.var2[0]] = "Drop";
        u.var1[u.var2[1]] = "Portal talisman";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if (u.var5(this.aW.useTalisman() ? 1 : 0)) {
            return var2[0];
        }
        Item var6 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[1]]));
        if (u.var7(var6)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean aj() {
        return var2[1];
    }

    private static void var3() {
        var2 = new int[4];
        u.var2[0] = (0x72 ^ 0x3A ^ (0xC8 ^ 0xAA)) & (66 + 139 - 158 + 97 ^ 171 + 180 - 222 + 57 ^ -1);
        u.var2[1] = 1;
        u.var2[2] = 2;
        u.var2[3] = 0x39 ^ 0x57 ^ (0xFF ^ 0x99);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    public DroppingTalismanTask(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[var2[0]]);
    }
}

