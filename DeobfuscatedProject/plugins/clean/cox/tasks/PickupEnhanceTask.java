/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Pickup enhance", priority=30000, blocking=true)
public class PickupEnhanceTask
extends Task {
    private final  SquireChambersConfig cM;
    
    private final  SquireChambersPlugin cL;

    private static boolean llIlIIlIIlIIll(Object object) {
        return object != null;
    }

    static {
        ah.llIlIIlIIlIIlI();
        ah.llIlIIlIIlIIIl();
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[3]]));
    }

    private static boolean llIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public PickupEnhanceTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cL = squireChambersPlugin;
        this.cM = squireChambersConfig;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[2]]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ah var1;
        if (!ah.llIlIIlIIlIIll(this.cL.C()) || ah.llIlIIlIIlIlII(this.cL.C().e().contains((Object)N.VESPULA) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        if (!ah.llIlIIlIIlIlIl(u.bg(), lIIlllllIIIl[1]) || ah.llIlIIlIIlIlII(Players.getLocal().getPlane())) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIIII[lIIlllllIIIl[1]])) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIlllllIIIl[2]];
            stringArray[ah.lIIlllllIIIl[0]] = lIIlllllIIII[lIIlllllIIIl[5]];
            if (ah.llIlIIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];

                if (((0x50 ^ 0x7D) & ~(0x94 ^ 0xB9)) < ((0x85 ^ 0xC1) & ~(0xD5 ^ 0x91))) {
                    return false;
                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIIll(var2)) {
            return lIIlllllIIIl[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ah.llIlIIlIIllIII(tileItem.getId(), lIIlllllIIIl[4]) && ah.llIlIIlIIlIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];

                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIlll(var3)) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.isFull() ? 1 : 0)) {
            var1.cL.x();

            return lIIlllllIIIl[2];
        }
        var2_2.interact(lIIlllllIIII[lIIlllllIIIl[0]]);
        return lIIlllllIIIl[2];
    }

    private static boolean llIlIIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIIlIIlIlll(Object object) {
        return object == null;
    }

    private static boolean llIlIIlIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIIlIlII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var4);
    }

    private static boolean llIlIIlIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIIlIIlIIIl() {
        lIIlllllIIII = new String[lIIlllllIIIl[6]];
        ah.lIIlllllIIII[ah.lIIlllllIIIl[0]] = "Take";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[2]] = "Revitalisation";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[3]] = "Xeric's aid";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[5]] = "Attack";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[1]] = "prayer enhance";
    }
}

