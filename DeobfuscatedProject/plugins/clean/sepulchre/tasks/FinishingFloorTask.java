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
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum37;
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
        if (Q.lIIIlIIIlIIIIll(player)) {
            return lllIIIIlIlll[0];
        }
        h[] var1 = h.values();
        int var2 = var1.length;
        int var3 = lllIIIIlIlll[0];
        while (Q.lIIIlIIIlIIIlII(var3, var2)) {
            h var4 = var1[var3];
            if (Q.lIIIlIIIlIIIlIl(var4.J() ? 1 : 0)) {
                Q var5;
                var4.a(var5.ar);
                return lllIIIIlIlll[1];
            }
            ++var3;

            if (((73 + 45 - -6 + 30 ^ 68 + 109 - 76 + 59) & (0x75 ^ 0x6F ^ (0x48 ^ 0x68) ^ -1)) == ((0x31 ^ 0x55 ^ (0x7B ^ 0x41)) & (0xD2 ^ 0xA6 ^ (0x31 ^ 0x1B) ^ -1))) continue;
            return ((0x25 ^ 0x3A ^ (0x52 ^ 0x75)) & (69 + 143 - 195 + 160 ^ 80 + 114 - 70 + 13 ^ -1)) != 0;
        }
        return lllIIIIlIlll[0];
    }

    private static boolean lIIIlIIIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIIlIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIIIIll(Object object) {
        return object == null;
    }

    static {
        Q.lIIIlIIIlIIIIlI();
    }

    @Inject
    public FinishingFloorTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.as = squireSepulchreConfig;
        this.ar = squireSepulchre;
        this.at = d2;
    }
}

