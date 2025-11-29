/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pathing to Demiboss", priority=1)
public class PathingToDemibossTask
extends GauntletTaskBase {
    
    private final  c bU;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_6;
        I var3;
        Player player = Players.getLocal();
        if (!I.var4(player) || I.var4(player.getInteracting())) {
            return var2[1];
        }
        if (I.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var2[1];
        }
        g var6 = var3.bU.J();
        if (I.var7((Object)var6)) {
            return var2[1];
        }
        if (I.var8(Inventory.getCount((boolean)var2[0], (int[])var6.an().aB()))) {
            return var2[1];
        }
        h var9 = var3.bU.V();
        if (I.var7(var9)) {
            Log.info((String)var1[var2[1]]);
            return var2[1];
        }
        List<l> var10 = var9.b(l2 -> {
            boolean bl;
            if (I.var11((Object)l2.aZ(), (Object)var6)) {
                bl = var2[0];
                0;
                if (((0xFA ^ 0xB3 ^ (0x3F ^ 0x64)) & (43 + 156 - 77 + 61 ^ 57 + 99 - 17 + 26 ^ -1)) > 0) {
                    return ((0x9E ^ 0xC0 ^ 3) & (0x53 ^ 7 ^ (0xB8 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                bl = var2[1];
            }
            return bl;
        });
        if (I.var5(var10.isEmpty() ? 1 : 0)) {
            void var12;
            l var13 = var10.get(var2[1]);
            if (I.var5(var13.e(var12.getWorldLocation()) ? 1 : 0)) {
                if (I.var8(I.var14(var13.aQ().distanceTo((Locatable)var12), 1.5 * (double)var13.aQ().distanceTo(var9.av().aQ())))) {
                    Item var15 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
                    if (I.var4(var15)) {
                        var15.interact(var1[var2[0]]);
                        0;
                        if ((0x10 ^ 0x42 ^ (0x58 ^ 0xE)) == 3) {
                            return ((0xC8 ^ 0xBE ^ (0xB9 ^ 0x8B)) & (130 + 125 - 39 + 16 ^ 133 + 17 - 103 + 125 ^ -1)) != 0;
                        }
                    } else {
                        var3.bU.a((var9.av(), var12.getWorldLocation());
                        0;
                    }
                    0;
                    if null != null {
                        return ((0x2D ^ 0x1E) & ~(0x13 ^ 0x20)) != 0;
                    }
                } else {
                    var3.bU.a(var13, var12.getWorldLocation());
                    0;
                }
                return var2[0];
            }
            return var2[1];
        }
        List<l> var13 = var9.b(l2 -> {
            int n2;
            if (I.var5(l2.aY() ? 1 : 0) && I.var16(l2.aS() ? 1 : 0)) {
                n2 = var2[0];
                0;
                if (2 == (0x64 ^ 0x3B ^ (0x5A ^ 1))) {
                    return ((0xE9 ^ 0xBE ^ (0x65 ^ 0x69)) & (0x78 ^ 0x69 ^ (0x16 ^ 0x5C) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (I.var16(var13.isEmpty() ? 1 : 0)) {
            Log.info((String)var1[var2[2]]);
            return var2[1];
        }
        var5_6.sort(Comparator.comparingInt(l2 -> l2.aW().distanceTo(player.getWorldLocation())));
        l l3 = (var5_6.get(var2[1]);
        Log.info((String)var1[var2[3]]);
        return this.bU.a(l3, player.getWorldLocation());
    }

    private static void var17() {
        var1 = new String[var2[4]];
        I.var1[I.var2[1]] = "Gauntlet Map is null";
        I.var1[I.var2[0]] = "Activate";
        I.var1[I.var2[2]] = "Potentials are empty";
        I.var1[I.var2[3]] = "Pathing to best potential room";
    }

    private static boolean var8(int n2) {
        return n2 > 0;
    }

    private static void var18() {
        var2 = new int[5];
        I.var2[0] = 1;
        I.var2[1] = (0x52 ^ 0x7B) & ~(0x32 ^ 0x1B);
        I.var2[2] = 2;
        I.var2[3] = 3;
        I.var2[4] = 4 ^ 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        I.var18();
        I.var17();
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    @Inject
    public PathingToDemibossTask(c c2) {
        d[] dArray = new d[var2[0]];
        dArray[I.var2[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bU = c2;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var2[1];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var2[1];
        while (I.var19(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (-(0x5D ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var11(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static int var14(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

