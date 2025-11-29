/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="High Alching loot", priority=60000)
public class HighAlchingLootTask
extends Task {

    private final  SquireScurriusConfig ad;
    private final  SquireScurrius ac;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static void var10() {
        var1 = new String[var2[1]];
        s.var1[s.var2[0]] = "Scurrius";
        s.var1[s.var2[2]] = "Giant rat";
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        s var13;
        if (s.var11(this.ad.highAlch() ? 1 : 0)) {
            return var2[0];
        }
        if (s.var11(var13.ac.c() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[s.var2[0]] = var1[var2[0]];
        stringArray[s.var2[2]] = var1[var2[2]];
        NPC var14 = NPCs.getNearest((String[])stringArray);
        if (s.var12(var14)) {
            return var2[0];
        }
        Item var15 = Inventory.getFirst(item -> d.x.contains(item.getName()));
        if (s.var9(var15)) {
            return var2[0];
        }
        SpellBook.Standard var16 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (s.var11(var16.canCast() ? 1 : 0)) {
            return var2[0];
        }
        Magic.cast((Spevar3_3);
        var2_2.interact(var2[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var2_2.getSlot(), WidgetInfo.INVENTORY.getId());
        return var2[2];
    }

    private static boolean var17(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var24;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        0;
        int[] nArray = new int[var2[1]];
        nArray[s.var2[0]] = d.C;
        nArray[s.var2[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (s.var12(projectile) && s.var25(projectile.getRemainingCycles(), var2[3])) {
            if (s.var17(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                if (3 < 1) {
                    return null;
                }
            } else {
                var24.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if (3 <= 1) {
                    return null;
                }
            }
        } else {
            var24.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    @Inject
    public HighAlchingLootTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ac = squireScurrius;
        this.ad = squireScurriusConfig;
    }

    private static boolean var25(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var26() {
        var2 = new int[5];
        s.var2[0] = (0x25 ^ 0x1C) & ~(0x52 ^ 0x6B);
        s.var2[1] = 2;
        s.var2[2] = 1;
        s.var2[3] = 0x33 ^ 0x1E;
        s.var2[4] = 70 + 12 - 45 + 135 ^ 78 + 158 - 161 + 89;
    }

    static {
        s.var26();
        s.var10();
    }
}

