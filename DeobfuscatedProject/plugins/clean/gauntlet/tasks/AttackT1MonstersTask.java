/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Attack T1 Monsters", priority=2)
public class AttackT1MonstersTask
extends GauntletTaskBase {
    
    private final  b ca;

    private static boolean lIIIIIIIlIIlllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public AttackT1MonstersTask(c c2, b b2) {
        d[] dArray = new d[llIlIIIIIIlI[0]];
        dArray[P.llIlIIIIIIlI[1]] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
        this.ca = b2;
    }

    private static boolean lIIIIIIIlIIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIlIIllII(int n2) {
        return n2 == 0;
    }

    private static  int b(Player player, NPC nPC) {
        return nPC.distanceTo(player.getWorldLocation());
    }

    static {
        P.lIIIIIIIlIIlIlI();
        P.lIIIIIIIlIIlIIl();
    }

    private static boolean lIIIIIIIlIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        NPC var2;
        int n2;
        int var3;
        int n3;
        P var4;
        Player player = Players.getLocal();
        if (!P.lIIIIIIIlIIlIll(player) || P.lIIIIIIIlIIlIll(player.getInteracting())) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(var4.ba.B() ? 1 : 0)) {
            return llIlIIIIIIlI[1];
        }
        h var5 = var4.ba.V();
        l var6 = var5.ar().orElse(null);
        if (!P.lIIIIIIIlIIlIll(var6) || P.lIIIIIIIlIIllIl(var6, var5.av())) {
            n3 = llIlIIIIIIlI[0];

            if (2 < 0) {
                return false;
            }
        } else {
            n3 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIlllI(var3 = n3)) {
            n2 = llIlIIIIIIlI[0];

            if (-(0x4C ^ 0x24 ^ (0xED ^ 0x81)) >= 0) {
                return ((0xC0 ^ 0xA0 ^ (0x3F ^ 1)) & (0xDF ^ 0x95 ^ (0x8B ^ 0x9F) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllll(var2 = (NPC)NPCs.getAll((int[])e.as[n2]).stream().filter(nPC -> {
            boolean bl;
            if (P.lIIIIIIIlIIllII(nPC.isDead() ? 1 : 0)) {
                bl = llIlIIIIIIlI[0];

                if (((59 + 111 - 151 + 132 ^ 135 + 113 - 238 + 157) & (103 + 47 - -5 + 31 ^ 9 + 108 - 24 + 45 ^ -1)) != 0) {
                    return ((0x60 ^ 9 ^ (0xC3 ^ 0xA3)) & (0x23 ^ 0x63 ^ (0xDF ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = llIlIIIIIIlI[1];
            }
            return bl;
        }).min(Comparator.comparingInt(arg_0 -> P.b((Player)var1, arg_0))).orElse(null))) {
            return llIlIIIIIIlI[1];
        }
        if (P.lIIIIIIIlIIllII(var4.ca.t() ? 1 : 0) && P.lIIIIIIIlIIllII(var1.isMoving() ? 1 : 0)) {
            var2.interact(llIlIIIIIIIl[llIlIIIIIIlI[1]]);
            var4.ca.c(llIlIIIIIIlI[2]);
        }
        return llIlIIIIIIlI[0];
    }

    private static void lIIIIIIIlIIlIIl() {
        llIlIIIIIIIl = new String[llIlIIIIIIlI[0]];
        P.llIlIIIIIIIl[P.llIlIIIIIIlI[1]] = "Attack";
    }

}

