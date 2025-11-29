/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Using imbued heart")
public class UsingImbuedHeartTask
extends WhispererTaskBase {

    private static void llIIIIlIlIIIIlI() {
        lIlIlllIllIII = new String[lIlIlllIllIIl[3]];
        A.lIlIlllIllIII[A.lIlIlllIllIIl[1]] = "Invigorate";
    }

    @Override
    public boolean p() {
        int[] nArray = new int[lIlIlllIllIIl[0]];
        nArray[A.lIlIlllIllIIl[1]] = lIlIlllIllIIl[2];
        nArray[A.lIlIlllIllIIl[3]] = lIlIlllIllIIl[4];
        Item item = Inventory.getFirst((int[])nArray);
        if (A.llIIIIlIlIIIlII(item)) {
            return lIlIlllIllIIl[1];
        }
        int var1 = Vars.getBit((int)lIlIlllIllIIl[5]);
        if (A.llIIIIlIlIIIlIl(var1)) {
            return lIlIlllIllIIl[1];
        }
        item.interact(lIlIlllIllIII[lIlIlllIllIIl[1]]);
        return lIlIlllIllIIl[3];
    }

    private static boolean llIIIIlIlIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIlIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    static {
        A.llIIIIlIlIIIIll();
        A.llIIIIlIlIIIIlI();
    }
}

