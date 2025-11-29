/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Empty Private Storage", priority=2147483546, blocking=true)
public class EmptyPrivateStorageTask
extends az {

    private final  int ds = 0xF0000A;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        if ((c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((D.bC( != 0).bH() ? 1 : 0)) {
            return 1;
        }
        Widget var9 = Widgets.get((int)2, widget -> {
            String[] stringArray = new String[3];
            stringArray[1] = var1[var2[17]];
            return widget.hasAction(stringArray);
        });
        if (var9 != null && (var9.isVisible( != 0) ? 1 : 0)) {
            var9.interact(var1[1]);
            return 3;
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[var2[15]]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[1] = var1[var2[16]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if ((0x34 ^ 0x49 ^ (0x5A ^ 0x23)) >= 2) return n2 != 0;
                    return ((0x52 ^ 0x4A ^ (9 ^ 0x20)) & (47 + 60 - 5 + 79 ^ 83 + 49 - 43 + 43 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if var10 == null {
            au var11;
            Movement.walkTo((WorldPoint)var11.cy);
            0;
            return 1;
        }
        var2_2.interact(var1[3]);
        return 3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 1;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 1;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public EmptyPrivateStorageTask() {
        this.ds = 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[3];
        nArray[1] = 4;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            Dialog.continueSpace();
            return 3;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIlIIIlIIl[5]) ? 1 : 0) && (Dialog.hasOption(StringlIlIlIIIlIIl[6]) ? 1 : 0)) {
            String[] stringArray = new String[3];
            stringArray[1] = var1[7];
            Dialog.chooseOption((String[])stringArray);
            0;
            return 3;
        }
        Widget var28 = Widgets.get((int)8, (int)9, (int)1);
        if (var28 != null && (var28.isVisible( != 0) ? 1 : 0) && (var28.getText( != 0).contains(var1[var2[10]]) ? 1 : 0)) {
            Widget var29 = Widgets.get((int)8, (int)9);
            if var29 == null {
                return 1;
            }
            var29.interact(var1[var2[11]]);
            return 3;
        }
        Widget var29 = Static.getClient().getWidget(0);
        if var29 != null {
            var29.interact(3, var2[12], var2[13], 0);
            return 3;
        }
        int[] nArray2 = new int[3];
        nArray2[1] = 4;
        Item var30 = Inventory.getFirst((int[])nArray2);
        if var30 == null {
            return 1;
        }
        var3_4.interact(var1[var2[14]]);
        return 3;
    }

}

