/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Destroying Spare Ingredients", priority=250)
public class DestroyingSpareIngredientsTask
extends Task {
    final  a bk;

    final  SquireDukeSucellus bj;

    @Inject
    public DestroyingSpareIngredientsTask(SquireDukeSucellus squireDukeSucellus) {
        this.bj = squireDukeSucellus;
        this.bk = squireDukeSucellus.s();
    }

    public boolean run() {
        int lllllllllllllllIlIllllIlIIlIlIII2;
        Item lllllllllllllllIlIllllIlIIlIlIII2;
        F var3;
        if ((this.bk.w() >= 0)) {
            String[] stringArray = new String[1];
            stringArray[2] = var2[2];
            Item item2 = Inventory.getFirst((String[])stringArray);
            if item2 != null {
                item2.interact(var2[1]);
                return 1;
            }
        }
        if ((var3.bk.v() >= 0)) {
            String[] stringArray = new String[1];
            stringArray[2] = var2[0];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if lllllllllllllllIlIllllIlIIlIlIII2 != null {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(var2[3]);
                return 1;
            }
        }
        if ((var3.bk.x() >= 0)) {
            String[] stringArray = new String[1];
            stringArray[2] = var2[4];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if lllllllllllllllIlIllllIlIIlIlIII2 != null {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(var2[5]);
                return 1;
            }
        }
        if (((lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getCount((boolean)2 < item -> e.U.contains(item.getName()))) + Inventory.getFreeSlots(), 0)) {
            Item var4 = Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[2] = var2[7];
                return item.hasAction(stringArray);
            });
            if var4 == null {
                var3.bj.f(2);
                var3.bj.g(1);
                return 2;
            }
            var4.interact(var2[6]);
            return 1;
        }
        return 2;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 2;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 2;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x44 ^ 0x79) & ~(0xB1 ^ 0x8C)) == 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

