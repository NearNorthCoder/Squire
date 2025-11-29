/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.GraphicsObject
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
import net.runelite.api.GraphicsObject;
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

@TaskDesc(name="Attack Duke East", priority=300, blocking=true)
public class AttackDukeEastTask
extends Task {
    final  SquireDukeSucellus aC;
    final  a aD;

    private static boolean lllIlIlIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var1;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllIlIlIIlIllI(nPC.getName().equals(lIllIllllllI[lIllIlllllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[3]];
                if (r.lllIlIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];

                    if (((0x5B ^ 0x65) & ~(0x73 ^ 0x4D)) == ((0xB2 ^ 0x8F) & ~(0x25 ^ 0x18))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(nPC2)) {
            return lIllIlllllll[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lllIlIlIIlIllI(tileObject.getName().equals(lIllIllllllI[lIllIlllllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[4]];
                if (r.lllIlIlIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(var2)) {
            return lIllIlllllll[0];
        }
        Player var3 = Players.getLocal();
        if (r.lllIlIlIIlIlIl(var3)) {
            return lIllIlllllll[0];
        }
        if (!r.lllIlIlIIlIllI(e.l(var2).contains((Locatable)var3) ? 1 : 0) || r.lllIlIlIIlIlll(e.AttackDukeEastTask(var2) ? 1 : 0)) {
            return lIllIlllllll[0];
        }
        GraphicsObject var4 = var1.aD.B();
        int var5 = Static.getClient().getTickCount();
        var1.aC.b(lIllIlllllll[1]);
        if (r.lllIlIlIIllIII(var5 - var1.aD.D(), lIllIlllllll[2]) && r.lllIlIlIIllIIl(var5 - var1.aD.C(), lIllIlllllll[3])) {
            void var6;
            int var7;
            int n2;
            Actor var8 = Players.getLocal().getInteracting();
            if (r.lllIlIlIIllIlI(var8) && r.lllIlIlIIlIllI(var8.hasAction(lIllIllllllI[lIllIlllllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlllllll[1];

                if ((0x57 ^ 0x53) == 2) {
                    return false;
                }
            } else {
                n2 = lIllIlllllll[0];
            }
            if (r.lllIlIlIIlIllI(var7 = n2)) {
                return lIllIlllllll[1];
            }
            var6.interact(lIllIllllllI[lIllIlllllll[1]]);
            return lIllIlllllll[1];
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlllllll[1];
    }

    private static boolean lllIlIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIlIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public AttackDukeEastTask(SquireDukeSucellus squireDukeSucellus) {
        this.aC = squireDukeSucellus;
        this.aD = squireDukeSucellus.s();
    }

        return String.valueOf(var9);
    }

    static {
        r.lllIlIlIIlIlII();
        r.lllIlIlIIlIIll();
    }

    private static boolean lllIlIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllIlIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIlIlIIlIIll() {
        lIllIllllllI = new String[lIllIlllllll[6]];
        r.lIllIllllllI[r.lIllIlllllll[0]] = "Attack";
        r.lIllIllllllI[r.lIllIlllllll[1]] = "Attack";
        r.lIllIllllllI[r.lIllIlllllll[2]] = "Gate";
        r.lIllIllllllI[r.lIllIlllllll[4]] = "Quick-escape";
        r.lIllIllllllI[r.lIllIlllllll[5]] = "Duke Sucellus";
        r.lIllIllllllI[r.lIllIlllllll[3]] = "Attack";
    }
}

