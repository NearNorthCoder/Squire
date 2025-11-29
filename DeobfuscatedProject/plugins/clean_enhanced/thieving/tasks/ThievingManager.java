/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.LuringNewTargetTask;

class ThievingManager
implements Runnable {
    
    final  o X;
    
    final  TileObject W;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    ThievingManager(o o2, TileObject tileObject) {
        this.X = o2;
        this.W = tileObject;
    }

    static {
        p.var4();
        p.var5();
    }

    private static void var5() {
        var2 = new String[var1[2]];
        p.var2[p.var1[0]] = "Open";
        p.var2[p.var1[1]] = "Open";
    }

    private static void var4() {
        var1 = new int[4];
        p.var1[0] = (0xC0 ^ 0xBA ^ (0x42 ^ 0x6D)) & (0x2F ^ 0x20 ^ (0x33 ^ 0x69) ^ -1);
        p.var1[1] = 1;
        p.var1[2] = 2;
        p.var1[3] = 0x66 ^ 0x4D ^ (0x30 ^ 0x13);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Override
    public void run() {
        if (p.var6(this.W.hasAction(var2[var1[0]]::equals) ? 1 : 0)) {
            this.W.interact(var2[var1[1]]);
            return;
        }
        Movement.walkTo((WorldPoint)this.W.getWorldLocation().dy(var1[1]));
        0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (p.var3(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

