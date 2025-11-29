/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting Herbs")
public class LootingHerbsTask
extends Task {
    private final  SquireLooter eF;
    private final  LooterConfig eE;
    private static  int[] llllIll;
    private static  String[] llllIlI;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    public LootingHerbsTask(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eE = looterConfig;
        this.eF = squireLooter;
    }

    public boolean run() {
        aN var6;
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        Iterator<aH> var7 = var6.eF.cg().iterator();
        while ((var7.hasNext( != 0) ? 1 : 0)) {
            aH var8 = var7.next();
            int[] nArray = new int[1];
            nArray[0] = var8.P();
            TileItem var9 = TileItems.getFirstAt((WorldPoint)var8.cd(), (int[])nArray);
            if var9 != null {
                if ((var9.distanceTo(Players.getLocal().getWorldLocation()) > var6.eE.lootRange())) {
                    0;
                    if ((0x9B ^ 0x9F) != 0) continue;
                    return ((0x65 ^ 0x44) & ~(0x6B ^ 0x4A)) != 0;
                }
                if ((Inventory.isFull( == 0) ? 1 : 0)) {
                    var9.interact(llllIlI[0]);
                }
                if ((Inventory.isFull( != 0) ? 1 : 0)) {
                    int[] nArray2 = new int[1];
                    nArray2[0] = 2;
                    if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                        var9.interact(llllIlI[1]);
                    }
                    return 1;
                }
            }
            0;
            if (2 != (0xE4 ^ 0xB5 ^ (0x22 ^ 0x77))) continue;
            return ((0x51 ^ 0x71 ^ (0x3D ^ 0x7D)) & (16 + 66 - -93 + 42 ^ 15 + 16 - -90 + 64 ^ -1)) != 0;
        }
        return 1;
    }

    private static String lllIlIllI(String var10, String var11) {
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
            if ((0x62 ^ 0x79 ^ (0xC ^ 0x13)) >= 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

}

