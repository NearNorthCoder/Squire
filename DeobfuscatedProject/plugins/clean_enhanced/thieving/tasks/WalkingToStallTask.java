/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;

@TaskDesc(name="Walking to stall")
public class WalkingToStallTask
extends Task {
    
    private final  SquireThievingConfig aM;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (K.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new int[2];
        K.var1[0] = (0x8B ^ 0xC0) & ~(0x51 ^ 0x1A);
        K.var1[1] = 1;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    static {
        K.var14();
        K.var16();
    }

    @Inject
    public WalkingToStallTask(SquireThievingConfig squireThievingConfig) {
        this.aM = squireThievingConfig;
    }

    private static void var16() {
        var2 = new String[var1[1]];
        K.var2[K.var1[0]] = "Walking to stall";
    }

    public boolean run() {
        K var17;
        if (K.var18((Object)this.aM.method(), (Object)b.STALLS)) {
            return var1[0];
        }
        if (K.var15(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        Player var19 = Players.getLocal();
        if (K.var20(var19)) {
            return var1[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[var1[1]];
        worldAreaArray[K.var1[0]] = var17.aM.stallTarget().p();
        if (K.var21(var19.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            Movement.walkTo((WorldPoint)var17.aM.stallTarget().z());
            0;
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static boolean var18(Object object, Object object2) {
        return object != object2;
    }
}

