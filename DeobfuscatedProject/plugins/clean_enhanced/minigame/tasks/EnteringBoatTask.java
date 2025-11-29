/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigame.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigame.tasks.AHelper;
import gg.squire.minigame.tasks.GameEnum;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering Boat")
public class EnteringBoatTask
extends Task {
    
    private final  a q;
    private  int r;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(c c2) {
        void var2_2;
        void var5;
        if (g.var3((Object)c2)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[g.var2[0]] = var5.l();
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        if (g.var3(var6)) {
            return var2[0];
        }
        var2_2.interact(var1[var2[0]]);
        this.r = var2[1];
        a.l = this.q.h();
        return var2[1];
    }

    private static void var7() {
        var1 = new String[var2[1]];
        g.var1[g.var2[0]] = "Cross";
    }

    static {
        g.var8();
        g.var7();
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[0];
        while (g.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0x10 ^ 0x1F ^ (0x1E ^ 0x14)) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean run() {
        if (g.var20(this.t() ? 1 : 0)) {
            return var2[0];
        }
        return this.a(this.q.EnteringBoatTask());
    }

    private static boolean var18(int n, int n2) {
        return n < n2;
    }

    @Inject
    public EnteringBoatTask(a a2) {
        this.q = a2;
    }

    private static boolean var20(int n) {
        return n == 0;
    }

    private static void var8() {
        var2 = new int[2];
        g.var2[0] = (0xF7 ^ 0x95) & ~(0xE4 ^ 0x86);
        g.var2[1] = 1;
    }

    private boolean t() {
        int n;
        if (g.var20(this.q.f() ? 1 : 0) && g.var21(Movement.shouldWalk() ? 1 : 0) && g.var21(this.u() ? 1 : 0) && g.var20(this.q.e() ? 1 : 0)) {
            n = var2[1];
            0;
            if ((0x64 ^ 0x61) == 0) {
                return ((0xFB ^ 0xBD) & ~(0x23 ^ 0x65)) != 0;
            }
        } else {
            n = var2[0];
        }
        return n != 0;
    }

    private boolean u() {
        if (g.var4(this.r, var2[1])) {
            this.r -= var2[1];
            return var2[0];
        }
        return var2[1];
    }

    private static boolean var21(int n) {
        return n != 0;
    }
}

