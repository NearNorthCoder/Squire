/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Locale;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging Brazier", priority=2147482647, blocking=true)
public class DodgingBrazierTask
extends Task {
    
    @Inject
    protected  b b;
    
    public static final  int N;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        i var3;
        if (!(this.b.DodgingBrazierTask( != 0) ? 1 : 0) || !(this.b.u( == 0) ? 1 : 0) || (this.b.j( != 0) ? 1 : 0)) {
            return 0;
        }
        Player var4 = Players.getLocal();
        a var5 = var3.b.q();
        WorldPoint var6 = var5.b();
        TileObject var7 = TileObjects.getNearest((WorldPoint)var6, tileObject -> {
            int n2;
            if ((tileObject.getName( != null)) && (tileObject.getName( != 0).toLowerCase(Locale.ROOT).contains(var1[0]) ? 1 : 0)) {
                n2 = 3;
                0;
                if (-3 >= 0) {
                    return ((3 ^ 0x4F) & ~(0x4A ^ 6)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var7 == null {
            return 0;
        }
        TileObject var8 = TileObjects.getNearest((WorldPoint)var6, tileObject -> {
            int n2;
            if ((tileObject.getId() == 4) && (tileObject.getWorldX() == var6.getWorldX())) {
                n2 = 3;
                0;
                if null != null {
                    return ((0x1A ^ 0x13) & ~(0xB7 ^ 0xBE)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var8 == null {
            return 0;
        }
        if (!(var8.distanceTo(var6) <= 1) || (var8.getWorldY() <= var6.getWorldY())) {
            return 0;
        }
        WorldPoint var9 = var6.dy(2);
        if ((var4.getWorldLocation( != 0).equals((Object)var9) ? 1 : 0)) {
            return 3;
        }
        Movement.setDestination((WorldPoint)var6_6);
        return 3;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        i.var20();
        i.var21();
        N = 4;
    }

}

