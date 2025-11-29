/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Start Fight", priority=201, blocking=true)
public class StartFightTask
extends Task {
    
    final  a bo;
    
    final  SquireDukeSucellus bn;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        if (H.lllIlIIlllllll(this.bo.y(), lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        Player var1 = Players.getLocal();
        if (H.lllIlIlIIIIIII(var1)) {
            return lIllIllllIII[1];
        }
        String[] stringArray = new String[lIllIllllIII[2]];
        stringArray[H.lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[1]];
        int var2 = Inventory.getCount((String[])stringArray);
        if (H.lllIlIlIIIIIIl(var2, lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (H.lllIlIlIIIIIlI(tileObject.getName().equals(lIllIlllIIIl[lIllIllllIII[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllllIII[2]];
                stringArray[H.lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[0]];
                if (H.lllIlIlIIIIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllllIII[2];

                    if (1 >= 0) return n2 != 0;
                    return ((0xFA ^ 0x89 ^ (0xDF ^ 0xAA)) & (6 ^ 0x1E ^ (0x53 ^ 0x4D) ^ -1)) != 0;
                }
            }
            n2 = lIllIllllIII[1];
            return n2 != 0;
        });
        if (H.lllIlIlIIIIIII(var3)) {
            return lIllIllllIII[1];
        }
        if (H.lllIlIlIIIIIlI(e.l(var3).contains((Locatable)var1) ? 1 : 0)) {
            return lIllIllllIII[1];
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (H.lllIlIlIIIIlII(nPC.getId(), e.I) && H.lllIlIlIIIIIIl(nPC.getGraphic(), lIllIllllIII[3])) {
                n2 = lIllIllllIII[2];

                if (((3 ^ 0x7F ^ (0x33 ^ 0x44)) & (38 + 60 - 89 + 140 ^ 37 + 11 - 43 + 153 ^ -1)) < -1) {
                    return ((0xB8 ^ 0xAD ^ (0x6E ^ 0x30)) & (3 ^ (0x56 ^ 0x1E) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIllllIII[1];
            }
            return n2 != 0;
        });
        if (H.lllIlIlIIIIIll(var4)) {
            return lIllIllllIII[2];
        }
        Movement.setDestination((WorldPoint)e.g((TileObject)var3_3));
        return lIllIllllIII[2];
    }

    private static void lllIlIIllIlIll() {
        lIllIlllIIIl = new String[lIllIllllIII[4]];
        H.lIllIlllIIIl[H.lIllIllllIII[1]] = "Arder-musca poison";
        H.lIllIlllIIIl[H.lIllIllllIII[2]] = "Gate";
        H.lIllIlllIIIl[H.lIllIllllIII[0]] = "Quick-escape";
    }

    private static boolean lllIlIlIIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIlIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public StartFightTask(SquireDukeSucellus squireDukeSucellus) {
        this.bn = squireDukeSucellus;
        this.bo = squireDukeSucellus.s();
    }

    private static boolean lllIlIlIIIIIll(Object object) {
        return object != null;
    }

    static {
        H.lllIlIIllllllI();
        H.lllIlIIllIlIll();
    }

    private static boolean lllIlIlIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var5);
    }

    private static boolean lllIlIlIIIIIlI(int n2) {
        return n2 != 0;
    }
}

