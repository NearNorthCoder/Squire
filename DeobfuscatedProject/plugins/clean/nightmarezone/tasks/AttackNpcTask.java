/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Attack NPC", priority=3, blocking=true)
public class AttackNpcTask
extends Task {
    
    private  int E;
    private final  Client D;
    private final  SquireNightmareZoneConfig C;
    private final  SquireNightmareZone B;

    private static boolean lIIllllIIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIllllIIllIllI() {
        lIIIlIIIlIIlI = new String[lIIIlIIIlIIll[3]];
        d.lIIIlIIIlIIlI[d.lIIIlIIIlIIll[0]] = "Nothing to attack! We are either starting dream or nothing is in range";
        d.lIIIlIIIlIIlI[d.lIIIlIIIlIIll[1]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        d var1;
        if (d.lIIllllIIlllIll(this.D.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIll[0];
        }
        if (d.lIIllllIIllllII(Players.getLocal().getInteracting() instanceof NPC)) {
            var1.E = lIIIlIIIlIIll[0];
            return lIIIlIIIlIIll[0];
        }
        var1.E += lIIIlIIIlIIll[1];
        if (d.lIIllllIIllllIl(var1.E, lIIIlIIIlIIll[2])) {
            return lIIIlIIIlIIll[0];
        }
        NPC var2 = Combat.getAttackableNPC(nPC -> {
            boolean bl;
            if (d.lIIllllIIlllIll(nPC.isDead() ? 1 : 0)) {
                bl = lIIIlIIIlIIll[1];

                if ((0x68 ^ 0x6C) < 0) {
                    return false;
                }
            } else {
                bl = lIIIlIIIlIIll[0];
            }
            return bl;
        });
        if (d.lIIllllIIlllllI(var2)) {
            System.out.println(lIIIlIIIlIIlI[lIIIlIIIlIIll[0]]);
            return lIIIlIIIlIIll[0];
        }
        var1_1.interact(lIIIlIIIlIIlI[lIIIlIIIlIIll[1]]);
        return lIIIlIIIlIIll[1];
    }

    private static boolean lIIllllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public AttackNpcTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.E = lIIIlIIIlIIll[0];
        this.B = squireNightmareZone;
        this.C = squireNightmareZoneConfig;
        this.D = client;
    }

    private static boolean lIIllllIIlllllI(Object object) {
        return object == null;
    }

    static {
        d.lIIllllIIlllIlI();
        d.lIIllllIIllIllI();
    }
}

