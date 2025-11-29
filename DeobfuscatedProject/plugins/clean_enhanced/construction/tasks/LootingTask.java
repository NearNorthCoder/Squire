/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting")
public class LootingTask
extends Task {
    private static  int[] llIllII;
    private static  String[] llIlIll;
    private final  SquireDagannothKings cO;

    public boolean run() {
        aj var1;
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        Iterator<aH> var2 = var1.cO.p().iterator();
        while ((var2.hasNext( != 0) ? 1 : 0)) {
            aH var3 = var2.next();
            int[] nArray = new int[1];
            nArray[0] = var3.P();
            TileItem var4 = TileItems.getFirstAt((WorldPoint)var3.cd(), (int[])nArray);
            if var4 != null {
                if ((Inventory.isFull( == 0) ? 1 : 0)) {
                    var4.interact(llIlIll[0]);
                }
                if ((Inventory.isFull( != 0) ? 1 : 0)) {
                    Item var5;
                    if ((var4.isStackable( != 0) ? 1 : 0)) {
                        int[] nArray2 = new int[1];
                        nArray2[0] = var4.getId();
                        if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                            var4.interact(llIlIll[1]);
                        }
                    }
                    if ((var5 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[1];
                        stringArray[0] = llIlIll[3];
                        return item.hasActionstringArray == null;
                    }))) {
                        return 0;
                    }
                    var5.interact(llIlIll[2]);
                    return 1;
                }
            }
            0;
            if (3 != 0) continue;
            return ((0x29 ^ 0) & ~(0x67 ^ 0x4E)) != 0;
        }
        return 1;
    }

    private static String llIllIIll(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x43 ^ 0x47) >= (0x3A ^ 0x3E)) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Inject
    public LootingTask(SquireDagannothKings squireDagannothKings) {
        this.cO = squireDagannothKings;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

