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
        void var3;
        void var4;
        WorldPoint worldPoint = Movement.getDestination();
        if (!p.var5(worldPoint) || p.var6(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldArea var7 = var4.getWorldLocation().toWorldArea();
        if (!p.var6(var7.contains((WorldPoint)var3) ? 1 : 0) || p.var8(var7.isInMeleeDistance((WorldPoint)var3) ? 1 : 0)) {
            bl = var1[3];
            0;
            if (-2 > 0) {
                return ((0x8C ^ 0x95) & ~(0xA1 ^ 0xB8)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static void var9() {
        var1 = new int[13];
        p.var1[0] = (0x33 ^ 2) & ~(0x91 ^ 0xA0);
        p.var1[1] = -1;
        p.var1[2] = 0x44 ^ 0x41;
        p.var1[3] = 1;
        p.var1[4] = 0xFFFFBE7C & 0xEFDB;
        p.var1[5] = 0x82 ^ 0x96;
        p.var1[6] = -(0xFFFFD479 & 0x7BAF) & (0xFFFFFEFF & 0xFF7F);
        p.var1[7] = 0xB4 ^ 0xAD;
        p.var1[8] = 2;
        p.var1[9] = 3;
        p.var1[10] = -(0xFFFFCDCF & 0x7E71) & (0xFFFFCF7F & 0x7FFB);
        p.var1[11] = 0xFFFFEBC5 & 0x177A;
        p.var1[12] = 0xE8 ^ 0xA2 ^ (0xF7 ^ 0xB9);
    }

    private static boolean var10(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Inject
    public ControllingTemperatureTask(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.af = squireGiantsFoundry;
        this.am = a2;
    }

    static {
        p.var9();
        p.var17();
        ag = var1[5];
        ak = var1[10];
        ah = var1[6];
        ai = var1[4];
        al = var1[7];
        aj = var1[11];
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (p.var27(var26, var25)) {
            char var28 = var24[var26];
            var21.append((char)(var28 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x14 ^ 0x11) != 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public boolean run() {
        boolean bl;
        p var29;
        if (p.var8(this.af.c() ? 1 : 0)) {
            return var1[0];
        }
        if (p.var6(var29.am.f() ? 1 : 0)) {
            return var1[0];
        }
        if (p.var30(var29.am.m(), var1[1])) {
            return var1[0];
        }
        if (p.var31(var29.an) && p.var8(var29.am.n() ? 1 : 0)) {
            return var1[0];
        }
        int var32 = var29.am.m();
        int var33 = var29.am.l();
        if (p.var5(var29.an) && p.var10(Math.abs(var32 - var33), var1[2]) && p.var8(var29.am.n() ? 1 : 0)) {
            var29.an = null;
            var29.ao = var1[0];
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return var1[3];
        }
        if (p.var5(var29.an) && p.var8(var29.a(var29.an) ? 1 : 0)) {
            return var1[3];
        }
        int var34 = var1[0];
        if (p.var27(var33, var32)) {
            var34 = var29.b(var33, var32) ? 1 : 0;
            0;
            if (2 > 2) {
                return ((0x2E ^ 0x72) & ~(0x71 ^ 0x2D)) != 0;
            }
        } else {
            bl = var29.a(var33, var32);
        }
        return bl;
    }

    private static boolean var35(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3) {
        int n4;
        String string;
        void var36;
        int n5;
        void var37;
        p var38;
        int n6 = n2 - n3;
        int[] nArray = new int[var1[3]];
        nArray[p.var1[0]] = var1[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.var31(tileObject)) {
            return var1[0];
        }
        int n7 = var38.ao;
        if (p.var39((int)var37, var1[5])) {
            n5 = var1[3];
            0;
            if (((147 + 154 - 215 + 139 ^ 3 + 130 - 118 + 176) & (0x7E ^ 0x5D ^ (0x67 ^ 0x1A) ^ -1)) > 0) {
                return ((0xA ^ 0x5A ^ (0x1D ^ 0x57)) & (104 + 157 - 208 + 116 ^ 22 + 18 - -75 + 64 ^ -1)) != 0;
            }
        } else {
            n5 = var1[0];
        }
        if (p.var30(n7, n5) && p.var35(var38.an, var36)) {
            return var1[3];
        }
        if (p.var39((int)var37, var1[5])) {
            string = var2[var1[0]];
            0;
            if null != null {
                return ((0x4A ^ 0x47 ^ (4 ^ 0x15)) & (0xD4 ^ 0xBF ^ (0xB7 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            string = var2[var1[3]];
        }
        var36.interact(string);
        var38.an = var36;
        if (p.var39((int)var37, var1[5])) {
            n4 = var1[3];
            0;
            if (3 != 3) {
                return ((0x4C ^ 0x79 ^ (0x48 ^ 0x27)) & (124 + 233 - 146 + 34 ^ 57 + 160 - 117 + 75 ^ -1)) != 0;
            }
        } else {
            n4 = var1[0];
        }
        var38.ao = n4;
        return var1[3];
    }

    private static boolean var27(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(int n2, int n3) {
        String string;
        int n4;
        void var40;
        int n5;
        void var41;
        p var42;
        int n6 = n3 - n2;
        int[] nArray = new int[var1[3]];
        nArray[p.var1[0]] = var1[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.var31(tileObject)) {
            return var1[0];
        }
        int n7 = var42.ao;
        if (p.var39((int)var41, var1[7])) {
            n5 = var1[3];
            0;
            if (2 <= 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n5 = var1[0];
        }
        if (p.var30(n7, n5) && p.var35(var42.an, var40)) {
            return var1[3];
        }
        if (p.var39((int)var41, var1[7])) {
            n4 = var1[3];
            0;
            if (((0xB2 ^ 0xAA) & ~(0xAE ^ 0xB6)) != ((0x74 ^ 0x34) & ~(0x61 ^ 0x21))) {
                return ((0x53 ^ 0x57) & ~(1 ^ 5)) != 0;
            }
        } else {
            var42.ao = var1[0];
            n4 = var42.ao;
        }
        if (p.var39((int)var41, var1[7])) {
            string = var2[var1[8]];
            0;
            if null != null {
                return ((189 + 130 - 294 + 219 ^ 64 + 83 - 66 + 67) & (0x5A ^ 0x52 ^ (0xFD ^ 0x95) ^ -1)) != 0;
            }
        } else {
            string = var2[var1[9]];
        }
        var40.interact(string);
        this.an = tileObject;
        return var1[3];
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static void var17() {
        var2 = new String[var1[12]];
        p.var2[p.var1[0]] = "Quench-preform";
        p.var2[p.var1[3]] = "Cool-preform";
        p.var2[p.var1[8]] = "Dunk-preform";
        p.var2[p.var1[9]] = "Heat-preform";
    }

    private static boolean var31(Object object) {
        return object == null;
    }

    private static boolean var39(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var30(int n2, int n3) {
        return n2 == n3;
    }
}

