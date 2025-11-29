/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.woodcutting.tasks.GameEnum2;

@TaskDesc(name="Chopping", priority=25, register=true)
public class ChoppingTask
extends Task {
    private final  int[] x;
    private static final  Logger u;
    private final  int[] y;
    
    private final  SquireWoodcutterConfig v;
    
    private final  SquireWoodcutterPlugin w;

    @Inject
    public ChoppingTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        nArray[5] = 6;
        nArray[7] = 8;
        this.x = nArray;
        int[] nArray2 = new int[0];
        nArray2[1] = 9;
        nArray2[3] = var1[10];
        nArray2[5] = var1[11];
        nArray2[7] = var1[12];
        this.y = nArray2;
        this.w = squireWoodcutterPlugin;
        this.v = squireWoodcutterConfig;
    }

    public boolean run() {
        c var3;
        if ((this.v.fastTickChop( != 0) ? 1 : 0)) {
            return 1;
        }
        if (!(Bank.isOpen( == 0) ? 1 : 0) || (Inventory.isFull( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var3.w.p( != 0) ? 1 : 0)) {
            return 1;
        }
        if (((Object)var3.v.tree() == (Object)var3.v.tree()2)a.REDWOOD) && (Static.getClient( == 0).getPlane())) {
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                String[] stringArray = new String[3];
                stringArray[1] = var2[var1[16]];
                return tileObject.hasAction(stringArray);
            });
            if var4 == null {
                return 1;
            }
            var4.interact(var2[1]);
            return 3;
        }
        if ((var3.v.tickChop( == 0) ? 1 : 0) && (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 1;
        }
        Predicate<String> var4 = string -> {
            int n;
            if (string != null && (!(string.startsWith(var2[0] == 0) ? 1 : 0) || (string.equals(var2[var1[14]] != 0) ? 1 : 0))) {
                n = 3;
                0;
                if ((0x55 ^ 0x14 ^ (0xD8 ^ 0x9C)) <= 0) {
                    return ((52 + 188 - 152 + 159 ^ 106 + 88 - 84 + 60) & (0xAD ^ 0x8E ^ (1 ^ 0x7F) ^ -1)) != 0;
                }
            } else {
                n = 1;
            }
            return n != 0;
        };
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getName( != 0).startsWith(this.v.tree().r()) ? 1 : 0) && (tileObject.distanceTo((Locatable)Players.getLocal()) <= tileObject.distanceTo((Locatable)Players.getLocal())2) && (tileObject.hasActionllllllllllllllIllIIllIIIIllIIlll)) {
                n = 3;
                0;
                if (-1 >= 2) {
                    return ((0x4C ^ 0x51) & ~(0x25 ^ 0x38)) != 0;
                }
            } else {
                n = 1;
            }
            return n != 0;
        });
        if (!var5 != null || !(Players.getLocal().distanceTo(var3.w.o().getCenter()) < Players.getLocal().distanceTo(var3.w.o().getCenter())2) || (Reachable.isInteractable((Locatable == 0)var5) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var3.w.o());
            0;
            return 3;
        }
        if ((var3.v.tickChop( != 0) ? 1 : 0)) {
            if ((Inventory.contains((int[] == 0)var3.x) ? 1 : 0) && (Inventory.contains((int[] != 0)var3.y) ? 1 : 0)) {
                Log.info((String)var2[3]);
                Inventory.getFirst((int[])var3.y).interact(var2[5]);
                return 3;
            }
            if ((var3.w.d( == 0) ? 1 : 0)) {
                System.out.println(var2[7]);
                return 1;
            }
            var3.w.h();
            var5.interact(var4);
            var3.sleep(7);
            return 3;
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            var5.interact(var4);
            var3.sleep(var1[14]);
            return 3;
        }
        return 1;
    }

    static {
        c.var6();
        c.var7();
        u = LoggerFactory.getLogger(ChoppingTask.class);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 1;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 1;
        while (var22 < llllllllllllllIllIIllIIIIIlllIlI2) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var17);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

