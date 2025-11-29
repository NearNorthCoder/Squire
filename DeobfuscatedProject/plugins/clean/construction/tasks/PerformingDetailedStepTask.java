/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Performing detailed step")
public class PerformingDetailedStepTask
extends Task {

    private final  SquireQuestHelper fN;

    private static boolean lIllIlIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIllII() {
        llIIlIll = new String[llIIllII[7]];
        bk.llIIlIll[bk.llIIllII[0]] = "DetailedQuestStep";
        bk.llIIlIll[bk.llIIllII[2]] = "Interacting with item";
        bk.llIIlIll[bk.llIIllII[3]] = "Rub";
        bk.llIIlIll[bk.llIIllII[4]] = "Read";
        bk.llIIlIll[bk.llIIllII[5]] = "Rub";
        bk.llIIlIll[bk.llIIllII[6]] = "Read";
    }

    static {
        bk.lIllIlIIll();
        bk.lIllIIllII();
    }

    private static boolean lIllIllIII(Object object) {
        return object != null;
    }

        return String.valueOf(llIllIIllIlllII);
    }

    private static boolean lIllIllIIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        bk llIllIlIIIIIllI;
        String string = this.fN.cz();
        if (bk.lIllIlIlII(string.equals(llIIlIll[llIIllII[0]]) ? 1 : 0)) {
            return llIIllII[0];
        }
        int llIllIlIIIIIlII = llIllIlIIIIIllI.fN.cJ();
        if (bk.lIllIlIllI(llIllIlIIIIIlII, llIIllII[1])) {
            int[] nArray = new int[llIIllII[2]];
            nArray[bk.llIIllII[0]] = llIllIlIIIIIlII;
            Item llIllIlIIIIIIll = Inventory.getFirst((int[])nArray);
            if (bk.lIllIllIII(llIllIlIIIIIIll)) {
                Log.info((String)llIIlIll[llIIllII[2]]);
                String[] stringArray = new String[llIIllII[3]];
                stringArray[bk.llIIllII[0]] = llIIlIll[llIIllII[3]];
                stringArray[bk.llIIllII[2]] = llIIlIll[llIIllII[4]];
                if (bk.lIllIllIIl(llIllIlIIIIIIll.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIllII[3]];
                    stringArray2[bk.llIIllII[0]] = llIIlIll[llIIllII[5]];
                    stringArray2[bk.llIIllII[2]] = llIIlIll[llIIllII[6]];
                    llIllIlIIIIIIll.interact(stringArray2);

                } else {
                    llIllIlIIIIIIll.interact(llIIllII[0]);
                }
                llIllIlIIIIIllI.sleep(llIIllII[5]);
                return llIIllII[2];
            }
        }
        return llIIllII[0];
    }

    private static boolean lIllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public PerformingDetailedStepTask(SquireQuestHelper squireQuestHelper) {
        this.fN = squireQuestHelper;
    }

}

