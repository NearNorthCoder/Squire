/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.managers.InventoryManager
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;

@TaskDesc(name="Checking State", priority=2147482310)
public class CheckingStateTask
extends Task {
    private final  SquireBarrowsConfig E;

    private final  Instant F;
    private final  SquireBarrows D;

    static {
        h.var3();
        h.var4();
    }

    private static void var3() {
        var2 = new int[14];
        h.var2[0] = (0x9A ^ 0xAD) & ~(7 ^ 0x30);
        h.var2[1] = -(0xFFFFFE91 & 0x75FF) & (0xFFFFFEDC & 0x9575B3);
        h.var2[2] = 1;
        h.var2[3] = 0xFFFFF77F & 0x2BFD;
        h.var2[4] = 2;
        h.var2[5] = 3;
        h.var2[6] = -(0xFFFFEC57 & 0x53BD) & (0xFFFFDDFF & 0x6FFF);
        h.var2[7] = -(0xFFFFB5BF & 0x6A4F) & (0xFFFFECFF & 0x3FFF);
        h.var2[8] = 0xB0 ^ 0xB4;
        h.var2[9] = 0x3E ^ 0x23 ^ (0xA6 ^ 0xBE);
        h.var2[10] = 0x63 ^ 0x7C ^ (0x40 ^ 0x59);
        h.var2[11] = 0x60 ^ 0x67;
        h.var2[12] = 0xF ^ 0x14 ^ (0x19 ^ 0xA);
        h.var2[13] = 3 ^ 4 ^ (0x93 ^ 0x9D);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public CheckingStateTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.F = Instant.now();
        this.D = squireBarrows;
        this.E = squireBarrowsConfig;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h var12;
        if (h.var13(Game.getState(), GameState.LOGGED_IN)) {
            return var2[0];
        }
        if (h.var14(Players.getLocal())) {
            return var2[0];
        }
        if (!h.var15(Game.isInCutscene() ? 1 : 0) || h.var14(InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId()))) {
            return var2[0];
        }
        Widget var16 = Widgets.fromId((int)var2[1]);
        if (h.var14(var16)) {
            return var2[0];
        }
        WidgetInfo var17 = Tab.INVENTORY.getWidgetInfo();
        if (!h.var18(var17) || h.var15(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)var17)) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[2]];
        nArray[h.var2[0]] = var2[3];
        Item var19 = Inventory.getFirst((int[])nArray);
        if (h.var18(var19)) {
            Inventory.dropAll(item -> {
                boolean bl;
                if (h.var20(item.getId(), var2[3])) {
                    bl = var2[2];
                    0;
                    if null != null {
                        return ((0x78 ^ 0x73 ^ (0x72 ^ 0x4B)) & (0x2F ^ 0x57 ^ (0x48 ^ 2) ^ -1)) != 0;
                    }
                } else {
                    bl = var2[0];
                }
                return bl;
            });
            0;
            return var2[2];
        }
        if (h.var21(Inventory.getFreeSlots(), var2[4]) && h.var15(Inventory.contains(item -> {
            String[] stringArray = new String[var2[2]];
            stringArray[h.var2[0]] = var1[var2[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            Log.info((String)var1[var2[0]]);
            var12.D.a(var2[2]);
        }
        int n2 = Inventory.contains(item -> {
            int n2;
            if (!h.var15(item.getName().toLowerCase().contains(var1[var2[10]]) ? 1 : 0) || h.var11(item.getName().toLowerCase().contains(var1[var2[11]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((128 + 33 - 127 + 107 ^ 17 + 117 - 85 + 137) & (0x23 ^ 0x59 ^ (0x3A ^ 0x77) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (h.var11(var12.E.bankForPrayer() ? 1 : 0) && h.var15(n2)) {
            Log.info((String)var1[var2[2]]);
            var12.D.a(var2[2]);
        }
        Item var22 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[2]];
            stringArray[h.var2[0]] = var1[var2[9]];
            return item.hasAction(stringArray);
        });
        if (h.var11(var12.E.bankForFood() ? 1 : 0) && h.var14(var22) && (!h.var23(Combat.getCurrentHealth(), var12.E.eatAtHp()) || h.var15(var12.D.m() ? 1 : 0))) {
            Log.info((String)var1[var2[4]]);
            var12.D.a(var2[2]);
        }
        if (h.var15(var12.E.useHouse() ? 1 : 0) && h.var11(var12.D.v() ? 1 : 0)) {
            if (h.var15(var12.D.CheckingStateTask() ? 1 : 0)) {
                var12.D.b(var2[0]);
                return var2[2];
            }
            Log.info((String)var1[var2[5]]);
            return var12.J();
        }
        return var2[0];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (h.var21(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(var2[6], var2[7], var2[0]);
        if (h.var15(Movement.shouldWalk() ? 1 : 0)) {
            return var2[2];
        }
        System.out.println(var1[var2[8]]);
        Movement.walkTo((WorldPoint)worldPoint);
        0;
        return var2[2];
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var1 = new String[var2[13]];
        h.var1[h.var2[0]] = "Inventory full, need to bank loot";
        h.var1[h.var2[2]] = "Out of prayer restores, need to bank";
        h.var1[h.var2[4]] = "No food or not enough food";
        h.var1[h.var2[5]] = "We have looted chest, but it doesn't seem like we need to bank yet.";
        h.var1[h.var2[8]] = "Reset walking";
        h.var1[h.var2[9]] = "Eat";
        h.var1[h.var2[10]] = "prayer";
        h.var1[h.var2[11]] = "restore";
        h.var1[h.var2[12]] = "Eat";
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var23(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }
}

