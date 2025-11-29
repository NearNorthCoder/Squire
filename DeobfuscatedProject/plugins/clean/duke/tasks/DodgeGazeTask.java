/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Dodge Gaze", priority=500, blocking=true)
public class DodgeGazeTask
extends Task {
    final  SquireDukeSucellus aG;
    
    final  a aH;
    
    final  SquireDukeSucellusConfig aI;

    private static boolean lllIlIIllIllll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t var1;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().equals(lIllIlllIIlI[lIllIlllIIll[1]]));
        if (t.lllIlIIllIllll(nPC2)) {
            return lIllIlllIIll[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (t.lllIlIIlllIIII(tileObject.getName().equals(lIllIlllIIlI[lIllIlllIIll[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIIll[2]];
                stringArray[t.lIllIlllIIll[0]] = lIllIlllIIlI[lIllIlllIIll[2]];
                if (t.lllIlIIlllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIIll[2];

                    if (1 < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllIIll[0];
            return n2 != 0;
        });
        if (t.lllIlIIllIllll(var2)) {
            return lIllIlllIIll[0];
        }
        Player var3 = Players.getLocal();
        if (t.lllIlIIllIllll(var3)) {
            return lIllIlllIIll[0];
        }
        int var4 = Static.getClient().getTickCount();
        int var5 = var4 - var1.aH.C();
        if (t.lllIlIIlllIIII(var1.aI.safeDodge() ? 1 : 0) && !t.lllIlIIlllIIIl(var5, lIllIlllIIll[1]) || t.lllIlIIlllIIlI(var1.aI.safeDodge() ? 1 : 0) && t.lllIlIIlllIIll(var5, lIllIlllIIll[1])) {
            return lIllIlllIIll[0];
        }
        if (t.lllIlIIlllIIII(e.r(var2) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)e.o(var2));
            return lIllIlllIIll[2];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlllIIll[2];
    }

    private static void lllIlIIllIllIl() {
        lIllIlllIIlI = new String[lIllIlllIIll[3]];
        t.lIllIlllIIlI[t.lIllIlllIIll[0]] = "Gate";
        t.lIllIlllIIlI[t.lIllIlllIIll[2]] = "Quick-escape";
        t.lIllIlllIIlI[t.lIllIlllIIll[1]] = "Duke Sucellus";
    }

    @Inject
    public DodgeGazeTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aG = squireDukeSucellus;
        this.aH = squireDukeSucellus.s();
        this.aI = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllIIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        t.lllIlIIllIlllI();
        t.lllIlIIllIllIl();
    }
}

