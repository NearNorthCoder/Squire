/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Controlling Temperature", priority=2147483297, blocking=true)
public class ControllingTemperatureTask
extends Task {
    
    public static final  int ag;
    private static final  int ak;
    
    private final  SquireGiantsFoundry af;
    private static final  int al;
    private static final  int ah;
    private static final  int ai;
    private static final  int aj;
    private  boolean ao;
    private  TileObject an;
    private final  a am;

    /*
     * WARNING - void declaration
     */
    protected boolean a(TileObject tileObject) {
        boolean bl;
        void var1;
        void var2;
        WorldPoint worldPoint = Movement.getDestination();
        if (!p.lIIIIIlllIIllIl(worldPoint) || p.lIIIIIlllIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        WorldArea var3 = var2.getWorldLocation().toWorldArea();
        if (!p.lIIIIIlllIIlIlI(var3.contains((WorldPoint)var1) ? 1 : 0) || p.lIIIIIlllIIlIIl(var3.isInMeleeDistance((WorldPoint)var1) ? 1 : 0)) {
            bl = llIlIllIIlIl[3];

        } else {
            bl = llIlIllIIlIl[0];
        }
        return bl;
    }

    private static boolean lIIIIIlllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllIIllIl(Object object) {
        return object != null;
    }

    @Inject
    public ControllingTemperatureTask(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.af = squireGiantsFoundry;
        this.am = a2;
    }

    static {
        p.lIIIIIlllIIlIII();
        p.lIIIIIlllIIIlll();
        ag = llIlIllIIlIl[5];
        ak = llIlIllIIlIl[10];
        ah = llIlIllIIlIl[6];
        ai = llIlIllIIlIl[4];
        al = llIlIllIIlIl[7];
        aj = llIlIllIIlIl[11];
    }

        return String.valueOf(var4);
    }

    public boolean run() {
        boolean bl;
        p var5;
        if (p.lIIIIIlllIIlIIl(this.af.c() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIlI(var5.am.f() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(var5.am.m(), llIlIllIIlIl[1])) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIllII(var5.an) && p.lIIIIIlllIIlIIl(var5.am.n() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        int var6 = var5.am.m();
        int var7 = var5.am.l();
        if (p.lIIIIIlllIIllIl(var5.an) && p.lIIIIIlllIIlllI(Math.abs(var6 - var7), llIlIllIIlIl[2]) && p.lIIIIIlllIIlIIl(var5.am.n() ? 1 : 0)) {
            var5.an = null;
            var5.ao = llIlIllIIlIl[0];
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIIllIl(var5.an) && p.lIIIIIlllIIlIIl(var5.a(var5.an) ? 1 : 0)) {
            return llIlIllIIlIl[3];
        }
        int var8 = llIlIllIIlIl[0];
        if (p.lIIIIIlllIIllll(var7, var6)) {
            var8 = var5.b(var7, var6) ? 1 : 0;

            if (2 > 2) {
                return false;
            }
        } else {
            bl = var5.a(var7, var6);
        }
        return bl;
    }

    private static boolean lIIIIIlllIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3) {
        int n4;
        String string;
        void var9;
        int n5;
        void var10;
        p var11;
        int n6 = n2 - n3;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = var11.ao;
        if (p.lIIIIIlllIlIIII((int)var10, llIlIllIIlIl[5])) {
            n5 = llIlIllIIlIl[3];

            if (((147 + 154 - 215 + 139 ^ 3 + 130 - 118 + 176) & (0x7E ^ 0x5D ^ (0x67 ^ 0x1A) ^ -1)) > 0) {
                return ((0xA ^ 0x5A ^ (0x1D ^ 0x57)) & (104 + 157 - 208 + 116 ^ 22 + 18 - -75 + 64 ^ -1)) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(var11.an, var9)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)var10, llIlIllIIlIl[5])) {
            string = llIlIllIIlII[llIlIllIIlIl[0]];

            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[3]];
        }
        var9.interact(string);
        var11.an = var9;
        if (p.lIIIIIlllIlIIII((int)var10, llIlIllIIlIl[5])) {
            n4 = llIlIllIIlIl[3];

            if (3 != 3) {
                return ((0x4C ^ 0x79 ^ (0x48 ^ 0x27)) & (124 + 233 - 146 + 34 ^ 57 + 160 - 117 + 75 ^ -1)) != 0;
            }
        } else {
            n4 = llIlIllIIlIl[0];
        }
        var11.ao = n4;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(int n2, int n3) {
        String string;
        int n4;
        void var12;
        int n5;
        void var13;
        p var14;
        int n6 = n3 - n2;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = var14.ao;
        if (p.lIIIIIlllIlIIII((int)var13, llIlIllIIlIl[7])) {
            n5 = llIlIllIIlIl[3];

            if (2 <= 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(var14.an, var12)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)var13, llIlIllIIlIl[7])) {
            n4 = llIlIllIIlIl[3];

            if (((0xB2 ^ 0xAA) & ~(0xAE ^ 0xB6)) != ((0x74 ^ 0x34) & ~(0x61 ^ 0x21))) {
                return false;
            }
        } else {
            var14.ao = llIlIllIIlIl[0];
            n4 = var14.ao ? 1 : 0;
        }
        if (p.lIIIIIlllIlIIII((int)var13, llIlIllIIlIl[7])) {
            string = llIlIllIIlII[llIlIllIIlIl[8]];

            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[9]];
        }
        var12.interact(string);
        this.an = tileObject;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlllIIIlll() {
        llIlIllIIlII = new String[llIlIllIIlIl[12]];
        p.llIlIllIIlII[p.llIlIllIIlIl[0]] = "Quench-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[3]] = "Cool-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[8]] = "Dunk-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[9]] = "Heat-preform";
    }

    private static boolean lIIIIIlllIIllII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

