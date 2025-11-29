/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.query.entities.TileItemQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileItemQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Looting marks", priority=1000, blocking=true)
public class LootingMarksTask
extends Task {
    private final  AgilityConfig u;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n) {
        return n != 0;
    }

    static {
        f.var5();
        f.var6();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7;
        f var8;
        int n;
        Player player = Players.getLocal();
        if (!f.var9(player) || f.var4(player.isAnimating() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[f.var1[0]] = var1[2];
        if (f.var9(Inventory.getFirst((int[])nArray))) {
            n = var1[1];
            0;
            if (2 >= (0x57 ^ 0x53)) {
                return ((0x90 ^ 0xBA) & ~(0x8C ^ 0xA6)) != 0;
            }
        } else {
            n = var1[0];
        }
        int var10 = n;
        Item var11 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[f.var1[0]] = var2[var1[5]];
            return item.hasAction(stringArray);
        });
        if (f.var4(Inventory.isFull() ? 1 : 0) && f.var12(var10) && f.var13(var11)) {
            return var1[0];
        }
        TileItem var14 = var8.c(var7.getPlane());
        if (f.var13(var14)) {
            return var1[0];
        }
        if (f.var4(var7.isMoving() ? 1 : 0)) {
            return var1[1];
        }
        TileItem var15 = TileItems.getNearest(tileItem2 -> {
            int n;
            if (f.var4(tileItem2.getWorldLocation().equals((Object)var14.getWorldLocation()) ? 1 : 0) && f.var4(tileItem2.getName().equals(var2[var1[4]]) ? 1 : 0)) {
                n = var1[1];
                0;
                if (2 <= ((0x9E ^ 0x94) & ~(0x69 ^ 0x63))) {
                    return ((0x6B ^ 0x37) & ~(0x5E ^ 2)) != 0;
                }
            } else {
                n = var1[0];
            }
            return n != 0;
        });
        if (f.var9(var15)) {
            var15.interact(var2[var1[0]]);
            return var1[1];
        }
        if (f.var12(var8.v() ? 1 : 0)) {
            var14.interact(var2[var1[1]]);
            return var1[1];
        }
        if (f.var16(var14.getQuantity(), var8.u.markLootAmount())) {
            var14.interact(var2[var1[3]]);
            return var1[1];
        }
        return var1[0];
    }

    private TileItem c(int n) {
        return (TileItem)((SceneEntityQueryResults)((TileItemQuery)((TileItemQuery)((TileItemQuery)TileItems.query().filter(tileItem -> {
            boolean bl;
            if (f.var17(tileItem.getPlane(), n)) {
                bl = var1[1];
                0;
                if ((0x66 ^ 0x41 ^ (0x85 ^ 0xA6)) == 1) {
                    return ((99 + 91 - 67 + 84 ^ 126 + 103 - 178 + 102) & (0x11 ^ 7 ^ (0x75 ^ 0x35) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        })).filter(tileItem -> {
            boolean bl;
            if (f.var17(tileItem.getId(), var1[2])) {
                bl = var1[1];
                0;
                if (((0x7F ^ 0x38 ^ (0xA6 ^ 0xBC)) & (0x87 ^ 0xB7 ^ (0xC5 ^ 0xA8) ^ -1)) != 0) {
                    return ((148 + 47 - 141 + 192 ^ 181 + 128 - 173 + 56) & (130 + 130 - 119 + 0 ^ 25 + 85 - 55 + 132 ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        })).filter(Reachable::isInteractable)).results()).nearest();
    }

    private static boolean var18(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var16(int n, int n2) {
        return n >= n2;
    }

    private static boolean var19(int n, int n2) {
        return n < n2;
    }

    @Inject
    public LootingMarksTask(AgilityConfig agilityConfig) {
        this.u = agilityConfig;
    }

    private static void var6() {
        var2 = new String[var1[6]];
        f.var2[f.var1[0]] = "Take";
        f.var2[f.var1[1]] = "Take";
        f.var2[f.var1[3]] = "Take";
        f.var2[f.var1[4]] = "Coins";
        f.var2[f.var1[5]] = "Eat";
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[0];
        while (f.var19(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static void var5() {
        var1 = new int[8];
        f.var1[0] = (0x2E ^ 0x19) & ~(0x72 ^ 0x45);
        f.var1[1] = 1;
        f.var1[2] = -(0xFFFFF6D7 & 0x492F) & (0xFFFFFF5F & 0x6EEF);
        f.var1[3] = 2;
        f.var1[4] = 3;
        f.var1[5] = 35 + 74 - -26 + 9 ^ 123 + 38 - 58 + 45;
        f.var1[6] = 0xBE ^ 0xBB;
        f.var1[7] = 0xB7 ^ 0xBF;
    }

    private static boolean var17(int n, int n2) {
        return n == n2;
    }

    private boolean v() {
        boolean bl;
        b var30;
        b b2;
        if (f.var4(this.u.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if ((0xA2 ^ 0xA6) <= 0) {
                return ((0x2E ^ 0x3F) & ~(0x25 ^ 0x34)) != 0;
            }
        } else {
            f var31;
            b2 = var31.u.course();
        }
        if (!f.var18((Object)(var30 = b2), (Object)b.ARDOUGNE) || f.var3((Object)var30, (Object)b.POLLNIVNEACH)) {
            bl = var1[1];
            0;
            if (-2 > 0) {
                return ((0xA2 ^ 0x94) & ~(0xF4 ^ 0xC2)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }
}

