/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.GameEnum74;
import gg.squire.construction.tasks.ConstructionTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Praying with bonemeal", priority=10, blocking=true)
public class PrayingWithBonemealTask
extends ConstructionTaskBase {
    
    private  boolean dm;

    private static boolean llllIllII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIll(int n2) {
        return n2 == 0;
    }

    private static void llllIlIIl() {
        lllllll = new String[lIIIIIII[11]];
        au.lllllll[au.lIIIIIII[1]] = "Collecting ecto from the guy";
        au.lllllll[au.lIIIIIII[2]] = "Drop";
        au.lllllll[au.lIIIIIII[0]] = "Ghost disciple";
        au.lllllll[au.lIIIIIII[5]] = "Talk-to";
        au.lllllll[au.lIIIIIII[6]] = "Something is going wrong when collecting ecto.";
        au.lllllll[au.lIIIIIII[7]] = "Ectofuntus";
        au.lllllll[au.lIIIIIII[8]] = "how";
        au.lllllll[au.lIIIIIII[9]] = "Worship";
    }

    static {
        au.llllIlIlI();
        au.llllIlIIl();
    }

    private static boolean llllIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var1_2;
        au lllIIlIlllIllII;
        int[] nArray = new int[lIIIIIII[0]];
        nArray[au.lIIIIIII[1]] = this.de.bonesToUse().groundItemId;
        nArray[au.lIIIIIII[2]] = lIIIIIII[3];
        if (au.llllIlIll(Inventory.containsAllOf((int[])nArray) ? 1 : 0)) {
            return lIIIIIII[1];
        }
        if (au.llllIllII(Dialog.isOpen() ? 1 : 0)) {
            lllIIlIlllIllII.dm = lIIIIIII[2];
            if (au.llllIllII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIIIIII[2];
            }
            Log.info((String)lllllll[lIIIIIII[1]]);
        }
        int[] nArray2 = new int[lIIIIIII[2]];
        nArray2[au.lIIIIIII[1]] = lIIIIIII[4];
        if (au.llllIllII(Inventory.contains((int[])nArray2) ? 1 : 0) && au.llllIllII(lllIIlIlllIllII.dm ? 1 : 0)) {
            lllIIlIlllIllII.dm = lIIIIIII[1];
        }
        if (au.llllIllII(lllIIlIlllIllII.dm ? 1 : 0)) {
            Item lllIIlIlllIlIll;
            if (au.llllIllII(Inventory.isFull() ? 1 : 0) && au.llllIllIl(lllIIlIlllIlIll = Inventory.getFirst(item -> {
                boolean bl2;
                if (!au.llllIllll(item.getId(), lIIIIIII[10]) || au.lllllIIII(item.getId(), lIIIIIII[3])) {
                    bl2 = lIIIIIII[2];

                    if (3 <= -1) {
                        return ((149 + 142 - 264 + 198 ^ 26 + 185 - 17 + 1) & (0xE1 ^ 0xAE ^ (0x38 ^ 0x55) ^ -1)) != 0;
                    }
                } else {
                    bl2 = lIIIIIII[1];
                }
                return bl2;
            }))) {
                lllIIlIlllIlIll.interact(lllllll[lIIIIIII[2]]);
                return lIIIIIII[2];
            }
            String[] stringArray = new String[lIIIIIII[2]];
            stringArray[au.lIIIIIII[1]] = lllllll[lIIIIIII[0]];
            lllIIlIlllIlIll = NPCs.getNearest((String[])stringArray);
            if (au.llllIllIl(lllIIlIlllIlIll)) {
                lllIIlIlllIlIll.interact(lllllll[lIIIIIII[5]]);
                return lIIIIIII[2];
            }
            Log.info((String)lllllll[lIIIIIII[6]]);
            return lIIIIIII[1];
        }
        if (au.llllIlIll(am.ECTOFUNTUS.bo() ? 1 : 0)) {
            return lllIIlIlllIllII.dd.bk();
        }
        String[] stringArray = new String[lIIIIIII[2]];
        stringArray[au.lIIIIIII[1]] = lllllll[lIIIIIII[7]];
        TileObject lllIIlIlllIlIll = TileObjects.getNearest((String[])stringArray);
        if (au.llllIlllI(lllIIlIlllIlIll)) {
            Log.info((String)lllllll[lIIIIIII[8]]);
            return lIIIIIII[1];
        }
        var1_2.interact(lllllll[lIIIIIII[9]]);
        return lIIIIIII[2];
    }

    private static boolean llllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public PrayingWithBonemealTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static boolean llllIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lllIIlIllIlllII);
    }

    private static boolean lllllIIII(int n2, int n3) {
        return n2 == n3;
    }

}

