/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Picking the lock")
public class PickingTheLockTask
extends ThievingTaskBase {
    
     WorldArea ag;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        w var3;
        void var4;
        Player player = Players.getLocal();
        if (w.var5(player)) {
            return var1[3];
        }
        if (w.var6(Dialog.isOpen() ? 1 : 0)) {
            return var1[3];
        }
        if (w.var6(Inventory.isFull() ? 1 : 0)) {
            return var1[3];
        }
        if (!w.var7(var4.isAnimating() ? 1 : 0) || w.var7(Movement.shouldWalk() ? 1 : 0)) {
            return var1[3];
        }
        if (w.var6(var3.ag.contains((Locatable)var4) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[4], var1[5], var1[3]), (boolean)var1[3]);
            0;
            return var1[6];
        }
        String[] stringArray = new String[var1[6]];
        stringArray[w.var1[3]] = var2[var1[3]];
        TileObject var8 = TileObjects.getNearest((String[])stringArray);
        if (w.var5(var8)) {
            return var1[3];
        }
        var2_2.interact(var2[var1[6]]);
        return var1[6];
    }

    @Inject
    public PickingTheLockTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ag = new WorldArea(var1[0], var1[1], var1[2], var1[2], var1[3]);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var9() {
        var2 = new String[var1[7]];
        w.var2[w.var1[3]] = "Stone chest";
        w.var2[w.var1[6]] = "Picklock";
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static void var16() {
        var1 = new int[9];
        w.var1[0] = 0xFFFFC71F & 0x3DFC;
        w.var1[1] = 0xFFFFAF6B & 0x77F6;
        w.var1[2] = 0x1D ^ 0x76 ^ (0xF0 ^ 0x91);
        w.var1[3] = (0x29 ^ 0xA ^ (0x2F ^ 0x41)) & (74 + 105 - 157 + 221 ^ 11 + 97 - 76 + 158 ^ -1);
        w.var1[4] = -(0xFFFFFDFC & 0x6AC7) & (0xFFFFEDDF & 0x7FF7);
        w.var1[5] = 0xFFFFF7F7 & 0x2F6F;
        w.var1[6] = 1;
        w.var1[7] = 2;
        w.var1[8] = 0xEC ^ 0xB2 ^ (0x33 ^ 0x65);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        w.var16();
        w.var9();
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[3];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[3];
        while (w.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }
}

