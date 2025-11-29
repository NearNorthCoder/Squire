/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Picking the lock")
public class PickingTheLockTask
extends ThievingTaskBase {
    
     WorldArea ag;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        w var1;
        void var2;
        Player player = Players.getLocal();
        if (w.lIllIIIlIllIIIl(player)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (!w.lIllIIIlIllIIll(var2.isAnimating() ? 1 : 0) || w.lIllIIIlIllIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(var1.ag.contains((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIllIlIlI[4], lIIllIllIlIlI[5], lIIllIllIlIlI[3]), (boolean)lIIllIllIlIlI[3]);

            return lIIllIllIlIlI[6];
        }
        String[] stringArray = new String[lIIllIllIlIlI[6]];
        stringArray[w.lIIllIllIlIlI[3]] = lIIllIllIlIIl[lIIllIllIlIlI[3]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIIlIllIIIl(var3)) {
            return lIIllIllIlIlI[3];
        }
        var2_2.interact(lIIllIllIlIIl[lIIllIllIlIlI[6]]);
        return lIIllIllIlIlI[6];
    }

    @Inject
    public PickingTheLockTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ag = new WorldArea(lIIllIllIlIlI[0], lIIllIllIlIlI[1], lIIllIllIlIlI[2], lIIllIllIlIlI[2], lIIllIllIlIlI[3]);
    }

    private static boolean lIllIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIlIlIllll() {
        lIIllIllIlIIl = new String[lIIllIllIlIlI[7]];
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[3]] = "Stone chest";
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[6]] = "Picklock";
    }

    private static boolean lIllIIIlIllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        w.lIllIIIlIllIIII();
        w.lIllIIIlIlIllll();
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

