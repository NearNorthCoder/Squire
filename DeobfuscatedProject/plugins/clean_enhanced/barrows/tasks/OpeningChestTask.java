/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Opening chest", priority=220, blocking=true)
public class OpeningChestTask
extends Task {
    private final  SquireBarrows an;
    private final  SquireBarrowsConfig ao;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.var3(this.an.h() ? 1 : 0)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[y.var1[0]] = var2[var1[0]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (y.var5(var4)) {
            return var1[0];
        }
        String[] stringArray2 = new String[var1[1]];
        stringArray2[y.var1[0]] = var2[var1[1]];
        if (!y.var6(var4.hasAction(stringArray2) ? 1 : 0) || !y.var6(Reachable.isInteractable((Locatable)var4) ? 1 : 0) || y.var7(var4.distanceTo(Players.getLocal().getWorldLocation()), var1[2])) {
            return var1[0];
        }
        var1_1.interact(var2[var1[3]]);
        return var1[1];
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (y.var8(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0x96 ^ 0x92) != 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    static {
        y.var19();
        y.var20();
    }

    private static void var19() {
        var1 = new int[5];
        y.var1[0] = (0x55 ^ 9) & ~(0x2C ^ 0x70);
        y.var1[1] = 1;
        y.var1[2] = 0x28 ^ 0x2E;
        y.var1[3] = 2;
        y.var1[4] = 3;
    }

    private static void var20() {
        var2 = new String[var1[4]];
        y.var2[y.var1[0]] = "Chest";
        y.var2[y.var1[1]] = "Open";
        y.var2[y.var1[3]] = "Open";
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public OpeningChestTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.an = squireBarrows;
        this.ao = squireBarrowsConfig;
    }
}

