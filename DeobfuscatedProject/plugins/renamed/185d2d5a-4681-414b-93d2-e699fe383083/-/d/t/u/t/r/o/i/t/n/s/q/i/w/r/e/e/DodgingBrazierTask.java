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
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.AEnum;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
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

/* TASK: Dodging Brazier -> DodgingbrazierTask */
@TaskDesc(name="Dodging Brazier", priority=2147482647, blocking=true)
public class DodgingBrazierTask
extends Task {
    private static /* synthetic */ String[] lIlIllllllIII;
    @Inject
    protected /* synthetic */ b b;
    private static /* synthetic */ int[] lIlIllllllIIl;
    public static final /* synthetic */ int N;

    private static boolean llIIIIllIllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIllIllIlll() {
        lIlIllllllIIl = new int[5];
        i.lIlIllllllIIl[0] = (0xD2 ^ 0xAF ^ (0x5B ^ 0x19)) & (0x95 ^ 0xB7 ^ (0x24 ^ 0x39) ^ -1);
        i.lIlIllllllIIl[1] = 3;
        i.lIlIllllllIIl[2] = -1;
        i.lIlIllllllIIl[3] = 1;
        i.lIlIllllllIIl[4] = 0xFFFFEFE3 & 0x785E;
    }

    private static void llIIIIllIllIllI() {
        lIlIllllllIII = new String[lIlIllllllIIl[3]];
        i.lIlIllllllIII[i.lIlIllllllIIl[0]] = i."brazier";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        i var5;
        if (!i.llIIIIllIlllIII(this.b.i() ? 1 : 0) || !i.llIIIIllIlllIIl(this.b.u() ? 1 : 0) || i.llIIIIllIlllIII(this.b.j() ? 1 : 0)) {
            return lIlIllllllIIl[0];
        }
        Player var16 = Players.getLocal();
        a var12 = var5.b.q();
        WorldPoint var4 = var12.b();
        TileObject var6 = TileObjects.getNearest((WorldPoint)var4, tileObject -> {
            int n2;
            if (i.llIIIIllIllllIl(tileObject.getName()) && i.llIIIIllIlllIII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllllIII[lIlIllllllIIl[0]]) ? 1 : 0)) {
                n2 = lIlIllllllIIl[3];
                0;
                if (-3 >= 0) {
                    return false;
                }
            } else {
                n2 = lIlIllllllIIl[0];
            }
            return n2 != 0;
        });
        if (i.llIIIIllIlllIlI(var6)) {
            return lIlIllllllIIl[0];
        }
        TileObject var3 = TileObjects.getNearest((WorldPoint)var4, tileObject -> {
            int n2;
            if (i.llIIIIllIllllII(tileObject.getId(), lIlIllllllIIl[4]) && i.llIIIIllIllllII(tileObject.getWorldX(), var4.getWorldX())) {
                n2 = lIlIllllllIIl[3];
                0;
                
                }
            } else {
                n2 = lIlIllllllIIl[0];
            }
            return n2 != 0;
        });
        if (i.llIIIIllIlllIlI(var3)) {
            return lIlIllllllIIl[0];
        }
        if (!i.llIIIIllIlllIll(var3.distanceTo(var4), lIlIllllllIIl[1]) || i.llIIIIllIlllIll(var3.getWorldY(), var4.getWorldY())) {
            return lIlIllllllIIl[0];
        }
        WorldPoint var8 = var4.dy(lIlIllllllIIl[2]);
        if (i.llIIIIllIlllIII(var16.getWorldLocation().equals((Object)var8) ? 1 : 0)) {
            return lIlIllllllIIl[3];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return lIlIllllllIIl[3];
    }

    private static String llIIIIllIllIlIl(String var14, String var13) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var13.toCharArray();
        int var15 = lIlIllllllIIl[0];
        char[] var2 = var14.toCharArray();
        int var1 = var2.length;
        int var7 = lIlIllllllIIl[0];
        while (i.llIIIIllIlllllI(var7, var1)) {
            char var11 = var2[var7];
            var10.append((char)(var11 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var7;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var10);
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

