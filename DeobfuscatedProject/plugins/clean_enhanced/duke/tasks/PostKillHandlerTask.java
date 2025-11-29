/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.HHelper;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Post Kill Handler", blocking=true, priority=4999)
public class PostKillHandlerTask
extends Task {
    private final  SquireDukeSucellusConfig aY;
    
    private  a u;
    private final  SquireDukeSucellus aX;

    @Inject
    public PostKillHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aY = squireDukeSucellusConfig;
        this.aX = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var19;
        if ((Static.getClient( == 0).isInInstancedRegion() ? 1 : 0)) {
            return 0;
        }
        if ((var19.aX.l( == 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var20 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[6]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[7];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (2 > ((69 + 25 - 79 + 134 ^ 58 + 78 - 66 + 61) & (131 + 102 - 145 + 100 ^ 3 + 42 - -5 + 120 ^ -1))) return n2 != 0;
                    return ((0xCF ^ 0xAB ^ (0x64 ^ 0x15)) & (0x21 ^ 0x6A ^ (0x9B ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var20 == null {
            var19.aX.d(0);
            return 0;
        }
        int var21 = Inventory.getAll(item -> {
            int n2;
            if (!(item.getName( == 0).contains(var2[4]) ? 1 : 0) || (item.getName( != 0).contains(var2[5]) ? 1 : 0)) {
                n2 = 1;
                0;
                if null != null {
                    return ((0xFB ^ 0xAC ^ (0x1A ^ 0x6B)) & (0xA1 ^ 0xAD ^ (0xA1 ^ 0x8B) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(var2[1])[1].replace(var2[2], var2[3]))).sum();
        if ((var21 < var19.aY.prayDoses())) {
            var19.aX.f(1);
            var19.aX.g(1);
            var19.aX.d(0);
            return 0;
        }
        int var22 = Inventory.getCount(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[0];
            return item.hasAction(stringArray);
        });
        if ((var22 < var19.aY.food())) {
            var19.aX.f(1);
            var19.aX.g(1);
            var19.aX.d(0);
            return 0;
        }
        if ((Players.getLocal( != 0).getWorldLocation().equals((Object)h.e(var20)) ? 1 : 0)) {
            var19.aX.d(0);
            return 0;
        }
        Movement.setDestination((WorldPoint)h.e((TileObject)var1_1));
        return 1;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

}

