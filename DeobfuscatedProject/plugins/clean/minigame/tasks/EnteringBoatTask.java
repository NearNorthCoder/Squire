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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

    private static boolean lIIlllllllIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllllllIllII(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(c c2) {
        void var2_2;
        void var1;
        if (g.lIIlllllllIlIll((Object)c2)) {
            return lIIIlIlIIlIlI[0];
        }
        int[] nArray = new int[lIIIlIlIIlIlI[1]];
        nArray[g.lIIIlIlIIlIlI[0]] = var1.l();
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (g.lIIlllllllIlIll(var2)) {
            return lIIIlIlIIlIlI[0];
        }
        var2_2.interact(lIIIlIlIIlIIl[lIIIlIlIIlIlI[0]]);
        this.r = lIIIlIlIIlIlI[1];
        a.l = this.q.h();
        return lIIIlIlIIlIlI[1];
    }

    private static void lIIlllllllIIlll() {
        lIIIlIlIIlIIl = new String[lIIIlIlIIlIlI[1]];
        g.lIIIlIlIIlIIl[g.lIIIlIlIIlIlI[0]] = "Cross";
    }

    static {
        g.lIIlllllllIlIII();
        g.lIIlllllllIIlll();
    }

        return String.valueOf(var3);
    }

    public boolean run() {
        if (g.lIIlllllllIlIIl(this.t() ? 1 : 0)) {
            return lIIIlIlIIlIlI[0];
        }
        return this.a(this.q.EnteringBoatTask());
    }

    private static boolean lIIlllllllIllIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public EnteringBoatTask(a a2) {
        this.q = a2;
    }

    private static boolean lIIlllllllIlIIl(int n) {
        return n == 0;
    }

    private boolean t() {
        int n;
        if (g.lIIlllllllIlIIl(this.q.f() ? 1 : 0) && g.lIIlllllllIlIlI(Movement.shouldWalk() ? 1 : 0) && g.lIIlllllllIlIlI(this.u() ? 1 : 0) && g.lIIlllllllIlIIl(this.q.e() ? 1 : 0)) {
            n = lIIIlIlIIlIlI[1];

            if ((0x64 ^ 0x61) == 0) {
                return false;
            }
        } else {
            n = lIIIlIlIIlIlI[0];
        }
        return n != 0;
    }

    private boolean u() {
        if (g.lIIlllllllIllII(this.r, lIIIlIlIIlIlI[1])) {
            this.r -= lIIIlIlIIlIlI[1];
            return lIIIlIlIIlIlI[0];
        }
        return lIIIlIlIIlIlI[1];
    }

    private static boolean lIIlllllllIlIlI(int n) {
        return n != 0;
    }
}

