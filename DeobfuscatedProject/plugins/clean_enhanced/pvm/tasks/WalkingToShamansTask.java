/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Walking to shamans", priority=10, blocking=true)
public class WalkingToShamansTask
extends Task {
    private final  SquireShamansPlugin aP;
    
    private final  c aO;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static void var4() {
        var2 = new int[6];
        B.var2[0] = (0x4C ^ 0x21 ^ (0x5B ^ 0x30)) & (0x4C ^ 0x63 ^ (0x6A ^ 0x43) ^ -1);
        B.var2[1] = 0x8B ^ 0x9F;
        B.var2[2] = 1;
        B.var2[3] = -1;
        B.var2[4] = 2;
        B.var2[5] = 0xBF ^ 0xB7;
    }

    private static void var5() {
        var1 = new String[var2[4]];
        B.var1[B.var2[0]] = "Drink";
        B.var1[B.var2[2]] = "Stamina";
    }

    private static boolean var6(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var2[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var2[0];
        while (B.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if ((0xA3 ^ 0xA7) > 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    /*
     * WARNING - void declaration
     */
    private void H() {
        void var2_2;
        World var19;
        void var20;
        int n2 = this.aP.c();
        if (B.var3(Worlds.getCurrentId(), n2)) {
            this.aP.a(var2[3]);
            return;
        }
        if (B.var21((int)var20, var2[3])) {
            var19 = Worlds.getFirst((int)var20);
            0;
            if (1 < 0) {
                return;
            }
        } else {
            var19 = Worlds.getFirst(world -> {
                int n2;
                if (B.var22(world.isNormal() ? 1 : 0) && B.var22(world.isMembers() ? 1 : 0) && B.var6(world.getId(), Worlds.getCurrentId())) {
                    n2 = var2[2];
                    0;
                    if null != null {
                        return ((0 ^ 0x1C) & ~(7 ^ 0x1B)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
        }
        if (B.var23(var19) && B.var23(var19 = Worlds.getFirst(world -> {
            int n2;
            if (B.var22(world.isNormal() ? 1 : 0) && B.var22(world.isMembers() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((0x5E ^ 0x71) & ~(0x76 ^ 0x59)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            return;
        }
        Worlds.hopTo((World)var2_2);
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    public boolean run() {
        B var25;
        if (B.var22(this.aO.s() ? 1 : 0)) {
            return var2[0];
        }
        Item var26 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[2]]));
        if (B.var27(var26) && B.var24(Movement.isStaminaBoosted() ? 1 : 0) && B.var7(Movement.getRunEnergy(), var2[1])) {
            var26.interact(var1[var2[0]]);
            return var2[2];
        }
        InventorySetup var28 = var25.aO.r();
        if (B.var24(var28.matchesInventory() ? 1 : 0)) {
            return var2[0];
        }
        g var29 = var25.aO.t();
        Player var30 = Players.getNearest(player -> {
            int n2;
            if (B.var22(var29.x().contains((Locatable)player) ? 1 : 0) && B.var31(player, Players.getLocal())) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((108 + 222 - 176 + 87 ^ 111 + 29 - 58 + 106) & (196 + 95 - 124 + 41 ^ 66 + 64 - 114 + 141 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (B.var27(var30)) {
            var25.H();
            return var2[0];
        }
        if (B.var22(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var29.A());
            0;
            return var2[2];
        }
        return var2[2];
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var27(Object object) {
        return object != null;
    }

    static {
        B.var4();
        B.var5();
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToShamansTask(c c2, SquireShamansPlugin squireShamansPlugin) {
        this.aO = c2;
        this.aP = squireShamansPlugin;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var31(Object object, Object object2) {
        return object != object2;
    }
}

