/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Performing dig task")
public class PerformingDigTask
extends Task {
    @Inject
    private  SquireQuestHelper fG;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bl lllIllIIlIIIIlI;
        String string = this.fG.cz();
        if (bl.lIllllIIl(string.equals(lIlllIl[lIllllI[0]]) ? 1 : 0)) {
            return lIllllI[0];
        }
        WorldPoint lllIllIIlIIIIII = lllIllIIlIIIIlI.fG.cA();
        if (bl.lIllllIlI(lllIllIIlIIIIII)) {
            return lIllllI[0];
        }
        if (bl.lIllllIIl(Players.getLocal().getWorldLocation().equals((Object)lllIllIIlIIIIII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lllIllIIlIIIIII);

            return lIllllI[1];
        }
        int[] nArray = new int[lIllllI[1]];
        nArray[bl.lIllllI[0]] = lIllllI[2];
        Item lllIllIIIllllll = Inventory.getFirst((int[])nArray);
        if (bl.lIllllIlI(lllIllIIIllllll)) {
            return lIllllI[0];
        }
        var3_3.interact(lIlllIl[lIllllI[1]]);
        return lIllllI[1];
    }

    private static boolean lIllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        bl.lIllllIII();
        bl.lIlllIlll();
    }

    private static boolean lIllllIlI(Object object) {
        return object == null;
    }

    private static void lIlllIlll() {
        lIlllIl = new String[lIllllI[3]];
        bl.lIlllIl[bl.lIllllI[0]] = "DigStep";
        bl.lIlllIl[bl.lIllllI[1]] = "Dig";
    }
}

