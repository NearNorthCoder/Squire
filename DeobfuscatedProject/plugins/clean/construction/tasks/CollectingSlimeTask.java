/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.GameEnum74;
import gg.squire.construction.tasks.ConstructionTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Collecting slime", priority=10, blocking=true, register=true)
public class CollectingSlimeTask
extends ConstructionTaskBase {

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        void llIIlllIIlllIIl;
        if (ar.lllIIlIlIl(am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            return;
        }
        if (ar.lllIIlIlll(llIIlllIIlllIIl.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && ar.lllIIllIII(llIIlllIIlllIIl.getItemId(), lIIIIIlII[12])) {
            ar llIIlllIIlllIlI;
            llIIlllIIlllIlI.dd.s(llIIlllIIlllIlI.dd.bn() + lIIIIIlII[1]);
        }
    }

    static {
        ar.lllIIlIIlI();
        ar.lllIIlIIIl();
    }

    private static boolean lllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(llIIlllIIIlIIlI);
    }

    private static boolean lllIIlIlII(Object object) {
        return object != null;
    }

    private static boolean lllIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIlIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var2_2;
        void var3_3;
        block12: {
            block11: {
                if (ar.lllIIlIIll(this.dd.r() ? 1 : 0)) {
                    return lIIIIIlII[0];
                }
                int[] nArray = new int[lIIIIIlII[1]];
                nArray[ar.lIIIIIlII[0]] = lIIIIIlII[2];
                if (!ar.lllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                int[] nArray2 = new int[lIIIIIlII[1]];
                nArray2[ar.lIIIIIlII[0]] = lIIIIIlII[3];
                if (!ar.lllIIlIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block12;
            }
            return lIIIIIlII[0];
        }
        TileObject llIIlllIIllllll = TileObjects.getNearest(tileObject -> tileObject.getName().equals(lIIIIIIll[lIIIIIlII[13]]));
        if (ar.lllIIlIIll(am.ECTOFUNTUS.bo() ? 1 : 0) && ar.lllIIlIlII(llIIlllIIllllll)) {
            String[] stringArray = new String[lIIIIIlII[1]];
            stringArray[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[0]];
            if (ar.lllIIlIIll(llIIlllIIllllll.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIIIIIIll[lIIIIIlII[1]]);
                llIIlllIIllllll.interact(lIIIIIIll[lIIIIIlII[4]]);
                return lIIIIIlII[1];
            }
            String[] stringArray2 = new String[lIIIIIlII[1]];
            stringArray2[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[5]];
            if (ar.lllIIlIIll(llIIlllIIllllll.hasAction(stringArray2) ? 1 : 0)) {
                Log.info((String)lIIIIIIll[lIIIIIlII[6]]);
                llIIlllIIllllll.interact(lIIIIIIll[lIIIIIlII[7]]);
                return lIIIIIlII[1];
            }
            Log.info((String)lIIIIIIll[lIIIIIlII[8]]);
            return lIIIIIlII[0];
        }
        if (ar.lllIIlIlIl(am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            if (ar.lllIIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return lIIIIIlII[0];
            }
            Log.info((String)lIIIIIIll[lIIIIIlII[9]]);
            return Movement.walkTo((WorldArea)am.SLIME_COLLECTION.bp());
        }
        String[] stringArray = new String[lIIIIIlII[1]];
        stringArray[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[10]];
        TileObject llIIlllIIlllllI = TileObjects.getNearest((String[])stringArray);
        if (ar.lllIIlIllI(llIIlllIIlllllI)) {
            Log.info((String)lIIIIIIll[lIIIIIlII[11]]);
            return lIIIIIlII[0];
        }
        int[] nArray = new int[lIIIIIlII[1]];
        nArray[ar.lIIIIIlII[0]] = lIIIIIlII[2];
        Item llIIlllIIllllIl = Inventory.getFirst((int[])nArray);
        if (ar.lllIIlIllI(llIIlllIIllllIl)) {
            return lIIIIIlII[0];
        }
        var3_3.useOn((TileObject)var2_2);
        return lIIIIIlII[1];
    }

    private static boolean lllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlIllI(Object object) {
        return object == null;
    }

    private static boolean lllIIlIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lllIIlIIIl() {
        lIIIIIIll = new String[lIIIIIlII[14]];
        ar.lIIIIIIll[ar.lIIIIIlII[0]] = "Open";
        ar.lIIIIIIll[ar.lIIIIIlII[1]] = "Opening trapdoor";
        ar.lIIIIIIll[ar.lIIIIIlII[4]] = "Open";
        ar.lIIIIIIll[ar.lIIIIIlII[5]] = "Climb-down";
        ar.lIIIIIIll[ar.lIIIIIlII[6]] = "Climbing down trapdoor";
        ar.lIIIIIIll[ar.lIIIIIlII[7]] = "Climb-down";
        ar.lIIIIIIll[ar.lIIIIIlII[8]] = "Reached end of trapdoor handler";
        ar.lIIIIIIll[ar.lIIIIIlII[9]] = "Walking to the slime collection area.";
        ar.lIIIIIIll[ar.lIIIIIlII[10]] = "Pool of Slime";
        ar.lIIIIIIll[ar.lIIIIIlII[11]] = "pool nulled";
        ar.lIIIIIIll[ar.lIIIIIlII[13]] = "Trapdoor";
    }

    @Inject
    public CollectingSlimeTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }
}

