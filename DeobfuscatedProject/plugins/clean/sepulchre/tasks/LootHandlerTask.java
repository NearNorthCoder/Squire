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
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum5;
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
        if (R.lIIIlIIIIIIlIll(player)) {
            return lllIIIIIIlII[0];
        }
        t[] var1 = t.values();
        int var2 = var1.length;
        int var3 = lllIIIIIIlII[0];
        while (R.lIIIlIIIIIIllII(var3, var2)) {
            R var4;
            t var5 = var1[var3];
            if (R.lIIIlIIIIIIllIl(var5.a(var4.aw, var4.au) ? 1 : 0)) {
                System.out.println(var5.name());
                return lllIIIIIIlII[1];
            }
            ++var3;

            if (2 != 0) continue;
            return ((0x73 ^ 0x40 ^ (0xB3 ^ 0x8B)) & (0x1A ^ 0x72 ^ (0xA ^ 0x69) ^ -1)) != 0;
        }
        return lllIIIIIIlII[0];
    }

    static {
        R.lIIIlIIIIIIlIlI();
    }

    private static boolean lIIIlIIIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIIIIllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootHandlerTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.av = squireSepulchreConfig;
        this.au = squireSepulchre;
        this.aw = d2;
    }

    private static boolean lIIIlIIIIIIlIll(Object object) {
        return object == null;
    }
}

