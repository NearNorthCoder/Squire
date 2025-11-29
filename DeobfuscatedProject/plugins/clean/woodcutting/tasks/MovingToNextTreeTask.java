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
import gg.squire.woodcutting.tasks.GameEnum;
import gg.squire.woodcutting.tasks.TrackingTheTreeTask;

@TaskDesc(name="Moving to next tree", priority=100)
public class MovingToNextTreeTask
extends Task {
    
    private final  SquireWoodcutterConfig J;
    
    private final  SquireWoodcutterPlugin I;

    private static void llIIIlIIIIlllII() {
        lIllIIIIlIIIl = new String[lIllIIIIlIIlI[4]];
        j.lIllIIIIlIIIl[j.lIllIIIIlIIlI[0]] = "Chop down";
        j.lIllIIIIlIIIl[j.lIllIIIIlIIlI[2]] = "Chop down";
    }

    private static boolean llIIIlIIIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIIIlllll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    @Inject
    public MovingToNextTreeTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.I = squireWoodcutterPlugin;
        this.J = squireWoodcutterConfig;
    }

    public boolean run() {
        j var1;
        if (j.llIIIlIIIIllllI(this.J.fastTickChop() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIlllll(var1.I.p() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        Player var2 = Players.getLocal();
        if (j.llIIIlIIIlIIIII(var2)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIllllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIlIIIIl(Movement.getRunEnergy(), lIllIIIIlIIlI[1]) && j.llIIIlIIIIllllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIllIIIIlIIlI[2];
        }
        if (j.llIIIlIIIIllllI(var1.I.MovingToNextTreeTask().contains((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var1.I.MovingToNextTreeTask().getCenter(), (boolean)lIllIIIIlIIlI[0]);

            return lIllIIIIlIIlI[2];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n;
            if (j.llIIIlIIIIlllll(tileObject.getName().equals(this.J.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIlIIlI[2]];
                stringArray[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIIl[lIllIIIIlIIlI[2]];
                if (j.llIIIlIIIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIlIIlI[2];

                    if (-2 < 0) return n != 0;
                    return ((0xDC ^ 0x8B ^ (0x18 ^ 0x6C)) & (2 ^ (0x39 ^ 0x18) ^ -1)) != 0;
                }
            }
            n = lIllIIIIlIIlI[0];
            return n != 0;
        });
        if (j.llIIIlIIIlIIIII(var3)) {
            i var4 = l.x();
            if (j.llIIIlIIIlIIIlI((Object)var4)) {
                Movement.setDestination((WorldPoint)var4.w().getNearest());
                return lIllIIIIlIIlI[2];
            }
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIllllI(var1.J.bank() ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIlIIlI[2]];
            nArray[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
            if (j.llIIIlIIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIIIlIIlI[2]];
                nArray2[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
                Inventory.dropAll((int[])nArray2);

            }
        }
        if (j.llIIIlIIIlIIIIl(var3.distanceTo((Locatable)var2), var1.I.m())) {
            var3.interact(lIllIIIIlIIIl[lIllIIIIlIIlI[0]]);
            return lIllIIIIlIIlI[2];
        }
        return lIllIIIIlIIlI[0];
    }

    private static boolean llIIIlIIIlIIIII(Object object) {
        return object == null;
    }

    static {
        j.llIIIlIIIIlllIl();
        j.llIIIlIIIIlllII();
    }

    private static boolean llIIIlIIIIllllI(int n) {
        return n == 0;
    }
}

