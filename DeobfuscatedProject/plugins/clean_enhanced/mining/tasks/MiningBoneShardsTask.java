/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining bone shards", priority=5)
public class MiningBoneShardsTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var1 = new String[var2[4]];
        l.var1[l.var2[0]] = "Calcified deposit";
        l.var1[l.var2[2]] = "Mine";
        l.var1[l.var2[3]] = "Calcified rocks";
        l.var1[l.var2[1]] = "Mine";
    }

    private static void var5() {
        var2 = new int[6];
        l.var2[0] = (0x44 ^ 0x79) & ~(0xF9 ^ 0xC4);
        l.var2[1] = 3;
        l.var2[2] = 1;
        l.var2[3] = 2;
        l.var2[4] = 0x73 ^ 0x77;
        l.var2[5] = 0x7B ^ 0x73;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        l.var5();
        l.var4();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.var3((Object)this.f.activity(), (Object)a.BONE_SHARDS)) {
            return var2[0];
        }
        TileObject var18 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.var19(var1[var2[3]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[var2[2]];
                stringArray[l.var2[0]] = var1[var2[1]];
                if (l.var19(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if ((0x59 ^ 0x33 ^ (0x65 ^ 0xB)) >= 0) return n2 != 0;
                    return ((0x91 ^ 0xC2 ^ (0x60 ^ 0x26)) & (18 + 125 - 31 + 51 ^ 158 + 116 - 221 + 129 ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (l.var20(var18)) {
            return var2[0];
        }
        if (l.var19(Players.getLocal().isAnimating() ? 1 : 0)) {
            l var21;
            var21.sleep(var2[1]);
            return var2[2];
        }
        if (l.var19(Inventory.isFull() ? 1 : 0)) {
            String[] stringArray = new String[var2[2]];
            stringArray[l.var2[0]] = var1[var2[0]];
            Inventory.dropAll((String[])stringArray);
            0;
            return var2[2];
        }
        var1_1.interact(var1[var2[2]]);
        return var2[2];
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }
}

