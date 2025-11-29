/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Digging next brother", priority=100, blocking=true)
public class DiggingNextBrotherTask
extends Task {
    private final  SquireBarrows X;
    
    private final  a Y;
    
    private final  Client Z;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[0];
        while (q.var25(var24, var23)) {
            char var26 = var22[var24];
            var19.append((char)(var26 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public boolean run() {
        q var27;
        if (q.var28(this.X.u() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var28(var27.X.h() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var28(var27.Z.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var29(var27.X.m() ? 1 : 0)) {
            return var1[0];
        }
        d var30 = var27.X.n();
        if (q.var29(Movement.isRunEnabled() ? 1 : 0) && q.var31(Movement.getRunEnergy(), var1[1])) {
            Movement.toggleRun();
        }
        WorldPoint var32 = var30.D();
        WorldPoint var33 = Players.getLocal().getWorldLocation();
        if (q.var29(Gear.isEquipped((int[])var27.Y.c(var30)) ? 1 : 0)) {
            Gear.swapTo((int[])var27.Y.c(var30));
            0;
        }
        int[] nArray = new int[var1[2]];
        nArray[q.var1[0]] = var1[3];
        Item var34 = Inventory.getFirst((int[])nArray);
        if (q.var35(var34)) {
            int[] nArray2 = new int[var1[2]];
            nArray2[q.var1[0]] = var1[3];
            TileItem var36 = TileItems.getNearest((int[])nArray2);
            if (q.var9(var36)) {
                var36.interact(var2[var1[0]]);
                var27.sleep(var1[4]);
                return var1[2];
            }
            Log.info((String)var2[var1[2]]);
            return var1[0];
        }
        if (q.var25(var32.distanceTo2D(var33), var1[4])) {
            int[] nArray3 = new int[var1[2]];
            nArray3[q.var1[0]] = var1[3];
            Inventory.interact((String)var2[var1[4]], (int[])nArray3);
            0;
            var27.sleep(var1[5]);
            var27.X.j();
            var27.X.b(var30);
            0;
            if (2 < 1) {
                return ((201 + 109 - 134 + 62 ^ 10 + 155 - -18 + 8) & (0x72 ^ 6 ^ (0x23 ^ 6) ^ -1)) != 0;
            }
        } else if (q.var37(var33.getRegionID(), var32.getRegionID())) {
            Movement.setDestination((WorldPoint)var32);
        }
        return var1[2];
    }

    static {
        q.var38();
        q.var39();
    }

    private static boolean var37(int n2, int n3) {
        return n2 == n3;
    }

    private static void var38() {
        var1 = new int[8];
        q.var1[0] = (147 + 72 - 21 + 42 ^ 120 + 89 - 191 + 146) & (0xA7 ^ 0xC3 ^ (4 ^ 0x34) ^ -1);
        q.var1[1] = 0x7D ^ 0x69;
        q.var1[2] = 1;
        q.var1[3] = 0xFFFFD3FD & 0x2FBA;
        q.var1[4] = 2;
        q.var1[5] = 113 + 84 - 181 + 183 ^ 156 + 140 - 294 + 193;
        q.var1[6] = 3;
        q.var1[7] = 0x3B ^ 0x33;
    }

    private static boolean var31(int n2, int n3) {
        return n2 > n3;
    }

    private static void var39() {
        var2 = new String[var1[6]];
        q.var2[q.var1[0]] = "Take";
        q.var2[q.var1[2]] = "Player does not have a spade to dig with LOL";
        q.var2[q.var1[4]] = "Dig";
    }

    private static boolean var28(int n2) {
        return n2 != 0;
    }

    private static boolean var35(Object object) {
        return object == null;
    }

    @Inject
    public DiggingNextBrotherTask(SquireBarrows squireBarrows, a a2, Client client) {
        this.X = squireBarrows;
        this.Y = a2;
        this.Z = client;
    }

    private static boolean var29(int n2) {
        return n2 == 0;
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }
}

