/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Salax Salt", priority=80, blocking=true)
public class CollectSalaxSaltTask
extends Task {
    private final  a bG;
    private final  SquireDukeSucellus bF;

    static {
        Q.lllIIllIIIlIIl();
        Q.lllIIllIIIlIII();
    }

        return String.valueOf(var1);
    }

    private static boolean lllIIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIllIIIlIII() {
        lIllIIlllIIl = new String[lIllIIlllIlI[7]];
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[0]] = "Salax salt";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[1]] = "Salt Deposit";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[3]] = "Mine";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[5]] = "Gate";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[6]] = "Quick-escape";
    }

    private static boolean lllIIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllIIIlIll(Object object) {
        return object == null;
    }

    @Inject
    public CollectSalaxSaltTask(SquireDukeSucellus squireDukeSucellus) {
        this.bF = squireDukeSucellus;
        this.bG = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        NPC var2;
        if (Q.lllIIllIIIlIlI(this.bG.x())) {
            return lIllIIlllIlI[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lllIIllIIIlIlI(tileObject.getName().equals(lIllIIlllIIl[lIllIIlllIlI[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllIlI[1]];
                stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[6]];
                if (Q.lllIIllIIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllIlI[1];

                    if ((0x99 ^ 0x9D) == (0x6D ^ 0x69)) return n2 != 0;
                    return (3 & ~3) != 0;
                }
            }
            n2 = lIllIIlllIlI[0];
            return n2 != 0;
        });
        if (Q.lllIIllIIIlIll(var3)) {
            return lIllIIlllIlI[0];
        }
        Player var4 = Players.getLocal();
        if (Q.lllIIllIIIlIll(var4)) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray = new String[lIllIIlllIlI[1]];
        stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[0]];
        Item var5 = Inventory.getFirst((String[])stringArray);
        if (Q.lllIIllIIIllII(var5) && Q.lllIIllIIIllIl(var5.getQuantity(), lIllIIlllIlI[2])) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray2 = new String[lIllIIlllIlI[1]];
        stringArray2[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[1]];
        TileObject var6 = TileObjects.getNearest((String[])stringArray2);
        if (Q.lllIIllIIIlIll(var6)) {
            return lIllIIlllIlI[0];
        }
        if (Q.lllIIllIIIlIlI(e.i(var3).contains((Locatable)var4) ? 1 : 0) && Q.lllIIllIIIllII(var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (Q.lllIIllIIIlllI(nPC.getId(), e.I) && Q.lllIIllIIIllll(nPC.getGraphic(), lIllIIlllIlI[4])) {
                n2 = lIllIIlllIlI[1];

                if (-(5 ^ 1) >= 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlllIlI[0];
            }
            return n2 != 0;
        }))) {
            return lIllIIlllIlI[1];
        }
        var4_4.interact(lIllIIlllIIl[lIllIIlllIlI[3]]);
        return lIllIIlllIlI[1];
    }

    private static boolean lllIIllIIIllII(Object object) {
        return object != null;
    }

    private static boolean lllIIllIIIllll(int n2, int n3) {
        return n2 != n3;
    }

}

