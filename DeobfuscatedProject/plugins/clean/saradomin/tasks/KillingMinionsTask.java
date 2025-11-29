/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.GameEnum9;

@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {

    private final  SquireSaraConfig aL;
    private final  g aK;

    @Inject
    public KillingMinionsTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.aK = g2;
        this.aL = squireSaraConfig;
    }

    private static boolean lIlIllIIIIIllIl(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static void lIlIlIllllIllIl() {
        lIIlIlIlIIIlI = new String[lIIlIlIlIlIlI[5]];
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[0]] = "Toxic blowpipe";
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[1]] = "Wield";
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[4]] = "Attack";
    }

    static {
        F.lIlIllIIIIIlIlI();
        F.lIlIlIllllIllIl();
    }

    private static boolean lIlIllIIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIIIIllII(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private NPC X() {
        int[] nArray = new int[lIIlIlIlIlIlI[1]];
        nArray[F.lIIlIlIlIlIlI[0]] = k.STARLIGHT.D();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (F.lIlIllIIIIIllIl(nPC2) && F.lIlIllIIIIIlllI(nPC2.isDead() ? 1 : 0)) {
            void var2;
            return var2;
        }
        int[] nArray2 = new int[lIIlIlIlIlIlI[1]];
        nArray2[F.lIIlIlIlIlIlI[0]] = k.GROWLER.D();
        NPC var3 = NPCs.getNearest((int[])nArray2);
        if (F.lIlIllIIIIIllIl(var3) && F.lIlIllIIIIIlllI(var3.isDead() ? 1 : 0)) {
            return var3;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (F.lIlIllIIIIIlllI(nPC.isDead() ? 1 : 0) && F.lIlIllIIIIlIIIl(nPC.getId(), k.BREE.D())) {
                n2 = lIIlIlIlIlIlI[1];

                if ((0x60 ^ 0x65) == 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = lIIlIlIlIlIlI[0];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        F var4;
        if (!F.lIlIllIIIIIlIll(this.aK.m() ? 1 : 0) || F.lIlIllIIIIIlIll(this.aK.l() ? 1 : 0)) {
            return lIIlIlIlIlIlI[0];
        }
        NPC var5 = var4.X();
        if (F.lIlIllIIIIIllII(var5)) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIllIl(Players.getLocal().getInteracting())) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIlIll(var4.aL.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIlIlIlIlI[1]];
            stringArray[F.lIIlIlIlIlIlI[0]] = lIIlIlIlIIIlI[lIIlIlIlIlIlI[0]];
            Item var6 = Inventory.getFirst((String[])stringArray);
            if (F.lIlIllIIIIIllIl(var6)) {
                var6.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[1]]);
                return lIIlIlIlIlIlI[1];
            }
            if (F.lIlIllIIIIIlllI(Combat.isSpecEnabled() ? 1 : 0) && F.lIlIllIIIIIllll(Combat.getSpecEnergy(), lIIlIlIlIlIlI[2]) && F.lIlIllIIIIlIIII(Combat.getMissingHealth(), lIIlIlIlIlIlI[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[4]]);
        this.sleep(lIIlIlIlIlIlI[4]);
        return lIIlIlIlIlIlI[1];
    }

    private static boolean lIlIllIIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIIIIIlIll(int n2) {
        return n2 != 0;
    }
}

