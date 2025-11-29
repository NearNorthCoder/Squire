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
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

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

/* TASK: Attack NPC -> AttacknpcTask */
@TaskDesc(name="Attack NPC", priority=3, blocking=true)
public class AttackNpcTask
extends Task {
    private static /* synthetic */ int[] lIIIlIIIlIIll;
    private /* synthetic */ int E;
    private final /* synthetic */ Client D;
    private final /* synthetic */ SquireNightmareZoneConfig C;
    private final /* synthetic */ SquireNightmareZone B;
    private static /* synthetic */ String[] lIIIlIIIlIIlI;

    private static boolean lIIllllIIlllIll(int n2) {
        return n2 == 0;
    }

    private static String lIIllllIIllIlIl(String var4, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIIll[4]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIIlIIIlIIll[3], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIllllIIllIllI() {
        lIIIlIIIlIIlI = new String[lIIIlIIIlIIll[3]];
        d.lIIIlIIIlIIlI[d.lIIIlIIIlIIll[0]] = d."Nothing to attack! We are either starting dream or nothing is in range";
        d.lIIIlIIIlIIlI[d.lIIIlIIIlIIll[1]] = d."Attack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        d var3;
        if (d.lIIllllIIlllIll(this.D.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIll[0];
        }
        if (d.lIIllllIIllllII(Players.getLocal().getInteracting() instanceof NPC)) {
            var3.E = lIIIlIIIlIIll[0];
            return lIIIlIIIlIIll[0];
        }
        var3.E += lIIIlIIIlIIll[1];
        if (d.lIIllllIIllllIl(var3.E, lIIIlIIIlIIll[2])) {
            return lIIIlIIIlIIll[0];
        }
        NPC var1 = Combat.getAttackableNPC(nPC -> {
            boolean bl;
            if (d.lIIllllIIlllIll(nPC.isDead() ? 1 : 0)) {
                bl = lIIIlIIIlIIll[1];
                0;
                if ((0x68 ^ 0x6C) < 0) {
                    return false;
                }
            } else {
                bl = lIIIlIIIlIIll[0];
            }
            return bl;
        });
        if (d.lIIllllIIlllllI(var1)) {
            System.out.println(lIIIlIIIlIIlI[lIIIlIIIlIIll[0]]);
            return lIIIlIIIlIIll[0];
        }
        var1_1.interact(lIIIlIIIlIIlI[lIIIlIIIlIIll[1]]);
        return lIIIlIIIlIIll[1];
    }

    private static void lIIllllIIlllIlI() {
        lIIIlIIIlIIll = new int[5];
        d.lIIIlIIIlIIll[0] = (1 ^ 0x33) & ~(0x33 ^ 1);
        d.lIIIlIIIlIIll[1] = 1;
        d.lIIIlIIIlIIll[2] = 40 + 71 - 79 + 116 ^ 143 + 21 - 38 + 32;
        d.lIIIlIIIlIIll[3] = 2;
        d.lIIIlIIIlIIll[4] = 0x4D ^ 0x45;
    }

    private static boolean lIIllllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public d(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
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

