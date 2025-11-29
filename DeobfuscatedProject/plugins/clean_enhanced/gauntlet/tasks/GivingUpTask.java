/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Giving up", priority=100, blocking=true)
public class GivingUpTask
extends GauntletTaskBase {

    private final  SquireGauntlet bZ;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static void var11() {
        var1 = new String[var2[3]];
        O.var1[O.var2[1]] = "Quick-exit";
        O.var1[O.var2[0]] = "Activate";
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var14;
        void var15;
        h h2 = this.ba.V();
        Player player = Players.getLocal();
        if (!O.var9(h2) || !O.var9(player) || O.var12(player.isMoving() ? 1 : 0)) {
            return var2[1];
        }
        if (O.var12(var15.av().e(var14.getWorldLocation()) ? 1 : 0)) {
            O var16;
            TileObject var17 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (O.var10(var17)) {
                return var2[1];
            }
            if (O.var12(Players.getLocal().isMoving() ? 1 : 0)) {
                return var2[0];
            }
            var17.interact(var1[var2[1]]);
            var16.bZ.a(var16.bZ.k() + var2[0]);
            Log.info((String)("Unlucky spawns or no T3 Magic weapon. Giving up, count: " + var16.bZ.k()));
            return var2[0];
        }
        Item var17 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (O.var9(var17)) {
            var17.interact(var1[var2[0]]);
            0;
            if ((3 ^ 7) <= -1) {
                return ((0x40 ^ 0x51) & ~(0x83 ^ 0x92)) != 0;
            }
        } else {
            WorldPoint var18 = var15.av().aW().dx(var2[2]).dy(var2[2]);
            ScenePoint var19 = ScenePoint.fromWorld((WorldPoint)var18);
            Movement.setDestination((int)var19.getX(), (int)var19.getY());
        }
        return var2[0];
    }

    private static void var20() {
        var2 = new int[4];
        O.var2[0] = 1;
        O.var2[1] = (0x19 ^ 0x22) & ~(0x32 ^ 9);
        O.var2[2] = 0xA0 ^ 0xA6;
        O.var2[3] = 2;
    }

    @Inject
    public GivingUpTask(SquireGauntlet squireGauntlet, c c2) {
        d[] dArray = new d[var2[0]];
        dArray[O.var2[1]] = d.GIVE_UP;
        super(c2, dArray);
        this.bZ = squireGauntlet;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[1];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[1];
        while (O.var13(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (-(0x13 ^ 0x16) < 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    static {
        O.var20();
        O.var11();
    }
}

