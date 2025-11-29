/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring in POH", priority=1100, blocking=true)
public class RestoringInPohTask
extends Task {

    private final  SquireNightmareConfig dh;
    private final  SquireNightmarePlugin dg;
    private static final  Logger df;

    public boolean run() {
        J var3;
        if (J.var4(this.dg.ae() ? 1 : 0)) {
            return var1[0];
        }
        if (J.var5(var3.dh.restoreInPOH() ? 1 : 0)) {
            return var1[0];
        }
        if (J.var6(Game.getState(), GameState.LOGGED_IN)) {
            return var1[0];
        }
        NPC var7 = SquireNightmarePlugin.d();
        if (J.var8(var7)) {
            return var1[0];
        }
        if (J.var5(House.isPoolDrinkUseful() ? 1 : 0)) {
            if (J.var4(var3.dg.l() ? 1 : 0)) {
                df.info(var2[var1[0]]);
                var3.dg.m();
                0;
                return var1[1];
            }
            return var1[0];
        }
        if (J.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (J.var4(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return var1[1];
        }
        return House.drinkFromPool();
    }

    private static boolean var8(Object object) {
        return object != null;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var1 = new int[3];
        J.var1[0] = (0xCB ^ 0xA8 ^ (0x38 ^ 0x56)) & (108 + 11 - 79 + 106 ^ 80 + 39 - 60 + 100 ^ -1);
        J.var1[1] = 1;
        J.var1[2] = 2;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        J.var15();
        J.var16();
        df = LoggerFactory.getLogger(RestoringInPohTask.class);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Inject
    public RestoringInPohTask(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig) {
        this.dg = squireNightmarePlugin;
        this.dh = squireNightmareConfig;
    }

    private static void var16() {
        var2 = new String[var1[1]];
        J.var2[J.var1[0]] = "[RestoreInPOH]: Leaving POH, pool not useful";
    }
}

