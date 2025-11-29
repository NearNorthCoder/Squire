/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum29;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Finishing Floor", priority=20, blocking=true)
public class FinishingFloorTask
extends Task {
    private  TileObject ap;
    private final  SquireSepulchre ar;
    private final  d at;
    
    private  J aq;
    private final  SquireSepulchreConfig as;
    private  Player ai;

    public boolean run() {
        Player player = Players.getLocal();
        if (Q.var2(player)) {
            return var1[0];
        }
        h[] var3 = h.values();
        int var4 = var3.length;
        int var5 = var1[0];
        while (Q.var6(var5, var4)) {
            h var7 = var3[var5];
            if (Q.var8(var7.J() ? 1 : 0)) {
                Q var9;
                var7.a(var9.ar);
                return var1[1];
            }
            ++var5;
            0;
            if (((73 + 45 - -6 + 30 ^ 68 + 109 - 76 + 59) & (0x75 ^ 0x6F ^ (0x48 ^ 0x68) ^ -1)) == ((0x31 ^ 0x55 ^ (0x7B ^ 0x41)) & (0xD2 ^ 0xA6 ^ (0x31 ^ 0x1B) ^ -1))) continue;
            return ((0x25 ^ 0x3A ^ (0x52 ^ 0x75)) & (69 + 143 - 195 + 160 ^ 80 + 114 - 70 + 13 ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    private static void var10() {
        var1 = new int[2];
        Q.var1[0] = (0x7A ^ 0x6F ^ (0x32 ^ 0x1D)) & (15 + 36 - -40 + 40 ^ 168 + 174 - 252 + 95 ^ -1);
        Q.var1[1] = 1;
    }

    static {
        Q.var10();
    }

    @Inject
    public FinishingFloorTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.as = squireSepulchreConfig;
        this.ar = squireSepulchre;
        this.at = d2;
    }
}

