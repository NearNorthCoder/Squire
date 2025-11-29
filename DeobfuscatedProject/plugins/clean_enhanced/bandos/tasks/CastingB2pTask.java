/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Casting B2P", priority=6)
public class CastingB2pTask
extends Task {
    private final  e ai;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        s var4;
        if (!s.var3(this.ai.t() ? 1 : 0) || s.var3(this.ai.CastingB2pTask() ? 1 : 0)) {
            return var2[0];
        }
        if (s.var3(var4.ai.w() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[s.var2[0]] = var1[var2[0]];
        stringArray[s.var2[2]] = var1[var2[2]];
        if (s.var5(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return var2[0];
        }
        TileItem var6 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(var1[var2[7]]));
        if (s.var7(var6) && s.var5(Inventory.isFull() ? 1 : 0) && s.var8(var4.ai.r(), var2[3])) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[s.var2[0]] = var2[4];
        nArray[s.var2[2]] = var2[5];
        Item var9 = Inventory.getFirst((int[])nArray);
        if (s.var7(var9)) {
            var9.interact(var1[var2[1]]);
            0;
            if (3 < ((0x7C ^ 6 ^ (0xEC ^ 0x88)) & (0xB4 ^ 0x8D ^ (0x54 ^ 0x73) ^ -1))) {
                return ((167 + 161 - 187 + 56 ^ 58 + 104 - 15 + 6) & (0xB ^ 0x30 ^ (0x24 ^ 0x43) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard var10 = SpellBook.Standard.BONES_TO_PEACHES;
            if (s.var3(var10.canCast() ? 1 : 0)) {
                Magic.cast((Spevar10);
            }
        }
        this.sleep(var2[6]);
        return var2[2];
    }

    private static boolean var8(int n2, int n3) {
        return n2 > n3;
    }

    static {
        s.var11();
        s.var12();
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Inject
    public CastingB2pTask(e e2) {
        this.ai = e2;
    }

    private static void var11() {
        var2 = new int[9];
        s.var2[0] = 2 & ~2;
        s.var2[1] = 2;
        s.var2[2] = 1;
        s.var2[3] = 0xF5 ^ 0xB0 ^ (0x65 ^ 0x2C);
        s.var2[4] = 0xFFFFBB6F & 0x5F9E;
        s.var2[5] = -(0xFFFFEA13 & 0x35ED) & (0xFFFFBF5F & 0x7FEF);
        s.var2[6] = 33 + 50 - 35 + 91 ^ 138 + 128 - 223 + 100;
        s.var2[7] = 3;
        s.var2[8] = 0x3B ^ 0x52 ^ (0xB ^ 0x6A);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static void var12() {
        var1 = new String[var2[6]];
        s.var1[s.var2[0]] = "Bones";
        s.var1[s.var2[2]] = "Big bones";
        s.var1[s.var2[1]] = "Break";
        s.var1[s.var2[7]] = "bones";
    }
}

