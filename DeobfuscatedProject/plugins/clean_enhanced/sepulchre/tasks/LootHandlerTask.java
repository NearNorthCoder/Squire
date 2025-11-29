/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum2;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Loot Handler", priority=50, blocking=true)
public class LootHandlerTask
extends Task {
    private final  SquireSepulchreConfig av;
    private  Player ai;
    private final  d aw;
    private final  SquireSepulchre au;
    
    private  J aq;

    public boolean run() {
        int n2 = this.au.c();
        Player player = Players.getLocal();
        System.out.println("Time: " + n2);
        if (R.var2(player)) {
            return var1[0];
        }
        t[] var3 = t.values();
        int var4 = var3.length;
        int var5 = var1[0];
        while (R.var6(var5, var4)) {
            R var7;
            t var8 = var3[var5];
            if (R.var9(var8.a(var7.aw, var7.au) ? 1 : 0)) {
                System.out.println(var8.name());
                return var1[1];
            }
            ++var5;
            0;
            if (2 != 0) continue;
            return ((0x73 ^ 0x40 ^ (0xB3 ^ 0x8B)) & (0x1A ^ 0x72 ^ (0xA ^ 0x69) ^ -1)) != 0;
        }
        return var1[0];
    }

    static {
        R.var10();
    }

    private static void var10() {
        var1 = new int[2];
        R.var1[0] = (126 + 4 - 18 + 119 ^ 34 + 16 - -3 + 145) & (3 ^ (0x82 ^ 0xA0) ^ -1);
        R.var1[1] = 1;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.av = squireSepulchreConfig;
        this.au = squireSepulchre;
        this.aw = d2;
    }

    private static boolean var2(Object object) {
        return object == null;
    }
}

