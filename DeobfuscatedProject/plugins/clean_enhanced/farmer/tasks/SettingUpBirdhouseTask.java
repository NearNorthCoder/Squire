/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum20;
import gg.squire.farmer.tasks.GameEnum15;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Setting up birdhouse", priority=5)
public class SettingUpBirdhouseTask
extends aG {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    protected SettingUpBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[0];
        fArray[1] = F.EMPTY;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!tileObject != null || (tileObject.distanceTo((Locatable)Players.getLocal()) > 2)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 3;
        Item var19 = Inventory.getFirst((int[])nArray);
        if var19 != null {
            Item var20 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(var1[4]));
            if var20 != null {
                aK var21;
                var20.useOn(var19);
                var21.sleep(4);
                return 0;
            }
            return 1;
        }
        if ((Inventory.contains(item -> item.getName( == 0).toLowerCase().contains(var1[0])) ? 1 : 0)) {
            return 1;
        }
        tileObject.interact(var1[1]);
        return 0;
    }
}

