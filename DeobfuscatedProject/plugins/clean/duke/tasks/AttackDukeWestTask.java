/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attack Duke West", priority=300, blocking=true)
public class AttackDukeWestTask
extends Task {
    
    final  a aF;
    
    final  SquireDukeSucellus aE;

    private static boolean lllIIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lllIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIIllllIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var1;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllIIlllIlllll(nPC.getName().equals(lIllIlIIlllI[lIllIlIIllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[2]];
                if (s.lllIIlllIlllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];

                    if (((0x7D ^ 0x3A) & ~(0xF7 ^ 0xB0)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(nPC2)) {
            return lIllIlIIllll[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lllIIlllIlllll(tileObject.getName().equals(lIllIlIIlllI[lIllIlIIllll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[4]];
                if (s.lllIIlllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];

                    if (((0x42 ^ 0x46) & ~(0x34 ^ 0x30)) < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(var2)) {
            return lIllIlIIllll[0];
        }
        Player var3 = Players.getLocal();
        if (s.lllIIlllIllllI(var3)) {
            return lIllIlIIllll[0];
        }
        if (!s.lllIIlllIlllll(e.l(var2).contains((Locatable)var3) ? 1 : 0) || s.lllIIllllIIIII(e.q(var2) ? 1 : 0)) {
            return lIllIlIIllll[0];
        }
        int var4 = Static.getClient().getTickCount();
        var1.aE.b(lIllIlIIllll[0]);
        if (s.lllIIllllIIIIl(var4 - var1.aF.D(), lIllIlIIllll[1]) && s.lllIIllllIIIlI(var4 - var1.aF.C(), lIllIlIIllll[2])) {
            void var5;
            int var6;
            int n2;
            Actor var7 = Players.getLocal().getInteracting();
            if (s.lllIIllllIIIll(var7) && s.lllIIlllIlllll(var7.hasAction(lIllIlIIlllI[lIllIlIIllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlIIllll[3];

                if (2 != 2) {
                    return ((0x5B ^ 0x46 ^ (0x30 ^ 0x21)) & (111 + 55 - 148 + 137 ^ 86 + 111 - 129 + 83 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlIIllll[0];
            }
            if (s.lllIIlllIlllll(var6 = n2)) {
                return lIllIlIIllll[3];
            }
            var5.interact(lIllIlIIlllI[lIllIlIIllll[3]]);
            return lIllIlIIllll[3];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlIIllll[3];
    }

    private static boolean lllIIllllIIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public AttackDukeWestTask(SquireDukeSucellus squireDukeSucellus) {
        this.aE = squireDukeSucellus;
        this.aF = squireDukeSucellus.AttackDukeWestTask();
    }

    private static void lllIIlllIlllII() {
        lIllIlIIlllI = new String[lIllIlIIllll[6]];
        s.lIllIlIIlllI[s.lIllIlIIllll[0]] = "Attack";
        s.lIllIlIIlllI[s.lIllIlIIllll[3]] = "Attack";
        s.lIllIlIIlllI[s.lIllIlIIllll[1]] = "Gate";
        s.lIllIlIIlllI[s.lIllIlIIllll[4]] = "Quick-escape";
        s.lIllIlIIlllI[s.lIllIlIIllll[5]] = "Duke Sucellus";
        s.lIllIlIIlllI[s.lIllIlIIllll[2]] = "Attack";
    }

    private static boolean lllIIllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var8);
    }

    static {
        s.lllIIlllIlllIl();
        s.lllIIlllIlllII();
    }

}

