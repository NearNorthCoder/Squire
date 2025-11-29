/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Pressing continue", priority=0x7FFFFFFD, blocking=true)
public class PressingContinueTask
extends Task {
    
    private final  v W;

    @Inject
    public PressingContinueTask(v v2) {
        this.W = v2;
    }

    public boolean run() {
        if (B.llIIlIIIlIllllI(Dialog.canContinue() ? 1 : 0)) {
            if (B.llIIlIIIlIllllI(Dialog.getText().contains(lIllIllIIIIll[lIllIllIIIlIl[0]]) ? 1 : 0)) {
                this.W.R();
            }
            Dialog.continueSpace();
            return lIllIllIIIlIl[1];
        }
        return lIllIllIIIlIl[0];
    }

    static {
        B.llIIlIIIlIlllIl();
        B.llIIlIIIlIllIIl();
    }

    private static boolean llIIlIIIlIllllI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIIlIllIIl() {
        lIllIllIIIIll = new String[lIllIllIIIlIl[1]];
        B.lIllIllIIIIll[B.lIllIllIIIlIl[0]] = "priestess rows you";
    }
}

