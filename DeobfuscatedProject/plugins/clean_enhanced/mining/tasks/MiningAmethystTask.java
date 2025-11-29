/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.util.List;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining amethyst")
public class MiningAmethystTask
extends Task {
    private static final  List<Integer> M;
    private static final  WorldPoint K;
    
    private final  SquireMinerConfig N;
    private static final  WorldPoint L;

    private static void var3() {
        var1 = new String[var2[4]];
        x.var1[x.var2[0]] = "Mine";
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static int var5(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        WorldPoint var12;
        TileObject var13;
        WorldPoint worldPoint;
        if (x.var14((Object)this.N.activity(), (Object)a.AMETHYST)) {
            return var2[0];
        }
        if (x.var4(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        if (x.var4(Players.getLocal().isAnimating() ? 1 : 0)) {
            x var15;
            var15.sleep(Rand.nextInt((int)var2[1], (int)var2[2]));
            return var2[0];
        }
        if (x.var16(Vars.getBit((int)var2[3]))) {
            worldPoint = K;
            0;
            if (((0x23 ^ 0x29) & ~(0x42 ^ 0x48)) > 3) {
                return ((0x5D ^ 0x18) & ~(0x28 ^ 0x6D)) != 0;
            }
        } else {
            worldPoint = L;
        }
        if (x.var17(var13 = TileObjects.getNearest((WorldPoint)(var12 = worldPoint), tileObject -> {
            int n2;
            if (x.var4(M.contains(tileObject.getId()) ? 1 : 0) && x.var4(Players.getAll(player -> {
                int n2;
                if (x.var4(player.isAnimating() ? 1 : 0) && x.var18(x.var5(player.getWorldLocation().distanceToHypotenuse(tileObject.getWorldLocation()), 1.0f))) {
                    n2 = var2[4];
                    0;
                    if (3 == 1) {
                        return ((0x40 ^ 0xA ^ (0xAF ^ 0xBB)) & (191 + 63 - 248 + 219 ^ 110 + 46 - 145 + 180 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && x.var4(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var2[4];
                0;
                if (2 < 0) {
                    return ((9 ^ 0x16) & ~(0x42 ^ 0x5D)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            return var2[0];
        }
        var2_2.interact(var1[var2[0]]);
        return var2[4];
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2) {
        return n2 > 0;
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    static {
        x.var19();
        x.var3();
        K = new WorldPoint(var2[5], var2[6], var2[0]);
        L = new WorldPoint(var2[7], var2[8], var2[0]);
        M = List.of(Integer.valueOf(var2[9]), Integer.valueOf(var2[10]));
    }

    private static void var19() {
        var2 = new int[12];
        x.var2[0] = (0x85 ^ 0xC5) & ~(0x87 ^ 0xC7);
        x.var2[1] = 0x40 ^ 0x48;
        x.var2[2] = 0x9B ^ 0x94;
        x.var2[3] = -(0xFFFFDE73 & 0x6F8D) & (0xFFFFFF75 & 0x5FFB);
        x.var2[4] = 1;
        x.var2[5] = 0xFFFFDBBF & 0x2FFF;
        x.var2[6] = -(0xFFFFF7CF & 0x583C) & (0xFFFFF7FB & 0x7DFF);
        x.var2[7] = 0xFFFFFFD7 & 0xBFB;
        x.var2[8] = 0xFFFFF5EF & 0x2FF8;
        x.var2[9] = 0xFFFFBD7C & 0x6EFF;
        x.var2[10] = -(0xFFFFF0AB & 0x4FD5) & (0xFFFFEDFF & 0x7EFD);
        x.var2[11] = 2;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    @Inject
    public MiningAmethystTask(SquireMinerConfig squireMinerConfig) {
        this.N = squireMinerConfig;
    }
}

