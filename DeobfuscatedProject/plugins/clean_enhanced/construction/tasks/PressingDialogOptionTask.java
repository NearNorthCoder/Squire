/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Pressing Dialog Option", priority=15, blocking=true)
public class PressingDialogOptionTask
extends Task {
    private  int fT;
    private final  SquireQuestHelper fS;
    private static  int[] lIlllII;
    private static  String[] lIllIll;

    private static void lIlllIIII() {
        lIllIll = new String[lIlllII[8]];
        br.lIllIll[br.lIlllII[0]] = "teleport to";
        br.lIllIll[br.lIlllII[1]] = "[";
        br.lIllIll[br.lIlllII[2]] = "Yes";
        br.lIllIll[br.lIlllII[3]] = "done";
        br.lIllIll[br.lIlllII[4]] = "Choosing option %d";
        br.lIllIll[br.lIlllII[5]] = "done";
        br.lIllIll[br.lIlllII[6]] = "Yes";
        br.lIllIll[br.lIlllII[7]] = "[";
    }

    private static void lIlllIIIl() {
        lIlllII = new int[9];
        br.lIlllII[0] = (0x79 ^ 0x4F) & ~(0x1D ^ 0x2B);
        br.lIlllII[1] = 1;
        br.lIlllII[2] = 2;
        br.lIlllII[3] = 3;
        br.lIlllII[4] = 0x8B ^ 0x83 ^ (0x13 ^ 0x1F);
        br.lIlllII[5] = 0xCE ^ 0x9C ^ (0x26 ^ 0x71);
        br.lIlllII[6] = 120 + 129 - 108 + 25 ^ 139 + 3 - -11 + 7;
        br.lIlllII[7] = 128 + 92 - 140 + 102 ^ 51 + 133 - 156 + 149;
        br.lIlllII[8] = 0x53 ^ 0x5B;
    }

    private static boolean lIlllIIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    public PressingDialogOptionTask(SquireQuestHelper squireQuestHelper) {
        this.fS = squireQuestHelper;
    }

    private static boolean lIlllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlII(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        br var11;
        if (br.lIlllIIlI(this.fS.isEnabled() ? 1 : 0)) {
            return lIlllII[0];
        }
        if (!br.lIlllIIll(Dialog.isOpen() ? 1 : 0) || br.lIlllIIll(Dialog.getName().contains(lIllIll[lIlllII[0]]) ? 1 : 0)) {
            return lIlllII[0];
        }
        if (br.lIlllIIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            return lIlllII[0];
        }
        int n2 = var11.fT;
        var11.fT = n2 + lIlllII[1];
        if (br.lIlllIlII(n2, lIlllII[2])) {
            return lIlllII[1];
        }
        var11.fT = lIlllII[0];
        if (br.lIlllIIll(Dialog.hasOption(string -> string.startsWith(lIllIll[lIlllII[7]])) ? 1 : 0)) {
            String[] stringArray = new String[lIlllII[1]];
            stringArray[br.lIlllII[0]] = lIllIll[lIlllII[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlllII[1];
        }
        if (br.lIlllIIll(Dialog.hasOption(string -> string.contains(lIllIll[lIlllII[6]])) ? 1 : 0)) {
            String[] stringArray = new String[lIlllII[1]];
            stringArray[br.lIlllII[0]] = lIllIll[lIlllII[2]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlllII[1];
        }
        if (br.lIlllIIll(Dialog.hasOption(string -> string.toLowerCase().contains(lIllIll[lIlllII[5]])) ? 1 : 0)) {
            String[] stringArray = new String[lIlllII[1]];
            stringArray[br.lIlllII[0]] = lIllIll[lIlllII[3]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlllII[1];
        }
        int n3 = Rand.nextInt((int)lIlllII[1], (int)(Dialog.getOptions().size() + lIlllII[1]));
        Object[] objectArray = new Object[lIlllII[1]];
        objectArray[br.lIlllII[0]] = n3;
        Log.info((String)lIllIll[lIlllII[4]], (Object[])objectArray);
        Dialog.chooseOption((int)n3);
        0;
        return lIlllII[1];
    }

}

