/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting")
public class LootingTask
extends Task {

    private final  SquireDagannothKings cO;

    public boolean run() {
        aj lllIlIIIlIIIIll;
        if (aj.llIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIllII[0];
        }
        Iterator<aH> lllIlIIIlIIIIlI = lllIlIIIlIIIIll.cO.p().iterator();
        while (aj.llIllIlll(lllIlIIIlIIIIlI.hasNext() ? 1 : 0)) {
            aH lllIlIIIlIIIIIl = lllIlIIIlIIIIlI.next();
            int[] nArray = new int[llIllII[1]];
            nArray[aj.llIllII[0]] = lllIlIIIlIIIIIl.P();
            TileItem lllIlIIIlIIIIII = TileItems.getFirstAt((WorldPoint)lllIlIIIlIIIIIl.cd(), (int[])nArray);
            if (aj.llIlllIII(lllIlIIIlIIIIII)) {
                if (aj.llIlllIIl(Inventory.isFull() ? 1 : 0)) {
                    lllIlIIIlIIIIII.interact(llIlIll[llIllII[0]]);
                }
                if (aj.llIllIlll(Inventory.isFull() ? 1 : 0)) {
                    Item lllIlIIIIllllll;
                    if (aj.llIllIlll(lllIlIIIlIIIIII.isStackable() ? 1 : 0)) {
                        int[] nArray2 = new int[llIllII[1]];
                        nArray2[aj.llIllII[0]] = lllIlIIIlIIIIII.getId();
                        if (aj.llIllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            lllIlIIIlIIIIII.interact(llIlIll[llIllII[1]]);
                        }
                    }
                    if (aj.llIlllIlI(lllIlIIIIllllll = Inventory.getFirst(item -> {
                        String[] stringArray = new String[llIllII[1]];
                        stringArray[aj.llIllII[0]] = llIlIll[llIllII[3]];
                        return item.hasAction(stringArray);
                    }))) {
                        return llIllII[0];
                    }
                    lllIlIIIIllllll.interact(llIlIll[llIllII[2]]);
                    return llIllII[1];
                }
            }

            if (3 != 0) continue;
            return false;
        }
        return llIllII[1];
    }

        return String.valueOf(lllIlIIIIllIIlI);
    }

    private static void llIllIlIl() {
        llIlIll = new String[llIllII[4]];
        aj.llIlIll[aj.llIllII[0]] = "Take";
        aj.llIlIll[aj.llIllII[1]] = "Take";
        aj.llIlIll[aj.llIllII[2]] = "Eat";
        aj.llIlIll[aj.llIllII[3]] = "Eat";
    }

    private static boolean llIllIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingTask(SquireDagannothKings squireDagannothKings) {
        this.cO = squireDagannothKings;
    }

    private static boolean llIlllIIl(int n2) {
        return n2 == 0;
    }

    static {
        aj.llIllIllI();
        aj.llIllIlIl();
    }

    private static boolean llIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIlI(Object object) {
        return object == null;
    }

    private static boolean llIlllIII(Object object) {
        return object != null;
    }

}

