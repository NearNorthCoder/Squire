/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Force Leaving Altar")
public class ForceLeavingAltarTask
extends Task {

    private final  SquireGOTRPlugin aQ;

    @Inject
    public ForceLeavingAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        this.aQ = squireGOTRPlugin;
    }

    private static boolean llllllIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIlIllIIl(Object object) {
        return object != null;
    }

    static {
        g.llllllIlIlIlIl();
        g.llllllIlIlIlII();
    }

    private static boolean llllllIlIlIlll(Object object) {
        return object == null;
    }

    private static boolean llllllIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIlIllIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.llllllIlIlIllI(this.aQ.ForceLeavingAltarTask() ? 1 : 0)) {
            return llIIllIllIII[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.llllllIlIlIllI(tileObject.getName().contains(llIIllIlIlll[llIIllIllIII[1]]) ? 1 : 0) && g.llllllIlIlIllI(tileObject.hasAction(string -> {
                int n2;
                if (g.llllllIlIllIIl(string) && g.llllllIlIlIllI(string.equals(llIIllIlIlll[llIIllIllIII[3]]) ? 1 : 0)) {
                    n2 = llIIllIllIII[1];

                    if (1 <= -1) {
                        return false;
                    }
                } else {
                    n2 = llIIllIllIII[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIIllIllIII[1];

                }
            } else {
                n2 = llIIllIllIII[0];
            }
            return n2 != 0;
        });
        if (g.llllllIlIlIlll(var1)) {
            return llIIllIllIII[0];
        }
        int[] nArray = new int[llIIllIllIII[1]];
        nArray[g.llIIllIllIII[0]] = llIIllIllIII[2];
        if (g.llllllIlIllIII(Inventory.getCount((int[])nArray))) {
            return llIIllIllIII[0];
        }
        var1_1.interact(llIIllIlIlll[llIIllIllIII[0]]);
        return llIIllIllIII[1];
    }

        return String.valueOf(var2);
    }

    private static void llllllIlIlIlII() {
        llIIllIlIlll = new String[llIIllIllIII[4]];
        g.llIIllIlIlll[g.llIIllIllIII[0]] = "Enter";
        g.llIIllIlIlll[g.llIIllIllIII[1]] = "Portal";
        g.llIIllIlIlll[g.llIIllIllIII[3]] = "Ż̉Є/)";
    }
}

