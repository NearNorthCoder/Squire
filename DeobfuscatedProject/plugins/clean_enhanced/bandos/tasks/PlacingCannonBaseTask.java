/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;

@Singleton
@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
public class PlacingCannonBaseTask
extends Task {
    private static final  int ar;
    
    private  int aw;
    private final  d av;
    private static final  int as;
    private static final  int at;
    
    private final  e au;

    private static void var3() {
        var1 = new String[var2[10]];
        w.var1[w.var2[0]] = "Eat";
        w.var1[w.var2[3]] = "Pick-up";
        w.var1[w.var2[9]] = "Set-up";
        w.var1[w.var2[7]] = "Eat";
    }

    @Inject
    public PlacingCannonBaseTask(e e2, d d2) {
        this.aw = var2[0];
        this.au = e2;
        this.av = d2;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private boolean M() {
        return var2[0];
    }

    public int Q() {
        return this.aw;
    }

    static {
        w.var5();
        w.var3();
        ar = var2[6];
        as = var2[1];
        at = var2[2];
    }

    public boolean run() {
        w var6;
        if (w.var7(this.au.t() ? 1 : 0)) {
            return var2[0];
        }
        int var8 = Static.getClient().getTickCount();
        if (w.var7(var6.au.s() ? 1 : 0) && w.var7(var6.au.v() ? 1 : 0) && w.var9(var8, var6.aw) && (!w.var10(var6.au.r(), var2[1]) || w.var9(var8 - var6.aw, var2[2])) && w.var4(var6.au.y() ? 1 : 0)) {
            Item var11;
            if (w.var4(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[var2[3]];
                nArray[w.var2[0]] = var2[4];
                var11 = Inventory.getFirst((int[])nArray);
                if (w.var12(var11)) {
                    var11 = Inventory.getFirst(item -> item.hasAction(var1[var2[7]]::equals));
                }
                if (w.var12(var11)) {
                    return var2[0];
                }
                var11.interact(var1[var2[0]]);
            }
            int[] nArray = new int[var2[3]];
            nArray[w.var2[0]] = var2[5];
            var11 = TileObjects.getNearest((int[])nArray);
            var11.interact(var1[var2[3]]);
            return var2[3];
        }
        if (w.var13(var8 + var2[6] - var2[7], var6.aw)) {
            Movement.walkTo((WorldPoint)var6.av.p());
            0;
        }
        if (w.var4(var6.au.y() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[3]];
        nArray[w.var2[0]] = var2[8];
        if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var6.M();
        }
        Player var11 = Players.getLocal();
        WorldPoint var14 = var6.av.o();
        if (w.var4(var11.getWorldLocation().equals((Object)var14) ? 1 : 0)) {
            int[] nArray2 = new int[var2[3]];
            nArray2[w.var2[0]] = var2[8];
            Item var15 = Inventory.getFirst((int[])nArray2);
            var15.interact(var1[var2[9]]);
            var6.aw = var8 + var2[6];
            return var2[3];
        }
        if (w.var7(var11.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var14);
            0;
        }
        return var2[3];
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var2 = new int[12];
        w.var2[0] = (0x22 ^ 0x6C ^ (3 ^ 0xF)) & (169 + 207 - 159 + 13 ^ 146 + 56 - 186 + 148 ^ -1);
        w.var2[1] = 0x99 ^ 0xC6 ^ (0xD1 ^ 0x97);
        w.var2[2] = 86 + 102 - 25 + 12 + (108 + 24 - 120 + 145) - (0xFFFFADDF & 0x5363) + (182 + 75 - 137 + 71);
        w.var2[3] = 1;
        w.var2[4] = 0xFFFFBEFB & 0x5BE7;
        w.var2[5] = 0x35 ^ 0x6A ^ (0xFD ^ 0xA5);
        w.var2[6] = -(0xFFFFD4B3 & 0x7B6F) & (0xFFFFDFF7 & 0x77FA);
        w.var2[7] = 3;
        w.var2[8] = 0x9B ^ 0x9D;
        w.var2[9] = 2;
        w.var2[10] = 82 + 5 - -29 + 12 ^ 104 + 35 - 73 + 66;
        w.var2[11] = 0xD1 ^ 0xA5 ^ (0x53 ^ 0x2F);
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[0];
        while (w.var13(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }
}

