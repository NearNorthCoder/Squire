/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.AnimationID
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.lang.reflect.Field;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.AnimationID;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class HoppingToAvoidNearbyPlayerTask
extends Task {
    private final  SquireMinerConfig ap;

    static {
        M.var3();
        M.var4();
    }

    @Inject
    public HoppingToAvoidNearbyPlayerTask(SquireMinerConfig squireMinerConfig) {
        this.ap = squireMinerConfig;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(int n2) {
        void var6;
        Field[] fieldArray;
        Field[] fieldArray2 = fieldArray = AnimationID.class.getDeclaredFields();
        int n3 = fieldArray2.length;
        int var7 = var2[0];
        while (M.var8(var7, (int)var6)) {
            void var9;
            void var10 = var9[var7];
            if (M.var11(var10.getName().startsWith(var1[var2[0]]) ? 1 : 0)) {
                try {
                    void var12;
                    int var13 = var10.getInt(null);
                    if (M.var14(var13, (int)var12)) {
                        return var2[1];
                    }
                    0;
                }
                catch (IllegalAccessException var13) {
                    // empty catch block
                }
                if (-1 >= (7 + 56 - -31 + 47 ^ 136 + 112 - 229 + 118)) {
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            ++var7;
            0;
            if null == null continue;
            return ((0x16 ^ 0x4D) & ~(0x30 ^ 0x6B)) != 0;
        }
        return var2[0];
    }

    private static boolean var15(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        M var16;
        if (M.var5((Object)this.ap.activity(), (Object)a.VOLCANIC_ASH)) {
            return var2[0];
        }
        Player var17 = Players.getNearest(player -> {
            int n2;
            if (M.var5(player, Players.getLocal()) && M.var11(this.b(player.getAnimation()) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if ((0x26 ^ 0x2C ^ (0x28 ^ 0x26)) == ((0x7B ^ 0x39 ^ (0x77 ^ 5)) & (35 + 58 - 78 + 116 ^ 120 + 34 - 91 + 116 ^ -1))) {
                    return ((18 + 99 - 107 + 129 ^ 6 + 17 - -3 + 172) & (60 + 118 - 124 + 167 ^ 127 + 142 - 130 + 5 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (M.var18(var17)) {
            return var2[0];
        }
        Worlds.hopTo((World)Worlds.getRandom(world -> {
            int n2;
            if (M.var11(world.isNormal() ? 1 : 0) && M.var11(world.isMembers() ? 1 : 0) && M.var15(world.getId(), Worlds.getCurrentId())) {
                n2 = var2[1];
                0;
                
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }));
        this.sleep(var2[2]);
        return var2[1];
    }

    private static void var3() {
        var2 = new int[4];
        M.var2[0] = (18 + 66 - 61 + 112 ^ 95 + 144 - 74 + 2) & (82 + 109 - 146 + 140 ^ 55 + 131 - 38 + 5 ^ -1);
        M.var2[1] = 1;
        M.var2[2] = 9 ^ 0x49 ^ (0x4D ^ 9);
        M.var2[3] = 2;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new String[var2[1]];
        M.var1[M.var2[0]] = "MINING_";
    }
}

