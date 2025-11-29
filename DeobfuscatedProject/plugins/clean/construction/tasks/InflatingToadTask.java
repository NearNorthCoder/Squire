/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Inflating Toad", priority=2)
public class InflatingToadTask
extends Task {

    private static boolean llllIlIl(Object object) {
        return object != null;
    }

    static {
        ba.llllIIlI();
        ba.lllIllll();
    }

        return String.valueOf(llllIIlIlllllll);
    }

    private static void lllIllll() {
        lllIll = new String[lllllI[7]];
        ba.lllIll[ba.lllllI[0]] = "Inflate";
        ba.lllIll[ba.lllllI[1]] = "Swamp toad";
        ba.lllIll[ba.lllllI[3]] = "Inflate";
    }

    private static boolean llllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIllI(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ct() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lllllI[1]];
                nArray[ba.lllllI[0]] = lllllI[4];
                if (!ba.llllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lllllI[1]];
                nArray2[ba.lllllI[0]] = lllllI[5];
                if (!ba.llllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lllllI[1]];
                nArray3[ba.lllllI[0]] = lllllI[6];
                if (!ba.llllIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
            }
            n2 = lllllI[1];

            if (2 != 3) return n2 != 0;
            return false;
        }
        n2 = lllllI[0];
        return n2 != 0;
    }

    private static boolean llllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ba.llllIIll(this.ct() ? 1 : 0)) {
            return lllllI[0];
        }
        int[] nArray = new int[lllllI[1]];
        nArray[ba.lllllI[0]] = lllllI[2];
        if (ba.llllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllI[0];
        }
        if (!ba.llllIIll(Players.getLocal().isAnimating() ? 1 : 0) || ba.llllIlIl(Players.getLocal().getInteracting())) {
            return lllllI[0];
        }
        NPC llllIIllIIllIll = NPCs.getNearest(nPC -> {
            int n2;
            if (ba.llllIlII(nPC.getName().equals(lllIll[lllllI[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lllllI[1]];
                stringArray[ba.lllllI[0]] = lllIll[lllllI[3]];
                if (ba.llllIlII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllI[1];

                    if (((2 ^ 0x62 ^ 3) & (4 ^ 0x3D ^ (0xE2 ^ 0xB8) ^ -1)) >= ((65 + 145 - 90 + 97 ^ 74 + 52 - 3 + 14) & (105 + 193 - 70 + 20 ^ 139 + 2 - 32 + 59 ^ -1))) return n2 != 0;
                    return ((0xE6 ^ 0xB2 ^ (0xB3 ^ 0xBE)) & (0xCA ^ 0x98 ^ (0x2E ^ 0x25) ^ -1)) != 0;
                }
            }
            n2 = lllllI[0];
            return n2 != 0;
        });
        if (ba.llllIllI(llllIIllIIllIll)) {
            return lllllI[0];
        }
        var1_1.interact(lllIll[lllllI[0]]);
        this.sleep(lllllI[3]);
        return lllllI[1];
    }
}

