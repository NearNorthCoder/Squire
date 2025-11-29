/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering boss room", priority=1)
public class EnteringBossRoomTask
extends GauntletTaskBase {

    @Inject
    public EnteringBossRoomTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.AFK;
        super(c2, dArray);
    }

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

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 1;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 1;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_3;
        w var25;
        if ((this.ba.h( == 0).enterBossRoom() ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        int var26 = Inventory.getCount((int[])nArray);
        if ((var26 <= var25.ba.h().abortFishAmount())) {
            TileObject var27 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if var27 == null {
                return 1;
            }
            var27.interact(var2[1]);
            return 0;
        }
        TileObject var27 = TileObjects.getNearest(tileObject -> e.aF.contains(tileObject.getId()));
        if var27 == null {
            return 1;
        }
        NPC var28 = var25.ba.X().aI();
        if (!var28 != null || (var27.distanceTo((Locatable)Players.getLocal()) > 3)) {
            ScenePoint var29 = ScenePoint.fromWorld((WorldPoint)var27.getWorldLocation());
            Movement.setDestination((int)var29.getX(), (int)var29.getY());
            return 0;
        }
        if ((var28.getWorldArea().distanceTo(var27.getWorldLocation()) <= 0)) {
            Log.info((String)var2[0]);
            return 0;
        }
        var2_3.interact(var2[4]);
        return 0;
    }
}

