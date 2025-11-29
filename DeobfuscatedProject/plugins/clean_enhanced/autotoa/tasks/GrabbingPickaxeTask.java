/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Grabbing Pickaxe", priority=100, blocking=true)
public class GrabbingPickaxeTask
extends AutotoaManager {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        int n2 = Vars.getBit((int)var2[0]);
        if (aA.var3(n2)) {
            return var2[1];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.var5(tileObject.getId(), var2[9]) && aA.var6(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if (2 <= 0) {
                    return ((215 + 12 - 73 + 76 ^ 152 + 90 - 105 + 43) & (0xC9 ^ 0xA6 ^ (0xFF ^ 0xC2) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (aA.var7(var4)) {
            return var2[1];
        }
        if (aA.var6(Inventory.isFull() ? 1 : 0)) {
            int var8 = var2[1];
            List var9 = Inventory.getAll(item -> {
                int n2;
                if (aA.var6(item.hasAction(var1[var2[7]]::equals) ? 1 : 0) && aA.var6(item.hasAction(var1[var2[8]]::equals) ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (-(0x13 ^ 0x17) >= 0) {
                        return ((0x36 ^ 0x2E) & ~(0x8D ^ 0x95)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                return n2 != 0;
            });
            if (aA.var3(var9.isEmpty() ? 1 : 0)) {
                int var10 = var2[1];
                while (aA.var11(var10, Math.min(var2[2], var9.size() - var2[3]))) {
                    ((Item)var9.get(var10)).interact(var1[var2[1]]);
                    var8 = var2[3];
                    Object[] objectArray = new Object[var2[3]];
                    objectArray[aA.var2[1]] = ((Item)var9.get(var10)).getName();
                    Log.info((String)var1[var2[3]], (Object[])objectArray);
                    ++var10;
                    0;
                    if null == null continue;
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            if (aA.var6(var8)) {
                return var2[3];
            }
            List var10 = Inventory.getAll(item -> {
                int n2;
                if (aA.var6(item.hasAction(var1[var2[5]]::equals) ? 1 : 0) && aA.var6(item.hasAction(var1[var2[6]]::equals) ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (2 < 0) {
                        return ((51 + 18 - -45 + 13 ^ (0xA7 ^ 0xC1)) & (0x43 ^ 0x54 ^ (0x3A ^ 0x34) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                return n2 != 0;
            });
            if (aA.var3(var10.isEmpty() ? 1 : 0)) {
                int var12 = var2[1];
                while (aA.var11(var12, Math.min(var2[2], var10.size() - var2[3]))) {
                    ((Item)var10.get(var12)).interact(var1[var2[4]]);
                    ++var12;
                    0;
                    if (2 != 1) continue;
                    return ((2 + 45 - 32 + 141 ^ 158 + 121 - 255 + 152) & (21 + 50 - -21 + 79 ^ 17 + 122 - 17 + 13 ^ -1)) != 0;
                }
                return var2[3];
            }
        }
        var2_2.interact(var1[var2[2]]);
        return var2[3];
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (aA.var11(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if ((0xEF ^ 0xB8 ^ (0xF4 ^ 0xA7)) == (0x25 ^ 0x18 ^ (0xBC ^ 0x85))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static void var23() {
        var1 = new String[var2[10]];
        aA.var1[aA.var2[1]] = "Drop";
        aA.var1[aA.var2[3]] = "Dropped food {}";
        aA.var1[aA.var2[4]] = "Drop";
        aA.var1[aA.var2[2]] = "Take-pickaxe";
        aA.var1[aA.var2[5]] = "Empty";
        aA.var1[aA.var2[6]] = "Drop";
        aA.var1[aA.var2[7]] = "Eat";
        aA.var1[aA.var2[8]] = "Drop";
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static void var36() {
        var2 = new int[11];
        aA.var2[0] = -(0xFFFFADD5 & 0x53BE) & (0xFFFFB9FB & Short.MAX_VALUE);
        aA.var2[1] = (121 + 103 - 174 + 148 ^ 93 + 60 - 12 + 18) & (0x22 ^ 0x13 ^ (5 ^ 0x6D) ^ -1);
        aA.var2[2] = 3;
        aA.var2[3] = 1;
        aA.var2[4] = 2;
        aA.var2[5] = 81 + 12 - 56 + 125 ^ 135 + 97 - 117 + 51;
        aA.var2[6] = 145 + 120 - 209 + 126 ^ 120 + 133 - 206 + 132;
        aA.var2[7] = 0x4F ^ 0x65 ^ (0x41 ^ 0x6D);
        aA.var2[8] = 0x91 ^ 0x96;
        aA.var2[9] = -(0xFFFFDE22 & 0x6DDF) & (0xFFFFFFDF & 0xFDBD);
        aA.var2[10] = 0xA4 ^ 0x94 ^ (0xB8 ^ 0x80);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Inject
    protected GrabbingPickaxeTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aA.var36();
        aA.var23();
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }
}

