/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Claim chest")
public class ClaimChestTask
extends Task {
    
    final  WorldArea K;
    final  WorldArea J;
    
    final  WorldPoint L;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[4];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[4];
        while (d.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        TileObject var14;
        d var15;
        if (!d.var16(Vars.getBit((int)var2[11]), var2[12]) || !d.var16(Vars.getBit((int)var2[13]), var2[12]) || d.var17(Vars.getBit((int)var2[14]), var2[12])) {
            return var2[4];
        }
        if (d.var18(var15.J.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var14 = TileObjects.getNearest(tileObject -> {
                int n;
                if (d.var18(tileObject.getName().contains(var1[var2[24]]) ? 1 : 0) && d.var19(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[17])) {
                    n = var2[12];
                    0;
                    if (-(63 + 46 - 14 + 47 ^ 109 + 130 - 106 + 6) >= 0) {
                        return ((0x54 ^ 0x40 ^ (0x3F ^ 0x12)) & (63 + 109 - 80 + 69 ^ 110 + 21 - -4 + 17 ^ -1)) != 0;
                    }
                } else {
                    n = var2[4];
                }
                return n != 0;
            });
            if (d.var20(var14) && d.var12(Movement.getRunEnergy(), var2[15])) {
                SquireMoonsOfPeril.g = var1[var2[4]];
                var14.interact(var1[var2[12]]);
                return var2[12];
            }
            if (d.var21(Players.getLocal().getWorldLocation().distanceTo(var15.L), var2[16]) && (!d.var12(Movement.getRunEnergy(), var2[15]) || !d.var20(var14) || d.var20(var14) && d.var21(Players.getLocal().getWorldLocation().distanceTo(var14.getWorldLocation()), var2[17]))) {
                SquireMoonsOfPeril.g = var1[var2[18]];
                Movement.walkTo((WorldPoint)var15.L);
                0;
                return var2[12];
            }
            if (d.var19(Players.getLocal().getWorldLocation().distanceTo(var15.L), var2[16])) {
                String[] stringArray = new String[var2[12]];
                stringArray[d.var2[4]] = var1[var2[19]];
                TileObject var22 = TileObjects.getNearest((String[])stringArray);
                if (d.var20(var22)) {
                    SquireMoonsOfPeril.g = var1[var2[20]];
                    var22.interact(var1[var2[17]]);
                    return var2[12];
                }
            }
        }
        if (d.var18(var15.K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[var2[12]];
            stringArray[d.var2[4]] = var1[var2[21]];
            var14 = TileObjects.getNearest((String[])stringArray);
            if (d.var20(var14)) {
                SquireMoonsOfPeril.g = var1[var2[22]];
                var14.interact(var1[var2[23]]);
                return var2[12];
            }
        }
        return var2[4];
    }

    private static boolean var19(int n, int n2) {
        return n <= n2;
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    public ClaimChestTask() {
        this.J = new WorldArea(var2[0], var2[1], var2[2], var2[3], var2[4]);
        this.K = new WorldArea(var2[5], var2[6], var2[7], var2[8], var2[4]);
        this.L = new WorldPoint(var2[9], var2[10], var2[4]);
    }

    static {
        d.var23();
        d.var24();
    }

    private static void var24() {
        var1 = new String[var2[16]];
        d.var1[d.var2[4]] = "Drinking tea";
        d.var1[d.var2[12]] = "Make-cuppa";
        d.var1[d.var2[18]] = "Nav to door";
        d.var1[d.var2[19]] = "Entrance";
        d.var1[d.var2[20]] = "Entering door";
        d.var1[d.var2[17]] = "Pass-through";
        d.var1[d.var2[21]] = "Lunar Chest";
        d.var1[d.var2[22]] = "Claiming chest";
        d.var1[d.var2[23]] = "Claim";
        d.var1[d.var2[24]] = "Cooking stove";
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n, int n2) {
        return n > n2;
    }

    private static void var23() {
        var2 = new int[25];
        d.var2[0] = -(139 + 13 - 11 + 53) & (0xFFFFA7FF & 0x5DFF);
        d.var2[1] = 0xFFFFE7BF & 0x3D7D;
        d.var2[2] = 0x57 ^ 0x10 ^ (0x42 ^ 0x30);
        d.var2[3] = 0x5E ^ 0x4D ^ (0xDF ^ 0x8E);
        d.var2[4] = (95 + 29 - 65 + 142 ^ 90 + 114 - 127 + 70) & (0x4B ^ 0x47 ^ (0xDD ^ 0x8B) ^ -1);
        d.var2[5] = -(0xFFFFE31D & 0x7CEB) & (0xFFFFF7FB & 0x6DDF);
        d.var2[6] = 0xFFFFAFD9 & 0x757F;
        d.var2[7] = 0x48 ^ 0x63;
        d.var2[8] = 0x27 ^ 0x54 ^ (0x7E ^ 0x27);
        d.var2[9] = -(0xFFFFAAFD & 0x75B7) & (0xFFFFEFFF & 0x35FF);
        d.var2[10] = 0xFFFFEFD6 & 0x356D;
        d.var2[11] = 0xFFFFFFEB & 0x2696;
        d.var2[12] = 1;
        d.var2[13] = -(0xFFFFFBFD & 0x5D1F) & (0xFFFFFFBF & 0x7FDF);
        d.var2[14] = 0xFFFFA6AF & 0x7FD4;
        d.var2[15] = 0x5D ^ 0x4B ^ (0xD9 ^ 0x89);
        d.var2[16] = 0x38 ^ 0x32;
        d.var2[17] = 0x63 ^ 0x1A ^ (0x28 ^ 0x54);
        d.var2[18] = 2;
        d.var2[19] = 3;
        d.var2[20] = 0x8C ^ 0x88;
        d.var2[21] = 3 ^ (0x67 ^ 0x62);
        d.var2[22] = 0x6F ^ 0x12 ^ (0x1F ^ 0x65);
        d.var2[23] = 0xA8 ^ 0xA0;
        d.var2[24] = 79 + 49 - 72 + 91 ^ 21 + 9 - 0 + 124;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n, int n2) {
        return n != n2;
    }

    private static boolean var16(int n, int n2) {
        return n == n2;
    }

    private static boolean var18(int n) {
        return n != 0;
    }

    private static boolean var12(int n, int n2) {
        return n < n2;
    }
}

