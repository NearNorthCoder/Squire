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

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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

@TaskDesc(name="Manage Overloads", priority=30000, blocking=true)
public class ManageOverloadsTask
extends Task {
    private final  SquireChambersConfig cO;
    
    private final  SquireChambersPlugin cN;

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[2]]));
    }

    private static boolean llIllIIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public ManageOverloadsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cN = squireChambersPlugin;
        this.cO = squireChambersConfig;
    }

    private static boolean llIllIIlIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[4]]));
    }

    static {
        ai.llIllIIlIIllIl();
        ai.llIllIIlIIllII();
    }

    private static void llIllIIlIIllII() {
        lIlIIlIIlllI = new String[lIlIIlIlIlIl[0]];
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[1]] = "Take";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[2]] = "Revitalisation";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[4]] = "Xeric's aid";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[5]] = "Attack";
    }

    private static boolean llIllIIlIlIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ai var2;
        if (!ai.llIllIIlIIlllI(u.bg(), lIlIIlIlIlIl[0]) || ai.llIllIIlIIllll(Players.getLocal().getPlane())) {
            return lIlIIlIlIlIl[1];
        }
        int[] nArray = new int[lIlIIlIlIlIl[2]];
        nArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIlIlIl[3];
        if (ai.llIllIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIlIlIl[1];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIlIlIlIl[2]];
            stringArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIIlllI[lIlIIlIlIlIl[5]];
            if (ai.llIllIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];

                if (2 >= (0xA8 ^ 0xB5 ^ (0x5F ^ 0x46))) {
                    return false;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIIl(var3)) {
            return lIlIIlIlIlIl[1];
        }
        TileItem var4 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ai.llIllIIlIlIIll(tileItem.getId(), lIlIIlIlIlIl[3]) && ai.llIllIIlIlIIII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];

                if (1 != 1) {
                    return false;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIlI(var4)) {
            return lIlIIlIlIlIl[1];
        }
        if (ai.llIllIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            var2.cN.x();

            return lIlIIlIlIlIl[2];
        }
        var2_2.interact(lIlIIlIIlllI[lIlIIlIlIlIl[1]]);
        return lIlIIlIlIlIl[2];
    }

    private static boolean llIllIIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIIlIlIIlI(Object object) {
        return object == null;
    }
}

