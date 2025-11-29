/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening pack", priority=10, blocking=true)
public class OpeningPackTask
extends Task {
    private static  int[] llIIIIIlI;
    private static  String[] lIlllIlIl;

    private static void var1() {
        lIlllIlIl = new String[llIIIIIlI[4]];
        bW.lIlllIlIl[bW.llIIIIIlI[0]] = "Open";
        bW.lIlllIlIl[bW.llIIIIIlI[2]] = "pack";
        bW.lIlllIlIl[bW.llIIIIIlI[3]] = "pack";
    }

    public boolean run() {
        if (bW.var2(Inventory.contains(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[3]])) ? 1 : 0)) {
            return llIIIIIlI[0];
        }
        List var3 = Inventory.getAll(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[2]]));
        int var4 = llIIIIIlI[0];
        while (bW.var5(var4, Math.min(llIIIIIlI[1], var3.size()))) {
            ((Item)var3.get(var4)).interact(lIlllIlIl[llIIIIIlI[0]]);
            ++var4;
            0;
            if ((0xA ^ 7 ^ (0xC8 ^ 0xC1)) >= 0) continue;
            return ((21 + 53 - -38 + 20 ^ 115 + 97 - 171 + 113) & (117 + 161 - 146 + 30 ^ 157 + 66 - 151 + 116 ^ -1)) != 0;
        }
        return llIIIIIlI[2];
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
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
        bW.var18();
        bW.var1();
    }

    private static void var18() {
        llIIIIIlI = new int[5];
        bW.llIIIIIlI[0] = (4 ^ 0x53) & ~(0xCD ^ 0x9A);
        bW.llIIIIIlI[1] = 0x6F ^ 1 ^ (0xF3 ^ 0x95);
        bW.llIIIIIlI[2] = 1;
        bW.llIIIIIlI[3] = 2;
        bW.llIIIIIlI[4] = 3;
    }
}

