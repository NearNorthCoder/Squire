/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Walking to the bank", priority=2147483597, blocking=true)
public class WalkingToTheBankTask
extends VardorvisTaskBase {

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new int[7];
        r.var1[0] = (6 + 2 - -107 + 74 ^ 11 + 52 - -16 + 73) & (0x8F ^ 0x9C ^ (0x2C ^ 0x1A) ^ -1);
        r.var1[1] = 1;
        r.var1[2] = 2;
        r.var1[3] = 3;
        r.var1[4] = 0x46 ^ 0x42;
        r.var1[5] = 0xB2 ^ 0xB7;
        r.var1[6] = 0x88 ^ 0x80;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (r.var3(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 <= (6 ^ 3 ^ 1)) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static boolean var16(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void var23() {
        var2 = new String[var1[5]];
        r.var2[r.var1[0]] = "Quick-escape";
        r.var2[r.var1[1]] = "Eat";
        r.var2[r.var1[2]] = "Eat";
        r.var2[r.var1[3]] = "Tendril";
        r.var2[r.var1[4]] = "Quick-escape";
    }

    @Override
    protected boolean l() {
        r var24;
        TileObject tileObject2;
        if (r.var25(this.w.isInInstancedRegion() ? 1 : 0) && r.var26(tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var25(tileObject.getName().equals(var2[var1[3]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[4]];
                if (r.var25(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((6 + 31 - -19 + 75 ^ 131 + 15 - -13 + 1) & (9 + 182 - 137 + 137 ^ 109 + 50 - 70 + 67 ^ -1)) <= 3) return n2 != 0;
                    return ((0x7C ^ 0x26 ^ (0x60 ^ 0)) & (0x58 ^ 0x15 ^ (0x72 ^ 5) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }))) {
            tileObject2.interact(var2[var1[0]]);
            return var1[1];
        }
        if (r.var25(var24.t.earlyBank() ? 1 : 0) && r.var25(var24.R() ? 1 : 0)) {
            return var1[1];
        }
        if (r.var25(var24.P() ? 1 : 0)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)this.t.bank().F());
        0;
        return var1[1];
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean R() {
        void var1_1;
        if (r.var16(Combat.getCurrentHealth(), this.t.eatAt())) {
            return var1[0];
        }
        Item var33 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[r.var1[0]] = var2[var1[2]];
            return item.hasAction(stringArray);
        });
        if (r.var15(var33)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[1];
    }

    private static boolean var26(Object object) {
        return object != null;
    }

    static {
        r.var4();
        r.var23();
    }
}

