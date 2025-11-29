/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Creating Rejuvenation Potions", priority=0x7FFFFFFF, blocking=true)
public class CreatingRejuvenationPotionsTask
extends Task {
    private final  b M;

    private final  SquireWintertodtConfig L;

    private static boolean llIIIIllllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlllIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var3_3;
        void var1;
        void var2;
        int n2 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[15]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[9]];
        int n3 = Inventory.getCount((String[])stringArray);
        if (h.llIIIIllllIIIll(n2) && h.llIIIIlllIlllll(n3)) {
            Inventory.dropAll(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[14]]));

            return lIllIIIIIIIlI[0];
        }
        if (!h.llIIIIllllIIIII((int)var2) || h.llIIIIlllIlllll((int)var1)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Quests.isFinished((Quest)Quest.DRUIDIC_RITUAL) ? 1 : 0)) {
            Inventory.use(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[13]]), item -> item.getName().equals(lIlIlllllllll[lIllIIIIIIIlI[12]]));

            return lIllIIIIIIIlI[0];
        }
        String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
        stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[2]];
        NPC var3 = NPCs.getNearest((String[])stringArray2);
        if (h.llIIIIllllIIlII(var3)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[10];
            var3 = NPCs.getNearest((int[])nArray);
        }
        if (h.llIIIIllllIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIIIIIIIlI[0];
        }
        Inventory.use(item -> lIlIlllllllll[lIllIIIIIIIlI[11]].equalsIgnoreCase(item.getName()), (Interactable)var3_3);

        return lIllIIIIIIIlI[0];
    }

    private static boolean llIIIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIllllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllllIIIll(int n2) {
        return n2 > 0;
    }

    static {
        h.llIIIIlllIlllII();
        h.llIIIIlllIllIIl();
    }

    @Inject
    public CreatingRejuvenationPotionsTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.L = squireWintertodtConfig;
        this.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4;
        void var5;
        h var6;
        int n2 = Inventory.getCount(item -> {
            int n2;
            if (h.llIIIIllllIIIII(item.getName().startsWith(lIlIlllllllll[lIllIIIIIIIlI[17]]) ? 1 : 0) && h.llIIIIlllIlllll(item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[18]]) ? 1 : 0)) {
                n2 = lIllIIIIIIIlI[0];

                if (-(64 + 155 - 160 + 114 ^ 128 + 164 - 266 + 143) >= 0) {
                    return ((3 ^ 0x1B ^ (0x86 ^ 0x99)) & (0xBF ^ 0x89 ^ (0x7A ^ 0x4B) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        int n3 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[16]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[1]];
        int n4 = Inventory.getCount((String[])stringArray);
        if (!h.llIIIIlllIlllIl(n2) || h.llIIIIlllIllllI(n4, this.L.foodAmount())) {
            return var6.C();
        }
        if (h.llIIIIlllIlllll(var6.M.i() ? 1 : 0)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl(Inventory.getFreeSlots(), lIllIIIIIIIlI[2])) {
            int[] nArray = new int[lIllIIIIIIIlI[3]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[4];
            nArray[h.lIllIIIIIIIlI[0]] = lIllIIIIIIIlI[5];
            Inventory.dropAll((int[])nArray);

        }
        if (h.llIIIIlllIlllll((int)var5)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[6];
            TileObjects.getNearest((int[])nArray).interact(lIlIlllllllll[lIllIIIIIIIlI[0]]);
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl((int)var4, var6.L.foodAmount())) {
            if (h.llIIIIllllIIIlI(Players.getLocal().getAnimation(), lIllIIIIIIIlI[7])) {
                return lIllIIIIIIIlI[0];
            }
            String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
            stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[3]];
            TileObjects.getNearest((String[])stringArray2).interact(lIlIlllllllll[lIllIIIIIIIlI[8]]);
            return lIllIIIIIIIlI[0];
        }
        return lIllIIIIIIIlI[1];
    }

    private static void llIIIIlllIllIIl() {
        lIlIlllllllll = new String[lIllIIIIIIIlI[19]];
        h.lIlIlllllllll[h.lIllIIIIIIIlI[1]] = "Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[0]] = "Take-5 concoctions";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[3]] = "Sprouting Roots";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[8]] = "Pick";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[9]] = "Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[2]] = "Brew'ma";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[11]] = "Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[12]] = "Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[13]] = "unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[14]] = "unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[15]] = "unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[16]] = "unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[17]] = "Rejuvenation";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[18]] = "unf";
    }

    private static boolean llIIIIllllIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlllIlllIl(int n2) {
        return n2 <= 0;
    }

        return String.valueOf(var7);
    }
}

