/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominTaskBase;

@TaskDesc(name="Walking to Godwars")
public class WalkingToGodwarsTask
extends SaradominTaskBase {
    private final  g S;
    
    private static final  WorldPoint Q;
    
    private static final  int R;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static void var5() {
        var1 = new String[var2[2]];
        p.var1[p.var2[0]] = "Climb-down";
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var7;
        if (p.var6(this.S() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var8(var7.O.a() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var8(var7.S.s() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var8(var7.P.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var3(var7.P.getPlane(), var2[1])) {
            return var2[0];
        }
        int[] nArray = new int[var2[2]];
        nArray[p.var2[0]] = var2[3];
        TileObject var9 = TileObjects.getNearest((int[])nArray);
        if (!p.var4(var9) || p.var6(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)Q);
            0;
            return var2[2];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[2];
    }

    private static void var10() {
        var2 = new int[7];
        p.var2[0] = (0x3A ^ 0x62) & ~(0xF0 ^ 0xA8);
        p.var2[1] = 2;
        p.var2[2] = 1;
        p.var2[3] = 0xFFFFFFF7 & 0x673B;
        p.var2[4] = 0xFFFF8BE7 & 0x7F7B;
        p.var2[5] = 0xFFFFDFB2 & 0x2EEF;
        p.var2[6] = 0x2F ^ 0x27;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        p.var10();
        p.var5();
        R = var2[3];
        Q = new WorldPoint(var2[4], var2[5], var2[0]);
    }

    @Inject
    public WalkingToGodwarsTask(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, g g2, Client client) {
        super(squireSaraConfig, squireSaradomin, client);
        this.S = g2;
    }
}

