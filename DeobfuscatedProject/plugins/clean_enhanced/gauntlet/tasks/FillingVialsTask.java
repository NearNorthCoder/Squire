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
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling Vials", priority=3, blocking=true)
public class FillingVialsTask
extends GauntletTaskBase {
    private final  b bS;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var2 = new String[var1[2]];
        E.var2[E.var1[1]] = "Water Pump";
    }

    static {
        E.var5();
        E.var4();
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    @Inject
    public FillingVialsTask(c c2, b b2) {
        d[] dArray = new d[var1[0]];
        dArray[E.var1[1]] = d.FIRST_ROTATION_CREATE;
        dArray[E.var1[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[E.var1[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bS = b2;
    }

    private static void var5() {
        var1 = new int[4];
        E.var1[0] = 3;
        E.var1[1] = (138 + 60 - 90 + 34 ^ 170 + 49 - 142 + 101) & (0x68 ^ 0x1A ^ (0x38 ^ 0x76) ^ -1);
        E.var1[2] = 1;
        E.var1[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        void var1_1;
        E var8;
        if (E.var6(this.bS.p() ? 1 : 0)) {
            return var1[1];
        }
        if (E.var9(var8.ba.I().isEmpty() ? 1 : 0)) {
            return var1[1];
        }
        Item var10 = Inventory.getFirst((int[])f.VIAL.ad());
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (E.var6(e.X.contains(tileObject.getId()) ? 1 : 0) && E.var6(tileObject.getName().equals(var2[var1[1]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if null != null {
                    return ((0x34 ^ 0x15) & ~(0x3C ^ 0x1D)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (!E.var7(var11) || E.var3(var10)) {
            return var1[1];
        }
        var1_1.useOn((TileObject)var2_2);
        this.bS.e(var1[0]);
        return var1[2];
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }
}

