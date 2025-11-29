/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
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
import gg.squire.duke.tasks.HHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Deposit Musca Mushroom", priority=101, blocking=true)
public class DepositMuscaMushroomTask
extends Task {

    final  SquireDukeSucellus bz;
    final  a bA;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xD8 ^ 0xC7) & ~(0x80 ^ 0x9F)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var19;
        void var20;
        int var21;
        String[] stringArray = new String[2];
        stringArray[0] = var1[1];
        if (!(tileObject2.hasActionstringArray) || (tileObject2.getName( == 0).equals(var1[4]) ? 1 : 0)) {
            return 0;
        }
        if (var21 == 0) {
            boolean bl2;
            if ((var20.getWorldX() > var19.getWorldX())) {
                bl2 = 2;
                0;
                if null != null {
                    return ((0xD4 ^ 0x82) & ~(0x13 ^ 0x45)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        }
        if ((var20.getWorldX() < var19.getWorldX())) {
            bl = 2;
            0;
            if (-1 >= ((0x8C ^ 0xA9 ^ (0x4E ^ 0x39)) & (91 + 97 - 143 + 186 ^ 70 + 18 - 44 + 137 ^ -1))) {
                return ((118 + 224 - 267 + 152 ^ 41 + 38 - -15 + 37) & (0x5F ^ 0x7F ^ (0x61 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    @Inject
    public DepositMuscaMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bz = squireDukeSucellus;
        this.bA = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var22;
        N var23;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[5]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[6];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (-2 < 0) return n2 != 0;
                    return ((122 + 37 - 141 + 123 ^ 86 + 70 - 39 + 39) & (0xA6 ^ 0xC6 ^ (0x4B ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if tileObject2 == null {
            return 0;
        }
        Player var24 = Players.getLocal();
        if var24 == null {
            return 0;
        }
        int var25 = var23.bA.w();
        if (var25 >= 1) {
            return 0;
        }
        if ((h.i((TileObject == 0)var22).contains((Locatable)var24) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[2];
        stringArray[0] = var1[0];
        Item var26 = Inventory.getFirst((String[])stringArray);
        if (!var26 != null || (var26.getQuantity() < 3)) {
            return 0;
        }
        TileObject var27 = TileObjects.getNearest(arg_0 -> N.a(var25, (TileObject)var22, arg_0));
        if var27 == null {
            return 0;
        }
        var5_5.interact(var1[2]);
        return 2;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

}

