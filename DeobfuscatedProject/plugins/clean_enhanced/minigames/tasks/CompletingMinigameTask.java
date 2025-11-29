/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Completing Minigame")
public class CompletingMinigameTask
extends Task {
    
    private static final  WorldPoint v;
    private static final  int w;
    private final  SquireSorceressGardenConfig x;

    private static boolean var3(int n) {
        return n != 0;
    }

    private void B() {
        Movement.walkTo((WorldPoint)v);
        0;
    }

    @Inject
    public CompletingMinigameTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.x = squireSorceressGardenConfig;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private void C() {
        void var1_2;
        e var5;
        if (e.var3(this.x.pickHerbs() ? 1 : 0)) {
            void var6;
            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.var3(tileObject.getName().equals(var2[var1[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[e.var1[0]] = var2[var1[5]];
                    if (e.var3(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = var1[1];
                        0;
                        if (((0x19 ^ 0x5C) & ~(0x62 ^ 0x27)) >= -1) return n != 0;
                        return ((0x7F ^ 0x4B) & ~(3 ^ 0x37)) != 0;
                    }
                }
                n = var1[0];
                return n != 0;
            });
            if (e.var7(tileObject2)) {
                return;
            }
            var6.interact(var2[var1[0]]);
            return;
        }
        TileObject var6 = var5.A();
        if (e.var7(var6)) {
            return;
        }
        var1_2.interact(var2[var1[1]]);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private void y() {
        if (!e.var9(Movement.isRunEnabled() ? 1 : 0) || e.var10(Movement.getRunEnergy(), var1[2])) {
            return;
        }
        Movement.toggleRun();
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (e.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private boolean z() {
        boolean bl;
        if (!e.var9(Inventory.isFull() ? 1 : 0) || !e.var9(Bank.isOpen() ? 1 : 0) || !e.var3(Movement.shouldWalk() ? 1 : 0) || e.var4((Object)this.x.botActivity(), (Object)a.MINIGAME)) {
            bl = var1[1];
            0;
            if (((0x66 ^ 0x73) & ~(0xE ^ 0x1B)) != 0) {
                return ((0x99 ^ 0xB9) & ~(0x6F ^ 0x4F)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    static {
        e.var33();
        e.var34();
        w = var1[3];
        v = new WorldPoint(var1[6], var1[7], var1[0]);
    }

    private static boolean var10(int n, int n2) {
        return n < n2;
    }

    private static void var33() {
        var1 = new int[10];
        e.var1[0] = (0x9F ^ 0xBE ^ (0x78 ^ 0x51)) & (0xD4 ^ 0x9C ^ (0x61 ^ 0x21) ^ -1);
        e.var1[1] = 1;
        e.var1[2] = 113 + 129 - 123 + 11 ^ 40 + 11 - -15 + 89;
        e.var1[3] = -(0xFFFFBDB1 & 0x4F7F) & (0xFFFFFFFF & 0x3FBF);
        e.var1[4] = 2;
        e.var1[5] = 3;
        e.var1[6] = -(0xFFFFD21D & 0x3DF6) & (0xFFFFBBFF & 0x5F77);
        e.var1[7] = -(0xFFFFBF0F & 0x6AFB) & (0xFFFFBF7B & Short.MAX_VALUE);
        e.var1[8] = 0x26 ^ 0x78 ^ (0x39 ^ 0x63);
        e.var1[9] = 0xCB ^ 0xC1 ^ 2;
    }

    private static boolean var9(int n) {
        return n == 0;
    }

    private TileObject A() {
        int[] nArray = new int[var1[1]];
        nArray[e.var1[0]] = var1[3];
        return TileObjects.getNearest((int[])nArray);
    }

    private boolean a(TileObject tileObject) {
        return Reachable.isInteractable((Locatable)tileObject);
    }

    private static void var34() {
        var2 = new String[var1[8]];
        e.var2[e.var1[0]] = "Pick";
        e.var2[e.var1[1]] = "Pick-Fruit";
        e.var2[e.var1[4]] = "Herbs";
        e.var2[e.var1[5]] = "Pick";
    }

    public boolean run() {
        e var35;
        if (e.var3(this.z() ? 1 : 0)) {
            return var1[0];
        }
        var35.y();
        TileObject var36 = var35.A();
        if (e.var9(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (!e.var8(var36) || e.var9(var35.a(var36) ? 1 : 0)) {
            return Movement.walkTo((WorldPoint)v);
        }
        this.C();
        return var1[1];
    }
}

