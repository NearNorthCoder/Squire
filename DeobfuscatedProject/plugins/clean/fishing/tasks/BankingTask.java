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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lllIlIllIIIIII(int n) {
        return n == 0;
    }

    private static boolean lllIlIllIIIlIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIlIllIIIIll(int n) {
        return n > 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lllIlIllIIIIIl(int n) {
        return n != 0;
    }

    @Inject
    public BankingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.H = squireFisherPlugin;
        this.I = squireFisherConfig;
    }

    private static boolean lllIlIllIIIlII(Object object) {
        return object != null;
    }

    private static boolean lllIlIllIIIllI(int n, int n2) {
        return n < n2;
    }

    public boolean run() {
        BankLocation bankLocation;
        g var2;
        if (!g.lllIlIllIIIIII(this.I.fishingTrawler() ? 1 : 0) || g.lllIlIllIIIIII(this.I.banking() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(var2.I.butlerBanking() ? 1 : 0) && g.lllIlIllIIIIlI((Object)var2.I.fish(), (Object)f.KARAMBWAN)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Inventory.isFull() ? 1 : 0) && g.lllIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(var2.H.BankingTask().matchesInventory() ? 1 : 0)) {
            Bank.close();
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
            Item var3;
            if (g.lllIlIllIIIIIl(var2.I.fishBarrel() ? 1 : 0) && g.lllIlIllIIIIll(Static.getClient().getVarbitValue(lIlllIlIlIIl[2])) && g.lllIlIllIIIlII(var3 = Bank.Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlllIlIlIIl[1]];
                stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[5]];
                return item.hasAction(stringArray);
            }))) {
                var3.interact(lIlllIlIlIII[lIlllIlIlIIl[0]]);
                return lIlllIlIlIIl[1];
            }
            var2.H.BankingTask().withdraw();

            var2.sleep(lIlllIlIlIIl[3]);
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIlI((Object)var2.I.fish(), (Object)f.KARAMBWAN)) {
            bankLocation = BankLocation.ZANARIS;

            if (-1 > 2) {
                return ((0x33 ^ 0x37 ^ (0x4F ^ 0x43)) & (0x34 ^ 0x53 ^ (0x10 ^ 0x7F) ^ -1)) != 0;
            }
        } else {
            bankLocation = BankLocation.getNearest();
        }
        BankLocation var3 = bankLocation;
        WorldArea var4 = var3.getArea();
        if (g.lllIlIllIIIIlI(var3, BankLocation.ZANARIS) && g.lllIlIllIIIlIl(var4.distanceTo2D(Players.getLocal().getWorldLocation()), lIlllIlIlIIl[4])) {
            String[] stringArray = new String[lIlllIlIlIIl[1]];
            stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[1]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray);
            if (g.lllIlIllIIIlII(var5)) {
                String[] stringArray2 = new String[lIlllIlIlIIl[1]];
                stringArray2[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[3]];
                if (g.lllIlIllIIIIII(var5.hasAction(stringArray2) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var4.getCenter());
                    return lIlllIlIlIIl[1];
                }
            }
        }
        if (g.lllIlIllIIIIII(Bank.open() ? 1 : 0)) {
            Movement.walkTo((BankLocation)var3);

            return lIlllIlIlIIl[1];
        }
        return lIlllIlIlIIl[0];
    }

    private static void lllIlIlIlllllI() {
        lIlllIlIlIII = new String[lIlllIlIlIIl[6]];
        g.lIlllIlIlIII[g.lIlllIlIlIIl[0]] = "Empty";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[1]] = "Fairy ring";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[3]] = "Zanaris";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[5]] = "Empty";
    }

    private static boolean lllIlIllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    static {
        g.lllIlIlIllllll();
        g.lllIlIlIlllllI();
        G = lIlllIlIlIIl[2];
        F = LoggerFactory.getLogger(BankingTask.class);
    }
}

