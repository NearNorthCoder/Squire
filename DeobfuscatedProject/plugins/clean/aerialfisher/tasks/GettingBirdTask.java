/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Getting bird", priority=6, blocking=true)
public class GettingBirdTask
extends Task {

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlllIIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIIlllIIIlI(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        String[] stringArray = new String[lIlIllIlIII[0]];
        stringArray[d.lIlIllIlIII[1]] = lIlIllIIlll[lIlIllIlIII[1]];
        if (d.lIIlIIlllIIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            return lIlIllIlIII[1];
        }
        if (d.lIIlIIlllIIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIllIlIII[0];
        }
        int[] nArray = new int[lIlIllIlIII[0]];
        nArray[d.lIlIllIlIII[1]] = lIlIllIlIII[2];
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (d.lIIlIIlllIIIll(var2)) {
            return lIlIllIlIII[1];
        }
        var1_1.interact(lIlIllIIlll[lIlIllIlIII[0]]);
        return lIlIllIlIII[0];
    }

    private static boolean lIIlIIlllIIIll(Object object) {
        return object == null;
    }

    static {
        d.lIIlIIlllIIIIl();
        d.lIIlIIlllIIIII();
    }

    private static void lIIlIIlllIIIII() {
        lIlIllIIlll = new String[lIlIllIlIII[3]];
        d.lIlIllIIlll[d.lIlIllIlIII[1]] = "Cormorant's glove";
        d.lIlIllIIlll[d.lIlIllIlIII[0]] = "Get bird";
    }
}

