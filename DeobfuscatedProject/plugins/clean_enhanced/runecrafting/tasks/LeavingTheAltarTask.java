/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Leaving the altar", blocking=true, priority=5)
public class LeavingTheAltarTask
extends RunecraftingTaskBase {

    private static boolean var3(Object object) {
        return object != null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public LeavingTheAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[var1[0]];
        cArray[r.var1[1]] = c.ACTIVE;
        cArray[r.var1[2]] = c.FINISHING;
        cArray[r.var1[3]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean var10(int n2) {
        return n2 <= 0;
    }

    private static void var11() {
        var1 = new int[5];
        r.var1[0] = 3;
        r.var1[1] = (0x41 ^ 0x72 ^ (0xD2 ^ 0xB5)) & (223 + 82 - 197 + 121 ^ 14 + 2 - -109 + 52 ^ -1);
        r.var1[2] = 1;
        r.var1[3] = 2;
        r.var1[4] = 0xFFFFE8FF & Short.MAX_VALUE;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        r var13;
        int var14;
        int n2;
        int[] nArray = new int[var1[2]];
        nArray[r.var1[1]] = var1[4];
        if (!r.var10(Inventory.getCount((int[])nArray)) || r.var15(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = var1[2];
            0;
            if (-1 < -1) {
                return ((0x24 ^ 0x2D) & ~(0x50 ^ 0x59)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (!r.var12(var14 = n2) || r.var16(var13.aV.g() ? 1 : 0)) {
            return var1[1];
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var16(tileObject.getName().contains(var2[var1[2]]) ? 1 : 0) && r.var16(tileObject.hasAction(string -> {
                int n2;
                if (r.var3(string) && r.var16(string.equals(var2[var1[3]]) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if (3 <= 1) {
                        return ((0x69 ^ 0x3A) & ~(0x7E ^ 0x2D)) != 0;
                    }
                } else {
                    n2 = var1[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if (3 <= 2) {
                    return ((0x94 ^ 0xB1) & ~(0x3B ^ 0x1E)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (r.var18(var17)) {
            return var1[1];
        }
        var2_2.interact(var2[var1[1]]);
        this.b(var1[2], () -> Players.getLocal().isMoving());
        return var1[2];
    }

    static {
        r.var11();
        r.var19();
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[1];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[1];
        while (r.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((62 + 128 - 171 + 130 ^ 64 + 40 - -10 + 66) & (0xFB ^ 0x8C ^ (0x3B ^ 0x6D) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static void var19() {
        var2 = new String[var1[0]];
        r.var2[r.var1[1]] = "Use";
        r.var2[r.var1[2]] = "Portal";
        r.var2[r.var1[3]] = "Use";
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var18(Object object) {
        return object == null;
    }
}

