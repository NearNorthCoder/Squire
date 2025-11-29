/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum9;
import gg.squire.zulrah.tasks.GameEnum2;
import gg.squire.zulrah.tasks.GameEnum3;
import gg.squire.zulrah.tasks.ZulrahManager;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Traversing to Zul-andra")
public class TraversingToZulandraTask
extends Task {
    private final  SquireZulrah aS;
    private static final  WorldPoint aQ;
    
    private final  v aT;
    private static final  int aP;
    
    private static final  int aO;
    private final  SquireZulrahConfig aR;
    private final  Client aU;

    private boolean ak() {
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aQ);
            0;
        }
        return 2;
    }

    static {
        ap.var3();
        ap.var4();
        aP = 7;
        aO = 8;
        aQ = new WorldPoint(9, var1[10], 0);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_6;
        int n2;
        int var17;
        ap var18;
        if (!((Object)this.aS.a() == (Object)this.aS.a()2)c.DONE) || (this.aS.d( != 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var18.aR.transport() == (Object)var18.aR.transport()2)q.ZUL_ANDRA_TELEPORT)) {
            return 0;
        }
        WorldPoint var19 = Players.getLocal().getWorldLocation();
        if ((var18.aU.isInInstancedRegion( != 0) ? 1 : 0)) {
            int[] var20 = var18.aU.getMapRegions();
            var17 = var20.length;
            int var21 = 0;
            while (var21 < var17) {
                int var22 = var20[var21];
                if (var22 == 1) {
                    return 0;
                }
                ++var21;
                0;
                if (((75 + 198 - 144 + 121 ^ 155 + 98 - 95 + 22) & (197 + 2 - 24 + 38 ^ 53 + 75 - 2 + 29 ^ -1)) <= 0) continue;
                return ((0xDC ^ 0x93 ^ (0x7B ^ 0x1B)) & (0xE0 ^ 0xC0 ^ (0x32 ^ 0x3D) ^ -1)) != 0;
            }
        }
        int var20 = Inventory.getCount(item -> {
            String[] stringArray = new String[2];
            stringArray[0] = var2[2];
            return item.hasAction(stringArray);
        });
        if (!(Inventory.contains(item -> item.getName( == 0).startsWith(this.aR.cure().k())) ? 1 : 0) || ((Object)var18.aR.cure() == (Object)var18.aR.cure()2)o.IGNORE)) {
            n2 = 2;
            0;
            if ((0x3A ^ 0x5C ^ (0xD8 ^ 0xBA)) != (0x26 ^ 0x7B ^ (0x61 ^ 0x38))) {
                return ((0xFE ^ 0xB4 ^ (0x33 ^ 0x2C)) & (0x5B ^ 0x64 ^ (0x28 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            n2 = var17 = 0;
        }
        if (!(var20 >= var18.aR.multiple()) || (var17 == 0)) {
            return 0;
        }
        if ((var18.aR.bankLocation( != 0).g().contains(var19.getRegionID()) ? 1 : 0)) {
            return 0;
        }
        if ((aQ.distanceTo(var19) <= 3) && (var19.getX() >= aQ.getX())) {
            return 0;
        }
        int[] nArray = new int[2];
        nArray[0] = 4;
        TileObject var21 = TileObjects.getNearest((int[])nArray);
        if var21 == null {
            if ((var19.getRegionID() != 5)) {
                return var18.ak();
            }
            return 0;
        }
        var4_6.interact(var2[0]);
        this.sleep(6);
        return 2;
    }

    @Inject
    protected TraversingToZulandraTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, v v2, Client client, t t2) {
        this.aR = squireZulrahConfig;
        this.aS = squireZulrah;
        this.aT = v2;
        this.aU = client;
    }
}

