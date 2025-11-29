/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Fix Boss Task Thing", priority=10, blocking=true)
public class FixBossTaskThingTask
extends Task {

    static {
        i.lIlllIlIlIIIIlI();
        i.lIlllIlIIlllllI();
    }

    private static void lIlllIlIIlllllI() {
        lIlIIlIIlIlII = new String[lIlIIlIIlIllI[5]];
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[0]] = "I've got a boss assignment";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[1]] = "Fixing boss task";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[2]] = "Oh yes,";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[3]] = "Fixing boss task";
        i.lIlIIlIIlIlII[i.lIlIIlIIlIllI[4]] = "Fixing boss task";
    }

    private static boolean lIlllIlIlIIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (i.lIlllIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
            return lIlIIlIIlIllI[0];
        }
        if (i.lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[0]]) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[1]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        }
        if (i.lIlllIlIlIIIlII(Dialog.getText().contains(lIlIIlIIlIlII[lIlIIlIIlIllI[2]]) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[3]]);
            Dialog.continueSpace();
            return lIlIIlIIlIllI[1];
        }
        if (i.lIlllIlIlIIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlII[lIlIIlIIlIllI[4]]);
            Dialog.enterAmount((int)lIlIIlIIlIllI[5]);
            return lIlIIlIIlIllI[1];
        }
        return lIlIIlIIlIllI[0];
    }

    @Inject
    public FixBossTaskThingTask() {
    }

    private static boolean lIlllIlIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIlIIIIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }
}

