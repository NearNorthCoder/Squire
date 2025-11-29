/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Activating Blood Essence")
public class ActivatingBloodEssenceTask
extends Task {

    public boolean run() {
        if (b.llIIIlllIIIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray = new int[lIllIIlllIllI[1]];
        nArray[b.lIllIIlllIllI[0]] = lIllIIlllIllI[2];
        if (b.llIIIlllIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray2 = new int[lIllIIlllIllI[1]];
        nArray2[b.lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        if (b.llIIIlllIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray3 = new int[lIllIIlllIllI[1]];
        nArray3[b.lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        Inventory.getFirst((int[])nArray3).interact(lIllIIlllIlII[lIllIIlllIllI[0]]);
        return lIllIIlllIllI[1];
    }

    private static boolean llIIIlllIIIIIII(int n) {
        return n != 0;
    }

    private static boolean llIIIlllIIIIIlI(int n, int n2) {
        return n < n2;
    }

    static {
        b.llIIIllIlllllll();
        b.llIIIllIlllllII();
    }

    private static boolean llIIIlllIIIIIIl(int n) {
        return n == 0;
    }

    private static void llIIIllIlllllII() {
        lIllIIlllIlII = new String[lIllIIlllIllI[1]];
        b.lIllIIlllIlII[b.lIllIIlllIllI[0]] = "Activate";
    }

        return String.valueOf(var1);
    }
}

