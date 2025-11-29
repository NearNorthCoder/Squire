/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import gg.squire.woodcutting.tasks.GameEnum;

@TaskDesc(name="Walking to next tile", priority=80)
public class WalkingToNextTileTask
extends Task {
    
    private final  SquireWoodcutterPlugin O;
    
    private final  SquireWoodcutterConfig P;

    @Inject
    public WalkingToNextTileTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.O = squireWoodcutterPlugin;
        this.P = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIIllllIl(Object object) {
        return object == null;
    }

    private WorldPoint b(TileObject tileObject, i i2) {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return Walker.nearestWalkableTile((WorldPoint)tileObject.getWorldLocation(), worldPoint2 -> {
            int n;
            if (m.llIIIlIIIllllII(i2.w().contains(worldPoint2) ? 1 : 0) && m.llIIIlIIIlllllI(worldPoint2.distanceTo(worldPoint), lIllIIIIllIIl[1]) && m.llIIIlIIIllllII(worldPoint2.distanceTo(worldPoint))) {
                n = lIllIIIIllIIl[1];

                if (((0x53 ^ 0x71 ^ (0x19 ^ 4)) & (0x5F ^ 0x42 ^ (0x59 ^ 0x7B) ^ -1)) != 0) {
                    return false;
                }
            } else {
                n = lIllIIIIllIIl[0];
            }
            return n != 0;
        });
    }

    private static boolean llIIIlIIIlllllI(int n, int n2) {
        return n <= n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        m var1;
        if (m.llIIIlIIIlllIll(this.P.fastTickChop() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(var1.O.p() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(var1.P.pickUpNest() ? 1 : 0) && m.llIIIlIIIllllII(var1.O.a() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIlllIll(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (m.llIIIlIIIllllII(tileObject.getName().equals(this.P.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIllIIl[1]];
                stringArray[m.lIllIIIIllIIl[0]] = lIllIIIIllIII[lIllIIIIllIIl[0]];
                if (m.llIIIlIIIllllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIllIIl[1];

                    if (-1 < 3) return n != 0;
                    return false;
                }
            }
            n = lIllIIIIllIIl[0];
            return n != 0;
        });
        if (m.llIIIlIIIllllIl(var2)) {
            return lIllIIIIllIIl[0];
        }
        i var3 = i.b(var2);
        Player var4 = Players.getLocal();
        if (m.llIIIlIIIllllIl((Object)var3)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIlllllI(var4.distanceTo((Locatable)var2), var1.O.WalkingToNextTileTask())) {
            var1.O.h();
        }
        if (m.llIIIlIIIllllII(var4.isMoving() ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        WorldPoint var5 = var1.b(var2, var3);
        if (m.llIIIlIIIllllIl(var5)) {
            return lIllIIIIllIIl[0];
        }
        if (m.llIIIlIIIllllII(var5.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIllIIIIllIIl[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(lIllIIIIllIIl[1]);
        return lIllIIIIllIIl[1];
    }

    private static boolean llIIIlIIIlllIll(int n) {
        return n == 0;
    }

    private static void llIIIlIIIlllIIl() {
        lIllIIIIllIII = new String[lIllIIIIllIIl[1]];
        m.lIllIIIIllIII[m.lIllIIIIllIIl[0]] = "Chop down";
    }

    static {
        m.llIIIlIIIlllIlI();
        m.llIIIlIIIlllIIl();
    }

    private static boolean llIIIlIIIllllII(int n) {
        return n != 0;
    }
}

