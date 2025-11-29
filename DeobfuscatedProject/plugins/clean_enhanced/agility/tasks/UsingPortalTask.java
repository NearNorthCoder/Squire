/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Using Portal", priority=100, blocking=true)
public class UsingPortalTask
extends Task {

    private final  AgilityConfig v;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public UsingPortalTask(AgilityConfig agilityConfig) {
        this.v = agilityConfig;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n) {
        return n == 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    static {
        g.var12();
        g.var13();
    }

    private static boolean var14(int n) {
        return n != 0;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static void var13() {
        var1 = new String[var2[3]];
        g.var1[g.var2[0]] = "Travel";
        g.var1[g.var2[1]] = "Portal";
        g.var1[g.var2[2]] = "Travel";
    }

    private static boolean var21(Object object) {
        return object != null;
    }

    private static void var12() {
        var2 = new int[5];
        g.var2[0] = (121 + 90 - 138 + 66 ^ 118 + 54 - 134 + 115) & (25 + 113 - 1 + 52 ^ 95 + 140 - 232 + 172 ^ -1);
        g.var2[1] = 1;
        g.var2[2] = 2;
        g.var2[3] = 3;
        g.var2[4] = 0x52 ^ 0x5A;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (g.var3((Object)this.v.course(), (Object)b.PRIFDDINAS)) {
            return var2[0];
        }
        Player var22 = Players.getLocal();
        if (!g.var21(var22) || g.var14(var22.isAnimating() ? 1 : 0)) {
            return var2[0];
        }
        TileObject var23 = TileObjects.getNearest(tileObject -> {
            int n;
            if (g.var14(tileObject.getName().equals(var1[var2[1]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[g.var2[0]] = var1[var2[2]];
                if (g.var14(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = var2[1];
                    0;
                    if ((0xF3 ^ 0x86 ^ (0xF7 ^ 0x86)) >= ((73 + 7 - 47 + 94 ^ (0x11 ^ 0x21)) & (0x1F ^ 0x10 ^ (0xC6 ^ 0x86) ^ -1))) return n != 0;
                    return ((0x36 ^ 0x23 ^ (0x67 ^ 0x62)) & (0xF1 ^ 0xB4 ^ (0x31 ^ 0x64) ^ -1)) != 0;
                }
            }
            n = var2[0];
            return n != 0;
        });
        if (g.var11(var23)) {
            return var2[0];
        }
        if (g.var10(Movement.shouldWalk() ? 1 : 0)) {
            return var2[1];
        }
        var2_2.interact(var1[var2[0]]);
        return var2[1];
    }
}

