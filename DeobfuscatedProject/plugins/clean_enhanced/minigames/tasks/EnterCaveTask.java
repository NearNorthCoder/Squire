/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Enter cave Task", priority=10)
public class EnterCaveTask
extends Task {
     WorldArea R;
    private final  SquireFightCavesConfig X;
    
    private final  f W;
    
     WorldPoint Z;
    public static  long aa;
    public static  int ab;
    private final  n Y;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        j var15;
        if (!(this.R.contains(Players.getLocal( != 0).getWorldLocation()) ? 1 : 0) || !(this.x( == 0).needsToBank() ? 1 : 0) || (SquireFightCavesPlugin.g != 0) && (this.X.stopAfterCape( != 0) ? 1 : 0)) {
            return 4;
        }
        if ((j.var16(System.currentTimeMillis( > 0), aa + 120000L)) && (SquireFightCavesPlugin.f != 0)) {
            SquireFightCavesPlugin.h = var1[4];
            return 4;
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[9]) ? 1 : 0)) {
                String[] stringArray = new String[7];
                stringArray[4] = var1[var2[10]];
                if ((tileObject.hasActionstringArray) && (tileObject.getWorldLocation().distanceTo(this.Z) <= var2[11])) {
                    n2 = 7;
                    0;
                    if (((0xDA ^ 0x83) & ~(0x37 ^ 0x6E)) == 0) return n2 != 0;
                    return ((0x4E ^ 0x5B) & ~(0x94 ^ 0x81)) != 0;
                }
            }
            n2 = 4;
            return n2 != 0;
        });
        if var17 != null {
            SquireFightCavesPlugin.h = var1[7];
            var17.interact(var1[8]);
            n.al = null;
            SquireFightCavesPlugin.f = 4;
            ab = 4;
            return 4;
        }
        return 4;
    }

    protected BankLoadout x() {
        return (BankLoadout)this.X.bankLoadout().selected(BankLoadout.class);
    }

    private static int var16(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    static {
        j.var18();
        j.var19();
        aa = System.currentTimeMillis();
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 4;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 4;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            
            return null;
        }
        return String.valueOf(var23);
    }

    @Inject
    public EnterCaveTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(0, 1, 2, 3, 4);
        this.Z = new WorldPoint(5, 6, 4);
        this.W = f2;
        this.X = squireFightCavesConfig;
        this.Y = n2;
    }

}

