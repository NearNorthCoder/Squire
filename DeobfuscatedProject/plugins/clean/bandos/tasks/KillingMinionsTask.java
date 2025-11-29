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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
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
import gg.squire.bandos.tasks.GameEnum;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {
    
    private final  e aa;
    
    private final  SquireBandosConfig ab;

    static {
        q.lIlIlllIIlIlIl();
        q.lIlIlllIIlIlII();
    }

    /*
     * WARNING - void declaration
     */
    private NPC N() {
        int[] nArray = new int[lllIIIlllIl[1]];
        nArray[q.lllIIIlllIl[0]] = b.STEELWILL.d();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (q.lIlIlllIIllIII(nPC2) && q.lIlIlllIIllIIl(nPC2.isDead() ? 1 : 0)) {
            void var1;
            return var1;
        }
        int[] nArray2 = new int[lllIIIlllIl[1]];
        nArray2[q.lllIIIlllIl[0]] = b.STRONGSACK.d();
        NPC var2 = NPCs.getNearest((int[])nArray2);
        if (q.lIlIlllIIllIII(var2) && q.lIlIlllIIllIIl(var2.isDead() ? 1 : 0)) {
            return var2;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (q.lIlIlllIIllIIl(nPC.isDead() ? 1 : 0) && q.lIlIlllIIlllII(nPC.getId(), b.GRIMSPIKE.d())) {
                n2 = lllIIIlllIl[1];

                if (((0x5B ^ 0x11) & ~(0xEC ^ 0xA6)) > 1) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIl[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIlIlllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlllIIlIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var3;
        if (!q.lIlIlllIIlIllI(this.aa.t() ? 1 : 0) || q.lIlIlllIIlIllI(this.aa.s() ? 1 : 0)) {
            return lllIIIlllIl[0];
        }
        NPC var4 = var3.N();
        if (q.lIlIlllIIlIlll(var4)) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIllIII(Players.getLocal().getInteracting())) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIlIllI(var3.ab.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lllIIIlllIl[1]];
            stringArray[q.lllIIIlllIl[0]] = lllIIIlllII[lllIIIlllIl[0]];
            Item var5 = Inventory.getFirst((String[])stringArray);
            if (q.lIlIlllIIllIII(var5)) {
                var5.interact(lllIIIlllII[lllIIIlllIl[1]]);
                return lllIIIlllIl[1];
            }
            if (q.lIlIlllIIllIIl(Combat.isSpecEnabled() ? 1 : 0) && q.lIlIlllIIllIlI(Combat.getSpecEnergy(), lllIIIlllIl[2]) && q.lIlIlllIIllIll(Combat.getMissingHealth(), lllIIIlllIl[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lllIIIlllII[lllIIIlllIl[4]]);
        this.sleep(lllIIIlllIl[4]);
        return lllIIIlllIl[1];
    }

    private static boolean lIlIlllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIIlIlII() {
        lllIIIlllII = new String[lllIIIlllIl[5]];
        q.lllIIIlllII[q.lllIIIlllIl[0]] = "Toxic blowpipe";
        q.lllIIIlllII[q.lllIIIlllIl[1]] = "Wield";
        q.lllIIIlllII[q.lllIIIlllIl[4]] = "Attack";
    }

    @Inject
    public KillingMinionsTask(e e2, SquireBandosConfig squireBandosConfig) {
        this.aa = e2;
        this.ab = squireBandosConfig;
    }

    private static boolean lIlIlllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIlllIIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIllIII(Object object) {
        return object != null;
    }
}

