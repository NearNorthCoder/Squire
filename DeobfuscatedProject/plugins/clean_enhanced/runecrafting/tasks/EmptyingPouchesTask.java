/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.GameEnum3;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Emptying pouches", priority=20)
public class EmptyingPouchesTask
extends RunecraftingTaskBase {

    @Override
    protected boolean aj() {
        return var2[2];
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var1 = new String[var2[4]];
        A.var1[A.var2[1]] = "Altar";
        A.var1[A.var2[2]] = "Empty";
        A.var1[A.var2[0]] = "pouch";
    }

    private static void var6() {
        var2 = new int[5];
        A.var2[0] = 2;
        A.var2[1] = (0x99 ^ 0xB4) & ~(0x3E ^ 0x13) & ~((0x32 ^ 5) & ~(0x6E ^ 0x59));
        A.var2[2] = 1;
        A.var2[3] = 0xC ^ 9;
        A.var2[4] = 3;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    static {
        A.var6();
        A.var5();
    }

    private static boolean var15(int n2) {
        return n2 > 0;
    }

    @Override
    protected boolean ak() {
        boolean bl;
        if (A.var3(this.aV.g() ? 1 : 0)) {
            return var2[1];
        }
        if (A.var7(Inventory.getFreeSlots(), var2[3])) {
            return var2[1];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[A.var2[1]] = var1[var2[1]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray);
        if (A.var14(var16)) {
            return var2[1];
        }
        int var17 = var2[1];
        int var18 = var2[0];
        Iterator var19 = Inventory.getAll(item -> item.getName().endsWith(var1[var2[0]])).iterator();
        while (A.var3(var19.hasNext() ? 1 : 0)) {
            Item var20 = (Item)var19.next();
            e var21 = e.c(var20.getId());
            if (A.var14((Object)var21)) {
                0;
                if (2 <= 3) continue;
                return (2 & ~2) != 0;
            }
            if (A.var4(var18)) {
                0;
                if ((0x77 ^ 0x72) != 0) break;
                return (1 & ~1) != 0;
            }
            if (A.var15(var21.ae())) {
                A var22;
                int var23 = Math.min(Inventory.getFreeSlots() - var17, var21.ae());
                if (A.var24(var23)) {
                    0;
                    if null == null break;
                    return ((0x66 ^ 0x52) & ~(0x28 ^ 0x1C)) != 0;
                }
                var20.interact(var1[var2[2]]);
                var21.d(-var23);
                var17 += var23;
                --var18;
                var22.aV.r();
            }
            0;
            if (3 >= ((0x26 ^ 0x39) & ~(0x7D ^ 0x62))) continue;
            return ((0xE9 ^ 0xC1) & ~(0x8A ^ 0xA2)) != 0;
        }
        if (A.var15(var17)) {
            bl = var2[2];
            0;
            if (-1 != -1) {
                return ((0x5E ^ 0x6D ^ (0x55 ^ 4)) & (214 + 179 - 214 + 69 ^ 66 + 84 - 132 + 136 ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static boolean var24(int n2) {
        return n2 < 0;
    }

    @Inject
    public EmptyingPouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[var2[0]];
        cArray[A.var2[1]] = c.ACTIVE;
        cArray[A.var2[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }
}

