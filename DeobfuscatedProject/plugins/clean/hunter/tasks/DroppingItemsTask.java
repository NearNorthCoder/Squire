/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Items", priority=1)
public class DroppingItemsTask
extends HunterTaskBase {

    static {
        C.lIIIlllIIIIIlIl();
        C.lIIIlllIIIIIIlI();
    }

        return String.valueOf(var1);
    }

    @Override
    protected boolean x() {
        int[] nArray = new int[lllIllllIlII[0]];
        nArray[C.lllIllllIlII[1]] = lllIllllIlII[2];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllllIlII[0]];
            nArray2[C.lllIllllIlII[1]] = lllIllllIlII[2];
            Inventory.getFirst((int[])nArray2).interact(lllIllllIIIl[lllIllllIlII[1]]);
            return lllIllllIlII[0];
        }
        int[] nArray3 = new int[lllIllllIlII[0]];
        nArray3[C.lllIllllIlII[1]] = lllIllllIlII[3];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            C var2;
            if (C.lIIIlllIIIIIllI(var2.z().buryBones() ? 1 : 0)) {
                int[] nArray4 = new int[lllIllllIlII[0]];
                nArray4[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray4).interact(lllIllllIIIl[lllIllllIlII[0]]);

                if (1 <= -1) {
                    return ((1 + 43 - -44 + 39 ^ (0x39 ^ 0x64)) & (159 + 8 - 46 + 49 ^ 59 + 120 - 74 + 31 ^ -1)) != 0;
                }
            } else {
                int[] nArray5 = new int[lllIllllIlII[0]];
                nArray5[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray5).interact(lllIllllIIIl[lllIllllIlII[4]]);
            }
            return lllIllllIlII[0];
        }
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public DroppingItemsTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void lIIIlllIIIIIIlI() {
        lllIllllIIIl = new String[lllIllllIlII[5]];
        C.lllIllllIIIl[C.lllIllllIlII[1]] = "Drop";
        C.lllIllllIIIl[C.lllIllllIlII[0]] = "Bury";
        C.lllIllllIIIl[C.lllIllllIlII[4]] = "Drop";
    }

    private static boolean lIIIlllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }
}

