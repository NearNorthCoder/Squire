/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging Brazier", priority=2147482647, blocking=true)
public class DodgingBrazierTask
extends Task {
    
    @Inject
    protected  b b;
    
    public static final  int N;

    private static boolean llIIIIllIllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIllIllIllI() {
        lIlIllllllIII = new String[lIlIllllllIIl[3]];
        i.lIlIllllllIII[i.lIlIllllllIIl[0]] = "brazier";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        i var1;
        if (!i.llIIIIllIlllIII(this.b.DodgingBrazierTask() ? 1 : 0) || !i.llIIIIllIlllIIl(this.b.u() ? 1 : 0) || i.llIIIIllIlllIII(this.b.j() ? 1 : 0)) {
            return lIlIllllllIIl[0];
        }
        Player var2 = Players.getLocal();
        a var3 = var1.b.q();
        WorldPoint var4 = var3.b();
        TileObject var5 = TileObjects.getNearest((WorldPoint)var4, tileObject -> {
            int n2;
            if (i.llIIIIllIllllIl(tileObject.getName()) && i.llIIIIllIlllIII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllllIII[lIlIllllllIIl[0]]) ? 1 : 0)) {
                n2 = lIlIllllllIIl[3];

            } else {
                n2 = lIlIllllllIIl[0];
            }
            return n2 != 0;
        });
        if (i.llIIIIllIlllIlI(var5)) {
            return lIlIllllllIIl[0];
        }
        TileObject var6 = TileObjects.getNearest((WorldPoint)var4, tileObject -> {
            int n2;
            if (i.llIIIIllIllllII(tileObject.getId(), lIlIllllllIIl[4]) && i.llIIIIllIllllII(tileObject.getWorldX(), var4.getWorldX())) {
                n2 = lIlIllllllIIl[3];

                }
            } else {
                n2 = lIlIllllllIIl[0];
            }
            return n2 != 0;
        });
        if (i.llIIIIllIlllIlI(var6)) {
            return lIlIllllllIIl[0];
        }
        if (!i.llIIIIllIlllIll(var6.distanceTo(var4), lIlIllllllIIl[1]) || i.llIIIIllIlllIll(var6.getWorldY(), var4.getWorldY())) {
            return lIlIllllllIIl[0];
        }
        WorldPoint var7 = var4.dy(lIlIllllllIIl[2]);
        if (i.llIIIIllIlllIII(var2.getWorldLocation().equals((Object)var7) ? 1 : 0)) {
            return lIlIllllllIIl[3];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return lIlIllllllIIl[3];
    }

        return String.valueOf(var8);
    }

    private static boolean llIIIIllIlllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIllIlllIII(int n2) {
        return n2 != 0;
    }

    static {
        i.llIIIIllIllIlll();
        i.llIIIIllIllIllI();
        N = lIlIllllllIIl[4];
    }

    private static boolean llIIIIllIlllIlI(Object object) {
        return object == null;
    }
}

