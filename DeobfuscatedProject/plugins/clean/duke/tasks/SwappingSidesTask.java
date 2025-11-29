/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Swapping Sides", priority=301, blocking=true)
public class SwappingSidesTask
extends Task {
    final  SquireDukeSucellus bb;
    final  a bc;

    private static void lllIIlllIllIII() {
        lIllIlIIllIl = new String[lIllIlIllIlI[4]];
        B.lIllIlIIllIl[B.lIllIlIllIlI[0]] = "Gate";
        B.lIllIlIIllIl[B.lIllIlIllIlI[1]] = "Quick-escape";
        B.lIllIlIIllIl[B.lIllIlIllIlI[2]] = "Duke Sucellus";
        B.lIllIlIIllIl[B.lIllIlIllIlI[3]] = "Attack";
    }

    private static boolean lllIlIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        B.lllIlIIIIlIIll();
        B.lllIIlllIllIII();
    }

    private static boolean lllIlIIIIlIllI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lllIlIIIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    public SwappingSidesTask(SquireDukeSucellus squireDukeSucellus) {
        this.bb = squireDukeSucellus;
        this.bc = squireDukeSucellus.s();
    }

    private static boolean lllIlIIIIlIlIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var2;
        if (B.lllIlIIIIlIlII(this.bb.k() ? 1 : 0)) {
            return lIllIlIllIlI[0];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            if (B.lllIlIIIIlIllI(nPC.getName().equals(lIllIlIIllIl[lIllIlIllIlI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[3]];
                if (B.lllIlIIIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(var3)) {
            var2.bb.c(lIllIlIllIlI[0]);
            return lIllIlIllIlI[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (B.lllIlIIIIlIllI(tileObject.getName().equals(lIllIlIIllIl[lIllIlIllIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[1]];
                if (B.lllIlIIIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];

                    if (2 != 0) return n2 != 0;
                    return (1 & ~1) != 0;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(var4)) {
            return lIllIlIllIlI[0];
        }
        int var5 = var2.bc.j() ? 1 : 0;
        if (B.lllIlIIIIlIllI(var5)) {
            if (B.lllIlIIIIlIllI(e.q(var4) ? 1 : 0)) {
                var2.bb.c(lIllIlIllIlI[0]);
                return lIllIlIllIlI[0];
            }
            Movement.setDestination((WorldPoint)e.m(var4));
            return lIllIlIllIlI[1];
        }
        if (B.lllIlIIIIlIllI(e.r(var4) ? 1 : 0)) {
            var2.bb.c(lIllIlIllIlI[0]);
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlIllIlI[1];
    }
}

