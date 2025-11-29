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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.GameEnum16;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Killing minions", priority=2, blocking=true)
public class KillingMinionsTask
extends Task {

    private final  SquireZammyConfig ay;
    private final  l ax;

    static {
        A.llIIIlIlIlllIll();
        A.llIIIlIlIlllIII();
    }

    private static void llIIIlIlIlllIII() {
        lIllIIIllllII = new String[lIllIIIlllllI[5]];
        A.lIllIIIllllII[A.lIllIIIlllllI[0]] = "Toxic blowpipe";
        A.lIllIIIllllII[A.lIllIIIlllllI[1]] = "Wield";
        A.lIllIIIllllII[A.lIllIIIlllllI[4]] = "Attack";
    }

    @Inject
    public KillingMinionsTask(l l2, SquireZammyConfig squireZammyConfig) {
        this.ax = l2;
        this.ay = squireZammyConfig;
    }

    private static boolean llIIIlIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        A var2;
        if (!A.llIIIlIlIllllII(this.ax.B() ? 1 : 0) || A.llIIIlIlIllllII(this.ax.KillingMinionsTask() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        int[] nArray = new int[lIllIIIlllllI[1]];
        nArray[A.lIllIIIlllllI[0]] = e.BALFRUG_KREEYATH.n();
        NPC var3 = NPCs.getNearest((int[])nArray);
        if (!A.llIIIlIlIllllIl(var3) || A.llIIIlIlIllllII(var3.isDead() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        if (A.llIIIlIlIllllII(var2.ay.useBlowpipe() ? 1 : 0) && A.llIIIlIlIlllllI(Combat.getSpecEnergy(), lIllIIIlllllI[2]) && A.llIIIlIlIllllll(Combat.getMissingHealth(), lIllIIIlllllI[3])) {
            String[] stringArray = new String[lIllIIIlllllI[1]];
            stringArray[A.lIllIIIlllllI[0]] = lIllIIIllllII[lIllIIIlllllI[0]];
            Item var4 = Inventory.getFirst((String[])stringArray);
            if (A.llIIIlIlIllllIl(var4)) {
                var4.interact(lIllIIIllllII[lIllIIIlllllI[1]]);
            }
            if (A.llIIIlIllIIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
        }
        if (A.llIIIlIlIllllIl(Players.getLocal().getInteracting())) {
            return lIllIIIlllllI[0];
        }
        var1_1.interact(lIllIIIllllII[lIllIIIlllllI[4]]);
        this.sleep(lIllIIIlllllI[4]);
        return lIllIIIlllllI[1];
    }

    private static boolean llIIIlIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIlIlIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIllIIIIII(int n2) {
        return n2 == 0;
    }
}

