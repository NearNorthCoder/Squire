/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Pathing to Boss", priority=0x7FFFFF37, blocking=true)
public class PathingToBossTask
extends ScurriusTaskBase {
    
    private final  SquireScurrius R;
    
    private final  b S;
    private  WorldArea V;
    private static  WorldPoint Q;
    private final  SquireScurriusConfig T;
    private final  int U = 4661;

    static {
        k.var3();
        k.var4();
        Q = new WorldPoint(var2[9], var2[10], var2[3]);
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        k var7;
        if (k.var8(this.c() ? 1 : 0)) {
            return var2[3];
        }
        if (k.var8(var7.R.PathingToBossTask() ? 1 : 0)) {
            var7.R.forceStop();
            return var2[6];
        }
        Player var9 = Players.getLocal();
        if (k.var10(var9)) {
            return var2[3];
        }
        if (k.var8(var7.V.contains((Locatable)var9) ? 1 : 0)) {
            if (k.var8(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[var2[6]];
                stringArray[k.var2[3]] = var1[var2[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return var2[6];
            }
            var7.a(var1[var2[6]], var1[var2[7]], var2[8], var9);
            return var2[6];
        }
        Movement.walkTo((WorldPoint)Q);
        0;
        return var2[6];
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[3];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[3];
        while (k.var6(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Override
    public boolean run() {
        if (k.var8(this.R.m() ? 1 : 0)) {
            return var2[3];
        }
        return this.a();
    }

    @Inject
    public PathingToBossTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.U = var2[0];
        this.V = new WorldArea(new WorldPoint(var2[1], var2[2], var2[3]), new WorldPoint(var2[4], var2[5], var2[3]));
        this.R = squireScurrius;
        this.S = squireScurrius.n();
        this.T = squireScurriusConfig;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var2 = new int[13];
        k.var2[0] = -(0xFFFFF2FB & 0x4D47) & (0xFFFFD777 & 0x7AFF);
        k.var2[1] = -(0xFFFFD3B5 & 0x6E7F) & (0xFFFFFEFD & 0x4FFF);
        k.var2[2] = 0xFFFFEF9B & 0x36EF;
        k.var2[3] = (0x91 ^ 0x95 ^ (0x4D ^ 0x1D)) & (0x93 ^ 0x8F ^ (0x77 ^ 0x3F) ^ -1);
        k.var2[4] = 0xFFFF9FFE & 0x6CD3;
        k.var2[5] = -(0xFFFFEDEF & 0x537B) & (0xFFFFFFFE & 0x67FF);
        k.var2[6] = 1;
        k.var2[7] = 2;
        k.var2[8] = 0xFFFFB7FB & 0x7F7F;
        k.var2[9] = 0xFFFFCCDC & 0x3FEF;
        k.var2[10] = -(0xFFFFDFFE & 0x6123) & (0xFFFFE7EF & 0x7FBF);
        k.var2[11] = 3;
        k.var2[12] = 0x63 ^ 0x6B;
    }

    private static void var4() {
        var1 = new String[var2[11]];
        k.var1[k.var2[3]] = "Private";
        k.var1[k.var2[6]] = "Broken bars";
        k.var1[k.var2[7]] = "Climb-through (private)";
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var33;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (k.var5(tileObject.getId(), n2) && k.var8(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[var2[6]];
                stringArray[k.var2[3]] = string2;
                if (k.var8(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = var2[6];
                    0;
                    if (-3 <= 0) return n3 != 0;
                    return ((0x60 ^ 0x24 ^ (0xC3 ^ 0x80)) & (0x59 ^ 0x60 ^ (0x4A ^ 0x74) ^ -1)) != 0;
                }
            }
            n3 = var2[3];
            return n3 != 0;
        });
        if (k.var10(tileObject2)) {
            return;
        }
        if (k.var8(var33.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static boolean var10(Object object) {
        return object == null;
    }
}

