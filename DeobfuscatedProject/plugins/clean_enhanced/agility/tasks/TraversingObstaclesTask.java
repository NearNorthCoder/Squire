/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.agility.tasks.GameEnum;
import gg.squire.agility.tasks.CHelper;

@TaskDesc(name="Traversing obstacles")
public class TraversingObstaclesTask
extends Task {
    private static final  WorldPoint z;
    private final  AgilityConfig B;
    
    private final  SquireAgilityPlugin A;

    private static void var3() {
        var2 = new int[16];
        j.var2[0] = (0x25 ^ 0xE) & ~(0xBD ^ 0x96);
        j.var2[1] = 0x5C ^ 0x56;
        j.var2[2] = -1;
        j.var2[3] = -(0xFFFFABF1 & 0x753F) & (0xFFFFFFF9 & 0x23FF);
        j.var2[4] = 2;
        j.var2[5] = 1;
        j.var2[6] = -(0xFFFFFFAB & 0x7156) & (0xFFFFFBFD & 0x7F63);
        j.var2[7] = -(0xFFFFBF4F & 0x72B2) & (0xFFFFBFE7 & 0x7EF9);
        j.var2[8] = 3;
        j.var2[9] = -(0xFFFFF7BF & 0x7A71) & (0xFFFFFEFB & 0x7FFC);
        j.var2[10] = -(0xFFFFDCFF & 0x2B02) & (0xFFFFDFFF & 0x3FFF);
        j.var2[11] = 89 + 98 - 123 + 78 ^ 57 + 18 - 26 + 86;
        j.var2[12] = 0xFFFFAA5F & 0x5FFE;
        j.var2[13] = -(0xFFFFBAED & 0x771B) & (0xFFFFFEEB & 0x3FFF);
        j.var2[14] = 0x75 ^ 0x71;
        j.var2[15] = 0xA2 ^ 0xAA;
    }

    static {
        j.var3();
        j.var4();
        z = new WorldPoint(var2[12], var2[13], var2[8]);
    }

    private static boolean var5(int n, int n2) {
        return n >= n2;
    }

    private static boolean var6(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var6_6;
        b var7;
        b b2;
        j var8;
        void var9;
        Player player = Players.getLocal();
        if (j.var10(player)) {
            return var2[0];
        }
        if (j.var6(Movement.isRunEnabled() ? 1 : 0) && j.var11(Movement.getRunEnergy(), var2[1])) {
            Movement.toggleRun();
        }
        if (j.var12(var9.getAnimation(), var2[2]) && j.var12(var9.getAnimation(), var2[3])) {
            return var2[0];
        }
        WorldPoint var13 = var9.getWorldLocation();
        b var14 = var8.A.a();
        if (j.var10((Object)var14)) {
            if (j.var6(var13.getPlane())) {
                b b3;
                SquireAgilityPlugin squireAgilityPlugin = var8.A;
                if (j.var15(var8.B.progressive() ? 1 : 0)) {
                    b3 = b.TraversingObstaclesTask();
                    0;
                    if (1 > (40 + 1 - -108 + 3 ^ 16 + 83 - 61 + 118)) {
                        return ((0x55 ^ 0x65 ^ (0xB2 ^ 0xA0)) & (134 + 140 - 231 + 118 ^ 3 + 77 - 63 + 114 ^ -1)) != 0;
                    }
                } else {
                    b3 = var8.B.course();
                }
                squireAgilityPlugin.a(b3);
                0;
                if (((0x94 ^ 0x88) & ~(0x69 ^ 0x75)) >= 1) {
                    return ((0x1B ^ 0x59) & ~(0x1F ^ 0x5D)) != 0;
                }
            } else {
                var8.A.a(b.b(var13.getRegionID()));
            }
        }
        if (j.var15(var8.B.progressive() ? 1 : 0)) {
            b2 = b.TraversingObstaclesTask();
            0;
            if (-1 >= 3) {
                return ((0x57 ^ 0x5F) & ~(0xBD ^ 0xB5)) != 0;
            }
        } else {
            b2 = var8.B.course();
        }
        if (j.var16((Object)(var7 = b2), (Object)var14) && j.var6(var9.getPlane())) {
            Object[] objectArray = new Object[var2[4]];
            objectArray[j.var2[0]] = var14;
            objectArray[j.var2[5]] = var7;
            Log.info((String)var1[var2[0]], (Object[])objectArray);
            var8.A.a(var7);
            return var2[5];
        }
        if (j.var10((Object)var14)) {
            Object[] objectArray = new Object[var2[5]];
            objectArray[j.var2[0]] = var13.getRegionID();
            Log.info((String)var1[var2[5]], (Object[])objectArray);
            return var2[0];
        }
        c var17 = var14.k();
        if (j.var15(Players.getLocal().getWorldLocation().equals((Object)z) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var2[6], var2[7], var2[8]));
            0;
            var8.sleep(var2[8]);
            return var2[0];
        }
        if (j.var15(Reachable.isWalkable((WorldPoint)new WorldPoint(var2[9], var2[10], var2[0])) ? 1 : 0) && j.var6(Static.getClient().getTopLevelWorldView().getPlane())) {
            String[] stringArray = new String[var2[5]];
            stringArray[j.var2[0]] = var1[var2[4]];
            TileObjects.getNearest((String[])stringArray).interact(string -> var2[5]);
            return var2[5];
        }
        if (j.var10(var17)) {
            if (j.var18(var13.getPlane(), var2[8])) {
                return var2[0];
            }
            Object[] objectArray = new Object[var2[5]];
            objectArray[j.var2[0]] = var14;
            Log.info((String)var1[var2[8]], (Object[])objectArray);
            return var2[5];
        }
        TileObject var19 = var17.r();
        if (!j.var20(var19) || j.var5(var19.distanceTo((Locatable)Players.getLocal()), var2[11])) {
            boolean bl;
            if (j.var18(var13.getPlane(), var2[8])) {
                Movement.setDestination((WorldPoint)var17.getWorldLocation());
                return var2[5];
            }
            if (j.var10(var19)) {
                bl = var2[5];
                0;
                if (1 >= 2) {
                    return ((0x46 ^ 0x72) & ~(0xD ^ 0x39)) != 0;
                }
            } else {
                bl = var2[0];
            }
            boolean var21 = bl;
            Movement.walkTo((WorldPoint)var17.getWorldLocation(), (boolean)var21);
            0;
            return var2[5];
        }
        var6_6.interact(var5_5.n());
        return var2[5];
    }

    private static void var4() {
        var1 = new String[var2[14]];
        j.var1[j.var2[0]] = "Switching course from {} to {}";
        j.var1[j.var2[5]] = "No course found for region: {}, and we can't set any other course.";
        j.var1[j.var2[4]] = "Ladder";
        j.var1[j.var2[8]] = "No obstacle found on course: {}";
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    @Inject
    public TraversingObstaclesTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.A = squireAgilityPlugin;
        this.B = agilityConfig;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (j.var31(var30, var29)) {
            char var32 = var28[var30];
            var25.append((char)(var32 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (((0x36 ^ 0x14 ^ (0x49 ^ 0x20)) & (53 + 217 - 39 + 5 ^ 99 + 4 - 58 + 122 ^ -1)) >= ((50 + 86 - 117 + 138 ^ 13 + 148 - 61 + 83) & (134 + 34 - 107 + 86 ^ 143 + 65 - 48 + 25 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var25);
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var15(int n) {
        return n != 0;
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static boolean var31(int n, int n2) {
        return n < n2;
    }

    private static boolean var12(int n, int n2) {
        return n != n2;
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n, int n2) {
        return n == n2;
    }

    private static boolean var11(int n, int n2) {
        return n > n2;
    }
}

