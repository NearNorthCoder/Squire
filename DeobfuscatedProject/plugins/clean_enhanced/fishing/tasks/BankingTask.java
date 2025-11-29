/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import gg.squire.fishing.tasks.GameEnum;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    private final  SquireFisherConfig I;
    private final  SquireFisherPlugin H;
    
    private static final  Logger F;
    public static final  int G;

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
        while (var17 < lllllllllllllllIlIlllIllIlllIIIl2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public BankingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.H = squireFisherPlugin;
        this.I = squireFisherConfig;
    }

    public boolean run() {
        BankLocation bankLocation;
        g var19;
        if (!(this.I.fishingTrawler( == 0) ? 1 : 0) || (this.I.banking( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.I.butlerBanking( != 0) ? 1 : 0) && ((Object)var19.I.fish() == (Object)var19.I.fish()2)f.KARAMBWAN)) {
            return 0;
        }
        if ((Inventory.isFull( == 0) ? 1 : 0) && (Bank.isOpen( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.H.BankingTask( != 0).matchesInventory() ? 1 : 0)) {
            Bank.close();
            return 1;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            Item var20;
            if ((var19.I.fishBarrel( != 0) ? 1 : 0) && (Static.getClient( > 0).getVarbitValue(2)) && (var20 = Bank.Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[0] = var1[5];
                return item.hasActionstringArray != null;
            }))) {
                var20.interact(var1[0]);
                return 1;
            }
            var19.H.BankingTask().withdraw();
            0;
            var19.sleep(3);
            return 1;
        }
        if (((Object)var19.I.fish() == (Object)var19.I.fish()2)f.KARAMBWAN)) {
            bankLocation = BankLocation.ZANARIS;
            0;
            if (-1 > 2) {
                return ((0x33 ^ 0x37 ^ (0x4F ^ 0x43)) & (0x34 ^ 0x53 ^ (0x10 ^ 0x7F) ^ -1)) != 0;
            }
        } else {
            bankLocation = BankLocation.getNearest();
        }
        BankLocation var20 = bankLocation;
        WorldArea var21 = var20.getArea();
        if ((var20 == lllllllllllllllIlIlllIlllIIlIlll2) && (var21.distanceTo2D(Players.getLocal().getWorldLocation()) > var21.distanceTo2D(Players.getLocal().getWorldLocation())2)) {
            String[] stringArray = new String[1];
            stringArray[0] = var1[1];
            TileObject var22 = TileObjects.getNearest((String[])stringArray);
            if var22 != null {
                String[] stringArray2 = new String[1];
                stringArray2[0] = var1[3];
                if ((var22.hasAction(stringArray2 == 0) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var21.getCenter());
                    return 1;
                }
            }
        }
        if ((Bank.open( == 0) ? 1 : 0)) {
            Movement.walkTo((BankLocation)var20);
            0;
            return 1;
        }
        return 0;
    }

    static {
        g.var23();
        g.var24();
        G = 2;
        F = LoggerFactory.getLogger(BankingTask.class);
    }
}

