/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=5)
public class EatingFoodTask
extends Task {
    
    private final  DagannothKingConfig cJ;

    private static void lIlIlIlllI() {
        llIIIIIl = new String[llIIIlIl[7]];
        ah.llIIIIIl[ah.llIIIlIl[1]] = "Eat";
        ah.llIIIIIl[ah.llIIIlIl[0]] = "Eat";
    }

        return String.valueOf(llIllIllIlllIIl);
    }

    private static boolean lIlIllIIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        ah.lIlIllIIIl();
        ah.lIlIlIlllI();
    }

    @Inject
    private EatingFoodTask(DagannothKingConfig dagannothKingConfig) {
        this.cJ = dagannothKingConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        ah llIllIlllIIlIIl;
        void llIllIlllIIlIII;
        int[] nArray = new int[llIIIlIl[0]];
        nArray[ah.llIIIlIl[1]] = llIIIlIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIlIl[3], llIIIlIl[4], llIIIlIl[5], llIIIlIl[6], llIIIlIl[1]);
        if (ah.lIlIllIIlI(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIlIl[1];
        }
        if (ah.lIlIllIIll(llIllIlllIIlIII)) {
            return llIIIlIl[1];
        }
        if (ah.lIlIllIlII(Combat.getMissingHealth(), llIllIlllIIlIIl.cJ.eatMissingHealth())) {
            return llIIIlIl[1];
        }
        Item llIllIlllIIIllI = Inventory.getFirst(item -> item.hasAction(llIIIIIl[llIIIlIl[0]]::equals));
        if (ah.lIlIllIIll(llIllIlllIIIllI)) {
            return llIIIlIl[1];
        }
        var3_3.interact(llIIIIIl[llIIIlIl[1]]);
        return llIIIlIl[0];
    }

    private static boolean lIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

