/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Hunt Cat")
public class HuntCatTask
extends Task {

    private final  SquireKittenConfig dM;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        az llllIIIllllIIII;
        if (az.lIIIlIlII(this.dM.huntSpice() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        if (az.lIIIlIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        TileItem llllIIIlllIllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (az.lIIIlIlII(tileItem.getName().contains(lIIIlII[lIIIlIl[4]]) ? 1 : 0) && az.lIIIlIlIl(tileItem.getName().contains(this.dM.spiceType().ax()) ? 1 : 0)) {
                n2 = lIIIlIl[1];

                if (((60 + 41 - -4 + 38 ^ 99 + 60 - 42 + 61) & (0xCD ^ 0xA7 ^ (0x23 ^ 0x74) ^ -1)) != 0) {
                    return ((0x8F ^ 0x83 ^ (0xBA ^ 0x99)) & (166 + 11 - 130 + 128 ^ 122 + 76 - 76 + 6 ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlIl[0];
            }
            return n2 != 0;
        });
        if (az.lIIIlIllI(llllIIIlllIllll)) {
            llllIIIlllIllll.interact(lIIIlII[lIIIlIl[0]]);
            return lIIIlIl[1];
        }
        NPC llllIIIlllIlllI = NPCs.getNearest(nPC -> {
            boolean bl2;
            NPC llllIIIlllIllII;
            if ((!az.lIIIlIlII(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[2]]) ? 1 : 0) || az.lIIIlIlIl(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[3]]) ? 1 : 0)) && az.lIIIllIII(llllIIIlllIllII.getInteracting(), Players.getLocal())) {
                bl2 = lIIIlIl[1];

                if ((0x92 ^ 0x96) < 0) {
                    return false;
                }
            } else {
                bl2 = lIIIlIl[0];
            }
            return bl2;
        });
        if (az.lIIIlIlll(llllIIIlllIlllI)) {
            return lIIIlIl[0];
        }
        var2_2.interact(lIIIlII[lIIIlIl[1]]);
        return lIIIlIl[1];
    }

        return String.valueOf(llllIIIllIIlllI);
    }

    private static void lIIIlIIlI() {
        lIIIlII = new String[lIIIlIl[5]];
        az.lIIIlII[az.lIIIlIl[0]] = "Take";
        az.lIIIlII[az.lIIIlIl[1]] = "Chase";
        az.lIIIlII[az.lIIIlIl[2]] = "kitten";
        az.lIIIlII[az.lIIIlIl[3]] = "cat";
        az.lIIIlII[az.lIIIlIl[4]] = "Empty";
    }

    @Inject
    public HuntCatTask(SquireKittenConfig squireKittenConfig) {
        this.dM = squireKittenConfig;
    }

    static {
        az.lIIIlIIll();
        az.lIIIlIIlI();
    }

    private static boolean lIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlll(Object object) {
        return object == null;
    }
}

