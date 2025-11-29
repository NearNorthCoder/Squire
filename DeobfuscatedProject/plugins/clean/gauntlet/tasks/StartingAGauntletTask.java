/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Starting a gauntlet", priority=3, blocking=true)
public class StartingAGauntletTask
extends GauntletTaskBase {
    private  int cl;
    
    private final  GauntletConfig ck;

    @Inject
    public StartingAGauntletTask(c c2, GauntletConfig gauntletConfig) {
        d[] dArray = new d[llIIllllIlII[0]];
        dArray[aa.llIIllllIlII[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.cl = llIIllllIlII[1];
        this.ck = gauntletConfig;
    }

    private static boolean lIIIIIIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIIlIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean be() {
        aa var1;
        Item item2 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIllllIIll[llIIllllIlII[6]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
        if (aa.lIIIIIIIIIlIIIl(item2) && aa.lIIIIIIIIIlIIlI(Magic.canCast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY) ? 1 : 0)) {
            return llIIllllIlII[1];
        }
        if (aa.lIIIIIIIIIlIIlI(var1.ck.waitAfterAttempt() ? 1 : 0) && aa.lIIIIIIIIIlIIll(var1.cl)) {
            var1.cl -= llIIllllIlII[0];
            return llIIllllIlII[0];
        }
        if (aa.lIIIIIIIIIlIIlI(Dialog.isViewingOptions() ? 1 : 0) && aa.lIIIIIIIIIlIIlI(Dialog.hasOption((String)llIIllllIIll[llIIllllIlII[1]]) ? 1 : 0)) {
            String[] stringArray = new String[llIIllllIlII[0]];
            stringArray[aa.llIIllllIlII[1]] = llIIllllIIll[llIIllllIlII[0]];
            Dialog.chooseOption((String[])stringArray);

            return llIIllllIlII[0];
        }
        if (aa.lIIIIIIIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIllllIlII[0];
        }
        int[] nArray = new int[llIIllllIlII[0]];
        nArray[aa.llIIllllIlII[1]] = llIIllllIlII[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (aa.lIIIIIIIIIlIIIl(var2)) {
            int n2;
            if (aa.lIIIIIIIIIlIIlI(var1.ba.G() ? 1 : 0)) {
                n2 = llIIllllIlII[0];

                if (1 != 1) {
                    return false;
                }
            } else {
                n2 = llIIllllIlII[1];
            }
            var2.interact(n2);
            var1.sleep(llIIllllIlII[3]);
            var1.cl = Rand.nextInt((int)llIIllllIlII[4], (int)llIIllllIlII[5]);
            return llIIllllIlII[0];
        }
        return llIIllllIlII[1];
    }

        return String.valueOf(var3);
    }

    private static boolean lIIIIIIIIIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIIIIIllll() {
        llIIllllIIll = new String[llIIllllIlII[7]];
        aa.llIIllllIIll[aa.llIIllllIlII[1]] = "Yes";
        aa.llIIllllIIll[aa.llIIllllIlII[0]] = "Yes";
        aa.llIIllllIIll[aa.llIIllllIlII[6]] = ",";
    }

    static {
        aa.lIIIIIIIIIlIIII();
        aa.lIIIIIIIIIIllll();
    }
}

