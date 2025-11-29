/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererManager;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Disturbing Odd Figure")
public class DisturbingOddFigureTask
extends WhispererTaskBase {
    
    private static final  int V;
    
    @Inject
    private  d W;

    private static void llIIIIIlIlIIIII() {
        lIlIllIlIIlll = new String[lIlIllIlIlIII[4]];
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[1]] = "Odd Figure";
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[0]] = "No";
        o.lIlIllIlIIlll[o.lIlIllIlIlIII[2]] = "Disturb";
    }

    public boolean run() {
        String[] stringArray = new String[lIlIllIlIlIII[0]];
        stringArray[o.lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (o.llIIIIIlIlIIIlI(nPC)) {
            return lIlIllIlIlIII[1];
        }
        if (o.llIIIIIlIlIIIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIllIlIlIII[0]];
            stringArray2[o.lIlIllIlIlIII[1]] = lIlIllIlIIlll[lIlIllIlIlIII[0]];
            Dialog.chooseOption((String[])stringArray2);

            return lIlIllIlIlIII[0];
        }
        this.W.e();
        nPC.interact(lIlIllIlIIlll[lIlIllIlIlIII[2]]);
        return lIlIllIlIlIII[0];
    }

    private static boolean llIIIIIlIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.llIIIIIlIlIIIIl();
        o.llIIIIIlIlIIIII();
        V = lIlIllIlIlIII[3];
    }

        return String.valueOf(var1);
    }
}

