/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cannon Balls")
public class CannonBallsTask
extends SkillingManager {

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        O.var4();
        O.var5();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[2];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[2];
        while (O.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0x50 ^ 0x4A ^ (0xB9 ^ 0xA7)) != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    @Override
    public int i() {
        return var2[4];
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        if (!O.var3(Players.getLocal().isMoving() ? 1 : 0) || O.var3(Movement.shouldWalk() ? 1 : 0)) {
            return var2[2];
        }
        if (O.var17(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var2[2]);
        }
        if (O.var3(Movement.isRunEnabled() ? 1 : 0) && O.var18(Movement.getRunEnergy(), var2[3])) {
            Movement.toggleRun();
            return var2[2];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[O.var2[2]] = var1[var2[2]];
        TileObject var19 = TileObjects.getNearest((String[])stringArray);
        if (O.var20(var19)) {
            return var2[2];
        }
        if (O.var17(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return var2[1];
        }
        var1_1.interact(var1[var2[1]]);
        return var2[1];
    }

    private static boolean var18(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var5() {
        var1 = new String[var2[5]];
        O.var1[O.var2[2]] = "Furnace";
        O.var1[O.var2[1]] = "Smelt";
    }

    private static void var4() {
        var2 = new int[7];
        O.var2[0] = 0xFFFFA977 & 0x5FB9;
        O.var2[1] = 1;
        O.var2[2] = (0x9A ^ 0xB1 ^ (0x28 ^ 5)) & (11 + 43 - 11 + 96 ^ 0 + 112 - 86 + 115 ^ -1);
        O.var2[3] = 0x76 ^ 0x40 ^ (0x5D ^ 0x20);
        O.var2[4] = 0xE3 ^ 0x85 ^ (0xD ^ 0x6E);
        O.var2[5] = 2;
        O.var2[6] = 0x4B ^ 0x43;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Inject
    public CannonBallsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.CANNON_BALLS);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var2[0], var2[1]);
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var20(Object object) {
        return object == null;
    }
}

