/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Retort task")
public class RetortTask
extends Task {
    
    final  int U = 5672;
    private final  SquireMixologyConfig V;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        l var13;
        if (l.var3(s.e() ? 1 : 0)) {
            return var1[1];
        }
        int[] nArray = new int[var1[2]];
        nArray[l.var1[1]] = var1[3];
        TileObject var14 = TileObjects.getNearest((int[])nArray);
        if (l.var3(var13.a(var14) ? 1 : 0)) {
            return var1[1];
        }
        if (l.var15((Object)var13.V.pluginMode(), (Object)d.MINIGAME)) {
            return var1[1];
        }
        if (l.var15((Object)var13.V.potionStrategy(), (Object)f.MULTI_ORDER) && l.var4(SquireMixology.r, var1[0])) {
            return var1[1];
        }
        if (l.var16((Object)var13.V.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (l.var3(var13.a(var14) ? 1 : 0)) {
                return var1[1];
            }
            s.j();
            if (l.var4(SquireMixology.x, var1[0])) {
                return var1[1];
            }
        }
        SquireMixology.g = var2[var1[1]];
        int[] nArray2 = new int[var1[2]];
        nArray2[l.var1[1]] = var1[3];
        TileObjects.getNearest((int[])nArray2).interact(var1[1]);
        return var1[1];
    }

    private static void var17() {
        var2 = new String[var1[2]];
        l.var2[l.var1[1]] = "Retorting";
    }

    private static boolean var16(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var15(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public RetortTask(SquireMixologyConfig squireMixologyConfig) {
        this.U = var1[0];
        this.V = squireMixologyConfig;
    }

    private static void var19() {
        var1 = new int[7];
        l.var1[0] = -(0xFFFFDF1D & 0x68F6) & (0xFFFFDEBB & 0x7F7F);
        l.var1[1] = (0xE1 ^ 0xBE) & ~(0xD ^ 0x52);
        l.var1[2] = 1;
        l.var1[3] = 0xFFFFFADF & 0xDD7D;
        l.var1[4] = 0xFFFFEDBF & 0x3E7F;
        l.var1[5] = 0xB8 ^ 0xB0;
        l.var1[6] = 2;
    }

    private boolean a(TileObject tileObject) {
        int n2;
        if (l.var18(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var1[2])) {
            n2 = var1[2];
            0;
            if (2 < ((0x2A ^ 6 ^ (0x3D ^ 0x20)) & (0x19 ^ 0x36 ^ (0x22 ^ 0x3C) ^ -1))) {
                return ((0xA8 ^ 0x83 ^ (0x6C ^ 3)) & (0x1E ^ 0x14 ^ (0xC1 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        int var20 = n2;
        int n3 = Players.getLocal().isAnimating();
        if (l.var12(var20) && l.var12(n3)) {
            return var1[2];
        }
        if (l.var5(Vars.getBit((int)var1[4]))) {
            return var1[2];
        }
        if (l.var3(s.g() ? 1 : 0)) {
            return var1[1];
        }
        return var1[2];
    }

    static {
        l.var19();
        l.var17();
    }
}

