/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Resetting aggro")
public class ResettingAggroTask
extends Task {
    
    private  long bj;
    
    private final  ResetPlugin bi;

    private static boolean llIIIllIllI(Object object) {
        return object != null;
    }

    public boolean run() {
        E lIlIlIllIIlIllI;
        if (E.llIIIllIlII(this.bi.ae() ? 1 : 0)) {
            return lllIIllll[0];
        }
        long lIlIlIllIIlIlIl = System.currentTimeMillis() - lIlIlIllIIlIllI.bi.ag();
        if (E.llIIIllIlIl(E.llIIIllIIlI(lIlIlIllIIlIlIl, lIlIlIllIIlIllI.bi.ak()[lllIIllll[0]]))) {
            return lllIIllll[0];
        }
        WorldPoint lIlIlIllIIlIlII = lIlIlIllIIlIllI.bi.aj();
        Player lIlIlIllIIlIIll = Players.getLocal();
        if (!E.llIIIllIllI(lIlIlIllIIlIlII) || !E.llIIIllIlII(lIlIlIllIIlIIll.isMoving() ? 1 : 0) || E.llIIIllIllI(lIlIlIllIIlIIll.getInteracting()) && E.llIIIllIlll(lIlIlIllIIlIllI.bi.ai().equals((Object)lIlIlIllIIlIIll.getWorldLocation()) ? 1 : 0)) {
            return lllIIllll[0];
        }
        List lIlIlIllIIlIIlI = NPCs.getAll(nPC -> {
            int n2;
            if (E.llIIIlllIIl(nPC.getInteracting(), lIlIlIllIIlIIll)) {
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[E.lllIIllll[0]] = lllIIlllI[lllIIllll[1]];
                if (E.llIIIllIlll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllll[1];

                    if (-(0x7B ^ 0x24 ^ (2 ^ 0x59)) < 0) return n2 != 0;
                    return ((0xC8 ^ 0x8D ^ (0xAF ^ 0xB6)) & (0x4D ^ 0x71 ^ (0x7B ^ 0x1B) ^ -1)) != 0;
                }
            }
            n2 = lllIIllll[0];
            return n2 != 0;
        });
        if (E.llIIIllIlII(lIlIlIllIIlIIlI.isEmpty() ? 1 : 0)) {
            NPC lIlIlIllIIlIIIl = (NPC)lIlIlIllIIlIIlI.get(lllIIllll[0]);
            if (E.llIIIllIllI(lIlIlIllIIlIIIl) && E.llIIIlllIII(E.llIIIllIIll(lIlIlIllIIlIIIl.getWorldLocation().distanceTo2DHypotenuse(lIlIlIllIIlIIll.getWorldLocation()), 1.0f))) {
                lIlIlIllIIlIIIl.interact(lllIIlllI[lllIIllll[0]]);
            }
            return lllIIllll[0];
        }
        WorldPoint lIlIlIllIIlIIIl = lIlIlIllIIlIIll.getWorldLocation();
        if (E.llIIIllIlll(lIlIlIllIIlIlII.equals((Object)lIlIlIllIIlIIIl) ? 1 : 0)) {
            if (E.llIIIllIlII(E.llIIIllIIlI(lIlIlIllIIlIllI.bj, -1L))) {
                lIlIlIllIIlIllI.bj = System.currentTimeMillis();
                return lllIIllll[0];
            }
            long lIlIlIllIIlIIII = System.currentTimeMillis() - lIlIlIllIIlIllI.bj;
            if (E.llIIIllIlIl(E.llIIIllIIlI(lIlIlIllIIlIIII, lIlIlIllIIlIllI.bi.ak()[lllIIllll[1]]))) {
                return lllIIllll[0];
            }
            Movement.walk((WorldPoint)lIlIlIllIIlIllI.bi.ai());
            lIlIlIllIIlIllI.bi.ac();
            lIlIlIllIIlIllI.bj = -1L;

            if (-1 > 3) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            Movement.walk((WorldPoint)lIlIlIllIIlIlII);
        }
        return lllIIllll[1];
    }

    static {
        E.llIIIllIIIl();
        E.llIIIllIIII();
    }

    private static boolean llIIIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public ResettingAggroTask(ResetPlugin resetPlugin) {
        this.bj = -1L;
        this.bi = resetPlugin;
    }

    private static boolean llIIIllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIII(int n2) {
        return n2 <= 0;
    }

    private static void llIIIllIIII() {
        lllIIlllI = new String[lllIIllll[2]];
        E.lllIIlllI[E.lllIIllll[0]] = "Attack";
        E.lllIIlllI[E.lllIIllll[1]] = "Attack";
    }

    private static boolean llIIIllIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIllIlII(int n2) {
        return n2 == 0;
    }

    private static int llIIIllIIll(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static int llIIIllIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

        return String.valueOf(lIlIlIlIlllllll);
    }
}

