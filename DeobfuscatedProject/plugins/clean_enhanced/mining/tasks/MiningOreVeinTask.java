/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining Ore Vein", priority=5, blocking=true, register=true)
public class MiningOreVeinTask
extends MiningTaskBase {
    public static final  int S;
    private  boolean W;
    
    private final  U T;
    private  int V;
    
    private final  Client U;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean t() {
        TileObject var11;
        B var12;
        Player player = Players.getLocal();
        if (!B.var13(player) || B.var14(this.Z.I() ? 1 : 0)) {
            return var2[0];
        }
        if (B.var14(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        if (!B.var15(var12.Z.G() ? 1 : 0) || B.var14(var12.Z.F() ? 1 : 0)) {
            return var2[0];
        }
        if (B.var14(var12.W) && B.var16(var12.U.getTickCount() - var12.V, var2[1])) {
            var12.T.e(null);
        }
        if (B.var4(var11 = var12.T.P())) {
            TileObject var17 = var12.u();
            if (!B.var13(var17) || B.var15(Reachable.isInteractable((Locatable)var17) ? 1 : 0)) {
                return var2[0];
            }
            var12.T.e(var17);
            var17.interact(var1[var2[0]]);
            var12.sleep(var2[2]);
            return var2[3];
        }
        if (B.var15(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
            var12.T.e(null);
            return var2[0];
        }
        return var2[3];
    }

    private static boolean var16(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    static {
        B.var18();
        B.var19();
        S = var2[5];
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    private static void var18() {
        var2 = new int[7];
        B.var2[0] = (0xC8 ^ 0xA8) & ~(0xDD ^ 0xBD);
        B.var2[1] = 7 ^ 1;
        B.var2[2] = 2;
        B.var2[3] = 1;
        B.var2[4] = -1;
        B.var2[5] = 0xFFFFAFE1 & 0x535E;
        B.var2[6] = 2 ^ (0x45 ^ 0x4F);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var20;
        Actor actor = animationChanged.getActor();
        if (!B.var13(actor) || B.var21(actor, Players.getLocal())) {
            return;
        }
        if (B.var3(var20.getAnimation(), var2[4])) {
            B var22;
            var22.V = var22.U.getTickCount();
            var22.W = var2[3];
            0;
            if (-2 >= 0) {
                return;
            }
        } else {
            var22.W = var2[0];
        }
    }

    private static boolean var21(Object object, Object object2) {
        return object != object2;
    }

    private static void var19() {
        var1 = new String[var2[3]];
        B.var1[B.var2[0]] = "Mine";
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    @Inject
    public MiningOreVeinTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2, U u2, Client client) {
        super(squireMinerConfig, squireMiner, t2);
        this.T = u2;
        this.U = client;
    }
}

