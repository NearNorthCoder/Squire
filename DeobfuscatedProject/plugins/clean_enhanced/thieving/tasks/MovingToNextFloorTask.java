/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Moving to next floor", priority=10)
public class MovingToNextFloorTask
extends ThievingTaskBase {
    
    static final  Set<Integer> A;

    private static void var3() {
        var1 = new int[13];
        g.var1[0] = (0x99 ^ 0x8F ^ (0xA0 ^ 0x98)) & (21 + 99 - 115 + 161 ^ 41 + 37 - 15 + 73 ^ -1);
        g.var1[1] = 1;
        g.var1[2] = 2;
        g.var1[3] = 3;
        g.var1[4] = 0xA4 ^ 0xA0;
        g.var1[5] = 0xE ^ 7 ^ (0x61 ^ 0x6D);
        g.var1[6] = 0xAF ^ 0x9D ^ (0x24 ^ 0x10);
        g.var1[7] = 0x4F ^ 0x4A ^ 2;
        g.var1[8] = 0xCA ^ 0xC2;
        g.var1[9] = 0xFFFFF75F & 0x5BAD;
        g.var1[10] = -(0xFFFFFB52 & 0x24FF) & (0xFFFFF3FF & 0x7F5F);
        g.var1[11] = 0xFFFFFF8F & 0x537F;
        g.var1[12] = 0x7D ^ 0x74;
    }

    private static void var4() {
        var2 = new String[var1[12]];
        g.var2[g.var1[0]] = "Search";
        g.var2[g.var1[1]] = "Quick-leave";
        g.var2[g.var1[2]] = "Pick-lock";
        g.var2[g.var1[3]] = "Tomb Door";
        g.var2[g.var1[4]] = "Pick-lock";
        g.var2[g.var1[5]] = "Tomb Door";
        g.var2[g.var1[6]] = "Quick-leave";
        g.var2[g.var1[7]] = "Grand Gold Chest";
        g.var2[g.var1[8]] = "Search";
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (g.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if ((0x5A ^ 0x69 ^ (0x89 ^ 0xBE)) != -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    @Inject
    protected MovingToNextFloorTask(a a2, Client client) {
        super(a2, client);
    }

    static {
        g.var3();
        g.var4();
        A = ImmutableSet.of((Object)var1[9], (Object)var1[10], (Object)var1[11]);
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    private static boolean var25(int n2) {
        return n2 == 0;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        TileObject var26;
        void var27;
        g var28;
        c c2 = c.f();
        if (g.var6((Object)c2)) {
            return var1[0];
        }
        if (g.var24(var28.D.a((c)var27) ? 1 : 0) && g.var5(var26 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.var24(tileObject.getName().equals(var2[var1[7]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[g.var1[0]] = var2[var1[8]];
                if (g.var24(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0x1A ^ 0x59 ^ (0x17 ^ 1)) & (88 + 69 - 131 + 174 ^ 145 + 2 - 93 + 103 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }))) {
            return var1[0];
        }
        if (g.var24(var28.D.b((c)var27) ? 1 : 0) && g.var5(var26 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.var24(A.contains(tileObject.getActualId()) ? 1 : 0) && g.var24(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (2 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }))) {
            var26.interact(var2[var1[0]]);
            return var1[1];
        }
        if (g.var25(c.MovingToNextFloorTask() ? 1 : 0)) {
            var26 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (g.var24(tileObject.getName().equals(var2[var1[5]]) ? 1 : 0) && g.var24(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[g.var1[0]] = var2[var1[6]];
                    if (g.var24(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (((5 ^ 0x5D ^ (0xF1 ^ 0x97)) & (18 + 25 - -59 + 55 ^ 82 + 12 - 28 + 97 ^ -1)) == 0) return n2 != 0;
                        return ((0x28 ^ 0x51 ^ (0x6D ^ 0xD)) & (24 + 41 - -47 + 52 ^ 106 + 44 - 1 + 40 ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (g.var5(var26)) {
                var26.interact(var2[var1[1]]);
                return var1[1];
            }
            return var1[0];
        }
        var26 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.var24(tileObject.getName().equals(var2[var1[3]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[g.var1[0]] = var2[var1[4]];
                if (g.var24(tileObject.hasAction(stringArray) ? 1 : 0) && g.var24(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((0x33 ^ 0xC ^ (0xDD ^ 0xBB)) & (0x71 ^ 0x6D ^ (0xC2 ^ 0x87) ^ -1)) == 0) return n2 != 0;
                    return ((0xA9 ^ 0x8A ^ (0x17 ^ 0x28)) & (0xAB ^ 0x89 ^ (0x29 ^ 0x17) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (g.var6(var26)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[2]]);
        return var1[1];
    }
}

