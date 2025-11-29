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
import gg.squire.cox.tasks.GameEnum32;
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

@TaskDesc(name="Pick Seeds", priority=30000, blocking=true)
public class PickSeedsTask
extends Task {
    private final  SquireChambersConfig cQ;
    private final  SquireChambersPlugin cP;

    private static boolean llIlIllIllIlII(int n2) {
        return n2 == 0;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[0]]));
    }

    private static boolean llIlIllIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIllIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public PickSeedsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cP = squireChambersPlugin;
        this.cQ = squireChambersConfig;
    }

        return String.valueOf(var1);
    }

    private static boolean llIlIllIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[5]]));
    }

    private static boolean llIlIllIllIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIllIllIlIl(Object object) {
        return object == null;
    }

    private static void llIlIllIlIlllI() {
        lIlIIIllIlII = new String[lIlIIIllIlIl[6]];
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[1]] = "Take";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[0]] = "Revitalisation";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[5]] = "Xeric's aid";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[4]] = "Attack";
    }

    static {
        aj.llIlIllIlIllll();
        aj.llIlIllIlIlllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        aj var2;
        int[] nArray = new int[lIlIIIllIlIl[0]];
        nArray[aj.lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
        if (aj.llIlIllIllIIII(Inventory.getCount((boolean)lIlIIIllIlIl[0], (int[])nArray), lIlIIIllIlIl[3])) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIIIl((Object)u.bh(), (Object)w.REACHED_BOTTOM)) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIIlI(var2.cq(), lIlIIIllIlIl[4])) {
            return lIlIIIllIlIl[1];
        }
        if (!aj.llIlIllIllIIll(var2.cP.L()) || aj.llIlIllIllIlII(var2.cP.L().a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIllIlIl[1];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIIllIlIl[0]];
            stringArray[aj.lIlIIIllIlIl[1]] = lIlIIIllIlII[lIlIIIllIlIl[4]];
            if (aj.llIlIllIllIllI(nPC.hasAction(stringArray) ? 1 : 0) && aj.llIlIllIllIllI(this.cP.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIllIlIl[0];

                if (1 < 0) {
                    return ((0xED ^ 0x8B ^ (0x73 ^ 7)) & (33 + 28 - -82 + 4 ^ 97 + 66 - 129 + 95 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIllIlIl[1];
            }
            return n2 != 0;
        });
        if (aj.llIlIllIllIIll(var3)) {
            return lIlIIIllIlIl[1];
        }
        TileItem var4 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aj.llIlIllIllIlll(tileItem.getId(), lIlIIIllIlIl[2]) && aj.llIlIllIllIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && aj.llIlIllIllIllI(this.cP.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIIllIlIl[0];

                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = lIlIIIllIlIl[1];
            }
            return n2 != 0;
        });
        if (aj.llIlIllIllIlIl(var4)) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIllI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIIllIlIl[0]];
            nArray2[aj.lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
            if (aj.llIlIllIllIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                var2.cP.x();

                return lIlIIIllIlIl[0];
            }
        }
        var2_2.interact(lIlIIIllIlII[lIlIIIllIlIl[1]]);
        return lIlIIIllIlIl[0];
    }

    private static boolean llIlIllIllIIll(Object object) {
        return object != null;
    }

    private static boolean llIlIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }
}

