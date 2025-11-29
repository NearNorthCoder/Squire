/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dismantling Pitfall Trap", priority=30, blocking=true)
public class DismantlingPitfallTrapTask
extends HunterTaskBase {

    private static boolean lIIIllIlllllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var2_2;
        TileObject var1;
        t var2;
        int[] nArray = new int[lllIllllIIII[0]];
        nArray[t.lllIllllIIII[1]] = lllIllllIIII[2];
        if (t.lIIIllIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIllllIIII[1];
        }
        TileObject var3 = var2.a(lllIllllIIII[1]);
        if (t.lIIIllIlllllIll(var3)) {
            int[] nArray2 = new int[lllIllllIIII[0]];
            nArray2[t.lllIllllIIII[1]] = lllIllllIIII[2];
            if (t.lIIIllIlllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                var2.sleep(lllIllllIIII[3]);
                return lllIllllIIII[1];
            }
        }
        if (t.lIIIllIllllllII(var1 = var2.a(lllIllllIIII[0]))) {
            return lllIllllIIII[1];
        }
        var2_2.interact(lllIlllIllll[lllIllllIIII[1]]);
        return lllIllllIIII[0];
    }

    static {
        t.lIIIllIlllllIIl();
        t.lIIIllIlllllIII();
    }

    private static boolean lIIIllIlllllIll(Object object) {
        return object != null;
    }

    @Inject
    public DismantlingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    private static void lIIIllIlllllIII() {
        lllIlllIllll = new String[lllIllllIIII[0]];
        t.lllIlllIllll[t.lllIllllIIII[1]] = "Dismantle";
    }

    private static boolean lIIIllIllllllII(Object object) {
        return object == null;
    }
}

