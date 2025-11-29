/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Deposit Salax Salt", priority=79, blocking=true)
public class DepositSalaxSaltTask
extends Task {
    
    final  SquireDukeSucellus bH;
    final  a bI;

    @Inject
    public DepositSalaxSaltTask(SquireDukeSucellus squireDukeSucellus) {
        this.bH = squireDukeSucellus;
        this.bI = squireDukeSucellus.s();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var25;
        void var26;
        int var27;
        String[] stringArray = new String[2];
        stringArray[0] = var2[1];
        if (!(tileObject2.hasActionstringArray) || (tileObject2.getName( == 0).equals(var2[4]) ? 1 : 0)) {
            return 0;
        }
        if (var27 == 2) {
            boolean bl2;
            if ((var26.getWorldX() > var25.getWorldX())) {
                bl2 = 2;
                0;
                if null != null {
                    return ((0x9B ^ 0x88) & ~(0x77 ^ 0x64)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        }
        if ((var26.getWorldX() < var25.getWorldX())) {
            bl = 2;
            0;
            if null != null {
                return ((0xA ^ 0x16) & ~(0x7B ^ 0x67)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var28;
        R var29;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[5]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var2[6];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (1 < 2) return n2 != 0;
                    return ((0x75 ^ 0x70 ^ (0xA4 ^ 0x9A)) & (0xCA ^ 0x94 ^ (0xC8 ^ 0xAD) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if tileObject2 == null {
            return 0;
        }
        Player var30 = Players.getLocal();
        if var30 == null {
            return 0;
        }
        int var31 = var29.bI.x();
        if (var31 >= 1) {
            return 0;
        }
        String[] stringArray = new String[2];
        stringArray[0] = var2[0];
        Item var32 = Inventory.getFirst((String[])stringArray);
        if (!var32 != null || (var32.getQuantity() < 3)) {
            return 0;
        }
        TileObject var33 = TileObjects.getNearest(arg_0 -> R.a(var31, (TileObject)var28, arg_0));
        if var33 == null {
            return 0;
        }
        var5_5.interact(var2[2]);
        return 2;
    }
}

