/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.movement.pathfinder.model.poh.HousePortal
 *  net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox
 *  net.unethicalite.client.managers.RegionManager
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.client.managers.RegionManager;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Grab teleport to GE", priority=18337, blocking=true)
public class GrabTeleportToGeTask
extends NightmareTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ci() {
        R var11;
        if (R.var12(this.cn() ? 1 : 0)) {
            return var1[0];
        }
        Player var13 = Players.getLocal();
        if (R.var14(var13)) {
            return var1[0];
        }
        if (R.var9(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (R.var12(Inventory.contains(var11.ck()) ? 1 : 0)) {
            return var1[0];
        }
        BankLocation var15 = BankLocation.getNearest();
        if (R.var10(var15.getArea().distanceTo(var13.getWorldLocation()), var1[1])) {
            Movement.walkTo((WorldPoint)var15.getArea().getCenter());
            0;
            return var1[2];
        }
        if (R.var9(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        if (R.var9(Bank.contains(var11.ck()) ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            Object[] objectArray = new Object[var1[2]];
            objectArray[R.var1[0]] = var11.cj();
            Log.info((String)var2[var1[2]], (Object[])objectArray);
            var11.cW.forceStop();
            return var1[2];
        }
        Bank.withdraw(this.ck(), (int)var1[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var1[2];
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var17(int n2, int n3) {
        return n2 != n3;
    }

    static {
        R.var18();
        R.var19();
    }

    private static void var18() {
        var1 = new int[13];
        R.var1[0] = (0x4E ^ 0x6C ^ (0x7A ^ 0x49)) & (119 + 17 - -26 + 6 ^ 95 + 171 - 125 + 44 ^ -1);
        R.var1[1] = 0x2C ^ 0x20;
        R.var1[2] = 1;
        R.var1[3] = 0xFFFF9FFF & 0x7F47;
        R.var1[4] = 2;
        R.var1[5] = 3;
        R.var1[6] = 0xFFFFE6FD & 0x3F3F;
        R.var1[7] = 0xFFFFBE3F & 0x67FE;
        R.var1[8] = 0xFFFFF3EE & 0x3FF1;
        R.var1[9] = -(0xFFFF8863 & 0x7FBE) & (0xFFFFBEFF & 0x7D3F);
        R.var1[10] = -(0xFFFFD19B & 0x6E67) & (0xFFFFFFDF & 0x5F6F);
        R.var1[11] = 0xC6 ^ 0xC2;
        R.var1[12] = 37 + 164 - 200 + 175 ^ 92 + 15 - -68 + 9;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static void var19() {
        var2 = new String[var1[11]];
        R.var2[R.var1[0]] = "[GetTeleportToGE]: We don't have a proper teleport to GE";
        R.var2[R.var1[2]] = "[GetTeleportToGE]: Prefer house: {}";
        R.var2[R.var1[4]] = "Ring of wealth (";
        R.var2[R.var1[5]] = "Amulet of Glory (";
    }

    private boolean cj() {
        boolean bl;
        if (!R.var9(RegionManager.hasJewelryBox().equals((Object)JewelryBox.ORNATE) ? 1 : 0) || !R.var9(RegionManager.hasMountedGlory() ? 1 : 0) || R.var12(RegionManager.getHousePortals().contains(HousePortal.VARROCK) ? 1 : 0)) {
            bl = var1[2];
            0;
            if (3 != 3) {
                return ((0x4F ^ 0x1C) & ~(0x2F ^ 0x7C)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private Predicate<Item> ck() {
        if (R.var12(this.cj() ? 1 : 0)) {
            return item -> {
                int n2;
                if (!(R.var17(item.getId(), var1[6]) && R.var17(item.getId(), var1[7]) && R.var17(item.getId(), var1[8]) && R.var17(item.getId(), var1[9]) && !R.var16(item.getId(), var1[10]))) {
                    n2 = var1[2];
                    0;
                    if null != null {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            };
        }
        return item -> {
            int n2;
            if (!R.var17(item.getId(), var1[3]) || !R.var9(item.getName().contains(var2[var1[4]]) ? 1 : 0) || R.var12(item.getName().contains(var2[var1[5]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if ((0x66 ^ 0x62) <= 3) {
                    return ((0xF9 ^ 0xBB) & ~(0xD2 ^ 0x90)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        };
    }

    @Inject
    protected GrabTeleportToGeTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }
}

