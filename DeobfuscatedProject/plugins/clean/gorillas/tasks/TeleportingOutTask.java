/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

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
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Teleporting out", priority=1333337)
public class TeleportingOutTask
extends Task {

    static {
        z.lllllIlIllllII();
        z.lllllIlIlllIll();
    }

    private static boolean lllllIlIlllllI(Object object) {
        return object == null;
    }

    private static void lllllIlIlllIll() {
        llIIlIlIllIl = new String[llIIlIlIlllI[4]];
        z.llIIlIlIllIl[z.llIIlIlIlllI[0]] = "Commune";
        z.llIIlIlIllIl[z.llIIlIlIlllI[1]] = "Attack";
        z.llIIlIlIllIl[z.llIIlIlIlllI[3]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (z.lllllIlIllllIl(Inventory.contains(item -> {
            String[] stringArray = new String[llIIlIlIlllI[1]];
            stringArray[z.llIIlIlIlllI[0]] = llIIlIlIllIl[llIIlIlIlllI[3]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            return llIIlIlIlllI[0];
        }
        int[] nArray = new int[llIIlIlIlllI[1]];
        nArray[z.llIIlIlIlllI[0]] = llIIlIlIlllI[2];
        Item var1 = Inventory.getFirst((int[])nArray);
        if (z.lllllIlIlllllI(var1)) {
            return llIIlIlIlllI[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (z.lllllIlIllllIl(nPC.hasAction(llIIlIlIllIl[llIIlIlIlllI[1]]::equals) ? 1 : 0) && z.lllllIlIllllll(nPC.getInteracting(), Players.getLocal())) {
                n2 = llIIlIlIlllI[1];

                if (((250 + 222 - 467 + 250 ^ 141 + 26 - 73 + 105) & (0x4E ^ 0x6B ^ (0x82 ^ 0x9F) ^ -1)) >= 2) {
                    return ((0xAE ^ 0xC5 ^ (5 ^ 0x74)) & (126 + 29 - 72 + 65 ^ 40 + 136 - 74 + 40 ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIlIlllI[0];
            }
            return n2 != 0;
        });
        if (z.lllllIlIlllllI(var2)) {
            return llIIlIlIlllI[0];
        }
        var1_1.interact(llIIlIlIllIl[llIIlIlIlllI[0]]);
        return llIIlIlIlllI[1];
    }

    private static boolean lllllIlIllllll(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var3);
    }

    private static boolean lllllIllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlIllllIl(int n2) {
        return n2 != 0;
    }
}

