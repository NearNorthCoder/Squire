/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to next region", priority=25, blocking=true)
public class MovingToNextRegionTask
extends FarmerTaskBase {

    private static boolean llllIIlllIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlllIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public MovingToNextRegionTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    static {
        bc.llllIIlllIIIlI();
        bc.llllIIllIllllI();
    }

    private static void llllIIllIllllI() {
        llIIIIllllII = new String[llIIIIlllllI[1]];
        bc.llIIIIllllII[bc.llIIIIlllllI[0]] = "Drop";
    }

    private static boolean llllIIlllIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var1;
        bc var2;
        Player player = Players.getLocal();
        if (!bc.llllIIlllIIIll(player) || bc.llllIIlllIIlII(player.isAnimating() ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        WorldPoint var3 = var2.bR.u();
        WorldPoint var4 = var1.getWorldLocation();
        if (!bc.llllIIlllIIIll(var3) || bc.llllIIlllIIlII(var2.bR.b(var4) ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        if (bc.llllIIlllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            int[] nArray = new int[llIIIIlllllI[1]];
            nArray[bc.llIIIIlllllI[0]] = llIIIIlllllI[2];
            Item var5 = Inventory.getFirst((int[])nArray);
            if (bc.llllIIlllIIIll(var5)) {
                var5.interact(llIIIIllllII[llIIIIlllllI[0]]);
            }
            return llIIIIlllllI[1];
        }
        Movement.walkTo((WorldPoint)var2_2);

        return llIIIIlllllI[1];
    }

}

