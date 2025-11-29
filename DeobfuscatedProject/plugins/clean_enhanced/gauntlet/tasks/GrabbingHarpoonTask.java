/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.Identifiable
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.MHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Grabbing harpoon", priority=15, blocking=true)
public class GrabbingHarpoonTask
extends GauntletTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_8;
        WorldPoint var9;
        K var10;
        void var11;
        Predicate<Identifiable> predicate;
        List<Integer> list = i.FISH.ay();
        Predicate<Identifiable> predicate2 = predicate = identifiable -> list.contains(identifiable.getId());
        Objects.requireNonNull(predicate2);
        0;
        if ((Inventory.contains(predicate2::test != 0) ? 1 : 0)) {
            return 1;
        }
        Widget var12 = Static.getClient().getWidget(2);
        if (var12 != null && (var12.isVisible( != 0) ? 1 : 0)) {
            System.out.println(var2[1]);
            Keyboard.type((char)3);
            return 0;
        }
        void v1 = var11;
        Objects.requireNonNull(v1);
        0;
        TileItem var13 = TileItems.getNearest(((Predicate)v1)::test);
        Player var14 = Players.getLocal();
        if (var13 != null && (var13.distanceTo((Locatable)var14) < 4)) {
            var13.interact(var2[0]);
            return 0;
        }
        m var15 = var10.ba.V().av();
        if ((var15.e(var9 = var14.getWorldLocation( == 0)) ? 1 : 0)) {
            return var10.ba.a((var15, var9);
        }
        int[] nArray = new int[5];
        nArray[1] = 6;
        nArray[0] = 7;
        TileObject var16 = TileObjects.getNearest((int[])nArray);
        if var16 == null {
            return 1;
        }
        var8_8.interact(var2[5]);
        Time.sleep((long)150L);
        0;
        Keyboard.type((char)3);
        return 0;
    }

    @Inject
    public GrabbingHarpoonTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = 1;
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = 1;
        while (var31 < var30) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if ((156 + 72 - 177 + 117 ^ 36 + 36 - -49 + 52) != 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

}

